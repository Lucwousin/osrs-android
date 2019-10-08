package com.google.android.gms.internal.measurement;

final class zzju implements Runnable {
    zzju(zzjt arg1, zzjy arg2) {
        this.zzasn = arg1;
        this.zzasm = arg2;
        super();
    }

    public final void run() {
        zzjt.zza(this.zzasn, this.zzasm);
        this.zzasn.start();
    }
}

