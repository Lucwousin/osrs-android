package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.os.Build$VERSION;
import android.util.Property;

class PropertyValuesHolderUtils {
    private PropertyValuesHolderUtils() {
        super();
    }

    static PropertyValuesHolder ofPointF(Property arg2, Path arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(arg2, null, arg3);
        }

        return PropertyValuesHolder.ofFloat(new PathProperty(arg2, arg3), new float[]{0f, 1f});
    }
}

