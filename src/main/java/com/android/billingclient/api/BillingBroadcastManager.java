package com.android.billingclient.api;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import com.android.billingclient.util.BillingHelper;

class BillingBroadcastManager {
    class com.android.billingclient.api.BillingBroadcastManager$1 {
    }

    class BillingBroadcastReceiver extends BroadcastReceiver {
        private boolean mIsRegistered;
        private final PurchasesUpdatedListener mListener;

        BillingBroadcastReceiver(BillingBroadcastManager arg1, PurchasesUpdatedListener arg2, com.android.billingclient.api.BillingBroadcastManager$1 arg3) {
            this(arg1, arg2);
        }

        private BillingBroadcastReceiver(@NonNull BillingBroadcastManager arg1, PurchasesUpdatedListener arg2) {
            BillingBroadcastManager.this = arg1;
            super();
            this.mListener = arg2;
        }

        static PurchasesUpdatedListener access$100(BillingBroadcastReceiver arg0) {
            return arg0.mListener;
        }

        public void onReceive(Context arg2, Intent arg3) {
            this.mListener.onPurchasesUpdated(BillingHelper.getResponseCodeFromIntent(arg3, "BillingBroadcastManager"), BillingHelper.extractPurchases(arg3.getExtras()));
        }

        public void register(Context arg2, IntentFilter arg3) {
            if(!this.mIsRegistered) {
                arg2.registerReceiver(BillingBroadcastManager.this.mReceiver, arg3);
                this.mIsRegistered = true;
            }
        }

        public void unRegister(Context arg2) {
            if(this.mIsRegistered) {
                arg2.unregisterReceiver(BillingBroadcastManager.this.mReceiver);
                this.mIsRegistered = false;
            }
            else {
                BillingHelper.logWarn("BillingBroadcastManager", "Receiver is not registered.");
            }
        }
    }

    private static final String ACTION = "com.android.vending.billing.PURCHASES_UPDATED";
    private static final String TAG = "BillingBroadcastManager";
    private final Context mContext;
    private final BillingBroadcastReceiver mReceiver;

    BillingBroadcastManager(Context arg2, @NonNull PurchasesUpdatedListener arg3) {
        super();
        this.mContext = arg2;
        this.mReceiver = new BillingBroadcastReceiver(this, arg3, null);
    }

    static BillingBroadcastReceiver access$200(BillingBroadcastManager arg0) {
        return arg0.mReceiver;
    }

    void destroy() {
        this.mReceiver.unRegister(this.mContext);
    }

    PurchasesUpdatedListener getListener() {
        return BillingBroadcastReceiver.access$100(this.mReceiver);
    }

    void registerReceiver() {
        this.mReceiver.register(this.mContext, new IntentFilter("com.android.vending.billing.PURCHASES_UPDATED"));
    }
}

