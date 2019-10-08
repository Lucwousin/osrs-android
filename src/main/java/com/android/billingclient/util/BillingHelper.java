package com.android.billingclient.util;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

public final class BillingHelper {
    public static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
    public static int NUMBER_OF_CORES = 0;
    public static final String RESPONSE_BUY_INTENT = "BUY_INTENT";
    public static final String RESPONSE_CODE = "RESPONSE_CODE";
    public static final String RESPONSE_GET_SKU_DETAILS_LIST = "DETAILS_LIST";
    public static final String RESPONSE_INAPP_ITEM_LIST = "INAPP_PURCHASE_ITEM_LIST";
    private static final String RESPONSE_INAPP_PURCHASE_DATA = "INAPP_PURCHASE_DATA";
    public static final String RESPONSE_INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    private static final String RESPONSE_INAPP_SIGNATURE = "INAPP_DATA_SIGNATURE";
    public static final String RESPONSE_INAPP_SIGNATURE_LIST = "INAPP_DATA_SIGNATURE_LIST";
    private static final String TAG = "BillingHelper";

    static {
        BillingHelper.NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
    }

    public BillingHelper() {
        super();
    }

    private static Purchase extractPurchase(String arg3, String arg4) {
        Purchase v0 = null;
        if(arg3 != null) {
            if(arg4 == null) {
            }
            else {
                try {
                    v0 = new Purchase(arg3, arg4);
                }
                catch(JSONException v3) {
                    BillingHelper.logWarn("BillingHelper", "Got JSONException while parsing purchase data: " + v3);
                }

                return v0;
            }
        }

        BillingHelper.logWarn("BillingHelper", "Received a bad purchase data.");
        return v0;
    }

    public static List extractPurchases(Bundle arg5) {
        List v0 = null;
        if(arg5 == null) {
            return v0;
        }

        ArrayList v1 = arg5.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList v2 = arg5.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList v3 = new ArrayList();
        if(v1 == null || v2 == null) {
            BillingHelper.logWarn("BillingHelper", "Couldn\'t find purchase lists, trying to find single data.");
            Purchase v5_1 = BillingHelper.extractPurchase(arg5.getString("INAPP_PURCHASE_DATA"), arg5.getString("INAPP_DATA_SIGNATURE"));
            if(v5_1 == null) {
                BillingHelper.logWarn("BillingHelper", "Couldn\'t find single purchase data as well.");
                return v0;
            }

            ((List)v3).add(v5_1);
        }
        else {
            int v5;
            for(v5 = 0; v5 < ((List)v1).size(); ++v5) {
                if(v5 >= ((List)v2).size()) {
                    break;
                }

                Purchase v0_1 = BillingHelper.extractPurchase(((List)v1).get(v5), ((List)v2).get(v5));
                if(v0_1 != null) {
                    ((List)v3).add(v0_1);
                }
            }
        }

        return ((List)v3);
    }

    public static int getResponseCodeFromBundle(Bundle arg3, String arg4) {
        int v0 = 6;
        if(arg3 == null) {
            BillingHelper.logWarn(arg4, "Unexpected null bundle received!");
            return v0;
        }

        Object v3 = arg3.get("RESPONSE_CODE");
        if(v3 == null) {
            BillingHelper.logVerbose(arg4, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }

        if((v3 instanceof Integer)) {
            return ((Integer)v3).intValue();
        }

        BillingHelper.logWarn(arg4, "Unexpected type for bundle response code: " + v3.getClass().getName());
        return v0;
    }

    public static int getResponseCodeFromIntent(Intent arg0, String arg1) {
        if(arg0 == null) {
            BillingHelper.logWarn("BillingHelper", "Got null intent!");
            return 6;
        }

        return BillingHelper.getResponseCodeFromBundle(arg0.getExtras(), arg1);
    }

    public static void logVerbose(String arg1, String arg2) {
        if(Log.isLoggable(arg1, 2)) {
            Log.v(arg1, arg2);
        }
    }

    public static void logWarn(String arg1, String arg2) {
        if(Log.isLoggable(arg1, 5)) {
            Log.w(arg1, arg2);
        }
    }
}

