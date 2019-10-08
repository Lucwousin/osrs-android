package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

final class zza extends CancellationToken {
    private final zzu zza;

    zza() {
        super();
        this.zza = new zzu();
    }

    public final void cancel() {
        this.zza.trySetResult(null);
    }

    public final boolean isCancellationRequested() {
        return this.zza.isComplete();
    }

    public final CancellationToken onCanceledRequested(@NonNull OnTokenCanceledListener arg3) {
        this.zza.addOnSuccessListener(new zzb(this, arg3));
        return this;
    }
}

