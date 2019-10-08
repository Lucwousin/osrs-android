package com.google.android.gms.internal.measurement;

final class zziz implements Runnable {
    zziz(zziy arg1, zzfa arg2) {
        this.zzare = arg1;
        this.zzard = arg2;
        super();
    }

    public final void run() {
        zziy v0 = this.zzare;
        __monitor_enter(v0);
        try {
            zziy.zza(this.zzare, false);
            if(!this.zzare.zzaqv.isConnected()) {
                this.zzare.zzaqv.zzgi().zzjc().log("Connected to service");
                this.zzare.zzaqv.zza(this.zzard);
            }

            __monitor_exit(v0);
            return;
        label_22:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_22;
        }

        throw v1;
    }
}

