package com.google.android.gms.common.stats;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@KeepForSdk public abstract class StatsEvent extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk public interface Types {
        @KeepForSdk public static final int EVENT_TYPE_ACQUIRE_WAKE_LOCK = 7;
        @KeepForSdk public static final int EVENT_TYPE_RELEASE_WAKE_LOCK = 8;

    }

    public StatsEvent() {
        super();
    }

    public abstract int getEventType();

    public abstract long getTimeMillis();

    public String toString() {
        long v0 = this.getTimeMillis();
        int v2 = this.getEventType();
        long v3 = this.zzu();
        String v5 = this.zzv();
        StringBuilder v7 = new StringBuilder(String.valueOf(v5).length() + 53);
        v7.append(v0);
        v7.append("\t");
        v7.append(v2);
        v7.append("\t");
        v7.append(v3);
        v7.append(v5);
        return v7.toString();
    }

    public abstract long zzu();

    public abstract String zzv();
}

