package androidx.transition;

import android.os.Build$VERSION;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

class ViewGroupUtils {
    private ViewGroupUtils() {
        super();
    }

    static ViewGroupOverlayImpl getOverlay(@NonNull ViewGroup arg2) {
        if(Build$VERSION.SDK_INT >= 18) {
            return new ViewGroupOverlayApi18(arg2);
        }

        return ViewGroupOverlayApi14.createFrom(arg2);
    }

    static void suppressLayout(@NonNull ViewGroup arg2, boolean arg3) {
        if(Build$VERSION.SDK_INT >= 18) {
            ViewGroupUtilsApi18.suppressLayout(arg2, arg3);
        }
        else {
            ViewGroupUtilsApi14.suppressLayout(arg2, arg3);
        }
    }
}

