package com.appsflyer;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

public class AFScreenManager {
    public static final String SCREEN_KEY = "dim";

    public AFScreenManager() {
        super();
    }

    public static Map getScreenMetrics(@NonNull Context arg4) {
        HashMap v0 = new HashMap();
        try {
            DisplayMetrics v1 = new DisplayMetrics();
            arg4.getSystemService("window").getDefaultDisplay().getMetrics(v1);
            int v4_1 = arg4.getResources().getConfiguration().screenLayout & 15;
            ((Map)v0).put("x_px", String.valueOf(v1.widthPixels));
            ((Map)v0).put("y_px", String.valueOf(v1.heightPixels));
            ((Map)v0).put("d_dpi", String.valueOf(v1.densityDpi));
            ((Map)v0).put("size", String.valueOf(v4_1));
            ((Map)v0).put("xdp", String.valueOf(v1.xdpi));
            ((Map)v0).put("ydp", String.valueOf(v1.ydpi));
        }
        catch(Throwable v4) {
            AFLogger.afErrorLog("Couldn\'t aggregate screen stats: ", v4);
        }

        return ((Map)v0);
    }
}

