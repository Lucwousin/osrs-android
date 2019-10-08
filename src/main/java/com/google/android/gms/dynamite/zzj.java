package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzj extends zza implements zzi {
    zzj(IBinder arg2) {
        super(arg2, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int zza(IObjectWrapper arg2, String arg3, boolean arg4) throws RemoteException {
        Parcel v0 = ((zza)this).zza();
        zzc.zza(v0, ((IInterface)arg2));
        v0.writeString(arg3);
        zzc.writeBoolean(v0, arg4);
        Parcel v2 = ((zza)this).zza(3, v0);
        int v3 = v2.readInt();
        v2.recycle();
        return v3;
    }

    public final IObjectWrapper zza(IObjectWrapper arg2, String arg3, int arg4) throws RemoteException {
        Parcel v0 = ((zza)this).zza();
        zzc.zza(v0, ((IInterface)arg2));
        v0.writeString(arg3);
        v0.writeInt(arg4);
        Parcel v2 = ((zza)this).zza(2, v0);
        IObjectWrapper v3 = Stub.asInterface(v2.readStrongBinder());
        v2.recycle();
        return v3;
    }

    public final int zzaj() throws RemoteException {
        Parcel v0 = ((zza)this).zza(6, ((zza)this).zza());
        int v1 = v0.readInt();
        v0.recycle();
        return v1;
    }

    public final int zzb(IObjectWrapper arg2, String arg3, boolean arg4) throws RemoteException {
        Parcel v0 = ((zza)this).zza();
        zzc.zza(v0, ((IInterface)arg2));
        v0.writeString(arg3);
        zzc.writeBoolean(v0, arg4);
        Parcel v2 = ((zza)this).zza(5, v0);
        int v3 = v2.readInt();
        v2.recycle();
        return v3;
    }

    public final IObjectWrapper zzb(IObjectWrapper arg2, String arg3, int arg4) throws RemoteException {
        Parcel v0 = ((zza)this).zza();
        zzc.zza(v0, ((IInterface)arg2));
        v0.writeString(arg3);
        v0.writeInt(arg4);
        Parcel v2 = ((zza)this).zza(4, v0);
        IObjectWrapper v3 = Stub.asInterface(v2.readStrongBinder());
        v2.recycle();
        return v3;
    }
}

