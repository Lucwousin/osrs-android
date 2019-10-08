package com.google.android.gms.internal.measurement;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzek extends zzjs {
    private static final String[] zzagl;
    private static final String[] zzagm;
    private static final String[] zzagn;
    private static final String[] zzago;
    private static final String[] zzagp;
    private static final String[] zzagq;
    private final zzen zzagr;
    private final zzjo zzags;

    static {
        zzek.zzagl = new String[]{"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;"};
        zzek.zzagm = new String[]{"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
        zzek.zzagn = new String[]{"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;"};
        zzek.zzago = new String[]{"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
        zzek.zzagp = new String[]{"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
        zzek.zzagq = new String[]{"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    }

    zzek(zzjt arg3) {
        super(arg3);
        this.zzags = new zzjo(((zzhi)this).zzbt());
        this.zzagr = new zzen(this, ((zzhi)this).getContext(), "google_app_measurement.db");
    }

    @WorkerThread public final void beginTransaction() {
        ((zzjs)this).zzch();
        this.getWritableDatabase().beginTransaction();
    }

    @WorkerThread public final void endTransaction() {
        ((zzjs)this).zzch();
        this.getWritableDatabase().endTransaction();
    }

    @WorkerThread @VisibleForTesting final SQLiteDatabase getWritableDatabase() {
        ((zzhi)this).zzab();
        try {
            return this.zzagr.getWritableDatabase();
        }
        catch(SQLiteException v0) {
            ((zzhi)this).zzgi().zziy().zzg("Error opening database", v0);
            throw v0;
        }
    }

    @WorkerThread public final void setTransactionSuccessful() {
        ((zzjs)this).zzch();
        this.getWritableDatabase().setTransactionSuccessful();
    }

    static zzjo zza(zzek arg0) {
        return arg0.zzags;
    }

    @WorkerThread public final boolean zza(zzkc arg8) {
        Preconditions.checkNotNull(arg8);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        if(this.zzh(arg8.zzth, arg8.name) == null) {
            long v2 = 25;
            if(zzkd.zzcg(arg8.name)) {
                if(this.zza("select count(1) from user_attributes where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{arg8.zzth}) >= v2) {
                    return 0;
                }
            }
            else if(this.zza("select count(1) from user_attributes where app_id=? and origin=? AND name like \'!_%\' escape \'!\'", new String[]{arg8.zzth, arg8.origin}) >= v2) {
                return 0;
            }
        }

        ContentValues v0 = new ContentValues();
        v0.put("app_id", arg8.zzth);
        v0.put("origin", arg8.origin);
        v0.put("name", arg8.name);
        v0.put("set_timestamp", Long.valueOf(arg8.zzast));
        zzek.zza(v0, "value", arg8.value);
        try {
            if(this.getWritableDatabase().insertWithOnConflict("user_attributes", null, v0, 5) != -1) {
                return 1;
            }

            ((zzhi)this).zzgi().zziv().zzg("Failed to insert/update user property (got -1). appId", zzfi.zzbp(arg8.zzth));
        }
        catch(SQLiteException v0_1) {
            ((zzhi)this).zzgi().zziv().zze("Error storing user property. appId", zzfi.zzbp(arg8.zzth), v0_1);
        }

        return 1;
    }

    @WorkerThread public final zzel zza(long arg16, String arg18, boolean arg19, boolean arg20, boolean arg21, boolean arg22, boolean arg23) {
        Cursor v6;
        SQLiteDatabase v14;
        Preconditions.checkNotEmpty(arg18);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        String[] v2 = new String[]{arg18};
        zzel v4 = new zzel();
        Cursor v5 = null;
        try {
            v14 = this.getWritableDatabase();
            v6 = v14.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{arg18}, null, null, null);
            goto label_27;
        }
        catch(Throwable v0) {
        }
        catch(SQLiteException v0_1) {
            goto label_119;
            try {
            label_27:
                if(v6.moveToFirst()) {
                    goto label_37;
                }

                ((zzhi)this).zzgi().zziy().zzg("Not updating daily counts, app is not known. appId", zzfi.zzbp(arg18));
                if(v6 != null) {
                    goto label_35;
                }

                return v4;
            }
            catch(SQLiteException v0_1) {
                goto label_113;
            }
            catch(Throwable v0) {
                goto label_111;
            }

        label_35:
            v6.close();
            return v4;
            try {
            label_37:
                if(v6.getLong(0) == arg16) {
                    v4.zzagu = v6.getLong(1);
                    v4.zzagt = v6.getLong(2);
                    v4.zzagv = v6.getLong(3);
                    v4.zzagw = v6.getLong(4);
                    v4.zzagx = v6.getLong(5);
                }

                long v7 = 1;
                if(arg19) {
                    v4.zzagu += v7;
                }

                if(arg20) {
                    v4.zzagt += v7;
                }

                if(arg21) {
                    v4.zzagv += v7;
                }

                if(arg22) {
                    v4.zzagw += v7;
                }

                if(arg23) {
                    v4.zzagx += v7;
                }

                ContentValues v0_2 = new ContentValues();
                v0_2.put("day", Long.valueOf(arg16));
                v0_2.put("daily_public_events_count", Long.valueOf(v4.zzagt));
                v0_2.put("daily_events_count", Long.valueOf(v4.zzagu));
                v0_2.put("daily_conversions_count", Long.valueOf(v4.zzagv));
                v0_2.put("daily_error_events_count", Long.valueOf(v4.zzagw));
                v0_2.put("daily_realtime_events_count", Long.valueOf(v4.zzagx));
                v14.update("apps", v0_2, "app_id=?", v2);
                if(v6 == null) {
                    return v4;
                }

                goto label_108;
            }
            catch(Throwable v0) {
            label_111:
            }
            catch(SQLiteException v0_1) {
            label_113:
                v5 = v6;
                try {
                label_119:
                    ((zzhi)this).zzgi().zziv().zze("Error updating daily counts. appId", zzfi.zzbp(arg18), v0_1);
                    if(v5 == null) {
                        return v4;
                    }
                }
                catch(Throwable v0) {
                    v6 = v5;
                    goto label_127;
                }

                v5.close();
                return v4;
            }
        }

    label_127:
        if(v6 != null) {
            v6.close();
        }

        throw v0;
    label_108:
        v6.close();
        return v4;
    }

    @WorkerThread public final void zza(zzet arg6) {
        Preconditions.checkNotNull(arg6);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        ContentValues v0 = new ContentValues();
        v0.put("app_id", arg6.zzth);
        v0.put("name", arg6.name);
        v0.put("lifetime_count", Long.valueOf(arg6.zzahh));
        v0.put("current_bundle_count", Long.valueOf(arg6.zzahi));
        v0.put("last_fire_timestamp", Long.valueOf(arg6.zzahj));
        v0.put("last_bundled_timestamp", Long.valueOf(arg6.zzahk));
        v0.put("last_sampled_complex_event_id", arg6.zzahl);
        v0.put("last_sampling_rate", arg6.zzahm);
        String v2 = null;
        Long v1 = arg6.zzahn == null || !arg6.zzahn.booleanValue() ? ((Long)v2) : Long.valueOf(1);
        v0.put("last_exempt_from_sampling", v1);
        try {
            if(this.getWritableDatabase().insertWithOnConflict("events", v2, v0, 5) == -1) {
                ((zzhi)this).zzgi().zziv().zzg("Failed to insert/update event aggregates (got -1). appId", zzfi.zzbp(arg6.zzth));
            }
        }
        catch(SQLiteException v0_1) {
            ((zzhi)this).zzgi().zziv().zze("Error storing event aggregates. appId", zzfi.zzbp(arg6.zzth), v0_1);
            return;
        }
    }

    @WorkerThread public final void zza(zzea arg8) {
        Preconditions.checkNotNull(arg8);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        ContentValues v0 = new ContentValues();
        v0.put("app_id", arg8.zzah());
        v0.put("app_instance_id", arg8.getAppInstanceId());
        v0.put("gmp_app_id", arg8.getGmpAppId());
        v0.put("resettable_device_id_hash", arg8.zzgq());
        v0.put("last_bundle_index", Long.valueOf(arg8.zzgy()));
        v0.put("last_bundle_start_timestamp", Long.valueOf(arg8.zzgs()));
        v0.put("last_bundle_end_timestamp", Long.valueOf(arg8.zzgt()));
        v0.put("app_version", arg8.zzag());
        v0.put("app_store", arg8.zzgv());
        v0.put("gmp_version", Long.valueOf(arg8.zzgw()));
        v0.put("dev_cert_hash", Long.valueOf(arg8.zzgx()));
        v0.put("measurement_enabled", Boolean.valueOf(arg8.isMeasurementEnabled()));
        v0.put("day", Long.valueOf(arg8.zzhc()));
        v0.put("daily_public_events_count", Long.valueOf(arg8.zzhd()));
        v0.put("daily_events_count", Long.valueOf(arg8.zzhe()));
        v0.put("daily_conversions_count", Long.valueOf(arg8.zzhf()));
        v0.put("config_fetched_time", Long.valueOf(arg8.zzgz()));
        v0.put("failed_config_fetch_time", Long.valueOf(arg8.zzha()));
        v0.put("app_version_int", Long.valueOf(arg8.zzgu()));
        v0.put("firebase_instance_id", arg8.zzgr());
        v0.put("daily_error_events_count", Long.valueOf(arg8.zzhh()));
        v0.put("daily_realtime_events_count", Long.valueOf(arg8.zzhg()));
        v0.put("health_monitor_sample", arg8.zzhi());
        v0.put("android_id", Long.valueOf(arg8.zzhk()));
        v0.put("adid_reporting_enabled", Boolean.valueOf(arg8.zzhl()));
        v0.put("ssaid_reporting_enabled", Boolean.valueOf(arg8.zzhm()));
        try {
            SQLiteDatabase v1 = this.getWritableDatabase();
            if((((long)v1.update("apps", v0, "app_id = ?", new String[]{arg8.zzah()}))) == 0 && v1.insertWithOnConflict("apps", null, v0, 5) == -1) {
                ((zzhi)this).zzgi().zziv().zzg("Failed to insert/update app (got -1). appId", zzfi.zzbp(arg8.zzah()));
            }
        }
        catch(SQLiteException v0_1) {
            ((zzhi)this).zzgi().zziv().zze("Error storing app. appId", zzfi.zzbp(arg8.zzah()), v0_1);
            return;
        }
    }

    public final long zza(zzku arg8) throws IOException {
        long v1_2;
        byte[] v0_1;
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        Preconditions.checkNotNull(arg8);
        Preconditions.checkNotEmpty(arg8.zzth);
        try {
            v0_1 = new byte[((zzacj)arg8).zzwb()];
            zzacb v1 = zzacb.zzb(v0_1, 0, v0_1.length);
            ((zzacj)arg8).zza(v1);
            v1.zzvt();
        }
        catch(IOException v0) {
            ((zzhi)this).zzgi().zziv().zze("Data loss. Failed to serialize event metadata. appId", zzfi.zzbp(arg8.zzth), v0);
            throw v0;
        }

        zzjz v1_1 = ((zzjr)this).zzjf();
        Preconditions.checkNotNull(v0_1);
        ((zzhi)v1_1).zzgg().zzab();
        MessageDigest v2 = zzkd.getMessageDigest();
        if(v2 == null) {
            ((zzhi)v1_1).zzgi().zziv().log("Failed to get MD5");
            v1_2 = 0;
        }
        else {
            v1_2 = zzkd.zzc(v2.digest(v0_1));
        }

        ContentValues v3 = new ContentValues();
        v3.put("app_id", arg8.zzth);
        v3.put("metadata_fingerprint", Long.valueOf(v1_2));
        v3.put("metadata", v0_1);
        try {
            this.getWritableDatabase().insertWithOnConflict("raw_events_metadata", null, v3, 4);
            return v1_2;
        }
        catch(SQLiteException v0_2) {
            ((zzhi)this).zzgi().zziv().zze("Error storing raw event metadata. appId", zzfi.zzbp(arg8.zzth), v0_2);
            throw v0_2;
        }
    }

    public final boolean zza(zzes arg9, long arg10, boolean arg12) {
        String v12;
        zzfk v11;
        byte[] v1_1;
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        Preconditions.checkNotNull(arg9);
        Preconditions.checkNotEmpty(arg9.zzth);
        zzkr v0 = new zzkr();
        v0.zzavc = Long.valueOf(arg9.zzahf);
        v0.zzava = new zzks[arg9.zzahg.size()];
        Iterator v1 = arg9.zzahg.iterator();
        int v3;
        for(v3 = 0; v1.hasNext(); ++v3) {
            Object v4 = v1.next();
            zzks v5 = new zzks();
            v0.zzava[v3] = v5;
            v5.name = ((String)v4);
            ((zzjr)this).zzjf().zza(v5, arg9.zzahg.get(((String)v4)));
        }

        try {
            v1_1 = new byte[((zzacj)v0).zzwb()];
            zzacb v3_1 = zzacb.zzb(v1_1, 0, v1_1.length);
            ((zzacj)v0).zza(v3_1);
            v3_1.zzvt();
        }
        catch(IOException v10) {
            v11 = ((zzhi)this).zzgi().zziv();
            v12 = "Data loss. Failed to serialize event params/data. appId";
            goto label_87;
        }

        ((zzhi)this).zzgi().zzjc().zze("Saving event, name, data size", ((zzhi)this).zzgf().zzbm(arg9.name), Integer.valueOf(v1_1.length));
        ContentValues v0_1 = new ContentValues();
        v0_1.put("app_id", arg9.zzth);
        v0_1.put("name", arg9.name);
        v0_1.put("timestamp", Long.valueOf(arg9.timestamp));
        v0_1.put("metadata_fingerprint", Long.valueOf(arg10));
        v0_1.put("data", v1_1);
        v0_1.put("realtime", Integer.valueOf(((int)arg12)));
        try {
            if(this.getWritableDatabase().insert("raw_events", null, v0_1) != -1) {
                return 1;
            }

            ((zzhi)this).zzgi().zziv().zzg("Failed to insert raw event (got -1). appId", zzfi.zzbp(arg9.zzth));
            return 0;
        }
        catch(SQLiteException v10_1) {
            v11 = ((zzhi)this).zzgi().zziv();
            v12 = "Error storing raw event. appId";
        }

    label_87:
        v11.zze(v12, zzfi.zzbp(arg9.zzth), v10);
        return 0;
    }

    @WorkerThread public final boolean zza(zzku arg7, boolean arg8) {
        String v2_1;
        zzfk v1_1;
        byte[] v1;
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        Preconditions.checkNotNull(arg7);
        Preconditions.checkNotEmpty(arg7.zzth);
        Preconditions.checkNotNull(arg7.zzavm);
        this.zzhx();
        long v0 = ((zzhi)this).zzbt().currentTimeMillis();
        if(arg7.zzavm.longValue() < v0 - zzeh.zzhq() || arg7.zzavm.longValue() > zzeh.zzhq() + v0) {
            ((zzhi)this).zzgi().zziy().zzd("Storing bundle outside of the max uploading time span. appId, now, timestamp", zzfi.zzbp(arg7.zzth), Long.valueOf(v0), arg7.zzavm);
        }

        try {
            v1 = new byte[((zzacj)arg7).zzwb()];
            zzacb v2 = zzacb.zzb(v1, 0, v1.length);
            ((zzacj)arg7).zza(v2);
            v2.zzvt();
            v1 = ((zzjr)this).zzjf().zzb(v1);
        }
        catch(IOException v8) {
            v1_1 = ((zzhi)this).zzgi().zziv();
            v2_1 = "Data loss. Failed to serialize bundle. appId";
            goto label_80;
        }

        ((zzhi)this).zzgi().zzjc().zzg("Saving bundle, size", Integer.valueOf(v1.length));
        ContentValues v2_2 = new ContentValues();
        v2_2.put("app_id", arg7.zzth);
        v2_2.put("bundle_end_timestamp", arg7.zzavm);
        v2_2.put("data", v1);
        v2_2.put("has_realtime", Integer.valueOf(((int)arg8)));
        if(arg7.zzawj != null) {
            v2_2.put("retry_count", arg7.zzawj);
        }

        try {
            if(this.getWritableDatabase().insert("queue", null, v2_2) != -1) {
                return 1;
            }

            ((zzhi)this).zzgi().zziv().zzg("Failed to insert bundle (got -1). appId", zzfi.zzbp(arg7.zzth));
            return 0;
        }
        catch(SQLiteException v8_1) {
            v1_1 = ((zzhi)this).zzgi().zziv();
            v2_1 = "Error storing bundle. appId";
        }

    label_80:
        v1_1.zze(v2_1, zzfi.zzbp(arg7.zzth), v8);
        return 0;
    }

    @WorkerThread public final boolean zza(zzef arg8) {
        Preconditions.checkNotNull(arg8);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        if(this.zzh(arg8.packageName, arg8.zzage.name) == null && this.zza("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{arg8.packageName}) >= 1000) {
            return 0;
        }

        ContentValues v0 = new ContentValues();
        v0.put("app_id", arg8.packageName);
        v0.put("origin", arg8.origin);
        v0.put("name", arg8.zzage.name);
        zzek.zza(v0, "value", arg8.zzage.getValue());
        v0.put("active", Boolean.valueOf(arg8.active));
        v0.put("trigger_event_name", arg8.triggerEventName);
        v0.put("trigger_timeout", Long.valueOf(arg8.triggerTimeout));
        ((zzhi)this).zzgg();
        v0.put("timed_out_event", zzkd.zza(arg8.zzagf));
        v0.put("creation_timestamp", Long.valueOf(arg8.creationTimestamp));
        ((zzhi)this).zzgg();
        v0.put("triggered_event", zzkd.zza(arg8.zzagg));
        v0.put("triggered_timestamp", Long.valueOf(arg8.zzage.zzast));
        v0.put("time_to_live", Long.valueOf(arg8.timeToLive));
        ((zzhi)this).zzgg();
        v0.put("expired_event", zzkd.zza(arg8.zzagh));
        try {
            if(this.getWritableDatabase().insertWithOnConflict("conditional_properties", null, v0, 5) != -1) {
                return 1;
            }

            ((zzhi)this).zzgi().zziv().zzg("Failed to insert/update conditional user property (got -1)", zzfi.zzbp(arg8.packageName));
        }
        catch(SQLiteException v0_1) {
            ((zzhi)this).zzgi().zziv().zze("Error storing conditional user property", zzfi.zzbp(arg8.packageName), v0_1);
        }

        return 1;
    }

    public final Pair zza(String arg8, Long arg9) {
        Pair v8_2;
        zzkr v4;
        Long v3;
        Cursor v1;
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        Pair v0 = null;
        try {
            v1 = this.getWritableDatabase().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{arg8, String.valueOf(arg9)});
        }
        catch(Throwable v8) {
            v1 = ((Cursor)v0);
            goto label_58;
        }
        catch(SQLiteException v8_1) {
            v1 = ((Cursor)v0);
            goto label_50;
        }

        try {
            if(v1.moveToFirst()) {
                goto label_22;
            }

            ((zzhi)this).zzgi().zzjc().log("Main event not found");
            if(v1 != null) {
                goto label_20;
            }

            return v0;
        }
        catch(Throwable v8) {
            goto label_58;
        }
        catch(SQLiteException v8_1) {
            goto label_44;
        }

    label_20:
        v1.close();
        return v0;
        try {
        label_22:
            byte[] v2 = v1.getBlob(0);
            v3 = Long.valueOf(v1.getLong(1));
            zzaca v2_1 = zzaca.zza(v2, 0, v2.length);
            v4 = new zzkr();
            try {
                ((zzacj)v4).zzb(v2_1);
            }
            catch(IOException v2_2) {
                try {
                    ((zzhi)this).zzgi().zziv().zzd("Failed to merge main event. appId, eventId", zzfi.zzbp(arg8), arg9, v2_2);
                    if(v1 != null) {
                        goto label_41;
                    }

                    return v0;
                }
                catch(Throwable v8) {
                    goto label_58;
                }
                catch(SQLiteException v8_1) {
                    goto label_44;
                }

            label_41:
                v1.close();
                return v0;
            }
        }
        catch(Throwable v8) {
            goto label_58;
        }
        catch(SQLiteException v8_1) {
            goto label_44;
        }

        try {
            v8_2 = Pair.create(v4, v3);
            if(v1 == null) {
                return v8_2;
            }

            goto label_32;
        }
        catch(Throwable v8) {
        }
        catch(SQLiteException v8_1) {
        label_44:
            try {
            label_50:
                ((zzhi)this).zzgi().zziv().zzg("Error selecting main event", v8_1);
                if(v1 != null) {
                    goto label_55;
                }

                return v0;
            }
            catch(Throwable v8) {
                goto label_58;
            }

        label_55:
            v1.close();
            return v0;
        }

    label_58:
        if(v1 != null) {
            v1.close();
        }

        throw v8;
    label_32:
        v1.close();
        return v8_2;
    }

    public final boolean zza(String arg6, Long arg7, long arg8, zzkr arg10) {
        byte[] v1;
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        Preconditions.checkNotNull(arg10);
        Preconditions.checkNotEmpty(arg6);
        Preconditions.checkNotNull(arg7);
        try {
            v1 = new byte[((zzacj)arg10).zzwb()];
            zzacb v2 = zzacb.zzb(v1, 0, v1.length);
            ((zzacj)arg10).zza(v2);
            v2.zzvt();
        }
        catch(IOException v8) {
            ((zzhi)this).zzgi().zziv().zzd("Data loss. Failed to serialize event params/data. appId, eventId", zzfi.zzbp(arg6), arg7, v8);
            return 0;
        }

        ((zzhi)this).zzgi().zzjc().zze("Saving complex main event, appId, data size", ((zzhi)this).zzgf().zzbm(arg6), Integer.valueOf(v1.length));
        ContentValues v10 = new ContentValues();
        v10.put("app_id", arg6);
        v10.put("event_id", arg7);
        v10.put("children_to_process", Long.valueOf(arg8));
        v10.put("main_event", v1);
        try {
            if(this.getWritableDatabase().insertWithOnConflict("main_event_params", null, v10, 5) != -1) {
                return 1;
            }

            ((zzhi)this).zzgi().zziv().zzg("Failed to insert complex main event (got -1). appId", zzfi.zzbp(arg6));
            return 0;
        }
        catch(SQLiteException v7) {
            ((zzhi)this).zzgi().zziv().zze("Error storing complex main event. appId", zzfi.zzbp(arg6), v7);
            return 0;
        }

        return 1;
    }

    @WorkerThread private final long zza(String arg4, String[] arg5) {
        long v0_2;
        Cursor v5;
        SQLiteDatabase v0 = this.getWritableDatabase();
        Cursor v1 = null;
        try {
            v5 = v0.rawQuery(arg4, arg5);
            goto label_3;
        }
        catch(Throwable v4) {
        }
        catch(SQLiteException v0_1) {
            goto label_23;
            try {
            label_3:
                if(!v5.moveToFirst()) {
                    goto label_10;
                }

                v0_2 = v5.getLong(0);
                if(v5 != null) {
                    goto label_8;
                }

                return v0_2;
            }
            catch(SQLiteException v0_1) {
                goto label_17;
            }
            catch(Throwable v4) {
                goto label_15;
            }

        label_8:
            v5.close();
            return v0_2;
            try {
            label_10:
                throw new SQLiteException("Database returned empty set");
            }
            catch(Throwable v4) {
            label_15:
            }
            catch(SQLiteException v0_1) {
            label_17:
                v1 = v5;
                try {
                label_23:
                    ((zzhi)this).zzgi().zziv().zze("Database error", arg4, v0_1);
                    throw v0_1;
                }
                catch(Throwable v4) {
                    v5 = v1;
                }
            }
        }

        if(v5 != null) {
            v5.close();
        }

        throw v4;
    }

    @WorkerThread private final long zza(String arg3, String[] arg4, long arg5) {
        Cursor v4;
        SQLiteDatabase v0 = this.getWritableDatabase();
        Cursor v1 = null;
        try {
            v4 = v0.rawQuery(arg3, arg4);
            goto label_3;
        }
        catch(Throwable v3) {
        }
        catch(SQLiteException v5) {
            goto label_22;
            try {
            label_3:
                if(!v4.moveToFirst()) {
                    goto label_10;
                }

                arg5 = v4.getLong(0);
                if(v4 == null) {
                    return arg5;
                }

                goto label_8;
            }
            catch(Throwable v3) {
                v1 = v4;
            }
            catch(SQLiteException v5) {
                v1 = v4;
                try {
                label_22:
                    ((zzhi)this).zzgi().zziv().zze("Database error", arg3, v5);
                    throw v5;
                }
                catch(Throwable v3) {
                }
            }
        }

        if(v1 != null) {
            v1.close();
        }

        throw v3;
    label_8:
        v4.close();
        return arg5;
    label_10:
        if(v4 != null) {
            v4.close();
        }

        return arg5;
    }

    @WorkerThread @VisibleForTesting private final Object zza(Cursor arg3, int arg4) {
        int v0 = arg3.getType(arg4);
        Object v1 = null;
        switch(v0) {
            case 0: {
                goto label_22;
            }
            case 1: {
                goto label_19;
            }
            case 2: {
                goto label_16;
            }
            case 3: {
                goto label_14;
            }
            case 4: {
                goto label_9;
            }
        }

        ((zzhi)this).zzgi().zziv().zzg("Loaded invalid unknown value type, ignoring it", Integer.valueOf(v0));
        return v1;
    label_19:
        return Long.valueOf(arg3.getLong(arg4));
    label_22:
        ((zzhi)this).zzgi().zziv().log("Loaded invalid null value from database");
        return v1;
    label_9:
        ((zzhi)this).zzgi().zziv().log("Loaded invalid blob type value, ignoring it");
        return v1;
    label_14:
        return arg3.getString(arg4);
    label_16:
        return Double.valueOf(arg3.getDouble(arg4));
    }

    @WorkerThread private static void zza(ContentValues arg1, String arg2, Object arg3) {
        Preconditions.checkNotEmpty(arg2);
        Preconditions.checkNotNull(arg3);
        if((arg3 instanceof String)) {
            arg1.put(arg2, ((String)arg3));
            return;
        }

        if((arg3 instanceof Long)) {
            arg1.put(arg2, ((Long)arg3));
            return;
        }

        if((arg3 instanceof Double)) {
            arg1.put(arg2, ((Double)arg3));
            return;
        }

        throw new IllegalArgumentException("Invalid value type");
    }

    @WorkerThread private final boolean zza(String arg5, int arg6, zzkh arg7) {
        byte[] v0;
        ((zzjs)this).zzch();
        ((zzhi)this).zzab();
        Preconditions.checkNotEmpty(arg5);
        Preconditions.checkNotNull(arg7);
        if(TextUtils.isEmpty(arg7.zzatl)) {
            ((zzhi)this).zzgi().zziy().zzd("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", zzfi.zzbp(arg5), Integer.valueOf(arg6), String.valueOf(arg7.zzatk));
            return 0;
        }

        try {
            v0 = new byte[((zzacj)arg7).zzwb()];
            zzacb v2 = zzacb.zzb(v0, 0, v0.length);
            ((zzacj)arg7).zza(v2);
            v2.zzvt();
        }
        catch(IOException v6) {
            ((zzhi)this).zzgi().zziv().zze("Configuration loss. Failed to serialize event filter. appId", zzfi.zzbp(arg5), v6);
            return 0;
        }

        ContentValues v2_1 = new ContentValues();
        v2_1.put("app_id", arg5);
        v2_1.put("audience_id", Integer.valueOf(arg6));
        v2_1.put("filter_id", arg7.zzatk);
        v2_1.put("event_name", arg7.zzatl);
        v2_1.put("data", v0);
        try {
            if(this.getWritableDatabase().insertWithOnConflict("event_filters", null, v2_1, 5) == -1) {
                ((zzhi)this).zzgi().zziv().zzg("Failed to insert event filter (got -1). appId", zzfi.zzbp(arg5));
            }
        }
        catch(SQLiteException v6_1) {
            ((zzhi)this).zzgi().zziv().zze("Error storing event filter. appId", zzfi.zzbp(arg5), v6_1);
            return 0;
        }

        return 1;
    }

    @WorkerThread private final boolean zza(String arg5, int arg6, zzkk arg7) {
        byte[] v0;
        ((zzjs)this).zzch();
        ((zzhi)this).zzab();
        Preconditions.checkNotEmpty(arg5);
        Preconditions.checkNotNull(arg7);
        if(TextUtils.isEmpty(arg7.zzauc)) {
            ((zzhi)this).zzgi().zziy().zzd("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", zzfi.zzbp(arg5), Integer.valueOf(arg6), String.valueOf(arg7.zzatk));
            return 0;
        }

        try {
            v0 = new byte[((zzacj)arg7).zzwb()];
            zzacb v2 = zzacb.zzb(v0, 0, v0.length);
            ((zzacj)arg7).zza(v2);
            v2.zzvt();
        }
        catch(IOException v6) {
            ((zzhi)this).zzgi().zziv().zze("Configuration loss. Failed to serialize property filter. appId", zzfi.zzbp(arg5), v6);
            return 0;
        }

        ContentValues v2_1 = new ContentValues();
        v2_1.put("app_id", arg5);
        v2_1.put("audience_id", Integer.valueOf(arg6));
        v2_1.put("filter_id", arg7.zzatk);
        v2_1.put("property_name", arg7.zzauc);
        v2_1.put("data", v0);
        try {
            if(this.getWritableDatabase().insertWithOnConflict("property_filters", null, v2_1, 5) != -1) {
                return 1;
            }

            ((zzhi)this).zzgi().zziv().zzg("Failed to insert property filter (got -1). appId", zzfi.zzbp(arg5));
            return 0;
        }
        catch(SQLiteException v6_1) {
            ((zzhi)this).zzgi().zziv().zze("Error storing property filter. appId", zzfi.zzbp(arg5), v6_1);
            return 0;
        }

        return 1;
    }

    private final boolean zza(String arg9, List arg10) {
        Preconditions.checkNotEmpty(arg9);
        ((zzjs)this).zzch();
        ((zzhi)this).zzab();
        SQLiteDatabase v0 = this.getWritableDatabase();
        try {
            long v4 = this.zza("select count(1) from audience_filter_values where app_id=?", new String[]{arg9});
        }
        catch(SQLiteException v10) {
            ((zzhi)this).zzgi().zziv().zze("Database error querying filters. appId", zzfi.zzbp(arg9), v10);
            return 0;
        }

        int v2 = Math.max(0, Math.min(2000, ((zzhi)this).zzgk().zzb(arg9, zzez.zzajj)));
        if(v4 <= (((long)v2))) {
            return 0;
        }

        ArrayList v4_1 = new ArrayList();
        int v5 = 0;
        while(true) {
            if(v5 >= arg10.size()) {
                goto label_35;
            }

            Object v6 = arg10.get(v5);
            if(v6 != null) {
                if(!(v6 instanceof Integer)) {
                }
                else {
                    ((List)v4_1).add(Integer.toString(((Integer)v6).intValue()));
                    ++v5;
                    continue;
                }
            }

            return 0;
        }

        return 0;
    label_35:
        String v10_1 = TextUtils.join(",", ((Iterable)v4_1));
        StringBuilder v6_1 = new StringBuilder(String.valueOf(v10_1).length() + 2);
        v6_1.append("(");
        v6_1.append(v10_1);
        v6_1.append(")");
        v10_1 = v6_1.toString();
        StringBuilder v7 = new StringBuilder(String.valueOf(v10_1).length() + 140);
        v7.append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
        v7.append(v10_1);
        v7.append(" order by rowid desc limit -1 offset ?)");
        if(v0.delete("audience_filter_values", v7.toString(), new String[]{arg9, Integer.toString(v2)}) > 0) {
            return 1;
        }

        return 0;
    }

    public final String zzag(long arg5) {
        String v6_2;
        Cursor v5;
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        String v0 = null;
        try {
            v5 = this.getWritableDatabase().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(arg5)});
        }
        catch(Throwable v6) {
            v5 = ((Cursor)v0);
            goto label_39;
        }
        catch(SQLiteException v6_1) {
            v5 = ((Cursor)v0);
            goto label_31;
        }

        try {
            if(v5.moveToFirst()) {
                goto label_20;
            }

            ((zzhi)this).zzgi().zzjc().log("No expired configs for apps with pending events");
            if(v5 != null) {
                goto label_18;
            }

            return v0;
        }
        catch(Throwable v6) {
            goto label_39;
        }
        catch(SQLiteException v6_1) {
            goto label_25;
        }

    label_18:
        v5.close();
        return v0;
        try {
        label_20:
            v6_2 = v5.getString(0);
            if(v5 == null) {
                return v6_2;
            }

            goto label_22;
        }
        catch(Throwable v6) {
        }
        catch(SQLiteException v6_1) {
        label_25:
            try {
            label_31:
                ((zzhi)this).zzgi().zziv().zzg("Error selecting expired configs", v6_1);
                if(v5 != null) {
                    goto label_36;
                }

                return v0;
            }
            catch(Throwable v6) {
                goto label_39;
            }

        label_36:
            v5.close();
            return v0;
        }

    label_39:
        if(v5 != null) {
            v5.close();
        }

        throw v6;
    label_22:
        v5.close();
        return v6_2;
    }

    @WorkerThread public final List zzb(String arg22, String arg23, String arg24) {
        String v13;
        Object v10;
        zzek v12;
        int v4_1;
        long v8;
        String v7;
        int v6;
        Cursor v2_1;
        String v5;
        StringBuilder v4;
        String v11;
        ArrayList v2;
        int v3;
        Preconditions.checkNotEmpty(arg22);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        ArrayList v0 = new ArrayList();
        List v1 = null;
        try {
            v3 = 3;
            v2 = new ArrayList(v3);
            v11 = arg22;
            goto label_10;
        }
        catch(Throwable v0_1) {
        }
        catch(SQLiteException v0_2) {
            goto label_116;
            try {
            label_10:
                ((List)v2).add(v11);
                v4 = new StringBuilder("app_id=?");
                if(TextUtils.isEmpty(((CharSequence)arg23))) {
                    goto label_24;
                }

                goto label_16;
            }
            catch(Throwable v0_1) {
            label_112:
                goto label_128;
            }
            catch(SQLiteException v0_2) {
            label_116:
                v5 = arg23;
                goto label_117;
            label_16:
                v5 = arg23;
                try {
                    ((List)v2).add(v5);
                    v4.append(" and origin=?");
                    goto label_25;
                label_24:
                    v5 = arg23;
                label_25:
                    if(!TextUtils.isEmpty(((CharSequence)arg24))) {
                        ((List)v2).add(String.valueOf(arg24).concat("*"));
                        v4.append(" and name glob ?");
                    }

                    v2_1 = this.getWritableDatabase().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, v4.toString(), ((List)v2).toArray(new String[((List)v2).size()]), null, null, "rowid", "1001");
                    goto label_50;
                label_23:
                }
                catch(SQLiteException v0_2) {
                    goto label_23;
                }
                catch(Throwable v0_1) {
                    goto label_112;
                }

            label_117:
                v2_1 = ((Cursor)v1);
                goto label_118;
            }
        }

        try {
        label_50:
            if(!v2_1.moveToFirst()) {
                goto label_52;
            }

            goto label_55;
        }
        catch(SQLiteException v0_2) {
            goto label_106;
        }
        catch(Throwable v0_1) {
            goto label_127;
        }

    label_52:
        if(v2_1 != null) {
            v2_1.close();
        }

        return ((List)v0);
        try {
            while(true) {
            label_55:
                v6 = 1000;
                if(((List)v0).size() < v6) {
                    v7 = v2_1.getString(0);
                    v8 = v2_1.getLong(1);
                    v4_1 = 2;
                    v12 = this;
                    break;
                }
                else {
                    goto label_58;
                }
            }
        }
        catch(SQLiteException v0_2) {
            goto label_106;
        }
        catch(Throwable v0_1) {
            goto label_127;
        }

        try {
            v10 = v12.zza(v2_1, v4_1);
            v13 = v2_1.getString(v3);
            if(v10 != null) {
                goto label_84;
            }

            goto label_74;
        }
        catch(Throwable v0_1) {
        }
        catch(SQLiteException v0_2) {
            goto label_118;
            try {
            label_74:
                ((zzhi)this).zzgi().zziv().zzd("(2)Read invalid user property value, ignoring it", zzfi.zzbp(arg22), v13, arg24);
                goto label_92;
            label_84:
                ((List)v0).add(new zzkc(arg22, v13, v7, v8, v10));
            label_92:
                if(v2_1.moveToNext()) {
                    goto label_97;
                }

                goto label_94;
            }
            catch(SQLiteException v0_2) {
                goto label_82;
            }
            catch(Throwable v0_1) {
                goto label_127;
            }

        label_97:
            v5 = v13;
            goto label_55;
            try {
            label_58:
                ((zzhi)this).zzgi().zziv().zzg("Read more than the max allowed user properties, ignoring excess", Integer.valueOf(v6));
            }
            catch(SQLiteException v0_2) {
                goto label_106;
            }
            catch(Throwable v0_1) {
                goto label_127;
            }

        label_94:
            if(v2_1 != null) {
                v2_1.close();
            }

            return ((List)v0);
        label_82:
            v5 = v13;
        label_106:
            try {
            label_118:
                ((zzhi)this).zzgi().zziv().zzd("(2)Error querying user properties", zzfi.zzbp(arg22), v5, v0_2);
                if(v2_1 == null) {
                    return v1;
                }
            }
            catch(Throwable v0_1) {
                goto label_127;
            }
        }

        v2_1.close();
        return v1;
    label_127:
        Cursor v1_1 = v2_1;
    label_128:
        if(v1_1 != null) {
            v1_1.close();
        }

        throw v0_1;
    }

    public final List zzb(String arg25, String[] arg26) {
        List v0_3;
        int v3;
        Cursor v2;
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        ArrayList v0 = new ArrayList();
        Cursor v1 = null;
        try {
            v2 = this.getWritableDatabase().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, arg25, arg26, null, null, "rowid", "1001");
            goto label_28;
        }
        catch(Throwable v0_1) {
        }
        catch(SQLiteException v0_2) {
            goto label_119;
            try {
            label_28:
                if(!v2.moveToFirst()) {
                    goto label_30;
                }

                goto label_33;
            }
            catch(SQLiteException v0_2) {
                goto label_113;
            }
            catch(Throwable v0_1) {
                goto label_127;
            }

        label_30:
            if(v2 != null) {
                v2.close();
            }

            return ((List)v0);
            try {
                do {
                label_33:
                    v3 = 1000;
                    if(((List)v0).size() < v3) {
                        boolean v1_1 = false;
                        String v4 = v2.getString(0);
                        String v11 = v2.getString(1);
                        String v6 = v2.getString(2);
                        Object v9 = this.zza(v2, 3);
                        if(v2.getInt(4) != 0) {
                            v1_1 = true;
                        }

                        ((List)v0).add(new zzef(v4, v11, new zzka(v6, v2.getLong(10), v9, v11), v2.getLong(8), v1_1, v2.getString(5), ((zzjr)this).zzjf().zza(v2.getBlob(7), zzex.CREATOR), v2.getLong(6), ((zzjr)this).zzjf().zza(v2.getBlob(9), zzex.CREATOR), v2.getLong(11), ((zzjr)this).zzjf().zza(v2.getBlob(12), zzex.CREATOR)));
                        if(v2.moveToNext()) {
                            continue;
                        }
                    }
                    else {
                        break;
                    }

                    goto label_107;
                }
                while(true);

                ((zzhi)this).zzgi().zziv().zzg("Read more than the max allowed conditional properties, ignoring extra", Integer.valueOf(v3));
            }
            catch(SQLiteException v0_2) {
                goto label_113;
            }
            catch(Throwable v0_1) {
                goto label_127;
            }

        label_107:
            if(v2 != null) {
                v2.close();
            }

            return ((List)v0);
        label_113:
            v1 = v2;
            try {
            label_119:
                ((zzhi)this).zzgi().zziv().zzg("Error querying conditional user property value", v0_2);
                v0_3 = Collections.emptyList();
                if(v1 == null) {
                    return v0_3;
                }
            }
            catch(Throwable v0_1) {
                v2 = v1;
                goto label_127;
            }
        }

        v1.close();
        return v0_3;
    label_127:
        if(v2 != null) {
            v2.close();
        }

        throw v0_1;
    }

    @WorkerThread public final List zzb(String arg13, int arg14, int arg15) {
        List v13_1;
        int v7_2;
        Object v7;
        String v6_1;
        zzfk v5;
        byte[] v6;
        ArrayList v2_2;
        List v15_1;
        Cursor v14;
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        boolean v2 = arg14 > 0 ? true : false;
        Preconditions.checkArgument(v2);
        v2 = arg15 > 0 ? true : false;
        Preconditions.checkArgument(v2);
        Preconditions.checkNotEmpty(arg13);
        Cursor v2_1 = null;
        try {
            v14 = this.getWritableDatabase().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{arg13}, null, null, "rowid", String.valueOf(arg14));
            goto label_30;
        }
        catch(Throwable v13) {
        }
        catch(SQLiteException v15) {
            goto label_93;
            try {
            label_30:
                if(v14.moveToFirst()) {
                    goto label_36;
                }

                v15_1 = Collections.emptyList();
                if(v14 != null) {
                    goto label_34;
                }

                return v15_1;
            }
            catch(Throwable v13) {
                goto label_102;
            }
            catch(SQLiteException v15) {
                goto label_87;
            }

        label_34:
            v14.close();
            return v15_1;
            try {
            label_36:
                v2_2 = new ArrayList();
                int v3 = 0;
                do {
                label_39:
                    long v4 = v14.getLong(0);
                    try {
                        v6 = ((zzjr)this).zzjf().zza(v14.getBlob(1));
                    }
                    catch(IOException v4_1) {
                        v5 = ((zzhi)this).zzgi().zziv();
                        v6_1 = "Failed to unzip queued bundle. appId";
                        v7 = zzfi.zzbp(arg13);
                        goto label_70;
                    }

                    if(!((List)v2_2).isEmpty() && v6.length + v3 > arg15) {
                        goto label_81;
                    }

                    zzaca v7_1 = zzaca.zza(v6, 0, v6.length);
                    zzku v8 = new zzku();
                    try {
                        ((zzacj)v8).zzb(v7_1);
                        v7_2 = 2;
                        goto label_54;
                    }
                    catch(IOException v4_1) {
                        v5 = ((zzhi)this).zzgi().zziv();
                        v6_1 = "Failed to merge queued bundle. appId";
                        v7 = zzfi.zzbp(arg13);
                    }

                label_70:
                    v5.zze(v6_1, v7, v4_1);
                    goto label_78;
                label_54:
                    if(!v14.isNull(v7_2)) {
                        v8.zzawj = Integer.valueOf(v14.getInt(v7_2));
                    }

                    v3 += v6.length;
                    ((List)v2_2).add(Pair.create(v8, Long.valueOf(v4)));
                label_78:
                    if(!v14.moveToNext()) {
                        goto label_81;
                    }

                    break;
                }
                while(true);
            }
            catch(Throwable v13) {
                goto label_102;
            }
            catch(SQLiteException v15) {
                goto label_87;
            }

            if(v3 <= arg15) {
                goto label_39;
            }

        label_81:
            if(v14 != null) {
                v14.close();
            }

            return ((List)v2_2);
        label_87:
            v2_1 = v14;
            try {
            label_93:
                ((zzhi)this).zzgi().zziv().zze("Error querying bundles. appId", zzfi.zzbp(arg13), v15);
                v13_1 = Collections.emptyList();
                if(v2_1 == null) {
                    return v13_1;
                }
            }
            catch(Throwable v13) {
                v14 = v2_1;
                goto label_102;
            }
        }

        v2_1.close();
        return v13_1;
    label_102:
        if(v14 != null) {
            v14.close();
        }

        throw v13;
    }

    @WorkerThread final void zzb(String arg13, zzkg[] arg14) {
        int v7_3;
        Integer v3_1;
        Object v8_1;
        String v7_1;
        zzfk v5_2;
        ((zzjs)this).zzch();
        ((zzhi)this).zzab();
        Preconditions.checkNotEmpty(arg13);
        Preconditions.checkNotNull(arg14);
        SQLiteDatabase v0 = this.getWritableDatabase();
        v0.beginTransaction();
        try {
            ((zzjs)this).zzch();
            ((zzhi)this).zzab();
            Preconditions.checkNotEmpty(arg13);
            SQLiteDatabase v1 = this.getWritableDatabase();
            String[] v5 = new String[1];
            int v6 = 0;
            v5[0] = arg13;
            v1.delete("property_filters", "app_id=?", v5);
            v1.delete("event_filters", "app_id=?", new String[]{arg13});
            int v1_1 = arg14.length;
            int v2;
            for(v2 = 0; v2 < v1_1; ++v2) {
                zzkg v3 = arg14[v2];
                ((zzjs)this).zzch();
                ((zzhi)this).zzab();
                Preconditions.checkNotEmpty(arg13);
                Preconditions.checkNotNull(v3);
                Preconditions.checkNotNull(v3.zzatg);
                Preconditions.checkNotNull(v3.zzatf);
                if(v3.zzate == null) {
                    ((zzhi)this).zzgi().zziy().zzg("Audience with no ID. appId", zzfi.zzbp(arg13));
                }
                else {
                    int v5_1 = v3.zzate.intValue();
                    zzkh[] v7 = v3.zzatg;
                    int v8 = v7.length;
                    int v9 = 0;
                    while(true) {
                        if(v9 >= v8) {
                            break;
                        }
                        else if(v7[v9].zzatk == null) {
                            v5_2 = ((zzhi)this).zzgi().zziy();
                            v7_1 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                            v8_1 = zzfi.zzbp(arg13);
                            v3_1 = v3.zzate;
                        }
                        else {
                            ++v9;
                            continue;
                        }

                        goto label_56;
                    }

                    zzkk[] v7_2 = v3.zzatf;
                    v8 = v7_2.length;
                    v9 = 0;
                    while(true) {
                        if(v9 >= v8) {
                            break;
                        }
                        else if(v7_2[v9].zzatk == null) {
                            v5_2 = ((zzhi)this).zzgi().zziy();
                            v7_1 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                            v8_1 = zzfi.zzbp(arg13);
                            v3_1 = v3.zzate;
                        }
                        else {
                            ++v9;
                            continue;
                        }

                        goto label_56;
                    }

                    v7 = v3.zzatg;
                    v8 = v7.length;
                    v9 = 0;
                    while(true) {
                        if(v9 >= v8) {
                            break;
                        }
                        else if(!this.zza(arg13, v5_1, v7[v9])) {
                            v7_3 = 0;
                        }
                        else {
                            ++v9;
                            continue;
                        }

                        goto label_87;
                    }

                    v7_3 = 1;
                label_87:
                    if(v7_3 != 0) {
                        zzkk[] v3_2 = v3.zzatf;
                        v8 = v3_2.length;
                        v9 = 0;
                        while(v9 < v8) {
                            if(!this.zza(arg13, v5_1, v3_2[v9])) {
                                v7_3 = 0;
                            }
                            else {
                                ++v9;
                                continue;
                            }

                            break;
                        }
                    }

                    if(v7_3 != 0) {
                        goto label_119;
                    }

                    ((zzjs)this).zzch();
                    ((zzhi)this).zzab();
                    Preconditions.checkNotEmpty(arg13);
                    SQLiteDatabase v3_3 = this.getWritableDatabase();
                    v3_3.delete("property_filters", "app_id=? and audience_id=?", new String[]{arg13, String.valueOf(v5_1)});
                    v3_3.delete("event_filters", "app_id=? and audience_id=?", new String[]{arg13, String.valueOf(v5_1)});
                    goto label_119;
                label_56:
                    v5_2.zze(v7_1, v8_1, v3_1);
                }

            label_119:
            }

            ArrayList v1_2 = new ArrayList();
            v2 = arg14.length;
            while(v6 < v2) {
                ((List)v1_2).add(arg14[v6].zzate);
                ++v6;
            }

            this.zza(arg13, ((List)v1_2));
            v0.setTransactionSuccessful();
        }
        catch(Throwable v13) {
            goto label_135;
        }

        v0.endTransaction();
        return;
    label_135:
        v0.endTransaction();
        throw v13;
    }

    @WorkerThread public final List zzbe(String arg14) {
        Cursor v2;
        Preconditions.checkNotEmpty(arg14);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        ArrayList v0 = new ArrayList();
        List v1 = null;
        try {
            v2 = this.getWritableDatabase().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{arg14}, null, null, "rowid", "1000");
        }
        catch(Throwable v14) {
            v2 = ((Cursor)v1);
            goto label_71;
        }
        catch(SQLiteException v0_1) {
            v2 = ((Cursor)v1);
            goto label_62;
        }

        try {
            if(!v2.moveToFirst()) {
                goto label_25;
            }

            goto label_28;
        }
        catch(Throwable v14) {
            goto label_71;
        }
        catch(SQLiteException v0_1) {
            goto label_56;
        }

    label_25:
        if(v2 != null) {
            v2.close();
        }

        return ((List)v0);
        try {
            do {
            label_28:
                String v7 = v2.getString(0);
                String v3 = v2.getString(1);
                if(v3 == null) {
                    v3 = "";
                }

                String v6 = v3;
                long v8 = v2.getLong(2);
                Object v10 = this.zza(v2, 3);
                if(v10 == null) {
                    ((zzhi)this).zzgi().zziv().zzg("Read invalid user property value, ignoring it. appId", zzfi.zzbp(arg14));
                }
                else {
                    ((List)v0).add(new zzkc(arg14, v6, v7, v8, v10));
                }

                if(v2.moveToNext()) {
                    continue;
                }

                break;
            }
            while(true);
        }
        catch(Throwable v14) {
            goto label_71;
        }
        catch(SQLiteException v0_1) {
            goto label_56;
        }

        if(v2 != null) {
            v2.close();
        }

        return ((List)v0);
    label_56:
        try {
        label_62:
            ((zzhi)this).zzgi().zziv().zze("Error querying user properties. appId", zzfi.zzbp(arg14), v0_1);
            if(v2 != null) {
                goto label_68;
            }

            return v1;
        }
        catch(Throwable v14) {
            goto label_71;
        }

    label_68:
        v2.close();
        return v1;
    label_71:
        if(v2 != null) {
            v2.close();
        }

        throw v14;
    }

    @WorkerThread public final zzea zzbf(String arg31) {
        zzea v4;
        Cursor v3;
        boolean v0_2;
        String v1 = arg31;
        Preconditions.checkNotEmpty(arg31);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        zzea v2 = null;
        try {
            v0_2 = true;
            v3 = this.getWritableDatabase().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "ssaid_reporting_enabled"}, "app_id=?", new String[]{v1}, null, null, null);
        }
        catch(Throwable v0) {
            v3 = ((Cursor)v2);
            goto label_188;
        }
        catch(SQLiteException v0_1) {
            v3 = ((Cursor)v2);
            goto label_179;
        }

        try {
            if(v3.moveToFirst()) {
                goto label_47;
            }
        }
        catch(Throwable v0) {
            goto label_168;
        }
        catch(SQLiteException v0_1) {
            goto label_171;
        }

        if(v3 != null) {
            v3.close();
        }

        return v2;
    label_47:
        zzek v5 = this;
        goto label_49;
    label_171:
        goto label_179;
    label_168:
        goto label_188;
        try {
        label_49:
            v4 = new zzea(v5.zzalo.zzlm(), v1);
            v4.zzam(v3.getString(0));
            v4.zzan(v3.getString(1));
            v4.zzao(v3.getString(2));
            v4.zzw(v3.getLong(3));
            v4.zzr(v3.getLong(4));
            v4.zzs(v3.getLong(5));
            v4.setAppVersion(v3.getString(6));
            v4.zzaq(v3.getString(7));
            v4.zzu(v3.getLong(8));
            v4.zzv(v3.getLong(9));
            int v6 = 10;
            boolean v6_1 = (v3.isNull(v6)) || v3.getInt(v6) != 0 ? true : false;
            v4.setMeasurementEnabled(v6_1);
            v4.zzz(v3.getLong(11));
            v4.zzaa(v3.getLong(12));
            v4.zzab(v3.getLong(13));
            v4.zzac(v3.getLong(14));
            v4.zzx(v3.getLong(15));
            v4.zzy(v3.getLong(16));
            v6 = 17;
            long v6_2 = v3.isNull(v6) ? -2147483648 : ((long)v3.getInt(v6));
            v4.zzt(v6_2);
            v4.zzap(v3.getString(18));
            v4.zzae(v3.getLong(19));
            v4.zzad(v3.getLong(20));
            v4.zzar(v3.getString(21));
            v6 = 22;
            v6_2 = v3.isNull(v6) ? 0 : v3.getLong(v6);
            v4.zzaf(v6_2);
            v6 = 23;
            v6_1 = (v3.isNull(v6)) || v3.getInt(v6) != 0 ? true : false;
            v4.zzd(v6_1);
            v6 = 24;
            if(!v3.isNull(v6)) {
                if(v3.getInt(v6) != 0) {
                }
                else {
                    v0_2 = false;
                }
            }

            v4.zze(v0_2);
            v4.zzgp();
            if(v3.moveToNext()) {
                ((zzhi)this).zzgi().zziv().zzg("Got multiple records for app, expected one. appId", zzfi.zzbp(arg31));
            }

            goto label_161;
        }
        catch(Throwable v0) {
        }
        catch(SQLiteException v0_1) {
            try {
            label_179:
                ((zzhi)this).zzgi().zziv().zze("Error querying app. appId", zzfi.zzbp(arg31), v0_1);
                if(v3 != null) {
                    goto label_185;
                }

                return v2;
            }
            catch(Throwable v0) {
                goto label_188;
            }

        label_185:
            v3.close();
            return v2;
        }

    label_188:
        if(v3 != null) {
            v3.close();
        }

        throw v0;
    label_161:
        if(v3 != null) {
            v3.close();
        }

        return v4;
    }

    public final long zzbg(String arg7) {
        Preconditions.checkNotEmpty(arg7);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        try {
            return ((long)this.getWritableDatabase().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{arg7, String.valueOf(Math.max(0, Math.min(1000000, ((zzhi)this).zzgk().zzb(arg7, zzez.zzait))))}));
        }
        catch(SQLiteException v0) {
            ((zzhi)this).zzgi().zziv().zze("Error deleting over the limit events. appId", zzfi.zzbp(arg7), v0);
            return 0;
        }
    }

    @WorkerThread public final byte[] zzbh(String arg11) {
        byte[] v2_1;
        Cursor v1;
        Preconditions.checkNotEmpty(arg11);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        byte[] v0 = null;
        try {
            v1 = this.getWritableDatabase().query("apps", new String[]{"remote_config"}, "app_id=?", new String[]{arg11}, null, null, null);
        }
        catch(Throwable v11) {
            v1 = ((Cursor)v0);
            goto label_49;
        }
        catch(SQLiteException v2) {
            v1 = ((Cursor)v0);
            goto label_40;
        }

        try {
            if(v1.moveToFirst()) {
                goto label_22;
            }
        }
        catch(Throwable v11) {
            goto label_49;
        }
        catch(SQLiteException v2) {
            goto label_34;
        }

        if(v1 != null) {
            v1.close();
        }

        return v0;
        try {
        label_22:
            v2_1 = v1.getBlob(0);
            if(v1.moveToNext()) {
                ((zzhi)this).zzgi().zziv().zzg("Got multiple records for app config, expected one. appId", zzfi.zzbp(arg11));
            }

            goto label_30;
        }
        catch(Throwable v11) {
        }
        catch(SQLiteException v2) {
        label_34:
            try {
            label_40:
                ((zzhi)this).zzgi().zziv().zze("Error querying remote config. appId", zzfi.zzbp(arg11), v2);
                if(v1 != null) {
                    goto label_46;
                }

                return v0;
            }
            catch(Throwable v11) {
                goto label_49;
            }

        label_46:
            v1.close();
            return v0;
        }

    label_49:
        if(v1 != null) {
            v1.close();
        }

        throw v11;
    label_30:
        if(v1 != null) {
            v1.close();
        }

        return v2_1;
    }

    final Map zzbi(String arg12) {
        ArrayMap v1_1;
        Cursor v0_1;
        ((zzjs)this).zzch();
        ((zzhi)this).zzab();
        Preconditions.checkNotEmpty(arg12);
        SQLiteDatabase v0 = this.getWritableDatabase();
        Map v8 = null;
        try {
            v0_1 = v0.query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{arg12}, null, null, null);
        }
        catch(Throwable v12) {
            v0_1 = ((Cursor)v8);
            goto label_63;
        }
        catch(SQLiteException v1) {
            v0_1 = ((Cursor)v8);
            goto label_54;
        }

        try {
            if(v0_1.moveToFirst()) {
                goto label_23;
            }
        }
        catch(Throwable v12) {
            goto label_63;
        }
        catch(SQLiteException v1) {
            goto label_48;
        }

        if(v0_1 != null) {
            v0_1.close();
        }

        return v8;
        try {
        label_23:
            v1_1 = new ArrayMap();
            do {
                int v2 = v0_1.getInt(0);
                byte[] v3 = v0_1.getBlob(1);
                zzaca v3_1 = zzaca.zza(v3, 0, v3.length);
                zzkv v4 = new zzkv();
                try {
                    ((zzacj)v4).zzb(v3_1);
                }
                catch(IOException v3_2) {
                    ((zzhi)this).zzgi().zziv().zzd("Failed to merge filter results. appId, audienceId, error", zzfi.zzbp(arg12), Integer.valueOf(v2), v3_2);
                    goto label_42;
                }

                ((Map)v1_1).put(Integer.valueOf(v2), v4);
            label_42:
                if(v0_1.moveToNext()) {
                    continue;
                }

                break;
            }
            while(true);
        }
        catch(Throwable v12) {
            goto label_63;
        }
        catch(SQLiteException v1) {
            goto label_48;
        }

        if(v0_1 != null) {
            v0_1.close();
        }

        return ((Map)v1_1);
    label_48:
        try {
        label_54:
            ((zzhi)this).zzgi().zziv().zze("Database error querying filter results. appId", zzfi.zzbp(arg12), v1);
            if(v0_1 != null) {
                goto label_60;
            }

            return v8;
        }
        catch(Throwable v12) {
            goto label_63;
        }

    label_60:
        v0_1.close();
        return v8;
    label_63:
        if(v0_1 != null) {
            v0_1.close();
        }

        throw v12;
    }

    public final long zzbj(String arg5) {
        Preconditions.checkNotEmpty(arg5);
        return this.zza("select count(1) from events where app_id=? and name not like \'!_%\' escape \'!\'", new String[]{arg5}, 0);
    }

    @WorkerThread public final List zzc(String arg3, String arg4, String arg5) {
        Preconditions.checkNotEmpty(arg3);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        ArrayList v0 = new ArrayList(3);
        ((List)v0).add(arg3);
        StringBuilder v3 = new StringBuilder("app_id=?");
        if(!TextUtils.isEmpty(((CharSequence)arg4))) {
            ((List)v0).add(arg4);
            v3.append(" and origin=?");
        }

        if(!TextUtils.isEmpty(((CharSequence)arg5))) {
            ((List)v0).add(String.valueOf(arg5).concat("*"));
            v3.append(" and name glob ?");
        }

        return this.zzb(v3.toString(), ((List)v0).toArray(new String[((List)v0).size()]));
    }

    @WorkerThread @VisibleForTesting final void zzc(List arg5) {
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        Preconditions.checkNotNull(arg5);
        Preconditions.checkNotZero(arg5.size());
        if(!this.zzid()) {
            return;
        }

        String v5 = TextUtils.join(",", ((Iterable)arg5));
        StringBuilder v1 = new StringBuilder(String.valueOf(v5).length() + 2);
        v1.append("(");
        v1.append(v5);
        v1.append(")");
        v5 = v1.toString();
        v1 = new StringBuilder(String.valueOf(v5).length() + 80);
        v1.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
        v1.append(v5);
        v1.append(" AND retry_count =  2147483647 LIMIT 1");
        if(this.zza(v1.toString(), null) > 0) {
            ((zzhi)this).zzgi().zziy().log("The number of upload retries exceeds the limit. Will remain unchanged.");
        }

        try {
            SQLiteDatabase v0 = this.getWritableDatabase();
            StringBuilder v2 = new StringBuilder(String.valueOf(v5).length() + 0x7F);
            v2.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
            v2.append(v5);
            v2.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
            v0.execSQL(v2.toString());
            return;
        }
        catch(SQLiteException v5_1) {
            ((zzhi)this).zzgi().zziv().zzg("Error incrementing retry count. error", v5_1);
            return;
        }
    }

    @WorkerThread public final zzet zzf(String arg22, String arg23) {
        Boolean v14_1;
        Long v12;
        long v10;
        long v8;
        String v3_1;
        String v2;
        zzet v1_2;
        zzet v20;
        Boolean v19;
        Long v13;
        long v6;
        long v4;
        Cursor v17;
        Cursor v14;
        boolean v9;
        int v0_2;
        String v15 = arg23;
        Preconditions.checkNotEmpty(arg22);
        Preconditions.checkNotEmpty(arg23);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        zzet v16 = null;
        try {
            SQLiteDatabase v1 = this.getWritableDatabase();
            String[] v3 = new String[]{"lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling"};
            v0_2 = 2;
            String[] v5 = new String[v0_2];
            v9 = false;
            v5[0] = arg22;
            v5[1] = v15;
            v14 = v1.query("events", v3, "app_id=? and name=?", v5, null, null, null);
        }
        catch(Throwable v0) {
            v17 = ((Cursor)v16);
            goto label_113;
        }
        catch(SQLiteException v0_1) {
            v17 = ((Cursor)v16);
            goto label_102;
        }

        try {
            if(v14.moveToFirst()) {
                goto label_32;
            }
        }
        catch(Throwable v0) {
            goto label_92;
        }
        catch(SQLiteException v0_1) {
            goto label_95;
        }

        if(v14 != null) {
            v14.close();
        }

        return v16;
        try {
        label_32:
            v4 = v14.getLong(0);
            v6 = v14.getLong(1);
            long v11 = v14.getLong(v0_2);
            v0_2 = 3;
            long v0_3 = v14.isNull(v0_2) ? 0 : v14.getLong(v0_2);
            long v17_1 = v0_3;
            v0_2 = 4;
            Long v0_4 = v14.isNull(v0_2) ? ((Long)v16) : Long.valueOf(v14.getLong(v0_2));
            int v1_1 = 5;
            v13 = v14.isNull(v1_1) ? ((Long)v16) : Long.valueOf(v14.getLong(v1_1));
            v1_1 = 6;
            if(!v14.isNull(v1_1)) {
                if(v14.getLong(v1_1) == 1) {
                    v9 = true;
                }

                v19 = Boolean.valueOf(v9);
            }
            else {
                v19 = ((Boolean)v16);
            }

            v20 = null;
            v1_2 = v20;
            v2 = arg22;
            v3_1 = arg23;
            v8 = v11;
            v10 = v17_1;
            v12 = v0_4;
            v17 = v14;
            v14_1 = v19;
        }
        catch(Throwable v0) {
        label_92:
            v17 = v14;
            goto label_113;
        }
        catch(SQLiteException v0_1) {
        label_95:
            v17 = v14;
            goto label_102;
        }

        try {
            super(v2, v3_1, v4, v6, v8, v10, v12, v13, v14_1);
            if(v17.moveToNext()) {
                ((zzhi)this).zzgi().zziv().zzg("Got multiple records for event aggregates, expected one. appId", zzfi.zzbp(arg22));
            }

            goto label_86;
        }
        catch(Throwable v0) {
        }
        catch(SQLiteException v0_1) {
            try {
            label_102:
                ((zzhi)this).zzgi().zziv().zzd("Error querying events. appId", zzfi.zzbp(arg22), ((zzhi)this).zzgf().zzbm(v15), v0_1);
                if(v17 != null) {
                    goto label_110;
                }

                return v16;
            }
            catch(Throwable v0) {
                goto label_113;
            }

        label_110:
            v17.close();
            return v16;
        }

    label_113:
        if(v17 != null) {
            v17.close();
        }

        throw v0;
    label_86:
        if(v17 != null) {
            v17.close();
        }

        return v20;
    }

    @WorkerThread public final void zzg(String arg6, String arg7) {
        Preconditions.checkNotEmpty(arg6);
        Preconditions.checkNotEmpty(arg7);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        try {
            ((zzhi)this).zzgi().zzjc().zzg("Deleted user attribute rows", Integer.valueOf(this.getWritableDatabase().delete("user_attributes", "app_id=? and name=?", new String[]{arg6, arg7})));
            return;
        }
        catch(SQLiteException v0) {
            ((zzhi)this).zzgi().zziv().zzd("Error deleting user attribute. appId", zzfi.zzbp(arg6), ((zzhi)this).zzgf().zzbo(arg7), v0);
            return;
        }
    }

    protected final boolean zzgn() {
        return 0;
    }

    @WorkerThread public final zzkc zzh(String arg19, String arg20) {
        zzkc v0_3;
        zzek v11;
        long v5;
        Cursor v10_1;
        int v0_2;
        String v8 = arg20;
        Preconditions.checkNotEmpty(arg19);
        Preconditions.checkNotEmpty(arg20);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        zzkc v9 = null;
        try {
            SQLiteDatabase v10 = this.getWritableDatabase();
            String[] v12 = new String[]{"set_timestamp", "value", "origin"};
            v0_2 = 2;
            String[] v14 = new String[v0_2];
            v14[0] = arg19;
            v14[1] = v8;
            v10_1 = v10.query("user_attributes", v12, "app_id=? and name=?", v14, null, null, null);
        }
        catch(Throwable v0) {
            v10_1 = ((Cursor)v9);
            goto label_74;
        }
        catch(SQLiteException v0_1) {
            v10_1 = ((Cursor)v9);
            goto label_63;
        }

        try {
            if(v10_1.moveToFirst()) {
                goto label_28;
            }
        }
        catch(Throwable v0) {
            goto label_52;
        }
        catch(SQLiteException v0_1) {
            goto label_55;
        }

        if(v10_1 != null) {
            v10_1.close();
        }

        return v9;
        try {
        label_28:
            v5 = v10_1.getLong(0);
            v11 = this;
        }
        catch(Throwable v0) {
        label_52:
            goto label_74;
        }
        catch(SQLiteException v0_1) {
        label_55:
            goto label_63;
        }

        try {
            v0_3 = new zzkc(arg19, v10_1.getString(v0_2), arg20, v5, v11.zza(v10_1, 1));
            if(v10_1.moveToNext()) {
                ((zzhi)this).zzgi().zziv().zzg("Got multiple records for user property, expected one. appId", zzfi.zzbp(arg19));
            }

            goto label_45;
        }
        catch(Throwable v0) {
        }
        catch(SQLiteException v0_1) {
            try {
            label_63:
                ((zzhi)this).zzgi().zziv().zzd("Error querying user property. appId", zzfi.zzbp(arg19), ((zzhi)this).zzgf().zzbo(v8), v0_1);
                if(v10_1 != null) {
                    goto label_71;
                }

                return v9;
            }
            catch(Throwable v0) {
                goto label_74;
            }

        label_71:
            v10_1.close();
            return v9;
        }

    label_74:
        if(v10_1 != null) {
            v10_1.close();
        }

        throw v0;
    label_45:
        if(v10_1 != null) {
            v10_1.close();
        }

        return v0_3;
    }

    @WorkerThread public final String zzhv() {
        String v2_1;
        Throwable v1_1;
        Cursor v0_2;
        SQLiteDatabase v0 = this.getWritableDatabase();
        String[] v1 = null;
        try {
            v0_2 = v0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", v1);
        }
        catch(Throwable v0_1) {
            String[] v5 = v1;
            v1_1 = v0_1;
            v0_2 = ((Cursor)v5);
            goto label_31;
        }
        catch(SQLiteException v2) {
            v0_2 = ((Cursor)v1);
            goto label_23;
        }

        try {
            if(!v0_2.moveToFirst()) {
                goto label_11;
            }

            v2_1 = v0_2.getString(0);
            if(v0_2 == null) {
                return v2_1;
            }

            goto label_9;
        }
        catch(Throwable v1_1) {
        }
        catch(SQLiteException v2) {
            try {
            label_23:
                ((zzhi)this).zzgi().zziv().zzg("Database error getting next bundle app id", v2);
                if(v0_2 != null) {
                    goto label_28;
                }

                goto label_29;
            }
            catch(Throwable v1_1) {
                goto label_31;
            }

        label_28:
            v0_2.close();
        label_29:
            return ((String)v1);
        }

    label_31:
        if(v0_2 != null) {
            v0_2.close();
        }

        throw v1_1;
    label_9:
        v0_2.close();
        return v2_1;
    label_11:
        if(v0_2 != null) {
            v0_2.close();
        }

        return ((String)v1);
    }

    public final boolean zzhw() {
        if(this.zza("select count(1) > 0 from queue where has_realtime = 1", null) != 0) {
            return 1;
        }

        return 0;
    }

    @WorkerThread final void zzhx() {
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        if(!this.zzid()) {
            return;
        }

        long v0 = ((zzhi)this).zzgj().zzalw.get();
        long v2 = ((zzhi)this).zzbt().elapsedRealtime();
        if(Math.abs(v2 - v0) > zzez.zzajc.get().longValue()) {
            ((zzhi)this).zzgj().zzalw.set(v2);
            ((zzhi)this).zzab();
            ((zzjs)this).zzch();
            if(this.zzid()) {
                int v0_1 = this.getWritableDatabase().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(((zzhi)this).zzbt().currentTimeMillis()), String.valueOf(zzeh.zzhq())});
                if(v0_1 > 0) {
                    ((zzhi)this).zzgi().zzjc().zzg("Deleted stale rows. rowsDeleted", Integer.valueOf(v0_1));
                }
            }
        }
    }

    @WorkerThread public final long zzhy() {
        return this.zza("select max(bundle_end_timestamp) from queue", null, 0);
    }

    @WorkerThread public final long zzhz() {
        return this.zza("select max(timestamp) from raw_events", null, 0);
    }

    @WorkerThread public final zzef zzi(String arg30, String arg31) {
        zzef v0_3;
        zzek v10;
        String v16;
        Cursor v9_1;
        int v0_2;
        String v7 = arg31;
        Preconditions.checkNotEmpty(arg30);
        Preconditions.checkNotEmpty(arg31);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        zzef v8 = null;
        try {
            SQLiteDatabase v9 = this.getWritableDatabase();
            String[] v11 = new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"};
            v0_2 = 2;
            String[] v13 = new String[v0_2];
            v13[0] = arg30;
            v13[1] = v7;
            v9_1 = v9.query("conditional_properties", v11, "app_id=? and name=?", v13, null, null, null);
        }
        catch(Throwable v0) {
            v9_1 = ((Cursor)v8);
            goto label_121;
        }
        catch(SQLiteException v0_1) {
            v9_1 = ((Cursor)v8);
            goto label_110;
        }

        try {
            if(v9_1.moveToFirst()) {
                goto label_36;
            }
        }
        catch(Throwable v0) {
            goto label_99;
        }
        catch(SQLiteException v0_1) {
            goto label_102;
        }

        if(v9_1 != null) {
            v9_1.close();
        }

        return v8;
        try {
        label_36:
            v16 = v9_1.getString(0);
            v10 = this;
        }
        catch(Throwable v0) {
        label_99:
            goto label_121;
        }
        catch(SQLiteException v0_1) {
        label_102:
            goto label_110;
        }

        try {
            Object v5 = v10.zza(v9_1, 1);
            boolean v20 = v9_1.getInt(v0_2) != 0 ? true : false;
            v0_3 = new zzef(arg30, v16, new zzka(arg31, v9_1.getLong(8), v5, v16), v9_1.getLong(6), v20, v9_1.getString(3), ((zzjr)this).zzjf().zza(v9_1.getBlob(5), zzex.CREATOR), v9_1.getLong(4), ((zzjr)this).zzjf().zza(v9_1.getBlob(7), zzex.CREATOR), v9_1.getLong(9), ((zzjr)this).zzjf().zza(v9_1.getBlob(10), zzex.CREATOR));
            if(v9_1.moveToNext()) {
                ((zzhi)this).zzgi().zziv().zze("Got multiple records for conditional property, expected one", zzfi.zzbp(arg30), ((zzhi)this).zzgf().zzbo(v7));
            }

            goto label_92;
        }
        catch(Throwable v0) {
        }
        catch(SQLiteException v0_1) {
            try {
            label_110:
                ((zzhi)this).zzgi().zziv().zzd("Error querying conditional property", zzfi.zzbp(arg30), ((zzhi)this).zzgf().zzbo(v7), v0_1);
                if(v9_1 != null) {
                    goto label_118;
                }

                return v8;
            }
            catch(Throwable v0) {
                goto label_121;
            }

        label_118:
            v9_1.close();
            return v8;
        }

    label_121:
        if(v9_1 != null) {
            v9_1.close();
        }

        throw v0;
    label_92:
        if(v9_1 != null) {
            v9_1.close();
        }

        return v0_3;
    }

    public final boolean zzia() {
        if(this.zza("select count(1) > 0 from raw_events", null) != 0) {
            return 1;
        }

        return 0;
    }

    public final boolean zzib() {
        if(this.zza("select count(1) > 0 from raw_events where realtime = 1", null) != 0) {
            return 1;
        }

        return 0;
    }

    public final long zzic() {
        Cursor v2_2;
        long v4;
        Cursor v3_1;
        long v0 = -1;
        String[] v2 = null;
        try {
            v3_1 = this.getWritableDatabase().rawQuery("select rowid from raw_events order by rowid desc limit 1;", v2);
            goto label_5;
        }
        catch(Throwable v0_1) {
        }
        catch(SQLiteException v3) {
            goto label_26;
            try {
            label_5:
                if(v3_1.moveToFirst()) {
                    goto label_11;
                }
            }
            catch(SQLiteException v2_1) {
                goto label_19;
            }
            catch(Throwable v0_1) {
                goto label_16;
            }

            if(v3_1 != null) {
                v3_1.close();
            }

            return v0;
            try {
            label_11:
                v4 = v3_1.getLong(0);
                if(v3_1 == null) {
                    return v4;
                }

                goto label_13;
            }
            catch(Throwable v0_1) {
            label_16:
                v2_2 = v3_1;
            }
            catch(SQLiteException v2_1) {
            label_19:
                Cursor v6 = v3_1;
                v3 = v2_1;
                v2_2 = v6;
                try {
                label_26:
                    ((zzhi)this).zzgi().zziv().zzg("Error querying raw events", v3);
                    if(v2_2 == null) {
                        return v0;
                    }
                }
                catch(Throwable v0_1) {
                    goto label_33;
                }

                v2_2.close();
                return v0;
            }
        }

    label_33:
        if(v2_2 != null) {
            v2_2.close();
        }

        throw v0_1;
    label_13:
        v3_1.close();
        return v4;
    }

    private final boolean zzid() {
        return ((zzhi)this).getContext().getDatabasePath("google_app_measurement.db").exists();
    }

    static String[] zzie() {
        return zzek.zzagl;
    }

    static String[] zzif() {
        return zzek.zzagm;
    }

    static String[] zzig() {
        return zzek.zzagn;
    }

    static String[] zzih() {
        return zzek.zzagp;
    }

    static String[] zzii() {
        return zzek.zzago;
    }

    static String[] zzij() {
        return zzek.zzagq;
    }

    @WorkerThread public final int zzj(String arg7, String arg8) {
        Preconditions.checkNotEmpty(arg7);
        Preconditions.checkNotEmpty(arg8);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        try {
            return this.getWritableDatabase().delete("conditional_properties", "app_id=? and name=?", new String[]{arg7, arg8});
        }
        catch(SQLiteException v1) {
            ((zzhi)this).zzgi().zziv().zzd("Error deleting conditional property", zzfi.zzbp(arg7), ((zzhi)this).zzgf().zzbo(arg8), v1);
            return 0;
        }
    }

    final Map zzk(String arg13, String arg14) {
        Map v0_2;
        Cursor v14;
        ((zzjs)this).zzch();
        ((zzhi)this).zzab();
        Preconditions.checkNotEmpty(arg13);
        Preconditions.checkNotEmpty(arg14);
        ArrayMap v0 = new ArrayMap();
        SQLiteDatabase v1 = this.getWritableDatabase();
        Map v9 = null;
        try {
            v14 = v1.query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{arg13, arg14}, null, null, null);
        }
        catch(Throwable v13) {
            v14 = ((Cursor)v9);
            goto label_72;
        }
        catch(SQLiteException v0_1) {
            v14 = ((Cursor)v9);
            goto label_63;
        }

        try {
            if(v14.moveToFirst()) {
                goto label_29;
            }

            v0_2 = Collections.emptyMap();
            if(v14 != null) {
                goto label_27;
            }

            return v0_2;
        }
        catch(Throwable v13) {
            goto label_72;
        }
        catch(SQLiteException v0_1) {
            goto label_57;
        }

    label_27:
        v14.close();
        return v0_2;
        try {
            do {
            label_29:
                byte[] v1_1 = v14.getBlob(1);
                zzaca v1_2 = zzaca.zza(v1_1, 0, v1_1.length);
                zzkh v2 = new zzkh();
                try {
                    ((zzacj)v2).zzb(v1_2);
                }
                catch(IOException v1_3) {
                    ((zzhi)this).zzgi().zziv().zze("Failed to merge filter. appId", zzfi.zzbp(arg13), v1_3);
                    goto label_51;
                }

                int v1_4 = v14.getInt(0);
                Object v3 = ((Map)v0).get(Integer.valueOf(v1_4));
                if(v3 == null) {
                    ArrayList v3_1 = new ArrayList();
                    ((Map)v0).put(Integer.valueOf(v1_4), v3_1);
                }

                ((List)v3).add(v2);
            label_51:
                if(v14.moveToNext()) {
                    continue;
                }

                break;
            }
            while(true);
        }
        catch(Throwable v13) {
            goto label_72;
        }
        catch(SQLiteException v0_1) {
            goto label_57;
        }

        if(v14 != null) {
            v14.close();
        }

        return ((Map)v0);
    label_57:
        try {
        label_63:
            ((zzhi)this).zzgi().zziv().zze("Database error querying filters. appId", zzfi.zzbp(arg13), v0_1);
            if(v14 != null) {
                goto label_69;
            }

            return v9;
        }
        catch(Throwable v13) {
            goto label_72;
        }

    label_69:
        v14.close();
        return v9;
    label_72:
        if(v14 != null) {
            v14.close();
        }

        throw v13;
    }

    final Map zzl(String arg13, String arg14) {
        Map v0_2;
        Cursor v14;
        ((zzjs)this).zzch();
        ((zzhi)this).zzab();
        Preconditions.checkNotEmpty(arg13);
        Preconditions.checkNotEmpty(arg14);
        ArrayMap v0 = new ArrayMap();
        SQLiteDatabase v1 = this.getWritableDatabase();
        Map v9 = null;
        try {
            v14 = v1.query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{arg13, arg14}, null, null, null);
        }
        catch(Throwable v13) {
            v14 = ((Cursor)v9);
            goto label_72;
        }
        catch(SQLiteException v0_1) {
            v14 = ((Cursor)v9);
            goto label_63;
        }

        try {
            if(v14.moveToFirst()) {
                goto label_29;
            }

            v0_2 = Collections.emptyMap();
            if(v14 != null) {
                goto label_27;
            }

            return v0_2;
        }
        catch(Throwable v13) {
            goto label_72;
        }
        catch(SQLiteException v0_1) {
            goto label_57;
        }

    label_27:
        v14.close();
        return v0_2;
        try {
            do {
            label_29:
                byte[] v1_1 = v14.getBlob(1);
                zzaca v1_2 = zzaca.zza(v1_1, 0, v1_1.length);
                zzkk v2 = new zzkk();
                try {
                    ((zzacj)v2).zzb(v1_2);
                }
                catch(IOException v1_3) {
                    ((zzhi)this).zzgi().zziv().zze("Failed to merge filter", zzfi.zzbp(arg13), v1_3);
                    goto label_51;
                }

                int v1_4 = v14.getInt(0);
                Object v3 = ((Map)v0).get(Integer.valueOf(v1_4));
                if(v3 == null) {
                    ArrayList v3_1 = new ArrayList();
                    ((Map)v0).put(Integer.valueOf(v1_4), v3_1);
                }

                ((List)v3).add(v2);
            label_51:
                if(v14.moveToNext()) {
                    continue;
                }

                break;
            }
            while(true);
        }
        catch(Throwable v13) {
            goto label_72;
        }
        catch(SQLiteException v0_1) {
            goto label_57;
        }

        if(v14 != null) {
            v14.close();
        }

        return ((Map)v0);
    label_57:
        try {
        label_63:
            ((zzhi)this).zzgi().zziv().zze("Database error querying filters. appId", zzfi.zzbp(arg13), v0_1);
            if(v14 != null) {
                goto label_69;
            }

            return v9;
        }
        catch(Throwable v13) {
            goto label_72;
        }

    label_69:
        v14.close();
        return v9;
    label_72:
        if(v14 != null) {
            v14.close();
        }

        throw v13;
    }

    @WorkerThread @VisibleForTesting protected final long zzm(String arg14, String arg15) {
        ContentValues v3_1;
        long v9;
        long v7;
        Preconditions.checkNotEmpty(arg14);
        Preconditions.checkNotEmpty(arg15);
        ((zzhi)this).zzab();
        ((zzjs)this).zzch();
        SQLiteDatabase v0 = this.getWritableDatabase();
        v0.beginTransaction();
        long v1 = 0;
        try {
            StringBuilder v4 = new StringBuilder(String.valueOf(arg15).length() + 0x20);
            v4.append("select ");
            v4.append(arg15);
            v4.append(" from app2 where app_id=?");
            v7 = -1;
            v9 = this.zza(v4.toString(), new String[]{arg14}, v7);
            if(v9 == v7) {
                v3_1 = new ContentValues();
                v3_1.put("app_id", arg14);
                v3_1.put("first_open_count", Integer.valueOf(0));
                v3_1.put("previous_install_count", Integer.valueOf(0));
                if(v0.insertWithOnConflict("app2", null, v3_1, 5) == v7) {
                    ((zzhi)this).zzgi().zziv().zze("Failed to insert column (got -1). appId", zzfi.zzbp(arg14), arg15);
                    goto label_45;
                }
                else {
                    goto label_47;
                }
            }

            goto label_48;
        }
        catch(Throwable v14) {
        }
        catch(SQLiteException v3) {
            v9 = v1;
            goto label_78;
        label_45:
            v0.endTransaction();
            return v7;
        label_47:
            v9 = v1;
            try {
            label_48:
                v3_1 = new ContentValues();
                v3_1.put("app_id", arg14);
                v3_1.put(arg15, Long.valueOf(1 + v9));
                if((((long)v0.update("app2", v3_1, "app_id = ?", new String[]{arg14}))) != v1) {
                    goto label_70;
                }

                ((zzhi)this).zzgi().zziv().zze("Failed to update column (got 0). appId", zzfi.zzbp(arg14), arg15);
            }
            catch(SQLiteException v3) {
                goto label_73;
            }
            catch(Throwable v14) {
                goto label_85;
            }

            v0.endTransaction();
            return v7;
            try {
            label_70:
                v0.setTransactionSuccessful();
            }
            catch(Throwable v14) {
            }
            catch(SQLiteException v3) {
            label_73:
                try {
                label_78:
                    ((zzhi)this).zzgi().zziv().zzd("Error inserting column. appId", zzfi.zzbp(arg14), arg15, v3);
                }
                catch(Throwable v14) {
                label_85:
                    v0.endTransaction();
                    throw v14;
                }
            }
        }

        v0.endTransaction();
        return v9;
    }
}

