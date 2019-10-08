package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class zzwt extends ContentObserver {
    zzwt(Handler arg1) {
        super(null);
    }

    public final void onChange(boolean arg2) {
        zzws.zzsg().set(true);
    }
}

