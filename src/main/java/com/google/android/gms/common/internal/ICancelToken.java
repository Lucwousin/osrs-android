package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.common.zzb;

public interface ICancelToken extends IInterface {
    public abstract class Stub extends zzb implements ICancelToken {
        public final class zza extends com.google.android.gms.internal.common.zza implements ICancelToken {
            zza(IBinder arg2) {
                super(arg2, "com.google.android.gms.common.internal.ICancelToken");
            }

            public final void cancel() throws RemoteException {
                ((com.google.android.gms.internal.common.zza)this).zzc(2, ((com.google.android.gms.internal.common.zza)this).zza());
            }
        }

        public Stub() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        public static ICancelToken asInterface(IBinder arg2) {
            if(arg2 == null) {
                return null;
            }

            IInterface v0 = arg2.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            if((v0 instanceof ICancelToken)) {
                return ((ICancelToken)v0);
            }

            return new zza(arg2);
        }
    }

    void cancel() throws RemoteException;
}

