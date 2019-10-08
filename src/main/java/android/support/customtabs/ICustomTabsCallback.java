package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface ICustomTabsCallback extends IInterface {
    public abstract class Stub extends Binder implements ICustomTabsCallback {
        class Proxy implements ICustomTabsCallback {
            private IBinder mRemote;

            Proxy(IBinder arg1) {
                super();
                this.mRemote = arg1;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public void extraCallback(String arg4, Bundle arg5) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    v0.writeString(arg4);
                    if(arg5 != null) {
                        v0.writeInt(1);
                        arg5.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(3, v0, v1, 0);
                    v1.readException();
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                v1.recycle();
                v0.recycle();
            }

            public String getInterfaceDescriptor() {
                return "android.support.customtabs.ICustomTabsCallback";
            }

            public void onMessageChannelReady(Bundle arg5) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    if(arg5 != null) {
                        v0.writeInt(1);
                        arg5.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(4, v0, v1, 0);
                    v1.readException();
                }
                catch(Throwable v5) {
                    v1.recycle();
                    v0.recycle();
                    throw v5;
                }

                v1.recycle();
                v0.recycle();
            }

            public void onNavigationEvent(int arg4, Bundle arg5) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    v0.writeInt(arg4);
                    if(arg5 != null) {
                        v0.writeInt(1);
                        arg5.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(2, v0, v1, 0);
                    v1.readException();
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                v1.recycle();
                v0.recycle();
            }

            public void onPostMessage(String arg4, Bundle arg5) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    v0.writeString(arg4);
                    if(arg5 != null) {
                        v0.writeInt(1);
                        arg5.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(5, v0, v1, 0);
                    v1.readException();
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                v1.recycle();
                v0.recycle();
            }

            public void onRelationshipValidationResult(int arg4, Uri arg5, boolean arg6, Bundle arg7) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsCallback");
                    v0.writeInt(arg4);
                    if(arg5 != null) {
                        v0.writeInt(1);
                        arg5.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    v0.writeInt(((int)arg6));
                    if(arg7 != null) {
                        v0.writeInt(1);
                        arg7.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(6, v0, v1, 0);
                    v1.readException();
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                v1.recycle();
                v0.recycle();
            }
        }

        private static final String DESCRIPTOR = "android.support.customtabs.ICustomTabsCallback";
        static final int TRANSACTION_extraCallback = 3;
        static final int TRANSACTION_onMessageChannelReady = 4;
        static final int TRANSACTION_onNavigationEvent = 2;
        static final int TRANSACTION_onPostMessage = 5;
        static final int TRANSACTION_onRelationshipValidationResult = 6;

        public Stub() {
            super();
            this.attachInterface(((IInterface)this), "android.support.customtabs.ICustomTabsCallback");
        }

        public IBinder asBinder() {
            return this;
        }

        public static ICustomTabsCallback asInterface(IBinder arg2) {
            if(arg2 == null) {
                return null;
            }

            IInterface v0 = arg2.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
            if(v0 != null && ((v0 instanceof ICustomTabsCallback))) {
                return ((ICustomTabsCallback)v0);
            }

            return new Proxy(arg2);
        }

        public boolean onTransact(int arg5, Parcel arg6, Parcel arg7, int arg8) throws RemoteException {
            Object v8;
            Object v0_1;
            if(arg5 == 0x5F4E5446) {
                goto label_72;
            }

            Bundle v0 = null;
            switch(arg5) {
                case 2: {
                    goto label_61;
                }
                case 3: {
                    goto label_50;
                }
                case 4: {
                    goto label_40;
                }
                case 5: {
                    goto label_29;
                }
                case 6: {
                    goto label_7;
                }
            }

            return super.onTransact(arg5, arg6, arg7, arg8);
        label_50:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            String v5 = arg6.readString();
            if(arg6.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg6);
            }

            this.extraCallback(v5, ((Bundle)v0_1));
            arg7.writeNoException();
            return 1;
        label_7:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            arg5 = arg6.readInt();
            if(arg6.readInt() != 0) {
                v8 = Uri.CREATOR.createFromParcel(arg6);
            }
            else {
                Uri v8_1 = ((Uri)v0);
            }

            boolean v2 = arg6.readInt() != 0 ? true : false;
            if(arg6.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg6);
            }

            this.onRelationshipValidationResult(arg5, ((Uri)v8), v2, ((Bundle)v0_1));
            arg7.writeNoException();
            return 1;
        label_40:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            if(arg6.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg6);
            }

            this.onMessageChannelReady(((Bundle)v0_1));
            arg7.writeNoException();
            return 1;
        label_61:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            arg5 = arg6.readInt();
            if(arg6.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg6);
            }

            this.onNavigationEvent(arg5, ((Bundle)v0_1));
            arg7.writeNoException();
            return 1;
        label_29:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsCallback");
            v5 = arg6.readString();
            if(arg6.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg6);
            }

            this.onPostMessage(v5, ((Bundle)v0_1));
            arg7.writeNoException();
            return 1;
        label_72:
            arg7.writeString("android.support.customtabs.ICustomTabsCallback");
            return 1;
        }
    }

    void extraCallback(String arg1, Bundle arg2) throws RemoteException;

    void onMessageChannelReady(Bundle arg1) throws RemoteException;

    void onNavigationEvent(int arg1, Bundle arg2) throws RemoteException;

    void onPostMessage(String arg1, Bundle arg2) throws RemoteException;

    void onRelationshipValidationResult(int arg1, Uri arg2, boolean arg3, Bundle arg4) throws RemoteException;
}

