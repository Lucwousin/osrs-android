package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk public abstract class DowngradeableSafeParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    private static final Object zzdb;
    private static ClassLoader zzdc;
    private static Integer zzdd;
    private boolean zzde;

    static {
        DowngradeableSafeParcel.zzdb = new Object();
        DowngradeableSafeParcel.zzdc = null;
        DowngradeableSafeParcel.zzdd = null;
    }

    public DowngradeableSafeParcel() {
        super();
        this.zzde = false;
    }

    @KeepForSdk protected static boolean canUnparcelSafely(String arg0) {
        DowngradeableSafeParcel.zzp();
        return 1;
    }

    @KeepForSdk protected static Integer getUnparcelClientVersion() {
        Object v0 = DowngradeableSafeParcel.zzdb;
        __monitor_enter(v0);
        Integer v1 = null;
        try {
            __monitor_exit(v0);
            return v1;
        label_6:
            __monitor_exit(v0);
        }
        catch(Throwable v1_1) {
            goto label_6;
        }

        throw v1_1;
    }

    @KeepForSdk protected abstract boolean prepareForClientVersion(int arg1);

    @KeepForSdk public void setShouldDowngrade(boolean arg1) {
        this.zzde = arg1;
    }

    @KeepForSdk protected boolean shouldDowngrade() {
        return this.zzde;
    }

    private static ClassLoader zzp() {
        Object v0 = DowngradeableSafeParcel.zzdb;
        __monitor_enter(v0);
        ClassLoader v1 = null;
        try {
            __monitor_exit(v0);
            return v1;
        label_6:
            __monitor_exit(v0);
        }
        catch(Throwable v1_1) {
            goto label_6;
        }

        throw v1_1;
    }
}

