package com.android.billingclient.api;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.android.billingclient.util.BillingHelper;
import com.android.vending.billing.IInAppBillingService$Stub;
import com.android.vending.billing.IInAppBillingService;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;

class BillingClientImpl extends BillingClient {
    class com.android.billingclient.api.BillingClientImpl$1 extends BroadcastReceiver {
        com.android.billingclient.api.BillingClientImpl$1(BillingClientImpl arg1) {
            BillingClientImpl.this = arg1;
            super();
        }

        public void onReceive(Context arg3, Intent arg4) {
            PurchasesUpdatedListener v3 = BillingClientImpl.this.mBroadcastManager.getListener();
            if(v3 == null) {
                BillingHelper.logWarn("BillingClient", "PurchasesUpdatedListener is null - no way to return the response.");
                return;
            }

            v3.onPurchasesUpdated(arg4.getIntExtra("response_code_key", 6), BillingHelper.extractPurchases(arg4.getBundleExtra("response_bundle_key")));
        }
    }

    final class BillingServiceConnection implements ServiceConnection {
        private final BillingClientStateListener mListener;

        BillingServiceConnection(BillingClientImpl arg1, BillingClientStateListener arg2, com.android.billingclient.api.BillingClientImpl$1 arg3) {
            this(arg1, arg2);
        }

        private BillingServiceConnection(@NonNull BillingClientImpl arg1, BillingClientStateListener arg2) {
            BillingClientImpl.this = arg1;
            super();
            if(arg2 != null) {
                this.mListener = arg2;
                return;
            }

            throw new RuntimeException("Please specify a listener to know when init is done.");
        }

        public void onServiceConnected(ComponentName arg6, IBinder arg7) {
            BillingHelper.logVerbose("BillingClient", "Billing service connected.");
            BillingClientImpl.this.mService = Stub.asInterface(arg7);
            String v6 = BillingClientImpl.this.mApplicationContext.getPackageName();
            BillingClientImpl.this.mSubscriptionsSupported = false;
            BillingClientImpl.this.mSubscriptionUpdateSupported = false;
            BillingClientImpl.this.mIABv6Supported = false;
            IInAppBillingService v7 = null;
            try {
                int v3 = 6;
                int v1 = BillingClientImpl.this.mService.isBillingSupported(v3, v6, "subs");
                if(v1 == 0) {
                    BillingHelper.logVerbose("BillingClient", "In-app billing API version 6 with subs is supported.");
                    BillingClientImpl.this.mIABv6Supported = true;
                    BillingClientImpl.this.mSubscriptionsSupported = true;
                    BillingClientImpl.this.mSubscriptionUpdateSupported = true;
                }
                else {
                    if(BillingClientImpl.this.mService.isBillingSupported(v3, v6, "inapp") == 0) {
                        BillingHelper.logVerbose("BillingClient", "In-app billing API without subs version 6 supported.");
                        BillingClientImpl.this.mIABv6Supported = true;
                    }

                    v1 = BillingClientImpl.this.mService.isBillingSupported(5, v6, "subs");
                    if(v1 == 0) {
                        BillingHelper.logVerbose("BillingClient", "In-app billing API version 5 supported.");
                        BillingClientImpl.this.mSubscriptionUpdateSupported = true;
                        BillingClientImpl.this.mSubscriptionsSupported = true;
                        goto label_88;
                    }

                    int v4 = 3;
                    v1 = BillingClientImpl.this.mService.isBillingSupported(v4, v6, "subs");
                    if(v1 == 0) {
                        BillingHelper.logVerbose("BillingClient", "In-app billing API version 3 with subscriptions is supported.");
                        BillingClientImpl.this.mSubscriptionsSupported = true;
                        goto label_88;
                    }

                    if(BillingClientImpl.this.mIABv6Supported) {
                        v1 = 0;
                        goto label_88;
                    }

                    int v6_2 = BillingClientImpl.this.mService.isBillingSupported(v4, v6, "inapp");
                    if(v6_2 == 0) {
                        BillingHelper.logVerbose("BillingClient", "In-app billing API version 3 with in-app items is supported.");
                    }
                    else {
                        BillingHelper.logWarn("BillingClient", "Even billing API version 3 is not supported on this device.");
                    }

                    v1 = v6_2;
                }

            label_88:
                if(v1 == 0) {
                    BillingClientImpl.this.mClientState = 2;
                }
                else {
                    BillingClientImpl.this.mClientState = 0;
                    BillingClientImpl.this.mService = v7;
                }

                this.mListener.onBillingSetupFinished(v1);
            }
            catch(RemoteException v6_1) {
                BillingHelper.logWarn("BillingClient", "RemoteException while setting up in-app billing" + v6_1);
                BillingClientImpl.this.mClientState = 0;
                BillingClientImpl.this.mService = v7;
                this.mListener.onBillingSetupFinished(-1);
            }
        }

        public void onServiceDisconnected(ComponentName arg2) {
            BillingHelper.logWarn("BillingClient", "Billing service disconnected.");
            BillingClientImpl.this.mService = null;
            BillingClientImpl.this.mClientState = 0;
            this.mListener.onBillingServiceDisconnected();
        }
    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface ClientState {
        public static final int CLOSED = 3;
        public static final int CONNECTED = 2;
        public static final int CONNECTING = 1;
        public static final int DISCONNECTED;

    }

    private static final String GET_SKU_DETAILS_ITEM_LIST = "ITEM_ID_LIST";
    private static final String LIBRARY_VERSION = "1.1";
    private static final String LIBRARY_VERSION_KEY = "libraryVersion";
    private static final int MAX_SKU_DETAILS_ITEMS_PER_REQUEST = 20;
    private static final String TAG = "BillingClient";
    private final Context mApplicationContext;
    private final BillingBroadcastManager mBroadcastManager;
    private int mClientState;
    private ExecutorService mExecutorService;
    private boolean mIABv6Supported;
    private IInAppBillingService mService;
    private ServiceConnection mServiceConnection;
    private boolean mSubscriptionUpdateSupported;
    private boolean mSubscriptionsSupported;
    private final Handler mUiThreadHandler;
    private final BroadcastReceiver onPurchaseFinishedReceiver;

    @UiThread BillingClientImpl(@NonNull Context arg2, @NonNull PurchasesUpdatedListener arg3) {
        super();
        this.mClientState = 0;
        this.mUiThreadHandler = new Handler();
        this.onPurchaseFinishedReceiver = new com.android.billingclient.api.BillingClientImpl$1(this);
        this.mApplicationContext = arg2.getApplicationContext();
        this.mBroadcastManager = new BillingBroadcastManager(this.mApplicationContext, arg3);
    }

    static BillingBroadcastManager access$000(BillingClientImpl arg0) {
        return arg0.mBroadcastManager;
    }

    static boolean access$1000(BillingClientImpl arg0) {
        return arg0.mIABv6Supported;
    }

    static boolean access$1002(BillingClientImpl arg0, boolean arg1) {
        arg0.mIABv6Supported = arg1;
        return arg1;
    }

    static void access$200(BillingClientImpl arg0, Runnable arg1) {
        arg0.postToUiThread(arg1);
    }

    static void access$300(BillingClientImpl arg0, String arg1, ConsumeResponseListener arg2) {
        arg0.consumeInternal(arg1, arg2);
    }

    static PurchasesResult access$400(BillingClientImpl arg0, String arg1, boolean arg2) {
        return arg0.queryPurchasesInternal(arg1, arg2);
    }

    static IInAppBillingService access$500(BillingClientImpl arg0) {
        return arg0.mService;
    }

    static IInAppBillingService access$502(BillingClientImpl arg0, IInAppBillingService arg1) {
        arg0.mService = arg1;
        return arg1;
    }

    static int access$602(BillingClientImpl arg0, int arg1) {
        arg0.mClientState = arg1;
        return arg1;
    }

    static Context access$700(BillingClientImpl arg0) {
        return arg0.mApplicationContext;
    }

    static boolean access$802(BillingClientImpl arg0, boolean arg1) {
        arg0.mSubscriptionsSupported = arg1;
        return arg1;
    }

    static boolean access$902(BillingClientImpl arg0, boolean arg1) {
        arg0.mSubscriptionUpdateSupported = arg1;
        return arg1;
    }

    private int broadcastFailureAndReturnBillingResponse(int arg3) {
        this.mBroadcastManager.getListener().onPurchasesUpdated(arg3, null);
        return arg3;
    }

    private Bundle constructExtraParams(BillingFlowParams arg6) {
        Bundle v0 = new Bundle();
        if(arg6.getReplaceSkusProrationMode() != 0) {
            v0.putInt("prorationMode", arg6.getReplaceSkusProrationMode());
        }

        if(arg6.getAccountId() != null) {
            v0.putString("accountId", arg6.getAccountId());
        }

        if(arg6.getVrPurchaseFlow()) {
            v0.putBoolean("vr", true);
        }

        if(arg6.getOldSku() != null) {
            v0.putStringArrayList("skusToReplace", new ArrayList(Arrays.asList(new String[]{arg6.getOldSku()})));
        }

        return v0;
    }

    public void consumeAsync(String arg3, ConsumeResponseListener arg4) {
        if(!this.isReady()) {
            arg4.onConsumeResponse(-1, null);
            return;
        }

        if(TextUtils.isEmpty(((CharSequence)arg3))) {
            BillingHelper.logWarn("BillingClient", "Please provide a valid purchase token got from queryPurchases result.");
            arg4.onConsumeResponse(5, arg3);
            return;
        }

        this.executeAsync(new Runnable(arg3, arg4) {
            public void run() {
                BillingClientImpl.this.consumeInternal(this.val$purchaseToken, this.val$listener);
            }
        });
    }

    @WorkerThread private void consumeInternal(String arg5, ConsumeResponseListener arg6) {
        try {
            BillingHelper.logVerbose("BillingClient", "Consuming purchase with token: " + arg5);
            int v0_1 = this.mService.consumePurchase(3, this.mApplicationContext.getPackageName(), arg5);
            if(v0_1 == 0) {
                BillingHelper.logVerbose("BillingClient", "Successfully consumed purchase.");
                if(arg6 == null) {
                    return;
                }

                this.postToUiThread(new Runnable(arg6, v0_1, arg5) {
                    public void run() {
                        this.val$listener.onConsumeResponse(this.val$responseCode, this.val$purchaseToken);
                    }
                });
                return;
            }

            BillingHelper.logWarn("BillingClient", "Error consuming purchase with token. Response code: " + v0_1);
            this.postToUiThread(new Runnable(arg6, v0_1, arg5) {
                public void run() {
                    BillingHelper.logWarn("BillingClient", "Error consuming purchase.");
                    this.val$listener.onConsumeResponse(this.val$responseCode, this.val$purchaseToken);
                }
            });
        }
        catch(RemoteException v0) {
            this.postToUiThread(new Runnable(v0, arg6, arg5) {
                public void run() {
                    BillingHelper.logWarn("BillingClient", "Error consuming purchase; ex: " + this.val$e);
                    this.val$listener.onConsumeResponse(-1, this.val$purchaseToken);
                }
            });
        }
    }

    public void endConnection() {
        int v0 = 3;
        try {
            LocalBroadcastManager.getInstance(this.mApplicationContext).unregisterReceiver(this.onPurchaseFinishedReceiver);
            this.mBroadcastManager.destroy();
            ServiceConnection v2 = null;
            if(this.mServiceConnection != null && this.mService != null) {
                BillingHelper.logVerbose("BillingClient", "Unbinding from service.");
                this.mApplicationContext.unbindService(this.mServiceConnection);
                this.mServiceConnection = v2;
            }

            this.mService = ((IInAppBillingService)v2);
            if(this.mExecutorService == null) {
                goto label_37;
            }

            this.mExecutorService.shutdownNow();
            this.mExecutorService = ((ExecutorService)v2);
        }
        catch(Throwable v1) {
        }
        catch(Exception v1_1) {
            try {
                BillingHelper.logWarn("BillingClient", "There was an exception while ending connection: " + v1_1);
            }
            catch(Throwable v1) {
                this.mClientState = v0;
                throw v1;
            }
        }

    label_37:
        this.mClientState = v0;
    }

    private void executeAsync(Runnable arg2) {
        if(this.mExecutorService == null) {
            this.mExecutorService = Executors.newFixedThreadPool(BillingHelper.NUMBER_OF_CORES);
        }

        this.mExecutorService.submit(arg2);
    }

    private Bundle generateVrBundle() {
        Bundle v0 = new Bundle();
        v0.putBoolean("vr", true);
        return v0;
    }

    private int isBillingSupportedOnVr(String arg5) {
        try {
            if(this.mService.isBillingSupportedExtraParams(7, this.mApplicationContext.getPackageName(), arg5, this.generateVrBundle()) != 0) {
                return -2;
            }
        }
        catch(RemoteException ) {
            BillingHelper.logWarn("BillingClient", "RemoteException while checking if billing is supported; try to reconnect");
            return -1;
        }

        int v5 = 0;
        return v5;
    }

    public int isFeatureSupported(String arg5) {
        int v1 = -1;
        if(!this.isReady()) {
            return v1;
        }

        int v0 = arg5.hashCode();
        if(v0 != 0xE6D75F5F) {
            if(v0 != 0x116AE57F) {
                if(v0 != 0x48AFF111) {
                    if(v0 != 0x7674CAF6) {
                    }
                    else if(arg5.equals("subscriptions")) {
                        v1 = 0;
                    }
                }
                else if(arg5.equals("subscriptionsOnVr")) {
                    v1 = 3;
                }
            }
            else if(arg5.equals("inAppItemsOnVr")) {
                v1 = 2;
            }
        }
        else if(arg5.equals("subscriptionsUpdate")) {
            v1 = 1;
        }

        v0 = -2;
        switch(v1) {
            case 0: {
                goto label_56;
            }
            case 1: {
                goto label_52;
            }
            case 2: {
                goto label_49;
            }
            case 3: {
                goto label_46;
            }
        }

        BillingHelper.logWarn("BillingClient", "Unsupported feature: " + arg5);
        return 5;
    label_49:
        return this.isBillingSupportedOnVr("inapp");
    label_52:
        if(this.mSubscriptionUpdateSupported) {
            v0 = 0;
        }

        return v0;
    label_56:
        if(this.mSubscriptionsSupported) {
            v0 = 0;
        }

        return v0;
    label_46:
        return this.isBillingSupportedOnVr("subs");
    }

    public boolean isReady() {
        boolean v0 = this.mClientState != 2 || this.mService == null || this.mServiceConnection == null ? false : true;
        return v0;
    }

    public int launchBillingFlow(Activity arg18, BillingFlowParams arg19) {
        Bundle v4_1;
        BillingClientImpl v0 = this;
        Activity v1 = arg18;
        int v3 = -1;
        if(!this.isReady()) {
            return v0.broadcastFailureAndReturnBillingResponse(v3);
        }

        String v8 = arg19.getSkuType();
        String v2 = arg19.getSku();
        int v4 = 5;
        if(v2 == null) {
            BillingHelper.logWarn("BillingClient", "Please fix the input params. SKU can\'t be null.");
            return v0.broadcastFailureAndReturnBillingResponse(v4);
        }

        if(v8 == null) {
            BillingHelper.logWarn("BillingClient", "Please fix the input params. SkuType can\'t be null.");
            return v0.broadcastFailureAndReturnBillingResponse(v4);
        }

        int v5 = -2;
        if((v8.equals("subs")) && !v0.mSubscriptionsSupported) {
            BillingHelper.logWarn("BillingClient", "Current client doesn\'t support subscriptions.");
            return v0.broadcastFailureAndReturnBillingResponse(v5);
        }

        v4 = arg19.getOldSku() != null ? 1 : 0;
        if(v4 != 0 && !v0.mSubscriptionUpdateSupported) {
            BillingHelper.logWarn("BillingClient", "Current client doesn\'t support subscriptions update.");
            return v0.broadcastFailureAndReturnBillingResponse(v5);
        }

        if((arg19.hasExtraParams()) && !v0.mIABv6Supported) {
            BillingHelper.logWarn("BillingClient", "Current client doesn\'t support extra params for buy intent.");
            return v0.broadcastFailureAndReturnBillingResponse(v5);
        }

        try {
            BillingHelper.logVerbose("BillingClient", "Constructing buy intent for " + v2 + ", item type: " + v8);
            if(v0.mIABv6Supported) {
                Bundle v10 = v0.constructExtraParams(arg19);
                v10.putString("libraryVersion", "1.1");
                v5 = arg19.getVrPurchaseFlow() ? 7 : 6;
                v4_1 = v0.mService.getBuyIntentExtraParams(v5, v0.mApplicationContext.getPackageName(), v2, v8, null, v10);
            }
            else {
                if(v4 != 0) {
                    v4_1 = v0.mService.getBuyIntentToReplaceSkus(5, v0.mApplicationContext.getPackageName(), Arrays.asList(new String[]{arg19.getOldSku()}), v2, "subs", null);
                    goto label_111;
                }

                v4_1 = v0.mService.getBuyIntent(3, v0.mApplicationContext.getPackageName(), v2, v8, null);
            }

        label_111:
            v5 = BillingHelper.getResponseCodeFromBundle(v4_1, "BillingClient");
            if(v5 != 0) {
                BillingHelper.logWarn("BillingClient", "Unable to buy item, Error response code: " + v5);
                return v0.broadcastFailureAndReturnBillingResponse(v5);
            }

            Intent v5_1 = new Intent(((Context)v1), ProxyBillingActivity.class);
            v5_1.putExtra("BUY_INTENT", v4_1.getParcelable("BUY_INTENT"));
            v1.startActivity(v5_1);
            return 0;
        }
        catch(RemoteException ) {
            BillingHelper.logWarn("BillingClient", "RemoteException while launching launching replace subscriptions flow: ; for sku: " + v2 + "; try to reconnect");
            return v0.broadcastFailureAndReturnBillingResponse(v3);
        }
    }

    private void postToUiThread(Runnable arg2) {
        this.mUiThreadHandler.post(arg2);
    }

    public void queryPurchaseHistoryAsync(String arg2, PurchaseHistoryResponseListener arg3) {
        if(!this.isReady()) {
            arg3.onPurchaseHistoryResponse(-1, null);
            return;
        }

        this.executeAsync(new Runnable(arg2, arg3) {
            public void run() {
                BillingClientImpl.this.postToUiThread(new Runnable(BillingClientImpl.this.queryPurchasesInternal(this.val$skuType, true)) {
                    public void run() {
                        this.this$1.val$listener.onPurchaseHistoryResponse(this.val$result.getResponseCode(), this.val$result.getPurchasesList());
                    }
                });
            }
        });
    }

    public PurchasesResult queryPurchases(String arg3) {
        List v1 = null;
        if(!this.isReady()) {
            return new PurchasesResult(-1, v1);
        }

        if(TextUtils.isEmpty(((CharSequence)arg3))) {
            BillingHelper.logWarn("BillingClient", "Please provide a valid SKU type.");
            return new PurchasesResult(5, v1);
        }

        return this.queryPurchasesInternal(arg3, false);
    }

    private PurchasesResult queryPurchasesInternal(String arg17, boolean arg18) {
        Purchase v3_2;
        Bundle v2;
        BillingClientImpl v1 = this;
        String v0 = arg17;
        boolean v8 = arg18;
        BillingHelper.logVerbose("BillingClient", "Querying owned items, item type: " + v0 + "; history: " + v8);
        ArrayList v9 = new ArrayList();
        List v10 = null;
        String v6 = ((String)v10);
        do {
            if(v8) {
                try {
                    if(!v1.mIABv6Supported) {
                        BillingHelper.logWarn("BillingClient", "getPurchaseHistory is not supported on current device");
                        return new PurchasesResult(-2, v10);
                    }
                    else {
                        v2 = v1.mService.getPurchaseHistory(6, v1.mApplicationContext.getPackageName(), arg17, v6, null);
                        goto label_43;
                    label_38:
                        v2 = v1.mService.getPurchases(3, v1.mApplicationContext.getPackageName(), v0, v6);
                        goto label_43;
                    label_37:
                        goto label_164;
                    }
                }
                catch(RemoteException v0_1) {
                    goto label_37;
                }
            }
            else {
                goto label_38;
            label_164:
                BillingHelper.logWarn("BillingClient", "Got exception trying to get purchases: " + v0_1 + "; try to reconnect");
                return new PurchasesResult(-1, v10);
            }

        label_43:
            int v3_1 = 6;
            if(v2 == null) {
                BillingHelper.logWarn("BillingClient", "queryPurchases got null owned items list");
                return new PurchasesResult(v3_1, v10);
            }

            int v4 = BillingHelper.getResponseCodeFromBundle(v2, "BillingClient");
            if(v4 != 0) {
                BillingHelper.logWarn("BillingClient", "getPurchases() failed. Response code: " + v4);
                return new PurchasesResult(v4, v10);
            }

            if((v2.containsKey("INAPP_PURCHASE_ITEM_LIST")) && (v2.containsKey("INAPP_PURCHASE_DATA_LIST"))) {
                if(!v2.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                }
                else {
                    ArrayList v4_1 = v2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                    ArrayList v5 = v2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                    ArrayList v6_1 = v2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                    if(v4_1 == null) {
                        BillingHelper.logWarn("BillingClient", "Bundle returned from getPurchases() contains null SKUs list.");
                        return new PurchasesResult(v3_1, v10);
                    }
                    else if(v5 == null) {
                        BillingHelper.logWarn("BillingClient", "Bundle returned from getPurchases() contains null purchases list.");
                        return new PurchasesResult(v3_1, v10);
                    }
                    else if(v6_1 == null) {
                        BillingHelper.logWarn("BillingClient", "Bundle returned from getPurchases() contains null signatures list.");
                        return new PurchasesResult(v3_1, v10);
                    }
                    else {
                        int v11;
                        for(v11 = 0; v11 < v5.size(); ++v11) {
                            Object v12 = v5.get(v11);
                            Object v13 = v6_1.get(v11);
                            Object v14 = v4_1.get(v11);
                            BillingHelper.logVerbose("BillingClient", "Sku is owned: " + (((String)v14)));
                            try {
                                v3_2 = new Purchase(((String)v12), ((String)v13));
                            }
                            catch(JSONException v0_2) {
                                BillingHelper.logWarn("BillingClient", "Got an exception trying to decode the purchase: " + v0_2);
                                return new PurchasesResult(6, v10);
                            }

                            if(TextUtils.isEmpty(v3_2.getPurchaseToken())) {
                                BillingHelper.logWarn("BillingClient", "BUG: empty/null token!");
                            }

                            ((List)v9).add(v3_2);
                        }

                        v6 = v2.getString("INAPP_CONTINUATION_TOKEN");
                        BillingHelper.logVerbose("BillingClient", "Continuation token: " + v6);
                        if(!TextUtils.isEmpty(((CharSequence)v6))) {
                            continue;
                        }

                        break;
                    }
                }
            }

            goto label_157;
        }
        while(true);

        return new PurchasesResult(0, ((List)v9));
    label_157:
        BillingHelper.logWarn("BillingClient", "Bundle returned from getPurchases() doesn\'t contain required fields.");
        return new PurchasesResult(6, v10);
    }

    public void querySkuDetailsAsync(SkuDetailsParams arg5, SkuDetailsResponseListener arg6) {
        List v1 = null;
        if(!this.isReady()) {
            arg6.onSkuDetailsResponse(-1, v1);
            return;
        }

        String v0 = arg5.getSkuType();
        List v5 = arg5.getSkusList();
        int v3 = 5;
        if(TextUtils.isEmpty(((CharSequence)v0))) {
            BillingHelper.logWarn("BillingClient", "Please fix the input params. SKU type can\'t be empty.");
            arg6.onSkuDetailsResponse(v3, v1);
            return;
        }

        if(v5 == null) {
            BillingHelper.logWarn("BillingClient", "Please fix the input params. The list of SKUs can\'t be empty.");
            arg6.onSkuDetailsResponse(v3, v1);
            return;
        }

        this.executeAsync(new Runnable(v0, v5, arg6) {
            public void run() {
                BillingClientImpl.this.postToUiThread(new Runnable(BillingClientImpl.this.querySkuDetailsInternal(this.val$skuType, this.val$skusList)) {
                    public void run() {
                        this.this$1.val$listener.onSkuDetailsResponse(this.val$result.getResponseCode(), this.val$result.getSkuDetailsList());
                    }
                });
            }
        });
    }

    @VisibleForTesting SkuDetailsResult querySkuDetailsInternal(String arg13, List arg14) {
        SkuDetails v9;
        int v6_1;
        ArrayList v0 = new ArrayList();
        int v1 = arg14.size();
        int v3;
        for(v3 = 0; v3 < v1; v3 = v4) {
            int v4 = v3 + 20;
            int v5 = v4 > v1 ? v1 : v4;
            ArrayList v6 = new ArrayList(arg14.subList(v3, v5));
            Bundle v3_1 = new Bundle();
            v3_1.putStringArrayList("ITEM_ID_LIST", v6);
            v3_1.putString("libraryVersion", "1.1");
            List v5_1 = null;
            try {
                v3_1 = this.mService.getSkuDetails(3, this.mApplicationContext.getPackageName(), arg13, v3_1);
                v6_1 = 4;
                if(v3_1 != null) {
                    goto label_35;
                }
            }
            catch(RemoteException v13) {
                BillingHelper.logWarn("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect): " + v13);
                return new SkuDetailsResult(-1, v5_1);
            }

            BillingHelper.logWarn("BillingClient", "querySkuDetailsAsync got null sku details list");
            return new SkuDetailsResult(v6_1, v5_1);
        label_35:
            int v8 = 6;
            if(!v3_1.containsKey("DETAILS_LIST")) {
                int v13_1 = BillingHelper.getResponseCodeFromBundle(v3_1, "BillingClient");
                if(v13_1 != 0) {
                    BillingHelper.logWarn("BillingClient", "getSkuDetails() failed. Response code: " + v13_1);
                    return new SkuDetailsResult(v13_1, ((List)v0));
                }

                BillingHelper.logWarn("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                return new SkuDetailsResult(v8, ((List)v0));
            }

            ArrayList v3_2 = v3_1.getStringArrayList("DETAILS_LIST");
            if(v3_2 == null) {
                BillingHelper.logWarn("BillingClient", "querySkuDetailsAsync got null response list");
                return new SkuDetailsResult(v6_1, v5_1);
            }

            for(v6_1 = 0; v6_1 < v3_2.size(); ++v6_1) {
                Object v7 = v3_2.get(v6_1);
                try {
                    v9 = new SkuDetails(((String)v7));
                }
                catch(JSONException ) {
                    BillingHelper.logWarn("BillingClient", "Got a JSON exception trying to decode SkuDetails");
                    return new SkuDetailsResult(v8, v5_1);
                }

                BillingHelper.logVerbose("BillingClient", "Got sku details: " + v9);
                ((List)v0).add(v9);
            }
        }

        return new SkuDetailsResult(0, ((List)v0));
    }

    public void startConnection(@NonNull BillingClientStateListener arg8) {
        if(this.isReady()) {
            BillingHelper.logVerbose("BillingClient", "Service connection is valid. No need to re-initialize.");
            arg8.onBillingSetupFinished(0);
            return;
        }

        int v2 = 5;
        if(this.mClientState == 1) {
            BillingHelper.logWarn("BillingClient", "Client is already in the process of connecting to billing service.");
            arg8.onBillingSetupFinished(v2);
            return;
        }

        int v4 = 3;
        if(this.mClientState == v4) {
            BillingHelper.logWarn("BillingClient", "Client was already closed and can\'t be reused. Please create another instance.");
            arg8.onBillingSetupFinished(v2);
            return;
        }

        this.mClientState = 1;
        this.mBroadcastManager.registerReceiver();
        LocalBroadcastManager.getInstance(this.mApplicationContext).registerReceiver(this.onPurchaseFinishedReceiver, new IntentFilter("proxy_activity_response_intent_action"));
        BillingHelper.logVerbose("BillingClient", "Starting in-app billing setup.");
        this.mServiceConnection = new BillingServiceConnection(this, arg8, null);
        Intent v0 = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        v0.setPackage("com.android.vending");
        List v2_1 = this.mApplicationContext.getPackageManager().queryIntentServices(v0, 0);
        if(v2_1 != null && !v2_1.isEmpty()) {
            Object v2_2 = v2_1.get(0);
            if(((ResolveInfo)v2_2).serviceInfo != null) {
                String v5 = ((ResolveInfo)v2_2).serviceInfo.packageName;
                String v2_3 = ((ResolveInfo)v2_2).serviceInfo.name;
                if(("com.android.vending".equals(v5)) && v2_3 != null) {
                    ComponentName v6 = new ComponentName(v5, v2_3);
                    Intent v2_4 = new Intent(v0);
                    v2_4.setComponent(v6);
                    v2_4.putExtra("libraryVersion", "1.1");
                    if(this.mApplicationContext.bindService(v2_4, this.mServiceConnection, 1)) {
                        BillingHelper.logVerbose("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    else {
                        BillingHelper.logWarn("BillingClient", "Connection to Billing service is blocked.");
                        goto label_87;
                    }
                }

                BillingHelper.logWarn("BillingClient", "The device doesn\'t have valid Play Store.");
            }
        }

    label_87:
        this.mClientState = 0;
        BillingHelper.logVerbose("BillingClient", "Billing service unavailable on device.");
        arg8.onBillingSetupFinished(v4);
    }
}

