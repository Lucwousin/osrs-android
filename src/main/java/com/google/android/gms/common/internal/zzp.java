package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.concurrent.GuardedBy;

public final class zzp {
    private static Object sLock;
    @GuardedBy(value="sLock") private static boolean zzeo;
    private static String zzep;
    private static int zzeq;

    static {
        zzp.sLock = new Object();
    }

    public static String zzc(Context arg0) {
        zzp.zze(arg0);
        return zzp.zzep;
    }

    public static int zzd(Context arg0) {
        zzp.zze(arg0);
        return zzp.zzeq;
    }

    private static void zze(Context arg3) {
        Bundle v3_3;
        Object v0 = zzp.sLock;
        __monitor_enter(v0);
        try {
            if(zzp.zzeo) {
                __monitor_exit(v0);
                return;
            }

            zzp.zzeo = true;
            String v1 = arg3.getPackageName();
            PackageManagerWrapper v3_1 = Wrappers.packageManager(arg3);
            int v2 = 0x80;
            try {
                v3_3 = v3_1.getApplicationInfo(v1, v2).metaData;
                if(v3_3 != null) {
                    goto label_16;
                }
            }
            catch(PackageManager$NameNotFoundException v3_2) {
                goto label_24;
            }

            __monitor_exit(v0);
            return;
            try {
            label_16:
                zzp.zzep = v3_3.getString("com.google.app.id");
                zzp.zzeq = v3_3.getInt("com.google.android.gms.version");
                goto label_27;
            }
            catch(PackageManager$NameNotFoundException v3_2) {
                try {
                label_24:
                    Log.wtf("MetadataValueReader", "This should never happen.", ((Throwable)v3_2));
                label_27:
                    __monitor_exit(v0);
                    return;
                label_30:
                    __monitor_exit(v0);
                }
                catch(Throwable v3) {
                    goto label_30;
                }
            }
        }
        catch(Throwable v3) {
            goto label_30;
        }

        throw v3;
    }
}

