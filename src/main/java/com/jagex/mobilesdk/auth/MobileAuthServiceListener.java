package com.jagex.mobilesdk.auth;

import com.jagex.mobilesdk.common.comms.CommsResult;

public interface MobileAuthServiceListener {
    public static final int REQUEST_ACCOUNT_CREATION = 2204;
    public static final int REQUEST_GOOGLE_LOGIN = 2205;

    void onResult(CommsResult arg1);
}

