package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;

@Class(creator="SendDataRequestCreator") public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(id=2) private final String accountType;
    @Field(id=3) private final byte[] zzbp;
    @VersionField(id=1) private final int zzv;

    static {
        zzaf.CREATOR = new zzag();
    }

    @Constructor zzaf(@Param(id=1) int arg1, @Param(id=2) String arg2, @Param(id=3) byte[] arg3) {
        super();
        this.zzv = 1;
        this.accountType = Preconditions.checkNotNull(arg2);
        this.zzbp = Preconditions.checkNotNull(arg3);
    }

    public zzaf(String arg2, byte[] arg3) {
        this(1, arg2, arg3);
    }

    public final void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeInt(arg4, 1, this.zzv);
        SafeParcelWriter.writeString(arg4, 2, this.accountType, false);
        SafeParcelWriter.writeByteArray(arg4, 3, this.zzbp, false);
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }
}

