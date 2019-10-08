package com.google.android.gms.auth;

import android.content.Intent;

public class GooglePlayServicesAvailabilityException extends UserRecoverableAuthException {
    private final int zzu;

    GooglePlayServicesAvailabilityException(int arg1, String arg2, Intent arg3) {
        super(arg2, arg3);
        this.zzu = arg1;
    }

    public int getConnectionStatusCode() {
        return this.zzu;
    }
}

