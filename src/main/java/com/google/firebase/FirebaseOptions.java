package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;
import com.google.firebase.annotations.PublicApi;

@PublicApi public final class FirebaseOptions {
    class com.google.firebase.FirebaseOptions$1 {
    }

    @PublicApi public final class Builder {
        private String apiKey;
        private String applicationId;
        private String databaseUrl;
        private String gaTrackingId;
        private String gcmSenderId;
        private String projectId;
        private String storageBucket;

        @PublicApi public Builder() {
            super();
        }

        @PublicApi public Builder(FirebaseOptions arg2) {
            super();
            this.applicationId = arg2.applicationId;
            this.apiKey = arg2.apiKey;
            this.databaseUrl = arg2.databaseUrl;
            this.gaTrackingId = arg2.gaTrackingId;
            this.gcmSenderId = arg2.gcmSenderId;
            this.storageBucket = arg2.storageBucket;
            this.projectId = arg2.projectId;
        }

        @PublicApi public FirebaseOptions build() {
            return new FirebaseOptions(this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId, null);
        }

        @PublicApi public Builder setApiKey(@NonNull String arg2) {
            this.apiKey = Preconditions.checkNotEmpty(arg2, "ApiKey must be set.");
            return this;
        }

        @PublicApi public Builder setApplicationId(@NonNull String arg2) {
            this.applicationId = Preconditions.checkNotEmpty(arg2, "ApplicationId must be set.");
            return this;
        }

        @PublicApi public Builder setDatabaseUrl(@Nullable String arg1) {
            this.databaseUrl = arg1;
            return this;
        }

        @KeepForSdk public Builder setGaTrackingId(@Nullable String arg1) {
            this.gaTrackingId = arg1;
            return this;
        }

        @PublicApi public Builder setGcmSenderId(@Nullable String arg1) {
            this.gcmSenderId = arg1;
            return this;
        }

        @PublicApi public Builder setProjectId(@Nullable String arg1) {
            this.projectId = arg1;
            return this;
        }

        @PublicApi public Builder setStorageBucket(@Nullable String arg1) {
            this.storageBucket = arg1;
            return this;
        }
    }

    private static final String API_KEY_RESOURCE_NAME = "google_api_key";
    private static final String APP_ID_RESOURCE_NAME = "google_app_id";
    private static final String DATABASE_URL_RESOURCE_NAME = "firebase_database_url";
    private static final String GA_TRACKING_ID_RESOURCE_NAME = "ga_trackingId";
    private static final String GCM_SENDER_ID_RESOURCE_NAME = "gcm_defaultSenderId";
    private static final String PROJECT_ID_RESOURCE_NAME = "project_id";
    private static final String STORAGE_BUCKET_RESOURCE_NAME = "google_storage_bucket";
    private final String apiKey;
    private final String applicationId;
    private final String databaseUrl;
    private final String gaTrackingId;
    private final String gcmSenderId;
    private final String projectId;
    private final String storageBucket;

    private FirebaseOptions(@NonNull String arg3, @NonNull String arg4, @Nullable String arg5, @Nullable String arg6, @Nullable String arg7, @Nullable String arg8, @Nullable String arg9) {
        super();
        Preconditions.checkState(Strings.isEmptyOrWhitespace(arg3) ^ 1, "ApplicationId must be set.");
        this.applicationId = arg3;
        this.apiKey = arg4;
        this.databaseUrl = arg5;
        this.gaTrackingId = arg6;
        this.gcmSenderId = arg7;
        this.storageBucket = arg8;
        this.projectId = arg9;
    }

    FirebaseOptions(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6, String arg7, com.google.firebase.FirebaseOptions$1 arg8) {
        this(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    static String access$000(FirebaseOptions arg0) {
        return arg0.applicationId;
    }

    static String access$100(FirebaseOptions arg0) {
        return arg0.apiKey;
    }

    static String access$200(FirebaseOptions arg0) {
        return arg0.databaseUrl;
    }

    static String access$300(FirebaseOptions arg0) {
        return arg0.gaTrackingId;
    }

    static String access$400(FirebaseOptions arg0) {
        return arg0.gcmSenderId;
    }

    static String access$500(FirebaseOptions arg0) {
        return arg0.storageBucket;
    }

    static String access$600(FirebaseOptions arg0) {
        return arg0.projectId;
    }

    public boolean equals(Object arg4) {
        boolean v1 = false;
        if(!(arg4 instanceof FirebaseOptions)) {
            return 0;
        }

        if((Objects.equal(this.applicationId, ((FirebaseOptions)arg4).applicationId)) && (Objects.equal(this.apiKey, ((FirebaseOptions)arg4).apiKey)) && (Objects.equal(this.databaseUrl, ((FirebaseOptions)arg4).databaseUrl)) && (Objects.equal(this.gaTrackingId, ((FirebaseOptions)arg4).gaTrackingId)) && (Objects.equal(this.gcmSenderId, ((FirebaseOptions)arg4).gcmSenderId)) && (Objects.equal(this.storageBucket, ((FirebaseOptions)arg4).storageBucket)) && (Objects.equal(this.projectId, ((FirebaseOptions)arg4).projectId))) {
            v1 = true;
        }

        return v1;
    }

    @PublicApi public static FirebaseOptions fromResource(Context arg9) {
        StringResourceValueReader v0 = new StringResourceValueReader(arg9);
        String v2 = v0.getString("google_app_id");
        if(TextUtils.isEmpty(((CharSequence)v2))) {
            return null;
        }

        return new FirebaseOptions(v2, v0.getString("google_api_key"), v0.getString("firebase_database_url"), v0.getString("ga_trackingId"), v0.getString("gcm_defaultSenderId"), v0.getString("google_storage_bucket"), v0.getString("project_id"));
    }

    @PublicApi public String getApiKey() {
        return this.apiKey;
    }

    @PublicApi public String getApplicationId() {
        return this.applicationId;
    }

    @PublicApi public String getDatabaseUrl() {
        return this.databaseUrl;
    }

    @KeepForSdk public String getGaTrackingId() {
        return this.gaTrackingId;
    }

    @PublicApi public String getGcmSenderId() {
        return this.gcmSenderId;
    }

    @PublicApi public String getProjectId() {
        return this.projectId;
    }

    @PublicApi public String getStorageBucket() {
        return this.storageBucket;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.applicationId, this.apiKey, this.databaseUrl, this.gaTrackingId, this.gcmSenderId, this.storageBucket, this.projectId});
    }

    public String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.applicationId).add("apiKey", this.apiKey).add("databaseUrl", this.databaseUrl).add("gcmSenderId", this.gcmSenderId).add("storageBucket", this.storageBucket).add("projectId", this.projectId).toString();
    }
}

