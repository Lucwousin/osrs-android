package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;

abstract class zzap extends ApiMethodImpl {
    public zzap(GoogleApiClient arg2) {
        super(AuthProxy.API, arg2);
    }

    protected Result createFailedResult(Status arg2) {
        return new zzaw(arg2);
    }

    protected void doExecute(AnyClient arg2) throws RemoteException {
        this.zza(((zzak)arg2).getContext(), ((zzak)arg2).getService());
    }

    protected abstract void zza(Context arg1, zzan arg2) throws RemoteException;
}

