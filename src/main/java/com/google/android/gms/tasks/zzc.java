package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

final class zzc implements zzq {
    private final Executor zzd;
    private final Continuation zze;
    private final zzu zzf;

    public zzc(@NonNull Executor arg1, @NonNull Continuation arg2, @NonNull zzu arg3) {
        super();
        this.zzd = arg1;
        this.zze = arg2;
        this.zzf = arg3;
    }

    public final void cancel() {
        throw new UnsupportedOperationException();
    }

    public final void onComplete(@NonNull Task arg3) {
        this.zzd.execute(new zzd(this, arg3));
    }

    static zzu zza(zzc arg0) {
        return arg0.zzf;
    }

    static Continuation zzb(zzc arg0) {
        return arg0.zze;
    }
}

