package com.google.android.gms.internal.measurement;

final class zzge implements Runnable {
    zzge(zzgd arg1, zzgn arg2, zzfi arg3) {
        this.zzana = arg2;
        this.zzanb = arg3;
        super();
    }

    public final void run() {
        if(this.zzana.zzjz() == null) {
            this.zzanb.zziv().log("Install Referrer Reporter is null");
            return;
        }

        this.zzana.zzjz().zzjr();
    }
}

