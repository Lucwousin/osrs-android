package com.google.android.gms.common.internal;

import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk public final class GmsLogger {
    private static final int zzef = 15;
    private static final String zzeg;
    private final String zzeh;
    private final String zzei;

    static {
    }

    public GmsLogger(String arg2) {
        this(arg2, null);
    }

    public GmsLogger(String arg7, String arg8) {
        super();
        Preconditions.checkNotNull(arg7, "log tag cannot be null");
        int v3 = 23;
        boolean v0 = arg7.length() <= v3 ? true : false;
        Preconditions.checkArgument(v0, "tag \"%s\" is longer than the %d character maximum", new Object[]{arg7, Integer.valueOf(v3)});
        this.zzeh = arg7;
        if(arg8 != null) {
            if(arg8.length() <= 0) {
            }
            else {
                this.zzei = arg8;
                return;
            }
        }

        this.zzei = null;
    }

    @KeepForSdk public final boolean canLog(int arg2) {
        return Log.isLoggable(this.zzeh, arg2);
    }

    @KeepForSdk public final boolean canLogPii() {
        return 0;
    }

    @KeepForSdk public final void d(String arg2, String arg3) {
        if(this.canLog(3)) {
            Log.d(arg2, this.zzh(arg3));
        }
    }

    @KeepForSdk public final void d(String arg2, String arg3, Throwable arg4) {
        if(this.canLog(3)) {
            Log.d(arg2, this.zzh(arg3), arg4);
        }
    }

    @KeepForSdk public final void e(String arg2, String arg3) {
        if(this.canLog(6)) {
            Log.e(arg2, this.zzh(arg3));
        }
    }

    @KeepForSdk public final void e(String arg2, String arg3, Throwable arg4) {
        if(this.canLog(6)) {
            Log.e(arg2, this.zzh(arg3), arg4);
        }
    }

    @KeepForSdk public final void efmt(String arg2, String arg3, Object[] arg4) {
        if(this.canLog(6)) {
            Log.e(arg2, this.zza(arg3, arg4));
        }
    }

    @KeepForSdk public final void i(String arg2, String arg3) {
        if(this.canLog(4)) {
            Log.i(arg2, this.zzh(arg3));
        }
    }

    @KeepForSdk public final void i(String arg2, String arg3, Throwable arg4) {
        if(this.canLog(4)) {
            Log.i(arg2, this.zzh(arg3), arg4);
        }
    }

    @KeepForSdk public final void pii(String arg3, String arg4) {
        if(this.canLogPii()) {
            arg3 = String.valueOf(arg3);
            String v0 = String.valueOf(" PII_LOG");
            arg3 = v0.length() != 0 ? arg3.concat(v0) : new String(arg3);
            Log.i(arg3, this.zzh(arg4));
        }
    }

    @KeepForSdk public final void pii(String arg3, String arg4, Throwable arg5) {
        if(this.canLogPii()) {
            arg3 = String.valueOf(arg3);
            String v0 = String.valueOf(" PII_LOG");
            arg3 = v0.length() != 0 ? arg3.concat(v0) : new String(arg3);
            Log.i(arg3, this.zzh(arg4), arg5);
        }
    }

    @KeepForSdk public final void v(String arg2, String arg3) {
        if(this.canLog(2)) {
            Log.v(arg2, this.zzh(arg3));
        }
    }

    @KeepForSdk public final void v(String arg2, String arg3, Throwable arg4) {
        if(this.canLog(2)) {
            Log.v(arg2, this.zzh(arg3), arg4);
        }
    }

    @KeepForSdk public final void w(String arg2, String arg3) {
        if(this.canLog(5)) {
            Log.w(arg2, this.zzh(arg3));
        }
    }

    @KeepForSdk public final void w(String arg2, String arg3, Throwable arg4) {
        if(this.canLog(5)) {
            Log.w(arg2, this.zzh(arg3), arg4);
        }
    }

    @KeepForSdk public final void wfmt(String arg1, String arg2, Object[] arg3) {
        if(this.canLog(5)) {
            Log.w(this.zzeh, this.zza(arg2, arg3));
        }
    }

    @KeepForSdk public final void wtf(String arg2, String arg3, Throwable arg4) {
        if(this.canLog(7)) {
            Log.e(arg2, this.zzh(arg3), arg4);
            Log.wtf(arg2, this.zzh(arg3), arg4);
        }
    }

    private final String zza(String arg1, Object[] arg2) {
        arg1 = String.format(arg1, arg2);
        if(this.zzei == null) {
            return arg1;
        }

        return this.zzei.concat(arg1);
    }

    private final String zzh(String arg2) {
        if(this.zzei == null) {
            return arg2;
        }

        return this.zzei.concat(arg2);
    }
}

