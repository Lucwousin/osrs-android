package com.google.firebase.iid;

import android.os.Build$VERSION;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.Executor;

final class zzr implements MessagingChannel {
    private final Executor executor;
    private final FirebaseApp zzar;
    private final zzan zzas;
    private final zzat zzbm;
    private final UserAgentPublisher zzbn;

    zzr(FirebaseApp arg7, zzan arg8, Executor arg9, UserAgentPublisher arg10) {
        this(arg7, arg8, arg9, new zzat(arg7.getApplicationContext(), arg8), arg10);
    }

    @VisibleForTesting private zzr(FirebaseApp arg1, zzan arg2, Executor arg3, zzat arg4, UserAgentPublisher arg5) {
        super();
        this.zzar = arg1;
        this.zzas = arg2;
        this.zzbm = arg4;
        this.executor = arg3;
        this.zzbn = arg5;
    }

    public final Task ackMessage(String arg1) {
        return null;
    }

    public final Task buildChannel(String arg1, String arg2) {
        return Tasks.forResult(null);
    }

    public final Task deleteInstanceId(String arg4) {
        Bundle v0 = new Bundle();
        v0.putString("iid-operation", "delete");
        v0.putString("delete", "1");
        return this.zzb(this.zzc(this.zza(arg4, "*", "*", v0)));
    }

    public final Task deleteToken(String arg3, String arg4, String arg5, String arg6) {
        Bundle v4 = new Bundle();
        v4.putString("delete", "1");
        return this.zzb(this.zzc(this.zza(arg3, arg5, arg6, v4)));
    }

    public final Task getToken(String arg1, String arg2, String arg3, String arg4) {
        return this.zzc(this.zza(arg1, arg3, arg4, new Bundle()));
    }

    public final boolean isAvailable() {
        if(this.zzas.zzac() != 0) {
            return 1;
        }

        return 0;
    }

    public final boolean isChannelBuilt() {
        return 1;
    }

    public final boolean needsRefresh() {
        return 0;
    }

    public final Task subscribeToTopic(String arg6, String arg7, String arg8) {
        Bundle v0 = new Bundle();
        String v1 = "gcm.topic";
        String v2 = String.valueOf("/topics/");
        String v3 = String.valueOf(arg8);
        v2 = v3.length() != 0 ? v2.concat(v3) : new String(v2);
        v0.putString(v1, v2);
        v1 = String.valueOf("/topics/");
        arg8 = String.valueOf(arg8);
        arg8 = arg8.length() != 0 ? v1.concat(arg8) : new String(v1);
        return this.zzb(this.zzc(this.zza(arg6, arg7, arg8, v0)));
    }

    public final Task unsubscribeFromTopic(String arg6, String arg7, String arg8) {
        Bundle v0 = new Bundle();
        String v1 = "gcm.topic";
        String v2 = String.valueOf("/topics/");
        String v3 = String.valueOf(arg8);
        v2 = v3.length() != 0 ? v2.concat(v3) : new String(v2);
        v0.putString(v1, v2);
        v0.putString("delete", "1");
        v1 = String.valueOf("/topics/");
        arg8 = String.valueOf(arg8);
        arg8 = arg8.length() != 0 ? v1.concat(arg8) : new String(v1);
        return this.zzb(this.zzc(this.zza(arg6, arg7, arg8, v0)));
    }

    final void zza(Bundle arg2, TaskCompletionSource arg3) {
        try {
            arg3.setResult(this.zzbm.zzc(arg2));
            return;
        }
        catch(IOException v2) {
            arg3.setException(((Exception)v2));
            return;
        }
    }

    private final Task zza(String arg2, String arg3, String arg4, Bundle arg5) {
        arg5.putString("scope", arg4);
        arg5.putString("sender", arg3);
        arg5.putString("subtype", arg3);
        arg5.putString("appid", arg2);
        arg5.putString("gmp_app_id", this.zzar.getOptions().getApplicationId());
        arg5.putString("gmsv", Integer.toString(this.zzas.zzaf()));
        arg5.putString("osv", Integer.toString(Build$VERSION.SDK_INT));
        arg5.putString("app_ver", this.zzas.zzad());
        arg5.putString("app_ver_name", this.zzas.zzae());
        arg5.putString("cliv", "fiid-12451000");
        arg5.putString("Firebase-Client", this.zzbn.getUserAgent());
        TaskCompletionSource v2 = new TaskCompletionSource();
        this.executor.execute(new zzs(this, arg5, v2));
        return v2.getTask();
    }

    private static String zza(Bundle arg2) throws IOException {
        if(arg2 != null) {
            String v0 = arg2.getString("registration_id");
            if(v0 != null) {
                return v0;
            }

            v0 = arg2.getString("unregistered");
            if(v0 != null) {
                return v0;
            }

            v0 = arg2.getString("error");
            if(!"RST".equals(v0)) {
                if(v0 != null) {
                    throw new IOException(v0);
                }

                String v2 = String.valueOf(arg2);
                StringBuilder v1 = new StringBuilder(String.valueOf(v2).length() + 21);
                v1.append("Unexpected response: ");
                v1.append(v2);
                Log.w("FirebaseInstanceId", v1.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }

            throw new IOException("INSTANCE_ID_RESET");
        }

        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static String zza(zzr arg0, Bundle arg1) throws IOException {
        return zzr.zza(arg1);
    }

    private final Task zzb(Task arg3) {
        return arg3.continueWith(zzi.zzf(), new zzt(this));
    }

    private final Task zzc(Task arg3) {
        return arg3.continueWith(this.executor, new zzu(this));
    }
}

