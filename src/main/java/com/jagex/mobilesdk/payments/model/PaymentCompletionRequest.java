package com.jagex.mobilesdk.payments.model;

public class PaymentCompletionRequest {
    public class PaymentPayload {
        private final String purchaseData;
        private final String signature;
        private final String skuType;

        public PaymentPayload(String arg1, String arg2, String arg3) {
            super();
            this.purchaseData = arg1;
            this.signature = arg2;
            this.skuType = arg3;
        }

        public String getPurchaseData() {
            return this.purchaseData;
        }

        public String getSignature() {
            return this.signature;
        }

        public String getSkuType() {
            return this.skuType;
        }
    }

    private final PaymentPayload payload;

    public PaymentCompletionRequest(PaymentPayload arg1) {
        super();
        this.payload = arg1;
    }

    public PaymentPayload getPayload() {
        return this.payload;
    }
}

