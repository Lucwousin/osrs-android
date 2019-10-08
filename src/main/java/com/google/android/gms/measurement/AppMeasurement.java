package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzgn;
import com.google.android.gms.internal.measurement.zzig;
import com.google.android.gms.internal.measurement.zzka;
import com.google.android.gms.internal.measurement.zzkd;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Keep @Deprecated public class AppMeasurement {
    @KeepForSdk public class ConditionalUserProperty {
        @Keep @KeepForSdk public boolean mActive;
        @Keep @KeepForSdk public String mAppId;
        @Keep @KeepForSdk public long mCreationTimestamp;
        @Keep public String mExpiredEventName;
        @Keep public Bundle mExpiredEventParams;
        @Keep @KeepForSdk public String mName;
        @Keep @KeepForSdk public String mOrigin;
        @Keep @KeepForSdk public long mTimeToLive;
        @Keep public String mTimedOutEventName;
        @Keep public Bundle mTimedOutEventParams;
        @Keep @KeepForSdk public String mTriggerEventName;
        @Keep @KeepForSdk public long mTriggerTimeout;
        @Keep public String mTriggeredEventName;
        @Keep public Bundle mTriggeredEventParams;
        @Keep @KeepForSdk public long mTriggeredTimestamp;
        @Keep @KeepForSdk public Object mValue;

        public ConditionalUserProperty() {
            super();
        }

        public ConditionalUserProperty(ConditionalUserProperty arg3) {
            super();
            Preconditions.checkNotNull(arg3);
            this.mAppId = arg3.mAppId;
            this.mOrigin = arg3.mOrigin;
            this.mCreationTimestamp = arg3.mCreationTimestamp;
            this.mName = arg3.mName;
            if(arg3.mValue != null) {
                this.mValue = zzkd.zzf(arg3.mValue);
                if(this.mValue == null) {
                    this.mValue = arg3.mValue;
                }
            }

            this.mActive = arg3.mActive;
            this.mTriggerEventName = arg3.mTriggerEventName;
            this.mTriggerTimeout = arg3.mTriggerTimeout;
            this.mTimedOutEventName = arg3.mTimedOutEventName;
            if(arg3.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(arg3.mTimedOutEventParams);
            }

            this.mTriggeredEventName = arg3.mTriggeredEventName;
            if(arg3.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(arg3.mTriggeredEventParams);
            }

            this.mTriggeredTimestamp = arg3.mTriggeredTimestamp;
            this.mTimeToLive = arg3.mTimeToLive;
            this.mExpiredEventName = arg3.mExpiredEventName;
            if(arg3.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(arg3.mExpiredEventParams);
            }
        }
    }

    @KeepForSdk public final class Event extends com.google.firebase.analytics.FirebaseAnalytics$Event {
        @KeepForSdk public static final String AD_REWARD = "_ar";
        @KeepForSdk public static final String APP_EXCEPTION = "_ae";
        public static final String[] zzacw;
        public static final String[] zzacx;

        static {
            Event.zzacw = new String[]{"app_clear_data", "app_exception", "app_remove", "app_upgrade", "app_install", "app_update", "firebase_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "user_engagement", "ad_exposure", "adunit_exposure", "ad_query", "ad_activeview", "ad_impression", "ad_click", "ad_reward", "screen_view", "ga_extra_parameter"};
            Event.zzacx = new String[]{"_cd", "_ae", "_ui", "_ug", "_in", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_e", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "_ar", "_vs", "_ep"};
        }

        private Event() {
            super();
        }

        public static String zzak(String arg2) {
            return zzkd.zza(arg2, Event.zzacx, Event.zzacw);
        }

        public static String zzal(String arg2) {
            return zzkd.zza(arg2, Event.zzacw, Event.zzacx);
        }
    }

    @KeepForSdk public interface EventInterceptor {
        @WorkerThread @KeepForSdk void interceptEvent(String arg1, String arg2, Bundle arg3, long arg4);
    }

    @KeepForSdk public interface OnEventListener {
        @WorkerThread @KeepForSdk void onEvent(String arg1, String arg2, Bundle arg3, long arg4);
    }

    @KeepForSdk public final class Param extends com.google.firebase.analytics.FirebaseAnalytics$Param {
        @KeepForSdk public static final String FATAL = "fatal";
        @KeepForSdk public static final String TIMESTAMP = "timestamp";
        @KeepForSdk public static final String TYPE = "type";
        public static final String[] zzacy;
        public static final String[] zzacz;

        static {
            Param.zzacy = new String[]{"firebase_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "message_device_time", "message_id", "message_name", "message_time", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "deferred_analytics_collection"};
            Param.zzacz = new String[]{"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_ndt", "_nmid", "_nmn", "_nmt", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_dac"};
        }

        private Param() {
            super();
        }

        public static String zzal(String arg2) {
            return zzkd.zza(arg2, Param.zzacy, Param.zzacz);
        }
    }

    @KeepForSdk public final class UserProperty extends com.google.firebase.analytics.FirebaseAnalytics$UserProperty {
        @KeepForSdk public static final String FIREBASE_LAST_NOTIFICATION = "_ln";
        public static final String[] zzada;
        public static final String[] zzadb;

        static {
            UserProperty.zzada = new String[]{"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "first_open_after_install", "lifetime_user_engagement"};
            UserProperty.zzadb = new String[]{"_ln", "_fot", "_fvt", "_ldl", "_id", "_fi", "_lte"};
        }

        private UserProperty() {
            super();
        }

        public static String zzal(String arg2) {
            return zzkd.zza(arg2, UserProperty.zzada, UserProperty.zzadb);
        }
    }

    @KeepForSdk public static final String CRASH_ORIGIN = "crash";
    @KeepForSdk public static final String FCM_ORIGIN = "fcm";
    @KeepForSdk public static final String FIAM_ORIGIN = "fiam";
    private final zzgn zzacv;

    public AppMeasurement(zzgn arg1) {
        super();
        Preconditions.checkNotNull(arg1);
        this.zzacv = arg1;
    }

    @Keep public void beginAdUnitExposure(@NonNull @Size(min=1) String arg2) {
        this.zzacv.zzfx().beginAdUnitExposure(arg2);
    }

    @Keep @KeepForSdk public void clearConditionalUserProperty(@NonNull @Size(max=24, min=1) String arg2, @Nullable String arg3, @Nullable Bundle arg4) {
        this.zzacv.zzfy().clearConditionalUserProperty(arg2, arg3, arg4);
    }

    @Keep @VisibleForTesting protected void clearConditionalUserPropertyAs(@NonNull @Size(min=1) String arg2, @NonNull @Size(max=24, min=1) String arg3, @Nullable String arg4, @Nullable Bundle arg5) {
        this.zzacv.zzfy().clearConditionalUserPropertyAs(arg2, arg3, arg4, arg5);
    }

    @Keep public void endAdUnitExposure(@NonNull @Size(min=1) String arg2) {
        this.zzacv.zzfx().endAdUnitExposure(arg2);
    }

    @Keep public long generateEventId() {
        return this.zzacv.zzgg().zzln();
    }

    @Keep @Nullable public String getAppInstanceId() {
        return this.zzacv.zzfy().zzjk();
    }

    @KeepForSdk public Boolean getBoolean() {
        return this.zzacv.zzfy().zzkh();
    }

    @Keep @WorkerThread @KeepForSdk public List getConditionalUserProperties(@Nullable String arg2, @Nullable @Size(max=23, min=1) String arg3) {
        return this.zzacv.zzfy().getConditionalUserProperties(arg2, arg3);
    }

    @Keep @WorkerThread @VisibleForTesting protected List getConditionalUserPropertiesAs(@NonNull @Size(min=1) String arg2, @Nullable String arg3, @Nullable @Size(max=23, min=1) String arg4) {
        return this.zzacv.zzfy().getConditionalUserPropertiesAs(arg2, arg3, arg4);
    }

    @Keep @Nullable public String getCurrentScreenClass() {
        zzig v0 = this.zzacv.zzgb().zzko();
        if(v0 != null) {
            return v0.zzaqa;
        }

        return null;
    }

    @Keep @Nullable public String getCurrentScreenName() {
        zzig v0 = this.zzacv.zzgb().zzko();
        if(v0 != null) {
            return v0.zzuk;
        }

        return null;
    }

    @KeepForSdk public Double getDouble() {
        return this.zzacv.zzfy().zzkl();
    }

    @Keep @Nullable public String getGmpAppId() {
        if(this.zzacv.zzkd() != null) {
            return this.zzacv.zzkd();
        }

        try {
            return GoogleServices.getGoogleAppId();
        }
        catch(IllegalStateException v0) {
            this.zzacv.zzgi().zziv().zzg("getGoogleAppId failed with exception", v0);
            return null;
        }
    }

    @Keep @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"}) @Deprecated public static AppMeasurement getInstance(Context arg1) {
        return zzgn.zza(arg1, null, null).zzkb();
    }

    @KeepForSdk public Integer getInteger() {
        return this.zzacv.zzfy().zzkk();
    }

    @KeepForSdk public Long getLong() {
        return this.zzacv.zzfy().zzkj();
    }

    @Keep @WorkerThread @KeepForSdk public int getMaxUserProperties(@NonNull @Size(min=1) String arg2) {
        this.zzacv.zzfy();
        Preconditions.checkNotEmpty(arg2);
        return 25;
    }

    @KeepForSdk public String getString() {
        return this.zzacv.zzfy().zzki();
    }

    @Keep @WorkerThread @VisibleForTesting protected Map getUserProperties(@Nullable String arg2, @Nullable @Size(max=24, min=1) String arg3, boolean arg4) {
        return this.zzacv.zzfy().getUserProperties(arg2, arg3, arg4);
    }

    @WorkerThread @KeepForSdk public Map getUserProperties(boolean arg4) {
        List v4 = this.zzacv.zzfy().zzj(arg4);
        ArrayMap v0 = new ArrayMap(v4.size());
        Iterator v4_1 = v4.iterator();
        while(v4_1.hasNext()) {
            Object v1 = v4_1.next();
            ((Map)v0).put(((zzka)v1).name, ((zzka)v1).getValue());
        }

        return ((Map)v0);
    }

    @Keep @WorkerThread @VisibleForTesting protected Map getUserPropertiesAs(@NonNull @Size(min=1) String arg2, @Nullable String arg3, @Nullable @Size(max=23, min=1) String arg4, boolean arg5) {
        return this.zzacv.zzfy().getUserPropertiesAs(arg2, arg3, arg4, arg5);
    }

    public final void logEvent(@NonNull @Size(max=40, min=1) String arg4, Bundle arg5) {
        if(arg5 == null) {
            arg5 = new Bundle();
        }

        this.zzacv.zzfy().zza("app", arg4, arg5, true);
    }

    @Keep public void logEventInternal(String arg2, String arg3, Bundle arg4) {
        if(arg4 == null) {
            arg4 = new Bundle();
        }

        this.zzacv.zzfy().logEvent(arg2, arg3, arg4);
    }

    @KeepForSdk public void logEventInternalNoInterceptor(String arg7, String arg8, Bundle arg9, long arg10) {
        if(arg9 == null) {
            arg9 = new Bundle();
        }

        this.zzacv.zzfy().logEventNoInterceptor(arg7, arg8, arg9, arg10);
    }

    @KeepForSdk public void registerOnMeasurementEventListener(OnEventListener arg2) {
        this.zzacv.zzfy().registerOnMeasurementEventListener(arg2);
    }

    @Keep @KeepForSdk public void setConditionalUserProperty(@NonNull ConditionalUserProperty arg2) {
        this.zzacv.zzfy().setConditionalUserProperty(arg2);
    }

    @Keep @VisibleForTesting protected void setConditionalUserPropertyAs(@NonNull ConditionalUserProperty arg2) {
        this.zzacv.zzfy().setConditionalUserPropertyAs(arg2);
    }

    @WorkerThread @KeepForSdk public void setEventInterceptor(EventInterceptor arg2) {
        this.zzacv.zzfy().setEventInterceptor(arg2);
    }

    @Deprecated public void setMeasurementEnabled(boolean arg2) {
        this.zzacv.zzfy().setMeasurementEnabled(arg2);
    }

    public final void setMinimumSessionDuration(long arg2) {
        this.zzacv.zzfy().setMinimumSessionDuration(arg2);
    }

    public final void setSessionTimeoutDuration(long arg2) {
        this.zzacv.zzfy().setSessionTimeoutDuration(arg2);
    }

    public final void setUserProperty(@NonNull @Size(max=24, min=1) String arg4, @Nullable @Size(max=36) String arg5) {
        int v0 = this.zzacv.zzgg().zzci(arg4);
        if(v0 != 0) {
            this.zzacv.zzgg();
            arg5 = zzkd.zza(arg4, 24, true);
            int v4 = arg4 != null ? arg4.length() : 0;
            this.zzacv.zzgg().zza(v0, "_ev", arg5, v4);
            return;
        }

        this.setUserPropertyInternal("app", arg4, arg5);
    }

    @KeepForSdk public void setUserPropertyInternal(String arg2, String arg3, Object arg4) {
        this.zzacv.zzfy().setUserProperty(arg2, arg3, arg4);
    }

    @KeepForSdk public void unregisterOnMeasurementEventListener(OnEventListener arg2) {
        this.zzacv.zzfy().unregisterOnMeasurementEventListener(arg2);
    }
}

