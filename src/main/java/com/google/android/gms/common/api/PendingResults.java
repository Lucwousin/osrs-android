package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.internal.OptionalPendingResultImpl;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk public final class PendingResults {
    final class zaa extends BasePendingResult {
        private final Result zach;

        public zaa(Result arg2) {
            super(Looper.getMainLooper());
            this.zach = arg2;
        }

        protected final Result createFailedResult(Status arg2) {
            if(arg2.getStatusCode() == this.zach.getStatus().getStatusCode()) {
                return this.zach;
            }

            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    final class zab extends BasePendingResult {
        private final Result zaci;

        public zab(GoogleApiClient arg1, Result arg2) {
            super(arg1);
            this.zaci = arg2;
        }

        protected final Result createFailedResult(Status arg1) {
            return this.zaci;
        }
    }

    final class zac extends BasePendingResult {
        public zac(GoogleApiClient arg1) {
            super(arg1);
        }

        protected final Result createFailedResult(Status arg2) {
            throw new UnsupportedOperationException("Creating failed results is not supported");
        }
    }

    @KeepForSdk private PendingResults() {
        super();
    }

    public static PendingResult canceledPendingResult() {
        StatusPendingResult v0 = new StatusPendingResult(Looper.getMainLooper());
        ((PendingResult)v0).cancel();
        return ((PendingResult)v0);
    }

    public static PendingResult canceledPendingResult(Result arg2) {
        Preconditions.checkNotNull(arg2, "Result must not be null");
        boolean v0 = arg2.getStatus().getStatusCode() == 16 ? true : false;
        Preconditions.checkArgument(v0, "Status code must be CommonStatusCodes.CANCELED");
        zaa v0_1 = new zaa(arg2);
        ((PendingResult)v0_1).cancel();
        return ((PendingResult)v0_1);
    }

    @KeepForSdk public static PendingResult immediateFailedResult(Result arg2, GoogleApiClient arg3) {
        Preconditions.checkNotNull(arg2, "Result must not be null");
        Preconditions.checkArgument(arg2.getStatus().isSuccess() ^ 1, "Status code must not be SUCCESS");
        zab v0 = new zab(arg3, arg2);
        ((BasePendingResult)v0).setResult(arg2);
        return ((PendingResult)v0);
    }

    @KeepForSdk public static OptionalPendingResult immediatePendingResult(Result arg1, GoogleApiClient arg2) {
        Preconditions.checkNotNull(arg1, "Result must not be null");
        zac v0 = new zac(arg2);
        ((BasePendingResult)v0).setResult(arg1);
        return new OptionalPendingResultImpl(((PendingResult)v0));
    }

    @KeepForSdk public static PendingResult immediatePendingResult(Status arg1, GoogleApiClient arg2) {
        Preconditions.checkNotNull(arg1, "Result must not be null");
        StatusPendingResult v0 = new StatusPendingResult(arg2);
        ((BasePendingResult)v0).setResult(((Result)arg1));
        return ((PendingResult)v0);
    }

    @KeepForSdk public static OptionalPendingResult immediatePendingResult(Result arg2) {
        Preconditions.checkNotNull(arg2, "Result must not be null");
        zac v0 = new zac(null);
        ((BasePendingResult)v0).setResult(arg2);
        return new OptionalPendingResultImpl(((PendingResult)v0));
    }

    @KeepForSdk public static PendingResult immediatePendingResult(Status arg2) {
        Preconditions.checkNotNull(arg2, "Result must not be null");
        StatusPendingResult v0 = new StatusPendingResult(Looper.getMainLooper());
        ((BasePendingResult)v0).setResult(((Result)arg2));
        return ((PendingResult)v0);
    }
}

