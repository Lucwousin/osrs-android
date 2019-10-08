package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import java.util.List;

@Class(creator="WakeLockEventCreator") public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable$Creator CREATOR;
    @Field(getter="getTimeout", id=16) private final long mTimeout;
    @Field(getter="getTimeMillis", id=2) private final long zzfo;
    @Field(getter="getEventType", id=11) private int zzfp;
    @Field(getter="getWakeLockName", id=4) private final String zzfq;
    @Field(getter="getSecondaryWakeLockName", id=10) private final String zzfr;
    @Field(getter="getCodePackage", id=17) private final String zzfs;
    @Field(getter="getWakeLockType", id=5) private final int zzft;
    @Field(getter="getCallingPackages", id=6) private final List zzfu;
    @Field(getter="getEventKey", id=12) private final String zzfv;
    @Field(getter="getElapsedRealtime", id=8) private final long zzfw;
    @Field(getter="getDeviceState", id=14) private int zzfx;
    @Field(getter="getHostPackage", id=13) private final String zzfy;
    @Field(getter="getBeginPowerPercentage", id=15) private final float zzfz;
    @VersionField(id=1) private final int zzg;
    private long zzga;

    static {
        WakeLockEvent.CREATOR = new zza();
    }

    public WakeLockEvent(long arg19, int arg21, String arg22, int arg23, List arg24, String arg25, long arg26, int arg28, String arg29, String arg30, float arg31, long arg32, String arg34) {
        this(2, arg19, arg21, arg22, arg23, arg24, arg25, arg26, arg28, arg29, arg30, arg31, arg32, arg34);
    }

    @Constructor WakeLockEvent(@Param(id=1) int arg4, @Param(id=2) long arg5, @Param(id=11) int arg7, @Param(id=4) String arg8, @Param(id=5) int arg9, @Param(id=6) List arg10, @Param(id=12) String arg11, @Param(id=8) long arg12, @Param(id=14) int arg14, @Param(id=10) String arg15, @Param(id=13) String arg16, @Param(id=15) float arg17, @Param(id=16) long arg18, @Param(id=17) String arg20) {
        super();
        this.zzg = arg4;
        this.zzfo = arg5;
        this.zzfp = arg7;
        this.zzfq = arg8;
        this.zzfr = arg15;
        this.zzfs = arg20;
        this.zzft = arg9;
        this.zzga = -1;
        this.zzfu = arg10;
        this.zzfv = arg11;
        this.zzfw = arg12;
        this.zzfx = arg14;
        this.zzfy = arg16;
        this.zzfz = arg17;
        this.mTimeout = arg18;
    }

    public final int getEventType() {
        return this.zzfp;
    }

    public final long getTimeMillis() {
        return this.zzfo;
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        arg6 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.zzg);
        SafeParcelWriter.writeLong(arg5, 2, ((StatsEvent)this).getTimeMillis());
        SafeParcelWriter.writeString(arg5, 4, this.zzfq, false);
        SafeParcelWriter.writeInt(arg5, 5, this.zzft);
        SafeParcelWriter.writeStringList(arg5, 6, this.zzfu, false);
        SafeParcelWriter.writeLong(arg5, 8, this.zzfw);
        SafeParcelWriter.writeString(arg5, 10, this.zzfr, false);
        SafeParcelWriter.writeInt(arg5, 11, ((StatsEvent)this).getEventType());
        SafeParcelWriter.writeString(arg5, 12, this.zzfv, false);
        SafeParcelWriter.writeString(arg5, 13, this.zzfy, false);
        SafeParcelWriter.writeInt(arg5, 14, this.zzfx);
        SafeParcelWriter.writeFloat(arg5, 15, this.zzfz);
        SafeParcelWriter.writeLong(arg5, 16, this.mTimeout);
        SafeParcelWriter.writeString(arg5, 17, this.zzfs, false);
        SafeParcelWriter.finishObjectHeader(arg5, arg6);
    }

    public final long zzu() {
        return this.zzga;
    }

    public final String zzv() {
        String v0 = this.zzfq;
        int v1 = this.zzft;
        String v2 = this.zzfu == null ? "" : TextUtils.join(",", this.zzfu);
        int v3 = this.zzfx;
        String v4 = this.zzfr == null ? "" : this.zzfr;
        String v5 = this.zzfy == null ? "" : this.zzfy;
        float v6 = this.zzfz;
        String v7 = this.zzfs == null ? "" : this.zzfs;
        StringBuilder v9 = new StringBuilder(String.valueOf(v0).length() + 45 + String.valueOf(v2).length() + String.valueOf(v4).length() + String.valueOf(v5).length() + String.valueOf(v7).length());
        v9.append("\t");
        v9.append(v0);
        v9.append("\t");
        v9.append(v1);
        v9.append("\t");
        v9.append(v2);
        v9.append("\t");
        v9.append(v3);
        v9.append("\t");
        v9.append(v4);
        v9.append("\t");
        v9.append(v5);
        v9.append("\t");
        v9.append(v6);
        v9.append("\t");
        v9.append(v7);
        return v9.toString();
    }
}

