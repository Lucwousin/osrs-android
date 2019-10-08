package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.AppMeasurement$Event;
import com.google.android.gms.measurement.AppMeasurement$Param;
import com.google.android.gms.measurement.AppMeasurement$UserProperty;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class zzfg extends zzhj {
    private static final AtomicReference zzaki;
    private static final AtomicReference zzakj;
    private static final AtomicReference zzakk;

    static {
        zzfg.zzaki = new AtomicReference();
        zzfg.zzakj = new AtomicReference();
        zzfg.zzakk = new AtomicReference();
    }

    zzfg(zzgn arg1) {
        super(arg1);
    }

    public final Context getContext() {
        return super.getContext();
    }

    @Nullable protected final String zza(zzes arg3) {
        if(arg3 == null) {
            return null;
        }

        if(!this.zziu()) {
            return arg3.toString();
        }

        return "Event{appId=\'" + arg3.zzth + "\', name=\'" + this.zzbm(arg3.name) + "\', params=" + this.zzb(arg3.zzahg) + "}";
    }

    @Nullable private static String zza(String arg3, String[] arg4, String[] arg5, AtomicReference arg6) {
        String[] v3_2;
        Preconditions.checkNotNull(arg4);
        Preconditions.checkNotNull(arg5);
        Preconditions.checkNotNull(arg6);
        int v2 = 0;
        boolean v0 = arg4.length == arg5.length ? true : false;
        Preconditions.checkArgument(v0);
        while(v2 < arg4.length) {
            if(zzkd.zzs(arg3, arg4[v2])) {
                __monitor_enter(arg6);
                try {
                    Object v3_1 = arg6.get();
                    if(v3_1 == null) {
                        v3_2 = new String[arg5.length];
                        arg6.set(v3_2);
                    }

                    if(v3_2[v2] == null) {
                        v3_2[v2] = arg5[v2] + "(" + arg4[v2] + ")";
                    }

                    __monitor_exit(arg6);
                    return v3_2[v2];
                }
                catch(Throwable v3) {
                    goto label_40;
                }
            }

            ++v2;
        }

        return arg3;
        try {
        label_40:
            __monitor_exit(arg6);
        }
        catch(Throwable v3) {
            goto label_40;
        }

        throw v3;
    }

    public final void zzab() {
        super.zzab();
    }

    @Nullable protected final String zzb(zzex arg3) {
        if(arg3 == null) {
            return null;
        }

        if(!this.zziu()) {
            return arg3.toString();
        }

        return "origin=" + arg3.origin + ",name=" + this.zzbm(arg3.name) + ",params=" + this.zzb(arg3.zzahg);
    }

    @Nullable private final String zzb(zzeu arg2) {
        if(arg2 == null) {
            return null;
        }

        if(!this.zziu()) {
            return arg2.toString();
        }

        return this.zzb(arg2.zzin());
    }

    @Nullable protected final String zzb(Bundle arg5) {
        if(arg5 == null) {
            return null;
        }

        if(!this.zziu()) {
            return arg5.toString();
        }

        StringBuilder v0 = new StringBuilder();
        Iterator v1 = arg5.keySet().iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            String v3 = v0.length() != 0 ? ", " : "Bundle[{";
            v0.append(v3);
            v0.append(this.zzbn(((String)v2)));
            v0.append("=");
            v0.append(arg5.get(((String)v2)));
        }

        v0.append("}]");
        return v0.toString();
    }

    @Nullable protected final String zzbm(String arg4) {
        if(arg4 == null) {
            return null;
        }

        if(!this.zziu()) {
            return arg4;
        }

        return zzfg.zza(arg4, Event.zzacx, Event.zzacw, zzfg.zzaki);
    }

    @Nullable protected final String zzbn(String arg4) {
        if(arg4 == null) {
            return null;
        }

        if(!this.zziu()) {
            return arg4;
        }

        return zzfg.zza(arg4, Param.zzacz, Param.zzacy, zzfg.zzakj);
    }

    @Nullable protected final String zzbo(String arg4) {
        if(arg4 == null) {
            return null;
        }

        if(!this.zziu()) {
            return arg4;
        }

        if(arg4.startsWith("_exp_")) {
            return "experiment_id" + "(" + arg4 + ")";
        }

        return zzfg.zza(arg4, UserProperty.zzadb, UserProperty.zzada, zzfg.zzakk);
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

    private final boolean zziu() {
        return this.zzacv.zzgi().isLoggable(3);
    }
}

