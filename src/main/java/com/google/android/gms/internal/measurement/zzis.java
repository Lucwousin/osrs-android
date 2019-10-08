package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

final class zzis implements Runnable {
    zzis(zzik arg1, boolean arg2, boolean arg3, zzex arg4, zzeb arg5, String arg6) {
        this.zzaqv = arg1;
        this.zzaqx = arg2;
        this.zzaqy = arg3;
        this.zzaph = arg4;
        this.zzapd = arg5;
        this.zzapg = arg6;
        super();
    }

    public final void run() {
        zzex v2_1;
        zzfa v0 = zzik.zzd(this.zzaqv);
        if(v0 == null) {
            this.zzaqv.zzgi().zziv().log("Discarding data. Failed to send event to service");
            return;
        }

        if(this.zzaqx) {
            zzik v1 = this.zzaqv;
            if(this.zzaqy) {
                AbstractSafeParcelable v2 = null;
            }
            else {
                v2_1 = this.zzaph;
            }

            v1.zza(v0, ((AbstractSafeParcelable)v2_1), this.zzapd);
            goto label_40;
        }

        try {
            if(TextUtils.isEmpty(this.zzapg)) {
                v0.zza(this.zzaph, this.zzapd);
                goto label_40;
            }

            v0.zza(this.zzaph, this.zzapg, this.zzaqv.zzgi().zzje());
        }
        catch(RemoteException v0_1) {
            this.zzaqv.zzgi().zziv().zzg("Failed to send event to the service", v0_1);
        }

    label_40:
        zzik.zze(this.zzaqv);
    }
}

