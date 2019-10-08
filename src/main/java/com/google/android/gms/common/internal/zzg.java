package com.google.android.gms.common.internal;

import android.content.Intent;
import android.net.Uri$Builder;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;

public final class zzg {
    private static final Uri zzed;
    private static final Uri zzee;

    static {
        Uri v0 = Uri.parse("https://plus.google.com/");
        zzg.zzed = v0;
        zzg.zzee = v0.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent zza(String arg3, @Nullable String arg4) {
        Intent v0 = new Intent("android.intent.action.VIEW");
        Uri$Builder v3 = Uri.parse("market://details").buildUpon().appendQueryParameter("id", arg3);
        if(!TextUtils.isEmpty(((CharSequence)arg4))) {
            v3.appendQueryParameter("pcampaignid", arg4);
        }

        v0.setData(v3.build());
        v0.setPackage("com.android.vending");
        v0.addFlags(0x80000);
        return v0;
    }

    public static Intent zzg(String arg2) {
        Uri v2 = Uri.fromParts("package", arg2, null);
        Intent v0 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        v0.setData(v2);
        return v0;
    }

    public static Intent zzs() {
        Intent v0 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        v0.setPackage("com.google.android.wearable.app");
        return v0;
    }
}

