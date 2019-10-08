package com.google.firebase.iid;

import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class zzar implements Continuation {
    private final zzaq zzct;
    private final Pair zzcu;

    zzar(zzaq arg1, Pair arg2) {
        super();
        this.zzct = arg1;
        this.zzcu = arg2;
    }

    public final Object then(Task arg3) {
        return this.zzct.zza(this.zzcu, arg3);
    }
}

