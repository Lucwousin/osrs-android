package com.google.android.gms.dynamite;

import android.content.Context;

final class zza implements com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$zza {
    zza() {
        super();
    }

    public final int getLocalVersion(Context arg1, String arg2) {
        return DynamiteModule.getLocalVersion(arg1, arg2);
    }

    public final int zza(Context arg1, String arg2, boolean arg3) throws LoadingException {
        return DynamiteModule.zza(arg1, arg2, arg3);
    }
}

