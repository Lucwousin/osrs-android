package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;

final class zzj extends zzc {
    zzj(zzi arg1) {
        this.zzbk = arg1;
        super();
    }

    public final void zzc(GoogleSignInAccount arg3, Status arg4) throws RemoteException {
        if(arg3 != null) {
            zzp.zzd(this.zzbk.val$context).zzc(this.zzbk.zzbj, arg3);
        }

        this.zzbk.setResult(new GoogleSignInResult(arg3, arg4));
    }
}

