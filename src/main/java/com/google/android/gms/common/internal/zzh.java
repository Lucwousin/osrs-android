package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;

public final class zzh {
    @NonNull private final String mPackageName;
    private final int zzdt;
    @NonNull private final String zzej;
    private final boolean zzek;

    public zzh(@NonNull String arg1, @NonNull String arg2, boolean arg3, int arg4) {
        super();
        this.mPackageName = arg1;
        this.zzej = arg2;
        this.zzek = arg3;
        this.zzdt = 0x81;
    }

    @NonNull final String getPackageName() {
        return this.mPackageName;
    }

    final int zzq() {
        return this.zzdt;
    }

    @NonNull final String zzt() {
        return this.zzej;
    }
}

