package com.google.android.gms.internal.measurement;

final class zzabc {
    private static final Class zzbwa;
    private static final zzabo zzbwb;
    private static final zzabo zzbwc;
    private static final zzabo zzbwd;

    static {
        zzabc.zzbwa = zzabc.zzuw();
        zzabc.zzbwb = zzabc.zzu(false);
        zzabc.zzbwc = zzabc.zzu(true);
        zzabc.zzbwd = new zzabq();
    }

    public static void zzh(Class arg1) {
        if(!zzzv.class.isAssignableFrom(arg1) && zzabc.zzbwa != null) {
            if(zzabc.zzbwa.isAssignableFrom(arg1)) {
            }
            else {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    private static zzabo zzu(boolean arg6) {
        zzabo v0 = null;
        try {
            Class v1 = zzabc.zzux();
            if(v1 == null) {
                return v0;
            }

            return v1.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(arg6));
        }
        catch(Throwable ) {
            return v0;
        }
    }

    public static zzabo zzut() {
        return zzabc.zzbwb;
    }

    public static zzabo zzuu() {
        return zzabc.zzbwc;
    }

    public static zzabo zzuv() {
        return zzabc.zzbwd;
    }

    private static Class zzuw() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        }
        catch(Throwable ) {
            return null;
        }
    }

    private static Class zzux() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        }
        catch(Throwable ) {
            return null;
        }
    }
}

