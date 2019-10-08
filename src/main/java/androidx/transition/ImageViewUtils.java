package androidx.transition;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.os.Build$VERSION;
import android.util.Log;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ImageViewUtils {
    private static final String TAG = "ImageViewUtils";
    private static Method sAnimateTransformMethod;
    private static boolean sAnimateTransformMethodFetched;

    private ImageViewUtils() {
        super();
    }

    static void animateTransform(ImageView arg3, Matrix arg4) {
        if(Build$VERSION.SDK_INT < 21) {
            arg3.setImageMatrix(arg4);
        }
        else {
            ImageViewUtils.fetchAnimateTransformMethod();
            if(ImageViewUtils.sAnimateTransformMethod != null) {
                try {
                    ImageViewUtils.sAnimateTransformMethod.invoke(arg3, arg4);
                    return;
                }
                catch(IllegalAccessException ) {
                    return;
                }
                catch(InvocationTargetException v3) {
                    throw new RuntimeException(v3.getCause());
                }
            }
        }
    }

    private static void fetchAnimateTransformMethod() {
        if(!ImageViewUtils.sAnimateTransformMethodFetched) {
            try {
                ImageViewUtils.sAnimateTransformMethod = ImageView.class.getDeclaredMethod("animateTransform", Matrix.class);
                ImageViewUtils.sAnimateTransformMethod.setAccessible(true);
            }
            catch(NoSuchMethodException v1) {
                Log.i("ImageViewUtils", "Failed to retrieve animateTransform method", ((Throwable)v1));
            }

            ImageViewUtils.sAnimateTransformMethodFetched = true;
        }
    }

    static void reserveEndAnimateTransform(ImageView arg2, Animator arg3) {
        if(Build$VERSION.SDK_INT < 21) {
            arg3.addListener(new AnimatorListenerAdapter(arg2) {
                public void onAnimationEnd(Animator arg5) {
                    Object v0 = this.val$view.getTag(R$id.save_scale_type);
                    this.val$view.setScaleType(((ImageView$ScaleType)v0));
                    Object v3 = null;
                    this.val$view.setTag(R$id.save_scale_type, v3);
                    if(v0 == ImageView$ScaleType.MATRIX) {
                        this.val$view.setImageMatrix(this.val$view.getTag(R$id.save_image_matrix));
                        this.val$view.setTag(R$id.save_image_matrix, v3);
                    }

                    arg5.removeListener(((Animator$AnimatorListener)this));
                }
            });
        }
    }

    static void startAnimateTransform(ImageView arg2) {
        if(Build$VERSION.SDK_INT < 21) {
            ImageView$ScaleType v0 = arg2.getScaleType();
            arg2.setTag(R$id.save_scale_type, v0);
            if(v0 == ImageView$ScaleType.MATRIX) {
                arg2.setTag(R$id.save_image_matrix, arg2.getImageMatrix());
            }
            else {
                arg2.setScaleType(ImageView$ScaleType.MATRIX);
            }

            arg2.setImageMatrix(MatrixUtils.IDENTITY_MATRIX);
        }
    }
}

