package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import com.google.android.gms.common.util.Clock;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class zzer extends zzhj {
    private long zzahc;
    private String zzahd;
    private Boolean zzahe;

    zzer(zzgn arg1) {
        super(arg1);
    }

    public final Context getContext() {
        return super.getContext();
    }

    public final void zzab() {
        super.zzab();
    }

    public final Clock zzbt() {
        return super.zzbt();
    }

    public final boolean zzf(Context arg3) {
        if(this.zzahe == null) {
            ((zzhi)this).zzgl();
            this.zzahe = Boolean.valueOf(false);
            try {
                PackageManager v3 = arg3.getPackageManager();
                if(v3 != null) {
                    v3.getPackageInfo("com.google.android.gms", 0x80);
                    this.zzahe = Boolean.valueOf(true);
                }

                goto label_14;
            }
            catch(PackageManager$NameNotFoundException ) {
            label_14:
                return this.zzahe.booleanValue();
            }
        }

        goto label_14;
    }

    public final void zzfu() {
        super.zzfu();
    }

    public final void zzfv() {
        super.zzfv();
    }

    public final void zzfw() {
        super.zzfw();
    }

    public final zzer zzge() {
        return super.zzge();
    }

    public final zzfg zzgf() {
        return super.zzgf();
    }

    public final zzkd zzgg() {
        return super.zzgg();
    }

    public final zzgi zzgh() {
        return super.zzgh();
    }

    public final zzfi zzgi() {
        return super.zzgi();
    }

    public final zzft zzgj() {
        return super.zzgj();
    }

    public final zzeh zzgk() {
        return super.zzgk();
    }

    public final zzee zzgl() {
        return super.zzgl();
    }

    protected final boolean zzgn() {
        Calendar v0 = Calendar.getInstance();
        this.zzahc = TimeUnit.MINUTES.convert(((long)(v0.get(15) + v0.get(16))), TimeUnit.MILLISECONDS);
        Locale v0_1 = Locale.getDefault();
        String v1 = v0_1.getLanguage().toLowerCase(Locale.ENGLISH);
        String v0_2 = v0_1.getCountry().toLowerCase(Locale.ENGLISH);
        StringBuilder v3 = new StringBuilder(String.valueOf(v1).length() + 1 + String.valueOf(v0_2).length());
        v3.append(v1);
        v3.append("-");
        v3.append(v0_2);
        this.zzahd = v3.toString();
        return 0;
    }

    public final long zzik() {
        ((zzhj)this).zzch();
        return this.zzahc;
    }

    public final String zzil() {
        ((zzhj)this).zzch();
        return this.zzahd;
    }
}

