package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
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
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Reserved;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nonnull;

@Class(creator="CredentialCreator") @Reserved(value={1000}) public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public class Builder {
        private final String mId;
        private String mName;
        private Uri zzo;
        private List zzp;
        private String zzq;
        private String zzr;
        private String zzs;
        private String zzt;

        public Builder(Credential arg2) {
            super();
            this.mId = Credential.zzc(arg2);
            this.mName = Credential.zzd(arg2);
            this.zzo = Credential.zze(arg2);
            this.zzp = Credential.zzf(arg2);
            this.zzq = Credential.zzg(arg2);
            this.zzr = Credential.zzh(arg2);
            this.zzs = Credential.zzi(arg2);
            this.zzt = Credential.zzj(arg2);
        }

        public Builder(String arg1) {
            super();
            this.mId = arg1;
        }

        public Credential build() {
            return new Credential(this.mId, this.mName, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt);
        }

        public Builder setAccountType(String arg1) {
            this.zzr = arg1;
            return this;
        }

        public Builder setName(String arg1) {
            this.mName = arg1;
            return this;
        }

        public Builder setPassword(String arg1) {
            this.zzq = arg1;
            return this;
        }

        public Builder setProfilePictureUri(Uri arg1) {
            this.zzo = arg1;
            return this;
        }
    }

    public static final Parcelable$Creator CREATOR = null;
    public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
    @Field(getter="getId", id=1) @Nonnull private final String mId;
    @Nullable @Field(getter="getName", id=2) private final String mName;
    @Nullable @Field(getter="getProfilePictureUri", id=3) private final Uri zzo;
    @Field(getter="getIdTokens", id=4) @Nonnull private final List zzp;
    @Nullable @Field(getter="getPassword", id=5) private final String zzq;
    @Nullable @Field(getter="getAccountType", id=6) private final String zzr;
    @Nullable @Field(getter="getGivenName", id=9) private final String zzs;
    @Nullable @Field(getter="getFamilyName", id=10) private final String zzt;

    static {
        Credential.CREATOR = new zzc();
    }

    @Constructor Credential(@Param(id=1) String arg5, @Param(id=2) String arg6, @Param(id=3) Uri arg7, @Param(id=4) List arg8, @Param(id=5) String arg9, @Param(id=6) String arg10, @Param(id=9) String arg11, @Param(id=10) String arg12) {
        super();
        arg5 = Preconditions.checkNotNull(arg5, "credential identifier cannot be null").trim();
        Preconditions.checkNotEmpty(arg5, "credential identifier cannot be empty");
        if(arg9 != null) {
            if(!TextUtils.isEmpty(((CharSequence)arg9))) {
            }
            else {
                throw new IllegalArgumentException("Password must not be empty if set");
            }
        }

        if(arg10 != null) {
            boolean v1 = false;
            if(!TextUtils.isEmpty(((CharSequence)arg10))) {
                Uri v0 = Uri.parse(arg10);
                if((v0.isAbsolute()) && (v0.isHierarchical()) && !TextUtils.isEmpty(v0.getScheme())) {
                    if(TextUtils.isEmpty(v0.getAuthority())) {
                    }
                    else {
                        if(!"http".equalsIgnoreCase(v0.getScheme()) && !"https".equalsIgnoreCase(v0.getScheme())) {
                            goto label_39;
                        }

                        v1 = true;
                    }
                }
            }

        label_39:
            if(Boolean.valueOf(v1).booleanValue()) {
                goto label_47;
            }

            throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
        }

    label_47:
        if(!TextUtils.isEmpty(((CharSequence)arg10))) {
            if(TextUtils.isEmpty(((CharSequence)arg9))) {
            }
            else {
                throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
            }
        }

        if(arg6 != null && (TextUtils.isEmpty(arg6.trim()))) {
            arg6 = null;
        }

        this.mName = arg6;
        this.zzo = arg7;
        List v6 = arg8 == null ? Collections.emptyList() : Collections.unmodifiableList(arg8);
        this.zzp = v6;
        this.mId = arg5;
        this.zzq = arg9;
        this.zzr = arg10;
        this.zzs = arg11;
        this.zzt = arg12;
    }

    public boolean equals(Object arg5) {
        if(this == (((Credential)arg5))) {
            return 1;
        }

        if(!(arg5 instanceof Credential)) {
            return 0;
        }

        if((TextUtils.equals(this.mId, ((Credential)arg5).mId)) && (TextUtils.equals(this.mName, ((Credential)arg5).mName)) && (Objects.equal(this.zzo, ((Credential)arg5).zzo)) && (TextUtils.equals(this.zzq, ((Credential)arg5).zzq)) && (TextUtils.equals(this.zzr, ((Credential)arg5).zzr))) {
            return 1;
        }

        return 0;
    }

    @Nullable public String getAccountType() {
        return this.zzr;
    }

    @Nullable public String getFamilyName() {
        return this.zzt;
    }

    @Nullable public String getGivenName() {
        return this.zzs;
    }

    @Nonnull public String getId() {
        return this.mId;
    }

    @Nonnull public List getIdTokens() {
        return this.zzp;
    }

    @Nullable public String getName() {
        return this.mName;
    }

    @Nullable public String getPassword() {
        return this.zzq;
    }

    @Nullable public Uri getProfilePictureUri() {
        return this.zzo;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.mId, this.mName, this.zzo, this.zzq, this.zzr});
    }

    public void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeString(arg5, 1, this.getId(), false);
        SafeParcelWriter.writeString(arg5, 2, this.getName(), false);
        SafeParcelWriter.writeParcelable(arg5, 3, this.getProfilePictureUri(), arg6, false);
        SafeParcelWriter.writeTypedList(arg5, 4, this.getIdTokens(), false);
        SafeParcelWriter.writeString(arg5, 5, this.getPassword(), false);
        SafeParcelWriter.writeString(arg5, 6, this.getAccountType(), false);
        SafeParcelWriter.writeString(arg5, 9, this.getGivenName(), false);
        SafeParcelWriter.writeString(arg5, 10, this.getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }

    static String zzc(Credential arg0) {
        return arg0.mId;
    }

    static String zzd(Credential arg0) {
        return arg0.mName;
    }

    static Uri zze(Credential arg0) {
        return arg0.zzo;
    }

    static List zzf(Credential arg0) {
        return arg0.zzp;
    }

    static String zzg(Credential arg0) {
        return arg0.zzq;
    }

    static String zzh(Credential arg0) {
        return arg0.zzr;
    }

    static String zzi(Credential arg0) {
        return arg0.zzs;
    }

    static String zzj(Credential arg0) {
        return arg0.zzt;
    }
}

