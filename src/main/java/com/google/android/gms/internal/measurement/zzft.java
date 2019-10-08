package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.os.Build$VERSION;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.android.gms.ads.identifier.AdvertisingIdClient$Info;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.util.VisibleForTesting;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

final class zzft extends zzhj {
    private SharedPreferences zzabe;
    @VisibleForTesting static final Pair zzalr;
    public zzfx zzals;
    public final zzfw zzalt;
    public final zzfw zzalu;
    public final zzfw zzalv;
    public final zzfw zzalw;
    public final zzfw zzalx;
    public final zzfw zzaly;
    public final zzfw zzalz;
    public final zzfy zzama;
    private String zzamb;
    private boolean zzamc;
    private long zzamd;
    private String zzame;
    private long zzamf;
    private final Object zzamg;
    public final zzfw zzamh;
    public final zzfw zzami;
    public final zzfv zzamj;
    public final zzfw zzamk;
    public final zzfw zzaml;
    public boolean zzamm;

    static {
        zzft.zzalr = new Pair("", Long.valueOf(0));
    }

    zzft(zzgn arg6) {
        super(arg6);
        this.zzalt = new zzfw(this, "last_upload", 0);
        this.zzalu = new zzfw(this, "last_upload_attempt", 0);
        this.zzalv = new zzfw(this, "backoff", 0);
        this.zzalw = new zzfw(this, "last_delete_stale", 0);
        this.zzamh = new zzfw(this, "time_before_start", 10000);
        this.zzami = new zzfw(this, "session_timeout", 1800000);
        this.zzamj = new zzfv(this, "start_new_session", true);
        this.zzamk = new zzfw(this, "last_pause_time", 0);
        this.zzaml = new zzfw(this, "time_active", 0);
        this.zzalx = new zzfw(this, "midnight_offset", 0);
        this.zzaly = new zzfw(this, "first_open_time", 0);
        this.zzalz = new zzfw(this, "app_install_time", 0);
        this.zzama = new zzfy(this, "app_instance_id", null);
        this.zzamg = new Object();
    }

    @WorkerThread final void setMeasurementEnabled(boolean arg4) {
        ((zzhi)this).zzab();
        ((zzhi)this).zzgi().zzjc().zzg("Setting measurementEnabled", Boolean.valueOf(arg4));
        SharedPreferences$Editor v0 = this.zzji().edit();
        v0.putBoolean("measurement_enabled", arg4);
        v0.apply();
    }

    static SharedPreferences zza(zzft arg0) {
        return arg0.zzji();
    }

    @NonNull @WorkerThread final Pair zzbr(String arg5) {
        ((zzhi)this).zzab();
        long v0 = ((zzhi)this).zzbt().elapsedRealtime();
        if(this.zzamb != null && v0 < this.zzamd) {
            return new Pair(this.zzamb, Boolean.valueOf(this.zzamc));
        }

        this.zzamd = v0 + ((zzhi)this).zzgk().zza(arg5, zzez.zzaif);
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(true);
        try {
            Info v5_1 = AdvertisingIdClient.getAdvertisingIdInfo(((zzhi)this).getContext());
            if(v5_1 != null) {
                this.zzamb = v5_1.getId();
                this.zzamc = v5_1.isLimitAdTrackingEnabled();
            }

            if(this.zzamb != null) {
                goto label_39;
            }

            this.zzamb = "";
        }
        catch(Exception v5) {
            ((zzhi)this).zzgi().zzjb().zzg("Unable to get advertising id", v5);
            this.zzamb = "";
        }

    label_39:
        AdvertisingIdClient.setShouldSkipGmsCoreVersionCheck(false);
        return new Pair(this.zzamb, Boolean.valueOf(this.zzamc));
    }

    @WorkerThread final String zzbs(String arg8) {
        ((zzhi)this).zzab();
        Object v8 = this.zzbr(arg8).first;
        MessageDigest v0 = zzkd.getMessageDigest();
        if(v0 == null) {
            return null;
        }

        return String.format(Locale.US, "%032X", new BigInteger(1, v0.digest(((String)v8).getBytes())));
    }

    @WorkerThread final void zzbt(String arg3) {
        ((zzhi)this).zzab();
        SharedPreferences$Editor v0 = this.zzji().edit();
        v0.putString("gmp_app_id", arg3);
        v0.apply();
    }

    final void zzbu(String arg4) {
        Object v0 = this.zzamg;
        __monitor_enter(v0);
        try {
            this.zzame = arg4;
            this.zzamf = ((zzhi)this).zzbt().elapsedRealtime();
            __monitor_exit(v0);
            return;
        label_9:
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            goto label_9;
        }

        throw v4;
    }

    @WorkerThread final void zzf(boolean arg4) {
        ((zzhi)this).zzab();
        ((zzhi)this).zzgi().zzjc().zzg("Setting useService", Boolean.valueOf(arg4));
        SharedPreferences$Editor v0 = this.zzji().edit();
        v0.putBoolean("use_service", arg4);
        v0.apply();
    }

    @WorkerThread final boolean zzg(boolean arg3) {
        ((zzhi)this).zzab();
        return this.zzji().getBoolean("measurement_enabled", arg3);
    }

    protected final boolean zzgn() {
        return 1;
    }

    @WorkerThread protected final void zzgo() {
        this.zzabe = ((zzhi)this).getContext().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.zzamm = this.zzabe.getBoolean("has_been_opened", false);
        if(!this.zzamm) {
            SharedPreferences$Editor v0 = this.zzabe.edit();
            v0.putBoolean("has_been_opened", true);
            v0.apply();
        }

        this.zzals = new zzfx(this, "health_monitor", Math.max(0, zzez.zzaig.get().longValue()), null);
    }

    @WorkerThread final void zzh(boolean arg4) {
        ((zzhi)this).zzab();
        ((zzhi)this).zzgi().zzjc().zzg("Updating deferred analytics collection", Boolean.valueOf(arg4));
        SharedPreferences$Editor v0 = this.zzji().edit();
        v0.putBoolean("deferred_analytics_collection", arg4);
        v0.apply();
    }

    @WorkerThread private final SharedPreferences zzji() {
        ((zzhi)this).zzab();
        ((zzhj)this).zzch();
        return this.zzabe;
    }

    @WorkerThread final String zzjj() {
        ((zzhi)this).zzab();
        return this.zzji().getString("gmp_app_id", null);
    }

    final String zzjk() {
        Object v0 = this.zzamg;
        __monitor_enter(v0);
        try {
            if(Math.abs(((zzhi)this).zzbt().elapsedRealtime() - this.zzamf) < 1000) {
                __monitor_exit(v0);
                return this.zzame;
            }

            __monitor_exit(v0);
            return null;
        label_17:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_17;
        }

        throw v1;
    }

    @WorkerThread final Boolean zzjl() {
        ((zzhi)this).zzab();
        if(!this.zzji().contains("use_service")) {
            return null;
        }

        return Boolean.valueOf(this.zzji().getBoolean("use_service", false));
    }

    @WorkerThread final void zzjm() {
        ((zzhi)this).zzab();
        ((zzhi)this).zzgi().zzjc().log("Clearing collection preferences.");
        boolean v0 = this.zzji().contains("measurement_enabled");
        boolean v1 = true;
        if(v0) {
            v1 = this.zzg(true);
        }

        SharedPreferences$Editor v2 = this.zzji().edit();
        v2.clear();
        v2.apply();
        if(v0) {
            this.setMeasurementEnabled(v1);
        }
    }

    @WorkerThread protected final String zzjn() {
        ((zzhi)this).zzab();
        String v0 = this.zzji().getString("previous_os_version", null);
        ((zzhi)this).zzge().zzch();
        String v1 = Build$VERSION.RELEASE;
        if(!TextUtils.isEmpty(((CharSequence)v1)) && !v1.equals(v0)) {
            SharedPreferences$Editor v2 = this.zzji().edit();
            v2.putString("previous_os_version", v1);
            v2.apply();
        }

        return v0;
    }

    @WorkerThread final boolean zzjo() {
        ((zzhi)this).zzab();
        return this.zzji().getBoolean("deferred_analytics_collection", false);
    }

    @WorkerThread final boolean zzjp() {
        return this.zzabe.contains("deferred_analytics_collection");
    }
}

