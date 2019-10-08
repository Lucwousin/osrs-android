package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.Map;

public class ChangeImageTransform extends Transition {
    final class androidx.transition.ChangeImageTransform$1 implements TypeEvaluator {
        androidx.transition.ChangeImageTransform$1() {
            super();
        }

        public Matrix evaluate(float arg1, Matrix arg2, Matrix arg3) {
            return null;
        }

        public Object evaluate(float arg1, Object arg2, Object arg3) {
            return this.evaluate(arg1, ((Matrix)arg2), ((Matrix)arg3));
        }
    }

    final class androidx.transition.ChangeImageTransform$2 extends Property {
        androidx.transition.ChangeImageTransform$2(Class arg1, String arg2) {
            super(arg1, arg2);
        }

        public Matrix get(ImageView arg1) {
            return null;
        }

        public Object get(Object arg1) {
            return this.get(((ImageView)arg1));
        }

        public void set(ImageView arg1, Matrix arg2) {
            ImageViewUtils.animateTransform(arg1, arg2);
        }

        public void set(Object arg1, Object arg2) {
            this.set(((ImageView)arg1), ((Matrix)arg2));
        }
    }

    class androidx.transition.ChangeImageTransform$3 {
        static {
            androidx.transition.ChangeImageTransform$3.$SwitchMap$android$widget$ImageView$ScaleType = new int[ImageView$ScaleType.values().length];
            try {
                androidx.transition.ChangeImageTransform$3.$SwitchMap$android$widget$ImageView$ScaleType[ImageView$ScaleType.FIT_XY.ordinal()] = 1;
                goto label_9;
            }
            catch(NoSuchFieldError ) {
                try {
                label_9:
                    androidx.transition.ChangeImageTransform$3.$SwitchMap$android$widget$ImageView$ScaleType[ImageView$ScaleType.CENTER_CROP.ordinal()] = 2;
                    return;
                }
                catch(NoSuchFieldError ) {
                    return;
                }
            }
        }
    }

    private static final Property ANIMATED_TRANSFORM_PROPERTY = null;
    private static final TypeEvaluator NULL_MATRIX_EVALUATOR = null;
    private static final String PROPNAME_BOUNDS = "android:changeImageTransform:bounds";
    private static final String PROPNAME_MATRIX = "android:changeImageTransform:matrix";
    private static final String[] sTransitionProperties;

    static {
        ChangeImageTransform.sTransitionProperties = new String[]{"android:changeImageTransform:matrix", "android:changeImageTransform:bounds"};
        ChangeImageTransform.NULL_MATRIX_EVALUATOR = new androidx.transition.ChangeImageTransform$1();
        ChangeImageTransform.ANIMATED_TRANSFORM_PROPERTY = new androidx.transition.ChangeImageTransform$2(Matrix.class, "animatedTransform");
    }

    public ChangeImageTransform(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
    }

    public ChangeImageTransform() {
        super();
    }

    public void captureEndValues(@NonNull TransitionValues arg1) {
        this.captureValues(arg1);
    }

    public void captureStartValues(@NonNull TransitionValues arg1) {
        this.captureValues(arg1);
    }

    private void captureValues(TransitionValues arg7) {
        View v0 = arg7.view;
        if((v0 instanceof ImageView)) {
            if(v0.getVisibility() != 0) {
            }
            else {
                View v1 = v0;
                if(((ImageView)v1).getDrawable() == null) {
                    return;
                }
                else {
                    Map v7 = arg7.values;
                    v7.put("android:changeImageTransform:bounds", new Rect(v0.getLeft(), v0.getTop(), v0.getRight(), v0.getBottom()));
                    v7.put("android:changeImageTransform:matrix", ChangeImageTransform.copyImageMatrix(((ImageView)v1)));
                    return;
                }
            }
        }
    }

    private static Matrix centerCropMatrix(ImageView arg5) {
        Drawable v0 = arg5.getDrawable();
        int v1 = v0.getIntrinsicWidth();
        float v2 = ((float)arg5.getWidth());
        float v1_1 = ((float)v1);
        int v0_1 = v0.getIntrinsicHeight();
        float v5 = ((float)arg5.getHeight());
        float v0_2 = ((float)v0_1);
        float v3 = Math.max(v2 / v1_1, v5 / v0_2);
        int v2_1 = Math.round((v2 - v1_1 * v3) / 2f);
        int v5_1 = Math.round((v5 - v0_2 * v3) / 2f);
        Matrix v0_3 = new Matrix();
        v0_3.postScale(v3, v3);
        v0_3.postTranslate(((float)v2_1), ((float)v5_1));
        return v0_3;
    }

    private static Matrix copyImageMatrix(ImageView arg2) {
        switch(androidx.transition.ChangeImageTransform$3.$SwitchMap$android$widget$ImageView$ScaleType[arg2.getScaleType().ordinal()]) {
            case 1: {
                goto label_11;
            }
            case 2: {
                goto label_9;
            }
        }

        return new Matrix(arg2.getImageMatrix());
    label_9:
        return ChangeImageTransform.centerCropMatrix(arg2);
    label_11:
        return ChangeImageTransform.fitXYMatrix(arg2);
    }

    public Animator createAnimator(@NonNull ViewGroup arg5, TransitionValues arg6, TransitionValues arg7) {
        ObjectAnimator v6_2;
        int v3;
        Animator v5 = null;
        if(arg6 != null) {
            if(arg7 == null) {
            }
            else {
                Object v0 = arg6.values.get("android:changeImageTransform:bounds");
                Object v1 = arg7.values.get("android:changeImageTransform:bounds");
                if(v0 != null) {
                    if(v1 == null) {
                    }
                    else {
                        Object v6 = arg6.values.get("android:changeImageTransform:matrix");
                        Object v2 = arg7.values.get("android:changeImageTransform:matrix");
                        if(v6 != null || v2 != null) {
                            if(v6 != null && (((Matrix)v6).equals(v2))) {
                            label_24:
                                v3 = 1;
                                goto label_27;
                            }

                            v3 = 0;
                        }
                        else {
                            goto label_24;
                        }

                    label_27:
                        if((((Rect)v0).equals(v1)) && v3 != 0) {
                            return v5;
                        }

                        View v5_1 = arg7.view;
                        Drawable v7 = ((ImageView)v5_1).getDrawable();
                        int v0_1 = v7.getIntrinsicWidth();
                        int v7_1 = v7.getIntrinsicHeight();
                        ImageViewUtils.startAnimateTransform(((ImageView)v5_1));
                        if(v0_1 == 0 || v7_1 == 0) {
                            v6_2 = this.createNullAnimator(((ImageView)v5_1));
                        }
                        else {
                            if(v6 == null) {
                                Matrix v6_1 = MatrixUtils.IDENTITY_MATRIX;
                            }

                            if(v2 == null) {
                                Matrix v2_1 = MatrixUtils.IDENTITY_MATRIX;
                            }

                            ChangeImageTransform.ANIMATED_TRANSFORM_PROPERTY.set(v5_1, v6);
                            v6_2 = this.createMatrixAnimator(((ImageView)v5_1), ((Matrix)v6), ((Matrix)v2));
                        }

                        ImageViewUtils.reserveEndAnimateTransform(((ImageView)v5_1), ((Animator)v6_2));
                        return ((Animator)v6_2);
                    }
                }

                return v5;
            }
        }

        return v5;
    }

    private ObjectAnimator createMatrixAnimator(ImageView arg5, Matrix arg6, Matrix arg7) {
        return ObjectAnimator.ofObject(arg5, ChangeImageTransform.ANIMATED_TRANSFORM_PROPERTY, new MatrixEvaluator(), new Matrix[]{arg6, arg7});
    }

    private ObjectAnimator createNullAnimator(ImageView arg6) {
        return ObjectAnimator.ofObject(arg6, ChangeImageTransform.ANIMATED_TRANSFORM_PROPERTY, ChangeImageTransform.NULL_MATRIX_EVALUATOR, new Matrix[]{null, null});
    }

    private static Matrix fitXYMatrix(ImageView arg4) {
        Drawable v0 = arg4.getDrawable();
        Matrix v1 = new Matrix();
        v1.postScale((((float)arg4.getWidth())) / (((float)v0.getIntrinsicWidth())), (((float)arg4.getHeight())) / (((float)v0.getIntrinsicHeight())));
        return v1;
    }

    public String[] getTransitionProperties() {
        return ChangeImageTransform.sTransitionProperties;
    }
}

