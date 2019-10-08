package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.CommonStatusCodes;

public final class GoogleSignInStatusCodes extends CommonStatusCodes {
    public static final int SIGN_IN_CANCELLED = 0x30D5;
    public static final int SIGN_IN_CURRENTLY_IN_PROGRESS = 0x30D6;
    public static final int SIGN_IN_FAILED = 12500;

    private GoogleSignInStatusCodes() {
        super();
    }

    public static String getStatusCodeString(int arg0) {
        switch(arg0) {
            case 12500: {
                return "A non-recoverable sign in failure occurred";
            }
            case 12501: {
                return "Sign in action cancelled";
            }
            case 12502: {
                return "Sign-in in progress";
            }
        }

        return CommonStatusCodes.getStatusCodeString(arg0);
    }
}

