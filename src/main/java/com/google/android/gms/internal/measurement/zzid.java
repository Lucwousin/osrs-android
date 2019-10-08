package com.google.android.gms.internal.measurement;

final class zzid implements Runnable {
    zzid(zzhm arg1, long arg2) {
        this.zzaps = arg1;
        this.zzadq = arg2;
        super();
    }

    public final void run() {
        this.zzaps.zzgj().zzami.set(this.zzadq);
        this.zzaps.zzgi().zzjb().zzg("Session timeout duration set", Long.valueOf(this.zzadq));
    }
}

