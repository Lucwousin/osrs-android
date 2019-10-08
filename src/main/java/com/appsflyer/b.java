package com.appsflyer;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

final class b {
    final class a {
        static final b ॱ;

        static {
            a.ॱ = new b();
        }
    }

    b() {
        super();
    }

    private static boolean ˏ(@NonNull Context arg4, @NonNull String[] arg5) {
        int v0 = arg5.length;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if(com.appsflyer.AFExecutor$3$5.ˋ(arg4, arg5[v2])) {
                return 1;
            }
        }

        return 0;
    }

    @Nullable static Location ॱ(@NonNull Context arg7) {
        Location v7;
        Location v2_1;
        Location v0 = null;
        try {
            Object v1 = arg7.getSystemService("location");
            String v2 = "network";
            v2_1 = b.ˏ(arg7, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}) ? ((LocationManager)v1).getLastKnownLocation(v2) : v0;
            String v3 = "gps";
            v7 = b.ˏ(arg7, new String[]{"android.permission.ACCESS_FINE_LOCATION"}) ? ((LocationManager)v1).getLastKnownLocation(v3) : v0;
            if(v7 != null || v2_1 != null) {
                if(v7 != null || v2_1 == null) {
                    if(v2_1 == null && v7 != null) {
                        goto label_36;
                    }

                    if(60000 >= v2_1.getTime() - v7.getTime()) {
                        goto label_36;
                    }
                }
                else {
                }

                goto label_35;
            }
            else {
                v7 = v0;
            }

            goto label_36;
        }
        catch(Throwable ) {
            return v0;
        }

    label_35:
        v7 = v2_1;
    label_36:
        if(v7 != null) {
            v0 = v7;
        }

        return v0;
    }
}

