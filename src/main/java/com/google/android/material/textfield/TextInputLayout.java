package com.google.android.material.textfield;

import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.os.Build$VERSION;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class TextInputLayout extends LinearLayout {
    public class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final TextInputLayout layout;

        public AccessibilityDelegate(TextInputLayout arg1) {
            super();
            this.layout = arg1;
        }

        public void onInitializeAccessibilityNodeInfo(View arg10, AccessibilityNodeInfoCompat arg11) {
            CharSequence v10_2;
            super.onInitializeAccessibilityNodeInfo(arg10, arg11);
            EditText v10 = this.layout.getEditText();
            if(v10 != null) {
                Editable v10_1 = v10.getText();
            }
            else {
                v10_2 = null;
            }

            CharSequence v0 = this.layout.getHint();
            CharSequence v1 = this.layout.getError();
            CharSequence v2 = this.layout.getCounterOverflowDescription();
            int v3 = TextUtils.isEmpty(v10_2) ^ 1;
            int v5 = TextUtils.isEmpty(v0) ^ 1;
            int v6 = TextUtils.isEmpty(v1) ^ 1;
            boolean v7 = false;
            int v8 = v6 != 0 || !TextUtils.isEmpty(v2) ? 1 : 0;
            if(v3 != 0) {
                arg11.setText(v10_2);
            }
            else if(v5 != 0) {
                arg11.setText(v0);
            }

            if(v5 != 0) {
                arg11.setHintText(v0);
                if(v3 == 0 && v5 != 0) {
                    v7 = true;
                }

                arg11.setShowingHintText(v7);
            }

            if(v8 != 0) {
                if(v6 != 0) {
                }
                else {
                    v1 = v2;
                }

                arg11.setError(v1);
                arg11.setContentInvalid(true);
            }
        }

        public void onPopulateAccessibilityEvent(View arg2, AccessibilityEvent arg3) {
            CharSequence v2_2;
            super.onPopulateAccessibilityEvent(arg2, arg3);
            EditText v2 = this.layout.getEditText();
            if(v2 != null) {
                Editable v2_1 = v2.getText();
            }
            else {
                v2_2 = null;
            }

            if(TextUtils.isEmpty(v2_2)) {
                v2_2 = this.layout.getHint();
            }

            if(!TextUtils.isEmpty(v2_2)) {
                arg3.getText().add(v2_2);
            }
        }
    }

    @Retention(value=RetentionPolicy.SOURCE) @public interface BoxBackgroundMode {
    }

    class SavedState extends AbsSavedState {
        final class com.google.android.material.textfield.TextInputLayout$SavedState$1 implements Parcelable$ClassLoaderCreator {
            com.google.android.material.textfield.TextInputLayout$SavedState$1() {
                super();
            }

            public SavedState createFromParcel(Parcel arg3) {
                return new SavedState(arg3, null);
            }

            public SavedState createFromParcel(Parcel arg2, ClassLoader arg3) {
                return new SavedState(arg2, arg3);
            }

            public Object createFromParcel(Parcel arg1) {
                return this.createFromParcel(arg1);
            }

            public Object createFromParcel(Parcel arg1, ClassLoader arg2) {
                return this.createFromParcel(arg1, arg2);
            }

            public SavedState[] newArray(int arg1) {
                return new SavedState[arg1];
            }

            public Object[] newArray(int arg1) {
                return this.newArray(arg1);
            }
        }

        public static final Parcelable$Creator CREATOR;
        CharSequence error;
        boolean isPasswordToggledVisible;

        static {
            SavedState.CREATOR = new com.google.android.material.textfield.TextInputLayout$SavedState$1();
        }

        SavedState(Parcelable arg1) {
            super(arg1);
        }

        SavedState(Parcel arg1, ClassLoader arg2) {
            super(arg1, arg2);
            this.error = TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(arg1);
            boolean v2 = true;
            if(arg1.readInt() == 1) {
            }
            else {
                v2 = false;
            }

            this.isPasswordToggledVisible = v2;
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + this.error + "}";
        }

        public void writeToParcel(Parcel arg2, int arg3) {
            super.writeToParcel(arg2, arg3);
            TextUtils.writeToParcel(this.error, arg2, arg3);
            arg2.writeInt(this.isPasswordToggledVisible);
        }
    }

    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 0xA7;
    private static final String LOG_TAG = "TextInputLayout";
    private ValueAnimator animator;
    private GradientDrawable boxBackground;
    @ColorInt private int boxBackgroundColor;
    private int boxBackgroundMode;
    private final int boxBottomOffsetPx;
    private final int boxCollapsedPaddingTopPx;
    private float boxCornerRadiusBottomEnd;
    private float boxCornerRadiusBottomStart;
    private float boxCornerRadiusTopEnd;
    private float boxCornerRadiusTopStart;
    private final int boxLabelCutoutPaddingPx;
    @ColorInt private int boxStrokeColor;
    private final int boxStrokeWidthDefaultPx;
    private final int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    final CollapsingTextHelper collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private final int counterOverflowTextAppearance;
    private boolean counterOverflowed;
    private final int counterTextAppearance;
    private TextView counterView;
    private ColorStateList defaultHintTextColor;
    @ColorInt private final int defaultStrokeColor;
    @ColorInt private final int disabledColor;
    EditText editText;
    private Drawable editTextOriginalDrawable;
    @ColorInt private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean hasPasswordToggleTintList;
    private boolean hasPasswordToggleTintMode;
    private boolean hasReconstructedEditTextBackground;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    @ColorInt private final int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final IndicatorViewController indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private Drawable originalEditTextEndDrawable;
    private CharSequence originalHint;
    private CharSequence passwordToggleContentDesc;
    private Drawable passwordToggleDrawable;
    private Drawable passwordToggleDummyDrawable;
    private boolean passwordToggleEnabled;
    private ColorStateList passwordToggleTintList;
    private PorterDuff$Mode passwordToggleTintMode;
    private CheckableImageButton passwordToggleView;
    private boolean passwordToggledVisible;
    private boolean restoringSavedState;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    public TextInputLayout(Context arg2) {
        this(arg2, null);
    }

    public TextInputLayout(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.textInputStyle);
    }

    public TextInputLayout(Context arg11, AttributeSet arg12, int arg13) {
        super(arg11, arg12, arg13);
        this.indicatorViewController = new IndicatorViewController(this);
        this.tmpRect = new Rect();
        this.tmpRectF = new RectF();
        this.collapsingTextHelper = new CollapsingTextHelper(((View)this));
        this.setOrientation(1);
        this.setWillNotDraw(false);
        this.setAddStatesFromChildren(true);
        this.inputFrame = new FrameLayout(arg11);
        this.inputFrame.setAddStatesFromChildren(true);
        this.addView(this.inputFrame);
        this.collapsingTextHelper.setTextSizeInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        this.collapsingTextHelper.setPositionInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        this.collapsingTextHelper.setCollapsedTextGravity(0x800033);
        TintTypedArray v12 = ThemeEnforcement.obtainTintedStyledAttributes(arg11, arg12, R$styleable.TextInputLayout, arg13, R$style.Widget_Design_TextInputLayout, new int[0]);
        this.hintEnabled = v12.getBoolean(R$styleable.TextInputLayout_hintEnabled, true);
        this.setHint(v12.getText(R$styleable.TextInputLayout_android_hint));
        this.hintAnimationEnabled = v12.getBoolean(R$styleable.TextInputLayout_hintAnimationEnabled, true);
        this.boxBottomOffsetPx = arg11.getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_box_bottom_offset);
        this.boxLabelCutoutPaddingPx = arg11.getResources().getDimensionPixelOffset(R$dimen.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = v12.getDimensionPixelOffset(R$styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.boxCornerRadiusTopStart = v12.getDimension(R$styleable.TextInputLayout_boxCornerRadiusTopStart, 0f);
        this.boxCornerRadiusTopEnd = v12.getDimension(R$styleable.TextInputLayout_boxCornerRadiusTopEnd, 0f);
        this.boxCornerRadiusBottomEnd = v12.getDimension(R$styleable.TextInputLayout_boxCornerRadiusBottomEnd, 0f);
        this.boxCornerRadiusBottomStart = v12.getDimension(R$styleable.TextInputLayout_boxCornerRadiusBottomStart, 0f);
        this.boxBackgroundColor = v12.getColor(R$styleable.TextInputLayout_boxBackgroundColor, 0);
        this.focusedStrokeColor = v12.getColor(R$styleable.TextInputLayout_boxStrokeColor, 0);
        this.boxStrokeWidthDefaultPx = arg11.getResources().getDimensionPixelSize(R$dimen.mtrl_textinput_box_stroke_width_default);
        this.boxStrokeWidthFocusedPx = arg11.getResources().getDimensionPixelSize(R$dimen.mtrl_textinput_box_stroke_width_focused);
        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        this.setBoxBackgroundMode(v12.getInt(R$styleable.TextInputLayout_boxBackgroundMode, 0));
        if(v12.hasValue(R$styleable.TextInputLayout_android_textColorHint)) {
            ColorStateList v13 = v12.getColorStateList(R$styleable.TextInputLayout_android_textColorHint);
            this.focusedTextColor = v13;
            this.defaultHintTextColor = v13;
        }

        this.defaultStrokeColor = ContextCompat.getColor(arg11, R$color.mtrl_textinput_default_box_stroke_color);
        this.disabledColor = ContextCompat.getColor(arg11, R$color.mtrl_textinput_disabled_color);
        this.hoveredStrokeColor = ContextCompat.getColor(arg11, R$color.mtrl_textinput_hovered_box_stroke_color);
        arg13 = -1;
        if(v12.getResourceId(R$styleable.TextInputLayout_hintTextAppearance, arg13) != arg13) {
            this.setHintTextAppearance(v12.getResourceId(R$styleable.TextInputLayout_hintTextAppearance, 0));
        }

        int v11 = v12.getResourceId(R$styleable.TextInputLayout_errorTextAppearance, 0);
        boolean v2 = v12.getBoolean(R$styleable.TextInputLayout_errorEnabled, false);
        int v3 = v12.getResourceId(R$styleable.TextInputLayout_helperTextTextAppearance, 0);
        boolean v4 = v12.getBoolean(R$styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence v5 = v12.getText(R$styleable.TextInputLayout_helperText);
        boolean v6 = v12.getBoolean(R$styleable.TextInputLayout_counterEnabled, false);
        this.setCounterMaxLength(v12.getInt(R$styleable.TextInputLayout_counterMaxLength, arg13));
        this.counterTextAppearance = v12.getResourceId(R$styleable.TextInputLayout_counterTextAppearance, 0);
        this.counterOverflowTextAppearance = v12.getResourceId(R$styleable.TextInputLayout_counterOverflowTextAppearance, 0);
        this.passwordToggleEnabled = v12.getBoolean(R$styleable.TextInputLayout_passwordToggleEnabled, false);
        this.passwordToggleDrawable = v12.getDrawable(R$styleable.TextInputLayout_passwordToggleDrawable);
        this.passwordToggleContentDesc = v12.getText(R$styleable.TextInputLayout_passwordToggleContentDescription);
        if(v12.hasValue(R$styleable.TextInputLayout_passwordToggleTint)) {
            this.hasPasswordToggleTintList = true;
            this.passwordToggleTintList = v12.getColorStateList(R$styleable.TextInputLayout_passwordToggleTint);
        }

        if(v12.hasValue(R$styleable.TextInputLayout_passwordToggleTintMode)) {
            this.hasPasswordToggleTintMode = true;
            this.passwordToggleTintMode = ViewUtils.parseTintMode(v12.getInt(R$styleable.TextInputLayout_passwordToggleTintMode, arg13), null);
        }

        v12.recycle();
        this.setHelperTextEnabled(v4);
        this.setHelperText(v5);
        this.setHelperTextTextAppearance(v3);
        this.setErrorEnabled(v2);
        this.setErrorTextAppearance(v11);
        this.setCounterEnabled(v6);
        this.applyPasswordToggleTint();
        ViewCompat.setImportantForAccessibility(((View)this), 2);
    }

    static boolean access$000(TextInputLayout arg0) {
        return arg0.restoringSavedState;
    }

    public void addView(View arg2, int arg3, ViewGroup$LayoutParams arg4) {
        if((arg2 instanceof EditText)) {
            FrameLayout$LayoutParams v3 = new FrameLayout$LayoutParams(arg4);
            v3.gravity = v3.gravity & 0xFFFFFF8F | 16;
            this.inputFrame.addView(arg2, ((ViewGroup$LayoutParams)v3));
            this.inputFrame.setLayoutParams(arg4);
            this.updateInputLayoutMargins();
            this.setEditText(((EditText)arg2));
        }
        else {
            super.addView(arg2, arg3, arg4);
        }
    }

    @VisibleForTesting void animateToExpansionFraction(float arg5) {
        if(this.collapsingTextHelper.getExpansionFraction() == arg5) {
            return;
        }

        if(this.animator == null) {
            this.animator = new ValueAnimator();
            this.animator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.animator.setDuration(0xA7);
            this.animator.addUpdateListener(new ValueAnimator$AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator arg2) {
                    TextInputLayout.this.collapsingTextHelper.setExpansionFraction(arg2.getAnimatedValue().floatValue());
                }
            });
        }

        this.animator.setFloatValues(new float[]{this.collapsingTextHelper.getExpansionFraction(), arg5});
        this.animator.start();
    }

    private void applyBoxAttributes() {
        if(this.boxBackground == null) {
            return;
        }

        this.setBoxAttributes();
        if(this.editText != null && this.boxBackgroundMode == 2) {
            if(this.editText.getBackground() != null) {
                this.editTextOriginalDrawable = this.editText.getBackground();
            }

            ViewCompat.setBackground(this.editText, null);
        }

        if(this.editText != null && this.boxBackgroundMode == 1 && this.editTextOriginalDrawable != null) {
            ViewCompat.setBackground(this.editText, this.editTextOriginalDrawable);
        }

        if(this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0) {
            this.boxBackground.setStroke(this.boxStrokeWidthPx, this.boxStrokeColor);
        }

        this.boxBackground.setCornerRadii(this.getCornerRadiiAsArray());
        this.boxBackground.setColor(this.boxBackgroundColor);
        this.invalidate();
    }

    private void applyCutoutPadding(RectF arg3) {
        arg3.left -= ((float)this.boxLabelCutoutPaddingPx);
        arg3.top -= ((float)this.boxLabelCutoutPaddingPx);
        arg3.right += ((float)this.boxLabelCutoutPaddingPx);
        arg3.bottom += ((float)this.boxLabelCutoutPaddingPx);
    }

    private void applyPasswordToggleTint() {
        if(this.passwordToggleDrawable != null && ((this.hasPasswordToggleTintList) || (this.hasPasswordToggleTintMode))) {
            this.passwordToggleDrawable = DrawableCompat.wrap(this.passwordToggleDrawable).mutate();
            if(this.hasPasswordToggleTintList) {
                DrawableCompat.setTintList(this.passwordToggleDrawable, this.passwordToggleTintList);
            }

            if(this.hasPasswordToggleTintMode) {
                DrawableCompat.setTintMode(this.passwordToggleDrawable, this.passwordToggleTintMode);
            }

            if(this.passwordToggleView == null) {
                return;
            }

            if(this.passwordToggleView.getDrawable() == this.passwordToggleDrawable) {
                return;
            }

            this.passwordToggleView.setImageDrawable(this.passwordToggleDrawable);
        }
    }

    private void assignBoxBackgroundByMode() {
        if(this.boxBackgroundMode == 0) {
            this.boxBackground = null;
        }
        else {
            if(this.boxBackgroundMode == 2 && (this.hintEnabled) && !(this.boxBackground instanceof CutoutDrawable)) {
                this.boxBackground = new CutoutDrawable();
                return;
            }

            if((this.boxBackground instanceof GradientDrawable)) {
                return;
            }

            this.boxBackground = new GradientDrawable();
        }
    }

    private int calculateBoxBackgroundTop() {
        if(this.editText == null) {
            return 0;
        }

        switch(this.boxBackgroundMode) {
            case 1: {
                goto label_12;
            }
            case 2: {
                goto label_7;
            }
        }

        return 0;
    label_7:
        return this.editText.getTop() + this.calculateLabelMarginTop();
    label_12:
        return this.editText.getTop();
    }

    private int calculateCollapsedTextTopBounds() {
        switch(this.boxBackgroundMode) {
            case 1: {
                goto label_10;
            }
            case 2: {
                goto label_4;
            }
        }

        return this.getPaddingTop();
    label_4:
        return this.getBoxBackground().getBounds().top - this.calculateLabelMarginTop();
    label_10:
        return this.getBoxBackground().getBounds().top + this.boxCollapsedPaddingTopPx;
    }

    private int calculateLabelMarginTop() {
        if(!this.hintEnabled) {
            return 0;
        }

        switch(this.boxBackgroundMode) {
            case 0: 
            case 1: {
                goto label_13;
            }
            case 2: {
                goto label_7;
            }
        }

        return 0;
    label_7:
        return ((int)(this.collapsingTextHelper.getCollapsedTextHeight() / 2f));
    label_13:
        return ((int)this.collapsingTextHelper.getCollapsedTextHeight());
    }

    private void closeCutout() {
        if(this.cutoutEnabled()) {
            this.boxBackground.removeCutout();
        }
    }

    private void collapseHint(boolean arg2) {
        if(this.animator != null && (this.animator.isRunning())) {
            this.animator.cancel();
        }

        float v0 = 1f;
        if(!arg2 || !this.hintAnimationEnabled) {
            this.collapsingTextHelper.setExpansionFraction(v0);
        }
        else {
            this.animateToExpansionFraction(v0);
        }

        this.hintExpanded = false;
        if(this.cutoutEnabled()) {
            this.openCutout();
        }
    }

    private boolean cutoutEnabled() {
        boolean v0 = !this.hintEnabled || (TextUtils.isEmpty(this.hint)) || !(this.boxBackground instanceof CutoutDrawable) ? false : true;
        return v0;
    }

    @VisibleForTesting boolean cutoutIsOpen() {
        boolean v0 = !this.cutoutEnabled() || !this.boxBackground.hasCutout() ? false : true;
        return v0;
    }

    public void dispatchProvideAutofillStructure(ViewStructure arg5, int arg6) {
        if(this.originalHint != null) {
            if(this.editText == null) {
            }
            else {
                boolean v0 = this.isProvidingHint;
                this.isProvidingHint = false;
                CharSequence v1 = this.editText.getHint();
                this.editText.setHint(this.originalHint);
                try {
                    super.dispatchProvideAutofillStructure(arg5, arg6);
                }
                catch(Throwable v5) {
                    this.editText.setHint(v1);
                    this.isProvidingHint = v0;
                    throw v5;
                }

                this.editText.setHint(v1);
                this.isProvidingHint = v0;
                return;
            }
        }

        super.dispatchProvideAutofillStructure(arg5, arg6);
    }

    protected void dispatchRestoreInstanceState(SparseArray arg2) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(arg2);
        this.restoringSavedState = false;
    }

    public void draw(Canvas arg2) {
        if(this.boxBackground != null) {
            this.boxBackground.draw(arg2);
        }

        super.draw(arg2);
        if(this.hintEnabled) {
            this.collapsingTextHelper.draw(arg2);
        }
    }

    protected void drawableStateChanged() {
        if(this.inDrawableStateChanged) {
            return;
        }

        boolean v0 = true;
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] v1 = this.getDrawableState();
        if(!ViewCompat.isLaidOut(((View)this)) || !this.isEnabled()) {
            v0 = false;
        }
        else {
        }

        this.updateLabelState(v0);
        this.updateEditTextBackground();
        this.updateTextInputBoxBounds();
        this.updateTextInputBoxState();
        int v0_1 = this.collapsingTextHelper != null ? this.collapsingTextHelper.setState(v1) | 0 : 0;
        if(v0_1 != 0) {
            this.invalidate();
        }

        this.inDrawableStateChanged = false;
    }

    private void ensureBackgroundDrawableStateWorkaround() {
        int v0 = Build$VERSION.SDK_INT;
        if(v0 != 21 && v0 != 22) {
            return;
        }

        Drawable v0_1 = this.editText.getBackground();
        if(v0_1 == null) {
            return;
        }

        if(!this.hasReconstructedEditTextBackground) {
            Drawable v1 = v0_1.getConstantState().newDrawable();
            if((v0_1 instanceof DrawableContainer)) {
                this.hasReconstructedEditTextBackground = DrawableUtils.setContainerConstantState(((DrawableContainer)v0_1), v1.getConstantState());
            }

            if(this.hasReconstructedEditTextBackground) {
                return;
            }

            ViewCompat.setBackground(this.editText, v1);
            this.hasReconstructedEditTextBackground = true;
            this.onApplyBoxBackgroundMode();
        }
    }

    private void expandHint(boolean arg2) {
        if(this.animator != null && (this.animator.isRunning())) {
            this.animator.cancel();
        }

        if(!arg2 || !this.hintAnimationEnabled) {
            this.collapsingTextHelper.setExpansionFraction(0f);
        }
        else {
            this.animateToExpansionFraction(0f);
        }

        if((this.cutoutEnabled()) && (this.boxBackground.hasCutout())) {
            this.closeCutout();
        }

        this.hintExpanded = true;
    }

    @NonNull private Drawable getBoxBackground() {
        if(this.boxBackgroundMode != 1) {
            if(this.boxBackgroundMode == 2) {
            }
            else {
                throw new IllegalStateException();
            }
        }

        return this.boxBackground;
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.boxCornerRadiusBottomEnd;
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.boxCornerRadiusBottomStart;
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.boxCornerRadiusTopEnd;
    }

    public float getBoxCornerRadiusTopStart() {
        return this.boxCornerRadiusTopStart;
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    private float[] getCornerRadiiAsArray() {
        float[] v0;
        int v1 = 7;
        int v2 = 6;
        int v3 = 5;
        int v4 = 4;
        int v5 = 3;
        int v6 = 2;
        int v9 = 8;
        if(!ViewUtils.isLayoutRtl(((View)this))) {
            v0 = new float[v9];
            v0[0] = this.boxCornerRadiusTopStart;
            v0[1] = this.boxCornerRadiusTopStart;
            v0[v6] = this.boxCornerRadiusTopEnd;
            v0[v5] = this.boxCornerRadiusTopEnd;
            v0[v4] = this.boxCornerRadiusBottomEnd;
            v0[v3] = this.boxCornerRadiusBottomEnd;
            v0[v2] = this.boxCornerRadiusBottomStart;
            v0[v1] = this.boxCornerRadiusBottomStart;
            return v0;
        }

        v0 = new float[v9];
        v0[0] = this.boxCornerRadiusTopEnd;
        v0[1] = this.boxCornerRadiusTopEnd;
        v0[v6] = this.boxCornerRadiusTopStart;
        v0[v5] = this.boxCornerRadiusTopStart;
        v0[v4] = this.boxCornerRadiusBottomStart;
        v0[v3] = this.boxCornerRadiusBottomStart;
        v0[v2] = this.boxCornerRadiusBottomEnd;
        v0[v1] = this.boxCornerRadiusBottomEnd;
        return v0;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    @Nullable CharSequence getCounterOverflowDescription() {
        if((this.counterEnabled) && (this.counterOverflowed) && this.counterView != null) {
            return this.counterView.getContentDescription();
        }

        return null;
    }

    @Nullable public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    @Nullable public EditText getEditText() {
        return this.editText;
    }

    @Nullable public CharSequence getError() {
        CharSequence v0 = this.indicatorViewController.isErrorEnabled() ? this.indicatorViewController.getErrorText() : null;
        return v0;
    }

    @ColorInt public int getErrorCurrentTextColors() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    @VisibleForTesting final int getErrorTextCurrentColor() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    @Nullable public CharSequence getHelperText() {
        CharSequence v0 = this.indicatorViewController.isHelperTextEnabled() ? this.indicatorViewController.getHelperText() : null;
        return v0;
    }

    @ColorInt public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.getHelperTextViewCurrentTextColor();
    }

    @Nullable public CharSequence getHint() {
        CharSequence v0 = this.hintEnabled ? this.hint : null;
        return v0;
    }

    @VisibleForTesting final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.getCollapsedTextHeight();
    }

    @VisibleForTesting final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.getCurrentCollapsedTextColor();
    }

    @Nullable public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.passwordToggleContentDesc;
    }

    @Nullable public Drawable getPasswordVisibilityToggleDrawable() {
        return this.passwordToggleDrawable;
    }

    @Nullable public Typeface getTypeface() {
        return this.typeface;
    }

    private boolean hasPasswordTransformation() {
        boolean v0 = this.editText == null || !(this.editText.getTransformationMethod() instanceof PasswordTransformationMethod) ? false : true;
        return v0;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.isErrorEnabled();
    }

    @VisibleForTesting final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.helperTextIsDisplayed();
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.isHelperTextEnabled();
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    @VisibleForTesting final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    public boolean isPasswordVisibilityToggleEnabled() {
        return this.passwordToggleEnabled;
    }

    boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    private void onApplyBoxBackgroundMode() {
        this.assignBoxBackgroundByMode();
        if(this.boxBackgroundMode != 0) {
            this.updateInputLayoutMargins();
        }

        this.updateTextInputBoxBounds();
    }

    protected void onLayout(boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        super.onLayout(arg5, arg6, arg7, arg8, arg9);
        if(this.boxBackground != null) {
            this.updateTextInputBoxBounds();
        }

        if((this.hintEnabled) && this.editText != null) {
            Rect v5 = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(((ViewGroup)this), this.editText, v5);
            arg6 = v5.left + this.editText.getCompoundPaddingLeft();
            arg8 = v5.right - this.editText.getCompoundPaddingRight();
            int v0 = this.calculateCollapsedTextTopBounds();
            this.collapsingTextHelper.setExpandedBounds(arg6, v5.top + this.editText.getCompoundPaddingTop(), arg8, v5.bottom - this.editText.getCompoundPaddingBottom());
            this.collapsingTextHelper.setCollapsedBounds(arg6, v0, arg8, arg9 - arg7 - this.getPaddingBottom());
            this.collapsingTextHelper.recalculate();
            if((this.cutoutEnabled()) && !this.hintExpanded) {
                this.openCutout();
            }
        }
    }

    protected void onMeasure(int arg1, int arg2) {
        this.updatePasswordToggleView();
        super.onMeasure(arg1, arg2);
    }

    protected void onRestoreInstanceState(Parcelable arg2) {
        if(!(arg2 instanceof SavedState)) {
            super.onRestoreInstanceState(arg2);
            return;
        }

        super.onRestoreInstanceState(((SavedState)arg2).getSuperState());
        this.setError(((SavedState)arg2).error);
        if(((SavedState)arg2).isPasswordToggledVisible) {
            this.passwordVisibilityToggleRequested(true);
        }

        this.requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState v1 = new SavedState(super.onSaveInstanceState());
        if(this.indicatorViewController.errorShouldBeShown()) {
            v1.error = this.getError();
        }

        v1.isPasswordToggledVisible = this.passwordToggledVisible;
        return ((Parcelable)v1);
    }

    private void openCutout() {
        if(!this.cutoutEnabled()) {
            return;
        }

        RectF v0 = this.tmpRectF;
        this.collapsingTextHelper.getCollapsedTextActualBounds(v0);
        this.applyCutoutPadding(v0);
        this.boxBackground.setCutout(v0);
    }

    public void passwordVisibilityToggleRequested(boolean arg4) {
        if(this.passwordToggleEnabled) {
            int v0 = this.editText.getSelectionEnd();
            if(this.hasPasswordTransformation()) {
                this.editText.setTransformationMethod(null);
                this.passwordToggledVisible = true;
            }
            else {
                this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.passwordToggledVisible = false;
            }

            this.passwordToggleView.setChecked(this.passwordToggledVisible);
            if(arg4) {
                this.passwordToggleView.jumpDrawablesToCurrentState();
            }

            this.editText.setSelection(v0);
        }
    }

    private static void recursiveSetEnabled(ViewGroup arg4, boolean arg5) {
        int v0 = arg4.getChildCount();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            View v2 = arg4.getChildAt(v1);
            v2.setEnabled(arg5);
            if((v2 instanceof ViewGroup)) {
                TextInputLayout.recursiveSetEnabled(((ViewGroup)v2), arg5);
            }
        }
    }

    private void setBoxAttributes() {
        switch(this.boxBackgroundMode) {
            case 1: {
                this.boxStrokeWidthPx = 0;
                break;
            }
            case 2: {
                if(this.focusedStrokeColor != 0) {
                    return;
                }

                this.focusedStrokeColor = this.focusedTextColor.getColorForState(this.getDrawableState(), this.focusedTextColor.getDefaultColor());
                break;
            }
            default: {
                break;
            }
        }
    }

    public void setBoxBackgroundColor(@ColorInt int arg2) {
        if(this.boxBackgroundColor != arg2) {
            this.boxBackgroundColor = arg2;
            this.applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int arg2) {
        this.setBoxBackgroundColor(ContextCompat.getColor(this.getContext(), arg2));
    }

    public void setBoxBackgroundMode(int arg2) {
        if(arg2 == this.boxBackgroundMode) {
            return;
        }

        this.boxBackgroundMode = arg2;
        this.onApplyBoxBackgroundMode();
    }

    public void setBoxCornerRadii(float arg2, float arg3, float arg4, float arg5) {
        if(this.boxCornerRadiusTopStart != arg2 || this.boxCornerRadiusTopEnd != arg3 || this.boxCornerRadiusBottomEnd != arg5 || this.boxCornerRadiusBottomStart != arg4) {
            this.boxCornerRadiusTopStart = arg2;
            this.boxCornerRadiusTopEnd = arg3;
            this.boxCornerRadiusBottomEnd = arg5;
            this.boxCornerRadiusBottomStart = arg4;
            this.applyBoxAttributes();
        }
    }

    public void setBoxCornerRadiiResources(@DimenRes int arg2, @DimenRes int arg3, @DimenRes int arg4, @DimenRes int arg5) {
        this.setBoxCornerRadii(this.getContext().getResources().getDimension(arg2), this.getContext().getResources().getDimension(arg3), this.getContext().getResources().getDimension(arg4), this.getContext().getResources().getDimension(arg5));
    }

    public void setBoxStrokeColor(@ColorInt int arg2) {
        if(this.focusedStrokeColor != arg2) {
            this.focusedStrokeColor = arg2;
            this.updateTextInputBoxState();
        }
    }

    public void setCounterEnabled(boolean arg4) {
        if(this.counterEnabled != arg4) {
            int v0 = 2;
            if(arg4) {
                this.counterView = new AppCompatTextView(this.getContext());
                this.counterView.setId(R$id.textinput_counter);
                if(this.typeface != null) {
                    this.counterView.setTypeface(this.typeface);
                }

                this.counterView.setMaxLines(1);
                this.setTextAppearanceCompatWithErrorFallback(this.counterView, this.counterTextAppearance);
                this.indicatorViewController.addIndicator(this.counterView, v0);
                if(this.editText == null) {
                    this.updateCounter(0);
                    goto label_40;
                }

                this.updateCounter(this.editText.getText().length());
            }
            else {
                this.indicatorViewController.removeIndicator(this.counterView, v0);
                this.counterView = null;
            }

        label_40:
            this.counterEnabled = arg4;
        }
    }

    public void setCounterMaxLength(int arg2) {
        if(this.counterMaxLength != arg2) {
            this.counterMaxLength = arg2 > 0 ? arg2 : -1;
            if(!this.counterEnabled) {
                return;
            }

            arg2 = this.editText == null ? 0 : this.editText.getText().length();
            this.updateCounter(arg2);
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList arg1) {
        this.defaultHintTextColor = arg1;
        this.focusedTextColor = arg1;
        if(this.editText != null) {
            this.updateLabelState(false);
        }
    }

    private void setEditText(EditText arg3) {
        if(this.editText == null) {
            if(!(arg3 instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }

            this.editText = arg3;
            this.onApplyBoxBackgroundMode();
            this.setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
            if(!this.hasPasswordTransformation()) {
                this.collapsingTextHelper.setTypefaces(this.editText.getTypeface());
            }

            this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
            int v3 = this.editText.getGravity();
            this.collapsingTextHelper.setCollapsedTextGravity(v3 & 0xFFFFFF8F | 0x30);
            this.collapsingTextHelper.setExpandedTextGravity(v3);
            this.editText.addTextChangedListener(new TextWatcher() {
                public void afterTextChanged(Editable arg3) {
                    TextInputLayout.this.updateLabelState(TextInputLayout.this.restoringSavedState ^ 1);
                    if(TextInputLayout.this.counterEnabled) {
                        TextInputLayout.this.updateCounter(arg3.length());
                    }
                }

                public void beforeTextChanged(CharSequence arg1, int arg2, int arg3, int arg4) {
                }

                public void onTextChanged(CharSequence arg1, int arg2, int arg3, int arg4) {
                }
            });
            if(this.defaultHintTextColor == null) {
                this.defaultHintTextColor = this.editText.getHintTextColors();
            }

            if(this.hintEnabled) {
                if(TextUtils.isEmpty(this.hint)) {
                    this.originalHint = this.editText.getHint();
                    this.setHint(this.originalHint);
                    this.editText.setHint(null);
                }

                this.isProvidingHint = true;
            }

            if(this.counterView != null) {
                this.updateCounter(this.editText.getText().length());
            }

            this.indicatorViewController.adjustIndicatorPadding();
            this.updatePasswordToggleView();
            this.updateLabelState(false, true);
            return;
        }

        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    public void setEnabled(boolean arg1) {
        TextInputLayout.recursiveSetEnabled(((ViewGroup)this), arg1);
        super.setEnabled(arg1);
    }

    public void setError(@Nullable CharSequence arg2) {
        if(!this.indicatorViewController.isErrorEnabled()) {
            if(TextUtils.isEmpty(arg2)) {
                return;
            }
            else {
                this.setErrorEnabled(true);
            }
        }

        if(!TextUtils.isEmpty(arg2)) {
            this.indicatorViewController.showError(arg2);
        }
        else {
            this.indicatorViewController.hideError();
        }
    }

    public void setErrorEnabled(boolean arg2) {
        this.indicatorViewController.setErrorEnabled(arg2);
    }

    public void setErrorTextAppearance(@StyleRes int arg2) {
        this.indicatorViewController.setErrorTextAppearance(arg2);
    }

    public void setErrorTextColor(@Nullable ColorStateList arg2) {
        this.indicatorViewController.setErrorViewTextColor(arg2);
    }

    public void setHelperText(@Nullable CharSequence arg2) {
        if(!TextUtils.isEmpty(arg2)) {
            if(!this.isHelperTextEnabled()) {
                this.setHelperTextEnabled(true);
            }

            this.indicatorViewController.showHelper(arg2);
        }
        else if(this.isHelperTextEnabled()) {
            this.setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(@Nullable ColorStateList arg2) {
        this.indicatorViewController.setHelperTextViewTextColor(arg2);
    }

    public void setHelperTextEnabled(boolean arg2) {
        this.indicatorViewController.setHelperTextEnabled(arg2);
    }

    public void setHelperTextTextAppearance(@StyleRes int arg2) {
        this.indicatorViewController.setHelperTextAppearance(arg2);
    }

    public void setHint(@Nullable CharSequence arg2) {
        if(this.hintEnabled) {
            this.setHintInternal(arg2);
            this.sendAccessibilityEvent(0x800);
        }
    }

    public void setHintAnimationEnabled(boolean arg1) {
        this.hintAnimationEnabled = arg1;
    }

    public void setHintEnabled(boolean arg3) {
        if(arg3 != this.hintEnabled) {
            this.hintEnabled = arg3;
            CharSequence v0 = null;
            if(!this.hintEnabled) {
                this.isProvidingHint = false;
                if(!TextUtils.isEmpty(this.hint) && (TextUtils.isEmpty(this.editText.getHint()))) {
                    this.editText.setHint(this.hint);
                }

                this.setHintInternal(v0);
            }
            else {
                CharSequence v3 = this.editText.getHint();
                if(!TextUtils.isEmpty(v3)) {
                    if(TextUtils.isEmpty(this.hint)) {
                        this.setHint(v3);
                    }

                    this.editText.setHint(v0);
                }

                this.isProvidingHint = true;
            }

            if(this.editText == null) {
                return;
            }

            this.updateInputLayoutMargins();
        }
    }

    private void setHintInternal(CharSequence arg2) {
        if(!TextUtils.equals(arg2, this.hint)) {
            this.hint = arg2;
            this.collapsingTextHelper.setText(arg2);
            if(!this.hintExpanded) {
                this.openCutout();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int arg2) {
        this.collapsingTextHelper.setCollapsedTextAppearance(arg2);
        this.focusedTextColor = this.collapsingTextHelper.getCollapsedTextColor();
        if(this.editText != null) {
            this.updateLabelState(false);
            this.updateInputLayoutMargins();
        }
    }

    public void setPasswordVisibilityToggleContentDescription(@StringRes int arg2) {
        CharSequence v2 = arg2 != 0 ? this.getResources().getText(arg2) : null;
        this.setPasswordVisibilityToggleContentDescription(v2);
    }

    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence arg2) {
        this.passwordToggleContentDesc = arg2;
        if(this.passwordToggleView != null) {
            this.passwordToggleView.setContentDescription(arg2);
        }
    }

    public void setPasswordVisibilityToggleDrawable(@DrawableRes int arg2) {
        Drawable v2 = arg2 != 0 ? AppCompatResources.getDrawable(this.getContext(), arg2) : null;
        this.setPasswordVisibilityToggleDrawable(v2);
    }

    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable arg2) {
        this.passwordToggleDrawable = arg2;
        if(this.passwordToggleView != null) {
            this.passwordToggleView.setImageDrawable(arg2);
        }
    }

    public void setPasswordVisibilityToggleEnabled(boolean arg2) {
        if(this.passwordToggleEnabled != arg2) {
            this.passwordToggleEnabled = arg2;
            if(!arg2 && (this.passwordToggledVisible) && this.editText != null) {
                this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }

            this.passwordToggledVisible = false;
            this.updatePasswordToggleView();
        }
    }

    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList arg1) {
        this.passwordToggleTintList = arg1;
        this.hasPasswordToggleTintList = true;
        this.applyPasswordToggleTint();
    }

    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff$Mode arg1) {
        this.passwordToggleTintMode = arg1;
        this.hasPasswordToggleTintMode = true;
        this.applyPasswordToggleTint();
    }

    void setTextAppearanceCompatWithErrorFallback(TextView arg3, @StyleRes int arg4) {
        int v0 = 1;
        try {
            TextViewCompat.setTextAppearance(arg3, arg4);
            if(Build$VERSION.SDK_INT < 23) {
                goto label_10;
            }
            else if(arg3.getTextColors().getDefaultColor() == 0xFFFF00FF) {
                goto label_9;
            }
            else {
                goto label_10;
            }
        }
        catch(Exception ) {
        }

        goto label_12;
    label_9:
        goto label_12;
    label_10:
        v0 = 0;
    label_12:
        if(v0 != 0) {
            TextViewCompat.setTextAppearance(arg3, R$style.TextAppearance_AppCompat_Caption);
            arg3.setTextColor(ContextCompat.getColor(this.getContext(), R$color.design_error));
        }
    }

    public void setTextInputAccessibilityDelegate(AccessibilityDelegate arg2) {
        if(this.editText != null) {
            ViewCompat.setAccessibilityDelegate(this.editText, ((AccessibilityDelegateCompat)arg2));
        }
    }

    public void setTypeface(@Nullable Typeface arg2) {
        if(arg2 != this.typeface) {
            this.typeface = arg2;
            this.collapsingTextHelper.setTypefaces(arg2);
            this.indicatorViewController.setTypefaces(arg2);
            if(this.counterView != null) {
                this.counterView.setTypeface(arg2);
            }
        }
    }

    private boolean shouldShowPasswordIcon() {
        boolean v0;
        if(this.passwordToggleEnabled) {
            if(!this.hasPasswordTransformation() && !this.passwordToggledVisible) {
                goto label_8;
            }

            v0 = true;
        }
        else {
        label_8:
            v0 = false;
        }

        return v0;
    }

    void updateCounter(int arg10) {
        boolean v0 = this.counterOverflowed;
        if(this.counterMaxLength == -1) {
            this.counterView.setText(String.valueOf(arg10));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        }
        else {
            if(ViewCompat.getAccessibilityLiveRegion(this.counterView) == 1) {
                ViewCompat.setAccessibilityLiveRegion(this.counterView, 0);
            }

            boolean v1 = arg10 > this.counterMaxLength ? true : false;
            this.counterOverflowed = v1;
            if(v0 != this.counterOverflowed) {
                TextView v1_1 = this.counterView;
                int v4 = this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance;
                this.setTextAppearanceCompatWithErrorFallback(v1_1, v4);
                if(!this.counterOverflowed) {
                    goto label_38;
                }

                ViewCompat.setAccessibilityLiveRegion(this.counterView, 1);
            }

        label_38:
            this.counterView.setText(this.getContext().getString(R$string.character_counter_pattern, new Object[]{Integer.valueOf(arg10), Integer.valueOf(this.counterMaxLength)}));
            this.counterView.setContentDescription(this.getContext().getString(R$string.character_counter_content_description, new Object[]{Integer.valueOf(arg10), Integer.valueOf(this.counterMaxLength)}));
        }

        if(this.editText != null && v0 != this.counterOverflowed) {
            this.updateLabelState(false);
            this.updateTextInputBoxState();
            this.updateEditTextBackground();
        }
    }

    void updateEditTextBackground() {
        if(this.editText == null) {
            return;
        }

        Drawable v0 = this.editText.getBackground();
        if(v0 == null) {
            return;
        }

        this.ensureBackgroundDrawableStateWorkaround();
        if(androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(v0)) {
            v0 = v0.mutate();
        }

        if(this.indicatorViewController.errorShouldBeShown()) {
            v0.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.indicatorViewController.getErrorViewCurrentTextColor(), PorterDuff$Mode.SRC_IN));
        }
        else {
            if((this.counterOverflowed) && this.counterView != null) {
                v0.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(this.counterView.getCurrentTextColor(), PorterDuff$Mode.SRC_IN));
                return;
            }

            DrawableCompat.clearColorFilter(v0);
            this.editText.refreshDrawableState();
        }
    }

    private void updateEditTextBackgroundBounds() {
        if(this.editText == null) {
            return;
        }

        Drawable v0 = this.editText.getBackground();
        if(v0 == null) {
            return;
        }

        if(androidx.appcompat.widget.DrawableUtils.canSafelyMutateDrawable(v0)) {
            v0 = v0.mutate();
        }

        DescendantOffsetUtils.getDescendantRect(((ViewGroup)this), this.editText, new Rect());
        Rect v1 = v0.getBounds();
        if(v1.left != v1.right) {
            Rect v2 = new Rect();
            v0.getPadding(v2);
            v0.setBounds(v1.left - v2.left, v1.top, v1.right + v2.right * 2, this.editText.getBottom());
        }
    }

    private void updateInputLayoutMargins() {
        ViewGroup$LayoutParams v0 = this.inputFrame.getLayoutParams();
        int v1 = this.calculateLabelMarginTop();
        if(v1 != ((LinearLayout$LayoutParams)v0).topMargin) {
            ((LinearLayout$LayoutParams)v0).topMargin = v1;
            this.inputFrame.requestLayout();
        }
    }

    void updateLabelState(boolean arg2) {
        this.updateLabelState(arg2, false);
    }

    private void updateLabelState(boolean arg7, boolean arg8) {
        boolean v0 = this.isEnabled();
        int v2 = 1;
        int v1 = this.editText == null || (TextUtils.isEmpty(this.editText.getText())) ? 0 : 1;
        if(this.editText == null || !this.editText.hasFocus()) {
            v2 = 0;
        }
        else {
        }

        boolean v3 = this.indicatorViewController.errorShouldBeShown();
        if(this.defaultHintTextColor != null) {
            this.collapsingTextHelper.setCollapsedTextColor(this.defaultHintTextColor);
            this.collapsingTextHelper.setExpandedTextColor(this.defaultHintTextColor);
        }

        if(!v0) {
            this.collapsingTextHelper.setCollapsedTextColor(ColorStateList.valueOf(this.disabledColor));
            this.collapsingTextHelper.setExpandedTextColor(ColorStateList.valueOf(this.disabledColor));
        }
        else if(v3) {
            this.collapsingTextHelper.setCollapsedTextColor(this.indicatorViewController.getErrorViewTextColors());
        }
        else {
            if((this.counterOverflowed) && this.counterView != null) {
                this.collapsingTextHelper.setCollapsedTextColor(this.counterView.getTextColors());
                goto label_60;
            }

            if(v2 == 0) {
                goto label_60;
            }

            if(this.focusedTextColor == null) {
                goto label_60;
            }

            this.collapsingTextHelper.setCollapsedTextColor(this.focusedTextColor);
        }

    label_60:
        if(v1 == 0) {
            if(this.isEnabled()) {
                if(v2 != 0) {
                    goto label_71;
                }
                else if(v3) {
                    goto label_71;
                }
            }

            if(!arg8 && (this.hintExpanded)) {
                return;
            }

            this.expandHint(arg7);
        }
        else {
        label_71:
            if(!arg8 && !this.hintExpanded) {
                return;
            }

            this.collapseHint(arg7);
        }
    }

    private void updatePasswordToggleView() {
        Drawable[] v0;
        if(this.editText == null) {
            return;
        }

        int v1 = 3;
        int v3 = 2;
        if(this.shouldShowPasswordIcon()) {
            if(this.passwordToggleView == null) {
                this.passwordToggleView = LayoutInflater.from(this.getContext()).inflate(R$layout.design_text_input_password_icon, this.inputFrame, false);
                this.passwordToggleView.setImageDrawable(this.passwordToggleDrawable);
                this.passwordToggleView.setContentDescription(this.passwordToggleContentDesc);
                this.inputFrame.addView(this.passwordToggleView);
                this.passwordToggleView.setOnClickListener(new View$OnClickListener() {
                    public void onClick(View arg2) {
                        TextInputLayout.this.passwordVisibilityToggleRequested(false);
                    }
                });
            }

            if(this.editText != null && ViewCompat.getMinimumHeight(this.editText) <= 0) {
                this.editText.setMinimumHeight(ViewCompat.getMinimumHeight(this.passwordToggleView));
            }

            this.passwordToggleView.setVisibility(0);
            this.passwordToggleView.setChecked(this.passwordToggledVisible);
            if(this.passwordToggleDummyDrawable == null) {
                this.passwordToggleDummyDrawable = new ColorDrawable();
            }

            this.passwordToggleDummyDrawable.setBounds(0, 0, this.passwordToggleView.getMeasuredWidth(), 1);
            v0 = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            if(v0[v3] != this.passwordToggleDummyDrawable) {
                this.originalEditTextEndDrawable = v0[v3];
            }

            TextViewCompat.setCompoundDrawablesRelative(this.editText, v0[0], v0[1], this.passwordToggleDummyDrawable, v0[v1]);
            this.passwordToggleView.setPadding(this.editText.getPaddingLeft(), this.editText.getPaddingTop(), this.editText.getPaddingRight(), this.editText.getPaddingBottom());
        }
        else {
            if(this.passwordToggleView != null && this.passwordToggleView.getVisibility() == 0) {
                this.passwordToggleView.setVisibility(8);
            }

            if(this.passwordToggleDummyDrawable == null) {
                return;
            }

            v0 = TextViewCompat.getCompoundDrawablesRelative(this.editText);
            if(v0[v3] != this.passwordToggleDummyDrawable) {
                return;
            }

            TextViewCompat.setCompoundDrawablesRelative(this.editText, v0[0], v0[1], this.originalEditTextEndDrawable, v0[v1]);
            this.passwordToggleDummyDrawable = null;
        }
    }

    private void updateTextInputBoxBounds() {
        if(this.boxBackgroundMode != 0 && this.boxBackground != null && this.editText != null) {
            if(this.getRight() == 0) {
            }
            else {
                int v0 = this.editText.getLeft();
                int v1 = this.calculateBoxBackgroundTop();
                int v2 = this.editText.getRight();
                int v3 = this.editText.getBottom() + this.boxBottomOffsetPx;
                int v5 = 2;
                if(this.boxBackgroundMode == v5) {
                    v0 += this.boxStrokeWidthFocusedPx / v5;
                    v1 -= this.boxStrokeWidthFocusedPx / v5;
                    v2 -= this.boxStrokeWidthFocusedPx / v5;
                    v3 += this.boxStrokeWidthFocusedPx / v5;
                }

                this.boxBackground.setBounds(v0, v1, v2, v3);
                this.applyBoxAttributes();
                this.updateEditTextBackgroundBounds();
                return;
            }
        }
    }

    void updateTextInputBoxState() {
        if(this.boxBackground != null) {
            if(this.boxBackgroundMode == 0) {
            }
            else {
                int v1 = 1;
                int v0 = this.editText == null || !this.editText.hasFocus() ? 0 : 1;
                if(this.editText == null || !this.editText.isHovered()) {
                    v1 = 0;
                }
                else {
                }

                if(this.boxBackgroundMode == 2) {
                    if(!this.isEnabled()) {
                        this.boxStrokeColor = this.disabledColor;
                    }
                    else if(this.indicatorViewController.errorShouldBeShown()) {
                        this.boxStrokeColor = this.indicatorViewController.getErrorViewCurrentTextColor();
                    }
                    else {
                        if((this.counterOverflowed) && this.counterView != null) {
                            this.boxStrokeColor = this.counterView.getCurrentTextColor();
                            goto label_55;
                        }

                        if(v0 != 0) {
                            this.boxStrokeColor = this.focusedStrokeColor;
                            goto label_55;
                        }

                        if(v1 != 0) {
                            this.boxStrokeColor = this.hoveredStrokeColor;
                            goto label_55;
                        }

                        this.boxStrokeColor = this.defaultStrokeColor;
                    }

                label_55:
                    if(v1 == 0 && v0 == 0) {
                        goto label_62;
                    }
                    else if(this.isEnabled()) {
                        this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
                    }
                    else {
                    label_62:
                        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
                    }

                    this.applyBoxAttributes();
                }

                return;
            }
        }
    }
}

