package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources$NotFoundException;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$styleable;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;

class AppCompatTextHelper {
    private static final int MONOSPACE = 3;
    private static final int SANS = 1;
    private static final int SERIF = 2;
    private boolean mAsyncFontPending;
    @NonNull private final AppCompatTextViewAutoSizeHelper mAutoSizeTextHelper;
    private TintInfo mDrawableBottomTint;
    private TintInfo mDrawableEndTint;
    private TintInfo mDrawableLeftTint;
    private TintInfo mDrawableRightTint;
    private TintInfo mDrawableStartTint;
    private TintInfo mDrawableTopTint;
    private Typeface mFontTypeface;
    private int mStyle;
    private final TextView mView;

    AppCompatTextHelper(TextView arg2) {
        super();
        this.mStyle = 0;
        this.mView = arg2;
        this.mAutoSizeTextHelper = new AppCompatTextViewAutoSizeHelper(this.mView);
    }

    private void applyCompoundDrawableTint(Drawable arg2, TintInfo arg3) {
        if(arg2 != null && arg3 != null) {
            AppCompatDrawableManager.tintDrawable(arg2, arg3, this.mView.getDrawableState());
        }
    }

    void applyCompoundDrawablesTints() {
        Drawable[] v0;
        int v1 = 2;
        if(this.mDrawableLeftTint != null || this.mDrawableTopTint != null || this.mDrawableRightTint != null || this.mDrawableBottomTint != null) {
            v0 = this.mView.getCompoundDrawables();
            this.applyCompoundDrawableTint(v0[0], this.mDrawableLeftTint);
            this.applyCompoundDrawableTint(v0[1], this.mDrawableTopTint);
            this.applyCompoundDrawableTint(v0[v1], this.mDrawableRightTint);
            this.applyCompoundDrawableTint(v0[3], this.mDrawableBottomTint);
        }

        if(Build$VERSION.SDK_INT >= 17 && (this.mDrawableStartTint != null || this.mDrawableEndTint != null)) {
            v0 = this.mView.getCompoundDrawablesRelative();
            this.applyCompoundDrawableTint(v0[0], this.mDrawableStartTint);
            this.applyCompoundDrawableTint(v0[v1], this.mDrawableEndTint);
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) void autoSizeText() {
        this.mAutoSizeTextHelper.autoSizeText();
    }

    private static TintInfo createTintInfo(Context arg0, AppCompatDrawableManager arg1, int arg2) {
        ColorStateList v0 = arg1.getTintList(arg0, arg2);
        if(v0 != null) {
            TintInfo v1 = new TintInfo();
            v1.mHasTintList = true;
            v1.mTintList = v0;
            return v1;
        }

        return null;
    }

    int getAutoSizeMaxTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMaxTextSize();
    }

    int getAutoSizeMinTextSize() {
        return this.mAutoSizeTextHelper.getAutoSizeMinTextSize();
    }

    int getAutoSizeStepGranularity() {
        return this.mAutoSizeTextHelper.getAutoSizeStepGranularity();
    }

    int[] getAutoSizeTextAvailableSizes() {
        return this.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
    }

    int getAutoSizeTextType() {
        return this.mAutoSizeTextHelper.getAutoSizeTextType();
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) boolean isAutoSizeEnabled() {
        return this.mAutoSizeTextHelper.isAutoSizeEnabled();
    }

    @SuppressLint(value={"NewApi"}) void loadFromAttributes(AttributeSet arg18, int arg19) {
        ColorStateList v14;
        ColorStateList v13;
        int v11;
        boolean v12;
        TintTypedArray v7_1;
        AppCompatTextHelper v0 = this;
        AttributeSet v1 = arg18;
        int v2 = arg19;
        Context v3 = v0.mView.getContext();
        AppCompatDrawableManager v4 = AppCompatDrawableManager.get();
        TintTypedArray v5 = TintTypedArray.obtainStyledAttributes(v3, v1, R$styleable.AppCompatTextHelper, v2, 0);
        int v8 = -1;
        int v7 = v5.getResourceId(R$styleable.AppCompatTextHelper_android_textAppearance, v8);
        if(v5.hasValue(R$styleable.AppCompatTextHelper_android_drawableLeft)) {
            v0.mDrawableLeftTint = AppCompatTextHelper.createTintInfo(v3, v4, v5.getResourceId(R$styleable.AppCompatTextHelper_android_drawableLeft, 0));
        }

        if(v5.hasValue(R$styleable.AppCompatTextHelper_android_drawableTop)) {
            v0.mDrawableTopTint = AppCompatTextHelper.createTintInfo(v3, v4, v5.getResourceId(R$styleable.AppCompatTextHelper_android_drawableTop, 0));
        }

        if(v5.hasValue(R$styleable.AppCompatTextHelper_android_drawableRight)) {
            v0.mDrawableRightTint = AppCompatTextHelper.createTintInfo(v3, v4, v5.getResourceId(R$styleable.AppCompatTextHelper_android_drawableRight, 0));
        }

        if(v5.hasValue(R$styleable.AppCompatTextHelper_android_drawableBottom)) {
            v0.mDrawableBottomTint = AppCompatTextHelper.createTintInfo(v3, v4, v5.getResourceId(R$styleable.AppCompatTextHelper_android_drawableBottom, 0));
        }

        if(Build$VERSION.SDK_INT >= 17) {
            if(v5.hasValue(R$styleable.AppCompatTextHelper_android_drawableStart)) {
                v0.mDrawableStartTint = AppCompatTextHelper.createTintInfo(v3, v4, v5.getResourceId(R$styleable.AppCompatTextHelper_android_drawableStart, 0));
            }

            if(!v5.hasValue(R$styleable.AppCompatTextHelper_android_drawableEnd)) {
                goto label_57;
            }

            v0.mDrawableEndTint = AppCompatTextHelper.createTintInfo(v3, v4, v5.getResourceId(R$styleable.AppCompatTextHelper_android_drawableEnd, 0));
        }

    label_57:
        v5.recycle();
        boolean v4_1 = v0.mView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int v5_1 = 1;
        int v9 = 23;
        ColorStateList v10 = null;
        if(v7 != v8) {
            v7_1 = TintTypedArray.obtainStyledAttributes(v3, v7, R$styleable.TextAppearance);
            if((v4_1) || !v7_1.hasValue(R$styleable.TextAppearance_textAllCaps)) {
                v11 = 0;
                v12 = false;
            }
            else {
                v12 = v7_1.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
                v11 = 1;
            }

            v0.updateTypefaceAndStyle(v3, v7_1);
            if(Build$VERSION.SDK_INT < v9) {
                v13 = v7_1.hasValue(R$styleable.TextAppearance_android_textColor) ? v7_1.getColorStateList(R$styleable.TextAppearance_android_textColor) : v10;
                v14 = v7_1.hasValue(R$styleable.TextAppearance_android_textColorHint) ? v7_1.getColorStateList(R$styleable.TextAppearance_android_textColorHint) : v10;
                if(v7_1.hasValue(R$styleable.TextAppearance_android_textColorLink)) {
                    v10 = v7_1.getColorStateList(R$styleable.TextAppearance_android_textColorLink);
                }

                ColorStateList v16 = v13;
                v13 = v10;
                v10 = v16;
            }
            else {
                v13 = v10;
                v14 = v13;
            }

            v7_1.recycle();
        }
        else {
            v13 = v10;
            v14 = v13;
            v11 = 0;
            v12 = false;
        }

        v7_1 = TintTypedArray.obtainStyledAttributes(v3, v1, R$styleable.TextAppearance, v2, 0);
        if((v4_1) || !v7_1.hasValue(R$styleable.TextAppearance_textAllCaps)) {
            v5_1 = v11;
        }
        else {
            v12 = v7_1.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
        }

        if(Build$VERSION.SDK_INT < v9) {
            if(v7_1.hasValue(R$styleable.TextAppearance_android_textColor)) {
                v10 = v7_1.getColorStateList(R$styleable.TextAppearance_android_textColor);
            }

            if(v7_1.hasValue(R$styleable.TextAppearance_android_textColorHint)) {
                v14 = v7_1.getColorStateList(R$styleable.TextAppearance_android_textColorHint);
            }

            if(!v7_1.hasValue(R$styleable.TextAppearance_android_textColorLink)) {
                goto label_141;
            }

            v13 = v7_1.getColorStateList(R$styleable.TextAppearance_android_textColorLink);
        }

    label_141:
        if(Build$VERSION.SDK_INT >= 28 && (v7_1.hasValue(R$styleable.TextAppearance_android_textSize)) && v7_1.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, v8) == 0) {
            v0.mView.setTextSize(0, 0f);
        }

        v0.updateTypefaceAndStyle(v3, v7_1);
        v7_1.recycle();
        if(v10 != null) {
            v0.mView.setTextColor(v10);
        }

        if(v14 != null) {
            v0.mView.setHintTextColor(v14);
        }

        if(v13 != null) {
            v0.mView.setLinkTextColor(v13);
        }

        if(!v4_1 && v5_1 != 0) {
            v0.setAllCaps(v12);
        }

        if(v0.mFontTypeface != null) {
            v0.mView.setTypeface(v0.mFontTypeface, v0.mStyle);
        }

        v0.mAutoSizeTextHelper.loadFromAttributes(v1, v2);
        if((AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) && v0.mAutoSizeTextHelper.getAutoSizeTextType() != 0) {
            int[] v2_1 = v0.mAutoSizeTextHelper.getAutoSizeTextAvailableSizes();
            if(v2_1.length > 0) {
                if((((float)v0.mView.getAutoSizeStepGranularity())) != -1f) {
                    v0.mView.setAutoSizeTextTypeUniformWithConfiguration(v0.mAutoSizeTextHelper.getAutoSizeMinTextSize(), v0.mAutoSizeTextHelper.getAutoSizeMaxTextSize(), v0.mAutoSizeTextHelper.getAutoSizeStepGranularity(), 0);
                }
                else {
                    v0.mView.setAutoSizeTextTypeUniformWithPresetSizes(v2_1, 0);
                }
            }
        }

        TintTypedArray v1_1 = TintTypedArray.obtainStyledAttributes(v3, v1, R$styleable.AppCompatTextView);
        v2 = v1_1.getDimensionPixelSize(R$styleable.AppCompatTextView_firstBaselineToTopHeight, v8);
        int v3_1 = v1_1.getDimensionPixelSize(R$styleable.AppCompatTextView_lastBaselineToBottomHeight, v8);
        int v4_2 = v1_1.getDimensionPixelSize(R$styleable.AppCompatTextView_lineHeight, v8);
        v1_1.recycle();
        if(v2 != v8) {
            TextViewCompat.setFirstBaselineToTopHeight(v0.mView, v2);
        }

        if(v3_1 != v8) {
            TextViewCompat.setLastBaselineToBottomHeight(v0.mView, v3_1);
        }

        if(v4_2 != v8) {
            TextViewCompat.setLineHeight(v0.mView, v4_2);
        }
    }

    void onAsyncTypefaceReceived(WeakReference arg2, Typeface arg3) {
        if(this.mAsyncFontPending) {
            this.mFontTypeface = arg3;
            Object v2 = arg2.get();
            if(v2 != null) {
                ((TextView)v2).setTypeface(arg3, this.mStyle);
            }
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) void onLayout(boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if(!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE) {
            this.autoSizeText();
        }
    }

    void onSetTextAppearance(Context arg4, int arg5) {
        TintTypedArray v5 = TintTypedArray.obtainStyledAttributes(arg4, arg5, R$styleable.TextAppearance);
        if(v5.hasValue(R$styleable.TextAppearance_textAllCaps)) {
            this.setAllCaps(v5.getBoolean(R$styleable.TextAppearance_textAllCaps, false));
        }

        if(Build$VERSION.SDK_INT < 23 && (v5.hasValue(R$styleable.TextAppearance_android_textColor))) {
            ColorStateList v0 = v5.getColorStateList(R$styleable.TextAppearance_android_textColor);
            if(v0 != null) {
                this.mView.setTextColor(v0);
            }
        }

        if((v5.hasValue(R$styleable.TextAppearance_android_textSize)) && v5.getDimensionPixelSize(R$styleable.TextAppearance_android_textSize, -1) == 0) {
            this.mView.setTextSize(0, 0f);
        }

        this.updateTypefaceAndStyle(arg4, v5);
        v5.recycle();
        if(this.mFontTypeface != null) {
            this.mView.setTypeface(this.mFontTypeface, this.mStyle);
        }
    }

    void setAllCaps(boolean arg2) {
        this.mView.setAllCaps(arg2);
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int arg2, int arg3, int arg4, int arg5) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithConfiguration(arg2, arg3, arg4, arg5);
    }

    void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] arg2, int arg3) throws IllegalArgumentException {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeUniformWithPresetSizes(arg2, arg3);
    }

    void setAutoSizeTextTypeWithDefaults(int arg2) {
        this.mAutoSizeTextHelper.setAutoSizeTextTypeWithDefaults(arg2);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) void setTextSize(int arg2, float arg3) {
        if(!AutoSizeableTextView.PLATFORM_SUPPORTS_AUTOSIZE && !this.isAutoSizeEnabled()) {
            this.setTextSizeInternal(arg2, arg3);
        }
    }

    private void setTextSizeInternal(int arg2, float arg3) {
        this.mAutoSizeTextHelper.setTextSizeInternal(arg2, arg3);
    }

    private void updateTypefaceAndStyle(Context arg5, TintTypedArray arg6) {
        this.mStyle = arg6.getInt(R$styleable.TextAppearance_android_textStyle, this.mStyle);
        boolean v1 = true;
        if(!arg6.hasValue(R$styleable.TextAppearance_android_fontFamily)) {
            if(arg6.hasValue(R$styleable.TextAppearance_fontFamily)) {
            }
            else {
                if(arg6.hasValue(R$styleable.TextAppearance_android_typeface)) {
                    this.mAsyncFontPending = false;
                    switch(arg6.getInt(R$styleable.TextAppearance_android_typeface, 1)) {
                        case 1: {
                            goto label_27;
                        }
                        case 2: {
                            goto label_24;
                        }
                        case 3: {
                            goto label_21;
                        }
                    }

                    return;
                label_21:
                    this.mFontTypeface = Typeface.MONOSPACE;
                    return;
                label_24:
                    this.mFontTypeface = Typeface.SERIF;
                    return;
                label_27:
                    this.mFontTypeface = Typeface.SANS_SERIF;
                }

                return;
            }
        }

        this.mFontTypeface = null;
        int v0 = arg6.hasValue(R$styleable.TextAppearance_fontFamily) ? R$styleable.TextAppearance_fontFamily : R$styleable.TextAppearance_android_fontFamily;
        if(!arg5.isRestricted()) {
            androidx.appcompat.widget.AppCompatTextHelper$1 v3 = new FontCallback(new WeakReference(this.mView)) {
                public void onFontRetrievalFailed(int arg1) {
                }

                public void onFontRetrieved(@NonNull Typeface arg3) {
                    AppCompatTextHelper.this.onAsyncTypefaceReceived(this.val$textViewWeak, arg3);
                }
            };
            try {
                this.mFontTypeface = arg6.getFont(v0, this.mStyle, ((FontCallback)v3));
                if(this.mFontTypeface == null) {
                }
                else {
                    goto label_51;
                }

            label_52:
                this.mAsyncFontPending = v1;
                goto label_54;
            label_51:
                v1 = false;
                goto label_52;
            }
            catch(Resources$NotFoundException ) {
            label_54:
                if(this.mFontTypeface == null) {
                    String v5 = arg6.getString(v0);
                    if(v5 != null) {
                        this.mFontTypeface = Typeface.create(v5, this.mStyle);
                    }
                }

                return;
            }
        }

        goto label_54;
    }
}

