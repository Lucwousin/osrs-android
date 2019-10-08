package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;
import androidx.core.content.ContextCompat;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

final class zzaw {
    private final Context zzac;
    private final SharedPreferences zzdh;
    private final zzy zzdi;
    @GuardedBy(value="this") private final Map zzdj;

    public zzaw(Context arg2) {
        this(arg2, new zzy());
    }

    private zzaw(Context arg3, zzy arg4) {
        super();
        this.zzdj = new ArrayMap();
        this.zzac = arg3;
        this.zzdh = arg3.getSharedPreferences("com.google.android.gms.appid", 0);
        this.zzdi = arg4;
        File v0 = new File(ContextCompat.getNoBackupFilesDir(this.zzac), "com.google.android.gms.appid-no-backup");
        if(!v0.exists()) {
            try {
                if((v0.createNewFile()) && !this.isEmpty()) {
                    Log.i("FirebaseInstanceId", "App restored, clearing state");
                    this.zzal();
                    FirebaseInstanceId.getInstance().zzn();
                }
            }
            catch(IOException v3) {
                if(Log.isLoggable("FirebaseInstanceId", 3)) {
                    String v4 = "FirebaseInstanceId";
                    String v0_1 = "Error creating file in no backup dir: ";
                    String v3_1 = String.valueOf(v3.getMessage());
                    v3_1 = v3_1.length() != 0 ? v0_1.concat(v3_1) : new String(v0_1);
                    Log.d(v4, v3_1);
                }
                else {
                }

                return;
            }

            return;
        }
    }

    private final boolean isEmpty() {
        boolean v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.zzdh.getAll().isEmpty();
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public final void zza(String arg3, String arg4, String arg5, String arg6, String arg7) {
        __monitor_enter(this);
        try {
            arg6 = zzax.zza(arg6, arg7, System.currentTimeMillis());
            if(arg6 != null) {
                goto label_6;
            }
        }
        catch(Throwable v3) {
            goto label_14;
        }

        __monitor_exit(this);
        return;
        try {
        label_6:
            SharedPreferences$Editor v7 = this.zzdh.edit();
            v7.putString(zzaw.zza(arg3, arg4, arg5), arg6);
            v7.commit();
        }
        catch(Throwable v3) {
        label_14:
            __monitor_exit(this);
            throw v3;
        }

        __monitor_exit(this);
    }

    private static String zza(String arg2, String arg3, String arg4) {
        StringBuilder v1 = new StringBuilder(String.valueOf(arg2).length() + 4 + String.valueOf(arg3).length() + String.valueOf(arg4).length());
        v1.append(arg2);
        v1.append("|T|");
        v1.append(arg3);
        v1.append("|");
        v1.append(arg4);
        return v1.toString();
    }

    public final String zzak() {
        String v0_1;
        __monitor_enter(this);
        try {
            v0_1 = this.zzdh.getString("topic_operaion_queue", "");
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
        return v0_1;
    }

    public final void zzal() {
        __monitor_enter(this);
        try {
            this.zzdj.clear();
            zzy.zza(this.zzac);
            this.zzdh.edit().clear().commit();
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    public final zzax zzb(String arg2, String arg3, String arg4) {
        zzax v2_1;
        __monitor_enter(this);
        try {
            v2_1 = zzax.zzi(this.zzdh.getString(zzaw.zza(arg2, arg3, arg4), null));
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
        return v2_1;
    }

    public final void zzc(String arg1, String arg2, String arg3) {
        __monitor_enter(this);
        try {
            arg1 = zzaw.zza(arg1, arg2, arg3);
            SharedPreferences$Editor v2 = this.zzdh.edit();
            v2.remove(arg1);
            v2.commit();
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    static String zzd(String arg2, String arg3) {
        StringBuilder v1 = new StringBuilder(String.valueOf(arg2).length() + 3 + String.valueOf(arg3).length());
        v1.append(arg2);
        v1.append("|S|");
        v1.append(arg3);
        return v1.toString();
    }

    public final void zzf(String arg3) {
        __monitor_enter(this);
        try {
            this.zzdh.edit().putString("topic_operaion_queue", arg3).apply();
        }
        catch(Throwable v3) {
            __monitor_exit(this);
            throw v3;
        }

        __monitor_exit(this);
    }

    public final zzz zzg(String arg3) {
        zzz v0_1;
        Object v0;
        __monitor_enter(this);
        try {
            v0 = this.zzdj.get(arg3);
            if(v0 == null) {
                goto label_6;
            }
        }
        catch(Throwable v3) {
            goto label_23;
        }

        __monitor_exit(this);
        return ((zzz)v0);
        try {
        label_6:
            v0_1 = this.zzdi.zzb(this.zzac, arg3);
        }
        catch(zzaa ) {
            Log.w("FirebaseInstanceId", "Stored data is corrupt, generating new identity");
            FirebaseInstanceId.getInstance().zzn();
            v0_1 = this.zzdi.zzc(this.zzac, arg3);
        }

        this.zzdj.put(arg3, v0_1);
        goto label_20;
    label_23:
        __monitor_exit(this);
        throw v3;
    label_20:
        __monitor_exit(this);
        return v0_1;
    }

    public final void zzh(String arg5) {
        __monitor_enter(this);
        try {
            arg5 = String.valueOf(arg5).concat("|T|");
            SharedPreferences$Editor v0 = this.zzdh.edit();
            Iterator v1 = this.zzdh.getAll().keySet().iterator();
            while(v1.hasNext()) {
                Object v2 = v1.next();
                if(!((String)v2).startsWith(arg5)) {
                    continue;
                }

                v0.remove(((String)v2));
            }

            v0.commit();
        }
        catch(Throwable v5) {
            goto label_21;
        }

        __monitor_exit(this);
        return;
    label_21:
        __monitor_exit(this);
        throw v5;
    }
}

