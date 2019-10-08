package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map$Entry;

final class zzabe extends zzabd {
    zzabe(int arg2) {
        super(arg2, null);
    }

    public final void zzru() {
        if(!((zzabd)this).isImmutable()) {
            int v0;
            for(v0 = 0; v0 < ((zzabd)this).zzuy(); ++v0) {
                Map$Entry v1 = ((zzabd)this).zzah(v0);
                if(v1.getKey().zztz()) {
                    v1.setValue(Collections.unmodifiableList(v1.getValue()));
                }
            }

            Iterator v0_1 = ((zzabd)this).zzuz().iterator();
            while(v0_1.hasNext()) {
                Object v1_1 = v0_1.next();
                if(!((Map$Entry)v1_1).getKey().zztz()) {
                    continue;
                }

                ((Map$Entry)v1_1).setValue(Collections.unmodifiableList(((Map$Entry)v1_1).getValue()));
            }
        }

        super.zzru();
    }
}

