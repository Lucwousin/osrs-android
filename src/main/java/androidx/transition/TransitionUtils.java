package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build$VERSION;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;

class TransitionUtils {
    class MatrixEvaluator implements TypeEvaluator {
        final float[] mTempEndValues;
        final Matrix mTempMatrix;
        final float[] mTempStartValues;

        MatrixEvaluator() {
            super();
            this.mTempStartValues = new float[9];
            this.mTempEndValues = new float[9];
            this.mTempMatrix = new Matrix();
        }

        public Matrix evaluate(float arg3, Matrix arg4, Matrix arg5) {
            arg4.getValues(this.mTempStartValues);
            arg5.getValues(this.mTempEndValues);
            int v4;
            for(v4 = 0; v4 < 9; ++v4) {
                this.mTempEndValues[v4] = this.mTempStartValues[v4] + (this.mTempEndValues[v4] - this.mTempStartValues[v4]) * arg3;
            }

            this.mTempMatrix.setValues(this.mTempEndValues);
            return this.mTempMatrix;
        }

        public Object evaluate(float arg1, Object arg2, Object arg3) {
            return this.evaluate(arg1, ((Matrix)arg2), ((Matrix)arg3));
        }
    }

    private static final boolean HAS_IS_ATTACHED_TO_WINDOW = false;
    private static final boolean HAS_OVERLAY = false;
    private static final boolean HAS_PICTURE_BITMAP = false;
    private static final int MAX_IMAGE_SIZE = 0x100000;

    static {
        boolean v1 = false;
        boolean v0 = Build$VERSION.SDK_INT >= 19 ? true : false;
        TransitionUtils.HAS_IS_ATTACHED_TO_WINDOW = v0;
        v0 = Build$VERSION.SDK_INT >= 18 ? true : false;
        TransitionUtils.HAS_OVERLAY = v0;
        if(Build$VERSION.SDK_INT >= 28) {
            v1 = true;
        }

        TransitionUtils.HAS_PICTURE_BITMAP = v1;
    }

    private TransitionUtils() {
        super();
    }

    static View copyViewImage(ViewGroup arg7, View arg8, View arg9) {
        Matrix v0 = new Matrix();
        v0.setTranslate(((float)(-arg9.getScrollX())), ((float)(-arg9.getScrollY())));
        ViewUtils.transformMatrixToGlobal(arg8, v0);
        ViewUtils.transformMatrixToLocal(((View)arg7), v0);
        RectF v9 = new RectF(0f, 0f, ((float)arg8.getWidth()), ((float)arg8.getHeight()));
        v0.mapRect(v9);
        int v1 = Math.round(v9.left);
        int v2 = Math.round(v9.top);
        int v3 = Math.round(v9.right);
        int v4 = Math.round(v9.bottom);
        ImageView v5 = new ImageView(arg8.getContext());
        v5.setScaleType(ImageView$ScaleType.CENTER_CROP);
        Bitmap v7 = TransitionUtils.createViewBitmap(arg8, v0, v9, arg7);
        if(v7 != null) {
            v5.setImageBitmap(v7);
        }

        v5.measure(View$MeasureSpec.makeMeasureSpec(v3 - v1, 0x40000000), View$MeasureSpec.makeMeasureSpec(v4 - v2, 0x40000000));
        v5.layout(v1, v2, v3, v4);
        return ((View)v5);
    }

    private static Bitmap createViewBitmap(View arg8, Matrix arg9, RectF arg10, ViewGroup arg11) {
        int v2_1;
        ViewParent v1;
        boolean v2;
        int v0;
        if(TransitionUtils.HAS_IS_ATTACHED_TO_WINDOW) {
            v0 = arg8.isAttachedToWindow() ^ 1;
            if(arg11 == null) {
                goto label_10;
            }
            else {
                v2 = arg11.isAttachedToWindow();
            }
        }
        else {
            v0 = 0;
        label_10:
            v2 = false;
        }

        Bitmap v4 = null;
        if(!TransitionUtils.HAS_OVERLAY || v0 == 0) {
            ViewGroup v1_1 = ((ViewGroup)v4);
            v2_1 = 0;
        }
        else if(!v2) {
            return v4;
        }
        else {
            v1 = arg8.getParent();
            v2_1 = ((ViewGroup)v1).indexOfChild(arg8);
            arg11.getOverlay().add(arg8);
        }

        int v3 = Math.round(arg10.width());
        int v5 = Math.round(arg10.height());
        if(v3 > 0 && v5 > 0) {
            float v4_1 = Math.min(1f, 1048576f / (((float)(v3 * v5))));
            v3 = Math.round((((float)v3)) * v4_1);
            v5 = Math.round((((float)v5)) * v4_1);
            arg9.postTranslate(-arg10.left, -arg10.top);
            arg9.postScale(v4_1, v4_1);
            if(TransitionUtils.HAS_PICTURE_BITMAP) {
                Picture v10 = new Picture();
                Canvas v3_1 = v10.beginRecording(v3, v5);
                v3_1.concat(arg9);
                arg8.draw(v3_1);
                v10.endRecording();
                v4 = Bitmap.createBitmap(v10);
            }
            else {
                v4 = Bitmap.createBitmap(v3, v5, Bitmap$Config.ARGB_8888);
                Canvas v10_1 = new Canvas(v4);
                v10_1.concat(arg9);
                arg8.draw(v10_1);
            }
        }

        if((TransitionUtils.HAS_OVERLAY) && v0 != 0) {
            arg11.getOverlay().remove(arg8);
            ((ViewGroup)v1).addView(arg8, v2_1);
        }

        return v4;
    }

    static Animator mergeAnimators(Animator arg3, Animator arg4) {
        if(arg3 == null) {
            return arg4;
        }

        if(arg4 == null) {
            return arg3;
        }

        AnimatorSet v0 = new AnimatorSet();
        v0.playTogether(new Animator[]{arg3, arg4});
        return ((Animator)v0);
    }
}

