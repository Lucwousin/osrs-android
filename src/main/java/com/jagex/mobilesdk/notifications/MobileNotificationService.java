package com.jagex.mobilesdk.notifications;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.jagex.mobilesdk.common.comms.CommsResult;

public class MobileNotificationService extends FirebaseMessagingService {
    public MobileNotificationService() {
        super();
    }

    public static void getLatestDeviceToken(MobileNotificationServiceListener arg2) {
        FirebaseInstanceId.getInstance().getInstanceId().addOnCompleteListener(new OnCompleteListener(arg2) {
            public void onComplete(@NonNull Task arg4) {
                if(!arg4.isSuccessful()) {
                    this.val$listener.onResult(new CommsResult("", -1));
                    return;
                }

                this.val$listener.onResult(new CommsResult(arg4.getResult().getToken(), 0));
            }
        });
    }

    public static void initPushNotificationService(Context arg2) {
        FirebaseMessaging.getInstance().setAutoInitEnabled(true);
        FirebaseAnalytics.getInstance(arg2).setAnalyticsCollectionEnabled(true);
    }

    public void onMessageReceived(RemoteMessage arg1) {
    }

    public void onNewToken(String arg1) {
    }
}

