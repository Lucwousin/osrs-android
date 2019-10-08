package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Looper;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

final class j implements Runnable {
    private static String ʻ;
    private String ʼ;
    private final Intent ʽ;
    private String ˊ;
    private String ˋ;
    private String ˎ;
    private String ˏ;
    private WeakReference ॱ;
    private String ॱॱ;
    private Map ᐝ;

    static {
        StringBuilder v0 = new StringBuilder("https://%svalidate.%s/api/v");
        v0.append(AppsFlyerLib.ˏ);
        v0.append("/androidevent?buildnumber=4.9.0&app_id=");
        j.ʻ = v0.toString();
    }

    j(Context arg2, String arg3, String arg4, String arg5, String arg6, String arg7, String arg8, Map arg9, @Nullable Intent arg10) {
        super();
        this.ॱ = new WeakReference(arg2);
        this.ˏ = arg3;
        this.ˊ = arg4;
        this.ˋ = arg6;
        this.ʼ = arg7;
        this.ॱॱ = arg8;
        this.ᐝ = arg9;
        this.ˎ = arg5;
        this.ʽ = arg10;
    }

    public final void run() {
        int v0_1;
        HttpURLConnection v2_3;
        String v3_1;
        HttpURLConnection v0;
        if(this.ˏ != null) {
            if(this.ˏ.length() == 0) {
            }
            else if(AppsFlyerLib.getInstance().isTrackingStopped()) {
                return;
            }
            else {
                v0 = null;
                boolean v1 = false;
                try {
                    Object v2_1 = this.ॱ.get();
                    if(v2_1 == null) {
                        return;
                    }
                    else {
                        HashMap v3 = new HashMap();
                        ((Map)v3).put("public-key", this.ˊ);
                        ((Map)v3).put("sig-data", this.ˋ);
                        ((Map)v3).put("signature", this.ˎ);
                        HashMap v4 = new HashMap();
                        ((Map)v4).putAll(((Map)v3));
                        Executors.newSingleThreadScheduledExecutor().schedule(new Runnable(((Map)v4)) {
                            public final void run() {
                                j.ॱ(this.ˏ, this.ˊ, j.ˋ(this.ˏ), j.ˏ(this.ˏ));
                            }
                        }, 5, TimeUnit.MILLISECONDS);
                        ((Map)v3).put("dev_key", this.ˏ);
                        ((Map)v3).put("app_id", ((Context)v2_1).getPackageName());
                        ((Map)v3).put("uid", AppsFlyerLib.getInstance().getAppsFlyerUID(((Context)v2_1)));
                        ((Map)v3).put("advertiserId", AppsFlyerProperties.getInstance().getString("advertiserId"));
                        String v2_2 = new JSONObject(((Map)v3)).toString();
                        v3_1 = ServerConfigHandler.getUrl("https://%ssdk-services.%s/validate-android-signature");
                        s.ˏ().ˊ(v3_1, v2_2);
                        v2_3 = j.ॱ(v2_2, v3_1);
                        v0_1 = -1;
                        if(v2_3 != null) {
                            goto label_61;
                        }

                        goto label_72;
                    }

                    return;
                }
                catch(Throwable v1_1) {
                    goto label_113;
                }
                catch(Throwable v2) {
                    goto label_115;
                }

                try {
                label_61:
                    v0_1 = v2_3.getResponseCode();
                label_72:
                    AppsFlyerLib.getInstance();
                    String v4_1 = AppsFlyerLib.ˎ(v2_3);
                    s.ˏ().ˏ(v3_1, v0_1, v4_1);
                    JSONObject v3_2 = new JSONObject(v4_1);
                    v3_2.put("code", v0_1);
                    if(v0_1 == 200) {
                        StringBuilder v0_3 = new StringBuilder("Validate response 200 ok: ");
                        v0_3.append(v3_2.toString());
                        AFLogger.afInfoLog(v0_3.toString());
                        boolean v0_4 = v3_2.optBoolean("result") ? v3_2.getBoolean("result") : false;
                        j.ॱ(v0_4, this.ˋ, this.ʼ, this.ॱॱ, v3_2.toString());
                    }
                    else {
                        AFLogger.afInfoLog("Failed Validate request");
                        j.ॱ(false, this.ˋ, this.ʼ, this.ॱॱ, v3_2.toString());
                    }
                }
                catch(Throwable v0_2) {
                    goto label_68;
                }
                catch(Throwable v0_2) {
                    goto label_64;
                }

                if(v2_3 == null) {
                    return;
                }

                v2_3.disconnect();
                return;
                goto label_115;
            }
        }

        return;
    label_64:
        v1_1 = v0_2;
        v0 = v2_3;
    label_130:
        if(v0 != null) {
            v0.disconnect();
        }

        throw v1_1;
    label_68:
        HttpURLConnection v9 = v2_3;
        v2 = v0_2;
        v0 = v9;
        goto label_115;
    label_113:
        goto label_130;
        try {
        label_115:
            if(AppsFlyerLib.ˎ != null) {
                AFLogger.afErrorLog("Failed Validate request + ex", v2);
                j.ॱ(((boolean)v1_1), this.ˋ, this.ʼ, this.ॱॱ, v2.getMessage());
            }

            AFLogger.afErrorLog(v2.getMessage(), v2);
            if(v0 == null) {
                return;
            }
        }
        catch(Throwable v1_1) {
            goto label_113;
        }

        v0.disconnect();
    }

    static Map ˋ(j arg0) {
        return arg0.ᐝ;
    }

    static WeakReference ˏ(j arg0) {
        return arg0.ॱ;
    }

    private static HttpURLConnection ॱ(String arg5, String arg6) throws IOException {
        StringBuilder v5_1;
        Context v0 = null;
        try {
            o v1 = new o(v0, AppsFlyerLib.getInstance().isTrackingStopped());
            v1.ˋ = arg5;
            v1.ˏ();
            if(Thread.currentThread() == Looper.getMainLooper().getThread()) {
                v5_1 = new StringBuilder("Main thread detected. Calling ");
                v5_1.append(arg6);
                v5_1.append(" in a new thread.");
                AFLogger.afDebugLog(v5_1.toString());
                ((AsyncTask)v1).execute(new String[]{arg6});
            }
            else {
                v5_1 = new StringBuilder("Calling ");
                v5_1.append(arg6);
                v5_1.append(" (on current thread: ");
                v5_1.append(Thread.currentThread().toString());
                v5_1.append(" )");
                AFLogger.afDebugLog(v5_1.toString());
                v1.onPreExecute();
                v1.ˋ(v1.ˋ(new String[]{arg6}));
            }

            return v1.ˎ();
        }
        catch(Throwable v5) {
            AFLogger.afErrorLog("Could not send callStats request", v5);
            return ((HttpURLConnection)v0);
        }
    }

    static void ॱ(j arg15, Map arg16, Map arg17, WeakReference arg18) {
        int v0_5;
        HttpURLConnection v2_3;
        Object v4;
        Iterator v2_2;
        j v0 = arg15;
        if(((Reference)arg18).get() == null) {
            return;
        }

        String v1_1 = ServerConfigHandler.getUrl(j.ʻ) + ((Reference)arg18).get().getPackageName();
        SharedPreferences v10 = AppsFlyerLib.ˎ(((Reference)arg18).get());
        String v14 = null;
        String v2 = v10.getString("referrer", v14);
        if(v2 == null) {
            v2 = "";
        }

        Map v2_1 = AppsFlyerLib.getInstance().ˎ(((Reference)arg18).get(), v0.ˏ, "af_purchase", "", v2, true, v10, false, v0.ʽ, null);
        v2_1.put("price", v0.ʼ);
        v2_1.put("currency", v0.ॱॱ);
        JSONObject v3 = new JSONObject(v2_1);
        JSONObject v0_1 = new JSONObject();
        try {
            v2_2 = arg16.entrySet().iterator();
            while(v2_2.hasNext()) {
                v4 = v2_2.next();
                v0_1.put(((Map$Entry)v4).getKey(), ((Map$Entry)v4).getValue());
            }

            v3.put("receipt_data", v0_1);
        }
        catch(JSONException v0_2) {
            AFLogger.afErrorLog("Failed to build \'receipt_data\'", ((Throwable)v0_2));
        }

        if(arg17 != null) {
            v0_1 = new JSONObject();
            try {
                v2_2 = arg17.entrySet().iterator();
                while(v2_2.hasNext()) {
                    v4 = v2_2.next();
                    v0_1.put(((Map$Entry)v4).getKey(), ((Map$Entry)v4).getValue());
                }

                v3.put("extra_prms", v0_1);
            }
            catch(JSONException v0_2) {
                AFLogger.afErrorLog("Failed to build \'extra_prms\'", ((Throwable)v0_2));
            }
        }

        String v0_3 = v3.toString();
        s.ˏ().ˊ(v1_1, v0_3);
        try {
            v2_3 = j.ॱ(v0_3, v1_1);
            v0_5 = -1;
            if(v2_3 != null) {
                goto label_80;
            }

            goto label_87;
        }
        catch(Throwable v0_4) {
            goto label_117;
        }
        catch(Throwable v0_4) {
            goto label_120;
        }

        try {
        label_80:
            v0_5 = v2_3.getResponseCode();
        label_87:
            AppsFlyerLib.getInstance();
            String v3_1 = AppsFlyerLib.ˎ(v2_3);
            s.ˏ().ˏ(v1_1, v0_5, v3_1);
            JSONObject v1_2 = new JSONObject(v3_1);
            if(v0_5 == 200) {
                StringBuilder v0_6 = new StringBuilder("Validate-WH response - 200: ");
                v0_6.append(v1_2.toString());
                AFLogger.afInfoLog(v0_6.toString());
            }
            else {
                StringBuilder v3_2 = new StringBuilder("Validate-WH response failed - ");
                v3_2.append(v0_5);
                v3_2.append(": ");
                v3_2.append(v1_2.toString());
                AFLogger.afWarnLog(v3_2.toString());
            }
        }
        catch(Throwable v0_4) {
            goto label_125;
        }
        catch(Throwable v0_4) {
            goto label_85;
        }

        if(v2_3 == null) {
            return;
        }

        v2_3.disconnect();
        return;
        goto label_120;
    label_125:
        if(v2_3 != null) {
            v2_3.disconnect();
        }

        throw v0_4;
    label_85:
        HttpURLConnection v14_1 = v2_3;
        goto label_120;
    label_117:
        v2_3 = ((HttpURLConnection)v14);
        goto label_125;
        try {
        label_120:
            AFLogger.afErrorLog(v0_4.getMessage(), v0_4);
            if((((HttpURLConnection)v14)) == null) {
                return;
            }
        }
        catch(Throwable v0_4) {
            goto label_117;
        }

        ((HttpURLConnection)v14).disconnect();
    }

    private static void ॱ(boolean arg2, String arg3, String arg4, String arg5, String arg6) {
        if(AppsFlyerLib.ˎ != null) {
            StringBuilder v0 = new StringBuilder("Validate callback parameters: ");
            v0.append(arg3);
            v0.append(" ");
            v0.append(arg4);
            v0.append(" ");
            v0.append(arg5);
            AFLogger.afDebugLog(v0.toString());
            if(arg2) {
                AFLogger.afDebugLog("Validate in app purchase success: ".concat(String.valueOf(arg6)));
                AppsFlyerLib.ˎ.onValidateInApp();
                return;
            }
            else {
                AFLogger.afDebugLog("Validate in app purchase failed: ".concat(String.valueOf(arg6)));
                AppsFlyerInAppPurchaseValidatorListener v2 = AppsFlyerLib.ˎ;
                if(arg6 == null) {
                    arg6 = "Failed validating";
                }

                v2.onValidateInAppFailure(arg6);
            }
        }
    }
}

