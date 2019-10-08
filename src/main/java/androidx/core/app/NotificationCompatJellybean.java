package androidx.core.app;

import android.app.Notification$Builder;
import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RequiresApi(value=16) class NotificationCompatJellybean {
    static final String EXTRA_ALLOW_GENERATED_REPLIES = "android.support.allowGeneratedReplies";
    static final String EXTRA_DATA_ONLY_REMOTE_INPUTS = "android.support.dataRemoteInputs";
    private static final String KEY_ACTION_INTENT = "actionIntent";
    private static final String KEY_ALLOWED_DATA_TYPES = "allowedDataTypes";
    private static final String KEY_ALLOW_FREE_FORM_INPUT = "allowFreeFormInput";
    private static final String KEY_CHOICES = "choices";
    private static final String KEY_DATA_ONLY_REMOTE_INPUTS = "dataOnlyRemoteInputs";
    private static final String KEY_EXTRAS = "extras";
    private static final String KEY_ICON = "icon";
    private static final String KEY_LABEL = "label";
    private static final String KEY_REMOTE_INPUTS = "remoteInputs";
    private static final String KEY_RESULT_KEY = "resultKey";
    private static final String KEY_SEMANTIC_ACTION = "semanticAction";
    private static final String KEY_SHOWS_USER_INTERFACE = "showsUserInterface";
    private static final String KEY_TITLE = "title";
    public static final String TAG = "NotificationCompat";
    private static Class sActionClass;
    private static Field sActionIconField;
    private static Field sActionIntentField;
    private static Field sActionTitleField;
    private static boolean sActionsAccessFailed;
    private static Field sActionsField;
    private static final Object sActionsLock;
    private static Field sExtrasField;
    private static boolean sExtrasFieldAccessFailed;
    private static final Object sExtrasLock;

    static {
        NotificationCompatJellybean.sExtrasLock = new Object();
        NotificationCompatJellybean.sActionsLock = new Object();
    }

    private NotificationCompatJellybean() {
        super();
    }

    public static SparseArray buildActionExtrasMap(List arg4) {
        int v0 = arg4.size();
        SparseArray v1 = null;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            Object v3 = arg4.get(v2);
            if(v3 != null) {
                if(v1 == null) {
                    v1 = new SparseArray();
                }

                v1.put(v2, v3);
            }
        }

        return v1;
    }

    private static boolean ensureActionReflectionReadyLocked() {
        if(NotificationCompatJellybean.sActionsAccessFailed) {
            return 0;
        }

        try {
            if(NotificationCompatJellybean.sActionsField != null) {
                goto label_40;
            }

            NotificationCompatJellybean.sActionClass = Class.forName("android.app.Notification$Action");
            NotificationCompatJellybean.sActionIconField = NotificationCompatJellybean.sActionClass.getDeclaredField("icon");
            NotificationCompatJellybean.sActionTitleField = NotificationCompatJellybean.sActionClass.getDeclaredField("title");
            NotificationCompatJellybean.sActionIntentField = NotificationCompatJellybean.sActionClass.getDeclaredField("actionIntent");
            NotificationCompatJellybean.sActionsField = Notification.class.getDeclaredField("actions");
            NotificationCompatJellybean.sActionsField.setAccessible(true);
        }
        catch(NoSuchFieldException v1) {
            Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable)v1));
            NotificationCompatJellybean.sActionsAccessFailed = true;
        }
        catch(ClassNotFoundException v1_1) {
            Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable)v1_1));
            NotificationCompatJellybean.sActionsAccessFailed = true;
        }

    label_40:
        return 1 ^ NotificationCompatJellybean.sActionsAccessFailed;
    }

    private static RemoteInput fromBundle(Bundle arg8) {
        ArrayList v0 = arg8.getStringArrayList("allowedDataTypes");
        HashSet v7 = new HashSet();
        if(v0 != null) {
            Iterator v0_1 = v0.iterator();
            while(v0_1.hasNext()) {
                ((Set)v7).add(v0_1.next());
            }
        }

        return new RemoteInput(arg8.getString("resultKey"), arg8.getCharSequence("label"), arg8.getCharSequenceArray("choices"), arg8.getBoolean("allowFreeFormInput"), arg8.getBundle("extras"), ((Set)v7));
    }

    private static RemoteInput[] fromBundleArray(Bundle[] arg3) {
        if(arg3 == null) {
            return null;
        }

        RemoteInput[] v0 = new RemoteInput[arg3.length];
        int v1;
        for(v1 = 0; v1 < arg3.length; ++v1) {
            v0[v1] = NotificationCompatJellybean.fromBundle(arg3[v1]);
        }

        return v0;
    }

    public static Action getAction(Notification arg5, int arg6) {
        Action v5_4;
        Object v0 = NotificationCompatJellybean.sActionsLock;
        __monitor_enter(v0);
        Action v1 = null;
        try {
            Object[] v2 = NotificationCompatJellybean.getActionObjectsLocked(arg5);
            if(v2 == null) {
                goto label_31;
            }

            Object v2_1 = v2[arg6];
            Bundle v5_1 = NotificationCompatJellybean.getExtras(arg5);
            if(v5_1 != null) {
                SparseArray v5_2 = v5_1.getSparseParcelableArray("android.support.actionExtras");
                if(v5_2 != null) {
                    Object v5_3 = v5_2.get(arg6);
                }
                else {
                    goto label_13;
                }
            }
            else {
            label_13:
                v5_1 = ((Bundle)v1);
            }

            v5_4 = NotificationCompatJellybean.readAction(NotificationCompatJellybean.sActionIconField.getInt(v2_1), NotificationCompatJellybean.sActionTitleField.get(v2_1), NotificationCompatJellybean.sActionIntentField.get(v2_1), v5_1);
        }
        catch(IllegalAccessException v5) {
            Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable)v5));
            NotificationCompatJellybean.sActionsAccessFailed = true;
            goto label_31;
        }

        __monitor_exit(v0);
        return v5_4;
    label_31:
        __monitor_exit(v0);
        return v1;
        __monitor_exit(v0);
        throw v5_5;
    }

    public static int getActionCount(Notification arg1) {
        Object v0 = NotificationCompatJellybean.sActionsLock;
        __monitor_enter(v0);
        try {
            Object[] v1_1 = NotificationCompatJellybean.getActionObjectsLocked(arg1);
            int v1_2 = v1_1 != null ? v1_1.length : 0;
            __monitor_exit(v0);
            return v1_2;
        label_10:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_10;
        }

        throw v1;
    }

    static Action getActionFromBundle(Bundle arg12) {
        Bundle v0 = arg12.getBundle("extras");
        boolean v9 = v0 != null ? v0.getBoolean("android.support.allowGeneratedReplies", false) : false;
        return new Action(arg12.getInt("icon"), arg12.getCharSequence("title"), arg12.getParcelable("actionIntent"), arg12.getBundle("extras"), NotificationCompatJellybean.fromBundleArray(NotificationCompatJellybean.getBundleArrayFromBundle(arg12, "remoteInputs")), NotificationCompatJellybean.fromBundleArray(NotificationCompatJellybean.getBundleArrayFromBundle(arg12, "dataOnlyRemoteInputs")), v9, arg12.getInt("semanticAction"), arg12.getBoolean("showsUserInterface"));
    }

    private static Object[] getActionObjectsLocked(Notification arg4) {
        Object v4_2;
        Object v0 = NotificationCompatJellybean.sActionsLock;
        __monitor_enter(v0);
        try {
            Object[] v2 = null;
            if(!NotificationCompatJellybean.ensureActionReflectionReadyLocked()) {
                __monitor_exit(v0);
                return v2;
            }

            try {
                v4_2 = NotificationCompatJellybean.sActionsField.get(arg4);
                __monitor_exit(v0);
            }
            catch(IllegalAccessException v4_1) {
                Log.e("NotificationCompat", "Unable to access notification actions", ((Throwable)v4_1));
                NotificationCompatJellybean.sActionsAccessFailed = true;
                __monitor_exit(v0);
                return v2;
            }

            return ((Object[])v4_2);
        label_20:
            __monitor_exit(v0);
        }
        catch(Throwable v4) {
            goto label_20;
        }

        throw v4;
    }

    private static Bundle[] getBundleArrayFromBundle(Bundle arg3, String arg4) {
        Parcelable[] v0 = arg3.getParcelableArray(arg4);
        if(!(v0 instanceof Bundle[])) {
            if(v0 == null) {
            }
            else {
                Object[] v0_1 = Arrays.copyOf(((Object[])v0), v0.length, Bundle[].class);
                arg3.putParcelableArray(arg4, ((Parcelable[])v0_1));
                return ((Bundle[])v0_1);
            }
        }

        return ((Bundle[])v0);
    }

    static Bundle getBundleForAction(Action arg4) {
        Bundle v0 = new Bundle();
        v0.putInt("icon", arg4.getIcon());
        v0.putCharSequence("title", arg4.getTitle());
        v0.putParcelable("actionIntent", arg4.getActionIntent());
        Bundle v1 = arg4.getExtras() != null ? new Bundle(arg4.getExtras()) : new Bundle();
        v1.putBoolean("android.support.allowGeneratedReplies", arg4.getAllowGeneratedReplies());
        v0.putBundle("extras", v1);
        v0.putParcelableArray("remoteInputs", NotificationCompatJellybean.toBundleArray(arg4.getRemoteInputs()));
        v0.putBoolean("showsUserInterface", arg4.getShowsUserInterface());
        v0.putInt("semanticAction", arg4.getSemanticAction());
        return v0;
    }

    public static Bundle getExtras(Notification arg6) {
        Object v3_1;
        Field v3;
        Bundle v2;
        Object v0 = NotificationCompatJellybean.sExtrasLock;
        __monitor_enter(v0);
        try {
            v2 = null;
            if(!NotificationCompatJellybean.sExtrasFieldAccessFailed) {
                goto label_8;
            }

            __monitor_exit(v0);
            return v2;
        }
        catch(Throwable v6) {
            goto label_47;
        }

        try {
        label_8:
            if(NotificationCompatJellybean.sExtrasField == null) {
                v3 = Notification.class.getDeclaredField("extras");
                if(!Bundle.class.isAssignableFrom(v3.getType())) {
                    Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                    NotificationCompatJellybean.sExtrasFieldAccessFailed = true;
                    goto label_21;
                }
                else {
                    goto label_23;
                }
            }

            goto label_25;
        }
        catch(IllegalAccessException v6_1) {
            goto label_42;
        }
        catch(NoSuchFieldException v6_2) {
            goto label_37;
        }
        catch(Throwable v6) {
            goto label_47;
        }

        try {
        label_21:
            __monitor_exit(v0);
            return v2;
        }
        catch(Throwable v6) {
            goto label_47;
        }

        try {
        label_23:
            v3.setAccessible(true);
            NotificationCompatJellybean.sExtrasField = v3;
        label_25:
            v3_1 = NotificationCompatJellybean.sExtrasField.get(arg6);
            if(v3_1 == null) {
                Bundle v3_2 = new Bundle();
                NotificationCompatJellybean.sExtrasField.set(arg6, v3_2);
            }

            goto label_32;
        }
        catch(Throwable v6) {
        label_48:
            throw v6;
        }
        catch(NoSuchFieldException v6_2) {
        }
        catch(IllegalAccessException v6_1) {
            try {
            label_42:
                Log.e("NotificationCompat", "Unable to access notification extras", ((Throwable)v6_1));
                goto label_43;
            label_37:
                Log.e("NotificationCompat", "Unable to access notification extras", ((Throwable)v6_2));
            label_43:
                NotificationCompatJellybean.sExtrasFieldAccessFailed = true;
                __monitor_exit(v0);
                return v2;
            label_32:
                __monitor_exit(v0);
                return ((Bundle)v3_1);
            label_47:
                __monitor_exit(v0);
                goto label_48;
            }
            catch(Throwable v6) {
                goto label_47;
            }
        }
    }

    public static Action readAction(int arg11, CharSequence arg12, PendingIntent arg13, Bundle arg14) {
        boolean v7;
        RemoteInput[] v6;
        RemoteInput[] v5;
        RemoteInput[] v0 = null;
        if(arg14 != null) {
            v5 = NotificationCompatJellybean.fromBundleArray(NotificationCompatJellybean.getBundleArrayFromBundle(arg14, "android.support.remoteInputs"));
            v6 = NotificationCompatJellybean.fromBundleArray(NotificationCompatJellybean.getBundleArrayFromBundle(arg14, "android.support.dataRemoteInputs"));
            v7 = arg14.getBoolean("android.support.allowGeneratedReplies");
        }
        else {
            v5 = v0;
            v6 = v5;
            v7 = false;
        }

        return new Action(arg11, arg12, arg13, arg14, v5, v6, v7, 0, true);
    }

    private static Bundle toBundle(RemoteInput arg3) {
        Bundle v0 = new Bundle();
        v0.putString("resultKey", arg3.getResultKey());
        v0.putCharSequence("label", arg3.getLabel());
        v0.putCharSequenceArray("choices", arg3.getChoices());
        v0.putBoolean("allowFreeFormInput", arg3.getAllowFreeFormInput());
        v0.putBundle("extras", arg3.getExtras());
        Set v3 = arg3.getAllowedDataTypes();
        if(v3 != null && !v3.isEmpty()) {
            ArrayList v1 = new ArrayList(v3.size());
            Iterator v3_1 = v3.iterator();
            while(v3_1.hasNext()) {
                v1.add(v3_1.next());
            }

            v0.putStringArrayList("allowedDataTypes", v1);
        }

        return v0;
    }

    private static Bundle[] toBundleArray(RemoteInput[] arg3) {
        if(arg3 == null) {
            return null;
        }

        Bundle[] v0 = new Bundle[arg3.length];
        int v1;
        for(v1 = 0; v1 < arg3.length; ++v1) {
            v0[v1] = NotificationCompatJellybean.toBundle(arg3[v1]);
        }

        return v0;
    }

    public static Bundle writeActionAndGetExtras(Notification$Builder arg3, Action arg4) {
        arg3.addAction(arg4.getIcon(), arg4.getTitle(), arg4.getActionIntent());
        Bundle v3 = new Bundle(arg4.getExtras());
        if(arg4.getRemoteInputs() != null) {
            v3.putParcelableArray("android.support.remoteInputs", NotificationCompatJellybean.toBundleArray(arg4.getRemoteInputs()));
        }

        if(arg4.getDataOnlyRemoteInputs() != null) {
            v3.putParcelableArray("android.support.dataRemoteInputs", NotificationCompatJellybean.toBundleArray(arg4.getDataOnlyRemoteInputs()));
        }

        v3.putBoolean("android.support.allowGeneratedReplies", arg4.getAllowGeneratedReplies());
        return v3;
    }
}

