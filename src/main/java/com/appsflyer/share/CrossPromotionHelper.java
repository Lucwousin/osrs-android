package com.appsflyer.share;

import android.content.Context;
import android.os.AsyncTask;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerConfigHandler;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class CrossPromotionHelper {
    final class c extends AsyncTask {
        private d ˊ;
        private WeakReference ˎ;
        private boolean ॱ;

        c(d arg1, Context arg2, boolean arg3) {
            super();
            this.ˊ = arg1;
            this.ˎ = new WeakReference(arg2);
            this.ॱ = arg3;
        }

        protected final Object doInBackground(Object[] arg1) {
            return this.ˎ(((String[])arg1));
        }

        private Void ˎ(String[] arg6) {
            int v3;
            URLConnection v2;
            String v6_1;
            Void v1 = null;
            if(this.ॱ) {
                return v1;
            }

            try {
                v6_1 = arg6[0];
                v2 = new URL(v6_1).openConnection();
                v3 = 10000;
            }
            catch(Throwable v6) {
                v2 = ((URLConnection)v1);
                goto label_68;
            }
            catch(Throwable v6) {
                v2 = ((URLConnection)v1);
                goto label_61;
            }

            try {
                v2.setConnectTimeout(v3);
                ((HttpURLConnection)v2).setInstanceFollowRedirects(false);
                v3 = ((HttpURLConnection)v2).getResponseCode();
                if(v3 == 200) {
                    AFLogger.afInfoLog("Cross promotion impressions success: ".concat(String.valueOf(v6_1)), false);
                }
                else {
                    if(v3 != 301) {
                        if(v3 == 302) {
                        }
                        else {
                            StringBuilder v0 = new StringBuilder("call to ");
                            v0.append(v6_1);
                            v0.append(" failed: ");
                            v0.append(v3);
                            AFLogger.afInfoLog(v0.toString());
                            goto label_52;
                        }
                    }

                    AFLogger.afInfoLog("Cross promotion redirection success: ".concat(String.valueOf(v6_1)), false);
                    if(this.ˊ == null) {
                        goto label_52;
                    }

                    if(this.ˎ.get() == null) {
                        goto label_52;
                    }

                    this.ˊ.ˏ(v2.getHeaderField("Location"));
                    this.ˊ.ॱ(this.ˎ.get());
                }

                goto label_52;
            }
            catch(Throwable v6) {
            }
            catch(Throwable v6) {
                try {
                label_61:
                    AFLogger.afErrorLog(v6.getMessage(), v6, true);
                    if(v2 == null) {
                        return v1;
                    }

                    goto label_65;
                }
                catch(Throwable v6) {
                }
            }

        label_68:
            if(v2 != null) {
                ((HttpURLConnection)v2).disconnect();
            }

            throw v6;
        label_52:
            if(v2 != null) {
            label_65:
                ((HttpURLConnection)v2).disconnect();
            }

            return v1;
        }
    }

    public CrossPromotionHelper() {
        super();
    }

    public static void trackAndOpenStore(Context arg1, String arg2, String arg3) {
        CrossPromotionHelper.trackAndOpenStore(arg1, arg2, arg3, null);
    }

    public static void trackAndOpenStore(Context arg3, String arg4, String arg5, Map arg6) {
        LinkGenerator v4 = CrossPromotionHelper.ˋ(arg3, arg4, arg5, arg6, ServerConfigHandler.getUrl("https://%sapp.%s"));
        if(AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, track And Open Store is disabled", true);
            return;
        }

        HashMap v0 = new HashMap();
        if(arg6 != null) {
            ((Map)v0).putAll(arg6);
        }

        ((Map)v0).put("af_campaign", arg5);
        AppsFlyerLib.getInstance().trackEvent(arg3, "af_cross_promotion", ((Map)v0));
        new c(new d(), arg3, AppsFlyerLib.getInstance().isTrackingStopped()).execute(new String[]{v4.generateLink()});
    }

    public static void trackCrossPromoteImpression(Context arg4, String arg5, String arg6) {
        if(AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
            AFLogger.afInfoLog("CustomerUserId not set, Promote Impression is disabled", true);
            return;
        }

        new c(null, null, AppsFlyerLib.getInstance().isTrackingStopped()).execute(new String[]{CrossPromotionHelper.ˋ(arg4, arg5, arg6, null, ServerConfigHandler.getUrl("https://%simpression.%s")).generateLink()});
    }

    private static LinkGenerator ˋ(Context arg2, String arg3, String arg4, Map arg5, String arg6) {
        LinkGenerator v0 = new LinkGenerator("af_cross_promotion");
        v0.ˊ(arg6).ˏ(arg3).addParameter("af_siteid", arg2.getPackageName());
        if(arg4 != null) {
            v0.setCampaign(arg4);
        }

        if(arg5 != null) {
            v0.addParameters(arg5);
        }

        String v2 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if(v2 != null) {
            v0.addParameter("advertising_id", v2);
        }

        return v0;
    }
}

