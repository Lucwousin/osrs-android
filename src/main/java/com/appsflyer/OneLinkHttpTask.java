package com.appsflyer;

import android.text.TextUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;

public abstract class OneLinkHttpTask implements Runnable {
    public class HttpsUrlConnectionProvider {
        public HttpsUrlConnectionProvider() {
            super();
        }

        static HttpsURLConnection ॱ(String arg1) throws IOException {
            return new URL(arg1).openConnection();
        }
    }

    String ˊ;
    private HttpsUrlConnectionProvider ˋ;
    private AppsFlyerLib ॱ;

    OneLinkHttpTask(AppsFlyerLib arg1) {
        super();
        this.ॱ = arg1;
    }

    public void run() {
        StringBuilder v2_1;
        Object v1_1;
        int v2;
        String v1;
        int v0_2;
        long v0 = System.currentTimeMillis() / 1000;
        String v3 = "";
        String v4 = this.ॱ();
        AFLogger.afRDLog("oneLinkUrl: ".concat(String.valueOf(v4)));
        try {
            HttpsURLConnection v5 = HttpsUrlConnectionProvider.ॱ(v4);
            ((URLConnection)v5).addRequestProperty("content-type", "application/json");
            StringBuilder v7 = new StringBuilder();
            v7.append(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"));
            v7.append(v0);
            ((URLConnection)v5).addRequestProperty("authorization", p.ˊ(v7.toString()));
            ((URLConnection)v5).addRequestProperty("af-timestamp", String.valueOf(v0));
            ((URLConnection)v5).setReadTimeout(3000);
            ((URLConnection)v5).setConnectTimeout(3000);
            this.ˎ(v5);
            v0_2 = ((HttpURLConnection)v5).getResponseCode();
            v1 = AppsFlyerLib.ˎ(((HttpURLConnection)v5));
            v2 = 200;
            if(v0_2 != v2) {
                goto label_41;
            }
        }
        catch(Throwable v0_1) {
            v1_1 = v2;
            goto label_52;
        }

        try {
            AFLogger.afInfoLog("Status 200 ok");
            goto label_65;
        label_41:
            v2_1 = new StringBuilder("Response code = ");
            v2_1.append(v0_2);
            v2_1.append(" content = ");
            v2_1.append(v1);
            v3 = v2_1.toString();
            goto label_65;
        label_40:
        }
        catch(Throwable v0_1) {
            goto label_40;
        }

    label_52:
        AFLogger.afErrorLog("Error while calling ".concat(String.valueOf(v4)), v0_1);
        v2_1 = new StringBuilder("Error while calling ");
        v2_1.append(v4);
        v2_1.append(" stacktrace: ");
        v2_1.append(v0_1.toString());
        v3 = v2_1.toString();
    label_65:
        if(TextUtils.isEmpty(((CharSequence)v3))) {
            AFLogger.afInfoLog("Connection call succeeded: ".concat(String.valueOf(v1_1)));
            this.ˏ(((String)v1_1));
            return;
        }

        AFLogger.afWarnLog("Connection error: ".concat(String.valueOf(v3)));
        this.ˊ();
    }

    public void setConnProvider(HttpsUrlConnectionProvider arg1) {
        this.ˋ = arg1;
    }

    abstract void ˊ();

    abstract void ˎ(HttpsURLConnection arg1) throws JSONException, IOException;

    abstract void ˏ(String arg1);

    abstract String ॱ();
}

