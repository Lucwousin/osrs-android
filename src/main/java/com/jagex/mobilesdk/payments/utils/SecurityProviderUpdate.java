package com.jagex.mobilesdk.payments.utils;

import android.app.Activity;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.security.ProviderInstaller;

public class SecurityProviderUpdate {
    public SecurityProviderUpdate() {
        super();
    }

    public static void ProviderUpdate(@NonNull Activity arg2) {
        try {
            ProviderInstaller.installIfNeeded(arg2.getApplicationContext());
            return;
        }
        catch(Exception ) {
            return;
        }
        catch(GooglePlayServicesRepairableException v0) {
            GoogleApiAvailability.getInstance().showErrorNotification(arg2.getApplicationContext(), v0.getConnectionStatusCode());
            return;
        }
    }
}

