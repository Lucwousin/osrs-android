package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender$SendIntentException;
import android.os.Bundle;
import android.os.Parcelable;
import com.android.billingclient.util.BillingHelper;

public class ProxyBillingActivity extends Activity {
    private static final int REQUEST_CODE = 100;
    static final String RESPONSE_BUNDLE = "response_bundle_key";
    static final String RESPONSE_CODE = "response_code_key";
    static final String RESPONSE_INTENT_ACTION = "proxy_activity_response_intent_action";
    private static final String TAG = "ProxyBillingActivity";

    public ProxyBillingActivity() {
        super();
    }

    private void broadcastResult(int arg3, Bundle arg4) {
        Intent v0 = new Intent("proxy_activity_response_intent_action");
        v0.putExtra("response_code_key", arg3);
        v0.putExtra("response_bundle_key", arg4);
        LocalBroadcastManager.getInstance(((Context)this)).sendBroadcast(v0);
    }

    protected void onActivityResult(int arg4, int arg5, Intent arg6) {
        super.onActivityResult(arg4, arg5, arg6);
        if(arg4 == 100) {
            arg4 = BillingHelper.getResponseCodeFromIntent(arg6, "ProxyBillingActivity");
            if(arg5 != -1 || arg4 != 0) {
                BillingHelper.logWarn("ProxyBillingActivity", "Got purchases updated result with resultCode " + arg5 + " and billing\'s responseCode: " + arg4);
            }

            Bundle v5 = arg6 == null ? null : arg6.getExtras();
            this.broadcastResult(arg4, v5);
        }
        else {
            BillingHelper.logWarn("ProxyBillingActivity", "Got onActivityResult with wrong requestCode: " + arg4 + "; skipping...");
        }

        this.finish();
    }

    protected void onCreate(Bundle arg8) {
        super.onCreate(arg8);
        BillingHelper.logVerbose("ProxyBillingActivity", "Launching Play Store billing flow");
        Parcelable v8 = this.getIntent().getParcelableExtra("BUY_INTENT");
        try {
            this.startIntentSenderForResult(((PendingIntent)v8).getIntentSender(), 100, new Intent(), 0, 0, 0);
        }
        catch(IntentSender$SendIntentException v8_1) {
            BillingHelper.logWarn("ProxyBillingActivity", "Got exception while trying to start a purchase flow: " + v8_1);
            this.broadcastResult(6, null);
            this.finish();
        }
    }
}

