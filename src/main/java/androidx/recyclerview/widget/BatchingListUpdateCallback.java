package androidx.recyclerview.widget;

import androidx.annotation.NonNull;

public class BatchingListUpdateCallback implements ListUpdateCallback {
    private static final int TYPE_ADD = 1;
    private static final int TYPE_CHANGE = 3;
    private static final int TYPE_NONE = 0;
    private static final int TYPE_REMOVE = 2;
    int mLastEventCount;
    Object mLastEventPayload;
    int mLastEventPosition;
    int mLastEventType;
    final ListUpdateCallback mWrapped;

    public BatchingListUpdateCallback(@NonNull ListUpdateCallback arg2) {
        super();
        this.mLastEventType = 0;
        this.mLastEventPosition = -1;
        this.mLastEventCount = -1;
        this.mLastEventPayload = null;
        this.mWrapped = arg2;
    }

    public void dispatchLastEvent() {
        if(this.mLastEventType == 0) {
            return;
        }

        switch(this.mLastEventType) {
            case 1: {
                this.mWrapped.onInserted(this.mLastEventPosition, this.mLastEventCount);
                break;
            }
            case 2: {
                this.mWrapped.onRemoved(this.mLastEventPosition, this.mLastEventCount);
                break;
            }
            case 3: {
                this.mWrapped.onChanged(this.mLastEventPosition, this.mLastEventCount, this.mLastEventPayload);
                break;
            }
            default: {
                break;
            }
        }

        this.mLastEventPayload = null;
        this.mLastEventType = 0;
    }

    public void onChanged(int arg4, int arg5, Object arg6) {
        int v1 = 3;
        if(this.mLastEventType == v1 && arg4 <= this.mLastEventPosition + this.mLastEventCount) {
            int v0 = arg4 + arg5;
            if(v0 >= this.mLastEventPosition && this.mLastEventPayload == arg6) {
                arg5 = this.mLastEventPosition + this.mLastEventCount;
                this.mLastEventPosition = Math.min(arg4, this.mLastEventPosition);
                this.mLastEventCount = Math.max(arg5, v0) - this.mLastEventPosition;
                return;
            }
        }

        this.dispatchLastEvent();
        this.mLastEventPosition = arg4;
        this.mLastEventCount = arg5;
        this.mLastEventPayload = arg6;
        this.mLastEventType = v1;
    }

    public void onInserted(int arg4, int arg5) {
        if(this.mLastEventType == 1 && arg4 >= this.mLastEventPosition && arg4 <= this.mLastEventPosition + this.mLastEventCount) {
            this.mLastEventCount += arg5;
            this.mLastEventPosition = Math.min(arg4, this.mLastEventPosition);
            return;
        }

        this.dispatchLastEvent();
        this.mLastEventPosition = arg4;
        this.mLastEventCount = arg5;
        this.mLastEventType = 1;
    }

    public void onMoved(int arg2, int arg3) {
        this.dispatchLastEvent();
        this.mWrapped.onMoved(arg2, arg3);
    }

    public void onRemoved(int arg4, int arg5) {
        int v1 = 2;
        if(this.mLastEventType == v1 && this.mLastEventPosition >= arg4 && this.mLastEventPosition <= arg4 + arg5) {
            this.mLastEventCount += arg5;
            this.mLastEventPosition = arg4;
            return;
        }

        this.dispatchLastEvent();
        this.mLastEventPosition = arg4;
        this.mLastEventCount = arg5;
        this.mLastEventType = v1;
    }
}

