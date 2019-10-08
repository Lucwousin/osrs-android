package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import androidx.annotation.WorkerThread;

final class zzjk extends zzep {
    zzjk(zzjj arg1, zzhk arg2) {
        this.zzaro = arg1;
        super(arg2);
    }

    @WorkerThread public final void run() {
        zzjj v0 = this.zzaro;
        ((zzhi)v0).zzab();
        ((zzhi)v0).zzgi().zzjc().zzg("Session started, time", Long.valueOf(((zzhi)v0).zzbt().elapsedRealtime()));
        ((zzhi)v0).zzgj().zzamj.set(false);
        ((zzdy)v0).zzfy().zza("auto", "_s", new Bundle());
        ((zzhi)v0).zzgj().zzamk.set(((zzhi)v0).zzbt().currentTimeMillis());
    }
}

