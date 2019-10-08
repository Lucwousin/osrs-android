package androidx.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build$VERSION;
import android.util.Property;

class ObjectAnimatorUtils {
    private ObjectAnimatorUtils() {
        super();
    }

    static ObjectAnimator ofPointF(Object arg2, Property arg3, Path arg4) {
        if(Build$VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(arg2, arg3, null, arg4);
        }

        return ObjectAnimator.ofFloat(arg2, new PathProperty(arg3, arg4), new float[]{0f, 1f});
    }
}

