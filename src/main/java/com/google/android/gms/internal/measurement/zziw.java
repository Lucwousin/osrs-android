package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

final class zziw implements Runnable {
    zziw(zzik arg1, boolean arg2, zzka arg3, zzeb arg4) {
        this.zzaqv = arg1;
        this.zzaqy = arg2;
        this.zzapi = arg3;
        this.zzapd = arg4;
        super();
    }

    public final void run() {
        AbstractSafeParcelable v2;
        zzfa v0 = zzik.zzd(this.zzaqv);
        if(v0 == null) {
            this.zzaqv.zzgi().zziv().log("Discarding data. Failed to set user attribute");
            return;
        }

        zzik v1 = this.zzaqv;
        if(this.zzaqy) {
            v2 = null;
        }
        else {
            zzka v2_1 = this.zzapi;
        }

        v1.zza(v0, v2, this.zzapd);
        zzik.zze(this.zzaqv);
    }
}

