package com.google.android.gms.dynamite;

import android.content.Context;

final class zzb implements VersionPolicy {
    zzb() {
        super();
    }

    public final com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$zzb zza(Context arg4, String arg5, zza arg6) throws LoadingException {
        com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$zzb v0 = new com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$zzb();
        v0.zzir = arg6.zza(arg4, arg5, true);
        if(v0.zzir != 0) {
            v0.zzis = 1;
        }
        else {
            v0.zziq = arg6.getLocalVersion(arg4, arg5);
            if(v0.zziq != 0) {
                v0.zzis = -1;
            }
        }

        return v0;
    }
}

