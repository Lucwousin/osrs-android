package com.jagex.mobilesdk.payments;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.payments.model.JagexCategory;
import com.jagex.mobilesdk.payments.model.JagexProduct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShopItemsManager implements CategoryListViewListener, PendingTransactionUpdate {
    private final Activity activity;
    private List categories;
    private final CategoryListViewController controller;
    private final ShopItemsManagerUpdate updater;

    public ShopItemsManager(@NonNull Activity arg1, @NonNull JagexConfig arg2, @NonNull ShopItemsManagerUpdate arg3) {
        super();
        this.updater = arg3;
        this.activity = arg1;
        this.categories = new ArrayList();
        this.controller = new CategoryListViewController(((CategoryListViewListener)this), arg1, arg2);
    }

    static CategoryListViewController access$000(ShopItemsManager arg0) {
        return arg0.controller;
    }

    public void applyComplete() {
        this.updater.requestComplete();
    }

    public void applyFailed() {
        this.updater.requestFailed();
    }

    public void billingInitialiseAttempt(int arg2) {
        if(arg2 != 0) {
            this.updater.requestFailed();
            return;
        }

        this.activity.runOnUiThread(new Runnable() {
            public void run() {
                ShopItemsManager.this.controller.checkNetwork();
            }
        });
    }

    private JagexCategory getCategory(int arg2) {
        if(arg2 >= 0 && arg2 < this.categories.size()) {
            return this.categories.get(arg2);
        }

        return null;
    }

    public int getCategoryCount() {
        return this.categories.size();
    }

    public String getCategoryDescription(int arg1) {
        JagexCategory v1 = this.getCategory(arg1);
        if(v1 != null) {
            return v1.getLongDescription();
        }

        return "";
    }

    public int getCategoryID(int arg1) {
        JagexCategory v1 = this.getCategory(arg1);
        if(v1 != null) {
            return v1.getCategoryID();
        }

        return -1;
    }

    public String getCategoryName(int arg1) {
        JagexCategory v1 = this.getCategory(arg1);
        if(v1 != null) {
            return v1.getName();
        }

        return "";
    }

    public int getIndexForCategoryID(int arg4) {
        Iterator v0 = this.categories.iterator();
        int v1;
        for(v1 = 0; v0.hasNext(); ++v1) {
            if(v0.next().getCategoryID() == arg4) {
                return v1;
            }
        }

        return -1;
    }

    public int getIndexForCategoryName(String arg4) {
        Iterator v0 = this.categories.iterator();
        int v1;
        for(v1 = 0; v0.hasNext(); ++v1) {
            if(v0.next().getName().equalsIgnoreCase(arg4)) {
                return v1;
            }
        }

        return -1;
    }

    public int getProductCount(int arg1) {
        JagexCategory v1 = this.getCategory(arg1);
        if(v1 != null) {
            return v1.getProducts().size();
        }

        return 0;
    }

    public String getProductCurrencyCode(int arg1, int arg2) {
        JagexProduct v1 = this.getProductforCategory(arg1, arg2);
        if(v1 != null) {
            return v1.getSkuItem().getPriceCurrencyCode();
        }

        return "";
    }

    public String getProductFreeTrialPeriod(int arg1, int arg2) {
        JagexProduct v1 = this.getProductforCategory(arg1, arg2);
        if(v1 != null) {
            return v1.getSkuItem().getFreeTrialPeriod();
        }

        return "";
    }

    public String getProductID(int arg1, int arg2) {
        JagexProduct v1 = this.getProductforCategory(arg1, arg2);
        if(v1 != null) {
            return v1.getProductId();
        }

        return "";
    }

    public String getProductIntroductoryPrice(int arg1, int arg2) {
        JagexProduct v1 = this.getProductforCategory(arg1, arg2);
        if(v1 != null) {
            return v1.getSkuItem().getIntroductoryPrice();
        }

        return "";
    }

    public String getProductIntroductoryPriceAsMicroUnits(int arg1, int arg2) {
        JagexProduct v1 = this.getProductforCategory(arg1, arg2);
        if(v1 != null) {
            return v1.getSkuItem().getIntroductoryPriceAmountMicros();
        }

        return "";
    }

    public String getProductName(int arg1, int arg2) {
        JagexProduct v1 = this.getProductforCategory(arg1, arg2);
        if(v1 != null) {
            return v1.getFullProductName();
        }

        return "";
    }

    public String getProductPrice(int arg1, int arg2) {
        JagexProduct v1 = this.getProductforCategory(arg1, arg2);
        if(v1 != null) {
            return v1.getSkuItem().getPrice();
        }

        return "";
    }

    public String getProductPriceAsMicroUnits(int arg1, int arg2) {
        JagexProduct v1 = this.getProductforCategory(arg1, arg2);
        if(v1 != null) {
            return Long.toString(v1.getSkuItem().getPriceAmountMicros());
        }

        return "";
    }

    public String getProductType(int arg1, int arg2) {
        JagexProduct v1 = this.getProductforCategory(arg1, arg2);
        if(v1 != null) {
            return v1.getSkuItem().getType();
        }

        return "";
    }

    private JagexProduct getProductforCategory(int arg2, int arg3) {
        JagexCategory v2 = this.getCategory(arg2);
        if(v2 != null && arg3 >= 0 && arg3 < v2.getProducts().size()) {
            return v2.getProducts().get(arg3);
        }

        return null;
    }

    public boolean isProductAvailable(int arg1, int arg2) {
        JagexProduct v1 = this.getProductforCategory(arg1, arg2);
        if(v1 != null) {
            return v1.isAvailable();
        }

        return 0;
    }

    public boolean isProductRecommended(int arg1, int arg2) {
        JagexProduct v1 = this.getProductforCategory(arg1, arg2);
        if(v1 != null) {
            return v1.isRecommended();
        }

        return 0;
    }

    public void onCategoriesLoaded(List arg3) {
        this.categories = new ArrayList();
        Iterator v3 = arg3.iterator();
        while(v3.hasNext()) {
            this.categories.add(v3.next());
        }

        this.updater.shopItemsManagerReady(this.categories.isEmpty() ^ 1);
    }

    public void onDisplayMessage(int arg1) {
    }

    public void onInternetStateChanged(boolean arg1) {
    }

    public void onPendingPurchasesAvailable() {
    }

    public void onShopLoaded(String arg1, String arg2) {
    }

    public void onSuccessfulConsumption() {
        this.updater.requestComplete();
    }

    public void purchaseItem(String arg5) {
        Object v2;
        Iterator v0 = this.categories.iterator();
    label_2:
        if(v0.hasNext()) {
            Iterator v1 = v0.next().getProducts().iterator();
            do {
                if(!v1.hasNext()) {
                    goto label_2;
                }

                v2 = v1.next();
            }
            while(!arg5.equals(((JagexProduct)v2).getProductId()));

            SkuDetails v5 = ((JagexProduct)v2).getSkuItem();
            if(v5 != null) {
                this.controller.buyProduct(v5, ((PendingTransactionUpdate)this));
            }
            else {
                this.updater.requestFailed();
            }

            return;
        }

        this.updater.requestFailed();
    }

    public void returnToGame() {
        this.updater.requestFailed();
    }

    public void transactionsAvailable(boolean arg1) {
    }
}

