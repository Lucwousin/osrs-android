package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.common.api.Status;

final class zzk extends zzn {
    zzk(zzj arg1) {
        this.zzaf = arg1;
        super();
    }

    public final void zzc(Account arg4) {
        zzj v0 = this.zzaf;
        Status v2 = arg4 != null ? Status.RESULT_SUCCESS : zzh.zzc();
        v0.setResult(new zzo(v2, arg4));
    }
}

