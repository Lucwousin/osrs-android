package com.jagex.mobilesdk.payments.utils;

import android.content.IntentFilter;

public class Intents {
    public Intents() {
        super();
    }

    public static IntentFilter getConnectivityIntentFilter() {
        IntentFilter v0 = new IntentFilter();
        v0.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        return v0;
    }
}

