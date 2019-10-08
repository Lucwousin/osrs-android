package com.google.android.gms.internal.auth-api;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.Auth$AuthCredentialsOptions;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

public final class zzq {
    public static PendingIntent zzc(Context arg2, @Nullable AuthCredentialsOptions arg3, HintRequest arg4) {
        Preconditions.checkNotNull(arg2, "context must not be null");
        Preconditions.checkNotNull(arg4, "request must not be null");
        Intent v3 = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", null);
        SafeParcelableSerializer.serializeToIntentExtra(((SafeParcelable)arg4), v3, "com.google.android.gms.credentials.HintRequest");
        return PendingIntent.getActivity(arg2, 2000, v3, 0x8000000);
    }
}

