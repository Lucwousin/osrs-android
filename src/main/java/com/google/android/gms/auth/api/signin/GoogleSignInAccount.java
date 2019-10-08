package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Class;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Constructor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Field;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$Param;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable$VersionField;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator="GoogleSignInAccountCreator") public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable$Creator CREATOR;
    @Field(getter="getId", id=2) private String mId;
    @VersionField(id=1) private final int versionCode;
    @VisibleForTesting private static Clock zae;
    @Field(getter="getIdToken", id=3) private String zaf;
    @Field(getter="getEmail", id=4) private String zag;
    @Field(getter="getDisplayName", id=5) private String zah;
    @Field(getter="getPhotoUrl", id=6) private Uri zai;
    @Field(getter="getServerAuthCode", id=7) private String zaj;
    @Field(getter="getExpirationTimeSecs", id=8) private long zak;
    @Field(getter="getObfuscatedIdentifier", id=9) private String zal;
    @Field(id=10) private List zam;
    @Field(getter="getGivenName", id=11) private String zan;
    @Field(getter="getFamilyName", id=12) private String zao;
    private Set zap;

    static {
        GoogleSignInAccount.CREATOR = new zab();
        GoogleSignInAccount.zae = DefaultClock.getInstance();
    }

    @Constructor GoogleSignInAccount(@Param(id=1) int arg2, @Param(id=2) String arg3, @Param(id=3) String arg4, @Param(id=4) String arg5, @Param(id=5) String arg6, @Param(id=6) Uri arg7, @Param(id=7) String arg8, @Param(id=8) long arg9, @Param(id=9) String arg11, @Param(id=10) List arg12, @Param(id=11) String arg13, @Param(id=12) String arg14) {
        super();
        this.zap = new HashSet();
        this.versionCode = arg2;
        this.mId = arg3;
        this.zaf = arg4;
        this.zag = arg5;
        this.zah = arg6;
        this.zai = arg7;
        this.zaj = arg8;
        this.zak = arg9;
        this.zal = arg11;
        this.zam = arg12;
        this.zan = arg13;
        this.zao = arg14;
    }

    @KeepForSdk public static GoogleSignInAccount createDefault() {
        Account v0 = new Account("<<default account>>", "com.google");
        return GoogleSignInAccount.zaa(null, null, v0.name, null, null, null, null, Long.valueOf(0), v0.name, new HashSet());
    }

    public boolean equals(Object arg5) {
        if((((GoogleSignInAccount)arg5)) == this) {
            return 1;
        }

        if(!(arg5 instanceof GoogleSignInAccount)) {
            return 0;
        }

        if((((GoogleSignInAccount)arg5).zal.equals(this.zal)) && (((GoogleSignInAccount)arg5).getRequestedScopes().equals(this.getRequestedScopes()))) {
            return 1;
        }

        return 0;
    }

    @Nullable public Account getAccount() {
        if(this.zag == null) {
            return null;
        }

        return new Account(this.zag, "com.google");
    }

    @Nullable public String getDisplayName() {
        return this.zah;
    }

    @Nullable public String getEmail() {
        return this.zag;
    }

    @Nullable public String getFamilyName() {
        return this.zao;
    }

    @Nullable public String getGivenName() {
        return this.zan;
    }

    @NonNull public Set getGrantedScopes() {
        return new HashSet(this.zam);
    }

    @Nullable public String getId() {
        return this.mId;
    }

    @Nullable public String getIdToken() {
        return this.zaf;
    }

    @Nullable public Uri getPhotoUrl() {
        return this.zai;
    }

    @NonNull @KeepForSdk public Set getRequestedScopes() {
        HashSet v0 = new HashSet(this.zam);
        ((Set)v0).addAll(this.zap);
        return ((Set)v0);
    }

    @Nullable public String getServerAuthCode() {
        return this.zaj;
    }

    public int hashCode() {
        return (this.zal.hashCode() + 0x20F) * 0x1F + this.getRequestedScopes().hashCode();
    }

    @KeepForSdk public boolean isExpired() {
        if(GoogleSignInAccount.zae.currentTimeMillis() / 1000 >= this.zak - 300) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public GoogleSignInAccount requestExtraScopes(Scope[] arg2) {
        if(arg2 != null) {
            Collections.addAll(this.zap, ((Object[])arg2));
        }

        return this;
    }

    public void writeToParcel(Parcel arg6, int arg7) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg6);
        SafeParcelWriter.writeInt(arg6, 1, this.versionCode);
        SafeParcelWriter.writeString(arg6, 2, this.getId(), false);
        SafeParcelWriter.writeString(arg6, 3, this.getIdToken(), false);
        SafeParcelWriter.writeString(arg6, 4, this.getEmail(), false);
        SafeParcelWriter.writeString(arg6, 5, this.getDisplayName(), false);
        SafeParcelWriter.writeParcelable(arg6, 6, this.getPhotoUrl(), arg7, false);
        SafeParcelWriter.writeString(arg6, 7, this.getServerAuthCode(), false);
        SafeParcelWriter.writeLong(arg6, 8, this.zak);
        SafeParcelWriter.writeString(arg6, 9, this.zal, false);
        SafeParcelWriter.writeTypedList(arg6, 10, this.zam, false);
        SafeParcelWriter.writeString(arg6, 11, this.getGivenName(), false);
        SafeParcelWriter.writeString(arg6, 12, this.getFamilyName(), false);
        SafeParcelWriter.finishObjectHeader(arg6, v0);
    }

    @Nullable public static GoogleSignInAccount zaa(@Nullable String arg13) throws JSONException {
        GoogleSignInAccount v1 = null;
        if(TextUtils.isEmpty(((CharSequence)arg13))) {
            return v1;
        }

        JSONObject v0 = new JSONObject(arg13);
        arg13 = v0.optString("photoUrl", ((String)v1));
        Uri v8 = !TextUtils.isEmpty(((CharSequence)arg13)) ? Uri.parse(arg13) : ((Uri)v1);
        long v2 = Long.parseLong(v0.getString("expirationTime"));
        HashSet v11 = new HashSet();
        JSONArray v13 = v0.getJSONArray("grantedScopes");
        int v4 = v13.length();
        int v5;
        for(v5 = 0; v5 < v4; ++v5) {
            ((Set)v11).add(new Scope(v13.getString(v5)));
        }

        GoogleSignInAccount v13_1 = GoogleSignInAccount.zaa(v0.optString("id"), v0.optString("tokenId", ((String)v1)), v0.optString("email", ((String)v1)), v0.optString("displayName", ((String)v1)), v0.optString("givenName", ((String)v1)), v0.optString("familyName", ((String)v1)), v8, Long.valueOf(v2), v0.getString("obfuscatedIdentifier"), ((Set)v11));
        v13_1.zaj = v0.optString("serverAuthCode", ((String)v1));
        return v13_1;
    }

    static final int zaa(Scope arg0, Scope arg1) {
        return arg0.getScopeUri().compareTo(arg1.getScopeUri());
    }

    private static GoogleSignInAccount zaa(@Nullable String arg16, @Nullable String arg17, @Nullable String arg18, @Nullable String arg19, @Nullable String arg20, @Nullable String arg21, @Nullable Uri arg22, @Nullable Long arg23, @NonNull String arg24, @NonNull Set arg25) {
        Long v0 = arg23 == null ? Long.valueOf(GoogleSignInAccount.zae.currentTimeMillis() / 1000) : arg23;
        return new GoogleSignInAccount(3, arg16, arg17, arg18, arg19, arg22, null, v0.longValue(), Preconditions.checkNotEmpty(arg24), new ArrayList(Preconditions.checkNotNull(arg25)), arg20, arg21);
    }

    @NonNull public final String zab() {
        return this.zal;
    }

    public final String zac() {
        JSONObject v0 = this.zad();
        v0.remove("serverAuthCode");
        return v0.toString();
    }

    private final JSONObject zad() {
        JSONObject v0 = new JSONObject();
        try {
            if(this.getId() != null) {
                v0.put("id", this.getId());
            }

            if(this.getIdToken() != null) {
                v0.put("tokenId", this.getIdToken());
            }

            if(this.getEmail() != null) {
                v0.put("email", this.getEmail());
            }

            if(this.getDisplayName() != null) {
                v0.put("displayName", this.getDisplayName());
            }

            if(this.getGivenName() != null) {
                v0.put("givenName", this.getGivenName());
            }

            if(this.getFamilyName() != null) {
                v0.put("familyName", this.getFamilyName());
            }

            if(this.getPhotoUrl() != null) {
                v0.put("photoUrl", this.getPhotoUrl().toString());
            }

            if(this.getServerAuthCode() != null) {
                v0.put("serverAuthCode", this.getServerAuthCode());
            }

            v0.put("expirationTime", this.zak);
            v0.put("obfuscatedIdentifier", this.zal);
            JSONArray v1 = new JSONArray();
            Object[] v2 = this.zam.toArray(new Scope[this.zam.size()]);
            Arrays.sort(v2, zaa.zaq);
            int v3 = v2.length;
            int v4;
            for(v4 = 0; v4 < v3; ++v4) {
                v1.put(v2[v4].getScopeUri());
            }

            v0.put("grantedScopes", v1);
            return v0;
        }
        catch(JSONException v0_1) {
            throw new RuntimeException(((Throwable)v0_1));
        }
    }
}

