package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode$ThreadPolicy;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzm;
import com.google.android.gms.common.internal.zzn;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import com.google.android.gms.dynamite.DynamiteModule;
import javax.annotation.CheckReturnValue;

@CheckReturnValue final class zzc {
    private static volatile zzm zzn;
    private static final Object zzo;
    private static Context zzp;

    static {
        zzc.zzo = new Object();
    }

    static void zza(Context arg2) {
        Class v0 = zzc.class;
        __monitor_enter(v0);
        try {
            if(zzc.zzp != null) {
                goto label_9;
            }
            else if(arg2 != null) {
                zzc.zzp = arg2.getApplicationContext();
                goto label_7;
            }

            goto label_12;
        }
        catch(Throwable v2) {
            goto label_15;
        }

    label_7:
        __monitor_exit(v0);
        return;
        try {
        label_9:
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        }
        catch(Throwable v2) {
        label_15:
            __monitor_exit(v0);
            throw v2;
        }

    label_12:
        __monitor_exit(v0);
    }

    static com.google.android.gms.common.zzm zza(String arg1, zze arg2, boolean arg3) {
        com.google.android.gms.common.zzm v1_1;
        StrictMode$ThreadPolicy v0 = StrictMode.allowThreadDiskReads();
        try {
            v1_1 = zzc.zzb(arg1, arg2, arg3);
        }
        catch(Throwable v1) {
            StrictMode.setThreadPolicy(v0);
            throw v1;
        }

        StrictMode.setThreadPolicy(v0);
        return v1_1;
    }

    static final String zza(boolean arg2, String arg3, zze arg4) throws Exception {
        boolean v0 = true;
        if((arg2) || !zzc.zzb(arg3, arg4, true).zzac) {
            v0 = false;
        }
        else {
        }

        return com.google.android.gms.common.zzm.zza(arg3, arg4, arg2, v0);
    }

    private static com.google.android.gms.common.zzm zzb(String arg4, zze arg5, boolean arg6) {
        Object v0;
        try {
            if(zzc.zzn == null) {
                Preconditions.checkNotNull(zzc.zzp);
                v0 = zzc.zzo;
                __monitor_enter(v0);
                goto label_6;
            }

            goto label_21;
        }
        catch(LoadingException v4) {
            goto label_47;
        }

        try {
        label_6:
            if(zzc.zzn == null) {
                zzc.zzn = zzn.zzc(DynamiteModule.load(zzc.zzp, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
            }

            __monitor_exit(v0);
            goto label_21;
        label_19:
            __monitor_exit(v0);
        }
        catch(Throwable v4_1) {
            goto label_19;
        }

        try {
            throw v4_1;
        }
        catch(LoadingException v4) {
        label_47:
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", ((Throwable)v4));
            String v5 = "module init: ";
            String v6 = String.valueOf(v4.getMessage());
            v5 = v6.length() != 0 ? v5.concat(v6) : new String(v5);
            return com.google.android.gms.common.zzm.zza(v5, ((Throwable)v4));
        }

    label_21:
        Preconditions.checkNotNull(zzc.zzp);
        zzk v0_1 = new zzk(arg4, arg5, arg6);
        try {
            if(!zzc.zzn.zza(v0_1, ObjectWrapper.wrap(zzc.zzp.getPackageManager()))) {
                goto label_33;
            }
        }
        catch(RemoteException v4_2) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", ((Throwable)v4_2));
            return com.google.android.gms.common.zzm.zza("module call", ((Throwable)v4_2));
        }

        return com.google.android.gms.common.zzm.zze();
    label_33:
        return com.google.android.gms.common.zzm.zza(new zzd(arg6, arg4, arg5));
    }
}

