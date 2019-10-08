package com.appsflyer;

import android.os.Build$VERSION;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AFHelper {
    public AFHelper() {
        super();
    }

    public static JSONObject convertToJsonObject(Map arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return new JSONObject(arg2);
        }

        return AFHelper.toJsonObject(arg2);
    }

    public static JSONObject toJsonObject(Map arg3) {
        JSONObject v0 = new JSONObject();
        Iterator v3 = arg3.entrySet().iterator();
        while(v3.hasNext()) {
            Object v1 = v3.next();
            Object v2 = AFHelper.ˏ(((Map$Entry)v1).getValue());
            try {
                v0.put(((Map$Entry)v1).getKey(), v2);
            }
            catch(JSONException ) {
            }
        }

        return v0;
    }

    private static Object ˏ(Object arg4) {
        if(arg4 == null) {
            return JSONObject.NULL;
        }

        if(!(arg4 instanceof JSONArray)) {
            if((arg4 instanceof JSONObject)) {
            }
            else if(arg4.equals(JSONObject.NULL)) {
                return arg4;
            }
            else {
                try {
                    if((arg4 instanceof Collection)) {
                        JSONArray v0 = new JSONArray();
                        Iterator v4 = ((Collection)arg4).iterator();
                        while(v4.hasNext()) {
                            v0.put(AFHelper.ˏ(v4.next()));
                        }

                        return v0;
                    }
                    else if(arg4.getClass().isArray()) {
                        int v0_1 = Array.getLength(arg4);
                        JSONArray v1 = new JSONArray();
                        int v2;
                        for(v2 = 0; v2 < v0_1; ++v2) {
                            v1.put(AFHelper.ˏ(Array.get(arg4, v2)));
                        }

                        return v1;
                    }
                    else if((arg4 instanceof Map)) {
                        return AFHelper.toJsonObject(((Map)arg4));
                    }
                    else {
                        goto label_42;
                    }

                    return arg4;
                }
                catch(Exception ) {
                    goto label_64;
                }

            label_42:
                if(!(arg4 instanceof Boolean) && !(arg4 instanceof Byte) && !(arg4 instanceof Character) && !(arg4 instanceof Double) && !(arg4 instanceof Float) && !(arg4 instanceof Integer) && !(arg4 instanceof Long) && !(arg4 instanceof Short)) {
                    if((arg4 instanceof String)) {
                    }
                    else {
                        try {
                            return arg4.toString();
                        }
                        catch(Exception ) {
                        label_64:
                            return JSONObject.NULL;
                        }
                    }
                }

                return arg4;
            }
        }

        return arg4;
    }
}

