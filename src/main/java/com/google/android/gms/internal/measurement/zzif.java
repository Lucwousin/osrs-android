package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.MainThread;

@TargetApi(value=14) @MainThread final class zzif implements Application$ActivityLifecycleCallbacks {
    private zzif(zzhm arg1) {
        this.zzaps = arg1;
        super();
    }

    zzif(zzhm arg1, zzhn arg2) {
        this(arg1);
    }

    public final void onActivityCreated(Activity arg6, Bundle arg7) {
        int v1_1;
        String v0_2;
        try {
            this.zzaps.zzgi().zzjc().log("onActivityCreated");
            Intent v0_1 = arg6.getIntent();
            if(v0_1 == null) {
                goto label_77;
            }

            Uri v1 = v0_1.getData();
            if(v1 == null) {
                goto label_77;
            }

            if(!v1.isHierarchical()) {
                goto label_77;
            }

            if(arg7 == null) {
                Bundle v2 = this.zzaps.zzgg().zza(v1);
                this.zzaps.zzgg();
                v0_2 = zzkd.zzd(v0_1) ? "gs" : "auto";
                if(v2 == null) {
                    goto label_26;
                }

                this.zzaps.logEvent(v0_2, "_cmp", v2);
            }

        label_26:
            v0_2 = v1.getQueryParameter("referrer");
            if(TextUtils.isEmpty(((CharSequence)v0_2))) {
                return;
            }

            if(v0_2.contains("gclid")) {
                if(!v0_2.contains("utm_campaign") && !v0_2.contains("utm_source") && !v0_2.contains("utm_medium") && !v0_2.contains("utm_term") && !v0_2.contains("utm_content")) {
                    goto label_51;
                }

                v1_1 = 1;
            }
            else {
            label_51:
                v1_1 = 0;
            }

            if(v1_1 == 0) {
                this.zzaps.zzgi().zzjb().log("Activity created with data \'referrer\' param without gclid and at least one utm field");
                return;
            }

            this.zzaps.zzgi().zzjb().zzg("Activity created with referrer", v0_2);
            if(TextUtils.isEmpty(((CharSequence)v0_2))) {
                goto label_77;
            }

            this.zzaps.setUserProperty("auto", "_ldl", v0_2);
        }
        catch(Exception v0) {
            this.zzaps.zzgi().zziv().zzg("Throwable caught in onActivityCreated", v0);
        }

    label_77:
        this.zzaps.zzgb().onActivityCreated(arg6, arg7);
    }

    public final void onActivityDestroyed(Activity arg2) {
        this.zzaps.zzgb().onActivityDestroyed(arg2);
    }

    @MainThread public final void onActivityPaused(Activity arg5) {
        this.zzaps.zzgb().onActivityPaused(arg5);
        zzjj v5 = this.zzaps.zzgd();
        ((zzhi)v5).zzgh().zzc(new zzjn(v5, ((zzhi)v5).zzbt().elapsedRealtime()));
    }

    @MainThread public final void onActivityResumed(Activity arg5) {
        this.zzaps.zzgb().onActivityResumed(arg5);
        zzjj v5 = this.zzaps.zzgd();
        ((zzhi)v5).zzgh().zzc(new zzjm(v5, ((zzhi)v5).zzbt().elapsedRealtime()));
    }

    public final void onActivitySaveInstanceState(Activity arg2, Bundle arg3) {
        this.zzaps.zzgb().onActivitySaveInstanceState(arg2, arg3);
    }

    public final void onActivityStarted(Activity arg1) {
    }

    public final void onActivityStopped(Activity arg1) {
    }
}

