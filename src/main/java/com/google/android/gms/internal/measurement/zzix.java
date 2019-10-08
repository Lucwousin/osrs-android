package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class zzix implements Runnable {
    zzix(zzik arg1, AtomicReference arg2, zzeb arg3, boolean arg4) {
        this.zzaqv = arg1;
        this.zzaqw = arg2;
        this.zzapd = arg3;
        this.zzadv = arg4;
        super();
    }

    public final void run() {
        AtomicReference v1_3;
        zzfa v1_2;
        AtomicReference v0 = this.zzaqw;
        __monitor_enter(v0);
        try {
            v1_2 = zzik.zzd(this.zzaqv);
            if(v1_2 != null) {
                goto label_14;
            }

            this.zzaqv.zzgi().zziv().log("Failed to get user properties");
        }
        catch(Throwable v1) {
            goto label_25;
        }
        catch(RemoteException v1_1) {
            goto label_27;
        }

        try {
            this.zzaqw.notify();
            __monitor_exit(v0);
            return;
        }
        catch(Throwable v1) {
            goto label_40;
        }

        try {
        label_14:
            this.zzaqw.set(v1_2.zza(this.zzapd, this.zzadv));
            zzik.zze(this.zzaqv);
            goto label_21;
        }
        catch(Throwable v1) {
        label_25:
            try {
                this.zzaqw.notify();
                throw v1;
            label_21:
                v1_3 = this.zzaqw;
            label_22:
                v1_3.notify();
                __monitor_exit(v0);
                return;
            label_40:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_40;
            }
        }
        catch(RemoteException v1_1) {
            try {
            label_27:
                this.zzaqv.zzgi().zziv().zzg("Failed to get user properties", v1_1);
            }
            catch(Throwable v1) {
                goto label_25;
            }

            try {
                v1_3 = this.zzaqw;
                goto label_22;
            }
            catch(Throwable v1) {
                goto label_40;
            }
        }

        throw v1;
    }
}

