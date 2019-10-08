package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class zzx implements Continuation {
    zzx(Collection arg1) {
        this.zzae = arg1;
        super();
    }

    public final Object then(@NonNull Task arg2) throws Exception {
        ArrayList v2 = new ArrayList();
        ((List)v2).addAll(this.zzae);
        return Tasks.forResult(v2);
    }
}

