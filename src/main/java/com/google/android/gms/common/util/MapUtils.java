package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Iterator;

@KeepForSdk public class MapUtils {
    public MapUtils() {
        super();
    }

    @KeepForSdk public static void writeStringMapToJson(StringBuilder arg5, HashMap arg6) {
        arg5.append("{");
        Iterator v0 = arg6.keySet().iterator();
        int v1 = 1;
        while(v0.hasNext()) {
            Object v2 = v0.next();
            if(v1 == 0) {
                arg5.append(",");
            }
            else {
                v1 = 0;
            }

            Object v3 = arg6.get(v2);
            arg5.append("\"");
            arg5.append(((String)v2));
            arg5.append("\":");
            if(v3 == null) {
                arg5.append("null");
                continue;
            }

            arg5.append("\"");
            arg5.append(((String)v3));
            arg5.append("\"");
        }

        arg5.append("}");
    }
}

