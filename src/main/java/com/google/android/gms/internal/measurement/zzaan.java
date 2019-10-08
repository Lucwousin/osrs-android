package com.google.android.gms.internal.measurement;

final class zzaan {
    private static final zzaal zzbvn;
    private static final zzaal zzbvo;

    static {
        zzaan.zzbvn = zzaan.zzuk();
        zzaan.zzbvo = new zzaam();
    }

    static zzaal zzui() {
        return zzaan.zzbvn;
    }

    static zzaal zzuj() {
        return zzaan.zzbvo;
    }

    private static zzaal zzuk() {
        try {
            return Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor().newInstance();
        }
        catch(Exception ) {
            return null;
        }
    }
}

