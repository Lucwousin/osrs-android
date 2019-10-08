package com.appsflyer;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.appsflyer.share.LinkGenerator;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class CreateOneLinkHttpTask extends OneLinkHttpTask {
    public interface ResponseListener {
        @WorkerThread void onResponse(String arg1);

        @WorkerThread void onResponseError(String arg1);
    }

    private Context ʻ;
    private boolean ʽ;
    private String ˋ;
    private String ˎ;
    private Map ˏ;
    private ResponseListener ॱ;

    public CreateOneLinkHttpTask(@NonNull String arg1, @NonNull Map arg2, AppsFlyerLib arg3, @NonNull Context arg4, boolean arg5) {
        super(arg3);
        this.ˋ = "";
        this.ʽ = false;
        this.ʽ = arg5;
        this.ʻ = arg4;
        if(this.ʻ != null) {
            this.ˋ = arg4.getPackageName();
        }
        else {
            AFLogger.afWarnLog("CreateOneLinkHttpTask: context can\'t be null");
        }

        ((OneLinkHttpTask)this).ˊ = arg1;
        this.ˎ = "-1";
        this.ˏ = arg2;
    }

    public void setListener(@NonNull ResponseListener arg1) {
        this.ॱ = arg1;
    }

    final void ˊ() {
        LinkGenerator v0 = new LinkGenerator("af_app_invites").setBaseURL(((OneLinkHttpTask)this).ˊ, AppsFlyerProperties.getInstance().getString("onelinkDomain"), this.ˋ).addParameter("af_siteid", this.ˋ).addParameters(this.ˏ);
        String v1 = AppsFlyerProperties.getInstance().getString("AppUserId");
        if(v1 != null) {
            v0.setReferrerCustomerId(v1);
        }

        this.ॱ.onResponse(v0.generateLink());
    }

    final void ˎ(HttpsURLConnection arg5) throws JSONException, IOException {
        if(this.ʽ) {
            return;
        }

        ((HttpURLConnection)arg5).setRequestMethod("POST");
        ((URLConnection)arg5).setDoInput(true);
        ((URLConnection)arg5).setDoOutput(true);
        ((URLConnection)arg5).setUseCaches(false);
        JSONObject v0 = new JSONObject();
        JSONObject v1 = new JSONObject(this.ˏ);
        v0.put("ttl", this.ˎ);
        v0.put("data", v1);
        ((URLConnection)arg5).connect();
        DataOutputStream v1_1 = new DataOutputStream(((URLConnection)arg5).getOutputStream());
        v1_1.writeBytes(v0.toString());
        ((OutputStream)v1_1).flush();
        ((OutputStream)v1_1).close();
    }

    final void ˏ(String arg5) {
        try {
            JSONObject v0_1 = new JSONObject(arg5);
            Iterator v1 = v0_1.keys();
            while(v1.hasNext()) {
                this.ॱ.onResponse(v0_1.optString(v1.next()));
            }
        }
        catch(JSONException v0) {
            goto label_14;
        }

        return;
    label_14:
        this.ॱ.onResponseError("Can\'t parse one link data");
        AFLogger.afErrorLog("Error while parsing to json ".concat(String.valueOf(arg5)), ((Throwable)v0));
    }

    final String ॱ() {
        return ServerConfigHandler.getUrl("https://%sonelink.%s/shortlink-sdk/v1") + "/" + ((OneLinkHttpTask)this).ˊ;
    }
}

