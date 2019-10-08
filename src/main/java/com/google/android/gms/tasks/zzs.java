package com.google.android.gms.tasks;

final class zzs implements OnTokenCanceledListener {
    zzs(TaskCompletionSource arg1) {
        this.zzv = arg1;
        super();
    }

    public final void onCanceled() {
        TaskCompletionSource.zza(this.zzv).zza();
    }
}

