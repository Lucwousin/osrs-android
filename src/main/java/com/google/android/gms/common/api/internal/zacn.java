package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;

final class zacn implements Runnable {
    zacn(zacm arg1, Result arg2) {
        this.zakv = arg1;
        this.zaku = arg2;
        super();
    }

    @WorkerThread public final void run() {
        Object v0_1;
        try {
            BasePendingResult.zadm.set(Boolean.valueOf(true));
            zacm.zad(this.zakv).sendMessage(zacm.zad(this.zakv).obtainMessage(0, zacm.zac(this.zakv).onSuccess(this.zaku)));
        }
        catch(Throwable v0) {
        label_50:
            BasePendingResult.zadm.set(Boolean.valueOf(false));
            zacm.zaa(this.zakv, this.zaku);
            Object v1 = zacm.zae(this.zakv).get();
            if(v1 != null) {
                ((GoogleApiClient)v1).zab(this.zakv);
            }

            throw v0;
        }
        catch(RuntimeException v2) {
            try {
                zacm.zad(this.zakv).sendMessage(zacm.zad(this.zakv).obtainMessage(1, v2));
            }
            catch(Throwable v0) {
                goto label_50;
            }

            BasePendingResult.zadm.set(Boolean.valueOf(false));
            zacm.zaa(this.zakv, this.zaku);
            v0_1 = zacm.zae(this.zakv).get();
            if(v0_1 != null) {
                ((GoogleApiClient)v0_1).zab(this.zakv);
            }

            return;
        }

        BasePendingResult.zadm.set(Boolean.valueOf(false));
        zacm.zaa(this.zakv, this.zaku);
        v0_1 = zacm.zae(this.zakv).get();
        if(v0_1 != null) {
            ((GoogleApiClient)v0_1).zab(this.zakv);
        }
    }
}

