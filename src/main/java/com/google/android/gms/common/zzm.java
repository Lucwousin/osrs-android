package com.google.android.gms.common;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import java.util.concurrent.Callable;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;

@CheckReturnValue class zzm {
    private final Throwable cause;
    private static final zzm zzab;
    final boolean zzac;
    private final String zzad;

    static {
        zzm.zzab = new zzm(true, null, null);
    }

    zzm(boolean arg1, @Nullable String arg2, @Nullable Throwable arg3) {
        super();
        this.zzac = arg1;
        this.zzad = arg2;
        this.cause = arg3;
    }

    @Nullable String getErrorMessage() {
        return this.zzad;
    }

    static String zza(String arg3, zze arg4, boolean arg5, boolean arg6) {
        String v6 = arg6 ? "debug cert rejected" : "not whitelisted";
        return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", v6, arg3, Hex.zza(AndroidUtilsLight.zzi("SHA-1").digest(arg4.getBytes())), Boolean.valueOf(arg5), "12451009.false");
    }

    static zzm zza(@NonNull String arg2, @NonNull Throwable arg3) {
        return new zzm(false, arg2, arg3);
    }

    static zzm zza(Callable arg2) {
        return new zzo(arg2, null);
    }

    static zzm zzb(@NonNull String arg3) {
        return new zzm(false, arg3, null);
    }

    static zzm zze() {
        return zzm.zzab;
    }

    final void zzf() {
        if(!this.zzac && (Log.isLoggable("GoogleCertificatesRslt", 3))) {
            if(this.cause != null) {
                Log.d("GoogleCertificatesRslt", this.getErrorMessage(), this.cause);
                return;
            }
            else {
                Log.d("GoogleCertificatesRslt", this.getErrorMessage());
            }
        }
    }
}

