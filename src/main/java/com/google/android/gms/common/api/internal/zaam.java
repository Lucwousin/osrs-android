package com.google.android.gms.common.api.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;

final class zaam implements ConnectionProgressReportCallbacks {
    private final Api mApi;
    private final boolean zaeb;
    private final WeakReference zagj;

    public zaam(zaak arg2, Api arg3, boolean arg4) {
        super();
        this.zagj = new WeakReference(arg2);
        this.mApi = arg3;
        this.zaeb = arg4;
    }

    public final void onReportServiceBinding(@NonNull ConnectionResult arg5) {
        Object v0 = this.zagj.get();
        if(v0 == null) {
            return;
        }

        boolean v1 = Looper.myLooper() == zaak.zad(((zaak)v0)).zaed.getLooper() ? true : false;
        Preconditions.checkState(v1, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        zaak.zac(((zaak)v0)).lock();
        try {
            if(zaak.zaa(((zaak)v0), 0)) {
                goto label_22;
            }
        }
        catch(Throwable v5) {
            goto label_35;
        }

        zaak.zac(((zaak)v0)).unlock();
        return;
        try {
        label_22:
            if(!arg5.isSuccess()) {
                zaak.zaa(((zaak)v0), arg5, this.mApi, this.zaeb);
            }

            if(zaak.zak(((zaak)v0))) {
                zaak.zaj(((zaak)v0));
            }
        }
        catch(Throwable v5) {
        label_35:
            zaak.zac(((zaak)v0)).unlock();
            throw v5;
        }

        zaak.zac(((zaak)v0)).unlock();
    }

    static boolean zaa(zaam arg0) {
        return arg0.zaeb;
    }
}

