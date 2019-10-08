package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

final class zzir implements Runnable {
    zzir(zzik arg1, zzeb arg2) {
        this.zzaqv = arg1;
        this.zzapd = arg2;
        super();
    }

    public final void run() {
        zzfa v0 = zzik.zzd(this.zzaqv);
        if(v0 == null) {
            this.zzaqv.zzgi().zziv().log("Failed to send measurementEnabled to service");
            return;
        }

        try {
            v0.zzb(this.zzapd);
            zzik.zze(this.zzaqv);
            return;
        }
        catch(RemoteException v0_1) {
            this.zzaqv.zzgi().zziv().zzg("Failed to send measurementEnabled to the service", v0_1);
            return;
        }
    }
}

