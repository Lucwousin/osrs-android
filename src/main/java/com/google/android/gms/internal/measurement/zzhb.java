package com.google.android.gms.internal.measurement;

final class zzhb implements Runnable {
    zzhb(zzgp arg1, zzex arg2, String arg3) {
        this.zzape = arg1;
        this.zzaph = arg2;
        this.zzapg = arg3;
        super();
    }

    public final void run() {
        zzgp.zza(this.zzape).zzlj();
        zzgp.zza(this.zzape).zzc(this.zzaph, this.zzapg);
    }
}

