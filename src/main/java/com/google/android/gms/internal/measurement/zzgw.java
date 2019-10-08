package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

final class zzgw implements Callable {
    zzgw(zzgp arg1, String arg2, String arg3, String arg4) {
        this.zzape = arg1;
        this.zzapg = arg2;
        this.zzadn = arg3;
        this.zzadu = arg4;
        super();
    }

    public final Object call() throws Exception {
        zzgp.zza(this.zzape).zzlj();
        return zzgp.zza(this.zzape).zzjh().zzb(this.zzapg, this.zzadn, this.zzadu);
    }
}

