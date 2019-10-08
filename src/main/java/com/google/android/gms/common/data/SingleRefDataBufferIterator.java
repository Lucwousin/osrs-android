package com.google.android.gms.common.data;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.NoSuchElementException;

@KeepForSdk public class SingleRefDataBufferIterator extends DataBufferIterator {
    private Object zamf;

    public SingleRefDataBufferIterator(DataBuffer arg1) {
        super(arg1);
    }

    public Object next() {
        StringBuilder v3;
        if(((DataBufferIterator)this).hasNext()) {
            ++this.zalk;
            if(this.zalk == 0) {
                this.zamf = this.zalj.get(0);
                if((this.zamf instanceof DataBufferRef)) {
                }
                else {
                    String v1 = String.valueOf(this.zamf.getClass());
                    v3 = new StringBuilder(String.valueOf(v1).length() + 44);
                    v3.append("DataBuffer reference of type ");
                    v3.append(v1);
                    v3.append(" is not movable");
                    throw new IllegalStateException(v3.toString());
                }
            }
            else {
                this.zamf.zag(this.zalk);
            }

            return this.zamf;
        }

        int v1_1 = this.zalk;
        v3 = new StringBuilder(46);
        v3.append("Cannot advance the iterator beyond ");
        v3.append(v1_1);
        throw new NoSuchElementException(v3.toString());
    }
}

