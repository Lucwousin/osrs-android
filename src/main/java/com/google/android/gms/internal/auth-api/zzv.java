package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.api.Status;

public abstract class zzv extends zzd implements zzu {
    public zzv() {
        super("com.google.android.gms.auth.api.credentials.internal.ICredentialsCallbacks");
    }

    protected final boolean dispatchTransaction(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException {
        switch(arg1) {
            case 1: {
                goto label_12;
            }
            case 2: {
                goto label_8;
            }
            case 3: {
                goto label_3;
            }
        }

        return 0;
    label_3:
        this.zzc(zze.zzc(arg2, Status.CREATOR), arg2.readString());
        goto label_17;
    label_8:
        this.zzc(zze.zzc(arg2, Status.CREATOR));
        goto label_17;
    label_12:
        this.zzc(zze.zzc(arg2, Status.CREATOR), zze.zzc(arg2, Credential.CREATOR));
    label_17:
        arg3.writeNoException();
        return 1;
    }
}

