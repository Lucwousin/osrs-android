package com.google.android.material.chip;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources$NotFoundException;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint$Align;
import android.graphics.Paint$FontMetrics;
import android.graphics.Paint$Style;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff$Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.annotation.AnimatorRes;
import androidx.annotation.AttrRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.text.BidiFormatter;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.canvas.CanvasCompat;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ChipDrawable extends Drawable implements Drawable$Callback, TintAwareDrawable {
    class com.google.android.material.chip.ChipDrawable$1 extends FontCallback {
        com.google.android.material.chip.ChipDrawable$1(ChipDrawable arg1) {
            ChipDrawable.this = arg1;
            super();
        }

        public void onFontRetrievalFailed(int arg1) {
        }

        public void onFontRetrieved(@NonNull Typeface arg2) {
            ChipDrawable.this.textWidthDirty = true;
            ChipDrawable.this.onSizeChange();
            ChipDrawable.this.invalidateSelf();
        }
    }

    public interface Delegate {
        void onChipDrawableSizeChange();
    }

    private static final boolean DEBUG = false;
    private static final int[] DEFAULT_STATE = null;
    private static final String NAMESPACE_APP = "http://schemas.android.com/apk/res-auto";
    private int alpha;
    private boolean checkable;
    @Nullable private Drawable checkedIcon;
    private boolean checkedIconVisible;
    @Nullable private ColorStateList chipBackgroundColor;
    private float chipCornerRadius;
    private float chipEndPadding;
    @Nullable private Drawable chipIcon;
    private float chipIconSize;
    @Nullable private ColorStateList chipIconTint;
    private boolean chipIconVisible;
    private float chipMinHeight;
    private final Paint chipPaint;
    private float chipStartPadding;
    @Nullable private ColorStateList chipStrokeColor;
    private float chipStrokeWidth;
    @Nullable private Drawable closeIcon;
    @Nullable private CharSequence closeIconContentDescription;
    private float closeIconEndPadding;
    private float closeIconSize;
    private float closeIconStartPadding;
    private int[] closeIconStateSet;
    @Nullable private ColorStateList closeIconTint;
    private boolean closeIconVisible;
    @Nullable private ColorFilter colorFilter;
    @Nullable private ColorStateList compatRippleColor;
    private final Context context;
    private boolean currentChecked;
    @ColorInt private int currentChipBackgroundColor;
    @ColorInt private int currentChipStrokeColor;
    @ColorInt private int currentCompatRippleColor;
    @ColorInt private int currentTextColor;
    @ColorInt private int currentTint;
    @Nullable private final Paint debugPaint;
    private WeakReference delegate;
    private final FontCallback fontCallback;
    private final Paint$FontMetrics fontMetrics;
    @Nullable private MotionSpec hideMotionSpec;
    private float iconEndPadding;
    private float iconStartPadding;
    private int maxWidth;
    private final PointF pointF;
    @Nullable private CharSequence rawText;
    private final RectF rectF;
    @Nullable private ColorStateList rippleColor;
    private boolean shouldDrawText;
    @Nullable private MotionSpec showMotionSpec;
    @Nullable private TextAppearance textAppearance;
    private float textEndPadding;
    private final TextPaint textPaint;
    private float textStartPadding;
    private float textWidth;
    private boolean textWidthDirty;
    @Nullable private ColorStateList tint;
    @Nullable private PorterDuffColorFilter tintFilter;
    @Nullable private PorterDuff$Mode tintMode;
    private TextUtils$TruncateAt truncateAt;
    @Nullable private CharSequence unicodeWrappedText;
    private boolean useCompatRipple;

    static {
        ChipDrawable.DEFAULT_STATE = new int[]{0x101009E};
    }

    private ChipDrawable(Context arg4) {
        super();
        this.fontCallback = new com.google.android.material.chip.ChipDrawable$1(this);
        this.textPaint = new TextPaint(1);
        this.chipPaint = new Paint(1);
        this.fontMetrics = new Paint$FontMetrics();
        this.rectF = new RectF();
        this.pointF = new PointF();
        this.alpha = 0xFF;
        this.tintMode = PorterDuff$Mode.SRC_IN;
        this.delegate = new WeakReference(null);
        this.textWidthDirty = true;
        this.context = arg4;
        this.rawText = "";
        this.textPaint.density = arg4.getResources().getDisplayMetrics().density;
        this.debugPaint = null;
        if(this.debugPaint != null) {
            this.debugPaint.setStyle(Paint$Style.STROKE);
        }

        this.setState(ChipDrawable.DEFAULT_STATE);
        this.setCloseIconState(ChipDrawable.DEFAULT_STATE);
        this.shouldDrawText = true;
    }

    static boolean access$002(ChipDrawable arg0, boolean arg1) {
        arg0.textWidthDirty = arg1;
        return arg1;
    }

    private void applyChildDrawable(@Nullable Drawable arg3) {
        if(arg3 != null) {
            arg3.setCallback(((Drawable$Callback)this));
            DrawableCompat.setLayoutDirection(arg3, DrawableCompat.getLayoutDirection(((Drawable)this)));
            arg3.setLevel(this.getLevel());
            arg3.setVisible(this.isVisible(), false);
            if(arg3 == this.closeIcon) {
                if(arg3.isStateful()) {
                    arg3.setState(this.getCloseIconState());
                }

                DrawableCompat.setTintList(arg3, this.closeIconTint);
            }
            else {
                if(!arg3.isStateful()) {
                    return;
                }

                arg3.setState(this.getState());
            }
        }
    }

    private void calculateChipIconBounds(Rect arg3, RectF arg4) {
        arg4.setEmpty();
        if((this.showsChipIcon()) || (this.showsCheckedIcon())) {
            float v0 = this.chipStartPadding + this.iconStartPadding;
            if(DrawableCompat.getLayoutDirection(((Drawable)this)) == 0) {
                arg4.left = (((float)arg3.left)) + v0;
                arg4.right = arg4.left + this.chipIconSize;
            }
            else {
                arg4.right = (((float)arg3.right)) - v0;
                arg4.left = arg4.right - this.chipIconSize;
            }

            arg4.top = arg3.exactCenterY() - this.chipIconSize / 2f;
            arg4.bottom = arg4.top + this.chipIconSize;
        }
    }

    float calculateChipIconWidth() {
        if(!this.showsChipIcon()) {
            if(this.showsCheckedIcon()) {
            }
            else {
                return 0;
            }
        }

        return this.iconStartPadding + this.chipIconSize + this.iconEndPadding;
    }

    private void calculateChipTouchBounds(Rect arg3, RectF arg4) {
        arg4.set(arg3);
        if(this.showsCloseIcon()) {
            float v0 = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if(DrawableCompat.getLayoutDirection(((Drawable)this)) == 0) {
                arg4.right = (((float)arg3.right)) - v0;
            }
            else {
                arg4.left = (((float)arg3.left)) + v0;
            }
        }
    }

    private void calculateCloseIconBounds(Rect arg3, RectF arg4) {
        arg4.setEmpty();
        if(this.showsCloseIcon()) {
            float v0 = this.chipEndPadding + this.closeIconEndPadding;
            if(DrawableCompat.getLayoutDirection(((Drawable)this)) == 0) {
                arg4.right = (((float)arg3.right)) - v0;
                arg4.left = arg4.right - this.closeIconSize;
            }
            else {
                arg4.left = (((float)arg3.left)) + v0;
                arg4.right = arg4.left + this.closeIconSize;
            }

            arg4.top = arg3.exactCenterY() - this.closeIconSize / 2f;
            arg4.bottom = arg4.top + this.closeIconSize;
        }
    }

    private void calculateCloseIconTouchBounds(Rect arg3, RectF arg4) {
        arg4.setEmpty();
        if(this.showsCloseIcon()) {
            float v0 = this.chipEndPadding + this.closeIconEndPadding + this.closeIconSize + this.closeIconStartPadding + this.textEndPadding;
            if(DrawableCompat.getLayoutDirection(((Drawable)this)) == 0) {
                arg4.right = ((float)arg3.right);
                arg4.left = arg4.right - v0;
            }
            else {
                arg4.left = ((float)arg3.left);
                arg4.right = (((float)arg3.left)) + v0;
            }

            arg4.top = ((float)arg3.top);
            arg4.bottom = ((float)arg3.bottom);
        }
    }

    private float calculateCloseIconWidth() {
        if(this.showsCloseIcon()) {
            return this.closeIconStartPadding + this.closeIconSize + this.closeIconEndPadding;
        }

        return 0;
    }

    private void calculateTextBounds(Rect arg4, RectF arg5) {
        arg5.setEmpty();
        if(this.unicodeWrappedText != null) {
            float v0 = this.chipStartPadding + this.calculateChipIconWidth() + this.textStartPadding;
            float v1 = this.chipEndPadding + this.calculateCloseIconWidth() + this.textEndPadding;
            if(DrawableCompat.getLayoutDirection(((Drawable)this)) == 0) {
                arg5.left = (((float)arg4.left)) + v0;
                arg5.right = (((float)arg4.right)) - v1;
            }
            else {
                arg5.left = (((float)arg4.left)) + v1;
                arg5.right = (((float)arg4.right)) - v0;
            }

            arg5.top = ((float)arg4.top);
            arg5.bottom = ((float)arg4.bottom);
        }
    }

    private float calculateTextCenterFromBaseline() {
        this.textPaint.getFontMetrics(this.fontMetrics);
        return (this.fontMetrics.descent + this.fontMetrics.ascent) / 2f;
    }

    Paint$Align calculateTextOriginAndAlignment(Rect arg3, PointF arg4) {
        arg4.set(0f, 0f);
        Paint$Align v0 = Paint$Align.LEFT;
        if(this.unicodeWrappedText != null) {
            float v0_1 = this.chipStartPadding + this.calculateChipIconWidth() + this.textStartPadding;
            if(DrawableCompat.getLayoutDirection(((Drawable)this)) == 0) {
                arg4.x = (((float)arg3.left)) + v0_1;
                v0 = Paint$Align.LEFT;
            }
            else {
                arg4.x = (((float)arg3.right)) - v0_1;
                v0 = Paint$Align.RIGHT;
            }

            arg4.y = (((float)arg3.centerY())) - this.calculateTextCenterFromBaseline();
        }

        return v0;
    }

    private float calculateTextWidth(@Nullable CharSequence arg4) {
        if(arg4 == null) {
            return 0;
        }

        return this.textPaint.measureText(arg4, 0, arg4.length());
    }

    private boolean canShowCheckedIcon() {
        boolean v0 = !this.checkedIconVisible || this.checkedIcon == null || !this.checkable ? false : true;
        return v0;
    }

    public static ChipDrawable createFromAttributes(Context arg1, AttributeSet arg2, @AttrRes int arg3, @StyleRes int arg4) {
        ChipDrawable v0 = new ChipDrawable(arg1);
        v0.loadFromAttributes(arg2, arg3, arg4);
        return v0;
    }

    public static ChipDrawable createFromResource(Context arg4, @XmlRes int arg5) {
        int v1;
        try {
            XmlResourceParser v0 = arg4.getResources().getXml(arg5);
            do {
                v1 = ((XmlPullParser)v0).next();
                int v2 = 2;
                if(v1 == v2) {
                    break;
                }
            }
            while(v1 != 1);

            if(v1 == v2) {
                if(TextUtils.equals(((XmlPullParser)v0).getName(), "chip")) {
                    AttributeSet v0_1 = Xml.asAttributeSet(((XmlPullParser)v0));
                    v1 = v0_1.getStyleAttribute();
                    if(v1 == 0) {
                        v1 = R$style.Widget_MaterialComponents_Chip_Entry;
                    }

                    return ChipDrawable.createFromAttributes(arg4, v0_1, R$attr.chipStandaloneStyle, v1);
                }

                throw new XmlPullParserException("Must have a <chip> start tag");
            }

            throw new XmlPullParserException("No start tag found");
        }
        catch(IOException v4) {
            StringBuilder v1_1 = new StringBuilder();
            v1_1.append("Can\'t load chip resource ID #0x");
            v1_1.append(Integer.toHexString(arg5));
            Resources$NotFoundException v0_2 = new Resources$NotFoundException(v1_1.toString());
            v0_2.initCause(((Throwable)v4));
            throw v0_2;
        }
    }

    public void draw(@NonNull Canvas arg11) {
        Rect v0 = this.getBounds();
        if(!v0.isEmpty()) {
            if(this.getAlpha() == 0) {
            }
            else {
                int v1 = 0;
                int v3 = 0xFF;
                if(this.alpha < v3) {
                    v1 = CanvasCompat.saveLayerAlpha(arg11, ((float)v0.left), ((float)v0.top), ((float)v0.right), ((float)v0.bottom), this.alpha);
                }

                this.drawChipBackground(arg11, v0);
                this.drawChipStroke(arg11, v0);
                this.drawCompatRipple(arg11, v0);
                this.drawChipIcon(arg11, v0);
                this.drawCheckedIcon(arg11, v0);
                if(this.shouldDrawText) {
                    this.drawText(arg11, v0);
                }

                this.drawCloseIcon(arg11, v0);
                this.drawDebug(arg11, v0);
                if(this.alpha < v3) {
                    arg11.restoreToCount(v1);
                }

                return;
            }
        }
    }

    private void drawCheckedIcon(@NonNull Canvas arg6, Rect arg7) {
        if(this.showsCheckedIcon()) {
            this.calculateChipIconBounds(arg7, this.rectF);
            float v7 = this.rectF.left;
            float v0 = this.rectF.top;
            arg6.translate(v7, v0);
            this.checkedIcon.setBounds(0, 0, ((int)this.rectF.width()), ((int)this.rectF.height()));
            this.checkedIcon.draw(arg6);
            arg6.translate(-v7, -v0);
        }
    }

    private void drawChipBackground(@NonNull Canvas arg4, Rect arg5) {
        this.chipPaint.setColor(this.currentChipBackgroundColor);
        this.chipPaint.setStyle(Paint$Style.FILL);
        this.chipPaint.setColorFilter(this.getTintColorFilter());
        this.rectF.set(arg5);
        arg4.drawRoundRect(this.rectF, this.chipCornerRadius, this.chipCornerRadius, this.chipPaint);
    }

    private void drawChipIcon(@NonNull Canvas arg6, Rect arg7) {
        if(this.showsChipIcon()) {
            this.calculateChipIconBounds(arg7, this.rectF);
            float v7 = this.rectF.left;
            float v0 = this.rectF.top;
            arg6.translate(v7, v0);
            this.chipIcon.setBounds(0, 0, ((int)this.rectF.width()), ((int)this.rectF.height()));
            this.chipIcon.draw(arg6);
            arg6.translate(-v7, -v0);
        }
    }

    private void drawChipStroke(@NonNull Canvas arg7, Rect arg8) {
        if(this.chipStrokeWidth > 0f) {
            this.chipPaint.setColor(this.currentChipStrokeColor);
            this.chipPaint.setStyle(Paint$Style.STROKE);
            this.chipPaint.setColorFilter(this.getTintColorFilter());
            this.rectF.set((((float)arg8.left)) + this.chipStrokeWidth / 2f, (((float)arg8.top)) + this.chipStrokeWidth / 2f, (((float)arg8.right)) - this.chipStrokeWidth / 2f, (((float)arg8.bottom)) - this.chipStrokeWidth / 2f);
            float v8 = this.chipCornerRadius - this.chipStrokeWidth / 2f;
            arg7.drawRoundRect(this.rectF, v8, v8, this.chipPaint);
        }
    }

    private void drawCloseIcon(@NonNull Canvas arg6, Rect arg7) {
        if(this.showsCloseIcon()) {
            this.calculateCloseIconBounds(arg7, this.rectF);
            float v7 = this.rectF.left;
            float v0 = this.rectF.top;
            arg6.translate(v7, v0);
            this.closeIcon.setBounds(0, 0, ((int)this.rectF.width()), ((int)this.rectF.height()));
            this.closeIcon.draw(arg6);
            arg6.translate(-v7, -v0);
        }
    }

    private void drawCompatRipple(@NonNull Canvas arg4, Rect arg5) {
        this.chipPaint.setColor(this.currentCompatRippleColor);
        this.chipPaint.setStyle(Paint$Style.FILL);
        this.rectF.set(arg5);
        arg4.drawRoundRect(this.rectF, this.chipCornerRadius, this.chipCornerRadius, this.chipPaint);
    }

    private void drawDebug(@NonNull Canvas arg10, Rect arg11) {
        if(this.debugPaint != null) {
            int v2 = 0x7F;
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(0xFF000000, v2));
            arg10.drawRect(arg11, this.debugPaint);
            if((this.showsChipIcon()) || (this.showsCheckedIcon())) {
                this.calculateChipIconBounds(arg11, this.rectF);
                arg10.drawRect(this.rectF, this.debugPaint);
            }

            if(this.unicodeWrappedText != null) {
                arg10.drawLine(((float)arg11.left), arg11.exactCenterY(), ((float)arg11.right), arg11.exactCenterY(), this.debugPaint);
            }

            if(this.showsCloseIcon()) {
                this.calculateCloseIconBounds(arg11, this.rectF);
                arg10.drawRect(this.rectF, this.debugPaint);
            }

            this.debugPaint.setColor(ColorUtils.setAlphaComponent(0xFFFF0000, v2));
            this.calculateChipTouchBounds(arg11, this.rectF);
            arg10.drawRect(this.rectF, this.debugPaint);
            this.debugPaint.setColor(ColorUtils.setAlphaComponent(0xFF00FF00, v2));
            this.calculateCloseIconTouchBounds(arg11, this.rectF);
            arg10.drawRect(this.rectF, this.debugPaint);
        }
    }

    private void drawText(@NonNull Canvas arg10, Rect arg11) {
        if(this.unicodeWrappedText != null) {
            Paint$Align v0 = this.calculateTextOriginAndAlignment(arg11, this.pointF);
            this.calculateTextBounds(arg11, this.rectF);
            if(this.textAppearance != null) {
                this.textPaint.drawableState = this.getState();
                this.textAppearance.updateDrawState(this.context, this.textPaint, this.fontCallback);
            }

            this.textPaint.setTextAlign(v0);
            int v1 = 0;
            int v11 = Math.round(this.getTextWidth()) > Math.round(this.rectF.width()) ? 1 : 0;
            if(v11 != 0) {
                v1 = arg10.save();
                arg10.clipRect(this.rectF);
            }

            CharSequence v0_1 = this.unicodeWrappedText;
            if(v11 != 0 && this.truncateAt != null) {
                v0_1 = TextUtils.ellipsize(this.unicodeWrappedText, this.textPaint, this.rectF.width(), this.truncateAt);
            }

            arg10.drawText(v0_1, 0, v0_1.length(), this.pointF.x, this.pointF.y, this.textPaint);
            if(v11 == 0) {
                return;
            }

            arg10.restoreToCount(v1);
        }
    }

    public int getAlpha() {
        return this.alpha;
    }

    @Nullable public Drawable getCheckedIcon() {
        return this.checkedIcon;
    }

    @Nullable public ColorStateList getChipBackgroundColor() {
        return this.chipBackgroundColor;
    }

    public float getChipCornerRadius() {
        return this.chipCornerRadius;
    }

    public float getChipEndPadding() {
        return this.chipEndPadding;
    }

    @Nullable public Drawable getChipIcon() {
        Drawable v0 = this.chipIcon != null ? DrawableCompat.unwrap(this.chipIcon) : null;
        return v0;
    }

    public float getChipIconSize() {
        return this.chipIconSize;
    }

    @Nullable public ColorStateList getChipIconTint() {
        return this.chipIconTint;
    }

    public float getChipMinHeight() {
        return this.chipMinHeight;
    }

    public float getChipStartPadding() {
        return this.chipStartPadding;
    }

    @Nullable public ColorStateList getChipStrokeColor() {
        return this.chipStrokeColor;
    }

    public float getChipStrokeWidth() {
        return this.chipStrokeWidth;
    }

    public void getChipTouchBounds(RectF arg2) {
        this.calculateChipTouchBounds(this.getBounds(), arg2);
    }

    @Nullable public Drawable getCloseIcon() {
        Drawable v0 = this.closeIcon != null ? DrawableCompat.unwrap(this.closeIcon) : null;
        return v0;
    }

    @Nullable public CharSequence getCloseIconContentDescription() {
        return this.closeIconContentDescription;
    }

    public float getCloseIconEndPadding() {
        return this.closeIconEndPadding;
    }

    public float getCloseIconSize() {
        return this.closeIconSize;
    }

    public float getCloseIconStartPadding() {
        return this.closeIconStartPadding;
    }

    @NonNull public int[] getCloseIconState() {
        return this.closeIconStateSet;
    }

    @Nullable public ColorStateList getCloseIconTint() {
        return this.closeIconTint;
    }

    public void getCloseIconTouchBounds(RectF arg2) {
        this.calculateCloseIconTouchBounds(this.getBounds(), arg2);
    }

    @Nullable public ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public TextUtils$TruncateAt getEllipsize() {
        return this.truncateAt;
    }

    @Nullable public MotionSpec getHideMotionSpec() {
        return this.hideMotionSpec;
    }

    public float getIconEndPadding() {
        return this.iconEndPadding;
    }

    public float getIconStartPadding() {
        return this.iconStartPadding;
    }

    public int getIntrinsicHeight() {
        return ((int)this.chipMinHeight);
    }

    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.chipStartPadding + this.calculateChipIconWidth() + this.textStartPadding + this.getTextWidth() + this.textEndPadding + this.calculateCloseIconWidth() + this.chipEndPadding), this.maxWidth);
    }

    @Px public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getOpacity() {
        return -3;
    }

    @TargetApi(value=21) public void getOutline(@NonNull Outline arg9) {
        Rect v0 = this.getBounds();
        if(!v0.isEmpty()) {
            arg9.setRoundRect(v0, this.chipCornerRadius);
        }
        else {
            arg9.setRoundRect(0, 0, this.getIntrinsicWidth(), this.getIntrinsicHeight(), this.chipCornerRadius);
        }

        arg9.setAlpha((((float)this.getAlpha())) / 255f);
    }

    @Nullable public ColorStateList getRippleColor() {
        return this.rippleColor;
    }

    @Nullable public MotionSpec getShowMotionSpec() {
        return this.showMotionSpec;
    }

    @NonNull public CharSequence getText() {
        return this.rawText;
    }

    @Nullable public TextAppearance getTextAppearance() {
        return this.textAppearance;
    }

    public float getTextEndPadding() {
        return this.textEndPadding;
    }

    public float getTextStartPadding() {
        return this.textStartPadding;
    }

    private float getTextWidth() {
        if(!this.textWidthDirty) {
            return this.textWidth;
        }

        this.textWidth = this.calculateTextWidth(this.unicodeWrappedText);
        this.textWidthDirty = false;
        return this.textWidth;
    }

    @Nullable private ColorFilter getTintColorFilter() {
        PorterDuffColorFilter v0_1;
        if(this.colorFilter != null) {
            ColorFilter v0 = this.colorFilter;
        }
        else {
            v0_1 = this.tintFilter;
        }

        return ((ColorFilter)v0_1);
    }

    public boolean getUseCompatRipple() {
        return this.useCompatRipple;
    }

    private static boolean hasState(@Nullable int[] arg4, @AttrRes int arg5) {
        if(arg4 == null) {
            return 0;
        }

        int v1 = arg4.length;
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            if(arg4[v2] == arg5) {
                return 1;
            }
        }

        return 0;
    }

    public void invalidateDrawable(@NonNull Drawable arg1) {
        Drawable$Callback v1 = this.getCallback();
        if(v1 != null) {
            v1.invalidateDrawable(((Drawable)this));
        }
    }

    public boolean isCheckable() {
        return this.checkable;
    }

    @Deprecated public boolean isCheckedIconEnabled() {
        return this.isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        return this.checkedIconVisible;
    }

    @Deprecated public boolean isChipIconEnabled() {
        return this.isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        return this.chipIconVisible;
    }

    @Deprecated public boolean isCloseIconEnabled() {
        return this.isCloseIconVisible();
    }

    public boolean isCloseIconStateful() {
        return ChipDrawable.isStateful(this.closeIcon);
    }

    public boolean isCloseIconVisible() {
        return this.closeIconVisible;
    }

    private static boolean isStateful(@Nullable ColorStateList arg0) {
        boolean v0 = arg0 == null || !arg0.isStateful() ? false : true;
        return v0;
    }

    private static boolean isStateful(@Nullable Drawable arg0) {
        boolean v0 = arg0 == null || !arg0.isStateful() ? false : true;
        return v0;
    }

    private static boolean isStateful(@Nullable TextAppearance arg1) {
        boolean v1 = arg1 == null || arg1.textColor == null || !arg1.textColor.isStateful() ? false : true;
        return v1;
    }

    public boolean isStateful() {
        boolean v0;
        if((ChipDrawable.isStateful(this.chipBackgroundColor)) || (ChipDrawable.isStateful(this.chipStrokeColor))) {
        label_28:
            v0 = true;
        }
        else {
            if((this.useCompatRipple) && (ChipDrawable.isStateful(this.compatRippleColor))) {
                goto label_28;
            }

            if(ChipDrawable.isStateful(this.textAppearance)) {
                goto label_28;
            }

            if(this.canShowCheckedIcon()) {
                goto label_28;
            }

            if(ChipDrawable.isStateful(this.chipIcon)) {
                goto label_28;
            }

            if(ChipDrawable.isStateful(this.checkedIcon)) {
                goto label_28;
            }

            if(ChipDrawable.isStateful(this.tint)) {
                goto label_28;
            }

            v0 = false;
        }

        return v0;
    }

    private void loadFromAttributes(AttributeSet arg8, @AttrRes int arg9, @StyleRes int arg10) {
        TypedArray v9 = ThemeEnforcement.obtainStyledAttributes(this.context, arg8, R$styleable.Chip, arg9, arg10, new int[0]);
        this.setChipBackgroundColor(MaterialResources.getColorStateList(this.context, v9, R$styleable.Chip_chipBackgroundColor));
        this.setChipMinHeight(v9.getDimension(R$styleable.Chip_chipMinHeight, 0f));
        this.setChipCornerRadius(v9.getDimension(R$styleable.Chip_chipCornerRadius, 0f));
        this.setChipStrokeColor(MaterialResources.getColorStateList(this.context, v9, R$styleable.Chip_chipStrokeColor));
        this.setChipStrokeWidth(v9.getDimension(R$styleable.Chip_chipStrokeWidth, 0f));
        this.setRippleColor(MaterialResources.getColorStateList(this.context, v9, R$styleable.Chip_rippleColor));
        this.setText(v9.getText(R$styleable.Chip_android_text));
        this.setTextAppearance(MaterialResources.getTextAppearance(this.context, v9, R$styleable.Chip_android_textAppearance));
        switch(v9.getInt(R$styleable.Chip_android_ellipsize, 0)) {
            case 1: {
                this.setEllipsize(TextUtils$TruncateAt.START);
                break;
            }
            case 2: {
                this.setEllipsize(TextUtils$TruncateAt.MIDDLE);
                break;
            }
            case 3: {
                this.setEllipsize(TextUtils$TruncateAt.END);
                break;
            }
            default: {
                break;
            }
        }

        this.setChipIconVisible(v9.getBoolean(R$styleable.Chip_chipIconVisible, false));
        if(arg8 != null && arg8.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && arg8.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            this.setChipIconVisible(v9.getBoolean(R$styleable.Chip_chipIconEnabled, false));
        }

        this.setChipIcon(MaterialResources.getDrawable(this.context, v9, R$styleable.Chip_chipIcon));
        this.setChipIconTint(MaterialResources.getColorStateList(this.context, v9, R$styleable.Chip_chipIconTint));
        this.setChipIconSize(v9.getDimension(R$styleable.Chip_chipIconSize, 0f));
        this.setCloseIconVisible(v9.getBoolean(R$styleable.Chip_closeIconVisible, false));
        if(arg8 != null && arg8.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && arg8.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            this.setCloseIconVisible(v9.getBoolean(R$styleable.Chip_closeIconEnabled, false));
        }

        this.setCloseIcon(MaterialResources.getDrawable(this.context, v9, R$styleable.Chip_closeIcon));
        this.setCloseIconTint(MaterialResources.getColorStateList(this.context, v9, R$styleable.Chip_closeIconTint));
        this.setCloseIconSize(v9.getDimension(R$styleable.Chip_closeIconSize, 0f));
        this.setCheckable(v9.getBoolean(R$styleable.Chip_android_checkable, false));
        this.setCheckedIconVisible(v9.getBoolean(R$styleable.Chip_checkedIconVisible, false));
        if(arg8 != null && arg8.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && arg8.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            this.setCheckedIconVisible(v9.getBoolean(R$styleable.Chip_checkedIconEnabled, false));
        }

        this.setCheckedIcon(MaterialResources.getDrawable(this.context, v9, R$styleable.Chip_checkedIcon));
        this.setShowMotionSpec(MotionSpec.createFromAttribute(this.context, v9, R$styleable.Chip_showMotionSpec));
        this.setHideMotionSpec(MotionSpec.createFromAttribute(this.context, v9, R$styleable.Chip_hideMotionSpec));
        this.setChipStartPadding(v9.getDimension(R$styleable.Chip_chipStartPadding, 0f));
        this.setIconStartPadding(v9.getDimension(R$styleable.Chip_iconStartPadding, 0f));
        this.setIconEndPadding(v9.getDimension(R$styleable.Chip_iconEndPadding, 0f));
        this.setTextStartPadding(v9.getDimension(R$styleable.Chip_textStartPadding, 0f));
        this.setTextEndPadding(v9.getDimension(R$styleable.Chip_textEndPadding, 0f));
        this.setCloseIconStartPadding(v9.getDimension(R$styleable.Chip_closeIconStartPadding, 0f));
        this.setCloseIconEndPadding(v9.getDimension(R$styleable.Chip_closeIconEndPadding, 0f));
        this.setChipEndPadding(v9.getDimension(R$styleable.Chip_chipEndPadding, 0f));
        this.setMaxWidth(v9.getDimensionPixelSize(R$styleable.Chip_android_maxWidth, 0x7FFFFFFF));
        v9.recycle();
    }

    @TargetApi(value=23) public boolean onLayoutDirectionChanged(int arg3) {
        int v0_1;
        boolean v0 = super.onLayoutDirectionChanged(arg3);
        if(this.showsChipIcon()) {
            v0_1 = (((int)v0)) | this.chipIcon.setLayoutDirection(arg3);
        }

        if(this.showsCheckedIcon()) {
            v0_1 = (((int)v0)) | this.checkedIcon.setLayoutDirection(arg3);
        }

        if(this.showsCloseIcon()) {
            v0_1 = (((int)v0)) | this.closeIcon.setLayoutDirection(arg3);
        }

        if(v0) {
            this.invalidateSelf();
        }

        return 1;
    }

    protected boolean onLevelChange(int arg3) {
        int v0_1;
        boolean v0 = super.onLevelChange(arg3);
        if(this.showsChipIcon()) {
            v0_1 = (((int)v0)) | this.chipIcon.setLevel(arg3);
        }

        if(this.showsCheckedIcon()) {
            v0_1 = (((int)v0)) | this.checkedIcon.setLevel(arg3);
        }

        if(this.showsCloseIcon()) {
            v0_1 = (((int)v0)) | this.closeIcon.setLevel(arg3);
        }

        if(v0) {
            this.invalidateSelf();
        }

        return v0;
    }

    protected void onSizeChange() {
        Object v0 = this.delegate.get();
        if(v0 != null) {
            ((Delegate)v0).onChipDrawableSizeChange();
        }
    }

    private boolean onStateChange(int[] arg6, int[] arg7) {
        int v0_1;
        boolean v0 = super.onStateChange(arg6);
        int v2 = 0;
        int v1 = this.chipBackgroundColor != null ? this.chipBackgroundColor.getColorForState(arg6, this.currentChipBackgroundColor) : 0;
        if(this.currentChipBackgroundColor != v1) {
            this.currentChipBackgroundColor = v1;
            v0_1 = 1;
        }

        v1 = this.chipStrokeColor != null ? this.chipStrokeColor.getColorForState(arg6, this.currentChipStrokeColor) : 0;
        if(this.currentChipStrokeColor != v1) {
            this.currentChipStrokeColor = v1;
            v0_1 = 1;
        }

        v1 = this.compatRippleColor != null ? this.compatRippleColor.getColorForState(arg6, this.currentCompatRippleColor) : 0;
        if(this.currentCompatRippleColor != v1) {
            this.currentCompatRippleColor = v1;
            if(this.useCompatRipple) {
                v0_1 = 1;
            }
        }

        v1 = this.textAppearance == null || this.textAppearance.textColor == null ? 0 : this.textAppearance.textColor.getColorForState(arg6, this.currentTextColor);
        if(this.currentTextColor != v1) {
            this.currentTextColor = v1;
            v0_1 = 1;
        }

        boolean v1_1 = !ChipDrawable.hasState(this.getState(), 0x10100A0) || !this.checkable ? false : true;
        if(this.currentChecked == v1_1 || this.checkedIcon == null) {
        label_74:
            v1 = 0;
        }
        else {
            float v0_2 = this.calculateChipIconWidth();
            this.currentChecked = v1_1;
            if(v0_2 != this.calculateChipIconWidth()) {
                v0_1 = 1;
                v1 = 1;
            }
            else {
                v0_1 = 1;
                goto label_74;
            }
        }

        if(this.tint != null) {
            v2 = this.tint.getColorForState(arg6, this.currentTint);
        }

        if(this.currentTint != v2) {
            this.currentTint = v2;
            this.tintFilter = DrawableUtils.updateTintFilter(((Drawable)this), this.tint, this.tintMode);
            v0_1 = 1;
        }

        if(ChipDrawable.isStateful(this.chipIcon)) {
            v0_1 |= this.chipIcon.setState(arg6);
        }

        if(ChipDrawable.isStateful(this.checkedIcon)) {
            v0_1 |= this.checkedIcon.setState(arg6);
        }

        if(ChipDrawable.isStateful(this.closeIcon)) {
            v0_1 |= this.closeIcon.setState(arg7);
        }

        if((((boolean)v0_1))) {
            this.invalidateSelf();
        }

        if(v1 != 0) {
            this.onSizeChange();
        }

        return ((boolean)v0_1);
    }

    protected boolean onStateChange(int[] arg2) {
        return this.onStateChange(arg2, this.getCloseIconState());
    }

    public void scheduleDrawable(@NonNull Drawable arg1, @NonNull Runnable arg2, long arg3) {
        Drawable$Callback v1 = this.getCallback();
        if(v1 != null) {
            v1.scheduleDrawable(((Drawable)this), arg2, arg3);
        }
    }

    public void setAlpha(int arg2) {
        if(this.alpha != arg2) {
            this.alpha = arg2;
            this.invalidateSelf();
        }
    }

    public void setCheckable(boolean arg2) {
        if(this.checkable != arg2) {
            this.checkable = arg2;
            float v0 = this.calculateChipIconWidth();
            if(!arg2 && (this.currentChecked)) {
                this.currentChecked = false;
            }

            float v2 = this.calculateChipIconWidth();
            this.invalidateSelf();
            if(v0 == v2) {
                return;
            }

            this.onSizeChange();
        }
    }

    public void setCheckableResource(@BoolRes int arg2) {
        this.setCheckable(this.context.getResources().getBoolean(arg2));
    }

    public void setCheckedIcon(@Nullable Drawable arg3) {
        if(this.checkedIcon != arg3) {
            float v0 = this.calculateChipIconWidth();
            this.checkedIcon = arg3;
            float v3 = this.calculateChipIconWidth();
            this.unapplyChildDrawable(this.checkedIcon);
            this.applyChildDrawable(this.checkedIcon);
            this.invalidateSelf();
            if(v0 != v3) {
                this.onSizeChange();
            }
        }
    }

    @Deprecated public void setCheckedIconEnabled(boolean arg1) {
        this.setCheckedIconVisible(arg1);
    }

    @Deprecated public void setCheckedIconEnabledResource(@BoolRes int arg2) {
        this.setCheckedIconVisible(this.context.getResources().getBoolean(arg2));
    }

    public void setCheckedIconResource(@DrawableRes int arg2) {
        this.setCheckedIcon(AppCompatResources.getDrawable(this.context, arg2));
    }

    public void setCheckedIconVisible(boolean arg2) {
        if(this.checkedIconVisible != arg2) {
            boolean v0 = this.showsCheckedIcon();
            this.checkedIconVisible = arg2;
            arg2 = this.showsCheckedIcon();
            int v0_1 = v0 != arg2 ? 1 : 0;
            if(v0_1 == 0) {
                return;
            }

            if(arg2) {
                this.applyChildDrawable(this.checkedIcon);
            }
            else {
                this.unapplyChildDrawable(this.checkedIcon);
            }

            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setCheckedIconVisible(@BoolRes int arg2) {
        this.setCheckedIconVisible(this.context.getResources().getBoolean(arg2));
    }

    public void setChipBackgroundColor(@Nullable ColorStateList arg2) {
        if(this.chipBackgroundColor != arg2) {
            this.chipBackgroundColor = arg2;
            this.onStateChange(this.getState());
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int arg2) {
        this.setChipBackgroundColor(AppCompatResources.getColorStateList(this.context, arg2));
    }

    public void setChipCornerRadius(float arg2) {
        if(this.chipCornerRadius != arg2) {
            this.chipCornerRadius = arg2;
            this.invalidateSelf();
        }
    }

    public void setChipCornerRadiusResource(@DimenRes int arg2) {
        this.setChipCornerRadius(this.context.getResources().getDimension(arg2));
    }

    public void setChipEndPadding(float arg2) {
        if(this.chipEndPadding != arg2) {
            this.chipEndPadding = arg2;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setChipEndPaddingResource(@DimenRes int arg2) {
        this.setChipEndPadding(this.context.getResources().getDimension(arg2));
    }

    public void setChipIcon(@Nullable Drawable arg3) {
        Drawable v0 = this.getChipIcon();
        if(v0 != arg3) {
            float v1 = this.calculateChipIconWidth();
            arg3 = arg3 != null ? DrawableCompat.wrap(arg3).mutate() : null;
            this.chipIcon = arg3;
            float v3 = this.calculateChipIconWidth();
            this.unapplyChildDrawable(v0);
            if(this.showsChipIcon()) {
                this.applyChildDrawable(this.chipIcon);
            }

            this.invalidateSelf();
            if(v1 == v3) {
                return;
            }

            this.onSizeChange();
        }
    }

    @Deprecated public void setChipIconEnabled(boolean arg1) {
        this.setChipIconVisible(arg1);
    }

    @Deprecated public void setChipIconEnabledResource(@BoolRes int arg1) {
        this.setChipIconVisible(arg1);
    }

    public void setChipIconResource(@DrawableRes int arg2) {
        this.setChipIcon(AppCompatResources.getDrawable(this.context, arg2));
    }

    public void setChipIconSize(float arg2) {
        if(this.chipIconSize != arg2) {
            float v0 = this.calculateChipIconWidth();
            this.chipIconSize = arg2;
            arg2 = this.calculateChipIconWidth();
            this.invalidateSelf();
            if(v0 != arg2) {
                this.onSizeChange();
            }
        }
    }

    public void setChipIconSizeResource(@DimenRes int arg2) {
        this.setChipIconSize(this.context.getResources().getDimension(arg2));
    }

    public void setChipIconTint(@Nullable ColorStateList arg2) {
        if(this.chipIconTint != arg2) {
            this.chipIconTint = arg2;
            if(this.showsChipIcon()) {
                DrawableCompat.setTintList(this.chipIcon, arg2);
            }

            this.onStateChange(this.getState());
        }
    }

    public void setChipIconTintResource(@ColorRes int arg2) {
        this.setChipIconTint(AppCompatResources.getColorStateList(this.context, arg2));
    }

    public void setChipIconVisible(boolean arg2) {
        if(this.chipIconVisible != arg2) {
            boolean v0 = this.showsChipIcon();
            this.chipIconVisible = arg2;
            arg2 = this.showsChipIcon();
            int v0_1 = v0 != arg2 ? 1 : 0;
            if(v0_1 == 0) {
                return;
            }

            if(arg2) {
                this.applyChildDrawable(this.chipIcon);
            }
            else {
                this.unapplyChildDrawable(this.chipIcon);
            }

            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setChipIconVisible(@BoolRes int arg2) {
        this.setChipIconVisible(this.context.getResources().getBoolean(arg2));
    }

    public void setChipMinHeight(float arg2) {
        if(this.chipMinHeight != arg2) {
            this.chipMinHeight = arg2;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setChipMinHeightResource(@DimenRes int arg2) {
        this.setChipMinHeight(this.context.getResources().getDimension(arg2));
    }

    public void setChipStartPadding(float arg2) {
        if(this.chipStartPadding != arg2) {
            this.chipStartPadding = arg2;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setChipStartPaddingResource(@DimenRes int arg2) {
        this.setChipStartPadding(this.context.getResources().getDimension(arg2));
    }

    public void setChipStrokeColor(@Nullable ColorStateList arg2) {
        if(this.chipStrokeColor != arg2) {
            this.chipStrokeColor = arg2;
            this.onStateChange(this.getState());
        }
    }

    public void setChipStrokeColorResource(@ColorRes int arg2) {
        this.setChipStrokeColor(AppCompatResources.getColorStateList(this.context, arg2));
    }

    public void setChipStrokeWidth(float arg2) {
        if(this.chipStrokeWidth != arg2) {
            this.chipStrokeWidth = arg2;
            this.chipPaint.setStrokeWidth(arg2);
            this.invalidateSelf();
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int arg2) {
        this.setChipStrokeWidth(this.context.getResources().getDimension(arg2));
    }

    public void setCloseIcon(@Nullable Drawable arg3) {
        Drawable v0 = this.getCloseIcon();
        if(v0 != arg3) {
            float v1 = this.calculateCloseIconWidth();
            arg3 = arg3 != null ? DrawableCompat.wrap(arg3).mutate() : null;
            this.closeIcon = arg3;
            float v3 = this.calculateCloseIconWidth();
            this.unapplyChildDrawable(v0);
            if(this.showsCloseIcon()) {
                this.applyChildDrawable(this.closeIcon);
            }

            this.invalidateSelf();
            if(v1 == v3) {
                return;
            }

            this.onSizeChange();
        }
    }

    public void setCloseIconContentDescription(@Nullable CharSequence arg2) {
        if(this.closeIconContentDescription != arg2) {
            this.closeIconContentDescription = BidiFormatter.getInstance().unicodeWrap(arg2);
            this.invalidateSelf();
        }
    }

    @Deprecated public void setCloseIconEnabled(boolean arg1) {
        this.setCloseIconVisible(arg1);
    }

    @Deprecated public void setCloseIconEnabledResource(@BoolRes int arg1) {
        this.setCloseIconVisible(arg1);
    }

    public void setCloseIconEndPadding(float arg2) {
        if(this.closeIconEndPadding != arg2) {
            this.closeIconEndPadding = arg2;
            this.invalidateSelf();
            if(this.showsCloseIcon()) {
                this.onSizeChange();
            }
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int arg2) {
        this.setCloseIconEndPadding(this.context.getResources().getDimension(arg2));
    }

    public void setCloseIconResource(@DrawableRes int arg2) {
        this.setCloseIcon(AppCompatResources.getDrawable(this.context, arg2));
    }

    public void setCloseIconSize(float arg2) {
        if(this.closeIconSize != arg2) {
            this.closeIconSize = arg2;
            this.invalidateSelf();
            if(this.showsCloseIcon()) {
                this.onSizeChange();
            }
        }
    }

    public void setCloseIconSizeResource(@DimenRes int arg2) {
        this.setCloseIconSize(this.context.getResources().getDimension(arg2));
    }

    public void setCloseIconStartPadding(float arg2) {
        if(this.closeIconStartPadding != arg2) {
            this.closeIconStartPadding = arg2;
            this.invalidateSelf();
            if(this.showsCloseIcon()) {
                this.onSizeChange();
            }
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int arg2) {
        this.setCloseIconStartPadding(this.context.getResources().getDimension(arg2));
    }

    public boolean setCloseIconState(@NonNull int[] arg2) {
        if(!Arrays.equals(this.closeIconStateSet, arg2)) {
            this.closeIconStateSet = arg2;
            if(this.showsCloseIcon()) {
                return this.onStateChange(this.getState(), arg2);
            }
        }

        return 0;
    }

    public void setCloseIconTint(@Nullable ColorStateList arg2) {
        if(this.closeIconTint != arg2) {
            this.closeIconTint = arg2;
            if(this.showsCloseIcon()) {
                DrawableCompat.setTintList(this.closeIcon, arg2);
            }

            this.onStateChange(this.getState());
        }
    }

    public void setCloseIconTintResource(@ColorRes int arg2) {
        this.setCloseIconTint(AppCompatResources.getColorStateList(this.context, arg2));
    }

    public void setCloseIconVisible(boolean arg2) {
        if(this.closeIconVisible != arg2) {
            boolean v0 = this.showsCloseIcon();
            this.closeIconVisible = arg2;
            arg2 = this.showsCloseIcon();
            int v0_1 = v0 != arg2 ? 1 : 0;
            if(v0_1 == 0) {
                return;
            }

            if(arg2) {
                this.applyChildDrawable(this.closeIcon);
            }
            else {
                this.unapplyChildDrawable(this.closeIcon);
            }

            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setCloseIconVisible(@BoolRes int arg2) {
        this.setCloseIconVisible(this.context.getResources().getBoolean(arg2));
    }

    public void setColorFilter(@Nullable ColorFilter arg2) {
        if(this.colorFilter != arg2) {
            this.colorFilter = arg2;
            this.invalidateSelf();
        }
    }

    public void setDelegate(@Nullable Delegate arg2) {
        this.delegate = new WeakReference(arg2);
    }

    public void setEllipsize(@Nullable TextUtils$TruncateAt arg1) {
        this.truncateAt = arg1;
    }

    public void setHideMotionSpec(@Nullable MotionSpec arg1) {
        this.hideMotionSpec = arg1;
    }

    public void setHideMotionSpecResource(@AnimatorRes int arg2) {
        this.setHideMotionSpec(MotionSpec.createFromResource(this.context, arg2));
    }

    public void setIconEndPadding(float arg2) {
        if(this.iconEndPadding != arg2) {
            float v0 = this.calculateChipIconWidth();
            this.iconEndPadding = arg2;
            arg2 = this.calculateChipIconWidth();
            this.invalidateSelf();
            if(v0 != arg2) {
                this.onSizeChange();
            }
        }
    }

    public void setIconEndPaddingResource(@DimenRes int arg2) {
        this.setIconEndPadding(this.context.getResources().getDimension(arg2));
    }

    public void setIconStartPadding(float arg2) {
        if(this.iconStartPadding != arg2) {
            float v0 = this.calculateChipIconWidth();
            this.iconStartPadding = arg2;
            arg2 = this.calculateChipIconWidth();
            this.invalidateSelf();
            if(v0 != arg2) {
                this.onSizeChange();
            }
        }
    }

    public void setIconStartPaddingResource(@DimenRes int arg2) {
        this.setIconStartPadding(this.context.getResources().getDimension(arg2));
    }

    public void setMaxWidth(@Px int arg1) {
        this.maxWidth = arg1;
    }

    public void setRippleColor(@Nullable ColorStateList arg2) {
        if(this.rippleColor != arg2) {
            this.rippleColor = arg2;
            this.updateCompatRippleColor();
            this.onStateChange(this.getState());
        }
    }

    public void setRippleColorResource(@ColorRes int arg2) {
        this.setRippleColor(AppCompatResources.getColorStateList(this.context, arg2));
    }

    void setShouldDrawText(boolean arg1) {
        this.shouldDrawText = arg1;
    }

    public void setShowMotionSpec(@Nullable MotionSpec arg1) {
        this.showMotionSpec = arg1;
    }

    public void setShowMotionSpecResource(@AnimatorRes int arg2) {
        this.setShowMotionSpec(MotionSpec.createFromResource(this.context, arg2));
    }

    public void setText(@Nullable CharSequence arg2) {
        String v2;
        if(arg2 == null) {
            v2 = "";
        }

        if(this.rawText != (((CharSequence)v2))) {
            this.rawText = ((CharSequence)v2);
            this.unicodeWrappedText = BidiFormatter.getInstance().unicodeWrap(((CharSequence)v2));
            this.textWidthDirty = true;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setTextAppearance(@Nullable TextAppearance arg4) {
        if(this.textAppearance != arg4) {
            this.textAppearance = arg4;
            if(arg4 != null) {
                arg4.updateMeasureState(this.context, this.textPaint, this.fontCallback);
                this.textWidthDirty = true;
            }

            this.onStateChange(this.getState());
            this.onSizeChange();
        }
    }

    public void setTextAppearanceResource(@StyleRes int arg3) {
        this.setTextAppearance(new TextAppearance(this.context, arg3));
    }

    public void setTextEndPadding(float arg2) {
        if(this.textEndPadding != arg2) {
            this.textEndPadding = arg2;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setTextEndPaddingResource(@DimenRes int arg2) {
        this.setTextEndPadding(this.context.getResources().getDimension(arg2));
    }

    public void setTextResource(@StringRes int arg2) {
        this.setText(this.context.getResources().getString(arg2));
    }

    public void setTextStartPadding(float arg2) {
        if(this.textStartPadding != arg2) {
            this.textStartPadding = arg2;
            this.invalidateSelf();
            this.onSizeChange();
        }
    }

    public void setTextStartPaddingResource(@DimenRes int arg2) {
        this.setTextStartPadding(this.context.getResources().getDimension(arg2));
    }

    public void setTintList(@Nullable ColorStateList arg2) {
        if(this.tint != arg2) {
            this.tint = arg2;
            this.onStateChange(this.getState());
        }
    }

    public void setTintMode(@NonNull PorterDuff$Mode arg2) {
        if(this.tintMode != arg2) {
            this.tintMode = arg2;
            this.tintFilter = DrawableUtils.updateTintFilter(((Drawable)this), this.tint, arg2);
            this.invalidateSelf();
        }
    }

    public void setUseCompatRipple(boolean arg2) {
        if(this.useCompatRipple != arg2) {
            this.useCompatRipple = arg2;
            this.updateCompatRippleColor();
            this.onStateChange(this.getState());
        }
    }

    public boolean setVisible(boolean arg3, boolean arg4) {
        int v0_1;
        boolean v0 = super.setVisible(arg3, arg4);
        if(this.showsChipIcon()) {
            v0_1 = (((int)v0)) | this.chipIcon.setVisible(arg3, arg4);
        }

        if(this.showsCheckedIcon()) {
            v0_1 |= this.checkedIcon.setVisible(arg3, arg4);
        }

        if(this.showsCloseIcon()) {
            v0_1 |= this.closeIcon.setVisible(arg3, arg4);
        }

        if((((boolean)v0_1))) {
            this.invalidateSelf();
        }

        return ((boolean)v0_1);
    }

    boolean shouldDrawText() {
        return this.shouldDrawText;
    }

    private boolean showsCheckedIcon() {
        boolean v0 = !this.checkedIconVisible || this.checkedIcon == null || !this.currentChecked ? false : true;
        return v0;
    }

    private boolean showsChipIcon() {
        boolean v0 = !this.chipIconVisible || this.chipIcon == null ? false : true;
        return v0;
    }

    private boolean showsCloseIcon() {
        boolean v0 = !this.closeIconVisible || this.closeIcon == null ? false : true;
        return v0;
    }

    private void unapplyChildDrawable(@Nullable Drawable arg2) {
        if(arg2 != null) {
            arg2.setCallback(null);
        }
    }

    public void unscheduleDrawable(@NonNull Drawable arg1, @NonNull Runnable arg2) {
        Drawable$Callback v1 = this.getCallback();
        if(v1 != null) {
            v1.unscheduleDrawable(((Drawable)this), arg2);
        }
    }

    private void updateCompatRippleColor() {
        ColorStateList v0 = this.useCompatRipple ? RippleUtils.convertToRippleDrawableColor(this.rippleColor) : null;
        this.compatRippleColor = v0;
    }
}

