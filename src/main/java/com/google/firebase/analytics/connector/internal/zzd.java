package com.google.firebase.analytics.connector.internal;

import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.connector.AnalyticsConnector$AnalyticsConnectorListener;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class zzd implements zza {
    private AppMeasurement zzbqh;
    Set zzbqr;
    private AnalyticsConnectorListener zzbqs;
    private zze zzbqt;

    public zzd(AppMeasurement arg1, AnalyticsConnectorListener arg2) {
        super();
        this.zzbqs = arg2;
        this.zzbqh = arg1;
        this.zzbqt = new zze(this);
        this.zzbqh.registerOnMeasurementEventListener(this.zzbqt);
        this.zzbqr = new HashSet();
    }

    public final void registerEventNames(Set arg6) {
        this.zzbqr.clear();
        Set v0 = this.zzbqr;
        HashSet v1 = new HashSet();
        Iterator v6 = arg6.iterator();
        while(v6.hasNext()) {
            Object v2 = v6.next();
            if(((Set)v1).size() >= 50) {
                break;
            }

            if(!zzc.zzfh(((String)v2))) {
                continue;
            }

            if(!zzc.zzfg(((String)v2))) {
                continue;
            }

            ((Set)v1).add(zzc.zzfj(((String)v2)));
        }

        v0.addAll(((Collection)v1));
    }

    public final void unregisterEventNames() {
        this.zzbqr.clear();
    }

    static AnalyticsConnectorListener zza(zzd arg0) {
        return arg0.zzbqs;
    }

    public final AnalyticsConnectorListener zzss() {
        return this.zzbqs;
    }
}

