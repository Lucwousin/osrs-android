package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk public final class DeviceProperties {
    private static Boolean zzgl;
    private static Boolean zzgm;
    private static Boolean zzgn;
    private static Boolean zzgo;
    private static Boolean zzgp;
    private static Boolean zzgq;
    private static Boolean zzgr;
    private static Boolean zzgs;

    private DeviceProperties() {
        super();
    }

    @KeepForSdk public static boolean isAuto(Context arg1) {
        if(DeviceProperties.zzgr == null) {
            boolean v1 = !PlatformVersion.isAtLeastO() || !arg1.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? false : true;
            DeviceProperties.zzgr = Boolean.valueOf(v1);
        }

        return DeviceProperties.zzgr.booleanValue();
    }

    @KeepForSdk public static boolean isLatchsky(Context arg1) {
        if(DeviceProperties.zzgp == null) {
            PackageManager v1 = arg1.getPackageManager();
            boolean v1_1 = !v1.hasSystemFeature("com.google.android.feature.services_updater") || !v1.hasSystemFeature("cn.google.services") ? false : true;
            DeviceProperties.zzgp = Boolean.valueOf(v1_1);
        }

        return DeviceProperties.zzgp.booleanValue();
    }

    @TargetApi(value=21) @KeepForSdk public static boolean isSidewinder(Context arg1) {
        if(DeviceProperties.zzgo == null) {
            boolean v1 = !PlatformVersion.isAtLeastLollipop() || !arg1.getPackageManager().hasSystemFeature("cn.google") ? false : true;
            DeviceProperties.zzgo = Boolean.valueOf(v1);
        }

        return DeviceProperties.zzgo.booleanValue();
    }

    @KeepForSdk public static boolean isTablet(Resources arg4) {
        boolean v0 = false;
        if(arg4 == null) {
            return 0;
        }

        if(DeviceProperties.zzgl == null) {
            int v2 = 3;
            int v1 = (arg4.getConfiguration().screenLayout & 15) > v2 ? 1 : 0;
            if(v1 == 0) {
                if(DeviceProperties.zzgm == null) {
                    Configuration v4 = arg4.getConfiguration();
                    boolean v4_1 = (v4.screenLayout & 15) > v2 || v4.smallestScreenWidthDp < 600 ? false : true;
                    DeviceProperties.zzgm = Boolean.valueOf(v4_1);
                }

                if(!DeviceProperties.zzgm.booleanValue()) {
                    goto label_33;
                }

                goto label_32;
            }
            else {
            label_32:
                v0 = true;
            }

        label_33:
            DeviceProperties.zzgl = Boolean.valueOf(v0);
        }

        return DeviceProperties.zzgl.booleanValue();
    }

    @KeepForSdk public static boolean isTv(Context arg1) {
        if(DeviceProperties.zzgs == null) {
            PackageManager v1 = arg1.getPackageManager();
            boolean v1_1 = (v1.hasSystemFeature("com.google.android.tv")) || (v1.hasSystemFeature("android.hardware.type.television")) || (v1.hasSystemFeature("android.software.leanback")) ? true : false;
            DeviceProperties.zzgs = Boolean.valueOf(v1_1);
        }

        return DeviceProperties.zzgs.booleanValue();
    }

    @KeepForSdk public static boolean isUserBuild() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(value=20) @KeepForSdk public static boolean isWearable(Context arg1) {
        if(DeviceProperties.zzgn == null) {
            boolean v1 = !PlatformVersion.isAtLeastKitKatWatch() || !arg1.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? false : true;
            DeviceProperties.zzgn = Boolean.valueOf(v1);
        }

        return DeviceProperties.zzgn.booleanValue();
    }

    @TargetApi(value=26) @KeepForSdk public static boolean isWearableWithoutPlayStore(Context arg1) {
        if(DeviceProperties.isWearable(arg1)) {
            if(PlatformVersion.isAtLeastN()) {
                if(!DeviceProperties.isSidewinder(arg1)) {
                }
                else if(!PlatformVersion.isAtLeastO()) {
                    return 1;
                }

                return 0;
            }

            return 1;
        }

        return 0;
    }

    public static boolean zzf(Context arg2) {
        if(DeviceProperties.zzgq == null) {
            boolean v2 = (arg2.getPackageManager().hasSystemFeature("android.hardware.type.iot")) || (arg2.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? true : false;
            DeviceProperties.zzgq = Boolean.valueOf(v2);
        }

        return DeviceProperties.zzgq.booleanValue();
    }
}

