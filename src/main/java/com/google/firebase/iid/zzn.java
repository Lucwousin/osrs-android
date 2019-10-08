package com.google.firebase.iid;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class zzn implements Continuation {
    private final FirebaseInstanceId zzay;
    private final String zzaz;
    private final String zzba;

    zzn(FirebaseInstanceId arg1, String arg2, String arg3) {
        super();
        this.zzay = arg1;
        this.zzaz = arg2;
        this.zzba = arg3;
    }

    public final Object then(Task arg4) {
        return this.zzay.zza(this.zzaz, this.zzba, arg4);
    }
}

