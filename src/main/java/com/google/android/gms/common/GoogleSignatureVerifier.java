package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.wrappers.Wrappers;
import javax.annotation.CheckReturnValue;

@KeepForSdk @ShowFirstParty @CheckReturnValue public class GoogleSignatureVerifier {
    private final Context mContext;
    private static GoogleSignatureVerifier zzal;
    private volatile String zzam;

    private GoogleSignatureVerifier(Context arg1) {
        super();
        this.mContext = arg1.getApplicationContext();
    }

    @KeepForSdk public static GoogleSignatureVerifier getInstance(Context arg2) {
        Preconditions.checkNotNull(arg2);
        Class v0 = GoogleSignatureVerifier.class;
        __monitor_enter(v0);
        try {
            if(GoogleSignatureVerifier.zzal == null) {
                zzc.zza(arg2);
                GoogleSignatureVerifier.zzal = new GoogleSignatureVerifier(arg2);
            }

            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            try {
            label_13:
                __monitor_exit(v0);
            }
            catch(Throwable v2) {
                goto label_13;
            }

            throw v2;
        }

        return GoogleSignatureVerifier.zzal;
    }

    @KeepForSdk public boolean isGooglePublicSignedPackage(PackageInfo arg4) {
        if(arg4 == null) {
            return 0;
        }

        if(GoogleSignatureVerifier.zza(arg4, false)) {
            return 1;
        }

        if(GoogleSignatureVerifier.zza(arg4, true)) {
            if(GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext)) {
                return 1;
            }
            else {
                Log.w("GoogleSignatureVerifier", "Test-keys aren\'t accepted on this build.");
            }
        }

        return 0;
    }

    @KeepForSdk @ShowFirstParty public boolean isPackageGoogleSigned(String arg1) {
        zzm v1 = this.zzc(arg1);
        v1.zzf();
        return v1.zzac;
    }

    @KeepForSdk @ShowFirstParty public boolean isUidGoogleSigned(int arg6) {
        zzm v1;
        String[] v0 = Wrappers.packageManager(this.mContext).getPackagesForUid(arg6);
        if(v0 == null || v0.length == 0) {
            v1 = zzm.zzb("no pkgs");
        }
        else {
            v1 = null;
            int v2 = v0.length;
            int v3;
            for(v3 = 0; v3 < v2; ++v3) {
                v1 = this.zza(v0[v3], arg6);
                if(v1.zzac) {
                    break;
                }
            }
        }

        v1.zzf();
        return v1.zzac;
    }

    public static boolean zza(PackageInfo arg3, boolean arg4) {
        if(arg3 != null && arg3.signatures != null) {
            zze v3 = arg4 ? GoogleSignatureVerifier.zza(arg3, zzh.zzx) : GoogleSignatureVerifier.zza(arg3, new zze[]{zzh.zzx[0]});
            if(v3 == null) {
                return 0;
            }

            return 1;
        }

        return 0;
    }

    private static zze zza(PackageInfo arg3, zze[] arg4) {
        zze v1 = null;
        if(arg3.signatures == null) {
            return v1;
        }

        if(arg3.signatures.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return v1;
        }

        int v2 = 0;
        zzf v0 = new zzf(arg3.signatures[0].toByteArray());
        while(v2 < arg4.length) {
            if(arg4[v2].equals(v0)) {
                return arg4[v2];
            }

            ++v2;
        }

        return v1;
    }

    private final zzm zza(PackageInfo arg7) {
        boolean v0 = GooglePlayServicesUtilLight.honorsDebugCertificates(this.mContext);
        if(arg7 == null) {
            return zzm.zzb("null pkg");
        }

        if(arg7.signatures.length != 1) {
            return zzm.zzb("single cert required");
        }

        zzf v1 = new zzf(arg7.signatures[0].toByteArray());
        String v2 = arg7.packageName;
        zzm v4 = zzc.zza(v2, ((zze)v1), v0);
        if((v4.zzac) && arg7.applicationInfo != null && (arg7.applicationInfo.flags & 2) != 0 && (!v0 || (zzc.zza(v2, ((zze)v1), false).zzac))) {
            return zzm.zzb("debuggable release cert app rejected");
        }

        return v4;
    }

    private final zzm zza(String arg3, int arg4) {
        try {
            return this.zza(Wrappers.packageManager(this.mContext).zza(arg3, 0x40, arg4));
        }
        catch(PackageManager$NameNotFoundException ) {
            String v4 = "no pkg ";
            arg3 = String.valueOf(arg3);
            arg3 = arg3.length() != 0 ? v4.concat(arg3) : new String(v4);
            return zzm.zzb(arg3);
        }
    }

    private final zzm zzc(String arg3) {
        PackageInfo v0;
        if(arg3 == null) {
            return zzm.zzb("null pkg");
        }

        if(arg3.equals(this.zzam)) {
            return zzm.zze();
        }

        try {
            v0 = Wrappers.packageManager(this.mContext).getPackageInfo(arg3, 0x40);
        }
        catch(PackageManager$NameNotFoundException ) {
            String v0_1 = "no pkg ";
            arg3 = String.valueOf(arg3);
            arg3 = arg3.length() != 0 ? v0_1.concat(arg3) : new String(v0_1);
            return zzm.zzb(arg3);
        }

        zzm v0_2 = this.zza(v0);
        if(v0_2.zzac) {
            this.zzam = arg3;
        }

        return v0_2;
    }
}

