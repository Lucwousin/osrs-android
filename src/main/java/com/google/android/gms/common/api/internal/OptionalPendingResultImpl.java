package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult$StatusListener;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.ResultTransform;
import com.google.android.gms.common.api.TransformedResult;
import java.util.concurrent.TimeUnit;

@KeepForSdk public final class OptionalPendingResultImpl extends OptionalPendingResult {
    private final BasePendingResult zajp;

    public OptionalPendingResultImpl(PendingResult arg1) {
        super();
        this.zajp = ((BasePendingResult)arg1);
    }

    public final void addStatusListener(StatusListener arg2) {
        this.zajp.addStatusListener(arg2);
    }

    public final Result await() {
        return this.zajp.await();
    }

    public final Result await(long arg2, TimeUnit arg4) {
        return this.zajp.await(arg2, arg4);
    }

    public final void cancel() {
        this.zajp.cancel();
    }

    public final Result get() {
        if(((OptionalPendingResult)this).isDone()) {
            return ((PendingResult)this).await(0, TimeUnit.MILLISECONDS);
        }

        throw new IllegalStateException("Result is not available. Check that isDone() returns true before calling get().");
    }

    public final boolean isCanceled() {
        return this.zajp.isCanceled();
    }

    public final boolean isDone() {
        return this.zajp.isReady();
    }

    public final void setResultCallback(ResultCallback arg2) {
        this.zajp.setResultCallback(arg2);
    }

    public final void setResultCallback(ResultCallback arg2, long arg3, TimeUnit arg5) {
        this.zajp.setResultCallback(arg2, arg3, arg5);
    }

    @NonNull public final TransformedResult then(@NonNull ResultTransform arg2) {
        return this.zajp.then(arg2);
    }

    public final Integer zam() {
        return this.zajp.zam();
    }
}

