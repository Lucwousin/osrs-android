package com.android.billingclient.api;

import androidx.annotation.Nullable;
import java.util.List;

public interface PurchasesUpdatedListener {
    void onPurchasesUpdated(int arg1, @Nullable List arg2);
}

