package com.google.android.gms.internal.measurement;

final class zzic implements Runnable {
    zzic(zzhm arg1, long arg2) {
        this.zzaps = arg1;
        this.zzadq = arg2;
        super();
    }

    public final void run() {
        this.zzaps.zzgj().zzamh.set(this.zzadq);
        this.zzaps.zzgi().zzjb().zzg("Minimum session duration set", Long.valueOf(this.zzadq));
    }
}

