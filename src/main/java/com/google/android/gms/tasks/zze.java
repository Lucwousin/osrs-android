package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

final class zze implements OnCanceledListener, OnFailureListener, OnSuccessListener, zzq {
    private final Executor zzd;
    private final Continuation zze;
    private final zzu zzf;

    public zze(@NonNull Executor arg1, @NonNull Continuation arg2, @NonNull zzu arg3) {
        super();
        this.zzd = arg1;
        this.zze = arg2;
        this.zzf = arg3;
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void onCanceled() {
        this.zzf.zza();
    }

    public final void onComplete(@NonNull Task arg3) {
        this.zzd.execute(new zzf(this, arg3));
    }

    public final void onFailure(@NonNull Exception arg2) {
        this.zzf.setException(arg2);
    }

    public final void onSuccess(Object arg2) {
        this.zzf.setResult(arg2);
    }

    static Continuation zza(zze arg0) {
        return arg0.zze;
    }

    static zzu zzb(zze arg0) {
        return arg0.zzf;
    }
}

