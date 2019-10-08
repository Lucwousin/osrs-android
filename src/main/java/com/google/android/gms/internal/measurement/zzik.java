package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting public final class zzik extends zzdz {
    private final zziy zzaqo;
    private zzfa zzaqp;
    private volatile Boolean zzaqq;
    private final zzep zzaqr;
    private final zzjo zzaqs;
    private final List zzaqt;
    private final zzep zzaqu;

    protected zzik(zzgn arg3) {
        super(arg3);
        this.zzaqt = new ArrayList();
        this.zzaqs = new zzjo(arg3.zzbt());
        this.zzaqo = new zziy(this);
        this.zzaqr = new zzil(this, ((zzhk)arg3));
        this.zzaqu = new zziq(this, ((zzhk)arg3));
    }

    @WorkerThread public final void disconnect() {
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        try {
            ConnectionTracker.getInstance().unbindService(((zzhi)this).getContext(), this.zzaqo);
            goto label_6;
        }
        catch(IllegalArgumentException ) {
        label_6:
            this.zzaqp = null;
            return;
        }
    }

    public final Context getContext() {
        return super.getContext();
    }

    @WorkerThread public final boolean isConnected() {
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        if(this.zzaqp != null) {
            return 1;
        }

        return 0;
    }

    @WorkerThread private final void onServiceDisconnected(ComponentName arg3) {
        ((zzhi)this).zzab();
        if(this.zzaqp != null) {
            this.zzaqp = null;
            ((zzhi)this).zzgi().zzjc().zzg("Disconnected from device MeasurementService", arg3);
            ((zzhi)this).zzab();
            this.zzdf();
        }
    }

    @WorkerThread protected final void resetAnalyticsData() {
        ((zzhi)this).zzab();
        ((zzhi)this).zzfv();
        ((zzdz)this).zzch();
        zzeb v0 = this.zzk(false);
        if(this.zzkq()) {
            ((zzdy)this).zzgc().resetAnalyticsData();
        }

        this.zzf(new zzim(this, v0));
    }

    @WorkerThread protected final void zza(AtomicReference arg3, boolean arg4) {
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        this.zzf(new zzix(this, arg3, this.zzk(false), arg4));
    }

    @WorkerThread public final void zza(AtomicReference arg3) {
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        this.zzf(new zzin(this, arg3, this.zzk(false)));
    }

    @WorkerThread protected final void zza(AtomicReference arg9, String arg10, String arg11, String arg12) {
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        this.zzf(new zziu(this, arg9, arg10, arg11, arg12, this.zzk(false)));
    }

    @WorkerThread protected final void zza(AtomicReference arg10, String arg11, String arg12, String arg13, boolean arg14) {
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        this.zzf(new zziv(this, arg10, arg11, arg12, arg13, arg14, this.zzk(false)));
    }

    @WorkerThread @VisibleForTesting final void zza(zzfa arg12, AbstractSafeParcelable arg13, zzeb arg14) {
        String v10;
        zzfk v9;
        int v5_1;
        ((zzhi)this).zzab();
        ((zzhi)this).zzfv();
        ((zzdz)this).zzch();
        boolean v0 = this.zzkq();
        int v2 = 100;
        int v3 = 0;
        int v4;
        for(v4 = 100; v3 < 1001; v4 = v5_1) {
            if(v4 != v2) {
                return;
            }

            ArrayList v4_1 = new ArrayList();
            if(v0) {
                List v5 = ((zzdy)this).zzgc().zzp(v2);
                if(v5 != null) {
                    ((List)v4_1).addAll(((Collection)v5));
                    v5_1 = v5.size();
                }
                else {
                    goto label_20;
                }
            }
            else {
            label_20:
                v5_1 = 0;
            }

            if(arg13 != null && v5_1 < v2) {
                ((List)v4_1).add(arg13);
            }

            int v6 = v4_1.size();
            int v7 = 0;
            while(v7 < v6) {
                Object v8 = v4_1.get(v7);
                ++v7;
                if((v8 instanceof zzex)) {
                    try {
                        arg12.zza(((zzex)v8), arg14);
                        continue;
                    }
                    catch(RemoteException v8_1) {
                        v9 = ((zzhi)this).zzgi().zziv();
                        v10 = "Failed to send event to the service";
                        goto label_37;
                    }
                }

                if((v8 instanceof zzka)) {
                    try {
                        arg12.zza(((zzka)v8), arg14);
                        continue;
                    }
                    catch(RemoteException v8_1) {
                        v9 = ((zzhi)this).zzgi().zziv();
                        v10 = "Failed to send attribute to the service";
                        goto label_37;
                    }
                }

                if((v8 instanceof zzef)) {
                    try {
                        arg12.zza(((zzef)v8), arg14);
                        continue;
                    }
                    catch(RemoteException v8_1) {
                        v9 = ((zzhi)this).zzgi().zziv();
                        v10 = "Failed to send conditional property to the service";
                    }

                label_37:
                    v9.zzg(v10, v8_1);
                    continue;
                }

                ((zzhi)this).zzgi().zziv().log("Discarding data. Unrecognized parcel type.");
            }

            ++v3;
        }
    }

    @WorkerThread @VisibleForTesting protected final void zza(zzfa arg1) {
        ((zzhi)this).zzab();
        Preconditions.checkNotNull(arg1);
        this.zzaqp = arg1;
        this.zzcu();
        this.zzks();
    }

    static void zza(zzik arg0, ComponentName arg1) {
        arg0.onServiceDisconnected(arg1);
    }

    static zzfa zza(zzik arg0, zzfa arg1) {
        arg0.zzaqp = null;
        return null;
    }

    static zziy zza(zzik arg0) {
        return arg0.zzaqo;
    }

    public final void zzab() {
        super.zzab();
    }

    @WorkerThread protected final void zzb(zzig arg2) {
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        this.zzf(new zzip(this, arg2));
    }

    static void zzb(zzik arg0) {
        arg0.zzks();
    }

    @WorkerThread protected final void zzb(zzex arg9, String arg10) {
        Preconditions.checkNotNull(arg9);
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        boolean v2 = this.zzkq();
        boolean v3 = !v2 || !((zzdy)this).zzgc().zza(arg9) ? false : true;
        this.zzf(new zzis(this, v2, v3, arg9, this.zzk(true), arg10));
    }

    @WorkerThread protected final void zzb(zzka arg4) {
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        boolean v0 = !this.zzkq() || !((zzdy)this).zzgc().zza(arg4) ? false : true;
        this.zzf(new zziw(this, v0, arg4, this.zzk(true)));
    }

    public final Clock zzbt() {
        return super.zzbt();
    }

    static void zzc(zzik arg0) {
        arg0.zzcv();
    }

    @WorkerThread private final void zzcu() {
        ((zzhi)this).zzab();
        this.zzaqs.start();
        this.zzaqr.zzh(zzez.zzajk.get().longValue());
    }

    @WorkerThread private final void zzcv() {
        ((zzhi)this).zzab();
        if(!this.isConnected()) {
            return;
        }

        ((zzhi)this).zzgi().zzjc().log("Inactivity, disconnecting from the service");
        this.disconnect();
    }

    static zzfa zzd(zzik arg0) {
        return arg0.zzaqp;
    }

    @WorkerThread protected final void zzd(zzef arg10) {
        Preconditions.checkNotNull(arg10);
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        ((zzhi)this).zzgl();
        boolean v5 = ((zzdy)this).zzgc().zzc(arg10) ? true : false;
        this.zzf(new zzit(this, true, v5, new zzef(arg10), this.zzk(true), arg10));
    }

    @WorkerThread final void zzdf() {
        boolean v0_1;
        int v3_1;
        String v3;
        zzfk v0_3;
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        if(this.isConnected()) {
            return;
        }

        int v1 = 0;
        if(this.zzaqq == null) {
            ((zzhi)this).zzab();
            ((zzdz)this).zzch();
            Boolean v0 = ((zzhi)this).zzgj().zzjl();
            if(v0 == null || !v0.booleanValue()) {
                ((zzhi)this).zzgl();
                if(((zzdy)this).zzfz().zzit() != 1) {
                    ((zzhi)this).zzgi().zzjc().log("Checking service availability");
                    int v0_2 = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(((zzhi)this).zzgg().getContext(), 12451000);
                    if(v0_2 != 9) {
                        if(v0_2 != 18) {
                            switch(v0_2) {
                                case 0: {
                                    goto label_74;
                                }
                                case 1: {
                                    goto label_68;
                                }
                                case 2: {
                                    goto label_52;
                                }
                                case 3: {
                                    goto label_47;
                                }
                            }

                            ((zzhi)this).zzgi().zziy().zzg("Unexpected service status", Integer.valueOf(v0_2));
                            goto label_44;
                        label_68:
                            ((zzhi)this).zzgi().zzjc().log("Service missing");
                            goto label_72;
                        label_52:
                            ((zzhi)this).zzgi().zzjb().log("Service container out of date");
                            if(((zzhi)this).zzgg().zzlp() < 12600) {
                            label_72:
                                v0_1 = false;
                                goto label_23;
                            }
                            else {
                                v0 = ((zzhi)this).zzgj().zzjl();
                                if(v0 != null && !v0.booleanValue()) {
                                    goto label_44;
                                }

                                v0_1 = true;
                                goto label_45;
                            label_74:
                                v0_3 = ((zzhi)this).zzgi().zzjc();
                                v3 = "Service available";
                                goto label_77;
                            label_47:
                                v0_3 = ((zzhi)this).zzgi().zziy();
                                v3 = "Service disabled";
                                goto label_50;
                            }
                        }
                        else {
                            v0_3 = ((zzhi)this).zzgi().zziy();
                            v3 = "Service updating";
                        }

                    label_77:
                        v0_3.log(v3);
                        goto label_22;
                    }
                    else {
                        goto label_83;
                    }
                }
                else {
                label_22:
                    v0_1 = true;
                label_23:
                    v3_1 = 1;
                    goto label_87;
                label_83:
                    v0_3 = ((zzhi)this).zzgi().zziy();
                    v3 = "Service invalid";
                label_50:
                    v0_3.log(v3);
                label_44:
                    v0_1 = false;
                label_45:
                    v3_1 = 0;
                }

            label_87:
                if(!v0_1 && (((zzhi)this).zzgk().zzhu())) {
                    ((zzhi)this).zzgi().zziv().log("No way to upload. Consider using the full version of Analytics");
                    v3_1 = 0;
                }

                if(v3_1 == 0) {
                    goto label_99;
                }

                ((zzhi)this).zzgj().zzf(v0_1);
            }
            else {
                v0_1 = true;
            }

        label_99:
            this.zzaqq = Boolean.valueOf(v0_1);
        }

        if(this.zzaqq.booleanValue()) {
            this.zzaqo.zzkt();
            return;
        }

        if(!((zzhi)this).zzgk().zzhu()) {
            ((zzhi)this).zzgl();
            List v0_4 = ((zzhi)this).getContext().getPackageManager().queryIntentServices(new Intent().setClassName(((zzhi)this).getContext(), "com.google.android.gms.measurement.AppMeasurementService"), 0x10000);
            if(v0_4 != null && v0_4.size() > 0) {
                v1 = 1;
            }

            if(v1 != 0) {
                Intent v0_5 = new Intent("com.google.android.gms.measurement.START");
                Context v2 = ((zzhi)this).getContext();
                ((zzhi)this).zzgl();
                v0_5.setComponent(new ComponentName(v2, "com.google.android.gms.measurement.AppMeasurementService"));
                this.zzaqo.zzc(v0_5);
                return;
            }

            ((zzhi)this).zzgi().zziv().log("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
        }
    }

    static void zze(zzik arg0) {
        arg0.zzcu();
    }

    @WorkerThread private final void zzf(Runnable arg5) throws IllegalStateException {
        ((zzhi)this).zzab();
        if(this.isConnected()) {
            arg5.run();
            return;
        }

        if((((long)this.zzaqt.size())) >= 1000) {
            ((zzhi)this).zzgi().zziv().log("Discarding data. Max runnable queue size reached");
            return;
        }

        this.zzaqt.add(arg5);
        this.zzaqu.zzh(60000);
        this.zzdf();
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

    @Nullable @WorkerThread private final zzeb zzk(boolean arg2) {
        ((zzhi)this).zzgl();
        zzfd v0 = ((zzdy)this).zzfz();
        String v2 = arg2 ? ((zzhi)this).zzgi().zzje() : null;
        return v0.zzbl(v2);
    }

    @WorkerThread protected final void zzkm() {
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        this.zzf(new zzio(this, this.zzk(true)));
    }

    @WorkerThread protected final void zzkp() {
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        this.zzf(new zzir(this, this.zzk(true)));
    }

    private final boolean zzkq() {
        ((zzhi)this).zzgl();
        return 1;
    }

    final Boolean zzkr() {
        return this.zzaqq;
    }

    @WorkerThread private final void zzks() {
        ((zzhi)this).zzab();
        ((zzhi)this).zzgi().zzjc().zzg("Processing queued up service tasks", Integer.valueOf(this.zzaqt.size()));
        Iterator v0 = this.zzaqt.iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            try {
                ((Runnable)v1).run();
            }
            catch(Exception v1_1) {
                ((zzhi)this).zzgi().zziv().zzg("Task exception while flushing queue", v1_1);
            }
        }

        this.zzaqt.clear();
        this.zzaqu.cancel();
    }
}

