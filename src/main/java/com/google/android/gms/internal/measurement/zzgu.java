package com.google.android.gms.internal.measurement;

final class zzgu implements Runnable {
    zzgu(zzgp arg1, zzef arg2) {
        this.zzape = arg1;
        this.zzapf = arg2;
        super();
    }

    public final void run() {
        zzgp.zza(this.zzape).zzlj();
        zzgp.zza(this.zzape).zze(this.zzapf);
    }
}

