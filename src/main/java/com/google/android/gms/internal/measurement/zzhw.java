package com.google.android.gms.internal.measurement;

import java.util.concurrent.atomic.AtomicReference;

final class zzhw implements Runnable {
    zzhw(zzhm arg1, AtomicReference arg2, String arg3, String arg4, String arg5, boolean arg6) {
        this.zzaps = arg1;
        this.zzapr = arg2;
        this.zzapg = arg3;
        this.zzadn = arg4;
        this.zzadu = arg5;
        this.zzadv = arg6;
        super();
    }

    public final void run() {
        this.zzaps.zzacv.zzga().zza(this.zzapr, this.zzapg, this.zzadn, this.zzadu, this.zzadv);
    }
}

