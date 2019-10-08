package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;

@Class(creator="AccountChangeEventCreator") public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable$Creator CREATOR;
    @VersionField(id=1) private final int zze;
    @Field(id=2) private final long zzf;
    @Field(id=3) private final String zzg;
    @Field(id=4) private final int zzh;
    @Field(id=5) private final int zzi;
    @Field(id=6) private final String zzj;

    static {
        AccountChangeEvent.CREATOR = new zza();
    }

    @Constructor AccountChangeEvent(@Param(id=1) int arg1, @Param(id=2) long arg2, @Param(id=3) String arg4, @Param(id=4) int arg5, @Param(id=5) int arg6, @Param(id=6) String arg7) {
        super();
        this.zze = arg1;
        this.zzf = arg2;
        this.zzg = Preconditions.checkNotNull(arg4);
        this.zzh = arg5;
        this.zzi = arg6;
        this.zzj = arg7;
    }

    public AccountChangeEvent(long arg2, String arg4, int arg5, int arg6, String arg7) {
        super();
        this.zze = 1;
        this.zzf = arg2;
        this.zzg = Preconditions.checkNotNull(arg4);
        this.zzh = arg5;
        this.zzi = arg6;
        this.zzj = arg7;
    }

    public boolean equals(Object arg8) {
        if((((AccountChangeEvent)arg8)) == this) {
            return 1;
        }

        if((arg8 instanceof AccountChangeEvent)) {
            if(this.zze == ((AccountChangeEvent)arg8).zze && this.zzf == ((AccountChangeEvent)arg8).zzf && (Objects.equal(this.zzg, ((AccountChangeEvent)arg8).zzg)) && this.zzh == ((AccountChangeEvent)arg8).zzh && this.zzi == ((AccountChangeEvent)arg8).zzi && (Objects.equal(this.zzj, ((AccountChangeEvent)arg8).zzj))) {
                return 1;
            }

            return 0;
        }

        return 0;
    }

    public String getAccountName() {
        return this.zzg;
    }

    public String getChangeData() {
        return this.zzj;
    }

    public int getChangeType() {
        return this.zzh;
    }

    public int getEventIndex() {
        return this.zzi;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{Integer.valueOf(this.zze), Long.valueOf(this.zzf), this.zzg, Integer.valueOf(this.zzh), Integer.valueOf(this.zzi), this.zzj});
    }

    public String toString() {
        String v0 = "UNKNOWN";
        switch(this.zzh) {
            case 1: {
                v0 = "ADDED";
                break;
            }
            case 2: {
                v0 = "REMOVED";
                break;
            }
            case 3: {
                v0 = "RENAMED_FROM";
                break;
            }
            case 4: {
                v0 = "RENAMED_TO";
                break;
            }
            default: {
                break;
            }
        }

        String v1 = this.zzg;
        String v2 = this.zzj;
        int v3 = this.zzi;
        StringBuilder v5 = new StringBuilder(String.valueOf(v1).length() + 91 + String.valueOf(v0).length() + String.valueOf(v2).length());
        v5.append("AccountChangeEvent {accountName = ");
        v5.append(v1);
        v5.append(", changeType = ");
        v5.append(v0);
        v5.append(", changeData = ");
        v5.append(v2);
        v5.append(", eventIndex = ");
        v5.append(v3);
        v5.append("}");
        return v5.toString();
    }

    public void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeInt(arg4, 1, this.zze);
        SafeParcelWriter.writeLong(arg4, 2, this.zzf);
        SafeParcelWriter.writeString(arg4, 3, this.zzg, false);
        SafeParcelWriter.writeInt(arg4, 4, this.zzh);
        SafeParcelWriter.writeInt(arg4, 5, this.zzi);
        SafeParcelWriter.writeString(arg4, 6, this.zzj, false);
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }
}

