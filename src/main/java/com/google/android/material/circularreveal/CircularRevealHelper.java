package com.google.android.material.circularreveal;

import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path$Direction;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader$TileMode;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.google.android.material.math.MathUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class CircularRevealHelper {
    interface Delegate {
        void actualDraw(Canvas arg1);

        boolean actualIsOpaque();
    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface Strategy {
    }

    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    private static final boolean DEBUG = false;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY;
    private boolean buildingCircularRevealCache;
    private Paint debugPaint;
    private final Delegate delegate;
    private boolean hasCircularRevealCache;
    @Nullable private Drawable overlayDrawable;
    @Nullable private RevealInfo revealInfo;
    private final Paint revealPaint;
    private final Path revealPath;
    private final Paint scrimPaint;
    private final View view;

    static {
        if(Build$VERSION.SDK_INT >= 21) {
            CircularRevealHelper.STRATEGY = 2;
        }
        else if(Build$VERSION.SDK_INT >= 18) {
            CircularRevealHelper.STRATEGY = 1;
        }
        else {
            CircularRevealHelper.STRATEGY = 0;
        }
    }

    public CircularRevealHelper(Delegate arg3) {
        super();
        this.delegate = arg3;
        this.view = ((View)arg3);
        this.view.setWillNotDraw(false);
        this.revealPath = new Path();
        this.revealPaint = new Paint(7);
        this.scrimPaint = new Paint(1);
        this.scrimPaint.setColor(0);
    }

    public void buildCircularRevealCache() {
        if(CircularRevealHelper.STRATEGY == 0) {
            this.buildingCircularRevealCache = true;
            this.hasCircularRevealCache = false;
            this.view.buildDrawingCache();
            Bitmap v2 = this.view.getDrawingCache();
            if(v2 == null && this.view.getWidth() != 0 && this.view.getHeight() != 0) {
                v2 = Bitmap.createBitmap(this.view.getWidth(), this.view.getHeight(), Bitmap$Config.ARGB_8888);
                this.view.draw(new Canvas(v2));
            }

            if(v2 != null) {
                this.revealPaint.setShader(new BitmapShader(v2, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP));
            }

            this.buildingCircularRevealCache = false;
            this.hasCircularRevealCache = true;
        }
    }

    public void destroyCircularRevealCache() {
        if(CircularRevealHelper.STRATEGY == 0) {
            this.hasCircularRevealCache = false;
            this.view.destroyDrawingCache();
            this.revealPaint.setShader(null);
            this.view.invalidate();
        }
    }

    public void draw(Canvas arg9) {
        if(this.shouldDrawCircularReveal()) {
            switch(CircularRevealHelper.STRATEGY) {
                case 0: {
                    goto label_50;
                }
                case 1: {
                    goto label_30;
                }
                case 2: {
                    goto label_14;
                }
            }

            StringBuilder v0 = new StringBuilder();
            v0.append("Unsupported strategy ");
            v0.append(CircularRevealHelper.STRATEGY);
            throw new IllegalStateException(v0.toString());
        label_50:
            arg9.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.revealPaint);
            if(this.shouldDrawScrim()) {
                arg9.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.scrimPaint);
                goto label_84;
            label_30:
                int v0_1 = arg9.save();
                arg9.clipPath(this.revealPath);
                this.delegate.actualDraw(arg9);
                if(this.shouldDrawScrim()) {
                    arg9.drawRect(0f, 0f, ((float)this.view.getWidth()), ((float)this.view.getHeight()), this.scrimPaint);
                }

                arg9.restoreToCount(v0_1);
                goto label_84;
            label_14:
                this.delegate.actualDraw(arg9);
                if(!this.shouldDrawScrim()) {
                    goto label_84;
                }

                arg9.drawRect(0f, 0f, ((float)this.view.getWidth()), ((float)this.view.getHeight()), this.scrimPaint);
            }
        }
        else {
            this.delegate.actualDraw(arg9);
            if(!this.shouldDrawScrim()) {
                goto label_84;
            }

            arg9.drawRect(0f, 0f, ((float)this.view.getWidth()), ((float)this.view.getHeight()), this.scrimPaint);
        }

    label_84:
        this.drawOverlayDrawable(arg9);
    }

    private void drawDebugCircle(Canvas arg4, int arg5, float arg6) {
        this.debugPaint.setColor(arg5);
        this.debugPaint.setStrokeWidth(arg6);
        arg4.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius - arg6 / 2f, this.debugPaint);
    }

    private void drawDebugMode(Canvas arg5) {
        this.delegate.actualDraw(arg5);
        if(this.shouldDrawScrim()) {
            arg5.drawCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, this.scrimPaint);
        }

        if(this.shouldDrawCircularReveal()) {
            this.drawDebugCircle(arg5, 0xFF000000, 10f);
            this.drawDebugCircle(arg5, 0xFFFF0000, 5f);
        }

        this.drawOverlayDrawable(arg5);
    }

    private void drawOverlayDrawable(Canvas arg5) {
        if(this.shouldDrawOverlayDrawable()) {
            Rect v0 = this.overlayDrawable.getBounds();
            float v1 = this.revealInfo.centerX - (((float)v0.width())) / 2f;
            float v2 = this.revealInfo.centerY - (((float)v0.height())) / 2f;
            arg5.translate(v1, v2);
            this.overlayDrawable.draw(arg5);
            arg5.translate(-v1, -v2);
        }
    }

    @Nullable public Drawable getCircularRevealOverlayDrawable() {
        return this.overlayDrawable;
    }

    @ColorInt public int getCircularRevealScrimColor() {
        return this.scrimPaint.getColor();
    }

    private float getDistanceToFurthestCorner(RevealInfo arg7) {
        return MathUtils.distanceToFurthestCorner(arg7.centerX, arg7.centerY, 0f, 0f, ((float)this.view.getWidth()), ((float)this.view.getHeight()));
    }

    @Nullable public RevealInfo getRevealInfo() {
        if(this.revealInfo == null) {
            return null;
        }

        RevealInfo v0 = new RevealInfo(this.revealInfo);
        if(v0.isInvalid()) {
            v0.radius = this.getDistanceToFurthestCorner(v0);
        }

        return v0;
    }

    private void invalidateRevealInfo() {
        if(CircularRevealHelper.STRATEGY == 1) {
            this.revealPath.rewind();
            if(this.revealInfo != null) {
                this.revealPath.addCircle(this.revealInfo.centerX, this.revealInfo.centerY, this.revealInfo.radius, Path$Direction.CW);
            }
        }

        this.view.invalidate();
    }

    public boolean isOpaque() {
        boolean v0 = !this.delegate.actualIsOpaque() || (this.shouldDrawCircularReveal()) ? false : true;
        return v0;
    }

    public void setCircularRevealOverlayDrawable(@Nullable Drawable arg1) {
        this.overlayDrawable = arg1;
        this.view.invalidate();
    }

    public void setCircularRevealScrimColor(@ColorInt int arg2) {
        this.scrimPaint.setColor(arg2);
        this.view.invalidate();
    }

    public void setRevealInfo(@Nullable RevealInfo arg3) {
        if(arg3 == null) {
            this.revealInfo = null;
        }
        else {
            if(this.revealInfo == null) {
                this.revealInfo = new RevealInfo(arg3);
            }
            else {
                this.revealInfo.set(arg3);
            }

            if(!MathUtils.geq(arg3.radius, this.getDistanceToFurthestCorner(arg3), 0.0001f)) {
                goto label_20;
            }

            this.revealInfo.radius = 3.402823E+38f;
        }

    label_20:
        this.invalidateRevealInfo();
    }

    private boolean shouldDrawCircularReveal() {
        boolean v1 = false;
        int v0 = this.revealInfo == null || (this.revealInfo.isInvalid()) ? 1 : 0;
        if(CircularRevealHelper.STRATEGY == 0) {
            if(v0 == 0 && (this.hasCircularRevealCache)) {
                v1 = true;
            }

            return v1;
        }

        return v0 ^ 1;
    }

    private boolean shouldDrawOverlayDrawable() {
        boolean v0 = (this.buildingCircularRevealCache) || this.overlayDrawable == null || this.revealInfo == null ? false : true;
        return v0;
    }

    private boolean shouldDrawScrim() {
        boolean v0 = (this.buildingCircularRevealCache) || Color.alpha(this.scrimPaint.getColor()) == 0 ? false : true;
        return v0;
    }
}

