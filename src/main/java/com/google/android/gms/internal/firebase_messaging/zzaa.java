package com.google.android.gms.internal.firebase_messaging;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.Arrays;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;

public final class zzaa extends zzz {
    private final zzs zzfb;
    private final zzq zzfc;

    public zzaa(zzs arg1, zzq arg2) {
        super();
        this.zzfb = arg1;
        this.zzfc = arg2;
    }

    @Nullable public final String getChannelId() {
        String v1 = null;
        if(!PlatformVersion.isAtLeastO()) {
            return v1;
        }

        if(this.zzfb.zzbc() < 26) {
            return v1;
        }

        String v0 = this.zzs("gcm.n.android_channel_id");
        if(this.zzfb.zzl(v0)) {
            return v0;
        }

        v0 = "com.google.firebase.messaging.default_notification_channel_id";
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            v0 = this.zzfb.zzaz().getString(v0);
            if(this.zzfb.zzl(v0)) {
                return v0;
            }
        }

        v0 = this.zzfb.zzat();
        if(this.zzfb.zzl(v0)) {
            return v0;
        }

        return v1;
    }

    @Nullable public final Uri getSound() {
        String v0 = this.zzs("gcm.n.sound2");
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
        }
        else {
            v0 = this.zzs("gcm.n.sound");
        }

        Uri v2 = null;
        if(TextUtils.isEmpty(((CharSequence)v0))) {
            return v2;
        }

        int v3 = 2;
        if(TextUtils.isEmpty(((CharSequence)v0))) {
        }
        else {
            if(!"default".equals(v0)) {
                int v1 = this.zzfb.zzay().getIdentifier(v0, "raw", this.zzfb.getPackageName()) != 0 ? 1 : 0;
                if(v1 == 0) {
                    goto label_48;
                }

                String v1_1 = this.zzfb.getPackageName();
                StringBuilder v4 = new StringBuilder(String.valueOf(v1_1).length() + 24 + String.valueOf(v0).length());
                v4.append("android.resource://");
                v4.append(v1_1);
                v4.append("/raw/");
                v4.append(v0);
                v2 = Uri.parse(v4.toString());
                goto label_49;
            }

        label_48:
            v2 = RingtoneManager.getDefaultUri(v3);
        }

    label_49:
        if(v2 != null) {
            return v2;
        }

        return RingtoneManager.getDefaultUri(v3);
    }

    @Nullable public final String getTag() {
        String v0 = this.zzs("gcm.n.tag");
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            return v0;
        }

        v0 = this.zzfb.zzbd();
        long v1 = SystemClock.uptimeMillis();
        StringBuilder v4 = new StringBuilder(String.valueOf(v0).length() + 21);
        v4.append(v0);
        v4.append(":");
        v4.append(v1);
        return v4.toString();
    }

    @Nullable public final CharSequence getTitle() {
        String v0 = this.zzs("gcm.n.title");
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            return ((CharSequence)v0);
        }

        v0 = this.zzt("gcm.n.title");
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            return ((CharSequence)v0);
        }

        CharSequence v0_1 = this.zzfb.getAppLabel();
        if(!TextUtils.isEmpty(v0_1)) {
            return v0_1;
        }

        return "";
    }

    private static Integer zzb(CharSequence arg0) {
        try {
            return Integer.valueOf(Color.parseColor(String.valueOf(arg0)));
        }
        catch(IllegalArgumentException ) {
            return null;
        }
    }

    @Nullable public final CharSequence zzbf() {
        String v0 = this.zzs("gcm.n.body");
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            return ((CharSequence)v0);
        }

        v0 = this.zzt("gcm.n.body");
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            return ((CharSequence)v0);
        }

        return null;
    }

    @Nullable public final Integer zzbg() {
        Integer v0_1;
        String v0 = this.zzs("gcm.n.color");
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            v0_1 = zzaa.zzb(((CharSequence)v0));
            if(v0_1 != null) {
                return v0_1;
            }
        }

        v0 = "com.google.firebase.messaging.default_notification_color";
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            int v0_2 = this.zzfb.zzaz().getInt(v0, 0);
            if(v0_2 != 0) {
                v0_1 = this.zzfb.zzb(v0_2);
                if(v0_1 != null) {
                    return v0_1;
                }
            }
        }

        return null;
    }

    @Nullable public final PendingIntent zzbh() {
        Intent v0_1;
        String v0 = this.zzs("gcm.n.click_action");
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            v0_1 = new Intent(v0).setPackage(this.zzfb.getPackageName()).setFlags(0x10000000);
        }
        else {
            v0 = this.zzs("gcm.n.link_android");
            if(!TextUtils.isEmpty(((CharSequence)v0))) {
                v0_1 = this.zzr(v0);
            }
            else {
                v0 = this.zzs("gcm.n.link");
                v0_1 = !TextUtils.isEmpty(((CharSequence)v0)) ? this.zzr(v0) : this.zzfb.zzba();
            }
        }

        if(v0_1 == null) {
            return null;
        }

        v0_1.addFlags(0x4000000);
        Bundle v2 = new Bundle(this.zzfb.getData());
        Iterator v1 = v2.keySet().iterator();
        while(v1.hasNext()) {
            Object v3 = v1.next();
            if(v3 == null) {
                continue;
            }

            if(!((String)v3).startsWith("google.c.") && !((String)v3).startsWith("gcm.n.") && !((String)v3).startsWith("gcm.notification.")) {
                continue;
            }

            v1.remove();
        }

        v0_1.putExtras(v2);
        return this.zzfb.zze(v0_1);
    }

    @Nullable public final PendingIntent zzbi() {
        return this.zzfb.zzau();
    }

    @Nullable public final Integer zzbj() {
        int v0_1;
        String v0 = this.zzs("gcm.n.icon");
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            String[] v1 = new String[]{"drawable", "mipmap"};
            int v3 = 0;
            while(true) {
                if(v3 < 2) {
                    int v4 = this.zzfb.zzay().getIdentifier(v0, v1[v3], this.zzfb.getPackageName());
                    if(this.zze(v4)) {
                        return Integer.valueOf(v4);
                    }
                    else {
                        ++v3;
                        continue;
                    }
                }
                else {
                    break;
                }

                goto label_37;
            }

            String v1_1 = this.zzfc.zzeo;
            StringBuilder v4_1 = new StringBuilder(String.valueOf(v0).length() + 61);
            v4_1.append("Icon resource ");
            v4_1.append(v0);
            v4_1.append(" not found. Notification will use default icon.");
            Log.w(v1_1, v4_1.toString());
        }

    label_37:
        v0 = "com.google.firebase.messaging.default_notification_icon";
        if(!TextUtils.isEmpty(((CharSequence)v0))) {
            v0_1 = this.zzfb.zzaz().getInt(v0, 0);
            if(this.zze(v0_1)) {
                return Integer.valueOf(v0_1);
            }
        }

        v0_1 = this.zzfb.zzbb();
        if(this.zze(v0_1)) {
            return Integer.valueOf(v0_1);
        }

        return Integer.valueOf(0x1080093);
    }

    private final boolean zze(int arg3) {
        if(arg3 != 0 && (this.zzfc.zza(this.zzfb.zzay(), arg3))) {
            return 1;
        }

        return 0;
    }

    private final Intent zzr(String arg3) {
        return new Intent("android.intent.action.VIEW").setPackage(this.zzfb.getPackageName()).setData(Uri.parse(arg3));
    }

    private final String zzs(String arg4) {
        String v0 = this.zzfb.getData().getString(arg4);
        if(v0 != null) {
            return v0;
        }

        return this.zzfb.getData().getString(arg4.replace("gcm.n.", "gcm.notification."));
    }

    private final String zzt(String arg7) {
        String v3;
        String v0 = String.valueOf(arg7);
        String v1 = String.valueOf("_loc_key");
        v0 = v1.length() != 0 ? v0.concat(v1) : new String(v0);
        v0 = this.zzs(v0);
        String v2 = null;
        if(TextUtils.isEmpty(((CharSequence)v0))) {
            return v2;
        }

        int v0_1 = this.zzfb.zzay().getIdentifier(v0, "string", this.zzfb.getPackageName());
        if(v0_1 == 0) {
            v0 = this.zzfc.zzeo;
            v1 = String.valueOf(arg7);
            v3 = String.valueOf("_loc_key");
            v1 = v3.length() != 0 ? v1.concat(v3) : new String(v1);
            v1 = v1.substring(6);
            StringBuilder v4 = new StringBuilder(String.valueOf(v1).length() + 49 + String.valueOf(arg7).length());
            v4.append(v1);
            v4.append(" resource not found: ");
            v4.append(arg7);
            v4.append(" Default value will be used.");
            Log.w(v0, v4.toString());
            return v2;
        }

        String[] v1_1 = this.zzfc.zzn(arg7);
        if(v1_1 == null) {
            return this.zzfb.zzay().getString(v0_1);
        }

        try {
            return this.zzfb.zzay().getString(v0_1, ((Object[])v1_1));
        }
        catch(MissingFormatArgumentException v0_2) {
            v3 = this.zzfc.zzeo;
            v1 = Arrays.toString(((Object[])v1_1));
            StringBuilder v5 = new StringBuilder(String.valueOf(arg7).length() + 58 + String.valueOf(v1).length());
            v5.append("Missing format argument for ");
            v5.append(arg7);
            v5.append(": ");
            v5.append(v1);
            v5.append(" Default value will be used.");
            Log.w(v3, v5.toString(), ((Throwable)v0_2));
            return v2;
        }
    }
}

