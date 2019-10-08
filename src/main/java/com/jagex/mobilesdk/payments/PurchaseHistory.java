package com.jagex.mobilesdk.payments;

import android.app.Activity;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler$BillingWrapperListener;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler$FetchProductsListener;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler$PurchaseHistoryListener;
import com.jagex.mobilesdk.payments.inappbilling.BillingHandler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class PurchaseHistory implements BillingWrapperListener {
    public interface Listener {
        void purchaseHistoryQueryCompleted(boolean arg1);
    }

    enum Status {
        public static final enum Status COMPLETED_ERROR;
        public static final enum Status COMPLETED_SUCCESS;
        public static final enum Status IN_PROGRESS;
        public static final enum Status NOT_STARTED;

        static {
            Status.NOT_STARTED = new Status("NOT_STARTED", 0);
            Status.IN_PROGRESS = new Status("IN_PROGRESS", 1);
            Status.COMPLETED_SUCCESS = new Status("COMPLETED_SUCCESS", 2);
            Status.COMPLETED_ERROR = new Status("COMPLETED_ERROR", 3);
            Status.$VALUES = new Status[]{Status.NOT_STARTED, Status.IN_PROGRESS, Status.COMPLETED_SUCCESS, Status.COMPLETED_ERROR};
        }

        private Status(String arg1, int arg2) {
            super(arg1, arg2);
        }

        public static Status valueOf(String arg1) {
            return Enum.valueOf(Status.class, arg1);
        }

        public static Status[] values() {
            return Status.$VALUES.clone();
        }
    }

    private final Activity activity;
    private BillingHandler billingHandler;
    private Listener listener;
    private final ArrayList purchaseHistory;
    private final ArrayList skuDetails;
    private Status status;

    public PurchaseHistory(Activity arg2) {
        super();
        this.purchaseHistory = new ArrayList();
        this.skuDetails = new ArrayList();
        this.status = Status.NOT_STARTED;
        this.activity = arg2;
    }

    static BillingHandler access$000(PurchaseHistory arg0) {
        return arg0.billingHandler;
    }

    static BillingHandler access$002(PurchaseHistory arg0, BillingHandler arg1) {
        arg0.billingHandler = arg1;
        return arg1;
    }

    static Activity access$100(PurchaseHistory arg0) {
        return arg0.activity;
    }

    static void access$200(PurchaseHistory arg0, Status arg1) {
        arg0.completeQuery(arg1);
    }

    static ArrayList access$300(PurchaseHistory arg0) {
        return arg0.purchaseHistory;
    }

    static void access$400(PurchaseHistory arg0) {
        arg0.querySkuDetails();
    }

    static ArrayList access$500(PurchaseHistory arg0) {
        return arg0.skuDetails;
    }

    public void beginPurchaseHistoryQuery(Listener arg3) {
        __monitor_enter(this);
        try {
            if(this.status == Status.IN_PROGRESS) {
                __monitor_exit(this);
                return;
            }

            this.status = Status.IN_PROGRESS;
            __monitor_exit(this);
        }
        catch(Throwable v3) {
            try {
            label_20:
                __monitor_exit(this);
            }
            catch(Throwable v3) {
                goto label_20;
            }

            throw v3;
        }

        this.listener = arg3;
        this.purchaseHistory.clear();
        this.skuDetails.clear();
        this.activity.runOnUiThread(new Runnable() {
            public void run() {
                if(PurchaseHistory.this.billingHandler == null) {
                    PurchaseHistory.this.billingHandler = new BillingHandler(PurchaseHistory.this.activity, PurchaseHistory.this);
                }
            }
        });
    }

    private void completeQuery(Status arg3) {
        this.status = arg3;
        if(this.listener != null) {
            Listener v0 = this.listener;
            boolean v3 = arg3 == Status.COMPLETED_SUCCESS ? true : false;
            v0.purchaseHistoryQueryCompleted(v3);
        }
    }

    public boolean eligibleForIntroductoryPrice() {
        if(this.status != Status.COMPLETED_SUCCESS) {
            return 0;
        }

        Iterator v0 = this.skuDetails.iterator();
        do {
            if(!v0.hasNext()) {
                return 1;
            }
        }
        while(v0.next().getIntroductoryPrice().isEmpty());

        return 0;
    }

    public boolean eligibleForTrialPurchase() {
        if(this.status != Status.COMPLETED_SUCCESS) {
            return 0;
        }

        Iterator v0 = this.skuDetails.iterator();
        do {
            if(!v0.hasNext()) {
                return 1;
            }
        }
        while(v0.next().getFreeTrialPeriod().isEmpty());

        return 0;
    }

    public List getSkuDetails() {
        return this.skuDetails;
    }

    public void onBillingManagerInitializeAttempt(int arg1) {
        if(arg1 == 0) {
            this.queryPurchaseHistory();
        }
        else {
            this.completeQuery(Status.COMPLETED_ERROR);
        }
    }

    public void onDisplayMessage(int arg1) {
    }

    public void onPurchaseConsumed(String arg1) {
    }

    public boolean purchaseHistoryQueryCompleted() {
        boolean v0 = this.status == Status.COMPLETED_SUCCESS || this.status == Status.COMPLETED_ERROR ? true : false;
        return v0;
    }

    private void queryPurchaseHistory() {
        this.activity.runOnUiThread(new Runnable() {
            public void run() {
                PurchaseHistory.this.billingHandler.queryPurchaseHistory("subs", new PurchaseHistoryListener() {
                    public void purchaseHistory(boolean arg2, List arg3) {
                        if(!arg2) {
                            this.this$1.this$0.completeQuery(Status.COMPLETED_ERROR);
                            return;
                        }

                        this.this$1.this$0.purchaseHistory.addAll(((Collection)arg3));
                        this.this$1.this$0.billingHandler.queryPurchaseHistory("inapp", new PurchaseHistoryListener() {
                            public void purchaseHistory(boolean arg1, List arg2) {
                                if(!arg1) {
                                    this.this$2.this$1.this$0.completeQuery(Status.COMPLETED_ERROR);
                                    return;
                                }

                                this.this$2.this$1.this$0.purchaseHistory.addAll(((Collection)arg2));
                                this.this$2.this$1.this$0.querySkuDetails();
                            }
                        });
                    }
                });
            }
        });
    }

    private void querySkuDetails() {
        if(this.status != Status.IN_PROGRESS) {
            return;
        }

        if(this.purchaseHistory.isEmpty()) {
            this.completeQuery(Status.COMPLETED_SUCCESS);
            return;
        }

        ArrayList v0 = new ArrayList(this.purchaseHistory.size());
        Iterator v1 = this.purchaseHistory.iterator();
        while(v1.hasNext()) {
            ((List)v0).add(v1.next().getSku());
        }

        this.billingHandler.fetchAllProducts(((List)v0), new FetchProductsListener() {
            public void products(boolean arg1, List arg2) {
                if(arg1) {
                    PurchaseHistory.this.skuDetails.addAll(((Collection)arg2));
                    PurchaseHistory.this.completeQuery(Status.COMPLETED_SUCCESS);
                }
                else {
                    PurchaseHistory.this.completeQuery(Status.COMPLETED_ERROR);
                }
            }
        });
    }
}

