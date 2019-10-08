package com.google.android.gms.internal.measurement;

final class zzgt implements Runnable {
    zzgt(zzgp arg1, zzef arg2) {
        this.zzape = arg1;
        this.zzapf = arg2;
        super();
    }

    public final void run() {
        zzgp.zza(this.zzape).zzlj();
        zzgp.zza(this.zzape).zzf(this.zzapf);
    }
}

