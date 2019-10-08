package com.google.android.gms.auth.api.accounttransfer;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth.zzs;

final class zzk extends zzs {
    zzk(zzc arg1) {
        this.zzay = arg1;
        super();
    }

    public final void onFailure(Status arg2) {
        this.zzay.zza(arg2);
    }

    public final void zzd() {
        this.zzay.setResult(null);
    }
}

