package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public abstract class zzj extends zzb implements zzi {
    public zzj() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    protected final boolean zza(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException {
        switch(arg1) {
            case 1: {
                goto label_7;
            }
            case 2: {
                goto label_3;
            }
        }

        return 0;
    label_3:
        arg1 = this.zzc();
        arg3.writeNoException();
        arg3.writeInt(arg1);
        return 1;
    label_7:
        IObjectWrapper v1 = this.zzb();
        arg3.writeNoException();
        zzc.zza(arg3, ((IInterface)v1));
        return 1;
    }

    public static zzi zzb(IBinder arg2) {
        if(arg2 == null) {
            return null;
        }

        IInterface v0 = arg2.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if((v0 instanceof zzi)) {
            return ((zzi)v0);
        }

        return new zzk(arg2);
    }
}

