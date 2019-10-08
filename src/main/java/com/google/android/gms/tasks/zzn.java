package com.google.android.gms.tasks;

final class zzn implements Runnable {
    zzn(zzm arg1, Task arg2) {
        this.zzq = arg1;
        this.zzg = arg2;
        super();
    }

    public final void run() {
        Object v0 = zzm.zza(this.zzq);
        __monitor_enter(v0);
        try {
            if(zzm.zzb(this.zzq) != null) {
                zzm.zzb(this.zzq).onSuccess(this.zzg.getResult());
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

