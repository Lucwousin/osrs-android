package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;

@KeepForSdk @Class(creator="FeatureCreator") public class Feature extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(getter="getName", id=1) private final String name;
    @Field(getter="getOldVersion", id=2) @Deprecated private final int zzk;
    @Field(defaultValue="-1", getter="getVersion", id=3) private final long zzl;

    static {
        Feature.CREATOR = new zzb();
    }

    @Constructor public Feature(@Param(id=1) String arg1, @Param(id=2) int arg2, @Param(id=3) long arg3) {
        super();
        this.name = arg1;
        this.zzk = arg2;
        this.zzl = arg3;
    }

    @KeepForSdk public Feature(String arg1, long arg2) {
        super();
        this.name = arg1;
        this.zzl = arg2;
        this.zzk = -1;
    }

    public boolean equals(@Nullable Object arg7) {
        if((arg7 instanceof Feature)) {
            if((this.getName() != null && (this.getName().equals(((Feature)arg7).getName())) || this.getName() == null && ((Feature)arg7).getName() == null) && this.getVersion() == ((Feature)arg7).getVersion()) {
                return 1;
            }

            return 0;
        }

        return 0;
    }

    @KeepForSdk public String getName() {
        return this.name;
    }

    @KeepForSdk public long getVersion() {
        if(this.zzl == -1) {
            return ((long)this.zzk);
        }

        return this.zzl;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.getName(), Long.valueOf(this.getVersion())});
    }

    public String toString() {
        return Objects.toStringHelper(this).add("name", this.getName()).add("version", Long.valueOf(this.getVersion())).toString();
    }

    public void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeString(arg4, 1, this.getName(), false);
        SafeParcelWriter.writeInt(arg4, 2, this.zzk);
        SafeParcelWriter.writeLong(arg4, 3, this.getVersion());
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }
}

