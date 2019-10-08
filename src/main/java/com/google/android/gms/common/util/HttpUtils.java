package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

@KeepForSdk public class HttpUtils {
    private static final Pattern zzgy;
    private static final Pattern zzgz;
    private static final Pattern zzha;

    static {
        HttpUtils.zzgy = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
        HttpUtils.zzgz = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
        HttpUtils.zzha = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    }

    private HttpUtils() {
        super();
    }

    private static String decode(String arg0, String arg1) {
        if(arg1 != null) {
        }
        else {
            try {
                arg1 = "ISO-8859-1";
            label_3:
                return URLDecoder.decode(arg0, arg1);
            }
            catch(UnsupportedEncodingException v0) {
                throw new IllegalArgumentException(((Throwable)v0));
            }
        }

        goto label_3;
    }

    @KeepForSdk public static Map parse(URI arg6, String arg7) {
        String v4_1;
        HashMap v0_1;
        Map v0 = Collections.emptyMap();
        String v6 = arg6.getRawQuery();
        if(v6 != null && v6.length() > 0) {
            v0_1 = new HashMap();
            Scanner v1 = new Scanner(v6);
            v1.useDelimiter("&");
            while(true) {
                if(v1.hasNext()) {
                    String[] v6_1 = v1.next().split("=");
                    if(v6_1.length != 0) {
                        int v3 = 2;
                        if(v6_1.length <= v3) {
                            String v2 = HttpUtils.decode(v6_1[0], arg7);
                            Object v4 = null;
                            if(v6_1.length == v3) {
                                v4_1 = HttpUtils.decode(v6_1[1], arg7);
                            }

                            ((Map)v0_1).put(v2, v4_1);
                            continue;
                        }
                    }

                    break;
                }

                goto label_36;
            }

            throw new IllegalArgumentException("bad parameter");
        }

    label_36:
        return ((Map)v0_1);
    }
}

