package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzau extends zzaq {
    zzau(zzar arg1, GoogleApiClient arg2) {
        super(arg2);
    }

    protected final void zza(Context arg1, zzan arg2) throws RemoteException {
        arg2.zza(new zzav(this));
    }
}

