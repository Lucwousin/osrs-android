package com.google.android.gms.internal.measurement;

import android.app.job.JobParameters;

final class zzjg implements Runnable {
    private final JobParameters zzabr;
    private final zzje zzarg;
    private final zzfi zzarj;

    zzjg(zzje arg1, zzfi arg2, JobParameters arg3) {
        super();
        this.zzarg = arg1;
        this.zzarj = arg2;
        this.zzabr = arg3;
    }

    public final void run() {
        this.zzarg.zza(this.zzarj, this.zzabr);
    }
}

