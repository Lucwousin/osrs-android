package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class Purchase {
    public class PurchasesResult {
        private List mPurchaseList;
        private int mResponseCode;

        PurchasesResult(int arg1, List arg2) {
            super();
            this.mPurchaseList = arg2;
            this.mResponseCode = arg1;
        }

        public List getPurchasesList() {
            return this.mPurchaseList;
        }

        public int getResponseCode() {
            return this.mResponseCode;
        }
    }

    private final String mOriginalJson;
    private final JSONObject mParsedJson;
    private final String mSignature;

    public Purchase(String arg1, String arg2) throws JSONException {
        super();
        this.mOriginalJson = arg1;
        this.mSignature = arg2;
        this.mParsedJson = new JSONObject(this.mOriginalJson);
    }

    public boolean equals(Object arg5) {
        boolean v0 = true;
        if(this == (((Purchase)arg5))) {
            return 1;
        }

        if(!(arg5 instanceof Purchase)) {
            return 0;
        }

        if(!TextUtils.equals(this.mOriginalJson, ((Purchase)arg5).getOriginalJson()) || !TextUtils.equals(this.mSignature, ((Purchase)arg5).getSignature())) {
            v0 = false;
        }
        else {
        }

        return v0;
    }

    public String getOrderId() {
        return this.mParsedJson.optString("orderId");
    }

    public String getOriginalJson() {
        return this.mOriginalJson;
    }

    public String getPackageName() {
        return this.mParsedJson.optString("packageName");
    }

    public long getPurchaseTime() {
        return this.mParsedJson.optLong("purchaseTime");
    }

    public String getPurchaseToken() {
        return this.mParsedJson.optString("token", this.mParsedJson.optString("purchaseToken"));
    }

    public String getSignature() {
        return this.mSignature;
    }

    public String getSku() {
        return this.mParsedJson.optString("productId");
    }

    public int hashCode() {
        return this.mOriginalJson.hashCode();
    }

    public boolean isAutoRenewing() {
        return this.mParsedJson.optBoolean("autoRenewing");
    }

    public String toString() {
        return "Purchase. Json: " + this.mOriginalJson;
    }
}

