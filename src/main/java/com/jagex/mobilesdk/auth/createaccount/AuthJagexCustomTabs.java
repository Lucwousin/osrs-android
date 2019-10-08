package com.jagex.mobilesdk.auth.createaccount;

import android.content.Context;
import android.graphics.BitmapFactory$Options;
import android.graphics.BitmapFactory;
import androidx.annotation.NonNull;
import androidx.browser.customtabs.CustomTabsIntent$Builder;
import androidx.browser.customtabs.CustomTabsIntent;
import com.jagex.mobilesdk.R$drawable;

public class AuthJagexCustomTabs {
    private Builder customTab;
    private int mBrowserHeaderColor;

    public AuthJagexCustomTabs(@NonNull Context arg4) {
        super();
        this.mBrowserHeaderColor = 0xFF303030;
        this.customTab = new Builder();
        this.customTab.setToolbarColor(this.mBrowserHeaderColor);
        this.customTab.setSecondaryToolbarColor(this.mBrowserHeaderColor);
        BitmapFactory$Options v0 = new BitmapFactory$Options();
        v0.outWidth = 24;
        v0.outHeight = 24;
        v0.inScaled = true;
        this.customTab.setCloseButtonIcon(BitmapFactory.decodeResource(arg4.getResources(), R$drawable.ic_arrow_back, v0));
    }

    public CustomTabsIntent build() {
        return this.customTab.build();
    }
}

