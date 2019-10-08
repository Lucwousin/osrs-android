package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources$NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.annotation.FontRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import androidx.core.content.res.ResourcesCompat;
import com.google.android.material.R$styleable;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class TextAppearance {
    private static final String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    @Nullable private Typeface font;
    @Nullable public final String fontFamily;
    @FontRes private final int fontFamilyResourceId;
    private boolean fontResolved;
    @Nullable public final ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    @Nullable public final ColorStateList textColor;
    @Nullable public final ColorStateList textColorHint;
    @Nullable public final ColorStateList textColorLink;
    public final float textSize;
    public final int textStyle;
    public final int typeface;

    public TextAppearance(Context arg5, @StyleRes int arg6) {
        super();
        this.fontResolved = false;
        TypedArray v6 = arg5.obtainStyledAttributes(arg6, R$styleable.TextAppearance);
        this.textSize = v6.getDimension(R$styleable.TextAppearance_android_textSize, 0f);
        this.textColor = MaterialResources.getColorStateList(arg5, v6, R$styleable.TextAppearance_android_textColor);
        this.textColorHint = MaterialResources.getColorStateList(arg5, v6, R$styleable.TextAppearance_android_textColorHint);
        this.textColorLink = MaterialResources.getColorStateList(arg5, v6, R$styleable.TextAppearance_android_textColorLink);
        this.textStyle = v6.getInt(R$styleable.TextAppearance_android_textStyle, 0);
        this.typeface = v6.getInt(R$styleable.TextAppearance_android_typeface, 1);
        int v1 = MaterialResources.getIndexWithValue(v6, R$styleable.TextAppearance_fontFamily, R$styleable.TextAppearance_android_fontFamily);
        this.fontFamilyResourceId = v6.getResourceId(v1, 0);
        this.fontFamily = v6.getString(v1);
        this.textAllCaps = v6.getBoolean(R$styleable.TextAppearance_textAllCaps, false);
        this.shadowColor = MaterialResources.getColorStateList(arg5, v6, R$styleable.TextAppearance_android_shadowColor);
        this.shadowDx = v6.getFloat(R$styleable.TextAppearance_android_shadowDx, 0f);
        this.shadowDy = v6.getFloat(R$styleable.TextAppearance_android_shadowDy, 0f);
        this.shadowRadius = v6.getFloat(R$styleable.TextAppearance_android_shadowRadius, 0f);
        v6.recycle();
    }

    static Typeface access$002(TextAppearance arg0, Typeface arg1) {
        arg0.font = arg1;
        return arg1;
    }

    static boolean access$102(TextAppearance arg0, boolean arg1) {
        arg0.fontResolved = arg1;
        return arg1;
    }

    static void access$200(TextAppearance arg0) {
        arg0.createFallbackTypeface();
    }

    private void createFallbackTypeface() {
        if(this.font == null) {
            this.font = Typeface.create(this.fontFamily, this.textStyle);
        }

        if(this.font == null) {
            switch(this.typeface) {
                case 1: {
                    this.font = Typeface.SANS_SERIF;
                    break;
                }
                case 2: {
                    this.font = Typeface.SERIF;
                    break;
                }
                case 3: {
                    this.font = Typeface.MONOSPACE;
                    break;
                }
                default: {
                    this.font = Typeface.DEFAULT;
                    break;
                }
            }

            if(this.font != null) {
                this.font = Typeface.create(this.font, this.textStyle);
            }
        }
    }

    @NonNull @VisibleForTesting public Typeface getFont(Context arg4) {
        if(this.fontResolved) {
            return this.font;
        }

        if(arg4.isRestricted()) {
            goto label_26;
        }

        try {
            this.font = ResourcesCompat.getFont(arg4, this.fontFamilyResourceId);
            if(this.font == null) {
                goto label_26;
            }

            this.font = Typeface.create(this.font, this.textStyle);
            goto label_26;
        }
        catch(Resources$NotFoundException ) {
        label_26:
            this.createFallbackTypeface();
            this.fontResolved = true;
            return this.font;
        }
        catch(Exception v4) {
            Log.d("TextAppearance", "Error loading font " + this.fontFamily, ((Throwable)v4));
            goto label_26;
        }
    }

    public void getFontAsync(Context arg3, TextPaint arg4, @NonNull FontCallback arg5) {
        if(this.fontResolved) {
            this.updateTextPaintMeasureState(arg4, this.font);
            return;
        }

        this.createFallbackTypeface();
        if(arg3.isRestricted()) {
            this.fontResolved = true;
            this.updateTextPaintMeasureState(arg4, this.font);
            return;
        }

        try {
            ResourcesCompat.getFont(arg3, this.fontFamilyResourceId, new FontCallback(arg4, arg5) {
                public void onFontRetrievalFailed(int arg3) {
                    TextAppearance.this.createFallbackTypeface();
                    TextAppearance.this.fontResolved = true;
                    this.val$callback.onFontRetrievalFailed(arg3);
                }

                public void onFontRetrieved(@NonNull Typeface arg3) {
                    TextAppearance.this.font = Typeface.create(arg3, TextAppearance.this.textStyle);
                    TextAppearance.this.updateTextPaintMeasureState(this.val$textPaint, arg3);
                    TextAppearance.this.fontResolved = true;
                    this.val$callback.onFontRetrieved(arg3);
                }
            }, null);
            return;
        }
        catch(Resources$NotFoundException ) {
            return;
        }
        catch(Exception v3) {
            Log.d("TextAppearance", "Error loading font " + this.fontFamily, ((Throwable)v3));
            return;
        }
    }

    public void updateDrawState(Context arg5, TextPaint arg6, FontCallback arg7) {
        this.updateMeasureState(arg5, arg6, arg7);
        int v5 = this.textColor != null ? this.textColor.getColorForState(arg6.drawableState, this.textColor.getDefaultColor()) : 0xFF000000;
        arg6.setColor(v5);
        float v5_1 = this.shadowRadius;
        float v7 = this.shadowDx;
        float v0 = this.shadowDy;
        int v1 = this.shadowColor != null ? this.shadowColor.getColorForState(arg6.drawableState, this.shadowColor.getDefaultColor()) : 0;
        arg6.setShadowLayer(v5_1, v7, v0, v1);
    }

    public void updateMeasureState(Context arg2, TextPaint arg3, @Nullable FontCallback arg4) {
        if(TextAppearanceConfig.shouldLoadFontSynchronously()) {
            this.updateTextPaintMeasureState(arg3, this.getFont(arg2));
        }
        else {
            this.getFontAsync(arg2, arg3, arg4);
            if(!this.fontResolved) {
                this.updateTextPaintMeasureState(arg3, this.font);
            }
        }
    }

    public void updateTextPaintMeasureState(@NonNull TextPaint arg2, @NonNull Typeface arg3) {
        arg2.setTypeface(arg3);
        int v3 = ~arg3.getStyle() & this.textStyle;
        boolean v0 = (v3 & 1) != 0 ? true : false;
        arg2.setFakeBoldText(v0);
        float v3_1 = (v3 & 2) != 0 ? -0.25f : 0f;
        arg2.setTextSkewX(v3_1);
        arg2.setTextSize(this.textSize);
    }
}

