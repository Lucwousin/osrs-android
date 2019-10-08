package com.google.android.gms.internal.measurement;

final class zzaai implements zzabb {
    private final zzaap zzbvk;
    private static final zzaap zzbvl;

    static {
        zzaai.zzbvl = new zzaaj();
    }

    public zzaai() {
        this(new zzaak(new zzaap[]{zzzu.zzua(), zzaai.zzuh()}));
    }

    private zzaai(zzaap arg2) {
        super();
        this.zzbvk = zzzw.zza(arg2, "messageInfoFactory");
    }

    private static boolean zza(zzaao arg1) {
        if(arg1.zzul() == zzb.zzbur) {
            return 1;
        }

        return 0;
    }

    public final zzaba zzg(Class arg9) {
        zzabc.zzh(arg9);
        zzaao v2 = this.zzbvk.zze(arg9);
        if(v2.zzum()) {
            if(zzzv.class.isAssignableFrom(arg9)) {
                return zzaau.zza(zzabc.zzuv(), zzzq.zztv(), v2.zzun());
            }

            return zzaau.zza(zzabc.zzut(), zzzq.zztw(), v2.zzun());
        }

        if(zzzv.class.isAssignableFrom(arg9)) {
            if(zzaai.zza(v2)) {
                return zzaat.zza(arg9, v2, zzaax.zzuq(), zzaae.zzug(), zzabc.zzuv(), zzzq.zztv(), zzaan.zzuj());
            }

            return zzaat.zza(arg9, v2, zzaax.zzuq(), zzaae.zzug(), zzabc.zzuv(), null, zzaan.zzuj());
        }

        if(zzaai.zza(v2)) {
            return zzaat.zza(arg9, v2, zzaax.zzup(), zzaae.zzuf(), zzabc.zzut(), zzzq.zztw(), zzaan.zzui());
        }

        return zzaat.zza(arg9, v2, zzaax.zzup(), zzaae.zzuf(), zzabc.zzuu(), null, zzaan.zzui());
    }

    private static zzaap zzuh() {
        try {
            return Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance").invoke(null);
        }
        catch(Exception ) {
            return zzaai.zzbvl;
        }
    }
}

