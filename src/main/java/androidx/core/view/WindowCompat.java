package androidx.core.view;

import android.os.Build$VERSION;
import android.view.View;
import android.view.Window;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;

public final class WindowCompat {
    public static final int FEATURE_ACTION_BAR = 8;
    public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;

    private WindowCompat() {
        super();
    }

    @NonNull public static View requireViewById(@NonNull Window arg2, @IdRes int arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg2.requireViewById(arg3);
        }

        View v2 = arg2.findViewById(arg3);
        if(v2 != null) {
            return v2;
        }

        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }
}

