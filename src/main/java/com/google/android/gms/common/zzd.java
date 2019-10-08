package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class zzd implements Callable {
    private final boolean zzq;
    private final String zzr;
    private final zze zzs;

    zzd(boolean arg1, String arg2, zze arg3) {
        super();
        this.zzq = arg1;
        this.zzr = arg2;
        this.zzs = arg3;
    }

    public final Object call() {
        return zzc.zza(this.zzq, this.zzr, this.zzs);
    }
}

