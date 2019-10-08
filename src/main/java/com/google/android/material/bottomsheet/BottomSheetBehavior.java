package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper$Callback;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public class BottomSheetBehavior extends Behavior {
    class com.google.android.material.bottomsheet.BottomSheetBehavior$2 extends Callback {
        com.google.android.material.bottomsheet.BottomSheetBehavior$2(BottomSheetBehavior arg1) {
            BottomSheetBehavior.this = arg1;
            super();
        }

        public int clampViewPositionHorizontal(@NonNull View arg1, int arg2, int arg3) {
            return arg1.getLeft();
        }

        public int clampViewPositionVertical(@NonNull View arg1, int arg2, int arg3) {
            int v1 = BottomSheetBehavior.this.getExpandedOffset();
            arg3 = BottomSheetBehavior.this.hideable ? BottomSheetBehavior.this.parentHeight : BottomSheetBehavior.this.collapsedOffset;
            return MathUtils.clamp(arg2, v1, arg3);
        }

        public int getViewVerticalDragRange(@NonNull View arg1) {
            if(BottomSheetBehavior.this.hideable) {
                return BottomSheetBehavior.this.parentHeight;
            }

            return BottomSheetBehavior.this.collapsedOffset;
        }

        public void onViewDragStateChanged(int arg2) {
            if(arg2 == 1) {
                BottomSheetBehavior.this.setStateInternal(1);
            }
        }

        public void onViewPositionChanged(@NonNull View arg1, int arg2, int arg3, int arg4, int arg5) {
            BottomSheetBehavior.this.dispatchOnSlide(arg3);
        }

        public void onViewReleased(@NonNull View arg8, float arg9, float arg10) {
            int v0;
            int v9;
            int v2 = 4;
            if(arg10 >= 0f) {
                if((BottomSheetBehavior.this.hideable) && (BottomSheetBehavior.this.shouldHide(arg8, arg10)) && (arg8.getTop() > BottomSheetBehavior.this.collapsedOffset || Math.abs(arg9) < Math.abs(arg10))) {
                    v9 = BottomSheetBehavior.this.parentHeight;
                    v2 = 5;
                    goto label_97;
                }

                if(arg10 != 0f) {
                    if(Math.abs(arg9) > Math.abs(arg10)) {
                    }
                    else {
                        v9 = BottomSheetBehavior.this.collapsedOffset;
                        goto label_97;
                    }
                }

                v9 = arg8.getTop();
                if(BottomSheetBehavior.this.fitToContents) {
                    if(Math.abs(v9 - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(v9 - BottomSheetBehavior.this.collapsedOffset)) {
                        v9 = BottomSheetBehavior.this.fitToContentsOffset;
                        goto label_11;
                    }
                    else {
                        v0 = BottomSheetBehavior.this.collapsedOffset;
                    }
                }
                else if(v9 < BottomSheetBehavior.this.halfExpandedOffset) {
                    if(v9 < Math.abs(v9 - BottomSheetBehavior.this.collapsedOffset)) {
                    label_22:
                        v9 = 0;
                    label_11:
                        v2 = 3;
                        goto label_97;
                    }
                    else {
                        v0 = BottomSheetBehavior.this.halfExpandedOffset;
                        goto label_19;
                    }
                }
                else if(Math.abs(v9 - BottomSheetBehavior.this.halfExpandedOffset) < Math.abs(v9 - BottomSheetBehavior.this.collapsedOffset)) {
                    v0 = BottomSheetBehavior.this.halfExpandedOffset;
                label_19:
                    v9 = v0;
                    v2 = 6;
                    goto label_97;
                }
                else {
                    v0 = BottomSheetBehavior.this.collapsedOffset;
                }

                v9 = v0;
            }
            else if(BottomSheetBehavior.this.fitToContents) {
                v9 = BottomSheetBehavior.this.fitToContentsOffset;
                goto label_11;
            }
            else if(arg8.getTop() > BottomSheetBehavior.this.halfExpandedOffset) {
                v0 = BottomSheetBehavior.this.halfExpandedOffset;
                goto label_19;
            }
            else {
                goto label_22;
            }

        label_97:
            if(BottomSheetBehavior.this.viewDragHelper.settleCapturedViewAt(arg8.getLeft(), v9)) {
                BottomSheetBehavior.this.setStateInternal(2);
                ViewCompat.postOnAnimation(arg8, new SettleRunnable(BottomSheetBehavior.this, arg8, v2));
            }
            else {
                BottomSheetBehavior.this.setStateInternal(v2);
            }
        }

        public boolean tryCaptureView(@NonNull View arg5, int arg6) {
            boolean v1 = true;
            if(BottomSheetBehavior.this.state == 1) {
                return 0;
            }

            if(BottomSheetBehavior.this.touchingScrollingChild) {
                return 0;
            }

            if(BottomSheetBehavior.this.state == 3 && BottomSheetBehavior.this.activePointerId == arg6) {
                Object v6 = BottomSheetBehavior.this.nestedScrollingChildRef.get();
                if(v6 != null && (((View)v6).canScrollVertically(-1))) {
                    return 0;
                }
            }

            if(BottomSheetBehavior.this.viewRef == null || BottomSheetBehavior.this.viewRef.get() != arg5) {
                v1 = false;
            }
            else {
            }

            return v1;
        }
    }

    public abstract class BottomSheetCallback {
        public BottomSheetCallback() {
            super();
        }

        public abstract void onSlide(@NonNull View arg1, float arg2);

        public abstract void onStateChanged(@NonNull View arg1, int arg2);
    }

    public class SavedState extends AbsSavedState {
        final class com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1 implements Parcelable$ClassLoaderCreator {
            com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1() {
                super();
            }

            public SavedState createFromParcel(Parcel arg3) {
                return new SavedState(arg3, null);
            }

            public SavedState createFromParcel(Parcel arg2, ClassLoader arg3) {
                return new SavedState(arg2, arg3);
            }

            public Object createFromParcel(Parcel arg1) {
                return this.createFromParcel(arg1);
            }

            public Object createFromParcel(Parcel arg1, ClassLoader arg2) {
                return this.createFromParcel(arg1, arg2);
            }

            public SavedState[] newArray(int arg1) {
                return new SavedState[arg1];
            }

            public Object[] newArray(int arg1) {
                return this.newArray(arg1);
            }
        }

        public static final Parcelable$Creator CREATOR;
        final int state;

        static {
            SavedState.CREATOR = new com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1();
        }

        public SavedState(Parcelable arg1, int arg2) {
            super(arg1);
            this.state = arg2;
        }

        public SavedState(Parcel arg2) {
            this(arg2, null);
        }

        public SavedState(Parcel arg1, ClassLoader arg2) {
            super(arg1, arg2);
            this.state = arg1.readInt();
        }

        public void writeToParcel(Parcel arg1, int arg2) {
            super.writeToParcel(arg1, arg2);
            arg1.writeInt(this.state);
        }
    }

    class SettleRunnable implements Runnable {
        private final int targetState;
        private final View view;

        SettleRunnable(BottomSheetBehavior arg1, View arg2, int arg3) {
            BottomSheetBehavior.this = arg1;
            super();
            this.view = arg2;
            this.targetState = arg3;
        }

        public void run() {
            if(BottomSheetBehavior.this.viewDragHelper == null || !BottomSheetBehavior.this.viewDragHelper.continueSettling(true)) {
                BottomSheetBehavior.this.setStateInternal(this.targetState);
            }
            else {
                ViewCompat.postOnAnimation(this.view, ((Runnable)this));
            }
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface State {
    }

    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    int activePointerId;
    private BottomSheetCallback callback;
    int collapsedOffset;
    private final Callback dragCallback;
    private boolean fitToContents;
    int fitToContentsOffset;
    int halfExpandedOffset;
    boolean hideable;
    private boolean ignoreEvents;
    private Map importantForAccessibilityMap;
    private int initialY;
    private int lastNestedScrollDy;
    private int lastPeekHeight;
    private float maximumVelocity;
    private boolean nestedScrolled;
    WeakReference nestedScrollingChildRef;
    int parentHeight;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightMin;
    private boolean skipCollapsed;
    int state;
    boolean touchingScrollingChild;
    private VelocityTracker velocityTracker;
    ViewDragHelper viewDragHelper;
    WeakReference viewRef;

    public BottomSheetBehavior() {
        super();
        this.fitToContents = true;
        this.state = 4;
        this.dragCallback = new com.google.android.material.bottomsheet.BottomSheetBehavior$2(this);
    }

    public BottomSheetBehavior(Context arg5, AttributeSet arg6) {
        super(arg5, arg6);
        this.fitToContents = true;
        this.state = 4;
        this.dragCallback = new com.google.android.material.bottomsheet.BottomSheetBehavior$2(this);
        TypedArray v6 = arg5.obtainStyledAttributes(arg6, R$styleable.BottomSheetBehavior_Layout);
        TypedValue v1 = v6.peekValue(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight);
        int v2 = -1;
        if(v1 == null || v1.data != v2) {
            this.setPeekHeight(v6.getDimensionPixelSize(R$styleable.BottomSheetBehavior_Layout_behavior_peekHeight, v2));
        }
        else {
            this.setPeekHeight(v1.data);
        }

        this.setHideable(v6.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_hideable, false));
        this.setFitToContents(v6.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_fitToContents, true));
        this.setSkipCollapsed(v6.getBoolean(R$styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed, false));
        v6.recycle();
        this.maximumVelocity = ((float)ViewConfiguration.get(arg5).getScaledMaximumFlingVelocity());
    }

    static boolean access$000(BottomSheetBehavior arg0) {
        return arg0.fitToContents;
    }

    static int access$100(BottomSheetBehavior arg0) {
        return arg0.getExpandedOffset();
    }

    private void calculateCollapsedOffset() {
        this.collapsedOffset = this.fitToContents ? Math.max(this.parentHeight - this.lastPeekHeight, this.fitToContentsOffset) : this.parentHeight - this.lastPeekHeight;
    }

    void dispatchOnSlide(int arg5) {
        Object v0 = this.viewRef.get();
        if(v0 != null && this.callback != null) {
            if(arg5 > this.collapsedOffset) {
                this.callback.onSlide(((View)v0), (((float)(this.collapsedOffset - arg5))) / (((float)(this.parentHeight - this.collapsedOffset))));
            }
            else {
                this.callback.onSlide(((View)v0), (((float)(this.collapsedOffset - arg5))) / (((float)(this.collapsedOffset - this.getExpandedOffset()))));
            }
        }
    }

    @VisibleForTesting View findScrollingChild(View arg4) {
        if(ViewCompat.isNestedScrollingEnabled(arg4)) {
            return arg4;
        }

        if((arg4 instanceof ViewGroup)) {
            int v0 = 0;
            int v1 = ((ViewGroup)arg4).getChildCount();
            while(v0 < v1) {
                View v2 = this.findScrollingChild(((ViewGroup)arg4).getChildAt(v0));
                if(v2 != null) {
                    return v2;
                }
                else {
                    ++v0;
                    continue;
                }

                return null;
            }
        }

        return null;
    }

    public static BottomSheetBehavior from(View arg1) {
        ViewGroup$LayoutParams v1 = arg1.getLayoutParams();
        if((v1 instanceof LayoutParams)) {
            Behavior v1_1 = ((LayoutParams)v1).getBehavior();
            if((v1_1 instanceof BottomSheetBehavior)) {
                return ((BottomSheetBehavior)v1_1);
            }

            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }

        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int getExpandedOffset() {
        int v0 = this.fitToContents ? this.fitToContentsOffset : 0;
        return v0;
    }

    public final int getPeekHeight() {
        int v0 = this.peekHeightAuto ? -1 : this.peekHeight;
        return v0;
    }

    @VisibleForTesting int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public final int getState() {
        return this.state;
    }

    private float getYVelocity() {
        if(this.velocityTracker == null) {
            return 0;
        }

        this.velocityTracker.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout arg9, View arg10, MotionEvent arg11) {
        boolean v1 = false;
        if(!arg10.isShown()) {
            this.ignoreEvents = true;
            return 0;
        }

        int v0 = arg11.getActionMasked();
        if(v0 == 0) {
            this.reset();
        }

        if(this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }

        this.velocityTracker.addMovement(arg11);
        Object v4 = null;
        int v5 = -1;
        if(v0 != 3) {
            switch(v0) {
                case 0: {
                    goto label_21;
                }
                case 1: {
                    goto label_50;
                }
            }

            goto label_56;
        label_21:
            int v3 = ((int)arg11.getX());
            this.initialY = ((int)arg11.getY());
            Object v6 = this.nestedScrollingChildRef != null ? this.nestedScrollingChildRef.get() : v4;
            if(v6 != null && (arg9.isPointInChildBounds(((View)v6), v3, this.initialY))) {
                this.activePointerId = arg11.getPointerId(arg11.getActionIndex());
                this.touchingScrollingChild = true;
            }

            boolean v10 = this.activePointerId != v5 || (arg9.isPointInChildBounds(arg10, v3, this.initialY)) ? false : true;
            this.ignoreEvents = v10;
        }
        else {
        label_50:
            this.touchingScrollingChild = false;
            this.activePointerId = v5;
            if(!this.ignoreEvents) {
                goto label_56;
            }

            this.ignoreEvents = false;
            return 0;
        }

    label_56:
        if(!this.ignoreEvents && this.viewDragHelper != null && (this.viewDragHelper.shouldInterceptTouchEvent(arg11))) {
            return 1;
        }

        if(this.nestedScrollingChildRef != null) {
            v4 = this.nestedScrollingChildRef.get();
        }

        if(v0 == 2 && v4 != null && !this.ignoreEvents && this.state != 1 && !arg9.isPointInChildBounds(((View)v4), ((int)arg11.getX()), ((int)arg11.getY())) && this.viewDragHelper != null && Math.abs((((float)this.initialY)) - arg11.getY()) > (((float)this.viewDragHelper.getTouchSlop()))) {
            v1 = true;
        }

        return v1;
    }

    public boolean onLayoutChild(CoordinatorLayout arg5, View arg6, int arg7) {
        if((ViewCompat.getFitsSystemWindows(((View)arg5))) && !ViewCompat.getFitsSystemWindows(arg6)) {
            arg6.setFitsSystemWindows(true);
        }

        int v0 = arg6.getTop();
        arg5.onLayoutChild(arg6, arg7);
        this.parentHeight = arg5.getHeight();
        if(this.peekHeightAuto) {
            if(this.peekHeightMin == 0) {
                this.peekHeightMin = arg5.getResources().getDimensionPixelSize(R$dimen.design_bottom_sheet_peek_height_min);
            }

            this.lastPeekHeight = Math.max(this.peekHeightMin, this.parentHeight - arg5.getWidth() * 9 / 16);
        }
        else {
            this.lastPeekHeight = this.peekHeight;
        }

        this.fitToContentsOffset = Math.max(0, this.parentHeight - arg6.getHeight());
        int v2 = 2;
        this.halfExpandedOffset = this.parentHeight / v2;
        this.calculateCollapsedOffset();
        if(this.state == 3) {
            ViewCompat.offsetTopAndBottom(arg6, this.getExpandedOffset());
        }
        else if(this.state == 6) {
            ViewCompat.offsetTopAndBottom(arg6, this.halfExpandedOffset);
        }
        else {
            if((this.hideable) && this.state == 5) {
                ViewCompat.offsetTopAndBottom(arg6, this.parentHeight);
                goto label_73;
            }

            if(this.state == 4) {
                ViewCompat.offsetTopAndBottom(arg6, this.collapsedOffset);
                goto label_73;
            }

            if(this.state != 1 && this.state != v2) {
                goto label_73;
            }

            ViewCompat.offsetTopAndBottom(arg6, v0 - arg6.getTop());
        }

    label_73:
        if(this.viewDragHelper == null) {
            this.viewDragHelper = ViewDragHelper.create(((ViewGroup)arg5), this.dragCallback);
        }

        this.viewRef = new WeakReference(arg6);
        this.nestedScrollingChildRef = new WeakReference(this.findScrollingChild(arg6));
        return 1;
    }

    public boolean onNestedPreFling(@NonNull CoordinatorLayout arg3, @NonNull View arg4, @NonNull View arg5, float arg6, float arg7) {
        boolean v3;
        if(arg5 == this.nestedScrollingChildRef.get()) {
            if(this.state == 3 && !super.onNestedPreFling(arg3, arg4, arg5, arg6, arg7)) {
                goto label_10;
            }

            v3 = true;
        }
        else {
        label_10:
            v3 = false;
        }

        return v3;
    }

    public void onNestedPreScroll(@NonNull CoordinatorLayout arg2, @NonNull View arg3, @NonNull View arg4, int arg5, int arg6, @NonNull int[] arg7, int arg8) {
        if(arg8 == 1) {
            return;
        }

        if(arg4 != this.nestedScrollingChildRef.get()) {
            return;
        }

        arg5 = arg3.getTop();
        arg8 = arg5 - arg6;
        if(arg6 > 0) {
            if(arg8 < this.getExpandedOffset()) {
                arg7[1] = arg5 - this.getExpandedOffset();
                ViewCompat.offsetTopAndBottom(arg3, -arg7[1]);
                this.setStateInternal(3);
            }
            else {
                arg7[1] = arg6;
                ViewCompat.offsetTopAndBottom(arg3, -arg6);
                this.setStateInternal(1);
            }
        }
        else if(arg6 < 0 && !arg4.canScrollVertically(-1)) {
            if(arg8 > this.collapsedOffset) {
                if(this.hideable) {
                }
                else {
                    arg7[1] = arg5 - this.collapsedOffset;
                    ViewCompat.offsetTopAndBottom(arg3, -arg7[1]);
                    this.setStateInternal(4);
                    goto label_48;
                }
            }

            arg7[1] = arg6;
            ViewCompat.offsetTopAndBottom(arg3, -arg6);
            this.setStateInternal(1);
        }

    label_48:
        this.dispatchOnSlide(arg3.getTop());
        this.lastNestedScrollDy = arg6;
        this.nestedScrolled = true;
    }

    public void onRestoreInstanceState(CoordinatorLayout arg2, View arg3, Parcelable arg4) {
        super.onRestoreInstanceState(arg2, arg3, ((SavedState)arg4).getSuperState());
        this.state = ((SavedState)arg4).state == 1 || ((SavedState)arg4).state == 2 ? 4 : ((SavedState)arg4).state;
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout arg2, View arg3) {
        return new SavedState(super.onSaveInstanceState(arg2, arg3), this.state);
    }

    public boolean onStartNestedScroll(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, @NonNull View arg4, int arg5, int arg6) {
        boolean v1 = false;
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        if((arg5 & 2) != 0) {
            v1 = true;
        }

        return v1;
    }

    public void onStopNestedScroll(@NonNull CoordinatorLayout arg4, @NonNull View arg5, @NonNull View arg6, int arg7) {
        int v4;
        int v0 = 3;
        if(arg5.getTop() == this.getExpandedOffset()) {
            this.setStateInternal(v0);
            return;
        }

        if(arg6 == this.nestedScrollingChildRef.get()) {
            if(!this.nestedScrolled) {
            }
            else {
                if(this.lastNestedScrollDy > 0) {
                    v4 = this.getExpandedOffset();
                }
                else {
                    if((this.hideable) && (this.shouldHide(arg5, this.getYVelocity()))) {
                        v4 = this.parentHeight;
                        v0 = 5;
                        goto label_67;
                    }

                    if(this.lastNestedScrollDy == 0) {
                        v4 = arg5.getTop();
                        if(!this.fitToContents) {
                            if(v4 < this.halfExpandedOffset) {
                                if(v4 < Math.abs(v4 - this.collapsedOffset)) {
                                    v4 = 0;
                                    goto label_67;
                                }
                                else {
                                    v4 = this.halfExpandedOffset;
                                }
                            }
                            else if(Math.abs(v4 - this.halfExpandedOffset) < Math.abs(v4 - this.collapsedOffset)) {
                                v4 = this.halfExpandedOffset;
                            }
                            else {
                                goto label_63;
                            }

                            v0 = 6;
                            goto label_67;
                        label_63:
                            v4 = this.collapsedOffset;
                        }
                        else if(Math.abs(v4 - this.fitToContentsOffset) < Math.abs(v4 - this.collapsedOffset)) {
                            v4 = this.fitToContentsOffset;
                            goto label_67;
                        }
                        else {
                            v4 = this.collapsedOffset;
                        }
                    }
                    else {
                        v4 = this.collapsedOffset;
                    }

                    v0 = 4;
                }

            label_67:
                if(this.viewDragHelper.smoothSlideViewTo(arg5, arg5.getLeft(), v4)) {
                    this.setStateInternal(2);
                    ViewCompat.postOnAnimation(arg5, new SettleRunnable(this, arg5, v0));
                }
                else {
                    this.setStateInternal(v0);
                }

                this.nestedScrolled = false;
                return;
            }
        }
    }

    public boolean onTouchEvent(CoordinatorLayout arg3, View arg4, MotionEvent arg5) {
        if(!arg4.isShown()) {
            return 0;
        }

        int v3 = arg5.getActionMasked();
        if(this.state == 1 && v3 == 0) {
            return 1;
        }

        if(this.viewDragHelper != null) {
            this.viewDragHelper.processTouchEvent(arg5);
        }

        if(v3 == 0) {
            this.reset();
        }

        if(this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }

        this.velocityTracker.addMovement(arg5);
        if(v3 == 2 && !this.ignoreEvents && Math.abs((((float)this.initialY)) - arg5.getY()) > (((float)this.viewDragHelper.getTouchSlop()))) {
            this.viewDragHelper.captureChildView(arg4, arg5.getPointerId(arg5.getActionIndex()));
        }

        return this.ignoreEvents ^ 1;
    }

    private void reset() {
        this.activePointerId = -1;
        if(this.velocityTracker != null) {
            this.velocityTracker.recycle();
            this.velocityTracker = null;
        }
    }

    public void setBottomSheetCallback(BottomSheetCallback arg1) {
        this.callback = arg1;
    }

    public void setFitToContents(boolean arg2) {
        if(this.fitToContents == arg2) {
            return;
        }

        this.fitToContents = arg2;
        if(this.viewRef != null) {
            this.calculateCollapsedOffset();
        }

        int v2 = !this.fitToContents || this.state != 6 ? this.state : 3;
        this.setStateInternal(v2);
    }

    public void setHideable(boolean arg1) {
        this.hideable = arg1;
    }

    public final void setPeekHeight(int arg4) {
        int v0 = 1;
        if(arg4 != -1) {
            if(!this.peekHeightAuto) {
                if(this.peekHeight != arg4) {
                }
                else {
                label_13:
                    v0 = 0;
                    goto label_21;
                }
            }

            this.peekHeightAuto = false;
            this.peekHeight = Math.max(0, arg4);
            this.collapsedOffset = this.parentHeight - arg4;
        }
        else if(!this.peekHeightAuto) {
            this.peekHeightAuto = true;
        }
        else {
            goto label_13;
        }

    label_21:
        if(v0 != 0 && this.state == 4 && this.viewRef != null) {
            Object v4 = this.viewRef.get();
            if(v4 != null) {
                ((View)v4).requestLayout();
            }
        }
    }

    public void setSkipCollapsed(boolean arg1) {
        this.skipCollapsed = arg1;
    }

    public final void setState(int arg3) {
        if(arg3 == this.state) {
            return;
        }

        if(this.viewRef == null) {
            if(arg3 == 4 || arg3 == 3 || arg3 == 6 || (this.hideable) && arg3 == 5) {
                this.state = arg3;
            }

            return;
        }

        Object v0 = this.viewRef.get();
        if(v0 == null) {
            return;
        }

        ViewParent v1 = ((View)v0).getParent();
        if(v1 == null || !v1.isLayoutRequested() || !ViewCompat.isAttachedToWindow(((View)v0))) {
            this.startSettlingAnimation(((View)v0), arg3);
        }
        else {
            ((View)v0).post(new Runnable(((View)v0), arg3) {
                public void run() {
                    BottomSheetBehavior.this.startSettlingAnimation(this.val$child, this.val$finalState);
                }
            });
        }
    }

    void setStateInternal(int arg3) {
        if(this.state == arg3) {
            return;
        }

        this.state = arg3;
        if(arg3 == 6 || arg3 == 3) {
            this.updateImportantForAccessibility(true);
        }
        else {
            if(arg3 != 5 && arg3 != 4) {
                goto label_18;
            }

            this.updateImportantForAccessibility(false);
        }

    label_18:
        Object v0 = this.viewRef.get();
        if(v0 != null && this.callback != null) {
            this.callback.onStateChanged(((View)v0), arg3);
        }
    }

    boolean shouldHide(View arg5, float arg6) {
        boolean v1 = true;
        if(this.skipCollapsed) {
            return 1;
        }

        if(arg5.getTop() < this.collapsedOffset) {
            return 0;
        }

        if(Math.abs((((float)arg5.getTop())) + arg6 * 0.1f - (((float)this.collapsedOffset))) / (((float)this.peekHeight)) > 0.5f) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    void startSettlingAnimation(View arg4, int arg5) {
        int v0 = 3;
        if(arg5 == 4) {
            v0 = this.collapsedOffset;
        }
        else if(arg5 == 6) {
            int v1 = this.halfExpandedOffset;
            if((this.fitToContents) && v1 <= this.fitToContentsOffset) {
                v0 = this.fitToContentsOffset;
                arg5 = 3;
                goto label_26;
            }

            v0 = v1;
        }
        else {
            if(arg5 == v0) {
                v0 = this.getExpandedOffset();
                goto label_26;
            }

            if((this.hideable) && arg5 == 5) {
                v0 = this.parentHeight;
                goto label_26;
            }

            goto label_38;
        }

    label_26:
        if(this.viewDragHelper.smoothSlideViewTo(arg4, arg4.getLeft(), v0)) {
            this.setStateInternal(2);
            ViewCompat.postOnAnimation(arg4, new SettleRunnable(this, arg4, arg5));
        }
        else {
            this.setStateInternal(arg5);
        }

        return;
    label_38:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("Illegal state argument: ");
        v0_1.append(arg5);
        throw new IllegalArgumentException(v0_1.toString());
    }

    private void updateImportantForAccessibility(boolean arg8) {
        if(this.viewRef == null) {
            return;
        }

        ViewParent v0 = this.viewRef.get().getParent();
        if(!(v0 instanceof CoordinatorLayout)) {
            return;
        }

        int v1 = ((CoordinatorLayout)v0).getChildCount();
        int v3 = 16;
        if(Build$VERSION.SDK_INT >= v3 && (arg8)) {
            if(this.importantForAccessibilityMap == null) {
                this.importantForAccessibilityMap = new HashMap(v1);
            }
            else {
                return;
            }
        }

        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            View v4 = ((CoordinatorLayout)v0).getChildAt(v2);
            if(v4 == this.viewRef.get()) {
            }
            else if(arg8) {
                if(Build$VERSION.SDK_INT >= v3) {
                    this.importantForAccessibilityMap.put(v4, Integer.valueOf(v4.getImportantForAccessibility()));
                }

                ViewCompat.setImportantForAccessibility(v4, 4);
            }
            else if(this.importantForAccessibilityMap != null && (this.importantForAccessibilityMap.containsKey(v4))) {
                ViewCompat.setImportantForAccessibility(v4, this.importantForAccessibilityMap.get(v4).intValue());
            }
        }

        if(!arg8) {
            this.importantForAccessibilityMap = null;
        }
    }
}

