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

final class zaz implements OnCompleteListener {
    zaz(zax arg1, zay arg2) {
        this(arg1);
    }

    private zaz(zax arg1) {
        this.zafh = arg1;
        super();
    }

    public final void onComplete(@NonNull Task arg6) {
        zax.zaa(this.zafh).lock();
        try {
            if(zax.zab(this.zafh)) {
                goto label_10;
            }
        }
        catch(Throwable v6) {
            goto label_127;
        }

        zax.zaa(this.zafh).unlock();
        return;
        try {
        label_10:
            if(arg6.isSuccessful()) {
                zax.zaa(this.zafh, new ArrayMap(zax.zac(this.zafh).size()));
                Iterator v6_1 = zax.zac(this.zafh).values().iterator();
                while(v6_1.hasNext()) {
                    zax.zad(this.zafh).put(v6_1.next().zak(), ConnectionResult.RESULT_SUCCESS);
                }
            }
            else if((arg6.getException() instanceof AvailabilityException)) {
                Exception v6_2 = arg6.getException();
                if(zax.zae(this.zafh)) {
                    zax.zaa(this.zafh, new ArrayMap(zax.zac(this.zafh).size()));
                    Iterator v0 = zax.zac(this.zafh).values().iterator();
                    while(v0.hasNext()) {
                        Object v1 = v0.next();
                        zai v2 = ((GoogleApi)v1).zak();
                        ConnectionResult v3 = ((AvailabilityException)v6_2).getConnectionResult(((GoogleApi)v1));
                        if(zax.zaa(this.zafh, ((zaw)v1), v3)) {
                            zax.zad(this.zafh).put(v2, new ConnectionResult(16));
                        }
                        else {
                            zax.zad(this.zafh).put(v2, v3);
                        }
                    }
                }
                else {
                    zax.zaa(this.zafh, ((AvailabilityException)v6_2).zaj());
                }

                zax.zaa(this.zafh, zax.zaf(this.zafh));
            }
            else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", arg6.getException());
                zax.zaa(this.zafh, Collections.emptyMap());
                zax.zaa(this.zafh, new ConnectionResult(8));
            }

            if(zax.zag(this.zafh) != null) {
                zax.zad(this.zafh).putAll(zax.zag(this.zafh));
                zax.zaa(this.zafh, zax.zaf(this.zafh));
            }

            if(zax.zah(this.zafh) == null) {
                zax.zai(this.zafh);
                zax.zaj(this.zafh);
            }
            else {
                zax.zaa(this.zafh, false);
                zax.zak(this.zafh).zac(zax.zah(this.zafh));
            }

            zax.zal(this.zafh).signalAll();
        }
        catch(Throwable v6) {
        label_127:
            zax.zaa(this.zafh).unlock();
            throw v6;
        }

        zax.zaa(this.zafh).unlock();
    }
}

