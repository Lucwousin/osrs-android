package com.google.android.gms.tasks;

final class zzj implements Runnable {
    zzj(zzi arg1, Task arg2) {
        this.zzm = arg1;
        this.zzg = arg2;
        super();
    }

    public final void run() {
        Object v0 = zzi.zza(this.zzm);
        __monitor_enter(v0);
        try {
            if(zzi.zzb(this.zzm) != null) {
                zzi.zzb(this.zzm).onComplete(this.zzg);
            }

            __monitor_exit(v0);
            return;
        label_13:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_13;
        }

        throw v1;
    }
}

