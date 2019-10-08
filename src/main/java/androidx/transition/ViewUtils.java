package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.util.Log;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Field;

class ViewUtils {
    final class androidx.transition.ViewUtils$1 extends Property {
        androidx.transition.ViewUtils$1(Class arg1, String arg2) {
            super(arg1, arg2);
        }

        public Float get(View arg1) {
            return Float.valueOf(ViewUtils.getTransitionAlpha(arg1));
        }

        public Object get(Object arg1) {
            return this.get(((View)arg1));
        }

        public void set(View arg1, Float arg2) {
            ViewUtils.setTransitionAlpha(arg1, arg2.floatValue());
        }

        public void set(Object arg1, Object arg2) {
            this.set(((View)arg1), ((Float)arg2));
        }
    }

    final class androidx.transition.ViewUtils$2 extends Property {
        androidx.transition.ViewUtils$2(Class arg1, String arg2) {
            super(arg1, arg2);
        }

        public Rect get(View arg1) {
            return ViewCompat.getClipBounds(arg1);
        }

        public Object get(Object arg1) {
            return this.get(((View)arg1));
        }

        public void set(View arg1, Rect arg2) {
            ViewCompat.setClipBounds(arg1, arg2);
        }

        public void set(Object arg1, Object arg2) {
            this.set(((View)arg1), ((Rect)arg2));
        }
    }

    static final Property CLIP_BOUNDS = null;
    private static final ViewUtilsBase IMPL = null;
    private static final String TAG = "ViewUtils";
    static final Property TRANSITION_ALPHA = null;
    private static final int VISIBILITY_MASK = 12;
    private static Field sViewFlagsField;
    private static boolean sViewFlagsFieldFetched;

    static {
        if(Build$VERSION.SDK_INT >= 22) {
            ViewUtils.IMPL = new ViewUtilsApi22();
        }
        else if(Build$VERSION.SDK_INT >= 21) {
            ViewUtils.IMPL = new ViewUtilsApi21();
        }
        else if(Build$VERSION.SDK_INT >= 19) {
            ViewUtils.IMPL = new ViewUtilsApi19();
        }
        else {
            ViewUtils.IMPL = new ViewUtilsBase();
        }

        ViewUtils.TRANSITION_ALPHA = new androidx.transition.ViewUtils$1(Float.class, "translationAlpha");
        ViewUtils.CLIP_BOUNDS = new androidx.transition.ViewUtils$2(Rect.class, "clipBounds");
    }

    private ViewUtils() {
        super();
    }

    static void clearNonTransitionAlpha(@NonNull View arg1) {
        ViewUtils.IMPL.clearNonTransitionAlpha(arg1);
    }

    private static void fetchViewFlagsField() {
        if(!ViewUtils.sViewFlagsFieldFetched) {
            try {
                ViewUtils.sViewFlagsField = View.class.getDeclaredField("mViewFlags");
                ViewUtils.sViewFlagsField.setAccessible(true);
            }
            catch(NoSuchFieldException ) {
                Log.i("ViewUtils", "fetchViewFlagsField: ");
            }

            ViewUtils.sViewFlagsFieldFetched = true;
        }
    }

    static ViewOverlayImpl getOverlay(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 18) {
            return new ViewOverlayApi18(arg2);
        }

        return ViewOverlayApi14.createFrom(arg2);
    }

    static float getTransitionAlpha(@NonNull View arg1) {
        return ViewUtils.IMPL.getTransitionAlpha(arg1);
    }

    static WindowIdImpl getWindowId(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 18) {
            return new WindowIdApi18(arg2);
        }

        return new WindowIdApi14(arg2.getWindowToken());
    }

    static void saveNonTransitionAlpha(@NonNull View arg1) {
        ViewUtils.IMPL.saveNonTransitionAlpha(arg1);
    }

    static void setAnimationMatrix(@NonNull View arg1, @Nullable Matrix arg2) {
        ViewUtils.IMPL.setAnimationMatrix(arg1, arg2);
    }

    static void setLeftTopRightBottom(@NonNull View arg6, int arg7, int arg8, int arg9, int arg10) {
        ViewUtils.IMPL.setLeftTopRightBottom(arg6, arg7, arg8, arg9, arg10);
    }

    static void setTransitionAlpha(@NonNull View arg1, float arg2) {
        ViewUtils.IMPL.setTransitionAlpha(arg1, arg2);
    }

    static void setTransitionVisibility(@NonNull View arg2, int arg3) {
        ViewUtils.fetchViewFlagsField();
        if(ViewUtils.sViewFlagsField != null) {
            try {
                ViewUtils.sViewFlagsField.setInt(arg2, arg3 | ViewUtils.sViewFlagsField.getInt(arg2) & -13);
                return;
            }
            catch(IllegalAccessException ) {
                return;
            }
        }
    }

    static void transformMatrixToGlobal(@NonNull View arg1, @NonNull Matrix arg2) {
        ViewUtils.IMPL.transformMatrixToGlobal(arg1, arg2);
    }

    static void transformMatrixToLocal(@NonNull View arg1, @NonNull Matrix arg2) {
        ViewUtils.IMPL.transformMatrixToLocal(arg1, arg2);
    }
}

