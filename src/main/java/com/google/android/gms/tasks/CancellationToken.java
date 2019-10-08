package com.google.android.gms.tasks;

import androidx.annotation.NonNull;

public abstract class CancellationToken {
    public CancellationToken() {
        super();
    }

    public abstract boolean isCancellationRequested();

    public abstract CancellationToken onCanceledRequested(@NonNull OnTokenCanceledListener arg1);
}

