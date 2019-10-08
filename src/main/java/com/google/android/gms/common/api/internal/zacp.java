package com.google.android.gms.common.api.internal;

import android.os.IBinder$DeathRecipient;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.zac;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class zacp {
    private final Map zagy;
    public static final Status zakw;
    private static final BasePendingResult[] zakx;
    @VisibleForTesting final Set zaky;
    private final zacs zakz;

    static {
        zacp.zakw = new Status(8, "The connection to Google Play services was lost");
        zacp.zakx = new BasePendingResult[0];
    }

    public zacp(Map arg2) {
        super();
        this.zaky = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
        this.zakz = new zacq(this);
        this.zagy = arg2;
    }

    public final void release() {
        Object[] v0 = this.zaky.toArray(zacp.zakx);
        int v1 = v0.length;
        int v3;
        for(v3 = 0; v3 < v1; ++v3) {
            Object v4 = v0[v3];
            zacs v5 = null;
            ((BasePendingResult)v4).zaa(v5);
            if(((PendingResult)v4).zam() == null) {
                if(!((BasePendingResult)v4).zat()) {
                    goto label_49;
                }

                this.zaky.remove(v4);
                goto label_49;
            }

            ((PendingResult)v4).setResultCallback(((ResultCallback)v5));
            IBinder v6 = this.zagy.get(v4.getClientKey()).getServiceBrokerBinder();
            if(((BasePendingResult)v4).isReady()) {
                ((BasePendingResult)v4).zaa(new zacr(((BasePendingResult)v4), ((zac)v5), v6, ((zacq)v5)));
                goto label_47;
            }

            if(v6 != null && (v6.isBinderAlive())) {
                zacr v7 = new zacr(((BasePendingResult)v4), ((zac)v5), v6, ((zacq)v5));
                ((BasePendingResult)v4).zaa(((zacs)v7));
                try {
                    v6.linkToDeath(((IBinder$DeathRecipient)v7), 0);
                }
                catch(RemoteException ) {
                    ((PendingResult)v4).cancel();
                    ((zac)v5).remove(((PendingResult)v4).zam().intValue());
                }
            }
            else {
                ((BasePendingResult)v4).zaa(v5);
                ((PendingResult)v4).cancel();
                ((zac)v5).remove(((PendingResult)v4).zam().intValue());
            }

        label_47:
            this.zaky.remove(v4);
        label_49:
        }
    }

    final void zab(BasePendingResult arg2) {
        this.zaky.add(arg2);
        arg2.zaa(this.zakz);
    }

    public final void zabx() {
        Object[] v0 = this.zaky.toArray(zacp.zakx);
        int v1 = v0.length;
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            v0[v2].zab(zacp.zakw);
        }
    }
}

