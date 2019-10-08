package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.base.zaa;
import com.google.android.gms.internal.base.zac;

public final class zah extends zaa implements ISignInButtonCreator {
    zah(IBinder arg2) {
        super(arg2, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final IObjectWrapper newSignInButton(IObjectWrapper arg2, int arg3, int arg4) throws RemoteException {
        Parcel v0 = ((zaa)this).zaa();
        zac.zaa(v0, ((IInterface)arg2));
        v0.writeInt(arg3);
        v0.writeInt(arg4);
        Parcel v2 = ((zaa)this).zaa(1, v0);
        IObjectWrapper v3 = Stub.asInterface(v2.readStrongBinder());
        v2.recycle();
        return v3;
    }

    public final IObjectWrapper newSignInButtonFromConfig(IObjectWrapper arg2, SignInButtonConfig arg3) throws RemoteException {
        Parcel v0 = ((zaa)this).zaa();
        zac.zaa(v0, ((IInterface)arg2));
        zac.zaa(v0, ((Parcelable)arg3));
        Parcel v2 = ((zaa)this).zaa(2, v0);
        IObjectWrapper v3 = Stub.asInterface(v2.readStrongBinder());
        v2.recycle();
        return v3;
    }
}

