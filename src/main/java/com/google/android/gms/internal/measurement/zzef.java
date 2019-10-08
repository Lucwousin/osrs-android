package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;

@Class(creator="ConditionalUserPropertyParcelCreator") public final class zzef extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(id=6) public boolean active;
    @Field(id=5) public long creationTimestamp;
    @Field(id=3) public String origin;
    @Field(id=2) public String packageName;
    @Field(id=11) public long timeToLive;
    @Field(id=7) public String triggerEventName;
    @Field(id=9) public long triggerTimeout;
    @Field(id=4) public zzka zzage;
    @Field(id=8) public zzex zzagf;
    @Field(id=10) public zzex zzagg;
    @Field(id=12) public zzex zzagh;

    static {
        zzef.CREATOR = new zzeg();
    }

    @Constructor zzef(@Param(id=2) String arg1, @Param(id=3) String arg2, @Param(id=4) zzka arg3, @Param(id=5) long arg4, @Param(id=6) boolean arg6, @Param(id=7) String arg7, @Param(id=8) zzex arg8, @Param(id=9) long arg9, @Param(id=10) zzex arg11, @Param(id=11) long arg12, @Param(id=12) zzex arg14) {
        super();
        this.packageName = arg1;
        this.origin = arg2;
        this.zzage = arg3;
        this.creationTimestamp = arg4;
        this.active = arg6;
        this.triggerEventName = arg7;
        this.zzagf = arg8;
        this.triggerTimeout = arg9;
        this.zzagg = arg11;
        this.timeToLive = arg12;
        this.zzagh = arg14;
    }

    zzef(zzef arg3) {
        super();
        Preconditions.checkNotNull(arg3);
        this.packageName = arg3.packageName;
        this.origin = arg3.origin;
        this.zzage = arg3.zzage;
        this.creationTimestamp = arg3.creationTimestamp;
        this.active = arg3.active;
        this.triggerEventName = arg3.triggerEventName;
        this.zzagf = arg3.zzagf;
        this.triggerTimeout = arg3.triggerTimeout;
        this.zzagg = arg3.zzagg;
        this.timeToLive = arg3.timeToLive;
        this.zzagh = arg3.zzagh;
    }

    public final void writeToParcel(Parcel arg6, int arg7) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg6);
        SafeParcelWriter.writeString(arg6, 2, this.packageName, false);
        SafeParcelWriter.writeString(arg6, 3, this.origin, false);
        SafeParcelWriter.writeParcelable(arg6, 4, this.zzage, arg7, false);
        SafeParcelWriter.writeLong(arg6, 5, this.creationTimestamp);
        SafeParcelWriter.writeBoolean(arg6, 6, this.active);
        SafeParcelWriter.writeString(arg6, 7, this.triggerEventName, false);
        SafeParcelWriter.writeParcelable(arg6, 8, this.zzagf, arg7, false);
        SafeParcelWriter.writeLong(arg6, 9, this.triggerTimeout);
        SafeParcelWriter.writeParcelable(arg6, 10, this.zzagg, arg7, false);
        SafeParcelWriter.writeLong(arg6, 11, this.timeToLive);
        SafeParcelWriter.writeParcelable(arg6, 12, this.zzagh, arg7, false);
        SafeParcelWriter.finishObjectHeader(arg6, v0);
    }
}

