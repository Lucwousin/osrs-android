package com.google.android.gms.internal.measurement;

final class zzhh implements Runnable {
    zzhh(zzgp arg1, String arg2, String arg3, String arg4, long arg5) {
        this.zzape = arg1;
        this.zzapj = arg2;
        this.zzapg = arg3;
        this.zzaem = arg4;
        this.zzapk = arg5;
        super();
    }

    public final void run() {
        if(this.zzapj == null) {
            zzgp.zza(this.zzape).zzlm().zzgb().zza(this.zzapg, null);
            return;
        }

        zzgp.zza(this.zzape).zzlm().zzgb().zza(this.zzapg, new zzig(this.zzaem, this.zzapj, this.zzapk));
    }
}

