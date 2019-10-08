package com.google.android.gms.tasks;

final class zzl implements Runnable {
    zzl(zzk arg1, Task arg2) {
        this.zzo = arg1;
        this.zzg = arg2;
        super();
    }

    public final void run() {
        Object v0 = zzk.zza(this.zzo);
        __monitor_enter(v0);
        try {
            if(zzk.zzb(this.zzo) != null) {
                zzk.zzb(this.zzo).onFailure(this.zzg.getException());
            }

            __monitor_exit(v0);
            return;
        label_14:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_14;
        }

        throw v1;
    }
}

