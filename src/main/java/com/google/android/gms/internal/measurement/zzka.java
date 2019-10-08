package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;

@Class(creator="UserAttributeParcelCreator") public final class zzka extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(id=2) public final String name;
    @Field(id=7) public final String origin;
    @Field(id=1) private final int versionCode;
    @Field(id=6) private final String zzale;
    @Field(id=3) public final long zzast;
    @Field(id=4) private final Long zzasu;
    @Field(id=5) private final Float zzasv;
    @Field(id=8) private final Double zzasw;

    static {
        zzka.CREATOR = new zzkb();
    }

    @Constructor zzka(@Param(id=1) int arg1, @Param(id=2) String arg2, @Param(id=3) long arg3, @Param(id=4) Long arg5, @Param(id=5) Float arg6, @Param(id=6) String arg7, @Param(id=7) String arg8, @Param(id=8) Double arg9) {
        Double v2_1;
        super();
        this.versionCode = arg1;
        this.name = arg2;
        this.zzast = arg3;
        this.zzasu = arg5;
        Float v2 = null;
        this.zzasv = v2;
        if(arg1 == 1) {
            if(arg6 != null) {
                v2_1 = Double.valueOf(arg6.doubleValue());
            }

            this.zzasw = v2_1;
        }
        else {
            this.zzasw = arg9;
        }

        this.zzale = arg7;
        this.origin = arg8;
    }

    zzka(String arg2, long arg3, Object arg5, String arg6) {
        super();
        Preconditions.checkNotEmpty(arg2);
        this.versionCode = 2;
        this.name = arg2;
        this.zzast = arg3;
        this.origin = arg6;
        Long v2 = null;
        if(arg5 == null) {
            this.zzasu = v2;
            this.zzasv = ((Float)v2);
            this.zzasw = ((Double)v2);
            this.zzale = ((String)v2);
            return;
        }

        if((arg5 instanceof Long)) {
            this.zzasu = ((Long)arg5);
            this.zzasv = ((Float)v2);
            this.zzasw = ((Double)v2);
            this.zzale = ((String)v2);
            return;
        }

        if((arg5 instanceof String)) {
            this.zzasu = v2;
            this.zzasv = ((Float)v2);
            this.zzasw = ((Double)v2);
            this.zzale = ((String)arg5);
            return;
        }

        if((arg5 instanceof Double)) {
            this.zzasu = v2;
            this.zzasv = ((Float)v2);
            this.zzasw = ((Double)arg5);
            this.zzale = ((String)v2);
            return;
        }

        throw new IllegalArgumentException("User attribute given of un-supported type");
    }

    zzka(zzkc arg7) {
        this(arg7.name, arg7.zzast, arg7.value, arg7.origin);
    }

    public final Object getValue() {
        if(this.zzasu != null) {
            return this.zzasu;
        }

        if(this.zzasw != null) {
            return this.zzasw;
        }

        if(this.zzale != null) {
            return this.zzale;
        }

        return null;
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        arg6 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.versionCode);
        SafeParcelWriter.writeString(arg5, 2, this.name, false);
        SafeParcelWriter.writeLong(arg5, 3, this.zzast);
        SafeParcelWriter.writeLongObject(arg5, 4, this.zzasu, false);
        SafeParcelWriter.writeFloatObject(arg5, 5, null, false);
        SafeParcelWriter.writeString(arg5, 6, this.zzale, false);
        SafeParcelWriter.writeString(arg5, 7, this.origin, false);
        SafeParcelWriter.writeDoubleObject(arg5, 8, this.zzasw, false);
        SafeParcelWriter.finishObjectHeader(arg5, arg6);
    }
}

