package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyRequest;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzas extends zzap {
    zzas(zzar arg1, GoogleApiClient arg2, ProxyRequest arg3) {
        this.zzce = arg3;
        super(arg2);
    }

    protected final void zza(Context arg2, zzan arg3) throws RemoteException {
        arg3.zza(new zzat(this), this.zzce);
    }
}

