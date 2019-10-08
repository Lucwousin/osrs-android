package com.google.android.gms.common.data;

import java.util.HashSet;
import java.util.Iterator;

public final class DataBufferObserverSet implements Observable, DataBufferObserver {
    private HashSet zall;

    public DataBufferObserverSet() {
        super();
        this.zall = new HashSet();
    }

    public final void addObserver(DataBufferObserver arg2) {
        this.zall.add(arg2);
    }

    public final void clear() {
        this.zall.clear();
    }

    public final boolean hasObservers() {
        if(!this.zall.isEmpty()) {
            return 1;
        }

        return 0;
    }

    public final void onDataChanged() {
        Iterator v0 = this.zall.iterator();
        while(v0.hasNext()) {
            v0.next().onDataChanged();
        }
    }

    public final void onDataRangeChanged(int arg3, int arg4) {
        Iterator v0 = this.zall.iterator();
        while(v0.hasNext()) {
            v0.next().onDataRangeChanged(arg3, arg4);
        }
    }

    public final void onDataRangeInserted(int arg3, int arg4) {
        Iterator v0 = this.zall.iterator();
        while(v0.hasNext()) {
            v0.next().onDataRangeInserted(arg3, arg4);
        }
    }

    public final void onDataRangeMoved(int arg3, int arg4, int arg5) {
        Iterator v0 = this.zall.iterator();
        while(v0.hasNext()) {
            v0.next().onDataRangeMoved(arg3, arg4, arg5);
        }
    }

    public final void onDataRangeRemoved(int arg3, int arg4) {
        Iterator v0 = this.zall.iterator();
        while(v0.hasNext()) {
            v0.next().onDataRangeRemoved(arg3, arg4);
        }
    }

    public final void removeObserver(DataBufferObserver arg2) {
        this.zall.remove(arg2);
    }
}

