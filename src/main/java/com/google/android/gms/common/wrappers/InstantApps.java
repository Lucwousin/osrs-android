package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;

@KeepForSdk public class InstantApps {
    private static Context zzht;
    private static Boolean zzhu;

    public InstantApps() {
        super();
    }

    @KeepForSdk public static boolean isInstantApp(Context arg3) {
        boolean v3_1;
        Context v1;
        Class v0 = InstantApps.class;
        __monitor_enter(v0);
        try {
            v1 = arg3.getApplicationContext();
            if(InstantApps.zzht != null && InstantApps.zzhu != null && InstantApps.zzht == v1) {
                v3_1 = InstantApps.zzhu.booleanValue();
                goto label_11;
            }

            goto label_13;
        }
        catch(Throwable v3) {
            goto label_38;
        }

    label_11:
        __monitor_exit(v0);
        return v3_1;
    label_13:
        Boolean v2 = null;
        try {
            InstantApps.zzhu = v2;
            if(PlatformVersion.isAtLeastO()) {
                InstantApps.zzhu = Boolean.valueOf(v1.getPackageManager().isInstantApp());
                goto label_32;
            }

            try {
                arg3.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                InstantApps.zzhu = Boolean.valueOf(true);
                goto label_32;
            }
            catch(ClassNotFoundException ) {
                try {
                    InstantApps.zzhu = Boolean.valueOf(false);
                label_32:
                    InstantApps.zzht = v1;
                    v3_1 = InstantApps.zzhu.booleanValue();
                }
                catch(Throwable v3) {
                label_38:
                    __monitor_exit(v0);
                    throw v3;
                }
            }
        }
        catch(Throwable v3) {
            goto label_38;
        }

        __monitor_exit(v0);
        return v3_1;
    }
}

