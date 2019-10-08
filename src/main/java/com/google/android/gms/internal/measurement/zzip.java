package com.google.android.gms.internal.measurement;

import android.os.RemoteException;

final class zzip implements Runnable {
    zzip(zzik arg1, zzig arg2) {
        this.zzaqv = arg1;
        this.zzaqn = arg2;
        super();
    }

    public final void run() {
        String v6;
        String v5;
        String v4;
        long v2;
        zzfa v1 = zzik.zzd(this.zzaqv);
        if(v1 == null) {
            this.zzaqv.zzgi().zziv().log("Failed to send current screen to service");
            return;
        }

        try {
            if(this.zzaqn == null) {
                v2 = 0;
                v4 = null;
                v5 = null;
                v6 = this.zzaqv.getContext().getPackageName();
            }
            else {
                v2 = this.zzaqn.zzaqb;
                v4 = this.zzaqn.zzuk;
                v5 = this.zzaqn.zzaqa;
                v6 = this.zzaqv.getContext().getPackageName();
            }

            v1.zza(v2, v4, v5, v6);
            zzik.zze(this.zzaqv);
            return;
        }
        catch(RemoteException v0) {
            this.zzaqv.zzgi().zziv().zzg("Failed to send current screen to the service", v0);
            return;
        }
    }
}

