package com.appsflyer;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class AFDeepLinkManager {
    protected int currentActivityHash;
    private static Uri ʽ;
    static String[] ˊ;
    private static Uri ˋ;
    private static AFDeepLinkManager ˎ;
    static final int ˏ;
    static volatile boolean ॱ;

    static {
        AFDeepLinkManager.ˏ = ((int)TimeUnit.MILLISECONDS.toMillis(1500));
        AFDeepLinkManager.ˎ = null;
        AFDeepLinkManager.ˋ = null;
        AFDeepLinkManager.ʽ = null;
    }

    private AFDeepLinkManager() {
        super();
        this.currentActivityHash = -1;
    }

    protected void collectIntentsFromActivities(Intent arg3) {
        Uri v0 = arg3 == null || !"android.intent.action.VIEW".equals(arg3.getAction()) ? null : arg3.getData();
        if(v0 != null && arg3.getData() != AFDeepLinkManager.ʽ) {
            AFDeepLinkManager.ʽ = arg3.getData();
        }
    }

    public static AFDeepLinkManager getInstance() {
        if(AFDeepLinkManager.ˎ == null) {
            AFDeepLinkManager.ˎ = new AFDeepLinkManager();
        }

        return AFDeepLinkManager.ˎ;
    }

    protected void processIntentForDeepLink(Intent arg9, Context arg10, Map arg11) {
        StringBuilder v9;
        Uri v0 = null;
        Uri v1 = arg9 == null || !"android.intent.action.VIEW".equals(arg9.getAction()) ? v0 : arg9.getData();
        if(v1 != null) {
            boolean v0_1 = AppsFlyerProperties.getInstance().getBoolean("consumeAfDeepLink", false);
            boolean v2 = (arg9.getFlags() & 0x400000) == 0 ? true : false;
            if((arg9.hasExtra("appsflyer_click_ts")) && !v0_1) {
                long v4 = arg9.getLongExtra("appsflyer_click_ts", 0);
                long v6 = AppsFlyerProperties.getInstance().getLong("appsflyer_click_consumed_ts", 0);
                if(v4 != 0 && v4 != v6) {
                    this.ˏ(arg10, arg11, v1);
                    AppsFlyerProperties.getInstance().set("appsflyer_click_consumed_ts", v4);
                    return;
                }

                v9 = new StringBuilder("skipping re-use of previously consumed deep link: ");
                v9.append(v1.toString());
                v9.append(" w/Ex: ");
                v9.append(String.valueOf(v4));
                AFLogger.afInfoLog(v9.toString());
                return;
            }

            if(!v0_1 && !v2) {
                if(this.currentActivityHash != AppsFlyerProperties.getInstance().getInt("lastActivityHash", 0)) {
                    this.ˏ(arg10, arg11, v1);
                    AppsFlyerProperties.getInstance().set("lastActivityHash", this.currentActivityHash);
                    return;
                }
                else {
                    v9 = new StringBuilder("skipping re-use of previously consumed deep link: ");
                    v9.append(v1.toString());
                    v9.append(" w/hC: ");
                    v9.append(String.valueOf(this.currentActivityHash));
                    AFLogger.afInfoLog(v9.toString());
                    return;
                }
            }

            Boolean v9_1 = Boolean.valueOf(v2);
            if(AFDeepLinkManager.ˋ != null) {
                if(!v1.equals(AFDeepLinkManager.ˋ)) {
                }
                else {
                    StringBuilder v10 = new StringBuilder("skipping re-use of previously consumed deep link: ");
                    v10.append(v1.toString());
                    String v9_2 = v9_1.booleanValue() ? " w/sT" : " w/cAPI";
                    v10.append(v9_2);
                    AFLogger.afInfoLog(v10.toString());
                    return;
                }
            }

            this.ˏ(arg10, arg11, v1);
            AFDeepLinkManager.ˋ = v1;
            return;
        }

        if(AFDeepLinkManager.ʽ != null) {
            this.ˏ(arg10, arg11, AFDeepLinkManager.ʽ);
            v9 = new StringBuilder("using trampoline Intent fallback with URI : ");
            v9.append(AFDeepLinkManager.ʽ.toString());
            AFLogger.afInfoLog(v9.toString());
            AFDeepLinkManager.ʽ = v0;
            return;
        }

        if(AppsFlyerLib.getInstance().latestDeepLink != null) {
            this.ˏ(arg10, arg11, AppsFlyerLib.getInstance().latestDeepLink);
        }
    }

    private void ˏ(Context arg7, Map arg8, Uri arg9) {
        int v0_1;
        String v0 = arg9.toString();
        if(AFDeepLinkManager.ˊ != null) {
            StringBuilder v1 = new StringBuilder("Validate ESP deeplinks : ");
            v1.append(Arrays.asList(AFDeepLinkManager.ˊ));
            AFLogger.afRDLog(v1.toString());
            if(!v0.contains("af_tranid=")) {
                Iterator v1_1 = Arrays.asList(AFDeepLinkManager.ˊ).iterator();
                while(true) {
                    if(v1_1.hasNext()) {
                        Object v3 = v1_1.next();
                        if(v0.contains("://".concat(String.valueOf(v3)))) {
                            v0_1 = 1;
                        }
                        else {
                            AFLogger.afRDLog("Validate ESP: reject ".concat(String.valueOf(v3)));
                            continue;
                        }
                    }
                    else {
                        goto label_33;
                    }

                    break;
                }
            }
            else {
                goto label_33;
            }
        }
        else {
        label_33:
            v0_1 = 0;
        }

        if(v0_1 != 0) {
            StringBuilder v0_2 = new StringBuilder("Validation ESP succeeded for: ");
            v0_2.append(arg9.toString());
            AFLogger.afRDLog(v0_2.toString());
            AFDeepLinkManager.ॱ = true;
            AFExecutor.getInstance().getSerialExecutor().execute(new Runnable(arg9, arg8, arg7) {
                public final void run() {
                    long v6;
                    HashMap v0 = new HashMap();
                    long v1 = System.currentTimeMillis();
                    Uri v4 = null;
                    try {
                        StringBuilder v5_1 = new StringBuilder("ESP deeplink resoling is started: ");
                        v5_1.append(this.ˋ.toString());
                        AFLogger.afRDLog(v5_1.toString());
                        URLConnection v5_2 = new URL(this.ˋ.toString()).openConnection();
                        ((HttpURLConnection)v5_2).setInstanceFollowRedirects(false);
                        v5_2.setReadTimeout(AFDeepLinkManager.ˏ);
                        v5_2.setConnectTimeout(AFDeepLinkManager.ˏ);
                        v5_2.setRequestProperty("User-agent", "Dalvik/2.1.0 (Linux; U; Android 6.0.1; Nexus 5 Build/M4B30Z)");
                        v5_2.connect();
                        AFLogger.afRDLog("ESP deeplink resoling is finished");
                        ((Map)v0).put("status", String.valueOf(((HttpURLConnection)v5_2).getResponseCode()));
                        if(((HttpURLConnection)v5_2).getResponseCode() >= 300 && ((HttpURLConnection)v5_2).getResponseCode() <= 305) {
                            v4 = Uri.parse(v5_2.getHeaderField("Location"));
                        }

                        v6 = System.currentTimeMillis() - v1;
                        ((HttpURLConnection)v5_2).disconnect();
                    }
                    catch(Throwable v5) {
                        ((Map)v0).put("error", v5.getLocalizedMessage());
                        ((Map)v0).put("status", "-1");
                        v6 = System.currentTimeMillis() - v1;
                        AFLogger.afErrorLog(v5.getMessage(), v5);
                    }

                    ((Map)v0).put("latency", Long.toString(v6));
                    if(v4 != null) {
                        ((Map)v0).put("res", v4.toString());
                    }
                    else {
                        ((Map)v0).put("res", "");
                    }

                    StringBuilder v1_1 = new StringBuilder("ESP deeplink results: ");
                    v1_1.append(new JSONObject(((Map)v0)).toString());
                    AFLogger.afRDLog(v1_1.toString());
                    Map v1_2 = this.ˏ;
                    __monitor_enter(v1_2);
                    try {
                        this.ˏ.put("af_deeplink_r", v0);
                        this.ˏ.put("af_deeplink", this.ˋ.toString());
                        __monitor_exit(v1_2);
                    }
                    catch(Throwable v0_1) {
                        __monitor_exit(v1_2);
                        throw v0_1;
                    }

                    AFDeepLinkManager.ॱ = false;
                    if(v4 != null) {
                    }
                    else {
                        v4 = this.ˋ;
                    }

                    AppsFlyerLib.getInstance().handleDeepLinkCallback(this.ॱ, this.ˏ, v4);
                }

                static void ॱ(Context arg2) {
                    arg2 = arg2.getApplicationContext();
                    AFLogger.afInfoLog("onBecameBackground");
                    AppsFlyerLib.getInstance().ॱ();
                    AFLogger.afInfoLog("callStatsBackground background call");
                    AppsFlyerLib.getInstance().ˏ(new WeakReference(arg2));
                    s v0 = s.ˏ();
                    if(v0.ʻ()) {
                        v0.ˊ();
                        if(arg2 != null) {
                            s.ˋ(arg2.getPackageName(), arg2.getPackageManager());
                        }

                        v0.ॱ();
                    }
                    else {
                        AFLogger.afDebugLog("RD status is OFF");
                    }

                    AFExecutor.getInstance().ˋ();
                }
            });
            return;
        }

        AppsFlyerLib.getInstance().handleDeepLinkCallback(arg7, arg8, arg9);
    }
}

