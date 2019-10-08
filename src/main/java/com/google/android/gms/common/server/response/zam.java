package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;

@ShowFirstParty @Class(creator="FieldMapPairCreator") public final class zam extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int versionCode;
    @Field(id=2) final String zaqy;
    @Field(id=3) final com.google.android.gms.common.server.response.FastJsonResponse$Field zaqz;

    static {
        zam.CREATOR = new zaj();
    }

    @Constructor zam(@Param(id=1) int arg1, @Param(id=2) String arg2, @Param(id=3) com.google.android.gms.common.server.response.FastJsonResponse$Field arg3) {
        super();
        this.versionCode = arg1;
        this.zaqy = arg2;
        this.zaqz = arg3;
    }

    zam(String arg2, com.google.android.gms.common.server.response.FastJsonResponse$Field arg3) {
        super();
        this.versionCode = 1;
        this.zaqy = arg2;
        this.zaqz = arg3;
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.versionCode);
        SafeParcelWriter.writeString(arg5, 2, this.zaqy, false);
        SafeParcelWriter.writeParcelable(arg5, 3, this.zaqz, arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

