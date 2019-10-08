package com.appsflyer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

final class f {
    final class b {
        private final String ˊ;
        private final boolean ˋ;

        b(String arg1, boolean arg2) {
            super();
            this.ˊ = arg1;
            this.ˋ = arg2;
        }

        public final String ˊ() {
            return this.ˊ;
        }

        final boolean ˏ() {
            return this.ˋ;
        }
    }

    final class c implements ServiceConnection {
        private final LinkedBlockingQueue ˊ;
        private boolean ˋ;

        c(byte arg1) {
            this();
        }

        private c() {
            super();
            this.ˋ = false;
            this.ˊ = new LinkedBlockingQueue(1);
        }

        public final void onServiceConnected(ComponentName arg1, IBinder arg2) {
            try {
                this.ˊ.put(arg2);
                return;
            }
            catch(InterruptedException ) {
                return;
            }
        }

        public final void onServiceDisconnected(ComponentName arg1) {
        }

        public final IBinder ˊ() throws InterruptedException {
            if(!this.ˋ) {
                this.ˋ = true;
                return this.ˊ.take();
            }

            throw new IllegalStateException();
        }
    }

    final class e implements IInterface {
        private IBinder ˊ;

        e(IBinder arg1) {
            super();
            this.ˊ = arg1;
        }

        public final IBinder asBinder() {
            return this.ˊ;
        }

        public final String ˊ() throws RemoteException {
            String v2_1;
            Parcel v0 = Parcel.obtain();
            Parcel v1 = Parcel.obtain();
            try {
                v0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.ˊ.transact(1, v0, v1, 0);
                v1.readException();
                v2_1 = v1.readString();
            }
            catch(Throwable v2) {
                v1.recycle();
                v0.recycle();
                throw v2;
            }

            v1.recycle();
            v0.recycle();
            return v2_1;
        }

        final boolean ˋ() throws RemoteException {
            boolean v2_1;
            Parcel v0 = Parcel.obtain();
            Parcel v1 = Parcel.obtain();
            try {
                v0.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                v2_1 = true;
                v0.writeInt(1);
                this.ˊ.transact(2, v0, v1, 0);
                v1.readException();
                if(v1.readInt() == 0) {
                    goto label_14;
                }
            }
            catch(Throwable v2) {
                v1.recycle();
                v0.recycle();
                throw v2;
            }

            goto label_15;
        label_14:
            v2_1 = false;
        label_15:
            v1.recycle();
            v0.recycle();
            return v2_1;
        }
    }

    f() {
        super();
    }

    static b ॱ(Context arg4) throws Exception {
        b v2;
        if(Looper.myLooper() == Looper.getMainLooper()) {
            goto label_42;
        }

        try {
            arg4.getPackageManager().getPackageInfo("com.android.vending", 0);
        }
        catch(Exception v4) {
            throw v4;
        }

        c v0 = new c(0);
        Intent v1 = new Intent("com.google.android.gms.ads.identifier.service.START");
        v1.setPackage("com.google.android.gms");
        try {
            if(!arg4.bindService(v1, ((ServiceConnection)v0), 1)) {
                goto label_27;
            }

            e v1_3 = new e(v0.ˊ());
            v2 = new b(v1_3.ˊ(), v1_3.ˋ());
            if(arg4 == null) {
                return v2;
            }
        }
        catch(Throwable v1_1) {
        }
        catch(Exception v1_2) {
            try {
                throw v1_2;
            }
            catch(Throwable v1_1) {
                if(arg4 != null) {
                    arg4.unbindService(((ServiceConnection)v0));
                }

                throw v1_1;
            }
        }

        arg4.unbindService(((ServiceConnection)v0));
        return v2;
    label_27:
        if(arg4 != null) {
            arg4.unbindService(((ServiceConnection)v0));
        }

        throw new IOException("Google Play connection failed");
    label_42:
        throw new IllegalStateException("Cannot be called from the main thread");
    }
}

