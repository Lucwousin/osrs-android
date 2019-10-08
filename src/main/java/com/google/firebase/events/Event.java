package com.google.firebase.events;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk public class Event {
    private final Object payload;
    private final Class type;

    @KeepForSdk public Event(Class arg1, Object arg2) {
        super();
        this.type = Preconditions.checkNotNull(arg1);
        this.payload = Preconditions.checkNotNull(arg2);
    }

    @KeepForSdk public Object getPayload() {
        return this.payload;
    }

    @KeepForSdk public Class getType() {
        return this.type;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.type, this.payload);
    }
}

