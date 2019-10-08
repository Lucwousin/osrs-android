package com.google.firebase.iid;

public final class zzal extends Exception {
    private final int errorCode;

    public zzal(int arg1, String arg2) {
        super(arg2);
        this.errorCode = arg1;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}

