package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.PublicApi;

@PublicApi public class FirebaseInitProvider extends ContentProvider {
    @VisibleForTesting static final String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = "com.google.firebase.firebaseinitprovider";
    private static final String TAG = "FirebaseInitProvider";

    public FirebaseInitProvider() {
        super();
    }

    public void attachInfo(Context arg1, ProviderInfo arg2) {
        FirebaseInitProvider.checkContentProviderAuthority(arg2);
        super.attachInfo(arg1, arg2);
    }

    private static void checkContentProviderAuthority(@NonNull ProviderInfo arg1) {
        Preconditions.checkNotNull(arg1, "FirebaseInitProvider ProviderInfo cannot be null.");
        if(!"com.google.firebase.firebaseinitprovider".equals(arg1.authority)) {
            return;
        }

        throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application\'s build.gradle.");
    }

    public int delete(Uri arg1, String arg2, String[] arg3) {
        return 0;
    }

    @Nullable public String getType(Uri arg1) {
        return null;
    }

    @Nullable public Uri insert(Uri arg1, ContentValues arg2) {
        return null;
    }

    public boolean onCreate() {
        if(FirebaseApp.initializeApp(this.getContext()) == null) {
            Log.i("FirebaseInitProvider", "FirebaseApp initialization unsuccessful");
        }
        else {
            Log.i("FirebaseInitProvider", "FirebaseApp initialization successful");
        }

        return 0;
    }

    @Nullable public Cursor query(Uri arg1, String[] arg2, String arg3, String[] arg4, String arg5) {
        return null;
    }

    public int update(Uri arg1, ContentValues arg2, String arg3, String[] arg4) {
        return 0;
    }
}

