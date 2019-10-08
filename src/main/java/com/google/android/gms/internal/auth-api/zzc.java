package com.google.android.gms.internal.auth-api;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzc implements IInterface {
    private final IBinder zzc;
    private final String zzd;

    protected zzc(IBinder arg1, String arg2) {
        super();
        this.zzc = arg1;
        this.zzd = arg2;
    }

    public IBinder asBinder() {
        return this.zzc;
    }

    protected final Parcel obtainAndWriteInterfaceToken() {
        Parcel v0 = Parcel.obtain();
        v0.writeInterfaceToken(this.zzd);
        return v0;
    }

    protected final void transactAndReadExceptionReturnVoid(int arg4, Parcel arg5) throws RemoteException {
        Parcel v0 = Parcel.obtain();
        try {
            this.zzc.transact(arg4, arg5, v0, 0);
            v0.readException();
        }
        catch(Throwable v4) {
            arg5.recycle();
            v0.recycle();
            throw v4;
        }

        arg5.recycle();
        v0.recycle();
    }
}

