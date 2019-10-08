package com.google.android.gms.common.internal.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zam extends zaa implements zal {
    zam(IBinder arg2) {
        super(arg2, "com.google.android.gms.common.internal.service.ICommonService");
    }

    public final void zaa(zaj arg2) throws RemoteException {
        Parcel v0 = ((zaa)this).zaa();
        zac.zaa(v0, ((IInterface)arg2));
        ((zaa)this).zac(1, v0);
    }
}

