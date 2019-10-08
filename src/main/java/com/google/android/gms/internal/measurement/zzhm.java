package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty;
import com.google.android.gms.measurement.AppMeasurement$Event;
import com.google.android.gms.measurement.AppMeasurement$EventInterceptor;
import com.google.android.gms.measurement.AppMeasurement$OnEventListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReference;

public final class zzhm extends zzdz {
    @VisibleForTesting protected zzif zzapl;
    private EventInterceptor zzapm;
    private final Set zzapn;
    private boolean zzapo;
    private final AtomicReference zzapp;
    @VisibleForTesting protected boolean zzapq;

    protected zzhm(zzgn arg1) {
        super(arg1);
        this.zzapn = new CopyOnWriteArraySet();
        this.zzapq = true;
        this.zzapp = new AtomicReference();
    }

    public final void clearConditionalUserProperty(String arg2, String arg3, Bundle arg4) {
        ((zzhi)this).zzfv();
        this.zza(null, arg2, arg3, arg4);
    }

    public final void clearConditionalUserPropertyAs(String arg1, String arg2, String arg3, Bundle arg4) {
        Preconditions.checkNotEmpty(arg1);
        ((zzhi)this).zzfu();
        this.zza(arg1, arg2, arg3, arg4);
    }

    public final Task getAppInstanceId() {
        try {
            String v0_1 = ((zzhi)this).zzgj().zzjk();
            if(v0_1 != null) {
                return Tasks.forResult(v0_1);
            }

            return Tasks.call(((zzhi)this).zzgh().zzjv(), new zzhq(this));
        }
        catch(Exception v0) {
            ((zzhi)this).zzgi().zziy().log("Failed to schedule task for getAppInstanceId");
            return Tasks.forException(v0);
        }
    }

    public final List getConditionalUserProperties(String arg2, String arg3) {
        ((zzhi)this).zzfv();
        return this.zzf(null, arg2, arg3);
    }

    public final List getConditionalUserPropertiesAs(String arg1, String arg2, String arg3) {
        Preconditions.checkNotEmpty(arg1);
        ((zzhi)this).zzfu();
        return this.zzf(arg1, arg2, arg3);
    }

    public final Context getContext() {
        return super.getContext();
    }

    public final Map getUserProperties(String arg2, String arg3, boolean arg4) {
        ((zzhi)this).zzfv();
        return this.zzb(null, arg2, arg3, arg4);
    }

    public final Map getUserPropertiesAs(String arg1, String arg2, String arg3, boolean arg4) {
        Preconditions.checkNotEmpty(arg1);
        ((zzhi)this).zzfu();
        return this.zzb(arg1, arg2, arg3, arg4);
    }

    public final void logEvent(String arg10, String arg11, Bundle arg12) {
        ((zzhi)this).zzfv();
        boolean v6 = this.zzapm == null || (zzkd.zzcm(arg11)) ? true : false;
        this.zza(arg10, arg11, arg12, true, v6, false, null);
    }

    public final void logEventNoInterceptor(String arg11, String arg12, Bundle arg13, long arg14) {
        ((zzhi)this).zzfv();
        this.zzb(arg11, arg12, arg14, arg13, false, true, true, null);
    }

    public final void registerOnMeasurementEventListener(OnEventListener arg2) {
        ((zzhi)this).zzfv();
        ((zzdz)this).zzch();
        Preconditions.checkNotNull(arg2);
        if(!this.zzapn.add(arg2)) {
            ((zzhi)this).zzgi().zziy().log("OnEventListener already registered");
        }
    }

    public final void resetAnalyticsData() {
        ((zzhi)this).zzgh().zzc(new zzhs(this, ((zzhi)this).zzbt().currentTimeMillis()));
    }

    public final void setConditionalUserProperty(ConditionalUserProperty arg3) {
        Preconditions.checkNotNull(arg3);
        ((zzhi)this).zzfv();
        ConditionalUserProperty v0 = new ConditionalUserProperty(arg3);
        if(!TextUtils.isEmpty(v0.mAppId)) {
            ((zzhi)this).zzgi().zziy().log("Package name should be null when calling setConditionalUserProperty");
        }

        v0.mAppId = null;
        this.zza(v0);
    }

    public final void setConditionalUserPropertyAs(ConditionalUserProperty arg2) {
        Preconditions.checkNotNull(arg2);
        Preconditions.checkNotEmpty(arg2.mAppId);
        ((zzhi)this).zzfu();
        this.zza(new ConditionalUserProperty(arg2));
    }

    @WorkerThread public final void setEventInterceptor(EventInterceptor arg3) {
        ((zzhi)this).zzab();
        ((zzhi)this).zzfv();
        ((zzdz)this).zzch();
        if(arg3 != null && arg3 != this.zzapm) {
            boolean v0 = this.zzapm == null ? true : false;
            Preconditions.checkState(v0, "EventInterceptor already set.");
        }

        this.zzapm = arg3;
    }

    public final void setMeasurementEnabled(boolean arg3) {
        ((zzdz)this).zzch();
        ((zzhi)this).zzfv();
        ((zzhi)this).zzgh().zzc(new zzib(this, arg3));
    }

    public final void setMinimumSessionDuration(long arg3) {
        ((zzhi)this).zzfv();
        ((zzhi)this).zzgh().zzc(new zzic(this, arg3));
    }

    public final void setSessionTimeoutDuration(long arg3) {
        ((zzhi)this).zzfv();
        ((zzhi)this).zzgh().zzc(new zzid(this, arg3));
    }

    public final void setUserProperty(String arg8, String arg9, Object arg10) {
        Preconditions.checkNotEmpty(arg8);
        long v4 = ((zzhi)this).zzbt().currentTimeMillis();
        int v0 = ((zzhi)this).zzgg().zzcj(arg9);
        int v1 = 0;
        int v3 = 24;
        if(v0 != 0) {
            ((zzhi)this).zzgg();
            arg8 = zzkd.zza(arg9, v3, true);
            if(arg9 != null) {
                v1 = arg9.length();
            }

            this.zzacv.zzgg().zza(v0, "_ev", arg8, v1);
            return;
        }

        if(arg10 != null) {
            v0 = ((zzhi)this).zzgg().zzi(arg9, arg10);
            if(v0 != 0) {
                ((zzhi)this).zzgg();
                arg8 = zzkd.zza(arg9, v3, true);
                if(((arg10 instanceof String)) || ((arg10 instanceof CharSequence))) {
                    v1 = String.valueOf(arg10).length();
                }

                this.zzacv.zzgg().zza(v0, "_ev", arg8, v1);
                return;
            }

            Object v6 = ((zzhi)this).zzgg().zzj(arg9, arg10);
            if(v6 != null) {
                this.zza(arg8, arg9, v4, v6);
            }

            return;
        }

        this.zza(arg8, arg9, v4, null);
    }

    public final void unregisterOnMeasurementEventListener(OnEventListener arg2) {
        ((zzhi)this).zzfv();
        ((zzdz)this).zzch();
        Preconditions.checkNotNull(arg2);
        if(!this.zzapn.remove(arg2)) {
            ((zzhi)this).zzgi().zziy().log("OnEventListener had not been registered");
        }
    }

    static void zza(zzhm arg0, String arg1, String arg2, Object arg3, long arg4) {
        arg0.zza(arg1, arg2, arg3, arg4);
    }

    static void zza(zzhm arg0, ConditionalUserProperty arg1) {
        arg0.zzb(arg1);
    }

    static void zza(zzhm arg0, boolean arg1) {
        arg0.zzi(arg1);
    }

    static void zza(zzhm arg0, String arg1, String arg2, long arg3, Bundle arg5, boolean arg6, boolean arg7, boolean arg8, String arg9) {
        arg0.zza(arg1, arg2, arg3, arg5, arg6, arg7, arg8, arg9);
    }

    @WorkerThread final void zza(String arg12, String arg13, Bundle arg14) {
        ((zzhi)this).zzfv();
        ((zzhi)this).zzab();
        boolean v8 = this.zzapm == null || (zzkd.zzcm(arg13)) ? true : false;
        this.zza(arg12, arg13, ((zzhi)this).zzbt().currentTimeMillis(), arg14, true, v8, false, null);
    }

    public final void zza(String arg9, String arg10, Bundle arg11, boolean arg12) {
        ((zzhi)this).zzfv();
        boolean v5 = this.zzapm == null || (zzkd.zzcm(arg10)) ? true : false;
        this.zza(arg9, arg10, arg11, true, v5, true, null);
    }

    @WorkerThread private final void zza(String arg29, String arg30, long arg31, Bundle arg33, boolean arg34, boolean arg35, boolean arg36, String arg37) {
        String v13_1;
        ArrayList v0_5;
        long v3_1;
        int v20;
        int v18_2;
        Object[] v27;
        zzig v25;
        List v26;
        int v7;
        int v2;
        String v0_3;
        int v11;
        zzhm v1 = this;
        String v8 = arg29;
        String v6 = arg30;
        Bundle v5 = arg33;
        Preconditions.checkNotEmpty(arg29);
        Preconditions.checkNotEmpty(arg30);
        Preconditions.checkNotNull(arg33);
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        if(!v1.zzacv.isEnabled()) {
            ((zzhi)this).zzgi().zzjb().log("Event not sent since app measurement is disabled");
            return;
        }

        Object v4 = null;
        int v16 = 0;
        if(!v1.zzapo) {
            v1.zzapo = true;
            try {
                Class v0 = Class.forName("com.google.android.gms.tagmanager.TagManagerService");
                try {
                    v0.getDeclaredMethod("initialize", Context.class).invoke(v4, ((zzhi)this).getContext());
                }
                catch(Exception v0_1) {
                    try {
                        ((zzhi)this).zzgi().zziy().zzg("Failed to invoke Tag Manager\'s initialize() method", v0_1);
                    }
                    catch(ClassNotFoundException ) {
                    label_41:
                        ((zzhi)this).zzgi().zzja().log("Tag Manager is not found and thus will not be used");
                    }
                }
            }
            catch(ClassNotFoundException ) {
                goto label_41;
            }
        }

        int v0_2 = 40;
        if(arg36) {
            ((zzhi)this).zzgl();
            if(!"_iap".equals(v6)) {
                zzkd v9 = v1.zzacv.zzgg();
                v11 = 2;
                if(!v9.zzq("event", v6)) {
                }
                else if(!v9.zza("event", Event.zzacw, v6)) {
                    v11 = 13;
                }
                else if(!v9.zza("event", v0_2, v6)) {
                }
                else {
                    v11 = 0;
                }

                if(v11 == 0) {
                    goto label_90;
                }

                ((zzhi)this).zzgi().zzix().zzg("Invalid public event name. Event will not be logged (FE)", ((zzhi)this).zzgf().zzbm(v6));
                v1.zzacv.zzgg();
                v0_3 = zzkd.zza(v6, v0_2, true);
                v2 = v6 != null ? arg30.length() : 0;
                v1.zzacv.zzgg().zza(v11, "_ev", v0_3, v2);
                return;
            }
        }

    label_90:
        ((zzhi)this).zzgl();
        zzig v15 = ((zzdy)this).zzgb().zzkn();
        if(v15 != null && !v5.containsKey("_sc")) {
            v15.zzaqc = true;
        }

        boolean v9_1 = !arg34 || !arg36 ? false : true;
        zzih.zza(v15, v5, v9_1);
        boolean v17 = "am".equals(v8);
        v9_1 = zzkd.zzcm(arg30);
        if((arg34) && v1.zzapm != null && !v9_1 && !v17) {
            ((zzhi)this).zzgi().zzjb().zze("Passing event to registered event handler (FE)", ((zzhi)this).zzgf().zzbm(v6), ((zzhi)this).zzgf().zzb(v5));
            v1.zzapm.interceptEvent(arg29, arg30, arg33, arg31);
            return;
        }

        if(!v1.zzacv.zzkg()) {
            return;
        }

        v2 = ((zzhi)this).zzgg().zzch(v6);
        if(v2 != 0) {
            ((zzhi)this).zzgi().zzix().zzg("Invalid event name. Event will not be logged (FE)", ((zzhi)this).zzgf().zzbm(v6));
            ((zzhi)this).zzgg();
            v0_3 = zzkd.zza(v6, v0_2, true);
            if(v6 != null) {
                v16 = arg30.length();
            }

            v1.zzacv.zzgg().zza(arg37, v2, "_ev", v0_3, v16);
            return;
        }

        List v0_4 = CollectionUtils.listOf(new String[]{"_o", "_sn", "_sc", "_si"});
        zzig v18 = v15;
        Bundle v2_1 = ((zzhi)this).zzgg().zza(arg37, arg30, arg33, v0_4, arg36, true);
        v15 = v2_1 == null || !v2_1.containsKey("_sc") || !v2_1.containsKey("_si") ? ((zzig)v4) : new zzig(v2_1.getString("_sn"), v2_1.getString("_sc"), Long.valueOf(v2_1.getLong("_si")).longValue());
        zzig v4_1 = v15 == null ? v18 : v15;
        ArrayList v15_1 = new ArrayList();
        ((List)v15_1).add(v2_1);
        long v13 = ((zzhi)this).zzgg().zzlo().nextLong();
        Object[] v5_1 = v2_1.keySet().toArray(new String[arg33.size()]);
        Arrays.sort(v5_1);
        int v12 = v5_1.length;
        int v10 = 0;
        v11 = 0;
        while(v11 < v12) {
            Object v9_2 = v5_1[v11];
            Object v18_1 = v2_1.get(((String)v9_2));
            ((zzhi)this).zzgg();
            ArrayList v19 = v15_1;
            Bundle[] v15_2 = zzkd.zze(v18_1);
            if(v15_2 != null) {
                v2_1.putInt(((String)v9_2), v15_2.length);
                v7 = 0;
                while(v7 < v15_2.length) {
                    Bundle v3 = v15_2[v7];
                    zzih.zza(v4_1, v3, true);
                    Object v23 = v9_2;
                    Bundle v9_3 = ((zzhi)this).zzgg().zza(arg37, "_ep", v3, v0_4, arg36, false);
                    v9_3.putString("_en", v6);
                    v9_3.putLong("_eid", v13);
                    v9_3.putString("_gn", v23);
                    v9_3.putInt("_ll", v15_2.length);
                    v9_3.putInt("_i", v7);
                    v19.add(v9_3);
                    ++v7;
                    v19 = v19;
                    v13 = v13;
                    v15_2 = v15_2;
                    v9_2 = v23;
                    v11 = v11;
                    v12 = v12;
                    v10 = v10;
                    v4_1 = v4_1;
                    v0_4 = v0_4;
                    v5_1 = v5_1;
                }

                v26 = v0_4;
                v25 = v4_1;
                v27 = v5_1;
                v18_2 = v11;
                v20 = v12;
                v3_1 = v13;
                v0_5 = v19;
                v10 += v15_2.length;
            }
            else {
                v26 = v0_4;
                v25 = v4_1;
                v27 = v5_1;
                v18_2 = v11;
                v20 = v12;
                v3_1 = v13;
                v0_5 = v19;
            }

            v11 = v18_2 + 1;
            v15_1 = v0_5;
            v13 = v3_1;
            v12 = v20;
            v4_1 = v25;
            v0_4 = v26;
            v5_1 = v27;
        }

        v7 = v10;
        v3_1 = v13;
        v0_5 = v15_1;
        if(v7 != 0) {
            v2_1.putLong("_eid", v3_1);
            v2_1.putInt("_epc", v7);
        }

        int v9_4 = 0;
        while(v9_4 < ((List)v0_5).size()) {
            Object v2_2 = ((List)v0_5).get(v9_4);
            int v3_2 = v9_4 != 0 ? 1 : 0;
            String v3_3 = v3_2 != 0 ? "_ep" : v6;
            ((Bundle)v2_2).putString("_o", v8);
            if(arg35) {
                v2_1 = ((zzhi)this).zzgg().zzd(((Bundle)v2_2));
            }

            Object v11_1 = v2_2;
            ((zzhi)this).zzgi().zzjb().zze("Logging event (FE)", ((zzhi)this).zzgf().zzbm(v6), ((zzhi)this).zzgf().zzb(((Bundle)v11_1)));
            v13_1 = v6;
            ((zzdy)this).zzga().zzb(new zzex(v3_3, new zzeu(((Bundle)v11_1)), arg29, arg31), arg37);
            if(!v17) {
                Iterator v12_1 = v1.zzapn.iterator();
                while(v12_1.hasNext()) {
                    v12_1.next().onEvent(arg29, arg30, new Bundle(((Bundle)v11_1)), arg31);
                }
            }

            ++v9_4;
            v6 = v13_1;
        }

        v13_1 = v6;
        ((zzhi)this).zzgl();
        if(((zzdy)this).zzgb().zzkn() != null && ("_ae".equals(v13_1))) {
            ((zzdy)this).zzgd().zzl(true);
        }
    }

    @WorkerThread private final void zza(String arg10, String arg11, Object arg12, long arg13) {
        Preconditions.checkNotEmpty(arg10);
        Preconditions.checkNotEmpty(arg11);
        ((zzhi)this).zzab();
        ((zzhi)this).zzfv();
        ((zzdz)this).zzch();
        if(!this.zzacv.isEnabled()) {
            ((zzhi)this).zzgi().zzjb().log("User property not set since app measurement is disabled");
            return;
        }

        if(!this.zzacv.zzkg()) {
            return;
        }

        ((zzhi)this).zzgi().zzjb().zze("Setting user property (FE)", ((zzhi)this).zzgf().zzbm(arg11), arg12);
        ((zzdy)this).zzga().zzb(new zzka(arg11, arg13, arg12, arg10));
    }

    private final void zza(ConditionalUserProperty arg9) {
        long v0 = ((zzhi)this).zzbt().currentTimeMillis();
        Preconditions.checkNotNull(arg9);
        Preconditions.checkNotEmpty(arg9.mName);
        Preconditions.checkNotEmpty(arg9.mOrigin);
        Preconditions.checkNotNull(arg9.mValue);
        arg9.mCreationTimestamp = v0;
        String v0_1 = arg9.mName;
        Object v1 = arg9.mValue;
        if(((zzhi)this).zzgg().zzcj(v0_1) != 0) {
            ((zzhi)this).zzgi().zziv().zzg("Invalid conditional user property name", ((zzhi)this).zzgf().zzbo(v0_1));
            return;
        }

        if(((zzhi)this).zzgg().zzi(v0_1, v1) != 0) {
            ((zzhi)this).zzgi().zziv().zze("Invalid conditional user property value", ((zzhi)this).zzgf().zzbo(v0_1), v1);
            return;
        }

        Object v2 = ((zzhi)this).zzgg().zzj(v0_1, v1);
        if(v2 == null) {
            ((zzhi)this).zzgi().zziv().zze("Unable to normalize conditional user property value", ((zzhi)this).zzgf().zzbo(v0_1), v1);
            return;
        }

        arg9.mValue = v2;
        long v1_1 = arg9.mTriggerTimeout;
        long v4 = 1;
        long v6 = 15552000000L;
        if(!TextUtils.isEmpty(arg9.mTriggerEventName) && (v1_1 > v6 || v1_1 < v4)) {
            ((zzhi)this).zzgi().zziv().zze("Invalid conditional user property timeout", ((zzhi)this).zzgf().zzbo(v0_1), Long.valueOf(v1_1));
            return;
        }

        v1_1 = arg9.mTimeToLive;
        if(v1_1 <= v6) {
            if(v1_1 < v4) {
            }
            else {
                ((zzhi)this).zzgh().zzc(new zzht(this, arg9));
                return;
            }
        }

        ((zzhi)this).zzgi().zziv().zze("Invalid conditional user property time to live", ((zzhi)this).zzgf().zzbo(v0_1), Long.valueOf(v1_1));
    }

    private final void zza(String arg10, String arg11, long arg12, Object arg14) {
        ((zzhi)this).zzgh().zzc(new zzho(this, arg10, arg11, arg14, arg12));
    }

    private final void zza(String arg12, String arg13, Bundle arg14, boolean arg15, boolean arg16, boolean arg17, String arg18) {
        this.zzb(arg12, arg13, ((zzhi)this).zzbt().currentTimeMillis(), arg14, arg15, arg16, arg17, arg18);
    }

    private final void zza(String arg4, String arg5, String arg6, Bundle arg7) {
        long v0 = ((zzhi)this).zzbt().currentTimeMillis();
        Preconditions.checkNotEmpty(arg5);
        ConditionalUserProperty v2 = new ConditionalUserProperty();
        v2.mAppId = arg4;
        v2.mName = arg5;
        v2.mCreationTimestamp = v0;
        if(arg6 != null) {
            v2.mExpiredEventName = arg6;
            v2.mExpiredEventParams = arg7;
        }

        ((zzhi)this).zzgh().zzc(new zzhu(this, v2));
    }

    public final void zzab() {
        super.zzab();
    }

    @Nullable final String zzaj(long arg4) {
        AtomicReference v0 = new AtomicReference();
        __monitor_enter(v0);
        try {
            ((zzhi)this).zzgh().zzc(new zzhr(this, v0));
            try {
                v0.wait(arg4);
                goto label_8;
            }
            catch(InterruptedException ) {
                try {
                    ((zzhi)this).zzgi().zziy().log("Interrupted waiting for app instance id");
                    __monitor_exit(v0);
                    return null;
                label_8:
                    __monitor_exit(v0);
                    goto label_9;
                label_19:
                    __monitor_exit(v0);
                }
                catch(Throwable v4) {
                    goto label_19;
                }
            }
        }
        catch(Throwable v4) {
            goto label_19;
        }

        throw v4;
    label_9:
        return v0.get();
    }

    static void zzb(zzhm arg0, ConditionalUserProperty arg1) {
        arg0.zzc(arg1);
    }

    @WorkerThread private final void zzb(ConditionalUserProperty arg26) {
        zzex v17;
        zzex v11;
        zzex v14;
        ConditionalUserProperty v0 = arg26;
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        Preconditions.checkNotNull(arg26);
        Preconditions.checkNotEmpty(v0.mName);
        Preconditions.checkNotEmpty(v0.mOrigin);
        Preconditions.checkNotNull(v0.mValue);
        if(!this.zzacv.isEnabled()) {
            ((zzhi)this).zzgi().zzjb().log("Conditional property not sent since Firebase Analytics is disabled");
            return;
        }

        zzka v2 = new zzka(v0.mName, v0.mTriggeredTimestamp, v0.mValue, v0.mOrigin);
        try {
            v14 = ((zzhi)this).zzgg().zza(v0.mAppId, v0.mTriggeredEventName, v0.mTriggeredEventParams, v0.mOrigin, 0, true, false);
            v11 = ((zzhi)this).zzgg().zza(v0.mAppId, v0.mTimedOutEventName, v0.mTimedOutEventParams, v0.mOrigin, 0, true, false);
            v17 = ((zzhi)this).zzgg().zza(v0.mAppId, v0.mExpiredEventName, v0.mExpiredEventParams, v0.mOrigin, 0, true, false);
        }
        catch(IllegalArgumentException ) {
            return;
        }

        ((zzdy)this).zzga().zzd(new zzef(v0.mAppId, v0.mOrigin, v2, v0.mCreationTimestamp, false, v0.mTriggerEventName, v11, v0.mTriggerTimeout, v14, v0.mTimeToLive, v17));
    }

    private final void zzb(String arg17, String arg18, long arg19, Bundle arg21, boolean arg22, boolean arg23, boolean arg24, String arg25) {
        int v4;
        Object v3;
        Object v2;
        Bundle v11;
        Bundle v0 = arg21;
        if(v0 == null) {
            v11 = new Bundle();
        }
        else {
            Bundle v1 = new Bundle(v0);
            Iterator v0_1 = v1.keySet().iterator();
            do {
            label_10:
                if(v0_1.hasNext()) {
                    v2 = v0_1.next();
                    v3 = v1.get(((String)v2));
                    if((v3 instanceof Bundle)) {
                        v1.putBundle(((String)v2), new Bundle(((Bundle)v3)));
                        continue;
                    }
                    else {
                        v4 = 0;
                        if(!(v3 instanceof Parcelable[])) {
                            if(!(v3 instanceof ArrayList)) {
                                continue;
                            }

                            goto label_36;
                        }

                        goto label_23;
                    }
                }
                else {
                    break;
                }

                goto label_47;
            }
            while(true);

            v11 = v1;
            goto label_47;
            while(true) {
            label_36:
                if(v4 >= ((ArrayList)v3).size()) {
                    goto label_10;
                }

                v2 = ((ArrayList)v3).get(v4);
                if((v2 instanceof Bundle)) {
                    ((ArrayList)v3).set(v4, new Bundle(((Bundle)v2)));
                }

                ++v4;
            }

            while(true) {
            label_23:
                if(v4 >= v3.length) {
                    goto label_10;
                }

                if((v3[v4] instanceof Bundle)) {
                    v3[v4] = new Bundle(v3[v4]);
                }

                ++v4;
            }
        }

    label_47:
        ((zzhi)this).zzgh().zzc(new zzie(this, arg17, arg18, arg19, v11, arg22, arg23, arg24, arg25));
    }

    @VisibleForTesting private final Map zzb(String arg11, String arg12, String arg13, boolean arg14) {
        zzfk v11;
        if(((zzhi)this).zzgh().zzju()) {
            v11 = ((zzhi)this).zzgi().zziv();
            arg12 = "Cannot get user properties from analytics worker thread";
            goto label_6;
        }

        if(zzee.isMainThread()) {
            v11 = ((zzhi)this).zzgi().zziv();
            arg12 = "Cannot get user properties from main thread";
            goto label_6;
        }

        AtomicReference v7 = new AtomicReference();
        __monitor_enter(v7);
        try {
            this.zzacv.zzgh().zzc(new zzhw(this, v7, arg11, arg12, arg13, arg14));
            long v11_2 = 5000;
            try {
                v7.wait(v11_2);
                goto label_39;
            }
            catch(InterruptedException v11_3) {
                try {
                    ((zzhi)this).zzgi().zziy().zzg("Interrupted waiting for get user properties", v11_3);
                label_39:
                    __monitor_exit(v7);
                }
                catch(Throwable v11_1) {
                    try {
                    label_59:
                        __monitor_exit(v7);
                    }
                    catch(Throwable v11_1) {
                        goto label_59;
                    }

                    throw v11_1;
                }
            }
        }
        catch(Throwable v11_1) {
            goto label_59;
        }

        Object v11_4 = v7.get();
        if(v11_4 == null) {
            v11 = ((zzhi)this).zzgi().zziy();
            arg12 = "Timed out waiting for get user properties";
        label_6:
            v11.log(arg12);
            return Collections.emptyMap();
        }

        ArrayMap v12 = new ArrayMap(((List)v11_4).size());
        Iterator v11_5 = ((List)v11_4).iterator();
        while(v11_5.hasNext()) {
            Object v13 = v11_5.next();
            ((Map)v12).put(((zzka)v13).name, ((zzka)v13).getValue());
        }

        return ((Map)v12);
    }

    public final Clock zzbt() {
        return super.zzbt();
    }

    final void zzbu(@Nullable String arg2) {
        this.zzapp.set(arg2);
    }

    @WorkerThread private final void zzc(ConditionalUserProperty arg23) {
        zzex v17;
        ConditionalUserProperty v0 = arg23;
        ((zzhi)this).zzab();
        ((zzdz)this).zzch();
        Preconditions.checkNotNull(arg23);
        Preconditions.checkNotEmpty(v0.mName);
        if(!this.zzacv.isEnabled()) {
            ((zzhi)this).zzgi().zzjb().log("Conditional property not cleared since Firebase Analytics is disabled");
            return;
        }

        zzka v2 = new zzka(v0.mName, 0, null, null);
        try {
            v17 = ((zzhi)this).zzgg().zza(v0.mAppId, v0.mExpiredEventName, v0.mExpiredEventParams, v0.mOrigin, v0.mCreationTimestamp, true, false);
        }
        catch(IllegalArgumentException ) {
            return;
        }

        ((zzdy)this).zzga().zzd(new zzef(v0.mAppId, v0.mOrigin, v2, v0.mCreationTimestamp, v0.mActive, v0.mTriggerEventName, null, v0.mTriggerTimeout, null, v0.mTimeToLive, v17));
    }

    @VisibleForTesting private final List zzf(String arg10, String arg11, String arg12) {
        zzfk v10;
        if(((zzhi)this).zzgh().zzju()) {
            v10 = ((zzhi)this).zzgi().zziv();
            arg11 = "Cannot get conditional user properties from analytics worker thread";
        }
        else if(zzee.isMainThread()) {
            v10 = ((zzhi)this).zzgi().zziv();
            arg11 = "Cannot get conditional user properties from main thread";
        }
        else {
            goto label_15;
        }

        v10.log(arg11);
        goto label_7;
    label_15:
        AtomicReference v6 = new AtomicReference();
        __monitor_enter(v6);
        try {
            this.zzacv.zzgh().zzc(new zzhv(this, v6, arg10, arg11, arg12));
            long v11 = 5000;
            try {
                v6.wait(v11);
                goto label_38;
            }
            catch(InterruptedException v11_1) {
                try {
                    ((zzhi)this).zzgi().zziy().zze("Interrupted waiting for get conditional user properties", arg10, v11_1);
                label_38:
                    __monitor_exit(v6);
                }
                catch(Throwable v10_1) {
                    try {
                    label_118:
                        __monitor_exit(v6);
                    }
                    catch(Throwable v10_1) {
                        goto label_118;
                    }

                    throw v10_1;
                }
            }
        }
        catch(Throwable v10_1) {
            goto label_118;
        }

        Object v11_2 = v6.get();
        if(v11_2 == null) {
            ((zzhi)this).zzgi().zziy().zzg("Timed out waiting for get conditional user properties", arg10);
        label_7:
            return Collections.emptyList();
        }

        ArrayList v10_2 = new ArrayList(((List)v11_2).size());
        Iterator v11_3 = ((List)v11_2).iterator();
        while(v11_3.hasNext()) {
            Object v12 = v11_3.next();
            ConditionalUserProperty v0 = new ConditionalUserProperty();
            v0.mAppId = ((zzef)v12).packageName;
            v0.mOrigin = ((zzef)v12).origin;
            v0.mCreationTimestamp = ((zzef)v12).creationTimestamp;
            v0.mName = ((zzef)v12).zzage.name;
            v0.mValue = ((zzef)v12).zzage.getValue();
            v0.mActive = ((zzef)v12).active;
            v0.mTriggerEventName = ((zzef)v12).triggerEventName;
            if(((zzef)v12).zzagf != null) {
                v0.mTimedOutEventName = ((zzef)v12).zzagf.name;
                if(((zzef)v12).zzagf.zzahg != null) {
                    v0.mTimedOutEventParams = ((zzef)v12).zzagf.zzahg.zzin();
                }
            }

            v0.mTriggerTimeout = ((zzef)v12).triggerTimeout;
            if(((zzef)v12).zzagg != null) {
                v0.mTriggeredEventName = ((zzef)v12).zzagg.name;
                if(((zzef)v12).zzagg.zzahg != null) {
                    v0.mTriggeredEventParams = ((zzef)v12).zzagg.zzahg.zzin();
                }
            }

            v0.mTriggeredTimestamp = ((zzef)v12).zzage.zzast;
            v0.mTimeToLive = ((zzef)v12).timeToLive;
            if(((zzef)v12).zzagh != null) {
                v0.mExpiredEventName = ((zzef)v12).zzagh.name;
                if(((zzef)v12).zzagh.zzahg != null) {
                    v0.mExpiredEventParams = ((zzef)v12).zzagh.zzahg.zzin();
                }
            }

            ((List)v10_2).add(v0);
        }

        return ((List)v10_2);
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

    @WorkerThread private final void zzi(boolean arg4) {
        ((zzhi)this).zzab();
        ((zzhi)this).zzfv();
        ((zzdz)this).zzch();
        ((zzhi)this).zzgi().zzjb().zzg("Setting app measurement enabled (FE)", Boolean.valueOf(arg4));
        ((zzhi)this).zzgj().setMeasurementEnabled(arg4);
        if(((zzhi)this).zzgk().zzbc(((zzdy)this).zzfz().zzah())) {
            if((this.zzacv.isEnabled()) && (this.zzapq)) {
                ((zzhi)this).zzgi().zzjb().log("Recording app launch after enabling measurement for the first time (FE)");
                this.zzkm();
                return;
            }

            ((zzdy)this).zzga().zzkp();
            return;
        }

        ((zzdy)this).zzga().zzkp();
    }

    public final List zzj(boolean arg4) {
        String v0;
        zzfk v4;
        ((zzhi)this).zzfv();
        ((zzdz)this).zzch();
        ((zzhi)this).zzgi().zzjb().log("Fetching user attributes (FE)");
        if(((zzhi)this).zzgh().zzju()) {
            v4 = ((zzhi)this).zzgi().zziv();
            v0 = "Cannot get all user properties from analytics worker thread";
            goto label_12;
        }

        if(zzee.isMainThread()) {
            v4 = ((zzhi)this).zzgi().zziv();
            v0 = "Cannot get all user properties from main thread";
            goto label_12;
        }

        AtomicReference v0_1 = new AtomicReference();
        __monitor_enter(v0_1);
        try {
            this.zzacv.zzgh().zzc(new zzhp(this, v0_1, arg4));
            long v1 = 5000;
            try {
                v0_1.wait(v1);
                goto label_37;
            }
            catch(InterruptedException v4_2) {
                try {
                    ((zzhi)this).zzgi().zziy().zzg("Interrupted waiting for get user properties", v4_2);
                label_37:
                    __monitor_exit(v0_1);
                }
                catch(Throwable v4_1) {
                    try {
                    label_46:
                        __monitor_exit(v0_1);
                    }
                    catch(Throwable v4_1) {
                        goto label_46;
                    }

                    throw v4_1;
                }
            }
        }
        catch(Throwable v4_1) {
            goto label_46;
        }

        Object v4_3 = v0_1.get();
        if(v4_3 == null) {
            v4 = ((zzhi)this).zzgi().zziy();
            v0 = "Timed out waiting for get user properties";
        label_12:
            v4.log(v0);
            return Collections.emptyList();
        }

        return ((List)v4_3);
    }

    @Nullable public final String zzjk() {
        ((zzhi)this).zzfv();
        return this.zzapp.get();
    }

    public final Boolean zzkh() {
        AtomicReference v1 = new AtomicReference();
        return ((zzhi)this).zzgh().zza(v1, 15000, "boolean test flag value", new zzhn(this, v1));
    }

    public final String zzki() {
        AtomicReference v1 = new AtomicReference();
        return ((zzhi)this).zzgh().zza(v1, 15000, "String test flag value", new zzhx(this, v1));
    }

    public final Long zzkj() {
        AtomicReference v1 = new AtomicReference();
        return ((zzhi)this).zzgh().zza(v1, 15000, "long test flag value", new zzhy(this, v1));
    }

    public final Integer zzkk() {
        AtomicReference v1 = new AtomicReference();
        return ((zzhi)this).zzgh().zza(v1, 15000, "int test flag value", new zzhz(this, v1));
    }

    public final Double zzkl() {
        AtomicReference v1 = new AtomicReference();
        return ((zzhi)this).zzgh().zza(v1, 15000, "double test flag value", new zzia(this, v1));
    }

    @WorkerThread public final void zzkm() {
        ((zzhi)this).zzab();
        ((zzhi)this).zzfv();
        ((zzdz)this).zzch();
        if(!this.zzacv.zzkg()) {
            return;
        }

        ((zzdy)this).zzga().zzkm();
        this.zzapq = false;
        String v0 = ((zzhi)this).zzgj().zzjn();
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            ((zzhi)this).zzge().zzch();
            if(!v0.equals(Build$VERSION.RELEASE)) {
                Bundle v1 = new Bundle();
                v1.putString("_po", v0);
                this.logEvent("auto", "_ou", v1);
            }
        }
    }
}

