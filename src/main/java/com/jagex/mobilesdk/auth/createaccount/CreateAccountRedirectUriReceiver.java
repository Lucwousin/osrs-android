package com.jagex.mobilesdk.auth.createaccount;

import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountRedirectUriReceiver extends AppCompatActivity {
    public CreateAccountRedirectUriReceiver() {
        super();
    }

    public void onCreate(Bundle arg1) {
        super.onCreate(arg1);
        this.startActivity(CreateAccountManagementActivity.createResponseHandlingIntent(((Context)this), this.getIntent().getData()));
        this.finish();
    }
}

