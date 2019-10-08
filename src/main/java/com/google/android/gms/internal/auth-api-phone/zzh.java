package com.google.android.gms.internal.auth-api-phone;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

public abstract class zzh extends zzb implements zzg {
    public zzh() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    protected final boolean dispatchTransaction(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException {
        if(arg1 == 1) {
            this.zza(zzc.zza(arg2, Status.CREATOR));
            return 1;
        }

        return 0;
    }
}

