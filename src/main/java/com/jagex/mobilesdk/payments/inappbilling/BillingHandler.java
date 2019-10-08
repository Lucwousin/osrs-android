package com.jagex.mobilesdk.payments.inappbilling;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ConsumeResponseListener;
import com.android.billingclient.api.Purchase$PurchasesResult;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryResponseListener;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.SkuDetailsParams$Builder;
import com.android.billingclient.api.SkuDetailsParams;
import com.android.billingclient.api.SkuDetailsResponseListener;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BillingHandler implements PurchasesUpdatedListener {
    public interface BillingWrapperListener {
        void onBillingManagerInitializeAttempt(int arg1);

        void onDisplayMessage(int arg1);

        void onPurchaseConsumed(String arg1);
    }

    public interface FetchProductsListener {
        void products(boolean arg1, List arg2);
    }

    public interface PurchaseHistoryListener {
        void purchaseHistory(boolean arg1, List arg2);
    }

    public interface PurchaseProductListener {
        void purchaseError(int arg1);

        void purchased(Purchase arg1);
    }

    private Activity mActivity;
    private BillingClient mBillingClient;
    private boolean mIsServiceConnected;
    private final float priceDivisor;
    private PurchaseProductListener purchaseListener;
    private SkuDetails purchasedSKU;
    private BillingWrapperListener wrapperListener;

    public BillingHandler(Activity arg2, BillingWrapperListener arg3) {
        super();
        this.mIsServiceConnected = false;
        this.priceDivisor = 1000000f;
        this.mActivity = arg2;
        this.wrapperListener = arg3;
        this.initializeBilling();
    }

    static BillingWrapperListener access$000(BillingHandler arg0) {
        return arg0.wrapperListener;
    }

    static boolean access$102(BillingHandler arg0, boolean arg1) {
        arg0.mIsServiceConnected = arg1;
        return arg1;
    }

    static void access$200(BillingHandler arg0) {
        arg0.initializeBilling();
    }

    static void access$300(BillingHandler arg0, String arg1, List arg2, FetchProductsListener arg3) {
        arg0.fetchProductsType(arg1, arg2, arg3);
    }

    public void close() {
        this.wrapperListener = null;
        this.purchaseListener = null;
        if(this.mBillingClient != null && (this.mIsServiceConnected)) {
            this.mBillingClient.endConnection();
        }
    }

    public void consume(Purchase arg3) {
        this.mBillingClient.consumeAsync(arg3.getPurchaseToken(), new ConsumeResponseListener() {
            public void onConsumeResponse(int arg1, String arg2) {
                if(arg1 == 0) {
                    if(BillingHandler.this.wrapperListener != null) {
                        BillingHandler.this.wrapperListener.onPurchaseConsumed(arg2);
                    }
                }
                else if(arg1 == -1) {
                    BillingHandler.this.initializeBilling();
                }
                else if(BillingHandler.this.wrapperListener != null) {
                    BillingHandler.this.wrapperListener.onDisplayMessage(BillingMessages.getErrorMessage(arg1));
                }
            }
        });
    }

    public void fetchAllProducts(List arg4, FetchProductsListener arg5) {
        this.fetchProductsType("subs", arg4, new FetchProductsListener(new ArrayList(), arg4, arg5) {
            public void products(boolean arg4, List arg5) {
                this.val$allProducts.addAll(((Collection)arg5));
                BillingHandler.this.fetchProductsType("inapp", this.val$skus, new FetchProductsListener(arg4) {
                    public void products(boolean arg2, List arg3) {
                        this.this$1.val$allProducts.addAll(((Collection)arg3));
                        FetchProductsListener v3 = this.this$1.val$listener;
                        arg2 = !this.val$subsSuccess || !arg2 ? false : true;
                        v3.products(arg2, this.this$1.val$allProducts);
                    }
                });
            }
        });
    }

    private void fetchProductsType(String arg2, List arg3, FetchProductsListener arg4) {
        Builder v0 = SkuDetailsParams.newBuilder();
        v0.setSkusList(arg3).setType(arg2);
        this.mBillingClient.querySkuDetailsAsync(v0.build(), new SkuDetailsResponseListener(arg4) {
            public void onSkuDetailsResponse(int arg3, List arg4) {
                if(arg3 == 0) {
                    this.val$listener.products(true, arg4);
                }
                else {
                    this.val$listener.products(false, new ArrayList());
                    if(BillingHandler.this.wrapperListener != null) {
                        BillingHandler.this.wrapperListener.onDisplayMessage(BillingMessages.getErrorMessage(arg3));
                    }
                }
            }
        });
    }

    private void initializeBilling() {
        if(this.mBillingClient == null) {
            this.mBillingClient = BillingClient.newBuilder(this.mActivity).setListener(((PurchasesUpdatedListener)this)).build();
        }

        this.mBillingClient.startConnection(new BillingClientStateListener() {
            public void onBillingServiceDisconnected() {
                BillingHandler.this.mIsServiceConnected = false;
            }

            public void onBillingSetupFinished(int arg2) {
                if(BillingHandler.this.wrapperListener != null) {
                    BillingHandler.this.wrapperListener.onBillingManagerInitializeAttempt(arg2);
                }
            }
        });
    }

    public void initiatePurchaseFlow(SkuDetails arg2, @NonNull PurchaseProductListener arg3) {
        this.purchaseListener = arg3;
        this.purchasedSKU = arg2;
        this.mBillingClient.launchBillingFlow(this.mActivity, BillingFlowParams.newBuilder().setSku(arg2.getSku()).setType(arg2.getType()).build());
    }

    public void onPurchasesUpdated(int arg5, @Nullable List arg6) {
        if(arg5 == 0) {
            Iterator v5 = arg6.iterator();
            while(v5.hasNext()) {
                Object v6 = v5.next();
                if(this.purchasedSKU != null) {
                    HashMap v0 = new HashMap();
                    ((Map)v0).put("af_revenue", Float.valueOf((((float)this.purchasedSKU.getPriceAmountMicros())) / 1000000f));
                    ((Map)v0).put("af_currency", this.purchasedSKU.getPriceCurrencyCode());
                    ((Map)v0).put("af_content_type", this.purchasedSKU.getTitle());
                    ((Map)v0).put("af_content_id", this.purchasedSKU.getSku());
                    MobileAttributionService.sendEvent(this.mActivity, "af_purchase", ((Map)v0));
                }

                if(this.purchaseListener == null) {
                    continue;
                }

                this.purchaseListener.purchased(((Purchase)v6));
            }
        }
        else {
            if(this.purchaseListener == null) {
                return;
            }

            this.purchaseListener.purchaseError(arg5);
        }
    }

    public List queryPendingTransactions() {
        PurchasesResult v0 = this.mBillingClient.queryPurchases("inapp");
        List v2 = null;
        if(v0.getResponseCode() != 0) {
            if(this.wrapperListener != null) {
                this.wrapperListener.onDisplayMessage(BillingMessages.getErrorMessage(v0.getResponseCode()));
            }

            return v2;
        }

        PurchasesResult v1 = this.mBillingClient.queryPurchases("subs");
        if(v1.getResponseCode() != 0) {
            if(this.wrapperListener != null) {
                this.wrapperListener.onDisplayMessage(BillingMessages.getErrorMessage(v1.getResponseCode()));
            }

            return v2;
        }

        v0.getPurchasesList().addAll(v1.getPurchasesList());
        return v0.getPurchasesList();
    }

    public void queryPurchaseHistory(String arg3, PurchaseHistoryListener arg4) {
        this.mBillingClient.queryPurchaseHistoryAsync(arg3, new PurchaseHistoryResponseListener(arg4) {
            public void onPurchaseHistoryResponse(int arg2, List arg3) {
                if(arg2 == 0) {
                    this.val$listener.purchaseHistory(true, arg3);
                }
                else {
                    if(BillingHandler.this.wrapperListener != null) {
                        BillingHandler.this.wrapperListener.onDisplayMessage(BillingMessages.getErrorMessage(arg2));
                    }

                    this.val$listener.purchaseHistory(false, new ArrayList());
                }
            }
        });
    }
}

