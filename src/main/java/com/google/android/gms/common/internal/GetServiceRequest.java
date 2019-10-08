package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Reserved;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;

@KeepForSdk @Class(creator="GetServiceRequestCreator") @Reserved(value={9}) public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int version;
    @Field(id=2) private final int zzdf;
    @Field(id=3) private int zzdg;
    @Field(id=4) String zzdh;
    @Field(id=5) IBinder zzdi;
    @Field(id=6) Scope[] zzdj;
    @Field(id=7) Bundle zzdk;
    @Field(id=8) Account zzdl;
    @Field(id=10) Feature[] zzdm;
    @Field(id=11) Feature[] zzdn;
    @Field(id=12) private boolean zzdo;

    static {
        GetServiceRequest.CREATOR = new zzd();
    }

    public GetServiceRequest(int arg2) {
        super();
        this.version = 4;
        this.zzdg = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.zzdf = arg2;
        this.zzdo = true;
    }

    @Constructor GetServiceRequest(@Param(id=1) int arg1, @Param(id=2) int arg2, @Param(id=3) int arg3, @Param(id=4) String arg4, @Param(id=5) IBinder arg5, @Param(id=6) Scope[] arg6, @Param(id=7) Bundle arg7, @Param(id=8) Account arg8, @Param(id=10) Feature[] arg9, @Param(id=11) Feature[] arg10, @Param(id=12) boolean arg11) {
        super();
        this.version = arg1;
        this.zzdf = arg2;
        this.zzdg = arg3;
        this.zzdh = "com.google.android.gms".equals(arg4) ? "com.google.android.gms" : arg4;
        if(arg1 < 2) {
            Account v1 = null;
            if(arg5 != null) {
                v1 = AccountAccessor.getAccountBinderSafe(Stub.asInterface(arg5));
            }

            this.zzdl = v1;
        }
        else {
            this.zzdi = arg5;
            this.zzdl = arg8;
        }

        this.zzdj = arg6;
        this.zzdk = arg7;
        this.zzdm = arg9;
        this.zzdn = arg10;
        this.zzdo = arg11;
    }

    @KeepForSdk public Bundle getExtraArgs() {
        return this.zzdk;
    }

    public void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.version);
        SafeParcelWriter.writeInt(arg5, 2, this.zzdf);
        SafeParcelWriter.writeInt(arg5, 3, this.zzdg);
        SafeParcelWriter.writeString(arg5, 4, this.zzdh, false);
        SafeParcelWriter.writeIBinder(arg5, 5, this.zzdi, false);
        SafeParcelWriter.writeTypedArray(arg5, 6, this.zzdj, arg6, false);
        SafeParcelWriter.writeBundle(arg5, 7, this.zzdk, false);
        SafeParcelWriter.writeParcelable(arg5, 8, this.zzdl, arg6, false);
        SafeParcelWriter.writeTypedArray(arg5, 10, this.zzdm, arg6, false);
        SafeParcelWriter.writeTypedArray(arg5, 11, this.zzdn, arg6, false);
        SafeParcelWriter.writeBoolean(arg5, 12, this.zzdo);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }
}

