package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultCallbacks;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.TransformedResult;
import com.google.android.gms.common.internal.Preconditions;
import java.lang.ref.WeakReference;
import javax.annotation.concurrent.GuardedBy;

public final class zacm extends TransformedResult implements ResultCallback {
    private final Object zadn;
    private final WeakReference zadp;
    private ResultTransform zakn;
    private zacm zako;
    private volatile ResultCallbacks zakp;
    private PendingResult zakq;
    private Status zakr;
    private final zaco zaks;
    private boolean zakt;

    public zacm(WeakReference arg3) {
        super();
        this.zakn = null;
        this.zako = null;
        this.zakp = null;
        this.zakq = null;
        this.zadn = new Object();
        this.zakr = null;
        this.zakt = false;
        Preconditions.checkNotNull(arg3, "GoogleApiClient reference must not be null");
        this.zadp = arg3;
        Object v3 = this.zadp.get();
        Looper v3_1 = v3 != null ? ((GoogleApiClient)v3).getLooper() : Looper.getMainLooper();
        this.zaks = new zaco(this, v3_1);
    }

    public final void andFinally(@NonNull ResultCallbacks arg6) {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            boolean v2 = false;
            boolean v1 = this.zakp == null ? true : false;
            Preconditions.checkState(v1, "Cannot call andFinally() twice.");
            if(this.zakn == null) {
                v2 = true;
            }

            Preconditions.checkState(v2, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zakp = arg6;
            this.zabu();
            __monitor_exit(v0);
            return;
        label_21:
            __monitor_exit(v0);
        }
        catch(Throwable v6) {
            goto label_21;
        }

        throw v6;
    }

    public final void onResult(Result arg4) {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            if(!arg4.getStatus().isSuccess()) {
                this.zad(arg4.getStatus());
                zacm.zab(arg4);
            }
            else if(this.zakn != null) {
                zacc.zabb().submit(new zacn(this, arg4));
            }
            else if(this.zabw()) {
                this.zakp.onSuccess(arg4);
            }

            __monitor_exit(v0);
            return;
        label_23:
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            goto label_23;
        }

        throw v4;
    }

    @NonNull public final TransformedResult then(@NonNull ResultTransform arg6) {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            boolean v2 = false;
            boolean v1 = this.zakn == null ? true : false;
            Preconditions.checkState(v1, "Cannot call then() twice.");
            if(this.zakp == null) {
                v2 = true;
            }

            Preconditions.checkState(v2, "Cannot call then() and andFinally() on the same TransformedResult.");
            this.zakn = arg6;
            zacm v6_1 = new zacm(this.zadp);
            this.zako = v6_1;
            this.zabu();
            __monitor_exit(v0);
            return ((TransformedResult)v6_1);
        label_25:
            __monitor_exit(v0);
        }
        catch(Throwable v6) {
            goto label_25;
        }

        throw v6;
    }

    static void zaa(zacm arg0, Result arg1) {
        zacm.zab(arg1);
    }

    static void zaa(zacm arg0, Status arg1) {
        arg0.zad(arg1);
    }

    public final void zaa(PendingResult arg2) {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            this.zakq = arg2;
            this.zabu();
            __monitor_exit(v0);
            return;
        label_7:
            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            goto label_7;
        }

        throw v2;
    }

    private static void zab(Result arg4) {
        if((arg4 instanceof Releasable)) {
            try {
                arg4.release();
                return;
            }
            catch(RuntimeException v0) {
                String v4 = String.valueOf(arg4);
                StringBuilder v3 = new StringBuilder(String.valueOf(v4).length() + 18);
                v3.append("Unable to release ");
                v3.append(v4);
                Log.w("TransformedResultImpl", v3.toString(), ((Throwable)v0));
            }
        }
    }

    @GuardedBy(value="mSyncToken") private final void zabu() {
        if(this.zakn == null && this.zakp == null) {
            return;
        }

        Object v0 = this.zadp.get();
        if(!this.zakt && this.zakn != null && v0 != null) {
            ((GoogleApiClient)v0).zaa(this);
            this.zakt = true;
        }

        if(this.zakr != null) {
            this.zae(this.zakr);
            return;
        }

        if(this.zakq != null) {
            this.zakq.setResultCallback(((ResultCallback)this));
        }
    }

    final void zabv() {
        this.zakp = null;
    }

    @GuardedBy(value="mSyncToken") private final boolean zabw() {
        Object v0 = this.zadp.get();
        if(this.zakp != null && v0 != null) {
            return 1;
        }

        return 0;
    }

    static ResultTransform zac(zacm arg0) {
        return arg0.zakn;
    }

    static zaco zad(zacm arg0) {
        return arg0.zaks;
    }

    private final void zad(Status arg2) {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            this.zakr = arg2;
            this.zae(this.zakr);
            __monitor_exit(v0);
            return;
        label_8:
            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            goto label_8;
        }

        throw v2;
    }

    static WeakReference zae(zacm arg0) {
        return arg0.zadp;
    }

    private final void zae(Status arg3) {
        Object v0 = this.zadn;
        __monitor_enter(v0);
        try {
            if(this.zakn != null) {
                arg3 = this.zakn.onFailure(arg3);
                Preconditions.checkNotNull(arg3, "onFailure must not return null");
                this.zako.zad(arg3);
            }
            else if(this.zabw()) {
                this.zakp.onFailure(arg3);
            }

            __monitor_exit(v0);
            return;
        label_18:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_18;
        }

        throw v3;
    }

    static Object zaf(zacm arg0) {
        return arg0.zadn;
    }

    static zacm zag(zacm arg0) {
        return arg0.zako;
    }
}

