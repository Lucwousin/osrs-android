package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY}) public class ViewGroupUtils {
    private static final ThreadLocal sMatrix;
    private static final ThreadLocal sRectF;

    static {
        ViewGroupUtils.sMatrix = new ThreadLocal();
        ViewGroupUtils.sRectF = new ThreadLocal();
    }

    private ViewGroupUtils() {
        super();
    }

    public static void getDescendantRect(ViewGroup arg3, View arg4, Rect arg5) {
        arg5.set(0, 0, arg4.getWidth(), arg4.getHeight());
        ViewGroupUtils.offsetDescendantRect(arg3, arg4, arg5);
    }

    private static void offsetDescendantMatrix(ViewParent arg2, View arg3, Matrix arg4) {
        ViewParent v0 = arg3.getParent();
        if(((v0 instanceof View)) && v0 != arg2) {
            ViewGroupUtils.offsetDescendantMatrix(arg2, ((View)v0), arg4);
            arg4.preTranslate(((float)(-((View)v0).getScrollX())), ((float)(-((View)v0).getScrollY())));
        }

        arg4.preTranslate(((float)arg3.getLeft()), ((float)arg3.getTop()));
        if(!arg3.getMatrix().isIdentity()) {
            arg4.preConcat(arg3.getMatrix());
        }
    }

    static void offsetDescendantRect(ViewGroup arg3, View arg4, Rect arg5) {
        RectF v3_1;
        Matrix v0_1;
        Object v0 = ViewGroupUtils.sMatrix.get();
        if(v0 == null) {
            v0_1 = new Matrix();
            ViewGroupUtils.sMatrix.set(v0_1);
        }
        else {
            ((Matrix)v0).reset();
        }

        ViewGroupUtils.offsetDescendantMatrix(((ViewParent)arg3), arg4, v0_1);
        Object v3 = ViewGroupUtils.sRectF.get();
        if(v3 == null) {
            v3_1 = new RectF();
            ViewGroupUtils.sRectF.set(v3_1);
        }

        v3_1.set(arg5);
        v0_1.mapRect(v3_1);
        arg5.set(((int)(v3_1.left + 0.5f)), ((int)(v3_1.top + 0.5f)), ((int)(v3_1.right + 0.5f)), ((int)(v3_1.bottom + 0.5f)));
    }
}

