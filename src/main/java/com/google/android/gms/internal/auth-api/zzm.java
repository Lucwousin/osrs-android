package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation$ResultHolder;

final class zzm extends zzp {
    zzm(zzi arg1, GoogleApiClient arg2, Credential arg3) {
        this.zzao = arg3;
        super(arg2);
    }

    protected final Result createFailedResult(Status arg1) {
        return arg1;
    }

    protected final void zzc(Context arg3, zzw arg4) throws RemoteException {
        arg4.zzc(new zzo(((ResultHolder)this)), new zzs(this.zzao));
    }
}

