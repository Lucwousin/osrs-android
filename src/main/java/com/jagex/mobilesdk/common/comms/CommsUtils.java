package com.jagex.mobilesdk.common.comms;

import com.jagex.mobilesdk.auth.config.JagexConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;

public class CommsUtils {
    public static final String ERROR_INVALID_HTTP_RESPONSE = "Invalid HTTP Response";
    public static final String HTTP_ACTION_GET = "GET";
    public static final String HTTP_ACTION_POST = "POST";
    public static final String HTTP_HEADER_ACCEPT = "Accept";
    public static final String HTTP_HEADER_ACCEPT_FORM_URLENCODED = "application/x-www-form-urlencoded";
    public static final String HTTP_HEADER_ACCEPT_HAL_JSON = "application/hal+json";
    public static final String HTTP_HEADER_ACCEPT_JSON = "application/json";
    public static final String HTTP_HEADER_ACCEPT_LANGUAGE = "Accept-Language";
    public static final String HTTP_HEADER_ACCEPT_RESOLUTION = "Accept-Resolution";
    public static final String HTTP_HEADER_ACCEPT_TYPE = "Accept-Type";
    public static final String HTTP_HEADER_AUTHORIZATION = "Authorization";
    public static final String HTTP_HEADER_BASIC = "Basic";
    public static final String HTTP_HEADER_BEARER = "Bearer";
    public static final String HTTP_HEADER_CONTENT_LENGTH = "Content-Length";
    public static final String HTTP_HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HTTP_PARAM_GRANT_TYPE = "grant_type";
    public static final String HTTP_PARAM_REDIRECT_URI = "redirect_uri";
    public static final String HTTP_PARAM_REDIRTO = "redirTo";
    public static final String HTTP_PARAM_REFRESH_TOKEN = "refresh_token";
    public static final String HTTP_PARAM_SCOPE = "scope";
    public static final String HTTP_PARAM_SERVER_AUTH_CODE = "serverAuthCode";
    public static final String HTTP_PARAM_SIG = "sig";
    public static final String HTTP_PARAM_TOKEN = "token";
    public static final String HTTP_PARAM_TOKEN_TYPE_HINT = "token_type_hint";
    public static final String HTTP_THIRD_PARTY_ID = "thirdPartyId";
    public static final String HTTP_VALUE_GRANT_TYPE = "refresh_token";
    public static final String HTTP_VALUE_TOKEN_HINT_TYPE = "refresh_token";
    private static String base64String = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    private static char[] base64encode;

    static {
        CommsUtils.base64encode = CommsUtils.base64String.toCharArray();
    }

    public CommsUtils() {
        super();
    }

    public static String basicAuthParam(JagexConfig arg2) {
        StringBuilder v0 = new StringBuilder();
        v0.append(arg2.getClientId());
        v0.append(":");
        v0.append(arg2.getClientSecret());
        byte[] v2 = v0.toString().getBytes();
        String v2_1 = CommsUtils.encodeBase64(v2, 0, v2.length);
        return "Basic " + v2_1;
    }

    public static String encodeBase64(byte[] arg6, int arg7, int arg8) {
        StringBuilder v0 = new StringBuilder();
        int v1;
        for(v1 = arg7; v1 < arg7 + arg8; v1 += 3) {
            int v2 = arg6[v1] & 0xFF;
            v0.append(CommsUtils.base64encode[v2 >>> 2]);
            if(v1 < arg8 - 1) {
                int v3 = arg6[v1 + 1] & 0xFF;
                v0.append(CommsUtils.base64encode[(v2 & 3) << 4 | v3 >>> 4]);
                if(v1 < arg8 - 2) {
                    v2 = arg6[v1 + 2] & 0xFF;
                    v0.append(CommsUtils.base64encode[(v3 & 15) << 2 | v2 >>> 6]);
                    v0.append(CommsUtils.base64encode[v2 & 0x3F]);
                }
                else {
                    v0.append(CommsUtils.base64encode[(v3 & 15) << 2]);
                    v0.append("=");
                }
            }
            else {
                v0.append(CommsUtils.base64encode[(v2 & 3) << 4]);
                v0.append("==");
            }
        }

        return v0.toString();
    }

    public static String formUrlEncode(Map arg6) {
        if(arg6 != null) {
            StringBuilder v0 = new StringBuilder();
            int v1 = 0;
            Iterator v2 = arg6.entrySet().iterator();
            while(v2.hasNext()) {
                Object v3 = v2.next();
                try {
                    v0.append(((Map$Entry)v3).getKey() + "=" + URLEncoder.encode(((Map$Entry)v3).getValue(), "utf-8"));
                    if(v1 < arg6.size() - 1) {
                        v0.append("&");
                    }
                }
                catch(UnsupportedEncodingException ) {
                    continue;
                }

                ++v1;
            }

            return v0.toString();
        }

        throw new NullPointerException("Null map of parameters passed in for Encoding.");
    }

    public static int mapResponseCode(int arg1) {
        if(arg1 != 200) {
            if(arg1 != 401) {
                if(arg1 != 404 && arg1 != 502) {
                    return -1;
                }

                return 1403;
            }

            return 1404;
        }

        return 0;
    }
}

