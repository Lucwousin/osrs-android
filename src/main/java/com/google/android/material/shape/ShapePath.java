package com.google.android.material.shape;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.material.internal.Experimental;
import java.util.ArrayList;
import java.util.List;

@Experimental(value="The shapes API is currently experimental and subject to change") public class ShapePath {
    public class PathArcOperation extends PathOperation {
        public float bottom;
        public float left;
        private static final RectF rectF;
        public float right;
        public float startAngle;
        public float sweepAngle;
        public float top;

        static {
            PathArcOperation.rectF = new RectF();
        }

        public PathArcOperation(float arg1, float arg2, float arg3, float arg4) {
            super();
            this.left = arg1;
            this.top = arg2;
            this.right = arg3;
            this.bottom = arg4;
        }

        public void applyToPath(Matrix arg6, Path arg7) {
            Matrix v0 = this.matrix;
            arg6.invert(v0);
            arg7.transform(v0);
            PathArcOperation.rectF.set(this.left, this.top, this.right, this.bottom);
            arg7.arcTo(PathArcOperation.rectF, this.startAngle, this.sweepAngle, false);
            arg7.transform(arg6);
        }
    }

    public class PathLineOperation extends PathOperation {
        private float x;
        private float y;

        public PathLineOperation() {
            super();
        }

        static float access$002(PathLineOperation arg0, float arg1) {
            arg0.x = arg1;
            return arg1;
        }

        static float access$102(PathLineOperation arg0, float arg1) {
            arg0.y = arg1;
            return arg1;
        }

        public void applyToPath(Matrix arg3, Path arg4) {
            Matrix v0 = this.matrix;
            arg3.invert(v0);
            arg4.transform(v0);
            arg4.lineTo(this.x, this.y);
            arg4.transform(arg3);
        }
    }

    public abstract class PathOperation {
        protected final Matrix matrix;

        public PathOperation() {
            super();
            this.matrix = new Matrix();
        }

        public abstract void applyToPath(Matrix arg1, Path arg2);
    }

    public class PathQuadOperation extends PathOperation {
        public float controlX;
        public float controlY;
        public float endX;
        public float endY;

        public PathQuadOperation() {
            super();
        }

        public void applyToPath(Matrix arg5, Path arg6) {
            Matrix v0 = this.matrix;
            arg5.invert(v0);
            arg6.transform(v0);
            arg6.quadTo(this.controlX, this.controlY, this.endX, this.endY);
            arg6.transform(arg5);
        }
    }

    public float endX;
    public float endY;
    private final List operations;
    public float startX;
    public float startY;

    public ShapePath() {
        super();
        this.operations = new ArrayList();
        this.reset(0f, 0f);
    }

    public ShapePath(float arg2, float arg3) {
        super();
        this.operations = new ArrayList();
        this.reset(arg2, arg3);
    }

    public void addArc(float arg5, float arg6, float arg7, float arg8, float arg9, float arg10) {
        PathArcOperation v0 = new PathArcOperation(arg5, arg6, arg7, arg8);
        v0.startAngle = arg9;
        v0.sweepAngle = arg10;
        this.operations.add(v0);
        double v9 = ((double)(arg9 + arg10));
        this.endX = (arg5 + arg7) * 0.5f + (arg7 - arg5) / 2f * (((float)Math.cos(Math.toRadians(v9))));
        this.endY = (arg6 + arg8) * 0.5f + (arg8 - arg6) / 2f * (((float)Math.sin(Math.toRadians(v9))));
    }

    public void applyToPath(Matrix arg4, Path arg5) {
        int v0 = this.operations.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.operations.get(v1).applyToPath(arg4, arg5);
        }
    }

    public void lineTo(float arg3, float arg4) {
        PathLineOperation v0 = new PathLineOperation();
        PathLineOperation.access$002(v0, arg3);
        PathLineOperation.access$102(v0, arg4);
        this.operations.add(v0);
        this.endX = arg3;
        this.endY = arg4;
    }

    public void quadToPoint(float arg2, float arg3, float arg4, float arg5) {
        PathQuadOperation v0 = new PathQuadOperation();
        v0.controlX = arg2;
        v0.controlY = arg3;
        v0.endX = arg4;
        v0.endY = arg5;
        this.operations.add(v0);
        this.endX = arg4;
        this.endY = arg5;
    }

    public void reset(float arg1, float arg2) {
        this.startX = arg1;
        this.startY = arg2;
        this.endX = arg1;
        this.endY = arg2;
        this.operations.clear();
    }
}

