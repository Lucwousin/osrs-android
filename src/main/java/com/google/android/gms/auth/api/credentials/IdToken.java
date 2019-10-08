package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Reserved;

@Class(creator="IdTokenCreator") @Reserved(value={1000}) public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable$Creator CREATOR;
    @NonNull @Field(getter="getIdToken", id=2) private final String zzak;
    @NonNull @Field(getter="getAccountType", id=1) private final String zzr;

    static {
        IdToken.CREATOR = new zzk();
    }

    @Constructor public IdToken(@NonNull @Param(id=1) String arg3, @NonNull @Param(id=2) String arg4) {
        super();
        Preconditions.checkArgument(TextUtils.isEmpty(((CharSequence)arg3)) ^ 1, "account type string cannot be null or empty");
        Preconditions.checkArgument(TextUtils.isEmpty(((CharSequence)arg4)) ^ 1, "id token string cannot be null or empty");
        this.zzr = arg3;
        this.zzak = arg4;
    }

    public final boolean equals(Object arg5) {
        if(this == (((IdToken)arg5))) {
            return 1;
        }

        if(!(arg5 instanceof IdToken)) {
            return 0;
        }

        if((Objects.equal(this.zzr, ((IdToken)arg5).zzr)) && (Objects.equal(this.zzak, ((IdToken)arg5).zzak))) {
            return 1;
        }

        return 0;
    }

    @NonNull public final String getAccountType() {
        return this.zzr;
    }

    @NonNull public final String getIdToken() {
        return this.zzak;
    }

    public final void writeToParcel(Parcel arg4, int arg5) {
        arg5 = SafeParcelWriter.beginObjectHeader(arg4);
        SafeParcelWriter.writeString(arg4, 1, this.getAccountType(), false);
        SafeParcelWriter.writeString(arg4, 2, this.getIdToken(), false);
        SafeParcelWriter.finishObjectHeader(arg4, arg5);
    }
}

