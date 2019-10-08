package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AsyncTaskLoader;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class zze extends AsyncTaskLoader implements SignInConnectionListener {
    private Semaphore zzbg;
    private Set zzbh;

    public zze(Context arg2, Set arg3) {
        super(arg2);
        this.zzbg = new Semaphore(0);
        this.zzbh = arg3;
    }

    public final Object loadInBackground() {
        return this.zzf();
    }

    public final void onComplete() {
        this.zzbg.release();
    }

    protected final void onStartLoading() {
        this.zzbg.drainPermits();
        this.forceLoad();
    }

    private final Void zzf() {
        Iterator v0 = this.zzbh.iterator();
        int v1;
        for(v1 = 0; v0.hasNext(); ++v1) {
            if(!v0.next().maybeSignIn(((SignInConnectionListener)this))) {
                continue;
            }
        }

        try {
            this.zzbg.tryAcquire(v1, 5, TimeUnit.SECONDS);
        }
        catch(InterruptedException v0_1) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", ((Throwable)v0_1));
            Thread.currentThread().interrupt();
        }

        return null;
    }
}

