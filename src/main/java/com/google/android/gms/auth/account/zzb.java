package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.auth.zzc;

public abstract class zzb extends com.google.android.gms.internal.auth.zzb implements zza {
    public zzb() {
        super("com.google.android.gms.auth.account.IWorkAccountCallback");
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
        this.zza(zzc.zza(arg2));
        return 1;
    label_6:
        this.zzc(zzc.zza(arg2, Account.CREATOR));
        return 1;
    }
}

