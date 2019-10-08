package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzl;
import com.google.android.gms.auth.api.accounttransfer.zzt;
import com.google.android.gms.common.api.Status;

public abstract class zzy extends zzb implements zzx {
    public zzy() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    protected final boolean dispatchTransaction(int arg1, Parcel arg2, Parcel arg3, int arg4) throws RemoteException {
        switch(arg1) {
            case 1: {
                goto label_28;
            }
            case 2: {
                goto label_22;
            }
            case 3: {
                goto label_16;
            }
            case 4: {
                goto label_14;
            }
            case 5: {
                goto label_10;
            }
            case 6: {
                goto label_7;
            }
            case 7: {
                goto label_3;
            }
        }

        return 0;
    label_3:
        this.zza(zzc.zza(arg2, DeviceMetaData.CREATOR));
        return 1;
    label_22:
        this.zza(zzc.zza(arg2, Status.CREATOR), zzc.zza(arg2, zzt.CREATOR));
        return 1;
    label_7:
        this.zza(arg2.createByteArray());
        return 1;
    label_10:
        this.onFailure(zzc.zza(arg2, Status.CREATOR));
        return 1;
    label_28:
        this.zzb(zzc.zza(arg2, Status.CREATOR));
        return 1;
    label_14:
        this.zzd();
        return 1;
    label_16:
        this.zza(zzc.zza(arg2, Status.CREATOR), zzc.zza(arg2, zzl.CREATOR));
        return 1;
    }
}

