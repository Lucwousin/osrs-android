package androidx.browser.customtabs;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.core.app.BundleCompat;

public class TrustedWebUtils {
    public static final String EXTRA_LAUNCH_AS_TRUSTED_WEB_ACTIVITY = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";

    private TrustedWebUtils() {
        super();
    }

    public static void launchAsTrustedWebActivity(@NonNull Context arg3, @NonNull CustomTabsIntent arg4, @NonNull Uri arg5) {
        if(BundleCompat.getBinder(arg4.intent.getExtras(), "android.support.customtabs.extra.SESSION") != null) {
            arg4.intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
            arg4.launchUrl(arg3, arg5);
            return;
        }

        throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
    }
}

