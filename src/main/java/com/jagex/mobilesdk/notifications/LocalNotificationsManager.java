package com.jagex.mobilesdk.notifications;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build$VERSION;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat$Builder;
import androidx.core.app.NotificationManagerCompat;
import java.util.Random;

public class LocalNotificationsManager {
    private static final String CHANNEL_DESCRIPTION = "Channel for Game notifications";
    public static final String CHANNEL_ID = "GameNotifications";
    private static final String CHANNEL_NAME = "Game Notifications";
    public static final int DEFAULT_GROUP_ID = -1;
    public static final String GROUP_ID = "Group ID";
    public static final String GROUP_NAME = "Group Name";
    public static final String NOTIFICATION = "Notification";
    public static final String NOTIFICATION_ID = "Notification ID";
    private static final int NO_NOTIFICATION_ID = -1;
    private final Activity activity;
    private static final Random randomNumberGenerator;

    static {
        LocalNotificationsManager.randomNumberGenerator = new Random();
    }

    public LocalNotificationsManager(@NonNull Activity arg5) {
        super();
        this.activity = arg5;
        if(Build$VERSION.SDK_INT >= 26) {
            NotificationChannel v1 = new NotificationChannel("GameNotifications", "Game Notifications", 3);
            v1.setDescription("Channel for Game notifications");
            arg5.getSystemService(NotificationManager.class).createNotificationChannel(v1);
        }
    }

    public void cancelNotification(int arg4) {
        PendingIntent v4 = PendingIntent.getBroadcast(this.activity, arg4, new Intent(this.activity, LocalNotificationScheduler.class), 0x20000000);
        if(v4 != null) {
            v4.cancel();
            this.activity.getSystemService("alarm").cancel(v4);
        }
    }

    private Builder createGroupedNotificationBuilder(String arg4, String arg5, int arg6, String arg7) {
        return new Builder(this.activity, "GameNotifications").setContentIntent(this.createLaunchActivityIntent()).setSmallIcon(this.activity.getApplicationInfo().icon).setContentTitle(((CharSequence)arg4)).setContentText(((CharSequence)arg5)).setPriority(arg6).setGroup(arg7).setAutoCancel(true);
    }

    private PendingIntent createLaunchActivityIntent() {
        Intent v0 = new Intent(this.activity, this.activity.getClass());
        v0.setFlags(0x20000000);
        return PendingIntent.getActivity(this.activity, 0, v0, 0x8000000);
    }

    private Notification createNotification(String arg4, String arg5, int arg6, int arg7) {
        return new Builder(this.activity, "GameNotifications").setContentIntent(this.createLaunchActivityIntent()).setSmallIcon(this.activity.getApplicationInfo().icon).setContentTitle(((CharSequence)arg4)).setContentText(((CharSequence)arg5)).setPriority(arg6).setGroup(Integer.toString(arg7)).setAutoCancel(true).build();
    }

    public boolean getNotificationSetting(Activity arg1) {
        return NotificationManagerCompat.from(arg1.getApplicationContext()).areNotificationsEnabled();
    }

    public boolean isNotificationScheduled(int arg4) {
        boolean v4 = PendingIntent.getBroadcast(this.activity, arg4, new Intent(this.activity, LocalNotificationScheduler.class), 0x20000000) != null ? true : false;
        return v4;
    }

    public void openNotificationSettings(Activity arg4) {
        Intent v0 = new Intent();
        v0.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        v0.putExtra("app_package", arg4.getPackageName());
        v0.putExtra("app_uid", arg4.getApplicationInfo().uid);
        v0.putExtra("android.provider.extra.APP_PACKAGE", arg4.getPackageName());
        arg4.startActivity(v0);
    }

    public int sendGroupedNotification(String arg6, String arg7, int arg8, int arg9, String arg10, int arg11) {
        int v0 = LocalNotificationsManager.randomNumberGenerator.nextInt(0x7FFFFFFF);
        if(arg8 < -2) {
            arg8 = -2;
        }

        int v1 = 2;
        if(arg8 > v1) {
            arg8 = 2;
        }

        int v2 = -1;
        if(arg9 <= v2) {
            return v2;
        }

        if(arg11 == 0) {
            NotificationManagerCompat v11 = NotificationManagerCompat.from(this.activity);
            v11.notify(v0, this.createGroupedNotificationBuilder(arg6, arg7, arg8, arg10).build());
            v11.notify(arg9, this.createGroupedNotificationBuilder(arg6, arg7, arg8, arg10).setContentTitle(((CharSequence)arg6)).setContentText(((CharSequence)arg7)).setGroupSummary(true).build());
            return v0;
        }

        if(arg11 > 0) {
            Intent v2_1 = new Intent(this.activity, LocalNotificationScheduler.class);
            v2_1.putExtra("Notification ID", v0);
            v2_1.putExtra("Notification", this.createGroupedNotificationBuilder(arg6, arg7, arg8, arg10).build());
            v2_1.putExtra("Group ID", arg9);
            v2_1.putExtra("Group Name", arg10);
            PendingIntent v6 = PendingIntent.getBroadcast(this.activity, v0, v2_1, 0x8000000);
            if(v6 != null) {
                this.activity.getSystemService("alarm").set(v1, SystemClock.elapsedRealtime() + (((long)(arg11 * 1000))), v6);
            }

            return v0;
        }

        return v2;
    }

    public int sendNotification(String arg6, String arg7, int arg8, int arg9) {
        int v0 = LocalNotificationsManager.randomNumberGenerator.nextInt(0x7FFFFFFF);
        if(arg8 < -2) {
            arg8 = -2;
        }

        int v1 = 2;
        if(arg8 > v1) {
            arg8 = 2;
        }

        if(arg9 == 0) {
            NotificationManagerCompat.from(this.activity).notify(v0, this.createNotification(arg6, arg7, arg8, v0));
            return v0;
        }

        if(arg9 > 0) {
            Intent v2 = new Intent(this.activity, LocalNotificationScheduler.class);
            v2.putExtra("Notification ID", v0);
            v2.putExtra("Notification", this.createNotification(arg6, arg7, arg8, v0));
            PendingIntent v6 = PendingIntent.getBroadcast(this.activity, v0, v2, 0x8000000);
            if(v6 != null) {
                this.activity.getSystemService("alarm").set(v1, SystemClock.elapsedRealtime() + (((long)(arg9 * 1000))), v6);
            }

            return v0;
        }

        return -1;
    }
}

