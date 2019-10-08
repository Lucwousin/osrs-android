package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.proxy.ProxyResponse;

public abstract class zzam extends zzb implements zzal {
    public zzam() {
        super("com.google.android.gms.auth.api.internal.IAuthCallbacks");
    }

    protected final boolean dispatchTransaction(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException {
        switch(arg1) {
            case 1: {
                goto label_6;
            }
            case 2: {
                goto label_3;
            }
        }

        return 0;
    label_3:
        this.zzb(arg2.readString());
        goto label_9;
    label_6:
        this.zza(zzc.zza(arg2, ProxyResponse.CREATOR));
    label_9:
        arg3.writeNoException();
        return 1;
    }
}

