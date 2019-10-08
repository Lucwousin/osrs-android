package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

final class zzav extends zzaj {
    zzav(zzau arg1) {
        this.zzcg = arg1;
        super();
    }

    public final void zzb(String arg3) {
        if(arg3 != null) {
            this.zzcg.setResult(new zzax(arg3));
            return;
        }

        this.zzcg.setResult(zzau.zzc(new Status(3006)));
    }
}

