package com.google.android.gms.internal.measurement;

final class zzzu implements zzaap {
    private static final zzzu zzbue;

    static {
        zzzu.zzbue = new zzzu();
    }

    private zzzu() {
        super();
    }

    public final boolean zzd(Class arg2) {
        return zzzv.class.isAssignableFrom(arg2);
    }

    public final zzaao zze(Class arg5) {
        String v5;
        if(!zzzv.class.isAssignableFrom(arg5)) {
            String v1 = "Unsupported message type: ";
            v5 = String.valueOf(arg5.getName());
            v5 = v5.length() != 0 ? v1.concat(v5) : new String(v1);
            throw new IllegalArgumentException(v5);
        }

        try {
            return zzzv.zzf(arg5.asSubclass(zzzv.class)).zza(3, null, null);
        }
        catch(Exception v0) {
            String v2 = "Unable to get message info for ";
            v5 = String.valueOf(arg5.getName());
            v5 = v5.length() != 0 ? v2.concat(v5) : new String(v2);
            throw new RuntimeException(v5, ((Throwable)v0));
        }
    }

    public static zzzu zzua() {
        return zzzu.zzbue;
    }
}

