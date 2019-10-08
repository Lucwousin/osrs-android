package com.google.android.gms.auth.api.accounttransfer;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

public class AccountTransferException extends ApiException {
    public AccountTransferException(@NonNull Status arg1) {
        super(arg1);
    }
}

