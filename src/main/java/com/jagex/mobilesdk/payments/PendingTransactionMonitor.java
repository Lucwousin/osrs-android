package com.jagex.mobilesdk.payments;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.jagex.mobilesdk.auth.config.JagexConfig;
import java.util.List;

public class PendingTransactionMonitor implements CategoryListViewListener {
    public enum TransactionMonitorStatus {
        public static final enum TransactionMonitorStatus AVAILABLE;
        public static final enum TransactionMonitorStatus INITIALISING;
        public static final enum TransactionMonitorStatus UNAVAILABLE;

        static {
            TransactionMonitorStatus.INITIALISING = new TransactionMonitorStatus("INITIALISING", 0);
            TransactionMonitorStatus.AVAILABLE = new TransactionMonitorStatus("AVAILABLE", 1);
            TransactionMonitorStatus.UNAVAILABLE = new TransactionMonitorStatus("UNAVAILABLE", 2);
            TransactionMonitorStatus.$VALUES = new TransactionMonitorStatus[]{TransactionMonitorStatus.INITIALISING, TransactionMonitorStatus.AVAILABLE, TransactionMonitorStatus.UNAVAILABLE};
        }

        private TransactionMonitorStatus(String arg1, int arg2) {
            super(arg1, arg2);
        }

        public static TransactionMonitorStatus valueOf(String arg1) {
            return Enum.valueOf(TransactionMonitorStatus.class, arg1);
        }

        public static TransactionMonitorStatus[] values() {
            return TransactionMonitorStatus.$VALUES.clone();
        }
    }

    final Activity activity;
    CategoryListViewController controller;
    TransactionMonitorStatus purchasesAvailable;
    final PendingTransactionUpdate updater;

    public PendingTransactionMonitor(@NonNull Activity arg2, @NonNull JagexConfig arg3, @NonNull PendingTransactionUpdate arg4) {
        super();
        this.purchasesAvailable = TransactionMonitorStatus.INITIALISING;
        this.updater = arg4;
        this.activity = arg2;
        this.controller = new CategoryListViewController(((CategoryListViewListener)this), arg2, arg3);
    }

    public void applyPendingTransactions(PendingTransactionUpdate arg3) {
        this.controller.applyUnconsumedPurchases(true, arg3);
    }

    public void billingInitialiseAttempt(int arg2) {
        if(arg2 != 0) {
            this.updater.transactionsAvailable(false);
            return;
        }

        this.activity.runOnUiThread(new Runnable() {
            public void run() {
                PendingTransactionMonitor.this.controller.checkNetwork();
                Boolean v0 = Boolean.valueOf(PendingTransactionMonitor.this.controller.pendingTransactionsAvailable());
                PendingTransactionMonitor v1 = PendingTransactionMonitor.this;
                TransactionMonitorStatus v2 = v0.booleanValue() ? TransactionMonitorStatus.AVAILABLE : TransactionMonitorStatus.UNAVAILABLE;
                v1.purchasesAvailable = v2;
                if(PendingTransactionMonitor.this.updater != null) {
                    PendingTransactionMonitor.this.updater.transactionsAvailable(v0.booleanValue());
                }
            }
        });
    }

    public void onCategoriesLoaded(List arg1) {
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
    }

    public TransactionMonitorStatus pendingTransactionsAvailable() {
        if(this.purchasesAvailable != TransactionMonitorStatus.INITIALISING) {
            TransactionMonitorStatus v0 = Boolean.valueOf(this.controller.pendingTransactionsAvailable()).booleanValue() ? TransactionMonitorStatus.AVAILABLE : TransactionMonitorStatus.UNAVAILABLE;
            this.purchasesAvailable = v0;
        }

        return this.purchasesAvailable;
    }

    public void returnToGame() {
    }
}

