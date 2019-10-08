package com.jagex.mobilesdk.notifications;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat$Builder;

public class LocalNotificationScheduler extends BroadcastReceiver {
    public LocalNotificationScheduler() {
        super();
    }

    public void onReceive(Context arg6, Intent arg7) {
        Object v0 = arg6.getSystemService("notification");
        Parcelable v1 = arg7.getParcelableExtra("Notification");
        if(v1 == null) {
            return;
        }

        ((NotificationManager)v0).notify(arg7.getIntExtra("Notification ID", 0), ((Notification)v1));
        int v2 = arg7.getIntExtra("Group ID", -1);
        if(v2 > -1) {
            String v7 = arg7.getStringExtra("Group Name");
            if(v7 == null) {
                return;
            }
            else {
                ((NotificationManager)v0).notify(v2, new Builder(arg6, "GameNotifications").setContentIntent(((Notification)v1).contentIntent).setSmallIcon(arg6.getApplicationInfo().icon).setGroup(v7).setGroupSummary(true).setAutoCancel(true).build());
            }
        }
    }
}

