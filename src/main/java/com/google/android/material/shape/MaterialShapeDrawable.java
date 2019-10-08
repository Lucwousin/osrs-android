package com.google.android.material.shape;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region$Op;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.core.graphics.drawable.TintAwareDrawable;
import com.google.android.material.internal.Experimental;

@Experimental(value="The shapes API is currently experimental and subject to change") public class MaterialShapeDrawable extends Drawable implements TintAwareDrawable {
    private int alpha;
    private final ShapePath[] cornerPaths;
    private final Matrix[] cornerTransforms;
    private final Matrix[] edgeTransforms;
    private float interpolation;
    private final Matrix matrix;
    private final Paint paint;
    private Paint$Style paintStyle;
    private final Path path;
    private final PointF pointF;
    private float scale;
    private final float[] scratch;
    private final float[] scratch2;
    private final Region scratchRegion;
    private int shadowColor;
    private int shadowElevation;
    private boolean shadowEnabled;
    private int shadowRadius;
    private final ShapePath shapePath;
    @Nullable private ShapePathModel shapedViewModel;
    private float strokeWidth;
    @Nullable private PorterDuffColorFilter tintFilter;
    private ColorStateList tintList;
    private PorterDuff$Mode tintMode;
    private final Region transparentRegion;
    private boolean useTintColorForShadow;

    public MaterialShapeDrawable(@Nullable ShapePathModel arg6) {
        super();
        this.paint = new Paint();
        int v0 = 4;
        this.cornerTransforms = new Matrix[v0];
        this.edgeTransforms = new Matrix[v0];
        this.cornerPaths = new ShapePath[v0];
        this.matrix = new Matrix();
        this.path = new Path();
        this.pointF = new PointF();
        this.shapePath = new ShapePath();
        this.transparentRegion = new Region();
        this.scratchRegion = new Region();
        this.scratch = new float[2];
        this.scratch2 = new float[2];
        this.shapedViewModel = null;
        int v2 = 0;
        this.shadowEnabled = false;
        this.useTintColorForShadow = false;
        this.interpolation = 1f;
        this.shadowColor = 0xFF000000;
        this.shadowElevation = 5;
        this.shadowRadius = 10;
        this.alpha = 0xFF;
        this.scale = 1f;
        this.strokeWidth = 0f;
        this.paintStyle = Paint$Style.FILL_AND_STROKE;
        this.tintMode = PorterDuff$Mode.SRC_IN;
        this.tintList = null;
        this.shapedViewModel = arg6;
        while(v2 < v0) {
            this.cornerTransforms[v2] = new Matrix();
            this.edgeTransforms[v2] = new Matrix();
            this.cornerPaths[v2] = new ShapePath();
            ++v2;
        }
    }

    public MaterialShapeDrawable() {
        this(null);
    }

    private float angleOfCorner(int arg6, int arg7, int arg8) {
        this.getCoordinatesOfCorner((arg6 + 3) % 4, arg7, arg8, this.pointF);
        float v0 = this.pointF.x;
        float v1 = this.pointF.y;
        this.getCoordinatesOfCorner((arg6 + 1) % 4, arg7, arg8, this.pointF);
        float v2 = this.pointF.x;
        float v3 = this.pointF.y;
        this.getCoordinatesOfCorner(arg6, arg7, arg8, this.pointF);
        float v6 = (((float)Math.atan2(((double)(v1 - this.pointF.y)), ((double)(v0 - this.pointF.x))))) - (((float)Math.atan2(((double)(v3 - this.pointF.y)), ((double)(v2 - this.pointF.x)))));
        if(v6 < 0f) {
            v6 = ((float)((((double)v6)) + 6.283185));
        }

        return v6;
    }

    private float angleOfEdge(int arg4, int arg5, int arg6) {
        int v0 = (arg4 + 1) % 4;
        this.getCoordinatesOfCorner(arg4, arg5, arg6, this.pointF);
        float v4 = this.pointF.x;
        float v1 = this.pointF.y;
        this.getCoordinatesOfCorner(v0, arg5, arg6, this.pointF);
        return ((float)Math.atan2(((double)(this.pointF.y - v1)), ((double)(this.pointF.x - v4))));
    }

    private void appendCornerPath(int arg5, Path arg6) {
        this.scratch[0] = this.cornerPaths[arg5].startX;
        this.scratch[1] = this.cornerPaths[arg5].startY;
        this.cornerTransforms[arg5].mapPoints(this.scratch);
        if(arg5 == 0) {
            arg6.moveTo(this.scratch[0], this.scratch[1]);
        }
        else {
            arg6.lineTo(this.scratch[0], this.scratch[1]);
        }

        this.cornerPaths[arg5].applyToPath(this.cornerTransforms[arg5], arg6);
    }

    private void appendEdgePath(int arg6, Path arg7) {
        int v0 = (arg6 + 1) % 4;
        this.scratch[0] = this.cornerPaths[arg6].endX;
        this.scratch[1] = this.cornerPaths[arg6].endY;
        this.cornerTransforms[arg6].mapPoints(this.scratch);
        this.scratch2[0] = this.cornerPaths[v0].startX;
        this.scratch2[1] = this.cornerPaths[v0].startY;
        this.cornerTransforms[v0].mapPoints(this.scratch2);
        float v0_1 = ((float)Math.hypot(((double)(this.scratch[0] - this.scratch2[0])), ((double)(this.scratch[1] - this.scratch2[1]))));
        this.shapePath.reset(0f, 0f);
        this.getEdgeTreatmentForIndex(arg6).getEdgePath(v0_1, this.interpolation, this.shapePath);
        this.shapePath.applyToPath(this.edgeTransforms[arg6], arg7);
    }

    public void draw(Canvas arg10) {
        this.paint.setColorFilter(this.tintFilter);
        int v0 = this.paint.getAlpha();
        this.paint.setAlpha(MaterialShapeDrawable.modulateAlpha(v0, this.alpha));
        this.paint.setStrokeWidth(this.strokeWidth);
        this.paint.setStyle(this.paintStyle);
        if(this.shadowElevation > 0 && (this.shadowEnabled)) {
            this.paint.setShadowLayer(((float)this.shadowRadius), 0f, ((float)this.shadowElevation), this.shadowColor);
        }

        if(this.shapedViewModel != null) {
            this.getPath(arg10.getWidth(), arg10.getHeight(), this.path);
            arg10.drawPath(this.path, this.paint);
        }
        else {
            arg10.drawRect(0f, 0f, ((float)arg10.getWidth()), ((float)arg10.getHeight()), this.paint);
        }

        this.paint.setAlpha(v0);
    }

    private void getCoordinatesOfCorner(int arg2, int arg3, int arg4, PointF arg5) {
        switch(arg2) {
            case 1: {
                arg5.set(((float)arg3), 0f);
                break;
            }
            case 2: {
                arg5.set(((float)arg3), ((float)arg4));
                break;
            }
            case 3: {
                arg5.set(0f, ((float)arg4));
                break;
            }
            default: {
                arg5.set(0f, 0f);
                break;
            }
        }
    }

    private CornerTreatment getCornerTreatmentForIndex(int arg1) {
        switch(arg1) {
            case 1: {
                goto label_10;
            }
            case 2: {
                goto label_7;
            }
            case 3: {
                goto label_4;
            }
        }

        return this.shapedViewModel.getTopLeftCorner();
    label_4:
        return this.shapedViewModel.getBottomLeftCorner();
    label_7:
        return this.shapedViewModel.getBottomRightCorner();
    label_10:
        return this.shapedViewModel.getTopRightCorner();
    }

    private EdgeTreatment getEdgeTreatmentForIndex(int arg1) {
        switch(arg1) {
            case 1: {
                goto label_10;
            }
            case 2: {
                goto label_7;
            }
            case 3: {
                goto label_4;
            }
        }

        return this.shapedViewModel.getTopEdge();
    label_4:
        return this.shapedViewModel.getLeftEdge();
    label_7:
        return this.shapedViewModel.getBottomEdge();
    label_10:
        return this.shapedViewModel.getRightEdge();
    }

    public float getInterpolation() {
        return this.interpolation;
    }

    public int getOpacity() {
        return -3;
    }

    public Paint$Style getPaintStyle() {
        return this.paintStyle;
    }

    private void getPath(int arg4, int arg5, Path arg6) {
        this.getPathForSize(arg4, arg5, arg6);
        if(this.scale == 1f) {
            return;
        }

        this.matrix.reset();
        this.matrix.setScale(this.scale, this.scale, ((float)(arg4 / 2)), ((float)(arg5 / 2)));
        arg6.transform(this.matrix);
    }

    public void getPathForSize(int arg4, int arg5, Path arg6) {
        arg6.rewind();
        if(this.shapedViewModel == null) {
            return;
        }

        int v0 = 0;
        int v1 = 0;
        while(true) {
            int v2 = 4;
            if(v1 < v2) {
                this.setCornerPathAndTransform(v1, arg4, arg5);
                this.setEdgeTransform(v1, arg4, arg5);
                ++v1;
                continue;
            }

            break;
        }

        while(v0 < v2) {
            this.appendCornerPath(v0, arg6);
            this.appendEdgePath(v0, arg6);
            ++v0;
        }

        arg6.close();
    }

    public float getScale() {
        return this.scale;
    }

    public int getShadowElevation() {
        return this.shadowElevation;
    }

    public int getShadowRadius() {
        return this.shadowRadius;
    }

    @Nullable public ShapePathModel getShapedViewModel() {
        return this.shapedViewModel;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public ColorStateList getTintList() {
        return this.tintList;
    }

    public Region getTransparentRegion() {
        Rect v0 = this.getBounds();
        this.transparentRegion.set(v0);
        this.getPath(v0.width(), v0.height(), this.path);
        this.scratchRegion.setPath(this.path, this.transparentRegion);
        this.transparentRegion.op(this.scratchRegion, Region$Op.DIFFERENCE);
        return this.transparentRegion;
    }

    public boolean isPointInTransparentRegion(int arg2, int arg3) {
        return this.getTransparentRegion().contains(arg2, arg3);
    }

    public boolean isShadowEnabled() {
        return this.shadowEnabled;
    }

    private static int modulateAlpha(int arg1, int arg2) {
        return arg1 * (arg2 + (arg2 >>> 7)) >>> 8;
    }

    public void setAlpha(@IntRange(from=0, to=0xFF) int arg1) {
        this.alpha = arg1;
        this.invalidateSelf();
    }

    public void setColorFilter(@Nullable ColorFilter arg2) {
        this.paint.setColorFilter(arg2);
        this.invalidateSelf();
    }

    private void setCornerPathAndTransform(int arg5, int arg6, int arg7) {
        this.getCoordinatesOfCorner(arg5, arg6, arg7, this.pointF);
        this.getCornerTreatmentForIndex(arg5).getCornerPath(this.angleOfCorner(arg5, arg6, arg7), this.interpolation, this.cornerPaths[arg5]);
        float v6 = this.angleOfEdge((arg5 + 3) % 4, arg6, arg7);
        this.cornerTransforms[arg5].reset();
        this.cornerTransforms[arg5].setTranslate(this.pointF.x, this.pointF.y);
        this.cornerTransforms[arg5].preRotate(((float)Math.toDegrees(((double)(v6 + 1.570796f)))));
    }

    private void setEdgeTransform(int arg5, int arg6, int arg7) {
        this.scratch[0] = this.cornerPaths[arg5].endX;
        this.scratch[1] = this.cornerPaths[arg5].endY;
        this.cornerTransforms[arg5].mapPoints(this.scratch);
        float v6 = this.angleOfEdge(arg5, arg6, arg7);
        this.edgeTransforms[arg5].reset();
        this.edgeTransforms[arg5].setTranslate(this.scratch[0], this.scratch[1]);
        this.edgeTransforms[arg5].preRotate(((float)Math.toDegrees(((double)v6))));
    }

    public void setInterpolation(float arg1) {
        this.interpolation = arg1;
        this.invalidateSelf();
    }

    public void setPaintStyle(Paint$Style arg1) {
        this.paintStyle = arg1;
        this.invalidateSelf();
    }

    public void setScale(float arg1) {
        this.scale = arg1;
        this.invalidateSelf();
    }

    public void setShadowColor(int arg1) {
        this.shadowColor = arg1;
        this.useTintColorForShadow = false;
        this.invalidateSelf();
    }

    public void setShadowElevation(int arg1) {
        this.shadowElevation = arg1;
        this.invalidateSelf();
    }

    public void setShadowEnabled(boolean arg1) {
        this.shadowEnabled = arg1;
        this.invalidateSelf();
    }

    public void setShadowRadius(int arg1) {
        this.shadowRadius = arg1;
        this.invalidateSelf();
    }

    public void setShapedViewModel(ShapePathModel arg1) {
        this.shapedViewModel = arg1;
        this.invalidateSelf();
    }

    public void setStrokeWidth(float arg1) {
        this.strokeWidth = arg1;
        this.invalidateSelf();
    }

    public void setTint(@ColorInt int arg1) {
        this.setTintList(ColorStateList.valueOf(arg1));
    }

    public void setTintList(ColorStateList arg1) {
        this.tintList = arg1;
        this.updateTintFilter();
        this.invalidateSelf();
    }

    public void setTintMode(PorterDuff$Mode arg1) {
        this.tintMode = arg1;
        this.updateTintFilter();
        this.invalidateSelf();
    }

    public void setUseTintColorForShadow(boolean arg1) {
        this.useTintColorForShadow = arg1;
        this.invalidateSelf();
    }

    private void updateTintFilter() {
        if(this.tintList != null) {
            if(this.tintMode == null) {
            }
            else {
                int v0 = this.tintList.getColorForState(this.getState(), 0);
                this.tintFilter = new PorterDuffColorFilter(v0, this.tintMode);
                if(this.useTintColorForShadow) {
                    this.shadowColor = v0;
                }

                return;
            }
        }

        this.tintFilter = null;
    }
}

