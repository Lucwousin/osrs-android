package com.google.android.gms.internal.measurement;

final class zzgo implements Runnable {
    zzgo(zzgn arg1, zzhl arg2) {
        this.zzapa = arg1;
        this.zzaoz = arg2;
        super();
    }

    public final void run() {
        zzgn.zza(this.zzapa, this.zzaoz);
        this.zzapa.start();
    }
}

