package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth-api.zzd;

public abstract class zzr extends zzd implements zzq {
    public zzr() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    protected final boolean dispatchTransaction(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException {
        switch(arg1) {
            case 1: {
                goto label_5;
            }
            case 2: {
                goto label_3;
            }
        }

        return 0;
    label_3:
        this.zzk();
        return 1;
    label_5:
        this.zzj();
        return 1;
    }
}

