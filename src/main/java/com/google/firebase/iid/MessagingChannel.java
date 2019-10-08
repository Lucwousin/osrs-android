package com.google.firebase.iid;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.tasks.Task;
import javax.annotation.Nullable;

@KeepForSdk public interface MessagingChannel {
    @KeepForSdk Task ackMessage(String arg1);

    @KeepForSdk Task buildChannel(String arg1, @Nullable String arg2);

    @KeepForSdk Task deleteInstanceId(String arg1);

    @KeepForSdk Task deleteToken(String arg1, @Nullable String arg2, String arg3, String arg4);

    @KeepForSdk Task getToken(String arg1, @Nullable String arg2, String arg3, String arg4);

    @KeepForSdk boolean isAvailable();

    @KeepForSdk boolean isChannelBuilt();

    @KeepForSdk boolean needsRefresh();

    @KeepForSdk Task subscribeToTopic(String arg1, String arg2, String arg3);

    @KeepForSdk Task unsubscribeFromTopic(String arg1, String arg2, String arg3);
}

