package com.google.android.gms.internal.measurement;

import android.net.Uri;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@VisibleForTesting public final class zzez {
    @VisibleForTesting public final class zza {
        private final Object zzaaa;
        private zzwx zzaka;
        private final Object zzakb;
        private volatile Object zzakc;
        private final String zzny;

        private zza(String arg1, Object arg2, Object arg3) {
            super();
            this.zzny = arg1;
            this.zzaaa = arg2;
            this.zzakb = arg3;
        }

        public final Object get() {
            if(zzez.zzahs == null) {
                return this.zzaaa;
            }

            if(zzee.isMainThread()) {
                if(this.zzakc == null) {
                    return this.zzaaa;
                }

                return this.zzakc;
            }

            zza.zzip();
            return this.zzaka.get();
        }

        public final Object get(Object arg1) {
            if(arg1 != null) {
                return arg1;
            }

            if(zzez.zzahs == null) {
                return this.zzaaa;
            }

            if(zzee.isMainThread()) {
                if(this.zzakc == null) {
                    return this.zzaaa;
                }

                return this.zzakc;
            }

            zza.zzip();
            return this.zzaka.get();
        }

        public final String getKey() {
            return this.zzny;
        }

        static zza zza(String arg0, double arg1, double arg3) {
            zza v1 = new zza(arg0, Double.valueOf(-3), Double.valueOf(-3));
            zzez.zzahx.add(v1);
            return v1;
        }

        static zza zzb(String arg1, boolean arg2, boolean arg3) {
            zza v0 = new zza(arg1, Boolean.valueOf(arg2), Boolean.valueOf(arg3));
            zzez.zzahv.add(v0);
            return v0;
        }

        static zza zzb(String arg1, long arg2, long arg4) {
            zza v0 = new zza(arg1, Long.valueOf(arg2), Long.valueOf(arg4));
            zzez.zzahu.add(v0);
            return v0;
        }

        static zza zzc(String arg1, int arg2, int arg3) {
            zza v0 = new zza(arg1, Integer.valueOf(arg2), Integer.valueOf(arg3));
            zzez.zzaht.add(v0);
            return v0;
        }

        static zza zzd(String arg1, String arg2, String arg3) {
            zza v0 = new zza(arg1, arg2, arg3);
            zzez.zzahw.add(v0);
            return v0;
        }

        @WorkerThread private static void zzip() {
            Object v2;
            Class v0 = zza.class;
            __monitor_enter(v0);
            try {
                if(!zzee.isMainThread()) {
                    Iterator v1_1 = zzez.zzahv.iterator();
                    while(v1_1.hasNext()) {
                        v2 = v1_1.next();
                        ((zza)v2).zzakc = ((zza)v2).zzaka.get();
                    }

                    v1_1 = zzez.zzahw.iterator();
                    while(v1_1.hasNext()) {
                        v2 = v1_1.next();
                        ((zza)v2).zzakc = ((zza)v2).zzaka.get();
                    }

                    v1_1 = zzez.zzahu.iterator();
                    while(v1_1.hasNext()) {
                        v2 = v1_1.next();
                        ((zza)v2).zzakc = ((zza)v2).zzaka.get();
                    }

                    v1_1 = zzez.zzaht.iterator();
                    while(v1_1.hasNext()) {
                        v2 = v1_1.next();
                        ((zza)v2).zzakc = ((zza)v2).zzaka.get();
                    }

                    v1_1 = zzez.zzahx.iterator();
                    while(v1_1.hasNext()) {
                        v2 = v1_1.next();
                        ((zza)v2).zzakc = ((zza)v2).zzaka.get();
                    }

                    __monitor_exit(v0);
                    return;
                }

                throw new IllegalStateException("Tried to refresh flag cache on main thread or on package side.");
            label_57:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_57;
            }

            throw v1;
        }

        static void zziq() {
            zza.zzm();
        }

        private static void zzm() {
            Object v2;
            Class v0 = zza.class;
            __monitor_enter(v0);
            try {
                Iterator v1_1 = zzez.zzahv.iterator();
                while(v1_1.hasNext()) {
                    v2 = v1_1.next();
                    ((zza)v2).zzaka = zzez.zzio().zzf(((zza)v2).zzny, ((zza)v2).zzaaa.booleanValue());
                }

                v1_1 = zzez.zzahw.iterator();
                while(v1_1.hasNext()) {
                    v2 = v1_1.next();
                    ((zza)v2).zzaka = zzez.zzio().zzv(((zza)v2).zzny, ((zza)v2).zzaaa);
                }

                v1_1 = zzez.zzahu.iterator();
                while(v1_1.hasNext()) {
                    v2 = v1_1.next();
                    ((zza)v2).zzaka = zzez.zzio().zze(((zza)v2).zzny, ((zza)v2).zzaaa.longValue());
                }

                v1_1 = zzez.zzaht.iterator();
                while(v1_1.hasNext()) {
                    v2 = v1_1.next();
                    ((zza)v2).zzaka = zzez.zzio().zzd(((zza)v2).zzny, ((zza)v2).zzaaa.intValue());
                }

                v1_1 = zzez.zzahx.iterator();
                while(v1_1.hasNext()) {
                    v2 = v1_1.next();
                    ((zza)v2).zzaka = zzez.zzio().zzb(((zza)v2).zzny, ((zza)v2).zzaaa.doubleValue());
                }

                __monitor_exit(v0);
                return;
            label_69:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_69;
            }

            throw v1;
        }
    }

    static zzee zzahs;
    static List zzaht;
    static List zzahu;
    static List zzahv;
    static List zzahw;
    static List zzahx;
    private static final zzxh zzahy;
    private static zza zzahz;
    private static zza zzaia;
    private static zza zzaib;
    public static zza zzaic;
    public static zza zzaid;
    public static zza zzaie;
    public static zza zzaif;
    public static zza zzaig;
    public static zza zzaih;
    public static zza zzaii;
    public static zza zzaij;
    public static zza zzaik;
    public static zza zzail;
    public static zza zzaim;
    public static zza zzain;
    public static zza zzaio;
    public static zza zzaip;
    public static zza zzaiq;
    public static zza zzair;
    public static zza zzais;
    public static zza zzait;
    public static zza zzaiu;
    public static zza zzaiv;
    public static zza zzaiw;
    public static zza zzaix;
    public static zza zzaiy;
    public static zza zzaiz;
    public static zza zzaja;
    public static zza zzajb;
    public static zza zzajc;
    public static zza zzajd;
    public static zza zzaje;
    public static zza zzajf;
    public static zza zzajg;
    public static zza zzajh;
    public static zza zzaji;
    public static zza zzajj;
    public static zza zzajk;
    public static zza zzajl;
    public static zza zzajm;
    public static zza zzajn;
    public static zza zzajo;
    public static zza zzajp;
    public static zza zzajq;
    public static zza zzajr;
    public static zza zzajs;
    public static zza zzajt;
    public static zza zzaju;
    public static zza zzajv;
    public static zza zzajw;
    public static zza zzajx;
    public static zza zzajy;
    private static zza zzajz;

    static {
        zzez.zzaht = new ArrayList();
        zzez.zzahu = new ArrayList();
        zzez.zzahv = new ArrayList();
        zzez.zzahw = new ArrayList();
        zzez.zzahx = new ArrayList();
        String v2 = "content://com.google.android.gms.phenotype/";
        String v1 = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
        v1 = v1.length() != 0 ? v2.concat(v1) : new String(v2);
        zzez.zzahy = new zzxh(Uri.parse(v1));
        zzez.zzahz = zza.zzb("measurement.log_third_party_store_events_enabled", false, false);
        zzez.zzaia = zza.zzb("measurement.log_installs_enabled", false, false);
        zzez.zzaib = zza.zzb("measurement.log_upgrades_enabled", false, false);
        zzez.zzaic = zza.zzb("measurement.log_androidId_enabled", false, false);
        zzez.zzaid = zza.zzb("measurement.upload_dsid_enabled", false, false);
        zzez.zzaie = zza.zzd("measurement.log_tag", "FA", "FA-SVC");
        zzez.zzaif = zza.zzb("measurement.ad_id_cache_time", 10000, 10000);
        zzez.zzaig = zza.zzb("measurement.monitoring.sample_period_millis", 86400000, 86400000);
        zzez.zzaih = zza.zzb("measurement.config.cache_time", 86400000, 3600000);
        zzez.zzaii = zza.zzd("measurement.config.url_scheme", "https", "https");
        zzez.zzaij = zza.zzd("measurement.config.url_authority", "app-measurement.com", "app-measurement.com");
        zzez.zzaik = zza.zzc("measurement.upload.max_bundles", 100, 100);
        zzez.zzail = zza.zzc("measurement.upload.max_batch_size", 0x10000, 0x10000);
        zzez.zzaim = zza.zzc("measurement.upload.max_bundle_size", 0x10000, 0x10000);
        zzez.zzain = zza.zzc("measurement.upload.max_events_per_bundle", 1000, 1000);
        zzez.zzaio = zza.zzc("measurement.upload.max_events_per_day", 100000, 100000);
        zzez.zzaip = zza.zzc("measurement.upload.max_error_events_per_day", 1000, 1000);
        zzez.zzaiq = zza.zzc("measurement.upload.max_public_events_per_day", 50000, 50000);
        zzez.zzair = zza.zzc("measurement.upload.max_conversions_per_day", 500, 500);
        zzez.zzais = zza.zzc("measurement.upload.max_realtime_events_per_day", 10, 10);
        zzez.zzait = zza.zzc("measurement.store.max_stored_events_per_app", 100000, 100000);
        zzez.zzaiu = zza.zzd("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a");
        zzez.zzaiv = zza.zzb("measurement.upload.backoff_period", 43200000, 43200000);
        zzez.zzaiw = zza.zzb("measurement.upload.window_interval", 3600000, 3600000);
        zzez.zzaix = zza.zzb("measurement.upload.interval", 3600000, 3600000);
        zzez.zzaiy = zza.zzb("measurement.upload.realtime_upload_interval", 10000, 10000);
        zzez.zzaiz = zza.zzb("measurement.upload.debug_upload_interval", 1000, 1000);
        zzez.zzaja = zza.zzb("measurement.upload.minimum_delay", 500, 500);
        zzez.zzajb = zza.zzb("measurement.alarm_manager.minimum_interval", 60000, 60000);
        zzez.zzajc = zza.zzb("measurement.upload.stale_data_deletion_interval", 86400000, 86400000);
        zzez.zzajd = zza.zzb("measurement.upload.refresh_blacklisted_config_interval", 604800000, 604800000);
        zzez.zzaje = zza.zzb("measurement.upload.initial_upload_delay_time", 15000, 15000);
        zzez.zzajf = zza.zzb("measurement.upload.retry_time", 1800000, 1800000);
        zzez.zzajg = zza.zzc("measurement.upload.retry_count", 6, 6);
        zzez.zzajh = zza.zzb("measurement.upload.max_queue_time", 2419200000L, 2419200000L);
        zzez.zzaji = zza.zzc("measurement.lifetimevalue.max_currency_tracked", 4, 4);
        zzez.zzajj = zza.zzc("measurement.audience.filter_result_max_count", 200, 200);
        zzez.zzajk = zza.zzb("measurement.service_client.idle_disconnect_millis", 5000, 5000);
        zzez.zzajl = zza.zzb("measurement.test.boolean_flag", false, false);
        zzez.zzajm = zza.zzd("measurement.test.string_flag", "---", "---");
        zzez.zzajn = zza.zzb("measurement.test.long_flag", -1, -1);
        zzez.zzajo = zza.zzc("measurement.test.int_flag", -2, -2);
        zzez.zzajp = zza.zza("measurement.test.double_flag", -3, -3);
        zzez.zzajq = zza.zzb("measurement.lifetimevalue.user_engagement_tracking_enabled", false, false);
        zzez.zzajr = zza.zzb("measurement.audience.complex_param_evaluation", false, false);
        zzez.zzajs = zza.zzb("measurement.validation.internal_limits_internal_event_params", false, false);
        zzez.zzajt = zza.zzb("measurement.quality.unsuccessful_update_retry_counter", false, false);
        zzez.zzaju = zza.zzb("measurement.iid.disable_on_collection_disabled", true, true);
        zzez.zzajv = zza.zzb("measurement.app_launch.call_only_when_enabled", true, true);
        zzez.zzajw = zza.zzb("measurement.run_on_worker_inline", true, false);
        zzez.zzajx = zza.zzb("measurement.audience.dynamic_filters", false, false);
        zzez.zzajy = zza.zzb("measurement.reset_analytics.persist_time", false, false);
        zzez.zzajz = zza.zzb("measurement.validation.value_and_currency_params", false, false);
    }

    static void zza(zzee arg0) {
        zzez.zzahs = arg0;
        zza.zziq();
    }

    static zzxh zzio() {
        return zzez.zzahy;
    }
}

