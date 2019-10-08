package com.appsflyer;

import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build$VERSION;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

final class s {
    private final String ʻ;
    private final String ʻॱ;
    private final String ʼ;
    private final String ʼॱ;
    private final String ʽ;
    private final String ʽॱ;
    private final String ʾ;
    private final String ʿ;
    private final String ˈ;
    private JSONArray ˉ;
    private static s ˊ;
    private int ˊˊ;
    private JSONObject ˊˋ;
    private final String ˊॱ;
    private final String ˊᐝ;
    private final String ˋ;
    private final String ˋˊ;
    private final String ˋॱ;
    private String ˍ;
    private boolean ˎ;
    private boolean ˎˎ;
    private boolean ˏ;
    private final String ˏॱ;
    private final String ͺ;
    private final String ॱ;
    private final String ॱˊ;
    private final String ॱˋ;
    private final String ॱˎ;
    private final String ॱॱ;
    private final String ॱᐝ;
    private final String ᐝ;
    private final String ᐝॱ;

    private s() {
        super();
        this.ˎ = true;
        this.ˏ = true;
        this.ॱ = "brand";
        this.ˋ = "model";
        this.ʻ = "platform";
        this.ॱॱ = "platform_version";
        this.ʽ = "advertiserId";
        this.ʼ = "imei";
        this.ᐝ = "android_id";
        this.ͺ = "sdk_version";
        this.ˋॱ = "devkey";
        this.ॱˊ = "originalAppsFlyerId";
        this.ˏॱ = "uid";
        this.ˊॱ = "app_id";
        this.ॱˎ = "app_version";
        this.ʻॱ = "channel";
        this.ॱˋ = "preInstall";
        this.ॱᐝ = "data";
        this.ᐝॱ = "r_debugging_off";
        this.ʿ = "r_debugging_on";
        this.ʽॱ = "public_api_call";
        this.ˈ = "exception";
        this.ʼॱ = "server_request";
        this.ʾ = "server_response";
        this.ˋˊ = "yyyy-MM-dd HH:mm:ssZ";
        this.ˊᐝ = "MM-dd HH:mm:ss.SSS";
        this.ˊˊ = 0;
        this.ˍ = "-1";
        this.ˉ = new JSONArray();
        this.ˊˊ = 0;
        this.ˎˎ = false;
    }

    final boolean ʻ() {
        return this.ˎˎ;
    }

    private void ʼ() {
        __monitor_enter(this);
        JSONArray v0 = null;
        try {
            this.ˉ = v0;
            this.ˉ = new JSONArray();
            this.ˊˊ = 0;
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    final void ˊ() {
        __monitor_enter(this);
        try {
            this.ॱ("r_debugging_off", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
            this.ˎˎ = false;
            this.ˎ = false;
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    final void ˊ(String arg4, String arg5) {
        this.ॱ("server_request", arg4, new String[]{arg5});
    }

    final void ˊ(String arg2, String[] arg3) {
        this.ॱ("public_api_call", arg2, arg3);
    }

    static void ˋ(String arg4, PackageManager arg5) {
        try {
            if(s.ˊ == null) {
                s.ˊ = new s();
            }

            s.ˊ.ˏ(arg4, arg5);
            if(s.ˊ == null) {
                s.ˊ = new s();
            }

            String v5 = s.ˊ.ॱॱ();
            o v0 = new o(null, AppsFlyerLib.getInstance().isTrackingStopped());
            v0.ˋ = v5;
            v0.ॱ();
            String[] v5_1 = new String[1];
            v5_1[0] = ServerConfigHandler.getUrl("https://%smonitorsdk.%s/remote-debug?app_id=") + arg4;
            ((AsyncTask)v0).execute(((Object[])v5_1));
            return;
        }
        catch(Throwable ) {
            return;
        }
    }

    final void ˋ(String arg3, String arg4) {
        this.ॱ(null, arg3, new String[]{arg4});
    }

    final void ˋ() {
        __monitor_enter(this);
        try {
            this.ˎ = false;
            this.ʼ();
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    private void ˋ(String arg3, String arg4, String arg5, String arg6) {
        __monitor_enter(this);
        try {
            this.ˊˋ.put("sdk_version", arg3);
            if(arg4 != null && arg4.length() > 0) {
                this.ˊˋ.put("devkey", arg4);
            }

            if(arg5 != null && arg5.length() > 0) {
                this.ˊˋ.put("originalAppsFlyerId", arg5);
            }

            if(arg6 != null && arg6.length() > 0) {
                this.ˊˋ.put("uid", arg6);
            }
        }
        catch(Throwable v3) {
            __monitor_exit(this);
            throw v3;
        }
        catch(Throwable ) {
            __monitor_exit(this);
            return;
        }

        __monitor_exit(this);
    }

    final void ˎ() {
        __monitor_enter(this);
        try {
            this.ˎˎ = true;
            this.ॱ("r_debugging_on", new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ", Locale.ENGLISH).format(Long.valueOf(System.currentTimeMillis())), new String[0]);
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    private void ˎ(String arg3, String arg4, String arg5, String arg6) {
        __monitor_enter(this);
        if(arg3 != null) {
            try {
                if(arg3.length() > 0) {
                    this.ˊˋ.put("app_id", arg3);
                }

            label_10:
                if(arg4 != null && arg4.length() > 0) {
                    this.ˊˋ.put("app_version", arg4);
                }

                if(arg5 != null && arg5.length() > 0) {
                    this.ˊˋ.put("channel", arg5);
                }

                if(arg6 != null && arg6.length() > 0) {
                    this.ˊˋ.put("preInstall", arg6);
                    goto label_33;
                label_9:
                    goto label_29;
                }

                goto label_33;
            }
            catch(Throwable v3) {
                goto label_9;
            }
            catch(Throwable ) {
                goto label_31;
            }
        }

        goto label_10;
    label_29:
        __monitor_exit(this);
        throw v3;
    label_31:
        __monitor_exit(this);
        return;
    label_33:
        __monitor_exit(this);
    }

    final void ˎ(String arg1) {
        __monitor_enter(this);
        try {
            this.ˍ = arg1;
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    static s ˏ() {
        if(s.ˊ == null) {
            s.ˊ = new s();
        }

        return s.ˊ;
    }

    final void ˏ(Throwable arg7) {
        String[] v7_1;
        Throwable v0 = arg7.getCause();
        String v1 = "exception";
        String v2 = arg7.getClass().getSimpleName();
        String v3 = v0 == null ? arg7.getMessage() : v0.getMessage();
        StackTraceElement[] v7 = v0 == null ? arg7.getStackTrace() : v0.getStackTrace();
        int v4 = 1;
        if(v7 == null) {
            v7_1 = new String[]{v3};
        }
        else {
            String[] v5 = new String[v7.length + 1];
            v5[0] = v3;
            while(v4 < v7.length) {
                v5[v4] = v7[v4].toString();
                ++v4;
            }

            v7_1 = v5;
        }

        this.ॱ(v1, v2, v7_1);
    }

    final void ˏ(String arg4, int arg5, String arg6) {
        this.ॱ("server_response", arg4, new String[]{String.valueOf(arg5), arg6});
    }

    private void ˏ(String arg11, PackageManager arg12) {
        __monitor_enter(this);
        try {
            AppsFlyerProperties v0 = AppsFlyerProperties.getInstance();
            AppsFlyerLib v1 = AppsFlyerLib.getInstance();
            String v2 = v0.getString("remote_debug_static_data");
            if(v2 != null) {
                try {
                    this.ˊˋ = new JSONObject(v2);
                }
                catch(Throwable ) {
                }
            }
            else {
                this.ˊˋ = new JSONObject();
                this.ˏ(Build.BRAND, Build.MODEL, Build$VERSION.RELEASE, v0.getString("advertiserId"), v1.ॱ, v1.ˋ);
                this.ˋ("4.9.0.184", v0.getString("AppsFlyerKey"), v0.getString("KSAppsFlyerId"), v0.getString("uid"));
                try {
                    this.ˎ(arg11, String.valueOf(arg12.getPackageInfo(arg11, 0).versionCode), v0.getString("channel"), v0.getString("preInstallName"));
                    goto label_39;
                }
                catch(Throwable ) {
                label_39:
                    v0.set("remote_debug_static_data", this.ˊˋ.toString());
                }
            }

            try {
                this.ˊˋ.put("launch_counter", this.ˍ);
                goto label_47;
            }
            catch(JSONException v11_1) {
                try {
                    ((Throwable)v11_1).printStackTrace();
                }
                catch(Throwable v11) {
                    goto label_54;
                }

                __monitor_exit(this);
                return;
            }
        }
        catch(Throwable v11) {
        }

    label_54:
        __monitor_exit(this);
        throw v11;
    label_47:
        __monitor_exit(this);
    }

    private void ˏ(String arg3, String arg4, String arg5, String arg6, String arg7, String arg8) {
        __monitor_enter(this);
        try {
            this.ˊˋ.put("brand", arg3);
            this.ˊˋ.put("model", arg4);
            this.ˊˋ.put("platform", "Android");
            this.ˊˋ.put("platform_version", arg5);
            if(arg6 != null && arg6.length() > 0) {
                this.ˊˋ.put("advertiserId", arg6);
            }

            if(arg7 != null && arg7.length() > 0) {
                this.ˊˋ.put("imei", arg7);
            }

            if(arg8 != null && arg8.length() > 0) {
                this.ˊˋ.put("android_id", arg8);
            }
        }
        catch(Throwable v3) {
            __monitor_exit(this);
            throw v3;
        }
        catch(Throwable ) {
            __monitor_exit(this);
            return;
        }

        __monitor_exit(this);
    }

    final void ॱ() {
        __monitor_enter(this);
        JSONObject v0 = null;
        try {
            this.ˊˋ = v0;
            this.ˉ = ((JSONArray)v0);
            s.ˊ = ((s)v0);
        }
        catch(Throwable v0_1) {
            __monitor_exit(this);
            throw v0_1;
        }

        __monitor_exit(this);
    }

    private void ॱ(String arg12, String arg13, String[] arg14) {
        int v0;
        __monitor_enter(this);
        try {
            if(this.ˏ) {
                if(!this.ˎ && !this.ˎˎ) {
                    goto label_11;
                }

                v0 = 1;
            }
            else {
            label_11:
                v0 = 0;
            }

            if(v0 != 0) {
                if(this.ˊˊ >= 0x18000) {
                    goto label_16;
                }
                else {
                    goto label_17;
                }
            }

            goto label_84;
        }
        catch(Throwable v12) {
            goto label_87;
        }

    label_16:
        goto label_84;
        try {
        label_17:
            long v3 = System.currentTimeMillis();
            String v0_1 = "";
            if(arg14.length > 0) {
                StringBuilder v0_2 = new StringBuilder();
                int v5;
                for(v5 = arg14.length - 1; v5 > 0; --v5) {
                    v0_2.append(arg14[v5]);
                    v0_2.append(", ");
                }

                v0_2.append(arg14[0]);
                v0_1 = v0_2.toString();
            }

            String v14 = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.ENGLISH).format(Long.valueOf(v3));
            int v3_1 = 4;
            int v4 = 3;
            v5 = 2;
            int v6 = 5;
            if(arg12 != null) {
                Object[] v8 = new Object[6];
                v8[0] = v14;
                v8[1] = Long.valueOf(Thread.currentThread().getId());
                v8[v5] = "AppsFlyer_4.9.0";
                v8[v4] = arg12;
                v8[v3_1] = arg13;
                v8[v6] = v0_1;
                arg12 = String.format("%18s %5s _/%s [%s] %s %s", v8);
            }
            else {
                Object[] v6_1 = new Object[v6];
                v6_1[0] = v14;
                v6_1[1] = Long.valueOf(Thread.currentThread().getId());
                v6_1[v5] = arg13;
                v6_1[v4] = "AppsFlyer_4.9.0";
                v6_1[v3_1] = v0_1;
                arg12 = String.format("%18s %5s %s/%s %s", v6_1);
            }

            this.ˉ.put(arg12);
            this.ˊˊ += arg12.getBytes().length;
        }
        catch(Throwable v12) {
        label_87:
            __monitor_exit(this);
            throw v12;
        }
        catch(Throwable ) {
            __monitor_exit(this);
            return;
        }

        __monitor_exit(this);
        return;
    label_84:
        __monitor_exit(this);
    }

    private String ॱॱ() {
        String v1;
        __monitor_enter(this);
        String v0 = null;
        try {
            this.ˊˋ.put("data", this.ˉ);
            v1 = this.ˊˋ.toString();
        }
        catch(JSONException ) {
            v1 = v0;
            goto label_14;
        }

        try {
            this.ʼ();
        }
        catch(JSONException ) {
        }

        goto label_14;
        __monitor_exit(this);
        throw v0_1;
    label_14:
        __monitor_exit(this);
        return v1;
    }

    final void ᐝ() {
        this.ˏ = false;
    }
}

