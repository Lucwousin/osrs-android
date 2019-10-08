package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences$Editor;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.File;

@KeepForSdk public class SharedPreferencesUtils {
    private SharedPreferencesUtils() {
        super();
    }

    @KeepForSdk @Deprecated public static void publishWorldReadableSharedPreferences(Context arg3, SharedPreferences$Editor arg4, String arg5) {
        File v0 = new File(arg3.getApplicationInfo().dataDir, "shared_prefs");
        File v3 = v0.getParentFile();
        if(v3 != null) {
            v3.setExecutable(true, false);
        }

        v0.setExecutable(true, false);
        arg4.commit();
        new File(v0, String.valueOf(arg5).concat(".xml")).setReadable(true, false);
    }
}

