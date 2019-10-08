package com.google.android.gms.tasks;

public class CancellationTokenSource {
    private final zza zzc;

    public CancellationTokenSource() {
        super();
        this.zzc = new zza();
    }

    public void cancel() {
        this.zzc.cancel();
    }

    public CancellationToken getToken() {
        return this.zzc;
    }
}

