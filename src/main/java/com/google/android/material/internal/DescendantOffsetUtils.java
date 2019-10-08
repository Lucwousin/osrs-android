package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class DescendantOffsetUtils {
    private static final ThreadLocal matrix;
    private static final ThreadLocal rectF;

    static {
        DescendantOffsetUtils.matrix = new ThreadLocal();
        DescendantOffsetUtils.rectF = new ThreadLocal();
    }

    public DescendantOffsetUtils() {
        super();
    }

    public static void getDescendantRect(ViewGroup arg3, View arg4, Rect arg5) {
        arg5.set(0, 0, arg4.getWidth(), arg4.getHeight());
        DescendantOffsetUtils.offsetDescendantRect(arg3, arg4, arg5);
    }

    private static void offsetDescendantMatrix(ViewParent arg2, View arg3, Matrix arg4) {
        ViewParent v0 = arg3.getParent();
        if(((v0 instanceof View)) && v0 != arg2) {
            DescendantOffsetUtils.offsetDescendantMatrix(arg2, ((View)v0), arg4);
            arg4.preTranslate(((float)(-((View)v0).getScrollX())), ((float)(-((View)v0).getScrollY())));
        }

        arg4.preTranslate(((float)arg3.getLeft()), ((float)arg3.getTop()));
        if(!arg3.getMatrix().isIdentity()) {
            arg4.preConcat(arg3.getMatrix());
        }
    }

    public static void offsetDescendantRect(ViewGroup arg3, View arg4, Rect arg5) {
        RectF v3_1;
        Object v0 = DescendantOffsetUtils.matrix.get();
        if(v0 == null) {
            Matrix v0_1 = new Matrix();
            DescendantOffsetUtils.matrix.set(v0_1);
        }
        else {
            ((Matrix)v0).reset();
        }

        DescendantOffsetUtils.offsetDescendantMatrix(((ViewParent)arg3), arg4, ((Matrix)v0));
        Object v3 = DescendantOffsetUtils.rectF.get();
        if(v3 == null) {
            v3_1 = new RectF();
            DescendantOffsetUtils.rectF.set(v3_1);
        }

        v3_1.set(arg5);
        ((Matrix)v0).mapRect(v3_1);
        arg5.set(((int)(v3_1.left + 0.5f)), ((int)(v3_1.top + 0.5f)), ((int)(v3_1.right + 0.5f)), ((int)(v3_1.bottom + 0.5f)));
    }
}

