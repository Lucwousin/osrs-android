package com.google.firebase.iid;

import android.os.Handler$Callback;
import android.os.Message;

final class zzae implements Handler$Callback {
    private final zzad zzcg;

    zzae(zzad arg1) {
        super();
        this.zzcg = arg1;
    }

    public final boolean handleMessage(Message arg2) {
        return this.zzcg.zza(arg2);
    }
}

