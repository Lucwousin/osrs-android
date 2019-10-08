package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;

final class zzl extends ApiMethodImpl {
    zzl(zzh arg1, Api arg2, GoogleApiClient arg3, Account arg4) {
        this.zzo = arg4;
        super(arg2, arg3);
    }

    protected final Result createFailedResult(Status arg2) {
        return new zzq(arg2);
    }

    protected final void doExecute(AnyClient arg3) throws RemoteException {
        ((zzr)arg3).getService().zza(new zzm(this), this.zzo);
    }
}

