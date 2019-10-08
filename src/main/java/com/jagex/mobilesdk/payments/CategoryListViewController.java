package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.net.NetworkInfo;
import androidx.annotation.Nullable;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.jagex.mobilesdk.R$string;
import com.jagex.mobilesdk.auth.MobileAuthStateManager$AuthManagerAction;
import com.jagex.mobilesdk.auth.MobileAuthStateManager;
import com.jagex.mobilesdk.auth.MobileAuthStateWriter;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.common.comms.CommsResult;
import com.jagex.mobilesdk.payments.comms.CompletePaymentComms$CompletePaymentCallback;
import com.jagex.mobilesdk.payments.comms.FetchCategoriesComms$FetchCategoriesCallback;
import com.jagex.mobilesdk.payments.comms.PaymentComms;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler$BillingWrapperListener;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler$FetchProductsListener;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler$PurchaseProductListener;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler;
import com.jagex.mobilesdk.payments.model.CompletionStatus;
import com.jagex.mobilesdk.payments.model.JagexCategory;
import com.jagex.mobilesdk.payments.model.JagexProduct;
import com.jagex.mobilesdk.payments.model.PaymentCompletionRequest$PaymentPayload;
import com.jagex.mobilesdk.payments.model.PaymentCompletionRequest;
import com.jagex.mobilesdk.payments.model.Shop;
import com.jagex.mobilesdk.payments.utils.Intents;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class CategoryListViewController implements BillingWrapperListener {
    class com.jagex.mobilesdk.payments.CategoryListViewController$9 {
        static {
            com.jagex.mobilesdk.payments.CategoryListViewController$9.$SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus = new int[CompletionStatus.values().length];
            try {
                com.jagex.mobilesdk.payments.CategoryListViewController$9.$SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[CompletionStatus.SUCCESS_CUSTOMER_MISMATCH.ordinal()] = 1;
                goto label_9;
            }
            catch(NoSuchFieldError ) {
                try {
                label_9:
                    com.jagex.mobilesdk.payments.CategoryListViewController$9.$SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[CompletionStatus.SUCCESS.ordinal()] = 2;
                    goto label_14;
                }
                catch(NoSuchFieldError ) {
                    try {
                    label_14:
                        com.jagex.mobilesdk.payments.CategoryListViewController$9.$SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[CompletionStatus.FAILED.ordinal()] = 3;
                        goto label_19;
                    }
                    catch(NoSuchFieldError ) {
                        try {
                        label_19:
                            com.jagex.mobilesdk.payments.CategoryListViewController$9.$SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[CompletionStatus.NETWORK_ERROR.ordinal()] = 4;
                            return;
                        }
                        catch(NoSuchFieldError ) {
                            return;
                        }
                    }
                }
            }
        }
    }

    public interface CategoryListViewListener {
        void billingInitialiseAttempt(int arg1);

        void onCategoriesLoaded(List arg1);

        void onDisplayMessage(int arg1);

        void onInternetStateChanged(boolean arg1);

        void onPendingPurchasesAvailable();

        void onShopLoaded(String arg1, String arg2);

        void onSuccessfulConsumption();

        void returnToGame();
    }

    private static final String CONTENT_TYPE_JSON = "application/json";
    private static final String HTTP_HEADER_ACCEPT_LANGUAGE = "Accept-Language";
    private static final String HTTP_HEADER_ACCEPT_RESOLUTION = "Accept-Resolution";
    private static final String HTTP_HEADER_ACCEPT_TYPE = "Accept-Type";
    private static final String HTTP_HEADER_AUTHORIZATION = "Authorization";
    private static final String HTTP_HEADER_BEARER = "Bearer";
    private static final String HTTP_HEADER_CONTENT_TYPE = "Content-Type";
    private static final String PAYMENTAPI_ANDROID = "/android";
    private static final String PAYMENTAPI_COMPLETION = "/completion/";
    private static final String PAYMENTAPI_SHOP = "shop/";
    private static final String SUBSCRIPTION_KNOWN_LIST = "KNOWN_LIST";
    private static final String SUBSCRIPTION_KNOWN_NAME = "KNOWN_NAME";
    private final Activity activity;
    private final MobileAuthStateManager authStateManager;
    private final MobileAuthStateWriter authStateWriter;
    private final BillingHandler billingHandler;
    private final Context context;
    private List currentStoreSubscriptions;
    private boolean isUserNotifiedOfPendingPurchase;
    private final JagexConfig jagexConfig;
    private HashMap productTypeMap;
    private final PurchaseHistory purchaseHistory;
    BroadcastReceiver receiver;
    private final List unconsumedPurchases;
    private final CategoryListViewListener viewListener;

    CategoryListViewController(CategoryListViewListener arg2, Activity arg3, JagexConfig arg4) {
        super();
        this.currentStoreSubscriptions = new ArrayList();
        this.productTypeMap = new HashMap();
        this.viewListener = arg2;
        this.context = arg3.getApplicationContext();
        this.activity = arg3;
        this.isUserNotifiedOfPendingPurchase = false;
        this.unconsumedPurchases = new ArrayList();
        this.billingHandler = new BillingHandler(arg3, ((BillingWrapperListener)this));
        this.authStateWriter = new MobileAuthStateWriter(arg3.getApplicationContext());
        this.authStateManager = MobileAuthStateManager.getInstance(this.authStateWriter, arg4);
        this.jagexConfig = arg4;
        this.purchaseHistory = new PurchaseHistory(arg3);
        this.receiver = new BroadcastReceiver() {
            public void onReceive(Context arg1, Intent arg2) {
                NetworkInfo v1 = arg1.getSystemService("connectivity").getActiveNetworkInfo();
                CategoryListViewController v2 = CategoryListViewController.this;
                boolean v1_1 = v1 == null || !v1.isConnected() ? false : true;
                CategoryListViewController.access$000(v2, Boolean.valueOf(v1_1));
            }
        };
    }

    static void access$000(CategoryListViewController arg0, Boolean arg1) {
        arg0.networkUpdate(arg1);
    }

    static CategoryListViewListener access$100(CategoryListViewController arg0) {
        return arg0.viewListener;
    }

    static void access$1000(CategoryListViewController arg0, Purchase arg1, String arg2, String arg3, PendingTransactionUpdate arg4) {
        arg0.completePayment(arg1, arg2, arg3, arg4);
    }

    static void access$1100(CategoryListViewController arg0, String arg1) {
        arg0.addToKnownSubscriptions(arg1);
    }

    static void access$200(CategoryListViewController arg0, String arg1) {
        arg0.getCategories(arg1);
    }

    static List access$300(CategoryListViewController arg0, List arg1, List arg2) {
        return arg0.assignSKUItemToCategory(arg1, arg2);
    }

    static Activity access$400(CategoryListViewController arg0) {
        return arg0.activity;
    }

    static PurchaseHistory access$500(CategoryListViewController arg0) {
        return arg0.purchaseHistory;
    }

    static BillingHandler access$600(CategoryListViewController arg0) {
        return arg0.billingHandler;
    }

    static MobileAuthStateManager access$700(CategoryListViewController arg0) {
        return arg0.authStateManager;
    }

    static HashMap access$800(CategoryListViewController arg0) {
        return arg0.productTypeMap;
    }

    static void access$900(CategoryListViewController arg0, Purchase arg1, String arg2, PendingTransactionUpdate arg3) {
        arg0.sendPurchaseToServer(arg1, arg2, arg3);
    }

    private void addToKnownSubscriptions(String arg3) {
        List v0 = this.getKnownSubscriptionList();
        if(!v0.contains(arg3)) {
            v0.add(arg3);
            this.saveKnownList(v0);
        }
    }

    void applyUnconsumedPurchases(boolean arg4, PendingTransactionUpdate arg5) {
        Object v1;
        if(arg4) {
            int v4 = this.unconsumedPurchases.size();
            if(v4 == 0) {
                arg5.applyComplete();
                return;
            }
            else {
                com.jagex.mobilesdk.payments.CategoryListViewController$6 v0 = new PendingTransactionUpdate(arg5, v4) {
                    int countApplied;

                    public void applyComplete() {
                        ++this.countApplied;
                        if(this.countApplied == this.val$unconsumedSize && this.val$update != null) {
                            this.val$update.applyComplete();
                        }
                    }

                    public void applyFailed() {
                        if(this.val$update != null) {
                            this.val$update.applyFailed();
                        }
                    }

                    public void transactionsAvailable(boolean arg1) {
                    }
                };
                Iterator v4_1 = this.unconsumedPurchases.iterator();
                while(v4_1.hasNext()) {
                    Object v5 = v4_1.next();
                    v1 = this.productTypeMap.get(((Purchase)v5).getSku());
                    if(v1 != null) {
                        this.sendPurchaseToServer(((Purchase)v5), ((String)v1), ((PendingTransactionUpdate)v0));
                    }
                    else {
                        this.processUnknownType(((Purchase)v5), ((PendingTransactionUpdate)v0));
                    }
                }
            }
        }
        else {
            this.viewListener.returnToGame();
        }

        List v4_2 = this.getKnownSubscriptionList();
        ArrayList v5_1 = new ArrayList();
        Iterator v0_1 = this.currentStoreSubscriptions.iterator();
        while(v0_1.hasNext()) {
            v1 = v0_1.next();
            if(!v4_2.contains(v1)) {
                continue;
            }

            v5_1.add(v1);
        }

        this.saveKnownList(((List)v5_1));
    }

    private List assignSKUItemToCategory(List arg9, List arg10) {
        Object v5;
        Object v1;
        this.productTypeMap = new HashMap();
        Iterator v0 = arg10.iterator();
        while(v0.hasNext()) {
            v1 = v0.next();
            this.productTypeMap.put(((SkuDetails)v1).getSku(), ((SkuDetails)v1).getType());
        }

        v0 = arg9.iterator();
        while(v0.hasNext()) {
            v1 = v0.next();
            Iterator v2 = ((JagexCategory)v1).getProducts().iterator();
        label_18:
            while(v2.hasNext()) {
                Object v3 = v2.next();
                Iterator v4 = arg10.iterator();
                do {
                label_22:
                    if(!v4.hasNext()) {
                        goto label_18;
                    }

                    v5 = v4.next();
                    if(((JagexProduct)v3).getSkuItem() != null) {
                        goto label_18;
                    }

                    if(v5 == null) {
                        goto label_22;
                    }
                }
                while(!((JagexProduct)v3).getProductId().equals(((SkuDetails)v5).getSku()));

                ((JagexProduct)v3).setSkuItem(((SkuDetails)v5));
            }

            ArrayList v2_1 = new ArrayList();
            Iterator v3_1 = ((JagexCategory)v1).getProducts().iterator();
            while(v3_1.hasNext()) {
                Object v4_1 = v3_1.next();
                if(((JagexProduct)v4_1).getSkuItem() == null) {
                    continue;
                }

                ((List)v2_1).add(v4_1);
            }

            ((JagexCategory)v1).setProducts(((List)v2_1));
        }

        ArrayList v10 = new ArrayList();
        Iterator v9 = arg9.iterator();
        while(v9.hasNext()) {
            Object v0_1 = v9.next();
            if(((JagexCategory)v0_1).getProducts().size() <= 0) {
                continue;
            }

            ((List)v10).add(v0_1);
        }

        return ((List)v10);
    }

    void buyProduct(SkuDetails arg3, PendingTransactionUpdate arg4) {
        this.billingHandler.initiatePurchaseFlow(arg3, new PurchaseProductListener(arg4) {
            public void purchaseError(int arg1) {
                if(this.val$update != null) {
                    this.val$update.applyFailed();
                }
            }

            public void purchased(Purchase arg4) {
                Object v0 = CategoryListViewController.this.productTypeMap.get(arg4.getSku());
                if(v0 != null) {
                    CategoryListViewController.this.sendPurchaseToServer(arg4, ((String)v0), this.val$update);
                }
                else {
                    CategoryListViewController.this.processUnknownType(arg4, this.val$update);
                }
            }
        });
    }

    void checkNetwork() {
        try {
            this.context.unregisterReceiver(this.receiver);
            goto label_3;
        }
        catch(IllegalArgumentException ) {
        label_3:
            this.context.registerReceiver(this.receiver, Intents.getConnectivityIntentFilter());
            return;
        }
    }

    private void completePayment(Purchase arg4, String arg5, String arg6, PendingTransactionUpdate arg7) {
        if(arg6 == null) {
            this.viewListener.onDisplayMessage(R$string.ITEM_UNAVAILABLE);
            if(arg7 != null) {
                arg7.applyFailed();
            }

            return;
        }

        PaymentCompletionRequest v5 = new PaymentCompletionRequest(new PaymentPayload(arg4.getOriginalJson(), arg4.getSignature(), arg6));
        PaymentComms.completePaymentsComms(this.jagexConfig.getPaymentUri() + "/completion/" + this.jagexConfig.getShopName() + "/android", this.authStateManager.getAuthState(), v5, new CompletePaymentCallback(arg7, arg6, arg4) {
            public void onCompletePaymentResult(CommsResult arg2, Exception arg3) {
                if(arg2 == null) {
                    goto label_75;
                }

                switch(com.jagex.mobilesdk.payments.CategoryListViewController$9.$SwitchMap$com$jagex$mobilesdk$payments$model$CompletionStatus[arg2.getResultValue().getStatus().ordinal()]) {
                    case 1: {
                        goto label_41;
                    }
                    case 2: {
                        goto label_45;
                    }
                    case 3: {
                        goto label_24;
                    }
                    case 4: {
                        goto label_12;
                    }
                }

                if(this.val$update != null) {
                    this.val$update.applyFailed();
                }

                CategoryListViewController.this.viewListener.onDisplayMessage(R$string.DEVELOPER_ERROR);
                CategoryListViewController.this.viewListener.returnToGame();
                return;
            label_24:
                CategoryListViewController.this.viewListener.onDisplayMessage(R$string.ITEM_UNAVAILABLE);
                if(this.val$update != null) {
                    this.val$update.applyFailed();
                }

                if("inapp".equals(this.val$purchaseType)) {
                    CategoryListViewController.this.billingHandler.consume(this.val$purchase);
                }

                return;
            label_41:
                CategoryListViewController.this.viewListener.onDisplayMessage(R$string.ITEM_NOT_OWNED);
                goto label_45;
            label_12:
                if(this.val$update != null) {
                    this.val$update.applyFailed();
                }

                CategoryListViewController.this.viewListener.onDisplayMessage(R$string.SERVICE_UNAVAILABLE);
                CategoryListViewController.this.viewListener.returnToGame();
                return;
            label_45:
                if(this.val$update != null) {
                    this.val$update.applyComplete();
                }

                if("subs".equals(this.val$purchaseType)) {
                    CategoryListViewController.this.addToKnownSubscriptions(this.val$purchase.getPurchaseToken());
                }
                else if("inapp".equals(this.val$purchaseType)) {
                    CategoryListViewController.this.billingHandler.consume(this.val$purchase);
                }

                return;
            label_75:
                if(arg2.responseCode == 401 || arg2.responseCode == 403) {
                    CategoryListViewController.this.authStateManager.clearAuthState();
                    if(this.val$update != null) {
                        this.val$update.applyFailed();
                    }
                }
            }
        }, true);
    }

    public boolean eligibleForIntroductoryPrice() {
        return this.purchaseHistory.eligibleForIntroductoryPrice();
    }

    public boolean eligibleForTrialPurchase() {
        return this.purchaseHistory.eligibleForTrialPurchase();
    }

    private void getCategories(String arg5) {
        HashMap v0 = new HashMap();
        ((Map)v0).put("Authorization", "Bearer " + arg5);
        float v5 = this.context.getResources().getDisplayMetrics().density;
        ((Map)v0).put("Accept-Resolution", v5 + ",d=android");
        ((Map)v0).put("Accept-Language", Locale.getDefault().getLanguage());
        PaymentComms.fetchCategoriesComms(this.jagexConfig.getPaymentUri() + "shop/" + this.jagexConfig.getShopName(), this.authStateManager.getAuthState(), this.context.getResources().getDisplayMetrics().density, new FetchCategoriesCallback() {
            public void onFetchPackagesResult(CommsResult arg7, Exception arg8) {
                if(arg7 == null || arg8 != null) {
                    if(arg7.responseCode == 401) {
                        CategoryListViewController.this.authStateManager.clearAuthState();
                    }

                    CategoryListViewController.this.viewListener.onDisplayMessage(R$string.SHOP_UNAVAILABLE);
                    CategoryListViewController.this.viewListener.returnToGame();
                }
                else {
                    Object v7 = arg7.getResultValue();
                    CategoryListViewController.this.viewListener.onShopLoaded(((Shop)v7).getImageLogo(), ((Shop)v7).getImageBackground());
                    ArrayList v8 = new ArrayList();
                    Iterator v0 = ((Shop)v7).getCategories().iterator();
                label_12:
                    if(v0.hasNext()) {
                        Object v1 = v0.next();
                        ((JagexCategory)v1).setCategoryID(((int)Math.pow(2, ((double)(((JagexCategory)v1).getCategoryID() - 1)))));
                        Iterator v1_1 = ((JagexCategory)v1).getProducts().iterator();
                        while(true) {
                            if(!v1_1.hasNext()) {
                                goto label_12;
                            }

                            ((List)v8).add(v1_1.next().getProductId());
                        }
                    }
                    else {
                        CategoryListViewController.this.billingHandler.fetchAllProducts(((List)v8), new FetchProductsListener(((Shop)v7)) {
                            public void products(boolean arg2, List arg3) {
                                this.this$1.this$0.purchaseHistory.beginPurchaseHistoryQuery(new Listener(this.this$1.this$0.assignSKUItemToCategory(this.val$shop.getCategories(), arg3)) {
                                    public void purchaseHistoryQueryCompleted(boolean arg2) {
                                        this.this$2.this$1.this$0.viewListener.onCategoriesLoaded(this.val$categories);
                                        this.this$2.this$1.this$0.activity.runOnUiThread(new Runnable() {
                                            public void run() {
                                                this.this$3.this$2.this$1.this$0.queryPendingTransactions();
                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                }
            }
        }, true);
    }

    private List getKnownSubscriptionList() {
        SharedPreferences v0 = this.context.getSharedPreferences("KNOWN_NAME", 0);
        ArrayList v1 = new ArrayList();
        Set v0_1 = v0.getStringSet("KNOWN_LIST", null);
        if(v0_1 != null) {
            v1.addAll(((Collection)v0_1));
        }

        return ((List)v1);
    }

    public void getPendingTransactions() {
        this.queryPendingTransactions();
    }

    private void networkUpdate(Boolean arg3) {
        this.viewListener.onInternetStateChanged(arg3.booleanValue());
        if(arg3.booleanValue()) {
            this.authStateManager.performActionWithFreshTokens(this.activity, new AuthManagerAction() {
                public void execute(@Nullable String arg1, Exception arg2) {
                    if(arg2 != null) {
                        CategoryListViewController.this.viewListener.onDisplayMessage(R$string.SHOP_UNAVAILABLE);
                        CategoryListViewController.this.viewListener.returnToGame();
                        return;
                    }

                    CategoryListViewController.this.getCategories(arg1);
                }
            });
        }
        else {
            this.viewListener.onDisplayMessage(R$string.NO_NETWORK);
        }
    }

    public void onBillingManagerInitializeAttempt(int arg2) {
        this.viewListener.billingInitialiseAttempt(arg2);
    }

    void onDetach() {
        this.billingHandler.close();
        try {
            this.context.unregisterReceiver(this.receiver);
            return;
        }
        catch(IllegalArgumentException ) {
            return;
        }
    }

    public void onDisplayMessage(int arg2) {
        this.viewListener.onDisplayMessage(arg2);
    }

    public void onPurchaseConsumed(String arg1) {
        this.viewListener.onSuccessfulConsumption();
    }

    public boolean pendingTransactionsAvailable() {
        this.queryPendingTransactions();
        boolean v0 = this.unconsumedPurchases.size() != 0 ? true : false;
        return v0;
    }

    void processUnknownType(Purchase arg4, PendingTransactionUpdate arg5) {
        ArrayList v0 = new ArrayList();
        ((List)v0).add(arg4.getSku());
        this.billingHandler.fetchAllProducts(((List)v0), new FetchProductsListener(arg5, arg4) {
            public void products(boolean arg4, List arg5) {
                if(arg5.isEmpty()) {
                    this.val$update.applyFailed();
                    return;
                }

                Iterator v4 = arg5.iterator();
                while(v4.hasNext()) {
                    CategoryListViewController.this.sendPurchaseToServer(this.val$purchase, v4.next().getType(), this.val$update);
                }
            }
        });
    }

    public void queryPendingTransactions() {
        this.unconsumedPurchases.clear();
        this.currentStoreSubscriptions.clear();
        List v0 = this.billingHandler.queryPendingTransactions();
        if(v0 != null) {
            Iterator v0_1 = v0.iterator();
            while(v0_1.hasNext()) {
                Object v1 = v0_1.next();
                if(!this.getKnownSubscriptionList().contains(((Purchase)v1).getPurchaseToken())) {
                    this.unconsumedPurchases.add(v1);
                }

                if(((Purchase)v1).isAutoRenewing()) {
                    this.currentStoreSubscriptions.add(((Purchase)v1).getPurchaseToken());
                }

                if(this.unconsumedPurchases.size() <= 0) {
                    continue;
                }

                if(this.isUserNotifiedOfPendingPurchase) {
                    continue;
                }

                this.isUserNotifiedOfPendingPurchase = true;
                this.viewListener.onPendingPurchasesAvailable();
            }
        }
    }

    private void saveKnownList(List arg4) {
        SharedPreferences$Editor v0 = this.context.getSharedPreferences("KNOWN_NAME", 0).edit();
        HashSet v1 = new HashSet();
        ((Set)v1).addAll(((Collection)arg4));
        v0.putStringSet("KNOWN_LIST", ((Set)v1));
        v0.apply();
        v0.commit();
    }

    private void sendPurchaseToServer(Purchase arg4, String arg5, PendingTransactionUpdate arg6) {
        this.authStateManager.performActionWithFreshTokens(this.activity, new AuthManagerAction(arg6, arg4, arg5) {
            public void execute(@Nullable String arg4, Exception arg5) {
                if(arg5 != null) {
                    if(this.val$update != null) {
                        this.val$update.applyFailed();
                    }

                    CategoryListViewController.this.viewListener.returnToGame();
                    return;
                }

                CategoryListViewController.this.completePayment(this.val$purchase, arg4, this.val$skuType, this.val$update);
            }
        });
    }
}

