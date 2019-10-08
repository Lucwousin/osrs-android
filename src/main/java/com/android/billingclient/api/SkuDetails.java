package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class SkuDetails {
    class SkuDetailsResult {
        private int mResponseCode;
        private List mSkuDetailsList;

        SkuDetailsResult(int arg1, List arg2) {
            super();
            this.mSkuDetailsList = arg2;
            this.mResponseCode = arg1;
        }

        int getResponseCode() {
            return this.mResponseCode;
        }

        List getSkuDetailsList() {
            return this.mSkuDetailsList;
        }
    }

    private final String mOriginalJson;
    private final JSONObject mParsedJson;

    public SkuDetails(String arg2) throws JSONException {
        super();
        this.mOriginalJson = arg2;
        this.mParsedJson = new JSONObject(this.mOriginalJson);
    }

    public boolean equals(Object arg3) {
        if(this == (((SkuDetails)arg3))) {
            return 1;
        }

        if(arg3 != null) {
            if(this.getClass() != arg3.getClass()) {
            }
            else {
                return TextUtils.equals(this.mOriginalJson, ((SkuDetails)arg3).mOriginalJson);
            }
        }

        return 0;
    }

    public String getDescription() {
        return this.mParsedJson.optString("description");
    }

    public String getFreeTrialPeriod() {
        return this.mParsedJson.optString("freeTrialPeriod");
    }

    public String getIntroductoryPrice() {
        return this.mParsedJson.optString("introductoryPrice");
    }

    public String getIntroductoryPriceAmountMicros() {
        return this.mParsedJson.optString("introductoryPriceAmountMicros");
    }

    public String getIntroductoryPriceCycles() {
        return this.mParsedJson.optString("introductoryPriceCycles");
    }

    public String getIntroductoryPricePeriod() {
        return this.mParsedJson.optString("introductoryPricePeriod");
    }

    public String getPrice() {
        return this.mParsedJson.optString("price");
    }

    public long getPriceAmountMicros() {
        return this.mParsedJson.optLong("price_amount_micros");
    }

    public String getPriceCurrencyCode() {
        return this.mParsedJson.optString("price_currency_code");
    }

    public String getSku() {
        return this.mParsedJson.optString("productId");
    }

    public String getSubscriptionPeriod() {
        return this.mParsedJson.optString("subscriptionPeriod");
    }

    public String getTitle() {
        return this.mParsedJson.optString("title");
    }

    public String getType() {
        return this.mParsedJson.optString("type");
    }

    public int hashCode() {
        return this.mOriginalJson.hashCode();
    }

    public String toString() {
        return "SkuDetails: " + this.mOriginalJson;
    }
}

