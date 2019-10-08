package com.google.android.gms.internal.measurement;

import android.content.Intent;

final class zzjf implements Runnable {
    private final int zzabo;
    private final zzje zzarg;
    private final zzfi zzarh;
    private final Intent zzari;

    zzjf(zzje arg1, int arg2, zzfi arg3, Intent arg4) {
        super();
        this.zzarg = arg1;
        this.zzabo = arg2;
        this.zzarh = arg3;
        this.zzari = arg4;
    }

    public final void run() {
        this.zzarg.zza(this.zzabo, this.zzarh, this.zzari);
    }
}

