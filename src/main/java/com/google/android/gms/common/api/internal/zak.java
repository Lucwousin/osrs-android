package com.google.android.gms.common.api.internal;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Iterator;
import java.util.Set;

public final class zak {
    private final ArrayMap zaay;
    private final ArrayMap zada;
    private final TaskCompletionSource zadb;
    private int zadc;
    private boolean zadd;

    public zak(Iterable arg4) {
        super();
        this.zada = new ArrayMap();
        this.zadb = new TaskCompletionSource();
        this.zadd = false;
        this.zaay = new ArrayMap();
        Iterator v4 = arg4.iterator();
        while(v4.hasNext()) {
            this.zaay.put(v4.next().zak(), null);
        }

        this.zadc = this.zaay.keySet().size();
    }

    public final Task getTask() {
        return this.zadb.getTask();
    }

    public final void zaa(zai arg2, ConnectionResult arg3, @Nullable String arg4) {
        this.zaay.put(arg2, arg3);
        this.zada.put(arg2, arg4);
        --this.zadc;
        if(!arg3.isSuccess()) {
            this.zadd = true;
        }

        if(this.zadc == 0) {
            if(this.zadd) {
                this.zadb.setException(new AvailabilityException(this.zaay));
                return;
            }
            else {
                this.zadb.setResult(this.zada);
            }
        }
    }

    public final Set zap() {
        return this.zaay.keySet();
    }
}

