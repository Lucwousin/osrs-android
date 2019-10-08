package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzl extends zzc {
    zzl(zzk arg1) {
        this.zzbl = arg1;
        super();
    }

    public final void zze(Status arg2) throws RemoteException {
        this.zzbl.setResult(((Result)arg2));
    }
}

