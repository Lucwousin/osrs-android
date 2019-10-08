package com.android.billingclient.api;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class BillingClient {
    class com.android.billingclient.api.BillingClient$1 {
    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface BillingResponse {
        public static final int BILLING_UNAVAILABLE = 3;
        public static final int DEVELOPER_ERROR = 5;
        public static final int ERROR = 6;
        public static final int FEATURE_NOT_SUPPORTED = -2;
        public static final int ITEM_ALREADY_OWNED = 7;
        public static final int ITEM_NOT_OWNED = 8;
        public static final int ITEM_UNAVAILABLE = 4;
        public static final int OK = 0;
        public static final int SERVICE_DISCONNECTED = -1;
        public static final int SERVICE_UNAVAILABLE = 2;
        public static final int USER_CANCELED = 1;

    }

    public final class Builder {
        private final Context mContext;
        private PurchasesUpdatedListener mListener;

        Builder(Context arg1, com.android.billingclient.api.BillingClient$1 arg2) {
            this(arg1);
        }

        private Builder(Context arg1) {
            super();
            this.mContext = arg1;
        }

        @UiThread public BillingClient build() {
            if(this.mContext != null) {
                if(this.mListener != null) {
                    return new BillingClientImpl(this.mContext, this.mListener);
                }

                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            }

            throw new IllegalArgumentException("Please provide a valid Context.");
        }

        @UiThread public Builder setListener(PurchasesUpdatedListener arg1) {
            this.mListener = arg1;
            return this;
        }
    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface FeatureType {
        public static final String IN_APP_ITEMS_ON_VR = "inAppItemsOnVr";
        public static final String SUBSCRIPTIONS = "subscriptions";
        public static final String SUBSCRIPTIONS_ON_VR = "subscriptionsOnVr";
        public static final String SUBSCRIPTIONS_UPDATE = "subscriptionsUpdate";

    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface SkuType {
        public static final String INAPP = "inapp";
        public static final String SUBS = "subs";

    }

    public BillingClient() {
        super();
    }

    @UiThread public abstract void consumeAsync(String arg1, ConsumeResponseListener arg2);

    @UiThread public abstract void endConnection();

    @UiThread public abstract int isFeatureSupported(String arg1);

    @UiThread public abstract boolean isReady();

    @UiThread public abstract int launchBillingFlow(Activity arg1, BillingFlowParams arg2);

    @UiThread public static Builder newBuilder(@NonNull Context arg2) {
        return new Builder(arg2, null);
    }

    @UiThread public abstract void queryPurchaseHistoryAsync(String arg1, PurchaseHistoryResponseListener arg2);

    @UiThread public abstract PurchasesResult queryPurchases(String arg1);

    @UiThread public abstract void querySkuDetailsAsync(SkuDetailsParams arg1, SkuDetailsResponseListener arg2);

    @UiThread public abstract void startConnection(@NonNull BillingClientStateListener arg1);
}

