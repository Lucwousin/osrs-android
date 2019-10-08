package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.concurrent.atomic.AtomicReference;

public class zzgn implements zzhk {
    private final Clock clock;
    private final long zzaga;
    private final zzee zzahs;
    private static volatile zzgn zzaoc;
    private final String zzaod;
    private final zzeh zzaoe;
    private final zzft zzaof;
    private final zzfi zzaog;
    private final zzgi zzaoh;
    private final zzjj zzaoi;
    private final AppMeasurement zzaoj;
    private final FirebaseAnalytics zzaok;
    private final zzkd zzaol;
    private final zzfg zzaom;
    private final zzih zzaon;
    private final zzhm zzaoo;
    private final zzdu zzaop;
    private zzfe zzaoq;
    private zzik zzaor;
    private zzer zzaos;
    private zzfd zzaot;
    private zzfz zzaou;
    private Boolean zzaov;
    private long zzaow;
    private int zzaox;
    private int zzaoy;
    private final Context zzqx;
    private boolean zzvn;

    private zzgn(zzhl arg5) {
        String v1_1;
        zzfk v0_8;
        super();
        this.zzvn = false;
        Preconditions.checkNotNull(arg5);
        this.zzahs = new zzee(arg5.zzqx);
        zzez.zza(this.zzahs);
        this.zzqx = arg5.zzqx;
        this.zzaod = arg5.zzaod;
        zzwx.init(this.zzqx);
        this.clock = DefaultClock.getInstance();
        this.zzaga = this.clock.currentTimeMillis();
        this.zzaoe = new zzeh(this);
        zzft v0 = new zzft(this);
        ((zzhj)v0).zzm();
        this.zzaof = v0;
        zzfi v0_1 = new zzfi(this);
        ((zzhj)v0_1).zzm();
        this.zzaog = v0_1;
        zzkd v0_2 = new zzkd(this);
        ((zzhj)v0_2).zzm();
        this.zzaol = v0_2;
        zzfg v0_3 = new zzfg(this);
        ((zzhj)v0_3).zzm();
        this.zzaom = v0_3;
        this.zzaop = new zzdu(this);
        zzih v0_4 = new zzih(this);
        ((zzdz)v0_4).zzm();
        this.zzaon = v0_4;
        zzhm v0_5 = new zzhm(this);
        ((zzdz)v0_5).zzm();
        this.zzaoo = v0_5;
        this.zzaoj = new AppMeasurement(this);
        this.zzaok = new FirebaseAnalytics(this);
        zzjj v0_6 = new zzjj(this);
        ((zzdz)v0_6).zzm();
        this.zzaoi = v0_6;
        zzgi v0_7 = new zzgi(this);
        ((zzhj)v0_7).zzm();
        this.zzaoh = v0_7;
        if((this.zzqx.getApplicationContext() instanceof Application)) {
            v0_5 = this.zzfy();
            if((((zzhi)v0_5).getContext().getApplicationContext() instanceof Application)) {
                Context v1 = ((zzhi)v0_5).getContext().getApplicationContext();
                if(v0_5.zzapl == null) {
                    v0_5.zzapl = new zzif(v0_5, null);
                }

                ((Application)v1).unregisterActivityLifecycleCallbacks(v0_5.zzapl);
                ((Application)v1).registerActivityLifecycleCallbacks(v0_5.zzapl);
                v0_8 = ((zzhi)v0_5).zzgi().zzjc();
                v1_1 = "Registered activity lifecycle callback";
                goto label_94;
            }
        }
        else {
            v0_8 = this.zzgi().zziy();
            v1_1 = "Application context is not an Application";
        label_94:
            v0_8.log(v1_1);
        }

        this.zzaoh.zzc(new zzgo(this, arg5));
    }

    public final Context getContext() {
        return this.zzqx;
    }

    @WorkerThread public final boolean isEnabled() {
        this.zzgh().zzab();
        this.zzch();
        boolean v1 = false;
        if(this.zzaoe.zzho()) {
            return 0;
        }

        Boolean v0 = this.zzaoe.zzhp();
        if(v0 != null) {
            v1 = v0.booleanValue();
        }
        else if(!GoogleServices.isMeasurementExplicitlyDisabled()) {
            v1 = true;
        }

        return this.zzgj().zzg(v1);
    }

    @WorkerThread protected final void start() {
        this.zzgh().zzab();
        long v2 = 0;
        if(this.zzgj().zzalt.get() == v2) {
            this.zzgj().zzalt.set(this.clock.currentTimeMillis());
        }

        if(Long.valueOf(this.zzgj().zzaly.get()).longValue() == v2) {
            this.zzgi().zzjc().zzg("Persisting first open", Long.valueOf(this.zzaga));
            this.zzgj().zzaly.set(this.zzaga);
        }

        if(this.zzkg()) {
            if(!TextUtils.isEmpty(this.zzfz().getGmpAppId())) {
                String v0 = this.zzgj().zzjj();
                if(v0 == null) {
                    this.zzgj().zzbt(this.zzfz().getGmpAppId());
                }
                else if(!v0.equals(this.zzfz().getGmpAppId())) {
                    this.zzgi().zzja().log("Rechecking which service to use due to a GMP App Id change");
                    this.zzgj().zzjm();
                    this.zzaor.disconnect();
                    this.zzaor.zzdf();
                    this.zzgj().zzbt(this.zzfz().getGmpAppId());
                    this.zzgj().zzaly.set(this.zzaga);
                    this.zzgj().zzama.zzbv(null);
                }
            }

            this.zzfy().zzbu(this.zzgj().zzama.zzjq());
            if(TextUtils.isEmpty(this.zzfz().getGmpAppId())) {
                return;
            }

            boolean v0_1 = this.isEnabled();
            if(!this.zzgj().zzjp() && !this.zzaoe.zzho()) {
                this.zzgj().zzh((((int)v0_1)) ^ 1);
            }

            if(!this.zzaoe.zzbc(this.zzfz().zzah()) || (v0_1)) {
                this.zzfy().zzkm();
            }

            this.zzga().zza(new AtomicReference());
        }
        else if(this.isEnabled()) {
            if(!this.zzgg().zzx("android.permission.INTERNET")) {
                this.zzgi().zziv().log("App is missing INTERNET permission");
            }

            if(!this.zzgg().zzx("android.permission.ACCESS_NETWORK_STATE")) {
                this.zzgi().zziv().log("App is missing ACCESS_NETWORK_STATE permission");
            }

            if(!Wrappers.packageManager(this.zzqx).isCallerInstantApp() && !this.zzaoe.zzhu()) {
                if(!zzgd.zza(this.zzqx)) {
                    this.zzgi().zziv().log("AppMeasurementReceiver not registered/enabled");
                }

                if(zzkd.zza(this.zzqx, false)) {
                    goto label_71;
                }

                this.zzgi().zziv().log("AppMeasurementService not registered/enabled");
            }

        label_71:
            this.zzgi().zziv().log("Uploading is not possible. App measurement disabled");
            return;
        }
    }

    public static zzgn zza(Context arg1, String arg2, String arg3) {
        Preconditions.checkNotNull(arg1);
        Preconditions.checkNotNull(arg1.getApplicationContext());
        if(zzgn.zzaoc == null) {
            Class v2 = zzgn.class;
            __monitor_enter(v2);
            try {
                if(zzgn.zzaoc == null) {
                    zzgn.zzaoc = new zzgn(new zzhl(arg1, null));
                }

                __monitor_exit(v2);
                goto label_20;
            label_18:
                __monitor_exit(v2);
            }
            catch(Throwable v1) {
                goto label_18;
            }

            throw v1;
        }

    label_20:
        return zzgn.zzaoc;
    }

    static void zza(zzgn arg0, zzhl arg1) {
        arg0.zza(arg1);
    }

    private static void zza(zzdz arg3) {
        if(arg3 != null) {
            if(arg3.isInitialized()) {
                return;
            }

            String v3 = String.valueOf(arg3.getClass());
            StringBuilder v2 = new StringBuilder(String.valueOf(v3).length() + 27);
            v2.append("Component not initialized: ");
            v2.append(v3);
            throw new IllegalStateException(v2.toString());
        }

        throw new IllegalStateException("Component not created");
    }

    @WorkerThread private final void zza(zzhl arg6) {
        zzfk v0_2;
        this.zzgh().zzab();
        zzeh.zzhn();
        zzer v6 = new zzer(this);
        ((zzhj)v6).zzm();
        this.zzaos = v6;
        zzfd v6_1 = new zzfd(this);
        ((zzdz)v6_1).zzm();
        this.zzaot = v6_1;
        zzfe v0 = new zzfe(this);
        ((zzdz)v0).zzm();
        this.zzaoq = v0;
        zzik v0_1 = new zzik(this);
        ((zzdz)v0_1).zzm();
        this.zzaor = v0_1;
        this.zzaol.zzgm();
        this.zzaof.zzgm();
        this.zzaou = new zzfz(this);
        this.zzaot.zzgm();
        this.zzgi().zzja().zzg("App measurement is starting up, version", Long.valueOf(this.zzaoe.zzgw()));
        this.zzgi().zzja().log("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String v6_2 = v6_1.zzah();
        if(this.zzgg().zzcn(v6_2)) {
            v0_2 = this.zzgi().zzja();
            v6_2 = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
        }
        else {
            v0_2 = this.zzgi().zzja();
            String v1 = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
            v6_2 = String.valueOf(v6_2);
            v6_2 = v6_2.length() != 0 ? v1.concat(v6_2) : new String(v1);
        }

        v0_2.log(v6_2);
        this.zzgi().zzjb().log("Debug-level message logging enabled");
        if(this.zzaox != this.zzaoy) {
            this.zzgi().zziv().zze("Not all components initialized", Integer.valueOf(this.zzaox), Integer.valueOf(this.zzaoy));
        }

        this.zzvn = true;
    }

    private static void zza(zzhi arg1) {
        if(arg1 != null) {
            return;
        }

        throw new IllegalStateException("Component not created");
    }

    private static void zza(zzhj arg3) {
        if(arg3 != null) {
            if(arg3.isInitialized()) {
                return;
            }

            String v3 = String.valueOf(arg3.getClass());
            StringBuilder v2 = new StringBuilder(String.valueOf(v3).length() + 27);
            v2.append("Component not initialized: ");
            v2.append(v3);
            throw new IllegalStateException(v2.toString());
        }

        throw new IllegalStateException("Component not created");
    }

    final void zzb(zzdz arg1) {
        ++this.zzaox;
    }

    final void zzb(zzhj arg1) {
        ++this.zzaox;
    }

    public final Clock zzbt() {
        return this.clock;
    }

    private final void zzch() {
        if(this.zzvn) {
            return;
        }

        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    final void zzfu() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void zzfv() {
    }

    public final zzdu zzfx() {
        if(this.zzaop != null) {
            return this.zzaop;
        }

        throw new IllegalStateException("Component not created");
    }

    public final zzhm zzfy() {
        zzgn.zza(this.zzaoo);
        return this.zzaoo;
    }

    public final zzfd zzfz() {
        zzgn.zza(this.zzaot);
        return this.zzaot;
    }

    public final zzik zzga() {
        zzgn.zza(this.zzaor);
        return this.zzaor;
    }

    public final zzih zzgb() {
        zzgn.zza(this.zzaon);
        return this.zzaon;
    }

    public final zzfe zzgc() {
        zzgn.zza(this.zzaoq);
        return this.zzaoq;
    }

    public final zzjj zzgd() {
        zzgn.zza(this.zzaoi);
        return this.zzaoi;
    }

    public final zzer zzge() {
        zzgn.zza(this.zzaos);
        return this.zzaos;
    }

    public final zzfg zzgf() {
        zzgn.zza(this.zzaom);
        return this.zzaom;
    }

    public final zzkd zzgg() {
        zzgn.zza(this.zzaol);
        return this.zzaol;
    }

    public final zzgi zzgh() {
        zzgn.zza(this.zzaoh);
        return this.zzaoh;
    }

    public final zzfi zzgi() {
        zzgn.zza(this.zzaog);
        return this.zzaog;
    }

    public final zzft zzgj() {
        zzgn.zza(this.zzaof);
        return this.zzaof;
    }

    public final zzeh zzgk() {
        return this.zzaoe;
    }

    public final zzee zzgl() {
        return this.zzahs;
    }

    public final zzfi zzjy() {
        if(this.zzaog != null && (this.zzaog.isInitialized())) {
            return this.zzaog;
        }

        return null;
    }

    public final zzfz zzjz() {
        return this.zzaou;
    }

    final zzgi zzka() {
        return this.zzaoh;
    }

    public final AppMeasurement zzkb() {
        return this.zzaoj;
    }

    public final FirebaseAnalytics zzkc() {
        return this.zzaok;
    }

    public final String zzkd() {
        return this.zzaod;
    }

    final long zzke() {
        Long v0 = Long.valueOf(this.zzgj().zzaly.get());
        if(v0.longValue() == 0) {
            return this.zzaga;
        }

        return Math.min(this.zzaga, v0.longValue());
    }

    final void zzkf() {
        ++this.zzaoy;
    }

    @WorkerThread protected final boolean zzkg() {
        this.zzch();
        this.zzgh().zzab();
        if(this.zzaov == null || this.zzaow == 0 || this.zzaov != null && !this.zzaov.booleanValue() && Math.abs(this.clock.elapsedRealtime() - this.zzaow) > 1000) {
            this.zzaow = this.clock.elapsedRealtime();
            boolean v1 = false;
            if((this.zzgg().zzx("android.permission.INTERNET")) && (this.zzgg().zzx("android.permission.ACCESS_NETWORK_STATE"))) {
                if(!Wrappers.packageManager(this.zzqx).isCallerInstantApp() && !this.zzaoe.zzhu()) {
                    if(!zzgd.zza(this.zzqx)) {
                    }
                    else if(zzkd.zza(this.zzqx, false)) {
                        goto label_46;
                    }

                    goto label_47;
                }

            label_46:
                v1 = true;
            }

        label_47:
            this.zzaov = Boolean.valueOf(v1);
            if(!this.zzaov.booleanValue()) {
                goto label_58;
            }

            this.zzaov = Boolean.valueOf(this.zzgg().zzck(this.zzfz().getGmpAppId()));
        }

    label_58:
        return this.zzaov.booleanValue();
    }
}

