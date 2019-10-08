package androidx.core.os;

import android.os.Build$VERSION;

public class BuildCompat {
    private BuildCompat() {
        super();
    }

    @Deprecated public static boolean isAtLeastN() {
        boolean v0 = Build$VERSION.SDK_INT >= 24 ? true : false;
        return v0;
    }

    @Deprecated public static boolean isAtLeastNMR1() {
        boolean v0 = Build$VERSION.SDK_INT >= 25 ? true : false;
        return v0;
    }

    @Deprecated public static boolean isAtLeastO() {
        boolean v0 = Build$VERSION.SDK_INT >= 26 ? true : false;
        return v0;
    }

    @Deprecated public static boolean isAtLeastOMR1() {
        boolean v0 = Build$VERSION.SDK_INT >= 27 ? true : false;
        return v0;
    }

    @Deprecated public static boolean isAtLeastP() {
        boolean v0 = Build$VERSION.SDK_INT >= 28 ? true : false;
        return v0;
    }

    public static boolean isAtLeastQ() {
        boolean v1 = true;
        if(Build$VERSION.CODENAME.length() != 1 || Build$VERSION.CODENAME.charAt(0) < 81 || Build$VERSION.CODENAME.charAt(0) > 90) {
            v1 = false;
        }
        else {
        }

        return v1;
    }
}

