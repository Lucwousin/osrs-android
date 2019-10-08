package com.google.firebase.components;

import com.google.firebase.events.Event;
import java.util.Map$Entry;

final class EventBus$$Lambda$1 implements Runnable {
    private final Map$Entry arg$1;
    private final Event arg$2;

    private EventBus$$Lambda$1(Map$Entry arg1, Event arg2) {
        super();
        this.arg$1 = arg1;
        this.arg$2 = arg2;
    }

    public static Runnable lambdaFactory$(Map$Entry arg1, Event arg2) {
        return new EventBus$$Lambda$1(arg1, arg2);
    }

    public void run() {
        EventBus.lambda$publish$0(this.arg$1, this.arg$2);
    }
}

