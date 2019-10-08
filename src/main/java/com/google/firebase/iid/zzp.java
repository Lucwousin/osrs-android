package com.google.firebase.iid;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;

final class zzp implements SuccessContinuation {
    private final FirebaseInstanceId zzay;
    private final String zzaz;
    private final String zzba;
    private final String zzbb;

    zzp(FirebaseInstanceId arg1, String arg2, String arg3, String arg4) {
        super();
        this.zzay = arg1;
        this.zzaz = arg2;
        this.zzba = arg3;
        this.zzbb = arg4;
    }

    public final Task then(Object arg5) {
        return this.zzay.zzb(this.zzaz, this.zzba, this.zzbb, ((String)arg5));
    }
}

