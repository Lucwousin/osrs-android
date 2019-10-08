package com.google.firebase.iid;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

final class zzax {
    private final long timestamp;
    final String zzbu;
    private static final long zzdk;
    private final String zzdl;

    static {
        zzax.zzdk = TimeUnit.DAYS.toMillis(7);
    }

    private zzax(String arg1, String arg2, long arg3) {
        super();
        this.zzbu = arg1;
        this.zzdl = arg2;
        this.timestamp = arg3;
    }

    static String zza(String arg2, String arg3, long arg4) {
        try {
            JSONObject v0 = new JSONObject();
            v0.put("token", arg2);
            v0.put("appVersion", arg3);
            v0.put("timestamp", arg4);
            return v0.toString();
        }
        catch(JSONException v2) {
            arg2 = String.valueOf(v2);
            StringBuilder v5 = new StringBuilder(String.valueOf(arg2).length() + 24);
            v5.append("Failed to encode token: ");
            v5.append(arg2);
            Log.w("FirebaseInstanceId", v5.toString());
            return null;
        }
    }

    static String zzb(@Nullable zzax arg0) {
        if(arg0 == null) {
            return null;
        }

        return arg0.zzbu;
    }

    static zzax zzi(String arg6) {
        zzax v1 = null;
        if(TextUtils.isEmpty(((CharSequence)arg6))) {
            return v1;
        }

        if(arg6.startsWith("{")) {
            try {
                JSONObject v0 = new JSONObject(arg6);
                return new zzax(v0.getString("token"), v0.getString("appVersion"), v0.getLong("timestamp"));
            }
            catch(JSONException v6) {
                arg6 = String.valueOf(v6);
                StringBuilder v3 = new StringBuilder(String.valueOf(arg6).length() + 23);
                v3.append("Failed to parse token: ");
                v3.append(arg6);
                Log.w("FirebaseInstanceId", v3.toString());
                return v1;
            }
        }

        return new zzax(arg6, ((String)v1), 0);
    }

    final boolean zzj(String arg7) {
        if(System.currentTimeMillis() <= this.timestamp + zzax.zzdk) {
            if(!arg7.equals(this.zzdl)) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }
}

