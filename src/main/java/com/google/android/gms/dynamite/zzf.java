package com.google.android.gms.dynamite;

import android.content.Context;

final class zzf implements VersionPolicy {
    zzf() {
        super();
    }

    public final zzb zza(Context arg3, String arg4, zza arg5) throws LoadingException {
        zzb v0 = new zzb();
        v0.zziq = arg5.getLocalVersion(arg3, arg4);
        v0.zzir = arg5.zza(arg3, arg4, true);
        if(v0.zziq == 0 && v0.zzir == 0) {
            v0.zzis = 0;
        }
        else if(v0.zzir >= v0.zziq) {
            v0.zzis = 1;
        }
        else {
            v0.zzis = -1;
        }

        return v0;
    }
}

