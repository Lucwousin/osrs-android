package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$id;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import com.google.android.material.animation.ArgbEvaluatorCompat;
import com.google.android.material.animation.ChildrenAlphaProperty;
import com.google.android.material.animation.DrawableAlphaProperty;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.animation.MotionTiming;
import com.google.android.material.animation.Positioning;
import com.google.android.material.circularreveal.CircularRevealCompat;
import com.google.android.material.circularreveal.CircularRevealHelper;
import com.google.android.material.circularreveal.CircularRevealWidget$CircularRevealScrimColorProperty;
import com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo;
import com.google.android.material.circularreveal.CircularRevealWidget;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.math.MathUtils;
import java.util.ArrayList;
import java.util.List;

public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public class FabTransformationSpec {
        public Positioning positioning;
        public MotionSpec timings;

        protected FabTransformationSpec() {
            super();
        }
    }

    private final int[] tmpArray;
    private final Rect tmpRect;
    private final RectF tmpRectF1;
    private final RectF tmpRectF2;

    public FabTransformationBehavior() {
        super();
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpArray = new int[2];
    }

    public FabTransformationBehavior(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
        this.tmpRect = new Rect();
        this.tmpRectF1 = new RectF();
        this.tmpRectF2 = new RectF();
        this.tmpArray = new int[2];
    }

    @Nullable private ViewGroup calculateChildContentContainer(View arg2) {
        View v0 = arg2.findViewById(R$id.mtrl_child_content_container);
        if(v0 != null) {
            return this.toViewGroupOrNull(v0);
        }

        if(!(arg2 instanceof TransformationChildLayout)) {
            if((arg2 instanceof TransformationChildCard)) {
            }
            else {
                return this.toViewGroupOrNull(arg2);
            }
        }

        return this.toViewGroupOrNull(((ViewGroup)arg2).getChildAt(0));
    }

    private void calculateChildVisibleBoundsAtEndOfExpansion(View arg1, FabTransformationSpec arg2, MotionTiming arg3, MotionTiming arg4, float arg5, float arg6, float arg7, float arg8, RectF arg9) {
        float v3 = this.calculateValueOfAnimationAtEndOfExpansion(arg2, arg3, arg5, arg7);
        float v2 = this.calculateValueOfAnimationAtEndOfExpansion(arg2, arg4, arg6, arg8);
        Rect v4 = this.tmpRect;
        arg1.getWindowVisibleDisplayFrame(v4);
        RectF v5 = this.tmpRectF1;
        v5.set(v4);
        RectF v4_1 = this.tmpRectF2;
        this.calculateWindowBounds(arg1, v4_1);
        v4_1.offset(v3, v2);
        v4_1.intersect(v5);
        arg9.set(v4_1);
    }

    private float calculateRevealCenterX(View arg3, View arg4, Positioning arg5) {
        RectF v0 = this.tmpRectF1;
        RectF v1 = this.tmpRectF2;
        this.calculateWindowBounds(arg3, v0);
        this.calculateWindowBounds(arg4, v1);
        v1.offset(-this.calculateTranslationX(arg3, arg4, arg5), 0f);
        return v0.centerX() - v1.left;
    }

    private float calculateRevealCenterY(View arg3, View arg4, Positioning arg5) {
        RectF v0 = this.tmpRectF1;
        RectF v1 = this.tmpRectF2;
        this.calculateWindowBounds(arg3, v0);
        this.calculateWindowBounds(arg4, v1);
        v1.offset(0f, -this.calculateTranslationY(arg3, arg4, arg5));
        return v0.centerY() - v1.top;
    }

    private float calculateTranslationX(View arg3, View arg4, Positioning arg5) {
        float v3_1;
        RectF v0 = this.tmpRectF1;
        RectF v1 = this.tmpRectF2;
        this.calculateWindowBounds(arg3, v0);
        this.calculateWindowBounds(arg4, v1);
        int v3 = arg5.gravity & 7;
        if(v3 == 1) {
            v3_1 = v1.centerX() - v0.centerX();
        }
        else if(v3 == 3) {
            v3_1 = v1.left - v0.left;
        }
        else if(v3 != 5) {
            v3_1 = 0f;
        }
        else {
            v3_1 = v1.right - v0.right;
        }

        return v3_1 + arg5.xAdjustment;
    }

    private float calculateTranslationY(View arg3, View arg4, Positioning arg5) {
        float v3_1;
        RectF v0 = this.tmpRectF1;
        RectF v1 = this.tmpRectF2;
        this.calculateWindowBounds(arg3, v0);
        this.calculateWindowBounds(arg4, v1);
        int v3 = arg5.gravity & 0x70;
        if(v3 == 16) {
            v3_1 = v1.centerY() - v0.centerY();
        }
        else if(v3 == 0x30) {
            v3_1 = v1.top - v0.top;
        }
        else if(v3 != 80) {
            v3_1 = 0f;
        }
        else {
            v3_1 = v1.bottom - v0.bottom;
        }

        return v3_1 + arg5.yAdjustment;
    }

    private float calculateValueOfAnimationAtEndOfExpansion(FabTransformationSpec arg9, MotionTiming arg10, float arg11, float arg12) {
        long v0 = arg10.getDelay();
        long v2 = arg10.getDuration();
        MotionTiming v9 = arg9.timings.getTiming("expansion");
        return AnimationUtils.lerp(arg11, arg12, arg10.getInterpolator().getInterpolation((((float)(v9.getDelay() + v9.getDuration() + 17 - v0))) / (((float)v2))));
    }

    private void calculateWindowBounds(View arg4, RectF arg5) {
        arg5.set(0f, 0f, ((float)arg4.getWidth()), ((float)arg4.getHeight()));
        int[] v0 = this.tmpArray;
        arg4.getLocationInWindow(v0);
        arg5.offsetTo(((float)v0[0]), ((float)v0[1]));
        arg5.offset(((float)(((int)(-arg4.getTranslationX())))), ((float)(((int)(-arg4.getTranslationY())))));
    }

    private void createChildrenFadeAnimation(View arg2, View arg3, boolean arg4, boolean arg5, FabTransformationSpec arg6, List arg7, List arg8) {
        ObjectAnimator v2_1;
        if(!(arg3 instanceof ViewGroup)) {
            return;
        }

        if(((arg3 instanceof CircularRevealWidget)) && CircularRevealHelper.STRATEGY == 0) {
            return;
        }

        ViewGroup v2 = this.calculateChildContentContainer(arg3);
        if(v2 == null) {
            return;
        }

        if(arg4) {
            if(!arg5) {
                ChildrenAlphaProperty.CHILDREN_ALPHA.set(v2, Float.valueOf(0f));
            }

            v2_1 = ObjectAnimator.ofFloat(v2, ChildrenAlphaProperty.CHILDREN_ALPHA, new float[]{1f});
        }
        else {
            v2_1 = ObjectAnimator.ofFloat(v2, ChildrenAlphaProperty.CHILDREN_ALPHA, new float[]{0f});
        }

        arg6.timings.getTiming("contentFade").apply(((Animator)v2_1));
        arg7.add(v2_1);
    }

    private void createColorAnimation(View arg3, View arg4, boolean arg5, boolean arg6, FabTransformationSpec arg7, List arg8, List arg9) {
        ObjectAnimator v3_1;
        if(!(arg4 instanceof CircularRevealWidget)) {
            return;
        }

        int v3 = this.getBackgroundTint(arg3);
        int v9 = 0xFFFFFF & v3;
        if(arg5) {
            if(!arg6) {
                ((CircularRevealWidget)arg4).setCircularRevealScrimColor(v3);
            }

            v3_1 = ObjectAnimator.ofInt(arg4, CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, new int[]{v9});
        }
        else {
            v3_1 = ObjectAnimator.ofInt(arg4, CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR, new int[]{v3});
        }

        v3_1.setEvaluator(ArgbEvaluatorCompat.getInstance());
        arg7.timings.getTiming("color").apply(((Animator)v3_1));
        arg8.add(v3_1);
    }

    @TargetApi(value=21) private void createElevationAnimation(View arg2, View arg3, boolean arg4, boolean arg5, FabTransformationSpec arg6, List arg7, List arg8) {
        ObjectAnimator v2;
        float v8 = ViewCompat.getElevation(arg3) - ViewCompat.getElevation(arg2);
        if(arg4) {
            if(!arg5) {
                arg3.setTranslationZ(-v8);
            }

            v2 = ObjectAnimator.ofFloat(arg3, View.TRANSLATION_Z, new float[]{0f});
        }
        else {
            v2 = ObjectAnimator.ofFloat(arg3, View.TRANSLATION_Z, new float[]{-v8});
        }

        arg6.timings.getTiming("elevation").apply(((Animator)v2));
        arg7.add(v2);
    }

    private void createExpansionAnimation(View arg21, View arg22, boolean arg23, boolean arg24, FabTransformationSpec arg25, float arg26, float arg27, List arg28, List arg29) {
        MotionTiming v15;
        Animator v9_1;
        float v6;
        FabTransformationBehavior v12 = this;
        View v0 = arg21;
        View v8 = arg22;
        FabTransformationSpec v9 = arg25;
        if(!(v8 instanceof CircularRevealWidget)) {
            return;
        }

        View v13 = v8;
        float v2 = v12.calculateRevealCenterX(v0, v8, v9.positioning);
        float v3 = v12.calculateRevealCenterY(v0, v8, v9.positioning);
        ((FloatingActionButton)v0).getContentRect(v12.tmpRect);
        float v10 = (((float)v12.tmpRect.width())) / 2f;
        MotionTiming v11 = v9.timings.getTiming("expansion");
        if(arg23) {
            if(!arg24) {
                ((CircularRevealWidget)v13).setRevealInfo(new RevealInfo(v2, v3, v10));
            }

            v6 = arg24 ? ((CircularRevealWidget)v13).getRevealInfo().radius : v10;
            v9_1 = CircularRevealCompat.createCircularReveal(((CircularRevealWidget)v13), v2, v3, MathUtils.distanceToFurthestCorner(v2, v3, 0f, 0f, arg26, arg27));
            v9_1.addListener(new AnimatorListenerAdapter(((CircularRevealWidget)v13)) {
                public void onAnimationEnd(Animator arg2) {
                    RevealInfo v2 = this.val$circularRevealChild.getRevealInfo();
                    v2.radius = 3.402823E+38f;
                    this.val$circularRevealChild.setRevealInfo(v2);
                }
            });
            this.createPreFillRadialExpansion(arg22, v11.getDelay(), ((int)v2), ((int)v3), v6, arg28);
            v15 = v11;
        }
        else {
            v6 = ((CircularRevealWidget)v13).getRevealInfo().radius;
            Animator v14 = CircularRevealCompat.createCircularReveal(((CircularRevealWidget)v13), v2, v3, v10);
            int v15_1 = ((int)v2);
            int v7 = ((int)v3);
            this.createPreFillRadialExpansion(arg22, v11.getDelay(), v15_1, v7, v6, arg28);
            int v8_1 = v15_1;
            v15 = v11;
            this.createPostFillRadialExpansion(arg22, v11.getDelay(), v11.getDuration(), v9.timings.getTotalDuration(), v8_1, v7, v10, arg28);
            v9_1 = v14;
        }

        v15.apply(v9_1);
        arg28.add(v9_1);
        arg29.add(CircularRevealCompat.createCircularRevealListener(((CircularRevealWidget)v13)));
    }

    private void createIconFadeAnimation(View arg5, View arg6, boolean arg7, boolean arg8, FabTransformationSpec arg9, List arg10, List arg11) {
        ObjectAnimator v7;
        if((arg6 instanceof CircularRevealWidget)) {
            if(!(arg5 instanceof ImageView)) {
            }
            else {
                View v0 = arg6;
                Drawable v5 = ((ImageView)arg5).getDrawable();
                if(v5 == null) {
                    return;
                }
                else {
                    v5.mutate();
                    int v1 = 0xFF;
                    if(arg7) {
                        if(!arg8) {
                            v5.setAlpha(v1);
                        }

                        v7 = ObjectAnimator.ofInt(v5, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, new int[]{0});
                    }
                    else {
                        v7 = ObjectAnimator.ofInt(v5, DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT, new int[]{v1});
                    }

                    v7.addUpdateListener(new ValueAnimator$AnimatorUpdateListener(arg6) {
                        public void onAnimationUpdate(ValueAnimator arg1) {
                            this.val$child.invalidate();
                        }
                    });
                    arg9.timings.getTiming("iconFade").apply(((Animator)v7));
                    arg10.add(v7);
                    arg11.add(new AnimatorListenerAdapter(((CircularRevealWidget)v0), v5) {
                        public void onAnimationEnd(Animator arg2) {
                            this.val$circularRevealChild.setCircularRevealOverlayDrawable(null);
                        }

                        public void onAnimationStart(Animator arg2) {
                            this.val$circularRevealChild.setCircularRevealOverlayDrawable(this.val$icon);
                        }
                    });
                    return;
                }
            }
        }
    }

    private void createPostFillRadialExpansion(View arg3, long arg4, long arg6, long arg8, int arg10, int arg11, float arg12, List arg13) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg4 += arg6;
            if(arg4 < arg8) {
                Animator v3 = ViewAnimationUtils.createCircularReveal(arg3, arg10, arg11, arg12, arg12);
                v3.setStartDelay(arg4);
                v3.setDuration(arg8 - arg4);
                arg13.add(v3);
            }
        }
    }

    private void createPreFillRadialExpansion(View arg4, long arg5, int arg7, int arg8, float arg9, List arg10) {
        if(Build$VERSION.SDK_INT >= 21) {
            long v0 = 0;
            if(arg5 > v0) {
                Animator v4 = ViewAnimationUtils.createCircularReveal(arg4, arg7, arg8, arg9, arg9);
                v4.setStartDelay(v0);
                v4.setDuration(arg5);
                arg10.add(v4);
            }
        }
    }

    private void createTranslationAnimation(View arg17, View arg18, boolean arg19, boolean arg20, FabTransformationSpec arg21, List arg22, List arg23, RectF arg24) {
        ObjectAnimator v15;
        ObjectAnimator v14;
        MotionTiming v7;
        MotionTiming v6_1;
        View v1 = arg18;
        FabTransformationSpec v3 = arg21;
        List v11 = arg22;
        float v4 = this.calculateTranslationX(arg17, v1, v3.positioning);
        float v0 = this.calculateTranslationY(arg17, v1, v3.positioning);
        if(v4 != 0f) {
            int v6 = Float.compare(v0, 0f);
            if(v6 == 0) {
                goto label_32;
            }
            else {
                if((arg19) && v0 < 0f || !arg19 && v6 > 0) {
                    v6_1 = v3.timings.getTiming("translationXCurveUpwards");
                    v7 = v3.timings.getTiming("translationYCurveUpwards");
                    goto label_38;
                }

                v6_1 = v3.timings.getTiming("translationXCurveDownwards");
                v7 = v3.timings.getTiming("translationYCurveDownwards");
            }
        }
        else {
        label_32:
            v6_1 = v3.timings.getTiming("translationXLinear");
            v7 = v3.timings.getTiming("translationYLinear");
        }

    label_38:
        MotionTiming v12 = v6_1;
        MotionTiming v13 = v7;
        if(arg19) {
            if(!arg20) {
                v1.setTranslationX(-v4);
                v1.setTranslationY(-v0);
            }

            v14 = ObjectAnimator.ofFloat(v1, View.TRANSLATION_X, new float[]{0f});
            v15 = ObjectAnimator.ofFloat(v1, View.TRANSLATION_Y, new float[]{0f});
            this.calculateChildVisibleBoundsAtEndOfExpansion(arg18, arg21, v12, v13, -v4, -v0, 0f, 0f, arg24);
        }
        else {
            v14 = ObjectAnimator.ofFloat(v1, View.TRANSLATION_X, new float[]{-v4});
            v15 = ObjectAnimator.ofFloat(v1, View.TRANSLATION_Y, new float[]{-v0});
        }

        v12.apply(((Animator)v14));
        v13.apply(((Animator)v15));
        v11.add(v14);
        v11.add(v15);
    }

    private int getBackgroundTint(View arg3) {
        ColorStateList v0 = ViewCompat.getBackgroundTintList(arg3);
        if(v0 != null) {
            return v0.getColorForState(arg3.getDrawableState(), v0.getDefaultColor());
        }

        return 0;
    }

    @CallSuper public boolean layoutDependsOn(CoordinatorLayout arg2, View arg3, View arg4) {
        if(arg3.getVisibility() != 8) {
            boolean v0 = false;
            if((arg4 instanceof FloatingActionButton)) {
                int v2 = ((FloatingActionButton)arg4).getExpandedComponentIdHint();
                if(v2 == 0 || v2 == arg3.getId()) {
                    v0 = true;
                }

                return v0;
            }

            return 0;
        }

        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @CallSuper public void onAttachedToLayoutParams(@NonNull LayoutParams arg2) {
        if(arg2.dodgeInsetEdges == 0) {
            arg2.dodgeInsetEdges = 80;
        }
    }

    @NonNull protected AnimatorSet onCreateExpandedStateChangeAnimation(View arg16, View arg17, boolean arg18, boolean arg19) {
        FabTransformationBehavior v10 = this;
        boolean v11 = arg18;
        FabTransformationSpec v12 = this.onCreateMotionSpec(arg17.getContext(), v11);
        ArrayList v13 = new ArrayList();
        ArrayList v14 = new ArrayList();
        if(Build$VERSION.SDK_INT >= 21) {
            this.createElevationAnimation(arg16, arg17, arg18, arg19, v12, v13, v14);
        }

        RectF v9 = v10.tmpRectF1;
        this.createTranslationAnimation(arg16, arg17, arg18, arg19, v12, v13, v14, v9);
        float v8 = v9.width();
        float v9_1 = v9.height();
        this.createIconFadeAnimation(arg16, arg17, arg18, arg19, v12, v13, v14);
        this.createExpansionAnimation(arg16, arg17, arg18, arg19, v12, v8, v9_1, v13, v14);
        this.createColorAnimation(arg16, arg17, arg18, arg19, v12, v13, v14);
        this.createChildrenFadeAnimation(arg16, arg17, arg18, arg19, v12, v13, v14);
        AnimatorSet v0 = new AnimatorSet();
        AnimatorSetCompat.playTogether(v0, ((List)v13));
        v0.addListener(new AnimatorListenerAdapter(v11, arg17, arg16) {
            public void onAnimationEnd(Animator arg2) {
                if(!this.val$expanded) {
                    this.val$child.setVisibility(4);
                    this.val$dependency.setAlpha(1f);
                    this.val$dependency.setVisibility(0);
                }
            }

            public void onAnimationStart(Animator arg2) {
                if(this.val$expanded) {
                    this.val$child.setVisibility(0);
                    this.val$dependency.setAlpha(0f);
                    this.val$dependency.setVisibility(4);
                }
            }
        });
        int v1 = 0;
        int v2 = ((List)v14).size();
        while(v1 < v2) {
            v0.addListener(((List)v14).get(v1));
            ++v1;
        }

        return v0;
    }

    protected abstract FabTransformationSpec onCreateMotionSpec(Context arg1, boolean arg2);

    @Nullable private ViewGroup toViewGroupOrNull(View arg2) {
        if((arg2 instanceof ViewGroup)) {
            return arg2;
        }

        return null;
    }
}

