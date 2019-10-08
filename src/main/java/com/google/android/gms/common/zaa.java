package com.google.android.gms.common;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class zaa implements Continuation {
    zaa(GoogleApiAvailability arg1) {
        super();
    }

    public final Object then(@NonNull Task arg1) throws Exception {
        arg1.getResult();
        return null;
    }
}

