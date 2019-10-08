package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

final class zzo implements OnCanceledListener, OnFailureListener, OnSuccessListener, zzq {
    private final Executor zzd;
    private final zzu zzf;
    private final SuccessContinuation zzr;

    public zzo(@NonNull Executor arg1, @NonNull SuccessContinuation arg2, @NonNull zzu arg3) {
        super();
        this.zzd = arg1;
        this.zzr = arg2;
        this.zzf = arg3;
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void onCanceled() {
        this.zzf.zza();
    }

    public final void onComplete(@NonNull Task arg3) {
        this.zzd.execute(new zzp(this, arg3));
    }

    public final void onFailure(@NonNull Exception arg2) {
        this.zzf.setException(arg2);
    }

    public final void onSuccess(Object arg2) {
        this.zzf.setResult(arg2);
    }

    static SuccessContinuation zza(zzo arg0) {
        return arg0.zzr;
    }
}

