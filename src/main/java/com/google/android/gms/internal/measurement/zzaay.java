package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class zzaay {
    private static final zzaay zzbvx;
    private final zzabb zzbvy;
    private final ConcurrentMap zzbvz;

    static {
        zzaay.zzbvx = new zzaay();
    }

    private zzaay() {
        zzaai v3_1;
        super();
        this.zzbvz = new ConcurrentHashMap();
        String[] v0 = new String[]{"com.google.protobuf.AndroidProto3SchemaFactory"};
        zzabb v3 = null;
        int v2;
        for(v2 = 0; v2 <= 0; ++v2) {
            v3 = zzaay.zzfq(v0[0]);
            if(v3 != null) {
                break;
            }
        }

        if(v3 == null) {
            v3_1 = new zzaai();
        }

        this.zzbvy = ((zzabb)v3_1);
    }

    private static zzabb zzfq(String arg2) {
        try {
            return Class.forName(arg2).getConstructor().newInstance();
        }
        catch(Throwable ) {
            return null;
        }
    }

    public final zzaba zzt(Object arg3) {
        Class v3 = arg3.getClass();
        zzzw.zza(v3, "messageType");
        Object v0 = this.zzbvz.get(v3);
        if(v0 == null) {
            zzaba v0_1 = this.zzbvy.zzg(v3);
            zzzw.zza(v3, "messageType");
            zzzw.zza(v0_1, "schema");
            arg3 = this.zzbvz.putIfAbsent(v3, v0_1);
            if(arg3 != null) {
                v0 = arg3;
            }
        }

        return ((zzaba)v0);
    }

    public static zzaay zzus() {
        return zzaay.zzbvx;
    }
}

