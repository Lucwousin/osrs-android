package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk @VisibleForTesting public class NumberUtils {
    private NumberUtils() {
        super();
    }

    @KeepForSdk public static long parseHexLong(String arg5) {
        int v1 = 16;
        if(arg5.length() <= v1) {
            if(arg5.length() == v1) {
                return Long.parseLong(arg5.substring(0, 8), v1) << 0x20 | Long.parseLong(arg5.substring(8), v1);
            }

            return Long.parseLong(arg5, v1);
        }

        StringBuilder v2 = new StringBuilder(String.valueOf(arg5).length() + 37);
        v2.append("Invalid input: ");
        v2.append(arg5);
        v2.append(" exceeds 16 characters");
        throw new NumberFormatException(v2.toString());
    }
}

