package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

final class zabo implements Runnable {
    zabo(zac arg1, ConnectionResult arg2) {
        this.zajf = arg1;
        this.zaiy = arg2;
        super();
    }

    public final void run() {
        if(this.zaiy.isSuccess()) {
            zac.zaa(this.zajf, true);
            if(zac.zaa(this.zajf).requiresSignIn()) {
                zac.zab(this.zajf);
                return;
            }

            try {
                zac.zaa(this.zajf).getRemoteService(null, Collections.emptySet());
                return;
            }
            catch(SecurityException ) {
                GoogleApiManager.zaj(this.zajf.zail).get(zac.zac(this.zajf)).onConnectionFailed(new ConnectionResult(10));
                return;
            }
        }

        GoogleApiManager.zaj(this.zajf.zail).get(zac.zac(this.zajf)).onConnectionFailed(this.zaiy);
    }
}

