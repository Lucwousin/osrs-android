package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

final class zzm extends zzn {
    zzm(zzl arg1) {
        this.zzag = arg1;
        super();
    }

    public final void zza(boolean arg3) {
        zzl v0 = this.zzag;
        Status v3 = arg3 ? Status.RESULT_SUCCESS : zzh.zzc();
        v0.setResult(new zzq(v3));
    }
}

