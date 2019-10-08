package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.TimeUnit;

@KeepForSdk public abstract class PendingResult {
    @KeepForSdk public interface StatusListener {
        @KeepForSdk void onComplete(Status arg1);
    }

    public PendingResult() {
        super();
    }

    @KeepForSdk public void addStatusListener(@NonNull StatusListener arg1) {
        throw new UnsupportedOperationException();
    }

    @NonNull public abstract Result await();

    @NonNull public abstract Result await(long arg1, @NonNull TimeUnit arg2);

    public abstract void cancel();

    public abstract boolean isCanceled();

    public abstract void setResultCallback(@NonNull ResultCallback arg1);

    public abstract void setResultCallback(@NonNull ResultCallback arg1, long arg2, @NonNull TimeUnit arg3);

    @NonNull public TransformedResult then(@NonNull ResultTransform arg1) {
        throw new UnsupportedOperationException();
    }

    @Nullable public Integer zam() {
        throw new UnsupportedOperationException();
    }
}

