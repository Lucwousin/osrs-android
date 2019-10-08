package com.google.android.gms.common.api;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataBuffer;
import java.util.Iterator;

@KeepForSdk public class DataBufferResponse extends Response implements DataBuffer {
    @KeepForSdk public DataBufferResponse() {
        super();
    }

    @KeepForSdk public DataBufferResponse(@NonNull AbstractDataBuffer arg1) {
        super(((Result)arg1));
    }

    public void close() {
        this.getResult().close();
    }

    public Object get(int arg2) {
        return this.getResult().get(arg2);
    }

    public int getCount() {
        return this.getResult().getCount();
    }

    public Bundle getMetadata() {
        return this.getResult().getMetadata();
    }

    public boolean isClosed() {
        return this.getResult().isClosed();
    }

    public Iterator iterator() {
        return this.getResult().iterator();
    }

    public void release() {
        this.getResult().release();
    }

    public Iterator singleRefIterator() {
        return this.getResult().singleRefIterator();
    }
}

