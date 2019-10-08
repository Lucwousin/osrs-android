package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;

final class zzhz implements Runnable {
    zzhz(zzhm arg1, AtomicReference arg2) {
        this.zzaps = arg1;
        this.zzapr = arg2;
        super();
    }

    public final void run() {
        AtomicReference v0 = this.zzapr;
        __monitor_enter(v0);
        try {
            this.zzapr.set(Integer.valueOf(this.zzaps.zzgk().zzb(this.zzaps.zzfz().zzah(), zzez.zzajo)));
            goto label_12;
        }
        catch(Throwable v1) {
            try {
                this.zzapr.notify();
                throw v1;
            label_12:
                this.zzapr.notify();
                __monitor_exit(v0);
                return;
            label_21:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_21;
            }
        }

        throw v1;
    }
}

