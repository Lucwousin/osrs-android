package com.google.android.gms.internal.measurement;

final class zzzq {
    private static final zzzo zzbtx;
    private static final zzzo zzbty;

    static {
        zzzq.zzbtx = new zzzp();
        zzzq.zzbty = zzzq.zztu();
    }

    private static zzzo zztu() {
        try {
            return Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor().newInstance();
        }
        catch(Exception ) {
            return null;
        }
    }

    static zzzo zztv() {
        return zzzq.zzbtx;
    }

    static zzzo zztw() {
        if(zzzq.zzbty != null) {
            return zzzq.zzbty;
        }

        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}

