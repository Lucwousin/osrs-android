package com.google.android.gms.internal.auth-api;

import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

final class zzk extends zzg {
    zzk(zzj arg1) {
        this.zzan = arg1;
        super();
    }

    public final void zzc(Status arg2) {
        this.zzan.setResult(zzh.zzd(arg2));
    }

    public final void zzc(Status arg3, Credential arg4) {
        this.zzan.setResult(new zzh(arg3, arg4));
    }
}

