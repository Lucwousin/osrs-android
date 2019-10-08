package com.google.android.gms.auth;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzay;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

final class zzi implements zzj {
    zzi(String arg1) {
        this.zzt = arg1;
        super();
    }

    public final Object zzb(IBinder arg8) throws RemoteException, IOException, GoogleAuthException {
        Object v8 = zzd.zzb(zzf.zza(arg8).zza(this.zzt));
        String v0 = ((Bundle)v8).getString("Error");
        Parcelable v8_1 = ((Bundle)v8).getParcelable("userRecoveryIntent");
        zzay v1 = zzay.zzc(v0);
        if(zzay.zzcm.equals(v1)) {
            return Boolean.valueOf(true);
        }

        if(zzay.zza(v1)) {
            Logger v2 = zzd.zza();
            Object[] v3 = new Object[1];
            String v1_1 = String.valueOf(v1);
            StringBuilder v6 = new StringBuilder(String.valueOf(v1_1).length() + 0x1F);
            v6.append("isUserRecoverableError status: ");
            v6.append(v1_1);
            v3[0] = v6.toString();
            v2.w("GoogleAuthUtil", v3);
            throw new UserRecoverableAuthException(v0, ((Intent)v8_1));
        }

        throw new GoogleAuthException(v0);
    }
}

