package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;

public interface IGmsCallbacks extends IInterface {
    public abstract class zza extends zzb implements IGmsCallbacks {
        public zza() {
            super("com.google.android.gms.common.internal.IGmsCallbacks");
        }

        protected final boolean zza(int arg2, Parcel arg3, Parcel arg4, int arg5) throws RemoteException {
            switch(arg2) {
                case 1: {
                    goto label_14;
                }
                case 2: {
                    goto label_9;
                }
                case 3: {
                    goto label_3;
                }
            }

            return 0;
        label_3:
            this.zza(arg3.readInt(), arg3.readStrongBinder(), zzc.zza(arg3, com.google.android.gms.common.internal.zzb.CREATOR));
            goto label_19;
        label_9:
            this.zza(arg3.readInt(), zzc.zza(arg3, Bundle.CREATOR));
            goto label_19;
        label_14:
            this.onPostInitComplete(arg3.readInt(), arg3.readStrongBinder(), zzc.zza(arg3, Bundle.CREATOR));
        label_19:
            arg4.writeNoException();
            return 1;
        }
    }

    void onPostInitComplete(int arg1, IBinder arg2, Bundle arg3) throws RemoteException;

    void zza(int arg1, Bundle arg2) throws RemoteException;

    void zza(int arg1, IBinder arg2, com.google.android.gms.common.internal.zzb arg3) throws RemoteException;
}

