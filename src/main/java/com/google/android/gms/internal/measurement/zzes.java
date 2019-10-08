package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;

public final class zzes {
    final String name;
    private final String origin;
    final long timestamp;
    final long zzahf;
    final zzeu zzahg;
    final String zzth;

    zzes(zzgn arg1, String arg2, String arg3, String arg4, long arg5, long arg7, Bundle arg9) {
        zzeu v1;
        Object v5;
        super();
        Preconditions.checkNotEmpty(arg3);
        Preconditions.checkNotEmpty(arg4);
        this.zzth = arg3;
        this.name = arg4;
        if(TextUtils.isEmpty(((CharSequence)arg2))) {
            arg2 = null;
        }

        this.origin = arg2;
        this.timestamp = arg5;
        this.zzahf = arg7;
        if(this.zzahf != 0 && this.zzahf > this.timestamp) {
            arg1.zzgi().zziy().zzg("Event created with reverse previous/current timestamps. appId", zzfi.zzbp(arg3));
        }

        if(arg9 == null || (arg9.isEmpty())) {
            v1 = new zzeu(new Bundle());
        }
        else {
            Bundle v2 = new Bundle(arg9);
            Iterator v3 = v2.keySet().iterator();
            while(v3.hasNext()) {
                Object v4 = v3.next();
                if(v4 == null) {
                    arg1.zzgi().zziv().log("Param name can\'t be null");
                }
                else {
                    v5 = arg1.zzgg().zzh(((String)v4), v2.get(((String)v4)));
                    if(v5 == null) {
                        arg1.zzgi().zziy().zzg("Param value can\'t be null", arg1.zzgf().zzbn(((String)v4)));
                    }
                    else {
                        goto label_50;
                    }
                }

                v3.remove();
                continue;
            label_50:
                arg1.zzgg().zza(v2, ((String)v4), v5);
            }

            v1 = new zzeu(v2);
        }

        this.zzahg = v1;
    }

    private zzes(zzgn arg2, String arg3, String arg4, String arg5, long arg6, long arg8, zzeu arg10) {
        super();
        Preconditions.checkNotEmpty(arg4);
        Preconditions.checkNotEmpty(arg5);
        Preconditions.checkNotNull(arg10);
        this.zzth = arg4;
        this.name = arg5;
        if(TextUtils.isEmpty(((CharSequence)arg3))) {
            arg3 = null;
        }

        this.origin = arg3;
        this.timestamp = arg6;
        this.zzahf = arg8;
        if(this.zzahf != 0 && this.zzahf > this.timestamp) {
            arg2.zzgi().zziy().zze("Event created with reverse previous/current timestamps. appId, name", zzfi.zzbp(arg4), zzfi.zzbp(arg5));
        }

        this.zzahg = arg10;
    }

    public final String toString() {
        String v0 = this.zzth;
        String v1 = this.name;
        String v2 = String.valueOf(this.zzahg);
        StringBuilder v4 = new StringBuilder(String.valueOf(v0).length() + 33 + String.valueOf(v1).length() + String.valueOf(v2).length());
        v4.append("Event{appId=\'");
        v4.append(v0);
        v4.append("\', name=\'");
        v4.append(v1);
        v4.append("\', params=");
        v4.append(v2);
        v4.append('}');
        return v4.toString();
    }

    final zzes zza(zzgn arg12, long arg13) {
        return new zzes(arg12, this.origin, this.zzth, this.name, this.timestamp, arg13, this.zzahg);
    }
}

