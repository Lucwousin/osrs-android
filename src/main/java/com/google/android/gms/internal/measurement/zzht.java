package com.google.android.gms.internal.measurement;

import com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty;

final class zzht implements Runnable {
    zzht(zzhm arg1, ConditionalUserProperty arg2) {
        this.zzaps = arg1;
        this.zzapw = arg2;
        super();
    }

    public final void run() {
        zzhm.zza(this.zzaps, this.zzapw);
    }
}

