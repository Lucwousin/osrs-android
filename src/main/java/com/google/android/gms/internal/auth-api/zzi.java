package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.internal.Preconditions;

public final class zzi implements CredentialsApi {
    public zzi() {
        super();
    }

    public final PendingResult delete(GoogleApiClient arg2, Credential arg3) {
        Preconditions.checkNotNull(arg2, "client must not be null");
        Preconditions.checkNotNull(arg3, "credential must not be null");
        return arg2.execute(new zzm(this, arg2, arg3));
    }

    public final PendingResult disableAutoSignIn(GoogleApiClient arg2) {
        Preconditions.checkNotNull(arg2, "client must not be null");
        return arg2.execute(new zzn(this, arg2));
    }

    public final PendingIntent getHintPickerIntent(GoogleApiClient arg2, HintRequest arg3) {
        Preconditions.checkNotNull(arg2, "client must not be null");
        Preconditions.checkNotNull(arg3, "request must not be null");
        return zzq.zzc(arg2.getContext(), arg2.getClient(Auth.zzg).zzd(), arg3);
    }

    public final PendingResult request(GoogleApiClient arg2, CredentialRequest arg3) {
        Preconditions.checkNotNull(arg2, "client must not be null");
        Preconditions.checkNotNull(arg3, "request must not be null");
        return arg2.enqueue(new zzj(this, arg2, arg3));
    }

    public final PendingResult save(GoogleApiClient arg2, Credential arg3) {
        Preconditions.checkNotNull(arg2, "client must not be null");
        Preconditions.checkNotNull(arg3, "credential must not be null");
        return arg2.execute(new zzl(this, arg2, arg3));
    }
}

