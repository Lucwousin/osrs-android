package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region$Op;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View$BaseSavedState;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver$OnPreDrawListener;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.R$attr;
import androidx.coordinatorlayout.R$style;
import androidx.coordinatorlayout.R$styleable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pools$Pool;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.core.view.GravityCompat;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2 {
    public interface AttachedBehavior {
        @NonNull Behavior getBehavior();
    }

    public abstract class Behavior {
        public Behavior() {
            super();
        }

        public Behavior(Context arg1, AttributeSet arg2) {
            super();
        }

        public boolean blocksInteractionBelow(@NonNull CoordinatorLayout arg1, @NonNull View arg2) {
            boolean v1 = this.getScrimOpacity(arg1, arg2) > 0f ? true : false;
            return v1;
        }

        public boolean getInsetDodgeRect(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull Rect arg3) {
            return 0;
        }

        @ColorInt public int getScrimColor(@NonNull CoordinatorLayout arg1, @NonNull View arg2) {
            return 0xFF000000;
        }

        @FloatRange(from=0, to=1) public float getScrimOpacity(@NonNull CoordinatorLayout arg1, @NonNull View arg2) {
            return 0;
        }

        @Nullable public static Object getTag(@NonNull View arg0) {
            return arg0.getLayoutParams().mBehaviorTag;
        }

        public boolean layoutDependsOn(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3) {
            return 0;
        }

        @NonNull public WindowInsetsCompat onApplyWindowInsets(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull WindowInsetsCompat arg3) {
            return arg3;
        }

        public void onAttachedToLayoutParams(@NonNull LayoutParams arg1) {
        }

        public boolean onDependentViewChanged(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3) {
            return 0;
        }

        public void onDependentViewRemoved(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3) {
        }

        public void onDetachedFromLayoutParams() {
        }

        public boolean onInterceptTouchEvent(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull MotionEvent arg3) {
            return 0;
        }

        public boolean onLayoutChild(@NonNull CoordinatorLayout arg1, @NonNull View arg2, int arg3) {
            return 0;
        }

        public boolean onMeasureChild(@NonNull CoordinatorLayout arg1, @NonNull View arg2, int arg3, int arg4, int arg5, int arg6) {
            return 0;
        }

        public boolean onNestedFling(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, float arg4, float arg5, boolean arg6) {
            return 0;
        }

        public boolean onNestedPreFling(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, float arg4, float arg5) {
            return 0;
        }

        public void onNestedPreScroll(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, int arg4, int arg5, @NonNull int[] arg6, int arg7) {
            if(arg7 == 0) {
                this.onNestedPreScroll(arg1, arg2, arg3, arg4, arg5, arg6);
            }
        }

        @Deprecated public void onNestedPreScroll(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, int arg4, int arg5, @NonNull int[] arg6) {
        }

        public void onNestedScroll(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
            if(arg8 == 0) {
                this.onNestedScroll(arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            }
        }

        @Deprecated public void onNestedScroll(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, int arg4, int arg5, int arg6, int arg7) {
        }

        public void onNestedScrollAccepted(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, @NonNull View arg4, int arg5, int arg6) {
            if(arg6 == 0) {
                this.onNestedScrollAccepted(arg1, arg2, arg3, arg4, arg5);
            }
        }

        @Deprecated public void onNestedScrollAccepted(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, @NonNull View arg4, int arg5) {
        }

        public boolean onRequestChildRectangleOnScreen(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull Rect arg3, boolean arg4) {
            return 0;
        }

        public void onRestoreInstanceState(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull Parcelable arg3) {
        }

        @Nullable public Parcelable onSaveInstanceState(@NonNull CoordinatorLayout arg1, @NonNull View arg2) {
            return View$BaseSavedState.EMPTY_STATE;
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, @NonNull View arg4, int arg5, int arg6) {
            if(arg6 == 0) {
                return this.onStartNestedScroll(arg1, arg2, arg3, arg4, arg5);
            }

            return 0;
        }

        @Deprecated public boolean onStartNestedScroll(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, @NonNull View arg4, int arg5) {
            return 0;
        }

        public void onStopNestedScroll(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, int arg4) {
            if(arg4 == 0) {
                this.onStopNestedScroll(arg1, arg2, arg3);
            }
        }

        @Deprecated public void onStopNestedScroll(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3) {
        }

        public boolean onTouchEvent(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull MotionEvent arg3) {
            return 0;
        }

        public static void setTag(@NonNull View arg0, @Nullable Object arg1) {
            arg0.getLayoutParams().mBehaviorTag = arg1;
        }
    }

    @Deprecated @Retention(value=RetentionPolicy.RUNTIME) @public interface DefaultBehavior {
        Class value();
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface DispatchChangeEvent {
    }

    class HierarchyChangeListener implements ViewGroup$OnHierarchyChangeListener {
        HierarchyChangeListener(CoordinatorLayout arg1) {
            CoordinatorLayout.this = arg1;
            super();
        }

        public void onChildViewAdded(View arg2, View arg3) {
            if(CoordinatorLayout.this.mOnHierarchyChangeListener != null) {
                CoordinatorLayout.this.mOnHierarchyChangeListener.onChildViewAdded(arg2, arg3);
            }
        }

        public void onChildViewRemoved(View arg3, View arg4) {
            CoordinatorLayout.this.onChildViewsChanged(2);
            if(CoordinatorLayout.this.mOnHierarchyChangeListener != null) {
                CoordinatorLayout.this.mOnHierarchyChangeListener.onChildViewRemoved(arg3, arg4);
            }
        }
    }

    public class LayoutParams extends ViewGroup$MarginLayoutParams {
        public int anchorGravity;
        public int dodgeInsetEdges;
        public int gravity;
        public int insetEdge;
        public int keyline;
        View mAnchorDirectChild;
        int mAnchorId;
        View mAnchorView;
        Behavior mBehavior;
        boolean mBehaviorResolved;
        Object mBehaviorTag;
        private boolean mDidAcceptNestedScrollNonTouch;
        private boolean mDidAcceptNestedScrollTouch;
        private boolean mDidBlockInteraction;
        private boolean mDidChangeAfterNestedScroll;
        int mInsetOffsetX;
        int mInsetOffsetY;
        final Rect mLastChildRect;

        public LayoutParams(int arg1, int arg2) {
            super(arg1, arg2);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        LayoutParams(@NonNull Context arg5, @Nullable AttributeSet arg6) {
            super(arg5, arg6);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
            TypedArray v2 = arg5.obtainStyledAttributes(arg6, R$styleable.CoordinatorLayout_Layout);
            this.gravity = v2.getInteger(R$styleable.CoordinatorLayout_Layout_android_layout_gravity, 0);
            this.mAnchorId = v2.getResourceId(R$styleable.CoordinatorLayout_Layout_layout_anchor, -1);
            this.anchorGravity = v2.getInteger(R$styleable.CoordinatorLayout_Layout_layout_anchorGravity, 0);
            this.keyline = v2.getInteger(R$styleable.CoordinatorLayout_Layout_layout_keyline, -1);
            this.insetEdge = v2.getInt(R$styleable.CoordinatorLayout_Layout_layout_insetEdge, 0);
            this.dodgeInsetEdges = v2.getInt(R$styleable.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
            this.mBehaviorResolved = v2.hasValue(R$styleable.CoordinatorLayout_Layout_layout_behavior);
            if(this.mBehaviorResolved) {
                this.mBehavior = CoordinatorLayout.parseBehavior(arg5, arg6, v2.getString(R$styleable.CoordinatorLayout_Layout_layout_behavior));
            }

            v2.recycle();
            if(this.mBehavior != null) {
                this.mBehavior.onAttachedToLayoutParams(this);
            }
        }

        public LayoutParams(LayoutParams arg2) {
            super(((ViewGroup$MarginLayoutParams)arg2));
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        public LayoutParams(ViewGroup$MarginLayoutParams arg2) {
            super(arg2);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        public LayoutParams(ViewGroup$LayoutParams arg2) {
            super(arg2);
            this.mBehaviorResolved = false;
            this.gravity = 0;
            this.anchorGravity = 0;
            this.keyline = -1;
            this.mAnchorId = -1;
            this.insetEdge = 0;
            this.dodgeInsetEdges = 0;
            this.mLastChildRect = new Rect();
        }

        boolean checkAnchorChanged() {
            boolean v0 = this.mAnchorView != null || this.mAnchorId == -1 ? false : true;
            return v0;
        }

        boolean dependsOn(CoordinatorLayout arg2, View arg3, View arg4) {
            boolean v2;
            if(arg4 == this.mAnchorDirectChild || (this.shouldDodge(arg4, ViewCompat.getLayoutDirection(((View)arg2))))) {
            label_13:
                v2 = true;
            }
            else {
                if(this.mBehavior != null && (this.mBehavior.layoutDependsOn(arg2, arg3, arg4))) {
                    goto label_13;
                }

                v2 = false;
            }

            return v2;
        }

        boolean didBlockInteraction() {
            if(this.mBehavior == null) {
                this.mDidBlockInteraction = false;
            }

            return this.mDidBlockInteraction;
        }

        View findAnchorView(CoordinatorLayout arg3, View arg4) {
            if(this.mAnchorId == -1) {
                this.mAnchorDirectChild = null;
                this.mAnchorView = null;
                return null;
            }

            if(this.mAnchorView == null || !this.verifyAnchorView(arg4, arg3)) {
                this.resolveAnchorView(arg4, arg3);
            }

            return this.mAnchorView;
        }

        @IdRes public int getAnchorId() {
            return this.mAnchorId;
        }

        @Nullable public Behavior getBehavior() {
            return this.mBehavior;
        }

        boolean getChangedAfterNestedScroll() {
            return this.mDidChangeAfterNestedScroll;
        }

        Rect getLastChildRect() {
            return this.mLastChildRect;
        }

        void invalidateAnchor() {
            this.mAnchorDirectChild = null;
            this.mAnchorView = null;
        }

        boolean isBlockingInteractionBelow(CoordinatorLayout arg3, View arg4) {
            int v3_1;
            boolean v3;
            if(this.mDidBlockInteraction) {
                return 1;
            }

            boolean v0 = this.mDidBlockInteraction;
            if(this.mBehavior != null) {
                v3 = this.mBehavior.blocksInteractionBelow(arg3, arg4);
            }
            else {
                v3_1 = 0;
            }

            v3_1 = (((int)v3)) | (((int)v0));
            this.mDidBlockInteraction = ((boolean)v3_1);
            return ((boolean)v3_1);
        }

        boolean isNestedScrollAccepted(int arg1) {
            switch(arg1) {
                case 0: {
                    goto label_5;
                }
                case 1: {
                    goto label_3;
                }
            }

            return 0;
        label_3:
            return this.mDidAcceptNestedScrollNonTouch;
        label_5:
            return this.mDidAcceptNestedScrollTouch;
        }

        void resetChangedAfterNestedScroll() {
            this.mDidChangeAfterNestedScroll = false;
        }

        void resetNestedScroll(int arg2) {
            this.setNestedScrollAccepted(arg2, false);
        }

        void resetTouchBehaviorTracking() {
            this.mDidBlockInteraction = false;
        }

        private void resolveAnchorView(View arg5, CoordinatorLayout arg6) {
            ViewParent v0_1;
            this.mAnchorView = arg6.findViewById(this.mAnchorId);
            View v1 = null;
            if(this.mAnchorView != null) {
                if(this.mAnchorView == arg6) {
                    if(arg6.isInEditMode()) {
                        this.mAnchorDirectChild = v1;
                        this.mAnchorView = v1;
                        return;
                    }

                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }

                View v0 = this.mAnchorView;
                ViewParent v2 = this.mAnchorView.getParent();
                while((((CoordinatorLayout)v2)) != arg6) {
                    if(v2 == null) {
                        break;
                    }

                    if((((View)v2)) != arg5) {
                        if((v2 instanceof View)) {
                            v0_1 = v2;
                        }

                        v2 = v2.getParent();
                        continue;
                    }
                    else if(arg6.isInEditMode()) {
                        this.mAnchorDirectChild = v1;
                        this.mAnchorView = v1;
                        return;
                    }
                    else {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }

                    break;
                }

                this.mAnchorDirectChild = ((View)v0_1);
                return;
            }

            if(arg6.isInEditMode()) {
                this.mAnchorDirectChild = v1;
                this.mAnchorView = v1;
                return;
            }

            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("Could not find CoordinatorLayout descendant view with id ");
            v1_1.append(arg6.getResources().getResourceName(this.mAnchorId));
            v1_1.append(" to anchor view ");
            v1_1.append(arg5);
            throw new IllegalStateException(v1_1.toString());
        }

        public void setAnchorId(@IdRes int arg1) {
            this.invalidateAnchor();
            this.mAnchorId = arg1;
        }

        public void setBehavior(@Nullable Behavior arg2) {
            if(this.mBehavior != arg2) {
                if(this.mBehavior != null) {
                    this.mBehavior.onDetachedFromLayoutParams();
                }

                this.mBehavior = arg2;
                this.mBehaviorTag = null;
                this.mBehaviorResolved = true;
                if(arg2 == null) {
                    return;
                }

                arg2.onAttachedToLayoutParams(this);
            }
        }

        void setChangedAfterNestedScroll(boolean arg1) {
            this.mDidChangeAfterNestedScroll = arg1;
        }

        void setLastChildRect(Rect arg2) {
            this.mLastChildRect.set(arg2);
        }

        void setNestedScrollAccepted(int arg1, boolean arg2) {
            switch(arg1) {
                case 0: {
                    this.mDidAcceptNestedScrollTouch = arg2;
                    break;
                }
                case 1: {
                    this.mDidAcceptNestedScrollNonTouch = arg2;
                    break;
                }
                default: {
                    break;
                }
            }
        }

        private boolean shouldDodge(View arg2, int arg3) {
            int v2 = GravityCompat.getAbsoluteGravity(arg2.getLayoutParams().insetEdge, arg3);
            boolean v2_1 = v2 == 0 || (GravityCompat.getAbsoluteGravity(this.dodgeInsetEdges, arg3) & v2) != v2 ? false : true;
            return v2_1;
        }

        private boolean verifyAnchorView(View arg5, CoordinatorLayout arg6) {
            if(this.mAnchorView.getId() != this.mAnchorId) {
                return 0;
            }

            View v0 = this.mAnchorView;
            ViewParent v1 = this.mAnchorView.getParent();
            while(true) {
                if((((CoordinatorLayout)v1)) == arg6) {
                    goto label_22;
                }

                if(v1 != null) {
                    if((((View)v1)) == arg5) {
                    }
                    else {
                        if((v1 instanceof View)) {
                            ViewParent v0_1 = v1;
                        }

                        v1 = v1.getParent();
                        continue;
                    }
                }

                break;
            }

            this.mAnchorDirectChild = null;
            this.mAnchorView = null;
            return 0;
        label_22:
            this.mAnchorDirectChild = v0;
            return 1;
        }
    }

    class OnPreDrawListener implements ViewTreeObserver$OnPreDrawListener {
        OnPreDrawListener(CoordinatorLayout arg1) {
            CoordinatorLayout.this = arg1;
            super();
        }

        public boolean onPreDraw() {
            CoordinatorLayout.this.onChildViewsChanged(0);
            return 1;
        }
    }

    public class SavedState extends AbsSavedState {
        final class androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1 implements Parcelable$ClassLoaderCreator {
            androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1() {
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
        SparseArray behaviorStates;

        static {
            SavedState.CREATOR = new androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1();
        }

        public SavedState(Parcelable arg1) {
            super(arg1);
        }

        public SavedState(Parcel arg6, ClassLoader arg7) {
            super(arg6, arg7);
            int v0 = arg6.readInt();
            int[] v1 = new int[v0];
            arg6.readIntArray(v1);
            Parcelable[] v6 = arg6.readParcelableArray(arg7);
            this.behaviorStates = new SparseArray(v0);
            int v7;
            for(v7 = 0; v7 < v0; ++v7) {
                this.behaviorStates.append(v1[v7], v6[v7]);
            }
        }

        public void writeToParcel(Parcel arg6, int arg7) {
            super.writeToParcel(arg6, arg7);
            int v1 = 0;
            int v0 = this.behaviorStates != null ? this.behaviorStates.size() : 0;
            arg6.writeInt(v0);
            int[] v2 = new int[v0];
            Parcelable[] v3 = new Parcelable[v0];
            while(v1 < v0) {
                v2[v1] = this.behaviorStates.keyAt(v1);
                v3[v1] = this.behaviorStates.valueAt(v1);
                ++v1;
            }

            arg6.writeIntArray(v2);
            arg6.writeParcelableArray(v3, arg7);
        }
    }

    class ViewElevationComparator implements Comparator {
        ViewElevationComparator() {
            super();
        }

        public int compare(View arg2, View arg3) {
            float v2 = ViewCompat.getZ(arg2);
            float v3 = ViewCompat.getZ(arg3);
            if(v2 > v3) {
                return -1;
            }

            if(v2 < v3) {
                return 1;
            }

            return 0;
        }

        public int compare(Object arg1, Object arg2) {
            return this.compare(((View)arg1), ((View)arg2));
        }
    }

    static final Class[] CONSTRUCTOR_PARAMS = null;
    static final int EVENT_NESTED_SCROLL = 1;
    static final int EVENT_PRE_DRAW = 0;
    static final int EVENT_VIEW_REMOVED = 2;
    static final String TAG = "CoordinatorLayout";
    static final Comparator TOP_SORTED_CHILDREN_COMPARATOR = null;
    private static final int TYPE_ON_INTERCEPT = 0;
    private static final int TYPE_ON_TOUCH = 1;
    static final String WIDGET_PACKAGE_NAME;
    private OnApplyWindowInsetsListener mApplyWindowInsetsListener;
    private View mBehaviorTouchView;
    private final DirectedAcyclicGraph mChildDag;
    private final List mDependencySortedChildren;
    private boolean mDisallowInterceptReset;
    private boolean mDrawStatusBarBackground;
    private boolean mIsAttachedToWindow;
    private int[] mKeylines;
    private WindowInsetsCompat mLastInsets;
    private boolean mNeedsPreDrawListener;
    private final NestedScrollingParentHelper mNestedScrollingParentHelper;
    private View mNestedScrollingTarget;
    ViewGroup$OnHierarchyChangeListener mOnHierarchyChangeListener;
    private OnPreDrawListener mOnPreDrawListener;
    private Paint mScrimPaint;
    private Drawable mStatusBarBackground;
    private final List mTempDependenciesList;
    private final int[] mTempIntPair;
    private final List mTempList1;
    static final ThreadLocal sConstructors;
    private static final Pool sRectPool;

    static {
        Package v0 = CoordinatorLayout.class.getPackage();
        Comparator v1 = null;
        String v0_1 = v0 != null ? v0.getName() : ((String)v1);
        CoordinatorLayout.WIDGET_PACKAGE_NAME = v0_1;
        CoordinatorLayout.TOP_SORTED_CHILDREN_COMPARATOR = Build$VERSION.SDK_INT >= 21 ? new ViewElevationComparator() : v1;
        CoordinatorLayout.CONSTRUCTOR_PARAMS = new Class[]{Context.class, AttributeSet.class};
        CoordinatorLayout.sConstructors = new ThreadLocal();
        CoordinatorLayout.sRectPool = new SynchronizedPool(12);
    }

    public CoordinatorLayout(@NonNull Context arg2) {
        this(arg2, null);
    }

    public CoordinatorLayout(@NonNull Context arg2, @Nullable AttributeSet arg3) {
        this(arg2, arg3, R$attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(@NonNull Context arg4, @Nullable AttributeSet arg5, @AttrRes int arg6) {
        super(arg4, arg5, arg6);
        this.mDependencySortedChildren = new ArrayList();
        this.mChildDag = new DirectedAcyclicGraph();
        this.mTempList1 = new ArrayList();
        this.mTempDependenciesList = new ArrayList();
        this.mTempIntPair = new int[2];
        this.mNestedScrollingParentHelper = new NestedScrollingParentHelper(((ViewGroup)this));
        int v0 = 0;
        TypedArray v5 = arg6 == 0 ? arg4.obtainStyledAttributes(arg5, R$styleable.CoordinatorLayout, 0, R$style.Widget_Support_CoordinatorLayout) : arg4.obtainStyledAttributes(arg5, R$styleable.CoordinatorLayout, arg6, 0);
        arg6 = v5.getResourceId(R$styleable.CoordinatorLayout_keylines, 0);
        if(arg6 != 0) {
            Resources v4 = arg4.getResources();
            this.mKeylines = v4.getIntArray(arg6);
            float v4_1 = v4.getDisplayMetrics().density;
            arg6 = this.mKeylines.length;
            while(v0 < arg6) {
                this.mKeylines[v0] = ((int)((((float)this.mKeylines[v0])) * v4_1));
                ++v0;
            }
        }

        this.mStatusBarBackground = v5.getDrawable(R$styleable.CoordinatorLayout_statusBarBackground);
        v5.recycle();
        this.setupForInsets();
        super.setOnHierarchyChangeListener(new HierarchyChangeListener(this));
    }

    @NonNull private static Rect acquireTempRect() {
        Rect v0_1;
        Object v0 = CoordinatorLayout.sRectPool.acquire();
        if(v0 == null) {
            v0_1 = new Rect();
        }

        return v0_1;
    }

    void addPreDrawListener() {
        if(this.mIsAttachedToWindow) {
            if(this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new OnPreDrawListener(this);
            }

            this.getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }

        this.mNeedsPreDrawListener = true;
    }

    protected boolean checkLayoutParams(ViewGroup$LayoutParams arg2) {
        boolean v2 = !(arg2 instanceof LayoutParams) || !super.checkLayoutParams(arg2) ? false : true;
        return v2;
    }

    private static int clamp(int arg0, int arg1, int arg2) {
        if(arg0 < arg1) {
            return arg1;
        }

        if(arg0 > arg2) {
            return arg2;
        }

        return arg0;
    }

    private void constrainChildRect(LayoutParams arg6, Rect arg7, int arg8, int arg9) {
        int v0 = this.getWidth();
        int v1 = this.getHeight();
        v0 = Math.max(this.getPaddingLeft() + arg6.leftMargin, Math.min(arg7.left, v0 - this.getPaddingRight() - arg8 - arg6.rightMargin));
        int v6 = Math.max(this.getPaddingTop() + arg6.topMargin, Math.min(arg7.top, v1 - this.getPaddingBottom() - arg9 - arg6.bottomMargin));
        arg7.set(v0, v6, arg8 + v0, arg9 + v6);
    }

    private WindowInsetsCompat dispatchApplyWindowInsetsToBehaviors(WindowInsetsCompat arg5) {
        if(arg5.isConsumed()) {
            return arg5;
        }

        int v0 = 0;
        int v1 = this.getChildCount();
        while(v0 < v1) {
            View v2 = this.getChildAt(v0);
            if(ViewCompat.getFitsSystemWindows(v2)) {
                Behavior v3 = v2.getLayoutParams().getBehavior();
                if(v3 != null) {
                    arg5 = v3.onApplyWindowInsets(this, v2, arg5);
                    if(arg5.isConsumed()) {
                        return arg5;
                    }
                }
            }

            ++v0;
        }

        return arg5;
    }

    public void dispatchDependentViewsChanged(@NonNull View arg5) {
        List v0 = this.mChildDag.getIncomingEdges(arg5);
        if(v0 != null && !v0.isEmpty()) {
            int v1;
            for(v1 = 0; v1 < v0.size(); ++v1) {
                Object v2 = v0.get(v1);
                Behavior v3 = ((View)v2).getLayoutParams().getBehavior();
                if(v3 != null) {
                    v3.onDependentViewChanged(this, ((View)v2), arg5);
                }
            }
        }
    }

    public boolean doViewsOverlap(@NonNull View arg5, @NonNull View arg6) {
        boolean v1 = false;
        if(arg5.getVisibility() == 0 && arg6.getVisibility() == 0) {
            Rect v0 = CoordinatorLayout.acquireTempRect();
            boolean v2 = arg5.getParent() != this ? true : false;
            this.getChildRect(arg5, v2, v0);
            Rect v5 = CoordinatorLayout.acquireTempRect();
            v2 = arg6.getParent() != this ? true : false;
            this.getChildRect(arg6, v2, v5);
            try {
                if(v0.left <= v5.right && v0.top <= v5.bottom && v0.right >= v5.left) {
                    if(v0.bottom < v5.top) {
                        goto label_33;
                    }

                    goto label_32;
                }

                goto label_33;
            }
            catch(Throwable v6) {
                CoordinatorLayout.releaseTempRect(v0);
                CoordinatorLayout.releaseTempRect(v5);
                throw v6;
            }

        label_32:
            v1 = true;
        label_33:
            CoordinatorLayout.releaseTempRect(v0);
            CoordinatorLayout.releaseTempRect(v5);
            return v1;
        }

        return 0;
    }

    protected boolean drawChild(Canvas arg9, View arg10, long arg11) {
        ViewGroup$LayoutParams v0 = arg10.getLayoutParams();
        if(((LayoutParams)v0).mBehavior != null) {
            float v1 = ((LayoutParams)v0).mBehavior.getScrimOpacity(this, arg10);
            if(v1 > 0f) {
                if(this.mScrimPaint == null) {
                    this.mScrimPaint = new Paint();
                }

                this.mScrimPaint.setColor(((LayoutParams)v0).mBehavior.getScrimColor(this, arg10));
                this.mScrimPaint.setAlpha(CoordinatorLayout.clamp(Math.round(v1 * 255f), 0, 0xFF));
                int v0_1 = arg9.save();
                if(arg10.isOpaque()) {
                    arg9.clipRect(((float)arg10.getLeft()), ((float)arg10.getTop()), ((float)arg10.getRight()), ((float)arg10.getBottom()), Region$Op.DIFFERENCE);
                }

                arg9.drawRect(((float)this.getPaddingLeft()), ((float)this.getPaddingTop()), ((float)(this.getWidth() - this.getPaddingRight())), ((float)(this.getHeight() - this.getPaddingBottom())), this.mScrimPaint);
                arg9.restoreToCount(v0_1);
            }
        }

        return super.drawChild(arg9, arg10, arg11);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] v0 = this.getDrawableState();
        Drawable v1 = this.mStatusBarBackground;
        int v2 = 0;
        if(v1 != null && (v1.isStateful())) {
            v2 = 0 | v1.setState(v0);
        }

        if(v2 != 0) {
            this.invalidate();
        }
    }

    void ensurePreDrawListener() {
        int v0 = this.getChildCount();
        boolean v1 = false;
        int v2 = 0;
        while(v2 < v0) {
            if(this.hasDependencies(this.getChildAt(v2))) {
                v1 = true;
            }
            else {
                ++v2;
                continue;
            }

            break;
        }

        if(v1 != this.mNeedsPreDrawListener) {
            if(v1) {
                this.addPreDrawListener();
            }
            else {
                this.removePreDrawListener();
            }
        }
    }

    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return this.generateDefaultLayoutParams();
    }

    protected LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
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

    protected LayoutParams generateLayoutParams(ViewGroup$LayoutParams arg2) {
        if((arg2 instanceof LayoutParams)) {
            return new LayoutParams(((LayoutParams)arg2));
        }

        if((arg2 instanceof ViewGroup$MarginLayoutParams)) {
            return new LayoutParams(((ViewGroup$MarginLayoutParams)arg2));
        }

        return new LayoutParams(arg2);
    }

    void getChildRect(View arg3, boolean arg4, Rect arg5) {
        if(!arg3.isLayoutRequested()) {
            if(arg3.getVisibility() == 8) {
            }
            else {
                if(arg4) {
                    this.getDescendantRect(arg3, arg5);
                }
                else {
                    arg5.set(arg3.getLeft(), arg3.getTop(), arg3.getRight(), arg3.getBottom());
                }

                return;
            }
        }

        arg5.setEmpty();
    }

    @NonNull public List getDependencies(@NonNull View arg2) {
        List v2 = this.mChildDag.getOutgoingEdges(arg2);
        this.mTempDependenciesList.clear();
        if(v2 != null) {
            this.mTempDependenciesList.addAll(((Collection)v2));
        }

        return this.mTempDependenciesList;
    }

    @VisibleForTesting final List getDependencySortedChildren() {
        this.prepareChildren();
        return Collections.unmodifiableList(this.mDependencySortedChildren);
    }

    @NonNull public List getDependents(@NonNull View arg2) {
        List v2 = this.mChildDag.getIncomingEdges(arg2);
        this.mTempDependenciesList.clear();
        if(v2 != null) {
            this.mTempDependenciesList.addAll(((Collection)v2));
        }

        return this.mTempDependenciesList;
    }

    void getDescendantRect(View arg1, Rect arg2) {
        ViewGroupUtils.getDescendantRect(((ViewGroup)this), arg1, arg2);
    }

    void getDesiredAnchoredChildRect(View arg12, int arg13, Rect arg14, Rect arg15) {
        ViewGroup$LayoutParams v0 = arg12.getLayoutParams();
        int v9 = arg12.getMeasuredWidth();
        int v10 = arg12.getMeasuredHeight();
        this.getDesiredAnchoredChildRectWithoutConstraints(arg12, arg13, arg14, arg15, v0, v9, v10);
        this.constrainChildRect(((LayoutParams)v0), arg15, v9, v10);
    }

    private void getDesiredAnchoredChildRectWithoutConstraints(View arg6, int arg7, Rect arg8, Rect arg9, LayoutParams arg10, int arg11, int arg12) {
        int v6 = GravityCompat.getAbsoluteGravity(CoordinatorLayout.resolveAnchoredChildGravity(arg10.gravity), arg7);
        arg7 = GravityCompat.getAbsoluteGravity(CoordinatorLayout.resolveGravity(arg10.anchorGravity), arg7);
        int v10 = v6 & 7;
        v6 &= 0x70;
        int v0 = arg7 & 7;
        arg7 &= 0x70;
        int v1 = 5;
        if(v0 == 1) {
            v0 = arg8.left + arg8.width() / 2;
        }
        else if(v0 != v1) {
            v0 = arg8.left;
        }
        else {
            v0 = arg8.right;
        }

        int v3 = 80;
        int v4 = 16;
        if(arg7 == v4) {
            arg7 = arg8.top + arg8.height() / 2;
        }
        else if(arg7 != v3) {
            arg7 = arg8.top;
        }
        else {
            arg7 = arg8.bottom;
        }

        if(v10 == 1) {
            v0 -= arg11 / 2;
        }
        else if(v10 != v1) {
            v0 -= arg11;
        }

        if(v6 == v4) {
            arg7 -= arg12 / 2;
        }
        else if(v6 != v3) {
            arg7 -= arg12;
        }

        arg9.set(v0, arg7, arg11 + v0, arg12 + arg7);
    }

    private int getKeyline(int arg5) {
        if(this.mKeylines == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + arg5);
            return 0;
        }

        if(arg5 >= 0) {
            if(arg5 >= this.mKeylines.length) {
            }
            else {
                return this.mKeylines[arg5];
            }
        }

        Log.e("CoordinatorLayout", "Keyline index " + arg5 + " out of range for " + this);
        return 0;
    }

    void getLastChildRect(View arg1, Rect arg2) {
        arg2.set(arg1.getLayoutParams().getLastChildRect());
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public final WindowInsetsCompat getLastWindowInsets() {
        return this.mLastInsets;
    }

    public int getNestedScrollAxes() {
        return this.mNestedScrollingParentHelper.getNestedScrollAxes();
    }

    LayoutParams getResolvedLayoutParams(View arg7) {
        ViewGroup$LayoutParams v0 = arg7.getLayoutParams();
        if(!((LayoutParams)v0).mBehaviorResolved) {
            if((arg7 instanceof AttachedBehavior)) {
                Behavior v7 = ((AttachedBehavior)arg7).getBehavior();
                if(v7 == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }

                ((LayoutParams)v0).setBehavior(v7);
                ((LayoutParams)v0).mBehaviorResolved = true;
                goto label_47;
            }

            Class v7_1 = arg7.getClass();
            Annotation v1 = null;
            while(v7_1 != null) {
                v1 = v7_1.getAnnotation(DefaultBehavior.class);
                if(v1 != null) {
                    break;
                }

                v7_1 = v7_1.getSuperclass();
            }

            if(v1 != null) {
                try {
                    ((LayoutParams)v0).setBehavior(((DefaultBehavior)v1).value().getDeclaredConstructor().newInstance());
                }
                catch(Exception v7_2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + ((DefaultBehavior)v1).value().getName() + " could not be instantiated. Did you forget" + " a default constructor?", ((Throwable)v7_2));
                }
            }

            ((LayoutParams)v0).mBehaviorResolved = true;
        }

    label_47:
        return ((LayoutParams)v0);
    }

    @Nullable public Drawable getStatusBarBackground() {
        return this.mStatusBarBackground;
    }

    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), this.getPaddingTop() + this.getPaddingBottom());
    }

    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), this.getPaddingLeft() + this.getPaddingRight());
    }

    private void getTopSortedChildren(List arg5) {
        arg5.clear();
        boolean v0 = this.isChildrenDrawingOrderEnabled();
        int v1 = this.getChildCount();
        int v2;
        for(v2 = v1 - 1; v2 >= 0; --v2) {
            int v3 = v0 ? this.getChildDrawingOrder(v1, v2) : v2;
            arg5.add(this.getChildAt(v3));
        }

        if(CoordinatorLayout.TOP_SORTED_CHILDREN_COMPARATOR != null) {
            Collections.sort(arg5, CoordinatorLayout.TOP_SORTED_CHILDREN_COMPARATOR);
        }
    }

    private boolean hasDependencies(View arg2) {
        return this.mChildDag.hasOutgoingEdges(arg2);
    }

    public boolean isPointInChildBounds(@NonNull View arg2, int arg3, int arg4) {
        boolean v2_1;
        Rect v0 = CoordinatorLayout.acquireTempRect();
        this.getDescendantRect(arg2, v0);
        try {
            v2_1 = v0.contains(arg3, arg4);
        }
        catch(Throwable v2) {
            CoordinatorLayout.releaseTempRect(v0);
            throw v2;
        }

        CoordinatorLayout.releaseTempRect(v0);
        return v2_1;
    }

    private void layoutChild(View arg10, int arg11) {
        ViewGroup$LayoutParams v0 = arg10.getLayoutParams();
        Rect v7 = CoordinatorLayout.acquireTempRect();
        v7.set(this.getPaddingLeft() + ((LayoutParams)v0).leftMargin, this.getPaddingTop() + ((LayoutParams)v0).topMargin, this.getWidth() - this.getPaddingRight() - ((LayoutParams)v0).rightMargin, this.getHeight() - this.getPaddingBottom() - ((LayoutParams)v0).bottomMargin);
        if(this.mLastInsets != null && (ViewCompat.getFitsSystemWindows(((View)this))) && !ViewCompat.getFitsSystemWindows(arg10)) {
            v7.left += this.mLastInsets.getSystemWindowInsetLeft();
            v7.top += this.mLastInsets.getSystemWindowInsetTop();
            v7.right -= this.mLastInsets.getSystemWindowInsetRight();
            v7.bottom -= this.mLastInsets.getSystemWindowInsetBottom();
        }

        Rect v8 = CoordinatorLayout.acquireTempRect();
        GravityCompat.apply(CoordinatorLayout.resolveGravity(((LayoutParams)v0).gravity), arg10.getMeasuredWidth(), arg10.getMeasuredHeight(), v7, v8, arg11);
        arg10.layout(v8.left, v8.top, v8.right, v8.bottom);
        CoordinatorLayout.releaseTempRect(v7);
        CoordinatorLayout.releaseTempRect(v8);
    }

    private void layoutChildWithAnchor(View arg5, View arg6, int arg7) {
        Rect v0 = CoordinatorLayout.acquireTempRect();
        Rect v1 = CoordinatorLayout.acquireTempRect();
        try {
            this.getDescendantRect(arg6, v0);
            this.getDesiredAnchoredChildRect(arg5, arg7, v0, v1);
            arg5.layout(v1.left, v1.top, v1.right, v1.bottom);
        }
        catch(Throwable v5) {
            CoordinatorLayout.releaseTempRect(v0);
            CoordinatorLayout.releaseTempRect(v1);
            throw v5;
        }

        CoordinatorLayout.releaseTempRect(v0);
        CoordinatorLayout.releaseTempRect(v1);
    }

    private void layoutChildWithKeyline(View arg9, int arg10, int arg11) {
        ViewGroup$LayoutParams v0 = arg9.getLayoutParams();
        int v1 = GravityCompat.getAbsoluteGravity(CoordinatorLayout.resolveKeylineGravity(((LayoutParams)v0).gravity), arg11);
        int v2 = v1 & 7;
        v1 &= 0x70;
        int v3 = this.getWidth();
        int v4 = this.getHeight();
        int v5 = arg9.getMeasuredWidth();
        int v6 = arg9.getMeasuredHeight();
        if(arg11 == 1) {
            arg10 = v3 - arg10;
        }

        arg10 = this.getKeyline(arg10) - v5;
        arg11 = 0;
        if(v2 == 1) {
            arg10 += v5 / 2;
        }
        else if(v2 != 5) {
        }
        else {
            arg10 += v5;
        }

        if(v1 == 16) {
            arg11 = v6 / 2;
        }
        else if(v1 != 80) {
        }
        else {
            arg11 = v6;
        }

        arg10 = Math.max(this.getPaddingLeft() + ((LayoutParams)v0).leftMargin, Math.min(arg10, v3 - this.getPaddingRight() - v5 - ((LayoutParams)v0).rightMargin));
        arg11 = Math.max(this.getPaddingTop() + ((LayoutParams)v0).topMargin, Math.min(arg11, v4 - this.getPaddingBottom() - v6 - ((LayoutParams)v0).bottomMargin));
        arg9.layout(arg10, arg11, v5 + arg10, v6 + arg11);
    }

    private void offsetChildByInset(View arg9, Rect arg10, int arg11) {
        int v1_1;
        if(!ViewCompat.isLaidOut(arg9)) {
            return;
        }

        if(arg9.getWidth() > 0) {
            if(arg9.getHeight() <= 0) {
            }
            else {
                ViewGroup$LayoutParams v0 = arg9.getLayoutParams();
                Behavior v1 = ((LayoutParams)v0).getBehavior();
                Rect v2 = CoordinatorLayout.acquireTempRect();
                Rect v3 = CoordinatorLayout.acquireTempRect();
                v3.set(arg9.getLeft(), arg9.getTop(), arg9.getRight(), arg9.getBottom());
                if(v1 == null || !v1.getInsetDodgeRect(this, arg9, v2)) {
                    v2.set(v3);
                }
                else if(v3.contains(v2)) {
                }
                else {
                    StringBuilder v10 = new StringBuilder();
                    v10.append("Rect should be within the child\'s bounds. Rect:");
                    v10.append(v2.toShortString());
                    v10.append(" | Bounds:");
                    v10.append(v3.toShortString());
                    throw new IllegalArgumentException(v10.toString());
                }

                CoordinatorLayout.releaseTempRect(v3);
                if(v2.isEmpty()) {
                    CoordinatorLayout.releaseTempRect(v2);
                    return;
                }

                arg11 = GravityCompat.getAbsoluteGravity(((LayoutParams)v0).dodgeInsetEdges, arg11);
                if((arg11 & 0x30) == 0x30) {
                    v1_1 = v2.top - ((LayoutParams)v0).topMargin - ((LayoutParams)v0).mInsetOffsetY;
                    if(v1_1 < arg10.top) {
                        this.setInsetOffsetY(arg9, arg10.top - v1_1);
                        v1_1 = 1;
                    }
                    else {
                        goto label_62;
                    }
                }
                else {
                label_62:
                    v1_1 = 0;
                }

                if((arg11 & 80) == 80) {
                    int v3_1 = this.getHeight() - v2.bottom - ((LayoutParams)v0).bottomMargin + ((LayoutParams)v0).mInsetOffsetY;
                    if(v3_1 < arg10.bottom) {
                        this.setInsetOffsetY(arg9, v3_1 - arg10.bottom);
                        v1_1 = 1;
                    }
                }

                if(v1_1 == 0) {
                    this.setInsetOffsetY(arg9, 0);
                }

                if((arg11 & 3) == 3) {
                    v1_1 = v2.left - ((LayoutParams)v0).leftMargin - ((LayoutParams)v0).mInsetOffsetX;
                    if(v1_1 < arg10.left) {
                        this.setInsetOffsetX(arg9, arg10.left - v1_1);
                        v1_1 = 1;
                    }
                    else {
                        goto label_96;
                    }
                }
                else {
                label_96:
                    v1_1 = 0;
                }

                if((arg11 & 5) == 5) {
                    arg11 = this.getWidth() - v2.right - ((LayoutParams)v0).rightMargin + ((LayoutParams)v0).mInsetOffsetX;
                    if(arg11 < arg10.right) {
                        this.setInsetOffsetX(arg9, arg11 - arg10.right);
                        v1_1 = 1;
                    }
                }

                if(v1_1 == 0) {
                    this.setInsetOffsetX(arg9, 0);
                }

                CoordinatorLayout.releaseTempRect(v2);
                return;
            }
        }
    }

    void offsetChildToAnchor(View arg18, int arg19) {
        CoordinatorLayout v8 = this;
        View v9 = arg18;
        ViewGroup$LayoutParams v10 = arg18.getLayoutParams();
        if(((LayoutParams)v10).mAnchorView != null) {
            Rect v11 = CoordinatorLayout.acquireTempRect();
            Rect v12 = CoordinatorLayout.acquireTempRect();
            Rect v13 = CoordinatorLayout.acquireTempRect();
            v8.getDescendantRect(((LayoutParams)v10).mAnchorView, v11);
            int v14 = 0;
            v8.getChildRect(v9, false, v12);
            int v15 = arg18.getMeasuredWidth();
            int v7 = arg18.getMeasuredHeight();
            int v16 = v7;
            this.getDesiredAnchoredChildRectWithoutConstraints(arg18, arg19, v11, v13, v10, v15, v7);
            if(v13.left != v12.left || v13.top != v12.top) {
                v14 = 1;
            }

            v8.constrainChildRect(((LayoutParams)v10), v13, v15, v16);
            int v0 = v13.left - v12.left;
            int v1 = v13.top - v12.top;
            if(v0 != 0) {
                ViewCompat.offsetLeftAndRight(v9, v0);
            }

            if(v1 != 0) {
                ViewCompat.offsetTopAndBottom(v9, v1);
            }

            if(v14 != 0) {
                Behavior v0_1 = ((LayoutParams)v10).getBehavior();
                if(v0_1 != null) {
                    v0_1.onDependentViewChanged(v8, v9, ((LayoutParams)v10).mAnchorView);
                }
            }

            CoordinatorLayout.releaseTempRect(v11);
            CoordinatorLayout.releaseTempRect(v12);
            CoordinatorLayout.releaseTempRect(v13);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.resetTouchBehaviors(false);
        if(this.mNeedsPreDrawListener) {
            if(this.mOnPreDrawListener == null) {
                this.mOnPreDrawListener = new OnPreDrawListener(this);
            }

            this.getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        }

        if(this.mLastInsets == null && (ViewCompat.getFitsSystemWindows(((View)this)))) {
            ViewCompat.requestApplyInsets(((View)this));
        }

        this.mIsAttachedToWindow = true;
    }

    final void onChildViewsChanged(int arg18) {
        boolean v13_2;
        int v12;
        CoordinatorLayout v0 = this;
        int v1 = arg18;
        int v2 = ViewCompat.getLayoutDirection(((View)this));
        int v3 = v0.mDependencySortedChildren.size();
        Rect v4 = CoordinatorLayout.acquireTempRect();
        Rect v5 = CoordinatorLayout.acquireTempRect();
        Rect v6 = CoordinatorLayout.acquireTempRect();
        int v8;
        for(v8 = 0; v8 < v3; ++v8) {
            Object v9 = v0.mDependencySortedChildren.get(v8);
            ViewGroup$LayoutParams v10 = ((View)v9).getLayoutParams();
            if(v1 != 0 || ((View)v9).getVisibility() != 8) {
                int v11;
                for(v11 = 0; v11 < v8; ++v11) {
                    if(((LayoutParams)v10).mAnchorDirectChild == v0.mDependencySortedChildren.get(v11)) {
                        v0.offsetChildToAnchor(((View)v9), v2);
                    }
                }

                v0.getChildRect(((View)v9), true, v5);
                if(((LayoutParams)v10).insetEdge != 0 && !v5.isEmpty()) {
                    v12 = GravityCompat.getAbsoluteGravity(((LayoutParams)v10).insetEdge, v2);
                    int v13 = v12 & 0x70;
                    if(v13 == 0x30) {
                        v4.top = Math.max(v4.top, v5.bottom);
                    }
                    else if(v13 != 80) {
                    }
                    else {
                        v4.bottom = Math.max(v4.bottom, this.getHeight() - v5.top);
                    }

                    v12 &= 7;
                    if(v12 != 3) {
                        if(v12 != 5) {
                            goto label_70;
                        }

                        v4.right = Math.max(v4.right, this.getWidth() - v5.left);
                        goto label_70;
                    }

                    v4.left = Math.max(v4.left, v5.right);
                }

            label_70:
                if(((LayoutParams)v10).dodgeInsetEdges != 0 && ((View)v9).getVisibility() == 0) {
                    v0.offsetChildByInset(((View)v9), v4, v2);
                }

                int v10_1 = 2;
                if(v1 != v10_1) {
                    v0.getLastChildRect(((View)v9), v6);
                    if(v6.equals(v5)) {
                        goto label_105;
                    }
                    else {
                        v0.recordLastChildRect(((View)v9), v5);
                    }
                }

                for(v12 = v8 + 1; v12 < v3; ++v12) {
                    Object v13_1 = v0.mDependencySortedChildren.get(v12);
                    ViewGroup$LayoutParams v14 = ((View)v13_1).getLayoutParams();
                    Behavior v15 = ((LayoutParams)v14).getBehavior();
                    if(v15 != null && (v15.layoutDependsOn(v0, ((View)v13_1), ((View)v9)))) {
                        if(v1 == 0 && (((LayoutParams)v14).getChangedAfterNestedScroll())) {
                            ((LayoutParams)v14).resetChangedAfterNestedScroll();
                            goto label_103;
                        }

                        if(v1 != v10_1) {
                            v13_2 = v15.onDependentViewChanged(v0, ((View)v13_1), ((View)v9));
                        }
                        else {
                            v15.onDependentViewRemoved(v0, ((View)v13_1), ((View)v9));
                            v13_2 = true;
                        }

                        if(v1 != 1) {
                            goto label_103;
                        }

                        ((LayoutParams)v14).setChangedAfterNestedScroll(v13_2);
                    }

                label_103:
                }
            }
            else {
            }

        label_105:
        }

        CoordinatorLayout.releaseTempRect(v4);
        CoordinatorLayout.releaseTempRect(v5);
        CoordinatorLayout.releaseTempRect(v6);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.resetTouchBehaviors(false);
        if((this.mNeedsPreDrawListener) && this.mOnPreDrawListener != null) {
            this.getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }

        if(this.mNestedScrollingTarget != null) {
            this.onStopNestedScroll(this.mNestedScrollingTarget);
        }

        this.mIsAttachedToWindow = false;
    }

    public void onDraw(Canvas arg5) {
        super.onDraw(arg5);
        if((this.mDrawStatusBarBackground) && this.mStatusBarBackground != null) {
            int v0 = this.mLastInsets != null ? this.mLastInsets.getSystemWindowInsetTop() : 0;
            if(v0 <= 0) {
                return;
            }

            this.mStatusBarBackground.setBounds(0, 0, this.getWidth(), v0);
            this.mStatusBarBackground.draw(arg5);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent arg4) {
        int v0 = arg4.getActionMasked();
        if(v0 == 0) {
            this.resetTouchBehaviors(true);
        }

        boolean v4 = this.performIntercept(arg4, 0);
        if(v0 == 1 || v0 == 3) {
            this.resetTouchBehaviors(true);
        }

        return v4;
    }

    protected void onLayout(boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        int v2 = ViewCompat.getLayoutDirection(((View)this));
        arg3 = this.mDependencySortedChildren.size();
        for(arg4 = 0; arg4 < arg3; ++arg4) {
            Object v5 = this.mDependencySortedChildren.get(arg4);
            if(((View)v5).getVisibility() == 8) {
            }
            else {
                Behavior v6 = ((View)v5).getLayoutParams().getBehavior();
                if(v6 != null && (v6.onLayoutChild(this, ((View)v5), v2))) {
                    goto label_17;
                }

                this.onLayoutChild(((View)v5), v2);
            }

        label_17:
        }
    }

    public void onLayoutChild(@NonNull View arg3, int arg4) {
        ViewGroup$LayoutParams v0 = arg3.getLayoutParams();
        if(!((LayoutParams)v0).checkAnchorChanged()) {
            if(((LayoutParams)v0).mAnchorView != null) {
                this.layoutChildWithAnchor(arg3, ((LayoutParams)v0).mAnchorView, arg4);
            }
            else if(((LayoutParams)v0).keyline >= 0) {
                this.layoutChildWithKeyline(arg3, ((LayoutParams)v0).keyline, arg4);
            }
            else {
                this.layoutChild(arg3, arg4);
            }

            return;
        }

        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    protected void onMeasure(int arg31, int arg32) {
        int v28;
        int v27;
        int v25;
        ViewGroup$LayoutParams v26;
        int v23;
        int v21;
        int v11;
        int v29;
        int v22;
        CoordinatorLayout v7 = this;
        this.prepareChildren();
        this.ensurePreDrawListener();
        int v8 = this.getPaddingLeft();
        int v0 = this.getPaddingTop();
        int v9 = this.getPaddingRight();
        int v1 = this.getPaddingBottom();
        int v10 = ViewCompat.getLayoutDirection(((View)this));
        int v12 = v10 == 1 ? 1 : 0;
        int v13 = View$MeasureSpec.getMode(arg31);
        int v14 = View$MeasureSpec.getSize(arg31);
        int v15 = View$MeasureSpec.getMode(arg32);
        int v16 = View$MeasureSpec.getSize(arg32);
        int v17 = v8 + v9;
        int v18 = v0 + v1;
        v0 = this.getSuggestedMinimumWidth();
        v1 = this.getSuggestedMinimumHeight();
        int v19 = v7.mLastInsets == null || !ViewCompat.getFitsSystemWindows(((View)this)) ? 0 : 1;
        int v6 = v7.mDependencySortedChildren.size();
        int v4 = v0;
        int v2 = v1;
        int v3 = 0;
        int v5 = 0;
        while(v5 < v6) {
            Object v20 = v7.mDependencySortedChildren.get(v5);
            if(((View)v20).getVisibility() == 8) {
                v22 = v5;
                v29 = v6;
            }
            else {
                ViewGroup$LayoutParams v1_1 = ((View)v20).getLayoutParams();
                if(((LayoutParams)v1_1).keyline < 0 || v13 == 0) {
                    v22 = v2;
                label_80:
                    v21 = 0;
                }
                else {
                    v0 = v7.getKeyline(((LayoutParams)v1_1).keyline);
                    v11 = GravityCompat.getAbsoluteGravity(CoordinatorLayout.resolveKeylineGravity(((LayoutParams)v1_1).gravity), v10) & 7;
                    v22 = v2;
                    if(v11 != 3 || v12 != 0) {
                        v2 = 5;
                        if(v11 == v2 && v12 != 0) {
                            goto label_62;
                        }
                    }
                    else {
                    label_62:
                        v21 = Math.max(0, v14 - v9 - v0);
                        goto label_82;
                    }

                    if(v11 != v2 || v12 != 0) {
                        if(v11 != 3) {
                        }
                        else if(v12 != 0) {
                            goto label_74;
                        }

                        goto label_80;
                    }

                label_74:
                    v21 = Math.max(0, v0 - v8);
                }

            label_82:
                if(v19 == 0 || (ViewCompat.getFitsSystemWindows(((View)v20)))) {
                    v11 = arg31;
                    v23 = arg32;
                }
                else {
                    v0 = v7.mLastInsets.getSystemWindowInsetLeft() + v7.mLastInsets.getSystemWindowInsetRight();
                    v2 = v7.mLastInsets.getSystemWindowInsetTop() + v7.mLastInsets.getSystemWindowInsetBottom();
                    v11 = View$MeasureSpec.makeMeasureSpec(v14 - v0, v13);
                    v23 = View$MeasureSpec.makeMeasureSpec(v16 - v2, v15);
                }

                Behavior v0_1 = ((LayoutParams)v1_1).getBehavior();
                if(v0_1 != null) {
                    v26 = v1_1;
                    v25 = v22;
                    v27 = v3;
                    v28 = v4;
                    v22 = v5;
                    v29 = v6;
                    if(!v0_1.onMeasureChild(this, v20, v11, v21, v23, 0)) {
                        goto label_129;
                    }
                }
                else {
                    v26 = v1_1;
                    v27 = v3;
                    v28 = v4;
                    v29 = v6;
                    v25 = v22;
                    v22 = v5;
                label_129:
                    this.onMeasureChild(v20, v11, v21, v23, 0);
                }

                v0 = Math.max(v28, v17 + ((View)v20).getMeasuredWidth() + v26.leftMargin + v26.rightMargin);
                v1 = Math.max(v25, v18 + ((View)v20).getMeasuredHeight() + v26.topMargin + v26.bottomMargin);
                v4 = v0;
                v3 = View.combineMeasuredStates(v27, ((View)v20).getMeasuredState());
                v2 = v1;
            }

            v5 = v22 + 1;
            v6 = v29;
        }

        v7.setMeasuredDimension(View.resolveSizeAndState(v4, arg31, 0xFF000000 & v3), View.resolveSizeAndState(v2, arg32, v3 << 16));
    }

    public void onMeasureChild(View arg1, int arg2, int arg3, int arg4, int arg5) {
        this.measureChildWithMargins(arg1, arg2, arg3, arg4, arg5);
    }

    public boolean onNestedFling(View arg12, float arg13, float arg14, boolean arg15) {
        int v0 = this.getChildCount();
        int v2 = 0;
        int v3 = 0;
        while(v2 < v0) {
            View v6 = this.getChildAt(v2);
            if(v6.getVisibility() == 8) {
            }
            else {
                ViewGroup$LayoutParams v4 = v6.getLayoutParams();
                if(!((LayoutParams)v4).isNestedScrollAccepted(0)) {
                }
                else {
                    Behavior v4_1 = ((LayoutParams)v4).getBehavior();
                    if(v4_1 != null) {
                        v3 |= v4_1.onNestedFling(this, v6, arg12, arg13, arg14, arg15);
                    }
                }
            }

            ++v2;
        }

        if(v3 != 0) {
            this.onChildViewsChanged(1);
        }

        return ((boolean)v3);
    }

    public boolean onNestedPreFling(View arg11, float arg12, float arg13) {
        int v0 = this.getChildCount();
        int v2 = 0;
        int v3 = 0;
        while(v2 < v0) {
            View v6 = this.getChildAt(v2);
            if(v6.getVisibility() == 8) {
            }
            else {
                ViewGroup$LayoutParams v4 = v6.getLayoutParams();
                if(!((LayoutParams)v4).isNestedScrollAccepted(0)) {
                }
                else {
                    Behavior v4_1 = ((LayoutParams)v4).getBehavior();
                    if(v4_1 != null) {
                        v3 |= v4_1.onNestedPreFling(this, v6, arg11, arg12, arg13);
                    }
                }
            }

            ++v2;
        }

        return ((boolean)v3);
    }

    public void onNestedPreScroll(View arg7, int arg8, int arg9, int[] arg10) {
        this.onNestedPreScroll(arg7, arg8, arg9, arg10, 0);
    }

    public void onNestedPreScroll(View arg16, int arg17, int arg18, int[] arg19, int arg20) {
        CoordinatorLayout v8 = this;
        int v9 = this.getChildCount();
        int v0 = 0;
        int v11 = 0;
        int v12 = 0;
        int v13 = 0;
        while(v11 < v9) {
            View v2 = this.getChildAt(v11);
            if(v2.getVisibility() == 8) {
            }
            else {
                ViewGroup$LayoutParams v1 = v2.getLayoutParams();
                if(!((LayoutParams)v1).isNestedScrollAccepted(arg20)) {
                }
                else {
                    Behavior v1_1 = ((LayoutParams)v1).getBehavior();
                    if(v1_1 != null) {
                        int[] v0_1 = v8.mTempIntPair;
                        v8.mTempIntPair[1] = 0;
                        v0_1[0] = 0;
                        v1_1.onNestedPreScroll(this, v2, arg16, arg17, arg18, v8.mTempIntPair, arg20);
                        v0 = arg17 > 0 ? Math.max(v12, v8.mTempIntPair[0]) : Math.min(v12, v8.mTempIntPair[0]);
                        int v3 = arg18 > 0 ? Math.max(v13, v8.mTempIntPair[1]) : Math.min(v13, v8.mTempIntPair[1]);
                        v12 = v0;
                        v13 = v3;
                        v0 = 1;
                    }
                }
            }

            ++v11;
        }

        arg19[0] = v12;
        arg19[1] = v13;
        if(v0 != 0) {
            this.onChildViewsChanged(1);
        }
    }

    public void onNestedScroll(View arg8, int arg9, int arg10, int arg11, int arg12) {
        this.onNestedScroll(arg8, arg9, arg10, arg11, arg12, 0);
    }

    public void onNestedScroll(View arg15, int arg16, int arg17, int arg18, int arg19, int arg20) {
        int v10 = this.getChildCount();
        int v0 = 0;
        int v11;
        for(v11 = 0; v11 < v10; ++v11) {
            View v2 = this.getChildAt(v11);
            if(v2.getVisibility() == 8) {
            }
            else {
                ViewGroup$LayoutParams v1 = v2.getLayoutParams();
                if(!((LayoutParams)v1).isNestedScrollAccepted(arg20)) {
                }
                else {
                    Behavior v1_1 = ((LayoutParams)v1).getBehavior();
                    if(v1_1 != null) {
                        v1_1.onNestedScroll(this, v2, arg15, arg16, arg17, arg18, arg19, arg20);
                        v0 = 1;
                    }
                }
            }
        }

        if(v0 != 0) {
            this.onChildViewsChanged(1);
        }
    }

    public void onNestedScrollAccepted(View arg2, View arg3, int arg4) {
        this.onNestedScrollAccepted(arg2, arg3, arg4, 0);
    }

    public void onNestedScrollAccepted(View arg10, View arg11, int arg12, int arg13) {
        this.mNestedScrollingParentHelper.onNestedScrollAccepted(arg10, arg11, arg12, arg13);
        this.mNestedScrollingTarget = arg11;
        int v0 = this.getChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            View v4 = this.getChildAt(v1);
            ViewGroup$LayoutParams v2 = v4.getLayoutParams();
            if(!((LayoutParams)v2).isNestedScrollAccepted(arg13)) {
            }
            else {
                Behavior v2_1 = ((LayoutParams)v2).getBehavior();
                if(v2_1 != null) {
                    v2_1.onNestedScrollAccepted(this, v4, arg10, arg11, arg12, arg13);
                }
            }
        }
    }

    protected void onRestoreInstanceState(Parcelable arg7) {
        if(!(arg7 instanceof SavedState)) {
            super.onRestoreInstanceState(arg7);
            return;
        }

        super.onRestoreInstanceState(((SavedState)arg7).getSuperState());
        SparseArray v7 = ((SavedState)arg7).behaviorStates;
        int v0 = 0;
        int v1 = this.getChildCount();
        while(v0 < v1) {
            View v2 = this.getChildAt(v0);
            int v3 = v2.getId();
            Behavior v4 = this.getResolvedLayoutParams(v2).getBehavior();
            if(v3 != -1 && v4 != null) {
                Object v3_1 = v7.get(v3);
                if(v3_1 != null) {
                    v4.onRestoreInstanceState(this, v2, ((Parcelable)v3_1));
                }
            }

            ++v0;
        }
    }

    protected Parcelable onSaveInstanceState() {
        SavedState v0 = new SavedState(super.onSaveInstanceState());
        SparseArray v1 = new SparseArray();
        int v2 = this.getChildCount();
        int v3;
        for(v3 = 0; v3 < v2; ++v3) {
            View v4 = this.getChildAt(v3);
            int v5 = v4.getId();
            Behavior v6 = v4.getLayoutParams().getBehavior();
            if(v5 != -1 && v6 != null) {
                Parcelable v4_1 = v6.onSaveInstanceState(this, v4);
                if(v4_1 != null) {
                    v1.append(v5, v4_1);
                }
            }
        }

        v0.behaviorStates = v1;
        return ((Parcelable)v0);
    }

    public boolean onStartNestedScroll(View arg2, View arg3, int arg4) {
        return this.onStartNestedScroll(arg2, arg3, arg4, 0);
    }

    public boolean onStartNestedScroll(View arg15, View arg16, int arg17, int arg18) {
        int v7 = arg18;
        int v8 = this.getChildCount();
        int v10 = 0;
        int v11 = 0;
        while(v10 < v8) {
            View v2 = this.getChildAt(v10);
            if(v2.getVisibility() == 8) {
            }
            else {
                ViewGroup$LayoutParams v13 = v2.getLayoutParams();
                Behavior v0 = ((LayoutParams)v13).getBehavior();
                if(v0 != null) {
                    boolean v0_1 = v0.onStartNestedScroll(this, v2, arg15, arg16, arg17, arg18);
                    ((LayoutParams)v13).setNestedScrollAccepted(v7, v0_1);
                    v11 |= ((int)v0_1);
                }
                else {
                    ((LayoutParams)v13).setNestedScrollAccepted(v7, false);
                }
            }

            ++v10;
        }

        return ((boolean)v11);
    }

    public void onStopNestedScroll(View arg2) {
        this.onStopNestedScroll(arg2, 0);
    }

    public void onStopNestedScroll(View arg6, int arg7) {
        this.mNestedScrollingParentHelper.onStopNestedScroll(arg6, arg7);
        int v0 = this.getChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            View v2 = this.getChildAt(v1);
            ViewGroup$LayoutParams v3 = v2.getLayoutParams();
            if(!((LayoutParams)v3).isNestedScrollAccepted(arg7)) {
            }
            else {
                Behavior v4 = ((LayoutParams)v3).getBehavior();
                if(v4 != null) {
                    v4.onStopNestedScroll(this, v2, arg6, arg7);
                }

                ((LayoutParams)v3).resetNestedScroll(arg7);
                ((LayoutParams)v3).resetChangedAfterNestedScroll();
            }
        }

        this.mNestedScrollingTarget = null;
    }

    public boolean onTouchEvent(MotionEvent arg18) {
        int v6_2;
        boolean v6_1;
        boolean v3;
        CoordinatorLayout v0 = this;
        MotionEvent v1 = arg18;
        int v2 = arg18.getActionMasked();
        if(v0.mBehaviorTouchView == null) {
            v3 = v0.performIntercept(v1, 1);
            if(v3) {
                goto label_13;
            }
            else {
                goto label_10;
            }
        }
        else {
            v3 = false;
        label_13:
            Behavior v6 = v0.mBehaviorTouchView.getLayoutParams().getBehavior();
            if(v6 != null) {
                v6_1 = v6.onTouchEvent(v0, v0.mBehaviorTouchView, v1);
            }
            else {
            label_10:
                v6_2 = 0;
            }
        }

        MotionEvent v8 = null;
        if(v0.mBehaviorTouchView == null) {
            v6_2 = (((int)v6_1)) | super.onTouchEvent(arg18);
        }
        else if(v3) {
            long v11 = SystemClock.uptimeMillis();
            v8 = MotionEvent.obtain(v11, v11, 3, 0f, 0f, 0);
            super.onTouchEvent(v8);
        }

        if(v8 != null) {
            v8.recycle();
        }

        if(v2 == 1 || v2 == 3) {
            v0.resetTouchBehaviors(false);
        }

        return v6_1;
    }

    static Behavior parseBehavior(Context arg4, AttributeSet arg5, String arg6) {
        HashMap v0_3;
        if(TextUtils.isEmpty(((CharSequence)arg6))) {
            return null;
        }

        if(arg6.startsWith(".")) {
            arg6 = arg4.getPackageName() + arg6;
        }
        else {
            char v0_1 = '.';
            if(arg6.indexOf(v0_1) >= 0) {
            }
            else if(!TextUtils.isEmpty(CoordinatorLayout.WIDGET_PACKAGE_NAME)) {
                arg6 = CoordinatorLayout.WIDGET_PACKAGE_NAME + v0_1 + arg6;
            }
        }

        try {
            Object v0_2 = CoordinatorLayout.sConstructors.get();
            if(v0_2 == null) {
                v0_3 = new HashMap();
                CoordinatorLayout.sConstructors.set(v0_3);
            }

            Object v1_1 = ((Map)v0_3).get(arg6);
            if(v1_1 == null) {
                Constructor v1_2 = arg4.getClassLoader().loadClass(arg6).getConstructor(CoordinatorLayout.CONSTRUCTOR_PARAMS);
                v1_2.setAccessible(true);
                ((Map)v0_3).put(arg6, v1_2);
            }

            return ((Constructor)v1_1).newInstance(arg4, arg5);
        }
        catch(Exception v4) {
            v0 = new StringBuilder();
            v0.append("Could not inflate Behavior subclass ");
            v0.append(arg6);
            throw new RuntimeException(v0.toString(), ((Throwable)v4));
        }
    }

    private boolean performIntercept(MotionEvent arg22, int arg23) {
        CoordinatorLayout v0 = this;
        MotionEvent v1 = arg22;
        int v2 = arg22.getActionMasked();
        List v3 = v0.mTempList1;
        v0.getTopSortedChildren(v3);
        int v4 = v3.size();
        MotionEvent v9 = null;
        int v6 = 0;
        boolean v7 = false;
        int v8 = 0;
        while(v6 < v4) {
            Object v10 = v3.get(v6);
            ViewGroup$LayoutParams v11 = ((View)v10).getLayoutParams();
            Behavior v12 = ((LayoutParams)v11).getBehavior();
            if(!v7 && v8 == 0 || v2 == 0) {
                if(!v7 && v12 != null) {
                    switch(arg23) {
                        case 0: {
                            v7 = v12.onInterceptTouchEvent(v0, ((View)v10), v1);
                            break;
                        }
                        case 1: {
                            v7 = v12.onTouchEvent(v0, ((View)v10), v1);
                            break;
                        }
                        default: {
                            break;
                        }
                    }

                    if(v7) {
                        v0.mBehaviorTouchView = ((View)v10);
                    }
                }

                boolean v8_1 = ((LayoutParams)v11).didBlockInteraction();
                boolean v10_1 = ((LayoutParams)v11).isBlockingInteractionBelow(v0, ((View)v10));
                v8 = !v10_1 || (v8_1) ? 0 : 1;
                if(!v10_1) {
                    goto label_53;
                }

                if(v8 != 0) {
                    goto label_53;
                }

                break;
            }
            else if(v12 != null) {
                if(v9 == null) {
                    long v15 = SystemClock.uptimeMillis();
                    v9 = MotionEvent.obtain(v15, v15, 3, 0f, 0f, 0);
                }

                switch(arg23) {
                    case 0: {
                        goto label_32;
                    }
                    case 1: {
                        goto label_30;
                    }
                }

                goto label_53;
            label_30:
                v12.onTouchEvent(v0, ((View)v10), v9);
                goto label_53;
            label_32:
                v12.onInterceptTouchEvent(v0, ((View)v10), v9);
            }

        label_53:
            ++v6;
        }

        v3.clear();
        return v7;
    }

    private void prepareChildren() {
        this.mDependencySortedChildren.clear();
        this.mChildDag.clear();
        int v0 = this.getChildCount();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            View v3 = this.getChildAt(v2);
            LayoutParams v4 = this.getResolvedLayoutParams(v3);
            v4.findAnchorView(this, v3);
            this.mChildDag.addNode(v3);
            int v5;
            for(v5 = 0; v5 < v0; ++v5) {
                if(v5 == v2) {
                }
                else {
                    View v6 = this.getChildAt(v5);
                    if(v4.dependsOn(this, v3, v6)) {
                        if(!this.mChildDag.contains(v6)) {
                            this.mChildDag.addNode(v6);
                        }

                        this.mChildDag.addEdge(v6, v3);
                    }
                }
            }
        }

        this.mDependencySortedChildren.addAll(this.mChildDag.getSortedList());
        Collections.reverse(this.mDependencySortedChildren);
    }

    void recordLastChildRect(View arg1, Rect arg2) {
        arg1.getLayoutParams().setLastChildRect(arg2);
    }

    private static void releaseTempRect(@NonNull Rect arg1) {
        arg1.setEmpty();
        CoordinatorLayout.sRectPool.release(arg1);
    }

    void removePreDrawListener() {
        if((this.mIsAttachedToWindow) && this.mOnPreDrawListener != null) {
            this.getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        }

        this.mNeedsPreDrawListener = false;
    }

    public boolean requestChildRectangleOnScreen(View arg2, Rect arg3, boolean arg4) {
        Behavior v0 = arg2.getLayoutParams().getBehavior();
        if(v0 != null && (v0.onRequestChildRectangleOnScreen(this, arg2, arg3, arg4))) {
            return 1;
        }

        return super.requestChildRectangleOnScreen(arg2, arg3, arg4);
    }

    public void requestDisallowInterceptTouchEvent(boolean arg1) {
        super.requestDisallowInterceptTouchEvent(arg1);
        if((arg1) && !this.mDisallowInterceptReset) {
            this.resetTouchBehaviors(false);
            this.mDisallowInterceptReset = true;
        }
    }

    private void resetTouchBehaviors(boolean arg14) {
        int v0 = this.getChildCount();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            View v3 = this.getChildAt(v2);
            Behavior v4 = v3.getLayoutParams().getBehavior();
            if(v4 != null) {
                long v7 = SystemClock.uptimeMillis();
                MotionEvent v5 = MotionEvent.obtain(v7, v7, 3, 0f, 0f, 0);
                if(arg14) {
                    v4.onInterceptTouchEvent(this, v3, v5);
                }
                else {
                    v4.onTouchEvent(this, v3, v5);
                }

                v5.recycle();
            }
        }

        int v14;
        for(v14 = 0; v14 < v0; ++v14) {
            this.getChildAt(v14).getLayoutParams().resetTouchBehaviorTracking();
        }

        this.mBehaviorTouchView = null;
        this.mDisallowInterceptReset = false;
    }

    private static int resolveAnchoredChildGravity(int arg0) {
        if(arg0 == 0) {
            arg0 = 17;
        }

        return arg0;
    }

    private static int resolveGravity(int arg1) {
        if((arg1 & 7) == 0) {
            arg1 |= 0x800003;
        }

        if((arg1 & 0x70) == 0) {
            arg1 |= 0x30;
        }

        return arg1;
    }

    private static int resolveKeylineGravity(int arg0) {
        if(arg0 == 0) {
            arg0 = 0x800035;
        }

        return arg0;
    }

    public void setFitsSystemWindows(boolean arg1) {
        super.setFitsSystemWindows(arg1);
        this.setupForInsets();
    }

    private void setInsetOffsetX(View arg3, int arg4) {
        ViewGroup$LayoutParams v0 = arg3.getLayoutParams();
        if(((LayoutParams)v0).mInsetOffsetX != arg4) {
            ViewCompat.offsetLeftAndRight(arg3, arg4 - ((LayoutParams)v0).mInsetOffsetX);
            ((LayoutParams)v0).mInsetOffsetX = arg4;
        }
    }

    private void setInsetOffsetY(View arg3, int arg4) {
        ViewGroup$LayoutParams v0 = arg3.getLayoutParams();
        if(((LayoutParams)v0).mInsetOffsetY != arg4) {
            ViewCompat.offsetTopAndBottom(arg3, arg4 - ((LayoutParams)v0).mInsetOffsetY);
            ((LayoutParams)v0).mInsetOffsetY = arg4;
        }
    }

    public void setOnHierarchyChangeListener(ViewGroup$OnHierarchyChangeListener arg1) {
        this.mOnHierarchyChangeListener = arg1;
    }

    public void setStatusBarBackground(@Nullable Drawable arg3) {
        if(this.mStatusBarBackground != arg3) {
            Drawable$Callback v1 = null;
            if(this.mStatusBarBackground != null) {
                this.mStatusBarBackground.setCallback(v1);
            }

            if(arg3 != null) {
                Drawable v1_1 = arg3.mutate();
            }

            this.mStatusBarBackground = ((Drawable)v1);
            if(this.mStatusBarBackground != null) {
                if(this.mStatusBarBackground.isStateful()) {
                    this.mStatusBarBackground.setState(this.getDrawableState());
                }

                DrawableCompat.setLayoutDirection(this.mStatusBarBackground, ViewCompat.getLayoutDirection(((View)this)));
                arg3 = this.mStatusBarBackground;
                boolean v0 = this.getVisibility() == 0 ? true : false;
                arg3.setVisible(v0, false);
                this.mStatusBarBackground.setCallback(((Drawable$Callback)this));
            }

            ViewCompat.postInvalidateOnAnimation(((View)this));
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int arg2) {
        this.setStatusBarBackground(new ColorDrawable(arg2));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int arg2) {
        Drawable v2 = arg2 != 0 ? ContextCompat.getDrawable(this.getContext(), arg2) : null;
        this.setStatusBarBackground(v2);
    }

    public void setVisibility(int arg3) {
        super.setVisibility(arg3);
        boolean v3 = arg3 == 0 ? true : false;
        if(this.mStatusBarBackground != null && this.mStatusBarBackground.isVisible() != v3) {
            this.mStatusBarBackground.setVisible(v3, false);
        }
    }

    final WindowInsetsCompat setWindowInsets(WindowInsetsCompat arg4) {
        if(!ObjectsCompat.equals(this.mLastInsets, arg4)) {
            this.mLastInsets = arg4;
            boolean v0 = true;
            boolean v2 = arg4 == null || arg4.getSystemWindowInsetTop() <= 0 ? false : true;
            this.mDrawStatusBarBackground = v2;
            if((this.mDrawStatusBarBackground) || this.getBackground() != null) {
                v0 = false;
            }
            else {
            }

            this.setWillNotDraw(v0);
            arg4 = this.dispatchApplyWindowInsetsToBehaviors(arg4);
            this.requestLayout();
        }

        return arg4;
    }

    private void setupForInsets() {
        if(Build$VERSION.SDK_INT < 21) {
            return;
        }

        if(ViewCompat.getFitsSystemWindows(((View)this))) {
            if(this.mApplyWindowInsetsListener == null) {
                this.mApplyWindowInsetsListener = new OnApplyWindowInsetsListener() {
                    public WindowInsetsCompat onApplyWindowInsets(View arg1, WindowInsetsCompat arg2) {
                        return CoordinatorLayout.this.setWindowInsets(arg2);
                    }
                };
            }

            ViewCompat.setOnApplyWindowInsetsListener(((View)this), this.mApplyWindowInsetsListener);
            this.setSystemUiVisibility(0x500);
        }
        else {
            ViewCompat.setOnApplyWindowInsetsListener(((View)this), null);
        }
    }

    protected boolean verifyDrawable(Drawable arg2) {
        boolean v2 = (super.verifyDrawable(arg2)) || arg2 == this.mStatusBarBackground ? true : false;
        return v2;
    }
}

