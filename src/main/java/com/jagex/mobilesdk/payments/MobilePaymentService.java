package com.jagex.mobilesdk.payments;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.MobileAuthStateManager;
import com.jagex.mobilesdk.auth.MobileAuthStateWriter;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import com.jagex.mobilesdk.auth.config.JagexConfigParcel;
import com.jagex.mobilesdk.payments.utils.SecurityProviderUpdate;
import java.util.HashMap;
import java.util.Map;

public class MobilePaymentService {
    public interface PendingTransactionUpdate {
        void applyComplete();

        void applyFailed();

        void transactionsAvailable(boolean arg1);
    }

    public interface ShopItemsManagerUpdate {
        void requestComplete();

        void requestFailed();

        void shopItemsManagerReady(boolean arg1);
    }

    public static final int CATEGORY_BONDS = 1;
    public static final int CATEGORY_DEFAULT = 15;
    public static final int CATEGORY_KEYS = 2;
    public static final int CATEGORY_MEMBERSHIP = 4;
    public static final int CATEGORY_RUNECOINS = 8;
    public static final int CATEGORY_SINGLEPURCHASE = 16;
    private static final String EVENT_SHOP_OPENED = "soR6cK";
    private static final String EVENT_SHOP_PAGE = "shop_page";
    static final String EXTRA_CONFIG;
    static final String PACKAGE_CONFIG;
    private static final String PACKAGE_NAME;
    static final String SELECTED_CONFIG;
    private MobileAuthStateManager authStateManager;
    private MobileAuthStateWriter authStateWriter;
    @NonNull private final JagexConfig config;
    private PendingTransactionMonitor pendingTransactions;
    private final PurchaseHistory purchaseHistory;
    private ShopItemsManager shopItemsManager;

    static {
        MobilePaymentService.PACKAGE_NAME = MobilePaymentService.class.getPackage().getName();
        MobilePaymentService.EXTRA_CONFIG = MobilePaymentService.PACKAGE_NAME + ".CONFIG";
        MobilePaymentService.PACKAGE_CONFIG = MobilePaymentService.PACKAGE_NAME + ".PACKAGEID.CONFIG";
        MobilePaymentService.SELECTED_CONFIG = MobilePaymentService.PACKAGE_NAME + ".SELECTED.CONFIG";
    }

    public MobilePaymentService(@NonNull Activity arg3, @NonNull JagexConfig arg4) {
        super();
        this.config = arg4;
        this.purchaseHistory = new PurchaseHistory(arg3);
        this.authStateWriter = new MobileAuthStateWriter(arg3.getApplicationContext());
        this.authStateManager = MobileAuthStateManager.getInstance(this.authStateWriter, arg4);
        SecurityProviderUpdate.ProviderUpdate(arg3);
    }

    static PendingTransactionMonitor access$000(MobilePaymentService arg0) {
        return arg0.pendingTransactions;
    }

    static PendingTransactionMonitor access$002(MobilePaymentService arg0, PendingTransactionMonitor arg1) {
        arg0.pendingTransactions = arg1;
        return arg1;
    }

    static JagexConfig access$100(MobilePaymentService arg0) {
        return arg0.config;
    }

    static ShopItemsManager access$200(MobilePaymentService arg0) {
        return arg0.shopItemsManager;
    }

    static ShopItemsManager access$202(MobilePaymentService arg0, ShopItemsManager arg1) {
        arg0.shopItemsManager = arg1;
        return arg1;
    }

    public void applyPendingTransactions(Activity arg2, PendingTransactionUpdate arg3) {
        if(this.pendingTransactions != null) {
            this.pendingTransactions.applyPendingTransactions(arg3);
        }
        else {
            arg2.runOnUiThread(new Runnable(arg2, arg3) {
                public void run() {
                    MobilePaymentService.this.pendingTransactions = new PendingTransactionMonitor(this.val$activity, MobilePaymentService.this.config, new PendingTransactionUpdate() {
                        public void applyComplete() {
                        }

                        public void applyFailed() {
                        }

                        public void transactionsAvailable(boolean arg2) {
                            if(arg2) {
                                this.this$1.this$0.pendingTransactions.applyPendingTransactions(this.this$1.val$update);
                            }
                            else {
                                this.this$1.val$update.applyComplete();
                            }
                        }
                    });
                }
            });
        }
    }

    public void beginPurchaseHistoryQuery() {
        this.purchaseHistory.beginPurchaseHistoryQuery(null);
    }

    public void checkForPendingTransactions(@NonNull Activity arg3, @NonNull PendingTransactionUpdate arg4) {
        if(this.pendingTransactions == null) {
            this.pendingTransactions = new PendingTransactionMonitor(arg3, this.config, arg4);
        }
        else {
            TransactionMonitorStatus v3 = this.pendingTransactions.pendingTransactionsAvailable();
            if(arg4 != null) {
                boolean v3_1 = v3 == TransactionMonitorStatus.AVAILABLE ? true : false;
                arg4.transactionsAvailable(v3_1);
            }
        }
    }

    private Intent createIntent(Activity arg5, int arg6, int arg7) {
        Bundle v0 = new Bundle();
        HashMap v1 = new HashMap();
        ((Map)v1).put("shop_page", Integer.valueOf(arg6));
        MobileAttributionService.sendEvent(arg5, "soR6cK", ((Map)v1));
        v0.putParcelable(MobilePaymentService.EXTRA_CONFIG, new JagexConfigParcel(this.config));
        v0.putInt(MobilePaymentService.PACKAGE_CONFIG, arg6);
        v0.putInt(MobilePaymentService.SELECTED_CONFIG, arg7);
        return new Intent(((Context)arg5), StoreActivity.class).addFlags(0x10000).putExtras(v0);
    }

    public boolean eligibleForIntroductoryPrice() {
        return this.purchaseHistory.eligibleForIntroductoryPrice();
    }

    public boolean eligibleForTrialPurchase() {
        return this.purchaseHistory.eligibleForTrialPurchase();
    }

    public int getCategoryCount() {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getCategoryCount();
        }

        return 0;
    }

    public String getCategoryDescription(int arg2) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getCategoryDescription(arg2);
        }

        return "";
    }

    public int getCategoryID(int arg2) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getCategoryID(arg2);
        }

        return -1;
    }

    public String getCategoryName(int arg2) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getCategoryName(arg2);
        }

        return "";
    }

    public int getIndexForCategoryID(int arg2) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getIndexForCategoryID(arg2);
        }

        return -1;
    }

    public int getIndexForCategoryName(String arg2) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getIndexForCategoryName(arg2);
        }

        return -1;
    }

    public int getProductCount(int arg2) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getProductCount(arg2);
        }

        return 0;
    }

    public String getProductCurrencyCode(int arg2, int arg3) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getProductCurrencyCode(arg2, arg3);
        }

        return "";
    }

    public String getProductFreeTrialPeriod(int arg2, int arg3) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getProductFreeTrialPeriod(arg2, arg3);
        }

        return "";
    }

    public String getProductID(int arg2, int arg3) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getProductID(arg2, arg3);
        }

        return "";
    }

    public String getProductIntroductoryPrice(int arg2, int arg3) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getProductIntroductoryPrice(arg2, arg3);
        }

        return "";
    }

    public String getProductIntroductoryPriceAsMicroUnits(int arg2, int arg3) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getProductIntroductoryPriceAsMicroUnits(arg2, arg3);
        }

        return "";
    }

    public String getProductName(int arg2, int arg3) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getProductName(arg2, arg3);
        }

        return "";
    }

    public String getProductPrice(int arg2, int arg3) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getProductPrice(arg2, arg3);
        }

        return "";
    }

    public String getProductPriceAsMicroUnits(int arg2, int arg3) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getProductPriceAsMicroUnits(arg2, arg3);
        }

        return "";
    }

    public String getProductType(int arg2, int arg3) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.getProductType(arg2, arg3);
        }

        return "";
    }

    public boolean isProductAvailable(int arg2, int arg3) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.isProductAvailable(arg2, arg3);
        }

        return 0;
    }

    public boolean isProductRecommended(int arg2, int arg3) {
        if(this.shopItemsManager != null) {
            return this.shopItemsManager.isProductRecommended(arg2, arg3);
        }

        return 0;
    }

    public void openStore(@NonNull Activity arg3) {
        arg3.startActivity(this.createIntent(arg3, 15, 1));
    }

    public void openStore(@NonNull Activity arg1, int arg2, int arg3) {
        arg1.startActivity(this.createIntent(arg1, arg2, arg3));
    }

    public boolean purchaseHistoryQueryCompleted() {
        return this.purchaseHistory.purchaseHistoryQueryCompleted();
    }

    public void purchaseShopItem(Activity arg2, String arg3, ShopItemsManagerUpdate arg4) {
        arg2.runOnUiThread(new Runnable(arg2, arg4, arg3) {
            public void run() {
                MobilePaymentService.this.shopItemsManager = new ShopItemsManager(this.val$activity, MobilePaymentService.this.config, new ShopItemsManagerUpdate() {
                    public void requestComplete() {
                        this.this$1.val$update.requestComplete();
                    }

                    public void requestFailed() {
                        this.this$1.val$update.requestFailed();
                    }

                    public void shopItemsManagerReady(boolean arg2) {
                        this.this$1.val$update.shopItemsManagerReady(arg2);
                        if(arg2) {
                            this.this$1.this$0.shopItemsManager.purchaseItem(this.this$1.val$purchaseID);
                        }
                        else {
                            this.this$1.val$update.requestFailed();
                        }
                    }
                });
            }
        });
    }

    public void requestShopData(Activity arg2, ShopItemsManagerUpdate arg3) {
        arg2.runOnUiThread(new Runnable(arg2, arg3) {
            public void run() {
                MobilePaymentService.this.shopItemsManager = new ShopItemsManager(this.val$activity, MobilePaymentService.this.config, new ShopItemsManagerUpdate() {
                    public void requestComplete() {
                        this.this$1.val$update.requestComplete();
                    }

                    public void requestFailed() {
                        this.this$1.val$update.requestFailed();
                    }

                    public void shopItemsManagerReady(boolean arg2) {
                        this.this$1.val$update.shopItemsManagerReady(arg2);
                    }
                });
            }
        });
    }
}

