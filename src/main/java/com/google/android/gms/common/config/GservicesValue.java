package com.google.android.gms.common.config;

import android.content.Context;
import android.os.Binder;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashSet;
import javax.annotation.concurrent.GuardedBy;

@KeepForSdk public abstract class GservicesValue {
    interface zza {
        Long getLong(String arg1, Long arg2);

        String getString(String arg1, String arg2);

        Boolean zza(String arg1, Boolean arg2);

        Float zza(String arg1, Float arg2);

        Integer zza(String arg1, Integer arg2);
    }

    protected final String mKey;
    private static final Object sLock;
    private static zza zzbl;
    private static int zzbm;
    private static Context zzbn;
    @GuardedBy(value="sLock") private static HashSet zzbo;
    protected final Object zzbp;
    private Object zzbq;

    static {
        GservicesValue.sLock = new Object();
        GservicesValue.zzbl = null;
        GservicesValue.zzbm = 0;
    }

    protected GservicesValue(String arg2, Object arg3) {
        super();
        this.zzbq = null;
        this.mKey = arg2;
        this.zzbp = arg3;
    }

    @KeepForSdk public final Object get() {
        Object v3_1;
        long v1_3;
        if(this.zzbq != null) {
            return this.zzbq;
        }

        StrictMode$ThreadPolicy v0 = StrictMode.allowThreadDiskReads();
        Object v1 = GservicesValue.sLock;
        __monitor_enter(v1);
        try {
            __monitor_exit(v1);
        }
        catch(Throwable v0_1) {
            try {
            label_35:
                __monitor_exit(v1);
            }
            catch(Throwable v0_1) {
                goto label_35;
            }

            throw v0_1;
        }

        Object v2 = GservicesValue.sLock;
        __monitor_enter(v2);
        HashSet v1_1 = null;
        try {
            GservicesValue.zzbo = v1_1;
            GservicesValue.zzbn = ((Context)v1_1);
            __monitor_exit(v2);
        }
        catch(Throwable v0_1) {
            try {
            label_32:
                __monitor_exit(v2);
            }
            catch(Throwable v0_1) {
                goto label_32;
            }

            throw v0_1;
        }

        try {
            v1 = this.zzd(this.mKey);
        }
        catch(Throwable v1_2) {
        label_29:
            StrictMode.setThreadPolicy(v0);
            throw v1_2;
        }
        catch(SecurityException ) {
            try {
                v1_3 = Binder.clearCallingIdentity();
            }
            catch(Throwable v1_2) {
                goto label_29;
            }

            try {
                v3_1 = this.zzd(this.mKey);
                goto label_23;
            }
            catch(Throwable v3) {
                try {
                    Binder.restoreCallingIdentity(v1_3);
                    throw v3;
                label_23:
                    Binder.restoreCallingIdentity(v1_3);
                }
                catch(Throwable v1_2) {
                    goto label_29;
                }
            }

            StrictMode.setThreadPolicy(v0);
            return v3_1;
        }

        StrictMode.setThreadPolicy(v0);
        return v1;
    }

    @KeepForSdk @Deprecated public final Object getBinderSafe() {
        return this.get();
    }

    @KeepForSdk public static boolean isInitialized() {
        Object v0 = GservicesValue.sLock;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return 0;
        label_6:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_6;
        }

        throw v1;
    }

    @KeepForSdk @VisibleForTesting public void override(Object arg3) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.zzbq = arg3;
        arg3 = GservicesValue.sLock;
        __monitor_enter(arg3);
        try {
            GservicesValue.zzi();
            __monitor_exit(arg3);
            return;
        label_10:
            __monitor_exit(arg3);
        }
        catch(Throwable v0) {
            goto label_10;
        }

        throw v0;
    }

    @KeepForSdk @VisibleForTesting public void resetOverride() {
        this.zzbq = null;
    }

    @KeepForSdk public static GservicesValue value(String arg1, Float arg2) {
        return new zzd(arg1, arg2);
    }

    @KeepForSdk public static GservicesValue value(String arg1, Integer arg2) {
        return new zzc(arg1, arg2);
    }

    @KeepForSdk public static GservicesValue value(String arg1, Long arg2) {
        return new zzb(arg1, arg2);
    }

    @KeepForSdk public static GservicesValue value(String arg1, String arg2) {
        return new zze(arg1, arg2);
    }

    @KeepForSdk public static GservicesValue value(String arg1, boolean arg2) {
        return new com.google.android.gms.common.config.zza(arg1, Boolean.valueOf(arg2));
    }

    protected abstract Object zzd(String arg1);

    private static boolean zzi() {
        Object v0 = GservicesValue.sLock;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return 0;
        label_6:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_6;
        }

        throw v1;
    }
}

