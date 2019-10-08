package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzgk implements Thread$UncaughtExceptionHandler {
    private final String zzanw;

    public zzgk(zzgi arg1, String arg2) {
        this.zzanx = arg1;
        super();
        Preconditions.checkNotNull(arg2);
        this.zzanw = arg2;
    }

    public final void uncaughtException(Thread arg2, Throwable arg3) {
        __monitor_enter(this);
        try {
            this.zzanx.zzgi().zziv().zzg(this.zzanw, arg3);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }
}

