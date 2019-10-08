package com.google.android.gms.common.internal.service;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zab;

public abstract class zak extends zab implements zaj {
    public zak() {
        super("com.google.android.gms.common.internal.service.ICommonCallbacks");
    }

    protected boolean dispatchTransaction(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException {
        if(arg1 == 1) {
            this.zaj(arg2.readInt());
            arg3.writeNoException();
            return 1;
        }

        return 0;
    }
}

