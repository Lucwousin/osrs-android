package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.Api$Client;
import com.google.android.gms.common.api.Api$SimpleClient;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.SimpleClientAdapter;
import java.util.Iterator;

public final class zaah implements zabd {
    private final zabe zafs;
    private boolean zaft;

    public zaah(zabe arg2) {
        super();
        this.zaft = false;
        this.zafs = arg2;
    }

    public final void begin() {
    }

    public final void connect() {
        if(this.zaft) {
            this.zaft = false;
            this.zafs.zaa(new zaaj(this, ((zabd)this)));
        }
    }

    public final boolean disconnect() {
        if(this.zaft) {
            return 0;
        }

        if(this.zafs.zaed.zaax()) {
            this.zaft = true;
            Iterator v0 = this.zafs.zaed.zahd.iterator();
            while(v0.hasNext()) {
                v0.next().zabv();
            }

            return 0;
        }

        this.zafs.zaf(null);
        return 1;
    }

    public final ApiMethodImpl enqueue(ApiMethodImpl arg1) {
        return this.execute(arg1);
    }

    public final ApiMethodImpl execute(ApiMethodImpl arg4) {
        SimpleClient v0_1;
        try {
            this.zafs.zaed.zahe.zab(((BasePendingResult)arg4));
            Object v0 = this.zafs.zaed.zagy.get(arg4.getClientKey());
            Preconditions.checkNotNull(v0, "Appropriate Api was not requested.");
            if(!((Client)v0).isConnected() && (this.zafs.zaho.containsKey(arg4.getClientKey()))) {
                arg4.setFailedResult(new Status(17));
                return arg4;
            }

            if((v0 instanceof SimpleClientAdapter)) {
                v0_1 = ((SimpleClientAdapter)v0).getClient();
            }

            arg4.run(((AnyClient)v0_1));
        }
        catch(DeadObjectException ) {
            this.zafs.zaa(new zaai(this, ((zabd)this)));
        }

        return arg4;
    }

    public final void onConnected(Bundle arg1) {
    }

    public final void onConnectionSuspended(int arg3) {
        this.zafs.zaf(null);
        this.zafs.zahs.zab(arg3, this.zaft);
    }

    static zabe zaa(zaah arg0) {
        return arg0.zafs;
    }

    public final void zaa(ConnectionResult arg1, Api arg2, boolean arg3) {
    }

    final void zaam() {
        if(this.zaft) {
            this.zaft = false;
            this.zafs.zaed.zahe.release();
            this.disconnect();
        }
    }
}

