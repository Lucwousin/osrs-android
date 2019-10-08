package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

final class zzhc implements Callable {
    zzhc(zzgp arg1, zzex arg2, String arg3) {
        this.zzape = arg1;
        this.zzaph = arg2;
        this.zzapg = arg3;
        super();
    }

    public final Object call() throws Exception {
        zzgp.zza(this.zzape).zzlj();
        return zzgp.zza(this.zzape).zza(this.zzaph, this.zzapg);
    }
}

