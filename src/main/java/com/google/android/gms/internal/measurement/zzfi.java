package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;

public final class zzfi extends zzhj {
    private long zzafi;
    private char zzakl;
    @GuardedBy(value="this") private String zzakm;
    private final zzfk zzakn;
    private final zzfk zzako;
    private final zzfk zzakp;
    private final zzfk zzakq;
    private final zzfk zzakr;
    private final zzfk zzaks;
    private final zzfk zzakt;
    private final zzfk zzaku;
    private final zzfk zzakv;

    zzfi(zzgn arg4) {
        super(arg4);
        this.zzakl = '\u0000';
        this.zzafi = -1;
        this.zzakn = new zzfk(this, 6, false, false);
        this.zzako = new zzfk(this, 6, true, false);
        this.zzakp = new zzfk(this, 6, false, true);
        this.zzakq = new zzfk(this, 5, false, false);
        this.zzakr = new zzfk(this, 5, true, false);
        this.zzaks = new zzfk(this, 5, false, true);
        this.zzakt = new zzfk(this, 4, false, false);
        this.zzaku = new zzfk(this, 3, false, false);
        this.zzakv = new zzfk(this, 2, false, false);
    }

    public final Context getContext() {
        return super.getContext();
    }

    @VisibleForTesting protected final boolean isLoggable(int arg2) {
        return Log.isLoggable(this.zzjd(), arg2);
    }

    @VisibleForTesting protected final void zza(int arg2, String arg3) {
        Log.println(arg2, this.zzjd(), arg3);
    }

    static char zza(zzfi arg0) {
        return arg0.zzakl;
    }

    static char zza(zzfi arg0, char arg1) {
        arg0.zzakl = arg1;
        return arg1;
    }

    static long zza(zzfi arg0, long arg1) {
        arg0.zzafi = arg1;
        return arg1;
    }

    static String zza(boolean arg2, String arg3, Object arg4, Object arg5, Object arg6) {
        if(arg3 == null) {
            arg3 = "";
        }

        String v4 = zzfi.zza(arg2, arg4);
        String v5 = zzfi.zza(arg2, arg5);
        String v2 = zzfi.zza(arg2, arg6);
        StringBuilder v6 = new StringBuilder();
        String v0 = "";
        if(!TextUtils.isEmpty(((CharSequence)arg3))) {
            v6.append(arg3);
            v0 = ": ";
        }

        if(!TextUtils.isEmpty(((CharSequence)v4))) {
            v6.append(v0);
            v6.append(v4);
            v0 = ", ";
        }

        if(!TextUtils.isEmpty(((CharSequence)v5))) {
            v6.append(v0);
            v6.append(v5);
            v0 = ", ";
        }

        if(!TextUtils.isEmpty(((CharSequence)v2))) {
            v6.append(v0);
            v6.append(v2);
        }

        return v6.toString();
    }

    protected final void zza(int arg8, boolean arg9, boolean arg10, String arg11, Object arg12, Object arg13, Object arg14) {
        String v8;
        if(!arg9 && (this.isLoggable(arg8))) {
            this.zza(arg8, zzfi.zza(false, arg11, arg12, arg13, arg14));
        }

        if(!arg10 && arg8 >= 5) {
            Preconditions.checkNotNull(arg11);
            zzgi v9 = this.zzacv.zzka();
            int v10 = 6;
            if(v9 == null) {
                v8 = "Scheduler not set. Not logging error/warn";
            }
            else if(!((zzhj)v9).isInitialized()) {
                v8 = "Scheduler not initialized. Not logging error/warn";
            }
            else {
                goto label_23;
            }

            this.zza(v10, v8);
            return;
        label_23:
            int v2 = 0 >= 9 ? 8 : 0;
            v9.zzc(new zzfj(this, v2, arg11, arg12, arg13, arg14));
        }
    }

    @VisibleForTesting private static String zza(boolean arg7, Object arg8) {
        String v7_1;
        Long v8;
        if(arg8 == null) {
            return "";
        }

        if((arg8 instanceof Integer)) {
            v8 = Long.valueOf(((long)((Integer)arg8).intValue()));
        }

        int v1 = 0;
        if((v8 instanceof Long)) {
            if(!arg7) {
                return String.valueOf(v8);
            }

            Object v7 = v8;
            if(Math.abs(((Long)v7).longValue()) < 100) {
                return String.valueOf(v8);
            }

            String v8_1 = String.valueOf(v8).charAt(0) == 45 ? "-" : "";
            v7_1 = String.valueOf(Math.abs(((Long)v7).longValue()));
            long v0 = Math.round(Math.pow(10, ((double)(v7_1.length() - 1))));
            long v2 = Math.round(Math.pow(10, ((double)v7_1.length())) - 1);
            StringBuilder v4 = new StringBuilder(String.valueOf(v8_1).length() + 43 + String.valueOf(v8_1).length());
            v4.append(v8_1);
            v4.append(v0);
            v4.append("...");
            v4.append(v8_1);
            v4.append(v2);
            return v4.toString();
        }

        if((v8 instanceof Boolean)) {
            return String.valueOf(v8);
        }

        if((v8 instanceof Throwable)) {
            v7_1 = arg7 ? v8.getClass().getName() : ((Throwable)v8).toString();
            StringBuilder v0_1 = new StringBuilder(v7_1);
            v7_1 = zzfi.zzbq(AppMeasurement.class.getCanonicalName());
            String v2_1 = zzfi.zzbq(zzgn.class.getCanonicalName());
            StackTraceElement[] v8_2 = ((Throwable)v8).getStackTrace();
            int v3 = v8_2.length;
            while(v1 < v3) {
                StackTraceElement v4_1 = v8_2[v1];
                if(!v4_1.isNativeMethod()) {
                    String v5 = v4_1.getClassName();
                    if(v5 != null) {
                        v5 = zzfi.zzbq(v5);
                        if(!v5.equals(v7_1) && !v5.equals(v2_1)) {
                            goto label_95;
                        }

                        v0_1.append(": ");
                        v0_1.append(v4_1);
                        break;
                    }
                }

            label_95:
                ++v1;
            }

            return v0_1.toString();
        }

        if((v8 instanceof zzfl)) {
            return zzfl.zza(((zzfl)v8));
        }

        if(arg7) {
            return "-";
        }

        return String.valueOf(v8);
    }

    public final void zzab() {
        super.zzab();
    }

    static long zzb(zzfi arg2) {
        return arg2.zzafi;
    }

    protected static Object zzbp(String arg1) {
        if(arg1 == null) {
            return null;
        }

        return new zzfl(arg1);
    }

    private static String zzbq(String arg2) {
        if(TextUtils.isEmpty(((CharSequence)arg2))) {
            return "";
        }

        int v0 = arg2.lastIndexOf(46);
        if(v0 == -1) {
            return arg2;
        }

        return arg2.substring(0, v0);
    }

    public final Clock zzbt() {
        return super.zzbt();
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

    protected final boolean zzgn() {
        return 0;
    }

    public final zzfk zziv() {
        return this.zzakn;
    }

    public final zzfk zziw() {
        return this.zzako;
    }

    public final zzfk zzix() {
        return this.zzakp;
    }

    public final zzfk zziy() {
        return this.zzakq;
    }

    public final zzfk zziz() {
        return this.zzaks;
    }

    public final zzfk zzja() {
        return this.zzakt;
    }

    public final zzfk zzjb() {
        return this.zzaku;
    }

    public final zzfk zzjc() {
        return this.zzakv;
    }

    private final String zzjd() {
        __monitor_enter(this);
        try {
            if(this.zzakm == null) {
                this.zzakm = zzeh.zzhn();
            }

            __monitor_exit(this);
            return this.zzakm;
        label_9:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_9;
        }

        throw v0;
    }

    public final String zzje() {
        Pair v0 = ((zzhi)this).zzgj().zzals.zzfi();
        if(v0 != null) {
            if(v0 == zzft.zzalr) {
            }
            else {
                String v1 = String.valueOf(v0.second);
                Object v0_1 = v0.first;
                StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 1 + String.valueOf(v0_1).length());
                v3.append(v1);
                v3.append(":");
                v3.append(((String)v0_1));
                return v3.toString();
            }
        }

        return null;
    }
}

