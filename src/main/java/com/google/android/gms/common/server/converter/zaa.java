package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import com.google.android.gms.common.server.response.FastJsonResponse$FieldConverter;

@Class(creator="ConverterWrapperCreator") public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int zale;
    @Field(getter="getStringToIntConverter", id=2) private final StringToIntConverter zapk;

    static {
        zaa.CREATOR = new zab();
    }

    @Constructor zaa(@Param(id=1) int arg1, @Param(id=2) StringToIntConverter arg2) {
        super();
        this.zale = arg1;
        this.zapk = arg2;
    }

    private zaa(StringToIntConverter arg2) {
        super();
        this.zale = 1;
        this.zapk = arg2;
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.zale);
        SafeParcelWriter.writeParcelable(arg5, 2, this.zapk, arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }

    public static zaa zaa(FieldConverter arg1) {
        if((arg1 instanceof StringToIntConverter)) {
            return new zaa(((StringToIntConverter)arg1));
        }

        throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
    }

    public final FieldConverter zaci() {
        if(this.zapk != null) {
            return this.zapk;
        }

        throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
    }
}

