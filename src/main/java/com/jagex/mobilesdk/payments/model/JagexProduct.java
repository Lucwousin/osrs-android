package com.jagex.mobilesdk.payments.model;

import com.android.billingclient.api.SkuDetails;

public class JagexProduct {
    private boolean available;
    private String productId;
    private boolean recommended;
    private SkuDetails skuItem;
    private String subtitle;
    private String title;

    public JagexProduct() {
        super();
    }

    public String getFullProductName() {
        return this.getTitle() + " " + this.getSubtitle();
    }

    public String getProductId() {
        return this.productId;
    }

    public SkuDetails getSkuItem() {
        return this.skuItem;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isAvailable() {
        return this.available;
    }

    public boolean isRecommended() {
        return this.recommended;
    }

    public void setProductId(String arg1) {
        this.productId = arg1;
    }

    public void setRecommended(boolean arg1) {
        this.recommended = arg1;
    }

    public void setSkuItem(SkuDetails arg1) {
        this.skuItem = arg1;
    }

    public void setSubtitle(String arg1) {
        this.subtitle = arg1;
    }

    public void setTitle(String arg1) {
        this.title = arg1;
    }
}

