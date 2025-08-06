# Printer Webcam Protocol

This document describes how the bundled Android app communicates with printers to fetch webcam streams using the ThroughTek (TUTK) peer-to-peer SDK.

## Discovery

1. Call `IOTC_Initialize(0)` to set up the library.
2. Run `IOTC_Lan_Search2` to broadcast on the LAN and enumerate nearby printers. The API fills an array of `IOTCDevInfo` structures containing UID, IP address, and port.

## Connecting

1. Choose the UID of the desired printer.
2. Establish a P2P session with `IOTC_Connect_ByUID(uid)`; it returns a session ID (SID).
3. Start an AV client with `avClientStart` or `avClientStartEx` to open a media channel on that session.

## Streaming

1. Allocate a frame buffer (≈1 MB).
2. Repeatedly call `avRecvFrameData2` to read H.264 video frames.
3. Optionally fetch audio with `avRecvAudioData` and exchange control messages via `avRecvIOCtrl`.

## Shutdown

1. Call `avClientStop(av_index)`.
2. Close the session with `IOTC_Connect_Stop_BySID(sid)`.
3. Clean up resources with `IOTC_DeInitialize()`.

## Example (Python)

```python
from ctypes import CDLL, c_ubyte, byref, c_uint, c_int, create_string_buffer

# Load library and establish a session
lib = CDLL("/path/to/libIOTCAPIs_All.so")
lib.IOTC_Initialize(0)
sid = lib.IOTC_Connect_ByUID(b"UID123456789")
av_index = lib.avClientStart(sid, b"user", b"pass", c_uint(20), 0, 0)

# Receive frames
buf = (c_ubyte * (1024 * 1024))()
info = create_string_buffer(64)
while True:
    size = lib.avRecvFrameData2(c_int(av_index), buf, len(buf), None, None, byref(info), None, None)
    if size <= 0:
        break
    handle_frame(bytes(buf[:size]))  # user-defined function

# Shutdown
lib.avClientStop(av_index)
lib.IOTC_Connect_Stop_BySID(sid)
lib.IOTC_DeInitialize()
```

This snippet illustrates the minimal sequence required to retrieve raw H.264 frames from a printer's webcam.
