package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zaad implements OnCompleteListener {
    zaad(zaab arg1, TaskCompletionSource arg2) {
        this.zafm = arg1;
        this.zafn = arg2;
        super();
    }

    public final void onComplete(@NonNull Task arg2) {
        zaab.zab(this.zafm).remove(this.zafn);
    }
}

