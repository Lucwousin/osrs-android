package com.google.android.gms.internal.firebase_messaging;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;

public final class zzu {
    private int targetSdkVersion;
    @NonNull private final Bundle zzcl;
    @NonNull private final String zzeq;
    private int zzer;
    private CharSequence zzes;
    private Intent zzet;
    @NonNull private Bundle zzeu;
    private Resources zzev;
    private String zzew;
    private zzx zzex;
    private zzv zzey;
    private zzy zzez;
    private zzw zzfa;

    public zzu(@NonNull Bundle arg2, @NonNull String arg3) {
        super();
        this.zzeu = Bundle.EMPTY;
        this.targetSdkVersion = -1;
        this.zzcl = Preconditions.checkNotNull(arg2);
        this.zzeq = Preconditions.checkNotNull(arg3);
    }

    static Bundle zza(zzu arg0) {
        return arg0.zzcl;
    }

    public final zzu zza(@NonNull Resources arg1) {
        this.zzev = Preconditions.checkNotNull(arg1);
        return this;
    }

    public final zzu zza(@NonNull zzv arg1) {
        this.zzey = Preconditions.checkNotNull(arg1);
        return this;
    }

    public final zzu zza(@NonNull zzw arg1) {
        this.zzfa = Preconditions.checkNotNull(arg1);
        return this;
    }

    public final zzu zza(zzx arg1) {
        this.zzex = arg1;
        return this;
    }

    public final zzu zza(@NonNull zzy arg1) {
        this.zzez = Preconditions.checkNotNull(arg1);
        return this;
    }

    public final zzu zza(@NonNull CharSequence arg1) {
        this.zzes = Preconditions.checkNotNull(arg1);
        return this;
    }

    static String zzb(zzu arg0) {
        return arg0.zzeq;
    }

    public final zzs zzbe() {
        Preconditions.checkNotNull(this.zzcl, "data");
        Preconditions.checkNotNull(this.zzeq, "pkgName");
        Preconditions.checkNotNull(this.zzes, "appLabel");
        Preconditions.checkNotNull(this.zzeu, "pkgMetadata");
        Preconditions.checkNotNull(this.zzev, "pkgResources");
        Preconditions.checkNotNull(this.zzey, "colorGetter");
        Preconditions.checkNotNull(this.zzfa, "notificationChannelFallbackProvider");
        Preconditions.checkNotNull(this.zzez, "pendingIntentFactory");
        Preconditions.checkNotNull(this.zzex, "notificationChannelValidator");
        boolean v0 = this.targetSdkVersion >= 0 ? true : false;
        Preconditions.checkArgument(v0);
        return new zzs(this, null);
    }

    static int zzc(zzu arg0) {
        return arg0.zzer;
    }

    public final zzu zzc(int arg1) {
        this.zzer = arg1;
        return this;
    }

    static int zzd(zzu arg0) {
        return arg0.targetSdkVersion;
    }

    public final zzu zzd(int arg4) {
        boolean v0 = arg4 > 0 ? true : false;
        StringBuilder v2 = new StringBuilder(36);
        v2.append("Invalid targetSdkVersion ");
        v2.append(arg4);
        Preconditions.checkArgument(v0, v2.toString());
        this.targetSdkVersion = arg4;
        return this;
    }

    static CharSequence zze(zzu arg0) {
        return arg0.zzes;
    }

    static Intent zzf(zzu arg0) {
        return arg0.zzet;
    }

    public final zzu zzf(@Nullable Intent arg1) {
        this.zzet = arg1;
        return this;
    }

    static Bundle zzg(zzu arg0) {
        return arg0.zzeu;
    }

    static Resources zzh(zzu arg0) {
        return arg0.zzev;
    }

    static zzv zzi(zzu arg0) {
        return arg0.zzey;
    }

    public final zzu zzi(@NonNull Bundle arg1) {
        this.zzeu = Preconditions.checkNotNull(arg1);
        return this;
    }

    static zzw zzj(zzu arg0) {
        return arg0.zzfa;
    }

    static zzy zzk(zzu arg0) {
        return arg0.zzez;
    }

    static String zzl(zzu arg0) {
        return arg0.zzew;
    }

    static zzx zzm(zzu arg0) {
        return arg0.zzex;
    }

    public final zzu zzq(@NonNull String arg1) {
        this.zzew = Preconditions.checkNotEmpty(arg1);
        return this;
    }
}

