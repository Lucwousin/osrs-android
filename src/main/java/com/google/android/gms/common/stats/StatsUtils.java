package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager$WakeLock;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk public class StatsUtils {
    public StatsUtils() {
        super();
    }

    @KeepForSdk public static String getEventKey(Context arg2, Intent arg3) {
        return String.valueOf((((long)System.identityHashCode(arg3))) | (((long)System.identityHashCode(arg2))) << 0x20);
    }

    @KeepForSdk public static String getEventKey(PowerManager$WakeLock arg4, String arg5) {
        String v4 = String.valueOf(String.valueOf((((long)Process.myPid())) << 0x20 | (((long)System.identityHashCode(arg4)))));
        if(TextUtils.isEmpty(((CharSequence)arg5))) {
            arg5 = "";
        }

        arg5 = String.valueOf(arg5);
        if(arg5.length() != 0) {
            return v4.concat(arg5);
        }

        return new String(v4);
    }
}

