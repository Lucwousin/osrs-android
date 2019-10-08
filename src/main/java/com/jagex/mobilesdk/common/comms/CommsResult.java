package com.jagex.mobilesdk.common.comms;

public class CommsResult {
    public static final int RESULT_ACCOUNT_CREATION_ERROR = 1406;
    public static final int RESULT_AUTH_ERROR = 1401;
    public static final int RESULT_CANCELLED = 1402;
    public static final int RESULT_JAGEX_ACCESS_ERROR = 1403;
    public static final int RESULT_NOT_AUTHORIZED = 1404;
    public static final int RESULT_PENDING_TRANSACTIONS_AVAILABLE = 0x57F;
    public static final int RESULT_SUCCESS = 0;
    public static final int RESULT_UNKNOWN_ERROR = -1;
    public int responseCode;
    private Object resultValue;

    public CommsResult(Object arg1, int arg2) {
        super();
        this.resultValue = arg1;
        this.responseCode = arg2;
    }

    public Object getResultValue() {
        return this.resultValue;
    }
}

