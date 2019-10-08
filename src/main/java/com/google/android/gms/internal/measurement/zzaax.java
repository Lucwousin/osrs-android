package com.google.android.gms.internal.measurement;

final class zzaax {
    private static final zzaav zzbvv;
    private static final zzaav zzbvw;

    static {
        zzaax.zzbvv = zzaax.zzur();
        zzaax.zzbvw = new zzaaw();
    }

    static zzaav zzup() {
        return zzaax.zzbvv;
    }

    static zzaav zzuq() {
        return zzaax.zzbvw;
    }

    private static zzaav zzur() {
        try {
            return Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor().newInstance();
        }
        catch(Exception ) {
            return null;
        }
    }
}

