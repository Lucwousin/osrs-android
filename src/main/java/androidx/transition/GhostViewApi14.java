package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;

@SuppressLint(value={"ViewConstructor"}) class GhostViewApi14 extends View implements GhostViewImpl {
    class androidx.transition.GhostViewApi14$1 implements ViewTreeObserver$OnPreDrawListener {
        androidx.transition.GhostViewApi14$1(GhostViewApi14 arg1) {
            GhostViewApi14.this = arg1;
            super();
        }

        public boolean onPreDraw() {
            GhostViewApi14.this.mCurrentMatrix = GhostViewApi14.this.mView.getMatrix();
            ViewCompat.postInvalidateOnAnimation(GhostViewApi14.this);
            if(GhostViewApi14.this.mStartParent != null && GhostViewApi14.this.mStartView != null) {
                GhostViewApi14.this.mStartParent.endViewTransition(GhostViewApi14.this.mStartView);
                ViewCompat.postInvalidateOnAnimation(GhostViewApi14.this.mStartParent);
                GhostViewApi14.this.mStartParent = null;
                GhostViewApi14.this.mStartView = null;
            }

            return 1;
        }
    }

    Matrix mCurrentMatrix;
    private int mDeltaX;
    private int mDeltaY;
    private final Matrix mMatrix;
    private final ViewTreeObserver$OnPreDrawListener mOnPreDrawListener;
    int mReferences;
    ViewGroup mStartParent;
    View mStartView;
    final View mView;

    GhostViewApi14(View arg2) {
        super(arg2.getContext());
        this.mMatrix = new Matrix();
        this.mOnPreDrawListener = new androidx.transition.GhostViewApi14$1(this);
        this.mView = arg2;
        this.setLayerType(2, null);
    }

    static GhostViewImpl addGhost(View arg1, ViewGroup arg2) {
        GhostViewApi14 v0 = GhostViewApi14.getGhostView(arg1);
        if(v0 == null) {
            FrameLayout v2 = GhostViewApi14.findFrameLayout(arg2);
            if(v2 == null) {
                return null;
            }
            else {
                v0 = new GhostViewApi14(arg1);
                v2.addView(((View)v0));
            }
        }

        ++v0.mReferences;
        return ((GhostViewImpl)v0);
    }

    private static FrameLayout findFrameLayout(ViewGroup arg1) {
        ViewParent v1;
        do {
            if((arg1 instanceof FrameLayout)) {
                goto label_8;
            }

            v1 = ((ViewGroup)v1).getParent();
        }
        while((v1 instanceof ViewGroup));

        return null;
    label_8:
        return ((ViewGroup)v1);
    }

    static GhostViewApi14 getGhostView(@NonNull View arg1) {
        return arg1.getTag(R$id.ghost_view);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        GhostViewApi14.setGhostView(this.mView, this);
        int[] v1 = new int[2];
        int[] v0 = new int[2];
        this.getLocationOnScreen(v1);
        this.mView.getLocationOnScreen(v0);
        v0[0] = ((int)((((float)v0[0])) - this.mView.getTranslationX()));
        v0[1] = ((int)((((float)v0[1])) - this.mView.getTranslationY()));
        this.mDeltaX = v0[0] - v1[0];
        this.mDeltaY = v0[1] - v1[1];
        this.mView.getViewTreeObserver().addOnPreDrawListener(this.mOnPreDrawListener);
        this.mView.setVisibility(4);
    }

    protected void onDetachedFromWindow() {
        this.mView.getViewTreeObserver().removeOnPreDrawListener(this.mOnPreDrawListener);
        this.mView.setVisibility(0);
        GhostViewApi14.setGhostView(this.mView, null);
        super.onDetachedFromWindow();
    }

    protected void onDraw(Canvas arg4) {
        this.mMatrix.set(this.mCurrentMatrix);
        this.mMatrix.postTranslate(((float)this.mDeltaX), ((float)this.mDeltaY));
        arg4.setMatrix(this.mMatrix);
        this.mView.draw(arg4);
    }

    static void removeGhost(View arg2) {
        GhostViewApi14 v2 = GhostViewApi14.getGhostView(arg2);
        if(v2 != null) {
            --v2.mReferences;
            if(v2.mReferences <= 0) {
                ViewParent v0 = v2.getParent();
                if((v0 instanceof ViewGroup)) {
                    ((ViewGroup)v0).endViewTransition(((View)v2));
                    ((ViewGroup)v0).removeView(((View)v2));
                }
            }
        }
    }

    public void reserveEndViewTransition(ViewGroup arg1, View arg2) {
        this.mStartParent = arg1;
        this.mStartView = arg2;
    }

    private static void setGhostView(@NonNull View arg1, GhostViewApi14 arg2) {
        arg1.setTag(R$id.ghost_view, arg2);
    }

    public void setVisibility(int arg2) {
        super.setVisibility(arg2);
        View v0 = this.mView;
        arg2 = arg2 == 0 ? 4 : 0;
        v0.setVisibility(arg2);
    }
}

