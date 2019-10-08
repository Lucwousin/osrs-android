package com.jagex.mobilesdk.payments.model;

public enum CompletionStatus {
    public static final enum CompletionStatus ERROR;
    public static final enum CompletionStatus FAILED;
    public static final enum CompletionStatus NETWORK_ERROR;
    public static final enum CompletionStatus SUCCESS;
    public static final enum CompletionStatus SUCCESS_CUSTOMER_MISMATCH;

    static {
        CompletionStatus.SUCCESS = new CompletionStatus("SUCCESS", 0);
        CompletionStatus.SUCCESS_CUSTOMER_MISMATCH = new CompletionStatus("SUCCESS_CUSTOMER_MISMATCH", 1);
        CompletionStatus.FAILED = new CompletionStatus("FAILED", 2);
        CompletionStatus.NETWORK_ERROR = new CompletionStatus("NETWORK_ERROR", 3);
        CompletionStatus.ERROR = new CompletionStatus("ERROR", 4);
        CompletionStatus.$VALUES = new CompletionStatus[]{CompletionStatus.SUCCESS, CompletionStatus.SUCCESS_CUSTOMER_MISMATCH, CompletionStatus.FAILED, CompletionStatus.NETWORK_ERROR, CompletionStatus.ERROR};
    }

    private CompletionStatus(String arg1, int arg2) {
        super(arg1, arg2);
    }

    public static CompletionStatus valueOf(String arg1) {
        return Enum.valueOf(CompletionStatus.class, arg1);
    }

    public static CompletionStatus[] values() {
        return CompletionStatus.$VALUES.clone();
    }
}

