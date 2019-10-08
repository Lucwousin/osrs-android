package androidx.recyclerview.widget;

import androidx.core.util.Pools$Pool;
import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class AdapterHelper implements Callback {
    interface androidx.recyclerview.widget.AdapterHelper$Callback {
        ViewHolder findViewHolder(int arg1);

        void markViewHoldersUpdated(int arg1, int arg2, Object arg3);

        void offsetPositionsForAdd(int arg1, int arg2);

        void offsetPositionsForMove(int arg1, int arg2);

        void offsetPositionsForRemovingInvisible(int arg1, int arg2);

        void offsetPositionsForRemovingLaidOutOrNewView(int arg1, int arg2);

        void onDispatchFirstPass(UpdateOp arg1);

        void onDispatchSecondPass(UpdateOp arg1);
    }

    class UpdateOp {
        static final int ADD = 1;
        static final int MOVE = 8;
        static final int POOL_SIZE = 30;
        static final int REMOVE = 2;
        static final int UPDATE = 4;
        int cmd;
        int itemCount;
        Object payload;
        int positionStart;

        UpdateOp(int arg1, int arg2, int arg3, Object arg4) {
            super();
            this.cmd = arg1;
            this.positionStart = arg2;
            this.itemCount = arg3;
            this.payload = arg4;
        }

        String cmdToString() {
            int v0 = this.cmd;
            if(v0 == 4) {
                return "up";
            }

            if(v0 == 8) {
                return "mv";
            }

            switch(v0) {
                case 1: {
                    return "add";
                }
                case 2: {
                    return "rm";
                }
            }

            return "??";
        }

        public boolean equals(Object arg5) {
            if(this == (((UpdateOp)arg5))) {
                return 1;
            }

            if(arg5 != null) {
                if(this.getClass() != arg5.getClass()) {
                }
                else if(this.cmd != ((UpdateOp)arg5).cmd) {
                    return 0;
                }
                else {
                    if(this.cmd == 8 && Math.abs(this.itemCount - this.positionStart) == 1 && this.itemCount == ((UpdateOp)arg5).positionStart && this.positionStart == ((UpdateOp)arg5).itemCount) {
                        return 1;
                    }

                    if(this.itemCount != ((UpdateOp)arg5).itemCount) {
                        return 0;
                    }

                    if(this.positionStart != ((UpdateOp)arg5).positionStart) {
                        return 0;
                    }

                    if(this.payload != null) {
                        if(!this.payload.equals(((UpdateOp)arg5).payload)) {
                            return 0;
                        }
                    }
                    else if(((UpdateOp)arg5).payload != null) {
                        return 0;
                    }

                    return 1;
                }
            }

            return 0;
        }

        public int hashCode() {
            return (this.cmd * 0x1F + this.positionStart) * 0x1F + this.itemCount;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + this.cmdToString() + ",s:" + this.positionStart + "c:" + this.itemCount + ",p:" + this.payload + "]";
        }
    }

    private static final boolean DEBUG = false;
    static final int POSITION_TYPE_INVISIBLE = 0;
    static final int POSITION_TYPE_NEW_OR_LAID_OUT = 1;
    private static final String TAG = "AHT";
    final androidx.recyclerview.widget.AdapterHelper$Callback mCallback;
    final boolean mDisableRecycler;
    private int mExistingUpdateTypes;
    Runnable mOnItemProcessedCallback;
    final OpReorderer mOpReorderer;
    final ArrayList mPendingUpdates;
    final ArrayList mPostponedList;
    private Pool mUpdateOpPool;

    AdapterHelper(androidx.recyclerview.widget.AdapterHelper$Callback arg2) {
        this(arg2, false);
    }

    AdapterHelper(androidx.recyclerview.widget.AdapterHelper$Callback arg3, boolean arg4) {
        super();
        this.mUpdateOpPool = new SimplePool(30);
        this.mPendingUpdates = new ArrayList();
        this.mPostponedList = new ArrayList();
        this.mExistingUpdateTypes = 0;
        this.mCallback = arg3;
        this.mDisableRecycler = arg4;
        this.mOpReorderer = new OpReorderer(((Callback)this));
    }

    AdapterHelper addUpdateOp(UpdateOp[] arg2) {
        Collections.addAll(this.mPendingUpdates, ((Object[])arg2));
        return this;
    }

    private void applyAdd(UpdateOp arg1) {
        this.postponeAndUpdateViewHolders(arg1);
    }

    private void applyMove(UpdateOp arg1) {
        this.postponeAndUpdateViewHolders(arg1);
    }

    public int applyPendingUpdatesToPosition(int arg6) {
        int v0 = this.mPendingUpdates.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            Object v2 = this.mPendingUpdates.get(v1);
            int v3 = ((UpdateOp)v2).cmd;
            if(v3 != 8) {
                switch(v3) {
                    case 1: {
                        goto label_22;
                    }
                    case 2: {
                        goto label_11;
                    }
                }

                goto label_37;
            label_22:
                if(((UpdateOp)v2).positionStart <= arg6) {
                    arg6 += ((UpdateOp)v2).itemCount;
                    goto label_37;
                label_11:
                    if(((UpdateOp)v2).positionStart <= arg6) {
                        if(((UpdateOp)v2).positionStart + ((UpdateOp)v2).itemCount > arg6) {
                            return -1;
                        }
                        else {
                            arg6 -= ((UpdateOp)v2).itemCount;
                        }
                    }
                }
            }
            else if(((UpdateOp)v2).positionStart == arg6) {
                arg6 = ((UpdateOp)v2).itemCount;
            }
            else {
                if(((UpdateOp)v2).positionStart < arg6) {
                    --arg6;
                }

                if(((UpdateOp)v2).itemCount > arg6) {
                    goto label_37;
                }

                ++arg6;
            }

        label_37:
        }

        return arg6;
    }

    private void applyRemove(UpdateOp arg11) {
        int v6_1;
        int v7;
        Object v6;
        int v0 = arg11.positionStart;
        int v1 = arg11.positionStart + arg11.itemCount;
        int v2 = arg11.positionStart;
        int v4 = 0;
        int v5;
        for(v5 = -1; true; v5 = v6_1) {
            v6 = null;
            v7 = 2;
            if(v2 >= v1) {
                break;
            }

            if(this.mCallback.findViewHolder(v2) != null || (this.canFindInPreLayout(v2))) {
                if(v5 == 0) {
                    this.dispatchAndUpdateViewHolders(this.obtainUpdateOp(v7, v0, v4, v6));
                    v5 = 1;
                }
                else {
                    v5 = 0;
                }

                v6_1 = 1;
            }
            else {
                if(v5 == 1) {
                    this.postponeAndUpdateViewHolders(this.obtainUpdateOp(v7, v0, v4, v6));
                    v5 = 1;
                }
                else {
                    v5 = 0;
                }

                v6_1 = 0;
            }

            if(v5 != 0) {
                v2 -= v4;
                v1 -= v4;
                v4 = 1;
            }
            else {
                ++v4;
            }

            ++v2;
        }

        if(v4 != arg11.itemCount) {
            this.recycleUpdateOp(arg11);
            arg11 = this.obtainUpdateOp(v7, v0, v4, v6);
        }

        if(v5 == 0) {
            this.dispatchAndUpdateViewHolders(arg11);
        }
        else {
            this.postponeAndUpdateViewHolders(arg11);
        }
    }

    private void applyUpdate(UpdateOp arg10) {
        int v6;
        int v0 = arg10.positionStart;
        int v1 = arg10.positionStart + arg10.itemCount;
        int v2 = arg10.positionStart;
        int v4 = -1;
        int v5 = v0;
        v0 = 0;
        while(true) {
            v6 = 4;
            if(v2 >= v1) {
                break;
            }

            if(this.mCallback.findViewHolder(v2) != null || (this.canFindInPreLayout(v2))) {
                if(v4 == 0) {
                    this.dispatchAndUpdateViewHolders(this.obtainUpdateOp(v6, v5, v0, arg10.payload));
                    v5 = v2;
                    v0 = 0;
                }

                v4 = 1;
            }
            else {
                if(v4 == 1) {
                    this.postponeAndUpdateViewHolders(this.obtainUpdateOp(v6, v5, v0, arg10.payload));
                    v5 = v2;
                    v0 = 0;
                }

                v4 = 0;
            }

            ++v0;
            ++v2;
        }

        if(v0 != arg10.itemCount) {
            Object v1_1 = arg10.payload;
            this.recycleUpdateOp(arg10);
            arg10 = this.obtainUpdateOp(v6, v5, v0, v1_1);
        }

        if(v4 == 0) {
            this.dispatchAndUpdateViewHolders(arg10);
        }
        else {
            this.postponeAndUpdateViewHolders(arg10);
        }
    }

    private boolean canFindInPreLayout(int arg8) {
        int v0 = this.mPostponedList.size();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            Object v3 = this.mPostponedList.get(v2);
            if(((UpdateOp)v3).cmd == 8) {
                if(this.findPositionOffset(((UpdateOp)v3).itemCount, v2 + 1) == arg8) {
                    return 1;
                }
            }
            else if(((UpdateOp)v3).cmd == 1) {
                int v4 = ((UpdateOp)v3).positionStart + ((UpdateOp)v3).itemCount;
                int v3_1 = ((UpdateOp)v3).positionStart;
                while(v3_1 < v4) {
                    if(this.findPositionOffset(v3_1, v2 + 1) == arg8) {
                        return 1;
                    }
                    else {
                        ++v3_1;
                        continue;
                    }

                    break;
                }
            }
        }

        return 0;
    }

    void consumePostponedUpdates() {
        int v0 = this.mPostponedList.size();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            this.mCallback.onDispatchSecondPass(this.mPostponedList.get(v2));
        }

        this.recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    void consumeUpdatesInOnePass() {
        this.consumePostponedUpdates();
        int v0 = this.mPendingUpdates.size();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            Object v3 = this.mPendingUpdates.get(v2);
            int v4 = ((UpdateOp)v3).cmd;
            if(v4 == 4) {
                this.mCallback.onDispatchSecondPass(((UpdateOp)v3));
                this.mCallback.markViewHoldersUpdated(((UpdateOp)v3).positionStart, ((UpdateOp)v3).itemCount, ((UpdateOp)v3).payload);
            }
            else if(v4 != 8) {
                switch(v4) {
                    case 1: {
                        goto label_22;
                    }
                    case 2: {
                        goto label_15;
                    }
                }

                goto label_43;
            label_22:
                this.mCallback.onDispatchSecondPass(((UpdateOp)v3));
                this.mCallback.offsetPositionsForAdd(((UpdateOp)v3).positionStart, ((UpdateOp)v3).itemCount);
                goto label_43;
            label_15:
                this.mCallback.onDispatchSecondPass(((UpdateOp)v3));
                this.mCallback.offsetPositionsForRemovingInvisible(((UpdateOp)v3).positionStart, ((UpdateOp)v3).itemCount);
            }
            else {
                this.mCallback.onDispatchSecondPass(((UpdateOp)v3));
                this.mCallback.offsetPositionsForMove(((UpdateOp)v3).positionStart, ((UpdateOp)v3).itemCount);
            }

        label_43:
            if(this.mOnItemProcessedCallback != null) {
                this.mOnItemProcessedCallback.run();
            }
        }

        this.recycleUpdateOpsAndClearList(this.mPendingUpdates);
        this.mExistingUpdateTypes = 0;
    }

    private void dispatchAndUpdateViewHolders(UpdateOp arg13) {
        if(arg13.cmd != 1 && arg13.cmd != 8) {
            int v0 = this.updatePositionWithPostponed(arg13.positionStart, arg13.cmd);
            int v2 = arg13.positionStart;
            int v3 = arg13.cmd;
            int v4 = 2;
            int v5 = 4;
            if(v3 == v4) {
                v3 = 0;
            }
            else if(v3 == v5) {
                v3 = 1;
            }
            else {
                StringBuilder v1 = new StringBuilder();
                v1.append("op should be remove or update.");
                v1.append(arg13);
                throw new IllegalArgumentException(v1.toString());
            }

            int v7 = v0;
            int v8 = v2;
            v0 = 1;
            v2 = 1;
            while(v0 < arg13.itemCount) {
                int v9 = this.updatePositionWithPostponed(arg13.positionStart + v3 * v0, arg13.cmd);
                int v10 = arg13.cmd;
                if(v10 != v4) {
                    if(v10 == v5) {
                        if(v9 != v7 + 1) {
                            goto label_42;
                        }

                        goto label_46;
                    }
                    else {
                        goto label_42;
                    }
                }
                else if(v9 == v7) {
                label_46:
                    v10 = 1;
                }
                else {
                label_42:
                    v10 = 0;
                }

                if(v10 != 0) {
                    ++v2;
                }
                else {
                    UpdateOp v7_1 = this.obtainUpdateOp(arg13.cmd, v7, v2, arg13.payload);
                    this.dispatchFirstPassAndUpdateViewHolders(v7_1, v8);
                    this.recycleUpdateOp(v7_1);
                    if(arg13.cmd == v5) {
                        v8 += v2;
                    }

                    v7 = v9;
                    v2 = 1;
                }

                ++v0;
            }

            Object v0_1 = arg13.payload;
            this.recycleUpdateOp(arg13);
            if(v2 > 0) {
                arg13 = this.obtainUpdateOp(arg13.cmd, v7, v2, v0_1);
                this.dispatchFirstPassAndUpdateViewHolders(arg13, v8);
                this.recycleUpdateOp(arg13);
            }

            return;
        }

        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    void dispatchFirstPassAndUpdateViewHolders(UpdateOp arg3, int arg4) {
        this.mCallback.onDispatchFirstPass(arg3);
        int v0 = arg3.cmd;
        if(v0 == 2) {
            this.mCallback.offsetPositionsForRemovingInvisible(arg4, arg3.itemCount);
        }
        else if(v0 == 4) {
            this.mCallback.markViewHoldersUpdated(arg4, arg3.itemCount, arg3.payload);
        }
        else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    int findPositionOffset(int arg5, int arg6) {
        int v0 = this.mPostponedList.size();
        while(arg6 < v0) {
            Object v1 = this.mPostponedList.get(arg6);
            if(((UpdateOp)v1).cmd != 8) {
                if(((UpdateOp)v1).positionStart > arg5) {
                    goto label_38;
                }

                if(((UpdateOp)v1).cmd == 2) {
                    if(arg5 < ((UpdateOp)v1).positionStart + ((UpdateOp)v1).itemCount) {
                        return -1;
                    }

                    arg5 -= ((UpdateOp)v1).itemCount;
                    goto label_38;
                }

                if(((UpdateOp)v1).cmd != 1) {
                    goto label_38;
                }

                arg5 += ((UpdateOp)v1).itemCount;
            }
            else if(((UpdateOp)v1).positionStart == arg5) {
                arg5 = ((UpdateOp)v1).itemCount;
            }
            else {
                if(((UpdateOp)v1).positionStart < arg5) {
                    --arg5;
                }

                if(((UpdateOp)v1).itemCount > arg5) {
                    goto label_38;
                }

                ++arg5;
            }

        label_38:
            ++arg6;
        }

        return arg5;
    }

    int findPositionOffset(int arg2) {
        return this.findPositionOffset(arg2, 0);
    }

    boolean hasAnyUpdateTypes(int arg2) {
        boolean v2 = (arg2 & this.mExistingUpdateTypes) != 0 ? true : false;
        return v2;
    }

    boolean hasPendingUpdates() {
        boolean v0 = this.mPendingUpdates.size() > 0 ? true : false;
        return v0;
    }

    boolean hasUpdates() {
        boolean v0 = (this.mPostponedList.isEmpty()) || (this.mPendingUpdates.isEmpty()) ? false : true;
        return v0;
    }

    public UpdateOp obtainUpdateOp(int arg2, int arg3, int arg4, Object arg5) {
        Object v0 = this.mUpdateOpPool.acquire();
        if(v0 == null) {
            UpdateOp v0_1 = new UpdateOp(arg2, arg3, arg4, arg5);
        }
        else {
            ((UpdateOp)v0).cmd = arg2;
            ((UpdateOp)v0).positionStart = arg3;
            ((UpdateOp)v0).itemCount = arg4;
            ((UpdateOp)v0).payload = arg5;
        }

        return ((UpdateOp)v0);
    }

    boolean onItemRangeChanged(int arg5, int arg6, Object arg7) {
        boolean v0 = false;
        if(arg6 < 1) {
            return 0;
        }

        this.mPendingUpdates.add(this.obtainUpdateOp(4, arg5, arg6, arg7));
        this.mExistingUpdateTypes |= 4;
        if(this.mPendingUpdates.size() == 1) {
            v0 = true;
        }

        return v0;
    }

    boolean onItemRangeInserted(int arg5, int arg6) {
        boolean v0 = false;
        if(arg6 < 1) {
            return 0;
        }

        this.mPendingUpdates.add(this.obtainUpdateOp(1, arg5, arg6, null));
        this.mExistingUpdateTypes |= 1;
        if(this.mPendingUpdates.size() == 1) {
            v0 = true;
        }

        return v0;
    }

    boolean onItemRangeMoved(int arg5, int arg6, int arg7) {
        boolean v0 = false;
        if(arg5 == arg6) {
            return 0;
        }

        if(arg7 == 1) {
            this.mPendingUpdates.add(this.obtainUpdateOp(8, arg5, arg6, null));
            this.mExistingUpdateTypes |= 8;
            if(this.mPendingUpdates.size() == 1) {
                v0 = true;
            }

            return v0;
        }

        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    boolean onItemRangeRemoved(int arg6, int arg7) {
        boolean v0 = false;
        if(arg7 < 1) {
            return 0;
        }

        this.mPendingUpdates.add(this.obtainUpdateOp(2, arg6, arg7, null));
        this.mExistingUpdateTypes |= 2;
        if(this.mPendingUpdates.size() == 1) {
            v0 = true;
        }

        return v0;
    }

    private void postponeAndUpdateViewHolders(UpdateOp arg4) {
        this.mPostponedList.add(arg4);
        int v0 = arg4.cmd;
        if(v0 == 4) {
            this.mCallback.markViewHoldersUpdated(arg4.positionStart, arg4.itemCount, arg4.payload);
        }
        else if(v0 != 8) {
            switch(v0) {
                case 1: {
                    goto label_22;
                }
                case 2: {
                    goto label_17;
                }
            }

            StringBuilder v1 = new StringBuilder();
            v1.append("Unknown update op type for ");
            v1.append(arg4);
            throw new IllegalArgumentException(v1.toString());
        label_17:
            this.mCallback.offsetPositionsForRemovingLaidOutOrNewView(arg4.positionStart, arg4.itemCount);
            return;
        label_22:
            this.mCallback.offsetPositionsForAdd(arg4.positionStart, arg4.itemCount);
        }
        else {
            this.mCallback.offsetPositionsForMove(arg4.positionStart, arg4.itemCount);
        }
    }

    void preProcess() {
        this.mOpReorderer.reorderOps(this.mPendingUpdates);
        int v0 = this.mPendingUpdates.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            Object v2 = this.mPendingUpdates.get(v1);
            int v3 = ((UpdateOp)v2).cmd;
            if(v3 == 4) {
                this.applyUpdate(((UpdateOp)v2));
            }
            else if(v3 != 8) {
                switch(v3) {
                    case 1: {
                        goto label_18;
                    }
                    case 2: {
                        goto label_16;
                    }
                }

                goto label_23;
            label_18:
                this.applyAdd(((UpdateOp)v2));
                goto label_23;
            label_16:
                this.applyRemove(((UpdateOp)v2));
            }
            else {
                this.applyMove(((UpdateOp)v2));
            }

        label_23:
            if(this.mOnItemProcessedCallback != null) {
                this.mOnItemProcessedCallback.run();
            }
        }

        this.mPendingUpdates.clear();
    }

    public void recycleUpdateOp(UpdateOp arg2) {
        if(!this.mDisableRecycler) {
            arg2.payload = null;
            this.mUpdateOpPool.release(arg2);
        }
    }

    void recycleUpdateOpsAndClearList(List arg4) {
        int v0 = arg4.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.recycleUpdateOp(arg4.get(v1));
        }

        arg4.clear();
    }

    void reset() {
        this.recycleUpdateOpsAndClearList(this.mPendingUpdates);
        this.recycleUpdateOpsAndClearList(this.mPostponedList);
        this.mExistingUpdateTypes = 0;
    }

    private int updatePositionWithPostponed(int arg7, int arg8) {
        int v4;
        int v0;
        for(v0 = this.mPostponedList.size() - 1; true; --v0) {
            int v2 = 8;
            if(v0 < 0) {
                break;
            }

            Object v3 = this.mPostponedList.get(v0);
            int v5 = 2;
            if(((UpdateOp)v3).cmd == v2) {
                if(((UpdateOp)v3).positionStart < ((UpdateOp)v3).itemCount) {
                    v2 = ((UpdateOp)v3).positionStart;
                    v4 = ((UpdateOp)v3).itemCount;
                }
                else {
                    v2 = ((UpdateOp)v3).itemCount;
                    v4 = ((UpdateOp)v3).positionStart;
                }

                if(arg7 >= v2 && arg7 <= v4) {
                    if(v2 == ((UpdateOp)v3).positionStart) {
                        if(arg8 == 1) {
                            ++((UpdateOp)v3).itemCount;
                        }
                        else if(arg8 == v5) {
                            --((UpdateOp)v3).itemCount;
                        }

                        ++arg7;
                    }
                    else {
                        if(arg8 == 1) {
                            ++((UpdateOp)v3).positionStart;
                        }
                        else if(arg8 == v5) {
                            --((UpdateOp)v3).positionStart;
                        }

                        --arg7;
                    }

                    goto label_84;
                }

                if(arg7 >= ((UpdateOp)v3).positionStart) {
                    goto label_84;
                }

                if(arg8 == 1) {
                    ++((UpdateOp)v3).positionStart;
                    ++((UpdateOp)v3).itemCount;
                    goto label_84;
                }

                if(arg8 != v5) {
                    goto label_84;
                }

                --((UpdateOp)v3).positionStart;
                --((UpdateOp)v3).itemCount;
            }
            else {
                if(((UpdateOp)v3).positionStart <= arg7) {
                    if(((UpdateOp)v3).cmd == 1) {
                        arg7 -= ((UpdateOp)v3).itemCount;
                        goto label_84;
                    }

                    if(((UpdateOp)v3).cmd != v5) {
                        goto label_84;
                    }

                    arg7 += ((UpdateOp)v3).itemCount;
                    goto label_84;
                }

                if(arg8 == 1) {
                    ++((UpdateOp)v3).positionStart;
                    goto label_84;
                }

                if(arg8 != v5) {
                    goto label_84;
                }

                --((UpdateOp)v3).positionStart;
            }

        label_84:
        }

        for(arg8 = this.mPostponedList.size() - 1; arg8 >= 0; --arg8) {
            Object v0_1 = this.mPostponedList.get(arg8);
            if(((UpdateOp)v0_1).cmd == v2) {
                if(((UpdateOp)v0_1).itemCount != ((UpdateOp)v0_1).positionStart && ((UpdateOp)v0_1).itemCount >= 0) {
                    goto label_108;
                }

                this.mPostponedList.remove(arg8);
                this.recycleUpdateOp(((UpdateOp)v0_1));
            }
            else {
                if(((UpdateOp)v0_1).itemCount > 0) {
                    goto label_108;
                }

                this.mPostponedList.remove(arg8);
                this.recycleUpdateOp(((UpdateOp)v0_1));
            }

        label_108:
        }

        return arg7;
    }
}

