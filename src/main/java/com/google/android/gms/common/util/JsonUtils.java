package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@KeepForSdk @VisibleForTesting public final class JsonUtils {
    private static final Pattern zzhb;
    private static final Pattern zzhc;

    static {
        JsonUtils.zzhb = Pattern.compile("\\\\.");
        JsonUtils.zzhc = Pattern.compile("[\\\\\"/\b\f\n\r\t]");
    }

    private JsonUtils() {
        super();
    }

    @KeepForSdk public static boolean areJsonValuesEquivalent(Object arg5, Object arg6) {
        if(arg5 == null && arg6 == null) {
            return 1;
        }

        if(arg5 != null) {
            if(arg6 == null) {
            }
            else {
                if(((arg5 instanceof JSONObject)) && ((arg6 instanceof JSONObject))) {
                    if(((JSONObject)arg5).length() != ((JSONObject)arg6).length()) {
                        return 0;
                    }
                    else {
                        Iterator v2 = ((JSONObject)arg5).keys();
                        do {
                            if(v2.hasNext()) {
                                Object v3 = v2.next();
                                if(!((JSONObject)arg6).has(((String)v3))) {
                                    return 0;
                                }
                                else {
                                    try {
                                        if(JsonUtils.areJsonValuesEquivalent(((JSONObject)arg5).get(((String)v3)), ((JSONObject)arg6).get(((String)v3)))) {
                                            continue;
                                        }

                                        return 0;
                                    }
                                    catch(JSONException ) {
                                        return 0;
                                    }
                                }
                            }
                            else {
                                return 1;
                            }

                            goto label_30;
                        }
                        while(true);

                        return 0;
                    }
                }

            label_30:
                if(((arg5 instanceof JSONArray)) && ((arg6 instanceof JSONArray))) {
                    if(((JSONArray)arg5).length() != ((JSONArray)arg6).length()) {
                        return 0;
                    }
                    else {
                        int v2_1;
                        for(v2_1 = 0; v2_1 < ((JSONArray)arg5).length(); ++v2_1) {
                            try {
                                if(JsonUtils.areJsonValuesEquivalent(((JSONArray)arg5).get(v2_1), ((JSONArray)arg6).get(v2_1))) {
                                    goto label_46;
                                }
                            }
                            catch(JSONException ) {
                                return 0;
                            }

                            return 0;
                        label_46:
                        }

                        return 1;
                    }
                }

                return arg5.equals(arg6);
            }
        }

        return 0;
    }

    @KeepForSdk public static String escapeString(String arg4) {
        if(!TextUtils.isEmpty(((CharSequence)arg4))) {
            Matcher v0 = JsonUtils.zzhc.matcher(((CharSequence)arg4));
            StringBuffer v1 = null;
            while(v0.find()) {
                if(v1 == null) {
                    v1 = new StringBuffer();
                }

                int v2 = v0.group().charAt(0);
                if(v2 != 34) {
                    if(v2 != 0x2F) {
                        if(v2 != 92) {
                            switch(v2) {
                                case 8: {
                                    goto label_34;
                                }
                                case 9: {
                                    goto label_31;
                                }
                                case 10: {
                                    goto label_28;
                                }
                            }

                            switch(v2) {
                                case 12: {
                                    goto label_25;
                                }
                                case 13: {
                                    goto label_22;
                                }
                            }

                            continue;
                        label_22:
                            v0.appendReplacement(v1, "\\\\r");
                            continue;
                        label_25:
                            v0.appendReplacement(v1, "\\\\f");
                            continue;
                        label_34:
                            v0.appendReplacement(v1, "\\\\b");
                            continue;
                        label_28:
                            v0.appendReplacement(v1, "\\\\n");
                            continue;
                        label_31:
                            v0.appendReplacement(v1, "\\\\t");
                            continue;
                        }

                        v0.appendReplacement(v1, "\\\\\\\\");
                        continue;
                    }

                    v0.appendReplacement(v1, "\\\\/");
                    continue;
                }

                v0.appendReplacement(v1, "\\\\\\\"");
            }

            if(v1 == null) {
                return arg4;
            }

            v0.appendTail(v1);
            return v1.toString();
        }

        return arg4;
    }

    @KeepForSdk public static String unescapeString(String arg4) {
        if(!TextUtils.isEmpty(((CharSequence)arg4))) {
            arg4 = zzd.unescape(arg4);
            Matcher v0 = JsonUtils.zzhb.matcher(((CharSequence)arg4));
            StringBuffer v1 = null;
            while(v0.find()) {
                if(v1 == null) {
                    v1 = new StringBuffer();
                }

                int v2 = v0.group().charAt(1);
                if(v2 != 34) {
                    if(v2 != 0x2F) {
                        if(v2 != 92) {
                            if(v2 != 98) {
                                if(v2 != 102) {
                                    if(v2 != 110) {
                                        if(v2 != 0x72) {
                                            if(v2 == 0x74) {
                                                v0.appendReplacement(v1, "\t");
                                                continue;
                                            }

                                            throw new IllegalStateException("Found an escaped character that should never be.");
                                        }

                                        v0.appendReplacement(v1, "\r");
                                        continue;
                                    }

                                    v0.appendReplacement(v1, "\n");
                                    continue;
                                }

                                v0.appendReplacement(v1, "\f");
                                continue;
                            }

                            v0.appendReplacement(v1, "\b");
                            continue;
                        }

                        v0.appendReplacement(v1, "\\\\");
                        continue;
                    }

                    v0.appendReplacement(v1, "/");
                    continue;
                }

                v0.appendReplacement(v1, "\"");
            }

            if(v1 == null) {
                return arg4;
            }

            v0.appendTail(v1);
            return v1.toString();
        }

        return arg4;
    }
}

