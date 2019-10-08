package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

public final class zzl extends zza implements IGmsCallbacks {
    zzl(IBinder arg2) {
        super(arg2, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void onPostInitComplete(int arg2, IBinder arg3, Bundle arg4) throws RemoteException {
        Parcel v0 = ((zza)this).zza();
        v0.writeInt(arg2);
        v0.writeStrongBinder(arg3);
        zzc.zza(v0, ((Parcelable)arg4));
        ((zza)this).zzb(1, v0);
    }

    public final void zza(int arg2, Bundle arg3) throws RemoteException {
        Parcel v0 = ((zza)this).zza();
        v0.writeInt(arg2);
        zzc.zza(v0, ((Parcelable)arg3));
        ((zza)this).zzb(2, v0);
    }

    public final void zza(int arg2, IBinder arg3, zzb arg4) throws RemoteException {
        Parcel v0 = ((zza)this).zza();
        v0.writeInt(arg2);
        v0.writeStrongBinder(arg3);
        zzc.zza(v0, ((Parcelable)arg4));
        ((zza)this).zzb(3, v0);
    }
}

