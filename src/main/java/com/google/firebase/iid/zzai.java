package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

final class zzai {
    private final Messenger zzal;
    private final zzl zzci;

    zzai(IBinder arg4) throws RemoteException {
        super();
        String v0 = arg4.getInterfaceDescriptor();
        zzl v2 = null;
        if("android.os.IMessenger".equals(v0)) {
            this.zzal = new Messenger(arg4);
            this.zzci = v2;
            return;
        }

        if("com.google.android.gms.iid.IMessengerCompat".equals(v0)) {
            this.zzci = new zzl(arg4);
            this.zzal = ((Messenger)v2);
            return;
        }

        String v4 = "Invalid interface descriptor: ";
        v0 = String.valueOf(v0);
        v4 = v0.length() != 0 ? v4.concat(v0) : new String(v4);
        Log.w("MessengerIpcClient", v4);
        throw new RemoteException();
    }

    final void send(Message arg2) throws RemoteException {
        if(this.zzal != null) {
            this.zzal.send(arg2);
            return;
        }

        if(this.zzci != null) {
            this.zzci.send(arg2);
            return;
        }

        throw new IllegalStateException("Both messengers are null");
    }
}

