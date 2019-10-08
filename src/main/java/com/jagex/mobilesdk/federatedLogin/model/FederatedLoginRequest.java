package com.jagex.mobilesdk.federatedLogin.model;

public class FederatedLoginRequest {
    private final String packageId;
    private final String serverAuthCode;
    private final String thirdPartyAccountId;

    public FederatedLoginRequest(String arg1, String arg2, String arg3) {
        super();
        this.serverAuthCode = arg1;
        this.thirdPartyAccountId = arg2;
        this.packageId = arg3;
    }

    public String getPackageId() {
        return this.packageId;
    }

    public String getServerAuthCode() {
        return this.serverAuthCode;
    }

    public String getThirdPartyAccountId() {
        return this.thirdPartyAccountId;
    }
}

