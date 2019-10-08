package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.WeakHashMap;

public final class zaab {
    private final Map zafj;
    private final Map zafk;

    public zaab() {
        super();
        this.zafj = Collections.synchronizedMap(new WeakHashMap());
        this.zafk = Collections.synchronizedMap(new WeakHashMap());
    }

    static Map zaa(zaab arg0) {
        return arg0.zafj;
    }

    private final void zaa(boolean arg5, Status arg6) {
        HashMap v0_1;
        HashMap v1;
        Map v0 = this.zafj;
        __monitor_enter(v0);
        try {
            v1 = new HashMap(this.zafj);
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            try {
            label_43:
                __monitor_exit(v0);
            }
            catch(Throwable v5) {
                goto label_43;
            }

            throw v5;
        }

        Map v2 = this.zafk;
        __monitor_enter(v2);
        try {
            v0_1 = new HashMap(this.zafk);
            __monitor_exit(v2);
        }
        catch(Throwable v5) {
            try {
            label_40:
                __monitor_exit(v2);
            }
            catch(Throwable v5) {
                goto label_40;
            }

            throw v5;
        }

        Iterator v1_1 = ((Map)v1).entrySet().iterator();
        while(v1_1.hasNext()) {
            Object v2_1 = v1_1.next();
            if(!arg5 && !((Map$Entry)v2_1).getValue().booleanValue()) {
                continue;
            }

            ((Map$Entry)v2_1).getKey().zab(arg6);
        }

        Iterator v0_2 = ((Map)v0_1).entrySet().iterator();
        while(v0_2.hasNext()) {
            Object v1_2 = v0_2.next();
            if(!arg5 && !((Map$Entry)v1_2).getValue().booleanValue()) {
                continue;
            }

            ((Map$Entry)v1_2).getKey().trySetException(new ApiException(arg6));
        }
    }

    final void zaa(BasePendingResult arg2, boolean arg3) {
        this.zafj.put(arg2, Boolean.valueOf(arg3));
        ((PendingResult)arg2).addStatusListener(new zaac(this, arg2));
    }

    final void zaa(TaskCompletionSource arg2, boolean arg3) {
        this.zafk.put(arg2, Boolean.valueOf(arg3));
        arg2.getTask().addOnCompleteListener(new zaad(this, arg2));
    }

    final boolean zaag() {
        if(this.zafj.isEmpty()) {
            if(!this.zafk.isEmpty()) {
            }
            else {
                return 0;
            }
        }

        return 1;
    }

    public final void zaah() {
        this.zaa(false, GoogleApiManager.zahw);
    }

    public final void zaai() {
        this.zaa(true, zacp.zakw);
    }

    static Map zab(zaab arg0) {
        return arg0.zafk;
    }
}

