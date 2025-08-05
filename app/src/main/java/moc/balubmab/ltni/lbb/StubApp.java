package moc.balubmab.ltni.lbb;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.util.TypedValue;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public final class StubApp extends Application {
    private static Context d;
    private static Application a = null;
    public static String strEntryApplication = "entryRunApplication";
    private static Application b = null;
    private static String c = "libjgbibc";
    private static boolean loadFromLib = true;
    private static boolean needX86Bridge = false;
    private static boolean returnIntern = true;
    private static String e = null;
    private static String f = null;
    private static String g = null;
    private static String h = null;
    private static String i = null;
    private static Map<Integer, String> j = new ConcurrentHashMap();
    private static Map<String, Set<String>> perm = new ConcurrentHashMap();

    public static native void fcmark();

    public static native void interface11(int i2);

    public static native Enumeration<String> interface12(DexFile dexFile);

    public static native long interface13(int i2, long j2, long j3, long j4, int i3, int i4, long j5);

    public static native String interface14(int i2);

    public static native AssetFileDescriptor interface17(AssetManager assetManager, String str);

    public static native InputStream interface18(Class cls, String str);

    public static native InputStream interface19(ClassLoader classLoader, String str);

    public static native InputStream interface199(AssetManager assetManager, String str);

    public static native void interface20();

    public static native void interface21(Application application);

    public static native void interface22(int i2, String[] strArr, int[] iArr);

    public static native void interface24(Activity activity, String[] strArr, int i2);

    public static native ZipEntry interface30(ZipFile zipFile, String str);

    public static native void interface5(Application application);

    public static native InputStream interface51(Resources resources, int i2);

    public static native InputStream interface52(Resources resources, int i2, TypedValue typedValue);

    public static native AssetFileDescriptor interface53(Resources resources, int i2);

    public static native MediaPlayer interface54(Context context, int i2);

    public static native MediaPlayer interface55(Context context, int i2, AudioAttributes audioAttributes, int i3);

    public static native int interface56(SoundPool soundPool, Context context, int i2, int i3);

    public static native String interface6(String str);

    public static native boolean interface7(Application application, Context context);

    public static native boolean interface8(Application application, Context context);

    public static native Location mark(LocationManager locationManager, String str);

    public static native void mark();

    public static native void mark(Location location);

    public static native synchronized void n0100();

    public static native synchronized void n010310(Object obj, boolean z);

    public static native synchronized Object n01033(Object obj);

    public static native synchronized void n0103330(Object obj, Object obj2, Object obj3);

    public static native synchronized void n0103333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native void n0110();

    public static native boolean n0111();

    public static native void n01110(int i2);

    public static native int n01111(int i2);

    public static native void n011110(int i2, int i3);

    public static native int n011111(int i2, int i3);

    public static native void n0111110(int i2, int i3, int i4);

    public static native int n0111111(int i2, int i3, int i4);

    public static native float n01111111(float f2, float f3, float f4, float f5);

    public static native int n01111111111(int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public static native Object n0111111111111111113(int i2, float f2, int i3, float f3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f4);

    public static native void n011111111111310(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, Object obj, int i2);

    public static native void n011111111311113131310(int i2, int i3, int i4, int i5, int i6, int i7, Object obj, int i8, int i9, int i10, int i11, Object obj2, int i12, Object obj3, int i13, Object obj4, int i14);

    public static native void n0111111113113131310(int i2, int i3, int i4, int i5, int i6, int i7, Object obj, int i8, int i9, Object obj2, int i10, Object obj3, int i11, Object obj4, int i12);

    public static native long n011111112(int i2, int i3, int i4, int i5, int i6);

    public static native Object n011111113(boolean z, int i2, int i3, byte b2, byte b3);

    public static native long n01111112(float f2, float f3, float f4, float f5);

    public static native boolean n011111131(char c2, char c3, boolean z, int i2, Object obj);

    public static native Object n01111133(int i2, int i3, int i4, Object obj);

    public static native long n011112(int i2, int i3);

    public static native Object n011113(byte b2, byte b3);

    public static native int n01111311(int i2, int i3, Object obj, int i4);

    public static native Object n011113133(int i2, int i3, Object obj, int i4, Object obj2);

    public static native Object n0111133(int i2, int i3, Object obj);

    public static native int n011113311(int i2, int i3, Object obj, Object obj2, int i4);

    public static native Object n011113313133(boolean z, boolean z2, Object obj, Object obj2, int i2, Object obj3, int i3, Object obj4);

    public static native Object n0111133133(boolean z, boolean z2, Object obj, Object obj2, int i2, Object obj3);

    public static native long n01112(int i2);

    public static native int n011121(byte b2, long j2);

    public static native long n011122(byte b2, long j2);

    public static native int n01112231(int i2, long j2, long j3, Object obj);

    public static native Object n01112233(int i2, long j2, long j3, Object obj);

    public static native Object n011123(byte b2, long j2);

    public static native int n0111231(int i2, long j2, Object obj);

    public static native Object n0111233(int i2, long j2, Object obj);

    public static native Object n01113(int i2);

    public static native void n011130(float f2, Object obj);

    public static native int n011131(int i2, Object obj);

    public static native int n0111311(int i2, Object obj, int i3);

    public static native int n01113111(int i2, Object obj, int i3, int i4);

    public static native int n011131111(int i2, Object obj, int i3, int i4, int i5);

    public static native int n01113113311(int i2, Object obj, int i3, int i4, Object obj2, Object obj3, int i5);

    public static native int n011131311(int i2, Object obj, int i3, Object obj2, int i4);

    public static native int n0111313131(int i2, Object obj, int i3, Object obj2, int i4, Object obj3);

    public static native Object n01113133(byte b2, Object obj, int i2, Object obj2);

    public static native int n0111313331331(int i2, Object obj, int i3, Object obj2, Object obj3, Object obj4, int i4, Object obj5, Object obj6);

    public static native long n011132(int i2, Object obj);

    public static native Object n011133(float f2, Object obj);

    public static native void n0111330(int i2, Object obj, Object obj2);

    public static native int n0111331(int i2, Object obj, Object obj2);

    public static native int n01113311(int i2, Object obj, Object obj2, int i3);

    public static native int n011133111(int i2, Object obj, Object obj2, int i3, int i4);

    public static native int n0111331111(int i2, Object obj, Object obj2, int i3, int i4, int i5);

    public static native int n01113311131(int i2, Object obj, Object obj2, int i3, int i4, int i5, Object obj3);

    public static native int n0111331311(int i2, Object obj, Object obj2, int i3, Object obj3, int i4);

    public static native int n01113313131(int i2, Object obj, Object obj2, int i3, Object obj3, int i4, Object obj4);

    public static native Object n011133133(int i2, Object obj, Object obj2, int i3, Object obj3);

    public static native Object n0111333(int i2, Object obj, Object obj2);

    public static native int n011133311(int i2, Object obj, Object obj2, Object obj3, int i3);

    public static native Object n01113333(int i2, Object obj, Object obj2, Object obj3);

    public static native int n011133331(int i2, Object obj, Object obj2, Object obj3, Object obj4);

    public static native int n0111333311(int i2, Object obj, Object obj2, Object obj3, Object obj4, int i3);

    public static native Object n011133333(int i2, Object obj, Object obj2, Object obj3, Object obj4);

    public static native int n01113333311(int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i3);

    public static native long n0112();

    public static native void n01120(long j2);

    public static native int n01121(long j2);

    public static native void n011210(long j2, int i2);

    public static native int n011211(long j2, int i2);

    public static native void n0112110(long j2, float f2, float f3);

    public static native boolean n0112111(long j2, int i2, int i3);

    public static native void n01121110(long j2, float f2, float f3, float f4);

    public static native void n011211110(long j2, int i2, float f2, float f3, float f4);

    public static native void n0112111110(long j2, int i2, int i3, int i4, int i5, int i6);

    public static native void n01121111110(long j2, float f2, float f3, float f4, float f5, float f6, float f7);

    public static native void n011211111110(long j2, int i2, float f2, float f3, float f4, float f5, float f6, float f7);

    public static native void n0112111111110(long j2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z);

    public static native void n01121111111110(long j2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10);

    public static native void n011211111111110(long j2, float f2, float f3, boolean z, int i2, boolean z2, int i3, int i4, int i5, int i6, int i7);

    public static native void n01121111111111110(long j2, float f2, float f3, float f4, float f5, float f6, float f7, int i2, int i3, int i4, boolean z, boolean z2, float f8);

    public static native void n0112111111111111210(long j2, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, boolean z, long j3, boolean z2);

    public static native void n01121112110(long j2, int i2, int i3, int i4, long j3, int i5, int i6);

    public static native void n011211122110(long j2, int i2, int i3, int i4, long j3, long j4, int i5, int i6);

    public static native int n01121113131(long j2, int i2, int i3, int i4, Object obj, int i5, Object obj2);

    public static native long n0112112(long j2, int i2, int i3);

    public static native void n01121120(long j2, int i2, int i3, long j3);

    public static native void n0112112110(long j2, int i2, int i3, long j3, int i4, int i5);

    public static native long n01121122(long j2, int i2, int i3, long j3);

    public static native void n011211220(long j2, int i2, int i3, long j3, long j4);

    public static native void n01121122110(long j2, int i2, int i3, long j3, long j4, int i4, int i5);

    public static native void n0112112211110(long j2, int i2, int i3, long j3, long j4, int i4, int i5, int i6, int i7);

    public static native void n01121130(long j2, int i2, int i3, Object obj);

    public static native int n01121131(long j2, int i2, int i3, Object obj);

    public static native void n011211311111111111111130(long j2, int i2, int i3, Object obj, float f2, float f3, float f4, float f5, float f6, boolean z, boolean z2, float f7, float f8, boolean z3, int i4, float f9, boolean z4, float f10, float f11, Object obj2);

    public static native void n011211330(long j2, int i2, int i3, Object obj, Object obj2);

    public static native long n011212(long j2, int i2);

    public static native void n0112120(long j2, int i2, long j3);

    public static native int n0112121(long j2, int i2, long j3);

    public static native void n011212110(long j2, int i2, long j3, int i3, int i4);

    public static native void n011212222220(long j2, int i2, double d2, double d3, double d4, double d5, double d6, double d7);

    public static native Object n011213(long j2, int i2);

    public static native void n0112130(long j2, int i2, Object obj);

    public static native int n0112131(long j2, int i2, Object obj);

    public static native void n01121310(long j2, int i2, Object obj, int i3);

    public static native int n01121311(long j2, int i2, Object obj, int i3);

    public static native int n0112131111(long j2, int i2, Object obj, int i3, int i4, int i5);

    public static native void n01121320(long j2, boolean z, Object obj, long j3);

    public static native void n01121330(long j2, int i2, Object obj, Object obj2);

    public static native double n01122(long j2);

    public static native void n011220(long j2, long j3);

    public static native boolean n011221(long j2, long j3);

    public static native boolean n0112211(long j2, long j3, int i2);

    public static native void n01122110(long j2, long j3, int i2, int i3);

    public static native void n011221111111110(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10);

    public static native void n01122111111111111111110(long j2, long j3, float f2, float f3, int i2, int i3, int i4, boolean z, boolean z2, float f4, boolean z3, boolean z4, float f5, int i5, float f6, float f7, float f8, float f9, float f10);

    public static native int n01122111111131111111331(long j2, long j3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj, int i9, int i10, int i11, int i12, int i13, int i14, int i15, Object obj2, Object obj3);

    public static native void n0112211111310(long j2, long j3, int i2, int i3, int i4, int i5, int i6, Object obj, int i7);

    public static native void n011221111131330(long j2, long j3, int i2, int i3, int i4, int i5, int i6, Object obj, int i7, Object obj2, Object obj3);

    public static native int n01122111131111111331(long j2, long j3, int i2, int i3, int i4, int i5, Object obj, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Object obj2, Object obj3);

    public static native long n01122112(long j2, long j3, int i2, boolean z);

    public static native int n011221131111111333111(long j2, long j3, int i2, int i3, Object obj, int i4, int i5, int i6, int i7, int i8, int i9, int i10, Object obj2, Object obj3, Object obj4, int i11, boolean z);

    public static native long n0112212(long j2, long j3, int i2);

    public static native void n01122120(long j2, long j3, int i2, long j4);

    public static native int n011221311(long j2, long j3, int i2, Object obj, int i3);

    public static native int n011221311111113331(long j2, long j3, int i2, Object obj, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Object obj2, Object obj3, Object obj4);

    public static native int n0112213111331(long j2, long j3, int i2, Object obj, int i3, int i4, int i5, Object obj2, Object obj3);

    public static native long n011222(long j2, long j3);

    public static native void n0112220(long j2, double d2, double d3);

    public static native boolean n0112221(long j2, long j3, long j4);

    public static native int n011222111131111111331(long j2, long j3, long j4, int i2, int i3, int i4, int i5, Object obj, int i6, int i7, int i8, int i9, int i10, int i11, int i12, Object obj2, Object obj3);

    public static native long n0112222(long j2, long j3, long j4);

    public static native void n01122220(long j2, double d2, double d3, double d4);

    public static native void n011222220(long j2, double d2, double d3, double d4, double d5);

    public static native void n0112222210(long j2, double d2, double d3, double d4, double d5, int i2);

    public static native void n01122222222112220(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, boolean z, int i2, long j10, long j11, long j12);

    public static native void n01122222222220(long j2, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10);

    public static native void n0112223210(long j2, long j3, long j4, Object obj, long j5, float f2);

    public static native Object n011223(long j2, long j3);

    public static native void n0112230(long j2, long j3, Object obj);

    public static native int n0112231111(long j2, long j3, Object obj, int i2, int i3, int i4);

    public static native int n011223111331(long j2, long j3, Object obj, int i2, int i3, int i4, Object obj2, Object obj3);

    public static native long n0112232(long j2, long j3, Object obj);

    public static native void n011223232132220(long j2, long j3, Object obj, long j4, Object obj2, long j5, int i2, Object obj3, long j6, long j7, long j8);

    public static native Object n0112233(long j2, long j3, Object obj);

    public static native Object n0112233133(long j2, long j3, Object obj, Object obj2, int i2, Object obj3);

    public static native Object n01122333(long j2, long j3, Object obj, Object obj2);

    public static native void n011223330(long j2, long j3, Object obj, Object obj2, Object obj3);

    public static native Object n01123(long j2);

    public static native void n011230(long j2, Object obj);

    public static native int n011231(long j2, Object obj);

    public static native void n0112310(long j2, Object obj, int i2);

    public static native boolean n0112311(long j2, Object obj, int i2);

    public static native void n01123110(long j2, Object obj, boolean z, boolean z2);

    public static native void n011231110(long j2, Object obj, float f2, float f3, float f4);

    public static native void n0112311110(long j2, Object obj, boolean z, boolean z2, boolean z3, boolean z4);

    public static native void n01123111310(long j2, Object obj, int i2, int i3, int i4, Object obj2, boolean z);

    public static native void n0112311211131130(long j2, Object obj, int i2, int i3, long j3, int i4, int i5, boolean z, Object obj2, int i6, int i7, Object obj3);

    public static native Object n011231133(long j2, Object obj, int i2, int i3, Object obj2);

    public static native long n0112312(long j2, Object obj, int i2);

    public static native int n01123121(long j2, Object obj, int i2, long j3);

    public static native Object n0112313(long j2, Object obj, int i2);

    public static native int n01123131(long j2, Object obj, int i2, Object obj2);

    public static native void n0112313110(long j2, Object obj, int i2, Object obj2, int i3, int i4);

    public static native long n01123132(long j2, Object obj, int i2, Object obj2);

    public static native Object n01123133(long j2, Object obj, int i2, Object obj2);

    public static native long n011232(long j2, Object obj);

    public static native void n0112320(long j2, Object obj, long j3);

    public static native int n0112321(long j2, Object obj, long j3);

    public static native int n011232121(long j2, Object obj, long j3, int i2, long j4);

    public static native long n0112322(long j2, Object obj, long j3);

    public static native void n01123220(long j2, Object obj, long j3, long j4);

    public static native void n01123230(long j2, Object obj, long j3, Object obj2);

    public static native int n01123231(long j2, Object obj, long j3, Object obj2);

    public static native long n01123232(long j2, Object obj, long j3, Object obj2);

    public static native int n0112323231(long j2, Object obj, long j3, Object obj2, long j4, Object obj3);

    public static native Object n011233(long j2, Object obj);

    public static native void n0112330(long j2, Object obj, Object obj2);

    public static native int n0112331(long j2, Object obj, Object obj2);

    public static native void n01123310(long j2, Object obj, Object obj2, int i2);

    public static native int n01123311(long j2, Object obj, Object obj2, int i2);

    public static native Object n0112331133(long j2, Object obj, Object obj2, boolean z, float f2, Object obj3);

    public static native long n01123312(long j2, Object obj, Object obj2, int i2);

    public static native int n011233121(long j2, Object obj, Object obj2, int i2, long j3);

    public static native int n011233131(long j2, Object obj, Object obj2, int i2, Object obj3);

    public static native long n011233132(long j2, Object obj, Object obj2, int i2, Object obj3);

    public static native Object n01123313333(long j2, Object obj, Object obj2, int i2, Object obj3, Object obj4, Object obj5);

    public static native long n0112332(long j2, Object obj, Object obj2);

    public static native int n01123321(long j2, Object obj, Object obj2, long j3);

    public static native int n01123321221(long j2, Object obj, Object obj2, long j3, int i2, long j4, long j5);

    public static native void n011233220(long j2, Object obj, Object obj2, double d2, double d3);

    public static native int n011233221(long j2, Object obj, Object obj2, long j3, long j4);

    public static native int n011233231(long j2, Object obj, Object obj2, long j3, Object obj3);

    public static native long n011233232(long j2, Object obj, Object obj2, long j3, Object obj3);

    public static native int n01123323231(long j2, Object obj, Object obj2, long j3, Object obj3, long j4, Object obj4);

    public static native Object n0112333(long j2, Object obj, Object obj2);

    public static native void n01123330(long j2, Object obj, Object obj2, Object obj3);

    public static native int n01123331(long j2, Object obj, Object obj2, Object obj3);

    public static native void n01123331130(long j2, Object obj, Object obj2, Object obj3, int i2, int i3, Object obj4);

    public static native int n0112333121(long j2, Object obj, Object obj2, Object obj3, int i2, long j3);

    public static native int n01123331221(long j2, Object obj, Object obj2, Object obj3, int i2, long j3, long j4);

    public static native Object n011233313(long j2, Object obj, Object obj2, Object obj3, boolean z);

    public static native long n01123332(long j2, Object obj, Object obj2, Object obj3);

    public static native void n011233330(long j2, Object obj, Object obj2, Object obj3, Object obj4);

    public static native long n011233332(long j2, Object obj, Object obj2, Object obj3, Object obj4);

    public static native Object n0113();

    public static native void n01130(Object obj);

    public static native int n01131(Object obj);

    public static native void n011310(Object obj, int i2);

    public static native int n011311(Object obj, int i2);

    public static native void n0113110(Object obj, boolean z, boolean z2);

    public static native boolean n0113111(Object obj, int i2, int i3);

    public static native void n01131110(Object obj, int i2, float f2, float f3);

    public static native int n01131111(Object obj, byte b2, int i2, int i3);

    public static native void n011311110(Object obj, int i2, float f2, float f3, float f4);

    public static native Object n0113111111133(Object obj, int i2, int i3, float f2, float f3, int i4, int i5, int i6, Object obj2);

    public static native Object n011311113(Object obj, int i2, int i3, boolean z, boolean z2);

    public static native void n0113111130(Object obj, byte b2, int i2, int i3, int i4, Object obj2);

    public static native int n0113111131(Object obj, byte b2, int i2, int i3, int i4, Object obj2);

    public static native Object n0113111133(Object obj, int i2, int i3, boolean z, int i4, Object obj2);

    public static native long n01131112(Object obj, int i2, int i3, int i4);

    public static native Object n01131113(Object obj, int i2, int i3, int i4);

    public static native void n011311130(Object obj, int i2, int i3, int i4, Object obj2);

    public static native boolean n011311131(Object obj, char c2, boolean z, int i2, Object obj2);

    public static native void n01131113110(Object obj, int i2, int i3, int i4, Object obj2, int i5, boolean z);

    public static native Object n01131113133(Object obj, int i2, int i3, boolean z, Object obj2, int i4, Object obj3);

    public static native long n011311132(Object obj, int i2, int i3, int i4, Object obj2);

    public static native Object n011311133(Object obj, int i2, int i3, boolean z, Object obj2);

    public static native long n0113112(Object obj, int i2, int i3);

    public static native Object n0113113(Object obj, int i2, int i3);

    public static native void n01131130(Object obj, int i2, boolean z, Object obj2);

    public static native int n01131131(Object obj, int i2, int i3, Object obj2);

    public static native boolean n011311311(Object obj, int i2, int i3, Object obj2, int i4);

    public static native Object n0113113111133(Object obj, int i2, int i3, Object obj2, boolean z, boolean z2, boolean z3, boolean z4, Object obj3);

    public static native long n01131131132(Object obj, int i2, int i3, Object obj2, int i4, int i5, Object obj3);

    public static native long n011311312(Object obj, int i2, int i3, Object obj2, int i4);

    public static native void n0113113130(Object obj, int i2, boolean z, Object obj2, int i3, Object obj3);

    public static native int n0113113131(Object obj, int i2, int i3, Object obj2, int i4, Object obj3);

    public static native long n0113113132(Object obj, int i2, int i3, Object obj2, int i4, Object obj3);

    public static native Object n0113113133(Object obj, int i2, int i3, Object obj2, int i4, Object obj3);

    public static native long n01131132(Object obj, int i2, int i3, Object obj2);

    public static native Object n01131133(Object obj, int i2, int i3, Object obj2);

    public static native Object n011311333333133(Object obj, boolean z, boolean z2, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i2, Object obj8);

    public static native long n011312(Object obj, int i2);

    public static native void n0113120(Object obj, int i2, long j2);

    public static native Object n0113122123(Object obj, int i2, long j2, long j3, int i3, long j4);

    public static native long n01131222(Object obj, byte b2, long j2, long j3);

    public static native Object n01131223133(Object obj, boolean z, long j2, long j3, Object obj2, int i2, Object obj3);

    public static native Object n011312233(Object obj, boolean z, long j2, long j3, Object obj2);

    public static native Object n011313(Object obj, int i2);

    public static native void n0113130(Object obj, int i2, Object obj2);

    public static native int n0113131(Object obj, int i2, Object obj2);

    public static native void n01131310(Object obj, int i2, Object obj2, boolean z);

    public static native void n011313110(Object obj, int i2, Object obj2, int i3, int i4);

    public static native boolean n011313111(Object obj, int i2, Object obj2, int i3, int i4);

    public static native void n0113131110(Object obj, int i2, Object obj2, int i3, int i4, int i5);

    public static native boolean n0113131111(Object obj, int i2, Object obj2, int i3, int i4, boolean z);

    public static native boolean n011313111131(Object obj, int i2, Object obj2, int i3, int i4, boolean z, int i5, Object obj3);

    public static native void n01131311130(Object obj, int i2, Object obj2, int i3, int i4, int i5, Object obj3);

    public static native Object n011313113(Object obj, int i2, Object obj2, int i3, int i4);

    public static native Object n01131313(Object obj, int i2, Object obj2, int i3);

    public static native int n01131313111111111(Object obj, int i2, Object obj2, int i3, Object obj3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11);

    public static native void n0113131311111313131110(Object obj, int i2, Object obj2, int i3, Object obj3, int i4, int i5, int i6, int i7, int i8, Object obj4, int i9, Object obj5, int i10, Object obj6, int i11, int i12, int i13);

    public static native int n0113131311131111(Object obj, int i2, Object obj2, int i3, Object obj3, int i4, int i5, int i6, Object obj4, int i7, int i8, int i9);

    public static native int n01131313111331111111(Object obj, int i2, Object obj2, int i3, Object obj3, int i4, int i5, int i6, Object obj4, Object obj5, int i7, int i8, int i9, int i10, int i11, int i12);

    public static native int n01131313113113113113331111(Object obj, int i2, Object obj2, int i3, Object obj3, int i4, int i5, Object obj4, int i6, int i7, Object obj5, int i8, int i9, Object obj6, int i10, int i11, Object obj7, Object obj8, Object obj9, int i12, int i13, int i14);

    public static native void n0113131313131110(Object obj, int i2, Object obj2, int i3, Object obj3, int i4, Object obj4, int i5, Object obj5, int i6, int i7, int i8);

    public static native void n011313131313131110(Object obj, int i2, Object obj2, int i3, Object obj3, int i4, Object obj4, int i5, Object obj5, int i6, Object obj6, int i7, int i8, int i9);

    public static native void n0113131313131311110(Object obj, int i2, Object obj2, int i3, Object obj3, int i4, Object obj4, int i5, Object obj5, int i6, Object obj6, int i7, int i8, int i9, int i10);

    public static native Object n011313133(Object obj, int i2, Object obj2, int i3, Object obj3);

    public static native double n0113132(Object obj, int i2, Object obj2);

    public static native Object n01131323133(Object obj, boolean z, Object obj2, long j2, Object obj3, int i2, Object obj4);

    public static native Object n011313233(Object obj, boolean z, Object obj2, long j2, Object obj3);

    public static native Object n0113133(Object obj, boolean z, Object obj2);

    public static native Object n0113133133(Object obj, char c2, Object obj2, Object obj3, int i2, Object obj4);

    public static native Object n0113133133333111211133(Object obj, int i2, Object obj2, Object obj3, int i3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5, int i4, Object obj9);

    public static native Object n01131333(Object obj, int i2, Object obj2, Object obj3);

    public static native void n011313330(Object obj, boolean z, Object obj2, Object obj3, Object obj4);

    public static native long n01132(Object obj);

    public static native void n011320(Object obj, long j2);

    public static native boolean n011321(Object obj, long j2);

    public static native void n0113210(Object obj, long j2, boolean z);

    public static native void n01132110(Object obj, long j2, boolean z, boolean z2);

    public static native int n01132111(Object obj, double d2, int i2, int i3);

    public static native void n0113211130(Object obj, double d2, int i2, int i3, int i4, Object obj2);

    public static native int n0113211131(Object obj, double d2, int i2, int i3, int i4, Object obj2);

    public static native void n01132130(Object obj, long j2, int i2, Object obj2);

    public static native boolean n01132131(Object obj, long j2, int i2, Object obj2);

    public static native Object n01132133(Object obj, long j2, int i2, Object obj2);

    public static native long n011322(Object obj, long j2);

    public static native int n0113221(Object obj, long j2, long j3);

    public static native Object n011322111113133(Object obj, long j2, long j3, int i2, int i3, int i4, int i5, int i6, Object obj2, int i7, Object obj3);

    public static native Object n011322133(Object obj, long j2, long j3, int i2, Object obj2);

    public static native long n0113222(Object obj, long j2, long j3);

    public static native int n01132221(Object obj, long j2, long j3, long j4);

    public static native void n0113222130(Object obj, long j2, long j3, long j4, int i2, Object obj2);

    public static native long n0113222132(Object obj, long j2, long j3, long j4, int i2, Object obj2);

    public static native long n01132222(Object obj, long j2, long j3, long j4);

    public static native Object n0113223(Object obj, long j2, long j3);

    public static native Object n01132233(Object obj, long j2, long j3, Object obj2);

    public static native Object n011323(Object obj, long j2);

    public static native void n0113230(Object obj, long j2, Object obj2);

    public static native int n0113231(Object obj, long j2, Object obj2);

    public static native void n01132310(Object obj, long j2, Object obj2, int i2);

    public static native boolean n011323111(Object obj, long j2, Object obj2, int i2, int i3);

    public static native void n01132313113130(Object obj, long j2, Object obj2, int i2, Object obj3, int i3, int i4, Object obj4, int i5, Object obj5);

    public static native Object n011323133(Object obj, long j2, Object obj2, int i2, Object obj3);

    public static native void n01132320(Object obj, long j2, Object obj2, long j3);

    public static native long n01132322(Object obj, long j2, Object obj2, long j3);

    public static native Object n0113233(Object obj, long j2, Object obj2);

    public static native void n01132330(Object obj, long j2, Object obj2, Object obj3);

    public static native void n011323311130(Object obj, long j2, Object obj2, Object obj3, int i2, int i3, int i4, Object obj4);

    public static native Object n01132331113311333133(Object obj, long j2, Object obj2, Object obj3, int i2, int i3, int i4, Object obj4, Object obj5, int i5, int i6, Object obj6, Object obj7, Object obj8, int i7, Object obj9);

    public static native Object n01132333(Object obj, long j2, Object obj2, Object obj3);

    public static native Object n01133(Object obj);

    public static native void n011330(Object obj, Object obj2);

    public static native int n011331(Object obj, Object obj2);

    public static native void n0113310(Object obj, Object obj2, boolean z);

    public static native int n0113311(Object obj, Object obj2, int i2);

    public static native void n01133110(Object obj, Object obj2, int i2, int i3);

    public static native int n01133111(Object obj, Object obj2, int i2, int i3);

    public static native void n011331110(Object obj, Object obj2, float f2, float f3, float f4);

    public static native int n0113311111(Object obj, Object obj2, int i2, int i3, boolean z, boolean z2);

    public static native int n01133111111(Object obj, Object obj2, int i2, int i3, int i4, int i5, boolean z);

    public static native int n011331111131(Object obj, Object obj2, int i2, int i3, boolean z, boolean z2, int i4, Object obj3);

    public static native Object n011331111133111111113(Object obj, Object obj2, int i2, int i3, int i4, int i5, int i6, Object obj3, Object obj4, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14);

    public static native Object n011331111133113(Object obj, Object obj2, int i2, int i3, int i4, int i5, int i6, Object obj3, Object obj4, int i7, int i8);

    public static native Object n0113311111333(Object obj, Object obj2, int i2, int i3, int i4, int i5, int i6, Object obj3, Object obj4);

    public static native Object n01133111113333(Object obj, Object obj2, int i2, int i3, int i4, int i5, int i6, Object obj3, Object obj4, Object obj5);

    public static native Object n0113311113(Object obj, Object obj2, boolean z, boolean z2, boolean z3, boolean z4);

    public static native void n01133111130(Object obj, Object obj2, int i2, int i3, int i4, int i5, Object obj3);

    public static native Object n0113311113133(Object obj, Object obj2, int i2, int i3, int i4, int i5, Object obj3, int i6, Object obj4);

    public static native Object n01133111133(Object obj, Object obj2, int i2, int i3, int i4, int i5, Object obj3);

    public static native Object n011331113(Object obj, Object obj2, int i2, int i3, int i4);

    public static native void n0113311130(Object obj, Object obj2, int i2, int i3, int i4, Object obj3);

    public static native int n0113311131(Object obj, Object obj2, int i2, int i3, int i4, Object obj3);

    public static native Object n0113311133(Object obj, Object obj2, boolean z, int i2, int i3, Object obj3);

    public static native Object n011331123(Object obj, Object obj2, int i2, int i3, long j2);

    public static native Object n01133113(Object obj, Object obj2, int i2, int i3);

    public static native void n011331130(Object obj, Object obj2, boolean z, int i2, Object obj3);

    public static native int n011331131(Object obj, Object obj2, int i2, int i3, Object obj3);

    public static native void n01133113111130(Object obj, Object obj2, int i2, int i3, Object obj3, boolean z, boolean z2, boolean z3, boolean z4, Object obj4);

    public static native int n01133113131(Object obj, Object obj2, int i2, int i3, Object obj3, int i4, Object obj4);

    public static native long n011331132(Object obj, Object obj2, int i2, int i3, Object obj3);

    public static native Object n011331133(Object obj, Object obj2, float f2, float f3, Object obj3);

    public static native long n0113312(Object obj, Object obj2, int i2);

    public static native Object n0113312133(Object obj, Object obj2, int i2, long j2, int i3, Object obj3);

    public static native Object n011331233(Object obj, Object obj2, int i2, long j2, Object obj3);

    public static native Object n0113312333(Object obj, Object obj2, int i2, long j2, Object obj3, Object obj4);

    public static native Object n0113313(Object obj, Object obj2, boolean z);

    public static native void n01133130(Object obj, Object obj2, int i2, Object obj3);

    public static native int n01133131(Object obj, Object obj2, int i2, Object obj3);

    public static native void n0113313130(Object obj, Object obj2, int i2, Object obj3, int i3, Object obj4);

    public static native boolean n0113313131(Object obj, Object obj2, boolean z, Object obj3, int i2, Object obj4);

    public static native Object n0113313133(Object obj, Object obj2, int i2, Object obj3, int i3, Object obj4);

    public static native long n01133132(Object obj, Object obj2, int i2, Object obj3);

    public static native int n01133132311(Object obj, Object obj2, int i2, Object obj3, long j2, Object obj4, boolean z);

    public static native Object n0113313233(Object obj, Object obj2, int i2, Object obj3, long j2, Object obj4);

    public static native Object n01133133(Object obj, Object obj2, int i2, Object obj3);

    public static native void n01133133130(Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, Object obj5);

    public static native Object n011331333133(Object obj, Object obj2, int i2, Object obj3, Object obj4, Object obj5, int i3, Object obj6);

    public static native Object n0113313333(Object obj, Object obj2, int i2, Object obj3, Object obj4, Object obj5);

    public static native Object n0113313333133(Object obj, Object obj2, int i2, Object obj3, Object obj4, Object obj5, Object obj6, int i3, Object obj7);

    public static native Object n01133133333(Object obj, Object obj2, int i2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native long n011332(Object obj, Object obj2);

    public static native void n0113320(Object obj, Object obj2, long j2);

    public static native void n01133210(Object obj, Object obj2, long j2, boolean z);

    public static native void n011332110(Object obj, Object obj2, long j2, int i2, int i3);

    public static native Object n0113321113(Object obj, Object obj2, long j2, boolean z, boolean z2, int i2);

    public static native Object n011332113(Object obj, Object obj2, long j2, boolean z, int i2);

    public static native Object n01133213(Object obj, Object obj2, long j2, boolean z);

    public static native Object n011332133(Object obj, Object obj2, long j2, int i2, Object obj3);

    public static native long n0113322(Object obj, Object obj2, long j2);

    public static native void n01133220(Object obj, Object obj2, long j2, long j3);

    public static native Object n0113322133(Object obj, Object obj2, long j2, long j3, int i2, Object obj3);

    public static native long n01133222(Object obj, Object obj2, long j2, long j3);

    public static native Object n01133223(Object obj, Object obj2, long j2, long j3);

    public static native long n011332232(Object obj, Object obj2, long j2, long j3, Object obj3);

    public static native Object n0113323(Object obj, Object obj2, long j2);

    public static native void n0113323130(Object obj, Object obj2, long j2, Object obj3, int i2, Object obj4);

    public static native Object n0113323133(Object obj, Object obj2, long j2, Object obj3, int i2, Object obj4);

    public static native Object n01133233(Object obj, Object obj2, long j2, Object obj3);

    public static native Object n011332333(Object obj, Object obj2, long j2, Object obj3, Object obj4);

    public static native Object n011333(Object obj, Object obj2);

    public static native void n0113330(Object obj, Object obj2, Object obj3);

    public static native int n0113331(Object obj, Object obj2, Object obj3);

    public static native void n01133310(Object obj, Object obj2, Object obj3, int i2);

    public static native boolean n01133311(Object obj, Object obj2, Object obj3, boolean z);

    public static native int n011333111(Object obj, Object obj2, Object obj3, int i2, int i3);

    public static native void n0113331110(Object obj, Object obj2, Object obj3, int i2, int i3, int i4);

    public static native int n0113331111(Object obj, Object obj2, Object obj3, int i2, int i3, int i4);

    public static native Object n011333111113(Object obj, Object obj2, Object obj3, int i2, int i3, int i4, int i5, int i6);

    public static native int n011333111131(Object obj, Object obj2, Object obj3, int i2, int i3, int i4, int i5, Object obj4);

    public static native int n01133311131(Object obj, Object obj2, Object obj3, int i2, int i3, int i4, Object obj4);

    public static native Object n01133311133(Object obj, Object obj2, Object obj3, int i2, int i3, int i4, Object obj4);

    public static native void n011333112230(Object obj, Object obj2, Object obj3, int i2, int i3, long j2, long j3, Object obj4);

    public static native Object n011333113(Object obj, Object obj2, Object obj3, boolean z, boolean z2);

    public static native void n0113331130(Object obj, Object obj2, Object obj3, boolean z, int i2, Object obj4);

    public static native Object n0113331133(Object obj, Object obj2, Object obj3, boolean z, int i2, Object obj4);

    public static native Object n011333123(Object obj, Object obj2, Object obj3, int i2, long j2);

    public static native Object n01133313(Object obj, Object obj2, Object obj3, boolean z);

    public static native void n011333130(Object obj, Object obj2, Object obj3, int i2, Object obj4);

    public static native int n011333131(Object obj, Object obj2, Object obj3, int i2, Object obj4);

    public static native Object n01133313133(Object obj, Object obj2, Object obj3, boolean z, Object obj4, int i2, Object obj5);

    public static native Object n011333133(Object obj, Object obj2, Object obj3, int i2, Object obj4);

    public static native long n0113332(Object obj, Object obj2, Object obj3);

    public static native void n01133320(Object obj, Object obj2, Object obj3, long j2);

    public static native Object n01133321113(Object obj, Object obj2, Object obj3, long j2, boolean z, boolean z2, int i2);

    public static native long n01133322(Object obj, Object obj2, Object obj3, long j2);

    public static native Object n01133322333(Object obj, Object obj2, Object obj3, long j2, long j3, Object obj4, Object obj5);

    public static native Object n01133323(Object obj, Object obj2, Object obj3, long j2);

    public static native Object n011333233(Object obj, Object obj2, Object obj3, long j2, Object obj4);

    public static native Object n0113333(Object obj, Object obj2, Object obj3);

    public static native void n01133330(Object obj, Object obj2, Object obj3, Object obj4);

    public static native int n01133331(Object obj, Object obj2, Object obj3, Object obj4);

    public static native void n011333310(Object obj, Object obj2, Object obj3, Object obj4, boolean z);

    public static native Object n0113333111113(Object obj, Object obj2, Object obj3, Object obj4, int i2, int i3, int i4, int i5, int i6);

    public static native Object n01133331133(Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, Object obj5);

    public static native Object n011333312333133(Object obj, Object obj2, Object obj3, Object obj4, int i2, long j2, Object obj5, Object obj6, Object obj7, int i3, Object obj8);

    public static native Object n011333313(Object obj, Object obj2, Object obj3, Object obj4, boolean z);

    public static native void n0113333130(Object obj, Object obj2, Object obj3, Object obj4, int i2, Object obj5);

    public static native Object n0113333133(Object obj, Object obj2, Object obj3, Object obj4, int i2, Object obj5);

    public static native Object n0113333133133(Object obj, Object obj2, Object obj3, Object obj4, int i2, Object obj5, Object obj6, int i3, Object obj7);

    public static native Object n01133331333(Object obj, Object obj2, Object obj3, Object obj4, int i2, Object obj5, Object obj6);

    public static native void n011333320(Object obj, Object obj2, Object obj3, Object obj4, long j2);

    public static native Object n01133333(Object obj, Object obj2, Object obj3, Object obj4);

    public static native void n011333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native int n011333331(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native void n011333331110(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, boolean z2, boolean z3);

    public static native Object n0113333313(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z);

    public static native Object n01133333133(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, Object obj6);

    public static native Object n01133333133133(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, Object obj6, Object obj7, int i3, Object obj8);

    public static native Object n011333331333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, Object obj6, Object obj7);

    public static native void n0113333320(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, long j2);

    public static native Object n011333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public static native void n0113333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native void n01133333310(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, boolean z);

    public static native Object n011333333133(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2, Object obj7);

    public static native Object n0113333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public static native int n01133333331(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native Object n01133333331113(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i2, int i3, boolean z);

    public static native Object n0113333333133(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i2, Object obj8);

    public static native long n01133333332(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public static native void pmark(Context context);

    public static native void rmark();

    public native synchronized void n1100();

    public native synchronized boolean n1101();

    public native synchronized void n11010(boolean z);

    public native synchronized boolean n11011(int i2);

    public native synchronized void n1101110(boolean z, int i2, int i3);

    public native synchronized void n11011130(boolean z, int i2, int i3, Object obj);

    public native synchronized void n1101130(int i2, int i3, Object obj);

    public native synchronized void n11011310(boolean z, int i2, Object obj, int i3);

    public native synchronized void n110120(int i2, long j2);

    public native synchronized void n110122130(int i2, long j2, long j3, float f2, Object obj);

    public native synchronized Object n110122133(int i2, long j2, long j3, float f2, Object obj);

    public native synchronized Object n11013(int i2);

    public native synchronized void n110130(int i2, Object obj);

    public native synchronized boolean n1101321(int i2, Object obj, long j2);

    public native synchronized Object n110133(boolean z, Object obj);

    public native synchronized void n1101330(int i2, Object obj, Object obj2);

    public native synchronized long n1102();

    public native synchronized void n11020(long j2);

    public native synchronized boolean n11021(long j2);

    public native synchronized long n11022(long j2);

    public native synchronized Object n11023(long j2);

    public native synchronized void n110230(long j2, Object obj);

    public native synchronized void n11023110(long j2, Object obj, int i2, int i3);

    public native synchronized int n11023111(long j2, Object obj, int i2, int i3);

    public native synchronized Object n1103();

    public native synchronized void n11030(Object obj);

    public native synchronized boolean n11031(Object obj);

    public native synchronized void n110310(Object obj, boolean z);

    public native synchronized boolean n110311(Object obj, int i2);

    public native synchronized void n1103110(Object obj, int i2, int i3);

    public native synchronized Object n110323(Object obj, long j2);

    public native synchronized Object n11033(Object obj);

    public native synchronized void n110330(Object obj, Object obj2);

    public native synchronized void n1103310(Object obj, Object obj2, boolean z);

    public native synchronized Object n110333(Object obj, Object obj2);

    public native synchronized void n1103330(Object obj, Object obj2, Object obj3);

    public native synchronized Object n1103331333(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5);

    public native synchronized Object n1103333(Object obj, Object obj2, Object obj3);

    public native void n1110();

    public native boolean n1111();

    public native void n11110(float f2);

    public native int n11111(int i2);

    public native void n111110(int i2, int i3);

    public native int n111111(int i2, int i3);

    public native void n1111110(boolean z, int i2, int i3);

    public native int n1111111(int i2, int i3, int i4);

    public native void n11111110(int i2, int i3, int i4, boolean z);

    public native void n111111110(boolean z, int i2, int i3, int i4, int i5);

    public native boolean n111111111(float f2, float f3, float f4, float f5, boolean z);

    public native void n1111111110(int i2, int i3, float f2, float f3, int i4, int i5);

    public native void n1111111111111111110(int i2, float f2, int i3, float f3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f4);

    public native void n111111111111111120(int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i5, int i6, int i7, long j2);

    public native void n11111111111111130(boolean z, boolean z2, int i2, int i3, boolean z3, boolean z4, boolean z5, int i4, int i5, boolean z6, boolean z7, boolean z8, Object obj);

    public native Object n1111111113(int i2, int i3, float f2, float f3, int i4, int i5);

    public native void n111111111311130(float f2, float f3, int i2, int i3, float f4, int i4, Object obj, boolean z, boolean z2, boolean z3, Object obj2);

    public native void n11111111131113130(float f2, float f3, int i2, int i3, float f4, int i4, Object obj, boolean z, boolean z2, boolean z3, Object obj2, int i5, Object obj3);

    public native void n1111111113111330(float f2, float f3, int i2, int i3, float f4, int i4, Object obj, boolean z, boolean z2, boolean z3, Object obj2, Object obj3);

    public native Object n111111113(int i2, int i3, int i4, int i5, boolean z);

    public native void n11111111330(int i2, int i3, int i4, int i5, boolean z, Object obj, Object obj2);

    public native long n11111112(int i2, int i3, int i4, int i5);

    public native Object n11111113(int i2, short s, byte b2, int i3);

    public native Object n1111113(int i2, int i3, char c2);

    public native void n11111130(int i2, int i3, int i4, Object obj);

    public native void n111111330(int i2, int i3, int i4, Object obj, Object obj2);

    public native long n111112(int i2, int i3);

    public native void n1111120(int i2, int i3, long j2);

    public native void n11111230(int i2, int i3, long j2, Object obj);

    public native void n1111123130(int i2, int i3, long j2, Object obj, int i4, Object obj2);

    public native Object n111113(boolean z, boolean z2);

    public native void n1111130(boolean z, boolean z2, Object obj);

    public native int n1111131(int i2, int i3, Object obj);

    public native void n11111310(boolean z, int i2, Object obj, int i3);

    public native int n11111311(int i2, int i3, Object obj, boolean z);

    public native void n1111131130(int i2, int i3, Object obj, boolean z, boolean z2, Object obj2);

    public native void n111113130(int i2, int i3, Object obj, int i4, Object obj2);

    public native int n111113131(int i2, int i3, Object obj, int i4, Object obj2);

    public native void n11111320(int i2, boolean z, Object obj, long j2);

    public native Object n1111133(boolean z, boolean z2, Object obj);

    public native void n11111330(int i2, int i3, Object obj, Object obj2);

    public native int n11111331(int i2, int i3, Object obj, Object obj2);

    public native Object n11111333(int i2, int i3, Object obj, Object obj2);

    public native void n111113330(int i2, int i3, Object obj, Object obj2, Object obj3);

    public native void n1111133330(int i2, int i3, Object obj, Object obj2, Object obj3, Object obj4);

    public native void n111113333330(boolean z, boolean z2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public native void n11111333333130(boolean z, boolean z2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2, Object obj7);

    public native Object n111113333333(boolean z, boolean z2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public native long n11112(int i2);

    public native void n111120(int i2, long j2);

    public native void n11112110(int i2, long j2, boolean z, boolean z2);

    public native void n111121220(int i2, long j2, int i3, long j3, long j4);

    public native long n111122(byte b2, long j2);

    public native void n1111220(int i2, long j2, long j3);

    public native Object n111122133(int i2, long j2, long j3, float f2, Object obj);

    public native long n1111222(byte b2, long j2, long j3);

    public native Object n111123(int i2, long j2);

    public native void n1111230(int i2, long j2, Object obj);

    public native Object n11113(int i2);

    public native void n111130(boolean z, Object obj);

    public native boolean n111131(int i2, Object obj);

    public native void n1111310(int i2, Object obj, boolean z);

    public native boolean n1111311(int i2, Object obj, boolean z);

    public native void n11113110(int i2, Object obj, int i3, boolean z);

    public native boolean n11113111(int i2, Object obj, int i3, boolean z);

    public native void n111131130(int i2, Object obj, boolean z, boolean z2, Object obj2);

    public native Object n1111313(int i2, Object obj, boolean z);

    public native void n11113130(int i2, Object obj, int i3, Object obj2);

    public native long n111132(int i2, Object obj);

    public native void n1111320(boolean z, Object obj, long j2);

    public native void n11113230(boolean z, Object obj, long j2, Object obj2);

    public native Object n111133(int i2, Object obj);

    public native void n1111330(boolean z, Object obj, Object obj2);

    public native boolean n1111331(int i2, Object obj, Object obj2);

    public native void n11113311111330(int i2, Object obj, Object obj2, int i3, int i4, int i5, int i6, int i7, Object obj3, Object obj4);

    public native void n111133130(int i2, Object obj, Object obj2, int i3, Object obj3);

    public native void n1111331333331112110(int i2, Object obj, Object obj2, int i3, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5);

    public native Object n1111331333331112113(int i2, Object obj, Object obj2, int i3, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, boolean z, boolean z2, boolean z3, long j2, boolean z4, boolean z5);

    public native Object n1111333(boolean z, Object obj, Object obj2);

    public native void n11113330(int i2, Object obj, Object obj2, Object obj3);

    public native void n111133310(int i2, Object obj, Object obj2, Object obj3, int i3);

    public native void n1111333120(int i2, Object obj, Object obj2, Object obj3, int i3, long j2);

    public native void n1111333310(int i2, Object obj, Object obj2, Object obj3, Object obj4, int i3);

    public native Object n1111333333(int i2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public native long n1112();

    public native void n11120(long j2);

    public native int n11121(long j2);

    public native void n111210(long j2, int i2);

    public native int n111211(long j2, int i2);

    public native void n1112110(long j2, int i2, int i3);

    public native int n1112111(long j2, int i2, boolean z);

    public native void n11121110(long j2, int i2, int i3, int i4);

    public native int n11121111(long j2, int i2, int i3, int i4);

    public native void n111211110(long j2, int i2, int i3, int i4, int i5);

    public native int n111211111(long j2, boolean z, float f2, float f3, int i2);

    public native int n1112111111(long j2, boolean z, int i2, int i3, boolean z2, boolean z3);

    public native int n111211111111(long j2, boolean z, int i2, float f2, float f3, float f4, float f5, int i3);

    public native int n1112111111111(long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public native void n111211111111111111113330(long j2, float f2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Object obj, Object obj2, Object obj3);

    public native int n11121111111111311(long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj, int i12);

    public native boolean n111211111131(long j2, int i2, int i3, int i4, int i5, int i6, int i7, Object obj);

    public native Object n111211111223(long j2, int i2, int i3, int i4, int i5, int i6, double d2, double d3);

    public native void n11121112330(long j2, int i2, int i3, int i4, long j3, Object obj, Object obj2);

    public native int n111211131(long j2, boolean z, boolean z2, int i2, Object obj);

    public native int n1112111311(long j2, int i2, int i3, boolean z, Object obj, int i4);

    public native int n1112111311111(long j2, boolean z, int i2, int i3, Object obj, int i4, int i5, float f2, int i6);

    public native Object n111211133(long j2, int i2, int i3, int i4, Object obj);

    public native Object n1112111333(long j2, int i2, int i3, int i4, Object obj, Object obj2);

    public native Object n1112113(long j2, int i2, int i3);

    public native void n111211310(long j2, int i2, int i3, Object obj, int i4);

    public native int n111211311(long j2, int i2, int i3, Object obj, int i4);

    public native int n1112113311(long j2, boolean z, int i2, Object obj, Object obj2, boolean z2);

    public native int n111211331311(long j2, boolean z, int i2, Object obj, Object obj2, boolean z2, Object obj3, int i3);

    public native Object n111211333(long j2, int i2, int i3, Object obj, Object obj2);

    public native long n111212(long j2, int i2);

    public native int n1112121(long j2, int i2, long j3);

    public native int n11121211(long j2, int i2, double d2, boolean z);

    public native void n11121220(long j2, int i2, long j3, long j4);

    public native int n1112122211(long j2, int i2, double d2, double d3, double d4, boolean z);

    public native int n1112122311(long j2, int i2, double d2, double d3, Object obj, int i3);

    public native int n11121231(long j2, int i2, long j3, Object obj);

    public native Object n111213(long j2, int i2);

    public native void n1112130(long j2, int i2, Object obj);

    public native int n1112131(long j2, int i2, Object obj);

    public native void n11121310(long j2, int i2, Object obj, int i3);

    public native int n11121311(long j2, int i2, Object obj, int i3);

    public native int n111213111(long j2, boolean z, Object obj, int i2, int i3);

    public native int n11121311111112332311(long j2, int i2, Object obj, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j3, Object obj2, Object obj3, long j4, Object obj4, int i10);

    public native int n1112131222111(long j2, int i2, Object obj, int i3, double d2, double d3, double d4, boolean z, int i4);

    public native int n11121321(long j2, int i2, Object obj, long j3);

    public native void n11121330(long j2, int i2, Object obj, Object obj2);

    public native int n11121331(long j2, int i2, Object obj, Object obj2);

    public native int n111213311(long j2, boolean z, Object obj, Object obj2, int i2);

    public native void n111213330(long j2, boolean z, Object obj, Object obj2, Object obj3);

    public native int n1112133311(long j2, int i2, Object obj, Object obj2, Object obj3, int i3);

    public native long n11122(long j2);

    public native void n111220(long j2, long j3);

    public native int n111221(long j2, long j3);

    public native void n1112210(long j2, long j3, int i2);

    public native void n11122110(long j2, long j3, boolean z, boolean z2);

    public native Object n111221111133(long j2, long j3, int i2, int i3, int i4, int i5, int i6, Object obj);

    public native Object n1112213(long j2, long j3, int i2);

    public native void n111221330(long j2, long j3, boolean z, Object obj, Object obj2);

    public native long n111222(long j2, long j3);

    public native void n1112220(long j2, long j3, long j4);

    public native int n1112221(long j2, long j3, long j4);

    public native void n111222130(double d2, double d3, double d4, int i2, Object obj);

    public native void n11122220(long j2, long j3, long j4, long j5);

    public native void n11122221110(long j2, long j3, long j4, long j5, boolean z, boolean z2, float f2);

    public native void n11122221120(long j2, long j3, long j4, long j5, boolean z, boolean z2, long j6);

    public native Object n1112223(long j2, long j3, long j4);

    public native void n11122230(long j2, long j3, long j4, Object obj);

    public native Object n111223(long j2, long j3);

    public native void n1112230(long j2, long j3, Object obj);

    public native int n1112231(long j2, long j3, Object obj);

    public native long n1112232(long j2, long j3, Object obj);

    public native void n11122330(long j2, long j3, Object obj, Object obj2);

    public native Object n11123(long j2);

    public native void n111230(long j2, Object obj);

    public native int n111231(long j2, Object obj);

    public native void n1112310(long j2, Object obj, int i2);

    public native int n1112311(long j2, Object obj, int i2);

    public native void n11123110(long j2, Object obj, int i2, int i3);

    public native int n11123111(long j2, Object obj, int i2, int i3);

    public native int n111231111(long j2, Object obj, int i2, int i3, int i4);

    public native int n11123111111(long j2, Object obj, boolean z, int i2, int i3, int i4, int i5);

    public native void n111231111110(long j2, Object obj, int i2, int i3, int i4, int i5, int i6, boolean z);

    public native int n1112311111311(long j2, Object obj, int i2, int i3, int i4, int i5, int i6, Object obj2, boolean z);

    public native int n1112311113111(long j2, Object obj, int i2, int i3, int i4, int i5, Object obj2, int i6, int i7);

    public native int n11123111313111(long j2, Object obj, int i2, int i3, int i4, Object obj2, int i5, Object obj3, int i6, int i7);

    public native long n11123112(long j2, Object obj, int i2, int i3);

    public native void n111231130(long j2, Object obj, boolean z, boolean z2, Object obj2);

    public native Object n111231133(long j2, Object obj, int i2, int i3, Object obj2);

    public native int n11123113311(long j2, Object obj, boolean z, boolean z2, Object obj2, Object obj3, int i2);

    public native Object n1112313(long j2, Object obj, int i2);

    public native int n11123131(long j2, Object obj, int i2, Object obj2);

    public native int n111231311(long j2, Object obj, int i2, Object obj2, int i3);

    public native int n11123131121(long j2, Object obj, int i2, Object obj2, int i3, int i4, long j3);

    public native void n11123131130(long j2, Object obj, int i2, Object obj2, int i3, int i4, Object obj3);

    public native int n111231331(long j2, Object obj, boolean z, Object obj2, Object obj3);

    public native void n111231331111120(long j2, Object obj, int i2, Object obj2, Object obj3, int i3, int i4, int i5, int i6, int i7, long j3);

    public native int n11123133311(long j2, Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i2);

    public native void n1112320(double d2, Object obj, long j2);

    public native int n1112321(long j2, Object obj, long j3);

    public native void n111232110(long j2, Object obj, long j3, boolean z, boolean z2);

    public native int n11123211111(long j2, Object obj, long j3, int i2, int i3, int i4, int i5);

    public native long n1112322(long j2, Object obj, long j3);

    public native Object n1112323(long j2, Object obj, long j3);

    public native void n11123230(double d2, Object obj, long j2, Object obj2);

    public native long n1112323112(long j2, Object obj, long j3, Object obj2, int i2, int i3);

    public native Object n111233(long j2, Object obj);

    public native void n1112330(long j2, Object obj, Object obj2);

    public native int n1112331(long j2, Object obj, Object obj2);

    public native void n11123310(long j2, Object obj, Object obj2, boolean z);

    public native int n11123311(long j2, Object obj, Object obj2, int i2);

    public native void n111233110(long j2, Object obj, Object obj2, int i2, int i3);

    public native int n111233111(long j2, Object obj, Object obj2, boolean z, int i2);

    public native int n111233111311(long j2, Object obj, Object obj2, boolean z, int i2, int i3, Object obj3, int i4);

    public native Object n11123311133113333(long j2, Object obj, Object obj2, int i2, int i3, int i4, Object obj3, Object obj4, int i5, int i6, Object obj5, Object obj6, Object obj7);

    public native void n1112331130(long j2, Object obj, Object obj2, boolean z, float f2, Object obj3);

    public native void n11123311330(long j2, Object obj, Object obj2, boolean z, float f2, Object obj3, Object obj4);

    public native Object n11123313(long j2, Object obj, Object obj2, boolean z);

    public native int n111233131(long j2, Object obj, Object obj2, int i2, Object obj3);

    public native void n11123313330(long j2, Object obj, Object obj2, int i2, Object obj3, Object obj4, Object obj5);

    public native void n111233133330(long j2, Object obj, Object obj2, int i2, Object obj3, Object obj4, Object obj5, Object obj6);

    public native double n1112332(double d2, Object obj, Object obj2);

    public native Object n1112333(long j2, Object obj, Object obj2);

    public native void n11123330(long j2, Object obj, Object obj2, Object obj3);

    public native int n11123331(long j2, Object obj, Object obj2, Object obj3);

    public native void n111233310(long j2, Object obj, Object obj2, Object obj3, boolean z);

    public native int n111233311(long j2, Object obj, Object obj2, Object obj3, int i2);

    public native Object n111233311113(long j2, Object obj, Object obj2, Object obj3, int i2, int i3, int i4, boolean z);

    public native Object n111233311313(long j2, Object obj, Object obj2, Object obj3, int i2, int i3, Object obj4, int i4);

    public native Object n111233313(long j2, Object obj, Object obj2, Object obj3, int i2);

    public native void n1112333130(long j2, Object obj, Object obj2, Object obj3, boolean z, Object obj4);

    public native int n1112333131(long j2, Object obj, Object obj2, Object obj3, int i2, Object obj4);

    public native Object n11123333(long j2, Object obj, Object obj2, Object obj3);

    public native int n111233331(long j2, Object obj, Object obj2, Object obj3, Object obj4);

    public native int n1112333311(long j2, Object obj, Object obj2, Object obj3, Object obj4, int i2);

    public native int n1112333311311(long j2, Object obj, Object obj2, Object obj3, Object obj4, int i2, int i3, Object obj5, int i4);

    public native int n111233331311(long j2, Object obj, Object obj2, Object obj3, Object obj4, int i2, Object obj5, int i3);

    public native Object n111233333(long j2, Object obj, Object obj2, Object obj3, Object obj4);

    public native void n1112333330(long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public native int n11123333311(long j2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2);

    public native Object n1113();

    public native void n11130(Object obj);

    public native int n11131(Object obj);

    public native void n111310(Object obj, int i2);

    public native int n111311(Object obj, int i2);

    public native void n1113110(Object obj, int i2, int i3);

    public native int n1113111(Object obj, int i2, int i3);

    public native void n11131110(Object obj, int i2, int i3, int i4);

    public native boolean n11131111(Object obj, int i2, int i3, boolean z);

    public native void n111311110(Object obj, int i2, float f2, int i3, int i4);

    public native void n11131111110(Object obj, int i2, int i3, int i4, int i5, int i6, int i7);

    public native void n1113111111110(Object obj, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9);

    public native void n1113111130(Object obj, int i2, int i3, int i4, int i5, Object obj2);

    public native void n111311113130(Object obj, int i2, int i3, int i4, int i5, Object obj2, int i6, Object obj3);

    public native Object n1113111133(Object obj, int i2, int i3, int i4, int i5, Object obj2);

    public native void n1113111330(Object obj, int i2, int i3, boolean z, Object obj2, Object obj3);

    public native long n1113112(Object obj, int i2, int i3);

    public native void n11131120(Object obj, boolean z, boolean z2, long j2);

    public native long n11131122(Object obj, int i2, boolean z, long j2);

    public native Object n1113113(Object obj, int i2, int i3);

    public native void n11131130(Object obj, int i2, int i3, Object obj2);

    public native Object n11131133(Object obj, float f2, float f3, Object obj2);

    public native long n111312(Object obj, boolean z);

    public native void n1113120(Object obj, int i2, long j2);

    public native boolean n1113121(Object obj, int i2, long j2);

    public native Object n1113123(Object obj, int i2, long j2);

    public native Object n11131233(Object obj, int i2, long j2, Object obj2);

    public native void n1113123330(Object obj, int i2, long j2, Object obj2, Object obj3, Object obj4);

    public native Object n111313(Object obj, boolean z);

    public native void n1113130(Object obj, int i2, Object obj2);

    public native boolean n1113131(Object obj, int i2, Object obj2);

    public native void n11131310(Object obj, int i2, Object obj2, int i3);

    public native void n111313130(Object obj, boolean z, Object obj2, int i2, Object obj3);

    public native int n111313131(Object obj, int i2, Object obj2, int i3, Object obj3);

    public native void n11131313130(Object obj, boolean z, Object obj2, int i2, Object obj3, int i3, Object obj4);

    public native void n1113132221320(Object obj, boolean z, Object obj2, long j2, long j3, long j4, int i2, Object obj3, long j5);

    public native void n111313222132130(Object obj, boolean z, Object obj2, long j2, long j3, long j4, int i2, Object obj3, long j5, int i3, Object obj4);

    public native Object n11131323(Object obj, int i2, Object obj2, long j2);

    public native int n1113132311(Object obj, int i2, Object obj2, long j2, Object obj3, boolean z);

    public native Object n111313233(Object obj, int i2, Object obj2, long j2, Object obj3);

    public native void n11131323330(Object obj, int i2, Object obj2, long j2, Object obj3, Object obj4, Object obj5);

    public native Object n1113133(Object obj, int i2, Object obj2);

    public native void n11131330(Object obj, boolean z, Object obj2, Object obj3);

    public native int n11131331(Object obj, int i2, Object obj2, Object obj3);

    public native void n1113133230(Object obj, int i2, Object obj2, Object obj3, long j2, Object obj4);

    public native void n111313330(Object obj, int i2, Object obj2, Object obj3, Object obj4);

    public native void n1113133330(Object obj, int i2, Object obj2, Object obj3, Object obj4, Object obj5);

    public native void n1113133333333330(Object obj, int i2, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11);

    public native long n11132(Object obj);

    public native void n111320(Object obj, long j2);

    public native int n111321(Object obj, long j2);

    public native void n1113210(Object obj, long j2, int i2);

    public native void n11132110(Object obj, long j2, boolean z, boolean z2);

    public native void n111321130(Object obj, long j2, boolean z, boolean z2, Object obj2);

    public native void n11132130(Object obj, long j2, int i2, Object obj2);

    public native void n111321330(Object obj, long j2, int i2, Object obj2, Object obj3);

    public native long n111322(Object obj, long j2);

    public native void n1113220(Object obj, long j2, long j3);

    public native void n111322133330(Object obj, long j2, long j3, boolean z, Object obj2, Object obj3, Object obj4, Object obj5);

    public native Object n1113223(Object obj, long j2, long j3);

    public native void n11132230(Object obj, long j2, long j3, Object obj2);

    public native Object n111323(Object obj, long j2);

    public native void n1113230(Object obj, long j2, Object obj2);

    public native void n111323130(Object obj, long j2, Object obj2, int i2, Object obj3);

    public native Object n1113233(Object obj, long j2, Object obj2);

    public native void n11132330(Object obj, long j2, Object obj2, Object obj3);

    public native void n111323310(Object obj, long j2, Object obj2, Object obj3, boolean z);

    public native void n111323311130(Object obj, long j2, Object obj2, Object obj3, int i2, int i3, int i4, Object obj4);

    public native void n1113233230(Object obj, double d2, Object obj2, Object obj3, long j2, Object obj4);

    public native void n111323330(Object obj, double d2, Object obj2, Object obj3, Object obj4);

    public native void n1113233330(Object obj, long j2, Object obj2, Object obj3, Object obj4, Object obj5);

    public native Object n11133(Object obj);

    public native void n111330(Object obj, Object obj2);

    public native boolean n111331(Object obj, Object obj2);

    public native void n1113310(Object obj, Object obj2, int i2);

    public native boolean n1113311(Object obj, Object obj2, boolean z);

    public native void n11133110(Object obj, Object obj2, int i2, int i3);

    public native boolean n11133111(Object obj, Object obj2, float f2, float f3);

    public native void n111331110(Object obj, Object obj2, boolean z, boolean z2, boolean z3);

    public native int n111331111(Object obj, Object obj2, int i2, int i3, int i4);

    public native void n1113311111111311130(Object obj, Object obj2, int i2, int i3, float f2, float f3, int i4, int i5, float f4, int i6, Object obj3, boolean z, boolean z2, boolean z3, Object obj4);

    public native void n111331111111131113130(Object obj, Object obj2, int i2, int i3, float f2, float f3, int i4, int i5, float f4, int i6, Object obj3, boolean z, boolean z2, boolean z3, Object obj4, int i7, Object obj5);

    public native Object n11133111113(Object obj, Object obj2, int i2, int i3, int i4, int i5, int i6);

    public native void n1113311111330(Object obj, Object obj2, int i2, int i3, int i4, int i5, int i6, Object obj3, Object obj4);

    public native void n111331111133110(Object obj, Object obj2, int i2, int i3, int i4, int i5, int i6, Object obj3, Object obj4, int i7, int i8);

    public native void n111331111133111111110(Object obj, Object obj2, int i2, int i3, int i4, int i5, int i6, Object obj3, Object obj4, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14);

    public native void n11133111113330(Object obj, Object obj2, int i2, int i3, int i4, int i5, int i6, Object obj3, Object obj4, Object obj5);

    public native Object n111331113(Object obj, Object obj2, int i2, int i3, int i4);

    public native void n1113311230(Object obj, Object obj2, int i2, int i3, long j2, Object obj3);

    public native Object n11133113(Object obj, Object obj2, int i2, int i3);

    public native Object n111331133(Object obj, Object obj2, int i2, boolean z, Object obj3);

    public native Object n1113313(Object obj, Object obj2, boolean z);

    public native void n11133130(Object obj, Object obj2, boolean z, Object obj3);

    public native int n11133131(Object obj, Object obj2, int i2, Object obj3);

    public native void n1113313130(Object obj, Object obj2, int i2, Object obj3, int i3, Object obj4);

    public native Object n11133133(Object obj, Object obj2, int i2, Object obj3);

    public native Object n111331333(Object obj, Object obj2, int i2, Object obj3, Object obj4);

    public native long n111332(Object obj, Object obj2);

    public native void n1113320(Object obj, Object obj2, long j2);

    public native void n11133210(Object obj, Object obj2, long j2, int i2);

    public native void n111332110(Object obj, Object obj2, long j2, int i2, int i3);

    public native void n1113321110(Object obj, Object obj2, long j2, boolean z, boolean z2, int i2);

    public native void n11133220(Object obj, Object obj2, long j2, long j3);

    public native Object n11133223(Object obj, Object obj2, long j2, long j3);

    public native void n111332320(Object obj, Object obj2, long j2, Object obj3, long j3);

    public native Object n11133233(Object obj, Object obj2, long j2, Object obj3);

    public native void n111332330(Object obj, Object obj2, long j2, Object obj3, Object obj4);

    public native void n1113323311110(Object obj, Object obj2, long j2, Object obj3, Object obj4, boolean z, boolean z2, boolean z3, boolean z4);

    public native Object n1113323311133113333(Object obj, Object obj2, long j2, Object obj3, Object obj4, int i2, int i3, int i4, Object obj5, Object obj6, int i5, int i6, Object obj7, Object obj8, Object obj9);

    public native void n11133233230(Object obj, Object obj2, double d2, Object obj3, Object obj4, long j2, Object obj5);

    public native Object n111333(Object obj, Object obj2);

    public native void n1113330(Object obj, Object obj2, Object obj3);

    public native int n1113331(Object obj, Object obj2, Object obj3);

    public native void n11133310(Object obj, Object obj2, Object obj3, boolean z);

    public native void n111333110(Object obj, Object obj2, Object obj3, boolean z, boolean z2);

    public native Object n111333111113(Object obj, Object obj2, Object obj3, int i2, int i3, int i4, int i5, int i6);

    public native void n111333120(Object obj, Object obj2, Object obj3, int i2, long j2);

    public native void n111333123330(Object obj, Object obj2, Object obj3, int i2, long j2, Object obj4, Object obj5, Object obj6);

    public native Object n111333123333(Object obj, Object obj2, Object obj3, int i2, long j2, Object obj4, Object obj5, Object obj6);

    public native Object n11133313(Object obj, Object obj2, Object obj3, boolean z);

    public native void n111333130(Object obj, Object obj2, Object obj3, boolean z, Object obj4);

    public native void n1113331310(Object obj, Object obj2, Object obj3, int i2, Object obj4, boolean z);

    public native void n11133313110(Object obj, Object obj2, Object obj3, int i2, Object obj4, int i3, boolean z);

    public native void n11133313130(Object obj, Object obj2, Object obj3, int i2, Object obj4, int i3, Object obj5);

    public native void n1113331330(Object obj, Object obj2, Object obj3, int i2, Object obj4, Object obj5);

    public native void n111333133311110(Object obj, Object obj2, Object obj3, int i2, Object obj4, Object obj5, Object obj6, boolean z, boolean z2, boolean z3, boolean z4);

    public native void n111333133333333330(Object obj, Object obj2, Object obj3, int i2, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13);

    public native long n1113332(Object obj, Object obj2, Object obj3);

    public native void n11133320(Object obj, Object obj2, Object obj3, long j2);

    public native void n111333210(Object obj, Object obj2, Object obj3, long j2, int i2);

    public native void n11133321110(Object obj, Object obj2, Object obj3, long j2, boolean z, boolean z2, int i2);

    public native Object n11133323(Object obj, Object obj2, Object obj3, long j2);

    public native void n1113332330(Object obj, Object obj2, Object obj3, double d2, Object obj4, Object obj5);

    public native Object n1113333(Object obj, Object obj2, Object obj3);

    public native void n11133330(Object obj, Object obj2, Object obj3, Object obj4);

    public native int n11133331(Object obj, Object obj2, Object obj3, Object obj4);

    public native void n111333310(Object obj, Object obj2, Object obj3, Object obj4, boolean z);

    public native void n1113333110(Object obj, Object obj2, Object obj3, Object obj4, int i2, int i3);

    public native Object n111333311111113(Object obj, Object obj2, Object obj3, Object obj4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6);

    public native Object n111333311111233333(Object obj, Object obj2, Object obj3, Object obj4, int i2, int i3, int i4, int i5, int i6, long j2, Object obj5, Object obj6, Object obj7, Object obj8);

    public native Object n111333313(Object obj, Object obj2, Object obj3, Object obj4, boolean z);

    public native void n1113333130(Object obj, Object obj2, Object obj3, Object obj4, int i2, Object obj5);

    public native void n111333313331110(Object obj, Object obj2, Object obj3, Object obj4, int i2, Object obj5, Object obj6, Object obj7, int i3, int i4, int i5);

    public native void n1113333210(Object obj, Object obj2, Object obj3, Object obj4, long j2, int i2);

    public native void n1113333230(Object obj, Object obj2, Object obj3, Object obj4, long j2, Object obj5);

    public native Object n11133333(Object obj, Object obj2, Object obj3, Object obj4);

    public native void n111333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public native void n1113333310(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z);

    public native void n11133333110(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i2);

    public native void n111333331111130(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, int i3, int i4, int i5, int i6, Object obj6);

    public native void n111333331130(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z, int i2, Object obj6);

    public native void n11133333130(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i2, Object obj6);

    public native Object n111333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5);

    public native void n1113333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public native void n111333333130(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2, Object obj7);

    public native Object n1113333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6);

    public native void n11133333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public native void n111333333313333333333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i2, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19);

    public native Object n11133333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7);

    public native void n111333333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public native void n11133333333130(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i2, Object obj9);

    public native Object n111333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8);

    public native void n1113333333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public native Object n1113333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9);

    public native void n11133333333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public native Object n11133333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10);

    public native Object n111333333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11);

    public native Object n1113333333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12);

    public native void n11133333333333330(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13);

    public native Object n11133333333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13);

    public native Object n111333333333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14);

    public native Object n1113333333333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15);

    public native Object n11133333333333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16);

    public native Object n111333333333333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17);

    public native Object n1113333333333333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18);

    public native Object n11133333333333333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19);

    public native Object n111333333333333333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20);

    public native Object n1113333333333333333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21);

    public native Object n11133333333333333333333333(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22);

    public static String getSoPath1() {
        return f;
    }

    public static String getSoPath2() {
        return g;
    }

    public static String getDir() {
        return h;
    }

    public static Context getAppContext() {
        return d;
    }

    public static Context getOrigApplicationContext(Context context) {
        if (context == a) {
            return b;
        }
        return context;
    }

    private static Application a(Context context) {
        ClassLoader classLoader;
        Class<?> clsLoadClass;
        try {
            if (b == null && (classLoader = context.getClassLoader()) != null && (clsLoadClass = classLoader.loadClass(strEntryApplication)) != null) {
                b = (Application) clsLoadClass.newInstance();
            }
        } catch (Exception e2) {
        }
        return b;
    }

    public static void ChangeTopApplication() {
        try {
            interface7(b, a.getBaseContext());
        } catch (Exception e2) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // android.app.Application
    public final void onCreate() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        System.currentTimeMillis();
        super.onCreate();
        ChangeTopApplication();
        if (b != null) {
            b.onCreate();
        }
        interface21(b);
        ?? r5 = this;
        if (b != null) {
            r5 = b;
        }
        Context context = d;
        if (r5 != 0 && context != null && a.a(context)) {
            try {
                ?? declaredMethod = Class.forName(a.a("s\u007f}>zw>rx>Bu`\u007fbdcDy}u")).getDeclaredMethod(a.a("BuwycdubQsdyfydiSq||Rqs{c"), Application.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, new Object[]{r5});
            } catch (Exception e2) {
            }
        }
    }

    private String b(Context context) throws IOException {
        boolean z = Build.CPU_ABI.contains("64") || Build.CPU_ABI2.contains("64");
        String absolutePath = context.getFilesDir().getParentFile().getAbsolutePath();
        try {
            absolutePath = context.getFilesDir().getParentFile().getCanonicalPath();
        } catch (Exception e2) {
        }
        String str = absolutePath + a.a("?>zyqwe");
        e = a(str, false);
        i = !z ? e : a(str, true);
        f = str + File.separator + e;
        g = str + File.separator + i;
        h = str;
        return str;
    }

    @Override // android.content.ContextWrapper
    protected final void attachBaseContext(Context context) throws Throwable {
        System.currentTimeMillis();
        super.attachBaseContext(context);
        a.b();
        d = context;
        System.setProperty("RMUTGF_KEY", "rr|>y~d|>rq}re|qr>s\u007f}");
        if (a == null) {
            a = this;
        }
        if (b == null) {
            boolean zA = a.a();
            boolean z = Build.CPU_ABI.contains("64") || Build.CPU_ABI2.contains("64");
            if (zA && needX86Bridge) {
                a.a("X86Bridge", true);
            }
            if (loadFromLib) {
                if (zA && !needX86Bridge) {
                    a.a("jgbibc_x86", true);
                } else {
                    a.a("jgbibc", true);
                }
            } else {
                String strB = b(context);
                a.a(context, c + ((!zA || needX86Bridge) ? ".so" : "_x86.so"), strB, e);
                if (z) {
                    if (a.a(context, c + ((!zA || needX86Bridge) ? "_a64.so" : "_x64.so"), strB, i)) {
                        a.a(strB + File.separator + i, false);
                    } else {
                        a.a(strB + File.separator + e, false);
                    }
                } else {
                    a.a(strB + File.separator + e, false);
                }
            }
        }
        DtcLoader.init();
        interface5(a);
        if (b == null) {
            b = a(context);
            if (b != null) {
                try {
                    Method declaredMethod = Application.class.getDeclaredMethod("attach", Context.class);
                    if (declaredMethod != null) {
                        declaredMethod.setAccessible(true);
                        declaredMethod.invoke(b, context);
                    }
                    interface8(b, context);
                    return;
                } catch (Exception e2) {
                    throw new RuntimeException("Failed to call attachBaseContext.", e2);
                }
            }
            System.exit(1);
        }
    }

    private static String a(String str, boolean z) {
        String str2 = c;
        if (Build.VERSION.SDK_INT < 23) {
            str2 = str2 + str.hashCode();
        }
        return str2 + (z ? "_64.so" : ".so");
    }

    public static String getString2(int i2) {
        String strInterface14 = j.get(Integer.valueOf(i2));
        if (strInterface14 == null) {
            strInterface14 = interface14(i2);
            j.put(Integer.valueOf(i2), strInterface14);
        }
        if (strInterface14 != null && returnIntern) {
            return strInterface14.intern();
        }
        return strInterface14;
    }

    public static String getString2(String str) {
        try {
            return getString2(Integer.parseInt(str));
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static boolean isX86Arch() {
        return a.a();
    }

    public static void put(Object obj, String[] strArr) {
        try {
            String canonicalName = obj.getClass().getCanonicalName();
            Set<String> set = perm.get(canonicalName);
            if (set != null) {
                set.addAll(Arrays.asList(strArr));
            } else {
                Set<String> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                Collections.addAll(setNewSetFromMap, strArr);
                Set<String> setPut = perm.put(canonicalName, setNewSetFromMap);
                if (setPut != null) {
                    setPut.addAll(Arrays.asList(strArr));
                }
            }
        } catch (Exception e2) {
        }
    }
}
