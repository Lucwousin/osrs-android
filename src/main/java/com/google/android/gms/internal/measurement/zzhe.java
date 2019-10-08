package com.google.android.gms.internal.measurement;

final class zzhe implements Runnable {
    zzhe(zzgp arg1, zzka arg2, zzeb arg3) {
        this.zzape = arg1;
        this.zzapi = arg2;
        this.zzapd = arg3;
        super();
    }

    public final void run() {
        zzgp.zza(this.zzape).zzlj();
        zzgp.zza(this.zzape).zzb(this.zzapi, this.zzapd);
    }
}

