package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;

abstract class zzp extends ApiMethodImpl {
    zzp(GoogleApiClient arg2) {
        super(Auth.CREDENTIALS_API, arg2);
    }

    protected void doExecute(AnyClient arg2) throws RemoteException {
        this.zzc(((zzr)arg2).getContext(), ((zzr)arg2).getService());
    }

    protected abstract void zzc(Context arg1, zzw arg2) throws DeadObjectException, RemoteException;
}

