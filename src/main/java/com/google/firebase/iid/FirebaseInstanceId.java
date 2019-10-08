package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build$VERSION;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.FirebaseApp;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Subscriber;
import com.google.firebase.platforminfo.UserAgentPublisher;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;

public class FirebaseInstanceId {
    final class zza {
        private final boolean zzbd;
        private final Subscriber zzbe;
        @Nullable @GuardedBy(value="this") private EventHandler zzbf;
        @Nullable @GuardedBy(value="this") private Boolean zzbg;

        zza(FirebaseInstanceId arg2, Subscriber arg3) {
            this.zzbh = arg2;
            super();
            this.zzbe = arg3;
            this.zzbd = this.zzu();
            this.zzbg = this.zzt();
            if(this.zzbg == null && (this.zzbd)) {
                this.zzbf = new zzq(this);
                arg3.subscribe(DataCollectionDefaultChange.class, this.zzbf);
            }
        }

        final boolean isEnabled() {
            boolean v0_1;
            __monitor_enter(this);
            try {
                if(this.zzbg == null) {
                    goto label_7;
                }

                v0_1 = this.zzbg.booleanValue();
            }
            catch(Throwable v0) {
                goto label_20;
            }

            __monitor_exit(this);
            return v0_1;
            try {
            label_7:
                if(this.zzbd) {
                    if(!FirebaseInstanceId.zza(this.zzbh).isDataCollectionDefaultEnabled()) {
                        goto label_16;
                    }

                    goto label_13;
                }

                goto label_16;
            }
            catch(Throwable v0) {
            label_20:
                __monitor_exit(this);
                throw v0;
            }

        label_13:
            __monitor_exit(this);
            return 1;
        label_16:
            __monitor_exit(this);
            return 0;
        }

        final void setEnabled(boolean arg4) {
            __monitor_enter(this);
            try {
                if(this.zzbf != null) {
                    this.zzbe.unsubscribe(DataCollectionDefaultChange.class, this.zzbf);
                    this.zzbf = null;
                }

                SharedPreferences$Editor v0 = FirebaseInstanceId.zza(this.zzbh).getApplicationContext().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                v0.putBoolean("auto_init", arg4);
                v0.apply();
                if(arg4) {
                    FirebaseInstanceId.zzb(this.zzbh);
                }

                this.zzbg = Boolean.valueOf(arg4);
            }
            catch(Throwable v4) {
                __monitor_exit(this);
                throw v4;
            }

            __monitor_exit(this);
        }

        @Nullable private final Boolean zzt() {
            Context v0 = FirebaseInstanceId.zza(this.zzbh).getApplicationContext();
            SharedPreferences v1 = v0.getSharedPreferences("com.google.firebase.messaging", 0);
            if(v1.contains("auto_init")) {
                return Boolean.valueOf(v1.getBoolean("auto_init", false));
            }

            try {
                PackageManager v1_1 = v0.getPackageManager();
                if(v1_1 != null) {
                    ApplicationInfo v0_1 = v1_1.getApplicationInfo(v0.getPackageName(), 0x80);
                    if(v0_1 != null && v0_1.metaData != null && (v0_1.metaData.containsKey("firebase_messaging_auto_init_enabled"))) {
                        return Boolean.valueOf(v0_1.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    }
                }

                return null;
            }
            catch(PackageManager$NameNotFoundException ) {
                return null;
            }
        }

        private final boolean zzu() {
            try {
                Class.forName("com.google.firebase.messaging.FirebaseMessaging");
                return 1;
            }
            catch(ClassNotFoundException ) {
                Context v1 = FirebaseInstanceId.zza(this.zzbh).getApplicationContext();
                Intent v2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                v2.setPackage(v1.getPackageName());
                ResolveInfo v1_1 = v1.getPackageManager().resolveService(v2, 0);
                if(v1_1 != null && v1_1.serviceInfo != null) {
                    return 1;
                }

                return 0;
            }
        }
    }

    private static final long zzan;
    private static zzaw zzao;
    @VisibleForTesting @GuardedBy(value="FirebaseInstanceId.class") private static ScheduledThreadPoolExecutor zzap;
    private final Executor zzaq;
    private final FirebaseApp zzar;
    private final zzan zzas;
    private MessagingChannel zzat;
    private final zzaq zzau;
    private final zzba zzav;
    @GuardedBy(value="this") private boolean zzaw;
    private final zza zzax;

    static {
        FirebaseInstanceId.zzan = TimeUnit.HOURS.toSeconds(8);
    }

    FirebaseInstanceId(FirebaseApp arg8, Subscriber arg9, UserAgentPublisher arg10) {
        this(arg8, new zzan(arg8.getApplicationContext()), zzi.zzg(), zzi.zzg(), arg9, arg10);
    }

    private FirebaseInstanceId(FirebaseApp arg4, zzan arg5, Executor arg6, Executor arg7, Subscriber arg8, UserAgentPublisher arg9) {
        super();
        this.zzaw = false;
        if(zzan.zza(arg4) != null) {
            Class v0 = FirebaseInstanceId.class;
            __monitor_enter(v0);
            try {
                if(FirebaseInstanceId.zzao == null) {
                    FirebaseInstanceId.zzao = new zzaw(arg4.getApplicationContext());
                }

                __monitor_exit(v0);
            }
            catch(Throwable v4) {
                try {
                label_47:
                    __monitor_exit(v0);
                }
                catch(Throwable v4) {
                    goto label_47;
                }

                throw v4;
            }

            this.zzar = arg4;
            this.zzas = arg5;
            if(this.zzat == null) {
                Object v0_1 = arg4.get(MessagingChannel.class);
                if(v0_1 != null && (((MessagingChannel)v0_1).isAvailable())) {
                    this.zzat = ((MessagingChannel)v0_1);
                    goto label_28;
                }

                this.zzat = new zzr(arg4, arg5, arg6, arg9);
            }

        label_28:
            this.zzat = this.zzat;
            this.zzaq = arg7;
            this.zzav = new zzba(FirebaseInstanceId.zzao);
            this.zzax = new zza(this, arg8);
            this.zzau = new zzaq(arg6);
            if(this.zzax.isEnabled()) {
                this.zzh();
            }

            return;
        }

        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    @WorkerThread public void deleteInstanceId() throws IOException {
        if(Looper.getMainLooper() != Looper.myLooper()) {
            this.zza(this.zzat.deleteInstanceId(FirebaseInstanceId.zzj()));
            this.zzn();
            return;
        }

        throw new IOException("MAIN_THREAD");
    }

    @WorkerThread public void deleteToken(String arg4, String arg5) throws IOException {
        if(Looper.getMainLooper() != Looper.myLooper()) {
            arg5 = FirebaseInstanceId.zzd(arg5);
            this.zza(this.zzat.deleteToken(FirebaseInstanceId.zzj(), zzax.zzb(FirebaseInstanceId.zzb(arg4, arg5)), arg4, arg5));
            FirebaseInstanceId.zzao.zzc("", arg4, arg5);
            return;
        }

        throw new IOException("MAIN_THREAD");
    }

    public long getCreationTime() {
        return FirebaseInstanceId.zzao.zzg("").getCreationTime();
    }

    @WorkerThread public String getId() {
        this.zzh();
        return FirebaseInstanceId.zzj();
    }

    public static FirebaseInstanceId getInstance() {
        return FirebaseInstanceId.getInstance(FirebaseApp.getInstance());
    }

    @Keep public static FirebaseInstanceId getInstance(@NonNull FirebaseApp arg1) {
        return arg1.get(FirebaseInstanceId.class);
    }

    @NonNull public Task getInstanceId() {
        return this.zza(zzan.zza(this.zzar), "*");
    }

    @Nullable @Deprecated public String getToken() {
        zzax v0 = this.zzk();
        if((this.zzat.needsRefresh()) || (this.zza(v0))) {
            this.startSync();
        }

        return zzax.zzb(v0);
    }

    @WorkerThread public String getToken(String arg3, String arg4) throws IOException {
        if(Looper.getMainLooper() != Looper.myLooper()) {
            return this.zza(this.zza(arg3, arg4)).getToken();
        }

        throw new IOException("MAIN_THREAD");
    }

    private final void startSync() {
        __monitor_enter(this);
        try {
            if(!this.zzaw) {
                this.zza(0);
            }
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    final void zza(long arg12) {
        __monitor_enter(this);
        long v0 = 30;
        long v3 = arg12 << 1;
        try {
            FirebaseInstanceId.zza(new zzay(this, this.zzas, this.zzav, Math.min(Math.max(v0, v3), FirebaseInstanceId.zzan)), arg12);
            this.zzaw = true;
        }
        catch(Throwable v12) {
            __monitor_exit(this);
            throw v12;
        }

        __monitor_exit(this);
    }

    private final Task zza(String arg4, String arg5) {
        return Tasks.forResult(null).continueWithTask(this.zzaq, new zzn(this, arg4, FirebaseInstanceId.zzd(arg5)));
    }

    static FirebaseApp zza(FirebaseInstanceId arg0) {
        return arg0.zzar;
    }

    private final Object zza(Task arg4) throws IOException {
        long v0 = 30000;
        try {
            return Tasks.await(arg4, v0, TimeUnit.MILLISECONDS);
        }
        catch(TimeoutException ) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        catch(ExecutionException v4) {
            Throwable v0_1 = v4.getCause();
            if((v0_1 instanceof IOException)) {
                if("INSTANCE_ID_RESET".equals(v0_1.getMessage())) {
                    this.zzn();
                }

                throw v0_1;
            }

            if((v0_1 instanceof RuntimeException)) {
                throw v0_1;
            }

            throw new IOException(((Throwable)v4));
        }
    }

    static void zza(Runnable arg5, long arg6) {
        Class v0 = FirebaseInstanceId.class;
        __monitor_enter(v0);
        try {
            if(FirebaseInstanceId.zzap == null) {
                FirebaseInstanceId.zzap = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("FirebaseInstanceId"));
            }

            FirebaseInstanceId.zzap.schedule(arg5, arg6, TimeUnit.SECONDS);
            __monitor_exit(v0);
            return;
        label_17:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_17;
        }

        throw v5;
    }

    final boolean zza(@Nullable zzax arg2) {
        if(arg2 != null) {
            if(arg2.zzj(this.zzas.zzad())) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    public final Task zza(String arg2) {
        Task v2_1;
        __monitor_enter(this);
        try {
            v2_1 = this.zzav.zza(arg2);
            this.startSync();
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
        return v2_1;
    }

    final Task zza(String arg8, String arg9, Task arg10) throws Exception {
        String v2 = FirebaseInstanceId.zzj();
        zzax v10 = FirebaseInstanceId.zzb(arg8, arg9);
        if(!this.zzat.needsRefresh() && !this.zza(v10)) {
            return Tasks.forResult(new zzx(v2, v10.zzbu));
        }

        return this.zzau.zza(arg8, arg9, new zzo(this, v2, zzax.zzb(v10), arg8, arg9));
    }

    final Task zza(String arg3, String arg4, String arg5, String arg6) {
        return this.zzat.getToken(arg3, arg4, arg5, arg6).onSuccessTask(this.zzaq, new zzp(this, arg5, arg6, arg3));
    }

    final void zza(boolean arg1) {
        __monitor_enter(this);
        try {
            this.zzaw = arg1;
        }
        catch(Throwable v1) {
            __monitor_exit(this);
            throw v1;
        }

        __monitor_exit(this);
    }

    @Nullable @VisibleForTesting private static zzax zzb(String arg2, String arg3) {
        return FirebaseInstanceId.zzao.zzb("", arg2, arg3);
    }

    static void zzb(FirebaseInstanceId arg0) {
        arg0.zzh();
    }

    final Task zzb(String arg7, String arg8, String arg9, String arg10) throws Exception {
        FirebaseInstanceId.zzao.zza("", arg7, arg8, arg10, this.zzas.zzad());
        return Tasks.forResult(new zzx(arg9, arg10));
    }

    final void zzb(String arg4) throws IOException {
        zzax v0 = this.zzk();
        if(!this.zza(v0)) {
            this.zza(this.zzat.subscribeToTopic(FirebaseInstanceId.zzj(), v0.zzbu, arg4));
            return;
        }

        throw new IOException("token not available");
    }

    @VisibleForTesting public final void zzb(boolean arg2) {
        this.zzax.setEnabled(arg2);
    }

    final void zzc(String arg4) throws IOException {
        zzax v0 = this.zzk();
        if(!this.zza(v0)) {
            this.zza(this.zzat.unsubscribeFromTopic(FirebaseInstanceId.zzj(), v0.zzbu, arg4));
            return;
        }

        throw new IOException("token not available");
    }

    private static String zzd(String arg1) {
        if(!arg1.isEmpty() && !arg1.equalsIgnoreCase("fcm")) {
            if(arg1.equalsIgnoreCase("gcm")) {
            }
            else {
                return arg1;
            }
        }

        return "*";
    }

    private final void zzh() {
        zzax v0 = this.zzk();
        if((this.zzr()) || (this.zza(v0)) || (this.zzav.zzap())) {
            this.startSync();
        }
    }

    final FirebaseApp zzi() {
        return this.zzar;
    }

    private static String zzj() {
        return zzan.zza(FirebaseInstanceId.zzao.zzg("").getKeyPair());
    }

    @Nullable final zzax zzk() {
        return FirebaseInstanceId.zzb(zzan.zza(this.zzar), "*");
    }

    final String zzl() throws IOException {
        return this.getToken(zzan.zza(this.zzar), "*");
    }

    static boolean zzm() {
        int v1 = 3;
        if(!Log.isLoggable("FirebaseInstanceId", v1) && (Build$VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseInstanceId", v1))) {
            return 0;
        }

        return 1;
    }

    final void zzn() {
        __monitor_enter(this);
        try {
            FirebaseInstanceId.zzao.zzal();
            if(this.zzax.isEnabled()) {
                this.startSync();
            }
        }
        catch(Throwable v0) {
            __monitor_exit(this);
            throw v0;
        }

        __monitor_exit(this);
    }

    final boolean zzo() {
        return this.zzat.isAvailable();
    }

    final void zzp() {
        FirebaseInstanceId.zzao.zzh("");
        this.startSync();
    }

    @VisibleForTesting public final boolean zzq() {
        return this.zzax.isEnabled();
    }

    final boolean zzr() {
        return this.zzat.needsRefresh();
    }
}

