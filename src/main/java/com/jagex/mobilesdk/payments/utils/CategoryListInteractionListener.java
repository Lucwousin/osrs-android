package com.jagex.mobilesdk.payments.utils;

import com.android.billingclient.api.SkuDetails;

public interface CategoryListInteractionListener {
    void finish();

    void onCategoryExpanded();

    void onCollapsePackages();

    void onShopLoaded(String arg1, String arg2);

    void onShowHideMoreProducts(boolean arg1, int arg2);

    void purchaseProduct(SkuDetails arg1);

    void setCategoryExpandCollapseDetails(boolean arg1, int arg2);
}

