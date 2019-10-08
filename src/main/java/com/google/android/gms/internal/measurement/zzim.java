package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

final class zzim implements Runnable {
    zzim(zzik arg1, zzeb arg2) {
        this.zzaqv = arg1;
        this.zzapd = arg2;
        super();
    }

    public final void run() {
        zzfa v0 = zzik.zzd(this.zzaqv);
        if(v0 == null) {
            this.zzaqv.zzgi().zziv().log("Failed to reset data on the service; null service");
            return;
        }

        try {
            v0.zzd(this.zzapd);
        }
        catch(RemoteException v0_1) {
            this.zzaqv.zzgi().zziv().zzg("Failed to reset data on the service", v0_1);
        }

        zzik.zze(this.zzaqv);
    }
}

