package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

final class zav implements zabt {
    zav(zas arg1, zat arg2) {
        this(arg1);
    }

    private zav(zas arg1) {
        this.zaep = arg1;
        super();
    }

    public final void zab(int arg3, boolean arg4) {
        zas.zaa(this.zaep).lock();
        try {
            if(!zas.zac(this.zaep)) {
                goto label_15;
            }

            zas.zaa(this.zaep, false);
            zas.zaa(this.zaep, arg3, arg4);
        }
        catch(Throwable v3) {
            goto label_28;
        }

        zas.zaa(this.zaep).unlock();
        return;
        try {
        label_15:
            zas.zaa(this.zaep, true);
            zas.zaf(this.zaep).onConnectionSuspended(arg3);
        }
        catch(Throwable v3) {
        label_28:
            zas.zaa(this.zaep).unlock();
            throw v3;
        }

        zas.zaa(this.zaep).unlock();
    }

    public final void zab(@Nullable Bundle arg2) {
        zas.zaa(this.zaep).lock();
        try {
            zas.zab(this.zaep, ConnectionResult.RESULT_SUCCESS);
            zas.zab(this.zaep);
        }
        catch(Throwable v2) {
            zas.zaa(this.zaep).unlock();
            throw v2;
        }

        zas.zaa(this.zaep).unlock();
    }

    public final void zac(@NonNull ConnectionResult arg2) {
        zas.zaa(this.zaep).lock();
        try {
            zas.zab(this.zaep, arg2);
            zas.zab(this.zaep);
        }
        catch(Throwable v2) {
            zas.zaa(this.zaep).unlock();
            throw v2;
        }

        zas.zaa(this.zaep).unlock();
    }
}

