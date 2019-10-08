package com.google.android.gms.common.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

@KeepForSdk @VisibleForTesting public class Strings {
    private static final Pattern zzhf;

    static {
        Strings.zzhf = Pattern.compile("\\$\\{(.*?)\\}");
    }

    private Strings() {
        super();
    }

    @Nullable @KeepForSdk public static String emptyToNull(@Nullable String arg1) {
        if(TextUtils.isEmpty(((CharSequence)arg1))) {
            arg1 = null;
        }

        return arg1;
    }

    @KeepForSdk public static boolean isEmptyOrWhitespace(@Nullable String arg0) {
        if(arg0 != null) {
            if(arg0.trim().isEmpty()) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }
}

