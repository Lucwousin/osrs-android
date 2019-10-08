package com.google.android.gms.common.util;

import android.os.Looper;

public final class zzc {
    public static boolean isMainThread() {
        if(Looper.getMainLooper() == Looper.myLooper()) {
            return 1;
        }

        return 0;
    }
}

