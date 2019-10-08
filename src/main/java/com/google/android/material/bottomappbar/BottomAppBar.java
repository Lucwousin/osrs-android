package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.MenuRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar$LayoutParams;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout$AttachedBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapePathModel;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class BottomAppBar extends Toolbar implements AttachedBehavior {
    class com.google.android.material.bottomappbar.BottomAppBar$7 extends AnimatorListenerAdapter {
        com.google.android.material.bottomappbar.BottomAppBar$7(BottomAppBar arg1) {
            BottomAppBar.this = arg1;
            super();
        }

        public void onAnimationStart(Animator arg3) {
            BottomAppBar.this.maybeAnimateAttachChange(BottomAppBar.this.fabAttached);
            BottomAppBar.this.maybeAnimateMenuView(BottomAppBar.this.fabAlignmentMode, BottomAppBar.this.fabAttached);
        }
    }

    public class Behavior extends HideBottomViewOnScrollBehavior {
        private final Rect fabContentRect;

        public Behavior() {
            super();
            this.fabContentRect = new Rect();
        }

        public Behavior(Context arg1, AttributeSet arg2) {
            super(arg1, arg2);
            this.fabContentRect = new Rect();
        }

        public boolean onLayoutChild(CoordinatorLayout arg1, View arg2, int arg3) {
            return this.onLayoutChild(arg1, ((BottomAppBar)arg2), arg3);
        }

        public boolean onLayoutChild(CoordinatorLayout arg3, BottomAppBar arg4, int arg5) {
            FloatingActionButton v0 = arg4.findDependentFab();
            if(v0 != null) {
                this.updateFabPositionAndVisibility(v0, arg4);
                v0.getMeasuredContentRect(this.fabContentRect);
                arg4.setFabDiameter(this.fabContentRect.height());
            }

            if(!arg4.isAnimationRunning()) {
                arg4.setCutoutState();
            }

            arg3.onLayoutChild(((View)arg4), arg5);
            return super.onLayoutChild(arg3, ((View)arg4), arg5);
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout arg1, @NonNull View arg2, @NonNull View arg3, @NonNull View arg4, int arg5, int arg6) {
            return this.onStartNestedScroll(arg1, ((BottomAppBar)arg2), arg3, arg4, arg5, arg6);
        }

        public boolean onStartNestedScroll(@NonNull CoordinatorLayout arg2, @NonNull BottomAppBar arg3, @NonNull View arg4, @NonNull View arg5, int arg6, int arg7) {
            boolean v2 = !arg3.getHideOnScroll() || !super.onStartNestedScroll(arg2, ((View)arg3), arg4, arg5, arg6, arg7) ? false : true;
            return v2;
        }

        protected void slideDown(View arg1) {
            this.slideDown(((BottomAppBar)arg1));
        }

        protected void slideDown(BottomAppBar arg3) {
            super.slideDown(((View)arg3));
            FloatingActionButton v3 = arg3.findDependentFab();
            if(v3 != null) {
                v3.getContentRect(this.fabContentRect);
                float v0 = ((float)(v3.getMeasuredHeight() - this.fabContentRect.height()));
                v3.clearAnimation();
                v3.animate().translationY((((float)(-v3.getPaddingBottom()))) + v0).setInterpolator(AnimationUtils.FAST_OUT_LINEAR_IN_INTERPOLATOR).setDuration(0xAF);
            }
        }

        protected void slideUp(View arg1) {
            this.slideUp(((BottomAppBar)arg1));
        }

        protected void slideUp(BottomAppBar arg3) {
            super.slideUp(((View)arg3));
            FloatingActionButton v0 = arg3.findDependentFab();
            if(v0 != null) {
                v0.clearAnimation();
                v0.animate().translationY(arg3.getFabTranslationY()).setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR).setDuration(0xE1);
            }
        }

        private boolean updateFabPositionAndVisibility(FloatingActionButton arg3, BottomAppBar arg4) {
            arg3.getLayoutParams().anchorGravity = 17;
            arg4.addFabAnimationListeners(arg3);
            return 1;
        }
    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface FabAlignmentMode {
    }

    class SavedState extends AbsSavedState {
        final class com.google.android.material.bottomappbar.BottomAppBar$SavedState$1 implements Parcelable$ClassLoaderCreator {
            com.google.android.material.bottomappbar.BottomAppBar$SavedState$1() {
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
        int fabAlignmentMode;
        boolean fabAttached;

        static {
            SavedState.CREATOR = new com.google.android.material.bottomappbar.BottomAppBar$SavedState$1();
        }

        public SavedState(Parcelable arg1) {
            super(arg1);
        }

        public SavedState(Parcel arg1, ClassLoader arg2) {
            super(arg1, arg2);
            this.fabAlignmentMode = arg1.readInt();
            boolean v1 = arg1.readInt() != 0 ? true : false;
            this.fabAttached = v1;
        }

        public void writeToParcel(@NonNull Parcel arg1, int arg2) {
            super.writeToParcel(arg1, arg2);
            arg1.writeInt(this.fabAlignmentMode);
            arg1.writeInt(this.fabAttached);
        }
    }

    private static final long ANIMATION_DURATION = 300;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    @Nullable private Animator attachAnimator;
    private int fabAlignmentMode;
    AnimatorListenerAdapter fabAnimationListener;
    private boolean fabAttached;
    private final int fabOffsetEndMode;
    private boolean hideOnScroll;
    private final MaterialShapeDrawable materialShapeDrawable;
    @Nullable private Animator menuAnimator;
    @Nullable private Animator modeAnimator;
    private final BottomAppBarTopEdgeTreatment topEdgeTreatment;

    public BottomAppBar(Context arg3) {
        this(arg3, null, 0);
    }

    public BottomAppBar(Context arg9, @Nullable AttributeSet arg10, int arg11) {
        super(arg9, arg10, arg11);
        this.fabAttached = true;
        this.fabAnimationListener = new com.google.android.material.bottomappbar.BottomAppBar$7(this);
        TypedArray v10 = ThemeEnforcement.obtainStyledAttributes(arg9, arg10, R$styleable.BottomAppBar, arg11, R$style.Widget_MaterialComponents_BottomAppBar, new int[0]);
        ColorStateList v9 = MaterialResources.getColorStateList(arg9, v10, R$styleable.BottomAppBar_backgroundTint);
        float v11 = ((float)v10.getDimensionPixelOffset(R$styleable.BottomAppBar_fabCradleMargin, 0));
        float v2 = ((float)v10.getDimensionPixelOffset(R$styleable.BottomAppBar_fabCradleRoundedCornerRadius, 0));
        float v3 = ((float)v10.getDimensionPixelOffset(R$styleable.BottomAppBar_fabCradleVerticalOffset, 0));
        this.fabAlignmentMode = v10.getInt(R$styleable.BottomAppBar_fabAlignmentMode, 0);
        this.hideOnScroll = v10.getBoolean(R$styleable.BottomAppBar_hideOnScroll, false);
        v10.recycle();
        this.fabOffsetEndMode = this.getResources().getDimensionPixelOffset(R$dimen.mtrl_bottomappbar_fabOffsetEndMode);
        this.topEdgeTreatment = new BottomAppBarTopEdgeTreatment(v11, v2, v3);
        ShapePathModel v10_1 = new ShapePathModel();
        v10_1.setTopEdge(this.topEdgeTreatment);
        this.materialShapeDrawable = new MaterialShapeDrawable(v10_1);
        this.materialShapeDrawable.setShadowEnabled(true);
        this.materialShapeDrawable.setPaintStyle(Paint$Style.FILL);
        DrawableCompat.setTintList(this.materialShapeDrawable, v9);
        ViewCompat.setBackground(((View)this), this.materialShapeDrawable);
    }

    public BottomAppBar(Context arg2, @Nullable AttributeSet arg3) {
        this(arg2, arg3, R$attr.bottomAppBarStyle);
    }

    static Animator access$002(BottomAppBar arg0, Animator arg1) {
        arg0.modeAnimator = arg1;
        return arg1;
    }

    static BottomAppBarTopEdgeTreatment access$100(BottomAppBar arg0) {
        return arg0.topEdgeTreatment;
    }

    static void access$1000(BottomAppBar arg0, FloatingActionButton arg1) {
        arg0.addFabAnimationListeners(arg1);
    }

    static FloatingActionButton access$1100(BottomAppBar arg0) {
        return arg0.findDependentFab();
    }

    static boolean access$1200(BottomAppBar arg0) {
        return arg0.isAnimationRunning();
    }

    static void access$1300(BottomAppBar arg0) {
        arg0.setCutoutState();
    }

    static float access$1400(BottomAppBar arg0) {
        return arg0.getFabTranslationY();
    }

    static MaterialShapeDrawable access$200(BottomAppBar arg0) {
        return arg0.materialShapeDrawable;
    }

    static Animator access$302(BottomAppBar arg0, Animator arg1) {
        arg0.menuAnimator = arg1;
        return arg1;
    }

    static void access$400(BottomAppBar arg0, ActionMenuView arg1, int arg2, boolean arg3) {
        arg0.translateActionMenuView(arg1, arg2, arg3);
    }

    static Animator access$502(BottomAppBar arg0, Animator arg1) {
        arg0.attachAnimator = arg1;
        return arg1;
    }

    static boolean access$600(BottomAppBar arg0) {
        return arg0.fabAttached;
    }

    static void access$700(BottomAppBar arg0, boolean arg1) {
        arg0.maybeAnimateAttachChange(arg1);
    }

    static int access$800(BottomAppBar arg0) {
        return arg0.fabAlignmentMode;
    }

    static void access$900(BottomAppBar arg0, int arg1, boolean arg2) {
        arg0.maybeAnimateMenuView(arg1, arg2);
    }

    private void addFabAnimationListeners(@NonNull FloatingActionButton arg2) {
        this.removeFabAnimationListeners(arg2);
        arg2.addOnHideAnimationListener(this.fabAnimationListener);
        arg2.addOnShowAnimationListener(this.fabAnimationListener);
    }

    private void cancelAnimations() {
        if(this.attachAnimator != null) {
            this.attachAnimator.cancel();
        }

        if(this.menuAnimator != null) {
            this.menuAnimator.cancel();
        }

        if(this.modeAnimator != null) {
            this.modeAnimator.cancel();
        }
    }

    private void createCradleShapeAnimation(boolean arg4, List arg5) {
        if(arg4) {
            this.topEdgeTreatment.setHorizontalOffset(this.getFabTranslationX());
        }

        float[] v0 = new float[2];
        v0[0] = this.materialShapeDrawable.getInterpolation();
        float v4 = arg4 ? 1f : 0f;
        v0[1] = v4;
        ValueAnimator v4_1 = ValueAnimator.ofFloat(v0);
        v4_1.addUpdateListener(new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator arg2) {
                BottomAppBar.this.materialShapeDrawable.setInterpolation(arg2.getAnimatedValue().floatValue());
            }
        });
        v4_1.setDuration(300);
        arg5.add(v4_1);
    }

    private void createCradleTranslationAnimation(int arg4, List arg5) {
        if(!this.fabAttached) {
            return;
        }

        ValueAnimator v4 = ValueAnimator.ofFloat(new float[]{this.topEdgeTreatment.getHorizontalOffset(), ((float)this.getFabTranslationX(arg4))});
        v4.addUpdateListener(new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator arg2) {
                BottomAppBar.this.topEdgeTreatment.setHorizontalOffset(arg2.getAnimatedValue().floatValue());
                BottomAppBar.this.materialShapeDrawable.invalidateSelf();
            }
        });
        v4.setDuration(300);
        arg5.add(v4);
    }

    private void createFabTranslationXAnimation(int arg5, List arg6) {
        ObjectAnimator v5 = ObjectAnimator.ofFloat(this.findDependentFab(), "translationX", new float[]{((float)this.getFabTranslationX(arg5))});
        v5.setDuration(300);
        arg6.add(v5);
    }

    private void createFabTranslationYAnimation(boolean arg5, List arg6) {
        FloatingActionButton v0 = this.findDependentFab();
        if(v0 == null) {
            return;
        }

        ObjectAnimator v5 = ObjectAnimator.ofFloat(v0, "translationY", new float[]{this.getFabTranslationY(arg5)});
        v5.setDuration(300);
        arg6.add(v5);
    }

    private void createMenuViewTranslationAnimation(int arg9, boolean arg10, List arg11) {
        ActionMenuView v0 = this.getActionMenuView();
        if(v0 == null) {
            return;
        }

        float[] v3 = new float[1];
        float v4 = 1f;
        v3[0] = v4;
        ObjectAnimator v1 = ObjectAnimator.ofFloat(v0, "alpha", v3);
        if((this.fabAttached) || (this.isVisibleFab())) {
            if(this.fabAlignmentMode != 1) {
                if(arg9 == 1) {
                }
                else {
                label_19:
                    if(v0.getAlpha() < v4) {
                        arg11.add(v1);
                    }
                    else {
                    }

                    return;
                }
            }

            ObjectAnimator v3_1 = ObjectAnimator.ofFloat(v0, "alpha", new float[]{0f});
            ((Animator)v3_1).addListener(new AnimatorListenerAdapter(v0, arg9, arg10) {
                public boolean cancelled;

                public void onAnimationCancel(Animator arg1) {
                    this.cancelled = true;
                }

                public void onAnimationEnd(Animator arg4) {
                    if(!this.cancelled) {
                        BottomAppBar.this.translateActionMenuView(this.val$actionMenuView, this.val$targetMode, this.val$targetAttached);
                    }
                }
            });
            AnimatorSet v9 = new AnimatorSet();
            v9.setDuration(150);
            v9.playSequentially(new Animator[]{v3_1, v1});
            arg11.add(v9);
        }
        else if(!arg10) {
            goto label_19;
        }
        else {
            goto label_19;
        }
    }

    @Nullable private FloatingActionButton findDependentFab() {
        Object v2;
        FloatingActionButton v1 = null;
        if(!(this.getParent() instanceof CoordinatorLayout)) {
            return v1;
        }

        Iterator v0 = this.getParent().getDependents(((View)this)).iterator();
        do {
            if(!v0.hasNext()) {
                return v1;
            }

            v2 = v0.next();
        }
        while(!(v2 instanceof FloatingActionButton));

        return ((FloatingActionButton)v2);
    }

    @Nullable private ActionMenuView getActionMenuView() {
        int v0;
        for(v0 = 0; v0 < this.getChildCount(); ++v0) {
            View v1 = this.getChildAt(v0);
            if((v1 instanceof ActionMenuView)) {
                return ((ActionMenuView)v1);
            }
        }

        return null;
    }

    @Nullable public ColorStateList getBackgroundTint() {
        return this.materialShapeDrawable.getTintList();
    }

    @NonNull public androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior getBehavior() {
        return new Behavior();
    }

    @Dimension public float getCradleVerticalOffset() {
        return this.topEdgeTreatment.getCradleVerticalOffset();
    }

    public int getFabAlignmentMode() {
        return this.fabAlignmentMode;
    }

    public float getFabCradleMargin() {
        return this.topEdgeTreatment.getFabCradleMargin();
    }

    @Dimension public float getFabCradleRoundedCornerRadius() {
        return this.topEdgeTreatment.getFabCradleRoundedCornerRadius();
    }

    private float getFabTranslationX() {
        return ((float)this.getFabTranslationX(this.fabAlignmentMode));
    }

    private int getFabTranslationX(int arg4) {
        int v1 = 0;
        int v2 = 1;
        int v0 = ViewCompat.getLayoutDirection(((View)this)) == 1 ? 1 : 0;
        if(arg4 == 1) {
            arg4 = this.getMeasuredWidth() / 2 - this.fabOffsetEndMode;
            if(v0 != 0) {
                v2 = -1;
            }

            v1 = arg4 * v2;
        }

        return v1;
    }

    private float getFabTranslationY() {
        return this.getFabTranslationY(this.fabAttached);
    }

    private float getFabTranslationY(boolean arg7) {
        FloatingActionButton v0 = this.findDependentFab();
        if(v0 == null) {
            return 0;
        }

        Rect v2 = new Rect();
        v0.getContentRect(v2);
        float v3 = ((float)v2.height());
        if(v3 == 0f) {
            v3 = ((float)v0.getMeasuredHeight());
        }

        float v1 = ((float)(v0.getHeight() - v2.bottom));
        float v2_1 = ((float)(v0.getHeight() - v2.height()));
        float v4 = -this.getCradleVerticalOffset() + v3 / 2f + v1;
        float v0_1 = v2_1 - (((float)v0.getPaddingBottom()));
        v1 = ((float)(-this.getMeasuredHeight()));
        if(arg7) {
            v0_1 = v4;
        }

        return v1 + v0_1;
    }

    public boolean getHideOnScroll() {
        return this.hideOnScroll;
    }

    private boolean isAnimationRunning() {
        boolean v0;
        if(this.attachAnimator == null || !this.attachAnimator.isRunning()) {
            if(this.menuAnimator != null && (this.menuAnimator.isRunning())) {
                goto label_15;
            }

            if(this.modeAnimator != null && (this.modeAnimator.isRunning())) {
            label_15:
                v0 = true;
                return v0;
            }

            v0 = false;
        }
        else {
            goto label_15;
        }

        return v0;
    }

    private boolean isVisibleFab() {
        FloatingActionButton v0 = this.findDependentFab();
        boolean v0_1 = v0 == null || !v0.isOrWillBeShown() ? false : true;
        return v0_1;
    }

    private void maybeAnimateAttachChange(boolean arg3) {
        if(!ViewCompat.isLaidOut(((View)this))) {
            return;
        }

        if(this.attachAnimator != null) {
            this.attachAnimator.cancel();
        }

        ArrayList v0 = new ArrayList();
        boolean v1 = !arg3 || !this.isVisibleFab() ? false : true;
        this.createCradleShapeAnimation(v1, ((List)v0));
        this.createFabTranslationYAnimation(arg3, ((List)v0));
        AnimatorSet v3 = new AnimatorSet();
        v3.playTogether(((Collection)v0));
        this.attachAnimator = ((Animator)v3);
        this.attachAnimator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator arg2) {
                BottomAppBar.this.attachAnimator = null;
            }
        });
        this.attachAnimator.start();
    }

    private void maybeAnimateMenuView(int arg4, boolean arg5) {
        if(!ViewCompat.isLaidOut(((View)this))) {
            return;
        }

        if(this.menuAnimator != null) {
            this.menuAnimator.cancel();
        }

        ArrayList v0 = new ArrayList();
        this.createMenuViewTranslationAnimation(0, false, ((List)v0));
        AnimatorSet v4 = new AnimatorSet();
        v4.playTogether(((Collection)v0));
        this.menuAnimator = ((Animator)v4);
        this.menuAnimator.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator arg2) {
                BottomAppBar.this.menuAnimator = null;
            }
        });
        this.menuAnimator.start();
    }

    private void maybeAnimateModeChange(int arg2) {
        if(this.fabAlignmentMode != arg2) {
            if(!ViewCompat.isLaidOut(((View)this))) {
            }
            else {
                if(this.modeAnimator != null) {
                    this.modeAnimator.cancel();
                }

                ArrayList v0 = new ArrayList();
                this.createCradleTranslationAnimation(arg2, ((List)v0));
                this.createFabTranslationXAnimation(arg2, ((List)v0));
                AnimatorSet v2 = new AnimatorSet();
                v2.playTogether(((Collection)v0));
                this.modeAnimator = ((Animator)v2);
                this.modeAnimator.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator arg2) {
                        BottomAppBar.this.modeAnimator = null;
                    }
                });
                this.modeAnimator.start();
                return;
            }
        }
    }

    protected void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        super.onLayout(arg1, arg2, arg3, arg4, arg5);
        this.cancelAnimations();
        this.setCutoutState();
    }

    protected void onRestoreInstanceState(Parcelable arg2) {
        if(!(arg2 instanceof SavedState)) {
            super.onRestoreInstanceState(arg2);
            return;
        }

        super.onRestoreInstanceState(((SavedState)arg2).getSuperState());
        this.fabAlignmentMode = ((SavedState)arg2).fabAlignmentMode;
        this.fabAttached = ((SavedState)arg2).fabAttached;
    }

    protected Parcelable onSaveInstanceState() {
        SavedState v1 = new SavedState(super.onSaveInstanceState());
        v1.fabAlignmentMode = this.fabAlignmentMode;
        v1.fabAttached = this.fabAttached;
        return ((Parcelable)v1);
    }

    private void removeFabAnimationListeners(@NonNull FloatingActionButton arg2) {
        arg2.removeOnHideAnimationListener(this.fabAnimationListener);
        arg2.removeOnShowAnimationListener(this.fabAnimationListener);
    }

    public void replaceMenu(@MenuRes int arg2) {
        this.getMenu().clear();
        this.inflateMenu(arg2);
    }

    public void setBackgroundTint(@Nullable ColorStateList arg2) {
        DrawableCompat.setTintList(this.materialShapeDrawable, arg2);
    }

    public void setCradleVerticalOffset(@Dimension float arg2) {
        if(arg2 != this.getCradleVerticalOffset()) {
            this.topEdgeTreatment.setCradleVerticalOffset(arg2);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    private void setCutoutState() {
        this.topEdgeTreatment.setHorizontalOffset(this.getFabTranslationX());
        FloatingActionButton v0 = this.findDependentFab();
        MaterialShapeDrawable v1 = this.materialShapeDrawable;
        float v3 = 1f;
        float v2 = !this.fabAttached || !this.isVisibleFab() ? 0f : 1f;
        v1.setInterpolation(v2);
        if(v0 != null) {
            v0.setTranslationY(this.getFabTranslationY());
            v0.setTranslationX(this.getFabTranslationX());
        }

        ActionMenuView v0_1 = this.getActionMenuView();
        if(v0_1 != null) {
            v0_1.setAlpha(v3);
            if(!this.isVisibleFab()) {
                this.translateActionMenuView(v0_1, 0, false);
            }
            else {
                this.translateActionMenuView(v0_1, this.fabAlignmentMode, this.fabAttached);
            }
        }
    }

    public void setFabAlignmentMode(int arg2) {
        this.maybeAnimateModeChange(arg2);
        this.maybeAnimateMenuView(arg2, this.fabAttached);
        this.fabAlignmentMode = arg2;
    }

    public void setFabCradleMargin(@Dimension float arg2) {
        if(arg2 != this.getFabCradleMargin()) {
            this.topEdgeTreatment.setFabCradleMargin(arg2);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@Dimension float arg2) {
        if(arg2 != this.getFabCradleRoundedCornerRadius()) {
            this.topEdgeTreatment.setFabCradleRoundedCornerRadius(arg2);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    void setFabDiameter(@Px int arg2) {
        float v2 = ((float)arg2);
        if(v2 != this.topEdgeTreatment.getFabDiameter()) {
            this.topEdgeTreatment.setFabDiameter(v2);
            this.materialShapeDrawable.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean arg1) {
        this.hideOnScroll = arg1;
    }

    public void setSubtitle(CharSequence arg1) {
    }

    public void setTitle(CharSequence arg1) {
    }

    private void translateActionMenuView(ActionMenuView arg9, int arg10, boolean arg11) {
        int v0 = ViewCompat.getLayoutDirection(((View)this)) == 1 ? 1 : 0;
        int v3 = 0;
        int v4 = 0;
        while(v3 < this.getChildCount()) {
            View v5 = this.getChildAt(v3);
            int v6 = !(v5.getLayoutParams() instanceof LayoutParams) || (v5.getLayoutParams().gravity & 0x800007) != 0x800003 ? 0 : 1;
            if(v6 != 0) {
                int v5_1 = v0 != 0 ? v5.getLeft() : v5.getRight();
                v4 = Math.max(v4, v5_1);
            }

            ++v3;
        }

        v0 = v0 != 0 ? arg9.getRight() : arg9.getLeft();
        v4 -= v0;
        float v10 = arg10 != 1 || !arg11 ? 0f : ((float)v4);
        arg9.setTranslationX(v10);
    }
}

