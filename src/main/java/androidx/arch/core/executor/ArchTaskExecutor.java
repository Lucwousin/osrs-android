package androidx.arch.core.executor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class ArchTaskExecutor extends TaskExecutor {
    final class androidx.arch.core.executor.ArchTaskExecutor$1 implements Executor {
        androidx.arch.core.executor.ArchTaskExecutor$1() {
            super();
        }

        public void execute(Runnable arg2) {
            ArchTaskExecutor.getInstance().postToMainThread(arg2);
        }
    }

    final class androidx.arch.core.executor.ArchTaskExecutor$2 implements Executor {
        androidx.arch.core.executor.ArchTaskExecutor$2() {
            super();
        }

        public void execute(Runnable arg2) {
            ArchTaskExecutor.getInstance().executeOnDiskIO(arg2);
        }
    }

    @NonNull private TaskExecutor mDefaultTaskExecutor;
    @NonNull private TaskExecutor mDelegate;
    @NonNull private static final Executor sIOThreadExecutor;
    private static volatile ArchTaskExecutor sInstance;
    @NonNull private static final Executor sMainThreadExecutor;

    static {
        ArchTaskExecutor.sMainThreadExecutor = new androidx.arch.core.executor.ArchTaskExecutor$1();
        ArchTaskExecutor.sIOThreadExecutor = new androidx.arch.core.executor.ArchTaskExecutor$2();
    }

    private ArchTaskExecutor() {
        super();
        this.mDefaultTaskExecutor = new DefaultTaskExecutor();
        this.mDelegate = this.mDefaultTaskExecutor;
    }

    public void executeOnDiskIO(Runnable arg2) {
        this.mDelegate.executeOnDiskIO(arg2);
    }

    @NonNull public static Executor getIOThreadExecutor() {
        return ArchTaskExecutor.sIOThreadExecutor;
    }

    @NonNull public static ArchTaskExecutor getInstance() {
        if(ArchTaskExecutor.sInstance != null) {
            return ArchTaskExecutor.sInstance;
        }

        Class v0 = ArchTaskExecutor.class;
        __monitor_enter(v0);
        try {
            if(ArchTaskExecutor.sInstance == null) {
                ArchTaskExecutor.sInstance = new ArchTaskExecutor();
            }

            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            try {
            label_15:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_15;
            }

            throw v1;
        }

        return ArchTaskExecutor.sInstance;
    }

    @NonNull public static Executor getMainThreadExecutor() {
        return ArchTaskExecutor.sMainThreadExecutor;
    }

    public boolean isMainThread() {
        return this.mDelegate.isMainThread();
    }

    public void postToMainThread(Runnable arg2) {
        this.mDelegate.postToMainThread(arg2);
    }

    public void setDelegate(@Nullable TaskExecutor arg1) {
        if(arg1 == null) {
            arg1 = this.mDefaultTaskExecutor;
        }

        this.mDelegate = arg1;
    }
}

