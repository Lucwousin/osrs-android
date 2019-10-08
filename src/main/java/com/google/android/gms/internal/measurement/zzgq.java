package com.google.android.gms.internal.measurement;

final class zzgq implements Runnable {
    zzgq(zzgp arg1, zzeb arg2) {
        this.zzape = arg1;
        this.zzapd = arg2;
        super();
    }

    public final void run() {
        zzgp.zza(this.zzape).zzlj();
        zzgp.zza(this.zzape).zze(this.zzapd);
    }
}

