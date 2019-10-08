package com.jagex.mobilesdk.federatedLogin.model;

public class FederatedLoginResponse {
    private final String oneTimeLoginToken;
    private final String runescapeAccountId;

    public FederatedLoginResponse(String arg1, String arg2) {
        super();
        this.oneTimeLoginToken = arg1;
        this.runescapeAccountId = arg2;
    }

    public String getOneTimeLoginToken() {
        return this.oneTimeLoginToken;
    }

    public String getRunescapeAccountId() {
        return this.runescapeAccountId;
    }
}

