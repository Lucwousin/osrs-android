package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;

public class BillingFlowParams {
    class com.android.billingclient.api.BillingFlowParams$1 {
    }

    public class Builder {
        private String mAccountId;
        private String mOldSku;
        private int mReplaceSkusProrationMode;
        private String mSku;
        private String mSkuType;
        private boolean mVrPurchaseFlow;

        Builder(com.android.billingclient.api.BillingFlowParams$1 arg1) {
            this();
        }

        private Builder() {
            super();
            this.mReplaceSkusProrationMode = 0;
        }

        @Deprecated public Builder addOldSku(String arg1) {
            this.mOldSku = arg1;
            return this;
        }

        public BillingFlowParams build() {
            BillingFlowParams v0 = new BillingFlowParams();
            v0.mSku = this.mSku;
            v0.mSkuType = this.mSkuType;
            v0.mOldSku = this.mOldSku;
            v0.mAccountId = this.mAccountId;
            v0.mVrPurchaseFlow = this.mVrPurchaseFlow;
            v0.mReplaceSkusProrationMode = this.mReplaceSkusProrationMode;
            return v0;
        }

        public Builder setAccountId(String arg1) {
            this.mAccountId = arg1;
            return this;
        }

        public Builder setOldSku(String arg1) {
            this.mOldSku = arg1;
            return this;
        }

        @Deprecated public Builder setOldSkus(ArrayList arg2) {
            if(arg2 != null && arg2.size() > 0) {
                this.mOldSku = arg2.get(0);
            }

            return this;
        }

        public Builder setReplaceSkusProrationMode(int arg1) {
            this.mReplaceSkusProrationMode = arg1;
            return this;
        }

        public Builder setSku(String arg1) {
            this.mSku = arg1;
            return this;
        }

        public Builder setType(String arg1) {
            this.mSkuType = arg1;
            return this;
        }

        public Builder setVrPurchaseFlow(boolean arg1) {
            this.mVrPurchaseFlow = arg1;
            return this;
        }
    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface ProrationMode {
        public static final int IMMEDIATE_AND_CHARGE_PRORATED_PRICE = 2;
        public static final int IMMEDIATE_WITHOUT_PRORATION = 3;
        public static final int IMMEDIATE_WITH_TIME_PRORATION = 1;
        public static final int UNKNOWN_SUBSCRIPTION_UPGRADE_DOWNGRADE_POLICY;

    }

    static final String EXTRA_PARAM_KEY_ACCOUNT_ID = "accountId";
    static final String EXTRA_PARAM_KEY_OLD_SKUS = "skusToReplace";
    static final String EXTRA_PARAM_KEY_REPLACE_SKUS_PRORATION_MODE = "prorationMode";
    static final String EXTRA_PARAM_KEY_VR = "vr";
    private String mAccountId;
    private String mOldSku;
    private int mReplaceSkusProrationMode;
    private String mSku;
    private String mSkuType;
    private boolean mVrPurchaseFlow;

    public BillingFlowParams() {
        super();
        this.mReplaceSkusProrationMode = 0;
    }

    static String access$102(BillingFlowParams arg0, String arg1) {
        arg0.mSku = arg1;
        return arg1;
    }

    static String access$202(BillingFlowParams arg0, String arg1) {
        arg0.mSkuType = arg1;
        return arg1;
    }

    static String access$302(BillingFlowParams arg0, String arg1) {
        arg0.mOldSku = arg1;
        return arg1;
    }

    static String access$402(BillingFlowParams arg0, String arg1) {
        arg0.mAccountId = arg1;
        return arg1;
    }

    static boolean access$502(BillingFlowParams arg0, boolean arg1) {
        arg0.mVrPurchaseFlow = arg1;
        return arg1;
    }

    static int access$602(BillingFlowParams arg0, int arg1) {
        arg0.mReplaceSkusProrationMode = arg1;
        return arg1;
    }

    public String getAccountId() {
        return this.mAccountId;
    }

    public String getOldSku() {
        return this.mOldSku;
    }

    @Deprecated public ArrayList getOldSkus() {
        return new ArrayList(Arrays.asList(new String[]{this.mOldSku}));
    }

    public int getReplaceSkusProrationMode() {
        return this.mReplaceSkusProrationMode;
    }

    public String getSku() {
        return this.mSku;
    }

    public String getSkuType() {
        return this.mSkuType;
    }

    public boolean getVrPurchaseFlow() {
        return this.mVrPurchaseFlow;
    }

    public boolean hasExtraParams() {
        boolean v0 = (this.mVrPurchaseFlow) || this.mAccountId != null || this.mReplaceSkusProrationMode != 0 ? true : false;
        return v0;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }
}

