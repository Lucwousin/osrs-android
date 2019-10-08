package com.google.android.gms.internal.measurement;

import java.util.Iterator;

final class zzev implements Iterator {
    private Iterator zzahp;

    zzev(zzeu arg1) {
        this.zzahq = arg1;
        super();
        this.zzahp = zzeu.zza(this.zzahq).keySet().iterator();
    }

    public final boolean hasNext() {
        return this.zzahp.hasNext();
    }

    public final Object next() {
        return this.zzahp.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}

