package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public class zaa implements IInterface {
    private final IBinder zaa;
    private final String zab;

    protected zaa(IBinder arg1, String arg2) {
        super();
        this.zaa = arg1;
        this.zab = arg2;
    }

    public IBinder asBinder() {
        return this.zaa;
    }

    protected final Parcel zaa() {
        Parcel v0 = Parcel.obtain();
        v0.writeInterfaceToken(this.zab);
        return v0;
    }

    protected final Parcel zaa(int arg4, Parcel arg5) throws RemoteException {
        Parcel v0 = Parcel.obtain();
        try {
            this.zaa.transact(arg4, arg5, v0, 0);
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

    protected final void zab(int arg4, Parcel arg5) throws RemoteException {
        Parcel v0 = Parcel.obtain();
        try {
            this.zaa.transact(arg4, arg5, v0, 0);
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

    protected final void zac(int arg3, Parcel arg4) throws RemoteException {
        try {
            this.zaa.transact(1, arg4, null, 1);
        }
        catch(Throwable v3) {
            arg4.recycle();
            throw v3;
        }

        arg4.recycle();
    }
}

