package com.google.android.gms.internal.measurement;

final class zzij implements Runnable {
    zzij(zzih arg1, zzig arg2) {
        this.zzaqm = arg1;
        this.zzaqn = arg2;
        super();
    }

    public final void run() {
        zzih.zza(this.zzaqm, this.zzaqn);
        this.zzaqm.zzaqd = null;
        this.zzaqm.zzga().zzb(null);
    }
}

