package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.auth.api.proxy.ProxyApi$SpatulaHeaderResult;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ApiMethodImpl;

abstract class zzaq extends ApiMethodImpl {
    public zzaq(GoogleApiClient arg2) {
        super(AuthProxy.API, arg2);
    }

    protected Result createFailedResult(Status arg1) {
        return zzaq.zzc(arg1);
    }

    protected void doExecute(AnyClient arg2) throws RemoteException {
        this.zza(((zzak)arg2).getContext(), ((zzak)arg2).getService());
    }

    protected abstract void zza(Context arg1, zzan arg2) throws RemoteException;

    protected static SpatulaHeaderResult zzc(Status arg1) {
        return new zzax(arg1);
    }
}

