package com.android.installreferrer.commons;

import android.util.Log;

public final class InstallReferrerCommons {
    public InstallReferrerCommons() {
        super();
    }

    public static void logVerbose(String arg1, String arg2) {
        if(Log.isLoggable(arg1, 2)) {
            Log.v(arg1, arg2);
        }
    }

    public static void logWarn(String arg1, String arg2) {
        if(Log.isLoggable(arg1, 5)) {
            Log.w(arg1, arg2);
        }
    }
}

