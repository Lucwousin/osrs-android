package com.google.android.gms.internal.measurement;

import android.os.Binder;
import android.text.TextUtils;
import androidx.annotation.BinderThread;
import androidx.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class zzgp extends zzfb {
    private final zzjt zzalo;
    private Boolean zzapb;
    @Nullable private String zzapc;

    public zzgp(zzjt arg2) {
        this(arg2, null);
    }

    private zzgp(zzjt arg1, @Nullable String arg2) {
        super();
        Preconditions.checkNotNull(arg1);
        this.zzalo = arg1;
        this.zzapc = null;
    }

    static zzjt zza(zzgp arg0) {
        return arg0.zzalo;
    }

    @BinderThread public final List zza(zzeb arg5, boolean arg6) {
        ArrayList v1;
        this.zzb(arg5, false);
        Future v0 = this.zzalo.zzgh().zzb(new zzhf(this, arg5));
        try {
            Object v0_1 = v0.get();
            v1 = new ArrayList(((List)v0_1).size());
            Iterator v0_2 = ((List)v0_1).iterator();
            while(v0_2.hasNext()) {
                Object v2 = v0_2.next();
                if(!arg6 && (zzkd.zzcm(((zzkc)v2).name))) {
                    continue;
                }

                ((List)v1).add(new zzka(((zzkc)v2)));
            }
        }
        catch(ExecutionException v6) {
            goto label_31;
        }

        return ((List)v1);
    label_31:
        this.zzalo.zzgi().zziv().zze("Failed to get user attributes. appId", zzfi.zzbp(arg5.packageName), v6);
        return null;
    }

    @BinderThread public final List zza(String arg3, String arg4, zzeb arg5) {
        this.zzb(arg5, false);
        Future v3 = this.zzalo.zzgh().zzb(new zzgx(this, arg5, arg3, arg4));
        try {
            return v3.get();
        }
        catch(ExecutionException v3_1) {
            this.zzalo.zzgi().zziv().zzg("Failed to get conditional user properties", v3_1);
            return Collections.emptyList();
        }
    }

    @BinderThread public final List zza(String arg3, String arg4, String arg5, boolean arg6) {
        ArrayList v5;
        this.zzc(arg3, true);
        Future v4 = this.zzalo.zzgh().zzb(new zzgw(this, arg3, arg4, arg5));
        try {
            Object v4_2 = v4.get();
            v5 = new ArrayList(((List)v4_2).size());
            Iterator v4_3 = ((List)v4_2).iterator();
            while(v4_3.hasNext()) {
                Object v0 = v4_3.next();
                if(!arg6 && (zzkd.zzcm(((zzkc)v0).name))) {
                    continue;
                }

                ((List)v5).add(new zzka(((zzkc)v0)));
            }
        }
        catch(ExecutionException v4_1) {
            goto label_30;
        }

        return ((List)v5);
    label_30:
        this.zzalo.zzgi().zziv().zze("Failed to get user attributes. appId", zzfi.zzbp(arg3), v4_1);
        return Collections.emptyList();
    }

    @BinderThread public final List zza(String arg3, String arg4, boolean arg5, zzeb arg6) {
        ArrayList v4;
        this.zzb(arg6, false);
        Future v3 = this.zzalo.zzgh().zzb(new zzgv(this, arg6, arg3, arg4));
        try {
            Object v3_2 = v3.get();
            v4 = new ArrayList(((List)v3_2).size());
            Iterator v3_3 = ((List)v3_2).iterator();
            while(v3_3.hasNext()) {
                Object v0 = v3_3.next();
                if(!arg5 && (zzkd.zzcm(((zzkc)v0).name))) {
                    continue;
                }

                ((List)v4).add(new zzka(((zzkc)v0)));
            }
        }
        catch(ExecutionException v3_1) {
            goto label_31;
        }

        return ((List)v4);
    label_31:
        this.zzalo.zzgi().zziv().zze("Failed to get user attributes. appId", zzfi.zzbp(arg6.packageName), v3_1);
        return Collections.emptyList();
    }

    @BinderThread public final void zza(long arg9, String arg11, String arg12, String arg13) {
        this.zze(new zzhh(this, arg12, arg13, arg11, arg9));
    }

    @BinderThread public final void zza(zzeb arg2) {
        this.zzb(arg2, false);
        this.zze(new zzhg(this, arg2));
    }

    @BinderThread public final void zza(zzef arg3, zzeb arg4) {
        zzgr v3;
        Preconditions.checkNotNull(arg3);
        Preconditions.checkNotNull(arg3.zzage);
        this.zzb(arg4, false);
        zzef v0 = new zzef(arg3);
        v0.packageName = arg4.packageName;
        if(arg3.zzage.getValue() == null) {
            v3 = new zzgr(this, v0, arg4);
        }
        else {
            zzgs v3_1 = new zzgs(this, v0, arg4);
        }

        this.zze(((Runnable)v3));
    }

    @BinderThread public final void zza(zzex arg2, zzeb arg3) {
        Preconditions.checkNotNull(arg2);
        this.zzb(arg3, false);
        this.zze(new zzha(this, arg2, arg3));
    }

    @BinderThread public final void zza(zzex arg1, String arg2, String arg3) {
        Preconditions.checkNotNull(arg1);
        Preconditions.checkNotEmpty(arg2);
        this.zzc(arg2, true);
        this.zze(new zzhb(this, arg1, arg2));
    }

    @BinderThread public final void zza(zzka arg2, zzeb arg3) {
        zzhd v0;
        Preconditions.checkNotNull(arg2);
        this.zzb(arg3, false);
        if(arg2.getValue() == null) {
            v0 = new zzhd(this, arg2, arg3);
        }
        else {
            zzhe v0_1 = new zzhe(this, arg2, arg3);
        }

        this.zze(((Runnable)v0));
    }

    @BinderThread public final byte[] zza(zzex arg11, String arg12) {
        Preconditions.checkNotEmpty(arg12);
        Preconditions.checkNotNull(arg11);
        this.zzc(arg12, true);
        this.zzalo.zzgi().zzjb().zzg("Log and bundle. event", this.zzalo.zzgf().zzbm(arg11.name));
        long v2 = 1000000;
        long v0 = this.zzalo.zzbt().nanoTime() / v2;
        Future v4 = this.zzalo.zzgh().zzc(new zzhc(this, arg11, arg12));
        try {
            Object v4_1 = v4.get();
            if(v4_1 == null) {
                this.zzalo.zzgi().zziv().zzg("Log and bundle returned null. appId", zzfi.zzbp(arg12));
                byte[] v4_2 = new byte[0];
            }

            this.zzalo.zzgi().zzjb().zzd("Log and bundle processed. event, size, time_ms", this.zzalo.zzgf().zzbm(arg11.name), Integer.valueOf(v4_1.length), Long.valueOf(this.zzalo.zzbt().nanoTime() / v2 - v0));
            return ((byte[])v4_1);
        }
        catch(ExecutionException v0_1) {
            this.zzalo.zzgi().zziv().zzd("Failed to log and bundle. appId, event, error", zzfi.zzbp(arg12), this.zzalo.zzgf().zzbm(arg11.name), v0_1);
            return null;
        }
    }

    @BinderThread private final void zzb(zzeb arg2, boolean arg3) {
        Preconditions.checkNotNull(arg2);
        this.zzc(arg2.packageName, false);
        this.zzalo.zzgg().zzck(arg2.zzafa);
    }

    @BinderThread public final void zzb(zzeb arg2) {
        this.zzb(arg2, false);
        this.zze(new zzgq(this, arg2));
    }

    @BinderThread public final void zzb(zzef arg3) {
        zzgt v3;
        Preconditions.checkNotNull(arg3);
        Preconditions.checkNotNull(arg3.zzage);
        this.zzc(arg3.packageName, true);
        zzef v0 = new zzef(arg3);
        if(arg3.zzage.getValue() == null) {
            v3 = new zzgt(this, v0);
        }
        else {
            zzgu v3_1 = new zzgu(this, v0);
        }

        this.zze(((Runnable)v3));
    }

    @BinderThread private final void zzc(String arg4, boolean arg5) {
        if(TextUtils.isEmpty(((CharSequence)arg4))) {
            goto label_60;
        }

        if(arg5) {
            try {
                if(this.zzapb == null) {
                    arg5 = ("com.google.android.gms".equals(this.zzapc)) || (UidVerifier.isGooglePlayServicesUid(this.zzalo.getContext(), Binder.getCallingUid())) || (GoogleSignatureVerifier.getInstance(this.zzalo.getContext()).isUidGoogleSigned(Binder.getCallingUid())) ? true : false;
                    this.zzapb = Boolean.valueOf(arg5);
                }

                if(!this.zzapb.booleanValue()) {
                label_34:
                    if(this.zzapc == null && (GooglePlayServicesUtilLight.uidHasPackageName(this.zzalo.getContext(), Binder.getCallingUid(), arg4))) {
                        this.zzapc = arg4;
                    }

                    if(!arg4.equals(this.zzapc)) {
                        goto label_46;
                    }
                }

                return;
            label_46:
                throw new SecurityException(String.format("Unknown calling package name \'%s\'.", arg4));
            label_33:
                goto label_53;
            }
            catch(SecurityException v5) {
                goto label_33;
            }
        }
        else {
            goto label_34;
        }

        return;
    label_53:
        this.zzalo.zzgi().zziv().zzg("Measurement Service called with invalid calling package. appId", zzfi.zzbp(arg4));
        throw v5;
    label_60:
        this.zzalo.zzgi().zziv().log("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    @BinderThread public final String zzc(zzeb arg2) {
        this.zzb(arg2, false);
        return this.zzalo.zzh(arg2);
    }

    @BinderThread public final void zzd(zzeb arg3) {
        this.zzc(arg3.packageName, false);
        this.zze(new zzgz(this, arg3));
    }

    @VisibleForTesting private final void zze(Runnable arg2) {
        Preconditions.checkNotNull(arg2);
        if((zzez.zzajw.get().booleanValue()) && (this.zzalo.zzgh().zzju())) {
            arg2.run();
            return;
        }

        this.zzalo.zzgh().zzc(arg2);
    }

    @BinderThread public final List zze(String arg3, String arg4, String arg5) {
        this.zzc(arg3, true);
        Future v3 = this.zzalo.zzgh().zzb(new zzgy(this, arg3, arg4, arg5));
        try {
            return v3.get();
        }
        catch(ExecutionException v3_1) {
            this.zzalo.zzgi().zziv().zzg("Failed to get conditional user properties", v3_1);
            return Collections.emptyList();
        }
    }
}

