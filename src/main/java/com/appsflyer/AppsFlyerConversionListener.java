package com.appsflyer;

import androidx.annotation.WorkerThread;
import java.util.Map;

public interface AppsFlyerConversionListener {
    @WorkerThread void onAppOpenAttribution(Map arg1);

    void onAttributionFailure(String arg1);

    @WorkerThread void onInstallConversionDataLoaded(Map arg1);

    void onInstallConversionFailure(String arg1);
}

