package com.appsflyer;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

final class t extends OneLinkHttpTask {
    interface c {
        void ˊ(Map arg1);

        void ˏ(String arg1);
    }

    private static List ˋ;
    private c ˎ;
    private String ˏ;

    static {
        t.ˋ = Arrays.asList(new String[]{"onelink.me", "onelnk.com", "app.aflink.com"});
    }

    t(Uri arg5, AppsFlyerLib arg6) {
        super(arg6);
        if(!TextUtils.isEmpty(arg5.getHost()) && !TextUtils.isEmpty(arg5.getPath())) {
            int v6 = 0;
            Iterator v0 = t.ˋ.iterator();
            while(v0.hasNext()) {
                if(!arg5.getHost().contains(v0.next())) {
                    continue;
                }

                v6 = 1;
            }

            String[] v5 = arg5.getPath().split("/");
            if(v6 != 0 && v5.length == 3) {
                ((OneLinkHttpTask)this).ˊ = v5[1];
                this.ˏ = v5[2];
            }
        }
    }

    final void ˊ() {
        this.ˎ.ˏ("Can\'t get one link data");
    }

    final void ˋ(@NonNull c arg1) {
        this.ˎ = arg1;
    }

    final void ˎ(HttpsURLConnection arg2) throws JSONException, IOException {
        ((HttpURLConnection)arg2).setRequestMethod("GET");
    }

    final boolean ˏ() {
        if(!TextUtils.isEmpty(((OneLinkHttpTask)this).ˊ) && !TextUtils.isEmpty(this.ˏ)) {
            return 1;
        }

        return 0;
    }

    final void ˏ(String arg6) {
        try {
            HashMap v0_1 = new HashMap();
            JSONObject v1 = new JSONObject(arg6);
            Iterator v2 = v1.keys();
            while(v2.hasNext()) {
                Object v3 = v2.next();
                ((Map)v0_1).put(v3, v1.optString(((String)v3)));
            }

            this.ˎ.ˊ(((Map)v0_1));
            return;
        }
        catch(JSONException v0) {
            this.ˎ.ˏ("Can\'t parse one link data");
            AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(arg6)), ((Throwable)v0));
            return;
        }
    }

    final String ॱ() {
        return ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1") + "/" + ((OneLinkHttpTask)this).ˊ + "?id=" + this.ˏ;
    }
}

