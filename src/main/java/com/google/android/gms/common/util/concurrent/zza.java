package com.google.android.gms.common.util.concurrent;

import android.os.Process;

final class zza implements Runnable {
    private final int priority;
    private final Runnable zzhs;

    public zza(Runnable arg1, int arg2) {
        super();
        this.zzhs = arg1;
        this.priority = arg2;
    }

    public final void run() {
        Process.setThreadPriority(this.priority);
        this.zzhs.run();
    }
}

