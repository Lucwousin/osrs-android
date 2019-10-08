package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;

final class zzhx implements Runnable {
    zzhx(zzhm arg1, AtomicReference arg2) {
        this.zzaps = arg1;
        this.zzapr = arg2;
        super();
    }

    public final void run() {
        AtomicReference v0 = this.zzapr;
        __monitor_enter(v0);
        try {
            this.zzapr.set(this.zzaps.zzgk().zzba(this.zzaps.zzfz().zzah()));
            goto label_10;
        }
        catch(Throwable v1) {
            try {
                this.zzapr.notify();
                throw v1;
            label_10:
                this.zzapr.notify();
                __monitor_exit(v0);
                return;
            label_19:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_19;
            }
        }

        throw v1;
    }
}

