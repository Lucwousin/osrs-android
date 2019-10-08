package androidx.arch.core.executor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class DefaultTaskExecutor extends TaskExecutor {
    class androidx.arch.core.executor.DefaultTaskExecutor$1 implements ThreadFactory {
        private static final String THREAD_NAME_STEM = "arch_disk_io_%d";
        private final AtomicInteger mThreadId;

        androidx.arch.core.executor.DefaultTaskExecutor$1(DefaultTaskExecutor arg2) {
            DefaultTaskExecutor.this = arg2;
            super();
            this.mThreadId = new AtomicInteger(0);
        }

        public Thread newThread(Runnable arg5) {
            Thread v0 = new Thread(arg5);
            v0.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.mThreadId.getAndIncrement())));
            return v0;
        }
    }

    private final ExecutorService mDiskIO;
    private final Object mLock;
    @Nullable private volatile Handler mMainHandler;

    public DefaultTaskExecutor() {
        super();
        this.mLock = new Object();
        this.mDiskIO = Executors.newFixedThreadPool(2, new androidx.arch.core.executor.DefaultTaskExecutor$1(this));
    }

    public void executeOnDiskIO(Runnable arg2) {
        this.mDiskIO.execute(arg2);
    }

    public boolean isMainThread() {
        boolean v0 = Looper.getMainLooper().getThread() == Thread.currentThread() ? true : false;
        return v0;
    }

    public void postToMainThread(Runnable arg4) {
        if(this.mMainHandler == null) {
            Object v0 = this.mLock;
            __monitor_enter(v0);
            try {
                if(this.mMainHandler == null) {
                    this.mMainHandler = new Handler(Looper.getMainLooper());
                }

                __monitor_exit(v0);
                goto label_15;
            label_13:
                __monitor_exit(v0);
            }
            catch(Throwable v4) {
                goto label_13;
            }

            throw v4;
        }

    label_15:
        this.mMainHandler.post(arg4);
    }
}

