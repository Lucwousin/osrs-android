package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender$SendIntentException;
import androidx.annotation.NonNull;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(@NonNull Status arg1) {
        super(arg1);
    }

    public PendingIntent getResolution() {
        return this.mStatus.getResolution();
    }

    public void startResolutionForResult(Activity arg2, int arg3) throws IntentSender$SendIntentException {
        this.mStatus.startResolutionForResult(arg2, arg3);
    }
}

