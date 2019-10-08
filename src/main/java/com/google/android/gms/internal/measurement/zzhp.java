package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;

final class zzhp implements Runnable {
    zzhp(zzhm arg1, AtomicReference arg2, boolean arg3) {
        this.zzaps = arg1;
        this.zzapr = arg2;
        this.zzadv = arg3;
        super();
    }

    public final void run() {
        this.zzaps.zzga().zza(this.zzapr, this.zzadv);
    }
}

