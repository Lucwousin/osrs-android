package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

public class zzws {
    private static final Uri CONTENT_URI;
    private static final Uri zzbol;
    public static final Pattern zzbom;
    public static final Pattern zzbon;
    private static final AtomicBoolean zzboo;
    private static HashMap zzbop;
    private static final HashMap zzboq;
    private static final HashMap zzbor;
    private static final HashMap zzbos;
    private static final HashMap zzbot;
    private static Object zzbou;
    private static boolean zzbov;
    private static String[] zzbow;

    static {
        zzws.CONTENT_URI = Uri.parse("content://com.google.android.gsf.gservices");
        zzws.zzbol = Uri.parse("content://com.google.android.gsf.gservices/prefix");
        zzws.zzbom = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        zzws.zzbon = Pattern.compile("^(0|false|f|off|no|n)$", 2);
        zzws.zzboo = new AtomicBoolean();
        zzws.zzboq = new HashMap();
        zzws.zzbor = new HashMap();
        zzws.zzbos = new HashMap();
        zzws.zzbot = new HashMap();
        zzws.zzbow = new String[0];
    }

    public zzws() {
        super();
    }

    private static Object zza(HashMap arg2, String arg3, Object arg4) {
        Class v0 = zzws.class;
        __monitor_enter(v0);
        try {
            if(arg2.containsKey(arg3)) {
                Object v2_1 = arg2.get(arg3);
                if(v2_1 != null) {
                }
                else {
                    v2_1 = arg4;
                }

                __monitor_exit(v0);
                return v2_1;
            }

            __monitor_exit(v0);
            return null;
        label_14:
            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            goto label_14;
        }

        throw v2;
    }

    public static String zza(ContentResolver arg13, String arg14, String arg15) {
        String v13_2;
        Object v13_1;
        String v2;
        Object v0;
        Class v15 = zzws.class;
        __monitor_enter(v15);
        try {
            zzws.zza(arg13);
            v0 = zzws.zzbou;
            v2 = null;
            if(zzws.zzbop.containsKey(arg14)) {
                v13_1 = zzws.zzbop.get(arg14);
                if(v13_1 != null) {
                }
                else {
                    v13_2 = v2;
                }

                __monitor_exit(v15);
                return ((String)v13_1);
            }

            String[] v1 = zzws.zzbow;
            int v3 = v1.length;
            int v5;
            for(v5 = 0; v5 < v3; ++v5) {
                if(arg14.startsWith(v1[v5])) {
                    if(!zzws.zzbov || (zzws.zzbop.isEmpty())) {
                        zzws.zzbop.putAll(zzws.zza(arg13, zzws.zzbow));
                        zzws.zzbov = true;
                        if(zzws.zzbop.containsKey(arg14)) {
                            v13_1 = zzws.zzbop.get(arg14);
                            if(v13_1 != null) {
                            }
                            else {
                                v13_2 = v2;
                            }

                            __monitor_exit(v15);
                            return ((String)v13_1);
                        }
                    }

                    __monitor_exit(v15);
                    return v2;
                }
            }

            __monitor_exit(v15);
        }
        catch(Throwable v13) {
            goto label_84;
        }

        Cursor v13_3 = arg13.query(zzws.CONTENT_URI, null, null, new String[]{arg14}, null);
        if(v13_3 == null) {
            if(v13_3 != null) {
                v13_3.close();
            }

            return v2;
        }

        try {
            if(v13_3.moveToFirst()) {
                goto label_67;
            }

            zzws.zza(v0, arg14, v2);
            if(v13_3 != null) {
                goto label_65;
            }

            return v2;
        }
        catch(Throwable v14) {
            goto label_80;
        }

    label_65:
        v13_3.close();
        return v2;
        try {
        label_67:
            arg15 = v13_3.getString(1);
            if(arg15 != null && (arg15.equals(v2))) {
                arg15 = v2;
            }

            zzws.zza(v0, arg14, arg15);
            if(arg15 == null) {
                goto label_75;
            }
        }
        catch(Throwable v14) {
        label_80:
            if(v13_3 != null) {
                v13_3.close();
            }

            throw v14;
        }

        goto label_76;
    label_75:
        arg15 = v2;
    label_76:
        if(v13_3 != null) {
            v13_3.close();
        }

        return arg15;
        try {
        label_84:
            __monitor_exit(v15);
        }
        catch(Throwable v13) {
            goto label_84;
        }

        throw v13;
    }

    private static void zza(ContentResolver arg4) {
        if(zzws.zzbop == null) {
            zzws.zzboo.set(false);
            zzws.zzbop = new HashMap();
            zzws.zzbou = new Object();
            zzws.zzbov = false;
            arg4.registerContentObserver(zzws.CONTENT_URI, true, new zzwt(null));
            return;
        }

        if(zzws.zzboo.getAndSet(false)) {
            zzws.zzbop.clear();
            zzws.zzboq.clear();
            zzws.zzbor.clear();
            zzws.zzbos.clear();
            zzws.zzbot.clear();
            zzws.zzbou = new Object();
            zzws.zzbov = false;
        }
    }

    private static Map zza(ContentResolver arg6, String[] arg7) {
        Cursor v6 = arg6.query(zzws.zzbol, null, null, arg7, null);
        TreeMap v7 = new TreeMap();
        if(v6 == null) {
            return ((Map)v7);
        }

        try {
            while(v6.moveToNext()) {
                v7.put(v6.getString(0), v6.getString(1));
            }
        }
        catch(Throwable v7_1) {
            v6.close();
            throw v7_1;
        }

        v6.close();
        return ((Map)v7);
    }

    private static void zza(Object arg2, String arg3, String arg4) {
        Class v0 = zzws.class;
        __monitor_enter(v0);
        try {
            if(arg2 == zzws.zzbou) {
                zzws.zzbop.put(arg3, arg4);
            }

            __monitor_exit(v0);
            return;
        label_9:
            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            goto label_9;
        }

        throw v2;
    }

    private static void zza(Object arg2, HashMap arg3, String arg4, Object arg5) {
        Class v0 = zzws.class;
        __monitor_enter(v0);
        try {
            if(arg2 == zzws.zzbou) {
                arg3.put(arg4, arg5);
                zzws.zzbop.remove(arg4);
            }

            __monitor_exit(v0);
            return;
        label_10:
            __monitor_exit(v0);
        }
        catch(Throwable v2) {
            goto label_10;
        }

        throw v2;
    }

    public static boolean zza(ContentResolver arg5, String arg6, boolean arg7) {
        Boolean v1_1;
        Object v0 = zzws.zzb(arg5);
        Object v1 = zzws.zza(zzws.zzboq, arg6, Boolean.valueOf(arg7));
        if(v1 != null) {
            return ((Boolean)v1).booleanValue();
        }

        String v5 = zzws.zza(arg5, arg6, null);
        if(v5 != null) {
            if(v5.equals("")) {
            }
            else if(zzws.zzbom.matcher(((CharSequence)v5)).matches()) {
                v1_1 = Boolean.valueOf(true);
                arg7 = true;
            }
            else if(zzws.zzbon.matcher(((CharSequence)v5)).matches()) {
                v1_1 = Boolean.valueOf(false);
                arg7 = false;
            }
            else {
                StringBuilder v3 = new StringBuilder("attempt to read gservices key ");
                v3.append(arg6);
                v3.append(" (value \"");
                v3.append(v5);
                v3.append("\") as boolean");
                Log.w("Gservices", v3.toString());
            }
        }

        zzws.zza(v0, zzws.zzboq, arg6, v1);
        return arg7;
    }

    private static Object zzb(ContentResolver arg1) {
        Class v0 = zzws.class;
        __monitor_enter(v0);
        try {
            zzws.zza(arg1);
            __monitor_exit(v0);
            return zzws.zzbou;
        label_7:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_7;
        }

        throw v1;
    }

    static AtomicBoolean zzsg() {
        return zzws.zzboo;
    }
}

