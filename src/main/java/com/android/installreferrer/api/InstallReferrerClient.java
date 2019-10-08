package com.android.installreferrer.api;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class InstallReferrerClient {
    class com.android.installreferrer.api.InstallReferrerClient$1 {
    }

    public final class Builder {
        private final Context mContext;

        Builder(Context arg1, com.android.installreferrer.api.InstallReferrerClient$1 arg2) {
            this(arg1);
        }

        private Builder(Context arg1) {
            super();
            this.mContext = arg1;
        }

        @UiThread public InstallReferrerClient build() {
            if(this.mContext != null) {
                return new InstallReferrerClientImpl(this.mContext);
            }

            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface InstallReferrerResponse {
        public static final int DEVELOPER_ERROR = 3;
        public static final int FEATURE_NOT_SUPPORTED = 2;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 1;

    }

    public InstallReferrerClient() {
        super();
    }

    @UiThread public abstract void endConnection();

    @UiThread public abstract ReferrerDetails getInstallReferrer() throws RemoteException;

    @UiThread public abstract boolean isReady();

    @UiThread public static Builder newBuilder(@NonNull Context arg2) {
        return new Builder(arg2, null);
    }

    @UiThread public abstract void startConnection(@NonNull InstallReferrerStateListener arg1);
}

