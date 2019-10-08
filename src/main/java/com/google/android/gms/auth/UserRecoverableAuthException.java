package com.google.android.gms.auth;

import android.content.Intent;

public class UserRecoverableAuthException extends GoogleAuthException {
    private final Intent mIntent;

    public UserRecoverableAuthException(String arg1, Intent arg2) {
        super(arg1);
        this.mIntent = arg2;
    }

    public Intent getIntent() {
        if(this.mIntent == null) {
            return null;
        }

        return new Intent(this.mIntent);
    }
}

