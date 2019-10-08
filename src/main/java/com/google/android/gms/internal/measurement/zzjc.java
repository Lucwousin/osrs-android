package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;

final class zzjc implements Runnable {
    zzjc(zziy arg1) {
        this.zzare = arg1;
        super();
    }

    public final void run() {
        zzik v0 = this.zzare.zzaqv;
        Context v2 = this.zzare.zzaqv.getContext();
        this.zzare.zzaqv.zzgl();
        zzik.zza(v0, new ComponentName(v2, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}

