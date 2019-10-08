package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;

public final class zzk extends zza implements zzi {
    zzk(IBinder arg2) {
        super(arg2, "com.google.android.gms.common.internal.ICertData");
    }

    public final IObjectWrapper zzb() throws RemoteException {
        Parcel v0 = ((zza)this).zza(1, ((zza)this).zza());
        IObjectWrapper v1 = Stub.asInterface(v0.readStrongBinder());
        v0.recycle();
        return v1;
    }

    public final int zzc() throws RemoteException {
        Parcel v0 = ((zza)this).zza(2, ((zza)this).zza());
        int v1 = v0.readInt();
        v0.recycle();
        return v1;
    }
}

