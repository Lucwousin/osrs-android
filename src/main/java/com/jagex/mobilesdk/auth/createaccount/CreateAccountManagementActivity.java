package com.jagex.mobilesdk.auth.createaccount;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.jagex.mobilesdk.attribution.MobileAttributionService;
import com.jagex.mobilesdk.auth.AuthMessage;
import com.jagex.mobilesdk.auth.JagexCompatActivity;

public class CreateAccountManagementActivity extends JagexCompatActivity {
    private static final String ACCOUNT_ID_IDENTIFER = "id";
    private static final String APPS_FLYER_ACCOUNT_CREATE_CANCELLED = "af_account_creation_cancelled";
    private static final String APPS_FLYER_ACCOUNT_CREATE_COMPLETE = "af_account_creation_completed";
    static final String KEY_ACCOUNT_CREATE_STARTED = "accountCreationStarted";
    static final String KEY_ACCOUNT_CREATION_INTENT = "accountCreationIntent";
    private Intent mAccountCreationIntent;
    private boolean mCreateAccountStarted;

    public CreateAccountManagementActivity() {
        super();
        this.mCreateAccountStarted = false;
    }

    private static Intent createBaseIntent(Context arg2) {
        return new Intent(arg2, CreateAccountManagementActivity.class);
    }

    public static Intent createResponseHandlingIntent(Context arg0, Uri arg1) {
        Intent v0 = CreateAccountManagementActivity.createBaseIntent(arg0);
        v0.setData(arg1);
        v0.addFlags(0x24000000);
        return v0;
    }

    public static Intent createStartIntent(Context arg1, Intent arg2) {
        Intent v1 = CreateAccountManagementActivity.createBaseIntent(arg1);
        v1.putExtra("accountCreationIntent", ((Parcelable)arg2));
        return v1;
    }

    private void extractState(Bundle arg3) {
        if(arg3 == null) {
            this.finishWithError(1406, AuthMessage.GENERIC_ACCOUNT_CREATION_ERROR.getMessage(), null);
            return;
        }

        this.mAccountCreationIntent = arg3.getParcelable("accountCreationIntent");
        this.mCreateAccountStarted = arg3.getBoolean("accountCreationStarted", false);
    }

    private void handleAuthorizationCanceled() {
        MobileAttributionService.sendEvent(((Activity)this), "af_account_creation_cancelled", null);
        this.finish(0);
    }

    private void handleCreateAccountComplete() {
        MobileAttributionService.setUserID(this.getIntent().getData().getQueryParameter("id"));
        MobileAttributionService.sendEvent(((Activity)this), "af_account_creation_completed", null);
        this.finish(-1);
    }

    protected void onCreate(Bundle arg1) {
        super.onCreate(arg1);
        if(arg1 == null) {
            this.extractState(this.getIntent().getExtras());
        }
        else {
            this.extractState(arg1);
        }
    }

    protected void onNewIntent(Intent arg1) {
        super.onNewIntent(arg1);
        this.setIntent(arg1);
    }

    protected void onResume() {
        super.onResume();
        if(!this.mCreateAccountStarted) {
            this.startActivity(this.mAccountCreationIntent);
            this.mCreateAccountStarted = true;
            return;
        }

        if(this.getIntent().getData() != null) {
            this.handleCreateAccountComplete();
        }
        else {
            this.handleAuthorizationCanceled();
        }
    }

    protected void onSaveInstanceState(Bundle arg3) {
        super.onSaveInstanceState(arg3);
        arg3.putBoolean("accountCreationStarted", this.mCreateAccountStarted);
        arg3.putParcelable("accountCreationIntent", this.mAccountCreationIntent);
    }
}

