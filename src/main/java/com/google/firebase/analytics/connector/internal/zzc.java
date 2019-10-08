package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.internal.measurement.zzkd;
import com.google.android.gms.measurement.AppMeasurement$Event;
import com.google.android.gms.measurement.AppMeasurement$UserProperty;
import com.google.firebase.analytics.connector.AnalyticsConnector$ConditionalUserProperty;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class zzc {
    private static final List zzbqm;
    private static final List zzbqn;
    private static final List zzbqo;
    private static final List zzbqp;
    private static final List zzbqq;

    static {
        zzc.zzbqm = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open"});
        zzc.zzbqn = Arrays.asList(new String[]{"auto", "app", "am"});
        zzc.zzbqo = Arrays.asList(new String[]{"_r", "_dbg"});
        zzc.zzbqp = Arrays.asList(ArrayUtils.concat(new String[][]{UserProperty.zzada, UserProperty.zzadb}));
        zzc.zzbqq = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});
    }

    public static boolean zza(ConditionalUserProperty arg4) {
        if(arg4 == null) {
            return 0;
        }

        String v1 = arg4.origin;
        if(v1 != null) {
            if(v1.isEmpty()) {
            }
            else {
                if(arg4.value != null && zzkd.zzf(arg4.value) == null) {
                    return 0;
                }

                if(!zzc.zzff(v1)) {
                    return 0;
                }

                if(!zzc.zzw(v1, arg4.name)) {
                    return 0;
                }

                if(arg4.expiredEventName != null) {
                    if(!zzc.zza(arg4.expiredEventName, arg4.expiredEventParams)) {
                        return 0;
                    }
                    else if(!zzc.zzb(v1, arg4.expiredEventName, arg4.expiredEventParams)) {
                        return 0;
                    }
                }

                if(arg4.triggeredEventName != null) {
                    if(!zzc.zza(arg4.triggeredEventName, arg4.triggeredEventParams)) {
                        return 0;
                    }
                    else if(!zzc.zzb(v1, arg4.triggeredEventName, arg4.triggeredEventParams)) {
                        return 0;
                    }
                }

                if(arg4.timedOutEventName != null) {
                    if(!zzc.zza(arg4.timedOutEventName, arg4.timedOutEventParams)) {
                        return 0;
                    }
                    else if(!zzc.zzb(v1, arg4.timedOutEventName, arg4.timedOutEventParams)) {
                        return 0;
                    }
                }

                return 1;
            }
        }

        return 0;
    }

    public static boolean zza(@NonNull String arg2, @Nullable Bundle arg3) {
        if(zzc.zzbqm.contains(arg2)) {
            return 0;
        }

        if(arg3 != null) {
            Iterator v2 = zzc.zzbqo.iterator();
            do {
                if(v2.hasNext()) {
                    if(!arg3.containsKey(v2.next())) {
                        continue;
                    }

                    return 0;
                }

                return 1;
            }
            while(true);

            return 0;
        }

        return 1;
    }

    public static boolean zzb(@NonNull String arg4, @NonNull String arg5, @Nullable Bundle arg6) {
        int v4;
        if(!"_cmp".equals(arg5)) {
            return 1;
        }

        if(!zzc.zzff(arg4)) {
            return 0;
        }

        if(arg6 == null) {
            return 0;
        }

        Iterator v5 = zzc.zzbqo.iterator();
        do {
            if(!v5.hasNext()) {
                goto label_19;
            }
        }
        while(!arg6.containsKey(v5.next()));

        return 0;
    label_19:
        int v2 = arg4.hashCode();
        if(v2 != 101200) {
            if(v2 != 101230) {
                if(v2 != 0x2FF42F) {
                    goto label_43;
                }
                else if(arg4.equals("fiam")) {
                    v4 = 2;
                }
                else {
                    goto label_43;
                }
            }
            else if(arg4.equals("fdl")) {
                v4 = 1;
            }
            else {
                goto label_43;
            }
        }
        else if(arg4.equals("fcm")) {
            v4 = 0;
        }
        else {
        label_43:
            v4 = -1;
        }

        switch(v4) {
            case 0: {
                goto label_53;
            }
            case 1: {
                goto label_50;
            }
            case 2: {
                goto label_46;
            }
        }

        return 0;
    label_50:
        arg4 = "_cis";
        arg5 = "fdl_integration";
        goto label_48;
    label_53:
        arg4 = "_cis";
        arg5 = "fcm_integration";
        goto label_48;
    label_46:
        arg4 = "_cis";
        arg5 = "fiam_integration";
    label_48:
        arg6.putString(arg4, arg5);
        return 1;
    }

    public static com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty zzb(ConditionalUserProperty arg3) {
        com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty v0 = new com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty();
        v0.mOrigin = arg3.origin;
        v0.mActive = arg3.active;
        v0.mCreationTimestamp = arg3.creationTimestamp;
        v0.mExpiredEventName = arg3.expiredEventName;
        if(arg3.expiredEventParams != null) {
            v0.mExpiredEventParams = new Bundle(arg3.expiredEventParams);
        }

        v0.mName = arg3.name;
        v0.mTimedOutEventName = arg3.timedOutEventName;
        if(arg3.timedOutEventParams != null) {
            v0.mTimedOutEventParams = new Bundle(arg3.timedOutEventParams);
        }

        v0.mTimeToLive = arg3.timeToLive;
        v0.mTriggeredEventName = arg3.triggeredEventName;
        if(arg3.triggeredEventParams != null) {
            v0.mTriggeredEventParams = new Bundle(arg3.triggeredEventParams);
        }

        v0.mTriggeredTimestamp = arg3.triggeredTimestamp;
        v0.mTriggerEventName = arg3.triggerEventName;
        v0.mTriggerTimeout = arg3.triggerTimeout;
        if(arg3.value != null) {
            v0.mValue = zzkd.zzf(arg3.value);
        }

        return v0;
    }

    public static ConditionalUserProperty zzd(com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty arg3) {
        ConditionalUserProperty v0 = new ConditionalUserProperty();
        v0.origin = arg3.mOrigin;
        v0.active = arg3.mActive;
        v0.creationTimestamp = arg3.mCreationTimestamp;
        v0.expiredEventName = arg3.mExpiredEventName;
        if(arg3.mExpiredEventParams != null) {
            v0.expiredEventParams = new Bundle(arg3.mExpiredEventParams);
        }

        v0.name = arg3.mName;
        v0.timedOutEventName = arg3.mTimedOutEventName;
        if(arg3.mTimedOutEventParams != null) {
            v0.timedOutEventParams = new Bundle(arg3.mTimedOutEventParams);
        }

        v0.timeToLive = arg3.mTimeToLive;
        v0.triggeredEventName = arg3.mTriggeredEventName;
        if(arg3.mTriggeredEventParams != null) {
            v0.triggeredEventParams = new Bundle(arg3.mTriggeredEventParams);
        }

        v0.triggeredTimestamp = arg3.mTriggeredTimestamp;
        v0.triggerEventName = arg3.mTriggerEventName;
        v0.triggerTimeout = arg3.mTriggerTimeout;
        if(arg3.mValue != null) {
            v0.value = zzkd.zzf(arg3.mValue);
        }

        return v0;
    }

    public static boolean zzff(@NonNull String arg1) {
        if(!zzc.zzbqn.contains(arg1)) {
            return 1;
        }

        return 0;
    }

    public static boolean zzfg(String arg5) {
        if(arg5 == null) {
            return 0;
        }

        if(arg5.length() == 0) {
            return 0;
        }

        int v1 = arg5.codePointAt(0);
        if(!Character.isLetter(v1)) {
            return 0;
        }

        int v2 = arg5.length();
        for(v1 = Character.charCount(v1); v1 < v2; v1 += Character.charCount(v3)) {
            int v3 = arg5.codePointAt(v1);
            if(v3 != 0x5F && !Character.isLetterOrDigit(v3)) {
                return 0;
            }
        }

        return 1;
    }

    public static boolean zzfh(String arg6) {
        if(arg6 == null) {
            return 0;
        }

        if(arg6.length() == 0) {
            return 0;
        }

        int v1 = arg6.codePointAt(0);
        int v3 = 0x5F;
        if(!Character.isLetter(v1) && v1 != v3) {
            return 0;
        }

        int v2 = arg6.length();
        for(v1 = Character.charCount(v1); v1 < v2; v1 += Character.charCount(v4)) {
            int v4 = arg6.codePointAt(v1);
            if(v4 != v3 && !Character.isLetterOrDigit(v4)) {
                return 0;
            }
        }

        return 1;
    }

    public static String zzfi(String arg1) {
        String v0 = Event.zzak(arg1);
        if(v0 != null) {
            return v0;
        }

        return arg1;
    }

    public static String zzfj(String arg1) {
        String v0 = Event.zzal(arg1);
        if(v0 != null) {
            return v0;
        }

        return arg1;
    }

    public static boolean zzw(@NonNull String arg3, @NonNull String arg4) {
        if(!"_ce1".equals(arg4)) {
            if("_ce2".equals(arg4)) {
            }
            else if("_ln".equals(arg4)) {
                return arg3.equals("fcm");
            }
            else if(zzc.zzbqp.contains(arg4)) {
                return 0;
            }
            else {
                Iterator v3 = zzc.zzbqq.iterator();
                do {
                    if(v3.hasNext()) {
                        if(!arg4.matches(v3.next())) {
                            continue;
                        }

                        return 0;
                    }
                    else {
                        return 1;
                    }
                }
                while(true);

                return 0;
            }
        }

        if(!arg3.equals("fcm")) {
            if(arg3.equals("frc")) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }
}

