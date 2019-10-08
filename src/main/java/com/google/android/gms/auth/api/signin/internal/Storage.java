package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

public class Storage {
    private static final Lock zaaj;
    @GuardedBy(value="sLk") private static Storage zaak;
    private final Lock zaal;
    @GuardedBy(value="mLk") private final SharedPreferences zaam;

    static {
        Storage.zaaj = new ReentrantLock();
    }

    @VisibleForTesting private Storage(Context arg3) {
        super();
        this.zaal = new ReentrantLock();
        this.zaam = arg3.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @KeepForSdk public void clear() {
        this.zaal.lock();
        try {
            this.zaam.edit().clear().apply();
        }
        catch(Throwable v0) {
            this.zaal.unlock();
            throw v0;
        }

        this.zaal.unlock();
    }

    @KeepForSdk public static Storage getInstance(Context arg1) {
        Storage v1_1;
        Preconditions.checkNotNull(arg1);
        Storage.zaaj.lock();
        try {
            if(Storage.zaak == null) {
                Storage.zaak = new Storage(arg1.getApplicationContext());
            }

            v1_1 = Storage.zaak;
        }
        catch(Throwable v1) {
            Storage.zaaj.unlock();
            throw v1;
        }

        Storage.zaaj.unlock();
        return v1_1;
    }

    @KeepForSdk @Nullable public GoogleSignInAccount getSavedDefaultGoogleSignInAccount() {
        return this.zad(this.zaf("defaultGoogleSignInAccount"));
    }

    @KeepForSdk @Nullable public GoogleSignInOptions getSavedDefaultGoogleSignInOptions() {
        return this.zae(this.zaf("defaultGoogleSignInAccount"));
    }

    @KeepForSdk @Nullable public String getSavedRefreshToken() {
        return this.zaf("refreshToken");
    }

    @KeepForSdk public void saveDefaultGoogleSignInAccount(GoogleSignInAccount arg3, GoogleSignInOptions arg4) {
        Preconditions.checkNotNull(arg3);
        Preconditions.checkNotNull(arg4);
        this.zaa("defaultGoogleSignInAccount", arg3.zab());
        Preconditions.checkNotNull(arg3);
        Preconditions.checkNotNull(arg4);
        String v0 = arg3.zab();
        this.zaa(Storage.zab("googleSignInAccount", v0), arg3.zac());
        this.zaa(Storage.zab("googleSignInOptions", v0), arg4.zae());
    }

    private final void zaa(String arg2, String arg3) {
        this.zaal.lock();
        try {
            this.zaam.edit().putString(arg2, arg3).apply();
        }
        catch(Throwable v2) {
            this.zaal.unlock();
            throw v2;
        }

        this.zaal.unlock();
    }

    private static String zab(String arg2, String arg3) {
        StringBuilder v1 = new StringBuilder(String.valueOf(arg2).length() + 1 + String.valueOf(arg3).length());
        v1.append(arg2);
        v1.append(":");
        v1.append(arg3);
        return v1.toString();
    }

    @VisibleForTesting @Nullable private final GoogleSignInAccount zad(String arg3) {
        GoogleSignInAccount v1 = null;
        if(TextUtils.isEmpty(((CharSequence)arg3))) {
            return v1;
        }

        arg3 = this.zaf(Storage.zab("googleSignInAccount", arg3));
        if(arg3 != null) {
            try {
                return GoogleSignInAccount.zaa(arg3);
            }
            catch(JSONException ) {
                return v1;
            }
        }

        return v1;
    }

    @VisibleForTesting @Nullable private final GoogleSignInOptions zae(String arg3) {
        GoogleSignInOptions v1 = null;
        if(TextUtils.isEmpty(((CharSequence)arg3))) {
            return v1;
        }

        arg3 = this.zaf(Storage.zab("googleSignInOptions", arg3));
        if(arg3 != null) {
            try {
                return GoogleSignInOptions.zab(arg3);
            }
            catch(JSONException ) {
                return v1;
            }
        }

        return v1;
    }

    @Nullable private final String zaf(String arg3) {
        this.zaal.lock();
        try {
            arg3 = this.zaam.getString(arg3, null);
        }
        catch(Throwable v3) {
            this.zaal.unlock();
            throw v3;
        }

        this.zaal.unlock();
        return arg3;
    }

    public final void zaf() {
        String v0 = this.zaf("defaultGoogleSignInAccount");
        this.zag("defaultGoogleSignInAccount");
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            this.zag(Storage.zab("googleSignInAccount", v0));
            this.zag(Storage.zab("googleSignInOptions", v0));
        }
    }

    private final void zag(String arg2) {
        this.zaal.lock();
        try {
            this.zaam.edit().remove(arg2).apply();
        }
        catch(Throwable v2) {
            this.zaal.unlock();
            throw v2;
        }

        this.zaal.unlock();
    }
}

