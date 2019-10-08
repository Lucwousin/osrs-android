package com.google.android.gms.internal.measurement;

final class zzhd implements Runnable {
    zzhd(zzgp arg1, zzka arg2, zzeb arg3) {
        this.zzape = arg1;
        this.zzapi = arg2;
        this.zzapd = arg3;
        super();
    }

    public final void run() {
        zzgp.zza(this.zzape).zzlj();
        zzgp.zza(this.zzape).zzc(this.zzapi, this.zzapd);
    }
}

