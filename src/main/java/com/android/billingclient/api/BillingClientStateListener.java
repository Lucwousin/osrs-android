package com.android.billingclient.api;

public interface BillingClientStateListener {
    void onBillingServiceDisconnected();

    void onBillingSetupFinished(int arg1);
}

