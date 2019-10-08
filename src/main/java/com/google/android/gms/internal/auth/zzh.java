package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccount;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

public final class zzh implements WorkAccountApi {
    private static final Status zzad;

    static {
        zzh.zzad = new Status(13);
    }

    public zzh() {
        super();
    }

    public final PendingResult addWorkAccount(GoogleApiClient arg3, String arg4) {
        return arg3.execute(new zzj(this, WorkAccount.API, arg3, arg4));
    }

    public final PendingResult removeWorkAccount(GoogleApiClient arg3, Account arg4) {
        return arg3.execute(new zzl(this, WorkAccount.API, arg3, arg4));
    }

    public final void setWorkAuthenticatorEnabled(GoogleApiClient arg1, boolean arg2) {
        this.setWorkAuthenticatorEnabledWithResult(arg1, arg2);
    }

    public final PendingResult setWorkAuthenticatorEnabledWithResult(GoogleApiClient arg3, boolean arg4) {
        return arg3.execute(new zzi(this, WorkAccount.API, arg3, arg4));
    }

    static Status zzc() {
        return zzh.zzad;
    }
}

