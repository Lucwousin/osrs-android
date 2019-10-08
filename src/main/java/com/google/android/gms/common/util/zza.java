package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

public final class zza {
    private static final IntentFilter filter;
    private static long zzgt;
    private static float zzgu;

    static {
        zza.filter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        zza.zzgu = NaNf;
    }

    @TargetApi(value=20) public static int zzg(Context arg5) {
        int v0 = -1;
        if(arg5 != null) {
            if(arg5.getApplicationContext() == null) {
            }
            else {
                Intent v1 = arg5.getApplicationContext().registerReceiver(null, zza.filter);
                int v2 = 0;
                int v1_1 = v1 == null ? 0 : v1.getIntExtra("plugged", 0);
                v1_1 = (v1_1 & 7) != 0 ? 1 : 0;
                Object v5 = arg5.getSystemService("power");
                if(v5 == null) {
                    return v0;
                }

                boolean v5_1 = PlatformVersion.isAtLeastKitKatWatch() ? ((PowerManager)v5).isInteractive() : ((PowerManager)v5).isScreenOn();
                if(v5_1) {
                    v2 = 1;
                }

                return v2 << 1 | v1_1;
            }
        }

        return v0;
    }

    public static float zzh(Context arg6) {
        float v6_1;
        Class v0 = zza.class;
        __monitor_enter(v0);
        try {
            if(SystemClock.elapsedRealtime() - zza.zzgt < 60000 && !Float.isNaN(zza.zzgu)) {
                v6_1 = zza.zzgu;
                goto label_12;
            }

            goto label_14;
        }
        catch(Throwable v6) {
            goto label_34;
        }

    label_12:
        __monitor_exit(v0);
        return v6_1;
        try {
        label_14:
            Intent v6_2 = arg6.getApplicationContext().registerReceiver(null, zza.filter);
            if(v6_2 != null) {
                zza.zzgu = (((float)v6_2.getIntExtra("level", -1))) / (((float)v6_2.getIntExtra("scale", -1)));
            }

            zza.zzgt = SystemClock.elapsedRealtime();
            v6_1 = zza.zzgu;
        }
        catch(Throwable v6) {
        label_34:
            __monitor_exit(v0);
            throw v6;
        }

        __monitor_exit(v0);
        return v6_1;
    }
}

