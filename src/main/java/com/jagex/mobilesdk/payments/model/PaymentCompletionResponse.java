package com.jagex.mobilesdk.payments.model;

public class PaymentCompletionResponse {
    private String purchaseProductId;
    private CompletionStatus status;

    public PaymentCompletionResponse() {
        super();
    }

    public String getPurchaseProductId() {
        return this.purchaseProductId;
    }

    public CompletionStatus getStatus() {
        return this.status;
    }

    public void setPurchaseProductId(String arg1) {
        this.purchaseProductId = arg1;
    }

    public void setStatus(CompletionStatus arg1) {
        this.status = arg1;
    }
}

