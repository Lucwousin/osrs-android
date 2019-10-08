package com.google.android.finsky.externalreferrer;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IGetInstallReferrerService extends IInterface {
    public abstract class Stub extends Binder implements IGetInstallReferrerService {
        class Proxy implements IGetInstallReferrerService {
            private IBinder mRemote;

            Proxy(IBinder arg1) {
                super();
                this.mRemote = arg1;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public Bundle getInstallReferrer(Bundle arg5) throws RemoteException {
                Object v5_1;
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if(arg5 != null) {
                        v0.writeInt(1);
                        arg5.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(1, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() != 0) {
                        v5_1 = Bundle.CREATOR.createFromParcel(v1);
                    }
                    else {
                        goto label_19;
                    }

                    goto label_20;
                }
                catch(Throwable v5) {
                    v1.recycle();
                    v0.recycle();
                    throw v5;
                }

            label_19:
                arg5 = null;
            label_20:
                v1.recycle();
                v0.recycle();
                return ((Bundle)v5_1);
            }

            public String getInterfaceDescriptor() {
                return "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
            }
        }

        private static final String DESCRIPTOR = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";
        static final int TRANSACTION_getInstallReferrer = 1;

        public Stub() {
            super();
            this.attachInterface(((IInterface)this), "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        }

        public IBinder asBinder() {
            return this;
        }

        public static IGetInstallReferrerService asInterface(IBinder arg2) {
            if(arg2 == null) {
                return null;
            }

            IInterface v0 = arg2.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if(v0 != null && ((v0 instanceof IGetInstallReferrerService))) {
                return ((IGetInstallReferrerService)v0);
            }

            return new Proxy(arg2);
        }

        public boolean onTransact(int arg3, Parcel arg4, Parcel arg5, int arg6) throws RemoteException {
            Bundle v3_1;
            Object v3;
            if(arg3 != 1) {
                if(arg3 != 0x5F4E5446) {
                    return super.onTransact(arg3, arg4, arg5, arg6);
                }

                arg5.writeString("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                return 1;
            }

            arg4.enforceInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if(arg4.readInt() != 0) {
                v3 = Bundle.CREATOR.createFromParcel(arg4);
            }
            else {
                v3_1 = null;
            }

            v3_1 = this.getInstallReferrer(((Bundle)v3));
            arg5.writeNoException();
            if(v3_1 != null) {
                arg5.writeInt(1);
                v3_1.writeToParcel(arg5, 1);
            }
            else {
                arg5.writeInt(0);
            }

            return 1;
        }
    }

    Bundle getInstallReferrer(Bundle arg1) throws RemoteException;
}

