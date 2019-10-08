package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

final class zzkc {
    final String name;
    final String origin;
    final Object value;
    final long zzast;
    final String zzth;

    zzkc(String arg1, String arg2, String arg3, long arg4, Object arg6) {
        super();
        Preconditions.checkNotEmpty(arg1);
        Preconditions.checkNotEmpty(arg3);
        Preconditions.checkNotNull(arg6);
        this.zzth = arg1;
        this.origin = arg2;
        this.name = arg3;
        this.zzast = arg4;
        this.value = arg6;
    }
}

