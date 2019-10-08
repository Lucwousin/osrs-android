package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zag extends zaa implements zaf {
    zag(IBinder arg2) {
        super(arg2, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zaa(IAccountAccessor arg2, int arg3, boolean arg4) throws RemoteException {
        Parcel v0 = ((zaa)this).zaa();
        zac.zaa(v0, ((IInterface)arg2));
        v0.writeInt(arg3);
        zac.writeBoolean(v0, arg4);
        ((zaa)this).zab(9, v0);
    }

    public final void zaa(zah arg2, zad arg3) throws RemoteException {
        Parcel v0 = ((zaa)this).zaa();
        zac.zaa(v0, ((Parcelable)arg2));
        zac.zaa(v0, ((IInterface)arg3));
        ((zaa)this).zab(12, v0);
    }

    public final void zam(int arg2) throws RemoteException {
        Parcel v0 = ((zaa)this).zaa();
        v0.writeInt(arg2);
        ((zaa)this).zab(7, v0);
    }
}

