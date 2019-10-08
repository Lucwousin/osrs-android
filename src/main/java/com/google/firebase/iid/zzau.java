package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.firebase_messaging.zzf;

final class zzau extends zzf {
    zzau(zzat arg1, Looper arg2) {
        this.zzda = arg1;
        super(arg2);
    }

    public final void handleMessage(Message arg2) {
        zzat.zza(this.zzda, arg2);
    }
}

