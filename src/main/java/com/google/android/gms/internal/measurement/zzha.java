package com.google.android.gms.internal.measurement;

final class zzha implements Runnable {
    zzha(zzgp arg1, zzex arg2, zzeb arg3) {
        this.zzape = arg1;
        this.zzaph = arg2;
        this.zzapd = arg3;
        super();
    }

    public final void run() {
        zzgp.zza(this.zzape).zzlj();
        zzgp.zza(this.zzape).zzb(this.zzaph, this.zzapd);
    }
}

