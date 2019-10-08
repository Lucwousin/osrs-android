package com.google.android.gms.internal.auth-api;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Reserved;

@Class(creator="SaveRequestCreator") @Reserved(value={1000}) public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(getter="getCredential", id=1) private final Credential zzal;

    static {
        zzy.CREATOR = new zzz();
    }

    @Constructor public zzy(@Param(id=1) Credential arg1) {
        super();
        this.zzal = arg1;
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeParcelable(arg5, 1, this.zzal, arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

