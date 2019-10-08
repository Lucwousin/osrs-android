package androidx.core.content;

import android.accessibilityservice.AccessibilityService;
import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import java.util.HashMap;

public class ContextCompat {
    final class LegacyServiceMapHolder {
        static final HashMap SERVICES;

        static {
            LegacyServiceMapHolder.SERVICES = new HashMap();
            if(Build$VERSION.SDK_INT > 22) {
                LegacyServiceMapHolder.SERVICES.put(SubscriptionManager.class, "telephony_subscription_service");
                LegacyServiceMapHolder.SERVICES.put(UsageStatsManager.class, "usagestats");
            }

            if(Build$VERSION.SDK_INT > 21) {
                LegacyServiceMapHolder.SERVICES.put(AppWidgetManager.class, "appwidget");
                LegacyServiceMapHolder.SERVICES.put(BatteryManager.class, "batterymanager");
                LegacyServiceMapHolder.SERVICES.put(CameraManager.class, "camera");
                LegacyServiceMapHolder.SERVICES.put(JobScheduler.class, "jobscheduler");
                LegacyServiceMapHolder.SERVICES.put(LauncherApps.class, "launcherapps");
                LegacyServiceMapHolder.SERVICES.put(MediaProjectionManager.class, "media_projection");
                LegacyServiceMapHolder.SERVICES.put(MediaSessionManager.class, "media_session");
                LegacyServiceMapHolder.SERVICES.put(RestrictionsManager.class, "restrictions");
                LegacyServiceMapHolder.SERVICES.put(TelecomManager.class, "telecom");
                LegacyServiceMapHolder.SERVICES.put(TvInputManager.class, "tv_input");
            }

            if(Build$VERSION.SDK_INT > 19) {
                LegacyServiceMapHolder.SERVICES.put(AppOpsManager.class, "appops");
                LegacyServiceMapHolder.SERVICES.put(CaptioningManager.class, "captioning");
                LegacyServiceMapHolder.SERVICES.put(ConsumerIrManager.class, "consumer_ir");
                LegacyServiceMapHolder.SERVICES.put(PrintManager.class, "print");
            }

            if(Build$VERSION.SDK_INT > 18) {
                LegacyServiceMapHolder.SERVICES.put(BluetoothManager.class, "bluetooth");
            }

            if(Build$VERSION.SDK_INT > 17) {
                LegacyServiceMapHolder.SERVICES.put(DisplayManager.class, "display");
                LegacyServiceMapHolder.SERVICES.put(UserManager.class, "user");
            }

            if(Build$VERSION.SDK_INT > 16) {
                LegacyServiceMapHolder.SERVICES.put(InputManager.class, "input");
                LegacyServiceMapHolder.SERVICES.put(MediaRouter.class, "media_router");
                LegacyServiceMapHolder.SERVICES.put(NsdManager.class, "servicediscovery");
            }

            LegacyServiceMapHolder.SERVICES.put(AccessibilityService.class, "accessibility");
            LegacyServiceMapHolder.SERVICES.put(AccountManager.class, "account");
            LegacyServiceMapHolder.SERVICES.put(ActivityManager.class, "activity");
            LegacyServiceMapHolder.SERVICES.put(AlarmManager.class, "alarm");
            LegacyServiceMapHolder.SERVICES.put(AudioManager.class, "audio");
            LegacyServiceMapHolder.SERVICES.put(ClipboardManager.class, "clipboard");
            LegacyServiceMapHolder.SERVICES.put(ConnectivityManager.class, "connectivity");
            LegacyServiceMapHolder.SERVICES.put(DevicePolicyManager.class, "device_policy");
            LegacyServiceMapHolder.SERVICES.put(DownloadManager.class, "download");
            LegacyServiceMapHolder.SERVICES.put(DropBoxManager.class, "dropbox");
            LegacyServiceMapHolder.SERVICES.put(InputMethodManager.class, "input_method");
            LegacyServiceMapHolder.SERVICES.put(KeyguardManager.class, "keyguard");
            LegacyServiceMapHolder.SERVICES.put(LayoutInflater.class, "layout_inflater");
            LegacyServiceMapHolder.SERVICES.put(LocationManager.class, "location");
            LegacyServiceMapHolder.SERVICES.put(NfcManager.class, "nfc");
            LegacyServiceMapHolder.SERVICES.put(NotificationManager.class, "notification");
            LegacyServiceMapHolder.SERVICES.put(PowerManager.class, "power");
            LegacyServiceMapHolder.SERVICES.put(SearchManager.class, "search");
            LegacyServiceMapHolder.SERVICES.put(SensorManager.class, "sensor");
            LegacyServiceMapHolder.SERVICES.put(StorageManager.class, "storage");
            LegacyServiceMapHolder.SERVICES.put(TelephonyManager.class, "phone");
            LegacyServiceMapHolder.SERVICES.put(TextServicesManager.class, "textservices");
            LegacyServiceMapHolder.SERVICES.put(UiModeManager.class, "uimode");
            LegacyServiceMapHolder.SERVICES.put(UsbManager.class, "usb");
            LegacyServiceMapHolder.SERVICES.put(Vibrator.class, "vibrator");
            LegacyServiceMapHolder.SERVICES.put(WallpaperManager.class, "wallpaper");
            LegacyServiceMapHolder.SERVICES.put(WifiP2pManager.class, "wifip2p");
            LegacyServiceMapHolder.SERVICES.put(WifiManager.class, "wifi");
            LegacyServiceMapHolder.SERVICES.put(WindowManager.class, "window");
        }

        private LegacyServiceMapHolder() {
            super();
        }
    }

    private static final String TAG = "ContextCompat";
    private static final Object sLock;
    private static TypedValue sTempValue;

    static {
        ContextCompat.sLock = new Object();
    }

    protected ContextCompat() {
        super();
    }

    private static File buildPath(File arg4, String[] arg5) {
        int v0 = arg5.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            String v2 = arg5[v1];
            if(arg4 == null) {
                arg4 = new File(v2);
            }
            else if(v2 != null) {
                arg4 = new File(arg4, v2);
            }
        }

        return arg4;
    }

    public static int checkSelfPermission(@NonNull Context arg2, @NonNull String arg3) {
        if(arg3 != null) {
            return arg2.checkPermission(arg3, Process.myPid(), Process.myUid());
        }

        throw new IllegalArgumentException("permission is null");
    }

    @Nullable public static Context createDeviceProtectedStorageContext(@NonNull Context arg2) {
        if(Build$VERSION.SDK_INT >= 24) {
            return arg2.createDeviceProtectedStorageContext();
        }

        return null;
    }

    private static File createFilesDir(File arg4) {
        Class v0 = ContextCompat.class;
        __monitor_enter(v0);
        try {
            if(!arg4.exists() && !arg4.mkdirs()) {
                if(arg4.exists()) {
                    goto label_8;
                }
                else {
                    goto label_10;
                }
            }

            goto label_22;
        }
        catch(Throwable v4) {
            goto label_25;
        }

    label_8:
        __monitor_exit(v0);
        return arg4;
        try {
        label_10:
            Log.w("ContextCompat", "Unable to create files subdir " + arg4.getPath());
        }
        catch(Throwable v4) {
        label_25:
            __monitor_exit(v0);
            throw v4;
        }

        __monitor_exit(v0);
        return null;
    label_22:
        __monitor_exit(v0);
        return arg4;
    }

    public static File getCodeCacheDir(@NonNull Context arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getCodeCacheDir();
        }

        return ContextCompat.createFilesDir(new File(arg2.getApplicationInfo().dataDir, "code_cache"));
    }

    @ColorInt public static int getColor(@NonNull Context arg2, @ColorRes int arg3) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg2.getColor(arg3);
        }

        return arg2.getResources().getColor(arg3);
    }

    @Nullable public static ColorStateList getColorStateList(@NonNull Context arg2, @ColorRes int arg3) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg2.getColorStateList(arg3);
        }

        return arg2.getResources().getColorStateList(arg3);
    }

    @Nullable public static File getDataDir(@NonNull Context arg2) {
        if(Build$VERSION.SDK_INT >= 24) {
            return arg2.getDataDir();
        }

        String v2 = arg2.getApplicationInfo().dataDir;
        File v0 = v2 != null ? new File(v2) : null;
        return v0;
    }

    @Nullable public static Drawable getDrawable(@NonNull Context arg4, @DrawableRes int arg5) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg4.getDrawable(arg5);
        }

        if(Build$VERSION.SDK_INT >= 16) {
            return arg4.getResources().getDrawable(arg5);
        }

        Object v0 = ContextCompat.sLock;
        __monitor_enter(v0);
        try {
            if(ContextCompat.sTempValue == null) {
                ContextCompat.sTempValue = new TypedValue();
            }

            arg4.getResources().getValue(arg5, ContextCompat.sTempValue, true);
            arg5 = ContextCompat.sTempValue.resourceId;
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            try {
            label_29:
                __monitor_exit(v0);
            }
            catch(Throwable v4) {
                goto label_29;
            }

            throw v4;
        }

        return arg4.getResources().getDrawable(arg5);
    }

    @NonNull public static File[] getExternalCacheDirs(@NonNull Context arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.getExternalCacheDirs();
        }

        return new File[]{arg2.getExternalCacheDir()};
    }

    @NonNull public static File[] getExternalFilesDirs(@NonNull Context arg2, @Nullable String arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.getExternalFilesDirs(arg3);
        }

        return new File[]{arg2.getExternalFilesDir(arg3)};
    }

    @Nullable public static File getNoBackupFilesDir(@NonNull Context arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getNoBackupFilesDir();
        }

        return ContextCompat.createFilesDir(new File(arg2.getApplicationInfo().dataDir, "no_backup"));
    }

    @NonNull public static File[] getObbDirs(@NonNull Context arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.getObbDirs();
        }

        return new File[]{arg2.getObbDir()};
    }

    @Nullable public static Object getSystemService(@NonNull Context arg2, @NonNull Class arg3) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg2.getSystemService(arg3);
        }

        String v3 = ContextCompat.getSystemServiceName(arg2, arg3);
        Object v2 = v3 != null ? arg2.getSystemService(v3) : null;
        return v2;
    }

    @Nullable public static String getSystemServiceName(@NonNull Context arg2, @NonNull Class arg3) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg2.getSystemServiceName(arg3);
        }

        return LegacyServiceMapHolder.SERVICES.get(arg3);
    }

    public static boolean isDeviceProtectedStorage(@NonNull Context arg2) {
        if(Build$VERSION.SDK_INT >= 24) {
            return arg2.isDeviceProtectedStorage();
        }

        return 0;
    }

    public static boolean startActivities(@NonNull Context arg2, @NonNull Intent[] arg3, @Nullable Bundle arg4) {
        if(Build$VERSION.SDK_INT >= 16) {
            arg2.startActivities(arg3, arg4);
        }
        else {
            arg2.startActivities(arg3);
        }

        return 1;
    }

    public static boolean startActivities(@NonNull Context arg1, @NonNull Intent[] arg2) {
        return ContextCompat.startActivities(arg1, arg2, null);
    }

    public static void startActivity(@NonNull Context arg2, @NonNull Intent arg3, @Nullable Bundle arg4) {
        if(Build$VERSION.SDK_INT >= 16) {
            arg2.startActivity(arg3, arg4);
        }
        else {
            arg2.startActivity(arg3);
        }
    }

    public static void startForegroundService(@NonNull Context arg2, @NonNull Intent arg3) {
        if(Build$VERSION.SDK_INT >= 26) {
            arg2.startForegroundService(arg3);
        }
        else {
            arg2.startService(arg3);
        }
    }
}

