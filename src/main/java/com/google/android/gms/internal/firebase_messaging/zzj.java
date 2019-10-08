package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

final class zzj {
    private final ConcurrentHashMap zzj;
    private final ReferenceQueue zzk;

    zzj() {
        super();
        this.zzj = new ConcurrentHashMap(16, 0.75f, 10);
        this.zzk = new ReferenceQueue();
    }

    public final List zza(Throwable arg4, boolean arg5) {
        Reference v5;
        for(v5 = this.zzk.poll(); v5 != null; v5 = this.zzk.poll()) {
            this.zzj.remove(v5);
        }

        Object v5_1 = this.zzj.get(new zzk(arg4, null));
        if(v5_1 != null) {
            return ((List)v5_1);
        }

        Vector v5_2 = new Vector(2);
        Object v4 = this.zzj.putIfAbsent(new zzk(arg4, this.zzk), v5_2);
        if(v4 == null) {
            return ((List)v5_2);
        }

        return ((List)v4);
    }
}

