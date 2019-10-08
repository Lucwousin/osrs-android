package com.google.android.gms.common;

import android.content.Intent;

public class GooglePlayServicesRepairableException extends UserRecoverableException {
    private final int zzaf;

    public GooglePlayServicesRepairableException(int arg1, String arg2, Intent arg3) {
        super(arg2, arg3);
        this.zzaf = arg1;
    }

    public int getConnectionStatusCode() {
        return this.zzaf;
    }
}

