package com.google.firebase;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

public class FirebaseException extends Exception {
    @Deprecated protected FirebaseException() {
        super();
    }

    public FirebaseException(@NonNull String arg2) {
        super(Preconditions.checkNotEmpty(arg2, "Detail message must not be empty"));
    }

    public FirebaseException(@NonNull String arg2, Throwable arg3) {
        super(Preconditions.checkNotEmpty(arg2, "Detail message must not be empty"), arg3);
    }
}

