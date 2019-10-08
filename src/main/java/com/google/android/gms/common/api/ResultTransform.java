package com.google.android.gms.common.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.internal.zacd;

public abstract class ResultTransform {
    public ResultTransform() {
        super();
    }

    @NonNull public final PendingResult createFailedResult(@NonNull Status arg2) {
        return new zacd(arg2);
    }

    @NonNull public Status onFailure(@NonNull Status arg1) {
        return arg1;
    }

    @Nullable @WorkerThread public abstract PendingResult onSuccess(@NonNull Result arg1);
}

