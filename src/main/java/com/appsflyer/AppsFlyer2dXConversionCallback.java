package com.appsflyer;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyer2dXConversionCallback implements AppsFlyerConversionListener {
    public AppsFlyer2dXConversionCallback() {
        super();
    }

    public void onAppOpenAttribution(Map arg1) {
        this.onAppOpenAttributionNative(arg1);
    }

    public native void onAppOpenAttributionNative(Object arg1) {
    }

    public void onAttributionFailure(String arg2) {
        this.ˏ("onInstallConversionFailure", arg2);
    }

    public native void onAttributionFailureNative(Object arg1) {
    }

    public void onInstallConversionDataLoaded(Map arg1) {
        this.onInstallConversionDataLoadedNative(arg1);
    }

    public native void onInstallConversionDataLoadedNative(Object arg1) {
    }

    public void onInstallConversionFailure(String arg2) {
        this.ˏ("onAttributionFailure", arg2);
    }

    public native void onInstallConversionFailureNative(Object arg1) {
    }

    private void ˏ(String arg4, String arg5) {
        JSONObject v0;
        try {
            v0 = new JSONObject();
            v0.put("status", "failure");
            v0.put("data", arg5);
            int v5 = -1;
            int v1 = arg4.hashCode();
            if(v1 != -1390007222) {
                if(v1 != 1050716216) {
                }
                else if(arg4.equals("onInstallConversionFailure")) {
                    v5 = 0;
                }
            }
            else if(arg4.equals("onAttributionFailure")) {
                v5 = 1;
            }

            switch(v5) {
                case 0: {
                    goto label_27;
                }
                case 1: {
                    goto label_25;
                }
            }

            return;
        label_25:
            this.onAttributionFailureNative(v0);
        }
        catch(JSONException v4) {
            goto label_31;
        }

        return;
        try {
        label_27:
            this.onInstallConversionFailureNative(v0);
            return;
        }
        catch(JSONException v4) {
        label_31:
            ((Throwable)v4).printStackTrace();
            return;
        }
    }
}

