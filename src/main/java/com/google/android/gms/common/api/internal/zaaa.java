package com.google.android.gms.common.api.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.Iterator;

final class zaaa implements OnCompleteListener {
    private SignInConnectionListener zafi;

    zaaa(zax arg1, SignInConnectionListener arg2) {
        this.zafh = arg1;
        super();
        this.zafi = arg2;
    }

    final void cancel() {
        this.zafi.onComplete();
    }

    public final void onComplete(@NonNull Task arg6) {
        zax.zaa(this.zafh).lock();
        try {
            if(zax.zab(this.zafh)) {
                goto label_12;
            }

            this.zafi.onComplete();
        }
        catch(Throwable v6) {
            goto label_109;
        }

        zax.zaa(this.zafh).unlock();
        return;
        try {
        label_12:
            if(arg6.isSuccessful()) {
                zax.zab(this.zafh, new ArrayMap(zax.zam(this.zafh).size()));
                Iterator v6_1 = zax.zam(this.zafh).values().iterator();
                while(v6_1.hasNext()) {
                    zax.zag(this.zafh).put(v6_1.next().zak(), ConnectionResult.RESULT_SUCCESS);
                }
            }
            else if((arg6.getException() instanceof AvailabilityException)) {
                Exception v6_2 = arg6.getException();
                if(zax.zae(this.zafh)) {
                    zax.zab(this.zafh, new ArrayMap(zax.zam(this.zafh).size()));
                    Iterator v0 = zax.zam(this.zafh).values().iterator();
                    while(v0.hasNext()) {
                        Object v1 = v0.next();
                        zai v2 = ((GoogleApi)v1).zak();
                        ConnectionResult v3 = ((AvailabilityException)v6_2).getConnectionResult(((GoogleApi)v1));
                        if(zax.zaa(this.zafh, ((zaw)v1), v3)) {
                            zax.zag(this.zafh).put(v2, new ConnectionResult(16));
                        }
                        else {
                            zax.zag(this.zafh).put(v2, v3);
                        }
                    }
                }
                else {
                    zax.zab(this.zafh, ((AvailabilityException)v6_2).zaj());
                }
            }
            else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", arg6.getException());
                zax.zab(this.zafh, Collections.emptyMap());
            }

            if(this.zafh.isConnected()) {
                zax.zad(this.zafh).putAll(zax.zag(this.zafh));
                if(zax.zaf(this.zafh) == null) {
                    zax.zai(this.zafh);
                    zax.zaj(this.zafh);
                    zax.zal(this.zafh).signalAll();
                }
            }

            this.zafi.onComplete();
        }
        catch(Throwable v6) {
        label_109:
            zax.zaa(this.zafh).unlock();
            throw v6;
        }

        zax.zaa(this.zafh).unlock();
    }
}

