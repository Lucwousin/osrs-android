package com.appsflyer;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

public class ServerConfigHandler {
    public ServerConfigHandler() {
        super();
    }

    public static String getUrl(String arg3) {
        return String.format(arg3, AppsFlyerLib.getInstance().getHostPrefix(), AppsFlyerLib.getInstance().getHostName());
    }

    @Nullable static JSONObject ˋ(String arg2) {
        JSONObject v1;
        JSONObject v0 = null;
        try {
            v1 = new JSONObject(arg2);
        }
        catch(Throwable v2) {
            v1 = v0;
            goto label_19;
        }
        catch(JSONException ) {
            v1 = v0;
            goto label_27;
        }

        try {
            if(v1.optBoolean("monitor", false)) {
                s.ˏ().ˎ();
                return v1;
            }

            s.ˏ().ˋ();
            s.ˏ().ˊ();
            return v1;
        }
        catch(Throwable v2) {
        }
        catch(JSONException ) {
        label_27:
            s.ˏ().ˋ();
            s.ˏ().ˊ();
            return v1;
        }

    label_19:
        AFLogger.afErrorLog(v2.getMessage(), v2);
        s.ˏ().ˋ();
        s.ˏ().ˊ();
        return v1;
    }
}

