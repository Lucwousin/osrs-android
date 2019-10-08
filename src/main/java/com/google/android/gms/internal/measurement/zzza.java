package com.google.android.gms.internal.measurement;

final class zzza {
    private static final Class zzbtc;
    private static final boolean zzbtd;

    static {
        zzza.zzbtc = zzza.zzfm("libcore.io.Memory");
        boolean v0 = zzza.zzfm("org.robolectric.Robolectric") != null ? true : false;
        zzza.zzbtd = v0;
    }

    private static Class zzfm(String arg0) {
        try {
            return Class.forName(arg0);
        }
        catch(Throwable ) {
            return null;
        }
    }

    static boolean zztk() {
        if(zzza.zzbtc != null && !zzza.zzbtd) {
            return 1;
        }

        return 0;
    }

    static Class zztl() {
        return zzza.zzbtc;
    }
}

