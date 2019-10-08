package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.firebase.iid.FirebaseInstanceId;
import java.math.BigInteger;
import java.util.Locale;

public final class zzfd extends zzdz {
    private String zzafa;
    private String zzafh;
    private long zzafl;
    private int zzagb;
    private int zzakd;
    private long zzake;
    private String zztf;
    private String zztg;
    private String zzth;

    zzfd(zzgn arg1) {
        super(arg1);
    }

    public final Context getContext() {
        return super.getContext();
    }

    final String getGmpAppId() {
        ((zzdz)this).zzch();
        return this.zzafa;
    }

    public final void zzab() {
        super.zzab();
    }

    final String zzah() {
        ((zzdz)this).zzch();
        return this.zzth;
    }

    @WorkerThread final zzeb zzbl(String arg29) {
        zzfd v0 = this;
        ((zzhi)this).zzab();
        ((zzhi)this).zzfv();
        zzeb v24 = null;
        String v2 = this.zzah();
        String v3 = this.getGmpAppId();
        ((zzdz)this).zzch();
        String v4 = v0.zztg;
        long v5 = ((long)this.zzis());
        ((zzdz)this).zzch();
        String v7 = v0.zzafh;
        long v8 = ((zzhi)this).zzgk().zzgw();
        ((zzdz)this).zzch();
        ((zzhi)this).zzab();
        if(v0.zzake == 0) {
            v0.zzake = v0.zzacv.zzgg().zzd(((zzhi)this).getContext(), ((zzhi)this).getContext().getPackageName());
        }

        long v10 = v0.zzake;
        boolean v13 = v0.zzacv.isEnabled();
        int v14 = ((zzhi)this).zzgj().zzamm ^ 1;
        String v15 = this.zzgr();
        ((zzdz)this).zzch();
        int v25 = v14;
        String v26 = v15;
        long v14_1 = v0.zzafl;
        long v18 = v0.zzacv.zzke();
        int v20 = this.zzit();
        zzeh v1 = ((zzhi)this).zzgk();
        ((zzhi)v1).zzfv();
        Boolean v1_1 = v1.zzat("google_analytics_adid_collection_enabled");
        boolean v1_2 = v1_1 == null || (v1_1.booleanValue()) ? true : false;
        boolean v21 = Boolean.valueOf(v1_2).booleanValue();
        v1 = ((zzhi)this).zzgk();
        ((zzhi)v1).zzfv();
        v1_1 = v1.zzat("google_analytics_ssaid_collection_enabled");
        boolean v27 = v1_1 == null || (v1_1.booleanValue()) ? true : false;
        super(v2, v3, v4, v5, v7, v8, v10, arg29, v13, v25, v26, v14_1, v18, v20, v21, Boolean.valueOf(v27).booleanValue(), ((zzhi)this).zzgj().zzjo());
        return v24;
    }

    public final Clock zzbt() {
        return super.zzbt();
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

    public final zzdu zzfx() {
        return super.zzfx();
    }

    public final zzhm zzfy() {
        return super.zzfy();
    }

    public final zzfd zzfz() {
        return super.zzfz();
    }

    public final zzik zzga() {
        return super.zzga();
    }

    public final zzih zzgb() {
        return super.zzgb();
    }

    public final zzfe zzgc() {
        return super.zzgc();
    }

    public final zzjj zzgd() {
        return super.zzgd();
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
        return 1;
    }

    protected final void zzgo() {
        zzfk v2_3;
        String v4_2;
        PackageInfo v7;
        String v0 = "unknown";
        String v1 = "Unknown";
        String v2 = "Unknown";
        String v3 = ((zzhi)this).getContext().getPackageName();
        PackageManager v4 = ((zzhi)this).getContext().getPackageManager();
        int v6 = 0x80000000;
        if(v4 == null) {
            ((zzhi)this).zzgi().zziv().zzg("PackageManager is null, app identity information might be inaccurate. appId", zzfi.zzbp(v3));
            goto label_52;
        }

        try {
            v0 = v4.getInstallerPackageName(v3);
        }
        catch(IllegalArgumentException ) {
            ((zzhi)this).zzgi().zziv().zzg("Error retrieving app installer package name. appId", zzfi.zzbp(v3));
        }

        if(v0 == null) {
            v0 = "manual_install";
        }
        else if("com.android.vending".equals(v0)) {
            v0 = "";
        }

        try {
            v7 = v4.getPackageInfo(((zzhi)this).getContext().getPackageName(), 0);
            if(v7 == null) {
                goto label_52;
            }

            CharSequence v4_1 = v4.getApplicationLabel(v7.applicationInfo);
            if(!TextUtils.isEmpty(v4_1)) {
                v2 = v4_1.toString();
            }

            v4_2 = v7.versionName;
        }
        catch(PackageManager$NameNotFoundException ) {
            goto label_47;
        }

        try {
            v6 = v7.versionCode;
            v1 = v4_2;
            goto label_52;
        }
        catch(PackageManager$NameNotFoundException ) {
            v1 = v4_2;
        }

    label_47:
        ((zzhi)this).zzgi().zziv().zze("Error retrieving package info. appId, appName", zzfi.zzbp(v3), v2);
    label_52:
        this.zzth = v3;
        this.zzafh = v0;
        this.zztg = v1;
        this.zzakd = v6;
        this.zztf = v2;
        long v0_1 = 0;
        this.zzake = v0_1;
        ((zzhi)this).zzgl();
        Status v2_1 = GoogleServices.initialize(((zzhi)this).getContext());
        int v4_3 = 1;
        v6 = v2_1 == null || !v2_1.isSuccess() ? 0 : 1;
        if(v6 == 0) {
            if(v2_1 == null) {
                ((zzhi)this).zzgi().zziv().log("GoogleService failed to initialize (no status)");
            }
            else {
                ((zzhi)this).zzgi().zziv().zze("GoogleService failed to initialize, status", Integer.valueOf(v2_1.getStatusCode()), v2_1.getStatusMessage());
            }
        }

        if(v6 != 0) {
            Boolean v2_2 = ((zzhi)this).zzgk().zzhp();
            if(((zzhi)this).zzgk().zzho()) {
                v2_3 = ((zzhi)this).zzgi().zzja();
                v4_2 = "Collection disabled with firebase_analytics_collection_deactivated=1";
            }
            else {
                if(v2_2 != null && !v2_2.booleanValue()) {
                    v2_3 = ((zzhi)this).zzgi().zzja();
                    v4_2 = "Collection disabled with firebase_analytics_collection_enabled=0";
                    goto label_92;
                }

                if(v2_2 == null && (GoogleServices.isMeasurementExplicitlyDisabled())) {
                    v2_3 = ((zzhi)this).zzgi().zzja();
                    v4_2 = "Collection disabled with google_app_measurement_enable=0";
                    goto label_92;
                }

                goto label_108;
            }

        label_92:
            v2_3.log(v4_2);
            goto label_113;
        label_108:
            ((zzhi)this).zzgi().zzjc().log("Collection enabled");
        }
        else {
        label_113:
            v4_3 = 0;
        }

        this.zzafa = "";
        this.zzafl = v0_1;
        ((zzhi)this).zzgl();
        if(this.zzacv.zzkd() != null) {
            this.zzafa = this.zzacv.zzkd();
            goto label_144;
        }

        try {
            v0 = GoogleServices.getGoogleAppId();
            if(TextUtils.isEmpty(((CharSequence)v0))) {
                v0 = "";
            }

            this.zzafa = v0;
            if(v4_3 == 0) {
                goto label_144;
            }

            ((zzhi)this).zzgi().zzjc().zze("App package, google app id", this.zzth, this.zzafa);
        }
        catch(IllegalStateException v0_2) {
            ((zzhi)this).zzgi().zziv().zze("getGoogleAppId or isMeasurementEnabled failed with exception. appId", zzfi.zzbp(v3), v0_2);
        }

    label_144:
        if(Build$VERSION.SDK_INT >= 16) {
            this.zzagb = InstantApps.isInstantApp(((zzhi)this).getContext());
            return;
        }

        this.zzagb = 0;
    }

    @WorkerThread private final String zzgr() {
        ((zzhi)this).zzab();
        ((zzhi)this).zzfv();
        String v1 = null;
        if((((zzhi)this).zzgk().zzbb(this.zzth)) && !this.zzacv.isEnabled()) {
            return v1;
        }

        try {
            return FirebaseInstanceId.getInstance().getId();
        }
        catch(IllegalStateException ) {
            ((zzhi)this).zzgi().zziy().log("Failed to retrieve Firebase Instance Id");
            return v1;
        }
    }

    @WorkerThread final String zzir() {
        byte[] v0 = new byte[16];
        ((zzhi)this).zzgg().zzlo().nextBytes(v0);
        return String.format(Locale.US, "%032x", new BigInteger(1, v0));
    }

    final int zzis() {
        ((zzdz)this).zzch();
        return this.zzakd;
    }

    final int zzit() {
        ((zzdz)this).zzch();
        return this.zzagb;
    }
}

