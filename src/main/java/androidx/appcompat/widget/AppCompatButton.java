package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode$Callback;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$attr;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;

public class AppCompatButton extends Button implements TintableBackgroundView, AutoSizeableTextView {
    private final AppCompatBackgroundHelper mBackgroundTintHelper;
    private final AppCompatTextHelper mTextHelper;

    public AppCompatButton(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.buttonStyle);
    }

    public AppCompatButton(Context arg2) {
        this(arg2, null);
    }

    public AppCompatButton(Context arg1, AttributeSet arg2, int arg3) {
        super(TintContextWrapper.wrap(arg1), arg2, arg3);
        this.mBackgroundTintHelper = new AppCompatBackgroundHelper(((View)this));
        this.mBackgroundTintHelper.loadFromAttributes(arg2, arg3);
        this.mTextHelper = new AppCompatTextHelper(((TextView)this));
        this.mTextHelper.loadFromAttributes(arg2, arg3);
        this.mTextHelper.applyCompoundDrawablesTints();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if(this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.applySupportBackgroundTint();
        }

        if(this.mTextHelper != null) {
            this.mTextHelper.applyCompoundDrawablesTints();
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public int getAutoSizeMaxTextSize() {
        if(AppCompatButton.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMaxTextSize();
        }

        if(this.mTextHelper != null) {
            return this.mTextHelper.getAutoSizeMaxTextSize();
        }

        return -1;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public int getAutoSizeMinTextSize() {
        if(AppCompatButton.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeMinTextSize();
        }

        if(this.mTextHelper != null) {
            return this.mTextHelper.getAutoSizeMinTextSize();
        }

        return -1;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public int getAutoSizeStepGranularity() {
        if(AppCompatButton.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeStepGranularity();
        }

        if(this.mTextHelper != null) {
            return this.mTextHelper.getAutoSizeStepGranularity();
        }

        return -1;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public int[] getAutoSizeTextAvailableSizes() {
        if(AppCompatButton.PLATFORM_SUPPORTS_AUTOSIZE) {
            return super.getAutoSizeTextAvailableSizes();
        }

        if(this.mTextHelper != null) {
            return this.mTextHelper.getAutoSizeTextAvailableSizes();
        }

        return new int[0];
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public int getAutoSizeTextType() {
        int v1 = 0;
        if(AppCompatButton.PLATFORM_SUPPORTS_AUTOSIZE) {
            if(super.getAutoSizeTextType() == 1) {
                v1 = 1;
            }

            return v1;
        }

        if(this.mTextHelper != null) {
            return this.mTextHelper.getAutoSizeTextType();
        }

        return 0;
    }

    @Nullable @RestrictTo(value={Scope.LIBRARY_GROUP}) public ColorStateList getSupportBackgroundTintList() {
        ColorStateList v0 = this.mBackgroundTintHelper != null ? this.mBackgroundTintHelper.getSupportBackgroundTintList() : null;
        return v0;
    }

    @Nullable @RestrictTo(value={Scope.LIBRARY_GROUP}) public PorterDuff$Mode getSupportBackgroundTintMode() {
        PorterDuff$Mode v0 = this.mBackgroundTintHelper != null ? this.mBackgroundTintHelper.getSupportBackgroundTintMode() : null;
        return v0;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent arg2) {
        super.onInitializeAccessibilityEvent(arg2);
        arg2.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo arg2) {
        super.onInitializeAccessibilityNodeInfo(arg2);
        arg2.setClassName(Button.class.getName());
    }

    protected void onLayout(boolean arg8, int arg9, int arg10, int arg11, int arg12) {
        super.onLayout(arg8, arg9, arg10, arg11, arg12);
        if(this.mTextHelper != null) {
            this.mTextHelper.onLayout(arg8, arg9, arg10, arg11, arg12);
        }
    }

    protected void onTextChanged(CharSequence arg1, int arg2, int arg3, int arg4) {
        super.onTextChanged(arg1, arg2, arg3, arg4);
        if(this.mTextHelper != null && !AppCompatButton.PLATFORM_SUPPORTS_AUTOSIZE && (this.mTextHelper.isAutoSizeEnabled())) {
            this.mTextHelper.autoSizeText();
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void setAutoSizeTextTypeUniformWithConfiguration(int arg2, int arg3, int arg4, int arg5) throws IllegalArgumentException {
        if(AppCompatButton.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithConfiguration(arg2, arg3, arg4, arg5);
        }
        else if(this.mTextHelper != null) {
            this.mTextHelper.setAutoSizeTextTypeUniformWithConfiguration(arg2, arg3, arg4, arg5);
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] arg2, int arg3) throws IllegalArgumentException {
        if(AppCompatButton.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(arg2, arg3);
        }
        else if(this.mTextHelper != null) {
            this.mTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(arg2, arg3);
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void setAutoSizeTextTypeWithDefaults(int arg2) {
        if(AppCompatButton.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setAutoSizeTextTypeWithDefaults(arg2);
        }
        else if(this.mTextHelper != null) {
            this.mTextHelper.setAutoSizeTextTypeWithDefaults(arg2);
        }
    }

    public void setBackgroundDrawable(Drawable arg2) {
        super.setBackgroundDrawable(arg2);
        if(this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.onSetBackgroundDrawable(arg2);
        }
    }

    public void setBackgroundResource(@DrawableRes int arg2) {
        super.setBackgroundResource(arg2);
        if(this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.onSetBackgroundResource(arg2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode$Callback arg1) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(((TextView)this), arg1));
    }

    public void setSupportAllCaps(boolean arg2) {
        if(this.mTextHelper != null) {
            this.mTextHelper.setAllCaps(arg2);
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void setSupportBackgroundTintList(@Nullable ColorStateList arg2) {
        if(this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.setSupportBackgroundTintList(arg2);
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void setSupportBackgroundTintMode(@Nullable PorterDuff$Mode arg2) {
        if(this.mBackgroundTintHelper != null) {
            this.mBackgroundTintHelper.setSupportBackgroundTintMode(arg2);
        }
    }

    public void setTextAppearance(Context arg2, int arg3) {
        super.setTextAppearance(arg2, arg3);
        if(this.mTextHelper != null) {
            this.mTextHelper.onSetTextAppearance(arg2, arg3);
        }
    }

    public void setTextSize(int arg2, float arg3) {
        if(AppCompatButton.PLATFORM_SUPPORTS_AUTOSIZE) {
            super.setTextSize(arg2, arg3);
        }
        else if(this.mTextHelper != null) {
            this.mTextHelper.setTextSize(arg2, arg3);
        }
    }
}

