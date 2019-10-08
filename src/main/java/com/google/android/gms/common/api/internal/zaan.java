package com.google.android.gms.common.api.internal;

import androidx.annotation.WorkerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.GoogleApiAvailabilityCache;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zaan extends zaau {
    private final Map zagk;

    public zaan(zaak arg2, Map arg3) {
        this.zagi = arg2;
        super(arg2, null);
        this.zagk = arg3;
    }

    @WorkerThread public final void zaan() {
        Object v3_2;
        GoogleApiAvailabilityCache v0 = new GoogleApiAvailabilityCache(zaak.zab(this.zagi));
        ArrayList v1 = new ArrayList();
        ArrayList v2 = new ArrayList();
        Iterator v3 = this.zagk.keySet().iterator();
        while(v3.hasNext()) {
            Object v4 = v3.next();
            if((((Client)v4).requiresGooglePlayServices()) && !zaam.zaa(this.zagk.get(v4))) {
                ((List)v1).add(v4);
                continue;
            }

            ((List)v2).add(v4);
        }

        int v3_1 = -1;
        int v5 = 0;
        if(((List)v1).isEmpty()) {
            int v1_1 = v2.size();
            goto label_29;
        }
        else {
            int v2_1 = v1.size();
            do {
                if(v5 < v2_1) {
                    v3_2 = v1.get(v5);
                    ++v5;
                    v3_1 = v0.getClientAvailability(zaak.zaa(this.zagi), ((Client)v3_2));
                    if(v3_1 == 0) {
                        continue;
                    }
                }

                goto label_45;
            }
            while(true);

            do {
            label_29:
                if(v5 < v1_1) {
                    v3_2 = v2.get(v5);
                    ++v5;
                    v3_1 = v0.getClientAvailability(zaak.zaa(this.zagi), ((Client)v3_2));
                    if(v3_1 != 0) {
                        continue;
                    }

                    break;
                }

                break;
            }
            while(true);
        }

    label_45:
        if(v3_1 != 0) {
            zaak.zad(this.zagi).zaa(new zaao(this, this.zagi, new ConnectionResult(v3_1, null)));
            return;
        }

        if(zaak.zae(this.zagi)) {
            zaak.zaf(this.zagi).connect();
        }

        Iterator v1_2 = this.zagk.keySet().iterator();
        while(v1_2.hasNext()) {
            Object v2_2 = v1_2.next();
            v3_2 = this.zagk.get(v2_2);
            if((((Client)v2_2).requiresGooglePlayServices()) && v0.getClientAvailability(zaak.zaa(this.zagi), ((Client)v2_2)) != 0) {
                zaak.zad(this.zagi).zaa(new zaap(this, this.zagi, ((ConnectionProgressReportCallbacks)v3_2)));
                continue;
            }

            ((Client)v2_2).connect(((ConnectionProgressReportCallbacks)v3_2));
        }
    }
}

