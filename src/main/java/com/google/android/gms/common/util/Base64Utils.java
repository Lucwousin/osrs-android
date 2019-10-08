package com.google.android.gms.common.util;

import android.util.Base64;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk public final class Base64Utils {
    public Base64Utils() {
        super();
    }

    @KeepForSdk public static byte[] decode(String arg1) {
        if(arg1 == null) {
            return null;
        }

        return Base64.decode(arg1, 0);
    }

    @KeepForSdk public static byte[] decodeUrlSafe(String arg1) {
        if(arg1 == null) {
            return null;
        }

        return Base64.decode(arg1, 10);
    }

    @KeepForSdk public static byte[] decodeUrlSafeNoPadding(String arg1) {
        if(arg1 == null) {
            return null;
        }

        return Base64.decode(arg1, 11);
    }

    @KeepForSdk public static String encode(byte[] arg1) {
        if(arg1 == null) {
            return null;
        }

        return Base64.encodeToString(arg1, 0);
    }

    @KeepForSdk public static String encodeUrlSafe(byte[] arg1) {
        if(arg1 == null) {
            return null;
        }

        return Base64.encodeToString(arg1, 10);
    }

    @KeepForSdk public static String encodeUrlSafeNoPadding(byte[] arg1) {
        if(arg1 == null) {
            return null;
        }

        return Base64.encodeToString(arg1, 11);
    }
}

