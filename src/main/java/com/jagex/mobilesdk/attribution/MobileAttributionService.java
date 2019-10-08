package com.jagex.mobilesdk.attribution;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import java.util.HashMap;
import java.util.Map;

public final class MobileAttributionService {
    private static final String INSTALL_CONVERSION_DATA_LOADED = "af_started_first_time";

    private MobileAttributionService() {
        super();
    }

    public static void init(@NonNull Activity arg3, String arg4) {
        AppsFlyerLib.getInstance().init(arg4, new AppsFlyerConversionListener(arg3) {
            public void onAppOpenAttribution(Map arg1) {
            }

            public void onAttributionFailure(String arg1) {
            }

            public void onInstallConversionDataLoaded(Map arg3) {
                if(arg3.get("is_first_launch").equals("true")) {
                    HashMap v0 = new HashMap();
                    ((Map)v0).putAll(arg3);
                    MobileAttributionService.sendEvent(this.val$activity, "af_started_first_time", ((Map)v0));
                }
            }

            public void onInstallConversionFailure(String arg1) {
            }
        }, arg3.getApplicationContext());
        AppsFlyerLib.getInstance().setCollectIMEI(false);
        AppsFlyerLib.getInstance().setCollectAndroidID(false);
        AppsFlyerLib.getInstance().startTracking(arg3.getApplication());
        AppsFlyerLib.getInstance().trackAppLaunch(arg3.getApplicationContext(), arg4);
    }

    public static void sendEvent(@NonNull Activity arg1, @NonNull String arg2, Map arg3) {
        AppsFlyerLib.getInstance().trackEvent(arg1.getApplicationContext(), arg2, arg3);
    }

    public static void setUserID(@NonNull String arg1) {
        AppsFlyerLib.getInstance().setCustomerUserId(arg1);
    }
}

