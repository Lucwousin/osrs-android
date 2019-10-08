package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Reserved;
import java.util.Iterator;

@Class(creator="EventParamsCreator") @Reserved(value={1}) public final class zzeu extends AbstractSafeParcelable implements Iterable {
    public static final Parcelable$Creator CREATOR;
    @Field(getter="z", id=2) private final Bundle zzaho;

    static {
        zzeu.CREATOR = new zzew();
    }

    @Constructor zzeu(@Param(id=2) Bundle arg1) {
        super();
        this.zzaho = arg1;
    }

    final Object get(String arg2) {
        return this.zzaho.get(arg2);
    }

    final Long getLong(String arg3) {
        return Long.valueOf(this.zzaho.getLong(arg3));
    }

    final String getString(String arg2) {
        return this.zzaho.getString(arg2);
    }

    public final Iterator iterator() {
        return new zzev(this);
    }

    public final int size() {
        return this.zzaho.size();
    }

    public final String toString() {
        return this.zzaho.toString();
    }

    public final void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeBundle(arg4, 2, this.zzin(), false);
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }

    static Bundle zza(zzeu arg0) {
        return arg0.zzaho;
    }

    final Double zzbk(String arg3) {
        return Double.valueOf(this.zzaho.getDouble(arg3));
    }

    public final Bundle zzin() {
        return new Bundle(this.zzaho);
    }
}

