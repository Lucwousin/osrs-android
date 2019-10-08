package com.google.android.gms.common.wrappers;

import android.content.Context;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;

@KeepForSdk public class Wrappers {
    private PackageManagerWrapper zzhw;
    private static Wrappers zzhx;

    static {
        Wrappers.zzhx = new Wrappers();
    }

    public Wrappers() {
        super();
        this.zzhw = null;
    }

    @KeepForSdk public static PackageManagerWrapper packageManager(Context arg1) {
        return Wrappers.zzhx.zzi(arg1);
    }

    @VisibleForTesting private final PackageManagerWrapper zzi(Context arg2) {
        PackageManagerWrapper v2_1;
        __monitor_enter(this);
        try {
            if(this.zzhw == null) {
                if(arg2.getApplicationContext() == null) {
                }
                else {
                    arg2 = arg2.getApplicationContext();
                }

                this.zzhw = new PackageManagerWrapper(arg2);
            }

            v2_1 = this.zzhw;
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
        return v2_1;
    }
}

