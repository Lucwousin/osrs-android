package androidx.core.view;

import android.os.Build$VERSION;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

public final class ViewParentCompat {
    private static final String TAG = "ViewParentCompat";

    private ViewParentCompat() {
        super();
    }

    public static void notifySubtreeAccessibilityStateChanged(ViewParent arg2, View arg3, View arg4, int arg5) {
        if(Build$VERSION.SDK_INT >= 19) {
            arg2.notifySubtreeAccessibilityStateChanged(arg3, arg4, arg5);
        }
    }

    public static boolean onNestedFling(ViewParent arg2, View arg3, float arg4, float arg5, boolean arg6) {
        if(Build$VERSION.SDK_INT >= 21) {
            try {
                return arg2.onNestedFling(arg3, arg4, arg5, arg6);
            }
            catch(AbstractMethodError v3) {
                Log.e("ViewParentCompat", "ViewParent " + arg2 + " does not implement interface " + "method onNestedFling", ((Throwable)v3));
                return 0;
            }
        }

        if((arg2 instanceof NestedScrollingParent)) {
            return ((NestedScrollingParent)arg2).onNestedFling(arg3, arg4, arg5, arg6);
        }

        return 0;
    }

    public static boolean onNestedPreFling(ViewParent arg2, View arg3, float arg4, float arg5) {
        if(Build$VERSION.SDK_INT >= 21) {
            try {
                return arg2.onNestedPreFling(arg3, arg4, arg5);
            }
            catch(AbstractMethodError v3) {
                Log.e("ViewParentCompat", "ViewParent " + arg2 + " does not implement interface " + "method onNestedPreFling", ((Throwable)v3));
                return 0;
            }
        }

        if((arg2 instanceof NestedScrollingParent)) {
            return ((NestedScrollingParent)arg2).onNestedPreFling(arg3, arg4, arg5);
        }

        return 0;
    }

    public static void onNestedPreScroll(ViewParent arg7, View arg8, int arg9, int arg10, int[] arg11, int arg12) {
        if((arg7 instanceof NestedScrollingParent2)) {
            arg7.onNestedPreScroll(arg8, arg9, arg10, arg11, arg12);
            return;
        }

        if(arg12 == 0) {
            if(Build$VERSION.SDK_INT >= 21) {
                try {
                    arg7.onNestedPreScroll(arg8, arg9, arg10, arg11);
                }
                catch(AbstractMethodError v8) {
                    Log.e("ViewParentCompat", "ViewParent " + arg7 + " does not implement interface " + "method onNestedPreScroll", ((Throwable)v8));
                }

                return;
            }

            if((arg7 instanceof NestedScrollingParent)) {
                ((NestedScrollingParent)arg7).onNestedPreScroll(arg8, arg9, arg10, arg11);
            }
        }
    }

    public static void onNestedPreScroll(ViewParent arg6, View arg7, int arg8, int arg9, int[] arg10) {
        ViewParentCompat.onNestedPreScroll(arg6, arg7, arg8, arg9, arg10, 0);
    }

    public static void onNestedScroll(ViewParent arg8, View arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        if((arg8 instanceof NestedScrollingParent2)) {
            arg8.onNestedScroll(arg9, arg10, arg11, arg12, arg13, arg14);
            return;
        }

        if(arg14 == 0) {
            if(Build$VERSION.SDK_INT >= 21) {
                try {
                    arg8.onNestedScroll(arg9, arg10, arg11, arg12, arg13);
                }
                catch(AbstractMethodError v9) {
                    Log.e("ViewParentCompat", "ViewParent " + arg8 + " does not implement interface " + "method onNestedScroll", ((Throwable)v9));
                }

                return;
            }

            if((arg8 instanceof NestedScrollingParent)) {
                arg8.onNestedScroll(arg9, arg10, arg11, arg12, arg13);
            }
        }
    }

    public static void onNestedScroll(ViewParent arg7, View arg8, int arg9, int arg10, int arg11, int arg12) {
        ViewParentCompat.onNestedScroll(arg7, arg8, arg9, arg10, arg11, arg12, 0);
    }

    public static void onNestedScrollAccepted(ViewParent arg1, View arg2, View arg3, int arg4, int arg5) {
        if((arg1 instanceof NestedScrollingParent2)) {
            ((NestedScrollingParent2)arg1).onNestedScrollAccepted(arg2, arg3, arg4, arg5);
            return;
        }

        if(arg5 == 0) {
            if(Build$VERSION.SDK_INT >= 21) {
                try {
                    arg1.onNestedScrollAccepted(arg2, arg3, arg4);
                }
                catch(AbstractMethodError v2) {
                    Log.e("ViewParentCompat", "ViewParent " + arg1 + " does not implement interface " + "method onNestedScrollAccepted", ((Throwable)v2));
                }

                return;
            }

            if((arg1 instanceof NestedScrollingParent)) {
                ((NestedScrollingParent)arg1).onNestedScrollAccepted(arg2, arg3, arg4);
            }
        }
    }

    public static void onNestedScrollAccepted(ViewParent arg1, View arg2, View arg3, int arg4) {
        ViewParentCompat.onNestedScrollAccepted(arg1, arg2, arg3, arg4, 0);
    }

    public static boolean onStartNestedScroll(ViewParent arg1, View arg2, View arg3, int arg4, int arg5) {
        if((arg1 instanceof NestedScrollingParent2)) {
            return ((NestedScrollingParent2)arg1).onStartNestedScroll(arg2, arg3, arg4, arg5);
        }

        if(arg5 == 0) {
            if(Build$VERSION.SDK_INT >= 21) {
                try {
                    return arg1.onStartNestedScroll(arg2, arg3, arg4);
                }
                catch(AbstractMethodError v2) {
                    Log.e("ViewParentCompat", "ViewParent " + arg1 + " does not implement interface " + "method onStartNestedScroll", ((Throwable)v2));
                    return 0;
                }
            }

            if(!(arg1 instanceof NestedScrollingParent)) {
                return 0;
            }

            return ((NestedScrollingParent)arg1).onStartNestedScroll(arg2, arg3, arg4);
        }

        return 0;
    }

    public static boolean onStartNestedScroll(ViewParent arg1, View arg2, View arg3, int arg4) {
        return ViewParentCompat.onStartNestedScroll(arg1, arg2, arg3, arg4, 0);
    }

    public static void onStopNestedScroll(ViewParent arg2, View arg3, int arg4) {
        if((arg2 instanceof NestedScrollingParent2)) {
            ((NestedScrollingParent2)arg2).onStopNestedScroll(arg3, arg4);
            return;
        }

        if(arg4 == 0) {
            if(Build$VERSION.SDK_INT >= 21) {
                try {
                    arg2.onStopNestedScroll(arg3);
                }
                catch(AbstractMethodError v3) {
                    Log.e("ViewParentCompat", "ViewParent " + arg2 + " does not implement interface " + "method onStopNestedScroll", ((Throwable)v3));
                }

                return;
            }

            if((arg2 instanceof NestedScrollingParent)) {
                ((NestedScrollingParent)arg2).onStopNestedScroll(arg3);
            }
        }
    }

    public static void onStopNestedScroll(ViewParent arg1, View arg2) {
        ViewParentCompat.onStopNestedScroll(arg1, arg2, 0);
    }

    @Deprecated public static boolean requestSendAccessibilityEvent(ViewParent arg0, View arg1, AccessibilityEvent arg2) {
        return arg0.requestSendAccessibilityEvent(arg1, arg2);
    }
}

