package com.google.android.gms.auth.api.credentials;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions;

public class Credentials {
    public Credentials() {
        super();
    }

    public static CredentialsClient getClient(@NonNull Activity arg2) {
        return new CredentialsClient(arg2, CredentialsOptions.DEFAULT);
    }

    public static CredentialsClient getClient(@NonNull Activity arg1, @NonNull CredentialsOptions arg2) {
        return new CredentialsClient(arg1, ((AuthCredentialsOptions)arg2));
    }

    public static CredentialsClient getClient(@NonNull Context arg2) {
        return new CredentialsClient(arg2, CredentialsOptions.DEFAULT);
    }

    public static CredentialsClient getClient(@NonNull Context arg1, @NonNull CredentialsOptions arg2) {
        return new CredentialsClient(arg1, ((AuthCredentialsOptions)arg2));
    }
}

