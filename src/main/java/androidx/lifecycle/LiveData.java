package androidx.lifecycle;

import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions;
import androidx.arch.core.internal.SafeIterableMap;
import java.util.Iterator;
import java.util.Map$Entry;

public abstract class LiveData {
    class androidx.lifecycle.LiveData$1 implements Runnable {
        androidx.lifecycle.LiveData$1(LiveData arg1) {
            LiveData.this = arg1;
            super();
        }

        public void run() {
            Object v1_1;
            Object v0 = LiveData.this.mDataLock;
            __monitor_enter(v0);
            try {
                v1_1 = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                try {
                label_13:
                    __monitor_exit(v0);
                }
                catch(Throwable v1) {
                    goto label_13;
                }

                throw v1;
            }

            LiveData.this.setValue(v1_1);
        }
    }

    class AlwaysActiveObserver extends ObserverWrapper {
        AlwaysActiveObserver(LiveData arg1, Observer arg2) {
            LiveData.this = arg1;
            super(arg1, arg2);
        }

        boolean shouldBeActive() {
            return 1;
        }
    }

    class LifecycleBoundObserver extends ObserverWrapper implements GenericLifecycleObserver {
        @NonNull final LifecycleOwner mOwner;

        LifecycleBoundObserver(@NonNull LiveData arg1, LifecycleOwner arg2, Observer arg3) {
            LiveData.this = arg1;
            super(arg1, arg3);
            this.mOwner = arg2;
        }

        void detachObserver() {
            this.mOwner.getLifecycle().removeObserver(((LifecycleObserver)this));
        }

        boolean isAttachedTo(LifecycleOwner arg2) {
            boolean v2 = this.mOwner == arg2 ? true : false;
            return v2;
        }

        public void onStateChanged(LifecycleOwner arg1, Event arg2) {
            if(this.mOwner.getLifecycle().getCurrentState() == State.DESTROYED) {
                LiveData.this.removeObserver(this.mObserver);
                return;
            }

            this.activeStateChanged(this.shouldBeActive());
        }

        boolean shouldBeActive() {
            return this.mOwner.getLifecycle().getCurrentState().isAtLeast(State.STARTED);
        }
    }

    abstract class ObserverWrapper {
        boolean mActive;
        int mLastVersion;
        final Observer mObserver;

        ObserverWrapper(LiveData arg1, Observer arg2) {
            LiveData.this = arg1;
            super();
            this.mLastVersion = -1;
            this.mObserver = arg2;
        }

        void activeStateChanged(boolean arg5) {
            if(arg5 == this.mActive) {
                return;
            }

            this.mActive = arg5;
            int v0 = 1;
            int v5 = LiveData.this.mActiveCount == 0 ? 1 : 0;
            LiveData v1 = LiveData.this;
            int v2 = v1.mActiveCount;
            if(this.mActive) {
            }
            else {
                v0 = -1;
            }

            v1.mActiveCount = v2 + v0;
            if(v5 != 0 && (this.mActive)) {
                LiveData.this.onActive();
            }

            if(LiveData.this.mActiveCount == 0 && !this.mActive) {
                LiveData.this.onInactive();
            }

            if(this.mActive) {
                LiveData.this.dispatchingValue(this);
            }
        }

        void detachObserver() {
        }

        boolean isAttachedTo(LifecycleOwner arg1) {
            return 0;
        }

        abstract boolean shouldBeActive();
    }

    static final Object NOT_SET = null;
    static final int START_VERSION = -1;
    int mActiveCount;
    private volatile Object mData;
    final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private SafeIterableMap mObservers;
    volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    static {
        LiveData.NOT_SET = new Object();
    }

    public LiveData() {
        super();
        this.mDataLock = new Object();
        this.mObservers = new SafeIterableMap();
        this.mActiveCount = 0;
        this.mData = LiveData.NOT_SET;
        this.mPendingData = LiveData.NOT_SET;
        this.mVersion = -1;
        this.mPostValueRunnable = new androidx.lifecycle.LiveData$1(this);
    }

    private static void assertMainThread(String arg3) {
        if(ArchTaskExecutor.getInstance().isMainThread()) {
            return;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Cannot invoke ");
        v1.append(arg3);
        v1.append(" on a background");
        v1.append(" thread");
        throw new IllegalStateException(v1.toString());
    }

    private void considerNotify(ObserverWrapper arg3) {
        if(!arg3.mActive) {
            return;
        }

        if(!arg3.shouldBeActive()) {
            arg3.activeStateChanged(false);
            return;
        }

        if(arg3.mLastVersion >= this.mVersion) {
            return;
        }

        arg3.mLastVersion = this.mVersion;
        arg3.mObserver.onChanged(this.mData);
    }

    void dispatchingValue(@Nullable ObserverWrapper arg4) {
        if(this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }

        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if(0 != 0) {
                this.considerNotify(arg4);
                arg4 = null;
            }
            else {
                IteratorWithAdditions v1 = this.mObservers.iteratorWithAdditions();
                do {
                    if(((Iterator)v1).hasNext()) {
                        this.considerNotify(((Iterator)v1).next().getValue());
                        if(!this.mDispatchInvalidated) {
                            continue;
                        }
                    }

                    break;
                }
                while(true);
            }
        }
        while(this.mDispatchInvalidated);

        this.mDispatchingValue = false;
    }

    @Nullable public Object getValue() {
        Object v0 = this.mData;
        if(v0 != LiveData.NOT_SET) {
            return v0;
        }

        return null;
    }

    int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        boolean v0 = this.mActiveCount > 0 ? true : false;
        return v0;
    }

    public boolean hasObservers() {
        boolean v0 = this.mObservers.size() > 0 ? true : false;
        return v0;
    }

    @MainThread public void observe(@NonNull LifecycleOwner arg3, @NonNull Observer arg4) {
        LiveData.assertMainThread("observe");
        if(arg3.getLifecycle().getCurrentState() == State.DESTROYED) {
            return;
        }

        LifecycleBoundObserver v0 = new LifecycleBoundObserver(this, arg3, arg4);
        Object v4 = this.mObservers.putIfAbsent(arg4, v0);
        if(v4 != null) {
            if(((ObserverWrapper)v4).isAttachedTo(arg3)) {
            }
            else {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
        }

        if(v4 != null) {
            return;
        }

        arg3.getLifecycle().addObserver(((LifecycleObserver)v0));
    }

    @MainThread public void observeForever(@NonNull Observer arg3) {
        LiveData.assertMainThread("observeForever");
        AlwaysActiveObserver v0 = new AlwaysActiveObserver(this, arg3);
        Object v3 = this.mObservers.putIfAbsent(arg3, v0);
        if(v3 != null) {
            if(!(v3 instanceof LifecycleBoundObserver)) {
            }
            else {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
        }

        if(v3 != null) {
            return;
        }

        v0.activeStateChanged(true);
    }

    protected void onActive() {
    }

    protected void onInactive() {
    }

    protected void postValue(Object arg4) {
        Object v0 = this.mDataLock;
        __monitor_enter(v0);
        try {
            int v1 = this.mPendingData == LiveData.NOT_SET ? 1 : 0;
            this.mPendingData = arg4;
            __monitor_exit(v0);
            if(v1 != 0) {
                goto label_12;
            }
        }
        catch(Throwable v4) {
            try {
            label_17:
                __monitor_exit(v0);
            }
            catch(Throwable v4) {
                goto label_17;
            }

            throw v4;
        }

        return;
    label_12:
        ArchTaskExecutor.getInstance().postToMainThread(this.mPostValueRunnable);
    }

    @MainThread public void removeObserver(@NonNull Observer arg2) {
        LiveData.assertMainThread("removeObserver");
        Object v2 = this.mObservers.remove(arg2);
        if(v2 == null) {
            return;
        }

        ((ObserverWrapper)v2).detachObserver();
        ((ObserverWrapper)v2).activeStateChanged(false);
    }

    @MainThread public void removeObservers(@NonNull LifecycleOwner arg4) {
        LiveData.assertMainThread("removeObservers");
        Iterator v0 = this.mObservers.iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            if(!((Map$Entry)v1).getValue().isAttachedTo(arg4)) {
                continue;
            }

            this.removeObserver(((Map$Entry)v1).getKey());
        }
    }

    @MainThread protected void setValue(Object arg2) {
        LiveData.assertMainThread("setValue");
        ++this.mVersion;
        this.mData = arg2;
        this.dispatchingValue(null);
    }
}

