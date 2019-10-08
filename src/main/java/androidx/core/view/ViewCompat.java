package androidx.core.view;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ClipData;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View$AccessibilityDelegate;
import android.view.View$DragShadowBuilder;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.View$OnUnhandledKeyEventListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.collection.ArrayMap;
import androidx.core.R$id;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class ViewCompat {
    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface FocusDirection {
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface FocusRealDirection {
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface FocusRelativeDirection {
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface NestedScrollType {
    }

    public interface OnUnhandledKeyEventListenerCompat {
        boolean onUnhandledKeyEvent(View arg1, KeyEvent arg2);
    }

    @RequiresApi(value=28) class OnUnhandledKeyEventListenerWrapper implements View$OnUnhandledKeyEventListener {
        private OnUnhandledKeyEventListenerCompat mCompatListener;

        OnUnhandledKeyEventListenerWrapper(OnUnhandledKeyEventListenerCompat arg1) {
            super();
            this.mCompatListener = arg1;
        }

        public boolean onUnhandledKeyEvent(View arg2, KeyEvent arg3) {
            return this.mCompatListener.onUnhandledKeyEvent(arg2, arg3);
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface ScrollAxis {
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface ScrollIndicators {
    }

    class UnhandledKeyEventManager {
        private SparseArray mCapturedKeys;
        private WeakReference mLastDispatchedPreViewKeyEvent;
        @Nullable private WeakHashMap mViewsContainingListeners;
        private static final ArrayList sViewsWithListeners;

        static {
            UnhandledKeyEventManager.sViewsWithListeners = new ArrayList();
        }

        UnhandledKeyEventManager() {
            super();
            this.mViewsContainingListeners = null;
            this.mCapturedKeys = null;
            this.mLastDispatchedPreViewKeyEvent = null;
        }

        static UnhandledKeyEventManager at(View arg2) {
            Object v0 = arg2.getTag(R$id.tag_unhandled_key_event_manager);
            if(v0 == null) {
                UnhandledKeyEventManager v0_1 = new UnhandledKeyEventManager();
                arg2.setTag(R$id.tag_unhandled_key_event_manager, v0_1);
            }

            return ((UnhandledKeyEventManager)v0);
        }

        boolean dispatch(View arg3, KeyEvent arg4) {
            if(arg4.getAction() == 0) {
                this.recalcViewsWithUnhandled();
            }

            arg3 = this.dispatchInOrder(arg3, arg4);
            if(arg4.getAction() == 0) {
                int v4 = arg4.getKeyCode();
                if(arg3 != null && !KeyEvent.isModifierKey(v4)) {
                    this.getCapturedKeys().put(v4, new WeakReference(arg3));
                }
            }

            boolean v3 = arg3 != null ? true : false;
            return v3;
        }

        @Nullable private View dispatchInOrder(View arg5, KeyEvent arg6) {
            View v1 = null;
            if(this.mViewsContainingListeners != null) {
                if(!this.mViewsContainingListeners.containsKey(arg5)) {
                }
                else {
                    if((arg5 instanceof ViewGroup)) {
                        View v0 = arg5;
                        int v2 = ((ViewGroup)v0).getChildCount() - 1;
                        while(v2 >= 0) {
                            View v3 = this.dispatchInOrder(((ViewGroup)v0).getChildAt(v2), arg6);
                            if(v3 != null) {
                                return v3;
                            }
                            else {
                                --v2;
                                continue;
                            }

                            break;
                        }
                    }

                    if(this.onUnhandledKeyEvent(arg5, arg6)) {
                        return arg5;
                    }

                    return v1;
                }
            }

            return v1;
        }

        private SparseArray getCapturedKeys() {
            if(this.mCapturedKeys == null) {
                this.mCapturedKeys = new SparseArray();
            }

            return this.mCapturedKeys;
        }

        private boolean onUnhandledKeyEvent(@NonNull View arg5, @NonNull KeyEvent arg6) {
            Object v0 = arg5.getTag(R$id.tag_unhandled_key_listeners);
            if(v0 != null) {
                int v1 = ((ArrayList)v0).size() - 1;
                while(v1 >= 0) {
                    if(((ArrayList)v0).get(v1).onUnhandledKeyEvent(arg5, arg6)) {
                        return 1;
                    }
                    else {
                        --v1;
                        continue;
                    }

                    return 0;
                }
            }

            return 0;
        }

        boolean preDispatch(KeyEvent arg6) {
            if(this.mLastDispatchedPreViewKeyEvent != null && this.mLastDispatchedPreViewKeyEvent.get() == arg6) {
                return 0;
            }

            this.mLastDispatchedPreViewKeyEvent = new WeakReference(arg6);
            Object v0 = null;
            SparseArray v2 = this.getCapturedKeys();
            if(arg6.getAction() == 1) {
                int v3 = v2.indexOfKey(arg6.getKeyCode());
                if(v3 >= 0) {
                    v0 = v2.valueAt(v3);
                    v2.removeAt(v3);
                }
            }

            if(v0 == null) {
                v0 = v2.get(arg6.getKeyCode());
            }

            if(v0 != null) {
                v0 = ((WeakReference)v0).get();
                if(v0 != null && (ViewCompat.isAttachedToWindow(((View)v0)))) {
                    this.onUnhandledKeyEvent(((View)v0), arg6);
                }

                return 1;
            }

            return 0;
        }

        private void recalcViewsWithUnhandled() {
            if(this.mViewsContainingListeners != null) {
                this.mViewsContainingListeners.clear();
            }

            if(UnhandledKeyEventManager.sViewsWithListeners.isEmpty()) {
                return;
            }

            ArrayList v0 = UnhandledKeyEventManager.sViewsWithListeners;
            __monitor_enter(v0);
            try {
                if(this.mViewsContainingListeners == null) {
                    this.mViewsContainingListeners = new WeakHashMap();
                }

                int v1_1;
                for(v1_1 = UnhandledKeyEventManager.sViewsWithListeners.size() - 1; v1_1 >= 0; --v1_1) {
                    Object v2 = UnhandledKeyEventManager.sViewsWithListeners.get(v1_1).get();
                    if(v2 == null) {
                        UnhandledKeyEventManager.sViewsWithListeners.remove(v1_1);
                    }
                    else {
                        this.mViewsContainingListeners.put(v2, Boolean.TRUE);
                        ViewParent v2_1;
                        for(v2_1 = ((View)v2).getParent(); (v2_1 instanceof View); v2_1 = v2_1.getParent()) {
                            this.mViewsContainingListeners.put(v2_1, Boolean.TRUE);
                        }
                    }
                }

                __monitor_exit(v0);
                return;
            label_43:
                __monitor_exit(v0);
            }
            catch(Throwable v1) {
                goto label_43;
            }

            throw v1;
        }

        static void registerListeningView(View arg3) {
            ArrayList v0 = UnhandledKeyEventManager.sViewsWithListeners;
            __monitor_enter(v0);
            try {
                Iterator v1 = UnhandledKeyEventManager.sViewsWithListeners.iterator();
                do {
                    if(!v1.hasNext()) {
                        goto label_11;
                    }
                }
                while(v1.next().get() != arg3);

                __monitor_exit(v0);
                return;
            label_11:
                UnhandledKeyEventManager.sViewsWithListeners.add(new WeakReference(arg3));
                __monitor_exit(v0);
                return;
            label_18:
                __monitor_exit(v0);
            }
            catch(Throwable v3) {
                goto label_18;
            }

            throw v3;
        }

        static void unregisterListeningView(View arg3) {
            ArrayList v0 = UnhandledKeyEventManager.sViewsWithListeners;
            __monitor_enter(v0);
            int v1 = 0;
            try {
                while(v1 < UnhandledKeyEventManager.sViewsWithListeners.size()) {
                    if(UnhandledKeyEventManager.sViewsWithListeners.get(v1).get() == arg3) {
                        UnhandledKeyEventManager.sViewsWithListeners.remove(v1);
                        __monitor_exit(v0);
                        return;
                    }

                    ++v1;
                }

                __monitor_exit(v0);
                return;
            label_19:
                __monitor_exit(v0);
            }
            catch(Throwable v3) {
                goto label_19;
            }

            throw v3;
        }
    }

    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    @Deprecated public static final int LAYER_TYPE_HARDWARE = 2;
    @Deprecated public static final int LAYER_TYPE_NONE = 0;
    @Deprecated public static final int LAYER_TYPE_SOFTWARE = 1;
    public static final int LAYOUT_DIRECTION_INHERIT = 2;
    public static final int LAYOUT_DIRECTION_LOCALE = 3;
    public static final int LAYOUT_DIRECTION_LTR = 0;
    public static final int LAYOUT_DIRECTION_RTL = 1;
    @Deprecated public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;
    @Deprecated public static final int MEASURED_SIZE_MASK = 0xFFFFFF;
    @Deprecated public static final int MEASURED_STATE_MASK = 0xFF000000;
    @Deprecated public static final int MEASURED_STATE_TOO_SMALL = 0x1000000;
    @Deprecated public static final int OVER_SCROLL_ALWAYS = 0;
    @Deprecated public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;
    @Deprecated public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 0x20;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    private static final String TAG = "ViewCompat";
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH;
    private static boolean sAccessibilityDelegateCheckFailed;
    private static Field sAccessibilityDelegateField;
    private static Method sChildrenDrawingOrderMethod;
    private static Method sDispatchFinishTemporaryDetach;
    private static Method sDispatchStartTemporaryDetach;
    private static Field sMinHeightField;
    private static boolean sMinHeightFieldFetched;
    private static Field sMinWidthField;
    private static boolean sMinWidthFieldFetched;
    private static final AtomicInteger sNextGeneratedId;
    private static boolean sTempDetachBound;
    private static ThreadLocal sThreadLocalRect;
    private static WeakHashMap sTransitionNameMap;
    private static WeakHashMap sViewPropertyAnimatorMap;

    static {
        ViewCompat.sNextGeneratedId = new AtomicInteger(1);
        ViewCompat.sViewPropertyAnimatorMap = null;
        ViewCompat.sAccessibilityDelegateCheckFailed = false;
    }

    protected ViewCompat() {
        super();
    }

    public static void addKeyboardNavigationClusters(@NonNull View arg2, @NonNull Collection arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 26) {
            arg2.addKeyboardNavigationClusters(arg3, arg4);
        }
    }

    public static void addOnUnhandledKeyEventListener(@NonNull View arg2, @NonNull OnUnhandledKeyEventListenerCompat arg3) {
        ArrayMap v0_1;
        Object v0;
        if(Build$VERSION.SDK_INT >= 28) {
            v0 = arg2.getTag(R$id.tag_unhandled_key_listeners);
            if(v0 == null) {
                v0_1 = new ArrayMap();
                arg2.setTag(R$id.tag_unhandled_key_listeners, v0_1);
            }

            OnUnhandledKeyEventListenerWrapper v1 = new OnUnhandledKeyEventListenerWrapper(arg3);
            ((Map)v0_1).put(arg3, v1);
            arg2.addOnUnhandledKeyEventListener(((View$OnUnhandledKeyEventListener)v1));
            return;
        }

        v0 = arg2.getTag(R$id.tag_unhandled_key_listeners);
        if(v0 == null) {
            ArrayList v0_2 = new ArrayList();
            arg2.setTag(R$id.tag_unhandled_key_listeners, v0_2);
        }

        ((ArrayList)v0).add(arg3);
        if(((ArrayList)v0).size() == 1) {
            UnhandledKeyEventManager.registerListeningView(arg2);
        }
    }

    @NonNull public static ViewPropertyAnimatorCompat animate(@NonNull View arg2) {
        if(ViewCompat.sViewPropertyAnimatorMap == null) {
            ViewCompat.sViewPropertyAnimatorMap = new WeakHashMap();
        }

        Object v0 = ViewCompat.sViewPropertyAnimatorMap.get(arg2);
        if(v0 == null) {
            ViewPropertyAnimatorCompat v0_1 = new ViewPropertyAnimatorCompat(arg2);
            ViewCompat.sViewPropertyAnimatorMap.put(arg2, v0_1);
        }

        return ((ViewPropertyAnimatorCompat)v0);
    }

    private static void bindTempDetach() {
        try {
            ViewCompat.sDispatchStartTemporaryDetach = View.class.getDeclaredMethod("dispatchStartTemporaryDetach");
            ViewCompat.sDispatchFinishTemporaryDetach = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach");
        }
        catch(NoSuchMethodException v0) {
            Log.e("ViewCompat", "Couldn\'t find method", ((Throwable)v0));
        }

        ViewCompat.sTempDetachBound = true;
    }

    @Deprecated public static boolean canScrollHorizontally(View arg0, int arg1) {
        return arg0.canScrollHorizontally(arg1);
    }

    @Deprecated public static boolean canScrollVertically(View arg0, int arg1) {
        return arg0.canScrollVertically(arg1);
    }

    public static void cancelDragAndDrop(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 24) {
            arg2.cancelDragAndDrop();
        }
    }

    @Deprecated public static int combineMeasuredStates(int arg0, int arg1) {
        return View.combineMeasuredStates(arg0, arg1);
    }

    private static void compatOffsetLeftAndRight(View arg0, int arg1) {
        arg0.offsetLeftAndRight(arg1);
        if(arg0.getVisibility() == 0) {
            ViewCompat.tickleInvalidationFlag(arg0);
            ViewParent v0 = arg0.getParent();
            if((v0 instanceof View)) {
                ViewCompat.tickleInvalidationFlag(((View)v0));
            }
        }
    }

    private static void compatOffsetTopAndBottom(View arg0, int arg1) {
        arg0.offsetTopAndBottom(arg1);
        if(arg0.getVisibility() == 0) {
            ViewCompat.tickleInvalidationFlag(arg0);
            ViewParent v0 = arg0.getParent();
            if((v0 instanceof View)) {
                ViewCompat.tickleInvalidationFlag(((View)v0));
            }
        }
    }

    public static WindowInsetsCompat dispatchApplyWindowInsets(@NonNull View arg2, WindowInsetsCompat arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            Object v3 = WindowInsetsCompat.unwrap(arg3);
            WindowInsets v2 = arg2.dispatchApplyWindowInsets(((WindowInsets)v3));
            if(v2 != v3) {
                WindowInsets v3_1 = new WindowInsets(v2);
            }

            return WindowInsetsCompat.wrap(v3);
        }

        return arg3;
    }

    public static void dispatchFinishTemporaryDetach(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 24) {
            arg2.dispatchFinishTemporaryDetach();
            return;
        }

        if(!ViewCompat.sTempDetachBound) {
            ViewCompat.bindTempDetach();
        }

        if(ViewCompat.sDispatchFinishTemporaryDetach != null) {
            try {
                ViewCompat.sDispatchFinishTemporaryDetach.invoke(arg2);
            }
            catch(Exception v2) {
                Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", ((Throwable)v2));
            }
        }
        else {
            arg2.onFinishTemporaryDetach();
        }
    }

    public static boolean dispatchNestedFling(@NonNull View arg2, float arg3, float arg4, boolean arg5) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.dispatchNestedFling(arg3, arg4, arg5);
        }

        if((arg2 instanceof NestedScrollingChild)) {
            return ((NestedScrollingChild)arg2).dispatchNestedFling(arg3, arg4, arg5);
        }

        return 0;
    }

    public static boolean dispatchNestedPreFling(@NonNull View arg2, float arg3, float arg4) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.dispatchNestedPreFling(arg3, arg4);
        }

        if((arg2 instanceof NestedScrollingChild)) {
            return ((NestedScrollingChild)arg2).dispatchNestedPreFling(arg3, arg4);
        }

        return 0;
    }

    public static boolean dispatchNestedPreScroll(@NonNull View arg2, int arg3, int arg4, @Nullable int[] arg5, @Nullable int[] arg6) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.dispatchNestedPreScroll(arg3, arg4, arg5, arg6);
        }

        if((arg2 instanceof NestedScrollingChild)) {
            return ((NestedScrollingChild)arg2).dispatchNestedPreScroll(arg3, arg4, arg5, arg6);
        }

        return 0;
    }

    public static boolean dispatchNestedPreScroll(@NonNull View arg7, int arg8, int arg9, @Nullable int[] arg10, @Nullable int[] arg11, int arg12) {
        if((arg7 instanceof NestedScrollingChild2)) {
            return arg7.dispatchNestedPreScroll(arg8, arg9, arg10, arg11, arg12);
        }

        if(arg12 == 0) {
            return ViewCompat.dispatchNestedPreScroll(arg7, arg8, arg9, arg10, arg11);
        }

        return 0;
    }

    public static boolean dispatchNestedScroll(@NonNull View arg7, int arg8, int arg9, int arg10, int arg11, @Nullable int[] arg12) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg7.dispatchNestedScroll(arg8, arg9, arg10, arg11, arg12);
        }

        if((arg7 instanceof NestedScrollingChild)) {
            return arg7.dispatchNestedScroll(arg8, arg9, arg10, arg11, arg12);
        }

        return 0;
    }

    public static boolean dispatchNestedScroll(@NonNull View arg8, int arg9, int arg10, int arg11, int arg12, @Nullable int[] arg13, int arg14) {
        if((arg8 instanceof NestedScrollingChild2)) {
            return arg8.dispatchNestedScroll(arg9, arg10, arg11, arg12, arg13, arg14);
        }

        if(arg14 == 0) {
            return ViewCompat.dispatchNestedScroll(arg8, arg9, arg10, arg11, arg12, arg13);
        }

        return 0;
    }

    public static void dispatchStartTemporaryDetach(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 24) {
            arg2.dispatchStartTemporaryDetach();
            return;
        }

        if(!ViewCompat.sTempDetachBound) {
            ViewCompat.bindTempDetach();
        }

        if(ViewCompat.sDispatchStartTemporaryDetach != null) {
            try {
                ViewCompat.sDispatchStartTemporaryDetach.invoke(arg2);
            }
            catch(Exception v2) {
                Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", ((Throwable)v2));
            }
        }
        else {
            arg2.onStartTemporaryDetach();
        }
    }

    @UiThread static boolean dispatchUnhandledKeyEventBeforeCallback(View arg2, KeyEvent arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            return 0;
        }

        return UnhandledKeyEventManager.at(arg2).dispatch(arg2, arg3);
    }

    @UiThread static boolean dispatchUnhandledKeyEventBeforeHierarchy(View arg2, KeyEvent arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            return 0;
        }

        return UnhandledKeyEventManager.at(arg2).preDispatch(arg3);
    }

    public static int generateViewId() {
        int v0;
        if(Build$VERSION.SDK_INT >= 17) {
            return View.generateViewId();
        }

        do {
            v0 = ViewCompat.sNextGeneratedId.get();
            int v1 = v0 + 1;
            if(v1 > 0xFFFFFF) {
                v1 = 1;
            }
        }
        while(!ViewCompat.sNextGeneratedId.compareAndSet(v0, v1));

        return v0;
    }

    public static int getAccessibilityLiveRegion(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.getAccessibilityLiveRegion();
        }

        return 0;
    }

    public static AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider v2 = arg2.getAccessibilityNodeProvider();
            if(v2 != null) {
                return new AccessibilityNodeProviderCompat(v2);
            }
        }

        return null;
    }

    @Deprecated public static float getAlpha(View arg0) {
        return arg0.getAlpha();
    }

    public static ColorStateList getBackgroundTintList(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getBackgroundTintList();
        }

        ColorStateList v2 = (arg2 instanceof TintableBackgroundView) ? ((TintableBackgroundView)arg2).getSupportBackgroundTintList() : null;
        return v2;
    }

    public static PorterDuff$Mode getBackgroundTintMode(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getBackgroundTintMode();
        }

        PorterDuff$Mode v2 = (arg2 instanceof TintableBackgroundView) ? ((TintableBackgroundView)arg2).getSupportBackgroundTintMode() : null;
        return v2;
    }

    @Nullable public static Rect getClipBounds(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 18) {
            return arg2.getClipBounds();
        }

        return null;
    }

    @Nullable public static Display getDisplay(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 17) {
            return arg2.getDisplay();
        }

        if(ViewCompat.isAttachedToWindow(arg2)) {
            return arg2.getContext().getSystemService("window").getDefaultDisplay();
        }

        return null;
    }

    public static float getElevation(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getElevation();
        }

        return 0;
    }

    private static Rect getEmptyTempRect() {
        Rect v0_1;
        if(ViewCompat.sThreadLocalRect == null) {
            ViewCompat.sThreadLocalRect = new ThreadLocal();
        }

        Object v0 = ViewCompat.sThreadLocalRect.get();
        if(v0 == null) {
            v0_1 = new Rect();
            ViewCompat.sThreadLocalRect.set(v0_1);
        }

        v0_1.setEmpty();
        return v0_1;
    }

    public static boolean getFitsSystemWindows(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg2.getFitsSystemWindows();
        }

        return 0;
    }

    public static int getImportantForAccessibility(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg2.getImportantForAccessibility();
        }

        return 0;
    }

    @SuppressLint(value={"InlinedApi"}) public static int getImportantForAutofill(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getImportantForAutofill();
        }

        return 0;
    }

    public static int getLabelFor(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 17) {
            return arg2.getLabelFor();
        }

        return 0;
    }

    @Deprecated public static int getLayerType(View arg0) {
        return arg0.getLayerType();
    }

    public static int getLayoutDirection(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 17) {
            return arg2.getLayoutDirection();
        }

        return 0;
    }

    @Nullable @Deprecated public static Matrix getMatrix(View arg0) {
        return arg0.getMatrix();
    }

    @Deprecated public static int getMeasuredHeightAndState(View arg0) {
        return arg0.getMeasuredHeightAndState();
    }

    @Deprecated public static int getMeasuredState(View arg0) {
        return arg0.getMeasuredState();
    }

    @Deprecated public static int getMeasuredWidthAndState(View arg0) {
        return arg0.getMeasuredWidthAndState();
    }

    public static int getMinimumHeight(@NonNull View arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg3.getMinimumHeight();
        }

        if(!ViewCompat.sMinHeightFieldFetched) {
            try {
                ViewCompat.sMinHeightField = View.class.getDeclaredField("mMinHeight");
                ViewCompat.sMinHeightField.setAccessible(true);
                goto label_14;
            }
            catch(NoSuchFieldException ) {
            label_14:
                ViewCompat.sMinHeightFieldFetched = true;
            }
        }

        if(ViewCompat.sMinHeightField == null) {
            return 0;
        }

        try {
            return ViewCompat.sMinHeightField.get(arg3).intValue();
        }
        catch(Exception ) {
            return 0;
        }
    }

    public static int getMinimumWidth(@NonNull View arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg3.getMinimumWidth();
        }

        if(!ViewCompat.sMinWidthFieldFetched) {
            try {
                ViewCompat.sMinWidthField = View.class.getDeclaredField("mMinWidth");
                ViewCompat.sMinWidthField.setAccessible(true);
                goto label_14;
            }
            catch(NoSuchFieldException ) {
            label_14:
                ViewCompat.sMinWidthFieldFetched = true;
            }
        }

        if(ViewCompat.sMinWidthField == null) {
            return 0;
        }

        try {
            return ViewCompat.sMinWidthField.get(arg3).intValue();
        }
        catch(Exception ) {
            return 0;
        }
    }

    public static int getNextClusterForwardId(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getNextClusterForwardId();
        }

        return -1;
    }

    @Deprecated public static int getOverScrollMode(View arg0) {
        return arg0.getOverScrollMode();
    }

    @Px public static int getPaddingEnd(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 17) {
            return arg2.getPaddingEnd();
        }

        return arg2.getPaddingRight();
    }

    @Px public static int getPaddingStart(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 17) {
            return arg2.getPaddingStart();
        }

        return arg2.getPaddingLeft();
    }

    public static ViewParent getParentForAccessibility(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg2.getParentForAccessibility();
        }

        return arg2.getParent();
    }

    @Deprecated public static float getPivotX(View arg0) {
        return arg0.getPivotX();
    }

    @Deprecated public static float getPivotY(View arg0) {
        return arg0.getPivotY();
    }

    @Deprecated public static float getRotation(View arg0) {
        return arg0.getRotation();
    }

    @Deprecated public static float getRotationX(View arg0) {
        return arg0.getRotationX();
    }

    @Deprecated public static float getRotationY(View arg0) {
        return arg0.getRotationY();
    }

    @Deprecated public static float getScaleX(View arg0) {
        return arg0.getScaleX();
    }

    @Deprecated public static float getScaleY(View arg0) {
        return arg0.getScaleY();
    }

    public static int getScrollIndicators(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg2.getScrollIndicators();
        }

        return 0;
    }

    @Nullable public static String getTransitionName(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getTransitionName();
        }

        if(ViewCompat.sTransitionNameMap == null) {
            return null;
        }

        return ViewCompat.sTransitionNameMap.get(arg2);
    }

    @Deprecated public static float getTranslationX(View arg0) {
        return arg0.getTranslationX();
    }

    @Deprecated public static float getTranslationY(View arg0) {
        return arg0.getTranslationY();
    }

    public static float getTranslationZ(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getTranslationZ();
        }

        return 0;
    }

    public static int getWindowSystemUiVisibility(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg2.getWindowSystemUiVisibility();
        }

        return 0;
    }

    @Deprecated public static float getX(View arg0) {
        return arg0.getX();
    }

    @Deprecated public static float getY(View arg0) {
        return arg0.getY();
    }

    public static float getZ(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.getZ();
        }

        return 0;
    }

    public static boolean hasAccessibilityDelegate(@NonNull View arg4) {
        boolean v1 = false;
        if(ViewCompat.sAccessibilityDelegateCheckFailed) {
            return 0;
        }

        if(ViewCompat.sAccessibilityDelegateField == null) {
            try {
                ViewCompat.sAccessibilityDelegateField = View.class.getDeclaredField("mAccessibilityDelegate");
                ViewCompat.sAccessibilityDelegateField.setAccessible(true);
            }
            catch(Throwable ) {
                ViewCompat.sAccessibilityDelegateCheckFailed = true;
                return 0;
            }
        }

        try {
            if(ViewCompat.sAccessibilityDelegateField.get(arg4) == null) {
                return v1;
            }
        }
        catch(Throwable ) {
            ViewCompat.sAccessibilityDelegateCheckFailed = true;
            return 0;
        }

        return true;
    }

    public static boolean hasExplicitFocusable(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.hasExplicitFocusable();
        }

        return arg2.hasFocusable();
    }

    public static boolean hasNestedScrollingParent(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.hasNestedScrollingParent();
        }

        if((arg2 instanceof NestedScrollingChild)) {
            return ((NestedScrollingChild)arg2).hasNestedScrollingParent();
        }

        return 0;
    }

    public static boolean hasNestedScrollingParent(@NonNull View arg1, int arg2) {
        if((arg1 instanceof NestedScrollingChild2)) {
            ((NestedScrollingChild2)arg1).hasNestedScrollingParent(arg2);
        }
        else if(arg2 == 0) {
            return ViewCompat.hasNestedScrollingParent(arg1);
        }

        return 0;
    }

    public static boolean hasOnClickListeners(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 15) {
            return arg2.hasOnClickListeners();
        }

        return 0;
    }

    public static boolean hasOverlappingRendering(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg2.hasOverlappingRendering();
        }

        return 1;
    }

    public static boolean hasTransientState(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg2.hasTransientState();
        }

        return 0;
    }

    public static boolean isAttachedToWindow(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.isAttachedToWindow();
        }

        boolean v2 = arg2.getWindowToken() != null ? true : false;
        return v2;
    }

    public static boolean isFocusedByDefault(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.isFocusedByDefault();
        }

        return 0;
    }

    public static boolean isImportantForAccessibility(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.isImportantForAccessibility();
        }

        return 1;
    }

    public static boolean isImportantForAutofill(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.isImportantForAutofill();
        }

        return 1;
    }

    public static boolean isInLayout(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 18) {
            return arg2.isInLayout();
        }

        return 0;
    }

    public static boolean isKeyboardNavigationCluster(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.isKeyboardNavigationCluster();
        }

        return 0;
    }

    public static boolean isLaidOut(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.isLaidOut();
        }

        boolean v2 = arg2.getWidth() <= 0 || arg2.getHeight() <= 0 ? false : true;
        return v2;
    }

    public static boolean isLayoutDirectionResolved(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.isLayoutDirectionResolved();
        }

        return 0;
    }

    public static boolean isNestedScrollingEnabled(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.isNestedScrollingEnabled();
        }

        if((arg2 instanceof NestedScrollingChild)) {
            return ((NestedScrollingChild)arg2).isNestedScrollingEnabled();
        }

        return 0;
    }

    @Deprecated public static boolean isOpaque(View arg0) {
        return arg0.isOpaque();
    }

    public static boolean isPaddingRelative(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 17) {
            return arg2.isPaddingRelative();
        }

        return 0;
    }

    @Deprecated public static void jumpDrawablesToCurrentState(View arg0) {
        arg0.jumpDrawablesToCurrentState();
    }

    public static View keyboardNavigationClusterSearch(@NonNull View arg2, View arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.keyboardNavigationClusterSearch(arg3, arg4);
        }

        return null;
    }

    public static void offsetLeftAndRight(@NonNull View arg6, int arg7) {
        if(Build$VERSION.SDK_INT >= 23) {
            arg6.offsetLeftAndRight(arg7);
        }
        else if(Build$VERSION.SDK_INT >= 21) {
            Rect v0 = ViewCompat.getEmptyTempRect();
            int v1 = 0;
            ViewParent v2 = arg6.getParent();
            if((v2 instanceof View)) {
                v0.set(v2.getLeft(), v2.getTop(), v2.getRight(), v2.getBottom());
                v1 = v0.intersects(arg6.getLeft(), arg6.getTop(), arg6.getRight(), arg6.getBottom()) ^ 1;
            }

            ViewCompat.compatOffsetLeftAndRight(arg6, arg7);
            if(v1 == 0) {
                return;
            }

            if(!v0.intersect(arg6.getLeft(), arg6.getTop(), arg6.getRight(), arg6.getBottom())) {
                return;
            }

            ((View)v2).invalidate(v0);
        }
        else {
            ViewCompat.compatOffsetLeftAndRight(arg6, arg7);
        }
    }

    public static void offsetTopAndBottom(@NonNull View arg6, int arg7) {
        if(Build$VERSION.SDK_INT >= 23) {
            arg6.offsetTopAndBottom(arg7);
        }
        else if(Build$VERSION.SDK_INT >= 21) {
            Rect v0 = ViewCompat.getEmptyTempRect();
            int v1 = 0;
            ViewParent v2 = arg6.getParent();
            if((v2 instanceof View)) {
                v0.set(v2.getLeft(), v2.getTop(), v2.getRight(), v2.getBottom());
                v1 = v0.intersects(arg6.getLeft(), arg6.getTop(), arg6.getRight(), arg6.getBottom()) ^ 1;
            }

            ViewCompat.compatOffsetTopAndBottom(arg6, arg7);
            if(v1 == 0) {
                return;
            }

            if(!v0.intersect(arg6.getLeft(), arg6.getTop(), arg6.getRight(), arg6.getBottom())) {
                return;
            }

            ((View)v2).invalidate(v0);
        }
        else {
            ViewCompat.compatOffsetTopAndBottom(arg6, arg7);
        }
    }

    public static WindowInsetsCompat onApplyWindowInsets(@NonNull View arg2, WindowInsetsCompat arg3) {
        WindowInsets v3_1;
        if(Build$VERSION.SDK_INT >= 21) {
            Object v3 = WindowInsetsCompat.unwrap(arg3);
            WindowInsets v2 = arg2.onApplyWindowInsets(((WindowInsets)v3));
            if(v2 != v3) {
                v3_1 = new WindowInsets(v2);
            }

            return WindowInsetsCompat.wrap(v3_1);
        }

        return arg3;
    }

    @Deprecated public static void onInitializeAccessibilityEvent(View arg0, AccessibilityEvent arg1) {
        arg0.onInitializeAccessibilityEvent(arg1);
    }

    public static void onInitializeAccessibilityNodeInfo(@NonNull View arg0, AccessibilityNodeInfoCompat arg1) {
        arg0.onInitializeAccessibilityNodeInfo(arg1.unwrap());
    }

    @Deprecated public static void onPopulateAccessibilityEvent(View arg0, AccessibilityEvent arg1) {
        arg0.onPopulateAccessibilityEvent(arg1);
    }

    public static boolean performAccessibilityAction(@NonNull View arg2, int arg3, Bundle arg4) {
        if(Build$VERSION.SDK_INT >= 16) {
            return arg2.performAccessibilityAction(arg3, arg4);
        }

        return 0;
    }

    public static void postInvalidateOnAnimation(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 16) {
            arg2.postInvalidateOnAnimation();
        }
        else {
            arg2.postInvalidate();
        }
    }

    public static void postInvalidateOnAnimation(@NonNull View arg2, int arg3, int arg4, int arg5, int arg6) {
        if(Build$VERSION.SDK_INT >= 16) {
            arg2.postInvalidateOnAnimation(arg3, arg4, arg5, arg6);
        }
        else {
            arg2.postInvalidate(arg3, arg4, arg5, arg6);
        }
    }

    public static void postOnAnimation(@NonNull View arg2, Runnable arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            arg2.postOnAnimation(arg3);
        }
        else {
            arg2.postDelayed(arg3, ValueAnimator.getFrameDelay());
        }
    }

    public static void postOnAnimationDelayed(@NonNull View arg2, Runnable arg3, long arg4) {
        if(Build$VERSION.SDK_INT >= 16) {
            arg2.postOnAnimationDelayed(arg3, arg4);
        }
        else {
            arg2.postDelayed(arg3, ValueAnimator.getFrameDelay() + arg4);
        }
    }

    public static void removeOnUnhandledKeyEventListener(@NonNull View arg2, @NonNull OnUnhandledKeyEventListenerCompat arg3) {
        Object v0;
        if(Build$VERSION.SDK_INT >= 28) {
            v0 = arg2.getTag(R$id.tag_unhandled_key_listeners);
            if(v0 == null) {
                return;
            }

            Object v3 = ((Map)v0).get(arg3);
            if(v3 != null) {
                arg2.removeOnUnhandledKeyEventListener(((View$OnUnhandledKeyEventListener)v3));
            }

            return;
        }

        v0 = arg2.getTag(R$id.tag_unhandled_key_listeners);
        if(v0 != null) {
            ((ArrayList)v0).remove(arg3);
            if(((ArrayList)v0).size() == 0) {
                UnhandledKeyEventManager.unregisterListeningView(arg2);
            }
        }
    }

    public static void requestApplyInsets(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 20) {
            arg2.requestApplyInsets();
        }
        else if(Build$VERSION.SDK_INT >= 16) {
            arg2.requestFitSystemWindows();
        }
    }

    @NonNull public static View requireViewById(@NonNull View arg2, @IdRes int arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg2.requireViewById(arg3);
        }

        arg2 = arg2.findViewById(arg3);
        if(arg2 != null) {
            return arg2;
        }

        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated public static int resolveSizeAndState(int arg0, int arg1, int arg2) {
        return View.resolveSizeAndState(arg0, arg1, arg2);
    }

    public static boolean restoreDefaultFocus(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.restoreDefaultFocus();
        }

        return arg2.requestFocus();
    }

    public static void setAccessibilityDelegate(@NonNull View arg0, AccessibilityDelegateCompat arg1) {
        View$AccessibilityDelegate v1 = arg1 == null ? null : arg1.getBridge();
        arg0.setAccessibilityDelegate(v1);
    }

    public static void setAccessibilityLiveRegion(@NonNull View arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            arg2.setAccessibilityLiveRegion(arg3);
        }
    }

    @Deprecated public static void setActivated(View arg0, boolean arg1) {
        arg0.setActivated(arg1);
    }

    @Deprecated public static void setAlpha(View arg0, @FloatRange(from=0, to=1) float arg1) {
        arg0.setAlpha(arg1);
    }

    public static void setAutofillHints(@NonNull View arg2, @Nullable String[] arg3) {
        if(Build$VERSION.SDK_INT >= 26) {
            arg2.setAutofillHints(arg3);
        }
    }

    public static void setBackground(@NonNull View arg2, @Nullable Drawable arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            arg2.setBackground(arg3);
        }
        else {
            arg2.setBackgroundDrawable(arg3);
        }
    }

    public static void setBackgroundTintList(@NonNull View arg2, ColorStateList arg3) {
        int v1 = 21;
        if(Build$VERSION.SDK_INT >= v1) {
            arg2.setBackgroundTintList(arg3);
            if(Build$VERSION.SDK_INT == v1) {
                Drawable v3 = arg2.getBackground();
                int v0 = arg2.getBackgroundTintList() != null || arg2.getBackgroundTintMode() != null ? 1 : 0;
                if(v3 == null) {
                    return;
                }

                if(v0 == 0) {
                    return;
                }

                if(v3.isStateful()) {
                    v3.setState(arg2.getDrawableState());
                }

                arg2.setBackground(v3);
            }
        }
        else {
            if(!(arg2 instanceof TintableBackgroundView)) {
                return;
            }

            ((TintableBackgroundView)arg2).setSupportBackgroundTintList(arg3);
        }
    }

    public static void setBackgroundTintMode(@NonNull View arg2, PorterDuff$Mode arg3) {
        int v1 = 21;
        if(Build$VERSION.SDK_INT >= v1) {
            arg2.setBackgroundTintMode(arg3);
            if(Build$VERSION.SDK_INT == v1) {
                Drawable v3 = arg2.getBackground();
                int v0 = arg2.getBackgroundTintList() != null || arg2.getBackgroundTintMode() != null ? 1 : 0;
                if(v3 == null) {
                    return;
                }

                if(v0 == 0) {
                    return;
                }

                if(v3.isStateful()) {
                    v3.setState(arg2.getDrawableState());
                }

                arg2.setBackground(v3);
            }
        }
        else {
            if(!(arg2 instanceof TintableBackgroundView)) {
                return;
            }

            ((TintableBackgroundView)arg2).setSupportBackgroundTintMode(arg3);
        }
    }

    @Deprecated public static void setChildrenDrawingOrderEnabled(ViewGroup arg6, boolean arg7) {
        if(ViewCompat.sChildrenDrawingOrderMethod != null) {
            goto label_18;
        }

        try {
            ViewCompat.sChildrenDrawingOrderMethod = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
        }
        catch(NoSuchMethodException v0) {
            Log.e("ViewCompat", "Unable to find childrenDrawingOrderEnabled", ((Throwable)v0));
        }

        ViewCompat.sChildrenDrawingOrderMethod.setAccessible(true);
        try {
        label_18:
            ViewCompat.sChildrenDrawingOrderMethod.invoke(arg6, Boolean.valueOf(arg7));
        }
        catch(InvocationTargetException v6) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", ((Throwable)v6));
        }
        catch(IllegalArgumentException v6_1) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", ((Throwable)v6_1));
        }
        catch(IllegalAccessException v6_2) {
            Log.e("ViewCompat", "Unable to invoke childrenDrawingOrderEnabled", ((Throwable)v6_2));
        }
    }

    public static void setClipBounds(@NonNull View arg2, Rect arg3) {
        if(Build$VERSION.SDK_INT >= 18) {
            arg2.setClipBounds(arg3);
        }
    }

    public static void setElevation(@NonNull View arg2, float arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setElevation(arg3);
        }
    }

    @Deprecated public static void setFitsSystemWindows(View arg0, boolean arg1) {
        arg0.setFitsSystemWindows(arg1);
    }

    public static void setFocusedByDefault(@NonNull View arg2, boolean arg3) {
        if(Build$VERSION.SDK_INT >= 26) {
            arg2.setFocusedByDefault(arg3);
        }
    }

    public static void setHasTransientState(@NonNull View arg2, boolean arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            arg2.setHasTransientState(arg3);
        }
    }

    public static void setImportantForAccessibility(@NonNull View arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            arg2.setImportantForAccessibility(arg3);
        }
        else if(Build$VERSION.SDK_INT >= 16) {
            if(arg3 == 4) {
                arg3 = 2;
            }

            arg2.setImportantForAccessibility(arg3);
        }
    }

    public static void setImportantForAutofill(@NonNull View arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 26) {
            arg2.setImportantForAutofill(arg3);
        }
    }

    public static void setKeyboardNavigationCluster(@NonNull View arg2, boolean arg3) {
        if(Build$VERSION.SDK_INT >= 26) {
            arg2.setKeyboardNavigationCluster(arg3);
        }
    }

    public static void setLabelFor(@NonNull View arg2, @IdRes int arg3) {
        if(Build$VERSION.SDK_INT >= 17) {
            arg2.setLabelFor(arg3);
        }
    }

    public static void setLayerPaint(@NonNull View arg2, Paint arg3) {
        if(Build$VERSION.SDK_INT >= 17) {
            arg2.setLayerPaint(arg3);
        }
        else {
            arg2.setLayerType(arg2.getLayerType(), arg3);
            arg2.invalidate();
        }
    }

    @Deprecated public static void setLayerType(View arg0, int arg1, Paint arg2) {
        arg0.setLayerType(arg1, arg2);
    }

    public static void setLayoutDirection(@NonNull View arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 17) {
            arg2.setLayoutDirection(arg3);
        }
    }

    public static void setNestedScrollingEnabled(@NonNull View arg2, boolean arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setNestedScrollingEnabled(arg3);
        }
        else if((arg2 instanceof NestedScrollingChild)) {
            ((NestedScrollingChild)arg2).setNestedScrollingEnabled(arg3);
        }
    }

    public static void setNextClusterForwardId(@NonNull View arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 26) {
            arg2.setNextClusterForwardId(arg3);
        }
    }

    public static void setOnApplyWindowInsetsListener(@NonNull View arg2, OnApplyWindowInsetsListener arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            if(arg3 == null) {
                arg2.setOnApplyWindowInsetsListener(null);
                return;
            }
            else {
                arg2.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListener(arg3) {
                    public WindowInsets onApplyWindowInsets(View arg2, WindowInsets arg3) {
                        return WindowInsetsCompat.unwrap(this.val$listener.onApplyWindowInsets(arg2, WindowInsetsCompat.wrap(arg3)));
                    }
                });
            }
        }
    }

    @Deprecated public static void setOverScrollMode(View arg0, int arg1) {
        arg0.setOverScrollMode(arg1);
    }

    public static void setPaddingRelative(@NonNull View arg2, @Px int arg3, @Px int arg4, @Px int arg5, @Px int arg6) {
        if(Build$VERSION.SDK_INT >= 17) {
            arg2.setPaddingRelative(arg3, arg4, arg5, arg6);
        }
        else {
            arg2.setPadding(arg3, arg4, arg5, arg6);
        }
    }

    @Deprecated public static void setPivotX(View arg0, float arg1) {
        arg0.setPivotX(arg1);
    }

    @Deprecated public static void setPivotY(View arg0, float arg1) {
        arg0.setPivotY(arg1);
    }

    public static void setPointerIcon(@NonNull View arg2, PointerIconCompat arg3) {
        Object v3;
        if(Build$VERSION.SDK_INT >= 24) {
            if(arg3 != null) {
                v3 = arg3.getPointerIcon();
            }
            else {
                PointerIcon v3_1 = null;
            }

            arg2.setPointerIcon(((PointerIcon)v3));
        }
    }

    @Deprecated public static void setRotation(View arg0, float arg1) {
        arg0.setRotation(arg1);
    }

    @Deprecated public static void setRotationX(View arg0, float arg1) {
        arg0.setRotationX(arg1);
    }

    @Deprecated public static void setRotationY(View arg0, float arg1) {
        arg0.setRotationY(arg1);
    }

    @Deprecated public static void setSaveFromParentEnabled(View arg0, boolean arg1) {
        arg0.setSaveFromParentEnabled(arg1);
    }

    @Deprecated public static void setScaleX(View arg0, float arg1) {
        arg0.setScaleX(arg1);
    }

    @Deprecated public static void setScaleY(View arg0, float arg1) {
        arg0.setScaleY(arg1);
    }

    public static void setScrollIndicators(@NonNull View arg2, int arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 23) {
            arg2.setScrollIndicators(arg3, arg4);
        }
    }

    public static void setScrollIndicators(@NonNull View arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 23) {
            arg2.setScrollIndicators(arg3);
        }
    }

    public static void setTooltipText(@NonNull View arg2, @Nullable CharSequence arg3) {
        if(Build$VERSION.SDK_INT >= 26) {
            arg2.setTooltipText(arg3);
        }
    }

    public static void setTransitionName(@NonNull View arg2, String arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setTransitionName(arg3);
        }
        else {
            if(ViewCompat.sTransitionNameMap == null) {
                ViewCompat.sTransitionNameMap = new WeakHashMap();
            }

            ViewCompat.sTransitionNameMap.put(arg2, arg3);
        }
    }

    @Deprecated public static void setTranslationX(View arg0, float arg1) {
        arg0.setTranslationX(arg1);
    }

    @Deprecated public static void setTranslationY(View arg0, float arg1) {
        arg0.setTranslationY(arg1);
    }

    public static void setTranslationZ(@NonNull View arg2, float arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setTranslationZ(arg3);
        }
    }

    @Deprecated public static void setX(View arg0, float arg1) {
        arg0.setX(arg1);
    }

    @Deprecated public static void setY(View arg0, float arg1) {
        arg0.setY(arg1);
    }

    public static void setZ(@NonNull View arg2, float arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.setZ(arg3);
        }
    }

    public static boolean startDragAndDrop(@NonNull View arg2, ClipData arg3, View$DragShadowBuilder arg4, Object arg5, int arg6) {
        if(Build$VERSION.SDK_INT >= 24) {
            return arg2.startDragAndDrop(arg3, arg4, arg5, arg6);
        }

        return arg2.startDrag(arg3, arg4, arg5, arg6);
    }

    public static boolean startNestedScroll(@NonNull View arg2, int arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            return arg2.startNestedScroll(arg3);
        }

        if((arg2 instanceof NestedScrollingChild)) {
            return ((NestedScrollingChild)arg2).startNestedScroll(arg3);
        }

        return 0;
    }

    public static boolean startNestedScroll(@NonNull View arg1, int arg2, int arg3) {
        if((arg1 instanceof NestedScrollingChild2)) {
            return ((NestedScrollingChild2)arg1).startNestedScroll(arg2, arg3);
        }

        if(arg3 == 0) {
            return ViewCompat.startNestedScroll(arg1, arg2);
        }

        return 0;
    }

    public static void stopNestedScroll(@NonNull View arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.stopNestedScroll();
        }
        else if((arg2 instanceof NestedScrollingChild)) {
            ((NestedScrollingChild)arg2).stopNestedScroll();
        }
    }

    public static void stopNestedScroll(@NonNull View arg1, int arg2) {
        if((arg1 instanceof NestedScrollingChild2)) {
            ((NestedScrollingChild2)arg1).stopNestedScroll(arg2);
        }
        else if(arg2 == 0) {
            ViewCompat.stopNestedScroll(arg1);
        }
    }

    private static void tickleInvalidationFlag(View arg2) {
        float v0 = arg2.getTranslationY();
        arg2.setTranslationY(1f + v0);
        arg2.setTranslationY(v0);
    }

    public static void updateDragShadow(@NonNull View arg2, View$DragShadowBuilder arg3) {
        if(Build$VERSION.SDK_INT >= 24) {
            arg2.updateDragShadow(arg3);
        }
    }
}

