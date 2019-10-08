package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public interface ICustomTabsService extends IInterface {
    public abstract class Stub extends Binder implements ICustomTabsService {
        class Proxy implements ICustomTabsService {
            private IBinder mRemote;

            Proxy(IBinder arg1) {
                super();
                this.mRemote = arg1;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public Bundle extraCommand(String arg4, Bundle arg5) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
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
                    if(v1.readInt() != 0) {
                        Object v4_1 = Bundle.CREATOR.createFromParcel(v1);
                    }
                    else {
                        goto label_21;
                    }

                    goto label_22;
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

            label_21:
                Bundle v4_2 = null;
            label_22:
                v1.recycle();
                v0.recycle();
                return v4_2;
            }

            public String getInterfaceDescriptor() {
                return "android.support.customtabs.ICustomTabsService";
            }

            public boolean mayLaunchUrl(ICustomTabsCallback arg4, Uri arg5, Bundle arg6, List arg7) throws RemoteException {
                boolean v4_2;
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    IBinder v4_1 = arg4 != null ? arg4.asBinder() : null;
                    v0.writeStrongBinder(v4_1);
                    v4_2 = true;
                    if(arg5 != null) {
                        v0.writeInt(1);
                        arg5.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    if(arg6 != null) {
                        v0.writeInt(1);
                        arg6.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    v0.writeTypedList(arg7);
                    this.mRemote.transact(4, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() == 0) {
                        goto label_29;
                    }
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                goto label_30;
            label_29:
                v4_2 = false;
            label_30:
                v1.recycle();
                v0.recycle();
                return v4_2;
            }

            public boolean newSession(ICustomTabsCallback arg5) throws RemoteException {
                boolean v3;
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    IBinder v5_1 = arg5 != null ? arg5.asBinder() : null;
                    v0.writeStrongBinder(v5_1);
                    v3 = false;
                    this.mRemote.transact(3, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() == 0) {
                        goto label_17;
                    }
                }
                catch(Throwable v5) {
                    v1.recycle();
                    v0.recycle();
                    throw v5;
                }

                v3 = true;
            label_17:
                v1.recycle();
                v0.recycle();
                return v3;
            }

            public int postMessage(ICustomTabsCallback arg4, String arg5, Bundle arg6) throws RemoteException {
                int v4_2;
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    IBinder v4_1 = arg4 != null ? arg4.asBinder() : null;
                    v0.writeStrongBinder(v4_1);
                    v0.writeString(arg5);
                    if(arg6 != null) {
                        v0.writeInt(1);
                        arg6.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(8, v0, v1, 0);
                    v1.readException();
                    v4_2 = v1.readInt();
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                v1.recycle();
                v0.recycle();
                return v4_2;
            }

            public boolean requestPostMessageChannel(ICustomTabsCallback arg5, Uri arg6) throws RemoteException {
                boolean v5_2;
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    IBinder v5_1 = arg5 != null ? arg5.asBinder() : null;
                    v0.writeStrongBinder(v5_1);
                    v5_2 = true;
                    if(arg6 != null) {
                        v0.writeInt(1);
                        arg6.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(7, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() == 0) {
                        goto label_23;
                    }
                }
                catch(Throwable v5) {
                    v1.recycle();
                    v0.recycle();
                    throw v5;
                }

                goto label_24;
            label_23:
                v5_2 = false;
            label_24:
                v1.recycle();
                v0.recycle();
                return v5_2;
            }

            public boolean updateVisuals(ICustomTabsCallback arg5, Bundle arg6) throws RemoteException {
                boolean v5_2;
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    IBinder v5_1 = arg5 != null ? arg5.asBinder() : null;
                    v0.writeStrongBinder(v5_1);
                    v5_2 = true;
                    if(arg6 != null) {
                        v0.writeInt(1);
                        arg6.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(6, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() == 0) {
                        goto label_23;
                    }
                }
                catch(Throwable v5) {
                    v1.recycle();
                    v0.recycle();
                    throw v5;
                }

                goto label_24;
            label_23:
                v5_2 = false;
            label_24:
                v1.recycle();
                v0.recycle();
                return v5_2;
            }

            public boolean validateRelationship(ICustomTabsCallback arg4, int arg5, Uri arg6, Bundle arg7) throws RemoteException {
                boolean v4_2;
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    IBinder v4_1 = arg4 != null ? arg4.asBinder() : null;
                    v0.writeStrongBinder(v4_1);
                    v0.writeInt(arg5);
                    v4_2 = true;
                    if(arg6 != null) {
                        v0.writeInt(1);
                        arg6.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    if(arg7 != null) {
                        v0.writeInt(1);
                        arg7.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(9, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() == 0) {
                        goto label_29;
                    }
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                goto label_30;
            label_29:
                v4_2 = false;
            label_30:
                v1.recycle();
                v0.recycle();
                return v4_2;
            }

            public boolean warmup(long arg4) throws RemoteException {
                boolean v2;
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    v0.writeLong(arg4);
                    v2 = false;
                    this.mRemote.transact(2, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() == 0) {
                        goto label_13;
                    }
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                v2 = true;
            label_13:
                v1.recycle();
                v0.recycle();
                return v2;
            }
        }

        private static final String DESCRIPTOR = "android.support.customtabs.ICustomTabsService";
        static final int TRANSACTION_extraCommand = 5;
        static final int TRANSACTION_mayLaunchUrl = 4;
        static final int TRANSACTION_newSession = 3;
        static final int TRANSACTION_postMessage = 8;
        static final int TRANSACTION_requestPostMessageChannel = 7;
        static final int TRANSACTION_updateVisuals = 6;
        static final int TRANSACTION_validateRelationship = 9;
        static final int TRANSACTION_warmup = 2;

        public Stub() {
            super();
            this.attachInterface(((IInterface)this), "android.support.customtabs.ICustomTabsService");
        }

        public IBinder asBinder() {
            return this;
        }

        public static ICustomTabsService asInterface(IBinder arg2) {
            if(arg2 == null) {
                return null;
            }

            IInterface v0 = arg2.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if(v0 != null && ((v0 instanceof ICustomTabsService))) {
                return ((ICustomTabsService)v0);
            }

            return new Proxy(arg2);
        }

        public boolean onTransact(int arg5, Parcel arg6, Parcel arg7, int arg8) throws RemoteException {
            Object v2;
            Uri v8_1;
            Object v0_1;
            if(arg5 == 0x5F4E5446) {
                goto label_119;
            }

            Bundle v0 = null;
            switch(arg5) {
                case 2: {
                    goto label_112;
                }
                case 3: {
                    goto label_104;
                }
                case 4: {
                    goto label_84;
                }
                case 5: {
                    goto label_67;
                }
                case 6: {
                    goto label_54;
                }
                case 7: {
                    goto label_41;
                }
                case 8: {
                    goto label_27;
                }
                case 9: {
                    goto label_7;
                }
            }

            return super.onTransact(arg5, arg6, arg7, arg8);
        label_67:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsService");
            String v5 = arg6.readString();
            if(arg6.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg6);
            }

            Bundle v5_1 = this.extraCommand(v5, ((Bundle)v0_1));
            arg7.writeNoException();
            if(v5_1 != null) {
                arg7.writeInt(1);
                v5_1.writeToParcel(arg7, 1);
            }
            else {
                arg7.writeInt(0);
            }

            return 1;
        label_84:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsService");
            ICustomTabsCallback v5_2 = android.support.customtabs.ICustomTabsCallback$Stub.asInterface(arg6.readStrongBinder());
            if(arg6.readInt() != 0) {
                Object v8 = Uri.CREATOR.createFromParcel(arg6);
            }
            else {
                v8_1 = ((Uri)v0);
            }

            if(arg6.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg6);
            }

            boolean v5_3 = this.mayLaunchUrl(v5_2, v8_1, ((Bundle)v0_1), arg6.createTypedArrayList(Bundle.CREATOR));
            arg7.writeNoException();
            arg7.writeInt(((int)v5_3));
            return 1;
        label_54:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsService");
            v5_2 = android.support.customtabs.ICustomTabsCallback$Stub.asInterface(arg6.readStrongBinder());
            if(arg6.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg6);
            }

            v5_3 = this.updateVisuals(v5_2, ((Bundle)v0_1));
            arg7.writeNoException();
            arg7.writeInt(((int)v5_3));
            return 1;
        label_7:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsService");
            v5_2 = android.support.customtabs.ICustomTabsCallback$Stub.asInterface(arg6.readStrongBinder());
            arg8 = arg6.readInt();
            if(arg6.readInt() != 0) {
                v2 = Uri.CREATOR.createFromParcel(arg6);
            }
            else {
                Uri v2_1 = ((Uri)v0);
            }

            if(arg6.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg6);
            }

            v5_3 = this.validateRelationship(v5_2, arg8, ((Uri)v2), ((Bundle)v0_1));
            arg7.writeNoException();
            arg7.writeInt(((int)v5_3));
            return 1;
        label_104:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsService");
            v5_3 = this.newSession(android.support.customtabs.ICustomTabsCallback$Stub.asInterface(arg6.readStrongBinder()));
            arg7.writeNoException();
            arg7.writeInt(((int)v5_3));
            return 1;
        label_41:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsService");
            v5_2 = android.support.customtabs.ICustomTabsCallback$Stub.asInterface(arg6.readStrongBinder());
            if(arg6.readInt() != 0) {
                v0_1 = Uri.CREATOR.createFromParcel(arg6);
            }

            v5_3 = this.requestPostMessageChannel(v5_2, ((Uri)v0_1));
            arg7.writeNoException();
            arg7.writeInt(((int)v5_3));
            return 1;
        label_27:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsService");
            v5_2 = android.support.customtabs.ICustomTabsCallback$Stub.asInterface(arg6.readStrongBinder());
            String v8_2 = arg6.readString();
            if(arg6.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg6);
            }

            arg5 = this.postMessage(v5_2, v8_2, ((Bundle)v0_1));
            arg7.writeNoException();
            arg7.writeInt(arg5);
            return 1;
        label_112:
            arg6.enforceInterface("android.support.customtabs.ICustomTabsService");
            v5_3 = this.warmup(arg6.readLong());
            arg7.writeNoException();
            arg7.writeInt(((int)v5_3));
            return 1;
        label_119:
            arg7.writeString("android.support.customtabs.ICustomTabsService");
            return 1;
        }
    }

    Bundle extraCommand(String arg1, Bundle arg2) throws RemoteException;

    boolean mayLaunchUrl(ICustomTabsCallback arg1, Uri arg2, Bundle arg3, List arg4) throws RemoteException;

    boolean newSession(ICustomTabsCallback arg1) throws RemoteException;

    int postMessage(ICustomTabsCallback arg1, String arg2, Bundle arg3) throws RemoteException;

    boolean requestPostMessageChannel(ICustomTabsCallback arg1, Uri arg2) throws RemoteException;

    boolean updateVisuals(ICustomTabsCallback arg1, Bundle arg2) throws RemoteException;

    boolean validateRelationship(ICustomTabsCallback arg1, int arg2, Uri arg3, Bundle arg4) throws RemoteException;

    boolean warmup(long arg1) throws RemoteException;
}

