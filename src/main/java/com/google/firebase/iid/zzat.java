package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

final class zzat {
    private final Context zzac;
    private final zzan zzas;
    private static int zzcj;
    private static PendingIntent zzcv;
    @GuardedBy(value="responseCallbacks") private final SimpleArrayMap zzcw;
    private Messenger zzcx;
    private Messenger zzcy;
    private zzl zzcz;

    static {
    }

    public zzat(Context arg2, zzan arg3) {
        super();
        this.zzcw = new SimpleArrayMap();
        this.zzac = arg2;
        this.zzas = arg3;
        this.zzcx = new Messenger(new zzau(this, Looper.getMainLooper()));
    }

    private static void zza(Context arg3, Intent arg4) {
        Class v0 = zzat.class;
        __monitor_enter(v0);
        try {
            if(zzat.zzcv == null) {
                Intent v1 = new Intent();
                v1.setPackage("com.google.example.invalidpackage");
                zzat.zzcv = PendingIntent.getBroadcast(arg3, 0, v1, 0);
            }

            arg4.putExtra("app", zzat.zzcv);
        }
        catch(Throwable v3) {
            __monitor_exit(v0);
            throw v3;
        }

        __monitor_exit(v0);
    }

    static void zza(zzat arg0, Message arg1) {
        arg0.zzb(arg1);
    }

    private final void zza(String arg4, Bundle arg5) {
        SimpleArrayMap v0 = this.zzcw;
        __monitor_enter(v0);
        try {
            Object v1 = this.zzcw.remove(arg4);
            if(v1 == null) {
                String v5 = "FirebaseInstanceId";
                String v1_1 = "Missing callback for ";
                arg4 = String.valueOf(arg4);
                arg4 = arg4.length() != 0 ? v1_1.concat(arg4) : new String(v1_1);
                Log.w(v5, arg4);
                __monitor_exit(v0);
                return;
            }

            ((TaskCompletionSource)v1).setResult(arg5);
            __monitor_exit(v0);
            return;
        label_21:
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            goto label_21;
        }

        throw v4;
    }

    private static String zzah() {
        String v1_2;
        Class v0 = zzat.class;
        __monitor_enter(v0);
        try {
            int v1_1 = zzat.zzcj;
            zzat.zzcj = v1_1 + 1;
            v1_2 = Integer.toString(v1_1);
        }
        catch(Throwable v1) {
            __monitor_exit(v0);
            throw v1;
        }

        __monitor_exit(v0);
        return v1_2;
    }

    private final void zzb(Message arg9) {
        String v1;
        String v9_1;
        if(arg9 == null || !(arg9.obj instanceof Intent)) {
            Log.w("FirebaseInstanceId", "Dropping invalid message");
        }
        else {
            Object v0 = arg9.obj;
            ((Intent)v0).setExtrasClassLoader(new zza());
            if(((Intent)v0).hasExtra("google.messenger")) {
                Parcelable v0_1 = ((Intent)v0).getParcelableExtra("google.messenger");
                if((v0_1 instanceof zzl)) {
                    this.zzcz = v0_1;
                }

                if(!(v0_1 instanceof Messenger)) {
                    goto label_20;
                }

                this.zzcy = ((Messenger)v0_1);
            }

        label_20:
            Object v9 = arg9.obj;
            String v0_2 = ((Intent)v9).getAction();
            int v2 = 3;
            if(!"com.google.android.c2dm.intent.REGISTRATION".equals(v0_2)) {
                if(Log.isLoggable("FirebaseInstanceId", v2)) {
                    v9_1 = "FirebaseInstanceId";
                    v1 = "Unexpected response action: ";
                    v0_2 = String.valueOf(v0_2);
                    v0_2 = v0_2.length() != 0 ? v1.concat(v0_2) : new String(v1);
                    Log.d(v9_1, v0_2);
                }

                return;
            }

            v0_2 = ((Intent)v9).getStringExtra("registration_id");
            if(v0_2 == null) {
                v0_2 = ((Intent)v9).getStringExtra("unregistered");
            }

            int v1_1 = 2;
            if(v0_2 == null) {
                v0_2 = ((Intent)v9).getStringExtra("error");
                if(v0_2 == null) {
                    v9_1 = String.valueOf(((Intent)v9).getExtras());
                    StringBuilder v2_1 = new StringBuilder(String.valueOf(v9_1).length() + 49);
                    v2_1.append("Unexpected response, no error or registration id ");
                    v2_1.append(v9_1);
                    Log.w("FirebaseInstanceId", v2_1.toString());
                    return;
                }

                if(Log.isLoggable("FirebaseInstanceId", v2)) {
                    String v4 = "FirebaseInstanceId";
                    String v5 = "Received InstanceID error ";
                    String v6 = String.valueOf(v0_2);
                    v5 = v6.length() != 0 ? v5.concat(v6) : new String(v5);
                    Log.d(v4, v5);
                }

                if(v0_2.startsWith("|")) {
                    String[] v4_1 = v0_2.split("\\|");
                    if(v4_1.length > v1_1) {
                        if(!"ID".equals(v4_1[1])) {
                        }
                        else {
                            v0_2 = v4_1[v1_1];
                            v1 = v4_1[v2];
                            if(v1.startsWith(":")) {
                                v1 = v1.substring(1);
                            }

                            this.zza(v0_2, ((Intent)v9).putExtra("error", v1).getExtras());
                            return;
                        }
                    }

                    v9_1 = "FirebaseInstanceId";
                    v1 = "Unexpected structured response ";
                    v0_2 = String.valueOf(v0_2);
                    v0_2 = v0_2.length() != 0 ? v1.concat(v0_2) : new String(v1);
                    Log.w(v9_1, v0_2);
                    return;
                }

                SimpleArrayMap v4_2 = this.zzcw;
                __monitor_enter(v4_2);
                int v0_3 = 0;
                try {
                    while(v0_3 < this.zzcw.size()) {
                        this.zza(this.zzcw.keyAt(v0_3), ((Intent)v9).getExtras());
                        ++v0_3;
                    }

                    __monitor_exit(v4_2);
                    return;
                label_128:
                    __monitor_exit(v4_2);
                }
                catch(Throwable v9_2) {
                    goto label_128;
                }

                throw v9_2;
            }

            Matcher v4_3 = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(((CharSequence)v0_2));
            if(!v4_3.matches()) {
                if(Log.isLoggable("FirebaseInstanceId", v2)) {
                    v9_1 = "FirebaseInstanceId";
                    v1 = "Unexpected response string: ";
                    v0_2 = String.valueOf(v0_2);
                    v0_2 = v0_2.length() != 0 ? v1.concat(v0_2) : new String(v1);
                    Log.d(v9_1, v0_2);
                }

                return;
            }

            v0_2 = v4_3.group(1);
            v1 = v4_3.group(v1_1);
            Bundle v9_3 = ((Intent)v9).getExtras();
            v9_3.putString("registration_id", v1);
            this.zza(v0_2, v9_3);
            return;
        }
    }

    final Bundle zzc(Bundle arg6) throws IOException {
        if(this.zzas.zzaf() >= 12000000) {
            Task v0 = zzab.zzc(this.zzac).zzb(1, arg6);
            try {
                return Tasks.await(v0);
            }
            catch(ExecutionException v0_1) {
                if(Log.isLoggable("FirebaseInstanceId", 3)) {
                    String v2 = String.valueOf(v0_1);
                    StringBuilder v4 = new StringBuilder(String.valueOf(v2).length() + 22);
                    v4.append("Error making request: ");
                    v4.append(v2);
                    Log.d("FirebaseInstanceId", v4.toString());
                }

                if(((((Exception)v0_1).getCause() instanceof zzal)) && ((Exception)v0_1).getCause().getErrorCode() == 4) {
                    return this.zzd(arg6);
                }

                return null;
            }
        }

        return this.zzd(arg6);
    }

    private final Bundle zzd(Bundle arg3) throws IOException {
        Bundle v0 = this.zze(arg3);
        if(v0 != null && (v0.containsKey("google.messenger"))) {
            v0 = this.zze(arg3);
            if(v0 != null && (v0.containsKey("google.messenger"))) {
                v0 = null;
            }
        }

        return v0;
    }

    private final Bundle zze(Bundle arg9) throws IOException {
        SimpleArrayMap v1_1;
        Object v9_3;
        String v0 = zzat.zzah();
        TaskCompletionSource v1 = new TaskCompletionSource();
        SimpleArrayMap v2 = this.zzcw;
        __monitor_enter(v2);
        try {
            this.zzcw.put(v0, v1);
            __monitor_exit(v2);
        }
        catch(Throwable v9) {
            try {
            label_128:
                __monitor_exit(v2);
            }
            catch(Throwable v9) {
                goto label_128;
            }

            throw v9;
        }

        if(this.zzas.zzac() != 0) {
            Intent v2_1 = new Intent();
            v2_1.setPackage("com.google.android.gms");
            int v4 = 2;
            if(this.zzas.zzac() == v4) {
                v2_1.setAction("com.google.iid.TOKEN_REQUEST");
            }
            else {
                v2_1.setAction("com.google.android.c2dm.intent.REGISTER");
            }

            v2_1.putExtras(arg9);
            zzat.zza(this.zzac, v2_1);
            StringBuilder v5 = new StringBuilder(String.valueOf(v0).length() + 5);
            v5.append("|ID|");
            v5.append(v0);
            v5.append("|");
            v2_1.putExtra("kid", v5.toString());
            int v3 = 3;
            if(Log.isLoggable("FirebaseInstanceId", v3)) {
                String v5_1 = String.valueOf(v2_1.getExtras());
                StringBuilder v7 = new StringBuilder(String.valueOf(v5_1).length() + 8);
                v7.append("Sending ");
                v7.append(v5_1);
                Log.d("FirebaseInstanceId", v7.toString());
            }

            v2_1.putExtra("google.messenger", this.zzcx);
            if(this.zzcy != null || this.zzcz != null) {
                Message v9_1 = Message.obtain();
                v9_1.obj = v2_1;
                try {
                    if(this.zzcy != null) {
                        this.zzcy.send(v9_1);
                        goto label_88;
                    }

                    this.zzcz.send(v9_1);
                    goto label_88;
                }
                catch(RemoteException ) {
                    if(!Log.isLoggable("FirebaseInstanceId", v3)) {
                        goto label_80;
                    }

                    Log.d("FirebaseInstanceId", "Messenger failed, fallback to startService");
                }
            }

        label_80:
            if(this.zzas.zzac() == v4) {
                this.zzac.sendBroadcast(v2_1);
                goto label_88;
            }

            this.zzac.startService(v2_1);
            try {
            label_88:
                v9_3 = Tasks.await(v1.getTask(), 30000, TimeUnit.MILLISECONDS);
                v1_1 = this.zzcw;
            }
            catch(Throwable v9) {
            }
            catch(ExecutionException v9_2) {
                try {
                    throw new IOException(((Throwable)v9_2));
                }
                catch(Throwable v9) {
                label_114:
                    v1_1 = this.zzcw;
                    __monitor_enter(v1_1);
                    try {
                        this.zzcw.remove(v0);
                        __monitor_exit(v1_1);
                    }
                    catch(Throwable v9) {
                        try {
                        label_121:
                            __monitor_exit(v1_1);
                        }
                        catch(Throwable v9) {
                            goto label_121;
                        }

                        throw v9;
                    }

                    throw v9;
                }
            }
            catch(TimeoutException ) {
                try {
                    Log.w("FirebaseInstanceId", "No response");
                    throw new IOException("TIMEOUT");
                }
                catch(Throwable v9) {
                    goto label_114;
                }
            }

            __monitor_enter(v1_1);
            try {
                this.zzcw.remove(v0);
                __monitor_exit(v1_1);
                return ((Bundle)v9_3);
            label_99:
                __monitor_exit(v1_1);
            }
            catch(Throwable v9) {
                goto label_99;
            }

            throw v9;
        }

        throw new IOException("MISSING_INSTANCEID_SERVICE");
    }
}

