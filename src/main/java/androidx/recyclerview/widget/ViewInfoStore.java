package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.core.util.Pools$Pool;
import androidx.core.util.Pools$SimplePool;

class ViewInfoStore {
    class InfoRecord {
        static final int FLAG_APPEAR = 2;
        static final int FLAG_APPEAR_AND_DISAPPEAR = 3;
        static final int FLAG_APPEAR_PRE_AND_POST = 14;
        static final int FLAG_DISAPPEARED = 1;
        static final int FLAG_POST = 8;
        static final int FLAG_PRE = 4;
        static final int FLAG_PRE_AND_POST = 12;
        int flags;
        @Nullable ItemHolderInfo postInfo;
        @Nullable ItemHolderInfo preInfo;
        static Pool sPool;

        static {
            InfoRecord.sPool = new SimplePool(20);
        }

        private InfoRecord() {
            super();
        }

        static void drainCache() {
            while(InfoRecord.sPool.acquire() != null) {
            }
        }

        static InfoRecord obtain() {
            InfoRecord v0_1;
            Object v0 = InfoRecord.sPool.acquire();
            if(v0 == null) {
                v0_1 = new InfoRecord();
            }

            return v0_1;
        }

        static void recycle(InfoRecord arg1) {
            arg1.flags = 0;
            arg1.preInfo = null;
            arg1.postInfo = null;
            InfoRecord.sPool.release(arg1);
        }
    }

    interface ProcessCallback {
        void processAppeared(ViewHolder arg1, @Nullable ItemHolderInfo arg2, ItemHolderInfo arg3);

        void processDisappeared(ViewHolder arg1, @NonNull ItemHolderInfo arg2, @Nullable ItemHolderInfo arg3);

        void processPersistent(ViewHolder arg1, @NonNull ItemHolderInfo arg2, @NonNull ItemHolderInfo arg3);

        void unused(ViewHolder arg1);
    }

    private static final boolean DEBUG = false;
    @VisibleForTesting final ArrayMap mLayoutHolderMap;
    @VisibleForTesting final LongSparseArray mOldChangedHolders;

    ViewInfoStore() {
        super();
        this.mLayoutHolderMap = new ArrayMap();
        this.mOldChangedHolders = new LongSparseArray();
    }

    void addToAppearedInPreLayoutHolders(ViewHolder arg3, ItemHolderInfo arg4) {
        InfoRecord v0_1;
        Object v0 = this.mLayoutHolderMap.get(arg3);
        if(v0 == null) {
            v0_1 = InfoRecord.obtain();
            this.mLayoutHolderMap.put(arg3, v0_1);
        }

        v0_1.flags |= 2;
        v0_1.preInfo = arg4;
    }

    void addToDisappearedInLayout(ViewHolder arg3) {
        Object v0 = this.mLayoutHolderMap.get(arg3);
        if(v0 == null) {
            InfoRecord v0_1 = InfoRecord.obtain();
            this.mLayoutHolderMap.put(arg3, v0_1);
        }

        ((InfoRecord)v0).flags |= 1;
    }

    void addToOldChangeHolders(long arg2, ViewHolder arg4) {
        this.mOldChangedHolders.put(arg2, arg4);
    }

    void addToPostLayout(ViewHolder arg3, ItemHolderInfo arg4) {
        Object v0 = this.mLayoutHolderMap.get(arg3);
        if(v0 == null) {
            InfoRecord v0_1 = InfoRecord.obtain();
            this.mLayoutHolderMap.put(arg3, v0_1);
        }

        ((InfoRecord)v0).postInfo = arg4;
        ((InfoRecord)v0).flags |= 8;
    }

    void addToPreLayout(ViewHolder arg3, ItemHolderInfo arg4) {
        InfoRecord v0_1;
        Object v0 = this.mLayoutHolderMap.get(arg3);
        if(v0 == null) {
            v0_1 = InfoRecord.obtain();
            this.mLayoutHolderMap.put(arg3, v0_1);
        }

        v0_1.preInfo = arg4;
        v0_1.flags |= 4;
    }

    void clear() {
        this.mLayoutHolderMap.clear();
        this.mOldChangedHolders.clear();
    }

    ViewHolder getFromOldChangeHolders(long arg2) {
        return this.mOldChangedHolders.get(arg2);
    }

    boolean isDisappearing(ViewHolder arg2) {
        Object v2 = this.mLayoutHolderMap.get(arg2);
        boolean v0 = true;
        if(v2 == null || (((InfoRecord)v2).flags & 1) == 0) {
            v0 = false;
        }
        else {
        }

        return v0;
    }

    boolean isInPreLayout(ViewHolder arg2) {
        Object v2 = this.mLayoutHolderMap.get(arg2);
        boolean v2_1 = v2 == null || (((InfoRecord)v2).flags & 4) == 0 ? false : true;
        return v2_1;
    }

    void onDetach() {
        InfoRecord.drainCache();
    }

    public void onViewDetached(ViewHolder arg1) {
        this.removeFromDisappearedInLayout(arg1);
    }

    private ItemHolderInfo popFromLayoutStep(ViewHolder arg4, int arg5) {
        ItemHolderInfo v5;
        int v4 = this.mLayoutHolderMap.indexOfKey(arg4);
        ItemHolderInfo v0 = null;
        if(v4 < 0) {
            return v0;
        }

        Object v1 = this.mLayoutHolderMap.valueAt(v4);
        if(v1 != null && (((InfoRecord)v1).flags & arg5) != 0) {
            ((InfoRecord)v1).flags &= ~arg5;
            if(arg5 == 4) {
                v5 = ((InfoRecord)v1).preInfo;
            }
            else if(arg5 == 8) {
                v5 = ((InfoRecord)v1).postInfo;
            }
            else {
                goto label_29;
            }

            if((((InfoRecord)v1).flags & 12) == 0) {
                this.mLayoutHolderMap.removeAt(v4);
                InfoRecord.recycle(((InfoRecord)v1));
            }

            return v5;
        label_29:
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }

        return v0;
    }

    @Nullable ItemHolderInfo popFromPostLayout(ViewHolder arg2) {
        return this.popFromLayoutStep(arg2, 8);
    }

    @Nullable ItemHolderInfo popFromPreLayout(ViewHolder arg2) {
        return this.popFromLayoutStep(arg2, 4);
    }

    void process(ProcessCallback arg6) {
        int v0;
        for(v0 = this.mLayoutHolderMap.size() - 1; v0 >= 0; --v0) {
            Object v1 = this.mLayoutHolderMap.keyAt(v0);
            Object v2 = this.mLayoutHolderMap.removeAt(v0);
            if((((InfoRecord)v2).flags & 3) == 3) {
                arg6.unused(((ViewHolder)v1));
            }
            else if((((InfoRecord)v2).flags & 1) != 0) {
                if(((InfoRecord)v2).preInfo == null) {
                    arg6.unused(((ViewHolder)v1));
                }
                else {
                    arg6.processDisappeared(((ViewHolder)v1), ((InfoRecord)v2).preInfo, ((InfoRecord)v2).postInfo);
                }
            }
            else if((((InfoRecord)v2).flags & 14) == 14) {
                arg6.processAppeared(((ViewHolder)v1), ((InfoRecord)v2).preInfo, ((InfoRecord)v2).postInfo);
            }
            else if((((InfoRecord)v2).flags & 12) == 12) {
                arg6.processPersistent(((ViewHolder)v1), ((InfoRecord)v2).preInfo, ((InfoRecord)v2).postInfo);
            }
            else if((((InfoRecord)v2).flags & 4) != 0) {
                arg6.processDisappeared(((ViewHolder)v1), ((InfoRecord)v2).preInfo, null);
            }
            else if((((InfoRecord)v2).flags & 8) != 0) {
                arg6.processAppeared(((ViewHolder)v1), ((InfoRecord)v2).preInfo, ((InfoRecord)v2).postInfo);
            }

            InfoRecord.recycle(((InfoRecord)v2));
        }
    }

    void removeFromDisappearedInLayout(ViewHolder arg2) {
        Object v2 = this.mLayoutHolderMap.get(arg2);
        if(v2 == null) {
            return;
        }

        ((InfoRecord)v2).flags &= -2;
    }

    void removeViewHolder(ViewHolder arg3) {
        int v0 = this.mOldChangedHolders.size() - 1;
        while(v0 >= 0) {
            if(arg3 == this.mOldChangedHolders.valueAt(v0)) {
                this.mOldChangedHolders.removeAt(v0);
            }
            else {
                --v0;
                continue;
            }

            break;
        }

        Object v3 = this.mLayoutHolderMap.remove(arg3);
        if(v3 != null) {
            InfoRecord.recycle(((InfoRecord)v3));
        }
    }
}

