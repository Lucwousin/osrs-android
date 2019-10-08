package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;

@KeepForSdk @Class(creator="FavaDiagnosticsEntityCreator") public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int zale;
    @Field(id=2) private final String zapi;
    @Field(id=3) private final int zapj;

    static {
        FavaDiagnosticsEntity.CREATOR = new zaa();
    }

    @Constructor public FavaDiagnosticsEntity(@Param(id=1) int arg1, @Param(id=2) String arg2, @Param(id=3) int arg3) {
        super();
        this.zale = arg1;
        this.zapi = arg2;
        this.zapj = arg3;
    }

    @KeepForSdk public FavaDiagnosticsEntity(String arg2, int arg3) {
        super();
        this.zale = 1;
        this.zapi = arg2;
        this.zapj = arg3;
    }

    public void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeInt(arg4, 1, this.zale);
        SafeParcelWriter.writeString(arg4, 2, this.zapi, false);
        SafeParcelWriter.writeInt(arg4, 3, this.zapj);
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }
}

