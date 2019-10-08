package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;

class ViewUtilsBase {
    private float[] mMatrixValues;

    ViewUtilsBase() {
        super();
    }

    public void clearNonTransitionAlpha(@NonNull View arg3) {
        if(arg3.getVisibility() == 0) {
            arg3.setTag(R$id.save_non_transition_alpha, null);
        }
    }

    public float getTransitionAlpha(@NonNull View arg2) {
        Object v0 = arg2.getTag(R$id.save_non_transition_alpha);
        if(v0 != null) {
            return arg2.getAlpha() / ((Float)v0).floatValue();
        }

        return arg2.getAlpha();
    }

    public void saveNonTransitionAlpha(@NonNull View arg3) {
        if(arg3.getTag(R$id.save_non_transition_alpha) == null) {
            arg3.setTag(R$id.save_non_transition_alpha, Float.valueOf(arg3.getAlpha()));
        }
    }

    public void setAnimationMatrix(@NonNull View arg10, Matrix arg11) {
        float v0 = 1f;
        int v1 = 2;
        if(arg11 == null || (arg11.isIdentity())) {
            arg10.setPivotX(((float)(arg10.getWidth() / v1)));
            arg10.setPivotY(((float)(arg10.getHeight() / v1)));
            arg10.setTranslationX(0f);
            arg10.setTranslationY(0f);
            arg10.setScaleX(v0);
            arg10.setScaleY(v0);
            arg10.setRotation(0f);
        }
        else {
            float[] v3 = this.mMatrixValues;
            if(v3 == null) {
                v3 = new float[9];
                this.mMatrixValues = v3;
            }

            arg11.getValues(v3);
            float v11 = v3[3];
            v0 = ((float)Math.sqrt(((double)(v0 - v11 * v11))));
            int v5 = v3[0] < 0f ? -1 : 1;
            v0 *= ((float)v5);
            v11 = ((float)Math.toDegrees(Math.atan2(((double)v11), ((double)v0))));
            float v4 = v3[0] / v0;
            float v5_1 = v3[4] / v0;
            v0 = v3[v1];
            float v1_1 = v3[5];
            arg10.setPivotX(0f);
            arg10.setPivotY(0f);
            arg10.setTranslationX(v0);
            arg10.setTranslationY(v1_1);
            arg10.setRotation(v11);
            arg10.setScaleX(v4);
            arg10.setScaleY(v5_1);
        }
    }

    public void setLeftTopRightBottom(View arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.setLeft(arg2);
        arg1.setTop(arg3);
        arg1.setRight(arg4);
        arg1.setBottom(arg5);
    }

    public void setTransitionAlpha(@NonNull View arg2, float arg3) {
        Object v0 = arg2.getTag(R$id.save_non_transition_alpha);
        if(v0 != null) {
            arg2.setAlpha(((Float)v0).floatValue() * arg3);
        }
        else {
            arg2.setAlpha(arg3);
        }
    }

    public void transformMatrixToGlobal(@NonNull View arg3, @NonNull Matrix arg4) {
        ViewParent v0 = arg3.getParent();
        if((v0 instanceof View)) {
            this.transformMatrixToGlobal(((View)v0), arg4);
            arg4.preTranslate(((float)(-((View)v0).getScrollX())), ((float)(-((View)v0).getScrollY())));
        }

        arg4.preTranslate(((float)arg3.getLeft()), ((float)arg3.getTop()));
        Matrix v3 = arg3.getMatrix();
        if(!v3.isIdentity()) {
            arg4.preConcat(v3);
        }
    }

    public void transformMatrixToLocal(@NonNull View arg3, @NonNull Matrix arg4) {
        ViewParent v0 = arg3.getParent();
        if((v0 instanceof View)) {
            this.transformMatrixToLocal(((View)v0), arg4);
            arg4.postTranslate(((float)((View)v0).getScrollX()), ((float)((View)v0).getScrollY()));
        }

        arg4.postTranslate(((float)arg3.getLeft()), ((float)arg3.getTop()));
        Matrix v3 = arg3.getMatrix();
        if(!v3.isIdentity()) {
            Matrix v0_1 = new Matrix();
            if(v3.invert(v0_1)) {
                arg4.postConcat(v0_1);
            }
        }
    }
}

