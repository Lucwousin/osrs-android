package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Reserved;

@Class(creator="AppMetadataCreator") @Reserved(value={1}) public final class zzeb extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(id=2) public final String packageName;
    @Field(id=3) public final String zzafa;
    @Field(id=12) public final String zzafc;
    @Field(defaultValueUnchecked="Integer.MIN_VALUE", id=11) public final long zzafg;
    @Field(id=5) public final String zzafh;
    @Field(id=6) public final long zzafi;
    @Field(id=7) public final long zzafj;
    @Field(defaultValue="true", id=9) public final boolean zzafk;
    @Field(id=13) public final long zzafl;
    @Field(defaultValue="true", id=16) public final boolean zzafm;
    @Field(defaultValue="true", id=17) public final boolean zzafn;
    @Field(id=8) public final String zzafy;
    @Field(id=10) public final boolean zzafz;
    @Field(id=14) public final long zzaga;
    @Field(id=15) public final int zzagb;
    @Field(id=18) public final boolean zzagc;
    @Field(id=4) public final String zztg;

    static {
        zzeb.CREATOR = new zzec();
    }

    @Constructor zzeb(@Param(id=2) String arg4, @Param(id=3) String arg5, @Param(id=4) String arg6, @Param(id=5) String arg7, @Param(id=6) long arg8, @Param(id=7) long arg10, @Param(id=8) String arg12, @Param(id=9) boolean arg13, @Param(id=10) boolean arg14, @Param(id=11) long arg15, @Param(id=12) String arg17, @Param(id=13) long arg18, @Param(id=14) long arg20, @Param(id=15) int arg22, @Param(id=16) boolean arg23, @Param(id=17) boolean arg24, @Param(id=18) boolean arg25) {
        super();
        this.packageName = arg4;
        this.zzafa = arg5;
        this.zztg = arg6;
        this.zzafg = arg15;
        this.zzafh = arg7;
        this.zzafi = arg8;
        this.zzafj = arg10;
        this.zzafy = arg12;
        this.zzafk = arg13;
        this.zzafz = arg14;
        this.zzafc = arg17;
        this.zzafl = arg18;
        this.zzaga = arg20;
        this.zzagb = arg22;
        this.zzafm = arg23;
        this.zzafn = arg24;
        this.zzagc = arg25;
    }

    zzeb(String arg4, String arg5, String arg6, long arg7, String arg9, long arg10, long arg12, String arg14, boolean arg15, boolean arg16, String arg17, long arg18, long arg20, int arg22, boolean arg23, boolean arg24, boolean arg25) {
        zzeb v0 = this;
        super();
        Preconditions.checkNotEmpty(arg4);
        v0.packageName = arg4;
        String v1 = TextUtils.isEmpty(((CharSequence)arg5)) ? null : arg5;
        v0.zzafa = v1;
        v0.zztg = arg6;
        v0.zzafg = arg7;
        v0.zzafh = arg9;
        v0.zzafi = arg10;
        v0.zzafj = arg12;
        v0.zzafy = arg14;
        v0.zzafk = arg15;
        v0.zzafz = arg16;
        v0.zzafc = arg17;
        v0.zzafl = arg18;
        v0.zzaga = arg20;
        v0.zzagb = arg22;
        v0.zzafm = arg23;
        v0.zzafn = arg24;
        v0.zzagc = arg25;
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        arg6 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeString(arg5, 2, this.packageName, false);
        SafeParcelWriter.writeString(arg5, 3, this.zzafa, false);
        SafeParcelWriter.writeString(arg5, 4, this.zztg, false);
        SafeParcelWriter.writeString(arg5, 5, this.zzafh, false);
        SafeParcelWriter.writeLong(arg5, 6, this.zzafi);
        SafeParcelWriter.writeLong(arg5, 7, this.zzafj);
        SafeParcelWriter.writeString(arg5, 8, this.zzafy, false);
        SafeParcelWriter.writeBoolean(arg5, 9, this.zzafk);
        SafeParcelWriter.writeBoolean(arg5, 10, this.zzafz);
        SafeParcelWriter.writeLong(arg5, 11, this.zzafg);
        SafeParcelWriter.writeString(arg5, 12, this.zzafc, false);
        SafeParcelWriter.writeLong(arg5, 13, this.zzafl);
        SafeParcelWriter.writeLong(arg5, 14, this.zzaga);
        SafeParcelWriter.writeInt(arg5, 15, this.zzagb);
        SafeParcelWriter.writeBoolean(arg5, 16, this.zzafm);
        SafeParcelWriter.writeBoolean(arg5, 17, this.zzafn);
        SafeParcelWriter.writeBoolean(arg5, 18, this.zzagc);
        SafeParcelWriter.finishObjectHeader(arg5, arg6);
    }
}

