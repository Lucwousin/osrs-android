package com.google.android.gms.auth.api.credentials;

import com.google.android.gms.common.api.Response;

public class CredentialRequestResponse extends Response {
    public CredentialRequestResponse() {
        super();
    }

    public Credential getCredential() {
        return this.getResult().getCredential();
    }
}

