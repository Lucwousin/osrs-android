package com.google.android.gms.internal.measurement;

final class zzjh implements Runnable {
    zzjh(zzje arg1, zzjt arg2, Runnable arg3) {
        this.zzark = arg2;
        this.zzabs = arg3;
        super();
    }

    public final void run() {
        this.zzark.zzlj();
        this.zzark.zzg(this.zzabs);
        this.zzark.zzle();
    }
}

