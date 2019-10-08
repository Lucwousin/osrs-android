package com.android.billingclient.api;

import java.util.ArrayList;
import java.util.List;

public class SkuDetailsParams {
    class com.android.billingclient.api.SkuDetailsParams$1 {
    }

    public class Builder {
        private String mSkuType;
        private List mSkusList;

        Builder(com.android.billingclient.api.SkuDetailsParams$1 arg1) {
            this();
        }

        private Builder() {
            super();
        }

        public SkuDetailsParams build() {
            SkuDetailsParams v0 = new SkuDetailsParams();
            v0.mSkuType = this.mSkuType;
            v0.mSkusList = new ArrayList(this.mSkusList);
            return v0;
        }

        public Builder setSkusList(List arg1) {
            this.mSkusList = arg1;
            return this;
        }

        public Builder setType(String arg1) {
            this.mSkuType = arg1;
            return this;
        }
    }

    private String mSkuType;
    private List mSkusList;

    public SkuDetailsParams() {
        super();
    }

    static String access$102(SkuDetailsParams arg0, String arg1) {
        arg0.mSkuType = arg1;
        return arg1;
    }

    static List access$202(SkuDetailsParams arg0, List arg1) {
        arg0.mSkusList = arg1;
        return arg1;
    }

    public String getSkuType() {
        return this.mSkuType;
    }

    public List getSkusList() {
        return this.mSkusList;
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }
}

