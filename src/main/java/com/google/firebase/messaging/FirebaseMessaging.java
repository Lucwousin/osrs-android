package com.google.firebase.messaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.regex.Pattern;

public class FirebaseMessaging {
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private final FirebaseInstanceId zzdo;
    private static final Pattern zzdt;
    private static FirebaseMessaging zzdu;

    static {
        FirebaseMessaging.zzdt = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    }

    private FirebaseMessaging(FirebaseInstanceId arg1) {
        super();
        this.zzdo = arg1;
    }

    public static FirebaseMessaging getInstance() {
        FirebaseMessaging v1_1;
        Class v0 = FirebaseMessaging.class;
        __monitor_enter(v0);
        try {
            if(FirebaseMessaging.zzdu == null) {
                FirebaseMessaging.zzdu = new FirebaseMessaging(FirebaseInstanceId.getInstance());
            }

            v1_1 = FirebaseMessaging.zzdu;
        }
        catch(Throwable v1) {
            __monitor_exit(v0);
            throw v1;
        }

        __monitor_exit(v0);
        return v1_1;
    }

    public boolean isAutoInitEnabled() {
        return this.zzdo.zzq();
    }

    public void send(RemoteMessage arg6) {
        if(!TextUtils.isEmpty(arg6.getTo())) {
            Context v0 = FirebaseApp.getInstance().getApplicationContext();
            Intent v1 = new Intent("com.google.android.gcm.intent.SEND");
            Intent v2 = new Intent();
            v2.setPackage("com.google.example.invalidpackage");
            v1.putExtra("app", PendingIntent.getBroadcast(v0, 0, v2, 0));
            v1.setPackage("com.google.android.gms");
            v1.putExtras(arg6.zzdw);
            v0.sendOrderedBroadcast(v1, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }

        throw new IllegalArgumentException("Missing \'to\'");
    }

    public void setAutoInitEnabled(boolean arg2) {
        this.zzdo.zzb(arg2);
    }

    public Task subscribeToTopic(String arg4) {
        if(arg4 != null && (arg4.startsWith("/topics/"))) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only \'topic-name\' should be used in subscribeToTopic.");
            arg4 = arg4.substring(8);
        }

        if(arg4 != null && (FirebaseMessaging.zzdt.matcher(((CharSequence)arg4)).matches())) {
            FirebaseInstanceId v0 = this.zzdo;
            String v1 = String.valueOf("S!");
            arg4 = String.valueOf(arg4);
            arg4 = arg4.length() != 0 ? v1.concat(arg4) : new String(v1);
            return v0.zza(arg4);
        }

        StringBuilder v2 = new StringBuilder(String.valueOf(arg4).length() + 78);
        v2.append("Invalid topic name: ");
        v2.append(arg4);
        v2.append(" does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}");
        throw new IllegalArgumentException(v2.toString());
    }

    public Task unsubscribeFromTopic(String arg4) {
        if(arg4 != null && (arg4.startsWith("/topics/"))) {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only \'topic-name\' should be used in unsubscribeFromTopic.");
            arg4 = arg4.substring(8);
        }

        if(arg4 != null && (FirebaseMessaging.zzdt.matcher(((CharSequence)arg4)).matches())) {
            FirebaseInstanceId v0 = this.zzdo;
            String v1 = String.valueOf("U!");
            arg4 = String.valueOf(arg4);
            arg4 = arg4.length() != 0 ? v1.concat(arg4) : new String(v1);
            return v0.zza(arg4);
        }

        StringBuilder v2 = new StringBuilder(String.valueOf(arg4).length() + 78);
        v2.append("Invalid topic name: ");
        v2.append(arg4);
        v2.append(" does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}");
        throw new IllegalArgumentException(v2.toString());
    }
}

