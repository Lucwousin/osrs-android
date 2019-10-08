package com.google.android.gms.stats;

final class zzb implements Runnable {
    zzb(WakeLock arg1) {
        this.zzp = arg1;
        super();
    }

    public final void run() {
        WakeLock.zza(this.zzp, 0);
    }
}

