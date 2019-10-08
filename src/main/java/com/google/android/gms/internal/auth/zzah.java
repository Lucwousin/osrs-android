package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
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

@Class(creator="UserChallengeRequestCreator") public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(id=2) private final String accountType;
    @Field(id=3) private final PendingIntent zzbx;
    @VersionField(id=1) private final int zzv;

    static {
        zzah.CREATOR = new zzai();
    }

    @Constructor zzah(@Param(id=1) int arg1, @Param(id=2) String arg2, @Param(id=3) PendingIntent arg3) {
        super();
        this.zzv = 1;
        this.accountType = Preconditions.checkNotNull(arg2);
        this.zzbx = Preconditions.checkNotNull(arg3);
    }

    public zzah(String arg2, PendingIntent arg3) {
        this(1, arg2, arg3);
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.zzv);
        SafeParcelWriter.writeString(arg5, 2, this.accountType, false);
        SafeParcelWriter.writeParcelable(arg5, 3, this.zzbx, arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

