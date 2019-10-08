package com.google.android.material.button;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build$VERSION;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleUtils;

@RestrictTo(value={Scope.LIBRARY_GROUP}) class MaterialButtonHelper {
    private static final float CORNER_RADIUS_ADJUSTMENT = 0.00001f;
    private static final int DEFAULT_BACKGROUND_COLOR = -1;
    private static final boolean IS_LOLLIPOP;
    @Nullable private GradientDrawable backgroundDrawableLollipop;
    private boolean backgroundOverwritten;
    @Nullable private ColorStateList backgroundTint;
    @Nullable private PorterDuff$Mode backgroundTintMode;
    private final Rect bounds;
    private final Paint buttonStrokePaint;
    @Nullable private GradientDrawable colorableBackgroundDrawableCompat;
    private int cornerRadius;
    private int insetBottom;
    private int insetLeft;
    private int insetRight;
    private int insetTop;
    @Nullable private GradientDrawable maskDrawableLollipop;
    private final MaterialButton materialButton;
    private final RectF rectF;
    @Nullable private ColorStateList rippleColor;
    @Nullable private GradientDrawable rippleDrawableCompat;
    @Nullable private ColorStateList strokeColor;
    @Nullable private GradientDrawable strokeDrawableLollipop;
    private int strokeWidth;
    @Nullable private Drawable tintableBackgroundDrawableCompat;
    @Nullable private Drawable tintableRippleDrawableCompat;

    static {
        boolean v0 = Build$VERSION.SDK_INT >= 21 ? true : false;
        MaterialButtonHelper.IS_LOLLIPOP = v0;
    }

    public MaterialButtonHelper(MaterialButton arg3) {
        super();
        this.buttonStrokePaint = new Paint(1);
        this.bounds = new Rect();
        this.rectF = new RectF();
        this.backgroundOverwritten = false;
        this.materialButton = arg3;
    }

    private Drawable createBackgroundCompat() {
        this.colorableBackgroundDrawableCompat = new GradientDrawable();
        float v2 = 0.00001f;
        this.colorableBackgroundDrawableCompat.setCornerRadius((((float)this.cornerRadius)) + v2);
        int v1 = -1;
        this.colorableBackgroundDrawableCompat.setColor(v1);
        this.tintableBackgroundDrawableCompat = DrawableCompat.wrap(this.colorableBackgroundDrawableCompat);
        DrawableCompat.setTintList(this.tintableBackgroundDrawableCompat, this.backgroundTint);
        if(this.backgroundTintMode != null) {
            DrawableCompat.setTintMode(this.tintableBackgroundDrawableCompat, this.backgroundTintMode);
        }

        this.rippleDrawableCompat = new GradientDrawable();
        this.rippleDrawableCompat.setCornerRadius((((float)this.cornerRadius)) + v2);
        this.rippleDrawableCompat.setColor(v1);
        this.tintableRippleDrawableCompat = DrawableCompat.wrap(this.rippleDrawableCompat);
        DrawableCompat.setTintList(this.tintableRippleDrawableCompat, this.rippleColor);
        return this.wrapDrawableWithInset(new LayerDrawable(new Drawable[]{this.tintableBackgroundDrawableCompat, this.tintableRippleDrawableCompat}));
    }

    @TargetApi(value=21) private Drawable createBackgroundLollipop() {
        this.backgroundDrawableLollipop = new GradientDrawable();
        this.backgroundDrawableLollipop.setCornerRadius((((float)this.cornerRadius)) + 0.00001f);
        this.backgroundDrawableLollipop.setColor(-1);
        this.updateTintAndTintModeLollipop();
        this.strokeDrawableLollipop = new GradientDrawable();
        this.strokeDrawableLollipop.setCornerRadius((((float)this.cornerRadius)) + 0.00001f);
        this.strokeDrawableLollipop.setColor(0);
        this.strokeDrawableLollipop.setStroke(this.strokeWidth, this.strokeColor);
        InsetDrawable v0 = this.wrapDrawableWithInset(new LayerDrawable(new Drawable[]{this.backgroundDrawableLollipop, this.strokeDrawableLollipop}));
        this.maskDrawableLollipop = new GradientDrawable();
        this.maskDrawableLollipop.setCornerRadius((((float)this.cornerRadius)) + 0.00001f);
        this.maskDrawableLollipop.setColor(-1);
        return new MaterialButtonBackgroundDrawable(RippleUtils.convertToRippleDrawableColor(this.rippleColor), v0, this.maskDrawableLollipop);
    }

    void drawStroke(@Nullable Canvas arg8) {
        if(arg8 != null && this.strokeColor != null && this.strokeWidth > 0) {
            this.bounds.set(this.materialButton.getBackground().getBounds());
            this.rectF.set((((float)this.bounds.left)) + (((float)this.strokeWidth)) / 2f + (((float)this.insetLeft)), (((float)this.bounds.top)) + (((float)this.strokeWidth)) / 2f + (((float)this.insetTop)), (((float)this.bounds.right)) - (((float)this.strokeWidth)) / 2f - (((float)this.insetRight)), (((float)this.bounds.bottom)) - (((float)this.strokeWidth)) / 2f - (((float)this.insetBottom)));
            float v0 = (((float)this.cornerRadius)) - (((float)this.strokeWidth)) / 2f;
            arg8.drawRoundRect(this.rectF, v0, v0, this.buttonStrokePaint);
        }
    }

    int getCornerRadius() {
        return this.cornerRadius;
    }

    @Nullable ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    @Nullable ColorStateList getStrokeColor() {
        return this.strokeColor;
    }

    int getStrokeWidth() {
        return this.strokeWidth;
    }

    ColorStateList getSupportBackgroundTintList() {
        return this.backgroundTint;
    }

    PorterDuff$Mode getSupportBackgroundTintMode() {
        return this.backgroundTintMode;
    }

    boolean isBackgroundOverwritten() {
        return this.backgroundOverwritten;
    }

    public void loadFromAttributes(TypedArray arg6) {
        int v1 = 0;
        this.insetLeft = arg6.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetLeft, 0);
        this.insetRight = arg6.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetRight, 0);
        this.insetTop = arg6.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetTop, 0);
        this.insetBottom = arg6.getDimensionPixelOffset(R$styleable.MaterialButton_android_insetBottom, 0);
        this.cornerRadius = arg6.getDimensionPixelSize(R$styleable.MaterialButton_cornerRadius, 0);
        this.strokeWidth = arg6.getDimensionPixelSize(R$styleable.MaterialButton_strokeWidth, 0);
        this.backgroundTintMode = ViewUtils.parseTintMode(arg6.getInt(R$styleable.MaterialButton_backgroundTintMode, -1), PorterDuff$Mode.SRC_IN);
        this.backgroundTint = MaterialResources.getColorStateList(this.materialButton.getContext(), arg6, R$styleable.MaterialButton_backgroundTint);
        this.strokeColor = MaterialResources.getColorStateList(this.materialButton.getContext(), arg6, R$styleable.MaterialButton_strokeColor);
        this.rippleColor = MaterialResources.getColorStateList(this.materialButton.getContext(), arg6, R$styleable.MaterialButton_rippleColor);
        this.buttonStrokePaint.setStyle(Paint$Style.STROKE);
        this.buttonStrokePaint.setStrokeWidth(((float)this.strokeWidth));
        Paint v6 = this.buttonStrokePaint;
        if(this.strokeColor != null) {
            v1 = this.strokeColor.getColorForState(this.materialButton.getDrawableState(), 0);
        }

        v6.setColor(v1);
        int v6_1 = ViewCompat.getPaddingStart(this.materialButton);
        int v0 = this.materialButton.getPaddingTop();
        v1 = ViewCompat.getPaddingEnd(this.materialButton);
        int v2 = this.materialButton.getPaddingBottom();
        MaterialButton v3 = this.materialButton;
        Drawable v4 = MaterialButtonHelper.IS_LOLLIPOP ? this.createBackgroundLollipop() : this.createBackgroundCompat();
        v3.setInternalBackground(v4);
        ViewCompat.setPaddingRelative(this.materialButton, v6_1 + this.insetLeft, v0 + this.insetTop, v1 + this.insetRight, v2 + this.insetBottom);
    }

    void setBackgroundColor(int arg2) {
        if((MaterialButtonHelper.IS_LOLLIPOP) && this.backgroundDrawableLollipop != null) {
            this.backgroundDrawableLollipop.setColor(arg2);
        }
        else if(!MaterialButtonHelper.IS_LOLLIPOP && this.colorableBackgroundDrawableCompat != null) {
            this.colorableBackgroundDrawableCompat.setColor(arg2);
        }
    }

    void setBackgroundOverwritten() {
        this.backgroundOverwritten = true;
        this.materialButton.setSupportBackgroundTintList(this.backgroundTint);
        this.materialButton.setSupportBackgroundTintMode(this.backgroundTintMode);
    }

    void setCornerRadius(int arg4) {
        float v4;
        if(this.cornerRadius != arg4) {
            this.cornerRadius = arg4;
            float v1 = 0.00001f;
            if((MaterialButtonHelper.IS_LOLLIPOP) && this.backgroundDrawableLollipop != null && this.strokeDrawableLollipop != null && this.maskDrawableLollipop != null) {
                if(Build$VERSION.SDK_INT == 21) {
                    float v2 = (((float)arg4)) + v1;
                    this.unwrapBackgroundDrawable().setCornerRadius(v2);
                    this.unwrapStrokeDrawable().setCornerRadius(v2);
                }

                v4 = (((float)arg4)) + v1;
                this.backgroundDrawableLollipop.setCornerRadius(v4);
                this.strokeDrawableLollipop.setCornerRadius(v4);
                this.maskDrawableLollipop.setCornerRadius(v4);
                return;
            }

            if(MaterialButtonHelper.IS_LOLLIPOP) {
                return;
            }

            if(this.colorableBackgroundDrawableCompat == null) {
                return;
            }

            if(this.rippleDrawableCompat == null) {
                return;
            }

            v4 = (((float)arg4)) + v1;
            this.colorableBackgroundDrawableCompat.setCornerRadius(v4);
            this.rippleDrawableCompat.setCornerRadius(v4);
            this.materialButton.invalidate();
        }
    }

    void setRippleColor(@Nullable ColorStateList arg2) {
        if(this.rippleColor != arg2) {
            this.rippleColor = arg2;
            if((MaterialButtonHelper.IS_LOLLIPOP) && ((this.materialButton.getBackground() instanceof RippleDrawable))) {
                this.materialButton.getBackground().setColor(arg2);
                return;
            }

            if(MaterialButtonHelper.IS_LOLLIPOP) {
                return;
            }

            if(this.tintableRippleDrawableCompat == null) {
                return;
            }

            DrawableCompat.setTintList(this.tintableRippleDrawableCompat, arg2);
        }
    }

    void setStrokeColor(@Nullable ColorStateList arg4) {
        if(this.strokeColor != arg4) {
            this.strokeColor = arg4;
            Paint v0 = this.buttonStrokePaint;
            int v1 = 0;
            if(arg4 != null) {
                v1 = arg4.getColorForState(this.materialButton.getDrawableState(), 0);
            }

            v0.setColor(v1);
            this.updateStroke();
        }
    }

    void setStrokeWidth(int arg2) {
        if(this.strokeWidth != arg2) {
            this.strokeWidth = arg2;
            this.buttonStrokePaint.setStrokeWidth(((float)arg2));
            this.updateStroke();
        }
    }

    void setSupportBackgroundTintList(@Nullable ColorStateList arg2) {
        if(this.backgroundTint != arg2) {
            this.backgroundTint = arg2;
            if(MaterialButtonHelper.IS_LOLLIPOP) {
                this.updateTintAndTintModeLollipop();
            }
            else if(this.tintableBackgroundDrawableCompat != null) {
                DrawableCompat.setTintList(this.tintableBackgroundDrawableCompat, this.backgroundTint);
            }
        }
    }

    void setSupportBackgroundTintMode(@Nullable PorterDuff$Mode arg2) {
        if(this.backgroundTintMode != arg2) {
            this.backgroundTintMode = arg2;
            if(MaterialButtonHelper.IS_LOLLIPOP) {
                this.updateTintAndTintModeLollipop();
            }
            else if(this.tintableBackgroundDrawableCompat != null && this.backgroundTintMode != null) {
                DrawableCompat.setTintMode(this.tintableBackgroundDrawableCompat, this.backgroundTintMode);
            }
        }
    }

    @Nullable private GradientDrawable unwrapBackgroundDrawable() {
        if((MaterialButtonHelper.IS_LOLLIPOP) && this.materialButton.getBackground() != null) {
            return this.materialButton.getBackground().getDrawable(0).getDrawable().getDrawable(0);
        }

        return null;
    }

    @Nullable private GradientDrawable unwrapStrokeDrawable() {
        if((MaterialButtonHelper.IS_LOLLIPOP) && this.materialButton.getBackground() != null) {
            return this.materialButton.getBackground().getDrawable(0).getDrawable().getDrawable(1);
        }

        return null;
    }

    void updateMaskBounds(int arg5, int arg6) {
        if(this.maskDrawableLollipop != null) {
            this.maskDrawableLollipop.setBounds(this.insetLeft, this.insetTop, arg6 - this.insetRight, arg5 - this.insetBottom);
        }
    }

    private void updateStroke() {
        if((MaterialButtonHelper.IS_LOLLIPOP) && this.strokeDrawableLollipop != null) {
            this.materialButton.setInternalBackground(this.createBackgroundLollipop());
        }
        else if(!MaterialButtonHelper.IS_LOLLIPOP) {
            this.materialButton.invalidate();
        }
    }

    private void updateTintAndTintModeLollipop() {
        if(this.backgroundDrawableLollipop != null) {
            DrawableCompat.setTintList(this.backgroundDrawableLollipop, this.backgroundTint);
            if(this.backgroundTintMode != null) {
                DrawableCompat.setTintMode(this.backgroundDrawableLollipop, this.backgroundTintMode);
            }
        }
    }

    private InsetDrawable wrapDrawableWithInset(Drawable arg8) {
        return new InsetDrawable(arg8, this.insetLeft, this.insetTop, this.insetRight, this.insetBottom);
    }
}

