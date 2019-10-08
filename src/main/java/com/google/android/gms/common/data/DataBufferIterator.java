package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

@KeepForSdk public class DataBufferIterator implements Iterator {
    protected final DataBuffer zalj;
    protected int zalk;

    public DataBufferIterator(DataBuffer arg1) {
        super();
        this.zalj = Preconditions.checkNotNull(arg1);
        this.zalk = -1;
    }

    public boolean hasNext() {
        if(this.zalk < this.zalj.getCount() - 1) {
            return 1;
        }

        return 0;
    }

    public Object next() {
        int v1;
        if(this.hasNext()) {
            DataBuffer v0 = this.zalj;
            v1 = this.zalk + 1;
            this.zalk = v1;
            return v0.get(v1);
        }

        v1 = this.zalk;
        StringBuilder v3 = new StringBuilder(46);
        v3.append("Cannot advance the iterator beyond ");
        v3.append(v1);
        throw new NoSuchElementException(v3.toString());
    }

    public void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}

