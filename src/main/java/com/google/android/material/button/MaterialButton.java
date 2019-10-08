package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MaterialButton extends AppCompatButton {
    @Retention(value=RetentionPolicy.SOURCE) @public interface IconGravity {
    }

    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    private static final String LOG_TAG = "MaterialButton";
    private Drawable icon;
    private int iconGravity;
    @Px private int iconLeft;
    @Px private int iconPadding;
    @Px private int iconSize;
    private ColorStateList iconTint;
    private PorterDuff$Mode iconTintMode;
    @Nullable private final MaterialButtonHelper materialButtonHelper;

    public MaterialButton(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.materialButtonStyle);
    }

    public MaterialButton(Context arg2) {
        this(arg2, null);
    }

    public MaterialButton(Context arg8, AttributeSet arg9, int arg10) {
        super(arg8, arg9, arg10);
        TypedArray v8 = ThemeEnforcement.obtainStyledAttributes(arg8, arg9, R$styleable.MaterialButton, arg10, R$style.Widget_MaterialComponents_Button, new int[0]);
        this.iconPadding = v8.getDimensionPixelSize(R$styleable.MaterialButton_iconPadding, 0);
        this.iconTintMode = ViewUtils.parseTintMode(v8.getInt(R$styleable.MaterialButton_iconTintMode, -1), PorterDuff$Mode.SRC_IN);
        this.iconTint = MaterialResources.getColorStateList(this.getContext(), v8, R$styleable.MaterialButton_iconTint);
        this.icon = MaterialResources.getDrawable(this.getContext(), v8, R$styleable.MaterialButton_icon);
        this.iconGravity = v8.getInteger(R$styleable.MaterialButton_iconGravity, 1);
        this.iconSize = v8.getDimensionPixelSize(R$styleable.MaterialButton_iconSize, 0);
        this.materialButtonHelper = new MaterialButtonHelper(this);
        this.materialButtonHelper.loadFromAttributes(v8);
        v8.recycle();
        this.setCompoundDrawablePadding(this.iconPadding);
        this.updateIcon();
    }

    @Nullable public ColorStateList getBackgroundTintList() {
        return this.getSupportBackgroundTintList();
    }

    @Nullable public PorterDuff$Mode getBackgroundTintMode() {
        return this.getSupportBackgroundTintMode();
    }

    @Px public int getCornerRadius() {
        int v0 = this.isUsingOriginalBackground() ? this.materialButtonHelper.getCornerRadius() : 0;
        return v0;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    @Px public int getIconPadding() {
        return this.iconPadding;
    }

    @Px public int getIconSize() {
        return this.iconSize;
    }

    public ColorStateList getIconTint() {
        return this.iconTint;
    }

    public PorterDuff$Mode getIconTintMode() {
        return this.iconTintMode;
    }

    public ColorStateList getRippleColor() {
        ColorStateList v0 = this.isUsingOriginalBackground() ? this.materialButtonHelper.getRippleColor() : null;
        return v0;
    }

    public ColorStateList getStrokeColor() {
        ColorStateList v0 = this.isUsingOriginalBackground() ? this.materialButtonHelper.getStrokeColor() : null;
        return v0;
    }

    @Px public int getStrokeWidth() {
        int v0 = this.isUsingOriginalBackground() ? this.materialButtonHelper.getStrokeWidth() : 0;
        return v0;
    }

    @Nullable @RestrictTo(value={Scope.LIBRARY_GROUP}) public ColorStateList getSupportBackgroundTintList() {
        if(this.isUsingOriginalBackground()) {
            return this.materialButtonHelper.getSupportBackgroundTintList();
        }

        return super.getSupportBackgroundTintList();
    }

    @Nullable @RestrictTo(value={Scope.LIBRARY_GROUP}) public PorterDuff$Mode getSupportBackgroundTintMode() {
        if(this.isUsingOriginalBackground()) {
            return this.materialButtonHelper.getSupportBackgroundTintMode();
        }

        return super.getSupportBackgroundTintMode();
    }

    private boolean isLayoutRTL() {
        boolean v1 = true;
        if(ViewCompat.getLayoutDirection(((View)this)) == 1) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    private boolean isUsingOriginalBackground() {
        boolean v0 = this.materialButtonHelper == null || (this.materialButtonHelper.isBackgroundOverwritten()) ? false : true;
        return v0;
    }

    protected void onDraw(Canvas arg3) {
        super.onDraw(arg3);
        if(Build$VERSION.SDK_INT < 21 && (this.isUsingOriginalBackground())) {
            this.materialButtonHelper.drawStroke(arg3);
        }
    }

    protected void onLayout(boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        super.onLayout(arg2, arg3, arg4, arg5, arg6);
        if(Build$VERSION.SDK_INT == 21 && this.materialButtonHelper != null) {
            this.materialButtonHelper.updateMaskBounds(arg6 - arg4, arg5 - arg3);
        }
    }

    protected void onMeasure(int arg3, int arg4) {
        super.onMeasure(arg3, arg4);
        if(this.icon != null) {
            arg4 = 2;
            if(this.iconGravity != arg4) {
            }
            else {
                arg3 = ((int)this.getPaint().measureText(this.getText().toString()));
                int v0 = this.iconSize == 0 ? this.icon.getIntrinsicWidth() : this.iconSize;
                int v1 = (this.getMeasuredWidth() - arg3 - ViewCompat.getPaddingEnd(((View)this)) - v0 - this.iconPadding - ViewCompat.getPaddingStart(((View)this))) / arg4;
                if(this.isLayoutRTL()) {
                    v1 = -v1;
                }

                if(this.iconLeft != v1) {
                    this.iconLeft = v1;
                    this.updateIcon();
                }

                return;
            }
        }
    }

    public void setBackground(Drawable arg1) {
        this.setBackgroundDrawable(arg1);
    }

    public void setBackgroundColor(@ColorInt int arg2) {
        if(this.isUsingOriginalBackground()) {
            this.materialButtonHelper.setBackgroundColor(arg2);
        }
        else {
            super.setBackgroundColor(arg2);
        }
    }

    public void setBackgroundDrawable(Drawable arg3) {
        if(!this.isUsingOriginalBackground()) {
            super.setBackgroundDrawable(arg3);
        }
        else if(arg3 != this.getBackground()) {
            Log.i("MaterialButton", "Setting a custom background is not supported.");
            this.materialButtonHelper.setBackgroundOverwritten();
            super.setBackgroundDrawable(arg3);
        }
        else {
            this.getBackground().setState(arg3.getState());
        }
    }

    public void setBackgroundResource(@DrawableRes int arg2) {
        Drawable v2 = arg2 != 0 ? AppCompatResources.getDrawable(this.getContext(), arg2) : null;
        this.setBackgroundDrawable(v2);
    }

    public void setBackgroundTintList(@Nullable ColorStateList arg1) {
        this.setSupportBackgroundTintList(arg1);
    }

    public void setBackgroundTintMode(@Nullable PorterDuff$Mode arg1) {
        this.setSupportBackgroundTintMode(arg1);
    }

    public void setCornerRadius(@Px int arg2) {
        if(this.isUsingOriginalBackground()) {
            this.materialButtonHelper.setCornerRadius(arg2);
        }
    }

    public void setCornerRadiusResource(@DimenRes int arg2) {
        if(this.isUsingOriginalBackground()) {
            this.setCornerRadius(this.getResources().getDimensionPixelSize(arg2));
        }
    }

    public void setIcon(Drawable arg2) {
        if(this.icon != arg2) {
            this.icon = arg2;
            this.updateIcon();
        }
    }

    public void setIconGravity(int arg1) {
        this.iconGravity = arg1;
    }

    public void setIconPadding(@Px int arg2) {
        if(this.iconPadding != arg2) {
            this.iconPadding = arg2;
            this.setCompoundDrawablePadding(arg2);
        }
    }

    public void setIconResource(@DrawableRes int arg2) {
        Drawable v2 = arg2 != 0 ? AppCompatResources.getDrawable(this.getContext(), arg2) : null;
        this.setIcon(v2);
    }

    public void setIconSize(@Px int arg2) {
        if(arg2 >= 0) {
            if(this.iconSize != arg2) {
                this.iconSize = arg2;
                this.updateIcon();
            }

            return;
        }

        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(@Nullable ColorStateList arg2) {
        if(this.iconTint != arg2) {
            this.iconTint = arg2;
            this.updateIcon();
        }
    }

    public void setIconTintMode(PorterDuff$Mode arg2) {
        if(this.iconTintMode != arg2) {
            this.iconTintMode = arg2;
            this.updateIcon();
        }
    }

    public void setIconTintResource(@ColorRes int arg2) {
        this.setIconTint(AppCompatResources.getColorStateList(this.getContext(), arg2));
    }

    void setInternalBackground(Drawable arg1) {
        super.setBackgroundDrawable(arg1);
    }

    public void setRippleColor(@Nullable ColorStateList arg2) {
        if(this.isUsingOriginalBackground()) {
            this.materialButtonHelper.setRippleColor(arg2);
        }
    }

    public void setRippleColorResource(@ColorRes int arg2) {
        if(this.isUsingOriginalBackground()) {
            this.setRippleColor(AppCompatResources.getColorStateList(this.getContext(), arg2));
        }
    }

    public void setStrokeColor(@Nullable ColorStateList arg2) {
        if(this.isUsingOriginalBackground()) {
            this.materialButtonHelper.setStrokeColor(arg2);
        }
    }

    public void setStrokeColorResource(@ColorRes int arg2) {
        if(this.isUsingOriginalBackground()) {
            this.setStrokeColor(AppCompatResources.getColorStateList(this.getContext(), arg2));
        }
    }

    public void setStrokeWidth(@Px int arg2) {
        if(this.isUsingOriginalBackground()) {
            this.materialButtonHelper.setStrokeWidth(arg2);
        }
    }

    public void setStrokeWidthResource(@DimenRes int arg2) {
        if(this.isUsingOriginalBackground()) {
            this.setStrokeWidth(this.getResources().getDimensionPixelSize(arg2));
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void setSupportBackgroundTintList(@Nullable ColorStateList arg2) {
        if(this.isUsingOriginalBackground()) {
            this.materialButtonHelper.setSupportBackgroundTintList(arg2);
        }
        else if(this.materialButtonHelper != null) {
            super.setSupportBackgroundTintList(arg2);
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void setSupportBackgroundTintMode(@Nullable PorterDuff$Mode arg2) {
        if(this.isUsingOriginalBackground()) {
            this.materialButtonHelper.setSupportBackgroundTintMode(arg2);
        }
        else if(this.materialButtonHelper != null) {
            super.setSupportBackgroundTintMode(arg2);
        }
    }

    private void updateIcon() {
        if(this.icon != null) {
            this.icon = this.icon.mutate();
            DrawableCompat.setTintList(this.icon, this.iconTint);
            if(this.iconTintMode != null) {
                DrawableCompat.setTintMode(this.icon, this.iconTintMode);
            }

            int v0 = this.iconSize != 0 ? this.iconSize : this.icon.getIntrinsicWidth();
            int v1 = this.iconSize != 0 ? this.iconSize : this.icon.getIntrinsicHeight();
            this.icon.setBounds(this.iconLeft, 0, this.iconLeft + v0, v1);
        }

        TextViewCompat.setCompoundDrawablesRelative(((TextView)this), this.icon, null, null, null);
    }
}

