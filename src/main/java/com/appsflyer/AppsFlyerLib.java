package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build$VERSION;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings$Secure;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import com.appsflyer.cache.CacheManager;
import com.appsflyer.cache.RequestCacheData;
import com.google.android.gms.common.GoogleApiAvailability;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.NetworkInterface;
import java.net.URL;
import java.net.URLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerLib implements d {
    final class com.appsflyer.AppsFlyerLib$1 implements c {
        com.appsflyer.AppsFlyerLib$1(AppsFlyerLib arg1, Map arg2, WeakReference arg3) {
            this.ˋ = arg1;
            this.ॱ = arg2;
            this.ˎ = arg3;
            super();
        }

        public final void ˊ(Map arg5) {
            Iterator v0 = arg5.keySet().iterator();
            while(v0.hasNext()) {
                Object v1 = v0.next();
                this.ॱ.put(v1, arg5.get(v1));
            }

            this.ˋ(this.ॱ);
            AppsFlyerLib.ˊ(this.ॱ);
        }

        private void ˋ(Map arg3) {
            if(this.ˎ.get() != null) {
                AppsFlyerLib.ˊ(this.ˎ.get(), "deeplinkAttribution", new JSONObject(arg3).toString());
            }
        }

        public final void ˏ(String arg2) {
            if(AppsFlyerLib.ˋ() != null) {
                this.ˋ(this.ॱ);
                AppsFlyerLib.ˋ().onAttributionFailure(arg2);
            }
        }
    }

    final class com.appsflyer.AppsFlyerLib$5 {
        static {
            com.appsflyer.AppsFlyerLib$5.ˎ = new int[EmailsCryptType.values().length];
            try {
                com.appsflyer.AppsFlyerLib$5.ˎ[EmailsCryptType.SHA1.ordinal()] = 1;
                goto label_9;
            }
            catch(NoSuchFieldError ) {
                try {
                label_9:
                    com.appsflyer.AppsFlyerLib$5.ˎ[EmailsCryptType.MD5.ordinal()] = 2;
                    goto label_14;
                }
                catch(NoSuchFieldError ) {
                    try {
                    label_14:
                        com.appsflyer.AppsFlyerLib$5.ˎ[EmailsCryptType.SHA256.ordinal()] = 3;
                        goto label_19;
                    }
                    catch(NoSuchFieldError ) {
                        try {
                        label_19:
                            com.appsflyer.AppsFlyerLib$5.ˎ[EmailsCryptType.NONE.ordinal()] = 4;
                            return;
                        }
                        catch(NoSuchFieldError ) {
                            return;
                        }
                    }
                }
            }
        }
    }

    final class a implements Runnable {
        private String ʻ;
        private boolean ʼ;
        private final String ˊ;
        private final Intent ˋ;
        private String ˎ;
        private String ˏ;
        private WeakReference ॱ;
        private String ॱॱ;
        private boolean ᐝ;

        a(AppsFlyerLib arg1, WeakReference arg2, String arg3, String arg4, String arg5, String arg6, boolean arg7, Intent arg8, String arg9, byte arg10) {
            this(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        }

        private a(AppsFlyerLib arg1, WeakReference arg2, String arg3, String arg4, String arg5, String arg6, boolean arg7, Intent arg8, String arg9) {
            this.ʽ = arg1;
            super();
            this.ॱ = arg2;
            this.ˎ = arg3;
            this.ˏ = arg4;
            this.ʻ = arg5;
            this.ॱॱ = arg6;
            this.ᐝ = true;
            this.ʼ = arg7;
            this.ˋ = arg8;
            this.ˊ = arg9;
        }

        public final void run() {
            AppsFlyerLib.ॱ(this.ʽ, this.ॱ.get(), this.ˎ, this.ˏ, this.ʻ, this.ॱॱ, this.ᐝ, this.ʼ, this.ˋ, this.ˊ);
        }
    }

    final class b implements Runnable {
        private int ˊ;
        private WeakReference ˋ;
        private Map ˎ;
        private boolean ˏ;
        private String ॱ;

        b(AppsFlyerLib arg1, String arg2, Map arg3, Context arg4, boolean arg5, int arg6, byte arg7) {
            this(arg1, arg2, arg3, arg4, arg5, arg6);
        }

        private b(AppsFlyerLib arg1, String arg2, Map arg3, Context arg4, boolean arg5, int arg6) {
            this.ʼ = arg1;
            super();
            this.ˋ = null;
            this.ॱ = arg2;
            this.ˎ = arg3;
            this.ˋ = new WeakReference(arg4);
            this.ˏ = arg5;
            this.ˊ = arg6;
        }

        public final void run() {
            String v9;
            Map v1_1;
            Object v5;
            if(this.ʼ.isTrackingStopped()) {
                return;
            }

            String v0 = null;
            if((this.ˏ) && this.ˊ <= 2 && (AppsFlyerLib.ॱ(this.ʼ))) {
                this.ˎ.put("rfr", AppsFlyerLib.ˎ(this.ʼ));
            }

            this.ˎ.putAll(new e(this.ˎ, this.ˋ.get()));
            try {
                v5 = this.ˎ.get("appsflyerKey");
                v1_1 = this.ˎ;
                __monitor_enter(v1_1);
            }
            catch(Throwable v0_1) {
                goto label_56;
            }
            catch(IOException v1) {
                goto label_59;
            }

            try {
                v9 = AFHelper.convertToJsonObject(this.ˎ).toString();
            }
            catch(Throwable v2) {
                goto label_52;
            }

            try {
                __monitor_exit(v1_1);
                goto label_35;
            }
            catch(Throwable v0_1) {
                v2 = v0_1;
                v0 = v9;
            }

            try {
            label_52:
                __monitor_exit(v1_1);
                throw v2;
            }
            catch(Throwable v0_1) {
            }
            catch(IOException v1) {
                goto label_59;
                try {
                label_35:
                    AppsFlyerLib.ॱ(this.ʼ, this.ॱ, v9, ((String)v5), this.ˋ, null, this.ˏ);
                    return;
                }
                catch(Throwable v0_1) {
                label_56:
                    AFLogger.afErrorLog(v0_1.getMessage(), v0_1);
                    return;
                }
                catch(IOException v0_2) {
                    v1 = v0_2;
                    v0 = v9;
                label_59:
                    AFLogger.afErrorLog("Exception while sending request to server. ", ((Throwable)v1));
                    if(v0 != null && this.ˋ != null && !this.ॱ.contains("&isCachedRequest=true&timeincache=")) {
                        CacheManager.getInstance().cacheRequest(new RequestCacheData(this.ॱ, v0, "4.9.0"), this.ˋ.get());
                        AFLogger.afErrorLog(((Throwable)v1).getMessage(), ((Throwable)v1));
                    }

                    return;
                }
            }
        }
    }

    final class com.appsflyer.AppsFlyerLib$c implements Runnable {
        private WeakReference ˊ;

        public com.appsflyer.AppsFlyerLib$c(AppsFlyerLib arg1, Context arg2) {
            this.ˎ = arg1;
            super();
            this.ˊ = null;
            this.ˊ = new WeakReference(arg2);
        }

        public final void run() {
            WeakReference v9;
            String v1_2;
            if(AppsFlyerLib.ˏ(this.ˎ)) {
                return;
            }

            AppsFlyerLib.ॱ(this.ˎ, System.currentTimeMillis());
            if(this.ˊ == null) {
                return;
            }

            AppsFlyerLib.ˏ(this.ˎ, true);
            try {
                v1_2 = AppsFlyerLib.ˊ("AppsFlyerKey");
                v9 = this.ˊ;
                __monitor_enter(v9);
            }
            catch(Throwable v1) {
                goto label_83;
            }
            catch(Exception v1_1) {
                goto label_73;
            }

            try {
                Iterator v10 = CacheManager.getInstance().getCachedRequests(this.ˊ.get()).iterator();
                while(true) {
                    if(!v10.hasNext()) {
                        goto label_65;
                    }

                    Object v2 = v10.next();
                    StringBuilder v3 = new StringBuilder("resending request: ");
                    v3.append(((RequestCacheData)v2).getRequestURL());
                    AFLogger.afInfoLog(v3.toString());
                    try {
                        long v3_1 = System.currentTimeMillis();
                        long v5 = Long.parseLong(((RequestCacheData)v2).getCacheKey(), 10);
                        AppsFlyerLib v7 = this.ˎ;
                        AppsFlyerLib.ॱ(v7, ((RequestCacheData)v2).getRequestURL() + "&isCachedRequest=true&timeincache=" + Long.toString((v3_1 - v5) / 1000), ((RequestCacheData)v2).getPostData(), v1_2, this.ˊ, ((RequestCacheData)v2).getCacheKey(), false);
                        continue;
                    }
                    catch(Exception v2_1) {
                        try {
                            AFLogger.afErrorLog("Failed to resend cached request", ((Throwable)v2_1));
                            continue;
                        label_65:
                            __monitor_exit(v9);
                            goto label_75;
                        }
                        catch(Throwable v1) {
                            try {
                            label_68:
                                __monitor_exit(v9);
                                throw v1;
                            }
                            catch(Throwable v1) {
                            label_83:
                                AppsFlyerLib.ˏ(this.ˎ, false);
                                throw v1;
                            }
                            catch(Exception v1_1) {
                                try {
                                label_73:
                                    AFLogger.afErrorLog("failed to check cache. ", ((Throwable)v1_1));
                                }
                                catch(Throwable v1) {
                                    goto label_83;
                                }

                            label_75:
                                AppsFlyerLib.ˏ(this.ˎ, false);
                                AppsFlyerLib.ˊ(this.ˎ).shutdown();
                                AppsFlyerLib.ˋ(this.ˎ);
                                return;
                            }
                        }
                    }
                }
            }
            catch(Throwable v1) {
                goto label_68;
            }
        }
    }

    abstract class com.appsflyer.AppsFlyerLib$d implements Runnable {
        private String ˊ;
        private AtomicInteger ˋ;
        WeakReference ˎ;
        private ScheduledExecutorService ˏ;

        com.appsflyer.AppsFlyerLib$d(AppsFlyerLib arg2, Context arg3, String arg4, ScheduledExecutorService arg5) {
            this.ॱ = arg2;
            super();
            this.ˎ = null;
            this.ˋ = new AtomicInteger(0);
            this.ˎ = new WeakReference(arg3);
            this.ˊ = arg4;
            if(arg5 == null) {
                this.ˏ = AFExecutor.getInstance().ˏ();
                return;
            }

            this.ˏ = arg5;
        }

        public void run() {
            StringBuilder v4;
            Map v0_2;
            int v0_1;
            URLConnection v6_2;
            StringBuilder v5_1;
            String v6;
            long v3;
            Object v2_1;
            if(this.ˊ != null) {
                if(this.ˊ.length() == 0) {
                }
                else if(this.ॱ.isTrackingStopped()) {
                    return;
                }
                else {
                    this.ˋ.incrementAndGet();
                    String v0 = null;
                    try {
                        v2_1 = this.ˎ.get();
                        if(v2_1 == null) {
                        }
                        else {
                            goto label_20;
                        }
                    }
                    catch(Throwable v2) {
                        goto label_205;
                    }
                    catch(Throwable v1) {
                        goto label_202;
                    }

                    this.ˋ.decrementAndGet();
                    return;
                    try {
                    label_20:
                        v3 = System.currentTimeMillis();
                        String v5 = AppsFlyerLib.ˏ(((Context)v2_1), AppsFlyerLib.ˎ(new WeakReference(v2_1)));
                        v6 = "";
                        if(v5 != null) {
                            if(!AppsFlyerLib.ˎ().contains(v5.toLowerCase())) {
                                v6 = "-".concat(String.valueOf(v5));
                            }
                            else {
                                AFLogger.afWarnLog(String.format("AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix.", v5));
                            }
                        }

                        v5_1 = new StringBuilder();
                        v5_1.append(this.ॱ());
                        v5_1.append(((Context)v2_1).getPackageName());
                        v5_1.append(v6);
                        v5_1.append("?devkey=");
                        v5_1.append(this.ˊ);
                        v5_1.append("&device_id=");
                        v5_1.append(r.ˏ(new WeakReference(v2_1)));
                        s.ˏ().ˊ(v5_1.toString(), "");
                        StringBuilder v6_1 = new StringBuilder("Calling server for attribution url: ");
                        v6_1.append(v5_1.toString());
                        com.appsflyer.h$a.ˋ(v6_1.toString());
                        v6_2 = new URL(v5_1.toString()).openConnection();
                    }
                    catch(Throwable v2) {
                        goto label_205;
                    }
                    catch(Throwable v1) {
                        goto label_202;
                    }

                    try {
                        v0 = "GET";
                        goto label_74;
                    }
                    catch(Throwable v1) {
                    }
                    catch(Throwable v1) {
                    }
                    catch(Throwable v2) {
                    }
                    catch(Throwable v2) {
                        goto label_205;
                        try {
                        label_74:
                            ((HttpURLConnection)v6_2).setRequestMethod(v0);
                            v6_2.setConnectTimeout(10000);
                            v6_2.setRequestProperty("Connection", "close");
                            v6_2.connect();
                            v0_1 = ((HttpURLConnection)v6_2).getResponseCode();
                            String v8 = AppsFlyerLib.ˎ(((HttpURLConnection)v6_2));
                            s.ˏ().ˏ(v5_1.toString(), v0_1, v8);
                            if(v0_1 != 200) {
                                goto label_176;
                            }

                            AppsFlyerLib.ˋ(((Context)v2_1), "appsflyerGetConversionDataTiming", System.currentTimeMillis() - v3);
                            com.appsflyer.h$a.ˋ("Attribution data: ".concat(String.valueOf(v8)));
                            if(v8.length() <= 0) {
                                goto label_191;
                            }

                            if(v2_1 == null) {
                                goto label_191;
                            }

                            v0_2 = AppsFlyerLib.ˎ(v8);
                            Object v3_1 = v0_2.get("iscache");
                            if(v3_1 != null && (Boolean.toString(false).equals(v3_1))) {
                                AppsFlyerLib.ˋ(((Context)v2_1), "appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }

                            if(v0_2.containsKey("af_siteid")) {
                                if(v0_2.containsKey("af_channel")) {
                                    v4 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                    v4.append(v0_2.get("af_channel"));
                                    AFLogger.afDebugLog(v4.toString());
                                }
                                else {
                                    AFLogger.afDebugLog(String.format("[CrossPromotion] App was installed via %s\'s Cross Promotion", v0_2.get("af_siteid")));
                                }
                            }

                            if(v0_2.containsKey("af_siteid")) {
                                v4 = new StringBuilder("[Invite] Detected App-Invite via channel: ");
                                v4.append(v0_2.get("af_channel"));
                                AFLogger.afDebugLog(v4.toString());
                            }

                            v0_2.put("is_first_launch", Boolean.toString(false));
                            String v4_1 = new JSONObject(v0_2).toString();
                            if(v4_1 != null) {
                                AppsFlyerLib.ˊ(((Context)v2_1), "attributionId", v4_1);
                            }
                            else {
                                AppsFlyerLib.ˊ(((Context)v2_1), "attributionId", v8);
                            }

                            v4 = new StringBuilder("iscache=");
                            v4.append(((String)v3_1));
                            v4.append(" caching conversion data");
                            AFLogger.afDebugLog(v4.toString());
                            if(AppsFlyerLib.ˋ() == null) {
                                goto label_191;
                            }

                            if(this.ˋ.intValue() > 1) {
                                goto label_191;
                            }
                        }
                        catch(Throwable v2) {
                            goto label_199;
                        }
                        catch(Throwable v1) {
                            goto label_197;
                        }

                        try {
                            v0_2 = AppsFlyerLib.ˏ(((Context)v2_1));
                            goto label_174;
                        }
                        catch(Throwable v1) {
                        }
                        catch(Throwable v2) {
                        }
                        catch(k v2_2) {
                            try {
                                AFLogger.afErrorLog("Exception while trying to fetch attribution data. ", ((Throwable)v2_2));
                            label_174:
                                this.ˋ(v0_2);
                                goto label_191;
                            label_176:
                                if(AppsFlyerLib.ˋ() != null) {
                                    this.ॱ("Error connection to server: ".concat(String.valueOf(v0_1)), v0_1);
                                }

                                StringBuilder v2_3 = new StringBuilder("AttributionIdFetcher response code: ");
                                v2_3.append(v0_1);
                                v2_3.append("  url: ");
                                v2_3.append(v5_1);
                                com.appsflyer.h$a.ˋ(v2_3.toString());
                                goto label_191;
                            }
                            catch(Throwable v1) {
                            label_197:
                            }
                            catch(Throwable v2) {
                            label_199:
                                URLConnection v0_3 = v6_2;
                                try {
                                label_205:
                                    if(AppsFlyerLib.ˋ() != null) {
                                        this.ॱ(v2.getMessage(), 0);
                                    }

                                    AFLogger.afErrorLog(v2.getMessage(), v2);
                                }
                                catch(Throwable v1) {
                                label_202:
                                    v6 = v0;
                                    goto label_218;
                                }

                                this.ˋ.decrementAndGet();
                                if(v0 == null) {
                                    goto label_215;
                                }

                                ((HttpURLConnection)v0).disconnect();
                                goto label_215;
                            }
                        }
                    }

                label_218:
                    this.ˋ.decrementAndGet();
                    if(v6_2 != null) {
                        ((HttpURLConnection)v6_2).disconnect();
                    }

                    throw v1;
                label_191:
                    this.ˋ.decrementAndGet();
                    if(v6_2 != null) {
                        ((HttpURLConnection)v6_2).disconnect();
                    }

                label_215:
                    this.ˏ.shutdown();
                    return;
                }
            }
        }

        protected abstract void ˋ(Map arg1);

        public abstract String ॱ();

        protected abstract void ॱ(String arg1, int arg2);
    }

    final class com.appsflyer.AppsFlyerLib$e extends com.appsflyer.AppsFlyerLib$d {
        public com.appsflyer.AppsFlyerLib$e(AppsFlyerLib arg1, Context arg2, String arg3, ScheduledExecutorService arg4) {
            this.ˊ = arg1;
            super(arg1, arg2, arg3, arg4);
        }

        protected final void ˋ(Map arg3) {
            arg3.put("is_first_launch", Boolean.toString(true));
            AppsFlyerLib.ˋ().onInstallConversionDataLoaded(arg3);
            AppsFlyerLib.ˎ(((com.appsflyer.AppsFlyerLib$d)this).ˎ.get(), "appsflyerConversionDataRequestRetries", 0);
        }

        public final String ॱ() {
            return ServerConfigHandler.getUrl("https://%sapi.%s/install_data/v3/");
        }

        protected final void ॱ(String arg2, int arg3) {
            AppsFlyerLib.ˋ().onInstallConversionFailure(arg2);
            if(arg3 >= 400 && arg3 < 500) {
                AppsFlyerLib.ˎ(((com.appsflyer.AppsFlyerLib$d)this).ˎ.get(), "appsflyerConversionDataRequestRetries", AppsFlyerLib.ˎ(((com.appsflyer.AppsFlyerLib$d)this).ˎ.get()).getInt("appsflyerConversionDataRequestRetries", 0) + 1);
            }
        }
    }

    public static final String AF_PRE_INSTALL_PATH = "AF_PRE_INSTALL_PATH";
    public static final String ATTRIBUTION_ID_COLUMN_NAME = "aid";
    public static final String ATTRIBUTION_ID_CONTENT_URI = "content://com.facebook.katana.provider.AttributionIdProvider";
    public static final String IS_STOP_TRACKING_USED = "is_stop_tracking_used";
    public static final String LOG_TAG = "AppsFlyer_4.9.0";
    public static final String PRE_INSTALL_SYSTEM_DEFAULT = "/data/local/tmp/pre_install.appsflyer";
    public static final String PRE_INSTALL_SYSTEM_DEFAULT_ETC = "/etc/pre_install.appsflyer";
    public static final String PRE_INSTALL_SYSTEM_RO_PROP = "ro.appsflyer.preinstall.path";
    protected Uri latestDeepLink;
    private static String ʻ;
    private static AppsFlyerTrackingRequestListener ʻॱ;
    private static String ʼ;
    private static AppsFlyerLib ʼॱ;
    private static String ʽ;
    private ScheduledExecutorService ʽॱ;
    private long ʾ;
    private com.appsflyer.m$d ʿ;
    private long ˈ;
    private Map ˉ;
    static final String ˊ;
    private boolean ˊˊ;
    private boolean ˊˋ;
    private static final List ˊॱ;
    private long ˊᐝ;
    String ˋ;
    private String ˋˊ;
    private q ˋˋ;
    private long ˋॱ;
    private boolean ˋᐝ;
    private boolean ˌ;
    private boolean ˍ;
    static AppsFlyerInAppPurchaseValidatorListener ˎ;
    private boolean ˎˎ;
    static final String ˏ;
    private long ˏॱ;
    private static final List ͺ;
    String ॱ;
    private static AppsFlyerConversionListener ॱˊ;
    private com.appsflyer.e ॱˋ;
    private boolean ॱˎ;
    private static final String ॱॱ;
    private long ॱᐝ;
    private long ᐝ;
    private Map ᐝॱ;

    static {
        AppsFlyerLib.ˏ = "4.9.0".substring(0, "4.9.0".indexOf("."));
        AppsFlyerLib.ॱॱ = AppsFlyerLib.ˏ + "/androidevent?buildnumber=4.9.0&app_id=";
        v0 = new StringBuilder("https://%sattr.%s/api/v");
        v0.append(AppsFlyerLib.ॱॱ);
        AppsFlyerLib.ʽ = v0.toString();
        v0 = new StringBuilder("https://%st.%s/api/v");
        v0.append(AppsFlyerLib.ॱॱ);
        AppsFlyerLib.ʻ = v0.toString();
        v0 = new StringBuilder("https://%sevents.%s/api/v");
        v0.append(AppsFlyerLib.ॱॱ);
        AppsFlyerLib.ʼ = v0.toString();
        v0 = new StringBuilder("https://%sregister.%s/api/v");
        v0.append(AppsFlyerLib.ॱॱ);
        AppsFlyerLib.ˊ = v0.toString();
        AppsFlyerLib.ͺ = Arrays.asList(new String[]{"is_cache"});
        AppsFlyerLib.ˊॱ = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});
        AppsFlyerLib.ॱˊ = null;
        AppsFlyerLib.ˎ = null;
        AppsFlyerLib.ʻॱ = null;
        AppsFlyerLib.ʼॱ = new AppsFlyerLib();
    }

    private AppsFlyerLib() {
        super();
        this.ᐝ = -1;
        this.ˏॱ = -1;
        this.ˋॱ = TimeUnit.SECONDS.toMillis(5);
        this.ॱˋ = null;
        this.ॱˎ = false;
        this.ʽॱ = null;
        this.latestDeepLink = null;
        this.ˊˊ = false;
        this.ˊˋ = false;
        this.ˋˋ = new q();
        this.ˋᐝ = false;
        this.ˌ = false;
        AFVersionDeclaration.init();
    }

    public AppsFlyerLib enableLocationCollection(boolean arg1) {
        this.ˊˊ = arg1;
        return this;
    }

    public void enableUninstallTracking(String arg5) {
        s.ˏ().ˊ("enableUninstallTracking", new String[]{arg5});
        AppsFlyerProperties.getInstance().set("gcmProjectNumber", arg5);
    }

    public String getAppsFlyerUID(Context arg4) {
        s.ˏ().ˊ("getAppsFlyerUID", new String[0]);
        return r.ˏ(new WeakReference(arg4));
    }

    public String getAttributionId(ContentResolver arg8) {
        String v1_1;
        Cursor v8 = arg8.query(Uri.parse("content://com.facebook.katana.provider.AttributionIdProvider"), new String[]{"aid"}, null, null, null);
        String v0 = null;
        if(v8 != null) {
            try {
                if(!v8.moveToFirst()) {
                }
                else {
                    v1_1 = v8.getString(v8.getColumnIndex("aid"));
                    if(v8 == null) {
                        return v1_1;
                    }

                    goto label_18;
                }

                goto label_44;
            }
            catch(Throwable v0_1) {
            label_37:
                if(v8 != null) {
                    try {
                        v8.close();
                    }
                    catch(Exception v8_1) {
                        AFLogger.afErrorLog(((Throwable)v8_1).getMessage(), ((Throwable)v8_1));
                    }

                    goto label_43;
                }
                else {
                label_43:
                    throw v0_1;
                }

                goto label_44;
            }
            catch(Exception v1) {
                try {
                    AFLogger.afErrorLog("Could not collect cursor attribution. ", ((Throwable)v1));
                    if(v8 != null) {
                    }
                    else {
                        return v0;
                    }
                }
                catch(Throwable v0_1) {
                    goto label_37;
                }

                try {
                    v8.close();
                }
                catch(Exception v8_1) {
                    AFLogger.afErrorLog(((Throwable)v8_1).getMessage(), ((Throwable)v8_1));
                }

                return v0;
            }

            try {
            label_18:
                v8.close();
            }
            catch(Exception v8_1) {
                AFLogger.afErrorLog(((Throwable)v8_1).getMessage(), ((Throwable)v8_1));
            }

            return v1_1;
        }

    label_44:
        if(v8 != null) {
            try {
                v8.close();
            }
            catch(Exception v8_1) {
                AFLogger.afErrorLog(((Throwable)v8_1).getMessage(), ((Throwable)v8_1));
            }
        }

        return v0;
    }

    protected void getConversionData(Context arg1, ConversionDataListener arg2) {
        AppsFlyerLib.ॱˊ = new AppsFlyerConversionListener(arg2) {
            public final void onAppOpenAttribution(Map arg1) {
            }

            public final void onAttributionFailure(String arg1) {
            }

            public final void onInstallConversionDataLoaded(Map arg2) {
                this.ˋ.onConversionDataLoaded(arg2);
            }

            public final void onInstallConversionFailure(String arg2) {
                this.ˋ.onConversionFailure(arg2);
            }
        };
    }

    public String getHostName() {
        String v0 = AppsFlyerProperties.getInstance().getString("custom_host");
        if(v0 != null) {
            return v0;
        }

        return "appsflyer.com";
    }

    public String getHostPrefix() {
        String v0 = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        if(v0 != null) {
            return v0;
        }

        return "";
    }

    public static AppsFlyerLib getInstance() {
        return AppsFlyerLib.ʼॱ;
    }

    public String getOutOfStore(Context arg3) {
        String v0 = AppsFlyerProperties.getInstance().getString("api_store_value");
        if(v0 != null) {
            return v0;
        }

        String v3 = AppsFlyerLib.ˎ(new WeakReference(arg3), "AF_STORE");
        if(v3 != null) {
            return v3;
        }

        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    public String getSdkVersion() {
        s.ˏ().ˊ("getSdkVersion", new String[0]);
        return "version: 4.9.0 (build 184)";
    }

    protected void handleDeepLinkCallback(Context arg6, Map arg7, Uri arg8) {
        String v0 = arg8.toString();
        boolean v1 = true;
        if(v0 == null) {
            Object v0_1 = null;
        }
        else {
            Matcher v2 = Pattern.compile("fb\\d*?://authorize.*access_token=([^&]*)").matcher(((CharSequence)v0));
            if(v2.find()) {
                v0 = new StringBuilder(v0).replace(v2.start(1), v2.end(1), "").toString().replaceFirst("&access_token=", "").replaceFirst("access_token=&", "").replaceFirst("access_token=", "");
            }
        }

        if(!arg7.containsKey("af_deeplink")) {
            arg7.put("af_deeplink", v0);
        }

        if(arg8.getQueryParameter("af_deeplink") != null) {
            String v7 = arg8.getQueryParameter("media_source");
            v0 = arg8.getQueryParameter("is_retargeting");
            if(!"AppsFlyer_Test".equals(v7) || !Boolean.parseBoolean(v0)) {
                v1 = false;
            }
            else {
            }

            this.ˊˋ = v1;
            arg7 = AppsFlyerLib.ˋ(arg6, arg8.getQuery());
            v0 = "path";
            String v1_1 = arg8.getPath();
            if(v1_1 != null) {
                arg7.put(v0, v1_1);
            }

            v0 = "scheme";
            v1_1 = arg8.getScheme();
            if(v1_1 != null) {
                arg7.put(v0, v1_1);
            }

            v0 = "host";
            v1_1 = arg8.getHost();
            if(v1_1 == null) {
                goto label_66;
            }

            arg7.put(v0, v1_1);
        }
        else {
            HashMap v7_1 = new HashMap();
            ((Map)v7_1).put("link", arg8.toString());
        }

    label_66:
        WeakReference v0_2 = new WeakReference(arg6);
        t v6 = new t(arg8, this);
        ((OneLinkHttpTask)v6).setConnProvider(new HttpsUrlConnectionProvider());
        if(v6.ˏ()) {
            v6.ˋ(new com.appsflyer.AppsFlyerLib$1(this, arg7, v0_2));
            AFExecutor.getInstance().getThreadPoolExecutor().execute(((Runnable)v6));
            return;
        }

        if(AppsFlyerLib.ॱˊ != null) {
            try {
                AppsFlyerLib.ॱˊ.onAppOpenAttribution(arg7);
                return;
            }
            catch(Throwable v6_1) {
                AFLogger.afErrorLog(v6_1.getLocalizedMessage(), v6_1);
            }
        }
    }

    public AppsFlyerLib init(String arg2, AppsFlyerConversionListener arg3, Context arg4) {
        if(arg4 == null) {
            AFLogger.afWarnLog("init :: context is null, Google Install Referrer will be not initialized!");
        }
        else if(AppsFlyerLib.ˋ(arg4)) {
            if(this.ॱˋ == null) {
                this.ॱˋ = new com.appsflyer.e();
                this.ॱˋ.ॱ(arg4, ((d)this));
            }
            else {
                AFLogger.afWarnLog("AFInstallReferrer instance already created");
            }
        }

        return this.init(arg2, arg3);
    }

    public AppsFlyerLib init(String arg8, AppsFlyerConversionListener arg9) {
        s v0 = s.ˏ();
        String v1 = "init";
        int v2 = 2;
        String[] v3 = new String[v2];
        v3[0] = arg8;
        String v5 = arg9 == null ? "null" : "conversionDataListener";
        v3[1] = v5;
        v0.ˊ(v1, v3);
        AFLogger.ˏ(String.format("Initializing AppsFlyer SDK: (v%s.%s)", "4.9.0", "184"));
        this.ˎˎ = true;
        AppsFlyerProperties.getInstance().set("AppsFlyerKey", arg8);
        com.appsflyer.h$a.ˏ(arg8);
        AppsFlyerLib.ॱˊ = arg9;
        return this;
    }

    public boolean isPreInstalledApp(Context arg3) {
        try {
            if((arg3.getPackageManager().getApplicationInfo(arg3.getPackageName(), 0).flags & 1) == 0) {
                return 0;
            }
        }
        catch(PackageManager$NameNotFoundException v3) {
            AFLogger.afErrorLog("Could not check if app is pre installed", ((Throwable)v3));
            return 0;
        }

        return 1;
    }

    public boolean isTrackingStopped() {
        return this.ˌ;
    }

    public void onHandleReferrer(Map arg1) {
        this.ᐝॱ = arg1;
    }

    public void onPause(Context arg2) {
        com.appsflyer.AFDeepLinkManager$3.ॱ(arg2);
        i v2 = i.ˏ(arg2);
        v2.ˊ.post(v2.ʻ);
    }

    public void registerConversionListener(Context arg3, AppsFlyerConversionListener arg4) {
        s.ˏ().ˊ("registerConversionListener", new String[0]);
        if(arg4 != null) {
            AppsFlyerLib.ॱˊ = arg4;
        }
    }

    public void registerValidatorListener(Context arg3, AppsFlyerInAppPurchaseValidatorListener arg4) {
        s.ˏ().ˊ("registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if(arg4 == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
            return;
        }

        AppsFlyerLib.ˎ = arg4;
    }

    public void reportTrackSession(Context arg4) {
        s.ˏ().ˊ("reportTrackSession", new String[0]);
        s.ˏ().ᐝ();
        this.ˊ(arg4, null, null);
    }

    public void sendDeepLinkData(Activity arg7) {
        String[] v2_1;
        s v3;
        int v2 = 2;
        if(arg7 != null && arg7.getIntent() != null) {
            v3 = s.ˏ();
            v2_1 = new String[v2];
            v2_1[0] = arg7.getLocalClassName();
            StringBuilder v1 = new StringBuilder("activity_intent_");
            v1.append(arg7.getIntent().toString());
            v2_1[1] = v1.toString();
            v3.ˊ("sendDeepLinkData", v2_1);
        }
        else if(arg7 != null) {
            v3 = s.ˏ();
            v2_1 = new String[v2];
            v2_1[0] = arg7.getLocalClassName();
            v2_1[1] = "activity_intent_null";
            v3.ˊ("sendDeepLinkData", v2_1);
        }
        else {
            s.ˏ().ˊ("sendDeepLinkData", new String[]{"activity_null"});
        }

        try {
            this.ˋ(arg7.getApplication());
            StringBuilder v0 = new StringBuilder("getDeepLinkData with activity ");
            v0.append(arg7.getIntent().getDataString());
            AFLogger.afInfoLog(v0.toString());
            return;
        }
        catch(Exception v7) {
            AFLogger.afInfoLog("getDeepLinkData Exception: ".concat(String.valueOf(v7)));
            return;
        }
    }

    public void sendPushNotificationData(Activity arg15) {
        StringBuilder v0_3;
        Iterator v0_2;
        long v7;
        String v5_1;
        StringBuilder v1;
        String[] v5;
        s v3;
        int v2 = 2;
        if(arg15 != null && arg15.getIntent() != null) {
            v3 = s.ˏ();
            v5 = new String[v2];
            v5[0] = arg15.getLocalClassName();
            v1 = new StringBuilder("activity_intent_");
            v1.append(arg15.getIntent().toString());
            v5[1] = v1.toString();
            v3.ˊ("sendPushNotificationData", v5);
        }
        else if(arg15 != null) {
            v3 = s.ˏ();
            v5 = new String[v2];
            v5[0] = arg15.getLocalClassName();
            v5[1] = "activity_intent_null";
            v3.ˊ("sendPushNotificationData", v5);
        }
        else {
            s.ˏ().ˊ("sendPushNotificationData", new String[]{"activity_null"});
        }

        String v1_1 = null;
        if((arg15 instanceof Activity)) {
            Activity v0 = arg15;
            Intent v3_1 = v0.getIntent();
            if(v3_1 != null) {
                Bundle v4 = v3_1.getExtras();
                if(v4 != null) {
                    v5_1 = v4.getString("af");
                    if(v5_1 != null) {
                        AFLogger.afInfoLog("Push Notification received af payload = ".concat(String.valueOf(v5_1)));
                        v4.remove("af");
                        v0.setIntent(v3_1.putExtras(v4));
                    }
                }
                else {
                    goto label_56;
                }
            }
            else {
                goto label_56;
            }
        }
        else {
        label_56:
            v5_1 = v1_1;
        }

        this.ˋˊ = v5_1;
        if(this.ˋˊ != null) {
            long v3_2 = System.currentTimeMillis();
            if(this.ˉ == null) {
                AFLogger.afInfoLog("pushes: initializing pushes history..");
                this.ˉ = new ConcurrentHashMap();
                v7 = v3_2;
                goto label_136;
            }

            try {
                long v5_2 = AppsFlyerProperties.getInstance().getLong("pushPayloadMaxAging", 1800000);
                v0_2 = this.ˉ.keySet().iterator();
                v7 = v3_2;
            }
            catch(Throwable v0_1) {
                v7 = v3_2;
                goto label_128;
            }

            try {
                while(true) {
                    if(!v0_2.hasNext()) {
                        goto label_136;
                    }

                    Object v9 = v0_2.next();
                    JSONObject v10 = new JSONObject(this.ˋˊ);
                    JSONObject v11 = new JSONObject(this.ˉ.get(v9));
                    if((v10.get("pid").equals(v11.get("pid"))) && (v10.get("c").equals(v11.get("c")))) {
                        v0_3 = new StringBuilder("PushNotificationMeasurement: A previous payload with same PID was already acknowledged! (old: ");
                        v0_3.append(v11);
                        v0_3.append(", new: ");
                        v0_3.append(v10);
                        v0_3.append(")");
                        AFLogger.afInfoLog(v0_3.toString());
                        this.ˋˊ = v1_1;
                        return;
                    }

                    if(v3_2 - ((Number)v9).longValue() > v5_2) {
                        this.ˉ.remove(v9);
                    }

                    if(((Number)v9).longValue() > v7) {
                        continue;
                    }

                    v7 = ((Number)v9).longValue();
                }
            }
            catch(Throwable v0_1) {
            }

        label_128:
            v1 = new StringBuilder("Error while handling push notification measurement: ");
            v1.append(v0_1.getClass().getSimpleName());
            AFLogger.afErrorLog(v1.toString(), v0_1);
        label_136:
            if(this.ˉ.size() == AppsFlyerProperties.getInstance().getInt("pushPayloadHistorySize", v2)) {
                v0_3 = new StringBuilder("pushes: removing oldest overflowing push (oldest push:");
                v0_3.append(v7);
                v0_3.append(")");
                AFLogger.afInfoLog(v0_3.toString());
                this.ˉ.remove(Long.valueOf(v7));
            }

            this.ˉ.put(Long.valueOf(v3_2), this.ˋˊ);
            this.ˋ(arg15.getApplication());
        }
    }

    public void setAdditionalData(HashMap arg6) {
        if(arg6 != null) {
            s.ˏ().ˊ("setAdditionalData", new String[]{arg6.toString()});
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(((Map)arg6)).toString());
        }
    }

    public void setAndroidIdData(String arg5) {
        s.ˏ().ˊ("setAndroidIdData", new String[]{arg5});
        this.ˋ = arg5;
    }

    public void setAppId(String arg5) {
        s.ˏ().ˊ("setAppId", new String[]{arg5});
        AppsFlyerProperties.getInstance().set("appid", arg5);
    }

    public void setAppInviteOneLink(String arg5) {
        s.ˏ().ˊ("setAppInviteOneLink", new String[]{arg5});
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(arg5)));
        if(arg5 == null || !arg5.equals(AppsFlyerProperties.getInstance().getString("oneLinkSlug"))) {
            AppsFlyerProperties.getInstance().remove("onelinkDomain");
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove("onelinkScheme");
        }

        AppsFlyerProperties.getInstance().set("oneLinkSlug", arg5);
    }

    @Deprecated public void setAppUserId(String arg5) {
        s.ˏ().ˊ("setAppUserId", new String[]{arg5});
        this.setCustomerUserId(arg5);
    }

    public void setCollectAndroidID(boolean arg6) {
        s.ˏ().ˊ("setCollectAndroidID", new String[]{String.valueOf(arg6)});
        AppsFlyerProperties.getInstance().set("collectAndroidId", Boolean.toString(arg6));
        AppsFlyerProperties.getInstance().set("collectAndroidIdForceByUser", Boolean.toString(arg6));
    }

    @Deprecated public void setCollectFingerPrint(boolean arg6) {
        s.ˏ().ˊ("setCollectFingerPrint", new String[]{String.valueOf(arg6)});
        AppsFlyerProperties.getInstance().set("collectFingerPrint", Boolean.toString(arg6));
    }

    public void setCollectIMEI(boolean arg6) {
        s.ˏ().ˊ("setCollectIMEI", new String[]{String.valueOf(arg6)});
        AppsFlyerProperties.getInstance().set("collectIMEI", Boolean.toString(arg6));
        AppsFlyerProperties.getInstance().set("collectIMEIForceByUser", Boolean.toString(arg6));
    }

    public void setConsumeAFDeepLinks(boolean arg3) {
        AppsFlyerProperties.getInstance().set("consumeAfDeepLink", arg3);
        s.ˏ().ˊ("setConsumeAFDeepLinks: ".concat(String.valueOf(arg3)), new String[0]);
    }

    public void setCurrencyCode(String arg5) {
        s.ˏ().ˊ("setCurrencyCode", new String[]{arg5});
        AppsFlyerProperties.getInstance().set("currencyCode", arg5);
    }

    public void setCustomerIdAndTrack(String arg11, @NonNull Context arg12) {
        if(arg12 != null) {
            int v0 = !AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false) || AppsFlyerProperties.getInstance().getString("AppUserId") != null ? 0 : 1;
            if(v0 != 0) {
                this.setCustomerUserId(arg11);
                AppsFlyerProperties.getInstance().set("waitForCustomerId", false);
                StringBuilder v0_1 = new StringBuilder("CustomerUserId set: ");
                v0_1.append(arg11);
                v0_1.append(" - Initializing AppsFlyer Tacking");
                AFLogger.afInfoLog(v0_1.toString(), true);
                arg11 = AppsFlyerProperties.getInstance().getReferrer(arg12);
                String v4 = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
                String v5 = null;
                String v6 = null;
                if(arg11 == null) {
                    arg11 = "";
                }

                String v7 = arg11;
                Intent v11 = (arg12 instanceof Activity) ? arg12.getIntent() : null;
                Intent v8 = v11;
                this.ˏ(arg12, v4, v5, v6, v7, v8, null);
                if(AppsFlyerProperties.getInstance().getString("afUninstallToken") != null) {
                    this.ˎ(arg12, AppsFlyerProperties.getInstance().getString("afUninstallToken"));
                }

                return;
            }

            this.setCustomerUserId(arg11);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(arg11)), true);
        }
    }

    public void setCustomerUserId(String arg5) {
        s.ˏ().ˊ("setCustomerUserId", new String[]{arg5});
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(arg5)));
        AppsFlyerProperties.getInstance().set("AppUserId", arg5);
    }

    public void setDebugLog(boolean arg6) {
        s.ˏ().ˊ("setDebugLog", new String[]{String.valueOf(arg6)});
        AppsFlyerProperties.getInstance().set("shouldLog", arg6);
        AppsFlyerProperties v0 = AppsFlyerProperties.getInstance();
        LogLevel v6 = arg6 ? LogLevel.DEBUG : LogLevel.NONE;
        v0.set("logLevel", v6.getLevel());
    }

    protected void setDeepLinkData(Intent arg3) {
        if(arg3 != null) {
            try {
                if("android.intent.action.VIEW".equals(arg3.getAction())) {
                    this.latestDeepLink = arg3.getData();
                    StringBuilder v3_1 = new StringBuilder("Unity setDeepLinkData = ");
                    v3_1.append(this.latestDeepLink);
                    AFLogger.afDebugLog(v3_1.toString());
                }
            }
            catch(Throwable v3) {
                AFLogger.afErrorLog("Exception while setting deeplink data (unity). ", v3);
                return;
            }
        }
    }

    public void setDeviceTrackingDisabled(boolean arg6) {
        s.ˏ().ˊ("setDeviceTrackingDisabled", new String[]{String.valueOf(arg6)});
        AppsFlyerProperties.getInstance().set("deviceTrackingDisabled", arg6);
    }

    public void setExtension(String arg5) {
        s.ˏ().ˊ("setExtension", new String[]{arg5});
        AppsFlyerProperties.getInstance().set("sdkExtension", arg5);
    }

    @Deprecated public void setGCMProjectID(String arg5) {
        s.ˏ().ˊ("setGCMProjectID", new String[]{arg5});
        AFLogger.afWarnLog("Method \'setGCMProjectNumber\' is deprecated. Please follow the documentation.");
        this.enableUninstallTracking(arg5);
    }

    @Deprecated public void setGCMProjectNumber(Context arg4, String arg5) {
        s.ˏ().ˊ("setGCMProjectNumber", new String[]{arg5});
        AFLogger.afWarnLog("Method \'setGCMProjectNumber\' is deprecated. Please use \'enableUninstallTracking\'.");
        this.enableUninstallTracking(arg5);
    }

    @Deprecated public void setGCMProjectNumber(String arg5) {
        s.ˏ().ˊ("setGCMProjectNumber", new String[]{arg5});
        AFLogger.afWarnLog("Method \'setGCMProjectNumber\' is deprecated. Please follow the documentation.");
        this.enableUninstallTracking(arg5);
    }

    public void setHost(String arg3, String arg4) {
        if(arg3 != null) {
            AppsFlyerProperties.getInstance().set("custom_host_prefix", arg3);
        }

        if(arg4 != null && !arg4.isEmpty()) {
            AppsFlyerProperties.getInstance().set("custom_host", arg4);
            return;
        }

        AFLogger.afWarnLog("hostName cannot be null or empty");
    }

    @Deprecated public void setHostName(String arg3) {
        AppsFlyerProperties.getInstance().set("custom_host", arg3);
    }

    public void setImeiData(String arg5) {
        s.ˏ().ˊ("setImeiData", new String[]{arg5});
        this.ॱ = arg5;
    }

    public void setIsUpdate(boolean arg6) {
        s.ˏ().ˊ("setIsUpdate", new String[]{String.valueOf(arg6)});
        AppsFlyerProperties.getInstance().set("IS_UPDATE", arg6);
    }

    public void setLogLevel(LogLevel arg3) {
        AppsFlyerProperties.getInstance().set("logLevel", arg3.getLevel());
    }

    public void setMinTimeBetweenSessions(int arg4) {
        this.ˋॱ = TimeUnit.SECONDS.toMillis(((long)arg4));
    }

    public void setOutOfStore(String arg3) {
        if(arg3 != null) {
            arg3 = arg3.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", arg3);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(arg3)), true);
            return;
        }

        AFLogger.ˊ("Cannot set setOutOfStore with null");
    }

    public void setPluginDeepLinkData(Intent arg1) {
        this.setDeepLinkData(arg1);
    }

    public void setPreinstallAttribution(String arg3, String arg4, String arg5) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject v0 = new JSONObject();
        if(arg3 != null) {
            try {
                v0.put("pid", arg3);
            label_10:
                if(arg4 != null) {
                    v0.put("c", arg4);
                }

                if(arg5 == null) {
                    goto label_19;
                }

                v0.put("af_siteid", arg5);
                goto label_19;
            label_9:
                goto label_17;
            }
            catch(JSONException v3) {
                goto label_9;
            }
        }

        goto label_10;
    label_17:
        AFLogger.afErrorLog(((Throwable)v3).getMessage(), ((Throwable)v3));
    label_19:
        if(v0.has("pid")) {
            AppsFlyerProperties.getInstance().set("preInstallName", v0.toString());
            return;
        }

        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
    }

    public void setResolveDeepLinkURLs(String[] arg6) {
        s.ˏ().ˊ("setResolveDeepLinkURLs", new String[]{Arrays.asList(((Object[])arg6)).toString()});
        AFDeepLinkManager.ˊ = arg6;
    }

    @Deprecated public void setUserEmail(String arg5) {
        s.ˏ().ˊ("setUserEmail", new String[]{arg5});
        AppsFlyerProperties.getInstance().set("userEmail", arg5);
    }

    public void setUserEmails(EmailsCryptType arg8, String[] arg9) {
        String v5;
        ArrayList v0 = new ArrayList(arg9.length + 1);
        ((List)v0).add(arg8.toString());
        ((List)v0).addAll(Arrays.asList(((Object[])arg9)));
        s.ˏ().ˊ("setUserEmails", ((List)v0).toArray(new String[arg9.length + 1]));
        AppsFlyerProperties.getInstance().set("userEmailsCryptType", arg8.getValue());
        HashMap v0_1 = new HashMap();
        ArrayList v1 = new ArrayList();
        int v2 = arg9.length;
        Object v3 = null;
        int v4;
        for(v4 = 0; v4 < v2; ++v4) {
            String v3_1 = arg9[v4];
            switch(com.appsflyer.AppsFlyerLib$5.ˎ[((Enum)arg8).ordinal()]) {
                case 2: {
                    v5 = "md5_el_arr";
                    ((AbstractCollection)v1).add(p.ॱ(v3_1));
                    break;
                }
                case 3: {
                    v5 = "sha256_el_arr";
                    ((AbstractCollection)v1).add(p.ˏ(v3_1));
                    break;
                }
                case 4: {
                    v5 = "plain_el_arr";
                    ((AbstractCollection)v1).add(v3_1);
                    break;
                }
                default: {
                    v5 = "sha1_el_arr";
                    ((AbstractCollection)v1).add(p.ˊ(v3_1));
                    break;
                }
            }

            v3_1 = v5;
        }

        ((Map)v0_1).put(v3, v1);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(((Map)v0_1)).toString());
    }

    public void setUserEmails(String[] arg3) {
        s.ˏ().ˊ("setUserEmails", arg3);
        this.setUserEmails(EmailsCryptType.NONE, arg3);
    }

    public void startTracking(Application arg2) {
        if(!this.ˎˎ) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call \'startTracking(Application)\' must be called after the \'init(String, AppsFlyerConversionListener)\' API method, which should be called on the Application\'s onCreate.");
            return;
        }

        this.startTracking(arg2, null);
    }

    public void startTracking(Application arg2, String arg3) {
        this.startTracking(arg2, arg3, null);
    }

    public void startTracking(Application arg6, String arg7, AppsFlyerTrackingRequestListener arg8) {
        s.ˏ().ˊ("startTracking", new String[]{arg7});
        AFLogger.afInfoLog(String.format("Starting AppsFlyer Tracking: (v%s.%s)", "4.9.0", "184"));
        AFLogger.afInfoLog("Build Number: 184");
        AppsFlyerProperties.getInstance().loadProperties(((Context)arg6).getApplicationContext());
        if(!TextUtils.isEmpty(((CharSequence)arg7))) {
            AppsFlyerProperties.getInstance().set("AppsFlyerKey", arg7);
            com.appsflyer.h$a.ˏ(arg7);
        }
        else if(TextUtils.isEmpty(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"))) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the \'init\' API method (should be called on Application\'s onCreate),or in the startTracking API method (should be called on Activity\'s onCreate).");
            return;
        }

        if(arg8 != null) {
            AppsFlyerLib.ʻॱ = arg8;
        }

        this.ˋ(arg6);
    }

    public void stopTracking(boolean arg3, Context arg4) {
        this.ˌ = arg3;
        CacheManager.getInstance().clearCache(arg4);
        if(this.ˌ) {
            SharedPreferences$Editor v4 = arg4.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
            v4.putBoolean("is_stop_tracking_used", true);
            if(Build$VERSION.SDK_INT >= 9) {
                v4.apply();
                return;
            }
            else {
                v4.commit();
            }
        }
    }

    public void trackAppLaunch(Context arg10, String arg11) {
        if(AppsFlyerLib.ˋ(arg10)) {
            if(this.ॱˋ == null) {
                this.ॱˋ = new com.appsflyer.e();
                this.ॱˋ.ॱ(arg10, ((d)this));
            }
            else {
                AFLogger.afWarnLog("AFInstallReferrer instance already created");
            }
        }

        this.ˏ(arg10, arg11, null, null, "", null, null);
    }

    public void trackEvent(Context arg6, String arg7, Map arg8) {
        HashMap v1;
        if(arg8 == null) {
            v1 = new HashMap();
        }
        else {
            Map v1_1 = arg8;
        }

        s.ˏ().ˊ("trackEvent", new String[]{arg7, new JSONObject(((Map)v1)).toString()});
        this.ˊ(arg6, arg7, arg8);
    }

    public void trackLocation(Context arg6, double arg7, double arg9) {
        s.ˏ().ˊ("trackLocation", new String[]{String.valueOf(arg7), String.valueOf(arg9)});
        HashMap v0 = new HashMap();
        ((Map)v0).put("af_long", Double.toString(arg9));
        ((Map)v0).put("af_lat", Double.toString(arg7));
        this.ˊ(arg6, "af_location_coordinates", ((Map)v0));
    }

    public void unregisterConversionListener() {
        s.ˏ().ˊ("unregisterConversionListener", new String[0]);
        AppsFlyerLib.ॱˊ = null;
    }

    public void updateServerUninstallToken(Context arg2, String arg3) {
        if(arg3 != null) {
            y.ॱ(arg2, new com.appsflyer.a$e$b(arg3));
        }
    }

    public void validateAndTrackInAppPurchase(Context arg14, String arg15, String arg16, String arg17, String arg18, String arg19, Map arg20) {
        Context v0 = arg14;
        String v5 = arg17;
        String v6 = arg18;
        String v7 = arg19;
        s v1 = s.ˏ();
        String v2 = "validateAndTrackInAppPurchase";
        String[] v8 = new String[6];
        v8[0] = arg15;
        v8[1] = arg16;
        v8[2] = v5;
        v8[3] = v6;
        v8[4] = v7;
        String v10 = arg20 == null ? "" : arg20.toString();
        v8[5] = v10;
        v1.ˊ(v2, v8);
        if(!this.isTrackingStopped()) {
            StringBuilder v1_1 = new StringBuilder("Validate in app called with parameters: ");
            v1_1.append(v5);
            v1_1.append(" ");
            v1_1.append(v6);
            v1_1.append(" ");
            v1_1.append(v7);
            AFLogger.afInfoLog(v1_1.toString());
        }

        if(arg15 == null || v6 == null || arg16 == null || v7 == null || v5 == null) {
            if(AppsFlyerLib.ˎ == null) {
                return;
            }

            AppsFlyerLib.ˎ.onValidateInAppFailure("Please provide purchase parameters");
            return;
        }
        else {
            ScheduledThreadPoolExecutor v10_1 = AFExecutor.getInstance().ˏ();
            Runnable v11 = null;
            Context v1_2 = arg14.getApplicationContext();
            v2 = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
            Intent v0_1 = (v0 instanceof Activity) ? ((Activity)v0).getIntent() : null;
            Intent v12 = v0_1;
            super(v1_2, v2, arg15, arg16, arg17, arg18, arg19, arg20, v12);
            AppsFlyerLib.ˋ(((ScheduledExecutorService)v10_1), v11, 10, TimeUnit.MILLISECONDS);
        }
    }

    public void waitForCustomerUserId(boolean arg3) {
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(arg3)), true);
        AppsFlyerProperties.getInstance().set("waitForCustomerId", arg3);
    }

    private static boolean ʻ(Context arg6) {
        int v3;
        if(arg6 == null) {
            return 0;
        }

        if(Build$VERSION.SDK_INT < 23) {
            goto label_28;
        }

        try {
            Object v6_1 = arg6.getSystemService("connectivity");
            Network[] v1 = ((ConnectivityManager)v6_1).getAllNetworks();
            int v2 = v1.length;
            v3 = 0;
            while(true) {
            label_10:
                if(v3 >= v2) {
                    return 0;
                }

                NetworkCapabilities v4 = ((ConnectivityManager)v6_1).getNetworkCapabilities(v1[v3]);
                if((v4.hasTransport(4)) && !v4.hasCapability(15)) {
                    return 1;
                }

                goto label_21;
            }
        }
        catch(Exception v6) {
            goto label_26;
        }

        return 1;
    label_21:
        ++v3;
        goto label_10;
        return 0;
    label_26:
        AFLogger.afErrorLog("Failed collecting ivc data", ((Throwable)v6));
        return 0;
    label_28:
        if(Build$VERSION.SDK_INT >= 16) {
            ArrayList v6_2 = new ArrayList();
            try {
                Iterator v1_1 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                while(v1_1.hasNext()) {
                    Object v2_1 = v1_1.next();
                    if(!((NetworkInterface)v2_1).isUp()) {
                        continue;
                    }

                    ((List)v6_2).add(((NetworkInterface)v2_1).getName());
                }

                return ((List)v6_2).contains("tun0");
            }
            catch(Exception v6) {
                AFLogger.afErrorLog("Failed collecting ivc data", ((Throwable)v6));
            }
        }

        return 0;
    }

    private static String ʼ(Context arg2) {
        String v0 = AppsFlyerProperties.getInstance().getString("api_store_value");
        if(v0 != null) {
            return v0;
        }

        String v2 = AppsFlyerLib.ˎ(new WeakReference(arg2), "AF_STORE");
        if(v2 != null) {
            return v2;
        }

        return null;
    }

    private static float ʽ(Context arg3) {
        int v3_2;
        int v0;
        try {
            Intent v3_1 = arg3.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int v1 = -1;
            v0 = v3_1.getIntExtra("level", v1);
            v3_2 = v3_1.getIntExtra("scale", v1);
            if(v0 == v1) {
                return 50f;
            }
        }
        catch(Throwable v3) {
            AFLogger.afErrorLog(v3.getMessage(), v3);
            float v0_1 = 1f;
            return v0_1;
        }

        if(v3_2 == v1) {
        }
        else {
            return (((float)v0)) / (((float)v3_2)) * 100f;
        }

        return 50f;
    }

    static int ˊ(SharedPreferences arg2) {
        return AppsFlyerLib.ˎ(arg2, "appsFlyerCount", false);
    }

    static String ˊ(String arg1) {
        return AppsFlyerProperties.getInstance().getString(arg1);
    }

    private static Map ˊ(Context arg2) throws k {
        String v2 = arg2.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("attributionId", null);
        if(v2 != null && v2.length() > 0) {
            return AppsFlyerLib.ˋ(v2);
        }

        throw new k();
    }

    static ScheduledExecutorService ˊ(AppsFlyerLib arg0) {
        return arg0.ʽॱ;
    }

    private static void ˊ(Context arg3, String arg4) {
        Intent v0 = new Intent("com.appsflyer.testIntgrationBroadcast");
        v0.putExtra("params", arg4);
        if(Build$VERSION.SDK_INT >= 26) {
            if(arg3.getPackageManager().queryBroadcastReceivers(v0, 0).toString().contains("com.appsflyer.referrerSender")) {
                Intent v4 = new Intent(v0);
                v4.setComponent(new ComponentName("com.appsflyer.referrerSender", "com.appsflyer.referrerSender.Receiver"));
                arg3.sendBroadcast(v4);
            }

            return;
        }

        arg3.sendBroadcast(v0);
    }

    static void ˊ(Context arg0, String arg1, String arg2) {
        AppsFlyerLib.ˎ(arg0, arg1, arg2);
    }

    static void ˊ(Map arg1) {
        if(AppsFlyerLib.ॱˊ != null) {
            try {
                AppsFlyerLib.ॱˊ.onAppOpenAttribution(arg1);
                return;
            }
            catch(Throwable v1) {
                AFLogger.afErrorLog(v1.getLocalizedMessage(), v1);
            }
        }
    }

    private boolean ˊ() {
        Locale v6;
        if(this.ᐝ > 0) {
            long v0 = System.currentTimeMillis() - this.ᐝ;
            SimpleDateFormat v4 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            long v5 = this.ᐝ;
            ((DateFormat)v4).setTimeZone(TimeZone.getTimeZone("UTC"));
            String v3 = ((DateFormat)v4).format(new Date(v5));
            v5 = this.ˏॱ;
            ((DateFormat)v4).setTimeZone(TimeZone.getTimeZone("UTC"));
            String v4_1 = ((DateFormat)v4).format(new Date(v5));
            int v7 = 3;
            int v8 = 2;
            if(v0 < this.ˋॱ && !this.isTrackingStopped()) {
                v6 = Locale.US;
                Object[] v10 = new Object[4];
                v10[0] = v3;
                v10[1] = v4_1;
                v10[v8] = Long.valueOf(v0);
                v10[v7] = Long.valueOf(this.ˋॱ);
                AFLogger.afInfoLog(String.format(v6, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", v10));
                return 1;
            }

            if(this.isTrackingStopped()) {
                return 0;
            }

            v6 = Locale.US;
            Object[] v7_1 = new Object[v7];
            v7_1[0] = v3;
            v7_1[1] = v4_1;
            v7_1[v8] = Long.valueOf(v0);
            AFLogger.afInfoLog(String.format(v6, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", v7_1));
        }
        else {
            if(this.isTrackingStopped()) {
                return 0;
            }

            AFLogger.afInfoLog("Sending first launch for this session!");
        }

        return 0;
    }

    final void ˊ(Context arg13, String arg14, Map arg15) {
        HashMap v15;
        Intent v10;
        String v11;
        Uri v1_2;
        String v0 = "";
        Uri v2 = null;
        if((arg13 instanceof Activity)) {
            Context v1 = arg13;
            Intent v3 = ((Activity)v1).getIntent();
            AFDeepLinkManager.getInstance().currentActivityHash = System.identityHashCode(v1);
            try {
                v1_2 = ActivityCompat.getReferrer(((Activity)v1));
            }
            catch(Throwable v1_1) {
                AFLogger.afErrorLog(v1_1.getLocalizedMessage(), v1_1);
                v1_2 = v2;
            }

            if(v1_2 != null) {
                v0 = v1_2.toString();
            }

            v11 = v0;
            v10 = v3;
        }
        else {
            v11 = v0;
            v10 = ((Intent)v2);
        }

        if(AppsFlyerProperties.getInstance().getString("AppsFlyerKey") == null) {
            AFLogger.afWarnLog("[TrackEvent/Launch] AppsFlyer\'s SDK cannot send any event without providing DevKey.");
            return;
        }

        if(arg15 == null) {
            v15 = new HashMap();
        }

        JSONObject v0_1 = new JSONObject(((Map)v15));
        String v15_1 = AppsFlyerProperties.getInstance().getReferrer(arg13);
        String v6 = null;
        String v8 = v0_1.toString();
        if(v15_1 == null) {
            v15_1 = "";
        }

        this.ˏ(arg13, v6, arg14, v8, v15_1, v10, v11);
    }

    private static Map ˋ(String arg5) {
        HashMap v0 = new HashMap();
        try {
            JSONObject v1 = new JSONObject(arg5);
            Iterator v5_1 = v1.keys();
            while(v5_1.hasNext()) {
                Object v2 = v5_1.next();
                if(AppsFlyerLib.ͺ.contains(v2)) {
                    continue;
                }

                String v3 = v1.getString(((String)v2));
                if(TextUtils.isEmpty(((CharSequence)v3))) {
                    continue;
                }

                if("null".equals(v3)) {
                    continue;
                }

                ((Map)v0).put(v2, v3);
            }
        }
        catch(JSONException v5) {
            goto label_22;
        }

        return ((Map)v0);
    label_22:
        AFLogger.afErrorLog(((Throwable)v5).getMessage(), ((Throwable)v5));
        return null;
    }

    static AppsFlyerConversionListener ˋ() {
        return AppsFlyerLib.ॱˊ;
    }

    @Nullable private static String ˋ(String arg2, PackageManager arg3, String arg4) {
        int v0 = 0x80;
        String v1 = null;
        try {
            Bundle v3_1 = arg3.getApplicationInfo(arg4, v0).metaData;
            if(v3_1 == null) {
                return v1;
            }

            Object v3_2 = v3_1.get(arg2);
            if(v3_2 == null) {
                return v1;
            }

            v1 = v3_2.toString();
        }
        catch(Throwable v3) {
            StringBuilder v4 = new StringBuilder("Could not find ");
            v4.append(arg2);
            v4.append(" value in the manifest");
            AFLogger.afErrorLog(v4.toString(), v3);
        }

        return v1;
    }

    @Nullable private static String ˋ(WeakReference arg2) {
        String v0 = AppsFlyerProperties.getInstance().getString("channel");
        if(v0 == null) {
            v0 = AppsFlyerLib.ˎ(arg2, "CHANNEL");
        }

        if(v0 != null && (v0.equals(""))) {
            return null;
        }

        return v0;
    }

    private static Map ˋ(Context arg9, String arg10) {
        Object v5_1;
        LinkedHashMap v0 = new LinkedHashMap();
        String[] v10 = arg10.split("&");
        int v1 = v10.length;
        int v3 = 0;
        int v4 = 0;
        while(v3 < v1) {
            String v5 = v10[v3];
            int v6 = v5.indexOf("=");
            String v7 = v6 > 0 ? v5.substring(0, v6) : v5;
            if(!((Map)v0).containsKey(v7)) {
                if(v7.equals("c")) {
                    v7 = "campaign";
                }
                else if(v7.equals("pid")) {
                    v7 = "media_source";
                }
                else if(v7.equals("af_prt")) {
                    v7 = "agency";
                    v4 = 1;
                }

                ((Map)v0).put(v7, "");
            }

            if(v6 > 0) {
                ++v6;
                if(v5.length() > v6) {
                    v5 = v5.substring(v6);
                }
                else {
                    goto label_43;
                }
            }
            else {
            label_43:
                v5_1 = null;
            }

            ((Map)v0).put(v7, v5_1);
            ++v3;
        }

        try {
            if(((Map)v0).containsKey("install_time")) {
                goto label_70;
            }

            PackageInfo v9_1 = arg9.getPackageManager().getPackageInfo(arg9.getPackageName(), 0);
            SimpleDateFormat v2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long v5_2 = v9_1.firstInstallTime;
            ((DateFormat)v2).setTimeZone(TimeZone.getTimeZone("UTC"));
            ((Map)v0).put("install_time", ((DateFormat)v2).format(new Date(v5_2)));
        }
        catch(Exception v9) {
            AFLogger.afErrorLog("Could not fetch install time. ", ((Throwable)v9));
        }

    label_70:
        if(!((Map)v0).containsKey("af_status")) {
            ((Map)v0).put("af_status", "Non-organic");
        }

        if(v4 != 0) {
            ((Map)v0).remove("media_source");
        }

        return ((Map)v0);
    }

    static ScheduledExecutorService ˋ(AppsFlyerLib arg1) {
        arg1.ʽॱ = null;
        return null;
    }

    private void ˋ(Application arg4) {
        AppsFlyerProperties.getInstance().loadProperties(((Context)arg4).getApplicationContext());
        int v1 = 14;
        if(Build$VERSION.SDK_INT < v1) {
            AFLogger.afInfoLog("SDK<14 call trackEvent manually");
            AFLogger.afInfoLog("onBecameForeground");
            AppsFlyerLib.getInstance().ˈ = System.currentTimeMillis();
            AppsFlyerLib.getInstance().ˊ(((Context)arg4), null, null);
            AFLogger.resetDeltaTime();
        }
        else if(Build$VERSION.SDK_INT >= v1 && this.ʿ == null) {
            m.ˎ();
            this.ʿ = new com.appsflyer.m$d() {
                public final void ˊ(Activity arg4) {
                    if(2 > AppsFlyerLib.ˊ(AppsFlyerLib.ˎ(((Context)arg4)))) {
                        i v0 = i.ˏ(((Context)arg4));
                        v0.ˊ.post(v0.ʻ);
                        v0.ˊ.post(v0.ˎ);
                    }

                    AFLogger.afInfoLog("onBecameForeground");
                    AppsFlyerLib.getInstance().ˏ();
                    AppsFlyerLib.getInstance().ˊ(((Context)arg4), null, null);
                    AFLogger.resetDeltaTime();
                }

                public final void ˊ(WeakReference arg2) {
                    com.appsflyer.AFDeepLinkManager$3.ॱ(((Reference)arg2).get());
                    i v2 = i.ˏ(((Reference)arg2).get());
                    v2.ˊ.post(v2.ʻ);
                }
            };
            m.ˏ().ˊ(arg4, this.ʿ);
            return;
        }
    }

    static void ˋ(Context arg0, String arg1, long arg2) {
        AppsFlyerLib.ˎ(arg0, arg1, arg2);
    }

    private static void ˋ(Context arg3, String arg4, String arg5, String arg6) {
        if(AppsFlyerProperties.getInstance().getBoolean("shouldMonitor", false)) {
            Intent v0 = new Intent("com.appsflyer.MonitorBroadcast");
            v0.setPackage("com.appsflyer.nightvision");
            v0.putExtra("message", arg5);
            v0.putExtra("value", arg6);
            v0.putExtra("packageName", "true");
            v0.putExtra("pid", new Integer(Process.myPid()));
            v0.putExtra("eventIdentifier", arg4);
            v0.putExtra("sdk", "4.9.0");
            arg3.sendBroadcast(v0);
        }
    }

    private static void ˋ(ScheduledExecutorService arg1, Runnable arg2, long arg3, TimeUnit arg5) {
        if(arg1 != null) {
            try {
                if(!arg1.isShutdown() && !arg1.isTerminated()) {
                    arg1.schedule(arg2, arg3, arg5);
                    return;
                }

            label_11:
                AFLogger.afWarnLog("scheduler is null, shut downed or terminated");
                return;
            label_8:
                goto label_14;
            }
            catch(Throwable v1) {
                goto label_8;
            }
            catch(RejectedExecutionException v1_1) {
                goto label_17;
            }
        }

        goto label_11;
    label_14:
        AFLogger.afErrorLog("scheduleJob failed with Exception", v1);
        return;
    label_17:
        AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", ((Throwable)v1_1));
    }

    private static void ˋ(JSONObject arg13) {
        Object v7;
        Object v5;
        Object v4_1;
        Object v2;
        ArrayList v0 = new ArrayList();
        Iterator v1 = arg13.keys();
    label_3:
        int v3 = 0;
        if(v1.hasNext()) {
            v2 = v1.next();
            try {
                JSONArray v4 = new JSONArray(arg13.get(((String)v2)));
                while(true) {
                    if(v3 >= v4.length()) {
                        goto label_3;
                    }

                    ((List)v0).add(Long.valueOf(v4.getLong(v3)));
                    ++v3;
                }
            }
            catch(JSONException ) {
                goto label_3;
            }
        }

        Collections.sort(((List)v0));
        v1 = arg13.keys();
        v2 = null;
        while(true) {
        label_21:
            v4_1 = v2;
        label_22:
            while(v1.hasNext()) {
                if(v4_1 != null) {
                    break;
                }

                v5 = v1.next();
                try {
                    JSONArray v6 = new JSONArray(arg13.get(((String)v5)));
                    v7 = v4_1;
                    v4_1 = null;
                    goto label_31;
                }
                catch(JSONException ) {
                    continue;
                }

                break;
            }

            if(v4_1 != null) {
                arg13.remove(((String)v4_1));
            }

            return;
            try {
                while(true) {
                label_31:
                    if((((int)v4_1)) >= v6.length()) {
                        goto label_52;
                    }

                    if(v6.getLong(((int)v4_1)) == ((List)v0).get(0).longValue()) {
                        goto label_21;
                    }

                    if(v6.getLong(((int)v4_1)) == ((List)v0).get(1).longValue()) {
                        goto label_21;
                    }

                    if(v6.getLong(((int)v4_1)) != ((List)v0).get(((List)v0).size() - 1).longValue()) {
                        break;
                    }

                    break;
                }
            }
            catch(JSONException ) {
                goto label_52;
            }
        }

        int v4_2 = (((int)v4_1)) + 1;
        v7 = v5;
        goto label_31;
    label_52:
        v4_1 = v7;
        goto label_22;
    }

    private static boolean ˋ(@NonNull Context arg3) {
        if(AppsFlyerLib.ˎ(arg3.getApplicationContext().getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false) > 2) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 2, ");
            return 0;
        }

        try {
            Class.forName("com.android.installreferrer.api.InstallReferrerClient");
            if(!com.appsflyer.AFExecutor$3$5.ˋ(arg3, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                goto label_20;
            }

            AFLogger.afDebugLog("Install referrer is allowed");
            return 1;
        }
        catch(Throwable v3) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient", v3);
            return 0;
        }
        catch(ClassNotFoundException ) {
            AFLogger.afRDLog("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return 0;
        }

    label_20:
        AFLogger.afDebugLog("Install referrer is not allowed");
        return 0;
    }

    static SharedPreferences ˎ(Context arg2) {
        return arg2.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
    }

    @NonNull static String ˎ(HttpURLConnection arg7) {
        BufferedReader v1_3;
        BufferedReader v2_2;
        Reader v3_1;
        InputStreamReader v3;
        StringBuilder v0 = new StringBuilder();
        Reader v1 = null;
        try {
            InputStream v2_1 = arg7.getErrorStream();
            if(v2_1 == null) {
                v2_1 = ((URLConnection)arg7).getInputStream();
            }

            v3 = new InputStreamReader(v2_1);
        }
        catch(Throwable v7) {
            v3 = ((InputStreamReader)v1);
            goto label_61;
        }
        catch(Throwable v2) {
            v3_1 = v1;
            goto label_34;
        }

        try {
            v2_2 = new BufferedReader(((Reader)v3));
            goto label_10;
        }
        catch(Throwable v7) {
        }
        catch(Throwable v2) {
            goto label_34;
            try {
                while(true) {
                label_10:
                    String v1_2 = v2_2.readLine();
                    if(v1_2 == null) {
                        break;
                    }

                    v0.append(v1_2);
                    v0.append('\n');
                }
            }
            catch(Throwable v7) {
                v1_3 = v2_2;
                goto label_61;
            }
            catch(Throwable v1_1) {
                BufferedReader v6 = v2_2;
                v2 = v1_1;
                v1_3 = v6;
                goto label_34;
            }

            try {
                ((Reader)v2_2).close();
                goto label_17;
            }
            catch(Throwable ) {
                goto label_46;
            }

            try {
            label_34:
                StringBuilder v4 = new StringBuilder("Could not read connection response from: ");
                v4.append(((URLConnection)arg7).getURL().toString());
                AFLogger.afErrorLog(v4.toString(), v2);
                if(v1_3 == null) {
                    goto label_44;
                }
            }
            catch(Throwable v7) {
                goto label_61;
            }
        }

        try {
            ((Reader)v1_3).close();
        }
        catch(Throwable ) {
            goto label_46;
        }

    label_44:
        if((((InputStreamReader)v3_1)) == null) {
            goto label_46;
        }

        goto label_17;
    label_61:
        if(v1_3 != null) {
            try {
                ((Reader)v1_3).close();
            label_63:
                if((((InputStreamReader)v3_1)) != null) {
                    v3_1.close();
                }

                goto label_65;
            }
            catch(Throwable ) {
            label_65:
                throw v7;
            }
        }

        goto label_63;
        try {
        label_17:
            v3_1.close();
            goto label_46;
        }
        catch(Throwable ) {
        label_46:
            String v7_1 = v0.toString();
            try {
                new JSONObject(v7_1);
                return v7_1;
            }
            catch(JSONException ) {
                JSONObject v0_1 = new JSONObject();
                try {
                    v0_1.put("string_response", v7_1);
                    return v0_1.toString();
                }
                catch(JSONException ) {
                    return new JSONObject().toString();
                }
            }
        }
    }

    final Map ˎ(Context arg20, String arg21, String arg22, String arg23, String arg24, boolean arg25, SharedPreferences arg26, boolean arg27, @Nullable Intent arg28, @Nullable String arg29) {
        SharedPreferences v10_4;
        PackageInfo v3_4;
        SimpleDateFormat v6_7;
        Object v9_6;
        boolean v6_5;
        Throwable v3_1;
        StringBuilder v6_4;
        int v5_1;
        int v7_2;
        String v7_1;
        String v6_2;
        Exception v6_1;
        SharedPreferences$Editor v10_3;
        long v11_1;
        int v9_3;
        long v13;
        String v10;
        StringBuilder v9_2;
        AppsFlyerLib v1 = this;
        Context v2 = arg20;
        String v3 = arg21;
        String v4 = arg22;
        String v5 = arg23;
        SharedPreferences v6 = arg26;
        boolean v7 = arg27;
        HashMap v8 = new HashMap();
        n.ˎ(v2, ((Map)v8));
        long v9 = new Date().getTime();
        ((Map)v8).put("af_timestamp", Long.toString(v9));
        String v9_1 = com.appsflyer.a.ˏ(v2, v9);
        if(v9_1 != null) {
            ((Map)v8).put("cksm_v1", v9_1);
        }

        try {
            if(!this.isTrackingStopped()) {
                v9_2 = new StringBuilder("******* sendTrackingWithEvent: ");
                v10 = v7 ? "Launch" : v4;
                v9_2.append(v10);
                AFLogger.afInfoLog(v9_2.toString());
            }
            else {
                AFLogger.afInfoLog("SDK tracking has been stopped");
            }

            v9_1 = "AppsFlyer_4.9.0";
            v10 = "EVENT_CREATED_WITH_NAME";
            String v11 = v7 ? "Launch" : v4;
            AppsFlyerLib.ˋ(v2, v9_1, v10, v11);
            CacheManager.getInstance().init(v2);
            v9_1 = null;
            try {
                List v10_1 = Arrays.asList(arg20.getPackageManager().getPackageInfo(arg20.getPackageName(), 0x1000).requestedPermissions);
                if(!v10_1.contains("android.permission.INTERNET")) {
                    AFLogger.afWarnLog("Permission android.permission.INTERNET is missing in the AndroidManifest.xml");
                    AppsFlyerLib.ˋ(v2, v9_1, "PERMISSION_INTERNET_MISSING", v9_1);
                }

                if(!v10_1.contains("android.permission.ACCESS_NETWORK_STATE")) {
                    AFLogger.afWarnLog("Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml");
                }

                if(v10_1.contains("android.permission.ACCESS_WIFI_STATE")) {
                    goto label_73;
                }

                AFLogger.afWarnLog("Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml");
                goto label_73;
            }
            catch(Exception v0_1) {
                Exception v10_2 = v0_1;
                try {
                    AFLogger.afErrorLog("Exception while validation permissions. ", ((Throwable)v10_2));
                label_73:
                    if(arg25) {
                        ((Map)v8).put("af_events_api", "1");
                    }

                    ((Map)v8).put("brand", Build.BRAND);
                    ((Map)v8).put("device", Build.DEVICE);
                    ((Map)v8).put("product", Build.PRODUCT);
                    ((Map)v8).put("sdk", Integer.toString(Build$VERSION.SDK_INT));
                    ((Map)v8).put("model", Build.MODEL);
                    ((Map)v8).put("deviceType", Build.TYPE);
                    v13 = 0;
                    if(v7) {
                        if((arg20.getApplicationContext().getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ 1) != 0) {
                            if(!AppsFlyerProperties.getInstance().isOtherSdkStringDisabled()) {
                                ((Map)v8).put("batteryLevel", String.valueOf(AppsFlyerLib.ʽ(arg20)));
                            }

                            if("OPPO".equals(Build.BRAND)) {
                                v9_3 = 23;
                                AFLogger.afRDLog("OPPO device found");
                            }
                            else {
                                v9_3 = 18;
                            }

                            if(Build$VERSION.SDK_INT >= v9_3 && !AppsFlyerProperties.getInstance().getBoolean("keyPropDisableAFKeystore", false)) {
                                v9_2 = new StringBuilder("OS SDK is=");
                                v9_2.append(Build$VERSION.SDK_INT);
                                v9_2.append("; use KeyStore");
                                AFLogger.afRDLog(v9_2.toString());
                                AFKeystoreWrapper v9_4 = new AFKeystoreWrapper(v2);
                                if(!v9_4.ˎ()) {
                                    v9_4.ॱ(r.ˏ(new WeakReference(v2)));
                                }
                                else {
                                    v9_4.ˊ();
                                }

                                AppsFlyerProperties.getInstance().set("KSAppsFlyerId", v9_4.ॱ());
                                AppsFlyerProperties.getInstance().set("KSAppsFlyerRICounter", String.valueOf(v9_4.ˋ()));
                                goto label_167;
                            }

                            v9_2 = new StringBuilder("OS SDK is=");
                            v9_2.append(Build$VERSION.SDK_INT);
                            v9_2.append("; no KeyStore usage");
                            AFLogger.afRDLog(v9_2.toString());
                        }

                    label_167:
                        v9_1 = "timepassedsincelastlaunch";
                        long v17 = arg20.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getLong("AppsFlyerTimePassedSincePrevLaunch", v13);
                        v11_1 = System.currentTimeMillis();
                        AppsFlyerLib.ˎ(v2, "AppsFlyerTimePassedSincePrevLaunch", v11_1);
                        v11_1 = v17 > v13 ? (v11_1 - v17) / 1000 : -1;
                        ((Map)v8).put(v9_1, Long.toString(v11_1));
                        v9_1 = AppsFlyerProperties.getInstance().getString("oneLinkSlug");
                        if(v9_1 != null) {
                            ((Map)v8).put("onelink_id", v9_1);
                            ((Map)v8).put("ol_ver", AppsFlyerProperties.getInstance().getString("onelinkVersion"));
                        }

                        v9 = v6.getLong("appsflyerGetConversionDataTiming", v13);
                        if(v9 <= v13) {
                            goto label_259;
                        }

                        ((Map)v8).put("gcd_timing", Long.toString(v9));
                        v10_3 = arg26.edit();
                        v10_3.putLong("appsflyerGetConversionDataTiming", v13);
                        if(Build$VERSION.SDK_INT >= 9) {
                            v10_3.apply();
                            goto label_259;
                        }

                        v10_3.commit();
                        goto label_259;
                    }

                    SharedPreferences v9_5 = arg20.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    v10_3 = v9_5.edit();
                    try {
                        v11 = v9_5.getString("prev_event_name", null);
                        if(v11 != null) {
                            JSONObject v12 = new JSONObject();
                            v12.put("prev_event_timestamp", v9_5.getLong("prev_event_timestamp", -1));
                            v12.put("prev_event_value", v9_5.getString("prev_event_value", null));
                            v12.put("prev_event_name", v11);
                            ((Map)v8).put("prev_event", v12.toString());
                        }

                        v10_3.putString("prev_event_name", v4);
                        v10_3.putString("prev_event_value", v5);
                        v10_3.putLong("prev_event_timestamp", System.currentTimeMillis());
                        if(Build$VERSION.SDK_INT >= 9) {
                            v10_3.apply();
                            goto label_259;
                        }

                        v10_3.commit();
                        goto label_259;
                    }
                    catch(Exception v0_1) {
                        v6_1 = v0_1;
                        try {
                            AFLogger.afErrorLog("Error while processing previous event.", ((Throwable)v6_1));
                        label_259:
                            v6_2 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
                            v7_1 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
                            if(v6_2 != null && v7_1 != null && Integer.valueOf(v7_1).intValue() > 0) {
                                ((Map)v8).put("reinstallCounter", v7_1);
                                ((Map)v8).put("originalAppsflyerId", v6_2);
                            }

                            v6_2 = AppsFlyerProperties.getInstance().getString("additionalCustomData");
                            if(v6_2 != null) {
                                ((Map)v8).put("customData", v6_2);
                            }

                            try {
                                v6_2 = arg20.getPackageManager().getInstallerPackageName(arg20.getPackageName());
                                if(v6_2 == null) {
                                    goto label_291;
                                }

                                ((Map)v8).put("installer_package", v6_2);
                                goto label_291;
                            }
                            catch(Exception v0_1) {
                                v6_1 = v0_1;
                                try {
                                    AFLogger.afErrorLog("Exception while getting the app\'s installer package. ", ((Throwable)v6_1));
                                label_291:
                                    v6_2 = AppsFlyerProperties.getInstance().getString("sdkExtension");
                                    if(v6_2 != null && v6_2.length() > 0) {
                                        ((Map)v8).put("sdkExtension", v6_2);
                                    }

                                    v6_2 = AppsFlyerLib.ˋ(new WeakReference(v2));
                                    v7_1 = AppsFlyerLib.ᐝ(v2, v6_2);
                                    if(v7_1 != null) {
                                        ((Map)v8).put("channel", v7_1);
                                    }

                                    if(v7_1 != null && !v7_1.equals(v6_2) || v7_1 == null && v6_2 != null) {
                                        ((Map)v8).put("af_latestchannel", v6_2);
                                    }

                                    v6 = arg20.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                                    if(v6.contains("INSTALL_STORE")) {
                                        v6_2 = v6.getString("INSTALL_STORE", null);
                                    }
                                    else {
                                        v6_2 = (arg20.getApplicationContext().getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ 1) != 0 ? AppsFlyerLib.ʼ(arg20) : null;
                                        AppsFlyerLib.ˎ(v2, "INSTALL_STORE", v6_2);
                                    }

                                    if(v6_2 != null) {
                                        ((Map)v8).put("af_installstore", v6_2.toLowerCase());
                                    }

                                    v6 = arg20.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                                    v7_1 = AppsFlyerProperties.getInstance().getString("preInstallName");
                                    if(v7_1 == null) {
                                        if(v6.contains("preInstallName")) {
                                            v7_1 = v6.getString("preInstallName", null);
                                        }
                                        else {
                                            if((arg20.getApplicationContext().getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ 1) != 0) {
                                                File v6_3 = AppsFlyerLib.ॱ(AppsFlyerLib.ˏ("ro.appsflyer.preinstall.path"));
                                                v7_2 = v6_3 == null || !v6_3.exists() ? 1 : 0;
                                                if(v7_2 != 0) {
                                                    v6_3 = AppsFlyerLib.ॱ(AppsFlyerLib.ˋ("AF_PRE_INSTALL_PATH", arg20.getPackageManager(), arg20.getPackageName()));
                                                }

                                                v7_2 = v6_3 == null || !v6_3.exists() ? 1 : 0;
                                                if(v7_2 != 0) {
                                                    v6_3 = AppsFlyerLib.ॱ("/data/local/tmp/pre_install.appsflyer");
                                                }

                                                v7_2 = v6_3 == null || !v6_3.exists() ? 1 : 0;
                                                if(v7_2 != 0) {
                                                    v6_3 = AppsFlyerLib.ॱ("/etc/pre_install.appsflyer");
                                                }

                                                v7_2 = v6_3 == null || !v6_3.exists() ? 1 : 0;
                                                if(v7_2 == 0) {
                                                    v9_1 = AppsFlyerLib.ॱ(v6_3, arg20.getPackageName());
                                                    if(v9_1 != null) {
                                                        v7_1 = v9_1;
                                                    }
                                                    else {
                                                        goto label_417;
                                                    }
                                                }
                                                else {
                                                label_417:
                                                    v7_1 = null;
                                                }

                                                if(v7_1 != null) {
                                                    goto label_424;
                                                }

                                                v7_1 = AppsFlyerLib.ˎ(new WeakReference(v2), "AF_PRE_INSTALL_NAME");
                                            }

                                        label_424:
                                            if(v7_1 == null) {
                                                goto label_427;
                                            }

                                            AppsFlyerLib.ˎ(v2, "preInstallName", v7_1);
                                        }

                                    label_427:
                                        if(v7_1 == null) {
                                            goto label_431;
                                        }

                                        AppsFlyerProperties.getInstance().set("preInstallName", v7_1);
                                    }

                                label_431:
                                    if(v7_1 != null) {
                                        ((Map)v8).put("af_preinstall_name", v7_1.toLowerCase());
                                    }

                                    v6_2 = AppsFlyerLib.ʼ(arg20);
                                    if(v6_2 != null) {
                                        ((Map)v8).put("af_currentstore", v6_2.toLowerCase());
                                    }

                                    if(v3 == null || arg21.length() < 0) {
                                        v3 = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
                                        if(v3 != null && v3.length() >= 0) {
                                            ((Map)v8).put("appsflyerKey", v3);
                                            goto label_454;
                                        }

                                        goto label_1153;
                                    }
                                    else {
                                        ((Map)v8).put("appsflyerKey", v3);
                                    }

                                label_454:
                                    v3 = AppsFlyerProperties.getInstance().getString("AppUserId");
                                    if(v3 != null) {
                                        ((Map)v8).put("appUserId", v3);
                                    }

                                    v3 = AppsFlyerProperties.getInstance().getString("userEmails");
                                    if(v3 != null) {
                                        ((Map)v8).put("user_emails", v3);
                                    }
                                    else {
                                        v3 = AppsFlyerProperties.getInstance().getString("userEmail");
                                        if(v3 != null) {
                                            ((Map)v8).put("sha1_el", p.ˊ(v3));
                                        }
                                    }

                                    if(v4 != null) {
                                        ((Map)v8).put("eventName", v4);
                                        if(v5 != null) {
                                            ((Map)v8).put("eventValue", v5);
                                        }
                                    }

                                    if(AppsFlyerProperties.getInstance().getString("appid") != null) {
                                        ((Map)v8).put("appid", AppsFlyerProperties.getInstance().getString("appid"));
                                    }

                                    v3 = AppsFlyerProperties.getInstance().getString("currencyCode");
                                    v5_1 = 3;
                                    if(v3 != null) {
                                        if(v3.length() != v5_1) {
                                            v6_4 = new StringBuilder("WARNING: currency code should be 3 characters!!! \'");
                                            v6_4.append(v3);
                                            v6_4.append("\' is not a legal value.");
                                            AFLogger.afWarnLog(v6_4.toString());
                                        }

                                        ((Map)v8).put("currency", v3);
                                    }

                                    v3 = AppsFlyerProperties.getInstance().getString("IS_UPDATE");
                                    if(v3 != null) {
                                        ((Map)v8).put("isUpdate", v3);
                                    }

                                    ((Map)v8).put("af_preinstalled", Boolean.toString(this.isPreInstalledApp(arg20)));
                                    if(!AppsFlyerProperties.getInstance().getBoolean("collectFacebookAttrId", true)) {
                                        goto label_540;
                                    }
                                }
                                catch(Throwable v0) {
                                    goto label_1165;
                                }
                            }
                        }
                        catch(Throwable v0) {
                            goto label_1165;
                        }
                    }
                }
                catch(Throwable v0) {
                    goto label_1165;
                }
            }
        }
        catch(Throwable v0) {
            goto label_1165;
        }

        try {
            arg20.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
            v9_1 = v1.getAttributionId(arg20.getContentResolver());
            goto label_537;
        }
        catch(Throwable v0) {
            v3_1 = v0;
            try {
                AFLogger.afErrorLog("Exception while collecting facebook\'s attribution ID. ", v3_1);
            label_532:
                v9_1 = null;
            label_537:
                if(v9_1 != null) {
                    ((Map)v8).put("fb", v9_1);
                }

            label_540:
                if(AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
                    ((Map)v8).put("deviceTrackingDisabled", "true");
                    goto label_673;
                }

                SharedPreferences v3_2 = arg20.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                v6_5 = AppsFlyerProperties.getInstance().getBoolean("collectIMEI", true);
                v7_1 = v3_2.getString("imeiCached", null);
                if(!v6_5) {
                    goto label_609;
                }
                else if(!TextUtils.isEmpty(v1.ॱ)) {
                    goto label_609;
                }
                else if(AppsFlyerLib.ॱॱ(arg20)) {
                    try {
                        Object v6_6 = v2.getSystemService("phone");
                        v9_6 = v6_6.getClass().getMethod("getDeviceId").invoke(v6_6);
                        if(v9_6 != null) {
                            goto label_614;
                        }
                        else if(v7_1 != null) {
                            AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(v7_1)));
                            v9_1 = v7_1;
                            goto label_614;
                        }

                        goto label_613;
                    }
                    catch(Exception v0_1) {
                        v6_1 = v0_1;
                        if(v7_1 != null) {
                            try {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(v7_1)));
                                v9_1 = v7_1;
                                goto label_595;
                            label_594:
                                v9_6 = null;
                            label_595:
                                AFLogger.afErrorLog("WARNING: other reason: ", ((Throwable)v6_1));
                                goto label_614;
                            label_609:
                                if(v1.ॱ != null) {
                                    v9_1 = v1.ॱ;
                                }
                                else {
                                label_613:
                                    v9_6 = null;
                                }

                            label_614:
                                if(v9_1 != null) {
                                    AppsFlyerLib.ˎ(v2, "imeiCached", v9_1);
                                    ((Map)v8).put("imei", v9_1);
                                }
                                else {
                                    AFLogger.afInfoLog("IMEI was not collected.");
                                }

                                v6_5 = AppsFlyerProperties.getInstance().getBoolean("collectAndroidId", true);
                                v3 = v3_2.getString("androidIdCached", null);
                                if(!v6_5) {
                                    goto label_660;
                                }
                                else if(!TextUtils.isEmpty(v1.ˋ)) {
                                    goto label_660;
                                }
                                else if(AppsFlyerLib.ॱॱ(arg20)) {
                                    try {
                                        v9_1 = Settings$Secure.getString(arg20.getContentResolver(), "android_id");
                                        if(v9_1 != null) {
                                            goto label_665;
                                        }
                                        else if(v3 != null) {
                                            AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(v3)));
                                            v9_1 = v3;
                                            goto label_665;
                                        }

                                        goto label_664;
                                    }
                                    catch(Exception v0_1) {
                                        v6_1 = v0_1;
                                        if(v3 != null) {
                                            try {
                                                AFLogger.afDebugLog("use cached AndroidId: ".concat(String.valueOf(v3)));
                                                v9_1 = v3;
                                                goto label_657;
                                            label_656:
                                                v9_1 = null;
                                            label_657:
                                                AFLogger.afErrorLog(((Throwable)v6_1).getMessage(), ((Throwable)v6_1));
                                                goto label_665;
                                            label_660:
                                                if(v1.ˋ != null) {
                                                    v9_1 = v1.ˋ;
                                                }
                                                else {
                                                label_664:
                                                    v9_1 = null;
                                                }

                                            label_665:
                                                if(v9_1 != null) {
                                                    AppsFlyerLib.ˎ(v2, "androidIdCached", v9_1);
                                                    ((Map)v8).put("android_id", v9_1);
                                                    goto label_673;
                                                }

                                                AFLogger.afInfoLog("Android ID was not collected.");
                                                try {
                                                label_673:
                                                    v3 = r.ˏ(new WeakReference(v2));
                                                    if(v3 == null) {
                                                        goto label_689;
                                                    }

                                                    ((Map)v8).put("uid", v3);
                                                    goto label_689;
                                                }
                                                catch(Exception v0_1) {
                                                    Exception v3_3 = v0_1;
                                                    try {
                                                        v6_4 = new StringBuilder("ERROR: could not get uid ");
                                                        v6_4.append(((Throwable)v3_3).getMessage());
                                                        AFLogger.afErrorLog(v6_4.toString(), ((Throwable)v3_3));
                                                        try {
                                                        label_689:
                                                            ((Map)v8).put("lang", Locale.getDefault().getDisplayLanguage());
                                                            goto label_698;
                                                        }
                                                        catch(Exception v0_1) {
                                                            v3_3 = v0_1;
                                                            try {
                                                                AFLogger.afErrorLog("Exception while collecting display language name. ", ((Throwable)v3_3));
                                                                try {
                                                                label_698:
                                                                    ((Map)v8).put("lang_code", Locale.getDefault().getLanguage());
                                                                    goto label_707;
                                                                }
                                                                catch(Exception v0_1) {
                                                                    v3_3 = v0_1;
                                                                    try {
                                                                        AFLogger.afErrorLog("Exception while collecting display language code. ", ((Throwable)v3_3));
                                                                        try {
                                                                        label_707:
                                                                            ((Map)v8).put("country", Locale.getDefault().getCountry());
                                                                            goto label_716;
                                                                        }
                                                                        catch(Exception v0_1) {
                                                                            v3_3 = v0_1;
                                                                            try {
                                                                                AFLogger.afErrorLog("Exception while collecting country name. ", ((Throwable)v3_3));
                                                                            label_716:
                                                                                ((Map)v8).put("platformextension", v1.ˋˋ.ˎ());
                                                                                AppsFlyerLib.ˏ(v2, ((Map)v8));
                                                                                v6_7 = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
                                                                                try {
                                                                                    v9 = arg20.getPackageManager().getPackageInfo(arg20.getPackageName(), 0).firstInstallTime;
                                                                                    ((DateFormat)v6_7).setTimeZone(TimeZone.getTimeZone("UTC"));
                                                                                    ((Map)v8).put("installDate", ((DateFormat)v6_7).format(new Date(v9)));
                                                                                    goto label_743;
                                                                                }
                                                                                catch(Exception v0_1) {
                                                                                    v3_3 = v0_1;
                                                                                    try {
                                                                                        AFLogger.afErrorLog("Exception while collecting install date. ", ((Throwable)v3_3));
                                                                                        goto label_743;
                                                                                    }
                                                                                    catch(Throwable v0) {
                                                                                        goto label_1165;
                                                                                    }
                                                                                }
                                                                            }
                                                                            catch(Throwable v0) {
                                                                                goto label_1165;
                                                                            }
                                                                        }
                                                                    }
                                                                    catch(Throwable v0) {
                                                                        goto label_1165;
                                                                    }
                                                                }
                                                            }
                                                            catch(Throwable v0) {
                                                                goto label_1165;
                                                            }
                                                        }
                                                    }
                                                    catch(Throwable v0) {
                                                        goto label_1165;
                                                    }
                                                }
                                            }
                                            catch(Throwable v0) {
                                                goto label_1165;
                                            }
                                        }
                                        else {
                                            goto label_656;
                                        }

                                        goto label_657;
                                    }
                                }

                                goto label_664;
                            }
                            catch(Throwable v0) {
                                goto label_1165;
                            }
                        }
                        else {
                            goto label_594;
                        }

                        goto label_595;
                    }
                    catch(InvocationTargetException ) {
                        try {
                            if(v7_1 != null) {
                                AFLogger.afDebugLog("use cached IMEI: ".concat(String.valueOf(v7_1)));
                                v9_1 = v7_1;
                            }
                            else {
                                v9_6 = null;
                            }

                            AFLogger.afWarnLog("WARNING: READ_PHONE_STATE is missing.");
                            goto label_614;
                        }
                        catch(Throwable v0) {
                            goto label_1165;
                        }
                    }
                }

                goto label_613;
            }
            catch(Throwable v0) {
                goto label_1165;
            }
        }
        catch(PackageManager$NameNotFoundException ) {
            try {
                AFLogger.afWarnLog("Exception while collecting facebook\'s attribution ID. ");
                goto label_532;
            }
            catch(Throwable v0) {
                goto label_1165;
            }
        }

        try {
        label_743:
            v3_4 = arg20.getPackageManager().getPackageInfo(arg20.getPackageName(), 0);
            v7_1 = "versionCode";
            v10_4 = arg26;
        }
        catch(Throwable v0) {
            v10_4 = arg26;
            goto label_818;
        }

        try {
            if(v3_4.versionCode > v10_4.getInt(v7_1, 0)) {
                AppsFlyerLib.ˏ(v2, "appsflyerConversionDataRequestRetries", 0);
                AppsFlyerLib.ˏ(v2, "versionCode", v3_4.versionCode);
            }

            ((Map)v8).put("app_version_code", Integer.toString(v3_4.versionCode));
            ((Map)v8).put("app_version_name", v3_4.versionName);
            v11_1 = v3_4.firstInstallTime;
            v13 = v3_4.lastUpdateTime;
            ((DateFormat)v6_7).setTimeZone(TimeZone.getTimeZone("UTC"));
            ((Map)v8).put("date1", ((DateFormat)v6_7).format(new Date(v11_1)));
            ((DateFormat)v6_7).setTimeZone(TimeZone.getTimeZone("UTC"));
            ((Map)v8).put("date2", ((DateFormat)v6_7).format(new Date(v13)));
            v3 = arg20.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("appsFlyerFirstInstall", null);
            if(v3 == null) {
                if((arg20.getApplicationContext().getSharedPreferences("appsflyer-data", 0).contains("appsFlyerCount") ^ 1) != 0) {
                    AFLogger.afDebugLog("AppsFlyer: first launch detected");
                    v3 = ((DateFormat)v6_7).format(new Date());
                }
                else {
                    v3 = "";
                }

                AppsFlyerLib.ˎ(v2, "appsFlyerFirstInstall", v3);
            }

            AFLogger.afInfoLog("AppsFlyer: first launch date: ".concat(String.valueOf(v3)));
            ((Map)v8).put("firstLaunchDate", v3);
            goto label_821;
        }
        catch(Throwable v0) {
        }

    label_818:
        v3_1 = v0;
        try {
            AFLogger.afErrorLog("Exception while collecting app version data ", v3_1);
        label_821:
            if(arg24.length() > 0) {
                ((Map)v8).put("referrer", arg24);
            }

            v3 = v10_4.getString("extraReferrers", null);
            if(v3 != null) {
                ((Map)v8).put("extraReferrers", v3);
            }

            v3 = AppsFlyerProperties.getInstance().getString("afUninstallToken");
            if(v3 != null) {
                ((Map)v8).put("af_gcm_token", com.appsflyer.a$e$b.ˏ(v3).ˋ());
            }

            v1.ˍ = y.ˋ(arg20);
            StringBuilder v3_5 = new StringBuilder("didConfigureTokenRefreshService=");
            v3_5.append(v1.ˍ);
            AFLogger.afDebugLog(v3_5.toString());
            if(!v1.ˍ) {
                ((Map)v8).put("tokenRefreshConfigured", Boolean.FALSE);
            }

            boolean v3_6 = arg27;
            if(v3_6) {
                AFDeepLinkManager.getInstance().processIntentForDeepLink(arg28, v2, ((Map)v8));
                if(v1.ˋˊ != null) {
                    JSONObject v6_8 = new JSONObject(v1.ˋˊ);
                    v6_8.put("isPush", "true");
                    ((Map)v8).put("af_deeplink", v6_8.toString());
                }

                v1.ˋˊ = null;
                ((Map)v8).put("open_referrer", arg29);
            }

            if(v1.ˊˋ) {
                ((Map)v8).put("testAppMode_retargeting", "true");
                AppsFlyerLib.ˊ(v2, new JSONObject(((Map)v8)).toString());
                AFLogger.afInfoLog("Sent retargeting params to test app");
            }

            long v6_9 = System.currentTimeMillis() - v1.ˊᐝ;
            v9_1 = AppsFlyerProperties.getInstance().getReferrer(v2);
            int v6_10 = v6_9 > 30000 || v9_1 == null || !v9_1.contains("AppsFlyer_Test") ? 0 : 1;
            if(v6_10 != 0) {
                ((Map)v8).put("testAppMode", "true");
                AppsFlyerLib.ˊ(v2, new JSONObject(((Map)v8)).toString());
                AFLogger.afInfoLog("Sent params to test app");
                AFLogger.afInfoLog("Test mode ended!");
                v1.ˊᐝ = 0;
            }

            if(AppsFlyerProperties.getInstance().getString("advertiserId") == null) {
                n.ˎ(v2, ((Map)v8));
                if(AppsFlyerProperties.getInstance().getString("advertiserId") != null) {
                    ((Map)v8).put("GAID_retry", "true");
                }
                else {
                    ((Map)v8).put("GAID_retry", "false");
                }
            }

            l v6_11 = n.ॱ(arg20.getContentResolver());
            if(v6_11 != null) {
                ((Map)v8).put("amazon_aid", v6_11.ˎ());
                ((Map)v8).put("amazon_aid_limit", String.valueOf(v6_11.ˏ()));
            }

            v6_2 = AppsFlyerProperties.getInstance().getReferrer(v2);
            if(v6_2 != null && v6_2.length() > 0 && ((Map)v8).get("referrer") == null) {
                ((Map)v8).put("referrer", v6_2);
            }

            v6_5 = "true".equals(v10_4.getString("sentSuccessfully", ""));
            ((Map)v8).put("registeredUninstall", Boolean.valueOf(v10_4.getBoolean("sentRegisterRequestToAF", false)));
            v7_2 = AppsFlyerLib.ˎ(v10_4, "appsFlyerCount", v3_6);
            ((Map)v8).put("counter", Integer.toString(v7_2));
            v9_1 = "iaecounter";
            boolean v4_1 = v4 != null ? true : false;
            ((Map)v8).put(v9_1, Integer.toString(AppsFlyerLib.ˎ(v10_4, "appsFlyerInAppEventCount", v4_1)));
            if((v3_6) && v7_2 == 1) {
                AppsFlyerProperties.getInstance().setFirstLaunchCalled();
                if(AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) {
                    ((Map)v8).put("wait_cid", Boolean.toString(true));
                }
            }

            ((Map)v8).put("isFirstCall", Boolean.toString((((int)v6_5)) ^ 1));
            HashMap v4_2 = new HashMap();
            ((Map)v4_2).put("cpu_abi", AppsFlyerLib.ˏ("ro.product.cpu.abi"));
            ((Map)v4_2).put("cpu_abi2", AppsFlyerLib.ˏ("ro.product.cpu.abi2"));
            ((Map)v4_2).put("arch", AppsFlyerLib.ˏ("os.arch"));
            ((Map)v4_2).put("build_display_id", AppsFlyerLib.ˏ("ro.build.display.id"));
            if(v3_6) {
                if(v1.ˊˊ) {
                    Location v3_7 = com.appsflyer.b.ॱ(arg20);
                    HashMap v6_12 = new HashMap(v5_1);
                    if(v3_7 != null) {
                        ((Map)v6_12).put("lat", String.valueOf(v3_7.getLatitude()));
                        ((Map)v6_12).put("lon", String.valueOf(v3_7.getLongitude()));
                        ((Map)v6_12).put("ts", String.valueOf(v3_7.getTime()));
                    }

                    if(((Map)v6_12).isEmpty()) {
                        goto label_1037;
                    }

                    ((Map)v4_2).put("loc", v6_12);
                }

            label_1037:
                com.appsflyer.c$d v3_8 = com.appsflyer.c$a.ˏ.ˎ(v2);
                ((Map)v4_2).put("btl", Float.toString(v3_8.ˏ()));
                if(v3_8.ˎ() != null) {
                    ((Map)v4_2).put("btch", v3_8.ˎ());
                }

                if(2 < v7_2) {
                    goto label_1056;
                }

                List v3_9 = i.ˏ(arg20).ˋ();
                if(v3_9.isEmpty()) {
                    goto label_1056;
                }

                ((Map)v4_2).put("sensors", v3_9);
            }

        label_1056:
            ((Map)v4_2).put("dim", AFScreenManager.getScreenMetrics(arg20));
            ((Map)v8).put("deviceData", v4_2);
            new p();
            Object v3_10 = ((Map)v8).get("appsflyerKey");
            Object v4_3 = ((Map)v8).get("af_timestamp");
            Object v5_2 = ((Map)v8).get("uid");
            v6_4 = new StringBuilder();
            v6_4.append(((String)v3_10).substring(0, 7));
            v6_4.append(((String)v5_2).substring(0, 7));
            v6_4.append(((String)v4_3).substring(((String)v4_3).length() - 7));
            ((Map)v8).put("af_v", p.ˊ(v6_4.toString()));
            new p();
            v3_10 = ((Map)v8).get("appsflyerKey");
            v3 = (((String)v3_10)) + ((Map)v8).get("af_timestamp");
            v3 = v3 + ((Map)v8).get("uid");
            v3 = v3 + ((Map)v8).get("installDate");
            v3 = v3 + ((Map)v8).get("counter");
            v4_4 = new StringBuilder();
            v4_4.append(v3);
            v4_4.append(((Map)v8).get("iaecounter"));
            ((Map)v8).put("af_v2", p.ˊ(p.ॱ(v4_4.toString())));
            ((Map)v8).put("ivc", Boolean.valueOf(AppsFlyerLib.ʻ(arg20)));
            if(v10_4.contains("is_stop_tracking_used")) {
                ((Map)v8).put("istu", String.valueOf(v10_4.getBoolean("is_stop_tracking_used", false)));
            }

            if(AppsFlyerProperties.getInstance().getObject("consumeAfDeepLink") == null) {
                goto label_1166;
            }

            ((Map)v8).put("is_dp_api", String.valueOf(AppsFlyerProperties.getInstance().getBoolean("consumeAfDeepLink", false)));
            goto label_1166;
        label_1153:
            AFLogger.afInfoLog("AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. ");
            AppsFlyerLib.ˋ(v2, "AppsFlyer_4.9.0", "DEV_KEY_MISSING", null);
            AFLogger.afInfoLog("AppsFlyer will not track this event.");
            return null;
        }
        catch(Throwable v0) {
        label_1165:
            AFLogger.afErrorLog(v0.getLocalizedMessage(), v0);
        }

    label_1166:
        return ((Map)v8);
    }

    final void ˎ(Context arg11, String arg12) {
        int v0 = !AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false) || AppsFlyerProperties.getInstance().getString("AppUserId") != null ? 0 : 1;
        if(v0 != 0) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }

        HashMap v0_1 = new HashMap();
        String v3 = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
        if(v3 == null) {
            AFLogger.afWarnLog("[registerUninstall] AppsFlyer\'s SDK cannot send any event without providing DevKey.");
            return;
        }

        PackageManager v4 = arg11.getPackageManager();
        String v5 = arg11.getPackageName();
        try {
            PackageInfo v6 = v4.getPackageInfo(v5, 0);
            ((Map)v0_1).put("app_version_code", Integer.toString(v6.versionCode));
            ((Map)v0_1).put("app_version_name", v6.versionName);
            ((Map)v0_1).put("app_name", v4.getApplicationLabel(v6.applicationInfo).toString());
            long v6_1 = v6.firstInstallTime;
            SimpleDateFormat v8 = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            ((DateFormat)v8).setTimeZone(TimeZone.getTimeZone("UTC"));
            ((Map)v0_1).put("installDate", ((DateFormat)v8).format(new Date(v6_1)));
        }
        catch(Throwable v4_1) {
            AFLogger.afErrorLog("Exception while collecting application version info.", v4_1);
        }

        AppsFlyerLib.ˏ(arg11, ((Map)v0_1));
        String v4_2 = AppsFlyerProperties.getInstance().getString("AppUserId");
        if(v4_2 != null) {
            ((Map)v0_1).put("appUserId", v4_2);
        }

        try {
            ((Map)v0_1).put("model", Build.MODEL);
            ((Map)v0_1).put("brand", Build.BRAND);
        }
        catch(Throwable v4_1) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", v4_1);
        }

        if(AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
            ((Map)v0_1).put("deviceTrackingDisabled", "true");
        }

        l v4_3 = n.ॱ(arg11.getContentResolver());
        if(v4_3 != null) {
            ((Map)v0_1).put("amazon_aid", v4_3.ˎ());
            ((Map)v0_1).put("amazon_aid_limit", String.valueOf(v4_3.ˏ()));
        }

        v4_2 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if(v4_2 != null) {
            ((Map)v0_1).put("advertiserId", v4_2);
        }

        ((Map)v0_1).put("devkey", v3);
        ((Map)v0_1).put("uid", r.ˏ(new WeakReference(arg11)));
        ((Map)v0_1).put("af_gcm_token", arg12);
        ((Map)v0_1).put("launch_counter", Integer.toString(AppsFlyerLib.ˎ(arg11.getApplicationContext().getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false)));
        ((Map)v0_1).put("sdk", Integer.toString(Build$VERSION.SDK_INT));
        arg12 = AppsFlyerLib.ˋ(new WeakReference(arg11));
        if(arg12 != null) {
            ((Map)v0_1).put("channel", arg12);
        }

        try {
            o v12 = new o(arg11, this.isTrackingStopped());
            v12.ˊ = ((Map)v0_1);
            StringBuilder v11_1 = new StringBuilder();
            v11_1.append(ServerConfigHandler.getUrl(AppsFlyerLib.ˊ));
            v11_1.append(v5);
            ((AsyncTask)v12).execute(new String[]{v11_1.toString()});
            return;
        }
        catch(Throwable v11) {
            AFLogger.afErrorLog(v11.getMessage(), v11);
            return;
        }
    }

    @Nullable private static String ˎ(WeakReference arg1, String arg2) {
        if(((Reference)arg1).get() == null) {
            return null;
        }

        return AppsFlyerLib.ˋ(arg2, ((Reference)arg1).get().getPackageManager(), ((Reference)arg1).get().getPackageName());
    }

    private static int ˎ(SharedPreferences arg1, String arg2, boolean arg3) {
        int v0 = arg1.getInt(arg2, 0);
        if(arg3) {
            ++v0;
            SharedPreferences$Editor v1 = arg1.edit();
            v1.putInt(arg2, v0);
            if(Build$VERSION.SDK_INT >= 9) {
                v1.apply();
            }
            else {
                v1.commit();
            }
        }

        if(s.ˏ().ʻ()) {
            s.ˏ().ˎ(String.valueOf(v0));
        }

        return v0;
    }

    private static void ˎ(Context arg2, String arg3, String arg4) {
        SharedPreferences$Editor v2 = arg2.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        v2.putString(arg3, arg4);
        if(Build$VERSION.SDK_INT >= 9) {
            v2.apply();
            return;
        }

        v2.commit();
    }

    private static void ˎ(Context arg2, String arg3, long arg4) {
        SharedPreferences$Editor v2 = arg2.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        v2.putLong(arg3, arg4);
        if(Build$VERSION.SDK_INT >= 9) {
            v2.apply();
            return;
        }

        v2.commit();
    }

    static String ˎ(WeakReference arg0) {
        return AppsFlyerLib.ˋ(arg0);
    }

    static List ˎ() {
        return AppsFlyerLib.ˊॱ;
    }

    static Map ˎ(AppsFlyerLib arg0) {
        return arg0.ᐝॱ;
    }

    static Map ˎ(String arg0) {
        return AppsFlyerLib.ˋ(arg0);
    }

    static void ˎ(Context arg0, String arg1, int arg2) {
        AppsFlyerLib.ˏ(arg0, arg1, arg2);
    }

    final void ˏ(WeakReference arg11) {
        if(((Reference)arg11).get() == null) {
            return;
        }

        AFLogger.afInfoLog("app went to background");
        SharedPreferences v0 = ((Reference)arg11).get().getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        AppsFlyerProperties.getInstance().saveProperties(v0);
        long v3 = this.ʾ - this.ˈ;
        HashMap v1 = new HashMap();
        String v5 = AppsFlyerProperties.getInstance().getString("AppsFlyerKey");
        if(v5 == null) {
            AFLogger.afWarnLog("[callStats] AppsFlyer\'s SDK cannot send any event without providing DevKey.");
            return;
        }

        String v6 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
        if(AppsFlyerProperties.getInstance().getBoolean("deviceTrackingDisabled", false)) {
            ((Map)v1).put("deviceTrackingDisabled", "true");
        }

        l v7 = n.ॱ(((Reference)arg11).get().getContentResolver());
        if(v7 != null) {
            ((Map)v1).put("amazon_aid", v7.ˎ());
            ((Map)v1).put("amazon_aid_limit", String.valueOf(v7.ˏ()));
        }

        String v7_1 = AppsFlyerProperties.getInstance().getString("advertiserId");
        if(v7_1 != null) {
            ((Map)v1).put("advertiserId", v7_1);
        }

        ((Map)v1).put("app_id", ((Reference)arg11).get().getPackageName());
        ((Map)v1).put("devkey", v5);
        ((Map)v1).put("uid", r.ˏ(arg11));
        ((Map)v1).put("time_in_app", String.valueOf(v3 / 1000));
        ((Map)v1).put("statType", "user_closed_app");
        ((Map)v1).put("platform", "Android");
        ((Map)v1).put("launch_counter", Integer.toString(AppsFlyerLib.ˎ(v0, "appsFlyerCount", false)));
        ((Map)v1).put("channel", AppsFlyerLib.ˋ(arg11));
        String v11 = "originalAppsflyerId";
        if(v6 != null) {
        }
        else {
            v6 = "";
        }

        ((Map)v1).put(v11, v6);
        if(this.ˋᐝ) {
            try {
                o v11_2 = new o(null, this.isTrackingStopped());
                v11_2.ˊ = ((Map)v1);
                if(Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    AFLogger.afDebugLog("Main thread detected. Running callStats task in a new thread.");
                    ((AsyncTask)v11_2).execute(new String[]{ServerConfigHandler.getUrl("https://%sstats.%s/stats")});
                    return;
                }

                StringBuilder v0_1 = new StringBuilder("Running callStats task (on current thread: ");
                v0_1.append(Thread.currentThread().toString());
                v0_1.append(" )");
                AFLogger.afDebugLog(v0_1.toString());
                v11_2.onPreExecute();
                v11_2.ˋ(v11_2.ˋ(new String[]{ServerConfigHandler.getUrl("https://%sstats.%s/stats")}));
                return;
            }
            catch(Throwable v11_1) {
                AFLogger.afErrorLog("Could not send callStats request", v11_1);
                return;
            }
        }

        AFLogger.afDebugLog("Stats call is disabled, ignore ...");
    }

    final void ˏ() {
        this.ˈ = System.currentTimeMillis();
    }

    private static void ˏ(Context arg2, String arg3, int arg4) {
        SharedPreferences$Editor v2 = arg2.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        v2.putInt(arg3, arg4);
        if(Build$VERSION.SDK_INT >= 9) {
            v2.apply();
            return;
        }

        v2.commit();
    }

    static String ˏ(Context arg0, String arg1) throws PackageManager$NameNotFoundException {
        return AppsFlyerLib.ᐝ(arg0, arg1);
    }

    private static String ˏ(String arg7) {
        Object v0 = null;
        try {
            Object v7_1 = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(v0, arg7);
        }
        catch(Throwable v7) {
            AFLogger.afErrorLog(v7.getMessage(), v7);
            arg7 = ((String)v0);
        }

        return arg7;
    }

    static Map ˏ(Context arg0) throws k {
        return AppsFlyerLib.ˊ(arg0);
    }

    private void ˏ(Context arg16, String arg17, String arg18, String arg19, String arg20, Intent arg21, String arg22) {
        Context v0 = arg16.getApplicationContext();
        int v1 = 0;
        int v3 = arg18 == null ? 1 : 0;
        if((AppsFlyerProperties.getInstance().getBoolean("waitForCustomerId", false)) && AppsFlyerProperties.getInstance().getString("AppUserId") == null) {
            v1 = 1;
        }

        if(v1 != 0) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }

        if(v3 != 0) {
            if(!AppsFlyerProperties.getInstance().getBoolean("launchProtectEnabled", true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            }
            else if(this.ˊ()) {
                return;
            }

            this.ᐝ = System.currentTimeMillis();
        }

        AppsFlyerLib.ˋ(AFExecutor.getInstance().ˏ(), new a(this, new WeakReference(v0), arg17, arg18, arg19, arg20, false, arg21, arg22, 0), 150, TimeUnit.MILLISECONDS);
    }

    private static void ˏ(Context arg2, Map arg3) {
        com.appsflyer.h$a v2 = h.ˊ(arg2);
        arg3.put("network", v2.ˋ());
        if(v2.ˏ() != null) {
            arg3.put("operator", v2.ˏ());
        }

        if(v2.ॱ() != null) {
            arg3.put("carrier", v2.ॱ());
        }
    }

    private void ˏ(URL arg18, String arg19, String arg20, WeakReference arg21, String arg22, boolean arg23) throws IOException {
        Map v0_5;
        OutputStreamWriter v9_1;
        OutputStreamWriter v11_1;
        String v11;
        URLConnection v10;
        AppsFlyerLib v1 = this;
        String v0 = arg19;
        String v2 = arg20;
        String v3 = arg22;
        Object v5 = ((Reference)arg21).get();
        int v8 = !arg23 || AppsFlyerLib.ॱˊ == null ? 0 : 1;
        Uri v9 = null;
        try {
            s.ˏ().ˊ(arg18.toString(), v0);
            v10 = arg18.openConnection();
        }
        catch(Throwable v0_1) {
            goto label_223;
        }

        try {
            v11 = "POST";
            goto label_19;
        }
        catch(Throwable v0_1) {
        }
        catch(Throwable v0_1) {
        label_223:
            v10 = ((URLConnection)v9);
            goto label_224;
            try {
            label_19:
                ((HttpURLConnection)v10).setRequestMethod(v11);
                v10.setRequestProperty("Content-Length", String.valueOf(arg19.getBytes().length));
                v10.setRequestProperty("Content-Type", "application/json");
                v10.setConnectTimeout(10000);
                v10.setDoOutput(true);
            }
            catch(Throwable v0_1) {
                goto label_221;
            }

            try {
                v11_1 = new OutputStreamWriter(v10.getOutputStream(), "UTF-8");
            }
            catch(Throwable v0_1) {
                goto label_211;
            }

            try {
                ((Writer)v11_1).write(v0);
                goto label_36;
            }
            catch(Throwable v0_1) {
                v9_1 = v11_1;
            }

        label_211:
            if(v9_1 == null) {
                try {
                    if(AppsFlyerLib.ʻॱ != null) {
                        AppsFlyerLib.ʻॱ.onTrackingRequestFailure("No Connectivity");
                        goto label_219;
                    label_218:
                        ((Writer)v9_1).close();
                    }

                label_219:
                    throw v0_1;
                label_36:
                    ((Writer)v11_1).close();
                    int v0_2 = ((HttpURLConnection)v10).getResponseCode();
                    v11 = AppsFlyerLib.ˎ(((HttpURLConnection)v10));
                    s.ˏ().ˏ(arg18.toString(), v0_2, v11);
                    AFLogger.afInfoLog("response code: ".concat(String.valueOf(v0_2)));
                    AppsFlyerLib.ˋ(((Context)v5), "AppsFlyer_4.9.0", "SERVER_RESPONSE_CODE", Integer.toString(v0_2));
                    SharedPreferences v12 = ((Context)v5).getApplicationContext().getSharedPreferences("appsflyer-data", 0);
                    if(v0_2 == 200) {
                        if(((Reference)arg21).get() != null && (arg23)) {
                            v1.ˏॱ = System.currentTimeMillis();
                            if(AppsFlyerLib.ʻॱ != null) {
                                AppsFlyerLib.ʻॱ.onTrackingRequestSuccess();
                            }
                        }

                        v0 = AppsFlyerProperties.getInstance().getString("afUninstallToken");
                        if(v0 != null) {
                            AFLogger.afDebugLog("Uninstall Token exists: ".concat(String.valueOf(v0)));
                            if(!v12.getBoolean("sentRegisterRequestToAF", false)) {
                                AFLogger.afDebugLog("Resending Uninstall token to AF servers: ".concat(String.valueOf(v0)));
                                y.ॱ(((Context)v5), new com.appsflyer.a$e$b(v0));
                            }
                        }
                        else if(AppsFlyerProperties.getInstance().getString("gcmProjectNumber") != null) {
                            AFLogger.afDebugLog("GCM Project number exists. Fetching token and sending to AF servers");
                            new com.appsflyer.y$a(new WeakReference(v5)).execute(new Void[0]);
                        }

                        if(v1.latestDeepLink != null) {
                            v1.latestDeepLink = v9;
                        }

                        if(v3 != null) {
                            CacheManager.getInstance().deleteRequest(v3, ((Context)v5));
                        }

                        if(((Reference)arg21).get() != null && v3 == null) {
                            AppsFlyerLib.ˎ(((Context)v5), "sentSuccessfully", "true");
                            if(!v1.ॱˎ) {
                                if(System.currentTimeMillis() - v1.ॱᐝ < 15000) {
                                }
                                else if(v1.ʽॱ == null) {
                                    v1.ʽॱ = AFExecutor.getInstance().ˏ();
                                    AppsFlyerLib.ˋ(v1.ʽॱ, new com.appsflyer.AppsFlyerLib$c(v1, ((Context)v5)), 1, TimeUnit.SECONDS);
                                }
                            }
                        }

                        v1.ˋᐝ = ServerConfigHandler.ˋ(v11).optBoolean("send_background", false);
                    }
                    else {
                        if(AppsFlyerLib.ʻॱ == null) {
                            goto label_139;
                        }

                        AppsFlyerLib.ʻॱ.onTrackingRequestFailure("Failure: ".concat(String.valueOf(v0_2)));
                    }

                label_139:
                    v0_2 = v12.getInt("appsflyerConversionDataRequestRetries", 0);
                    long v13 = 0;
                    long v3_1 = v12.getLong("appsflyerConversionDataCacheExpiration", v13);
                    if(v3_1 != v13 && System.currentTimeMillis() - v3_1 > 5184000000L) {
                        AppsFlyerLib.ˎ(((Context)v5), "attributionId", ((String)v9));
                        AppsFlyerLib.ˎ(((Context)v5), "appsflyerConversionDataCacheExpiration", v13);
                    }

                    if(v12.getString("attributionId", ((String)v9)) == null && v2 != null && v8 != 0 && AppsFlyerLib.ॱˊ != null && v0_2 <= 5) {
                        ScheduledThreadPoolExecutor v0_3 = AFExecutor.getInstance().ˏ();
                        AppsFlyerLib.ˋ(((ScheduledExecutorService)v0_3), new com.appsflyer.AppsFlyerLib$e(v1, ((Context)v5).getApplicationContext(), v2, ((ScheduledExecutorService)v0_3)), 10, TimeUnit.MILLISECONDS);
                        goto label_203;
                    }

                    if(v2 == null) {
                        AFLogger.afWarnLog("AppsFlyer dev key is missing.");
                        goto label_203;
                    }

                    if(v8 == 0) {
                        goto label_203;
                    }

                    if(AppsFlyerLib.ॱˊ == null) {
                        goto label_203;
                    }

                    if(v12.getString("attributionId", ((String)v9)) == null) {
                        goto label_203;
                    }

                    if(AppsFlyerLib.ˎ(v12, "appsFlyerCount", false) <= 1) {
                        goto label_203;
                    }

                    goto label_185;
                }
                catch(Throwable v0_1) {
                    goto label_221;
                }
            }
            else {
                goto label_218;
            }

            goto label_219;
            try {
            label_185:
                v0_5 = AppsFlyerLib.ˊ(((Context)v5));
                if(v0_5 == null) {
                    goto label_203;
                }
            }
            catch(k v0_4) {
                goto label_201;
            }
            catch(Throwable v0_1) {
                goto label_221;
            }

            try {
                if(!v0_5.containsKey("is_first_launch")) {
                    v0_5.put("is_first_launch", Boolean.toString(false));
                }

                AppsFlyerLib.ॱˊ.onInstallConversionDataLoaded(v0_5);
                goto label_203;
            }
            catch(Throwable v0_1) {
            }
            catch(k v0_4) {
            }
            catch(Throwable v0_1) {
                try {
                    AFLogger.afErrorLog(v0_1.getLocalizedMessage(), v0_1);
                    goto label_203;
                }
                catch(Throwable v0_1) {
                }
                catch(k v0_4) {
                    try {
                    label_201:
                        AFLogger.afErrorLog(((Throwable)v0_4).getMessage(), ((Throwable)v0_4));
                        goto label_203;
                    }
                    catch(Throwable v0_1) {
                    label_221:
                    }
                }
            }
        }

    label_224:
        if(v10 != null) {
            ((HttpURLConnection)v10).disconnect();
        }

        throw v0_1;
    label_203:
        if(v10 != null) {
            ((HttpURLConnection)v10).disconnect();
            return;
        }
    }

    static boolean ˏ(AppsFlyerLib arg0) {
        return arg0.ॱˎ;
    }

    static boolean ˏ(AppsFlyerLib arg0, boolean arg1) {
        arg0.ॱˎ = arg1;
        return arg1;
    }

    final void ॱ() {
        this.ʾ = System.currentTimeMillis();
    }

    final void ॱ(Context arg14, Intent arg15) {
        String v0 = arg15.getStringExtra("shouldMonitor");
        if(v0 != null) {
            AFLogger.afInfoLog("Turning on monitoring.");
            AppsFlyerProperties.getInstance().set("shouldMonitor", v0.equals("true"));
            AppsFlyerLib.ˋ(arg14, null, "START_TRACKING", arg14.getPackageName());
            return;
        }

        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        String v7 = arg15.getStringExtra("referrer");
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(v7)));
        if(v7 != null) {
            int v1 = 9;
            if("AppsFlyer_Test".equals(arg15.getStringExtra("TestIntegrationMode"))) {
                SharedPreferences$Editor v0_1 = arg14.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
                v0_1.clear();
                if(Build$VERSION.SDK_INT >= v1) {
                    v0_1.apply();
                }
                else {
                    v0_1.commit();
                }

                AppsFlyerProperties.getInstance().setFirstLaunchCalled(false);
                AFLogger.afInfoLog("Test mode started..");
                this.ˊᐝ = System.currentTimeMillis();
            }

            SharedPreferences$Editor v2 = arg14.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
            v2.putString("referrer", v7);
            if(Build$VERSION.SDK_INT >= v1) {
                v2.apply();
            }
            else {
                v2.commit();
            }

            AppsFlyerProperties.getInstance().setReferrer(v7);
            if(!AppsFlyerProperties.getInstance().isFirstLaunchCalled()) {
                return;
            }

            AFLogger.afInfoLog("onReceive: isLaunchCalled");
            if(v7 == null) {
                return;
            }

            if(v7.length() <= 5) {
                return;
            }

            AppsFlyerLib.ˋ(AFExecutor.getInstance().ˏ(), new a(this, new WeakReference(arg14.getApplicationContext()), null, null, null, v7, true, arg15, null, 0), 5, TimeUnit.MILLISECONDS);
        }
    }

    static void ॱ(Context arg10, String arg11) {
        JSONArray v2_1;
        JSONObject v3;
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(arg11)));
        try {
            long v0 = System.currentTimeMillis();
            String v2 = arg10.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("extraReferrers", null);
            if(v2 == null) {
                v3 = new JSONObject();
                v2_1 = new JSONArray();
            }
            else {
                v3 = new JSONObject(v2);
                v2_1 = v3.has(arg11) ? new JSONArray(v3.get(arg11)) : new JSONArray();
            }

            if((((long)v2_1.length())) < 5) {
                v2_1.put(v0);
            }

            if((((long)v3.length())) >= 4) {
                AppsFlyerLib.ˋ(v3);
            }

            v3.put(arg11, v2_1.toString());
            String v1 = v3.toString();
            SharedPreferences$Editor v10_1 = arg10.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
            v10_1.putString("extraReferrers", v1);
            if(Build$VERSION.SDK_INT >= 9) {
                v10_1.apply();
                return;
            }

            v10_1.commit();
            return;
        }
        catch(Throwable v10) {
            StringBuilder v0_1 = new StringBuilder("Couldn\'t save referrer - ");
            v0_1.append(arg11);
            v0_1.append(": ");
            AFLogger.afErrorLog(v0_1.toString(), v10);
            return;
        }
        catch(JSONException ) {
            return;
        }
    }

    static long ॱ(AppsFlyerLib arg0, long arg1) {
        arg0.ॱᐝ = arg1;
        return arg1;
    }

    private static File ॱ(String arg1) {
        if(arg1 != null) {
            try {
                if(arg1.trim().length() <= 0) {
                    return null;
                }

                return new File(arg1.trim());
            }
            catch(Throwable v1) {
                AFLogger.afErrorLog(v1.getMessage(), v1);
            }
        }

        return null;
    }

    private static String ॱ(File arg4, String arg5) {
        FileReader v2;
        Properties v1;
        String v0 = null;
        try {
            v1 = new Properties();
            v2 = new FileReader(arg4);
        }
        catch(Throwable v4) {
            v2 = ((FileReader)v0);
            goto label_43;
        }
        catch(Throwable v4) {
            v2 = ((FileReader)v0);
            goto label_22;
        }
        catch(FileNotFoundException ) {
            v2 = ((FileReader)v0);
            goto label_32;
        }

        try {
            v1.load(((Reader)v2));
            AFLogger.afInfoLog("Found PreInstall property!");
            arg5 = v1.getProperty(arg5);
            goto label_9;
        }
        catch(Throwable v4) {
        }
        catch(Throwable v4) {
            try {
            label_22:
                AFLogger.afErrorLog(v4.getMessage(), v4);
                if(v2 == null) {
                    return v0;
                }
            }
            catch(Throwable v4) {
                goto label_43;
            }

            try {
                ((Reader)v2).close();
            }
            catch(Throwable v4) {
            label_29:
                AFLogger.afErrorLog(v4.getMessage(), v4);
            }

            return v0;
        }
        catch(FileNotFoundException ) {
            try {
            label_32:
                StringBuilder v5 = new StringBuilder("PreInstall file wasn\'t found: ");
                v5.append(arg4.getAbsolutePath());
                AFLogger.afDebugLog(v5.toString());
                if(v2 == null) {
                    return v0;
                }
            }
            catch(Throwable v4) {
                goto label_43;
            }

            try {
                ((Reader)v2).close();
                return v0;
            }
            catch(Throwable v4) {
                goto label_29;
            }
        }

    label_43:
        if(v2 != null) {
            try {
                ((Reader)v2).close();
            }
            catch(Throwable v5_1) {
                AFLogger.afErrorLog(v5_1.getMessage(), v5_1);
            }
        }

        throw v4;
        try {
        label_9:
            ((Reader)v2).close();
        }
        catch(Throwable v4) {
            AFLogger.afErrorLog(v4.getMessage(), v4);
        }

        return arg5;
    }

    static void ॱ(AppsFlyerLib arg16, Context arg17, String arg18, String arg19, String arg20, String arg21, boolean arg22, boolean arg23, Intent arg24, String arg25) {
        ScheduledThreadPoolExecutor v1_3;
        String v2_1;
        AppsFlyerLib v12 = arg16;
        if(arg17 == null) {
            AFLogger.afDebugLog("sendTrackingWithEvent - got null context. skipping event/launch.");
            return;
        }

        int v13 = 0;
        SharedPreferences v0 = arg17.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        AppsFlyerProperties.getInstance().saveProperties(v0);
        if(!arg16.isTrackingStopped()) {
            StringBuilder v1 = new StringBuilder("sendTrackingWithEvent from activity: ");
            v1.append(arg17.getClass().getName());
            AFLogger.afInfoLog(v1.toString());
        }

        int v14 = 1;
        boolean v15 = arg19 == null ? true : false;
        Map v1_1 = arg16.ˎ(arg17, arg18, arg19, arg20, arg21, arg22, v0, v15, arg24, arg25);
        Object v2 = v1_1.get("appsflyerKey");
        if(v2 != null) {
            if(((String)v2).length() == 0) {
            }
            else {
                if(!arg16.isTrackingStopped()) {
                    AFLogger.afInfoLog("AppsFlyerLib.sendTrackingWithEvent");
                }

                if(!v15) {
                    v2_1 = AppsFlyerLib.ʼ;
                }
                else if(arg23) {
                    v2_1 = AppsFlyerLib.ʽ;
                }
                else {
                    v2_1 = AppsFlyerLib.ʻ;
                }

                v2_1 = ServerConfigHandler.getUrl(v2_1);
                v2_1 = v2_1 + arg17.getPackageName();
                int v3_1 = AppsFlyerLib.ˎ(v0, "appsFlyerCount", false);
                int v0_1 = (AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false)) || (AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)) ? 1 : 0;
                if(v0_1 == 0 && v1_1.get("advertiserId") != null) {
                    try {
                        if((TextUtils.isEmpty(v12.ˋ)) && v1_1.remove("android_id") != null) {
                            AFLogger.afInfoLog("validateGaidAndIMEI :: removing: android_id");
                        }

                        if(!TextUtils.isEmpty(v12.ॱ)) {
                            goto label_100;
                        }

                        if(v1_1.remove("imei") == null) {
                            goto label_100;
                        }

                        AFLogger.afInfoLog("validateGaidAndIMEI :: removing: imei");
                    }
                    catch(Exception v0_2) {
                        AFLogger.afErrorLog("failed to remove IMEI or AndroidID key from params; ", ((Throwable)v0_2));
                    }
                }

            label_100:
                b v0_3 = new b(arg16, v2_1, v1_1, arg17.getApplicationContext(), v15, v3_1, 0);
                if((v15) && (AppsFlyerLib.ˋ(arg17))) {
                    if(v12.ᐝॱ == null || v12.ᐝॱ.size() <= 0) {
                        v14 = 0;
                    }
                    else {
                    }

                    if(v14 != 0) {
                        goto label_127;
                    }

                    v13 = 500;
                    AFLogger.afDebugLog("Failed to get new referrer, wait ...");
                }

            label_127:
                if(AFDeepLinkManager.ॱ) {
                    AFLogger.afRDLog("ESP deeplink: execute launch on SerialExecutor");
                    ScheduledExecutorService v1_2 = AFExecutor.getInstance().getSerialExecutor();
                }
                else {
                    v1_3 = AFExecutor.getInstance().ˏ();
                }

                AppsFlyerLib.ˋ(((ScheduledExecutorService)v1_3), ((Runnable)v0_3), ((long)v13), TimeUnit.MILLISECONDS);
                return;
            }
        }

        AFLogger.afDebugLog("Not sending data yet, waiting for dev key");
    }

    static void ॱ(AppsFlyerLib arg9, String arg10, String arg11, String arg12, WeakReference arg13, String arg14, boolean arg15) throws IOException {
        URL v1 = new URL(arg10);
        StringBuilder v0 = new StringBuilder("url: ");
        v0.append(v1.toString());
        AFLogger.afInfoLog(v0.toString());
        com.appsflyer.h$a.ˋ("data: ".concat(String.valueOf(arg11)));
        AppsFlyerLib.ˋ(((Reference)arg13).get(), "AppsFlyer_4.9.0", "EVENT_DATA", arg11);
        AppsFlyerLib v0_1 = arg9;
        String v2 = arg11;
        String v3 = arg12;
        WeakReference v4 = arg13;
        String v5 = arg14;
        boolean v6 = arg15;
        try {
            v0_1.ˏ(v1, v2, v3, v4, v5, v6);
            return;
        }
        catch(IOException v0_2) {
            AFLogger.afErrorLog("Exception in sendRequestToServer. ", ((Throwable)v0_2));
            if(AppsFlyerProperties.getInstance().getBoolean("useHttpFallback", false)) {
                arg9.ˏ(new URL(arg10.replace("https:", "http:")), arg11, arg12, arg13, arg14, arg15);
                return;
            }

            StringBuilder v9 = new StringBuilder("failed to send requeset to server. ");
            v9.append(((Throwable)v0_2).getLocalizedMessage());
            AFLogger.afInfoLog(v9.toString());
            AppsFlyerLib.ˋ(((Reference)arg13).get(), "AppsFlyer_4.9.0", "ERROR", ((Throwable)v0_2).getLocalizedMessage());
            throw v0_2;
        }
    }

    private static boolean ॱ(Context arg3) {
        try {
            if(GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(arg3) != 0) {
                goto label_9;
            }
        }
        catch(Throwable v1) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", v1);
            goto label_9;
        }

        return 1;
        try {
        label_9:
            arg3.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return 1;
        }
        catch(PackageManager$NameNotFoundException v3) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", ((Throwable)v3));
            return 0;
        }
    }

    static boolean ॱ(AppsFlyerLib arg1) {
        if(arg1.ᐝॱ != null && arg1.ᐝॱ.size() > 0) {
            return 1;
        }

        return 0;
    }

    private static boolean ॱॱ(Context arg4) {
        int v0 = (AppsFlyerProperties.getInstance().getBoolean("collectAndroidIdForceByUser", false)) || (AppsFlyerProperties.getInstance().getBoolean("collectIMEIForceByUser", false)) ? 1 : 0;
        if(v0 == 0) {
            if(!AppsFlyerLib.ॱ(arg4)) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    private static String ᐝ(Context arg3, String arg4) throws PackageManager$NameNotFoundException {
        SharedPreferences v0 = arg3.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        if(v0.contains("CACHED_CHANNEL")) {
            return v0.getString("CACHED_CHANNEL", null);
        }

        AppsFlyerLib.ˎ(arg3, "CACHED_CHANNEL", arg4);
        return arg4;
    }
}

