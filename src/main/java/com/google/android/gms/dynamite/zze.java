package com.google.android.gms.dynamite;

import android.content.Context;

final class zze implements VersionPolicy {
    zze() {
        super();
    }

    public final zzb zza(Context arg5, String arg6, zza arg7) throws LoadingException {
        zzb v0 = new zzb();
        v0.zziq = arg7.getLocalVersion(arg5, arg6);
        v0.zzir = v0.zziq != 0 ? arg7.zza(arg5, arg6, false) : arg7.zza(arg5, arg6, true);
        if(v0.zziq == 0 && v0.zzir == 0) {
            v0.zzis = 0;
        }
        else if(v0.zziq >= v0.zzir) {
            v0.zzis = -1;
        }
        else {
            v0.zzis = 1;
        }

        return v0;
    }
}

