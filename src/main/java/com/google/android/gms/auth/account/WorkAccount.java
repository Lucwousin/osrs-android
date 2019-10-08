package com.google.android.gms.auth.account;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.auth.zzh;

public class WorkAccount {
    public static final Api API;
    private static final AbstractClientBuilder CLIENT_BUILDER;
    private static final ClientKey CLIENT_KEY;
    @Deprecated public static final WorkAccountApi WorkAccountApi;

    static {
        WorkAccount.CLIENT_KEY = new ClientKey();
        WorkAccount.CLIENT_BUILDER = new zzf();
        WorkAccount.API = new Api("WorkAccount.API", WorkAccount.CLIENT_BUILDER, WorkAccount.CLIENT_KEY);
        WorkAccount.WorkAccountApi = new zzh();
    }

    private WorkAccount() {
        super();
    }

    public static WorkAccountClient getClient(@NonNull Activity arg1) {
        return new WorkAccountClient(arg1);
    }

    public static WorkAccountClient getClient(@NonNull Context arg1) {
        return new WorkAccountClient(arg1);
    }
}

