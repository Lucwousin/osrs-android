package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzwv extends ContentObserver {
    zzwv(zzwu arg1, Handler arg2) {
        this.zzbpf = arg1;
        super(null);
    }

    public final void onChange(boolean arg1) {
        this.zzbpf.zzsi();
        zzwu.zza(this.zzbpf);
    }
}

