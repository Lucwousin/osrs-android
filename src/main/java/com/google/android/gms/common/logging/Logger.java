package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

@KeepForSdk public class Logger {
    private final String mTag;
    private final String zzei;
    private final GmsLogger zzew;
    private final int zzex;

    @KeepForSdk public Logger(String arg7, String[] arg8) {
        String v8;
        if(arg8.length == 0) {
            v8 = "";
        }
        else {
            StringBuilder v0 = new StringBuilder();
            v0.append('[');
            int v1 = arg8.length;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                String v3 = arg8[v2];
                if(v0.length() > 1) {
                    v0.append(",");
                }

                v0.append(v3);
            }

            v0.append(']');
            v0.append(' ');
            v8 = v0.toString();
        }

        this(arg7, v8);
    }

    private Logger(String arg1, String arg2) {
        super();
        this.zzei = arg2;
        this.mTag = arg1;
        this.zzew = new GmsLogger(arg1);
        int v1;
        for(v1 = 2; 7 >= v1; ++v1) {
            if(Log.isLoggable(this.mTag, v1)) {
                break;
            }
        }

        this.zzex = v1;
    }

    @KeepForSdk public void d(String arg2, @Nullable Object[] arg3) {
        if(this.isLoggable(3)) {
            Log.d(this.mTag, this.format(arg2, arg3));
        }
    }

    @KeepForSdk public void e(String arg2, @Nullable Object[] arg3) {
        Log.e(this.mTag, this.format(arg2, arg3));
    }

    @KeepForSdk public void e(String arg2, Throwable arg3, @Nullable Object[] arg4) {
        Log.e(this.mTag, this.format(arg2, arg4), arg3);
    }

    private final String format(String arg2, @Nullable Object[] arg3) {
        if(arg3 != null && arg3.length > 0) {
            arg2 = String.format(Locale.US, arg2, arg3);
        }

        return this.zzei.concat(arg2);
    }

    @KeepForSdk public void i(String arg2, @Nullable Object[] arg3) {
        Log.i(this.mTag, this.format(arg2, arg3));
    }

    @KeepForSdk public boolean isLoggable(int arg2) {
        if(this.zzex <= arg2) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public void v(String arg2, @Nullable Object[] arg3) {
        if(this.isLoggable(2)) {
            Log.v(this.mTag, this.format(arg2, arg3));
        }
    }

    @KeepForSdk public void w(String arg2, @Nullable Object[] arg3) {
        Log.w(this.mTag, this.format(arg2, arg3));
    }

    @KeepForSdk public void wtf(String arg2, Throwable arg3, @Nullable Object[] arg4) {
        Log.wtf(this.mTag, this.format(arg2, arg4), arg3);
    }

    @KeepForSdk public void wtf(Throwable arg2) {
        Log.wtf(this.mTag, arg2);
    }
}

