package com.google.android.gms.common.util;

import android.os.SystemClock;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk public class DefaultClock implements Clock {
    private static final DefaultClock zzgk;

    static {
        DefaultClock.zzgk = new DefaultClock();
    }

    private DefaultClock() {
        super();
    }

    public long currentThreadTimeMillis() {
        return SystemClock.currentThreadTimeMillis();
    }

    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @KeepForSdk public static Clock getInstance() {
        return DefaultClock.zzgk;
    }

    public long nanoTime() {
        return System.nanoTime();
    }
}

