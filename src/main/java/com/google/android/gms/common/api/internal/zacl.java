package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

final class zacl implements Continuation {
    zacl() {
        super();
    }

    public final Object then(@NonNull Task arg4) throws Exception {
        if(arg4.getResult().booleanValue()) {
            return null;
        }

        throw new ApiException(new Status(13, "listener already unregistered"));
    }
}

