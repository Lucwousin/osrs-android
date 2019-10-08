package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.ConnectionResult;

final class zau implements zabt {
    zau(zas arg1, zat arg2) {
        this(arg1);
    }

    private zau(zas arg1) {
        this.zaep = arg1;
        super();
    }

    public final void zab(int arg3, boolean arg4) {
        zas.zaa(this.zaep).lock();
        try {
            if(!zas.zac(this.zaep) && zas.zad(this.zaep) != null) {
                if(!zas.zad(this.zaep).isSuccess()) {
                }
                else {
                    zas.zaa(this.zaep, true);
                    zas.zae(this.zaep).onConnectionSuspended(arg3);
                    goto label_20;
                }
            }

            goto label_24;
        }
        catch(Throwable v3) {
            goto label_36;
        }

    label_20:
        zas.zaa(this.zaep).unlock();
        return;
        try {
        label_24:
            zas.zaa(this.zaep, false);
            zas.zaa(this.zaep, arg3, arg4);
        }
        catch(Throwable v3) {
        label_36:
            zas.zaa(this.zaep).unlock();
            throw v3;
        }

        zas.zaa(this.zaep).unlock();
    }

    public final void zab(@Nullable Bundle arg2) {
        zas.zaa(this.zaep).lock();
        try {
            zas.zaa(this.zaep, arg2);
            zas.zaa(this.zaep, ConnectionResult.RESULT_SUCCESS);
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
            zas.zaa(this.zaep, arg2);
            zas.zab(this.zaep);
        }
        catch(Throwable v2) {
            zas.zaa(this.zaep).unlock();
            throw v2;
        }

        zas.zaa(this.zaep).unlock();
    }
}

