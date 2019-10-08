package com.google.android.gms.internal.firebase_messaging;

import android.annotation.TargetApi;
import android.content.res.Resources$NotFoundException;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;

public final class zzq {
    private final Bundle zzcl;
    final String zzeo;

    public zzq(String arg1, Bundle arg2) {
        super();
        this.zzeo = Preconditions.checkNotNull(arg1);
        this.zzcl = Preconditions.checkNotNull(arg2);
    }

    public final String getString(String arg2) {
        return zzac.zza(this.zzcl, arg2);
    }

    @Nullable private final String zza(String[] arg5) {
        int v0 = arg5.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            String v2 = this.getString(arg5[v1]);
            if(!TextUtils.isEmpty(((CharSequence)v2))) {
                return v2;
            }
        }

        return null;
    }

    @TargetApi(value=26) final boolean zza(Resources arg4, int arg5) {
        StringBuilder v1;
        String v4;
        if(Build$VERSION.SDK_INT != 26) {
            return 1;
        }

        Resources$Theme v0 = null;
        try {
            if(!(arg4.getDrawable(arg5, v0) instanceof AdaptiveIconDrawable)) {
                return 1;
            }

            v4 = this.zzeo;
            v1 = new StringBuilder(77);
            v1.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            v1.append(arg5);
            Log.e(v4, v1.toString());
            return 0;
        }
        catch(Resources$NotFoundException ) {
            v4 = this.zzeo;
            v1 = new StringBuilder(66);
            v1.append("Couldn\'t find resource ");
            v1.append(arg5);
            v1.append(", treating it as an invalid icon");
            Log.e(v4, v1.toString());
            return 0;
        }

        return 1;
    }

    public final String zzav() {
        return this.zza(new String[]{"gcm.n.sound2", "gcm.n.sound"});
    }

    @Nullable public final Uri zzaw() {
        String v0 = this.zza(new String[]{"gcm.n.link_android", "gcm.n.link"});
        if(TextUtils.isEmpty(((CharSequence)v0))) {
            return null;
        }

        return Uri.parse(v0);
    }

    public final String[] zzn(String arg4) {
        Object[] v4 = this.zzo(arg4);
        if(v4 == null) {
            return null;
        }

        String[] v0 = new String[v4.length];
        int v1;
        for(v1 = 0; v1 < v4.length; ++v1) {
            v0[v1] = String.valueOf(v4[v1]);
        }

        return v0;
    }

    private final Object[] zzo(String arg7) {
        String[] v3;
        Bundle v0 = this.zzcl;
        String v1 = String.valueOf(arg7);
        String v2 = String.valueOf("_loc_args");
        v1 = v2.length() != 0 ? v1.concat(v2) : new String(v1);
        String v0_1 = zzac.zza(v0, v1);
        Object[] v2_1 = null;
        if(TextUtils.isEmpty(((CharSequence)v0_1))) {
            return v2_1;
        }

        try {
            JSONArray v1_1 = new JSONArray(v0_1);
            v3 = new String[v1_1.length()];
            int v4;
            for(v4 = 0; v4 < v3.length; ++v4) {
                v3[v4] = v1_1.opt(v4);
            }
        }
        catch(JSONException ) {
            goto label_28;
        }

        return ((Object[])v3);
    label_28:
        v1 = this.zzeo;
        arg7 = String.valueOf(arg7);
        String v3_1 = String.valueOf("_loc_args");
        arg7 = v3_1.length() != 0 ? arg7.concat(v3_1) : new String(arg7);
        arg7 = arg7.substring(6);
        StringBuilder v4_1 = new StringBuilder(String.valueOf(arg7).length() + 41 + String.valueOf(v0_1).length());
        v4_1.append("Malformed ");
        v4_1.append(arg7);
        v4_1.append(": ");
        v4_1.append(v0_1);
        v4_1.append("  Default value will be used.");
        Log.w(v1, v4_1.toString());
        return v2_1;
    }

    public final String zzp(String arg4) {
        Bundle v0 = this.zzcl;
        arg4 = String.valueOf(arg4);
        String v1 = String.valueOf("_loc_key");
        arg4 = v1.length() != 0 ? arg4.concat(v1) : new String(arg4);
        return zzac.zza(v0, arg4);
    }
}

