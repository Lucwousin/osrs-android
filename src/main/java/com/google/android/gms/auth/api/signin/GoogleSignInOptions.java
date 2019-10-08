package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api$ApiOptions$Optional;
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
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Class(creator="GoogleSignInOptionsCreator") public class GoogleSignInOptions extends AbstractSafeParcelable implements Optional, ReflectedParcelable {
    public final class Builder {
        private Set mScopes;
        private boolean zaaa;
        private String zaab;
        private String zaac;
        private Map zaag;
        private Account zax;
        private boolean zay;
        private boolean zaz;

        public Builder() {
            super();
            this.mScopes = new HashSet();
            this.zaag = new HashMap();
        }

        public Builder(@NonNull GoogleSignInOptions arg3) {
            super();
            this.mScopes = new HashSet();
            this.zaag = new HashMap();
            Preconditions.checkNotNull(arg3);
            this.mScopes = new HashSet(GoogleSignInOptions.zaa(arg3));
            this.zaz = GoogleSignInOptions.zab(arg3);
            this.zaaa = GoogleSignInOptions.zac(arg3);
            this.zay = GoogleSignInOptions.zad(arg3);
            this.zaab = GoogleSignInOptions.zae(arg3);
            this.zax = GoogleSignInOptions.zaf(arg3);
            this.zaac = GoogleSignInOptions.zag(arg3);
            this.zaag = GoogleSignInOptions.zab(GoogleSignInOptions.zah(arg3));
        }

        public final Builder addExtension(GoogleSignInOptionsExtension arg4) {
            if(!this.zaag.containsKey(Integer.valueOf(arg4.getExtensionType()))) {
                if(arg4.getImpliedScopes() != null) {
                    this.mScopes.addAll(arg4.getImpliedScopes());
                }

                this.zaag.put(Integer.valueOf(arg4.getExtensionType()), new GoogleSignInOptionsExtensionParcelable(arg4));
                return this;
            }

            throw new IllegalStateException("Only one extension per type may be added");
        }

        public final GoogleSignInOptions build() {
            if((this.mScopes.contains(GoogleSignInOptions.zav)) && (this.mScopes.contains(GoogleSignInOptions.zau))) {
                this.mScopes.remove(GoogleSignInOptions.zau);
            }

            if((this.zay) && (this.zax == null || !this.mScopes.isEmpty())) {
                this.requestId();
            }

            return new GoogleSignInOptions(3, new ArrayList(this.mScopes), this.zax, this.zay, this.zaz, this.zaaa, this.zaab, this.zaac, this.zaag, null);
        }

        public final Builder requestEmail() {
            this.mScopes.add(GoogleSignInOptions.zas);
            return this;
        }

        public final Builder requestId() {
            this.mScopes.add(GoogleSignInOptions.zat);
            return this;
        }

        public final Builder requestIdToken(String arg2) {
            this.zay = true;
            this.zaab = this.zac(arg2);
            return this;
        }

        public final Builder requestProfile() {
            this.mScopes.add(GoogleSignInOptions.zar);
            return this;
        }

        public final Builder requestScopes(Scope arg2, Scope[] arg3) {
            this.mScopes.add(arg2);
            this.mScopes.addAll(Arrays.asList(((Object[])arg3)));
            return this;
        }

        public final Builder requestServerAuthCode(String arg2) {
            return this.requestServerAuthCode(arg2, false);
        }

        public final Builder requestServerAuthCode(String arg2, boolean arg3) {
            this.zaz = true;
            this.zaab = this.zac(arg2);
            this.zaaa = arg3;
            return this;
        }

        public final Builder setAccountName(String arg3) {
            this.zax = new Account(Preconditions.checkNotEmpty(arg3), "com.google");
            return this;
        }

        public final Builder setHostedDomain(String arg1) {
            this.zaac = Preconditions.checkNotEmpty(arg1);
            return this;
        }

        private final String zac(String arg3) {
            Preconditions.checkNotEmpty(arg3);
            boolean v0 = this.zaab == null || (this.zaab.equals(arg3)) ? true : false;
            Preconditions.checkArgument(v0, "two different server client ids provided");
            return arg3;
        }
    }

    public static final Parcelable$Creator CREATOR;
    public static final GoogleSignInOptions DEFAULT_GAMES_SIGN_IN;
    public static final GoogleSignInOptions DEFAULT_SIGN_IN;
    @VersionField(id=1) private final int versionCode;
    @Field(getter="isForceCodeForRefreshToken", id=6) private final boolean zaaa;
    @Field(getter="getServerClientId", id=7) private String zaab;
    @Field(getter="getHostedDomain", id=8) private String zaac;
    @Field(getter="getExtensions", id=9) private ArrayList zaad;
    private Map zaae;
    private static Comparator zaaf;
    @VisibleForTesting public static final Scope zar;
    @VisibleForTesting public static final Scope zas;
    @VisibleForTesting public static final Scope zat;
    @VisibleForTesting public static final Scope zau;
    @VisibleForTesting public static final Scope zav;
    @Field(getter="getScopes", id=2) private final ArrayList zaw;
    @Field(getter="getAccount", id=3) private Account zax;
    @Field(getter="isIdTokenRequested", id=4) private boolean zay;
    @Field(getter="isServerAuthCodeRequested", id=5) private final boolean zaz;

    static {
        GoogleSignInOptions.zar = new Scope("profile");
        GoogleSignInOptions.zas = new Scope("email");
        GoogleSignInOptions.zat = new Scope("openid");
        GoogleSignInOptions.zau = new Scope("https://www.googleapis.com/auth/games_lite");
        GoogleSignInOptions.zav = new Scope("https://www.googleapis.com/auth/games");
        GoogleSignInOptions.DEFAULT_SIGN_IN = new Builder().requestId().requestProfile().build();
        GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN = new Builder().requestScopes(GoogleSignInOptions.zau, new Scope[0]).build();
        GoogleSignInOptions.CREATOR = new zad();
        GoogleSignInOptions.zaaf = new zac();
    }

    @Constructor GoogleSignInOptions(@Param(id=1) int arg11, @Param(id=2) ArrayList arg12, @Param(id=3) Account arg13, @Param(id=4) boolean arg14, @Param(id=5) boolean arg15, @Param(id=6) boolean arg16, @Param(id=7) String arg17, @Param(id=8) String arg18, @Param(id=9) ArrayList arg19) {
        this(arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, GoogleSignInOptions.zaa(((List)arg19)));
    }

    private GoogleSignInOptions(int arg1, ArrayList arg2, Account arg3, boolean arg4, boolean arg5, boolean arg6, String arg7, String arg8, Map arg9) {
        super();
        this.versionCode = arg1;
        this.zaw = arg2;
        this.zax = arg3;
        this.zay = arg4;
        this.zaz = arg5;
        this.zaaa = arg6;
        this.zaab = arg7;
        this.zaac = arg8;
        this.zaad = new ArrayList(arg9.values());
        this.zaae = arg9;
    }

    GoogleSignInOptions(int arg11, ArrayList arg12, Account arg13, boolean arg14, boolean arg15, boolean arg16, String arg17, String arg18, Map arg19, zac arg20) {
        this(3, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
    }

    public boolean equals(Object arg4) {
        if(arg4 == null) {
            return 0;
        }

        try {
            if(this.zaad.size() <= 0) {
                if(((GoogleSignInOptions)arg4).zaad.size() > 0) {
                }
                else {
                    if(this.zaw.size() == ((GoogleSignInOptions)arg4).getScopes().size()) {
                        if(!this.zaw.containsAll(((GoogleSignInOptions)arg4).getScopes())) {
                        }
                        else {
                            if(this.zax == null) {
                                if(((GoogleSignInOptions)arg4).getAccount() == null) {
                                    goto label_29;
                                }
                            }
                            else if(this.zax.equals(((GoogleSignInOptions)arg4).getAccount())) {
                            label_29:
                                if(!TextUtils.isEmpty(this.zaab)) {
                                    if(this.zaab.equals(((GoogleSignInOptions)arg4).getServerClientId())) {
                                        goto label_40;
                                    }

                                    return 0;
                                }
                                else if(TextUtils.isEmpty(((GoogleSignInOptions)arg4).getServerClientId())) {
                                }
                                else {
                                    return 0;
                                }

                            label_40:
                                if(this.zaaa != ((GoogleSignInOptions)arg4).isForceCodeForRefreshToken()) {
                                    return 0;
                                }

                                if(this.zay != ((GoogleSignInOptions)arg4).isIdTokenRequested()) {
                                    return 0;
                                }

                                if(this.zaz != ((GoogleSignInOptions)arg4).isServerAuthCodeRequested()) {
                                    return 0;
                                }

                                return 1;
                            }

                            return 0;
                        }
                    }

                    return 0;
                }
            }

            return 0;
        }
        catch(ClassCastException ) {
            return 0;
        }

        return 1;
    }

    @KeepForSdk public Account getAccount() {
        return this.zax;
    }

    @KeepForSdk public ArrayList getExtensions() {
        return this.zaad;
    }

    public Scope[] getScopeArray() {
        return this.zaw.toArray(new Scope[this.zaw.size()]);
    }

    @KeepForSdk public ArrayList getScopes() {
        return new ArrayList(this.zaw);
    }

    @KeepForSdk public String getServerClientId() {
        return this.zaab;
    }

    public int hashCode() {
        ArrayList v0 = new ArrayList();
        ArrayList v1 = this.zaw;
        int v2 = v1.size();
        int v3 = 0;
        while(v3 < v2) {
            Object v4 = v1.get(v3);
            ++v3;
            v0.add(((Scope)v4).getScopeUri());
        }

        Collections.sort(((List)v0));
        return new HashAccumulator().addObject(v0).addObject(this.zax).addObject(this.zaab).zaa(this.zaaa).zaa(this.zay).zaa(this.zaz).hash();
    }

    @KeepForSdk public boolean isForceCodeForRefreshToken() {
        return this.zaaa;
    }

    @KeepForSdk public boolean isIdTokenRequested() {
        return this.zay;
    }

    @KeepForSdk public boolean isServerAuthCodeRequested() {
        return this.zaz;
    }

    public void writeToParcel(Parcel arg5, int arg6) {
        int v0 = SafeParcelWriter.beginObjectHeader(arg5);
        SafeParcelWriter.writeInt(arg5, 1, this.versionCode);
        SafeParcelWriter.writeTypedList(arg5, 2, this.getScopes(), false);
        SafeParcelWriter.writeParcelable(arg5, 3, this.getAccount(), arg6, false);
        SafeParcelWriter.writeBoolean(arg5, 4, this.isIdTokenRequested());
        SafeParcelWriter.writeBoolean(arg5, 5, this.isServerAuthCodeRequested());
        SafeParcelWriter.writeBoolean(arg5, 6, this.isForceCodeForRefreshToken());
        SafeParcelWriter.writeString(arg5, 7, this.getServerClientId(), false);
        SafeParcelWriter.writeString(arg5, 8, this.zaac, false);
        SafeParcelWriter.writeTypedList(arg5, 9, this.getExtensions(), false);
        SafeParcelWriter.finishObjectHeader(arg5, v0);
    }

    private static Map zaa(@Nullable List arg3) {
        HashMap v0 = new HashMap();
        if(arg3 == null) {
            return ((Map)v0);
        }

        Iterator v3 = arg3.iterator();
        while(v3.hasNext()) {
            Object v1 = v3.next();
            ((Map)v0).put(Integer.valueOf(((GoogleSignInOptionsExtensionParcelable)v1).getType()), v1);
        }

        return ((Map)v0);
    }

    static ArrayList zaa(GoogleSignInOptions arg0) {
        return arg0.zaw;
    }

    @Nullable public static GoogleSignInOptions zab(@Nullable String arg15) throws JSONException {
        GoogleSignInOptions v1 = null;
        if(TextUtils.isEmpty(((CharSequence)arg15))) {
            return v1;
        }

        JSONObject v0 = new JSONObject(arg15);
        HashSet v15 = new HashSet();
        JSONArray v2 = v0.getJSONArray("scopes");
        int v3 = v2.length();
        int v4;
        for(v4 = 0; v4 < v3; ++v4) {
            ((Set)v15).add(new Scope(v2.getString(v4)));
        }

        String v2_1 = v0.optString("accountName", ((String)v1));
        Account v8 = !TextUtils.isEmpty(((CharSequence)v2_1)) ? new Account(v2_1, "com.google") : ((Account)v1);
        return new GoogleSignInOptions(3, new ArrayList(((Collection)v15)), v8, v0.getBoolean("idTokenRequested"), v0.getBoolean("serverAuthRequested"), v0.getBoolean("forceCodeForRefreshToken"), v0.optString("serverClientId", ((String)v1)), v0.optString("hostedDomain", ((String)v1)), new HashMap());
    }

    static Map zab(List arg0) {
        return GoogleSignInOptions.zaa(arg0);
    }

    static boolean zab(GoogleSignInOptions arg0) {
        return arg0.zaz;
    }

    static boolean zac(GoogleSignInOptions arg0) {
        return arg0.zaaa;
    }

    private final JSONObject zad() {
        JSONObject v0 = new JSONObject();
        try {
            JSONArray v1 = new JSONArray();
            Collections.sort(this.zaw, GoogleSignInOptions.zaaf);
            ArrayList v2 = this.zaw;
            int v3 = v2.size();
            int v4 = 0;
            while(v4 < v3) {
                Object v5 = v2.get(v4);
                ++v4;
                v1.put(((Scope)v5).getScopeUri());
            }

            v0.put("scopes", v1);
            if(this.zax != null) {
                v0.put("accountName", this.zax.name);
            }

            v0.put("idTokenRequested", this.zay);
            v0.put("forceCodeForRefreshToken", this.zaaa);
            v0.put("serverAuthRequested", this.zaz);
            if(!TextUtils.isEmpty(this.zaab)) {
                v0.put("serverClientId", this.zaab);
            }

            if(!TextUtils.isEmpty(this.zaac)) {
                v0.put("hostedDomain", this.zaac);
            }
        }
        catch(JSONException v0_1) {
            goto label_49;
        }

        return v0;
    label_49:
        throw new RuntimeException(((Throwable)v0_1));
    }

    static boolean zad(GoogleSignInOptions arg0) {
        return arg0.zay;
    }

    public final String zae() {
        return this.zad().toString();
    }

    static String zae(GoogleSignInOptions arg0) {
        return arg0.zaab;
    }

    static Account zaf(GoogleSignInOptions arg0) {
        return arg0.zax;
    }

    static String zag(GoogleSignInOptions arg0) {
        return arg0.zaac;
    }

    static ArrayList zah(GoogleSignInOptions arg0) {
        return arg0.zaad;
    }
}

