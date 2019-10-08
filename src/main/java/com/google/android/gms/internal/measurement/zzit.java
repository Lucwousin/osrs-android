package com.google.android.gms.internal.measurement;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

final class zzit implements Runnable {
    zzit(zzik arg1, boolean arg2, boolean arg3, zzef arg4, zzeb arg5, zzef arg6) {
        this.zzaqv = arg1;
        this.zzaqx = arg2;
        this.zzaqy = arg3;
        this.zzaqz = arg4;
        this.zzapd = arg5;
        this.zzara = arg6;
        super();
    }

    public final void run() {
        AbstractSafeParcelable v2;
        zzfa v0 = zzik.zzd(this.zzaqv);
        if(v0 == null) {
            this.zzaqv.zzgi().zziv().log("Discarding data. Failed to send conditional user property to service");
            return;
        }

        if(this.zzaqx) {
            zzik v1 = this.zzaqv;
            if(this.zzaqy) {
                v2 = null;
            }
            else {
                zzef v2_1 = this.zzaqz;
            }

            v1.zza(v0, v2, this.zzapd);
            goto label_37;
        }

        try {
            if(TextUtils.isEmpty(this.zzara.packageName)) {
                v0.zza(this.zzaqz, this.zzapd);
                goto label_37;
            }

            v0.zzb(this.zzaqz);
        }
        catch(RemoteException v0_1) {
            this.zzaqv.zzgi().zziv().zzg("Failed to send conditional user property to the service", v0_1);
        }

    label_37:
        zzik.zze(this.zzaqv);
    }
}

