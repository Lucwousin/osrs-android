package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@KeepForSdk public class DataBufferSafeParcelable extends AbstractDataBuffer {
    private static final String[] zaln;
    private final Parcelable$Creator zalo;

    static {
        DataBufferSafeParcelable.zaln = new String[]{"data"};
    }

    @KeepForSdk public DataBufferSafeParcelable(DataHolder arg1, Parcelable$Creator arg2) {
        super(arg1);
        this.zalo = arg2;
    }

    @KeepForSdk public static void addValue(Builder arg3, SafeParcelable arg4) {
        Parcel v0 = Parcel.obtain();
        arg4.writeToParcel(v0, 0);
        ContentValues v4 = new ContentValues();
        v4.put("data", v0.marshall());
        arg3.withRow(v4);
        v0.recycle();
    }

    @KeepForSdk public static Builder buildDataHolder() {
        return DataHolder.builder(DataBufferSafeParcelable.zaln);
    }

    @KeepForSdk public SafeParcelable get(int arg4) {
        byte[] v4 = this.mDataHolder.getByteArray("data", arg4, this.mDataHolder.getWindowIndex(arg4));
        Parcel v0 = Parcel.obtain();
        v0.unmarshall(v4, 0, v4.length);
        v0.setDataPosition(0);
        Object v4_1 = this.zalo.createFromParcel(v0);
        v0.recycle();
        return ((SafeParcelable)v4_1);
    }

    @KeepForSdk public Object get(int arg1) {
        return this.get(arg1);
    }
}

