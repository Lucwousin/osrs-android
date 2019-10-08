package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;

public class zabu extends zal {
    private TaskCompletionSource zajo;

    private zabu(LifecycleFragment arg2) {
        super(arg2);
        this.zajo = new TaskCompletionSource();
        this.mLifecycleFragment.addCallback("GmsAvailabilityHelper", ((LifecycleCallback)this));
    }

    public final Task getTask() {
        return this.zajo.getTask();
    }

    public void onDestroy() {
        super.onDestroy();
        this.zajo.trySetException(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
    }

    protected final void zaa(ConnectionResult arg4, int arg5) {
        this.zajo.setException(ApiExceptionUtil.fromStatus(new Status(arg4.getErrorCode(), arg4.getErrorMessage(), arg4.getResolution())));
    }

    public static zabu zac(Activity arg2) {
        LifecycleFragment v2 = zabu.getFragment(arg2);
        LifecycleCallback v0 = v2.getCallbackOrNull("GmsAvailabilityHelper", zabu.class);
        if(v0 != null) {
            if(((zabu)v0).zajo.getTask().isComplete()) {
                ((zabu)v0).zajo = new TaskCompletionSource();
            }

            return ((zabu)v0);
        }

        return new zabu(v2);
    }

    protected final void zao() {
        int v0 = this.zacc.isGooglePlayServicesAvailable(this.mLifecycleFragment.getLifecycleActivity());
        Object v1 = null;
        if(v0 == 0) {
            this.zajo.setResult(v1);
            return;
        }

        if(!this.zajo.getTask().isComplete()) {
            ((zal)this).zab(new ConnectionResult(v0, ((PendingIntent)v1)), 0);
        }
    }
}

