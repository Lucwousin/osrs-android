package com.google.firebase.iid;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

final class zzu implements Continuation {
    zzu(zzr arg1) {
        this.zzbr = arg1;
        super();
    }

    public final Object then(@NonNull Task arg2) throws Exception {
        return zzr.zza(this.zzbr, arg2.getResult(IOException.class));
    }
}

