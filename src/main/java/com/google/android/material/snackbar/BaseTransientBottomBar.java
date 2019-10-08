package com.google.android.material.snackbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Handler$Callback;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.IntRange;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat$TouchExplorationStateChangeListener;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$layout;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.SwipeDismissBehavior$OnDismissListener;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.ThemeEnforcement;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;

public abstract class BaseTransientBottomBar {
    final class com.google.android.material.snackbar.BaseTransientBottomBar$1 implements Handler$Callback {
        com.google.android.material.snackbar.BaseTransientBottomBar$1() {
            super();
        }

        public boolean handleMessage(Message arg3) {
            switch(arg3.what) {
                case 0: {
                    goto label_9;
                }
                case 1: {
                    goto label_5;
                }
            }

            return 0;
        label_5:
            arg3.obj.hideView(arg3.arg1);
            return 1;
        label_9:
            arg3.obj.showView();
            return 1;
        }
    }

    class com.google.android.material.snackbar.BaseTransientBottomBar$4 implements Callback {
        com.google.android.material.snackbar.BaseTransientBottomBar$4(BaseTransientBottomBar arg1) {
            BaseTransientBottomBar.this = arg1;
            super();
        }

        public void dismiss(int arg6) {
            BaseTransientBottomBar.handler.sendMessage(BaseTransientBottomBar.handler.obtainMessage(1, arg6, 0, BaseTransientBottomBar.this));
        }

        public void show() {
            BaseTransientBottomBar.handler.sendMessage(BaseTransientBottomBar.handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    public abstract class BaseCallback {
        @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface DismissEvent {
        }

        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        public BaseCallback() {
            super();
        }

        public void onDismissed(Object arg1, int arg2) {
        }

        public void onShown(Object arg1) {
        }
    }

    public class Behavior extends SwipeDismissBehavior {
        private final BehaviorDelegate delegate;

        public Behavior() {
            super();
            this.delegate = new BehaviorDelegate(((SwipeDismissBehavior)this));
        }

        static void access$000(Behavior arg0, BaseTransientBottomBar arg1) {
            arg0.setBaseTransientBottomBar(arg1);
        }

        public boolean canSwipeDismissView(View arg2) {
            return this.delegate.canSwipeDismissView(arg2);
        }

        public boolean onInterceptTouchEvent(CoordinatorLayout arg2, View arg3, MotionEvent arg4) {
            this.delegate.onInterceptTouchEvent(arg2, arg3, arg4);
            return super.onInterceptTouchEvent(arg2, arg3, arg4);
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar arg2) {
            this.delegate.setBaseTransientBottomBar(arg2);
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public class BehaviorDelegate {
        private Callback managerCallback;

        public BehaviorDelegate(SwipeDismissBehavior arg2) {
            super();
            arg2.setStartAlphaSwipeDistance(0.1f);
            arg2.setEndAlphaSwipeDistance(0.6f);
            arg2.setSwipeDirection(0);
        }

        public boolean canSwipeDismissView(View arg1) {
            return arg1 instanceof SnackbarBaseLayout;
        }

        public void onInterceptTouchEvent(CoordinatorLayout arg3, View arg4, MotionEvent arg5) {
            int v0 = arg5.getActionMasked();
            if(v0 != 3) {
                switch(v0) {
                    case 0: {
                        goto label_5;
                    }
                    case 1: {
                        goto label_15;
                    }
                }

                return;
            label_5:
                if(arg3.isPointInChildBounds(arg4, ((int)arg5.getX()), ((int)arg5.getY()))) {
                    SnackbarManager.getInstance().pauseTimeout(this.managerCallback);
                }
            }
            else {
            label_15:
                SnackbarManager.getInstance().restoreTimeoutIfPaused(this.managerCallback);
            }
        }

        public void setBaseTransientBottomBar(BaseTransientBottomBar arg1) {
            this.managerCallback = arg1.managerCallback;
        }
    }

    @Deprecated public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    @IntRange(from=1) @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface Duration {
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public interface OnAttachStateChangeListener {
        void onViewAttachedToWindow(View arg1);

        void onViewDetachedFromWindow(View arg1);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public interface OnLayoutChangeListener {
        void onLayoutChange(View arg1, int arg2, int arg3, int arg4, int arg5);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public class SnackbarBaseLayout extends FrameLayout {
        private final AccessibilityManager accessibilityManager;
        private OnAttachStateChangeListener onAttachStateChangeListener;
        private OnLayoutChangeListener onLayoutChangeListener;
        private final TouchExplorationStateChangeListener touchExplorationStateChangeListener;

        protected SnackbarBaseLayout(Context arg2) {
            this(arg2, null);
        }

        protected SnackbarBaseLayout(Context arg3, AttributeSet arg4) {
            super(arg3, arg4);
            TypedArray v4 = arg3.obtainStyledAttributes(arg4, R$styleable.SnackbarLayout);
            if(v4.hasValue(R$styleable.SnackbarLayout_elevation)) {
                ViewCompat.setElevation(((View)this), ((float)v4.getDimensionPixelSize(R$styleable.SnackbarLayout_elevation, 0)));
            }

            v4.recycle();
            this.accessibilityManager = arg3.getSystemService("accessibility");
            this.touchExplorationStateChangeListener = new TouchExplorationStateChangeListener() {
                public void onTouchExplorationStateChanged(boolean arg2) {
                    SnackbarBaseLayout.access$300(SnackbarBaseLayout.this, arg2);
                }
            };
            AccessibilityManagerCompat.addTouchExplorationStateChangeListener(this.accessibilityManager, this.touchExplorationStateChangeListener);
            this.setClickableOrFocusableBasedOnAccessibility(this.accessibilityManager.isTouchExplorationEnabled());
        }

        static void access$300(SnackbarBaseLayout arg0, boolean arg1) {
            arg0.setClickableOrFocusableBasedOnAccessibility(arg1);
        }

        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if(this.onAttachStateChangeListener != null) {
                this.onAttachStateChangeListener.onViewAttachedToWindow(((View)this));
            }

            ViewCompat.requestApplyInsets(((View)this));
        }

        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if(this.onAttachStateChangeListener != null) {
                this.onAttachStateChangeListener.onViewDetachedFromWindow(((View)this));
            }

            AccessibilityManagerCompat.removeTouchExplorationStateChangeListener(this.accessibilityManager, this.touchExplorationStateChangeListener);
        }

        protected void onLayout(boolean arg7, int arg8, int arg9, int arg10, int arg11) {
            super.onLayout(arg7, arg8, arg9, arg10, arg11);
            if(this.onLayoutChangeListener != null) {
                this.onLayoutChangeListener.onLayoutChange(this, arg8, arg9, arg10, arg11);
            }
        }

        private void setClickableOrFocusableBasedOnAccessibility(boolean arg2) {
            this.setClickable((((int)arg2)) ^ 1);
            this.setFocusable(arg2);
        }

        void setOnAttachStateChangeListener(OnAttachStateChangeListener arg1) {
            this.onAttachStateChangeListener = arg1;
        }

        void setOnLayoutChangeListener(OnLayoutChangeListener arg1) {
            this.onLayoutChangeListener = arg1;
        }
    }

    static final int ANIMATION_DURATION = 0xFA;
    static final int ANIMATION_FADE_DURATION = 180;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    static final int MSG_DISMISS = 1;
    static final int MSG_SHOW;
    private static final int[] SNACKBAR_STYLE_ATTR;
    private static final boolean USE_OFFSET_API;
    private final AccessibilityManager accessibilityManager;
    private Behavior behavior;
    private List callbacks;
    private final com.google.android.material.snackbar.ContentViewCallback contentViewCallback;
    private final Context context;
    private int duration;
    static final Handler handler;
    final Callback managerCallback;
    private final ViewGroup targetParent;
    protected final SnackbarBaseLayout view;

    static {
        boolean v0 = Build$VERSION.SDK_INT < 16 || Build$VERSION.SDK_INT > 19 ? false : true;
        BaseTransientBottomBar.USE_OFFSET_API = v0;
        BaseTransientBottomBar.SNACKBAR_STYLE_ATTR = new int[]{R$attr.snackbarStyle};
        BaseTransientBottomBar.handler = new Handler(Looper.getMainLooper(), new com.google.android.material.snackbar.BaseTransientBottomBar$1());
    }

    protected BaseTransientBottomBar(@NonNull ViewGroup arg3, @NonNull View arg4, @NonNull com.google.android.material.snackbar.ContentViewCallback arg5) {
        super();
        this.managerCallback = new com.google.android.material.snackbar.BaseTransientBottomBar$4(this);
        if(arg3 != null) {
            if(arg4 != null) {
                if(arg5 != null) {
                    this.targetParent = arg3;
                    this.contentViewCallback = arg5;
                    this.context = arg3.getContext();
                    ThemeEnforcement.checkAppCompatTheme(this.context);
                    this.view = LayoutInflater.from(this.context).inflate(this.getSnackbarBaseLayoutResId(), this.targetParent, false);
                    this.view.addView(arg4);
                    ViewCompat.setAccessibilityLiveRegion(this.view, 1);
                    ViewCompat.setImportantForAccessibility(this.view, 1);
                    ViewCompat.setFitsSystemWindows(this.view, true);
                    ViewCompat.setOnApplyWindowInsetsListener(this.view, new OnApplyWindowInsetsListener() {
                        public WindowInsetsCompat onApplyWindowInsets(View arg5, WindowInsetsCompat arg6) {
                            arg5.setPadding(arg5.getPaddingLeft(), arg5.getPaddingTop(), arg5.getPaddingRight(), arg6.getSystemWindowInsetBottom());
                            return arg6;
                        }
                    });
                    ViewCompat.setAccessibilityDelegate(this.view, new AccessibilityDelegateCompat() {
                        public void onInitializeAccessibilityNodeInfo(View arg1, AccessibilityNodeInfoCompat arg2) {
                            super.onInitializeAccessibilityNodeInfo(arg1, arg2);
                            arg2.addAction(0x100000);
                            arg2.setDismissable(true);
                        }

                        public boolean performAccessibilityAction(View arg2, int arg3, Bundle arg4) {
                            if(arg3 == 0x100000) {
                                BaseTransientBottomBar.this.dismiss();
                                return 1;
                            }

                            return super.performAccessibilityAction(arg2, arg3, arg4);
                        }
                    });
                    this.accessibilityManager = this.context.getSystemService("accessibility");
                    return;
                }

                throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
            }

            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }

        throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
    }

    static com.google.android.material.snackbar.ContentViewCallback access$100(BaseTransientBottomBar arg0) {
        return arg0.contentViewCallback;
    }

    static boolean access$200() {
        return BaseTransientBottomBar.USE_OFFSET_API;
    }

    @NonNull public BaseTransientBottomBar addCallback(@NonNull BaseCallback arg2) {
        if(arg2 == null) {
            return this;
        }

        if(this.callbacks == null) {
            this.callbacks = new ArrayList();
        }

        this.callbacks.add(arg2);
        return this;
    }

    void animateViewIn() {
        int v0 = this.getTranslationYBottom();
        if(BaseTransientBottomBar.USE_OFFSET_API) {
            ViewCompat.offsetTopAndBottom(this.view, v0);
        }
        else {
            this.view.setTranslationY(((float)v0));
        }

        ValueAnimator v1 = new ValueAnimator();
        v1.setIntValues(new int[]{v0, 0});
        v1.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        v1.setDuration(0xFA);
        v1.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator arg1) {
                BaseTransientBottomBar.this.onViewShown();
            }

            public void onAnimationStart(Animator arg3) {
                BaseTransientBottomBar.this.contentViewCallback.animateContentIn(70, 180);
            }
        });
        v1.addUpdateListener(new ValueAnimator$AnimatorUpdateListener(v0) {
            private int previousAnimatedIntValue;

            public void onAnimationUpdate(ValueAnimator arg3) {
                int v3 = arg3.getAnimatedValue().intValue();
                if(BaseTransientBottomBar.USE_OFFSET_API) {
                    ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.view, v3 - this.previousAnimatedIntValue);
                }
                else {
                    BaseTransientBottomBar.this.view.setTranslationY(((float)v3));
                }

                this.previousAnimatedIntValue = v3;
            }
        });
        v1.start();
    }

    private void animateViewOut(int arg5) {
        ValueAnimator v0 = new ValueAnimator();
        v0.setIntValues(new int[]{0, this.getTranslationYBottom()});
        v0.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
        v0.setDuration(0xFA);
        v0.addListener(new AnimatorListenerAdapter(arg5) {
            public void onAnimationEnd(Animator arg2) {
                BaseTransientBottomBar.this.onViewHidden(this.val$event);
            }

            public void onAnimationStart(Animator arg3) {
                BaseTransientBottomBar.this.contentViewCallback.animateContentOut(0, 180);
            }
        });
        v0.addUpdateListener(new ValueAnimator$AnimatorUpdateListener() {
            private int previousAnimatedIntValue;

            public void onAnimationUpdate(ValueAnimator arg3) {
                int v3 = arg3.getAnimatedValue().intValue();
                if(BaseTransientBottomBar.USE_OFFSET_API) {
                    ViewCompat.offsetTopAndBottom(BaseTransientBottomBar.this.view, v3 - this.previousAnimatedIntValue);
                }
                else {
                    BaseTransientBottomBar.this.view.setTranslationY(((float)v3));
                }

                this.previousAnimatedIntValue = v3;
            }
        });
        v0.start();
    }

    public void dismiss() {
        this.dispatchDismiss(3);
    }

    protected void dispatchDismiss(int arg3) {
        SnackbarManager.getInstance().dismiss(this.managerCallback, arg3);
    }

    public Behavior getBehavior() {
        return this.behavior;
    }

    @NonNull public Context getContext() {
        return this.context;
    }

    public int getDuration() {
        return this.duration;
    }

    protected SwipeDismissBehavior getNewBehavior() {
        return new Behavior();
    }

    @LayoutRes protected int getSnackbarBaseLayoutResId() {
        int v0 = this.hasSnackbarStyleAttr() ? R$layout.mtrl_layout_snackbar : R$layout.design_layout_snackbar;
        return v0;
    }

    private int getTranslationYBottom() {
        int v0 = this.view.getHeight();
        ViewGroup$LayoutParams v1 = this.view.getLayoutParams();
        if((v1 instanceof ViewGroup$MarginLayoutParams)) {
            v0 += ((ViewGroup$MarginLayoutParams)v1).bottomMargin;
        }

        return v0;
    }

    @NonNull public View getView() {
        return this.view;
    }

    protected boolean hasSnackbarStyleAttr() {
        TypedArray v0 = this.context.obtainStyledAttributes(BaseTransientBottomBar.SNACKBAR_STYLE_ATTR);
        boolean v2 = false;
        int v3 = v0.getResourceId(0, -1);
        v0.recycle();
        if(v3 != -1) {
            v2 = true;
        }

        return v2;
    }

    final void hideView(int arg2) {
        if(!this.shouldAnimate() || this.view.getVisibility() != 0) {
            this.onViewHidden(arg2);
        }
        else {
            this.animateViewOut(arg2);
        }
    }

    public boolean isShown() {
        return SnackbarManager.getInstance().isCurrent(this.managerCallback);
    }

    public boolean isShownOrQueued() {
        return SnackbarManager.getInstance().isCurrentOrNext(this.managerCallback);
    }

    void onViewHidden(int arg3) {
        SnackbarManager.getInstance().onDismissed(this.managerCallback);
        if(this.callbacks != null) {
            int v0;
            for(v0 = this.callbacks.size() - 1; v0 >= 0; --v0) {
                this.callbacks.get(v0).onDismissed(this, arg3);
            }
        }

        ViewParent v3 = this.view.getParent();
        if((v3 instanceof ViewGroup)) {
            ((ViewGroup)v3).removeView(this.view);
        }
    }

    void onViewShown() {
        SnackbarManager.getInstance().onShown(this.managerCallback);
        if(this.callbacks != null) {
            int v0;
            for(v0 = this.callbacks.size() - 1; v0 >= 0; --v0) {
                this.callbacks.get(v0).onShown(this);
            }
        }
    }

    @NonNull public BaseTransientBottomBar removeCallback(@NonNull BaseCallback arg2) {
        if(arg2 == null) {
            return this;
        }

        if(this.callbacks == null) {
            return this;
        }

        this.callbacks.remove(arg2);
        return this;
    }

    public BaseTransientBottomBar setBehavior(Behavior arg1) {
        this.behavior = arg1;
        return this;
    }

    @NonNull public BaseTransientBottomBar setDuration(int arg1) {
        this.duration = arg1;
        return this;
    }

    boolean shouldAnimate() {
        boolean v1 = true;
        List v0 = this.accessibilityManager.getEnabledAccessibilityServiceList(1);
        if(v0 == null || !v0.isEmpty()) {
            v1 = false;
        }
        else {
        }

        return v1;
    }

    public void show() {
        SnackbarManager.getInstance().show(this.getDuration(), this.managerCallback);
    }

    final void showView() {
        Behavior v1_1;
        if(this.view.getParent() == null) {
            ViewGroup$LayoutParams v0 = this.view.getLayoutParams();
            if((v0 instanceof LayoutParams)) {
                if(this.behavior == null) {
                    SwipeDismissBehavior v1 = this.getNewBehavior();
                }
                else {
                    v1_1 = this.behavior;
                }

                if(((((SwipeDismissBehavior)v1_1)) instanceof Behavior)) {
                    Behavior.access$000(((SwipeDismissBehavior)v1_1), this);
                }

                ((SwipeDismissBehavior)v1_1).setListener(new OnDismissListener() {
                    public void onDismiss(View arg2) {
                        arg2.setVisibility(8);
                        BaseTransientBottomBar.this.dispatchDismiss(0);
                    }

                    public void onDragStateChanged(int arg2) {
                        switch(arg2) {
                            case 0: {
                                SnackbarManager.getInstance().restoreTimeoutIfPaused(BaseTransientBottomBar.this.managerCallback);
                                break;
                            }
                            case 1: 
                            case 2: {
                                SnackbarManager.getInstance().pauseTimeout(BaseTransientBottomBar.this.managerCallback);
                                break;
                            }
                            default: {
                                break;
                            }
                        }
                    }
                });
                ((LayoutParams)v0).setBehavior(((androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior)v1_1));
                ((LayoutParams)v0).insetEdge = 80;
            }

            this.targetParent.addView(this.view);
        }

        this.view.setOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            public void onViewAttachedToWindow(View arg1) {
            }

            public void onViewDetachedFromWindow(View arg2) {
                if(BaseTransientBottomBar.this.isShownOrQueued()) {
                    BaseTransientBottomBar.handler.post(new Runnable() {
                        public void run() {
                            this.this$1.this$0.onViewHidden(3);
                        }
                    });
                }
            }
        });
        if(!ViewCompat.isLaidOut(this.view)) {
            this.view.setOnLayoutChangeListener(new OnLayoutChangeListener() {
                public void onLayoutChange(View arg1, int arg2, int arg3, int arg4, int arg5) {
                    BaseTransientBottomBar.this.view.setOnLayoutChangeListener(null);
                    if(BaseTransientBottomBar.this.shouldAnimate()) {
                        BaseTransientBottomBar.this.animateViewIn();
                    }
                    else {
                        BaseTransientBottomBar.this.onViewShown();
                    }
                }
            });
        }
        else if(this.shouldAnimate()) {
            this.animateViewIn();
        }
        else {
            this.onViewShown();
        }
    }
}

