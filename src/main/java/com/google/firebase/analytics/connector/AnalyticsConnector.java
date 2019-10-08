package com.google.firebase.analytics.connector;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface AnalyticsConnector {
    @KeepForSdk public interface AnalyticsConnectorHandle {
        @KeepForSdk void registerEventNames(Set arg1);

        @KeepForSdk void unregister();

        @KeepForSdk void unregisterEventNames();
    }

    @KeepForSdk public interface AnalyticsConnectorListener {
        @KeepForSdk void onMessageTriggered(int arg1, @Nullable Bundle arg2);
    }

    @KeepForSdk public class ConditionalUserProperty {
        @KeepForSdk public boolean active;
        @KeepForSdk public long creationTimestamp;
        @KeepForSdk public String expiredEventName;
        @KeepForSdk public Bundle expiredEventParams;
        @KeepForSdk public String name;
        @KeepForSdk public String origin;
        @KeepForSdk public long timeToLive;
        @KeepForSdk public String timedOutEventName;
        @KeepForSdk public Bundle timedOutEventParams;
        @KeepForSdk public String triggerEventName;
        @KeepForSdk public long triggerTimeout;
        @KeepForSdk public String triggeredEventName;
        @KeepForSdk public Bundle triggeredEventParams;
        @KeepForSdk public long triggeredTimestamp;
        @KeepForSdk public Object value;

        public ConditionalUserProperty() {
            super();
        }
    }

    @KeepForSdk void clearConditionalUserProperty(@NonNull @Size(max=24, min=1) String arg1, @Nullable String arg2, @Nullable Bundle arg3);

    @WorkerThread @KeepForSdk List getConditionalUserProperties(@NonNull String arg1, @Nullable @Size(max=23, min=1) String arg2);

    @WorkerThread @KeepForSdk int getMaxUserProperties(@NonNull @Size(min=1) String arg1);

    @WorkerThread @KeepForSdk Map getUserProperties(boolean arg1);

    @KeepForSdk void logEvent(@NonNull String arg1, @NonNull String arg2, Bundle arg3);

    @KeepForSdk AnalyticsConnectorHandle registerAnalyticsConnectorListener(String arg1, AnalyticsConnectorListener arg2);

    @KeepForSdk void setConditionalUserProperty(@NonNull ConditionalUserProperty arg1);

    @KeepForSdk void setUserProperty(@NonNull String arg1, @NonNull String arg2, Object arg3);
}

