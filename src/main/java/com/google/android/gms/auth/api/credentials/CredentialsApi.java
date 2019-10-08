package com.google.android.gms.auth.api.credentials;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public interface CredentialsApi {
    public static final int ACTIVITY_RESULT_ADD_ACCOUNT = 1000;
    public static final int ACTIVITY_RESULT_NO_HINTS_AVAILABLE = 1002;
    public static final int ACTIVITY_RESULT_OTHER_ACCOUNT = 1001;
    public static final int CREDENTIAL_PICKER_REQUEST_CODE = 2000;

    PendingResult delete(GoogleApiClient arg1, Credential arg2);

    PendingResult disableAutoSignIn(GoogleApiClient arg1);

    PendingIntent getHintPickerIntent(GoogleApiClient arg1, HintRequest arg2);

    PendingResult request(GoogleApiClient arg1, CredentialRequest arg2);

    PendingResult save(GoogleApiClient arg1, Credential arg2);
}

