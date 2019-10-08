package com.google.firebase.components;

import androidx.annotation.GuardedBy;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

class EventBus implements Publisher, Subscriber {
    private final Executor defaultExecutor;
    @GuardedBy(value="this") private final Map handlerMap;
    @GuardedBy(value="this") private Queue pendingEvents;

    EventBus(Executor arg2) {
        super();
        this.handlerMap = new HashMap();
        this.pendingEvents = new ArrayDeque();
        this.defaultExecutor = arg2;
    }

    void enablePublishingAndFlushPending() {
        Queue v0_1;
        __monitor_enter(this);
        try {
            Queue v1 = null;
            if(this.pendingEvents != null) {
                v0_1 = this.pendingEvents;
                this.pendingEvents = v1;
            }
            else {
                v0_1 = v1;
            }

            __monitor_exit(this);
            if(v0_1 == null) {
                return;
            }
        }
        catch(Throwable v0) {
            try {
            label_18:
                __monitor_exit(this);
            }
            catch(Throwable v0) {
                goto label_18;
            }

            throw v0;
        }

        Iterator v0_2 = v0_1.iterator();
        while(v0_2.hasNext()) {
            this.publish(v0_2.next());
        }
    }

    private Set getHandlers(Event arg2) {
        Set v2_2;
        __monitor_enter(this);
        try {
            Object v2_1 = this.handlerMap.get(arg2.getType());
            v2_2 = v2_1 == null ? Collections.emptySet() : ((Map)v2_1).entrySet();
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
        return v2_2;
    }

    static void lambda$publish$0(Map$Entry arg0, Event arg1) {
        arg0.getKey().handle(arg1);
    }

    public void publish(Event arg4) {
        Preconditions.checkNotNull(arg4);
        __monitor_enter(this);
        try {
            if(this.pendingEvents != null) {
                this.pendingEvents.add(arg4);
                __monitor_exit(this);
                return;
            }

            __monitor_exit(this);
        }
        catch(Throwable v4) {
            try {
            label_20:
                __monitor_exit(this);
            }
            catch(Throwable v4) {
                goto label_20;
            }

            throw v4;
        }

        Iterator v0 = this.getHandlers(arg4).iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            ((Map$Entry)v1).getValue().execute(EventBus$$Lambda$1.lambdaFactory$(((Map$Entry)v1), arg4));
        }
    }

    public void subscribe(Class arg2, EventHandler arg3) {
        this.subscribe(arg2, this.defaultExecutor, arg3);
    }

    public void subscribe(Class arg3, Executor arg4, EventHandler arg5) {
        __monitor_enter(this);
        try {
            Preconditions.checkNotNull(arg3);
            Preconditions.checkNotNull(arg5);
            Preconditions.checkNotNull(arg4);
            if(!this.handlerMap.containsKey(arg3)) {
                this.handlerMap.put(arg3, new ConcurrentHashMap());
            }

            this.handlerMap.get(arg3).put(arg5, arg4);
        }
        catch(Throwable v3) {
            __monitor_exit(this);
            throw v3;
        }

        __monitor_exit(this);
    }

    public void unsubscribe(Class arg2, EventHandler arg3) {
        __monitor_enter(this);
        try {
            Preconditions.checkNotNull(arg2);
            Preconditions.checkNotNull(arg3);
            if(this.handlerMap.containsKey(arg2)) {
                goto label_8;
            }
        }
        catch(Throwable v2) {
            goto label_18;
        }

        __monitor_exit(this);
        return;
        try {
        label_8:
            Object v0 = this.handlerMap.get(arg2);
            ((ConcurrentHashMap)v0).remove(arg3);
            if(((ConcurrentHashMap)v0).isEmpty()) {
                this.handlerMap.remove(arg2);
            }
        }
        catch(Throwable v2) {
        label_18:
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }
}

