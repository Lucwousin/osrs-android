package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzi extends zzo {
    zzi(GoogleApiClient arg1, Context arg2, GoogleSignInOptions arg3) {
        this.val$context = arg2;
        this.zzbj = arg3;
        super(arg1);
    }

    protected final Result createFailedResult(Status arg3) {
        return new GoogleSignInResult(null, arg3);
    }

    protected final void doExecute(AnyClient arg3) throws RemoteException {
        ((zzg)arg3).getService().zzc(new zzj(this), this.zzbj);
    }
}

