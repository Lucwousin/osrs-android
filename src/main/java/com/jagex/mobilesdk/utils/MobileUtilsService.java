package com.jagex.mobilesdk.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.jagex.mobilesdk.auth.createaccount.AuthJagexCustomTabs;

public class MobileUtilsService {
    public MobileUtilsService() {
        super();
    }

    public void openBrowser(@NonNull Activity arg3, Uri arg4) {
        Intent v0 = new AuthJagexCustomTabs(arg3.getApplicationContext()).build().intent;
        v0.setData(arg4);
        arg3.startActivity(v0);
    }
}

