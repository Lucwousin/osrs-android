package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api$AbstractClientBuilder;
import com.google.android.gms.common.api.Api$ClientKey;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.tasks.Task;

public abstract class SmsRetrieverClient extends GoogleApi implements SmsRetrieverApi {
    private static final Api API;
    private static final AbstractClientBuilder CLIENT_BUILDER;
    private static final ClientKey CLIENT_KEY;

    static {
        SmsRetrieverClient.CLIENT_KEY = new ClientKey();
        SmsRetrieverClient.CLIENT_BUILDER = new zza();
        SmsRetrieverClient.API = new Api("SmsRetriever.API", SmsRetrieverClient.CLIENT_BUILDER, SmsRetrieverClient.CLIENT_KEY);
    }

    public SmsRetrieverClient(@NonNull Activity arg4) {
        super(arg4, SmsRetrieverClient.API, null, new ApiExceptionMapper());
    }

    public SmsRetrieverClient(@NonNull Context arg4) {
        super(arg4, SmsRetrieverClient.API, null, new ApiExceptionMapper());
    }

    public abstract Task startSmsRetriever();
}

