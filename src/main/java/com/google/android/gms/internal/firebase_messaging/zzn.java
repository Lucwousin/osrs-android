package com.google.android.gms.internal.firebase_messaging;

import android.content.Context;
import androidx.core.content.ContextCompat;

public final class zzn implements zzv {
    private final Context zzac;

    public zzn(Context arg1) {
        super();
        this.zzac = arg1;
    }

    public final Integer zzb(int arg2) {
        return Integer.valueOf(ContextCompat.getColor(this.zzac, arg2));
    }
}

