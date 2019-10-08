package com.google.firebase.iid;

final class zzx implements InstanceIdResult {
    private final String zzbt;
    private final String zzbu;

    zzx(String arg1, String arg2) {
        super();
        this.zzbt = arg1;
        this.zzbu = arg2;
    }

    public final String getId() {
        return this.zzbt;
    }

    public final String getToken() {
        return this.zzbu;
    }
}

