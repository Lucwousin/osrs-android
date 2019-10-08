package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;

@Class(creator="SignInResponseCreator") public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(getter="getConnectionResult", id=2) private final ConnectionResult zadh;
    @VersionField(id=1) private final int zale;
    @Field(getter="getResolveAccountResponse", id=3) private final ResolveAccountResponse zasb;

    static {
        zaj.CREATOR = new zak();
    }

    @Constructor zaj(@Param(id=1) int arg1, @Param(id=2) ConnectionResult arg2, @Param(id=3) ResolveAccountResponse arg3) {
        super();
        this.zale = arg1;
        this.zadh = arg2;
        this.zasb = arg3;
    }

    public zaj(int arg3) {
        this(new ConnectionResult(8, null), null);
    }

    private zaj(ConnectionResult arg2, ResolveAccountResponse arg3) {
        this(1, arg2, null);
    }

    public final ConnectionResult getConnectionResult() {
        return this.zadh;
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.zale);
        SafeParcelWriter.writeParcelable(arg5, 2, this.zadh, arg6, false);
        SafeParcelWriter.writeParcelable(arg5, 3, this.zasb, arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }

    public final ResolveAccountResponse zacw() {
        return this.zasb;
    }
}

