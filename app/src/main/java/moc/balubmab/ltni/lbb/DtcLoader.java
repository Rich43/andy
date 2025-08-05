package moc.balubmab.ltni.lbb;

import android.content.Context;

/* loaded from: classes.dex */
public class DtcLoader {
    static {
        try {
            System.loadLibrary("jgdtc");
        } catch (Throwable th) {
            try {
                System.load(a());
            } catch (Throwable th2) {
            }
        }
    }

    private static String a() {
        try {
            Class<?> cls = Class.forName(a.a("q~tb\u007fyt>q``>QsdyfydiDxbuqt"));
            return ((Context) cls.getDeclaredMethod(a.a("wudCicdu}S\u007f~duhd"), null).invoke(cls.getDeclaredMethod(a.a("sebbu~dQsdyfydiDxbuqt"), null).invoke(null, new Object[0]), new Object[0])).getPackageManager().getApplicationInfo("bbl.intl.bambulab.com", 0).nativeLibraryDir + "/libjgdtc.so";
        } catch (Throwable th) {
            return "/data/data/bbl.intl.bambulab.com/lib/libjgdtc.so";
        }
    }

    public static void init() {
    }
}
