package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.common.api.Api$ApiOptions;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.internal.auth-api.zzq;
import com.google.android.gms.tasks.Task;

public class CredentialsClient extends GoogleApi {
    CredentialsClient(@NonNull Activity arg3, @NonNull AuthCredentialsOptions arg4) {
        super(arg3, Auth.CREDENTIALS_API, ((ApiOptions)arg4), new ApiExceptionMapper());
    }

    CredentialsClient(@NonNull Context arg3, @NonNull AuthCredentialsOptions arg4) {
        super(arg3, Auth.CREDENTIALS_API, ((ApiOptions)arg4), new ApiExceptionMapper());
    }

    public Task delete(@NonNull Credential arg3) {
        return PendingResultUtil.toVoidTask(Auth.CredentialsApi.delete(this.asGoogleApiClient(), arg3));
    }

    public Task disableAutoSignIn() {
        return PendingResultUtil.toVoidTask(Auth.CredentialsApi.disableAutoSignIn(this.asGoogleApiClient()));
    }

    public PendingIntent getHintPickerIntent(@NonNull HintRequest arg3) {
        return zzq.zzc(this.getApplicationContext(), this.getApiOptions(), arg3);
    }

    public Task request(@NonNull CredentialRequest arg3) {
        return PendingResultUtil.toResponseTask(Auth.CredentialsApi.request(this.asGoogleApiClient(), arg3), new CredentialRequestResponse());
    }

    public Task save(@NonNull Credential arg3) {
        return PendingResultUtil.toVoidTask(Auth.CredentialsApi.save(this.asGoogleApiClient(), arg3));
    }
}

