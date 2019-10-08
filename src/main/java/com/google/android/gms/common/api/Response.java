package com.google.android.gms.common.api;

import androidx.annotation.NonNull;

public class Response {
    private Result zzao;

    public Response() {
        super();
    }

    protected Response(@NonNull Result arg1) {
        super();
        this.zzao = arg1;
    }

    @NonNull protected Result getResult() {
        return this.zzao;
    }

    public void setResult(@NonNull Result arg1) {
        this.zzao = arg1;
    }
}

