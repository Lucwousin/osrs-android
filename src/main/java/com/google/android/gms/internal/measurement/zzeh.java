package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.InvocationTargetException;

public final class zzeh extends zzhi {
    private Boolean zzagi;
    @NonNull private zzej zzagj;
    private Boolean zzxy;

    zzeh(zzgn arg1) {
        super(arg1);
        this.zzagj = zzei.zzagk;
    }

    public final Context getContext() {
        return super.getContext();
    }

    @WorkerThread public final long zza(String arg3, @NonNull zza arg4) {
        if(arg3 != null) {
            arg3 = this.zzagj.zze(arg3, arg4.getKey());
            if(TextUtils.isEmpty(((CharSequence)arg3))) {
            }
            else {
                try {
                    return arg4.get(Long.valueOf(Long.parseLong(arg3))).longValue();
                }
                catch(NumberFormatException ) {
                label_1:
                    return arg4.get().longValue();
                }
            }
        }

        goto label_1;
    }

    final void zza(@NonNull zzej arg1) {
        this.zzagj = arg1;
    }

    public final void zzab() {
        super.zzab();
    }

    @WorkerThread public final int zzas(@Size(min=1) String arg2) {
        return this.zzb(arg2, zzez.zzais);
    }

    @Nullable @VisibleForTesting final Boolean zzat(@Size(min=1) String arg5) {
        Preconditions.checkNotEmpty(arg5);
        Boolean v0 = null;
        try {
            if(((zzhi)this).getContext().getPackageManager() == null) {
                ((zzhi)this).zzgi().zziv().log("Failed to load metadata: PackageManager is null");
                return v0;
            }

            ApplicationInfo v1 = Wrappers.packageManager(((zzhi)this).getContext()).getApplicationInfo(((zzhi)this).getContext().getPackageName(), 0x80);
            if(v1 == null) {
                ((zzhi)this).zzgi().zziv().log("Failed to load metadata: ApplicationInfo is null");
                return v0;
            }

            if(v1.metaData == null) {
                ((zzhi)this).zzgi().zziv().log("Failed to load metadata: Metadata bundle is null");
                return v0;
            }

            if(!v1.metaData.containsKey(arg5)) {
                return v0;
            }

            return Boolean.valueOf(v1.metaData.getBoolean(arg5));
        }
        catch(PackageManager$NameNotFoundException v5) {
            ((zzhi)this).zzgi().zziv().zzg("Failed to load metadata: Package name not found", v5);
            return v0;
        }
    }

    public final boolean zzau(String arg4) {
        return "1".equals(this.zzagj.zze(arg4, "gaia_collection_enabled"));
    }

    public final boolean zzav(String arg4) {
        return "1".equals(this.zzagj.zze(arg4, "measurement.event_sampling_enabled"));
    }

    @WorkerThread final boolean zzaw(String arg2) {
        return this.zzd(arg2, zzez.zzajq);
    }

    @WorkerThread final boolean zzax(String arg2) {
        return this.zzd(arg2, zzez.zzajs);
    }

    @WorkerThread final boolean zzay(String arg2) {
        return this.zzd(arg2, zzez.zzajt);
    }

    @WorkerThread final boolean zzaz(String arg2) {
        return this.zzd(arg2, zzez.zzajl);
    }

    @WorkerThread public final int zzb(String arg3, @NonNull zza arg4) {
        if(arg3 != null) {
            arg3 = this.zzagj.zze(arg3, arg4.getKey());
            if(TextUtils.isEmpty(((CharSequence)arg3))) {
            }
            else {
                try {
                    return arg4.get(Integer.valueOf(Integer.parseInt(arg3))).intValue();
                }
                catch(NumberFormatException ) {
                label_1:
                    return arg4.get().intValue();
                }
            }
        }

        goto label_1;
    }

    @WorkerThread final String zzba(String arg4) {
        zza v0 = zzez.zzajm;
        Object v4 = arg4 == null ? v0.get() : v0.get(this.zzagj.zze(arg4, v0.getKey()));
        return ((String)v4);
    }

    final boolean zzbb(String arg2) {
        return this.zzd(arg2, zzez.zzaju);
    }

    @WorkerThread final boolean zzbc(String arg2) {
        return this.zzd(arg2, zzez.zzajv);
    }

    @WorkerThread final boolean zzbd(String arg2) {
        return this.zzd(arg2, zzez.zzajy);
    }

    public final Clock zzbt() {
        return super.zzbt();
    }

    @WorkerThread public final double zzc(String arg3, @NonNull zza arg4) {
        if(arg3 != null) {
            arg3 = this.zzagj.zze(arg3, arg4.getKey());
            if(TextUtils.isEmpty(((CharSequence)arg3))) {
            }
            else {
                try {
                    return arg4.get(Double.valueOf(Double.parseDouble(arg3))).doubleValue();
                }
                catch(NumberFormatException ) {
                label_1:
                    return arg4.get().doubleValue();
                }
            }
        }

        goto label_1;
    }

    @WorkerThread public final boolean zzd(String arg3, @NonNull zza arg4) {
        Object v3;
        if(arg3 != null) {
            arg3 = this.zzagj.zze(arg3, arg4.getKey());
            if(TextUtils.isEmpty(((CharSequence)arg3))) {
                goto label_1;
            }
            else {
                goto label_10;
            }
        }
        else {
        label_1:
            v3 = arg4.get();
            goto label_2;
        label_10:
            v3 = arg4.get(Boolean.valueOf(Boolean.parseBoolean(arg3)));
        }

    label_2:
        return ((Boolean)v3).booleanValue();
    }

    public final boolean zzds() {
        if(this.zzxy == null) {
            __monitor_enter(this);
            try {
                if(this.zzxy == null) {
                    ApplicationInfo v0_1 = ((zzhi)this).getContext().getApplicationInfo();
                    String v1 = ProcessUtils.getMyProcessName();
                    if(v0_1 != null) {
                        String v0_2 = v0_1.processName;
                        boolean v0_3 = v0_2 == null || !v0_2.equals(v1) ? false : true;
                        this.zzxy = Boolean.valueOf(v0_3);
                    }

                    if(this.zzxy != null) {
                        goto label_26;
                    }

                    this.zzxy = Boolean.TRUE;
                    ((zzhi)this).zzgi().zziv().log("My process not in the list of running processes");
                }

            label_26:
                __monitor_exit(this);
                goto label_31;
            label_29:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_29;
            }

            throw v0;
        }

    label_31:
        return this.zzxy.booleanValue();
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

    public final long zzgw() {
        ((zzhi)this).zzgl();
        return 12780;
    }

    static String zzhn() {
        return zzez.zzaie.get();
    }

    public final boolean zzho() {
        ((zzhi)this).zzgl();
        Boolean v0 = this.zzat("firebase_analytics_collection_deactivated");
        if(v0 != null && (v0.booleanValue())) {
            return 1;
        }

        return 0;
    }

    public final Boolean zzhp() {
        ((zzhi)this).zzgl();
        return this.zzat("firebase_analytics_collection_enabled");
    }

    public static long zzhq() {
        return zzez.zzajh.get().longValue();
    }

    public static long zzhr() {
        return zzez.zzaih.get().longValue();
    }

    public final String zzhs() {
        String v2;
        zzfk v1;
        try {
            return Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "debug.firebase.analytics.app", "");
        }
        catch(InvocationTargetException v0) {
            v1 = ((zzhi)this).zzgi().zziv();
            v2 = "SystemProperties.get() threw an exception";
        }
        catch(IllegalAccessException v0_1) {
            v1 = ((zzhi)this).zzgi().zziv();
            v2 = "Could not access SystemProperties.get()";
        }
        catch(NoSuchMethodException v0_2) {
            v1 = ((zzhi)this).zzgi().zziv();
            v2 = "Could not find SystemProperties.get() method";
        }
        catch(ClassNotFoundException v0_3) {
            v1 = ((zzhi)this).zzgi().zziv();
            v2 = "Could not find SystemProperties class";
        }

        v1.zzg(v2, v0);
        return "";
    }

    public static boolean zzht() {
        return zzez.zzaid.get().booleanValue();
    }

    @WorkerThread final boolean zzhu() {
        if(this.zzagi == null) {
            this.zzagi = this.zzat("app_measurement_lite");
            if(this.zzagi == null) {
                this.zzagi = Boolean.valueOf(false);
            }
        }

        return this.zzagi.booleanValue();
    }
}

