package com.google.android.gms.internal.firebase_messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.ColorRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class zzs {
    private final int targetSdkVersion;
    @NonNull private final Bundle zzcl;
    @NonNull private final String zzeq;
    @IdRes private final int zzer;
    private final CharSequence zzes;
    @Nullable private final Intent zzet;
    @NonNull private final Bundle zzeu;
    private final Resources zzev;
    @NonNull private final String zzew;
    private final zzx zzex;
    private final zzv zzey;
    private final zzy zzez;
    private final zzw zzfa;

    private zzs(zzu arg2) {
        super();
        this.zzcl = zzu.zza(arg2);
        this.zzeq = zzu.zzb(arg2);
        this.zzer = zzu.zzc(arg2);
        this.targetSdkVersion = zzu.zzd(arg2);
        this.zzes = zzu.zze(arg2);
        this.zzet = zzu.zzf(arg2);
        this.zzeu = zzu.zzg(arg2);
        this.zzev = zzu.zzh(arg2);
        this.zzey = zzu.zzi(arg2);
        this.zzfa = zzu.zzj(arg2);
        this.zzez = zzu.zzk(arg2);
        this.zzew = zzu.zzl(arg2);
        this.zzex = zzu.zzm(arg2);
    }

    zzs(zzu arg1, zzt arg2) {
        this(arg1);
    }

    @NonNull public final CharSequence getAppLabel() {
        return this.zzes;
    }

    @NonNull public final Bundle getData() {
        return this.zzcl;
    }

    @NonNull public final String getPackageName() {
        return this.zzeq;
    }

    @Nullable final String zzat() {
        return this.zzfa.zzat();
    }

    @Nullable final PendingIntent zzau() {
        return this.zzez.zzau();
    }

    @NonNull public final Resources zzay() {
        return this.zzev;
    }

    @NonNull public final Bundle zzaz() {
        return this.zzeu;
    }

    @Nullable public final Integer zzb(@ColorRes int arg2) {
        return this.zzey.zzb(arg2);
    }

    @Nullable public final Intent zzba() {
        return this.zzet;
    }

    @IdRes public final int zzbb() {
        return this.zzer;
    }

    public final int zzbc() {
        return this.targetSdkVersion;
    }

    @NonNull public final String zzbd() {
        return this.zzew;
    }

    @Nullable final PendingIntent zze(Intent arg2) {
        return this.zzez.zze(arg2);
    }

    public final boolean zzl(String arg2) {
        if(TextUtils.isEmpty(((CharSequence)arg2))) {
            return 0;
        }

        return this.zzex.zzl(arg2);
    }
}

