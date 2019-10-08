package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Reserved;

@Class(creator="SignInConfigurationCreator") @Reserved(value={1}) public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(getter="getConsumerPkgName", id=2) private final String zzbr;
    @Field(getter="getGoogleConfig", id=5) private GoogleSignInOptions zzbs;

    static {
        SignInConfiguration.CREATOR = new zzx();
    }

    @Constructor public SignInConfiguration(@Param(id=2) String arg1, @Param(id=5) GoogleSignInOptions arg2) {
        super();
        this.zzbr = Preconditions.checkNotEmpty(arg1);
        this.zzbs = arg2;
    }

    public final boolean equals(Object arg4) {
        if(!(arg4 instanceof SignInConfiguration)) {
            return 0;
        }

        if(this.zzbr.equals(((SignInConfiguration)arg4).zzbr)) {
            if(this.zzbs != null) {
                if(this.zzbs.equals(((SignInConfiguration)arg4).zzbs)) {
                    return 1;
                }

                return 0;
            }
            else if(((SignInConfiguration)arg4).zzbs == null) {
            }
            else {
                return 0;
            }

            return 1;
        }

        return 0;
    }

    public final int hashCode() {
        return new HashAccumulator().addObject(this.zzbr).addObject(this.zzbs).hash();
    }

    public final void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeString(arg5, 2, this.zzbr, false);
        SafeParcelWriter.writeParcelable(arg5, 5, this.zzbs, arg6, false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }

    public final GoogleSignInOptions zzm() {
        return this.zzbs;
    }
}

