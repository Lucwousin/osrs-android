package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Api$Client;
import java.util.ArrayList;

final class zaaq extends zaau {
    private final ArrayList zago;

    public zaaq(zaak arg2, ArrayList arg3) {
        this.zagi = arg2;
        super(arg2, null);
        this.zago = arg3;
    }

    @WorkerThread public final void zaan() {
        zaak.zad(this.zagi).zaed.zagz = zaak.zag(this.zagi);
        ArrayList v0 = this.zago;
        int v1 = v0.size();
        int v2 = 0;
        while(v2 < v1) {
            Object v3 = v0.get(v2);
            ++v2;
            ((Client)v3).getRemoteService(zaak.zah(this.zagi), zaak.zad(this.zagi).zaed.zagz);
        }
    }
}

