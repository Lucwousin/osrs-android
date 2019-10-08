package com.google.android.gms.internal.measurement;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map$Entry;

final class zzabk extends AbstractSet {
    zzabk(zzabd arg1, zzabe arg2) {
        this(arg1);
    }

    private zzabk(zzabd arg1) {
        this.zzbwm = arg1;
        super();
    }

    public final boolean add(Object arg3) {
        if(!this.contains(arg3)) {
            this.zzbwm.zza(((Map$Entry)arg3).getKey(), ((Map$Entry)arg3).getValue());
            return 1;
        }

        return 0;
    }

    public final void clear() {
        this.zzbwm.clear();
    }

    public final boolean contains(Object arg3) {
        Object v0 = this.zzbwm.get(((Map$Entry)arg3).getKey());
        arg3 = ((Map$Entry)arg3).getValue();
        if(v0 != arg3 && (v0 == null || !v0.equals(arg3))) {
            return 0;
        }

        return 1;
    }

    public final Iterator iterator() {
        return new zzabj(this.zzbwm, null);
    }

    public final boolean remove(Object arg2) {
        if(this.contains(arg2)) {
            this.zzbwm.remove(((Map$Entry)arg2).getKey());
            return 1;
        }

        return 0;
    }

    public final int size() {
        return this.zzbwm.size();
    }
}

