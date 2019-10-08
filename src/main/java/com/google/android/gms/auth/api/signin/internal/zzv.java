package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.auth-api.zzc;
import com.google.android.gms.internal.auth-api.zze;

public final class zzv extends zzc implements zzu {
    zzv(IBinder arg2) {
        super(arg2, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zzc(zzs arg2, GoogleSignInOptions arg3) throws RemoteException {
        Parcel v0 = ((zzc)this).obtainAndWriteInterfaceToken();
        zze.zzc(v0, ((IInterface)arg2));
        zze.zzc(v0, ((Parcelable)arg3));
        ((zzc)this).transactAndReadExceptionReturnVoid(101, v0);
    }

    public final void zzd(zzs arg2, GoogleSignInOptions arg3) throws RemoteException {
        Parcel v0 = ((zzc)this).obtainAndWriteInterfaceToken();
        zze.zzc(v0, ((IInterface)arg2));
        zze.zzc(v0, ((Parcelable)arg3));
        ((zzc)this).transactAndReadExceptionReturnVoid(102, v0);
    }

    public final void zze(zzs arg2, GoogleSignInOptions arg3) throws RemoteException {
        Parcel v0 = ((zzc)this).obtainAndWriteInterfaceToken();
        zze.zzc(v0, ((IInterface)arg2));
        zze.zzc(v0, ((Parcelable)arg3));
        ((zzc)this).transactAndReadExceptionReturnVoid(103, v0);
    }
}

