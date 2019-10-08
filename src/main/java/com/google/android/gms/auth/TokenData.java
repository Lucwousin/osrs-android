package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import java.util.List;

@Class(creator="TokenDataCreator") public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(getter="getGrantedScopes", id=6) private final List zzaa;
    @Field(getter="getScopeData", id=7) private final String zzab;
    @VersionField(id=1) private final int zzv;
    @Field(getter="getToken", id=2) private final String zzw;
    @Field(getter="getExpirationTimeSecs", id=3) private final Long zzx;
    @Field(getter="isCached", id=4) private final boolean zzy;
    @Field(getter="isSnowballed", id=5) private final boolean zzz;

    static {
        TokenData.CREATOR = new zzk();
    }

    @Constructor TokenData(@Param(id=1) int arg1, @Param(id=2) String arg2, @Param(id=3) Long arg3, @Param(id=4) boolean arg4, @Param(id=5) boolean arg5, @Param(id=6) List arg6, @Param(id=7) String arg7) {
        super();
        this.zzv = arg1;
        this.zzw = Preconditions.checkNotEmpty(arg2);
        this.zzx = arg3;
        this.zzy = arg4;
        this.zzz = arg5;
        this.zzaa = arg6;
        this.zzab = arg7;
    }

    public boolean equals(Object arg4) {
        if(!(arg4 instanceof TokenData)) {
            return 0;
        }

        if((TextUtils.equals(this.zzw, ((TokenData)arg4).zzw)) && (Objects.equal(this.zzx, ((TokenData)arg4).zzx)) && this.zzy == ((TokenData)arg4).zzy && this.zzz == ((TokenData)arg4).zzz && (Objects.equal(this.zzaa, ((TokenData)arg4).zzaa)) && (Objects.equal(this.zzab, ((TokenData)arg4).zzab))) {
            return 1;
        }

        return 0;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zzw, this.zzx, Boolean.valueOf(this.zzy), Boolean.valueOf(this.zzz), this.zzaa, this.zzab});
    }

    public void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeInt(arg4, 1, this.zzv);
        SafeParcelWriter.writeString(arg4, 2, this.zzw, false);
        SafeParcelWriter.writeLongObject(arg4, 3, this.zzx, false);
        SafeParcelWriter.writeBoolean(arg4, 4, this.zzy);
        SafeParcelWriter.writeBoolean(arg4, 5, this.zzz);
        SafeParcelWriter.writeStringList(arg4, 6, this.zzaa, false);
        SafeParcelWriter.writeString(arg4, 7, this.zzab, false);
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }

    @Nullable public static TokenData zza(Bundle arg1, String arg2) {
        arg1.setClassLoader(TokenData.class.getClassLoader());
        arg1 = arg1.getBundle(arg2);
        if(arg1 == null) {
            return null;
        }

        arg1.setClassLoader(TokenData.class.getClassLoader());
        return arg1.getParcelable("TokenData");
    }

    public final String zzb() {
        return this.zzw;
    }
}

