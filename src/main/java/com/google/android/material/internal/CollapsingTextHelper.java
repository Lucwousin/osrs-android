package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build$VERSION;
import android.text.TextPaint;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicCompat;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.animation.AnimationUtils;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public final class CollapsingTextHelper {
    private static final boolean DEBUG_DRAW = false;
    private static final Paint DEBUG_DRAW_PAINT;
    private static final boolean USE_SCALING_TEXTURE;
    private boolean boundsChanged;
    private final Rect collapsedBounds;
    private float collapsedDrawX;
    private float collapsedDrawY;
    private int collapsedShadowColor;
    private float collapsedShadowDx;
    private float collapsedShadowDy;
    private float collapsedShadowRadius;
    private ColorStateList collapsedTextColor;
    private int collapsedTextGravity;
    private float collapsedTextSize;
    private Typeface collapsedTypeface;
    private final RectF currentBounds;
    private float currentDrawX;
    private float currentDrawY;
    private float currentTextSize;
    private Typeface currentTypeface;
    private boolean drawTitle;
    private final Rect expandedBounds;
    private float expandedDrawX;
    private float expandedDrawY;
    private float expandedFraction;
    private int expandedShadowColor;
    private float expandedShadowDx;
    private float expandedShadowDy;
    private float expandedShadowRadius;
    private ColorStateList expandedTextColor;
    private int expandedTextGravity;
    private float expandedTextSize;
    private Bitmap expandedTitleTexture;
    private Typeface expandedTypeface;
    private boolean isRtl;
    private TimeInterpolator positionInterpolator;
    private float scale;
    private int[] state;
    private CharSequence text;
    private final TextPaint textPaint;
    private TimeInterpolator textSizeInterpolator;
    private CharSequence textToDraw;
    private float textureAscent;
    private float textureDescent;
    private Paint texturePaint;
    private final TextPaint tmpPaint;
    private boolean useTexture;
    private final View view;

    static {
        boolean v0 = Build$VERSION.SDK_INT < 18 ? true : false;
        CollapsingTextHelper.USE_SCALING_TEXTURE = v0;
        CollapsingTextHelper.DEBUG_DRAW_PAINT = null;
        if(CollapsingTextHelper.DEBUG_DRAW_PAINT != null) {
            CollapsingTextHelper.DEBUG_DRAW_PAINT.setAntiAlias(true);
            CollapsingTextHelper.DEBUG_DRAW_PAINT.setColor(0xFFFF00FF);
        }
    }

    public CollapsingTextHelper(View arg2) {
        super();
        this.expandedTextGravity = 16;
        this.collapsedTextGravity = 16;
        this.expandedTextSize = 15f;
        this.collapsedTextSize = 15f;
        this.view = arg2;
        this.textPaint = new TextPaint(0x81);
        this.tmpPaint = new TextPaint(this.textPaint);
        this.collapsedBounds = new Rect();
        this.expandedBounds = new Rect();
        this.currentBounds = new RectF();
    }

    private static int blendColors(int arg5, int arg6, float arg7) {
        float v0 = 1f - arg7;
        return Color.argb(((int)((((float)Color.alpha(arg5))) * v0 + (((float)Color.alpha(arg6))) * arg7)), ((int)((((float)Color.red(arg5))) * v0 + (((float)Color.red(arg6))) * arg7)), ((int)((((float)Color.green(arg5))) * v0 + (((float)Color.green(arg6))) * arg7)), ((int)((((float)Color.blue(arg5))) * v0 + (((float)Color.blue(arg6))) * arg7)));
    }

    private void calculateBaseOffsets() {
        float v0 = this.currentTextSize;
        this.calculateUsingTextSize(this.collapsedTextSize);
        float v2 = 0f;
        float v1 = this.textToDraw != null ? this.textPaint.measureText(this.textToDraw, 0, this.textToDraw.length()) : 0f;
        int v4 = GravityCompat.getAbsoluteGravity(this.collapsedTextGravity, this.isRtl);
        int v5 = v4 & 0x70;
        int v6 = 80;
        int v7 = 0x30;
        float v8 = 2f;
        if(v5 == v7) {
            this.collapsedDrawY = (((float)this.collapsedBounds.top)) - this.textPaint.ascent();
        }
        else if(v5 != v6) {
            this.collapsedDrawY = (((float)this.collapsedBounds.centerY())) + ((this.textPaint.descent() - this.textPaint.ascent()) / v8 - this.textPaint.descent());
        }
        else {
            this.collapsedDrawY = ((float)this.collapsedBounds.bottom);
        }

        v5 = 0x800007;
        v4 &= v5;
        int v9 = 5;
        if(v4 == 1) {
            this.collapsedDrawX = (((float)this.collapsedBounds.centerX())) - v1 / v8;
        }
        else if(v4 != v9) {
            this.collapsedDrawX = ((float)this.collapsedBounds.left);
        }
        else {
            this.collapsedDrawX = (((float)this.collapsedBounds.right)) - v1;
        }

        this.calculateUsingTextSize(this.expandedTextSize);
        if(this.textToDraw != null) {
            v2 = this.textPaint.measureText(this.textToDraw, 0, this.textToDraw.length());
        }

        int v1_1 = GravityCompat.getAbsoluteGravity(this.expandedTextGravity, this.isRtl);
        int v3 = v1_1 & 0x70;
        if(v3 == v7) {
            this.expandedDrawY = (((float)this.expandedBounds.top)) - this.textPaint.ascent();
        }
        else if(v3 != v6) {
            this.expandedDrawY = (((float)this.expandedBounds.centerY())) + ((this.textPaint.descent() - this.textPaint.ascent()) / v8 - this.textPaint.descent());
        }
        else {
            this.expandedDrawY = ((float)this.expandedBounds.bottom);
        }

        v1_1 &= v5;
        if(v1_1 == 1) {
            this.expandedDrawX = (((float)this.expandedBounds.centerX())) - v2 / v8;
        }
        else if(v1_1 != v9) {
            this.expandedDrawX = ((float)this.expandedBounds.left);
        }
        else {
            this.expandedDrawX = (((float)this.expandedBounds.right)) - v2;
        }

        this.clearTexture();
        this.setInterpolatedTextSize(v0);
    }

    public float calculateCollapsedTextWidth() {
        if(this.text == null) {
            return 0;
        }

        this.getTextPaintCollapsed(this.tmpPaint);
        return this.tmpPaint.measureText(this.text, 0, this.text.length());
    }

    private void calculateCurrentOffsets() {
        this.calculateOffsets(this.expandedFraction);
    }

    private boolean calculateIsRtl(CharSequence arg4) {
        int v2 = 1;
        if(ViewCompat.getLayoutDirection(this.view) == 1) {
        }
        else {
            v2 = 0;
        }

        TextDirectionHeuristicCompat v0 = v2 != 0 ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        return v0.isRtl(arg4, 0, arg4.length());
    }

    private void calculateOffsets(float arg7) {
        this.interpolateBounds(arg7);
        this.currentDrawX = CollapsingTextHelper.lerp(this.expandedDrawX, this.collapsedDrawX, arg7, this.positionInterpolator);
        this.currentDrawY = CollapsingTextHelper.lerp(this.expandedDrawY, this.collapsedDrawY, arg7, this.positionInterpolator);
        this.setInterpolatedTextSize(CollapsingTextHelper.lerp(this.expandedTextSize, this.collapsedTextSize, arg7, this.textSizeInterpolator));
        if(this.collapsedTextColor != this.expandedTextColor) {
            this.textPaint.setColor(CollapsingTextHelper.blendColors(this.getCurrentExpandedTextColor(), this.getCurrentCollapsedTextColor(), arg7));
        }
        else {
            this.textPaint.setColor(this.getCurrentCollapsedTextColor());
        }

        this.textPaint.setShadowLayer(CollapsingTextHelper.lerp(this.expandedShadowRadius, this.collapsedShadowRadius, arg7, null), CollapsingTextHelper.lerp(this.expandedShadowDx, this.collapsedShadowDx, arg7, null), CollapsingTextHelper.lerp(this.expandedShadowDy, this.collapsedShadowDy, arg7, null), CollapsingTextHelper.blendColors(this.expandedShadowColor, this.collapsedShadowColor, arg7));
        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    private void calculateUsingTextSize(float arg9) {
        int v6;
        float v2;
        int v1_1;
        if(this.text == null) {
            return;
        }

        float v0 = ((float)this.collapsedBounds.width());
        float v1 = ((float)this.expandedBounds.width());
        float v3 = 1f;
        boolean v4 = true;
        if(CollapsingTextHelper.isClose(arg9, this.collapsedTextSize)) {
            arg9 = this.collapsedTextSize;
            this.scale = v3;
            if(this.currentTypeface != this.collapsedTypeface) {
                this.currentTypeface = this.collapsedTypeface;
                v1_1 = 1;
            }
            else {
                v1_1 = 0;
            }

            v2 = arg9;
            v6 = v1_1;
        }
        else {
            v2 = this.expandedTextSize;
            if(this.currentTypeface != this.expandedTypeface) {
                this.currentTypeface = this.expandedTypeface;
                v6 = 1;
            }
            else {
                v6 = 0;
            }

            this.scale = CollapsingTextHelper.isClose(arg9, this.expandedTextSize) ? v3 : arg9 / this.expandedTextSize;
            arg9 = this.collapsedTextSize / this.expandedTextSize;
            if(v1 * arg9 > v0) {
                v0 = Math.min(v0 / arg9, v1);
                goto label_54;
            }

            v0 = v1;
        }

    label_54:
        if(v0 > 0f) {
            v6 = this.currentTextSize != v2 || (this.boundsChanged) || v6 != 0 ? 1 : 0;
            this.currentTextSize = v2;
            this.boundsChanged = false;
        }

        if(this.textToDraw == null || v6 != 0) {
            this.textPaint.setTextSize(this.currentTextSize);
            this.textPaint.setTypeface(this.currentTypeface);
            TextPaint v9 = this.textPaint;
            if(this.scale != v3) {
            }
            else {
                v4 = false;
            }

            v9.setLinearText(v4);
            CharSequence v9_1 = TextUtils.ellipsize(this.text, this.textPaint, v0, TextUtils$TruncateAt.END);
            if(TextUtils.equals(v9_1, this.textToDraw)) {
                return;
            }

            this.textToDraw = v9_1;
            this.isRtl = this.calculateIsRtl(this.textToDraw);
        }
    }

    private void clearTexture() {
        if(this.expandedTitleTexture != null) {
            this.expandedTitleTexture.recycle();
            this.expandedTitleTexture = null;
        }
    }

    public void draw(Canvas arg10) {
        float v3;
        int v0 = arg10.save();
        if(this.textToDraw != null && (this.drawTitle)) {
            float v6 = this.currentDrawX;
            float v1 = this.currentDrawY;
            int v2 = !this.useTexture || this.expandedTitleTexture == null ? 0 : 1;
            if(v2 != 0) {
                v3 = this.textureAscent * this.scale;
            }
            else {
                v3 = this.textPaint.ascent() * this.scale;
                this.textPaint.descent();
            }

            if(v2 != 0) {
                v1 += v3;
            }

            float v7 = v1;
            if(this.scale != 1f) {
                arg10.scale(this.scale, this.scale, v6, v7);
            }

            if(v2 != 0) {
                arg10.drawBitmap(this.expandedTitleTexture, v6, v7, this.texturePaint);
                goto label_49;
            }

            arg10.drawText(this.textToDraw, 0, this.textToDraw.length(), v6, v7, this.textPaint);
        }

    label_49:
        arg10.restoreToCount(v0);
    }

    private void ensureExpandedTexture() {
        if(this.expandedTitleTexture == null && !this.expandedBounds.isEmpty()) {
            if(TextUtils.isEmpty(this.textToDraw)) {
            }
            else {
                this.calculateOffsets(0f);
                this.textureAscent = this.textPaint.ascent();
                this.textureDescent = this.textPaint.descent();
                int v0 = Math.round(this.textPaint.measureText(this.textToDraw, 0, this.textToDraw.length()));
                int v1 = Math.round(this.textureDescent - this.textureAscent);
                if(v0 > 0) {
                    if(v1 <= 0) {
                    }
                    else {
                        this.expandedTitleTexture = Bitmap.createBitmap(v0, v1, Bitmap$Config.ARGB_8888);
                        new Canvas(this.expandedTitleTexture).drawText(this.textToDraw, 0, this.textToDraw.length(), 0f, (((float)v1)) - this.textPaint.descent(), this.textPaint);
                        if(this.texturePaint == null) {
                            this.texturePaint = new Paint(3);
                        }

                        return;
                    }
                }

                return;
            }
        }
    }

    public void getCollapsedTextActualBounds(RectF arg4) {
        boolean v0 = this.calculateIsRtl(this.text);
        float v1 = !v0 ? ((float)this.collapsedBounds.left) : (((float)this.collapsedBounds.right)) - this.calculateCollapsedTextWidth();
        arg4.left = v1;
        arg4.top = ((float)this.collapsedBounds.top);
        float v0_1 = !v0 ? arg4.left + this.calculateCollapsedTextWidth() : ((float)this.collapsedBounds.right);
        arg4.right = v0_1;
        arg4.bottom = (((float)this.collapsedBounds.top)) + this.getCollapsedTextHeight();
    }

    public ColorStateList getCollapsedTextColor() {
        return this.collapsedTextColor;
    }

    public int getCollapsedTextGravity() {
        return this.collapsedTextGravity;
    }

    public float getCollapsedTextHeight() {
        this.getTextPaintCollapsed(this.tmpPaint);
        return -this.tmpPaint.ascent();
    }

    public float getCollapsedTextSize() {
        return this.collapsedTextSize;
    }

    public Typeface getCollapsedTypeface() {
        Typeface v0 = this.collapsedTypeface != null ? this.collapsedTypeface : Typeface.DEFAULT;
        return v0;
    }

    @ColorInt @VisibleForTesting public int getCurrentCollapsedTextColor() {
        if(this.state != null) {
            return this.collapsedTextColor.getColorForState(this.state, 0);
        }

        return this.collapsedTextColor.getDefaultColor();
    }

    @ColorInt private int getCurrentExpandedTextColor() {
        if(this.state != null) {
            return this.expandedTextColor.getColorForState(this.state, 0);
        }

        return this.expandedTextColor.getDefaultColor();
    }

    public ColorStateList getExpandedTextColor() {
        return this.expandedTextColor;
    }

    public int getExpandedTextGravity() {
        return this.expandedTextGravity;
    }

    public float getExpandedTextSize() {
        return this.expandedTextSize;
    }

    public Typeface getExpandedTypeface() {
        Typeface v0 = this.expandedTypeface != null ? this.expandedTypeface : Typeface.DEFAULT;
        return v0;
    }

    public float getExpansionFraction() {
        return this.expandedFraction;
    }

    public CharSequence getText() {
        return this.text;
    }

    private void getTextPaintCollapsed(TextPaint arg2) {
        arg2.setTextSize(this.collapsedTextSize);
        arg2.setTypeface(this.collapsedTypeface);
    }

    private void interpolateBounds(float arg5) {
        this.currentBounds.left = CollapsingTextHelper.lerp(((float)this.expandedBounds.left), ((float)this.collapsedBounds.left), arg5, this.positionInterpolator);
        this.currentBounds.top = CollapsingTextHelper.lerp(this.expandedDrawY, this.collapsedDrawY, arg5, this.positionInterpolator);
        this.currentBounds.right = CollapsingTextHelper.lerp(((float)this.expandedBounds.right), ((float)this.collapsedBounds.right), arg5, this.positionInterpolator);
        this.currentBounds.bottom = CollapsingTextHelper.lerp(((float)this.expandedBounds.bottom), ((float)this.collapsedBounds.bottom), arg5, this.positionInterpolator);
    }

    private static boolean isClose(float arg0, float arg1) {
        boolean v0 = Math.abs(arg0 - arg1) < 0.001f ? true : false;
        return v0;
    }

    public final boolean isStateful() {
        boolean v0;
        if(this.collapsedTextColor == null || !this.collapsedTextColor.isStateful()) {
            if(this.expandedTextColor != null && (this.expandedTextColor.isStateful())) {
            label_10:
                v0 = true;
                return v0;
            }

            v0 = false;
        }
        else {
            goto label_10;
        }

        return v0;
    }

    private static float lerp(float arg0, float arg1, float arg2, TimeInterpolator arg3) {
        if(arg3 != null) {
            arg2 = arg3.getInterpolation(arg2);
        }

        return AnimationUtils.lerp(arg0, arg1, arg2);
    }

    void onBoundsChanged() {
        boolean v0 = this.collapsedBounds.width() <= 0 || this.collapsedBounds.height() <= 0 || this.expandedBounds.width() <= 0 || this.expandedBounds.height() <= 0 ? false : true;
        this.drawTitle = v0;
    }

    private Typeface readFontFamilyTypeface(int arg5) {
        Typeface v0_2;
        TypedArray v5 = this.view.getContext().obtainStyledAttributes(arg5, new int[]{0x10103AC});
        try {
            String v0_1 = v5.getString(0);
            if(v0_1 == null) {
                goto label_13;
            }

            v0_2 = Typeface.create(v0_1, 0);
        }
        catch(Throwable v0) {
            v5.recycle();
            throw v0;
        }

        v5.recycle();
        return v0_2;
    label_13:
        v5.recycle();
        return null;
    }

    public void recalculate() {
        if(this.view.getHeight() > 0 && this.view.getWidth() > 0) {
            this.calculateBaseOffsets();
            this.calculateCurrentOffsets();
        }
    }

    private static boolean rectEquals(Rect arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean v1 = arg1.left != arg2 || arg1.top != arg3 || arg1.right != arg4 || arg1.bottom != arg5 ? false : true;
        return v1;
    }

    public void setCollapsedBounds(int arg2, int arg3, int arg4, int arg5) {
        if(!CollapsingTextHelper.rectEquals(this.collapsedBounds, arg2, arg3, arg4, arg5)) {
            this.collapsedBounds.set(arg2, arg3, arg4, arg5);
            this.boundsChanged = true;
            this.onBoundsChanged();
        }
    }

    public void setCollapsedTextAppearance(int arg4) {
        TintTypedArray v0 = TintTypedArray.obtainStyledAttributes(this.view.getContext(), arg4, R$styleable.TextAppearance);
        if(v0.hasValue(R$styleable.TextAppearance_android_textColor)) {
            this.collapsedTextColor = v0.getColorStateList(R$styleable.TextAppearance_android_textColor);
        }

        if(v0.hasValue(R$styleable.TextAppearance_android_textSize)) {
            this.collapsedTextSize = ((float)v0.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, ((int)this.collapsedTextSize)));
        }

        this.collapsedShadowColor = v0.getInt(R$styleable.TextAppearance_android_shadowColor, 0);
        this.collapsedShadowDx = v0.getFloat(R$styleable.TextAppearance_android_shadowDx, 0f);
        this.collapsedShadowDy = v0.getFloat(R$styleable.TextAppearance_android_shadowDy, 0f);
        this.collapsedShadowRadius = v0.getFloat(R$styleable.TextAppearance_android_shadowRadius, 0f);
        v0.recycle();
        if(Build$VERSION.SDK_INT >= 16) {
            this.collapsedTypeface = this.readFontFamilyTypeface(arg4);
        }

        this.recalculate();
    }

    public void setCollapsedTextColor(ColorStateList arg2) {
        if(this.collapsedTextColor != arg2) {
            this.collapsedTextColor = arg2;
            this.recalculate();
        }
    }

    public void setCollapsedTextGravity(int arg2) {
        if(this.collapsedTextGravity != arg2) {
            this.collapsedTextGravity = arg2;
            this.recalculate();
        }
    }

    public void setCollapsedTextSize(float arg2) {
        if(this.collapsedTextSize != arg2) {
            this.collapsedTextSize = arg2;
            this.recalculate();
        }
    }

    public void setCollapsedTypeface(Typeface arg2) {
        if(this.collapsedTypeface != arg2) {
            this.collapsedTypeface = arg2;
            this.recalculate();
        }
    }

    public void setExpandedBounds(int arg2, int arg3, int arg4, int arg5) {
        if(!CollapsingTextHelper.rectEquals(this.expandedBounds, arg2, arg3, arg4, arg5)) {
            this.expandedBounds.set(arg2, arg3, arg4, arg5);
            this.boundsChanged = true;
            this.onBoundsChanged();
        }
    }

    public void setExpandedTextAppearance(int arg4) {
        TintTypedArray v0 = TintTypedArray.obtainStyledAttributes(this.view.getContext(), arg4, R$styleable.TextAppearance);
        if(v0.hasValue(R$styleable.TextAppearance_android_textColor)) {
            this.expandedTextColor = v0.getColorStateList(R$styleable.TextAppearance_android_textColor);
        }

        if(v0.hasValue(R$styleable.TextAppearance_android_textSize)) {
            this.expandedTextSize = ((float)v0.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, ((int)this.expandedTextSize)));
        }

        this.expandedShadowColor = v0.getInt(R$styleable.TextAppearance_android_shadowColor, 0);
        this.expandedShadowDx = v0.getFloat(R$styleable.TextAppearance_android_shadowDx, 0f);
        this.expandedShadowDy = v0.getFloat(R$styleable.TextAppearance_android_shadowDy, 0f);
        this.expandedShadowRadius = v0.getFloat(R$styleable.TextAppearance_android_shadowRadius, 0f);
        v0.recycle();
        if(Build$VERSION.SDK_INT >= 16) {
            this.expandedTypeface = this.readFontFamilyTypeface(arg4);
        }

        this.recalculate();
    }

    public void setExpandedTextColor(ColorStateList arg2) {
        if(this.expandedTextColor != arg2) {
            this.expandedTextColor = arg2;
            this.recalculate();
        }
    }

    public void setExpandedTextGravity(int arg2) {
        if(this.expandedTextGravity != arg2) {
            this.expandedTextGravity = arg2;
            this.recalculate();
        }
    }

    public void setExpandedTextSize(float arg2) {
        if(this.expandedTextSize != arg2) {
            this.expandedTextSize = arg2;
            this.recalculate();
        }
    }

    public void setExpandedTypeface(Typeface arg2) {
        if(this.expandedTypeface != arg2) {
            this.expandedTypeface = arg2;
            this.recalculate();
        }
    }

    public void setExpansionFraction(float arg3) {
        arg3 = MathUtils.clamp(arg3, 0f, 1f);
        if(arg3 != this.expandedFraction) {
            this.expandedFraction = arg3;
            this.calculateCurrentOffsets();
        }
    }

    private void setInterpolatedTextSize(float arg2) {
        this.calculateUsingTextSize(arg2);
        boolean v2 = !CollapsingTextHelper.USE_SCALING_TEXTURE || this.scale == 1f ? false : true;
        this.useTexture = v2;
        if(this.useTexture) {
            this.ensureExpandedTexture();
        }

        ViewCompat.postInvalidateOnAnimation(this.view);
    }

    public void setPositionInterpolator(TimeInterpolator arg1) {
        this.positionInterpolator = arg1;
        this.recalculate();
    }

    public final boolean setState(int[] arg1) {
        this.state = arg1;
        if(this.isStateful()) {
            this.recalculate();
            return 1;
        }

        return 0;
    }

    public void setText(CharSequence arg2) {
        if(arg2 == null || !arg2.equals(this.text)) {
            this.text = arg2;
            this.textToDraw = null;
            this.clearTexture();
            this.recalculate();
        }
    }

    public void setTextSizeInterpolator(TimeInterpolator arg1) {
        this.textSizeInterpolator = arg1;
        this.recalculate();
    }

    public void setTypefaces(Typeface arg1) {
        this.expandedTypeface = arg1;
        this.collapsedTypeface = arg1;
        this.recalculate();
    }
}

