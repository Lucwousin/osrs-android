package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement$Event;
import com.google.android.gms.measurement.AppMeasurement$Param;
import com.google.android.gms.measurement.AppMeasurement$UserProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

final class zzed extends zzjs {
    zzed(zzjt arg1) {
        super(arg1);
    }

    @WorkerThread final zzkp[] zza(String arg69, zzkr[] arg70, zzkx[] arg71) {
        zzfk v3_6;
        byte[] v8_3;
        zzkp v3_4;
        Boolean v9_6;
        ArrayMap v67;
        ArrayMap v66;
        ArrayMap v65;
        Iterator v64;
        Iterator v63;
        Object v62;
        int v61;
        Iterator v9_4;
        ArrayMap v60;
        Object v13_3;
        int v8_2;
        Iterator v6_5;
        Object v5_4;
        zzkx v4_7;
        Integer v4_6;
        Integer v3_3;
        zzfk v1_13;
        Boolean v4_5;
        String v4_4;
        String v3_2;
        zzfk v2_9;
        Boolean v1_12;
        Object v15_2;
        ArrayMap v7;
        Object v10_2;
        zzkr v12_2;
        BitSet v11_2;
        ArrayMap v55;
        BitSet v2_8;
        Object v52_1;
        ArrayMap v52;
        BitSet v51;
        Object v50;
        Iterator v49;
        Object v48;
        Object v2_6;
        ArrayMap v15_1;
        int v13_2;
        Object v11_1;
        ArrayMap v1_9;
        String v5_3;
        zzkr v2_5;
        ArrayMap v45;
        HashSet v44;
        ArrayMap v43;
        ArrayMap v41;
        ArrayMap v42;
        ArrayMap v40;
        zzkr v39_1;
        String v0_10;
        ArrayMap v59;
        ArrayMap v57;
        ArrayMap v56;
        ArrayMap v58;
        HashSet v14;
        ArrayMap v47;
        Object[] v0_8;
        zzks[] v29_1;
        Object v39;
        int v5_2;
        int v3_1;
        boolean v24;
        zzkr v13_1;
        String[] v4_3;
        Object v37;
        String v2_3;
        SQLiteDatabase v0_6;
        long v1_4;
        Object v16;
        int v25;
        int v23;
        Object v9_2;
        int v36;
        String v9_1;
        Object v0_4;
        ArrayMap v33;
        ArrayMap v32;
        ArrayMap v31;
        int v0_2;
        BitSet v4_2;
        BitSet v6_1;
        int v4_1;
        Object v28;
        int v1_1;
        Iterator v27;
        Map v26;
        ArrayMap v5;
        Object v4;
        Object v3;
        int v2;
        String v15 = arg69;
        zzkr[] v13 = arg70;
        Preconditions.checkNotEmpty(arg69);
        HashSet v11 = new HashSet();
        ArrayMap v12 = new ArrayMap();
        ArrayMap v10 = new ArrayMap();
        ArrayMap v9 = new ArrayMap();
        ArrayMap v8 = new ArrayMap();
        boolean v22 = ((zzhi)this).zzgk().zzd(v15, zzez.zzajx);
        Map v0 = ((zzjr)this).zzjh().zzbi(v15);
        if(v0 != null) {
            Iterator v1 = v0.keySet().iterator();
            while(v1.hasNext()) {
                v2 = v1.next().intValue();
                v3 = v0.get(Integer.valueOf(v2));
                Object v6 = ((Map)v10).get(Integer.valueOf(v2));
                v4 = ((Map)v9).get(Integer.valueOf(v2));
                if(v22) {
                    v5 = new ArrayMap();
                    if(v3 != null) {
                        v26 = v0;
                        if(((zzkv)v3).zzawn == null) {
                            goto label_60;
                        }
                        else {
                            zzkq[] v0_1 = ((zzkv)v3).zzawn;
                            v27 = v1;
                            v1_1 = v0_1.length;
                            v28 = v4;
                            v4_1 = 0;
                            while(v4_1 < v1_1) {
                                int v29 = v1_1;
                                zzkq v1_2 = v0_1[v4_1];
                                zzkq[] v30 = v0_1;
                                if(v1_2.zzaux != null) {
                                    ((Map)v5).put(v1_2.zzaux, v1_2.zzauy);
                                }

                                ++v4_1;
                                v1_1 = v29;
                                v0_1 = v30;
                            }
                        }
                    }
                    else {
                        v26 = v0;
                    label_60:
                        v27 = v1;
                        v28 = v4;
                    }

                    ((Map)v8).put(Integer.valueOf(v2), v5);
                }
                else {
                    v26 = v0;
                    v27 = v1;
                    v28 = v4;
                    v5 = null;
                }

                if(v6 == null) {
                    v6_1 = new BitSet();
                    ((Map)v10).put(Integer.valueOf(v2), v6_1);
                    v4_2 = new BitSet();
                    ((Map)v9).put(Integer.valueOf(v2), v4_2);
                }
                else {
                    v4 = v28;
                }

                v0_2 = 0;
                while(v0_2 < ((zzkv)v3).zzawl.length << 6) {
                    if(zzjz.zza(((zzkv)v3).zzawl, v0_2)) {
                        v31 = v8;
                        v32 = v9;
                        v33 = v10;
                        ((zzhi)this).zzgi().zzjc().zze("Filter already evaluated. audience ID, filter ID", Integer.valueOf(v2), Integer.valueOf(v0_2));
                        v4_2.set(v0_2);
                        if(zzjz.zza(((zzkv)v3).zzawm, v0_2)) {
                            v6_1.set(v0_2);
                            v1_1 = 1;
                        }
                        else {
                            goto label_107;
                        }
                    }
                    else {
                        v31 = v8;
                        v32 = v9;
                        v33 = v10;
                    label_107:
                        v1_1 = 0;
                    }

                    if(v5 != null && v1_1 == 0) {
                        ((Map)v5).remove(Integer.valueOf(v0_2));
                    }

                    ++v0_2;
                    v8 = v31;
                    v9 = v32;
                    v10 = v33;
                }

                v31 = v8;
                v32 = v9;
                v33 = v10;
                zzkp v0_3 = new zzkp();
                ((Map)v12).put(Integer.valueOf(v2), v0_3);
                v0_3.zzauv = Boolean.valueOf(false);
                v0_3.zzauu = ((zzkv)v3);
                v0_3.zzaut = new zzkv();
                v0_3.zzaut.zzawm = zzjz.zza(v6_1);
                v0_3.zzaut.zzawl = zzjz.zza(v4_2);
                if(v22) {
                    v0_3.zzaut.zzawn = zzed.zzd(((Map)v5));
                }

                v0 = v26;
                v1 = v27;
                v8 = v31;
                v9 = v32;
                v10 = v33;
            }
        }

        v31 = v8;
        v32 = v9;
        v33 = v10;
        if(v13 != null) {
            v8 = new ArrayMap();
            int v6_2 = v13.length;
            long v26_1 = 0;
            long v2_1 = v26_1;
            v0_4 = null;
            Object v1_3 = null;
            v4_1 = 0;
            while(v4_1 < v6_2) {
                zzkr v5_1 = v13[v4_1];
                v9_1 = v5_1.name;
                zzks[] v10_1 = v5_1.zzava;
                long v34 = v2_1;
                if(((zzhi)this).zzgk().zzd(v15, zzez.zzajr)) {
                    ((zzjr)this).zzjf();
                    v3 = zzjz.zzb(v5_1, "_eid");
                    v2 = v3 != null ? 1 : 0;
                    if(v2 != 0) {
                        v36 = v4_1;
                        if(v9_1.equals("_ep")) {
                            v4_1 = 1;
                        }
                        else {
                            goto label_184;
                        }
                    }
                    else {
                        v36 = v4_1;
                    label_184:
                        v4_1 = 0;
                    }

                    if(v4_1 != 0) {
                        ((zzjr)this).zzjf();
                        v9_2 = zzjz.zzb(v5_1, "_en");
                        if(TextUtils.isEmpty(((CharSequence)v9_2))) {
                            ((zzhi)this).zzgi().zziv().zzg("Extra parameter without an event name. eventId", v3);
                            v23 = v6_2;
                            v25 = v36;
                        }
                        else {
                            if(v0_4 == null || v1_3 == null || ((Long)v3).longValue() != ((Long)v1_3).longValue()) {
                                Pair v2_2 = ((zzjr)this).zzjh().zza(v15, ((Long)v3));
                                if(v2_2 != null) {
                                    if(v2_2.first == null) {
                                    }
                                    else {
                                        v0_4 = v2_2.first;
                                        v1_4 = v2_2.second.longValue();
                                        ((zzjr)this).zzjf();
                                        v16 = zzjz.zzb(((zzkr)v0_4), "_eid");
                                        v4 = v0_4;
                                        goto label_224;
                                    }
                                }

                                goto label_323;
                            }
                            else {
                                v4 = v0_4;
                                v16 = v1_3;
                                v1_4 = v34;
                            }

                        label_224:
                            long v17 = v1_4 - 1;
                            if(v17 <= v26_1) {
                                zzek v1_5 = ((zzjr)this).zzjh();
                                ((zzhi)v1_5).zzab();
                                ((zzhi)v1_5).zzgi().zzjc().zzg("Clearing complex main event info. appId", v15);
                                try {
                                    v0_6 = v1_5.getWritableDatabase();
                                    v2_3 = "delete from main_event_params where app_id=?";
                                    v37 = v4;
                                }
                                catch(SQLiteException v0_5) {
                                    v37 = v4;
                                    goto label_250;
                                }

                                try {
                                    v4_3 = new String[1];
                                }
                                catch(SQLiteException v0_5) {
                                    goto label_250;
                                }

                                try {
                                    v4_3[0] = v15;
                                    v0_6.execSQL(v2_3, ((Object[])v4_3));
                                    goto label_254;
                                }
                                catch(SQLiteException v0_5) {
                                }

                            label_250:
                                ((zzhi)v1_5).zzgi().zziv().zzg("Error clearing complex main event", v0_5);
                            label_254:
                                v13_1 = v5_1;
                                v23 = v6_2;
                                v25 = v36;
                                v1_3 = v37;
                                v24 = true;
                                goto label_274;
                            }
                            else {
                                v13_1 = v5_1;
                                v25 = v36;
                                v24 = true;
                                v23 = v6_2;
                                ((zzjr)this).zzjh().zza(arg69, ((Long)v3), v17, v4);
                                v1_3 = v4;
                            label_274:
                                zzks[] v0_7 = new zzks[((zzkr)v1_3).zzava.length + v10_1.length];
                                zzks[] v2_4 = ((zzkr)v1_3).zzava;
                                v3_1 = v2_4.length;
                                v4_1 = 0;
                                v5_2 = 0;
                                while(v4_1 < v3_1) {
                                    zzks v6_3 = v2_4[v4_1];
                                    ((zzjr)this).zzjf();
                                    v39 = v1_3;
                                    if(zzjz.zza(v13_1, v6_3.name) == null) {
                                        v0_7[v5_2] = v6_3;
                                        ++v5_2;
                                    }

                                    ++v4_1;
                                    v1_3 = v39;
                                }

                                v39 = v1_3;
                                if(v5_2 > 0) {
                                    v1_1 = v10_1.length;
                                    v2 = 0;
                                    goto label_300;
                                }
                                else {
                                    ((zzhi)this).zzgi().zziy().zzg("No unique parameters in main event. eventName", v9_2);
                                    v0_4 = v9_2;
                                    v29_1 = v10_1;
                                    goto label_320;
                                label_300:
                                    while(v2 < v1_1) {
                                        v0_7[v5_2] = v10_1[v2];
                                        ++v2;
                                        ++v5_2;
                                    }

                                    if(v5_2 == v0_7.length) {
                                    }
                                    else {
                                        v0_8 = Arrays.copyOf(((Object[])v0_7), v5_2);
                                    }

                                    v29_1 = ((zzks[])v0_8);
                                    v0_4 = v9_2;
                                }

                            label_320:
                                v28 = v16;
                                v34 = v17;
                                goto label_377;
                            }

                        label_323:
                            v23 = v6_2;
                            v25 = v36;
                            ((zzhi)this).zzgi().zziv().zze("Extra parameter without existing main event. eventName, eventId", v9_2, v3);
                        }

                        v47 = v8;
                        v14 = v11;
                        v58 = v12;
                        v56 = v31;
                        v57 = v32;
                        v59 = v33;
                        v2_1 = v34;
                        goto label_727;
                    }

                    v13_1 = v5_1;
                    v23 = v6_2;
                    v25 = v36;
                    v24 = true;
                    if(v2 == 0) {
                        goto label_373;
                    }

                    ((zzjr)this).zzjf();
                    Long v1_6 = Long.valueOf(v26_1);
                    v0_4 = zzjz.zzb(v13_1, "_epc");
                    if(v0_4 == null) {
                        Long v0_9 = v1_6;
                    }

                    long v16_1 = ((Long)v0_4).longValue();
                    if(v16_1 <= v26_1) {
                        ((zzhi)this).zzgi().zziy().zzg("Complex event with zero extra param count. eventName", v9_1);
                        v0_4 = v3;
                    }
                    else {
                        v0_4 = v3;
                        ((zzjr)this).zzjh().zza(arg69, ((Long)v3), v16_1, v13_1);
                    }

                    v28 = v0_4;
                    v0_10 = v9_1;
                    v29_1 = v10_1;
                    v39_1 = v13_1;
                    v34 = v16_1;
                    goto label_377;
                }
                else {
                    v25 = v4_1;
                    v13_1 = v5_1;
                    v23 = v6_2;
                    v24 = true;
                }

            label_373:
                v39 = v0_4;
                v28 = v1_3;
                v0_10 = v9_1;
                v29_1 = v10_1;
            label_377:
                zzet v1_7 = ((zzjr)this).zzjh().zzf(v15, v13_1.name);
                if(v1_7 == null) {
                    ((zzhi)this).zzgi().zziy().zze("Event aggregate wasn\'t created during raw event logging. appId, event", zzfi.zzbp(arg69), ((zzhi)this).zzgf().zzbm(((String)v0_4)));
                    v40 = v8;
                    v42 = v31;
                    v41 = v32;
                    v43 = v33;
                    v44 = v11;
                    v45 = v12;
                    v2_5 = v13_1;
                    v5_3 = v15;
                    v1_7 = new zzet(arg69, v13_1.name, 1, 1, v13_1.zzavb.longValue(), 0, null, null, null);
                }
                else {
                    v40 = v8;
                    v44 = v11;
                    v45 = v12;
                    v2_5 = v13_1;
                    v5_3 = v15;
                    v42 = v31;
                    v41 = v32;
                    v43 = v33;
                    v1_7 = v1_7.zzim();
                }

                ((zzjr)this).zzjh().zza(v1_7);
                long v8_1 = v1_7.zzahh;
                v10 = v40;
                v1_3 = ((Map)v10).get(v0_4);
                if(v1_3 == null) {
                    Map v1_8 = ((zzjr)this).zzjh().zzk(v5_3, ((String)v0_4));
                    if(v1_8 == null) {
                        v1_9 = new ArrayMap();
                    }

                    ((Map)v10).put(v0_4, v1_9);
                }

                v11_1 = v1_9;
                Iterator v12_1 = ((Map)v11_1).keySet().iterator();
                while(true) {
                label_443:
                    if(!v12_1.hasNext()) {
                        goto label_718;
                    }

                    v13_2 = v12_1.next().intValue();
                    v14 = v44;
                    if(!((Set)v14).contains(Integer.valueOf(v13_2))) {
                        break;
                    }

                    ((zzhi)this).zzgi().zzjc().zzg("Skipping failed audience ID", Integer.valueOf(v13_2));
                    v44 = v14;
                }

                v15_1 = v45;
                v1_3 = ((Map)v15_1).get(Integer.valueOf(v13_2));
                ArrayMap v6_4 = v43;
                v4 = ((Map)v6_4).get(Integer.valueOf(v13_2));
                zzkr v46 = v2_5;
                v47 = v10;
                v10 = v41;
                v2_6 = ((Map)v10).get(Integer.valueOf(v13_2));
                if(v22) {
                    v48 = v2_6;
                    v49 = v12_1;
                    v12 = v42;
                    v2_6 = ((Map)v12).get(Integer.valueOf(v13_2));
                }
                else {
                    v48 = v2_6;
                    v49 = v12_1;
                    v12 = v42;
                    v2_6 = null;
                }

                if(v1_3 == null) {
                    zzkp v1_10 = new zzkp();
                    ((Map)v15_1).put(Integer.valueOf(v13_2), v1_10);
                    v1_10.zzauv = Boolean.valueOf(v24);
                    v4_2 = new BitSet();
                    ((Map)v6_4).put(Integer.valueOf(v13_2), v4_2);
                    BitSet v1_11 = new BitSet();
                    v50 = v2_6;
                    ((Map)v10).put(Integer.valueOf(v13_2), v1_11);
                    if(v22) {
                        ArrayMap v2_7 = new ArrayMap();
                        v51 = v1_11;
                        ((Map)v12).put(Integer.valueOf(v13_2), v2_7);
                        v52 = v2_7;
                    }
                    else {
                        v51 = v1_11;
                        v52_1 = v50;
                    }

                    v2_8 = v51;
                }
                else {
                    v50 = v2_6;
                    v2_6 = v48;
                    v52_1 = v50;
                }

                Iterator v16_2 = ((Map)v11_1).get(Integer.valueOf(v13_2)).iterator();
                goto label_514;
            label_718:
                v47 = v10;
                v57 = v41;
                v56 = v42;
                v59 = v43;
                v14 = v44;
                v58 = v45;
                v1_3 = v28;
                v2_1 = v34;
                v0_4 = v39_1;
                goto label_727;
            label_514:
                while(v16_2.hasNext()) {
                    v1_3 = v16_2.next();
                    BitSet v53 = ((BitSet)v2_6);
                    Object v54 = v11_1;
                    if(((zzhi)this).zzgi().isLoggable(2)) {
                        v55 = v6_4;
                        ((zzhi)this).zzgi().zzjc().zzd("Evaluating filter. audience, filter, event", Integer.valueOf(v13_2), ((zzkh)v1_3).zzatk, ((zzhi)this).zzgf().zzbm(((zzkh)v1_3).zzatl));
                        ((zzhi)this).zzgi().zzjc().zzg("Filter definition", ((zzjr)this).zzjf().zza(((zzkh)v1_3)));
                    }
                    else {
                        v55 = v6_4;
                    }

                    if(((zzkh)v1_3).zzatk == null || ((zzkh)v1_3).zzatk.intValue() > 0x100) {
                        v57 = v10;
                        v56 = v12;
                        v58 = v15_1;
                        v12_2 = v46;
                        v7 = ((ArrayMap)v52_1);
                        v11_2 = v53;
                        v59 = v55;
                        v15_2 = v1_3;
                        v10_2 = v4_2;
                        v1_13 = ((zzhi)this).zzgi().zziy();
                        v2_3 = "Invalid event filter ID. appId, id";
                        v3 = zzfi.zzbp(arg69);
                        v4_4 = String.valueOf(((zzkh)v15_2).zzatk);
                    label_691:
                        v1_13.zze(v2_3, v3_3, v4_6);
                    }
                    else {
                        if(v22) {
                            int v17_1 = v1_3 == null || ((zzkh)v1_3).zzatm == null || ((zzkh)v1_3).zzatm.length <= 0 || ((zzkh)v1_3).zzatm[0].zzatu == null || !((zzkh)v1_3).zzatm[0].zzatu.booleanValue() ? 0 : 1;
                            if((v4_2.get(((zzkh)v1_3).zzatk.intValue())) && v17_1 == 0) {
                                ((zzhi)this).zzgi().zzjc().zze("Event filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID", Integer.valueOf(v13_2), ((zzkh)v1_3).zzatk);
                                v2_8 = v53;
                                v11_1 = v54;
                                v6_4 = v55;
                                continue;
                            }

                            v11_2 = v53;
                            v56 = v12;
                            v12_2 = v46;
                            v57 = v10;
                            v10_2 = v4_2;
                            v7 = ((ArrayMap)v52_1);
                            v58 = v15_1;
                            v59 = v55;
                            v15_2 = v1_3;
                            v1_12 = this.zza(v1_3, v0_4, v29_1, v8_1);
                            v2_9 = ((zzhi)this).zzgi().zzjc();
                            v3_2 = "Event filter result";
                            if(v1_12 == null) {
                                v4_4 = "null";
                            }
                            else {
                                v4_5 = v1_12;
                            }

                            v2_9.zzg(v3_2, v4_5);
                            if(v1_12 == null) {
                                goto label_664;
                            }

                            v11_2.set(((zzkh)v15_2).zzatk.intValue());
                            if(!v1_12.booleanValue()) {
                                goto label_692;
                            }

                            ((BitSet)v10_2).set(((zzkh)v15_2).zzatk.intValue());
                            if(v17_1 == 0) {
                                goto label_692;
                            }

                            if(v12_2.zzavb == null) {
                                goto label_692;
                            }

                            zzed.zza(((Map)v7), ((zzkh)v15_2).zzatk.intValue(), v12_2.zzavb.longValue());
                            goto label_692;
                        }
                        else {
                            v57 = v10;
                            v56 = v12;
                            v58 = v15_1;
                            v12_2 = v46;
                            v7 = ((ArrayMap)v52_1);
                            v11_2 = v53;
                            v59 = v55;
                            v15_2 = v1_3;
                            v10_2 = v4_2;
                            if(((BitSet)v10_2).get(((zzkh)v15_2).zzatk.intValue())) {
                                v1_13 = ((zzhi)this).zzgi().zzjc();
                                v2_3 = "Event filter already evaluated true. audience ID, filter ID";
                                v3_3 = Integer.valueOf(v13_2);
                                v4_6 = ((zzkh)v15_2).zzatk;
                                goto label_691;
                            }

                            v1_12 = this.zza(v15_2, v0_4, v29_1, v8_1);
                            v2_9 = ((zzhi)this).zzgi().zzjc();
                            v3_2 = "Event filter result";
                            if(v1_12 == null) {
                                v4_4 = "null";
                            }
                            else {
                                v4_5 = v1_12;
                            }

                            v2_9.zzg(v3_2, v4_5);
                            if(v1_12 != null) {
                                goto label_667;
                            }
                        }

                    label_664:
                        ((Set)v14).add(Integer.valueOf(v13_2));
                        goto label_692;
                    label_667:
                        v11_2.set(((zzkh)v15_2).zzatk.intValue());
                        if(!v1_12.booleanValue()) {
                            goto label_692;
                        }

                        ((BitSet)v10_2).set(((zzkh)v15_2).zzatk.intValue());
                    }

                label_692:
                    v52 = v7;
                    v4 = v10_2;
                    v2_8 = v11_2;
                    v46 = v12_2;
                    v11_1 = v54;
                    v12 = v56;
                    v10 = v57;
                    v15_1 = v58;
                    v6_4 = v59;
                }

                v56 = v12;
                v43 = v6_4;
                v41 = v10;
                v44 = v14;
                v45 = v15_1;
                v2_5 = v46;
                v10 = v47;
                v12_1 = v49;
                v42 = v56;
                goto label_443;
            label_727:
                v4_1 = v25 + 1;
                v13 = arg70;
                v11 = v14;
                v6_2 = v23;
                v8 = v47;
                v31 = v56;
                v32 = v57;
                v12 = v58;
                v33 = v59;
                v15 = arg69;
            }
        }

        v14 = v11;
        v58 = v12;
        v56 = v31;
        v57 = v32;
        v59 = v33;
        zzkx[] v1_14 = arg71;
        if(v1_14 != null) {
            ArrayMap v0_11 = new ArrayMap();
            v2 = v1_14.length;
            v3_1 = 0;
            while(true) {
                if(v3_1 < v2) {
                    v4_7 = v1_14[v3_1];
                    v5_4 = ((Map)v0_11).get(v4_7.name);
                    if(v5_4 == null) {
                        Map v5_5 = ((zzjr)this).zzjh().zzl(arg69, v4_7.name);
                        if(v5_5 == null) {
                            v5 = new ArrayMap();
                        }

                        ((Map)v0_11).put(v4_7.name, v5);
                    }

                    v6_5 = ((Map)v5).keySet().iterator();
                    while(true) {
                    label_770:
                        if(!v6_5.hasNext()) {
                            goto label_1004;
                        }

                        v8_2 = v6_5.next().intValue();
                        if(!((Set)v14).contains(Integer.valueOf(v8_2))) {
                            break;
                        }

                        ((zzhi)this).zzgi().zzjc().zzg("Skipping failed audience ID", Integer.valueOf(v8_2));
                    }

                    v10 = v58;
                    v9_2 = ((Map)v10).get(Integer.valueOf(v8_2));
                    v12 = v59;
                    v11_1 = ((Map)v12).get(Integer.valueOf(v8_2));
                    v15_1 = v57;
                    v13_3 = ((Map)v15_1).get(Integer.valueOf(v8_2));
                    if(v22) {
                        v60 = v0_11;
                        v1_9 = v56;
                        v0_4 = ((Map)v1_9).get(Integer.valueOf(v8_2));
                    }
                    else {
                        v60 = v0_11;
                        v1_9 = v56;
                        v0 = null;
                    }

                    if(v9_2 == null) {
                        zzkp v9_3 = new zzkp();
                        ((Map)v10).put(Integer.valueOf(v8_2), v9_3);
                        v9_3.zzauv = Boolean.valueOf(true);
                        v11_2 = new BitSet();
                        ((Map)v12).put(Integer.valueOf(v8_2), v11_2);
                        BitSet v13_4 = new BitSet();
                        ((Map)v15_1).put(Integer.valueOf(v8_2), v13_4);
                        if(v22) {
                            v0_11 = new ArrayMap();
                            ((Map)v1_9).put(Integer.valueOf(v8_2), v0_11);
                        }
                    }

                    v9_4 = ((Map)v5).get(Integer.valueOf(v8_2)).iterator();
                    break;
                label_1004:
                    ++v3_1;
                    v1_14 = arg71;
                    continue;
                }

                goto label_1014;
            }

            while(true) {
                if(!v9_4.hasNext()) {
                    goto label_993;
                }

                v61 = v2;
                v2_6 = v9_4.next();
                v62 = v5;
                v63 = v6_5;
                if(((zzhi)this).zzgi().isLoggable(2)) {
                    v64 = v9_4;
                    v65 = v1_9;
                    v66 = v15_1;
                    ((zzhi)this).zzgi().zzjc().zzd("Evaluating filter. audience, filter, property", Integer.valueOf(v8_2), ((zzkk)v2_6).zzatk, ((zzhi)this).zzgf().zzbo(((zzkk)v2_6).zzauc));
                    ((zzhi)this).zzgi().zzjc().zzg("Filter definition", ((zzjr)this).zzjf().zza(((zzkk)v2_6)));
                }
                else {
                    v65 = v1_9;
                    v64 = v9_4;
                    v66 = v15_1;
                }

                if(((zzkk)v2_6).zzatk != null) {
                    if(((zzkk)v2_6).zzatk.intValue() > 0x100) {
                    }
                    else {
                        if(v22) {
                            v1_1 = v2_6 == null || ((zzkk)v2_6).zzaud == null || ((zzkk)v2_6).zzaud.zzatu == null || !((zzkk)v2_6).zzaud.zzatu.booleanValue() ? 0 : 1;
                            if(!v11_2.get(((zzkk)v2_6).zzatk.intValue()) || v1_1 != 0) {
                                Boolean v7_1 = this.zza(((zzkk)v2_6), v4_7);
                                zzfk v9_5 = ((zzhi)this).zzgi().zzjc();
                                v15 = "Property filter result";
                                if(v7_1 == null) {
                                    v5_3 = "null";
                                }
                                else {
                                    Boolean v5_6 = v7_1;
                                }

                                v9_5.zzg(v15, v5_3);
                                if(v7_1 == null) {
                                    ((Set)v14).add(Integer.valueOf(v8_2));
                                    goto label_889;
                                }

                                ((BitSet)v13_3).set(((zzkk)v2_6).zzatk.intValue());
                                v11_2.set(((zzkk)v2_6).zzatk.intValue(), v7_1.booleanValue());
                                if(!v7_1.booleanValue()) {
                                    goto label_889;
                                }

                                if(v1_1 == 0) {
                                    goto label_889;
                                }

                                if(v4_7.zzaws == null) {
                                    goto label_889;
                                }

                                v67 = v10;
                                zzed.zza(((Map)v0_11), ((zzkk)v2_6).zzatk.intValue(), v4_7.zzaws.longValue());
                                goto label_942;
                            }
                            else {
                                ((zzhi)this).zzgi().zzjc().zze("Property filter already evaluated true and it is not associated with a dynamic audience. audience ID, filter ID", Integer.valueOf(v8_2), ((zzkk)v2_6).zzatk);
                            }

                        label_889:
                            v2 = v61;
                            v5_4 = v62;
                            v6_5 = v63;
                            v9_4 = v64;
                            v1_9 = v65;
                            v15_1 = v66;
                            continue;
                        }
                        else {
                            v67 = v10;
                            zzed v6_6 = this;
                            if(v11_2.get(((zzkk)v2_6).zzatk.intValue())) {
                                ((zzhi)this).zzgi().zzjc().zze("Property filter already evaluated true. audience ID, filter ID", Integer.valueOf(v8_2), ((zzkk)v2_6).zzatk);
                                goto label_942;
                            }

                            v1_12 = v6_6.zza(((zzkk)v2_6), v4_7);
                            zzfk v5_7 = ((zzhi)this).zzgi().zzjc();
                            String v7_2 = "Property filter result";
                            if(v1_12 == null) {
                                v9_1 = "null";
                            }
                            else {
                                v9_6 = v1_12;
                            }

                            v5_7.zzg(v7_2, v9_6);
                            if(v1_12 == null) {
                                ((Set)v14).add(Integer.valueOf(v8_2));
                                goto label_942;
                            }

                            ((BitSet)v13_3).set(((zzkk)v2_6).zzatk.intValue());
                            if(!v1_12.booleanValue()) {
                                goto label_942;
                            }

                            v11_2.set(((zzkk)v2_6).zzatk.intValue());
                        }

                    label_942:
                        v2 = v61;
                        v5_4 = v62;
                        v6_5 = v63;
                        v9_4 = v64;
                        v1_9 = v65;
                        v15_1 = v66;
                        v10 = v67;
                        continue;
                    }
                }

                break;
            }

            ((zzhi)this).zzgi().zziy().zze("Invalid property filter ID. appId, id", zzfi.zzbp(arg69), String.valueOf(((zzkk)v2_6).zzatk));
            ((Set)v14).add(Integer.valueOf(v8_2));
            v59 = v12;
            v0_11 = v60;
            v2 = v61;
            v5_4 = v62;
            v6_5 = v63;
            v56 = v65;
            v57 = v66;
            v58 = v10;
            goto label_770;
        label_993:
            v56 = v1_9;
            v58 = v10;
            v59 = v12;
            v57 = v15_1;
            v0_11 = v60;
            v6_5 = v6_5;
            goto label_770;
        }

    label_1014:
        v65 = v56;
        v66 = v57;
        v67 = v58;
        v12 = v59;
        zzkp[] v1_15 = new zzkp[((Map)v12).size()];
        Iterator v2_10 = ((Map)v12).keySet().iterator();
        v5_2 = 0;
        while(v2_10.hasNext()) {
            v0_2 = v2_10.next().intValue();
            if(((Set)v14).contains(Integer.valueOf(v0_2))) {
                continue;
            }

            ArrayMap v4_8 = v67;
            v3 = ((Map)v4_8).get(Integer.valueOf(v0_2));
            if(v3 == null) {
                v3_4 = new zzkp();
            }

            int v7_3 = v5_2 + 1;
            v1_15[v5_2] = v3_4;
            v3_4.zzate = Integer.valueOf(v0_2);
            v3_4.zzaut = new zzkv();
            v3_4.zzaut.zzawm = zzjz.zza(((Map)v12).get(Integer.valueOf(v0_2)));
            v9 = v66;
            v3_4.zzaut.zzawl = zzjz.zza(((Map)v9).get(Integer.valueOf(v0_2)));
            if(v22) {
                v10 = v65;
                v3_4.zzaut.zzawn = zzed.zzd(((Map)v10).get(Integer.valueOf(v0_2)));
            }
            else {
                v10 = v65;
            }

            zzek v5_8 = ((zzjr)this).zzjh();
            zzkv v3_5 = v3_4.zzaut;
            ((zzjs)v5_8).zzch();
            ((zzhi)v5_8).zzab();
            Preconditions.checkNotEmpty(arg69);
            Preconditions.checkNotNull(v3_5);
            try {
                v8_3 = new byte[((zzacj)v3_5).zzwb()];
                zzacb v11_3 = zzacb.zzb(v8_3, 0, v8_3.length);
                ((zzacj)v3_5).zza(v11_3);
                v11_3.zzvt();
            }
            catch(IOException v0_12) {
                v3_6 = ((zzhi)v5_8).zzgi().zziv();
                v5_3 = "Configuration loss. Failed to serialize filter results. appId";
                goto label_1114;
            }

            ContentValues v3_7 = new ContentValues();
            v3_7.put("app_id", arg69);
            v3_7.put("audience_id", Integer.valueOf(v0_2));
            v3_7.put("current_results", v8_3);
            try {
                v0_6 = v5_8.getWritableDatabase();
                String v8_4 = "audience_filter_values";
                int v11_4 = 5;
                String v13_5 = null;
            }
            catch(SQLiteException v0_5) {
                goto label_1104;
            }

            try {
                if(v0_6.insertWithOnConflict(v8_4, v13_5, v3_7, v11_4) != -1) {
                    goto label_1116;
                }

                ((zzhi)v5_8).zzgi().zziv().zzg("Failed to insert filter results (got -1). appId", zzfi.zzbp(arg69));
                goto label_1116;
            }
            catch(SQLiteException v0_5) {
            }

        label_1104:
            v3_6 = ((zzhi)v5_8).zzgi().zziv();
            v5_3 = "Error storing filter results. appId";
        label_1114:
            v3_6.zze(v5_3, zzfi.zzbp(arg69), v0_12);
        label_1116:
            v67 = v4_8;
            v5_2 = v7_3;
            v66 = v9;
            v65 = v10;
        }

        return Arrays.copyOf(((Object[])v1_15), v5_2);
    }

    private final Boolean zza(double arg2, zzkj arg4) {
        try {
            return zzed.zza(new BigDecimal(arg2), arg4, Math.ulp(arg2));
        }
        catch(NumberFormatException ) {
            return null;
        }
    }

    @VisibleForTesting private static Boolean zza(BigDecimal arg7, zzkj arg8, double arg9) {
        BigDecimal v8;
        BigDecimal v4;
        BigDecimal v3;
        Preconditions.checkNotNull(arg8);
        Boolean v1 = null;
        if(arg8.zzatw != null) {
            if(arg8.zzatw.intValue() == 0) {
            }
            else {
                int v2 = 4;
                if(arg8.zzatw.intValue() == v2) {
                    if(arg8.zzatz != null && arg8.zzaua != null) {
                        goto label_20;
                    }

                    return v1;
                }
                else {
                    if(arg8.zzaty != null) {
                        goto label_20;
                    }

                    return v1;
                }

            label_20:
                int v0 = arg8.zzatw.intValue();
                if(arg8.zzatw.intValue() == v2) {
                    if(zzjz.zzcf(arg8.zzatz)) {
                        if(!zzjz.zzcf(arg8.zzaua)) {
                        }
                        else {
                            try {
                                v3 = new BigDecimal(arg8.zzatz);
                                v4 = new BigDecimal(arg8.zzaua);
                                v8 = v3;
                                v3 = ((BigDecimal)v1);
                                goto label_51;
                            }
                            catch(NumberFormatException ) {
                                return v1;
                            }
                        }
                    }

                    return v1;
                }
                else {
                    if(!zzjz.zzcf(arg8.zzaty)) {
                        return v1;
                    }

                    try {
                        v3 = new BigDecimal(arg8.zzaty);
                        v8 = ((BigDecimal)v1);
                        v4 = v8;
                    }
                    catch(NumberFormatException ) {
                        return v1;
                    }
                }

            label_51:
                if(v0 != v2) {
                    if(v3 != null) {
                        goto label_55;
                    }

                    return v1;
                }
                else if(v8 == null) {
                    return v1;
                }

            label_55:
                v2 = -1;
                boolean v5 = false;
                switch(v0) {
                    case 1: {
                        goto label_99;
                    }
                    case 2: {
                        goto label_94;
                    }
                    case 3: {
                        goto label_67;
                    }
                    case 4: {
                        goto label_60;
                    }
                }

                return v1;
            label_99:
                if(arg7.compareTo(v3) == v2) {
                    v5 = true;
                }

                return Boolean.valueOf(v5);
            label_67:
                if(arg9 != 0) {
                    int v1_1 = 2;
                    if(arg7.compareTo(v3.subtract(new BigDecimal(arg9).multiply(new BigDecimal(v1_1)))) == 1 && arg7.compareTo(v3.add(new BigDecimal(arg9).multiply(new BigDecimal(v1_1)))) == v2) {
                        v5 = true;
                    }

                    return Boolean.valueOf(v5);
                }

                if(arg7.compareTo(v3) == 0) {
                    v5 = true;
                }

                return Boolean.valueOf(v5);
            label_60:
                if(arg7.compareTo(v8) != v2 && arg7.compareTo(v4) != 1) {
                    v5 = true;
                }

                return Boolean.valueOf(v5);
            label_94:
                if(arg7.compareTo(v3) == 1) {
                    v5 = true;
                }

                return Boolean.valueOf(v5);
            }
        }

        return v1;
    }

    private final Boolean zza(long arg2, zzkj arg4) {
        try {
            return zzed.zza(new BigDecimal(arg2), arg4, 0);
        }
        catch(NumberFormatException ) {
            return null;
        }
    }

    private final Boolean zza(zzkh arg9, String arg10, zzks[] arg11, long arg12) {
        Boolean v3_2;
        String v4_4;
        String v5;
        Boolean v2 = null;
        if(arg9.zzato != null) {
            Boolean v12 = this.zza(arg12, arg9.zzato);
            if(v12 == null) {
                return v2;
            }
            else if(!v12.booleanValue()) {
                return Boolean.valueOf(false);
            }
        }

        HashSet v12_1 = new HashSet();
        zzki[] v13 = arg9.zzatm;
        int v0 = v13.length;
        int v3;
        for(v3 = 0; v3 < v0; ++v3) {
            zzki v4 = v13[v3];
            if(TextUtils.isEmpty(v4.zzatt)) {
                ((zzhi)this).zzgi().zziy().zzg("null or empty param name in filter. event", ((zzhi)this).zzgf().zzbm(arg10));
                return v2;
            }

            ((Set)v12_1).add(v4.zzatt);
        }

        ArrayMap v13_1 = new ArrayMap();
        v0 = arg11.length;
        for(v3 = 0; v3 < v0; ++v3) {
            zzks v4_1 = arg11[v3];
            if(((Set)v12_1).contains(v4_1.name)) {
                if(v4_1.zzave != null) {
                    v5 = v4_1.name;
                    Long v4_2 = v4_1.zzave;
                }
                else if(v4_1.zzasw != null) {
                    v5 = v4_1.name;
                    Double v4_3 = v4_1.zzasw;
                }
                else if(v4_1.zzale != null) {
                    v5 = v4_1.name;
                    v4_4 = v4_1.zzale;
                }
                else {
                    goto label_58;
                }

                ((Map)v13_1).put(v5, v4_4);
                goto label_68;
            label_58:
                ((zzhi)this).zzgi().zziy().zze("Unknown value for param. event, param", ((zzhi)this).zzgf().zzbm(arg10), ((zzhi)this).zzgf().zzbn(v4_1.name));
                return v2;
            }

        label_68:
        }

        zzki[] v9 = arg9.zzatm;
        int v11 = v9.length;
        int v12_2;
        for(v12_2 = 0; true; ++v12_2) {
            if(v12_2 >= v11) {
                goto label_199;
            }

            zzki v3_1 = v9[v12_2];
            boolean v4_5 = Boolean.TRUE.equals(v3_1.zzats);
            v5 = v3_1.zzatt;
            if(TextUtils.isEmpty(((CharSequence)v5))) {
                ((zzhi)this).zzgi().zziy().zzg("Event has empty param name. event", ((zzhi)this).zzgf().zzbm(arg10));
                return v2;
            }

            Object v6 = ((Map)v13_1).get(v5);
            if((v6 instanceof Long)) {
                if(v3_1.zzatr == null) {
                    ((zzhi)this).zzgi().zziy().zze("No number filter for long param. event, param", ((zzhi)this).zzgf().zzbm(arg10), ((zzhi)this).zzgf().zzbn(v5));
                    return v2;
                }
                else {
                    v3_2 = this.zza(((Long)v6).longValue(), v3_1.zzatr);
                    if(v3_2 == null) {
                        return v2;
                    }
                    else if((1 ^ v3_2.booleanValue() ^ (((int)v4_5))) != 0) {
                        return Boolean.valueOf(false);
                    }
                }
            }
            else if((v6 instanceof Double)) {
                if(v3_1.zzatr == null) {
                    ((zzhi)this).zzgi().zziy().zze("No number filter for double param. event, param", ((zzhi)this).zzgf().zzbm(arg10), ((zzhi)this).zzgf().zzbn(v5));
                    return v2;
                }
                else {
                    v3_2 = this.zza(((Double)v6).doubleValue(), v3_1.zzatr);
                    if(v3_2 == null) {
                        return v2;
                    }
                    else if((1 ^ v3_2.booleanValue() ^ (((int)v4_5))) != 0) {
                        return Boolean.valueOf(false);
                    }
                }
            }
            else if((v6 instanceof String)) {
                if(v3_1.zzatq != null) {
                    v3_2 = this.zza(((String)v6), v3_1.zzatq);
                }
                else if(v3_1.zzatr == null) {
                    goto label_170;
                }
                else if(zzjz.zzcf(((String)v6))) {
                    v3_2 = this.zza(((String)v6), v3_1.zzatr);
                }
                else {
                    break;
                }

                if(v3_2 == null) {
                    return v2;
                }

                if((1 ^ v3_2.booleanValue() ^ (((int)v4_5))) == 0) {
                    goto label_159;
                }

                return Boolean.valueOf(false);
            }
            else {
                goto label_179;
            }

        label_159:
        }

        ((zzhi)this).zzgi().zziy().zze("Invalid param value for number filter. event, param", ((zzhi)this).zzgf().zzbm(arg10), ((zzhi)this).zzgf().zzbn(v5));
        return v2;
    label_170:
        ((zzhi)this).zzgi().zziy().zze("No filter for String param. event, param", ((zzhi)this).zzgf().zzbm(arg10), ((zzhi)this).zzgf().zzbn(v5));
        return v2;
    label_179:
        if(v6 == null) {
            ((zzhi)this).zzgi().zzjc().zze("Missing param for filter. event, param", ((zzhi)this).zzgf().zzbm(arg10), ((zzhi)this).zzgf().zzbn(v5));
            return Boolean.valueOf(false);
        }

        ((zzhi)this).zzgi().zziy().zze("Unknown param type. event, param", ((zzhi)this).zzgf().zzbm(arg10), ((zzhi)this).zzgf().zzbn(v5));
        return v2;
    label_199:
        return Boolean.valueOf(true);
    }

    @VisibleForTesting private final Boolean zza(String arg11, zzkl arg12) {
        List v8;
        Preconditions.checkNotNull(arg12);
        Boolean v0 = null;
        if(arg11 == null) {
            return v0;
        }

        if(arg12.zzaue != null) {
            if(arg12.zzaue.intValue() == 0) {
            }
            else {
                int v2 = 6;
                if(arg12.zzaue.intValue() == v2) {
                    if(arg12.zzauh != null && arg12.zzauh.length != 0) {
                        goto label_23;
                    }

                    return v0;
                }
                else {
                    if(arg12.zzauf != null) {
                        goto label_23;
                    }

                    return v0;
                }

            label_23:
                int v5 = arg12.zzaue.intValue();
                int v3 = 0;
                boolean v6 = arg12.zzaug == null || !arg12.zzaug.booleanValue() ? false : true;
                String v1 = (v6) || v5 == 1 || v5 == v2 ? arg12.zzauf : arg12.zzauf.toUpperCase(Locale.ENGLISH);
                String v7 = v1;
                if(arg12.zzauh == null) {
                    v8 = ((List)v0);
                }
                else {
                    String[] v12 = arg12.zzauh;
                    if(v6) {
                        v8 = Arrays.asList(((Object[])v12));
                    }
                    else {
                        ArrayList v1_1 = new ArrayList();
                        v2 = v12.length;
                        while(v3 < v2) {
                            ((List)v1_1).add(v12[v3].toUpperCase(Locale.ENGLISH));
                            ++v3;
                        }

                        ArrayList v8_1 = v1_1;
                    }
                }

                String v9 = v5 == 1 ? v7 : ((String)v0);
                return this.zza(arg11, v5, v6, v7, v8, v9);
            }
        }

        return v0;
    }

    private final Boolean zza(String arg5, zzkj arg6) {
        Boolean v1 = null;
        if(!zzjz.zzcf(arg5)) {
            return v1;
        }

        try {
            return zzed.zza(new BigDecimal(arg5), arg6, 0);
        }
        catch(NumberFormatException ) {
            return v1;
        }
    }

    private final Boolean zza(zzkk arg5, zzkx arg6) {
        Boolean v5_2;
        String v1;
        zzfk v5_1;
        zzki v5 = arg5.zzaud;
        Boolean v0 = null;
        if(v5 == null) {
            v5_1 = ((zzhi)this).zzgi().zziy();
            v1 = "Missing property filter. property";
        }
        else {
            boolean v1_1 = Boolean.TRUE.equals(v5.zzats);
            if(arg6.zzave != null) {
                if(v5.zzatr == null) {
                    v5_1 = ((zzhi)this).zzgi().zziy();
                    v1 = "No number filter for long property. property";
                    goto label_6;
                }
                else {
                    v5_2 = this.zza(arg6.zzave.longValue(), v5.zzatr);
                }
            }
            else if(arg6.zzasw != null) {
                if(v5.zzatr == null) {
                    v5_1 = ((zzhi)this).zzgi().zziy();
                    v1 = "No number filter for double property. property";
                    goto label_6;
                }
                else {
                    v5_2 = this.zza(arg6.zzasw.doubleValue(), v5.zzatr);
                }
            }
            else if(arg6.zzale == null) {
                goto label_75;
            }
            else if(v5.zzatq == null) {
                if(v5.zzatr == null) {
                    ((zzhi)this).zzgi().zziy().zzg("No string or number filter defined. property", ((zzhi)this).zzgf().zzbo(arg6.name));
                }
                else if(zzjz.zzcf(arg6.zzale)) {
                    v5_2 = this.zza(arg6.zzale, v5.zzatr);
                    goto label_26;
                }
                else {
                    ((zzhi)this).zzgi().zziy().zze("Invalid user property value for Numeric number filter. property, value", ((zzhi)this).zzgf().zzbo(arg6.name), arg6.zzale);
                }

                return v0;
            }
            else {
                v5_2 = this.zza(arg6.zzale, v5.zzatq);
            }

        label_26:
            return zzed.zza(v5_2, v1_1);
        label_75:
            v5_1 = ((zzhi)this).zzgi().zziy();
            v1 = "User property has no value, property";
        }

    label_6:
        v5_1.zzg(v1, ((zzhi)this).zzgf().zzbo(arg6.name));
        return v0;
    }

    @VisibleForTesting private static Boolean zza(Boolean arg0, boolean arg1) {
        if(arg0 == null) {
            return null;
        }

        return Boolean.valueOf(arg0.booleanValue() ^ (((int)arg1)));
    }

    private final Boolean zza(String arg3, int arg4, boolean arg5, String arg6, List arg7, String arg8) {
        Boolean v0 = null;
        if(arg3 == null) {
            return v0;
        }

        if(arg4 == 6) {
            if(arg7 != null && arg7.size() != 0) {
                goto label_11;
            }

            return v0;
        }
        else {
            if(arg6 != null) {
                goto label_11;
            }

            return v0;
        }

    label_11:
        if(!arg5) {
            if(arg4 == 1) {
            }
            else {
                arg3 = arg3.toUpperCase(Locale.ENGLISH);
            }
        }

        switch(arg4) {
            case 1: {
                goto label_30;
            }
            case 2: {
                goto label_28;
            }
            case 3: {
                goto label_26;
            }
            case 4: {
                goto label_24;
            }
            case 5: {
                goto label_22;
            }
            case 6: {
                goto label_19;
            }
        }

        return v0;
    label_19:
        boolean v3 = arg7.contains(arg3);
        goto label_20;
    label_22:
        v3 = arg3.equals(arg6);
        goto label_20;
    label_24:
        v3 = arg3.contains(((CharSequence)arg6));
        goto label_20;
    label_26:
        v3 = arg3.endsWith(arg6);
        goto label_20;
    label_28:
        v3 = arg3.startsWith(arg6);
    label_20:
        return Boolean.valueOf(v3);
    label_30:
        arg4 = arg5 ? 0 : 66;
        try {
            return Boolean.valueOf(Pattern.compile(arg8, arg4).matcher(((CharSequence)arg3)).matches());
        }
        catch(PatternSyntaxException ) {
            ((zzhi)this).zzgi().zziy().zzg("Invalid regular expression in REGEXP audience filter. expression", arg8);
            return v0;
        }
    }

    private final void zza(Integer arg1, Integer arg2, zzki arg3, Boolean arg4, Boolean arg5) {
        boolean v4;
        if(arg3 == null) {
            ((zzhi)this).zzgi().zziy().zze("The leaf filter of event or user property filter is null. audience ID, filter ID", arg1, arg2);
            return;
        }

        boolean v1 = false;
        if(arg4 == null || !arg4.booleanValue()) {
            if(arg5 != null && (arg5.booleanValue())) {
            label_14:
                v4 = true;
                goto label_17;
            }

            v4 = false;
        }
        else {
            goto label_14;
        }

    label_17:
        arg3.zzatu = Boolean.valueOf(v4);
        if(arg5 != null && (arg5.booleanValue())) {
            v1 = true;
        }

        arg3.zzatv = Boolean.valueOf(v1);
    }

    private static void zza(Map arg3, int arg4, long arg5) {
        Object v0 = arg3.get(Integer.valueOf(arg4));
        arg5 /= 1000;
        if(v0 == null || arg5 > ((Long)v0).longValue()) {
            arg3.put(Integer.valueOf(arg4), Long.valueOf(arg5));
        }
    }

    @WorkerThread final void zza(String arg19, zzkg[] arg20) {
        zzkg[] v0 = arg20;
        Preconditions.checkNotNull(arg20);
        int v1 = v0.length;
        int v3;
        for(v3 = 0; v3 < v1; ++v3) {
            zzkg v4 = v0[v3];
            zzkh[] v5 = v4.zzatg;
            int v6 = v5.length;
            int v7;
            for(v7 = 0; v7 < v6; ++v7) {
                zzkh v8 = v5[v7];
                String v9 = Event.zzal(v8.zzatl);
                if(v9 != null) {
                    v8.zzatl = v9;
                }

                zzki[] v9_1 = v8.zzatm;
                int v10 = v9_1.length;
                int v11;
                for(v11 = 0; v11 < v10; ++v11) {
                    zzki v15 = v9_1[v11];
                    String v12 = Param.zzal(v15.zzatt);
                    if(v12 != null) {
                        v15.zzatt = v12;
                    }

                    this.zza(v4.zzate, v8.zzatk, v15, v4.zzath, v4.zzati);
                }
            }

            zzkk[] v2 = v4.zzatf;
            int v5_1 = v2.length;
            for(v6 = 0; v6 < v5_1; ++v6) {
                zzkk v7_1 = v2[v6];
                String v8_1 = UserProperty.zzal(v7_1.zzauc);
                if(v8_1 != null) {
                    v7_1.zzauc = v8_1;
                }

                this.zza(v4.zzate, v7_1.zzatk, v7_1.zzaud, v4.zzath, v4.zzati);
            }
        }

        ((zzjr)this).zzjh().zzb(arg19, v0);
    }

    private static zzkq[] zzd(Map arg5) {
        if(arg5 == null) {
            return null;
        }

        int v0 = 0;
        zzkq[] v1 = new zzkq[arg5.size()];
        Iterator v2 = arg5.keySet().iterator();
        while(v2.hasNext()) {
            Object v3 = v2.next();
            zzkq v4 = new zzkq();
            v4.zzaux = ((Integer)v3);
            v4.zzauy = arg5.get(v3);
            v1[v0] = v4;
            ++v0;
        }

        return v1;
    }

    protected final boolean zzgn() {
        return 0;
    }
}

