package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;

@Class(creator="AuthAccountResultCreator") public final class zaa extends AbstractSafeParcelable implements Result {
    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int zale;
    @Field(getter="getConnectionResultCode", id=2) private int zarw;
    @Field(getter="getRawAuthResolutionIntent", id=3) private Intent zarx;

    static {
        zaa.CREATOR = new zab();
    }

    @Constructor zaa(@Param(id=1) int arg1, @Param(id=2) int arg2, @Param(id=3) Intent arg3) {
        super();
        this.zale = arg1;
        this.zarw = arg2;
        this.zarx = arg3;
    }

    public zaa() {
        this(0, null);
    }

    private zaa(int arg2, Intent arg3) {
        this(2, 0, null);
    }

    public final Status getStatus() {
        if(this.zarw == 0) {
            return Status.RESULT_SUCCESS;
        }

        return Status.RESULT_CANCELED;
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.zale);
        SafeParcelWriter.writeInt(arg5, 2, this.zarw);
        SafeParcelWriter.writeParcelable(arg5, 3, this.zarx, arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

