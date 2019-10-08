package androidx.core.content.res;

import android.content.res.Resources;
import android.os.Build$VERSION;
import androidx.annotation.NonNull;

public final class ConfigurationHelper {
    private ConfigurationHelper() {
        super();
    }

    public static int getDensityDpi(@NonNull Resources arg2) {
        if(Build$VERSION.SDK_INT >= 17) {
            return arg2.getConfiguration().densityDpi;
        }

        return arg2.getDisplayMetrics().densityDpi;
    }
}

