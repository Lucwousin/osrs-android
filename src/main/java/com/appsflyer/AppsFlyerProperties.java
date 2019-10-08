package com.appsflyer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.os.Build$VERSION;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerProperties {
    public enum EmailsCryptType {
        public static final enum EmailsCryptType MD5;
        public static final enum EmailsCryptType NONE;
        public static final enum EmailsCryptType SHA1;
        public static final enum EmailsCryptType SHA256;
        private final int ˋ;

        static {
            EmailsCryptType.NONE = new EmailsCryptType("NONE", 0, 0);
            EmailsCryptType.SHA1 = new EmailsCryptType("SHA1", 1, 1);
            EmailsCryptType.MD5 = new EmailsCryptType("MD5", 2, 2);
            EmailsCryptType.SHA256 = new EmailsCryptType("SHA256", 3, 3);
            EmailsCryptType.ॱ = new EmailsCryptType[]{EmailsCryptType.NONE, EmailsCryptType.SHA1, EmailsCryptType.MD5, EmailsCryptType.SHA256};
        }

        private EmailsCryptType(String arg1, int arg2, int arg3) {
            super(arg1, arg2);
            this.ˋ = arg3;
        }

        public final int getValue() {
            return this.ˋ;
        }

        public static EmailsCryptType valueOf(String arg1) {
            return Enum.valueOf(EmailsCryptType.class, arg1);
        }

        public static EmailsCryptType[] values() {
            return EmailsCryptType.ॱ.clone();
        }
    }

    public static final String ADDITIONAL_CUSTOM_DATA = "additionalCustomData";
    public static final String AF_KEY = "AppsFlyerKey";
    public static final String AF_WAITFOR_CUSTOMERID = "waitForCustomerId";
    public static final String APP_ID = "appid";
    public static final String APP_USER_ID = "AppUserId";
    public static final String CHANNEL = "channel";
    public static final String COLLECT_ANDROID_ID = "collectAndroidId";
    public static final String COLLECT_ANDROID_ID_FORCE_BY_USER = "collectAndroidIdForceByUser";
    public static final String COLLECT_FACEBOOK_ATTR_ID = "collectFacebookAttrId";
    public static final String COLLECT_FINGER_PRINT = "collectFingerPrint";
    public static final String COLLECT_IMEI = "collectIMEI";
    public static final String COLLECT_IMEI_FORCE_BY_USER = "collectIMEIForceByUser";
    public static final String COLLECT_MAC = "collectMAC";
    public static final String CURRENCY_CODE = "currencyCode";
    public static final String DEVICE_TRACKING_DISABLED = "deviceTrackingDisabled";
    public static final String DISABLE_KEYSTORE = "keyPropDisableAFKeystore";
    public static final String DISABLE_LOGS_COMPLETELY = "disableLogs";
    public static final String DISABLE_OTHER_SDK = "disableOtherSdk";
    public static final String EMAIL_CRYPT_TYPE = "userEmailsCryptType";
    public static final String ENABLE_GPS_FALLBACK = "enableGpsFallback";
    public static final String EXTENSION = "sdkExtension";
    public static final String IS_MONITOR = "shouldMonitor";
    public static final String IS_UPDATE = "IS_UPDATE";
    public static final String LAUNCH_PROTECT_ENABLED = "launchProtectEnabled";
    public static final String ONELINK_DOMAIN = "onelinkDomain";
    public static final String ONELINK_ID = "oneLinkSlug";
    public static final String ONELINK_SCHEME = "onelinkScheme";
    public static final String USER_EMAIL = "userEmail";
    public static final String USER_EMAILS = "userEmails";
    public static final String USE_HTTP_FALLBACK = "useHttpFallback";
    private boolean ˊ;
    private boolean ˋ;
    private Map ˎ;
    private static AppsFlyerProperties ˏ;
    private String ॱ;
    private boolean ॱॱ;

    static {
        AppsFlyerProperties.ˏ = new AppsFlyerProperties();
    }

    private AppsFlyerProperties() {
        super();
        this.ˎ = Collections.synchronizedMap(new HashMap());
        this.ॱॱ = false;
    }

    public boolean getBoolean(String arg1, boolean arg2) {
        arg1 = this.getString(arg1);
        if(arg1 == null) {
            return arg2;
        }

        return Boolean.valueOf(arg1).booleanValue();
    }

    public static AppsFlyerProperties getInstance() {
        return AppsFlyerProperties.ˏ;
    }

    public int getInt(String arg1, int arg2) {
        arg1 = this.getString(arg1);
        if(arg1 == null) {
            return arg2;
        }

        return Integer.valueOf(arg1).intValue();
    }

    public long getLong(String arg1, long arg2) {
        arg1 = this.getString(arg1);
        if(arg1 == null) {
            return arg2;
        }

        return Long.valueOf(arg1).longValue();
    }

    public Object getObject(String arg2) {
        return this.ˎ.get(arg2);
    }

    public String getReferrer(Context arg3) {
        if(this.ॱ != null) {
            return this.ॱ;
        }

        if(this.getString("AF_REFERRER") != null) {
            return this.getString("AF_REFERRER");
        }

        String v0 = null;
        if(arg3 == null) {
            return v0;
        }

        return AppsFlyerLib.ˎ(arg3).getString("referrer", v0);
    }

    public String getString(String arg2) {
        return this.ˎ.get(arg2);
    }

    public boolean isEnableLog() {
        return this.getBoolean("shouldLog", true);
    }

    protected boolean isFirstLaunchCalled() {
        return this.ˊ;
    }

    public boolean isLogsDisabledCompletely() {
        return this.getBoolean("disableLogs", false);
    }

    protected boolean isOnReceiveCalled() {
        return this.ˋ;
    }

    public boolean isOtherSdkStringDisabled() {
        return this.getBoolean("disableOtherSdk", false);
    }

    public void loadProperties(Context arg5) {
        if(this.ॱॱ) {
            return;
        }

        String v5 = AppsFlyerLib.ˎ(arg5).getString("savedProperties", null);
        if(v5 != null) {
            AFLogger.afDebugLog("Loading properties..");
            try {
                JSONObject v0 = new JSONObject(v5);
                Iterator v5_2 = v0.keys();
                while(v5_2.hasNext()) {
                    Object v1 = v5_2.next();
                    if(this.ˎ.get(v1) != null) {
                        continue;
                    }

                    this.ˎ.put(v1, v0.getString(((String)v1)));
                }

                this.ॱॱ = true;
            }
            catch(JSONException v5_1) {
                AFLogger.afErrorLog("Failed loading properties", ((Throwable)v5_1));
            }

            StringBuilder v5_3 = new StringBuilder("Done loading properties: ");
            v5_3.append(this.ॱॱ);
            AFLogger.afDebugLog(v5_3.toString());
        }
    }

    public void remove(String arg2) {
        this.ˎ.remove(arg2);
    }

    @SuppressLint(value={"CommitPrefEdits"}) public void saveProperties(SharedPreferences arg3) {
        String v0 = new JSONObject(this.ˎ).toString();
        SharedPreferences$Editor v3 = arg3.edit();
        v3.putString("savedProperties", v0);
        if(Build$VERSION.SDK_INT >= 9) {
            v3.apply();
            return;
        }

        v3.commit();
    }

    public void set(String arg2, long arg3) {
        this.ˎ.put(arg2, Long.toString(arg3));
    }

    public void set(String arg2, int arg3) {
        this.ˎ.put(arg2, Integer.toString(arg3));
    }

    public void set(String arg2, String arg3) {
        this.ˎ.put(arg2, arg3);
    }

    public void set(String arg2, boolean arg3) {
        this.ˎ.put(arg2, Boolean.toString(arg3));
    }

    public void set(String arg2, String[] arg3) {
        this.ˎ.put(arg2, arg3);
    }

    public void setCustomData(String arg3) {
        this.ˎ.put("additionalCustomData", arg3);
    }

    protected void setFirstLaunchCalled() {
        this.ˊ = true;
    }

    protected void setFirstLaunchCalled(boolean arg1) {
        this.ˊ = arg1;
    }

    protected void setOnReceiveCalled() {
        this.ˋ = true;
    }

    protected void setReferrer(String arg2) {
        this.set("AF_REFERRER", arg2);
        this.ॱ = arg2;
    }

    public void setUserEmails(String arg3) {
        this.ˎ.put("userEmails", arg3);
    }
}

