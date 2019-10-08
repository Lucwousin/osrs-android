package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;

@Class(creator="SignInRequestCreator") public final class zah extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int zale;
    @Field(getter="getResolveAccountRequest", id=2) private final ResolveAccountRequest zasa;

    static {
        zah.CREATOR = new zai();
    }

    @Constructor zah(@Param(id=1) int arg1, @Param(id=2) ResolveAccountRequest arg2) {
        super();
        this.zale = arg1;
        this.zasa = arg2;
    }

    public zah(ResolveAccountRequest arg2) {
        this(1, arg2);
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.zale);
        SafeParcelWriter.writeParcelable(arg5, 2, this.zasa, arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

