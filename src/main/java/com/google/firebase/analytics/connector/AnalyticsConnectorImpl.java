package com.google.firebase.analytics.connector;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.internal.zzc;
import com.google.firebase.analytics.connector.internal.zzd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class AnalyticsConnectorImpl implements AnalyticsConnector {
    private final AppMeasurement zzbqh;
    private static volatile AnalyticsConnector zzbqi;
    @VisibleForTesting final Map zzbqj;

    private AnalyticsConnectorImpl(AppMeasurement arg1) {
        super();
        Preconditions.checkNotNull(arg1);
        this.zzbqh = arg1;
        this.zzbqj = new ConcurrentHashMap();
    }

    @KeepForSdk public void clearConditionalUserProperty(@NonNull @Size(max=24, min=1) String arg2, @Nullable String arg3, @Nullable Bundle arg4) {
        if(arg3 != null && !zzc.zza(arg3, arg4)) {
            return;
        }

        this.zzbqh.clearConditionalUserProperty(arg2, arg3, arg4);
    }

    @WorkerThread @KeepForSdk public List getConditionalUserProperties(@NonNull String arg3, @Nullable @Size(max=23, min=1) String arg4) {
        ArrayList v0 = new ArrayList();
        Iterator v3 = this.zzbqh.getConditionalUserProperties(arg3, arg4).iterator();
        while(v3.hasNext()) {
            ((List)v0).add(zzc.zzd(v3.next()));
        }

        return ((List)v0);
    }

    @KeepForSdk public static AnalyticsConnector getInstance() {
        return AnalyticsConnectorImpl.getInstance(FirebaseApp.getInstance());
    }

    @KeepForSdk public static AnalyticsConnector getInstance(FirebaseApp arg1) {
        return arg1.get(AnalyticsConnector.class);
    }

    @RequiresPermission(allOf={"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"}) @KeepForSdk public static AnalyticsConnector getInstance(Context arg2) {
        Preconditions.checkNotNull(arg2);
        Preconditions.checkNotNull(arg2.getApplicationContext());
        if(AnalyticsConnectorImpl.zzbqi == null) {
            Class v0 = AnalyticsConnector.class;
            __monitor_enter(v0);
            try {
                if(AnalyticsConnectorImpl.zzbqi == null) {
                    AnalyticsConnectorImpl.zzbqi = new AnalyticsConnectorImpl(AppMeasurement.getInstance(arg2));
                }

                __monitor_exit(v0);
                goto label_18;
            label_16:
                __monitor_exit(v0);
            }
            catch(Throwable v2) {
                goto label_16;
            }

            throw v2;
        }

    label_18:
        return AnalyticsConnectorImpl.zzbqi;
    }

    @WorkerThread @KeepForSdk public int getMaxUserProperties(@NonNull @Size(min=1) String arg2) {
        return this.zzbqh.getMaxUserProperties(arg2);
    }

    @WorkerThread @KeepForSdk public Map getUserProperties(boolean arg2) {
        return this.zzbqh.getUserProperties(arg2);
    }

    @KeepForSdk public void logEvent(@NonNull String arg2, @NonNull String arg3, Bundle arg4) {
        if(arg4 == null) {
            arg4 = new Bundle();
        }

        if(!zzc.zzff(arg2)) {
            return;
        }

        if(!zzc.zza(arg3, arg4)) {
            return;
        }

        if(!zzc.zzb(arg2, arg3, arg4)) {
            return;
        }

        this.zzbqh.logEventInternal(arg2, arg3, arg4);
    }

    @WorkerThread @KeepForSdk public AnalyticsConnectorHandle registerAnalyticsConnectorListener(@NonNull String arg4, AnalyticsConnectorListener arg5) {
        Preconditions.checkNotNull(arg5);
        AnalyticsConnectorHandle v1 = null;
        if(!zzc.zzff(arg4)) {
            return v1;
        }

        if(this.zzfe(arg4)) {
            return v1;
        }

        AppMeasurement v0 = this.zzbqh;
        zzd v2 = "fiam".equals(arg4) ? new zzd(v0, arg5) : ((zzd)v1);
        if(v2 != null) {
            this.zzbqj.put(arg4, v2);
            return new AnalyticsConnectorHandle(arg4) {
                @KeepForSdk public void registerEventNames(Set arg3) {
                    if((AnalyticsConnectorImpl.zza(this.zzbqk, this.zzadn)) && (this.zzadn.equals("fiam")) && arg3 != null) {
                        if(arg3.isEmpty()) {
                        }
                        else {
                            this.zzbqk.zzbqj.get(this.zzadn).registerEventNames(arg3);
                        }
                    }
                }

                public void unregister() {
                    if(!AnalyticsConnectorImpl.zza(this.zzbqk, this.zzadn)) {
                        return;
                    }

                    AnalyticsConnectorListener v0 = this.zzbqk.zzbqj.get(this.zzadn).zzss();
                    if(v0 != null) {
                        v0.onMessageTriggered(0, null);
                    }

                    this.zzbqk.zzbqj.remove(this.zzadn);
                }

                @KeepForSdk public void unregisterEventNames() {
                    if(AnalyticsConnectorImpl.zza(this.zzbqk, this.zzadn)) {
                        if(!this.zzadn.equals("fiam")) {
                        }
                        else {
                            this.zzbqk.zzbqj.get(this.zzadn).unregisterEventNames();
                        }
                    }
                }
            };
        }

        return v1;
    }

    @KeepForSdk public void setConditionalUserProperty(@NonNull ConditionalUserProperty arg2) {
        if(!zzc.zza(arg2)) {
            return;
        }

        this.zzbqh.setConditionalUserProperty(zzc.zzb(arg2));
    }

    @KeepForSdk public void setUserProperty(@NonNull String arg2, @NonNull String arg3, Object arg4) {
        if(!zzc.zzff(arg2)) {
            return;
        }

        if(!zzc.zzw(arg2, arg3)) {
            return;
        }

        this.zzbqh.setUserPropertyInternal(arg2, arg3, arg4);
    }

    static boolean zza(AnalyticsConnectorImpl arg0, String arg1) {
        return arg0.zzfe(arg1);
    }

    private final boolean zzfe(@NonNull String arg2) {
        if(!arg2.isEmpty() && (this.zzbqj.containsKey(arg2)) && this.zzbqj.get(arg2) != null) {
            return 1;
        }

        return 0;
    }
}

