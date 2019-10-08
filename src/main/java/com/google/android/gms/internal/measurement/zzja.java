package com.google.android.gms.internal.measurement;

import android.content.ComponentName;

final class zzja implements Runnable {
    zzja(zziy arg1, ComponentName arg2) {
        this.zzare = arg1;
        this.val$name = arg2;
        super();
    }

    public final void run() {
        zzik.zza(this.zzare.zzaqv, this.val$name);
    }
}

