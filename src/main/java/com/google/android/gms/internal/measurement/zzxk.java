package com.google.android.gms.internal.measurement;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

final class zzxk {
    private final ConcurrentHashMap zzbqd;
    private final ReferenceQueue zzbqe;

    zzxk() {
        super();
        this.zzbqd = new ConcurrentHashMap(16, 0.75f, 10);
        this.zzbqe = new ReferenceQueue();
    }

    public final List zza(Throwable arg2, boolean arg3) {
        while(true) {
            Reference v3 = this.zzbqe.poll();
            if(v3 == null) {
                break;
            }

            this.zzbqd.remove(v3);
        }

        return this.zzbqd.get(new zzxl(arg2, null));
    }
}

