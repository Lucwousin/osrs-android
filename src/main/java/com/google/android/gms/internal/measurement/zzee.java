package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Looper;

public final class zzee {
    private final boolean zzagd;

    zzee(Context arg1) {
        super();
        this.zzagd = false;
    }

    public static boolean isMainThread() {
        if(Looper.myLooper() == Looper.getMainLooper()) {
            return 1;
        }

        return 0;
    }
}

