package com.google.android.gms.common.util;

import android.os.Build$VERSION;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk @VisibleForTesting public final class PlatformVersion {
    private PlatformVersion() {
        super();
    }

    @KeepForSdk public static boolean isAtLeastHoneycomb() {
        return 1;
    }

    @KeepForSdk public static boolean isAtLeastHoneycombMR1() {
        return 1;
    }

    @KeepForSdk public static boolean isAtLeastIceCreamSandwich() {
        return 1;
    }

    @KeepForSdk public static boolean isAtLeastIceCreamSandwichMR1() {
        if(Build$VERSION.SDK_INT >= 15) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean isAtLeastJellyBean() {
        if(Build$VERSION.SDK_INT >= 16) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean isAtLeastJellyBeanMR1() {
        if(Build$VERSION.SDK_INT >= 17) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean isAtLeastJellyBeanMR2() {
        if(Build$VERSION.SDK_INT >= 18) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean isAtLeastKitKat() {
        if(Build$VERSION.SDK_INT >= 19) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean isAtLeastKitKatWatch() {
        if(Build$VERSION.SDK_INT >= 20) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean isAtLeastLollipop() {
        if(Build$VERSION.SDK_INT >= 21) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean isAtLeastLollipopMR1() {
        if(Build$VERSION.SDK_INT >= 22) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean isAtLeastM() {
        if(Build$VERSION.SDK_INT >= 23) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean isAtLeastN() {
        if(Build$VERSION.SDK_INT >= 24) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean isAtLeastO() {
        if(Build$VERSION.SDK_INT >= 26) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean isAtLeastP() {
        if(Build$VERSION.SDK_INT >= 28) {
            return 1;
        }

        return 0;
    }
}

