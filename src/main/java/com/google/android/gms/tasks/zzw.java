package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class zzw implements Continuation {
    zzw(Collection arg1) {
        this.zzae = arg1;
        super();
    }

    public final Object then(@NonNull Task arg3) throws Exception {
        if(this.zzae.size() == 0) {
            return Collections.emptyList();
        }

        ArrayList v3 = new ArrayList();
        Iterator v0 = this.zzae.iterator();
        while(v0.hasNext()) {
            ((List)v3).add(v0.next().getResult());
        }

        return v3;
    }
}

