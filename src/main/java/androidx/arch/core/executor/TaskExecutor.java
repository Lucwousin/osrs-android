package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public abstract class TaskExecutor {
    public TaskExecutor() {
        super();
    }

    public abstract void executeOnDiskIO(@NonNull Runnable arg1);

    public void executeOnMainThread(@NonNull Runnable arg2) {
        if(this.isMainThread()) {
            arg2.run();
        }
        else {
            this.postToMainThread(arg2);
        }
    }

    public abstract boolean isMainThread();

    public abstract void postToMainThread(@NonNull Runnable arg1);
}

