package com.google.android.gms.internal.measurement;

final class zzzm {
    private static final Class zzbts;

    static {
        zzzm.zzbts = zzzm.zztq();
    }

    private static final zzzn zzfo(String arg3) throws Exception {
        return zzzm.zzbts.getDeclaredMethod(arg3).invoke(null);
    }

    private static Class zztq() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        }
        catch(ClassNotFoundException ) {
            return null;
        }
    }

    public static zzzn zztr() {
        if(zzzm.zzbts == null) {
            goto label_5;
        }

        try {
            return zzzm.zzfo("getEmptyRegistry");
        }
        catch(Exception ) {
        label_5:
            return zzzn.zzbtv;
        }
    }
}

