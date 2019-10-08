package com.google.android.gms.auth.account;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil$ResultConverter;

final class zzg implements ResultConverter {
    zzg(WorkAccountClient arg1) {
        super();
    }

    public final Object convert(Result arg1) {
        return ((AddAccountResult)arg1).getAccount();
    }
}

