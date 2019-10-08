package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

final class zzt implements Executor {
    zzt() {
        super();
    }

    public final void execute(@NonNull Runnable arg1) {
        arg1.run();
    }
}

