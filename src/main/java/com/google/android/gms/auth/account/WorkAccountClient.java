package com.google.android.gms.auth.account;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApi$Settings;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.auth.zzh;
import com.google.android.gms.tasks.Task;

public class WorkAccountClient extends GoogleApi {
    private final WorkAccountApi zzac;

    WorkAccountClient(@NonNull Activity arg4) {
        super(arg4, WorkAccount.API, null, Settings.DEFAULT_SETTINGS);
        this.zzac = new zzh();
    }

    WorkAccountClient(@NonNull Context arg4) {
        super(arg4, WorkAccount.API, null, Settings.DEFAULT_SETTINGS);
        this.zzac = new zzh();
    }

    public Task addWorkAccount(String arg3) {
        return PendingResultUtil.toTask(this.zzac.addWorkAccount(this.asGoogleApiClient(), arg3), new zzg(this));
    }

    public Task removeWorkAccount(Account arg3) {
        return PendingResultUtil.toVoidTask(this.zzac.removeWorkAccount(this.asGoogleApiClient(), arg3));
    }

    public Task setWorkAuthenticatorEnabled(boolean arg3) {
        return PendingResultUtil.toVoidTask(this.zzac.setWorkAuthenticatorEnabledWithResult(this.asGoogleApiClient(), arg3));
    }
}

