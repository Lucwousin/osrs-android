package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;

@Class(creator="DeviceMetaDataCreator") public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(getter="isLockScreenSolved", id=2) private boolean zzbs;
    @Field(getter="getMinAgeOfLockScreen", id=3) private long zzbt;
    @Field(getter="isChallengeAllowed", id=4) private final boolean zzbu;
    @VersionField(id=1) private final int zzv;

    static {
        DeviceMetaData.CREATOR = new zzv();
    }

    @Constructor DeviceMetaData(@Param(id=1) int arg1, @Param(id=2) boolean arg2, @Param(id=3) long arg3, @Param(id=4) boolean arg5) {
        super();
        this.zzv = arg1;
        this.zzbs = arg2;
        this.zzbt = arg3;
        this.zzbu = arg5;
    }

    public long getMinAgeOfLockScreen() {
        return this.zzbt;
    }

    public boolean isChallengeAllowed() {
        return this.zzbu;
    }

    public boolean isLockScreenSolved() {
        return this.zzbs;
    }

    public void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeInt(arg4, 1, this.zzv);
        SafeParcelWriter.writeBoolean(arg4, 2, this.isLockScreenSolved());
        SafeParcelWriter.writeLong(arg4, 3, this.getMinAgeOfLockScreen());
        SafeParcelWriter.writeBoolean(arg4, 4, this.isChallengeAllowed());
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }
}

