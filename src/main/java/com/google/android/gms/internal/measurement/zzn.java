package com.google.android.gms.internal.measurement;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zzn implements IInterface {
    private final IBinder zzqi;
    private final String zzqj;

    protected zzn(IBinder arg1, String arg2) {
        super();
        this.zzqi = arg1;
        this.zzqj = arg2;
    }

    public IBinder asBinder() {
        return this.zzqi;
    }

    protected final Parcel obtainAndWriteInterfaceToken() {
        Parcel v0 = Parcel.obtain();
        v0.writeInterfaceToken(this.zzqj);
        return v0;
    }

    protected final Parcel transactAndReadException(int arg4, Parcel arg5) throws RemoteException {
        Parcel v0 = Parcel.obtain();
        try {
            this.zzqi.transact(arg4, arg5, v0, 0);
            v0.readException();
        }
        catch(Throwable v4) {
        }
        catch(RuntimeException v4_1) {
            try {
                v0.recycle();
                throw v4_1;
            }
            catch(Throwable v4) {
                arg5.recycle();
                throw v4;
            }
        }

        arg5.recycle();
        return v0;
    }

    protected final void transactAndReadExceptionReturnVoid(int arg4, Parcel arg5) throws RemoteException {
        Parcel v0 = Parcel.obtain();
        try {
            this.zzqi.transact(arg4, arg5, v0, 0);
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

    protected final void transactOneway(int arg3, Parcel arg4) throws RemoteException {
        try {
            this.zzqi.transact(1, arg4, null, 1);
        }
        catch(Throwable v3) {
            arg4.recycle();
            throw v3;
        }

        arg4.recycle();
    }
}

