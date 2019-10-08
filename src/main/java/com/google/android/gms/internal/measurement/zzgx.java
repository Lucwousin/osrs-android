package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

final class zzgx implements Callable {
    zzgx(zzgp arg1, zzeb arg2, String arg3, String arg4) {
        this.zzape = arg1;
        this.zzapd = arg2;
        this.zzadn = arg3;
        this.zzadu = arg4;
        super();
    }

    public final Object call() throws Exception {
        zzgp.zza(this.zzape).zzlj();
        return zzgp.zza(this.zzape).zzjh().zzc(this.zzapd.packageName, this.zzadn, this.zzadu);
    }
}

