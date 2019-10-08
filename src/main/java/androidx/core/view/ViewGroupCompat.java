package androidx.core.view;

import android.os.Build$VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.core.R$id;

public final class ViewGroupCompat {
    public static final int LAYOUT_MODE_CLIP_BOUNDS = 0;
    public static final int LAYOUT_MODE_OPTICAL_BOUNDS = 1;

    private ViewGroupCompat() {
        super();
    }

    public static int getLayoutMode(@NonNull ViewGroup arg2) {
        if(Build$VERSION.SDK_INT >= 18) {
            return arg2.getLayoutMode();
        }

        return 0;
    }

    public static int getNestedScrollAxes(@NonNull ViewGroup arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getNestedScrollAxes();
        }

        if((arg2 instanceof NestedScrollingParent)) {
            return ((NestedScrollingParent)arg2).getNestedScrollAxes();
        }

        return 0;
    }

    public static boolean isTransitionGroup(@NonNull ViewGroup arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.isTransitionGroup();
        }

        Object v0 = arg2.getTag(R$id.tag_transition_group);
        boolean v2 = v0 != null && (((Boolean)v0).booleanValue()) || (arg2.getBackground() != null || ViewCompat.getTransitionName(((View)arg2)) != null) ? true : false;
        return v2;
    }

    @Deprecated public static boolean onRequestSendAccessibilityEvent(ViewGroup arg0, View arg1, AccessibilityEvent arg2) {
        return arg0.onRequestSendAccessibilityEvent(arg1, arg2);
    }

    public static void setLayoutMode(@NonNull ViewGroup arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 18) {
            arg2.setLayoutMode(arg3);
        }
    }

    @Deprecated public static void setMotionEventSplittingEnabled(ViewGroup arg0, boolean arg1) {
        arg0.setMotionEventSplittingEnabled(arg1);
    }

    public static void setTransitionGroup(@NonNull ViewGroup arg2, boolean arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setTransitionGroup(arg3);
        }
        else {
            arg2.setTag(R$id.tag_transition_group, Boolean.valueOf(arg3));
        }
    }
}

