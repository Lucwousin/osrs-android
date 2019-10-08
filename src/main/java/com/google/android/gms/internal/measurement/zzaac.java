package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map$Entry;

final class zzaac implements Iterator {
    private Iterator zzbvc;

    public zzaac(Iterator arg1) {
        super();
        this.zzbvc = arg1;
    }

    public final boolean hasNext() {
        return this.zzbvc.hasNext();
    }

    public final Object next() {
        Object v0 = this.zzbvc.next();
        if((((Map$Entry)v0).getValue() instanceof zzzz)) {
            return new zzaab(((Map$Entry)v0), null);
        }

        return v0;
    }

    public final void remove() {
        this.zzbvc.remove();
    }
}

