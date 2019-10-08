package com.android.vending.billing;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

public interface IInAppBillingService extends IInterface {
    public abstract class Stub extends Binder implements IInAppBillingService {
        class Proxy implements IInAppBillingService {
            private IBinder mRemote;

            Proxy(IBinder arg1) {
                super();
                this.mRemote = arg1;
            }

            public IBinder asBinder() {
                return this.mRemote;
            }

            public int consumePurchase(int arg4, String arg5, String arg6) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    v0.writeInt(arg4);
                    v0.writeString(arg5);
                    v0.writeString(arg6);
                    this.mRemote.transact(5, v0, v1, 0);
                    v1.readException();
                    arg4 = v1.readInt();
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                v1.recycle();
                v0.recycle();
                return arg4;
            }

            public Bundle getBuyIntent(int arg4, String arg5, String arg6, String arg7, String arg8) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    v0.writeInt(arg4);
                    v0.writeString(arg5);
                    v0.writeString(arg6);
                    v0.writeString(arg7);
                    v0.writeString(arg8);
                    this.mRemote.transact(3, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() != 0) {
                        Object v4_1 = Bundle.CREATOR.createFromParcel(v1);
                    }
                    else {
                        goto label_19;
                    }

                    goto label_20;
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

            label_19:
                Bundle v4_2 = null;
            label_20:
                v1.recycle();
                v0.recycle();
                return v4_2;
            }

            public Bundle getBuyIntentExtraParams(int arg4, String arg5, String arg6, String arg7, String arg8, Bundle arg9) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    v0.writeInt(arg4);
                    v0.writeString(arg5);
                    v0.writeString(arg6);
                    v0.writeString(arg7);
                    v0.writeString(arg8);
                    if(arg9 != null) {
                        v0.writeInt(1);
                        arg9.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(8, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() != 0) {
                        Object v4_1 = Bundle.CREATOR.createFromParcel(v1);
                    }
                    else {
                        goto label_25;
                    }

                    goto label_26;
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

            label_25:
                Bundle v4_2 = null;
            label_26:
                v1.recycle();
                v0.recycle();
                return v4_2;
            }

            public Bundle getBuyIntentToReplaceSkus(int arg4, String arg5, List arg6, String arg7, String arg8, String arg9) throws RemoteException {
                Object v4_1;
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    v0.writeInt(arg4);
                    v0.writeString(arg5);
                    v0.writeStringList(arg6);
                    v0.writeString(arg7);
                    v0.writeString(arg8);
                    v0.writeString(arg9);
                    this.mRemote.transact(7, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() != 0) {
                        v4_1 = Bundle.CREATOR.createFromParcel(v1);
                    }
                    else {
                        goto label_20;
                    }

                    goto label_21;
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

            label_20:
                Bundle v4_2 = null;
            label_21:
                v1.recycle();
                v0.recycle();
                return ((Bundle)v4_1);
            }

            public String getInterfaceDescriptor() {
                return "com.android.vending.billing.IInAppBillingService";
            }

            public Bundle getPurchaseHistory(int arg4, String arg5, String arg6, String arg7, Bundle arg8) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    v0.writeInt(arg4);
                    v0.writeString(arg5);
                    v0.writeString(arg6);
                    v0.writeString(arg7);
                    if(arg8 != null) {
                        v0.writeInt(1);
                        arg8.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(9, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() != 0) {
                        Object v4_1 = Bundle.CREATOR.createFromParcel(v1);
                    }
                    else {
                        goto label_24;
                    }

                    goto label_25;
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

            label_24:
                Bundle v4_2 = null;
            label_25:
                v1.recycle();
                v0.recycle();
                return v4_2;
            }

            public Bundle getPurchases(int arg4, String arg5, String arg6, String arg7) throws RemoteException {
                Object v4_1;
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    v0.writeInt(arg4);
                    v0.writeString(arg5);
                    v0.writeString(arg6);
                    v0.writeString(arg7);
                    this.mRemote.transact(4, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() != 0) {
                        v4_1 = Bundle.CREATOR.createFromParcel(v1);
                    }
                    else {
                        goto label_18;
                    }

                    goto label_19;
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

            label_18:
                Bundle v4_2 = null;
            label_19:
                v1.recycle();
                v0.recycle();
                return ((Bundle)v4_1);
            }

            public Bundle getSkuDetails(int arg4, String arg5, String arg6, Bundle arg7) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    v0.writeInt(arg4);
                    v0.writeString(arg5);
                    v0.writeString(arg6);
                    if(arg7 != null) {
                        v0.writeInt(1);
                        arg7.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(2, v0, v1, 0);
                    v1.readException();
                    if(v1.readInt() != 0) {
                        Object v4_1 = Bundle.CREATOR.createFromParcel(v1);
                    }
                    else {
                        goto label_23;
                    }

                    goto label_24;
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

            label_23:
                Bundle v4_2 = null;
            label_24:
                v1.recycle();
                v0.recycle();
                return v4_2;
            }

            public int isBillingSupported(int arg4, String arg5, String arg6) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    v0.writeInt(arg4);
                    v0.writeString(arg5);
                    v0.writeString(arg6);
                    this.mRemote.transact(1, v0, v1, 0);
                    v1.readException();
                    arg4 = v1.readInt();
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                v1.recycle();
                v0.recycle();
                return arg4;
            }

            public int isBillingSupportedExtraParams(int arg4, String arg5, String arg6, Bundle arg7) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    v0.writeInt(arg4);
                    v0.writeString(arg5);
                    v0.writeString(arg6);
                    if(arg7 != null) {
                        v0.writeInt(1);
                        arg7.writeToParcel(v0, 0);
                    }
                    else {
                        v0.writeInt(0);
                    }

                    this.mRemote.transact(10, v0, v1, 0);
                    v1.readException();
                    arg4 = v1.readInt();
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                v1.recycle();
                v0.recycle();
                return arg4;
            }

            public int stub(int arg4, String arg5, String arg6) throws RemoteException {
                Parcel v0 = Parcel.obtain();
                Parcel v1 = Parcel.obtain();
                try {
                    v0.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                    v0.writeInt(arg4);
                    v0.writeString(arg5);
                    v0.writeString(arg6);
                    this.mRemote.transact(6, v0, v1, 0);
                    v1.readException();
                    arg4 = v1.readInt();
                }
                catch(Throwable v4) {
                    v1.recycle();
                    v0.recycle();
                    throw v4;
                }

                v1.recycle();
                v0.recycle();
                return arg4;
            }
        }

        private static final String DESCRIPTOR = "com.android.vending.billing.IInAppBillingService";
        static final int TRANSACTION_consumePurchase = 5;
        static final int TRANSACTION_getBuyIntent = 3;
        static final int TRANSACTION_getBuyIntentExtraParams = 8;
        static final int TRANSACTION_getBuyIntentToReplaceSkus = 7;
        static final int TRANSACTION_getPurchaseHistory = 9;
        static final int TRANSACTION_getPurchases = 4;
        static final int TRANSACTION_getSkuDetails = 2;
        static final int TRANSACTION_isBillingSupported = 1;
        static final int TRANSACTION_isBillingSupportedExtraParams = 10;
        static final int TRANSACTION_stub = 6;

        public Stub() {
            super();
            this.attachInterface(((IInterface)this), "com.android.vending.billing.IInAppBillingService");
        }

        public IBinder asBinder() {
            return this;
        }

        public static IInAppBillingService asInterface(IBinder arg2) {
            if(arg2 == null) {
                return null;
            }

            IInterface v0 = arg2.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            if(v0 != null && ((v0 instanceof IInAppBillingService))) {
                return ((IInAppBillingService)v0);
            }

            return new Proxy(arg2);
        }

        public boolean onTransact(int arg11, Parcel arg12, Parcel arg13, int arg14) throws RemoteException {
            Object v0_1;
            if(arg11 == 0x5F4E5446) {
                goto label_157;
            }

            Bundle v0 = null;
            switch(arg11) {
                case 1: {
                    goto label_148;
                }
                case 2: {
                    goto label_130;
                }
                case 3: {
                    goto label_114;
                }
                case 4: {
                    goto label_100;
                }
                case 5: {
                    goto label_91;
                }
                case 6: {
                    goto label_82;
                }
                case 7: {
                    goto label_65;
                }
                case 8: {
                    goto label_43;
                }
                case 9: {
                    goto label_22;
                }
                case 10: {
                    goto label_8;
                }
            }

            return super.onTransact(arg11, arg12, arg13, arg14);
        label_65:
            arg12.enforceInterface("com.android.vending.billing.IInAppBillingService");
            Bundle v11 = this.getBuyIntentToReplaceSkus(arg12.readInt(), arg12.readString(), arg12.createStringArrayList(), arg12.readString(), arg12.readString(), arg12.readString());
            arg13.writeNoException();
            if(v11 != null) {
                arg13.writeInt(1);
                v11.writeToParcel(arg13, 1);
            }
            else {
                arg13.writeInt(0);
            }

            return 1;
        label_130:
            arg12.enforceInterface("com.android.vending.billing.IInAppBillingService");
            arg11 = arg12.readInt();
            String v14 = arg12.readString();
            String v3 = arg12.readString();
            if(arg12.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg12);
            }

            v11 = this.getSkuDetails(arg11, v14, v3, ((Bundle)v0_1));
            arg13.writeNoException();
            if(v11 != null) {
                arg13.writeInt(1);
                v11.writeToParcel(arg13, 1);
            }
            else {
                arg13.writeInt(0);
            }

            return 1;
        label_114:
            arg12.enforceInterface("com.android.vending.billing.IInAppBillingService");
            v11 = this.getBuyIntent(arg12.readInt(), arg12.readString(), arg12.readString(), arg12.readString(), arg12.readString());
            arg13.writeNoException();
            if(v11 != null) {
                arg13.writeInt(1);
                v11.writeToParcel(arg13, 1);
            }
            else {
                arg13.writeInt(0);
            }

            return 1;
        label_82:
            arg12.enforceInterface("com.android.vending.billing.IInAppBillingService");
            arg11 = this.stub(arg12.readInt(), arg12.readString(), arg12.readString());
            arg13.writeNoException();
            arg13.writeInt(arg11);
            return 1;
        label_148:
            arg12.enforceInterface("com.android.vending.billing.IInAppBillingService");
            arg11 = this.isBillingSupported(arg12.readInt(), arg12.readString(), arg12.readString());
            arg13.writeNoException();
            arg13.writeInt(arg11);
            return 1;
        label_100:
            arg12.enforceInterface("com.android.vending.billing.IInAppBillingService");
            v11 = this.getPurchases(arg12.readInt(), arg12.readString(), arg12.readString(), arg12.readString());
            arg13.writeNoException();
            if(v11 != null) {
                arg13.writeInt(1);
                v11.writeToParcel(arg13, 1);
            }
            else {
                arg13.writeInt(0);
            }

            return 1;
        label_22:
            arg12.enforceInterface("com.android.vending.billing.IInAppBillingService");
            int v4 = arg12.readInt();
            String v5 = arg12.readString();
            String v6 = arg12.readString();
            String v7 = arg12.readString();
            if(arg12.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg12);
            }

            v11 = this.getPurchaseHistory(v4, v5, v6, v7, v0_1);
            arg13.writeNoException();
            if(v11 != null) {
                arg13.writeInt(1);
                v11.writeToParcel(arg13, 1);
            }
            else {
                arg13.writeInt(0);
            }

            return 1;
        label_8:
            arg12.enforceInterface("com.android.vending.billing.IInAppBillingService");
            arg11 = arg12.readInt();
            v14 = arg12.readString();
            String v2 = arg12.readString();
            if(arg12.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg12);
            }

            arg11 = this.isBillingSupportedExtraParams(arg11, v14, v2, ((Bundle)v0_1));
            arg13.writeNoException();
            arg13.writeInt(arg11);
            return 1;
        label_91:
            arg12.enforceInterface("com.android.vending.billing.IInAppBillingService");
            arg11 = this.consumePurchase(arg12.readInt(), arg12.readString(), arg12.readString());
            arg13.writeNoException();
            arg13.writeInt(arg11);
            return 1;
        label_43:
            arg12.enforceInterface("com.android.vending.billing.IInAppBillingService");
            v4 = arg12.readInt();
            v5 = arg12.readString();
            v6 = arg12.readString();
            v7 = arg12.readString();
            String v8 = arg12.readString();
            if(arg12.readInt() != 0) {
                v0_1 = Bundle.CREATOR.createFromParcel(arg12);
            }

            v11 = this.getBuyIntentExtraParams(v4, v5, v6, v7, v8, v0_1);
            arg13.writeNoException();
            if(v11 != null) {
                arg13.writeInt(1);
                v11.writeToParcel(arg13, 1);
            }
            else {
                arg13.writeInt(0);
            }

            return 1;
        label_157:
            arg13.writeString("com.android.vending.billing.IInAppBillingService");
            return 1;
        }
    }

    int consumePurchase(int arg1, String arg2, String arg3) throws RemoteException;

    Bundle getBuyIntent(int arg1, String arg2, String arg3, String arg4, String arg5) throws RemoteException;

    Bundle getBuyIntentExtraParams(int arg1, String arg2, String arg3, String arg4, String arg5, Bundle arg6) throws RemoteException;

    Bundle getBuyIntentToReplaceSkus(int arg1, String arg2, List arg3, String arg4, String arg5, String arg6) throws RemoteException;

    Bundle getPurchaseHistory(int arg1, String arg2, String arg3, String arg4, Bundle arg5) throws RemoteException;

    Bundle getPurchases(int arg1, String arg2, String arg3, String arg4) throws RemoteException;

    Bundle getSkuDetails(int arg1, String arg2, String arg3, Bundle arg4) throws RemoteException;

    int isBillingSupported(int arg1, String arg2, String arg3) throws RemoteException;

    int isBillingSupportedExtraParams(int arg1, String arg2, String arg3, Bundle arg4) throws RemoteException;

    int stub(int arg1, String arg2, String arg3) throws RemoteException;
}

