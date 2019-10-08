package com.google.android.gms.auth;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;

public final class CookieUtil {
    private CookieUtil() {
        super();
    }

    public static String getCookieUrl(String arg2, Boolean arg3) {
        Preconditions.checkNotEmpty(arg2);
        String v3 = CookieUtil.zza(arg3) ? "https" : "http";
        StringBuilder v1 = new StringBuilder(String.valueOf(v3).length() + 3 + String.valueOf(arg2).length());
        v1.append(v3);
        v1.append("://");
        v1.append(arg2);
        return v1.toString();
    }

    public static String getCookieValue(String arg1, String arg2, String arg3, String arg4, Boolean arg5, Boolean arg6, Long arg7) {
        StringBuilder v0 = new StringBuilder(arg1);
        v0.append('=');
        if(!TextUtils.isEmpty(((CharSequence)arg2))) {
            v0.append(arg2);
        }

        if(CookieUtil.zza(arg5)) {
            v0.append(";HttpOnly");
        }

        if(CookieUtil.zza(arg6)) {
            v0.append(";Secure");
        }

        if(!TextUtils.isEmpty(((CharSequence)arg3))) {
            v0.append(";Domain=");
            v0.append(arg3);
        }

        if(!TextUtils.isEmpty(((CharSequence)arg4))) {
            v0.append(";Path=");
            v0.append(arg4);
        }

        if(arg7 != null && arg7.longValue() > 0) {
            v0.append(";Max-Age=");
            v0.append(arg7);
        }

        return v0.toString();
    }

    private static boolean zza(Boolean arg0) {
        if(arg0 != null && (arg0.booleanValue())) {
            return 1;
        }

        return 0;
    }
}

