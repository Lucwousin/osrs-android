package com.google.android.gms.internal.measurement;

final class zzjq extends zzep {
    zzjq(zzjp arg1, zzhk arg2, zzjt arg3) {
        this.zzarq = arg1;
        this.zzark = arg3;
        super(arg2);
    }

    public final void run() {
        this.zzarq.cancel();
        this.zzarq.zzgi().zzjc().log("Starting upload from DelayedRunnable");
        this.zzark.zzle();
    }
}

