package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

final class zzio implements Runnable {
    zzio(zzik arg1, zzeb arg2) {
        this.zzaqv = arg1;
        this.zzapd = arg2;
        super();
    }

    public final void run() {
        zzfa v0 = zzik.zzd(this.zzaqv);
        if(v0 == null) {
            this.zzaqv.zzgi().zziv().log("Discarding data. Failed to send app launch");
            return;
        }

        try {
            v0.zza(this.zzapd);
            this.zzaqv.zza(v0, null, this.zzapd);
            zzik.zze(this.zzaqv);
            return;
        }
        catch(RemoteException v0_1) {
            this.zzaqv.zzgi().zziv().zzg("Failed to send app launch to the service", v0_1);
            return;
        }
    }
}

