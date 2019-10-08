package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;

@Class(creator="ConnectionInfoCreator") public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(id=1) Bundle zzcz;
    @Field(id=2) Feature[] zzda;

    static {
        zzb.CREATOR = new zzc();
    }

    @Constructor zzb(@Param(id=1) Bundle arg1, @Param(id=2) Feature[] arg2) {
        super();
        this.zzcz = arg1;
        this.zzda = arg2;
    }

    public zzb() {
        super();
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeBundle(arg5, 1, this.zzcz, false);
        SafeParcelWriter.writeTypedArray(arg5, 2, this.zzda, arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

