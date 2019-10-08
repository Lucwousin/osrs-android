package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

public class TaskCompletionSource {
    private final zzu zza;

    public TaskCompletionSource() {
        super();
        this.zza = new zzu();
    }

    public TaskCompletionSource(@NonNull CancellationToken arg2) {
        super();
        this.zza = new zzu();
        arg2.onCanceledRequested(new zzs(this));
    }

    @NonNull public Task getTask() {
        return this.zza;
    }

    public void setException(@NonNull Exception arg2) {
        this.zza.setException(arg2);
    }

    public void setResult(Object arg2) {
        this.zza.setResult(arg2);
    }

    public boolean trySetException(@NonNull Exception arg2) {
        return this.zza.trySetException(arg2);
    }

    public boolean trySetResult(Object arg2) {
        return this.zza.trySetResult(arg2);
    }

    static zzu zza(TaskCompletionSource arg0) {
        return arg0.zza;
    }
}

