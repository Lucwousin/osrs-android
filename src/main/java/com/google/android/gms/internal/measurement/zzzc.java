package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzzc implements Iterator {
    private final int limit;
    private int position;

    zzzc(zzzb arg1) {
        this.zzbtg = arg1;
        super();
        this.position = 0;
        this.limit = this.zzbtg.size();
    }

    public final boolean hasNext() {
        if(this.position < this.limit) {
            return 1;
        }

        return 0;
    }

    public final Object next() {
        return Byte.valueOf(this.nextByte());
    }

    private final byte nextByte() {
        try {
            zzzb v0_1 = this.zzbtg;
            int v1 = this.position;
            this.position = v1 + 1;
            return v0_1.zzae(v1);
        }
        catch(IndexOutOfBoundsException v0) {
            throw new NoSuchElementException(v0.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

