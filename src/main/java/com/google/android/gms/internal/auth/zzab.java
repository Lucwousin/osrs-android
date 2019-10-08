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

@Class(creator="NotifyCompletionRequestCreator") public final class zzab extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(id=2) private final String accountType;
    @Field(id=3) private final int zzbw;
    @VersionField(id=1) private final int zzv;

    static {
        zzab.CREATOR = new zzac();
    }

    @Constructor zzab(@Param(id=1) int arg1, @Param(id=2) String arg2, @Param(id=3) int arg3) {
        super();
        this.zzv = 1;
        this.accountType = Preconditions.checkNotNull(arg2);
        this.zzbw = arg3;
    }

    public zzab(String arg2, int arg3) {
        this(1, arg2, arg3);
    }

    public final void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeInt(arg4, 1, this.zzv);
        SafeParcelWriter.writeString(arg4, 2, this.accountType, false);
        SafeParcelWriter.writeInt(arg4, 3, this.zzbw);
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }
}

