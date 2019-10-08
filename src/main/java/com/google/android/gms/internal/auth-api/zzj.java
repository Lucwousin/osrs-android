package com.google.android.gms.internal.auth-api;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzj extends zzp {
    zzj(zzi arg1, GoogleApiClient arg2, CredentialRequest arg3) {
        this.zzam = arg3;
        super(arg2);
    }

    protected final Result createFailedResult(Status arg1) {
        return zzh.zzd(arg1);
    }

    protected final void zzc(Context arg2, zzw arg3) throws RemoteException {
        arg3.zzc(new zzk(this), this.zzam);
    }
}

