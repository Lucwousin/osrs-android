package com.google.android.gms.internal.measurement;

import android.net.Uri;

public final class zzxh {
    private final String zzbpu;
    private final Uri zzbpv;
    private final String zzbpw;
    private final String zzbpx;
    private final boolean zzbpy;
    private final boolean zzbpz;

    public zzxh(Uri arg8) {
        this(null, arg8, "", "", false, false);
    }

    private zzxh(String arg1, Uri arg2, String arg3, String arg4, boolean arg5, boolean arg6) {
        super();
        this.zzbpu = null;
        this.zzbpv = arg2;
        this.zzbpw = arg3;
        this.zzbpx = arg4;
        this.zzbpy = false;
        this.zzbpz = false;
    }

    static Uri zza(zzxh arg0) {
        return arg0.zzbpv;
    }

    public final zzwx zzb(String arg1, double arg2) {
        return zzwx.zzb(this, arg1, arg2);
    }

    static String zzb(zzxh arg0) {
        return arg0.zzbpw;
    }

    static String zzc(zzxh arg0) {
        return arg0.zzbpx;
    }

    public final zzwx zzd(String arg1, int arg2) {
        return zzwx.zzb(this, arg1, arg2);
    }

    public final zzwx zze(String arg1, long arg2) {
        return zzwx.zzb(this, arg1, arg2);
    }

    public final zzwx zzf(String arg1, boolean arg2) {
        return zzwx.zzb(this, arg1, arg2);
    }

    public final zzwx zzv(String arg1, String arg2) {
        return zzwx.zzb(this, arg1, arg2);
    }
}

