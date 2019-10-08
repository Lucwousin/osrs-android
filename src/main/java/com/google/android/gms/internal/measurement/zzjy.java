package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting public final class zzjy {
    final Context zzqx;

    @VisibleForTesting public zzjy(Context arg1) {
        super();
        Preconditions.checkNotNull(arg1);
        arg1 = arg1.getApplicationContext();
        Preconditions.checkNotNull(arg1);
        this.zzqx = arg1;
    }
}

