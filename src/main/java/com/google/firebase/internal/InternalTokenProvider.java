package com.google.firebase.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;

@KeepForSdk @Deprecated public interface InternalTokenProvider {
    @KeepForSdk Task getAccessToken(boolean arg1);

    @Nullable @KeepForSdk String getUid();
}

