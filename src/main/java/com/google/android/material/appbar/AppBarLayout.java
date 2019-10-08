package com.google.android.material.appbar;

import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.animation.Interpolator;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.widget.CoordinatorLayout$DefaultBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.util.ObjectsCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ThemeEnforcement;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@DefaultBehavior(value=Behavior.class) public class AppBarLayout extends LinearLayout {
    public class BaseBehavior extends HeaderBehavior {
        public abstract class BaseDragCallback {
            public BaseDragCallback() {
                super();
            }

            public abstract boolean canDrag(@NonNull AppBarLayout arg1);
        }

        public class SavedState extends AbsSavedState {
            final class com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1 implements Parcelable$ClassLoaderCreator {
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1() {
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
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;

            static {
                SavedState.CREATOR = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1();
            }

            public SavedState(Parcelable arg1) {
                super(arg1);
            }

            public SavedState(Parcel arg1, ClassLoader arg2) {
                super(arg1, arg2);
                this.firstVisibleChildIndex = arg1.readInt();
                this.firstVisibleChildPercentageShown = arg1.readFloat();
                boolean v1 = arg1.readByte() != 0 ? true : false;
                this.firstVisibleChildAtMinimumHeight = v1;
            }

            public void writeToParcel(Parcel arg1, int arg2) {
                super.writeToParcel(arg1, arg2);
                arg1.writeInt(this.firstVisibleChildIndex);
                arg1.writeFloat(this.firstVisibleChildPercentageShown);
                arg1.writeByte(((byte)this.firstVisibleChildAtMinimumHeight));
            }
        }

        private static final int INVALID_POSITION = -1;
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private WeakReference lastNestedScrollingChildRef;
        private int lastStartedType;
        private ValueAnimator offsetAnimator;
        private int offsetDelta;
        private int offsetToChildIndexOnLayout;
        private boolean offsetToChildIndexOnLayoutIsMinHeight;
        private float offsetToChildIndexOnLayoutPerc;
        private BaseDragCallback onDragCallback;

        public BaseBehavior() {
            super();
            this.offsetToChildIndexOnLayout = -1;
        }

        public BaseBehavior(Context arg1, AttributeSet arg2) {
            super(arg1, arg2);
            this.offsetToChildIndexOnLayout = -1;
        }

        static int access$000(BaseBehavior arg0) {
            return arg0.offsetDelta;
        }

        private void animateOffsetTo(CoordinatorLayout arg3, AppBarLayout arg4, int arg5, float arg6) {
            int v0 = Math.abs(this.getTopBottomOffsetForScrollingSibling() - arg5);
            arg6 = Math.abs(arg6);
            int v6 = arg6 > 0f ? Math.round((((float)v0)) / arg6 * 1000f) * 3 : ((int)(((((float)v0)) / (((float)arg4.getHeight())) + 1f) * 150f));
            this.animateOffsetWithDuration(arg3, arg4, arg5, v6);
        }

        private void animateOffsetWithDuration(CoordinatorLayout arg4, AppBarLayout arg5, int arg6, int arg7) {
            int v0 = this.getTopBottomOffsetForScrollingSibling();
            if(v0 == arg6) {
                if(this.offsetAnimator != null && (this.offsetAnimator.isRunning())) {
                    this.offsetAnimator.cancel();
                }

                return;
            }

            if(this.offsetAnimator == null) {
                this.offsetAnimator = new ValueAnimator();
                this.offsetAnimator.setInterpolator(AnimationUtils.DECELERATE_INTERPOLATOR);
                this.offsetAnimator.addUpdateListener(new ValueAnimator$AnimatorUpdateListener(arg4, arg5) {
                    public void onAnimationUpdate(ValueAnimator arg4) {
                        BaseBehavior.this.setHeaderTopBottomOffset(this.val$coordinatorLayout, this.val$child, arg4.getAnimatedValue().intValue());
                    }
                });
            }
            else {
                this.offsetAnimator.cancel();
            }

            this.offsetAnimator.setDuration(((long)Math.min(arg7, 600)));
            this.offsetAnimator.setIntValues(new int[]{v0, arg6});
            this.offsetAnimator.start();
        }

        boolean canDragView(View arg1) {
            return this.canDragView(((AppBarLayout)arg1));
        }

        boolean canDragView(AppBarLayout arg3) {
            if(this.onDragCallback != null) {
                return this.onDragCallback.canDrag(arg3);
            }

            boolean v0 = true;
            if(this.lastNestedScrollingChildRef != null) {
                Object v3 = this.lastNestedScrollingChildRef.get();
                if(v3 == null || !((View)v3).isShown() || (((View)v3).canScrollVertically(-1))) {
                    v0 = false;
                }
                else {
                }

                return v0;
            }

            return 1;
        }

        private boolean canScrollChildren(CoordinatorLayout arg2, AppBarLayout arg3, View arg4) {
            boolean v2 = !arg3.hasScrollableChildren() || arg2.getHeight() - arg4.getHeight() > arg3.getHeight() ? false : true;
            return v2;
        }

        private static boolean checkFlag(int arg0, int arg1) {
            boolean v0 = (arg0 & arg1) == arg1 ? true : false;
            return v0;
        }

        @Nullable private View findFirstScrollingChild(CoordinatorLayout arg5) {
            int v0 = arg5.getChildCount();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                View v2 = arg5.getChildAt(v1);
                if((v2 instanceof NestedScrollingChild)) {
                    return v2;
                }
            }

            return null;
        }

        private static View getAppBarChildOnOffset(AppBarLayout arg4, int arg5) {
            arg5 = Math.abs(arg5);
            int v0 = arg4.getChildCount();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                View v2 = arg4.getChildAt(v1);
                if(arg5 >= v2.getTop() && arg5 <= v2.getBottom()) {
                    return v2;
                }
            }

            return null;
        }

        private int getChildIndexOnOffset(AppBarLayout arg8, int arg9) {
            int v0 = arg8.getChildCount();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                View v2 = arg8.getChildAt(v1);
                int v3 = v2.getTop();
                int v4 = v2.getBottom();
                ViewGroup$LayoutParams v2_1 = v2.getLayoutParams();
                if(BaseBehavior.checkFlag(((LayoutParams)v2_1).getScrollFlags(), 0x20)) {
                    v3 -= ((LayoutParams)v2_1).topMargin;
                    v4 += ((LayoutParams)v2_1).bottomMargin;
                }

                int v2_2 = -arg9;
                if(v3 <= v2_2 && v4 >= v2_2) {
                    return v1;
                }
            }

            return -1;
        }

        int getMaxDragOffset(View arg1) {
            return this.getMaxDragOffset(((AppBarLayout)arg1));
        }

        int getMaxDragOffset(AppBarLayout arg1) {
            return -arg1.getDownNestedScrollRange();
        }

        int getScrollRangeForDragFling(View arg1) {
            return this.getScrollRangeForDragFling(((AppBarLayout)arg1));
        }

        int getScrollRangeForDragFling(AppBarLayout arg1) {
            return arg1.getTotalScrollRange();
        }

        int getTopBottomOffsetForScrollingSibling() {
            return this.getTopAndBottomOffset() + this.offsetDelta;
        }

        private int interpolateOffset(AppBarLayout arg9, int arg10) {
            int v0 = Math.abs(arg10);
            int v1 = arg9.getChildCount();
            int v2 = 0;
            int v3;
            for(v3 = 0; v3 < v1; ++v3) {
                View v4 = arg9.getChildAt(v3);
                ViewGroup$LayoutParams v5 = v4.getLayoutParams();
                Interpolator v6 = ((LayoutParams)v5).getScrollInterpolator();
                if(v0 >= v4.getTop() && v0 <= v4.getBottom()) {
                    if(v6 != null) {
                        v1 = ((LayoutParams)v5).getScrollFlags();
                        if((v1 & 1) != 0) {
                            v2 = v4.getHeight() + ((LayoutParams)v5).topMargin + ((LayoutParams)v5).bottomMargin;
                            if((v1 & 2) != 0) {
                                v2 -= ViewCompat.getMinimumHeight(v4);
                            }
                        }

                        if(ViewCompat.getFitsSystemWindows(v4)) {
                            v2 -= arg9.getTopInset();
                        }

                        if(v2 <= 0) {
                            return arg10;
                        }

                        float v9 = ((float)v2);
                        return Integer.signum(arg10) * (v4.getTop() + Math.round(v9 * v6.getInterpolation((((float)(v0 - v4.getTop()))) / v9)));
                    }
                    else {
                        return arg10;
                    }
                }
            }

            return arg10;
        }

        @VisibleForTesting boolean isOffsetAnimatorRunning() {
            boolean v0 = this.offsetAnimator == null || !this.offsetAnimator.isRunning() ? false : true;
            return v0;
        }

        void onFlingFinished(CoordinatorLayout arg1, View arg2) {
            this.onFlingFinished(arg1, ((AppBarLayout)arg2));
        }

        void onFlingFinished(CoordinatorLayout arg1, AppBarLayout arg2) {
            this.snapToChildIfNeeded(arg1, arg2);
        }

        public boolean onLayoutChild(CoordinatorLayout arg1, View arg2, int arg3) {
            return this.onLayoutChild(arg1, ((AppBarLayout)arg2), arg3);
        }

        public boolean onLayoutChild(CoordinatorLayout arg8, AppBarLayout arg9, int arg10) {
            int v1;
            boolean v10 = super.onLayoutChild(arg8, ((View)arg9), arg10);
            int v0 = arg9.getPendingAction();
            if(this.offsetToChildIndexOnLayout < 0 || (v0 & 8) != 0) {
                if(v0 == 0) {
                    goto label_49;
                }

                v1 = (v0 & 4) != 0 ? 1 : 0;
                if((v0 & 2) != 0) {
                    v0 = -arg9.getUpNestedPreScrollRange();
                    if(v1 != 0) {
                        this.animateOffsetTo(arg8, arg9, v0, 0f);
                        goto label_49;
                    }

                    this.setHeaderTopBottomOffset(arg8, ((View)arg9), v0);
                    goto label_49;
                }

                if((v0 & 1) == 0) {
                    goto label_49;
                }

                if(v1 != 0) {
                    this.animateOffsetTo(arg8, arg9, 0, 0f);
                    goto label_49;
                }

                this.setHeaderTopBottomOffset(arg8, ((View)arg9), 0);
            }
            else {
                View v0_1 = arg9.getChildAt(this.offsetToChildIndexOnLayout);
                v1 = -v0_1.getBottom();
                v1 += this.offsetToChildIndexOnLayoutIsMinHeight ? ViewCompat.getMinimumHeight(v0_1) + arg9.getTopInset() : Math.round((((float)v0_1.getHeight())) * this.offsetToChildIndexOnLayoutPerc);
                this.setHeaderTopBottomOffset(arg8, ((View)arg9), v1);
            }

        label_49:
            arg9.resetPendingAction();
            this.offsetToChildIndexOnLayout = -1;
            this.setTopAndBottomOffset(MathUtils.clamp(this.getTopAndBottomOffset(), -arg9.getTotalScrollRange(), 0));
            this.updateAppBarLayoutDrawableState(arg8, arg9, this.getTopAndBottomOffset(), 0, true);
            arg9.dispatchOffsetUpdates(this.getTopAndBottomOffset());
            return v10;
        }

        public boolean onMeasureChild(CoordinatorLayout arg1, View arg2, int arg3, int arg4, int arg5, int arg6) {
            return this.onMeasureChild(arg1, ((AppBarLayout)arg2), arg3, arg4, arg5, arg6);
        }

        public boolean onMeasureChild(CoordinatorLayout arg7, AppBarLayout arg8, int arg9, int arg10, int arg11, int arg12) {
            if(arg8.getLayoutParams().height == -2) {
                arg7.onMeasureChild(arg8, arg9, arg10, View$MeasureSpec.makeMeasureSpec(0, 0), arg12);
                return 1;
            }

            return super.onMeasureChild(arg7, ((View)arg8), arg9, arg10, arg11, arg12);
        }

        public void onNestedPreScroll(CoordinatorLayout arg1, View arg2, View arg3, int arg4, int arg5, int[] arg6, int arg7) {
            this.onNestedPreScroll(arg1, ((AppBarLayout)arg2), arg3, arg4, arg5, arg6, arg7);
        }

        public void onNestedPreScroll(CoordinatorLayout arg8, AppBarLayout arg9, View arg10, int arg11, int arg12, int[] arg13, int arg14) {
            int v6;
            int v5;
            if(arg12 != 0) {
                if(arg12 < 0) {
                    arg11 = -arg9.getTotalScrollRange();
                    v5 = arg11;
                    v6 = arg9.getDownNestedPreScrollRange() + arg11;
                }
                else {
                    v5 = -arg9.getUpNestedPreScrollRange();
                    v6 = 0;
                }

                if(v5 == v6) {
                    return;
                }

                arg13[1] = this.scroll(arg8, arg9, arg12, v5, v6);
                this.stopNestedScrollIfNeeded(arg12, arg9, arg10, arg14);
            }
        }

        public void onNestedScroll(CoordinatorLayout arg1, View arg2, View arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
            this.onNestedScroll(arg1, ((AppBarLayout)arg2), arg3, arg4, arg5, arg6, arg7, arg8);
        }

        public void onNestedScroll(CoordinatorLayout arg7, AppBarLayout arg8, View arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
            if(arg13 < 0) {
                this.scroll(arg7, arg8, arg13, -arg8.getDownNestedScrollRange(), 0);
                this.stopNestedScrollIfNeeded(arg13, arg8, arg9, arg14);
            }

            if(arg8.isLiftOnScroll()) {
                boolean v7 = arg9.getScrollY() > 0 ? true : false;
                arg8.setLiftedState(v7);
            }
        }

        public void onRestoreInstanceState(CoordinatorLayout arg1, View arg2, Parcelable arg3) {
            this.onRestoreInstanceState(arg1, ((AppBarLayout)arg2), arg3);
        }

        public void onRestoreInstanceState(CoordinatorLayout arg2, AppBarLayout arg3, Parcelable arg4) {
            if((arg4 instanceof SavedState)) {
                super.onRestoreInstanceState(arg2, ((View)arg3), ((SavedState)arg4).getSuperState());
                this.offsetToChildIndexOnLayout = ((SavedState)arg4).firstVisibleChildIndex;
                this.offsetToChildIndexOnLayoutPerc = ((SavedState)arg4).firstVisibleChildPercentageShown;
                this.offsetToChildIndexOnLayoutIsMinHeight = ((SavedState)arg4).firstVisibleChildAtMinimumHeight;
            }
            else {
                super.onRestoreInstanceState(arg2, ((View)arg3), arg4);
                this.offsetToChildIndexOnLayout = -1;
            }
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout arg1, View arg2) {
            return this.onSaveInstanceState(arg1, ((AppBarLayout)arg2));
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout arg8, AppBarLayout arg9) {
            Parcelable v8 = super.onSaveInstanceState(arg8, ((View)arg9));
            int v0 = this.getTopAndBottomOffset();
            int v1 = arg9.getChildCount();
            boolean v2 = false;
            int v3;
            for(v3 = 0; v3 < v1; ++v3) {
                View v4 = arg9.getChildAt(v3);
                int v5 = v4.getBottom() + v0;
                if(v4.getTop() + v0 <= 0 && v5 >= 0) {
                    SavedState v0_1 = new SavedState(v8);
                    v0_1.firstVisibleChildIndex = v3;
                    if(v5 == ViewCompat.getMinimumHeight(v4) + arg9.getTopInset()) {
                        v2 = true;
                    }

                    v0_1.firstVisibleChildAtMinimumHeight = v2;
                    v0_1.firstVisibleChildPercentageShown = (((float)v5)) / (((float)v4.getHeight()));
                    return ((Parcelable)v0_1);
                }
            }

            return v8;
        }

        public boolean onStartNestedScroll(CoordinatorLayout arg1, View arg2, View arg3, View arg4, int arg5, int arg6) {
            return this.onStartNestedScroll(arg1, ((AppBarLayout)arg2), arg3, arg4, arg5, arg6);
        }

        public boolean onStartNestedScroll(CoordinatorLayout arg1, AppBarLayout arg2, View arg3, View arg4, int arg5, int arg6) {
            boolean v1;
            if((arg5 & 2) != 0) {
                if(!arg2.isLiftOnScroll() && !this.canScrollChildren(arg1, arg2, arg3)) {
                    goto label_8;
                }

                v1 = true;
            }
            else {
            label_8:
                v1 = false;
            }

            if((v1) && this.offsetAnimator != null) {
                this.offsetAnimator.cancel();
            }

            this.lastNestedScrollingChildRef = null;
            this.lastStartedType = arg6;
            return v1;
        }

        public void onStopNestedScroll(CoordinatorLayout arg1, View arg2, View arg3, int arg4) {
            this.onStopNestedScroll(arg1, ((AppBarLayout)arg2), arg3, arg4);
        }

        public void onStopNestedScroll(CoordinatorLayout arg2, AppBarLayout arg3, View arg4, int arg5) {
            if(this.lastStartedType == 0 || arg5 == 1) {
                this.snapToChildIfNeeded(arg2, arg3);
            }

            this.lastNestedScrollingChildRef = new WeakReference(arg4);
        }

        public void setDragCallback(@Nullable BaseDragCallback arg1) {
            this.onDragCallback = arg1;
        }

        int setHeaderTopBottomOffset(CoordinatorLayout arg1, View arg2, int arg3, int arg4, int arg5) {
            return this.setHeaderTopBottomOffset(arg1, ((AppBarLayout)arg2), arg3, arg4, arg5);
        }

        int setHeaderTopBottomOffset(CoordinatorLayout arg9, AppBarLayout arg10, int arg11, int arg12, int arg13) {
            int v0 = this.getTopBottomOffsetForScrollingSibling();
            int v1 = 0;
            if(arg12 == 0 || v0 < arg12 || v0 > arg13) {
                this.offsetDelta = 0;
            }
            else {
                int v5 = MathUtils.clamp(arg11, arg12, arg13);
                if(v0 != v5) {
                    arg11 = arg10.hasChildWithInterpolator() ? this.interpolateOffset(arg10, v5) : v5;
                    boolean v12 = this.setTopAndBottomOffset(arg11);
                    v1 = v0 - v5;
                    this.offsetDelta = v5 - arg11;
                    if(!v12 && (arg10.hasChildWithInterpolator())) {
                        arg9.dispatchDependentViewsChanged(((View)arg10));
                    }

                    arg10.dispatchOffsetUpdates(this.getTopAndBottomOffset());
                    int v6 = v5 < v0 ? -1 : 1;
                    this.updateAppBarLayoutDrawableState(arg9, arg10, v5, v6, false);
                }
            }

            return v1;
        }

        private boolean shouldJumpElevationState(CoordinatorLayout arg5, AppBarLayout arg6) {
            List v5 = arg5.getDependents(((View)arg6));
            int v6 = v5.size();
            boolean v0 = false;
            int v1;
            for(v1 = 0; v1 < v6; ++v1) {
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior v2 = v5.get(v1).getLayoutParams().getBehavior();
                if((v2 instanceof ScrollingViewBehavior)) {
                    if(((ScrollingViewBehavior)v2).getOverlayTop() != 0) {
                        v0 = true;
                    }

                    return v0;
                }
            }

            return 0;
        }

        private void snapToChildIfNeeded(CoordinatorLayout arg9, AppBarLayout arg10) {
            int v0 = this.getTopBottomOffsetForScrollingSibling();
            int v1 = this.getChildIndexOnOffset(arg10, v0);
            if(v1 >= 0) {
                View v2 = arg10.getChildAt(v1);
                ViewGroup$LayoutParams v3 = v2.getLayoutParams();
                int v4 = ((LayoutParams)v3).getScrollFlags();
                if((v4 & 17) == 17) {
                    int v5 = -v2.getTop();
                    int v6 = -v2.getBottom();
                    if(v1 == arg10.getChildCount() - 1) {
                        v6 += arg10.getTopInset();
                    }

                    v1 = 2;
                    if(BaseBehavior.checkFlag(v4, v1)) {
                        v6 += ViewCompat.getMinimumHeight(v2);
                    }
                    else if(BaseBehavior.checkFlag(v4, 5)) {
                        int v2_1 = ViewCompat.getMinimumHeight(v2) + v6;
                        if(v0 < v2_1) {
                            v5 = v2_1;
                        }
                        else {
                            v6 = v2_1;
                        }
                    }

                    if(BaseBehavior.checkFlag(v4, 0x20)) {
                        v5 += ((LayoutParams)v3).topMargin;
                        v6 -= ((LayoutParams)v3).bottomMargin;
                    }

                    if(v0 < (v6 + v5) / v1) {
                        v5 = v6;
                    }

                    this.animateOffsetTo(arg9, arg10, MathUtils.clamp(v5, -arg10.getTotalScrollRange(), 0), 0f);
                }
            }
        }

        private void stopNestedScrollIfNeeded(int arg2, AppBarLayout arg3, View arg4, int arg5) {
            if(arg5 == 1) {
                arg5 = this.getTopBottomOffsetForScrollingSibling();
                if(arg2 >= 0 || arg5 != 0) {
                    if(arg2 <= 0) {
                    }
                    else if(arg5 == -arg3.getDownNestedScrollRange()) {
                        goto label_9;
                    }

                    return;
                }

            label_9:
                ViewCompat.stopNestedScroll(arg4, 1);
            }
        }

        private void updateAppBarLayoutDrawableState(CoordinatorLayout arg6, AppBarLayout arg7, int arg8, int arg9, boolean arg10) {
            boolean v8;
            View v0 = BaseBehavior.getAppBarChildOnOffset(arg7, arg8);
            if(v0 != null) {
                int v1 = v0.getLayoutParams().getScrollFlags();
                if((v1 & 1) != 0) {
                    int v2 = ViewCompat.getMinimumHeight(v0);
                    if(arg9 <= 0 || (v1 & 12) == 0) {
                        if((v1 & 2) == 0) {
                            goto label_29;
                        }
                        else if(-arg8 >= v0.getBottom() - v2 - arg7.getTopInset()) {
                        }
                        else {
                            goto label_29;
                        }
                    }
                    else if(-arg8 < v0.getBottom() - v2 - arg7.getTopInset()) {
                        goto label_29;
                    }

                    v8 = true;
                }
                else {
                label_29:
                    v8 = false;
                }

                if(arg7.isLiftOnScroll()) {
                    View v9 = this.findFirstScrollingChild(arg6);
                    if(v9 != null) {
                        v8 = v9.getScrollY() > 0 ? true : false;
                    }
                }

                v8 = arg7.setLiftedState(v8);
                if(Build$VERSION.SDK_INT < 11) {
                    return;
                }

                if(!arg10) {
                    if(!v8) {
                    }
                    else if(this.shouldJumpElevationState(arg6, arg7)) {
                        goto label_47;
                    }

                    return;
                }

            label_47:
                arg7.jumpDrawablesToCurrentState();
            }
        }
    }

    public interface BaseOnOffsetChangedListener {
        void onOffsetChanged(AppBarLayout arg1, int arg2);
    }

    public class Behavior extends BaseBehavior {
        public abstract class DragCallback extends BaseDragCallback {
            public DragCallback() {
                super();
            }
        }

        public Behavior() {
            super();
        }

        public Behavior(Context arg1, AttributeSet arg2) {
            super(arg1, arg2);
        }

        public int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        public int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        public boolean onLayoutChild(CoordinatorLayout arg1, AppBarLayout arg2, int arg3) {
            return super.onLayoutChild(arg1, arg2, arg3);
        }

        public boolean onMeasureChild(CoordinatorLayout arg1, AppBarLayout arg2, int arg3, int arg4, int arg5, int arg6) {
            return super.onMeasureChild(arg1, arg2, arg3, arg4, arg5, arg6);
        }

        public void onNestedPreScroll(CoordinatorLayout arg1, AppBarLayout arg2, View arg3, int arg4, int arg5, int[] arg6, int arg7) {
            super.onNestedPreScroll(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
        }

        public void onNestedScroll(CoordinatorLayout arg1, AppBarLayout arg2, View arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
            super.onNestedScroll(arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }

        public void onRestoreInstanceState(CoordinatorLayout arg1, AppBarLayout arg2, Parcelable arg3) {
            super.onRestoreInstanceState(arg1, arg2, arg3);
        }

        public Parcelable onSaveInstanceState(CoordinatorLayout arg1, AppBarLayout arg2) {
            return super.onSaveInstanceState(arg1, arg2);
        }

        public boolean onStartNestedScroll(CoordinatorLayout arg1, AppBarLayout arg2, View arg3, View arg4, int arg5, int arg6) {
            return super.onStartNestedScroll(arg1, arg2, arg3, arg4, arg5, arg6);
        }

        public void onStopNestedScroll(CoordinatorLayout arg1, AppBarLayout arg2, View arg3, int arg4) {
            super.onStopNestedScroll(arg1, arg2, arg3, arg4);
        }

        public void setDragCallback(@Nullable BaseDragCallback arg1) {
            super.setDragCallback(arg1);
        }

        public boolean setLeftAndRightOffset(int arg1) {
            return super.setLeftAndRightOffset(arg1);
        }

        public boolean setTopAndBottomOffset(int arg1) {
            return super.setTopAndBottomOffset(arg1);
        }
    }

    public class LayoutParams extends LinearLayout$LayoutParams {
        @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface ScrollFlags {
        }

        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 0x20;
        int scrollFlags;
        Interpolator scrollInterpolator;

        public LayoutParams(int arg1, int arg2) {
            super(arg1, arg2);
            this.scrollFlags = 1;
        }

        public LayoutParams(Context arg3, AttributeSet arg4) {
            super(arg3, arg4);
            this.scrollFlags = 1;
            TypedArray v4 = arg3.obtainStyledAttributes(arg4, R$styleable.AppBarLayout_Layout);
            this.scrollFlags = v4.getInt(R$styleable.AppBarLayout_Layout_layout_scrollFlags, 0);
            if(v4.hasValue(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.scrollInterpolator = android.view.animation.AnimationUtils.loadInterpolator(arg3, v4.getResourceId(R$styleable.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }

            v4.recycle();
        }

        @RequiresApi(value=19) public LayoutParams(LinearLayout$LayoutParams arg1) {
            super(arg1);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup$MarginLayoutParams arg1) {
            super(arg1);
            this.scrollFlags = 1;
        }

        public LayoutParams(ViewGroup$LayoutParams arg1) {
            super(arg1);
            this.scrollFlags = 1;
        }

        public LayoutParams(int arg1, int arg2, float arg3) {
            super(arg1, arg2, arg3);
            this.scrollFlags = 1;
        }

        @RequiresApi(value=19) public LayoutParams(LayoutParams arg2) {
            super(((LinearLayout$LayoutParams)arg2));
            this.scrollFlags = 1;
            this.scrollFlags = arg2.scrollFlags;
            this.scrollInterpolator = arg2.scrollInterpolator;
        }

        public int getScrollFlags() {
            return this.scrollFlags;
        }

        public Interpolator getScrollInterpolator() {
            return this.scrollInterpolator;
        }

        boolean isCollapsible() {
            boolean v1 = true;
            if((this.scrollFlags & 1) != 1 || (this.scrollFlags & 10) == 0) {
                v1 = false;
            }
            else {
            }

            return v1;
        }

        public void setScrollFlags(int arg1) {
            this.scrollFlags = arg1;
        }

        public void setScrollInterpolator(Interpolator arg1) {
            this.scrollInterpolator = arg1;
        }
    }

    public interface OnOffsetChangedListener extends BaseOnOffsetChangedListener {
        void onOffsetChanged(AppBarLayout arg1, int arg2);
    }

    public class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
            super();
        }

        public ScrollingViewBehavior(Context arg2, AttributeSet arg3) {
            super(arg2, arg3);
            TypedArray v2 = arg2.obtainStyledAttributes(arg3, R$styleable.ScrollingViewBehavior_Layout);
            this.setOverlayTop(v2.getDimensionPixelSize(R$styleable.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            v2.recycle();
        }

        View findFirstDependency(List arg1) {
            return this.findFirstDependency(arg1);
        }

        AppBarLayout findFirstDependency(List arg5) {
            int v0 = arg5.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                Object v2 = arg5.get(v1);
                if((v2 instanceof AppBarLayout)) {
                    return ((AppBarLayout)v2);
                }
            }

            return null;
        }

        private static int getAppBarLayoutOffset(AppBarLayout arg1) {
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior v1 = arg1.getLayoutParams().getBehavior();
            if((v1 instanceof BaseBehavior)) {
                return ((BaseBehavior)v1).getTopBottomOffsetForScrollingSibling();
            }

            return 0;
        }

        public int getLeftAndRightOffset() {
            return super.getLeftAndRightOffset();
        }

        float getOverlapRatioForOffset(View arg5) {
            if((arg5 instanceof AppBarLayout)) {
                int v0 = ((AppBarLayout)arg5).getTotalScrollRange();
                int v2 = ((AppBarLayout)arg5).getDownNestedPreScrollRange();
                int v5 = ScrollingViewBehavior.getAppBarLayoutOffset(((AppBarLayout)arg5));
                if(v2 != 0 && v0 + v5 <= v2) {
                    return 0;
                }

                v0 -= v2;
                if(v0 == 0) {
                    return 0;
                }

                return (((float)v5)) / (((float)v0)) + 1f;
            }

            return 0;
        }

        int getScrollRange(View arg2) {
            if((arg2 instanceof AppBarLayout)) {
                return ((AppBarLayout)arg2).getTotalScrollRange();
            }

            return super.getScrollRange(arg2);
        }

        public int getTopAndBottomOffset() {
            return super.getTopAndBottomOffset();
        }

        public boolean layoutDependsOn(CoordinatorLayout arg1, View arg2, View arg3) {
            return arg3 instanceof AppBarLayout;
        }

        private void offsetChildAsNeeded(View arg4, View arg5) {
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior v0 = arg5.getLayoutParams().getBehavior();
            if((v0 instanceof BaseBehavior)) {
                ViewCompat.offsetTopAndBottom(arg4, arg5.getBottom() - arg4.getTop() + ((BaseBehavior)v0).offsetDelta + this.getVerticalLayoutGap() - this.getOverlapPixelsForOffset(arg5));
            }
        }

        public boolean onDependentViewChanged(CoordinatorLayout arg1, View arg2, View arg3) {
            this.offsetChildAsNeeded(arg2, arg3);
            this.updateLiftedStateIfNeeded(arg2, arg3);
            return 0;
        }

        public boolean onLayoutChild(CoordinatorLayout arg1, View arg2, int arg3) {
            return super.onLayoutChild(arg1, arg2, arg3);
        }

        public boolean onMeasureChild(CoordinatorLayout arg1, View arg2, int arg3, int arg4, int arg5, int arg6) {
            return super.onMeasureChild(arg1, arg2, arg3, arg4, arg5, arg6);
        }

        public boolean onRequestChildRectangleOnScreen(CoordinatorLayout arg4, View arg5, Rect arg6, boolean arg7) {
            AppBarLayout v0 = this.findFirstDependency(arg4.getDependencies(arg5));
            if(v0 != null) {
                arg6.offset(arg5.getLeft(), arg5.getTop());
                Rect v5 = this.tempRect1;
                v5.set(0, 0, arg4.getWidth(), arg4.getHeight());
                if(!v5.contains(arg6)) {
                    v0.setExpanded(false, (((int)arg7)) ^ 1);
                    return 1;
                }
            }

            return 0;
        }

        public boolean setLeftAndRightOffset(int arg1) {
            return super.setLeftAndRightOffset(arg1);
        }

        public boolean setTopAndBottomOffset(int arg1) {
            return super.setTopAndBottomOffset(arg1);
        }

        private void updateLiftedStateIfNeeded(View arg2, View arg3) {
            if(((arg3 instanceof AppBarLayout)) && (((AppBarLayout)arg3).isLiftOnScroll())) {
                boolean v2 = arg2.getScrollY() > 0 ? true : false;
                ((AppBarLayout)arg3).setLiftedState(v2);
            }
        }
    }

    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE;
    private int downPreScrollRange;
    private int downScrollRange;
    private boolean haveChildWithInterpolator;
    private WindowInsetsCompat lastInsets;
    private boolean liftOnScroll;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private List listeners;
    private int pendingAction;
    private int[] tmpStatesArray;
    private int totalScrollRange;

    public AppBarLayout(Context arg2) {
        this(arg2, null);
    }

    public AppBarLayout(Context arg10, AttributeSet arg11) {
        super(arg10, arg11);
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
        this.pendingAction = 0;
        this.setOrientation(1);
        int v2 = 21;
        if(Build$VERSION.SDK_INT >= v2) {
            ViewUtilsLollipop.setBoundsViewOutlineProvider(((View)this));
            ViewUtilsLollipop.setStateListAnimatorFromAttrs(((View)this), arg11, 0, R$style.Widget_Design_AppBarLayout);
        }

        TypedArray v10 = ThemeEnforcement.obtainStyledAttributes(arg10, arg11, R$styleable.AppBarLayout, 0, R$style.Widget_Design_AppBarLayout, new int[0]);
        ViewCompat.setBackground(((View)this), v10.getDrawable(R$styleable.AppBarLayout_android_background));
        if(v10.hasValue(R$styleable.AppBarLayout_expanded)) {
            this.setExpanded(v10.getBoolean(R$styleable.AppBarLayout_expanded, false), false, false);
        }

        if(Build$VERSION.SDK_INT >= v2 && (v10.hasValue(R$styleable.AppBarLayout_elevation))) {
            ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(((View)this), ((float)v10.getDimensionPixelSize(R$styleable.AppBarLayout_elevation, 0)));
        }

        if(Build$VERSION.SDK_INT >= 26) {
            if(v10.hasValue(R$styleable.AppBarLayout_android_keyboardNavigationCluster)) {
                this.setKeyboardNavigationCluster(v10.getBoolean(R$styleable.AppBarLayout_android_keyboardNavigationCluster, false));
            }

            if(!v10.hasValue(R$styleable.AppBarLayout_android_touchscreenBlocksFocus)) {
                goto label_55;
            }

            this.setTouchscreenBlocksFocus(v10.getBoolean(R$styleable.AppBarLayout_android_touchscreenBlocksFocus, false));
        }

    label_55:
        this.liftOnScroll = v10.getBoolean(R$styleable.AppBarLayout_liftOnScroll, false);
        v10.recycle();
        ViewCompat.setOnApplyWindowInsetsListener(((View)this), new OnApplyWindowInsetsListener() {
            public WindowInsetsCompat onApplyWindowInsets(View arg1, WindowInsetsCompat arg2) {
                return AppBarLayout.this.onWindowInsetChanged(arg2);
            }
        });
    }

    public void addOnOffsetChangedListener(BaseOnOffsetChangedListener arg2) {
        if(this.listeners == null) {
            this.listeners = new ArrayList();
        }

        if(arg2 != null && !this.listeners.contains(arg2)) {
            this.listeners.add(arg2);
        }
    }

    public void addOnOffsetChangedListener(OnOffsetChangedListener arg1) {
        this.addOnOffsetChangedListener(((BaseOnOffsetChangedListener)arg1));
    }

    protected boolean checkLayoutParams(ViewGroup$LayoutParams arg1) {
        return arg1 instanceof LayoutParams;
    }

    void dispatchOffsetUpdates(int arg4) {
        if(this.listeners != null) {
            int v0 = 0;
            int v1 = this.listeners.size();
            while(v0 < v1) {
                Object v2 = this.listeners.get(v0);
                if(v2 != null) {
                    ((BaseOnOffsetChangedListener)v2).onOffsetChanged(this, arg4);
                }

                ++v0;
            }
        }
    }

    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -2);
    }

    protected LinearLayout$LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    public ViewGroup$LayoutParams generateLayoutParams(AttributeSet arg1) {
        return this.generateLayoutParams(arg1);
    }

    public LayoutParams generateLayoutParams(AttributeSet arg3) {
        return new LayoutParams(this.getContext(), arg3);
    }

    protected ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg1) {
        return this.generateLayoutParams(arg1);
    }

    protected LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg3) {
        if(Build$VERSION.SDK_INT >= 19 && ((arg3 instanceof LinearLayout$LayoutParams))) {
            return new LayoutParams(((LinearLayout$LayoutParams)arg3));
        }

        if((arg3 instanceof ViewGroup$MarginLayoutParams)) {
            return new LayoutParams(((ViewGroup$MarginLayoutParams)arg3));
        }

        return new LayoutParams(arg3);
    }

    public LinearLayout$LayoutParams generateLayoutParams(AttributeSet arg1) {
        return this.generateLayoutParams(arg1);
    }

    protected LinearLayout$LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg1) {
        return this.generateLayoutParams(arg1);
    }

    int getDownNestedPreScrollRange() {
        if(this.downPreScrollRange != -1) {
            return this.downPreScrollRange;
        }

        int v0 = this.getChildCount() - 1;
        int v2 = 0;
        while(v0 >= 0) {
            View v3 = this.getChildAt(v0);
            ViewGroup$LayoutParams v4 = v3.getLayoutParams();
            int v5 = v3.getMeasuredHeight();
            int v6 = ((LayoutParams)v4).scrollFlags;
            if((v6 & 5) == 5) {
                v2 += ((LayoutParams)v4).topMargin + ((LayoutParams)v4).bottomMargin;
                if((v6 & 8) != 0) {
                    v2 += ViewCompat.getMinimumHeight(v3);
                }
                else if((v6 & 2) != 0) {
                    v2 += v5 - ViewCompat.getMinimumHeight(v3);
                }
                else {
                    v2 += v5 - this.getTopInset();
                }
            }
            else if(v2 > 0) {
                break;
            }

            --v0;
        }

        v0 = Math.max(0, v2);
        this.downPreScrollRange = v0;
        return v0;
    }

    int getDownNestedScrollRange() {
        if(this.downScrollRange != -1) {
            return this.downScrollRange;
        }

        int v0 = this.getChildCount();
        int v2 = 0;
        int v3 = 0;
        while(v2 < v0) {
            View v4 = this.getChildAt(v2);
            ViewGroup$LayoutParams v5 = v4.getLayoutParams();
            int v6 = v4.getMeasuredHeight() + (((LayoutParams)v5).topMargin + ((LayoutParams)v5).bottomMargin);
            int v5_1 = ((LayoutParams)v5).scrollFlags;
            if((v5_1 & 1) == 0) {
                break;
            }

            v3 += v6;
            if((v5_1 & 2) != 0) {
                v3 -= ViewCompat.getMinimumHeight(v4) + this.getTopInset();
            }
            else {
                ++v2;
                continue;
            }

            break;
        }

        v0 = Math.max(0, v3);
        this.downScrollRange = v0;
        return v0;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int v0 = this.getTopInset();
        int v1 = ViewCompat.getMinimumHeight(((View)this));
        if(v1 != 0) {
            return v1 * 2 + v0;
        }

        v1 = this.getChildCount();
        v1 = v1 >= 1 ? ViewCompat.getMinimumHeight(this.getChildAt(v1 - 1)) : 0;
        if(v1 != 0) {
            return v1 * 2 + v0;
        }

        return this.getHeight() / 3;
    }

    int getPendingAction() {
        return this.pendingAction;
    }

    @Deprecated public float getTargetElevation() {
        return 0;
    }

    @VisibleForTesting final int getTopInset() {
        int v0 = this.lastInsets != null ? this.lastInsets.getSystemWindowInsetTop() : 0;
        return v0;
    }

    public final int getTotalScrollRange() {
        if(this.totalScrollRange != -1) {
            return this.totalScrollRange;
        }

        int v0 = this.getChildCount();
        int v2 = 0;
        int v3 = 0;
        while(v2 < v0) {
            View v4 = this.getChildAt(v2);
            ViewGroup$LayoutParams v5 = v4.getLayoutParams();
            int v6 = v4.getMeasuredHeight();
            int v7 = ((LayoutParams)v5).scrollFlags;
            if((v7 & 1) == 0) {
                break;
            }

            v3 += v6 + ((LayoutParams)v5).topMargin + ((LayoutParams)v5).bottomMargin;
            if((v7 & 2) != 0) {
                v3 -= ViewCompat.getMinimumHeight(v4);
            }
            else {
                ++v2;
                continue;
            }

            break;
        }

        v0 = Math.max(0, v3 - this.getTopInset());
        this.totalScrollRange = v0;
        return v0;
    }

    int getUpNestedPreScrollRange() {
        return this.getTotalScrollRange();
    }

    boolean hasChildWithInterpolator() {
        return this.haveChildWithInterpolator;
    }

    private boolean hasCollapsibleChild() {
        int v0 = this.getChildCount();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            if(this.getChildAt(v2).getLayoutParams().isCollapsible()) {
                return 1;
            }
        }

        return 0;
    }

    boolean hasScrollableChildren() {
        boolean v0 = this.getTotalScrollRange() != 0 ? true : false;
        return v0;
    }

    private void invalidateScrollRanges() {
        this.totalScrollRange = -1;
        this.downPreScrollRange = -1;
        this.downScrollRange = -1;
    }

    public boolean isLiftOnScroll() {
        return this.liftOnScroll;
    }

    protected int[] onCreateDrawableState(int arg4) {
        if(this.tmpStatesArray == null) {
            this.tmpStatesArray = new int[4];
        }

        int[] v0 = this.tmpStatesArray;
        int[] v4 = super.onCreateDrawableState(arg4 + v0.length);
        int v2 = this.liftable ? R$attr.state_liftable : -R$attr.state_liftable;
        v0[0] = v2;
        v2 = !this.liftable || !this.lifted ? -R$attr.state_lifted : R$attr.state_lifted;
        v0[1] = v2;
        int v1 = 2;
        v2 = this.liftable ? R$attr.state_collapsible : -R$attr.state_collapsible;
        v0[v1] = v2;
        v1 = 3;
        v2 = !this.liftable || !this.lifted ? -R$attr.state_collapsed : R$attr.state_collapsed;
        v0[v1] = v2;
        return AppBarLayout.mergeDrawableStates(v4, v0);
    }

    protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        super.onLayout(arg1, arg2, arg3, arg4, arg5);
        this.invalidateScrollRanges();
        arg1 = false;
        this.haveChildWithInterpolator = false;
        arg2 = this.getChildCount();
        arg3 = 0;
        while(arg3 < arg2) {
            if(this.getChildAt(arg3).getLayoutParams().getScrollInterpolator() != null) {
                this.haveChildWithInterpolator = true;
            }
            else {
                ++arg3;
                continue;
            }

            break;
        }

        if(!this.liftableOverride) {
            if((this.liftOnScroll) || (this.hasCollapsibleChild())) {
                arg1 = true;
            }

            this.setLiftableState(arg1);
        }
    }

    protected void onMeasure(int arg1, int arg2) {
        super.onMeasure(arg1, arg2);
        this.invalidateScrollRanges();
    }

    WindowInsetsCompat onWindowInsetChanged(WindowInsetsCompat arg3) {
        WindowInsetsCompat v0;
        if(ViewCompat.getFitsSystemWindows(((View)this))) {
            v0 = arg3;
        }
        else {
            Object v0_1 = null;
        }

        if(!ObjectsCompat.equals(this.lastInsets, v0)) {
            this.lastInsets = v0;
            this.invalidateScrollRanges();
        }

        return arg3;
    }

    public void removeOnOffsetChangedListener(BaseOnOffsetChangedListener arg2) {
        if(this.listeners != null && arg2 != null) {
            this.listeners.remove(arg2);
        }
    }

    public void removeOnOffsetChangedListener(OnOffsetChangedListener arg1) {
        this.removeOnOffsetChangedListener(((BaseOnOffsetChangedListener)arg1));
    }

    void resetPendingAction() {
        this.pendingAction = 0;
    }

    private void setExpanded(boolean arg2, boolean arg3, boolean arg4) {
        int v2 = arg2 ? 1 : 2;
        int v0 = 0;
        int v3 = arg3 ? 4 : 0;
        v2 |= v3;
        if(arg4) {
            v0 = 8;
        }

        this.pendingAction = v2 | v0;
        this.requestLayout();
    }

    public void setExpanded(boolean arg2) {
        this.setExpanded(arg2, ViewCompat.isLaidOut(((View)this)));
    }

    public void setExpanded(boolean arg2, boolean arg3) {
        this.setExpanded(arg2, arg3, true);
    }

    public void setLiftOnScroll(boolean arg1) {
        this.liftOnScroll = arg1;
    }

    public boolean setLiftable(boolean arg2) {
        this.liftableOverride = true;
        return this.setLiftableState(arg2);
    }

    private boolean setLiftableState(boolean arg2) {
        if(this.liftable != arg2) {
            this.liftable = arg2;
            this.refreshDrawableState();
            return 1;
        }

        return 0;
    }

    public boolean setLifted(boolean arg1) {
        return this.setLiftedState(arg1);
    }

    boolean setLiftedState(boolean arg2) {
        if(this.lifted != arg2) {
            this.lifted = arg2;
            this.refreshDrawableState();
            return 1;
        }

        return 0;
    }

    public void setOrientation(int arg2) {
        if(arg2 == 1) {
            super.setOrientation(arg2);
            return;
        }

        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    @Deprecated public void setTargetElevation(float arg3) {
        if(Build$VERSION.SDK_INT >= 21) {
            ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(((View)this), arg3);
        }
    }
}

