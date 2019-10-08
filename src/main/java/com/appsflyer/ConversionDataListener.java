package com.appsflyer;

import java.util.Map;

public interface ConversionDataListener {
    void onConversionDataLoaded(Map arg1);

    void onConversionFailure(String arg1);
}

