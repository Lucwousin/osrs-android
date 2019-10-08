package com.appsflyer;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build$VERSION;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class h {
    final class a {
        private static String ˊ;
        private final String ˋ;
        private final String ˎ;
        private static String ˏ;
        private final String ॱ;

        a(@NonNull String arg1, @Nullable String arg2, @Nullable String arg3) {
            super();
            this.ˎ = arg1;
            this.ॱ = arg2;
            this.ˋ = arg3;
        }

        a() {
            super();
        }

        static void ˋ(String arg2) {
            if(a.ˏ == null) {
                a.ˏ(AppsFlyerProperties.getInstance().getString("AppsFlyerKey"));
            }

            if(a.ˏ != null && (arg2.contains(a.ˏ))) {
                AFLogger.afInfoLog(arg2.replace(a.ˏ, a.ˊ));
            }
        }

        final String ˋ() {
            return this.ˎ;
        }

        static void ˏ(String arg3) {
            a.ˏ = arg3;
            StringBuilder v0 = new StringBuilder();
            int v1;
            for(v1 = 0; v1 < arg3.length(); ++v1) {
                if(v1 == 0 || v1 == arg3.length() - 1) {
                    v0.append(arg3.charAt(v1));
                }
                else {
                    v0.append("*");
                }
            }

            a.ˊ = v0.toString();
        }

        @Nullable final String ˏ() {
            return this.ˋ;
        }

        @Nullable final String ॱ() {
            return this.ॱ;
        }
    }

    final class d {
        static final h ˏ;

        static {
            d.ˏ = new h();
        }
    }

    h() {
        super();
    }

    static a ˊ(@NonNull Context arg10) {
        String v10_2;
        String v3_3;
        Object v10_1;
        String v2_1;
        String v0 = "unknown";
        String v1 = null;
        try {
            Object v2 = arg10.getSystemService("connectivity");
            if(v2 != null) {
                int v5 = 0;
                if(21 <= Build$VERSION.SDK_INT) {
                    Network[] v3 = ((ConnectivityManager)v2).getAllNetworks();
                    int v4 = v3.length;
                    int v7;
                    for(v7 = 0; v7 < v4; ++v7) {
                        NetworkInfo v8 = ((ConnectivityManager)v2).getNetworkInfo(v3[v7]);
                        int v9 = v8 == null || !v8.isConnectedOrConnecting() ? 0 : 1;
                        if(v9 != 0) {
                            if(1 == v8.getType()) {
                                v2_1 = "WIFI";
                                goto label_72;
                            }

                            if(v8.getType() == 0) {
                                v2_1 = "MOBILE";
                                goto label_72;
                            }

                            v2_1 = "unknown";
                            goto label_72;
                        }
                    }

                    v2_1 = "unknown";
                }
                else {
                    NetworkInfo v3_1 = ((ConnectivityManager)v2).getNetworkInfo(1);
                    int v3_2 = v3_1 == null || !v3_1.isConnectedOrConnecting() ? 0 : 1;
                    if(v3_2 != 0) {
                        v2_1 = "WIFI";
                        goto label_72;
                    }

                    v3_1 = ((ConnectivityManager)v2).getNetworkInfo(0);
                    v3_2 = v3_1 == null || !v3_1.isConnectedOrConnecting() ? 0 : 1;
                    if(v3_2 != 0) {
                        v2_1 = "MOBILE";
                        goto label_72;
                    }

                    NetworkInfo v2_2 = ((ConnectivityManager)v2).getActiveNetworkInfo();
                    if(v2_2 != null && (v2_2.isConnectedOrConnecting())) {
                        v5 = 1;
                    }

                    if(v5 == 0) {
                        goto label_71;
                    }

                    if(1 == v2_2.getType()) {
                        v2_1 = "WIFI";
                        goto label_72;
                    }

                    if(v2_2.getType() != 0) {
                        goto label_71;
                    }

                    v2_1 = "MOBILE";
                }
            }
            else {
            label_71:
                v2_1 = "unknown";
            }

        label_72:
            v0 = v2_1;
            v10_1 = arg10.getSystemService("phone");
            v2_1 = ((TelephonyManager)v10_1).getSimOperatorName();
        }
        catch(Throwable v10) {
            v2_1 = v1;
            goto label_95;
        }

        try {
            v3_3 = ((TelephonyManager)v10_1).getNetworkOperatorName();
            if(v3_3 == null) {
                goto label_84;
            }
        }
        catch(Throwable v10) {
            goto label_95;
        }

        try {
            if(v3_3.isEmpty()) {
            label_84:
                if(2 == ((TelephonyManager)v10_1).getPhoneType()) {
                    v10_2 = "CDMA";
                    goto label_98;
                label_82:
                    v1 = v3_3;
                    goto label_95;
                }
            }

            goto label_89;
        }
        catch(Throwable v10) {
            goto label_82;
        }

    label_95:
        AFLogger.afErrorLog("Exception while collecting network info. ", v10);
        v10_2 = v1;
        goto label_98;
    label_89:
        v10_2 = v3_3;
    label_98:
        return new a(v0, v10_2, v2_1);
    }
}

