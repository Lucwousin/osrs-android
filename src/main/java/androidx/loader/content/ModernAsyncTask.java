package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

abstract class ModernAsyncTask {
    final class androidx.loader.content.ModernAsyncTask$1 implements ThreadFactory {
        private final AtomicInteger mCount;

        androidx.loader.content.ModernAsyncTask$1() {
            super();
            this.mCount = new AtomicInteger(1);
        }

        public Thread newThread(Runnable arg4) {
            StringBuilder v1 = new StringBuilder();
            v1.append("ModernAsyncTask #");
            v1.append(this.mCount.getAndIncrement());
            return new Thread(arg4, v1.toString());
        }
    }

    class androidx.loader.content.ModernAsyncTask$4 {
        static {
            androidx.loader.content.ModernAsyncTask$4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status = new int[Status.values().length];
            try {
                androidx.loader.content.ModernAsyncTask$4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status[Status.RUNNING.ordinal()] = 1;
                goto label_9;
            }
            catch(NoSuchFieldError ) {
                try {
                label_9:
                    androidx.loader.content.ModernAsyncTask$4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status[Status.FINISHED.ordinal()] = 2;
                    return;
                }
                catch(NoSuchFieldError ) {
                    return;
                }
            }
        }
    }

    class AsyncTaskResult {
        final Object[] mData;
        final ModernAsyncTask mTask;

        AsyncTaskResult(ModernAsyncTask arg1, Object[] arg2) {
            super();
            this.mTask = arg1;
            this.mData = arg2;
        }
    }

    class InternalHandler extends Handler {
        InternalHandler() {
            super(Looper.getMainLooper());
        }

        public void handleMessage(Message arg3) {
            Object v0 = arg3.obj;
            switch(arg3.what) {
                case 1: {
                    ((AsyncTaskResult)v0).mTask.finish(((AsyncTaskResult)v0).mData[0]);
                    break;
                }
                case 2: {
                    ((AsyncTaskResult)v0).mTask.onProgressUpdate(((AsyncTaskResult)v0).mData);
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }

    public enum Status {
        public static final enum Status FINISHED;
        public static final enum Status PENDING;
        public static final enum Status RUNNING;

        static {
            Status.PENDING = new Status("PENDING", 0);
            Status.RUNNING = new Status("RUNNING", 1);
            Status.FINISHED = new Status("FINISHED", 2);
            Status.$VALUES = new Status[]{Status.PENDING, Status.RUNNING, Status.FINISHED};
        }

        private Status(String arg1, int arg2) {
            super(arg1, arg2);
        }

        public static Status valueOf(String arg1) {
            return Enum.valueOf(Status.class, arg1);
        }

        public static Status[] values() {
            return Status.$VALUES.clone();
        }
    }

    abstract class WorkerRunnable implements Callable {
        Object[] mParams;

        WorkerRunnable() {
            super();
        }
    }

    private static final int CORE_POOL_SIZE = 5;
    private static final int KEEP_ALIVE = 1;
    private static final String LOG_TAG = "AsyncTask";
    private static final int MAXIMUM_POOL_SIZE = 0x80;
    private static final int MESSAGE_POST_PROGRESS = 2;
    private static final int MESSAGE_POST_RESULT = 1;
    public static final Executor THREAD_POOL_EXECUTOR;
    final AtomicBoolean mCancelled;
    private final FutureTask mFuture;
    private volatile Status mStatus;
    final AtomicBoolean mTaskInvoked;
    private final WorkerRunnable mWorker;
    private static volatile Executor sDefaultExecutor;
    private static InternalHandler sHandler;
    private static final BlockingQueue sPoolWorkQueue;
    private static final ThreadFactory sThreadFactory;

    static {
        ModernAsyncTask.sThreadFactory = new androidx.loader.content.ModernAsyncTask$1();
        ModernAsyncTask.sPoolWorkQueue = new LinkedBlockingQueue(10);
        ModernAsyncTask.THREAD_POOL_EXECUTOR = new ThreadPoolExecutor(5, 0x80, 1, TimeUnit.SECONDS, ModernAsyncTask.sPoolWorkQueue, ModernAsyncTask.sThreadFactory);
        ModernAsyncTask.sDefaultExecutor = ModernAsyncTask.THREAD_POOL_EXECUTOR;
    }

    ModernAsyncTask() {
        super();
        this.mStatus = Status.PENDING;
        this.mCancelled = new AtomicBoolean();
        this.mTaskInvoked = new AtomicBoolean();
        this.mWorker = new WorkerRunnable() {
            public Object call() throws Exception {
                Object v0_2;
                ModernAsyncTask.this.mTaskInvoked.set(true);
                int v0 = 10;
                Object v2 = null;
                try {
                    Process.setThreadPriority(v0);
                    v0_2 = ModernAsyncTask.this.doInBackground(this.mParams);
                    goto label_10;
                }
                catch(Throwable v1) {
                }
                catch(Throwable v0_1) {
                    goto label_25;
                    try {
                    label_10:
                        Binder.flushPendingCommands();
                        goto label_11;
                    }
                    catch(Throwable v1) {
                        v2 = v0_2;
                    }
                    catch(Throwable v2_1) {
                        Throwable v4 = v2_1;
                        v2 = v0_2;
                        v0_1 = v4;
                        try {
                        label_25:
                            ModernAsyncTask.this.mCancelled.set(true);
                            throw v0_1;
                        }
                        catch(Throwable v1) {
                        }
                    }
                }

                ModernAsyncTask.this.postResult(v2);
                throw v1;
            label_11:
                ModernAsyncTask.this.postResult(v0_2);
                return v0_2;
            }
        };
        this.mFuture = new FutureTask(this.mWorker) {
            protected void done() {
                try {
                    ModernAsyncTask.this.postResultIfNotInvoked(this.get());
                }
                catch(Throwable v0) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", v0);
                }
                catch(CancellationException ) {
                    ModernAsyncTask.this.postResultIfNotInvoked(null);
                }
                catch(ExecutionException v0_1) {
                    throw new RuntimeException("An error occurred while executing doInBackground()", v0_1.getCause());
                }
                catch(InterruptedException v0_2) {
                    Log.w("AsyncTask", ((Throwable)v0_2));
                }
            }
        };
    }

    public final boolean cancel(boolean arg3) {
        this.mCancelled.set(true);
        return this.mFuture.cancel(arg3);
    }

    protected abstract Object doInBackground(Object[] arg1);

    public static void execute(Runnable arg1) {
        ModernAsyncTask.sDefaultExecutor.execute(arg1);
    }

    public final ModernAsyncTask execute(Object[] arg2) {
        return this.executeOnExecutor(ModernAsyncTask.sDefaultExecutor, arg2);
    }

    public final ModernAsyncTask executeOnExecutor(Executor arg3, Object[] arg4) {
        if(this.mStatus == Status.PENDING) {
            goto label_20;
        }

        switch(androidx.loader.content.ModernAsyncTask$4.$SwitchMap$androidx$loader$content$ModernAsyncTask$Status[this.mStatus.ordinal()]) {
            case 1: {
                goto label_16;
            }
            case 2: {
                goto label_12;
            }
        }

        throw new IllegalStateException("We should never reach this state");
    label_12:
        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
    label_16:
        throw new IllegalStateException("Cannot execute task: the task is already running.");
    label_20:
        this.mStatus = Status.RUNNING;
        this.onPreExecute();
        this.mWorker.mParams = arg4;
        arg3.execute(this.mFuture);
        return this;
    }

    void finish(Object arg2) {
        if(this.isCancelled()) {
            this.onCancelled(arg2);
        }
        else {
            this.onPostExecute(arg2);
        }

        this.mStatus = Status.FINISHED;
    }

    public final Object get() throws InterruptedException, ExecutionException {
        return this.mFuture.get();
    }

    public final Object get(long arg2, TimeUnit arg4) throws InterruptedException, ExecutionException, TimeoutException {
        return this.mFuture.get(arg2, arg4);
    }

    private static Handler getHandler() {
        Class v0 = ModernAsyncTask.class;
        __monitor_enter(v0);
        try {
            if(ModernAsyncTask.sHandler == null) {
                ModernAsyncTask.sHandler = new InternalHandler();
            }

            __monitor_exit(v0);
            return ModernAsyncTask.sHandler;
        label_11:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_11;
        }

        throw v1;
    }

    public final Status getStatus() {
        return this.mStatus;
    }

    public final boolean isCancelled() {
        return this.mCancelled.get();
    }

    protected void onCancelled(Object arg1) {
        this.onCancelled();
    }

    protected void onCancelled() {
    }

    protected void onPostExecute(Object arg1) {
    }

    protected void onPreExecute() {
    }

    protected void onProgressUpdate(Object[] arg1) {
    }

    Object postResult(Object arg6) {
        ModernAsyncTask.getHandler().obtainMessage(1, new AsyncTaskResult(this, new Object[]{arg6})).sendToTarget();
        return arg6;
    }

    void postResultIfNotInvoked(Object arg2) {
        if(!this.mTaskInvoked.get()) {
            this.postResult(arg2);
        }
    }

    protected final void publishProgress(Object[] arg4) {
        if(!this.isCancelled()) {
            ModernAsyncTask.getHandler().obtainMessage(2, new AsyncTaskResult(this, arg4)).sendToTarget();
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public static void setDefaultExecutor(Executor arg0) {
        ModernAsyncTask.sDefaultExecutor = arg0;
    }
}

