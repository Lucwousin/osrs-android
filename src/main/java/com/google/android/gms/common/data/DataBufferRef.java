package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk public class DataBufferRef {
    @KeepForSdk protected final DataHolder mDataHolder;
    @KeepForSdk protected int mDataRow;
    private int zalm;

    @KeepForSdk public DataBufferRef(DataHolder arg1, int arg2) {
        super();
        this.mDataHolder = Preconditions.checkNotNull(arg1);
        this.zag(arg2);
    }

    @KeepForSdk protected void copyToBuffer(String arg4, CharArrayBuffer arg5) {
        this.mDataHolder.zaa(arg4, this.mDataRow, this.zalm, arg5);
    }

    public boolean equals(Object arg4) {
        if((arg4 instanceof DataBufferRef)) {
            if((Objects.equal(Integer.valueOf(((DataBufferRef)arg4).mDataRow), Integer.valueOf(this.mDataRow))) && (Objects.equal(Integer.valueOf(((DataBufferRef)arg4).zalm), Integer.valueOf(this.zalm))) && ((DataBufferRef)arg4).mDataHolder == this.mDataHolder) {
                return 1;
            }

            return 0;
        }

        return 0;
    }

    @KeepForSdk protected boolean getBoolean(String arg4) {
        return this.mDataHolder.getBoolean(arg4, this.mDataRow, this.zalm);
    }

    @KeepForSdk protected byte[] getByteArray(String arg4) {
        return this.mDataHolder.getByteArray(arg4, this.mDataRow, this.zalm);
    }

    @KeepForSdk protected int getDataRow() {
        return this.mDataRow;
    }

    @KeepForSdk protected double getDouble(String arg4) {
        return this.mDataHolder.zab(arg4, this.mDataRow, this.zalm);
    }

    @KeepForSdk protected float getFloat(String arg4) {
        return this.mDataHolder.zaa(arg4, this.mDataRow, this.zalm);
    }

    @KeepForSdk protected int getInteger(String arg4) {
        return this.mDataHolder.getInteger(arg4, this.mDataRow, this.zalm);
    }

    @KeepForSdk protected long getLong(String arg4) {
        return this.mDataHolder.getLong(arg4, this.mDataRow, this.zalm);
    }

    @KeepForSdk protected String getString(String arg4) {
        return this.mDataHolder.getString(arg4, this.mDataRow, this.zalm);
    }

    @KeepForSdk public boolean hasColumn(String arg2) {
        return this.mDataHolder.hasColumn(arg2);
    }

    @KeepForSdk protected boolean hasNull(String arg4) {
        return this.mDataHolder.hasNull(arg4, this.mDataRow, this.zalm);
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.mDataRow), Integer.valueOf(this.zalm), this.mDataHolder});
    }

    @KeepForSdk public boolean isDataValid() {
        if(!this.mDataHolder.isClosed()) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk protected Uri parseUri(String arg4) {
        arg4 = this.mDataHolder.getString(arg4, this.mDataRow, this.zalm);
        if(arg4 == null) {
            return null;
        }

        return Uri.parse(arg4);
    }

    protected final void zag(int arg2) {
        boolean v0 = arg2 < 0 || arg2 >= this.mDataHolder.getCount() ? false : true;
        Preconditions.checkState(v0);
        this.mDataRow = arg2;
        this.zalm = this.mDataHolder.getWindowIndex(this.mDataRow);
    }
}

