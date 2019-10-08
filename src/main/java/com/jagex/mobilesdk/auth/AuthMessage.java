package com.jagex.mobilesdk.auth;

public enum AuthMessage {
    public static final enum AuthMessage ACTION_AUTH_ERROR;
    public static final enum AuthMessage BAD_REQUEST_URL;
    public static final enum AuthMessage FEDERATED_LOGIN_ACTIVITY_ERROR;
    public static final enum AuthMessage FEDERATED_LOGIN_AUTH_ERROR;
    public static final enum AuthMessage GENERIC_ACCOUNT_CREATION_ERROR;
    public static final enum AuthMessage GENERIC_ACTIVITY_CANCELLED;
    public static final enum AuthMessage GENERIC_AUTH_ERROR;
    public static final enum AuthMessage GENERIC_ERROR;
    public static final enum AuthMessage HTTP_RESPONSE_NOT_OK;
    public static final enum AuthMessage JAGEX_ACCESS_ERROR;
    public static final enum AuthMessage NOT_AUTHORIZED;
    public static final enum AuthMessage PENDING_TRANSACTION_ERROR;
    public static final enum AuthMessage STORE_TOKENS_ERROR;
    private final String message;

    static {
        AuthMessage.GENERIC_ERROR = new AuthMessage("GENERIC_ERROR", 0, "An error occurred.");
        AuthMessage.GENERIC_AUTH_ERROR = new AuthMessage("GENERIC_AUTH_ERROR", 1, "An error occurred trying to authorize the user.");
        AuthMessage.GENERIC_ACCOUNT_CREATION_ERROR = new AuthMessage("GENERIC_ACCOUNT_CREATION_ERROR", 2, "An error occured trying to create an account.");
        AuthMessage.NOT_AUTHORIZED = new AuthMessage("NOT_AUTHORIZED", 3, "Tried to perform a action without being authorized.");
        AuthMessage.BAD_REQUEST_URL = new AuthMessage("BAD_REQUEST_URL", 4, "An error occurred trying to build a request URL");
        AuthMessage.ACTION_AUTH_ERROR = new AuthMessage("ACTION_AUTH_ERROR", 5, "An error occurred trying to perform an action with fresh tokens.");
        AuthMessage.HTTP_RESPONSE_NOT_OK = new AuthMessage("HTTP_RESPONSE_NOT_OK", 6, "The following HTTP response was not OK: ");
        AuthMessage.STORE_TOKENS_ERROR = new AuthMessage("STORE_TOKENS_ERROR", 7, "The supplied tokens were invalid.");
        AuthMessage.JAGEX_ACCESS_ERROR = new AuthMessage("JAGEX_ACCESS_ERROR", 8, "An error occurred when making a request to a Jagex endpoint.");
        AuthMessage.PENDING_TRANSACTION_ERROR = new AuthMessage("PENDING_TRANSACTION_ERROR", 9, "A pending transaction is available");
        AuthMessage.GENERIC_ACTIVITY_CANCELLED = new AuthMessage("GENERIC_ACTIVITY_CANCELLED", 10, "User stopped interaction with the activity.");
        AuthMessage.FEDERATED_LOGIN_AUTH_ERROR = new AuthMessage("FEDERATED_LOGIN_AUTH_ERROR", 11, "There was an issue with the request to Google.");
        AuthMessage.FEDERATED_LOGIN_ACTIVITY_ERROR = new AuthMessage("FEDERATED_LOGIN_ACTIVITY_ERROR", 12, "Unknown activity error code received from Google.");
        AuthMessage.$VALUES = new AuthMessage[]{AuthMessage.GENERIC_ERROR, AuthMessage.GENERIC_AUTH_ERROR, AuthMessage.GENERIC_ACCOUNT_CREATION_ERROR, AuthMessage.NOT_AUTHORIZED, AuthMessage.BAD_REQUEST_URL, AuthMessage.ACTION_AUTH_ERROR, AuthMessage.HTTP_RESPONSE_NOT_OK, AuthMessage.STORE_TOKENS_ERROR, AuthMessage.JAGEX_ACCESS_ERROR, AuthMessage.PENDING_TRANSACTION_ERROR, AuthMessage.GENERIC_ACTIVITY_CANCELLED, AuthMessage.FEDERATED_LOGIN_AUTH_ERROR, AuthMessage.FEDERATED_LOGIN_ACTIVITY_ERROR};
    }

    private AuthMessage(String arg1, int arg2, String arg3) {
        super(arg1, arg2);
        this.message = arg3;
    }

    public String getMessage() {
        return this.message;
    }

    public static AuthMessage valueOf(String arg1) {
        return Enum.valueOf(AuthMessage.class, arg1);
    }

    public static AuthMessage[] values() {
        return AuthMessage.$VALUES.clone();
    }
}

