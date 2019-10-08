package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

final class zzhf implements Callable {
    zzhf(zzgp arg1, zzeb arg2) {
        this.zzape = arg1;
        this.zzapd = arg2;
        super();
    }

    public final Object call() throws Exception {
        zzgp.zza(this.zzape).zzlj();
        return zzgp.zza(this.zzape).zzjh().zzbe(this.zzapd.packageName);
    }
}

