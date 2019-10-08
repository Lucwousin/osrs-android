package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.common.util.Clock;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.BitSet;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public final class zzjz extends zzjs {
    zzjz(zzjt arg1) {
        super(arg1);
    }

    public final Context getContext() {
        return super.getContext();
    }

    final void zza(zzkx arg2, Object arg3) {
        Preconditions.checkNotNull(arg3);
        arg2.zzale = null;
        arg2.zzave = null;
        arg2.zzasw = null;
        if((arg3 instanceof String)) {
            arg2.zzale = ((String)arg3);
            return;
        }

        if((arg3 instanceof Long)) {
            arg2.zzave = ((Long)arg3);
            return;
        }

        if((arg3 instanceof Double)) {
            arg2.zzasw = ((Double)arg3);
            return;
        }

        ((zzhi)this).zzgi().zziv().zzg("Ignoring invalid (type) user attribute value", arg3);
    }

    static zzks[] zza(zzks[] arg5, String arg6, Object arg7) {
        int v0 = arg5.length;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            zzks v3 = arg5[v2];
            if(arg6.equals(v3.name)) {
                v3.zzave = null;
                v3.zzale = null;
                v3.zzasw = null;
                if((arg7 instanceof Long)) {
                    v3.zzave = ((Long)arg7);
                }
                else if((arg7 instanceof String)) {
                    v3.zzale = ((String)arg7);
                }
                else if((arg7 instanceof Double)) {
                    v3.zzasw = ((Double)arg7);
                }

                return arg5;
            }
        }

        zzks[] v0_1 = new zzks[arg5.length + 1];
        System.arraycopy(arg5, 0, v0_1, 0, arg5.length);
        zzks v1 = new zzks();
        v1.name = arg6;
        if((arg7 instanceof Long)) {
            v1.zzave = ((Long)arg7);
        }
        else if((arg7 instanceof String)) {
            v1.zzale = ((String)arg7);
        }
        else if((arg7 instanceof Double)) {
            v1.zzasw = ((Double)arg7);
        }

        v0_1[arg5.length] = v1;
        return v0_1;
    }

    final boolean zza(long arg5, long arg7) {
        long v1 = 0;
        if(arg5 != v1) {
            if(arg7 <= v1) {
            }
            else if(Math.abs(((zzhi)this).zzbt().currentTimeMillis() - arg5) > arg7) {
                return 1;
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    final void zza(zzks arg2, Object arg3) {
        Preconditions.checkNotNull(arg3);
        arg2.zzale = null;
        arg2.zzave = null;
        arg2.zzasw = null;
        if((arg3 instanceof String)) {
            arg2.zzale = ((String)arg3);
            return;
        }

        if((arg3 instanceof Long)) {
            arg2.zzave = ((Long)arg3);
            return;
        }

        if((arg3 instanceof Double)) {
            arg2.zzasw = ((Double)arg3);
            return;
        }

        ((zzhi)this).zzgi().zziv().zzg("Ignoring invalid (type) event param value", arg3);
    }

    final byte[] zza(zzkt arg4) {
        try {
            byte[] v0 = new byte[((zzacj)arg4).zzwb()];
            zzacb v1 = zzacb.zzb(v0, 0, v0.length);
            ((zzacj)arg4).zza(v1);
            v1.zzvt();
            return v0;
        }
        catch(IOException v4) {
            ((zzhi)this).zzgi().zziv().zzg("Data loss. Failed to serialize batch", v4);
            return null;
        }
    }

    static boolean zza(long[] arg6, int arg7) {
        if(arg7 >= arg6.length << 6) {
            return 0;
        }

        if((1 << arg7 % 0x40 & arg6[arg7 / 0x40]) != 0) {
            return 1;
        }

        return 0;
    }

    static long[] zza(BitSet arg10) {
        int v1 = 0x40;
        int v0 = (arg10.length() + 0x3F) / v1;
        long[] v2 = new long[v0];
        int v4;
        for(v4 = 0; v4 < v0; ++v4) {
            v2[v4] = 0;
            int v5;
            for(v5 = 0; v5 < v1; ++v5) {
                int v6 = (v4 << 6) + v5;
                if(v6 >= arg10.length()) {
                    break;
                }

                if(arg10.get(v6)) {
                    v2[v4] |= 1 << v5;
                }
            }
        }

        return v2;
    }

    static zzks zza(zzkr arg4, String arg5) {
        zzks[] v4 = arg4.zzava;
        int v0 = v4.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            zzks v2 = v4[v1];
            if(v2.name.equals(arg5)) {
                return v2;
            }
        }

        return null;
    }

    final String zza(zzkh arg7) {
        if(arg7 == null) {
            return "null";
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("\nevent_filter {\n");
        int v3 = 0;
        zzjz.zza(v0, 0, "filter_id", arg7.zzatk);
        zzjz.zza(v0, 0, "event_name", ((zzhi)this).zzgf().zzbm(arg7.zzatl));
        this.zza(v0, 1, "event_count_filter", arg7.zzato);
        v0.append("  filters {\n");
        zzki[] v7 = arg7.zzatm;
        int v1 = v7.length;
        while(v3 < v1) {
            this.zza(v0, 2, v7[v3]);
            ++v3;
        }

        zzjz.zza(v0, 1);
        v0.append("}\n}\n");
        return v0.toString();
    }

    final String zza(zzkk arg6) {
        if(arg6 == null) {
            return "null";
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("\nproperty_filter {\n");
        zzjz.zza(v0, 0, "filter_id", arg6.zzatk);
        zzjz.zza(v0, 0, "property_name", ((zzhi)this).zzgf().zzbo(arg6.zzauc));
        this.zza(v0, 1, arg6.zzaud);
        v0.append("}\n");
        return v0.toString();
    }

    final byte[] zza(byte[] arg6) throws IOException {
        try {
            ByteArrayInputStream v0 = new ByteArrayInputStream(arg6);
            GZIPInputStream v6_1 = new GZIPInputStream(((InputStream)v0));
            ByteArrayOutputStream v1 = new ByteArrayOutputStream();
            byte[] v2 = new byte[0x400];
            while(true) {
                int v3 = v6_1.read(v2);
                if(v3 <= 0) {
                    break;
                }

                v1.write(v2, 0, v3);
            }

            v6_1.close();
            v0.close();
            return v1.toByteArray();
        }
        catch(IOException v6) {
            ((zzhi)this).zzgi().zziv().zzg("Failed to ungzip content", v6);
            throw v6;
        }
    }

    final Parcelable zza(byte[] arg5, Parcelable$Creator arg6) {
        Parcelable v0 = null;
        if(arg5 == null) {
            return v0;
        }

        Parcel v1 = Parcel.obtain();
        try {
            v1.unmarshall(arg5, 0, arg5.length);
            v1.setDataPosition(0);
            Object v5_1 = arg6.createFromParcel(v1);
            v1.recycle();
            return ((Parcelable)v5_1);
        }
        catch(Throwable v5) {
        label_19:
            v1.recycle();
            throw v5;
        }
        catch(ParseException ) {
            try {
                ((zzhi)this).zzgi().zziv().log("Failed to load parcelable from buffer");
            }
            catch(Throwable v5) {
                goto label_19;
            }

            v1.recycle();
            return v0;
        }
    }

    private static void zza(StringBuilder arg2, int arg3) {
        int v0;
        for(v0 = 0; v0 < arg3; ++v0) {
            arg2.append("  ");
        }
    }

    private final void zza(StringBuilder arg7, int arg8, zzki arg9) {
        if(arg9 == null) {
            return;
        }

        zzjz.zza(arg7, arg8);
        arg7.append("filter {\n");
        zzjz.zza(arg7, arg8, "complement", arg9.zzats);
        zzjz.zza(arg7, arg8, "param_name", ((zzhi)this).zzgf().zzbn(arg9.zzatt));
        int v0 = arg8 + 1;
        String v1 = "string_filter";
        zzkl v2 = arg9.zzatq;
        if(v2 != null) {
            zzjz.zza(arg7, v0);
            arg7.append(v1);
            arg7.append(" {\n");
            if(v2.zzaue != null) {
                v1 = "UNKNOWN_MATCH_TYPE";
                switch(v2.zzaue.intValue()) {
                    case 1: {
                        v1 = "REGEXP";
                        break;
                    }
                    case 2: {
                        v1 = "BEGINS_WITH";
                        break;
                    }
                    case 3: {
                        v1 = "ENDS_WITH";
                        break;
                    }
                    case 4: {
                        v1 = "PARTIAL";
                        break;
                    }
                    case 5: {
                        v1 = "EXACT";
                        break;
                    }
                    case 6: {
                        v1 = "IN_LIST";
                        break;
                    }
                    default: {
                        break;
                    }
                }

                zzjz.zza(arg7, v0, "match_type", v1);
            }

            zzjz.zza(arg7, v0, "expression", v2.zzauf);
            zzjz.zza(arg7, v0, "case_sensitive", v2.zzaug);
            if(v2.zzauh.length > 0) {
                zzjz.zza(arg7, v0 + 1);
                arg7.append("expression_list {\n");
                String[] v1_1 = v2.zzauh;
                int v2_1 = v1_1.length;
                int v3;
                for(v3 = 0; v3 < v2_1; ++v3) {
                    String v4 = v1_1[v3];
                    zzjz.zza(arg7, v0 + 2);
                    arg7.append(v4);
                    arg7.append("\n");
                }

                arg7.append("}\n");
            }

            zzjz.zza(arg7, v0);
            arg7.append("}\n");
        }

        this.zza(arg7, v0, "number_filter", arg9.zzatr);
        zzjz.zza(arg7, arg8);
        arg7.append("}\n");
    }

    private static void zza(StringBuilder arg0, int arg1, String arg2, Object arg3) {
        if(arg3 == null) {
            return;
        }

        zzjz.zza(arg0, arg1 + 1);
        arg0.append(arg2);
        arg0.append(": ");
        arg0.append(arg3);
        arg0.append('\n');
    }

    private final void zza(StringBuilder arg2, int arg3, String arg4, zzkj arg5) {
        if(arg5 == null) {
            return;
        }

        zzjz.zza(arg2, arg3);
        arg2.append(arg4);
        arg2.append(" {\n");
        if(arg5.zzatw != null) {
            arg4 = "UNKNOWN_COMPARISON_TYPE";
            switch(arg5.zzatw.intValue()) {
                case 1: {
                    arg4 = "LESS_THAN";
                    break;
                }
                case 2: {
                    arg4 = "GREATER_THAN";
                    break;
                }
                case 3: {
                    arg4 = "EQUAL";
                    break;
                }
                case 4: {
                    arg4 = "BETWEEN";
                    break;
                }
                default: {
                    break;
                }
            }

            zzjz.zza(arg2, arg3, "comparison_type", arg4);
        }

        zzjz.zza(arg2, arg3, "match_as_float", arg5.zzatx);
        zzjz.zza(arg2, arg3, "comparison_value", arg5.zzaty);
        zzjz.zza(arg2, arg3, "min_comparison_value", arg5.zzatz);
        zzjz.zza(arg2, arg3, "max_comparison_value", arg5.zzaua);
        zzjz.zza(arg2, arg3);
        arg2.append("}\n");
    }

    private static void zza(StringBuilder arg8, int arg9, String arg10, zzkv arg11) {
        int v4;
        long[] v10;
        if(arg11 == null) {
            return;
        }

        arg9 = 3;
        zzjz.zza(arg8, arg9);
        arg8.append(arg10);
        arg8.append(" {\n");
        char v0 = '\n';
        int v1 = 4;
        int v2 = 0;
        if(arg11.zzawm != null) {
            zzjz.zza(arg8, v1);
            arg8.append("results: ");
            v10 = arg11.zzawm;
            int v3 = v10.length;
            v4 = 0;
            int v5;
            for(v5 = 0; v4 < v3; v5 = v7) {
                Long v6 = Long.valueOf(v10[v4]);
                int v7 = v5 + 1;
                if(v5 != 0) {
                    arg8.append(", ");
                }

                arg8.append(v6);
                ++v4;
            }

            arg8.append(v0);
        }

        if(arg11.zzawl != null) {
            zzjz.zza(arg8, v1);
            arg8.append("status: ");
            v10 = arg11.zzawl;
            int v11 = v10.length;
            for(v1 = 0; v2 < v11; v1 = v4) {
                Long v3_1 = Long.valueOf(v10[v2]);
                v4 = v1 + 1;
                if(v1 != 0) {
                    arg8.append(", ");
                }

                arg8.append(v3_1);
                ++v2;
            }

            arg8.append(v0);
        }

        zzjz.zza(arg8, arg9);
        arg8.append("}\n");
    }

    public final void zzab() {
        super.zzab();
    }

    final byte[] zzb(byte[] arg3) throws IOException {
        try {
            ByteArrayOutputStream v0 = new ByteArrayOutputStream();
            GZIPOutputStream v1 = new GZIPOutputStream(((OutputStream)v0));
            v1.write(arg3);
            v1.close();
            v0.close();
            return v0.toByteArray();
        }
        catch(IOException v3) {
            ((zzhi)this).zzgi().zziv().zzg("Failed to gzip content", v3);
            throw v3;
        }
    }

    static Object zzb(zzkr arg0, String arg1) {
        zzks v0 = zzjz.zza(arg0, arg1);
        if(v0 != null) {
            if(v0.zzale != null) {
                return v0.zzale;
            }
            else if(v0.zzave != null) {
                return v0.zzave;
            }
            else if(v0.zzasw != null) {
                return v0.zzasw;
            }
        }

        return null;
    }

    final String zzb(zzkt arg17) {
        int v9;
        zzkt v0 = arg17;
        StringBuilder v1 = new StringBuilder();
        v1.append("\nbatch {\n");
        if(v0.zzavf != null) {
            zzku[] v0_1 = v0.zzavf;
            int v2 = v0_1.length;
            int v4;
            for(v4 = 0; v4 < v2; ++v4) {
                zzku v5 = v0_1[v4];
                if(v5 != null && v5 != null) {
                    zzjz.zza(v1, 1);
                    v1.append("bundle {\n");
                    zzjz.zza(v1, 1, "protocol_version", v5.zzavh);
                    zzjz.zza(v1, 1, "platform", v5.zzavp);
                    zzjz.zza(v1, 1, "gmp_version", v5.zzavt);
                    zzjz.zza(v1, 1, "uploading_gmp_version", v5.zzavu);
                    zzjz.zza(v1, 1, "config_version", v5.zzawf);
                    zzjz.zza(v1, 1, "gmp_app_id", v5.zzafa);
                    zzjz.zza(v1, 1, "app_id", v5.zzth);
                    zzjz.zza(v1, 1, "app_version", v5.zztg);
                    zzjz.zza(v1, 1, "app_version_major", v5.zzawb);
                    zzjz.zza(v1, 1, "firebase_instance_id", v5.zzafc);
                    zzjz.zza(v1, 1, "dev_cert_hash", v5.zzavx);
                    zzjz.zza(v1, 1, "app_store", v5.zzafh);
                    zzjz.zza(v1, 1, "upload_timestamp_millis", v5.zzavk);
                    zzjz.zza(v1, 1, "start_timestamp_millis", v5.zzavl);
                    zzjz.zza(v1, 1, "end_timestamp_millis", v5.zzavm);
                    zzjz.zza(v1, 1, "previous_bundle_start_timestamp_millis", v5.zzavn);
                    zzjz.zza(v1, 1, "previous_bundle_end_timestamp_millis", v5.zzavo);
                    zzjz.zza(v1, 1, "app_instance_id", v5.zzaez);
                    zzjz.zza(v1, 1, "resettable_device_id", v5.zzavv);
                    zzjz.zza(v1, 1, "device_id", v5.zzawe);
                    zzjz.zza(v1, 1, "ds_id", v5.zzawh);
                    zzjz.zza(v1, 1, "limited_ad_tracking", v5.zzavw);
                    zzjz.zza(v1, 1, "os_version", v5.zzavq);
                    zzjz.zza(v1, 1, "device_model", v5.zzavr);
                    zzjz.zza(v1, 1, "user_default_language", v5.zzahd);
                    zzjz.zza(v1, 1, "time_zone_offset_minutes", v5.zzavs);
                    zzjz.zza(v1, 1, "bundle_sequential_index", v5.zzavy);
                    zzjz.zza(v1, 1, "service_upload", v5.zzavz);
                    zzjz.zza(v1, 1, "health_monitor", v5.zzafy);
                    if(v5.zzawg != null && v5.zzawg.longValue() != 0) {
                        zzjz.zza(v1, 1, "android_id", v5.zzawg);
                    }

                    if(v5.zzawj != null) {
                        zzjz.zza(v1, 1, "retry_counter", v5.zzawj);
                    }

                    zzkx[] v7 = v5.zzavj;
                    int v8 = 2;
                    if(v7 != null) {
                        v9 = v7.length;
                        int v10;
                        for(v10 = 0; v10 < v9; ++v10) {
                            zzkx v11 = v7[v10];
                            if(v11 != null) {
                                zzjz.zza(v1, v8);
                                v1.append("user_property {\n");
                                zzjz.zza(v1, v8, "set_timestamp_millis", v11.zzaws);
                                zzjz.zza(v1, v8, "name", ((zzhi)this).zzgf().zzbo(v11.name));
                                zzjz.zza(v1, v8, "string_value", v11.zzale);
                                zzjz.zza(v1, v8, "int_value", v11.zzave);
                                zzjz.zza(v1, v8, "double_value", v11.zzasw);
                                zzjz.zza(v1, v8);
                                v1.append("}\n");
                            }
                        }
                    }

                    zzkp[] v7_1 = v5.zzawa;
                    if(v7_1 != null) {
                        v9 = v7_1.length;
                        for(v10 = 0; v10 < v9; ++v10) {
                            zzkp v11_1 = v7_1[v10];
                            if(v11_1 != null) {
                                zzjz.zza(v1, v8);
                                v1.append("audience_membership {\n");
                                zzjz.zza(v1, v8, "audience_id", v11_1.zzate);
                                zzjz.zza(v1, v8, "new_audience", v11_1.zzauv);
                                zzjz.zza(v1, v8, "current_data", v11_1.zzaut);
                                zzjz.zza(v1, v8, "previous_data", v11_1.zzauu);
                                zzjz.zza(v1, v8);
                                v1.append("}\n");
                            }
                        }
                    }

                    zzkr[] v5_1 = v5.zzavi;
                    if(v5_1 != null) {
                        int v7_2 = v5_1.length;
                        for(v9 = 0; v9 < v7_2; ++v9) {
                            zzkr v10_1 = v5_1[v9];
                            if(v10_1 != null) {
                                zzjz.zza(v1, v8);
                                v1.append("event {\n");
                                zzjz.zza(v1, v8, "name", ((zzhi)this).zzgf().zzbm(v10_1.name));
                                zzjz.zza(v1, v8, "timestamp_millis", v10_1.zzavb);
                                zzjz.zza(v1, v8, "previous_timestamp_millis", v10_1.zzavc);
                                zzjz.zza(v1, v8, "count", v10_1.count);
                                zzks[] v10_2 = v10_1.zzava;
                                if(v10_2 != null) {
                                    int v11_2 = v10_2.length;
                                    int v12;
                                    for(v12 = 0; v12 < v11_2; ++v12) {
                                        zzks v13 = v10_2[v12];
                                        if(v13 != null) {
                                            zzjz.zza(v1, 3);
                                            v1.append("param {\n");
                                            zzjz.zza(v1, 3, "name", ((zzhi)this).zzgf().zzbn(v13.name));
                                            zzjz.zza(v1, 3, "string_value", v13.zzale);
                                            zzjz.zza(v1, 3, "int_value", v13.zzave);
                                            zzjz.zza(v1, 3, "double_value", v13.zzasw);
                                            zzjz.zza(v1, 3);
                                            v1.append("}\n");
                                        }
                                    }
                                }

                                zzjz.zza(v1, v8);
                                v1.append("}\n");
                            }
                        }
                    }

                    zzjz.zza(v1, 1);
                    v1.append("}\n");
                }
            }
        }

        v1.append("}\n");
        return v1.toString();
    }

    public final Clock zzbt() {
        return super.zzbt();
    }

    static boolean zzcf(String arg1) {
        if(arg1 != null && (arg1.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)")) && arg1.length() <= 310) {
            return 1;
        }

        return 0;
    }

    @WorkerThread final boolean zzd(zzex arg1, zzeb arg2) {
        Preconditions.checkNotNull(arg1);
        Preconditions.checkNotNull(arg2);
        if(TextUtils.isEmpty(arg2.zzafa)) {
            ((zzhi)this).zzgl();
            return 0;
        }

        return 1;
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
        return 0;
    }

    public final zzjz zzjf() {
        return super.zzjf();
    }

    public final zzed zzjg() {
        return super.zzjg();
    }

    public final zzek zzjh() {
        return super.zzjh();
    }
}

