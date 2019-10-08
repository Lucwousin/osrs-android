package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

final class zzjx implements Callable {
    zzjx(zzjt arg1, zzeb arg2) {
        this.zzasn = arg1;
        this.zzapd = arg2;
        super();
    }

    public final Object call() throws Exception {
        zzea v0 = this.zzasn.zzgk().zzbc(this.zzapd.packageName) ? zzjt.zza(this.zzasn, this.zzapd) : this.zzasn.zzjh().zzbf(this.zzapd.packageName);
        if(v0 == null) {
            this.zzasn.zzgi().zziy().log("App info was null when attempting to get app instance id");
            return null;
        }

        return v0.getAppInstanceId();
    }
}

