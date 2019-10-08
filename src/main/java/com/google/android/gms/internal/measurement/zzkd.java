package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.AppMeasurement$Event;
import com.google.android.gms.measurement.AppMeasurement$UserProperty;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;

public final class zzkd extends zzhj {
    private int zzadj;
    private static final String[] zzasx;
    private SecureRandom zzasy;
    private final AtomicLong zzasz;
    private Integer zzata;

    static {
        zzkd.zzasx = new String[]{"firebase_", "google_", "ga_"};
    }

    zzkd(zzgn arg3) {
        super(arg3);
        this.zzata = null;
        this.zzasz = new AtomicLong(0);
    }

    public final Context getContext() {
        return super.getContext();
    }

    static MessageDigest getMessageDigest() {
        MessageDigest v1;
        int v0;
        for(v0 = 0; v0 < 2; ++v0) {
            try {
                v1 = MessageDigest.getInstance("MD5");
                if(v1 == null) {
                    goto label_7;
                }
            }
            catch(NoSuchAlgorithmException ) {
                goto label_7;
            }

            return v1;
        label_7:
        }

        return null;
    }

    final void zza(Bundle arg3, String arg4, Object arg5) {
        String v3;
        if(arg3 == null) {
            return;
        }

        if((arg5 instanceof Long)) {
            arg3.putLong(arg4, ((Long)arg5).longValue());
            return;
        }

        if((arg5 instanceof String)) {
            arg3.putString(arg4, String.valueOf(arg5));
            return;
        }

        if((arg5 instanceof Double)) {
            arg3.putDouble(arg4, ((Double)arg5).doubleValue());
            return;
        }

        if(arg4 != null) {
            if(arg5 != null) {
                v3 = arg5.getClass().getSimpleName();
            }
            else {
                Object v3_1 = null;
            }

            ((zzhi)this).zzgi().zziz().zze("Not putting event parameter. Invalid value type. name, type", ((zzhi)this).zzgf().zzbn(arg4), v3);
        }
    }

    final Bundle zza(@NonNull Uri arg7) {
        String v1;
        Bundle v0 = null;
        if(arg7 == null) {
            return v0;
        }

        try {
            if(arg7.isHierarchical()) {
                v1 = arg7.getQueryParameter("utm_campaign");
                String v2 = arg7.getQueryParameter("utm_source");
                String v3 = arg7.getQueryParameter("utm_medium");
                String v4 = arg7.getQueryParameter("gclid");
            }
            else {
                goto label_14;
            }

            goto label_18;
        }
        catch(UnsupportedOperationException v7) {
            ((zzhi)this).zzgi().zziy().zzg("Install referrer url isn\'t a hierarchical URI", v7);
            return v0;
        }

    label_14:
        CharSequence v1_1 = ((CharSequence)v0);
        CharSequence v2_1 = v1_1;
        CharSequence v3_1 = v2_1;
        CharSequence v4_1 = v3_1;
    label_18:
        if((TextUtils.isEmpty(((CharSequence)v1))) && (TextUtils.isEmpty(v2_1)) && (TextUtils.isEmpty(v3_1))) {
            if(!TextUtils.isEmpty(v4_1)) {
            }
            else {
                return v0;
            }
        }

        v0 = new Bundle();
        if(!TextUtils.isEmpty(((CharSequence)v1))) {
            v0.putString("campaign", v1);
        }

        if(!TextUtils.isEmpty(v2_1)) {
            v0.putString("source", ((String)v2_1));
        }

        if(!TextUtils.isEmpty(v3_1)) {
            v0.putString("medium", ((String)v3_1));
        }

        if(!TextUtils.isEmpty(v4_1)) {
            v0.putString("gclid", ((String)v4_1));
        }

        v1 = arg7.getQueryParameter("utm_term");
        if(!TextUtils.isEmpty(((CharSequence)v1))) {
            v0.putString("term", v1);
        }

        v1 = arg7.getQueryParameter("utm_content");
        if(!TextUtils.isEmpty(((CharSequence)v1))) {
            v0.putString("content", v1);
        }

        v1 = arg7.getQueryParameter("aclid");
        if(!TextUtils.isEmpty(((CharSequence)v1))) {
            v0.putString("aclid", v1);
        }

        v1 = arg7.getQueryParameter("cp1");
        if(!TextUtils.isEmpty(((CharSequence)v1))) {
            v0.putString("cp1", v1);
        }

        String v7_1 = arg7.getQueryParameter("anid");
        if(!TextUtils.isEmpty(((CharSequence)v7_1))) {
            v0.putString("anid", v7_1);
        }

        return v0;
    }

    public static String zza(String arg2, int arg3, boolean arg4) {
        if(arg2.codePointCount(0, arg2.length()) > arg3) {
            if(arg4) {
                return String.valueOf(arg2.substring(0, arg2.offsetByCodePoints(0, arg3))).concat("...");
            }
            else {
                arg2 = null;
            }
        }

        return arg2;
    }

    public final void zza(int arg7, String arg8, String arg9, int arg10) {
        this.zza(null, arg7, arg8, arg9, arg10);
    }

    @Nullable public static String zza(String arg3, String[] arg4, String[] arg5) {
        Preconditions.checkNotNull(arg4);
        Preconditions.checkNotNull(arg5);
        int v0 = Math.min(arg4.length, arg5.length);
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(zzkd.zzs(arg3, arg4[v1])) {
                return arg5[v1];
            }
        }

        return null;
    }

    static boolean zza(Context arg1, boolean arg2) {
        Preconditions.checkNotNull(arg1);
        String v2 = Build$VERSION.SDK_INT >= 24 ? "com.google.android.gms.measurement.AppMeasurementJobService" : "com.google.android.gms.measurement.AppMeasurementService";
        return zzkd.zzc(arg1, v2);
    }

    final void zza(String arg2, int arg3, String arg4, String arg5, int arg6) {
        Bundle v2 = new Bundle();
        zzkd.zza(v2, arg3);
        if(!TextUtils.isEmpty(((CharSequence)arg4))) {
            v2.putString(arg4, arg5);
        }

        if(arg3 == 6 || arg3 == 7 || arg3 == 2) {
            v2.putLong("_el", ((long)arg6));
        }

        this.zzacv.zzgl();
        this.zzacv.zzfy().logEvent("auto", "_err", v2);
    }

    final zzex zza(String arg8, String arg9, Bundle arg10, String arg11, long arg12, boolean arg14, boolean arg15) {
        if(TextUtils.isEmpty(((CharSequence)arg9))) {
            return null;
        }

        if(this.zzch(arg9) == 0) {
            Bundle v14 = arg10 != null ? new Bundle(arg10) : new Bundle();
            Bundle v3 = v14;
            v3.putString("_o", arg11);
            return new zzex(arg9, new zzeu(this.zzd(this.zza(arg8, arg9, v3, CollectionUtils.listOf("_o"), false, false))), arg11, arg12);
        }

        ((zzhi)this).zzgi().zziv().zzg("Invalid conditional property event name", ((zzhi)this).zzgf().zzbo(arg9));
        throw new IllegalArgumentException();
    }

    private static Object zza(int arg2, Object arg3, boolean arg4) {
        Object v0 = null;
        if(arg3 == null) {
            return v0;
        }

        if(!(arg3 instanceof Long)) {
            if((arg3 instanceof Double)) {
            }
            else if((arg3 instanceof Integer)) {
                return Long.valueOf(((long)((Integer)arg3).intValue()));
            }
            else if((arg3 instanceof Byte)) {
                return Long.valueOf(((long)((Byte)arg3).byteValue()));
            }
            else if((arg3 instanceof Short)) {
                return Long.valueOf(((long)((Short)arg3).shortValue()));
            }
            else if((arg3 instanceof Boolean)) {
                long v2 = ((Boolean)arg3).booleanValue() ? 1 : 0;
                return Long.valueOf(v2);
            }
            else {
                if((arg3 instanceof Float)) {
                    return Double.valueOf(((Float)arg3).doubleValue());
                }

                if(!(arg3 instanceof String) && !(arg3 instanceof Character)) {
                    if((arg3 instanceof CharSequence)) {
                    }
                    else {
                        return v0;
                    }
                }

                return zzkd.zza(String.valueOf(arg3), arg2, arg4);
            }
        }

        return arg3;
    }

    private static void zza(Bundle arg3, Object arg4) {
        Preconditions.checkNotNull(arg3);
        if(arg4 != null && (((arg4 instanceof String)) || ((arg4 instanceof CharSequence)))) {
            arg3.putLong("_el", ((long)String.valueOf(arg4).length()));
        }
    }

    private static boolean zza(Bundle arg4, int arg5) {
        if(arg4.getLong("_err") == 0) {
            arg4.putLong("_err", ((long)arg5));
            return 1;
        }

        return 0;
    }

    private final boolean zza(String arg4, String arg5, int arg6, Object arg7, boolean arg8) {
        Object v8;
        int v4;
        if(arg7 == null) {
            return 1;
        }

        if(!(arg7 instanceof Long) && !(arg7 instanceof Float) && !(arg7 instanceof Integer) && !(arg7 instanceof Byte) && !(arg7 instanceof Short) && !(arg7 instanceof Boolean)) {
            if((arg7 instanceof Double)) {
            }
            else {
                if(!(arg7 instanceof String) && !(arg7 instanceof Character)) {
                    if((arg7 instanceof CharSequence)) {
                    }
                    else {
                        if(((arg7 instanceof Bundle)) && (arg8)) {
                            return 1;
                        }

                        if(((arg7 instanceof Parcelable[])) && (arg8)) {
                            v4 = arg7.length;
                            arg6 = 0;
                            while(true) {
                                if(arg6 < v4) {
                                    v8 = arg7[arg6];
                                    if(!(v8 instanceof Bundle)) {
                                        ((zzhi)this).zzgi().zziy().zze("All Parcelable[] elements must be of type Bundle. Value type, name", v8.getClass(), arg5);
                                        return 0;
                                    }
                                    else {
                                        ++arg6;
                                        continue;
                                    }
                                }
                                else {
                                    return 1;
                                }

                                goto label_48;
                            }

                            return 1;
                        }

                    label_48:
                        if(((arg7 instanceof ArrayList)) && (arg8)) {
                            v4 = ((ArrayList)arg7).size();
                            arg6 = 0;
                            do {
                                if(arg6 < v4) {
                                    v8 = ((ArrayList)arg7).get(arg6);
                                    ++arg6;
                                    if((v8 instanceof Bundle)) {
                                        continue;
                                    }

                                    break;
                                }
                                else {
                                    return 1;
                                }
                            }
                            while(true);

                            ((zzhi)this).zzgi().zziy().zze("All ArrayList elements must be of type Bundle. Value type, name", v8.getClass(), arg5);
                            return 0;
                        }

                        return 0;
                    }
                }

                String v7 = String.valueOf(arg7);
                if(v7.codePointCount(0, v7.length()) <= arg6) {
                    return 1;
                }

                ((zzhi)this).zzgi().zziy().zzd("Value is too long; discarded. Value kind, name, value length", arg4, arg5, Integer.valueOf(v7.length()));
                return 0;
            }
        }

        return 1;
    }

    static byte[] zza(Parcelable arg2) {
        byte[] v2_1;
        if(arg2 == null) {
            return null;
        }

        Parcel v0 = Parcel.obtain();
        try {
            arg2.writeToParcel(v0, 0);
            v2_1 = v0.marshall();
        }
        catch(Throwable v2) {
            v0.recycle();
            throw v2;
        }

        v0.recycle();
        return v2_1;
    }

    final Bundle zza(String arg18, String arg19, Bundle arg20, @Nullable List arg21, boolean arg22, boolean arg23) {
        int v3;
        Object v2_1;
        zzkd v0_2;
        String v1_1;
        boolean v9_1;
        int v2;
        int v1;
        Bundle v10;
        zzkd v6 = this;
        Bundle v7 = arg20;
        List v8 = arg21;
        String[] v9 = null;
        if(v7 != null) {
            v10 = new Bundle(v7);
            Iterator v11 = arg20.keySet().iterator();
            int v13 = 0;
            while(v11.hasNext()) {
                Object v14 = v11.next();
                int v15 = 40;
                int v0 = 3;
                if(v8 == null || !v8.contains(v14)) {
                    v1 = 14;
                    if(arg22) {
                        if(v6.zzq("event param", ((String)v14))) {
                            if(!v6.zza("event param", v9, ((String)v14))) {
                                v2 = 14;
                                goto label_40;
                            }
                            else if(!v6.zza("event param", v15, ((String)v14))) {
                            }
                            else {
                                goto label_39;
                            }
                        }

                        v2 = 3;
                    }
                    else {
                    label_39:
                        v2 = 0;
                    }

                label_40:
                    if(v2 != 0) {
                        goto label_54;
                    }

                    if(v6.zzr("event param", ((String)v14))) {
                        if(!v6.zza("event param", v9, ((String)v14))) {
                            goto label_55;
                        }
                        else if(!v6.zza("event param", v15, ((String)v14))) {
                        }
                        else {
                            goto label_21;
                        }
                    }

                    v1 = 3;
                    goto label_55;
                label_21:
                    v1 = 0;
                    goto label_55;
                label_54:
                    v1 = v2;
                }
                else {
                    goto label_21;
                }

            label_55:
                if(v1 != 0) {
                    if(zzkd.zza(v10, v1)) {
                        v10.putString("_ev", zzkd.zza(((String)v14), v15, true));
                        if(v1 == v0) {
                            zzkd.zza(v10, v14);
                        }
                        else {
                        }
                    }
                    else {
                    }

                    goto label_154;
                }
                else {
                    Object v4 = v7.get(((String)v14));
                    ((zzhi)this).zzab();
                    if(arg23) {
                        String v0_1 = "param";
                        if((v4 instanceof Parcelable[])) {
                            v1 = v4.length;
                            goto label_78;
                        }
                        else if((v4 instanceof ArrayList)) {
                            v1 = v4.size();
                        label_78:
                            if(v1 > 1000) {
                                ((zzhi)this).zzgi().zziy().zzd("Parameter array is too long; discarded. Value kind, name, array length", v0_1, v14, Integer.valueOf(v1));
                                v0 = 0;
                            }
                            else {
                                goto label_87;
                            }
                        }
                        else {
                        label_87:
                            v0 = 1;
                        }

                        if(v0 != 0) {
                            goto label_92;
                        }

                        v0 = 17;
                        v9_1 = true;
                    }
                    else {
                    label_92:
                        if((((zzhi)this).zzgk().zzax(arg18)) && (zzkd.zzcm(arg19)) || (zzkd.zzcm(((String)v14)))) {
                            v1_1 = "param";
                            v0_2 = this;
                            v2_1 = v14;
                            v3 = 0x100;
                            v9_1 = true;
                        }
                        else {
                            v9_1 = true;
                            v1_1 = "param";
                            v3 = 100;
                            v0_2 = this;
                            v2_1 = v14;
                        }

                        boolean v0_3 = v0_2.zza(v1_1, ((String)v2_1), v3, v4, arg23);
                        if(v0_3) {
                            v0 = 0;
                            goto label_119;
                        }

                        v0 = 4;
                    }

                label_119:
                    if(v0 != 0 && !"_ev".equals(v14)) {
                        if(zzkd.zza(v10, v0)) {
                            v10.putString("_ev", zzkd.zza(((String)v14), v15, v9_1));
                            zzkd.zza(v10, v7.get(((String)v14)));
                        }
                        else {
                        }

                        goto label_154;
                    }

                    if(!zzkd.zzcg(((String)v14))) {
                        goto label_131;
                    }

                    ++v13;
                    if(v13 <= 25) {
                        goto label_131;
                    }

                    StringBuilder v1_2 = new StringBuilder(0x30);
                    v1_2.append("Event can\'t contain more than 25 params");
                    ((zzhi)this).zzgi().zziv().zze(v1_2.toString(), ((zzhi)this).zzgf().zzbm(arg19), ((zzhi)this).zzgf().zzb(v7));
                    zzkd.zza(v10, 5);
                label_154:
                    v10.remove(((String)v14));
                }

            label_131:
                v9 = null;
            }
        }
        else {
            v10 = null;
        }

        return v10;
    }

    final boolean zza(String arg7, String[] arg8, String arg9) {
        int v8;
        int v1_1;
        if(arg9 == null) {
            ((zzhi)this).zzgi().zziv().zzg("Name is required and can\'t be null. Type", arg7);
            return 0;
        }

        Preconditions.checkNotNull(arg9);
        String[] v1 = zzkd.zzasx;
        int v2 = v1.length;
        int v3 = 0;
        while(true) {
            if(v3 >= v2) {
                break;
            }
            else if(arg9.startsWith(v1[v3])) {
                v1_1 = 1;
            }
            else {
                ++v3;
                continue;
            }

            goto label_21;
        }

        v1_1 = 0;
    label_21:
        if(v1_1 != 0) {
            ((zzhi)this).zzgi().zziv().zze("Name starts with reserved prefix. Type, name", arg7, arg9);
            return 0;
        }

        if(arg8 != null) {
            Preconditions.checkNotNull(arg8);
            v1_1 = arg8.length;
            v2 = 0;
            while(true) {
                if(v2 >= v1_1) {
                    break;
                }
                else if(zzkd.zzs(arg9, arg8[v2])) {
                    v8 = 1;
                }
                else {
                    ++v2;
                    continue;
                }

                goto label_40;
            }

            v8 = 0;
        label_40:
            if(v8 == 0) {
                return 1;
            }

            ((zzhi)this).zzgi().zziv().zze("Name is reserved. Type, name", arg7, arg9);
            return 0;
        }

        return 1;
    }

    final boolean zza(String arg4, int arg5, String arg6) {
        if(arg6 == null) {
            ((zzhi)this).zzgi().zziv().zzg("Name is required and can\'t be null. Type", arg4);
            return 0;
        }

        if(arg6.codePointCount(0, arg6.length()) > arg5) {
            ((zzhi)this).zzgi().zziv().zzd("Name is too long. Type, maximum supported length, name", arg4, Integer.valueOf(arg5), arg6);
            return 0;
        }

        return 1;
    }

    public final void zzab() {
        super.zzab();
    }

    public final Clock zzbt() {
        return super.zzbt();
    }

    private static boolean zzc(Context arg3, String arg4) {
        try {
            PackageManager v1 = arg3.getPackageManager();
            if(v1 == null) {
                return 0;
            }

            ServiceInfo v3 = v1.getServiceInfo(new ComponentName(arg3, arg4), 0);
            if(v3 != null && (v3.enabled)) {
                return 1;
            }
        }
        catch(PackageManager$NameNotFoundException ) {
        }

        return 0;
    }

    @VisibleForTesting static long zzc(byte[] arg9) {
        Preconditions.checkNotNull(arg9);
        int v1 = 0;
        boolean v0 = arg9.length > 0 ? true : false;
        Preconditions.checkState(v0);
        long v3 = 0;
        int v0_1;
        for(v0_1 = arg9.length - 1; v0_1 >= 0; --v0_1) {
            if(v0_1 < arg9.length - 8) {
                return v3;
            }

            v3 += ((((long)arg9[v0_1])) & 0xFF) << v1;
            v1 += 8;
        }

        return v3;
    }

    static boolean zzcg(String arg3) {
        Preconditions.checkNotEmpty(arg3);
        if(arg3.charAt(0) == 0x5F) {
            if(arg3.equals("_ep")) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    final int zzch(String arg4) {
        int v1 = 2;
        if(!this.zzr("event", arg4)) {
            return v1;
        }

        if(!this.zza("event", Event.zzacw, arg4)) {
            return 13;
        }

        if(!this.zza("event", 40, arg4)) {
            return v1;
        }

        return 0;
    }

    public final int zzci(String arg4) {
        int v1 = 6;
        if(!this.zzq("user property", arg4)) {
            return v1;
        }

        if(!this.zza("user property", UserProperty.zzada, arg4)) {
            return 15;
        }

        if(!this.zza("user property", 24, arg4)) {
            return v1;
        }

        return 0;
    }

    final int zzcj(String arg4) {
        int v1 = 6;
        if(!this.zzr("user property", arg4)) {
            return v1;
        }

        if(!this.zza("user property", UserProperty.zzada, arg4)) {
            return 15;
        }

        if(!this.zza("user property", 24, arg4)) {
            return v1;
        }

        return 0;
    }

    final boolean zzck(String arg4) {
        if(TextUtils.isEmpty(((CharSequence)arg4))) {
            ((zzhi)this).zzgi().zziv().log("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            return 0;
        }

        Preconditions.checkNotNull(arg4);
        if(!arg4.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
            ((zzhi)this).zzgi().zziv().zzg("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", arg4);
            return 0;
        }

        return 1;
    }

    private static int zzcl(String arg1) {
        if("_ldl".equals(arg1)) {
            return 0x800;
        }

        if("_id".equals(arg1)) {
            return 0x100;
        }

        return 36;
    }

    static boolean zzcm(String arg1) {
        if(!TextUtils.isEmpty(((CharSequence)arg1)) && (arg1.startsWith("_"))) {
            return 1;
        }

        return 0;
    }

    final boolean zzcn(String arg2) {
        if(TextUtils.isEmpty(((CharSequence)arg2))) {
            return 0;
        }

        String v0 = ((zzhi)this).zzgk().zzhs();
        ((zzhi)this).zzgl();
        return v0.equals(arg2);
    }

    static boolean zzd(Intent arg1) {
        String v1 = arg1.getStringExtra("android.intent.extra.REFERRER_NAME");
        if(!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(v1) && !"https://www.google.com".equals(v1)) {
            if("android-app://com.google.appcrawler".equals(v1)) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    @WorkerThread final long zzd(Context arg7, String arg8) {
        ((zzhi)this).zzab();
        Preconditions.checkNotNull(arg7);
        Preconditions.checkNotEmpty(arg8);
        PackageManager v0 = arg7.getPackageManager();
        MessageDigest v1 = zzkd.getMessageDigest();
        long v2 = -1;
        long v4 = 0;
        if(v1 == null) {
            ((zzhi)this).zzgi().zziv().log("Could not get MD5 instance");
            return v2;
        }

        if(v0 != null) {
            try {
                if(this.zze(arg7, arg8)) {
                    return v4;
                }

                PackageInfo v7_1 = Wrappers.packageManager(arg7).getPackageInfo(((zzhi)this).getContext().getPackageName(), 0x40);
                if(v7_1.signatures != null && v7_1.signatures.length > 0) {
                    return zzkd.zzc(v1.digest(v7_1.signatures[0].toByteArray()));
                }

                ((zzhi)this).zzgi().zziy().log("Could not get signatures");
                return v2;
            }
            catch(PackageManager$NameNotFoundException v7) {
                ((zzhi)this).zzgi().zziv().zzg("Package name not found", v7);
            }
        }

        return v4;
    }

    final Bundle zzd(Bundle arg7) {
        Bundle v0 = new Bundle();
        if(arg7 != null) {
            Iterator v1 = arg7.keySet().iterator();
            while(v1.hasNext()) {
                Object v2 = v1.next();
                Object v3 = this.zzh(((String)v2), arg7.get(((String)v2)));
                if(v3 == null) {
                    ((zzhi)this).zzgi().zziy().zzg("Param value can\'t be null", ((zzhi)this).zzgf().zzbn(((String)v2)));
                }
                else {
                    this.zza(v0, ((String)v2), v3);
                }
            }
        }

        return v0;
    }

    @VisibleForTesting private final boolean zze(Context arg3, String arg4) {
        String v0_1;
        zzfk v4;
        X500Principal v0 = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo v3_2 = Wrappers.packageManager(arg3).getPackageInfo(arg4, 0x40);
            if(v3_2 == null) {
                return 1;
            }

            if(v3_2.signatures == null) {
                return 1;
            }

            if(v3_2.signatures.length <= 0) {
                return 1;
            }

            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(v3_2.signatures[0].toByteArray())).getSubjectX500Principal().equals(v0);
        }
        catch(PackageManager$NameNotFoundException v3) {
            v4 = ((zzhi)this).zzgi().zziv();
            v0_1 = "Package name not found";
        }
        catch(CertificateException v3_1) {
            v4 = ((zzhi)this).zzgi().zziv();
            v0_1 = "Error obtaining certificate";
        }

        v4.zzg(v0_1, v3_1);
        return 1;
    }

    static Bundle[] zze(Object arg2) {
        Object[] v2;
        if((arg2 instanceof Bundle)) {
            return new Bundle[]{arg2};
        }

        if((arg2 instanceof Parcelable[])) {
            v2 = Arrays.copyOf(((Object[])arg2), arg2.length, Bundle[].class);
        }
        else if((arg2 instanceof ArrayList)) {
            v2 = ((ArrayList)arg2).toArray(new Bundle[((ArrayList)arg2).size()]);
        }
        else {
            return null;
        }

        return ((Bundle[])v2);
    }

    public static Object zzf(Object arg4) {
        Object v1_2;
        ObjectInputStream v4;
        ObjectOutputStream v2;
        ByteArrayOutputStream v1_1;
        Object v0 = null;
        if(arg4 == null) {
            return v0;
        }

        try {
            v1_1 = new ByteArrayOutputStream();
            v2 = new ObjectOutputStream(((OutputStream)v1_1));
        }
        catch(Throwable v1) {
            v4 = ((ObjectInputStream)v0);
            v2 = ((ObjectOutputStream)v4);
            goto label_26;
        }

        try {
            v2.writeObject(arg4);
            v2.flush();
            v4 = new ObjectInputStream(new ByteArrayInputStream(v1_1.toByteArray()));
        }
        catch(Throwable v1) {
            v4 = ((ObjectInputStream)v0);
            goto label_26;
        }

        try {
            v1_2 = v4.readObject();
            goto label_15;
        }
        catch(Throwable v1) {
            try {
            label_26:
                if(v2 != null) {
                    v2.close();
                }

                if(v4 != null) {
                    v4.close();
                }

                throw v1;
            label_15:
                v2.close();
                v4.close();
                return v1_2;
            }
            catch(ClassNotFoundException ) {
                return v0;
            }
        }
    }

    public final void zzfu() {
        super.zzfu();
    }

    public final void zzfv() {
        super.zzfv();
    }

    public final void zzfw() {
        super.zzfw();
    }

    public final zzer zzge() {
        return super.zzge();
    }

    public final zzfg zzgf() {
        return super.zzgf();
    }

    public final zzkd zzgg() {
        return super.zzgg();
    }

    public final zzgi zzgh() {
        return super.zzgh();
    }

    public final zzfi zzgi() {
        return super.zzgi();
    }

    public final zzft zzgj() {
        return super.zzgj();
    }

    public final zzeh zzgk() {
        return super.zzgk();
    }

    public final zzee zzgl() {
        return super.zzgl();
    }

    protected final boolean zzgn() {
        return 1;
    }

    @WorkerThread protected final void zzgo() {
        ((zzhi)this).zzab();
        SecureRandom v0 = new SecureRandom();
        long v1 = v0.nextLong();
        long v3 = 0;
        if(v1 == v3) {
            v1 = v0.nextLong();
            if(v1 == v3) {
                ((zzhi)this).zzgi().zziy().log("Utils falling back to Random for random id");
            }
        }

        this.zzasz.set(v1);
    }

    final Object zzh(String arg3, Object arg4) {
        boolean v3;
        int v1 = 0x100;
        if("_ev".equals(arg3)) {
            v3 = true;
        }
        else {
            if(zzkd.zzcm(arg3)) {
            }
            else {
                v1 = 100;
            }

            v3 = false;
        }

        return zzkd.zza(v1, arg4, v3);
    }

    final int zzi(String arg8, Object arg9) {
        boolean v8 = "_ldl".equals(arg8) ? this.zza("user property referrer", arg8, zzkd.zzcl(arg8), arg9, false) : this.zza("user property", arg8, zzkd.zzcl(arg8), arg9, false);
        if(v8) {
            return 0;
        }

        return 7;
    }

    final Object zzj(String arg2, Object arg3) {
        boolean v0;
        int v2;
        if("_ldl".equals(arg2)) {
            v2 = zzkd.zzcl(arg2);
            v0 = true;
        }
        else {
            v2 = zzkd.zzcl(arg2);
            v0 = false;
        }

        return zzkd.zza(v2, arg3, v0);
    }

    public final long zzln() {
        AtomicLong v0;
        if(this.zzasz.get() == 0) {
            v0 = this.zzasz;
            __monitor_enter(v0);
            try {
                long v1_1 = new Random(System.nanoTime() ^ ((zzhi)this).zzbt().currentTimeMillis()).nextLong();
                int v3 = this.zzadj + 1;
                this.zzadj = v3;
                __monitor_exit(v0);
                return v1_1 + (((long)v3));
            label_21:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_21;
            }

            throw v1;
        }

        v0 = this.zzasz;
        __monitor_enter(v0);
        try {
            this.zzasz.compareAndSet(-1, 1);
            __monitor_exit(v0);
            return this.zzasz.getAndIncrement();
        label_34:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_34;
        }

        throw v1;
    }

    @WorkerThread final SecureRandom zzlo() {
        ((zzhi)this).zzab();
        if(this.zzasy == null) {
            this.zzasy = new SecureRandom();
        }

        return this.zzasy;
    }

    public final int zzlp() {
        if(this.zzata == null) {
            this.zzata = Integer.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(((zzhi)this).getContext()) / 1000);
        }

        return this.zzata.intValue();
    }

    final boolean zzq(String arg6, String arg7) {
        if(arg7 == null) {
            ((zzhi)this).zzgi().zziv().zzg("Name is required and can\'t be null. Type", arg6);
            return 0;
        }

        if(arg7.length() == 0) {
            ((zzhi)this).zzgi().zziv().zzg("Name is required and can\'t be empty. Type", arg6);
            return 0;
        }

        int v1 = arg7.codePointAt(0);
        if(!Character.isLetter(v1)) {
            ((zzhi)this).zzgi().zziv().zze("Name must start with a letter. Type, name", arg6, arg7);
            return 0;
        }

        int v2 = arg7.length();
        for(v1 = Character.charCount(v1); v1 < v2; v1 += Character.charCount(v3)) {
            int v3 = arg7.codePointAt(v1);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                ((zzhi)this).zzgi().zziv().zze("Name must consist of letters, digits or _ (underscores). Type, name", arg6, arg7);
                return 0;
            }
        }

        return 1;
    }

    private final boolean zzr(String arg7, String arg8) {
        if(arg8 == null) {
            ((zzhi)this).zzgi().zziv().zzg("Name is required and can\'t be null. Type", arg7);
            return 0;
        }

        if(arg8.length() == 0) {
            ((zzhi)this).zzgi().zziv().zzg("Name is required and can\'t be empty. Type", arg7);
            return 0;
        }

        int v1 = arg8.codePointAt(0);
        int v3 = 0x5F;
        if(!Character.isLetter(v1) && v1 != v3) {
            ((zzhi)this).zzgi().zziv().zze("Name must start with a letter or _ (underscore). Type, name", arg7, arg8);
            return 0;
        }

        int v2 = arg8.length();
        for(v1 = Character.charCount(v1); v1 < v2; v1 += Character.charCount(v4)) {
            int v4 = arg8.codePointAt(v1);
            if(v4 != v3 && !Character.isLetterOrDigit(v4)) {
                ((zzhi)this).zzgi().zziv().zze("Name must consist of letters, digits or _ (underscores). Type, name", arg7, arg8);
                return 0;
            }
        }

        return 1;
    }

    static boolean zzs(String arg0, String arg1) {
        if(arg0 == null && arg1 == null) {
            return 1;
        }

        if(arg0 == null) {
            return 0;
        }

        return arg0.equals(arg1);
    }

    @WorkerThread final boolean zzx(String arg3) {
        ((zzhi)this).zzab();
        if(Wrappers.packageManager(((zzhi)this).getContext()).checkCallingOrSelfPermission(arg3) == 0) {
            return 1;
        }

        ((zzhi)this).zzgi().zzjb().zzg("Permission not granted", arg3);
        return 0;
    }
}

