package com.google.android.gms.internal.auth-api-phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.api.phone.SmsRetrieverClient;
import com.google.android.gms.tasks.Task;

public final class zzj extends SmsRetrieverClient {
    public zzj(@NonNull Activity arg1) {
        super(arg1);
    }

    public zzj(@NonNull Context arg1) {
        super(arg1);
    }

    public final Task startSmsRetriever() {
        return this.doWrite(new zzk(this));
    }
}

