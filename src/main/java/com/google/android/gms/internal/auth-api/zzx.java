package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.auth.api.credentials.CredentialRequest;

public final class zzx extends zzc implements zzw {
    zzx(IBinder arg2) {
        super(arg2, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    public final void zzc(zzu arg2) throws RemoteException {
        Parcel v0 = ((zzc)this).obtainAndWriteInterfaceToken();
        zze.zzc(v0, ((IInterface)arg2));
        ((zzc)this).transactAndReadExceptionReturnVoid(4, v0);
    }

    public final void zzc(zzu arg2, CredentialRequest arg3) throws RemoteException {
        Parcel v0 = ((zzc)this).obtainAndWriteInterfaceToken();
        zze.zzc(v0, ((IInterface)arg2));
        zze.zzc(v0, ((Parcelable)arg3));
        ((zzc)this).transactAndReadExceptionReturnVoid(1, v0);
    }

    public final void zzc(zzu arg2, zzs arg3) throws RemoteException {
        Parcel v0 = ((zzc)this).obtainAndWriteInterfaceToken();
        zze.zzc(v0, ((IInterface)arg2));
        zze.zzc(v0, ((Parcelable)arg3));
        ((zzc)this).transactAndReadExceptionReturnVoid(3, v0);
    }

    public final void zzc(zzu arg2, zzy arg3) throws RemoteException {
        Parcel v0 = ((zzc)this).obtainAndWriteInterfaceToken();
        zze.zzc(v0, ((IInterface)arg2));
        zze.zzc(v0, ((Parcelable)arg3));
        ((zzc)this).transactAndReadExceptionReturnVoid(2, v0);
    }
}

