package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver$OnScrollChangedListener;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.google.android.material.internal.Experimental;

@Experimental(value="The shapes API is currently experimental and subject to change") public class InterpolateOnScrollPositionChangeHelper {
    class com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper$1 implements ViewTreeObserver$OnScrollChangedListener {
        com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper$1(InterpolateOnScrollPositionChangeHelper arg1) {
            InterpolateOnScrollPositionChangeHelper.this = arg1;
            super();
        }

        public void onScrollChanged() {
            InterpolateOnScrollPositionChangeHelper.this.updateInterpolationForScreenPosition();
        }
    }

    private final int[] containerLocation;
    private ScrollView containingScrollView;
    private MaterialShapeDrawable materialShapeDrawable;
    private final ViewTreeObserver$OnScrollChangedListener scrollChangedListener;
    private final int[] scrollLocation;
    private View shapedView;

    public InterpolateOnScrollPositionChangeHelper(View arg3, MaterialShapeDrawable arg4, ScrollView arg5) {
        super();
        this.scrollLocation = new int[2];
        this.containerLocation = new int[2];
        this.scrollChangedListener = new com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper$1(this);
        this.shapedView = arg3;
        this.materialShapeDrawable = arg4;
        this.containingScrollView = arg5;
    }

    public void setContainingScrollView(ScrollView arg1) {
        this.containingScrollView = arg1;
    }

    public void setMaterialShapeDrawable(MaterialShapeDrawable arg1) {
        this.materialShapeDrawable = arg1;
    }

    public void startListeningForScrollChanges(ViewTreeObserver arg2) {
        arg2.addOnScrollChangedListener(this.scrollChangedListener);
    }

    public void stopListeningForScrollChanges(ViewTreeObserver arg2) {
        arg2.removeOnScrollChangedListener(this.scrollChangedListener);
    }

    public void updateInterpolationForScreenPosition() {
        if(this.containingScrollView == null) {
            return;
        }

        if(this.containingScrollView.getChildCount() != 0) {
            this.containingScrollView.getLocationInWindow(this.scrollLocation);
            this.containingScrollView.getChildAt(0).getLocationInWindow(this.containerLocation);
            int v0 = this.shapedView.getTop() - this.scrollLocation[1] + this.containerLocation[1];
            int v1 = this.shapedView.getHeight();
            int v2 = this.containingScrollView.getHeight();
            float v4 = 1f;
            if(v0 < 0) {
                this.materialShapeDrawable.setInterpolation(Math.max(0f, Math.min(v4, (((float)v0)) / (((float)v1)) + v4)));
                this.shapedView.invalidate();
            }
            else {
                v0 += v1;
                if(v0 > v2) {
                    this.materialShapeDrawable.setInterpolation(Math.max(0f, Math.min(v4, v4 - (((float)(v0 - v2))) / (((float)v1)))));
                    this.shapedView.invalidate();
                }
                else if(this.materialShapeDrawable.getInterpolation() != v4) {
                    this.materialShapeDrawable.setInterpolation(v4);
                    this.shapedView.invalidate();
                }
            }

            return;
        }

        throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
    }
}

