"""Example usage of ThroughTek SDK to stream printer webcam video.

This script leverages the bundled libraries in the `Webcam/x64` folder
and follows the steps outlined in PROTOCOL.md:

    1. Initialize the IOTC library.
    2. Discover printers on the local network.
    3. Connect to a selected printer by UID.
    4. Start an AV client and save received H.264 frames to disk.

The DLLs are Windows builds of the ThroughTek components, so running this
example requires Windows or an environment that can load `.dll` files.
"""

from ctypes import (
    CDLL,
    Structure,
    byref,
    c_char,
    c_char_p,
    c_int,
    c_uint,
    c_uint16,
    c_ubyte,
    c_void_p,
    POINTER,
)
from pathlib import Path
import sys

# ---------------------------------------------------------------------------
# Load SDK libraries from the Webcam/x64 directory
# ---------------------------------------------------------------------------
LIB_DIR = Path(__file__).resolve().parent / "Webcam" / "x64"
if sys.platform == "win32":
    from ctypes import WinDLL  # type: ignore[attr-defined]

    IOTC = WinDLL(str(LIB_DIR / "IOTCAPIs.dll"))
    AV = WinDLL(str(LIB_DIR / "AVAPIs.dll"))
else:
    IOTC = CDLL(str(LIB_DIR / "IOTCAPIs.dll"))
    AV = CDLL(str(LIB_DIR / "AVAPIs.dll"))


class IOTCDevInfo(Structure):
    """Structure returned by IOTC_Lan_Search2 describing a device."""

    _fields_ = [
        ("UID", c_char * 20),
        ("IP", c_char * 16),
        ("port", c_uint16),
        ("rsv", c_char * 2),
    ]


# Function prototypes
IOTC.IOTC_Initialize.argtypes = [c_uint16, c_char_p, c_char_p, c_char_p, c_char_p]
IOTC.IOTC_Initialize.restype = c_int
IOTC.IOTC_Lan_Search2.argtypes = [POINTER(IOTCDevInfo), c_int, c_uint]
IOTC.IOTC_Lan_Search2.restype = c_int
IOTC.IOTC_Connect_ByUID.argtypes = [c_char_p]
IOTC.IOTC_Connect_ByUID.restype = c_int
AV.avClientStart.argtypes = [c_int, c_char_p, c_char_p, c_uint, c_uint, c_uint]
AV.avClientStart.restype = c_int
AV.avRecvFrameData2.argtypes = [
    c_int,
    POINTER(c_ubyte),
    c_int,
    c_void_p,
    c_void_p,
    c_void_p,
    c_void_p,
    c_void_p,
]
AV.avRecvFrameData2.restype = c_int
AV.avClientStop.argtypes = [c_int]
AV.avClientStop.restype = c_int
IOTC.IOTC_Connect_Stop_BySID.argtypes = [c_int]
IOTC.IOTC_Connect_Stop_BySID.restype = c_int
IOTC.IOTC_DeInitialize.argtypes = []
IOTC.IOTC_DeInitialize.restype = c_int


def discover_printers(timeout_ms: int = 2000, max_num: int = 16):
    """Return a list of (UID, IP) tuples for printers found on the LAN."""

    devices = (IOTCDevInfo * max_num)()
    count = IOTC.IOTC_Lan_Search2(byref(devices[0]), c_int(max_num), c_uint(timeout_ms))
    return [
        (
            devices[i].UID.decode(errors="ignore").rstrip("\x00"),
            devices[i].IP.decode(errors="ignore"),
        )
        for i in range(count)
    ]


def stream_to_file(uid: str, out_file: str):
    """Stream H.264 frames from the printer identified by UID into a file."""

    sid = IOTC.IOTC_Connect_ByUID(uid.encode())
    av_index = AV.avClientStart(sid, b"user", b"pass", c_uint(20), 0, 0)

    buf = (c_ubyte * (1024 * 1024))()
    with open(out_file, "wb") as fh:
        while True:
            size = AV.avRecvFrameData2(av_index, buf, len(buf), None, None, None, None, None)
            if size <= 0:
                break
            fh.write(bytes(buf[:size]))

    AV.avClientStop(av_index)
    IOTC.IOTC_Connect_Stop_BySID(sid)


def main():
    IOTC.IOTC_Initialize(0)
    printers = discover_printers()
    if not printers:
        print("No printers detected on the LAN.")
        IOTC.IOTC_DeInitialize()
        return

    for idx, (uid, ip) in enumerate(printers):
        print(f"{idx}: {uid} @ {ip}")
    choice = int(input("Select printer index: "))
    uid = printers[choice][0]
    print(f"Streaming from {uid} ...")
    stream_to_file(uid, f"{uid}.h264")
    IOTC.IOTC_DeInitialize()


if __name__ == "__main__":
    main()
