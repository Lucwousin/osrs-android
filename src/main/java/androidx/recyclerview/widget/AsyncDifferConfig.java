package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class AsyncDifferConfig {
    public final class Builder {
        private Executor mBackgroundThreadExecutor;
        private final ItemCallback mDiffCallback;
        private Executor mMainThreadExecutor;
        private static Executor sDiffExecutor;
        private static final Object sExecutorLock;

        static {
            Builder.sExecutorLock = new Object();
            Builder.sDiffExecutor = null;
        }

        public Builder(@NonNull ItemCallback arg1) {
            super();
            this.mDiffCallback = arg1;
        }

        @NonNull public AsyncDifferConfig build() {
            if(this.mBackgroundThreadExecutor == null) {
                Object v0 = Builder.sExecutorLock;
                __monitor_enter(v0);
                try {
                    if(Builder.sDiffExecutor == null) {
                        Builder.sDiffExecutor = Executors.newFixedThreadPool(2);
                    }

                    __monitor_exit(v0);
                }
                catch(Throwable v1) {
                    try {
                    label_14:
                        __monitor_exit(v0);
                    }
                    catch(Throwable v1) {
                        goto label_14;
                    }

                    throw v1;
                }

                this.mBackgroundThreadExecutor = Builder.sDiffExecutor;
            }

            return new AsyncDifferConfig(this.mMainThreadExecutor, this.mBackgroundThreadExecutor, this.mDiffCallback);
        }

        @NonNull public Builder setBackgroundThreadExecutor(Executor arg1) {
            this.mBackgroundThreadExecutor = arg1;
            return this;
        }

        @NonNull @RestrictTo(value={Scope.LIBRARY_GROUP}) public Builder setMainThreadExecutor(Executor arg1) {
            this.mMainThreadExecutor = arg1;
            return this;
        }
    }

    @NonNull private final Executor mBackgroundThreadExecutor;
    @NonNull private final ItemCallback mDiffCallback;
    @NonNull private final Executor mMainThreadExecutor;

    AsyncDifferConfig(@NonNull Executor arg1, @NonNull Executor arg2, @NonNull ItemCallback arg3) {
        super();
        this.mMainThreadExecutor = arg1;
        this.mBackgroundThreadExecutor = arg2;
        this.mDiffCallback = arg3;
    }

    @NonNull public Executor getBackgroundThreadExecutor() {
        return this.mBackgroundThreadExecutor;
    }

    @NonNull public ItemCallback getDiffCallback() {
        return this.mDiffCallback;
    }

    @NonNull @RestrictTo(value={Scope.LIBRARY_GROUP}) public Executor getMainThreadExecutor() {
        return this.mMainThreadExecutor;
    }
}

