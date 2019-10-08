package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences$Editor;
import android.os.AsyncTask;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.json.JSONObject;

final class o extends AsyncTask {
    private boolean ʻ;
    private boolean ʼ;
    private HttpURLConnection ʽ;
    Map ˊ;
    String ˋ;
    private String ˎ;
    private boolean ˏ;
    private boolean ॱ;
    private WeakReference ॱॱ;
    private URL ᐝ;

    o(Context arg3, boolean arg4) {
        super();
        this.ॱ = false;
        this.ˎ = "";
        this.ˏ = false;
        this.ॱॱ = new WeakReference(arg3);
        this.ʼ = true;
        this.ʻ = true;
        this.ॱ = arg4;
    }

    protected final Object doInBackground(Object[] arg1) {
        return this.ˋ(((String[])arg1));
    }

    protected final void onCancelled() {
    }

    protected final void onPostExecute(Object arg1) {
        this.ˋ(((String)arg1));
    }

    protected final void onPreExecute() {
        if(this.ˋ == null) {
            this.ˋ = new JSONObject(this.ˊ).toString();
        }
    }

    protected final void ˋ(String arg2) {
        if(this.ˏ) {
            AFLogger.afInfoLog("Connection error: ".concat(String.valueOf(arg2)));
            return;
        }

        AFLogger.afInfoLog("Connection call succeeded: ".concat(String.valueOf(arg2)));
    }

    protected final String ˋ(String[] arg5) {
        StringBuilder v1;
        int v5_1;
        if(this.ॱ) {
            return null;
        }

        try {
            this.ᐝ = new URL(arg5[0]);
            if(this.ʼ) {
                s.ˏ().ˊ(this.ᐝ.toString(), this.ˋ);
                v5_1 = this.ˋ.getBytes("UTF-8").length;
                v1 = new StringBuilder("call = ");
                v1.append(this.ᐝ);
                v1.append("; size = ");
                v1.append(v5_1);
                v1.append(" byte");
                String v5_2 = v5_1 > 1 ? "s" : "";
                v1.append(v5_2);
                v1.append("; body = ");
                v1.append(this.ˋ);
                a.ˋ(v1.toString());
            }

            this.ʽ = this.ᐝ.openConnection();
            this.ʽ.setReadTimeout(30000);
            this.ʽ.setConnectTimeout(30000);
            this.ʽ.setRequestMethod("POST");
            this.ʽ.setDoInput(true);
            this.ʽ.setDoOutput(true);
            this.ʽ.setRequestProperty("Content-Type", "application/json");
            OutputStream v5_3 = this.ʽ.getOutputStream();
            BufferedWriter v1_1 = new BufferedWriter(new OutputStreamWriter(v5_3, "UTF-8"));
            ((Writer)v1_1).write(this.ˋ);
            ((Writer)v1_1).flush();
            ((Writer)v1_1).close();
            v5_3.close();
            this.ʽ.connect();
            v5_1 = this.ʽ.getResponseCode();
            if(this.ʻ) {
                AppsFlyerLib.getInstance();
                this.ˎ = AppsFlyerLib.ˎ(this.ʽ);
            }

            if(this.ʼ) {
                s.ˏ().ˏ(this.ᐝ.toString(), v5_1, this.ˎ);
            }

            if(v5_1 == 200) {
                AFLogger.afInfoLog("Status 200 ok");
                Object v5_4 = this.ॱॱ.get();
                if(!this.ᐝ.toString().startsWith(ServerConfigHandler.getUrl(AppsFlyerLib.ˊ))) {
                    goto label_123;
                }

                if(v5_4 == null) {
                    goto label_123;
                }

                SharedPreferences$Editor v5_5 = AppsFlyerLib.ˎ(((Context)v5_4)).edit();
                v5_5.putBoolean("sentRegisterRequestToAF", true);
                v5_5.apply();
                AFLogger.afDebugLog("Successfully registered for Uninstall Tracking");
                goto label_123;
            }

            this.ˏ = true;
        }
        catch(Throwable v5) {
            v1 = new StringBuilder("Error while calling ");
            v1.append(this.ᐝ.toString());
            AFLogger.afErrorLog(v1.toString(), v5);
            this.ˏ = true;
        }

    label_123:
        return this.ˎ;
    }

    final HttpURLConnection ˎ() {
        return this.ʽ;
    }

    final void ˏ() {
        this.ʻ = false;
    }

    final void ॱ() {
        this.ʼ = false;
    }
}

