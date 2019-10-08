package com.jagex.mobilesdk.payments.inappbilling;

import com.jagex.mobilesdk.R$string;

public class BillingMessages {
    public BillingMessages() {
        super();
    }

    public static int getErrorMessage(int arg0) {
        switch(arg0) {
            case -2: {
                goto label_21;
            }
            case -1: {
                goto label_19;
            }
            case 1: {
                goto label_17;
            }
            case 2: {
                goto label_15;
            }
            case 3: {
                goto label_13;
            }
            case 4: {
                goto label_11;
            }
            case 5: {
                goto label_9;
            }
            case 6: {
                goto label_7;
            }
            case 7: {
                goto label_5;
            }
            case 8: {
                goto label_3;
            }
        }

        return R$string.ERROR;
    label_17:
        return R$string.USER_CANCELED;
    label_19:
        return R$string.SERVICE_DISCONNECTED;
    label_3:
        return R$string.ITEM_NOT_OWNED;
    label_21:
        return R$string.FEATURE_NOT_SUPPORTED;
    label_5:
        return R$string.ITEM_ALREADY_OWNED;
    label_7:
        return R$string.ERROR;
    label_9:
        return R$string.DEVELOPER_ERROR;
    label_11:
        return R$string.ITEM_UNAVAILABLE;
    label_13:
        return R$string.BILLING_UNAVAILABLE;
    label_15:
        return R$string.SERVICE_UNAVAILABLE;
    }
}

