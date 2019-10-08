package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.auth-api.zzd;
import com.google.android.gms.internal.auth-api.zze;

public abstract class zzt extends zzd implements zzs {
    public zzt() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    protected final boolean dispatchTransaction(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException {
        switch(arg1) {
            case 101: {
                goto label_11;
            }
            case 102: {
                goto label_7;
            }
            case 103: {
                goto label_3;
            }
        }

        return 0;
    label_3:
        this.zzf(zze.zzc(arg2, Status.CREATOR));
        goto label_16;
    label_7:
        this.zze(zze.zzc(arg2, Status.CREATOR));
        goto label_16;
    label_11:
        this.zzc(zze.zzc(arg2, GoogleSignInAccount.CREATOR), zze.zzc(arg2, Status.CREATOR));
    label_16:
        arg3.writeNoException();
        return 1;
    }
}

