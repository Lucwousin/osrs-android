package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;

public final class zzih extends zzdz {
    @VisibleForTesting protected zzig zzaqd;
    private volatile zzig zzaqe;
    private zzig zzaqf;
    private final Map zzaqg;
    private zzig zzaqh;
    private String zzaqi;

    public zzih(zzgn arg1) {
        super(arg1);
        this.zzaqg = new ArrayMap();
    }

    public final Context getContext() {
        return super.getContext();
    }

    @MainThread public final void onActivityCreated(Activity arg6, Bundle arg7) {
        if(arg7 == null) {
            return;
        }

        arg7 = arg7.getBundle("com.google.firebase.analytics.screen_service");
        if(arg7 == null) {
            return;
        }

        this.zzaqg.put(arg6, new zzig(arg7.getString("name"), arg7.getString("referrer_name"), arg7.getLong("id")));
    }

    @MainThread public final void onActivityDestroyed(Activity arg2) {
        this.zzaqg.remove(arg2);
    }

    @MainThread public final void onActivityPaused(Activity arg3) {
        zzig v3 = this.zze(arg3);
        this.zzaqf = this.zzaqe;
        this.zzaqe = null;
        ((zzhi)this).zzgh().zzc(new zzij(this, v3));
    }

    @MainThread public final void onActivityResumed(Activity arg5) {
        this.zza(arg5, this.zze(arg5), false);
        zzdu v5 = ((zzdy)this).zzfx();
        ((zzhi)v5).zzgh().zzc(new zzdx(v5, ((zzhi)v5).zzbt().elapsedRealtime()));
    }

    @MainThread public final void onActivitySaveInstanceState(Activity arg5, Bundle arg6) {
        if(arg6 == null) {
            return;
        }

        Object v5 = this.zzaqg.get(arg5);
        if(v5 == null) {
            return;
        }

        Bundle v0 = new Bundle();
        v0.putLong("id", ((zzig)v5).zzaqb);
        v0.putString("name", ((zzig)v5).zzuk);
        v0.putString("referrer_name", ((zzig)v5).zzaqa);
        arg6.putBundle("com.google.firebase.analytics.screen_service", v0);
    }

    @MainThread public final void setCurrentScreen(@NonNull Activity arg4, @Nullable @Size(max=36, min=1) String arg5, @Nullable @Size(max=36, min=1) String arg6) {
        if(!zzee.isMainThread()) {
            ((zzhi)this).zzgi().zziy().log("setCurrentScreen must be called from the main thread");
            return;
        }

        if(this.zzaqe == null) {
            ((zzhi)this).zzgi().zziy().log("setCurrentScreen cannot be called while no activity active");
            return;
        }

        if(this.zzaqg.get(arg4) == null) {
            ((zzhi)this).zzgi().zziy().log("setCurrentScreen must be called with an activity in the activity lifecycle");
            return;
        }

        if(arg6 == null) {
            arg6 = zzih.zzcd(arg4.getClass().getCanonicalName());
        }

        boolean v0 = this.zzaqe.zzaqa.equals(arg6);
        boolean v1 = zzkd.zzs(this.zzaqe.zzuk, arg5);
        if((v0) && (v1)) {
            ((zzhi)this).zzgi().zziz().log("setCurrentScreen cannot be called with the same class and name");
            return;
        }

        int v0_1 = 100;
        if(arg5 != null && (arg5.length() <= 0 || arg5.length() > v0_1)) {
            ((zzhi)this).zzgi().zziy().zzg("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(arg5.length()));
            return;
        }

        if(arg6 != null && (arg6.length() <= 0 || arg6.length() > v0_1)) {
            ((zzhi)this).zzgi().zziy().zzg("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(arg6.length()));
            return;
        }

        zzfk v0_2 = ((zzhi)this).zzgi().zzjc();
        String v1_1 = "Setting current screen to name, class";
        String v2 = arg5 == null ? "null" : arg5;
        v0_2.zze(v1_1, v2, arg6);
        zzig v0_3 = new zzig(arg5, arg6, ((zzhi)this).zzgg().zzln());
        this.zzaqg.put(arg4, v0_3);
        this.zza(arg4, v0_3, true);
    }

    @WorkerThread public final void zza(String arg2, zzig arg3) {
        ((zzhi)this).zzab();
        __monitor_enter(this);
        try {
            if(this.zzaqi == null || (this.zzaqi.equals(arg2)) || arg3 != null) {
                this.zzaqi = arg2;
                this.zzaqh = arg3;
            }

            __monitor_exit(this);
            return;
        label_13:
            __monitor_exit(this);
        }
        catch(Throwable v2) {
            goto label_13;
        }

        throw v2;
    }

    static void zza(zzih arg0, zzig arg1) {
        arg0.zza(arg1);
    }

    public static void zza(zzig arg2, Bundle arg3, boolean arg4) {
        if(arg3 != null && arg2 != null && (!arg3.containsKey("_sc") || (arg4))) {
            if(arg2.zzuk != null) {
                arg3.putString("_sn", arg2.zzuk);
            }
            else {
                arg3.remove("_sn");
            }

            arg3.putString("_sc", arg2.zzaqa);
            arg3.putLong("_si", arg2.zzaqb);
            return;
        }

        if(arg3 != null && arg2 == null && (arg4)) {
            arg3.remove("_sn");
            arg3.remove("_sc");
            arg3.remove("_si");
        }
    }

    @MainThread private final void zza(Activity arg6, zzig arg7, boolean arg8) {
        zzig v0 = this.zzaqe == null ? this.zzaqf : this.zzaqe;
        if(arg7.zzaqa == null) {
            arg7 = new zzig(arg7.zzuk, zzih.zzcd(arg6.getClass().getCanonicalName()), arg7.zzaqb);
        }

        this.zzaqf = this.zzaqe;
        this.zzaqe = arg7;
        ((zzhi)this).zzgh().zzc(new zzii(this, arg8, v0, arg7));
    }

    @WorkerThread private final void zza(@NonNull zzig arg4) {
        ((zzdy)this).zzfx().zzp(((zzhi)this).zzbt().elapsedRealtime());
        if(((zzdy)this).zzgd().zzl(arg4.zzaqc)) {
            arg4.zzaqc = false;
        }
    }

    public final void zzab() {
        super.zzab();
    }

    public final Clock zzbt() {
        return super.zzbt();
    }

    @VisibleForTesting private static String zzcd(String arg2) {
        String[] v2 = arg2.split("\\.");
        arg2 = v2.length > 0 ? v2[v2.length - 1] : "";
        int v1 = 100;
        if(arg2.length() > v1) {
            arg2 = arg2.substring(0, v1);
        }

        return arg2;
    }

    @MainThread private final zzig zze(@NonNull Activity arg6) {
        zzig v0_1;
        Preconditions.checkNotNull(arg6);
        Object v0 = this.zzaqg.get(arg6);
        if(v0 == null) {
            zzig v1 = new zzig(null, zzih.zzcd(arg6.getClass().getCanonicalName()), ((zzhi)this).zzgg().zzln());
            this.zzaqg.put(arg6, v1);
            v0_1 = v1;
        }

        return v0_1;
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

    public final zzdu zzfx() {
        return super.zzfx();
    }

    public final zzhm zzfy() {
        return super.zzfy();
    }

    public final zzfd zzfz() {
        return super.zzfz();
    }

    public final zzik zzga() {
        return super.zzga();
    }

    public final zzih zzgb() {
        return super.zzgb();
    }

    public final zzfe zzgc() {
        return super.zzgc();
    }

    public final zzjj zzgd() {
        return super.zzgd();
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

    @WorkerThread public final zzig zzkn() {
        ((zzdz)this).zzch();
        ((zzhi)this).zzab();
        return this.zzaqd;
    }

    public final zzig zzko() {
        ((zzhi)this).zzfv();
        return this.zzaqe;
    }
}

