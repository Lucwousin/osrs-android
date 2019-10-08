package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IAccountAccessor extends IInterface {
    public abstract class Stub extends zzb implements IAccountAccessor {
        public final class zza extends com.google.android.gms.internal.common.zza implements IAccountAccessor {
            zza(IBinder arg2) {
                super(arg2, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account getAccount() throws RemoteException {
                Parcel v0 = ((com.google.android.gms.internal.common.zza)this).zza(2, ((com.google.android.gms.internal.common.zza)this).zza());
                Parcelable v1 = zzc.zza(v0, Account.CREATOR);
                v0.recycle();
                return ((Account)v1);
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static IAccountAccessor asInterface(IBinder arg2) {
            if(arg2 == null) {
                return null;
            }

            IInterface v0 = arg2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if((v0 instanceof IAccountAccessor)) {
                return ((IAccountAccessor)v0);
            }

            return new zza(arg2);
        }

        protected final boolean zza(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException {
            if(arg1 == 2) {
                Account v1 = this.getAccount();
                arg3.writeNoException();
                zzc.zzb(arg3, ((Parcelable)v1));
                return 1;
            }

            return 0;
        }
    }

    Account getAccount() throws RemoteException;
}

