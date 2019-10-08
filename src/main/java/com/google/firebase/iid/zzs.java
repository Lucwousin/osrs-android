package com.google.firebase.iid;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzs implements Runnable {
    private final zzr zzbo;
    private final Bundle zzbp;
    private final TaskCompletionSource zzbq;

    zzs(zzr arg1, Bundle arg2, TaskCompletionSource arg3) {
        super();
        this.zzbo = arg1;
        this.zzbp = arg2;
        this.zzbq = arg3;
    }

    public final void run() {
        this.zzbo.zza(this.zzbp, this.zzbq);
    }
}

