package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzay;
import com.google.android.gms.internal.auth.zzf;
import java.io.IOException;

final class zze implements zzj {
    zze(Account arg1, String arg2, Bundle arg3) {
        this.zzo = arg1;
        this.zzp = arg2;
        this.val$options = arg3;
        super();
    }

    public final Object zzb(IBinder arg8) throws RemoteException, IOException, GoogleAuthException {
        Object v8 = zzd.zzb(zzf.zza(arg8).zza(this.zzo, this.zzp, this.val$options));
        TokenData v0 = TokenData.zza(((Bundle)v8), "tokenDetails");
        if(v0 != null) {
            return v0;
        }

        String v0_1 = ((Bundle)v8).getString("Error");
        Parcelable v8_1 = ((Bundle)v8).getParcelable("userRecoveryIntent");
        zzay v1 = zzay.zzc(v0_1);
        int v3 = 0;
        if(!zzay.zza(v1)) {
            if((zzay.zzco.equals(v1)) || (zzay.zzcp.equals(v1)) || (zzay.zzcq.equals(v1))) {
                v3 = 1;
            }

            if(v3 != 0) {
                throw new IOException(v0_1);
            }

            throw new GoogleAuthException(v0_1);
        }

        Logger v2 = zzd.zza();
        Object[] v4 = new Object[1];
        String v1_1 = String.valueOf(v1);
        StringBuilder v6 = new StringBuilder(String.valueOf(v1_1).length() + 0x1F);
        v6.append("isUserRecoverableError status: ");
        v6.append(v1_1);
        v4[0] = v6.toString();
        v2.w("GoogleAuthUtil", v4);
        throw new UserRecoverableAuthException(v0_1, ((Intent)v8_1));
    }
}

