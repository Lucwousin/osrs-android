package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;

final class zzin implements Runnable {
    zzin(zzik arg1, AtomicReference arg2, zzeb arg3) {
        this.zzaqv = arg1;
        this.zzaqw = arg2;
        this.zzapd = arg3;
        super();
    }

    public final void run() {
        AtomicReference v1_4;
        zzfa v1_2;
        AtomicReference v0 = this.zzaqw;
        __monitor_enter(v0);
        try {
            v1_2 = zzik.zzd(this.zzaqv);
            if(v1_2 != null) {
                goto label_14;
            }

            this.zzaqv.zzgi().zziv().log("Failed to get app instance id");
        }
        catch(Throwable v1) {
            goto label_34;
        }
        catch(RemoteException v1_1) {
            goto label_36;
        }

        try {
            this.zzaqw.notify();
            __monitor_exit(v0);
            return;
        }
        catch(Throwable v1) {
            goto label_49;
        }

        try {
        label_14:
            this.zzaqw.set(v1_2.zzc(this.zzapd));
            Object v1_3 = this.zzaqw.get();
            if(v1_3 != null) {
                this.zzaqv.zzfy().zzbu(((String)v1_3));
                this.zzaqv.zzgj().zzama.zzbv(((String)v1_3));
            }

            zzik.zze(this.zzaqv);
            goto label_30;
        }
        catch(Throwable v1) {
        label_34:
            try {
                this.zzaqw.notify();
                throw v1;
            label_30:
                v1_4 = this.zzaqw;
            label_31:
                v1_4.notify();
                __monitor_exit(v0);
                return;
            label_49:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_49;
            }
        }
        catch(RemoteException v1_1) {
            try {
            label_36:
                this.zzaqv.zzgi().zziv().zzg("Failed to get app instance id", v1_1);
            }
            catch(Throwable v1) {
                goto label_34;
            }

            try {
                v1_4 = this.zzaqw;
                goto label_31;
            }
            catch(Throwable v1) {
                goto label_49;
            }
        }

        throw v1;
    }
}

