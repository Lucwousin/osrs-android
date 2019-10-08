package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

final class zzhq implements Callable {
    zzhq(zzhm arg1) {
        this.zzaps = arg1;
        super();
    }

    public final Object call() throws Exception {
        String v1;
        zzfk v0_2;
        String v0 = this.zzaps.zzgj().zzjk();
        if(v0 != null) {
            return v0;
        }

        zzhm v0_1 = this.zzaps.zzfy();
        String v2 = null;
        if(((zzhi)v0_1).zzgh().zzju()) {
            v0_2 = ((zzhi)v0_1).zzgi().zziv();
            v1 = "Cannot retrieve app instance id from analytics worker thread";
            goto label_14;
        }
        else if(zzee.isMainThread()) {
            v0_2 = ((zzhi)v0_1).zzgi().zziv();
            v1 = "Cannot retrieve app instance id from main thread";
        label_14:
            v0_2.log(v1);
        }
        else {
            long v1_1 = ((zzhi)v0_1).zzbt().elapsedRealtime();
            long v3 = 120000;
            String v5 = v0_1.zzaj(v3);
            long v6 = ((zzhi)v0_1).zzbt().elapsedRealtime() - v1_1;
            if(v5 == null && v6 < v3) {
                v2 = v0_1.zzaj(v3 - v6);
                goto label_36;
            }

            v2 = v5;
        }

    label_36:
        if(v2 != null) {
            this.zzaps.zzgj().zzbu(v2);
            return v2;
        }

        throw new TimeoutException();
    }
}

