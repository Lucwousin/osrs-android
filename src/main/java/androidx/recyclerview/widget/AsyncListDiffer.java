package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public class AsyncListDiffer {
    class MainThreadExecutor implements Executor {
        final Handler mHandler;

        MainThreadExecutor() {
            super();
            this.mHandler = new Handler(Looper.getMainLooper());
        }

        public void execute(@NonNull Runnable arg2) {
            this.mHandler.post(arg2);
        }
    }

    final AsyncDifferConfig mConfig;
    @Nullable private List mList;
    final Executor mMainThreadExecutor;
    int mMaxScheduledGeneration;
    @NonNull private List mReadOnlyList;
    private final ListUpdateCallback mUpdateCallback;
    private static final Executor sMainThreadExecutor;

    static {
        AsyncListDiffer.sMainThreadExecutor = new MainThreadExecutor();
    }

    public AsyncListDiffer(@NonNull ListUpdateCallback arg2, @NonNull AsyncDifferConfig arg3) {
        super();
        this.mReadOnlyList = Collections.emptyList();
        this.mUpdateCallback = arg2;
        this.mConfig = arg3;
        this.mMainThreadExecutor = arg3.getMainThreadExecutor() != null ? arg3.getMainThreadExecutor() : AsyncListDiffer.sMainThreadExecutor;
    }

    public AsyncListDiffer(@NonNull Adapter arg2, @NonNull ItemCallback arg3) {
        this(new AdapterListUpdateCallback(arg2), new Builder(arg3).build());
    }

    @NonNull public List getCurrentList() {
        return this.mReadOnlyList;
    }

    void latchList(@NonNull List arg1, @NonNull DiffResult arg2) {
        this.mList = arg1;
        this.mReadOnlyList = Collections.unmodifiableList(arg1);
        arg2.dispatchUpdatesTo(this.mUpdateCallback);
    }

    public void submitList(@Nullable List arg5) {
        int v0 = this.mMaxScheduledGeneration + 1;
        this.mMaxScheduledGeneration = v0;
        if(arg5 == this.mList) {
            return;
        }

        if(arg5 == null) {
            int v5 = this.mList.size();
            this.mList = null;
            this.mReadOnlyList = Collections.emptyList();
            this.mUpdateCallback.onRemoved(0, v5);
            return;
        }

        if(this.mList == null) {
            this.mList = arg5;
            this.mReadOnlyList = Collections.unmodifiableList(arg5);
            this.mUpdateCallback.onInserted(0, arg5.size());
            return;
        }

        this.mConfig.getBackgroundThreadExecutor().execute(new Runnable(this.mList, arg5, v0) {
            public void run() {
                AsyncListDiffer.this.mMainThreadExecutor.execute(new Runnable(DiffUtil.calculateDiff(new Callback() {
                    public boolean areContentsTheSame(int arg2, int arg3) {
                        Object v2 = this.this$1.val$oldList.get(arg2);
                        Object v3 = this.this$1.val$newList.get(arg3);
                        if(v2 != null && v3 != null) {
                            return this.this$1.this$0.mConfig.getDiffCallback().areContentsTheSame(v2, v3);
                        }

                        if(v2 == null && v3 == null) {
                            return 1;
                        }

                        throw new AssertionError();
                    }

                    public boolean areItemsTheSame(int arg2, int arg3) {
                        Object v2 = this.this$1.val$oldList.get(arg2);
                        Object v3 = this.this$1.val$newList.get(arg3);
                        if(v2 != null && v3 != null) {
                            return this.this$1.this$0.mConfig.getDiffCallback().areItemsTheSame(v2, v3);
                        }

                        boolean v2_1 = v2 != null || v3 != null ? false : true;
                        return v2_1;
                    }

                    @Nullable public Object getChangePayload(int arg2, int arg3) {
                        Object v2 = this.this$1.val$oldList.get(arg2);
                        Object v3 = this.this$1.val$newList.get(arg3);
                        if(v2 != null && v3 != null) {
                            return this.this$1.this$0.mConfig.getDiffCallback().getChangePayload(v2, v3);
                        }

                        throw new AssertionError();
                    }

                    public int getNewListSize() {
                        return this.this$1.val$newList.size();
                    }

                    public int getOldListSize() {
                        return this.this$1.val$oldList.size();
                    }
                })) {
                    public void run() {
                        if(this.this$1.this$0.mMaxScheduledGeneration == this.this$1.val$runGeneration) {
                            this.this$1.this$0.latchList(this.this$1.val$newList, this.val$result);
                        }
                    }
                });
            }
        });
    }
}

