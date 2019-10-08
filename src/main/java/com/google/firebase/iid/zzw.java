package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzw implements zzv {
    private final IBinder zzbs;

    zzw(IBinder arg1) {
        super();
        this.zzbs = arg1;
    }

    public final IBinder asBinder() {
        return this.zzbs;
    }

    public final void send(Message arg4) throws RemoteException {
        Parcel v0 = Parcel.obtain();
        v0.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        v0.writeInt(1);
        arg4.writeToParcel(v0, 0);
        try {
            this.zzbs.transact(1, v0, null, 1);
        }
        catch(Throwable v4) {
            v0.recycle();
            throw v4;
        }

        v0.recycle();
    }
}

