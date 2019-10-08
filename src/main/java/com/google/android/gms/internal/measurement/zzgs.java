package com.google.android.gms.internal.measurement;

final class zzgs implements Runnable {
    zzgs(zzgp arg1, zzef arg2, zzeb arg3) {
        this.zzape = arg1;
        this.zzapf = arg2;
        this.zzapd = arg3;
        super();
    }

    public final void run() {
        zzgp.zza(this.zzape).zzlj();
        zzgp.zza(this.zzape).zzb(this.zzapf, this.zzapd);
    }
}

