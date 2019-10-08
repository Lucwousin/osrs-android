package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.legacy.widget.Space;
import com.google.android.material.R$dimen;
import com.google.android.material.R$id;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.animation.AnimatorSetCompat;
import java.util.ArrayList;
import java.util.List;

final class IndicatorViewController {
    private static final int CAPTION_OPACITY_FADE_ANIMATION_DURATION = 0xA7;
    private static final int CAPTION_STATE_ERROR = 1;
    private static final int CAPTION_STATE_HELPER_TEXT = 2;
    private static final int CAPTION_STATE_NONE = 0;
    private static final int CAPTION_TRANSLATE_Y_ANIMATION_DURATION = 0xD9;
    static final int COUNTER_INDEX = 2;
    static final int ERROR_INDEX = 0;
    static final int HELPER_INDEX = 1;
    @Nullable private Animator captionAnimator;
    private FrameLayout captionArea;
    private int captionDisplayed;
    private int captionToShow;
    private final float captionTranslationYPx;
    private int captionViewsAdded;
    private final Context context;
    private boolean errorEnabled;
    private CharSequence errorText;
    private int errorTextAppearance;
    private TextView errorView;
    private CharSequence helperText;
    private boolean helperTextEnabled;
    private int helperTextTextAppearance;
    private TextView helperTextView;
    private LinearLayout indicatorArea;
    private int indicatorsAdded;
    private final TextInputLayout textInputView;
    private Typeface typeface;

    public IndicatorViewController(TextInputLayout arg2) {
        super();
        this.context = arg2.getContext();
        this.textInputView = arg2;
        this.captionTranslationYPx = ((float)this.context.getResources().getDimensionPixelSize(R$dimen.design_textinput_caption_translate_y));
    }

    static int access$002(IndicatorViewController arg0, int arg1) {
        arg0.captionDisplayed = arg1;
        return arg1;
    }

    static Animator access$102(IndicatorViewController arg0, Animator arg1) {
        arg0.captionAnimator = arg1;
        return arg1;
    }

    static TextView access$200(IndicatorViewController arg0) {
        return arg0.errorView;
    }

    void addIndicator(TextView arg7, int arg8) {
        if(this.indicatorArea == null && this.captionArea == null) {
            this.indicatorArea = new LinearLayout(this.context);
            this.indicatorArea.setOrientation(0);
            this.textInputView.addView(this.indicatorArea, -1, -2);
            this.captionArea = new FrameLayout(this.context);
            this.indicatorArea.addView(this.captionArea, -1, new FrameLayout$LayoutParams(-2, -2));
            this.indicatorArea.addView(new Space(this.context), new LinearLayout$LayoutParams(0, 0, 1f));
            if(this.textInputView.getEditText() != null) {
                this.adjustIndicatorPadding();
            }
        }

        if(this.isCaptionView(arg8)) {
            this.captionArea.setVisibility(0);
            this.captionArea.addView(((View)arg7));
            ++this.captionViewsAdded;
        }
        else {
            this.indicatorArea.addView(((View)arg7), arg8);
        }

        this.indicatorArea.setVisibility(0);
        ++this.indicatorsAdded;
    }

    void adjustIndicatorPadding() {
        if(this.canAdjustIndicatorPadding()) {
            ViewCompat.setPaddingRelative(this.indicatorArea, ViewCompat.getPaddingStart(this.textInputView.getEditText()), 0, ViewCompat.getPaddingEnd(this.textInputView.getEditText()), 0);
        }
    }

    private boolean canAdjustIndicatorPadding() {
        boolean v0 = this.indicatorArea == null || this.textInputView.getEditText() == null ? false : true;
        return v0;
    }

    void cancelCaptionAnimator() {
        if(this.captionAnimator != null) {
            this.captionAnimator.cancel();
        }
    }

    private void createCaptionAnimators(List arg1, boolean arg2, TextView arg3, int arg4, int arg5, int arg6) {
        if(arg3 != null) {
            if(!arg2) {
            }
            else {
                if(arg4 == arg6 || arg4 == arg5) {
                    arg2 = arg6 == arg4 ? true : false;
                    arg1.add(this.createCaptionOpacityAnimator(arg3, arg2));
                    if(arg6 != arg4) {
                        return;
                    }

                    arg1.add(this.createCaptionTranslationYAnimator(arg3));
                }

                return;
            }
        }
    }

    private ObjectAnimator createCaptionOpacityAnimator(TextView arg4, boolean arg5) {
        float v5 = arg5 ? 1f : 0f;
        ObjectAnimator v4 = ObjectAnimator.ofFloat(arg4, View.ALPHA, new float[]{v5});
        v4.setDuration(0xA7);
        v4.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return v4;
    }

    private ObjectAnimator createCaptionTranslationYAnimator(TextView arg5) {
        ObjectAnimator v5 = ObjectAnimator.ofFloat(arg5, View.TRANSLATION_Y, new float[]{-this.captionTranslationYPx, 0f});
        v5.setDuration(0xD9);
        v5.setInterpolator(AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR);
        return v5;
    }

    boolean errorIsDisplayed() {
        return this.isCaptionStateError(this.captionDisplayed);
    }

    boolean errorShouldBeShown() {
        return this.isCaptionStateError(this.captionToShow);
    }

    @Nullable private TextView getCaptionViewFromDisplayState(int arg1) {
        switch(arg1) {
            case 1: {
                goto label_5;
            }
            case 2: {
                goto label_3;
            }
        }

        return null;
    label_3:
        return this.helperTextView;
    label_5:
        return this.errorView;
    }

    CharSequence getErrorText() {
        return this.errorText;
    }

    @ColorInt int getErrorViewCurrentTextColor() {
        int v0 = this.errorView != null ? this.errorView.getCurrentTextColor() : -1;
        return v0;
    }

    @Nullable ColorStateList getErrorViewTextColors() {
        ColorStateList v0 = this.errorView != null ? this.errorView.getTextColors() : null;
        return v0;
    }

    CharSequence getHelperText() {
        return this.helperText;
    }

    @Nullable ColorStateList getHelperTextViewColors() {
        ColorStateList v0 = this.helperTextView != null ? this.helperTextView.getTextColors() : null;
        return v0;
    }

    @ColorInt int getHelperTextViewCurrentTextColor() {
        int v0 = this.helperTextView != null ? this.helperTextView.getCurrentTextColor() : -1;
        return v0;
    }

    boolean helperTextIsDisplayed() {
        return this.isCaptionStateHelperText(this.captionDisplayed);
    }

    boolean helperTextShouldBeShown() {
        return this.isCaptionStateHelperText(this.captionToShow);
    }

    void hideError() {
        CharSequence v0 = null;
        this.errorText = v0;
        this.cancelCaptionAnimator();
        if(this.captionDisplayed == 1) {
            if((this.helperTextEnabled) && !TextUtils.isEmpty(this.helperText)) {
                this.captionToShow = 2;
                goto label_16;
            }

            this.captionToShow = 0;
        }

    label_16:
        this.updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, this.shouldAnimateCaptionView(this.errorView, v0));
    }

    void hideHelperText() {
        this.cancelCaptionAnimator();
        if(this.captionDisplayed == 2) {
            this.captionToShow = 0;
        }

        this.updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, this.shouldAnimateCaptionView(this.helperTextView, null));
    }

    private boolean isCaptionStateError(int arg2) {
        boolean v0 = true;
        if(arg2 != 1 || this.errorView == null || (TextUtils.isEmpty(this.errorText))) {
            v0 = false;
        }
        else {
        }

        return v0;
    }

    private boolean isCaptionStateHelperText(int arg2) {
        boolean v2 = arg2 != 2 || this.helperTextView == null || (TextUtils.isEmpty(this.helperText)) ? false : true;
        return v2;
    }

    boolean isCaptionView(int arg2) {
        boolean v0 = true;
        if(arg2 != 0) {
            if(arg2 == 1) {
            }
            else {
                v0 = false;
            }
        }

        return v0;
    }

    boolean isErrorEnabled() {
        return this.errorEnabled;
    }

    boolean isHelperTextEnabled() {
        return this.helperTextEnabled;
    }

    void removeIndicator(TextView arg2, int arg3) {
        if(this.indicatorArea == null) {
            return;
        }

        if(!this.isCaptionView(arg3) || this.captionArea == null) {
            this.indicatorArea.removeView(((View)arg2));
        }
        else {
            --this.captionViewsAdded;
            this.setViewGroupGoneIfEmpty(this.captionArea, this.captionViewsAdded);
            this.captionArea.removeView(((View)arg2));
        }

        --this.indicatorsAdded;
        this.setViewGroupGoneIfEmpty(this.indicatorArea, this.indicatorsAdded);
    }

    private void setCaptionViewVisibilities(int arg3, int arg4) {
        TextView v0;
        if(arg3 == arg4) {
            return;
        }

        if(arg4 != 0) {
            v0 = this.getCaptionViewFromDisplayState(arg4);
            if(v0 != null) {
                v0.setVisibility(0);
                v0.setAlpha(1f);
            }
        }

        if(arg3 != 0) {
            v0 = this.getCaptionViewFromDisplayState(arg3);
            if(v0 != null) {
                v0.setVisibility(4);
                if(arg3 == 1) {
                    v0.setText(null);
                }
            }
        }

        this.captionDisplayed = arg4;
    }

    void setErrorEnabled(boolean arg4) {
        if(this.errorEnabled == arg4) {
            return;
        }

        this.cancelCaptionAnimator();
        if(arg4) {
            this.errorView = new AppCompatTextView(this.context);
            this.errorView.setId(R$id.textinput_error);
            if(this.typeface != null) {
                this.errorView.setTypeface(this.typeface);
            }

            this.setErrorTextAppearance(this.errorTextAppearance);
            this.errorView.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(this.errorView, 1);
            this.addIndicator(this.errorView, 0);
        }
        else {
            this.hideError();
            this.removeIndicator(this.errorView, 0);
            this.errorView = null;
            this.textInputView.updateEditTextBackground();
            this.textInputView.updateTextInputBoxState();
        }

        this.errorEnabled = arg4;
    }

    void setErrorTextAppearance(@StyleRes int arg3) {
        this.errorTextAppearance = arg3;
        if(this.errorView != null) {
            this.textInputView.setTextAppearanceCompatWithErrorFallback(this.errorView, arg3);
        }
    }

    void setErrorViewTextColor(@Nullable ColorStateList arg2) {
        if(this.errorView != null) {
            this.errorView.setTextColor(arg2);
        }
    }

    void setHelperTextAppearance(@StyleRes int arg2) {
        this.helperTextTextAppearance = arg2;
        if(this.helperTextView != null) {
            TextViewCompat.setTextAppearance(this.helperTextView, arg2);
        }
    }

    void setHelperTextEnabled(boolean arg4) {
        if(this.helperTextEnabled == arg4) {
            return;
        }

        this.cancelCaptionAnimator();
        if(arg4) {
            this.helperTextView = new AppCompatTextView(this.context);
            this.helperTextView.setId(R$id.textinput_helper_text);
            if(this.typeface != null) {
                this.helperTextView.setTypeface(this.typeface);
            }

            this.helperTextView.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(this.helperTextView, 1);
            this.setHelperTextAppearance(this.helperTextTextAppearance);
            this.addIndicator(this.helperTextView, 1);
        }
        else {
            this.hideHelperText();
            this.removeIndicator(this.helperTextView, 1);
            this.helperTextView = null;
            this.textInputView.updateEditTextBackground();
            this.textInputView.updateTextInputBoxState();
        }

        this.helperTextEnabled = arg4;
    }

    void setHelperTextViewTextColor(@Nullable ColorStateList arg2) {
        if(this.helperTextView != null) {
            this.helperTextView.setTextColor(arg2);
        }
    }

    private void setTextViewTypeface(@Nullable TextView arg1, Typeface arg2) {
        if(arg1 != null) {
            arg1.setTypeface(arg2);
        }
    }

    void setTypefaces(Typeface arg2) {
        if(arg2 != this.typeface) {
            this.typeface = arg2;
            this.setTextViewTypeface(this.errorView, arg2);
            this.setTextViewTypeface(this.helperTextView, arg2);
        }
    }

    private void setViewGroupGoneIfEmpty(ViewGroup arg1, int arg2) {
        if(arg2 == 0) {
            arg1.setVisibility(8);
        }
    }

    private boolean shouldAnimateCaptionView(TextView arg3, @Nullable CharSequence arg4) {
        boolean v3;
        if(!ViewCompat.isLaidOut(this.textInputView) || !this.textInputView.isEnabled()) {
        label_15:
            v3 = false;
        }
        else {
            if(this.captionToShow == this.captionDisplayed && arg3 != null && (TextUtils.equals(arg3.getText(), arg4))) {
                goto label_15;
            }

            v3 = true;
        }

        return v3;
    }

    void showError(CharSequence arg4) {
        this.cancelCaptionAnimator();
        this.errorText = arg4;
        this.errorView.setText(arg4);
        if(this.captionDisplayed != 1) {
            this.captionToShow = 1;
        }

        this.updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, this.shouldAnimateCaptionView(this.errorView, arg4));
    }

    void showHelper(CharSequence arg4) {
        this.cancelCaptionAnimator();
        this.helperText = arg4;
        this.helperTextView.setText(arg4);
        int v1 = 2;
        if(this.captionDisplayed != v1) {
            this.captionToShow = v1;
        }

        this.updateCaptionViewsVisibility(this.captionDisplayed, this.captionToShow, this.shouldAnimateCaptionView(this.helperTextView, arg4));
    }

    private void updateCaptionViewsVisibility(int arg10, int arg11, boolean arg12) {
        if(arg12) {
            AnimatorSet v7 = new AnimatorSet();
            this.captionAnimator = ((Animator)v7);
            ArrayList v8 = new ArrayList();
            this.createCaptionAnimators(v8, this.helperTextEnabled, this.helperTextView, 2, arg10, arg11);
            this.createCaptionAnimators(v8, this.errorEnabled, this.errorView, 1, arg10, arg11);
            AnimatorSetCompat.playTogether(v7, ((List)v8));
            v7.addListener(new AnimatorListenerAdapter(arg11, this.getCaptionViewFromDisplayState(arg10), arg10, this.getCaptionViewFromDisplayState(arg11)) {
                public void onAnimationEnd(Animator arg3) {
                    IndicatorViewController.this.captionDisplayed = this.val$captionToShow;
                    Animator v0 = null;
                    IndicatorViewController.this.captionAnimator = v0;
                    if(this.val$captionViewToHide != null) {
                        this.val$captionViewToHide.setVisibility(4);
                        if(this.val$captionToHide == 1 && IndicatorViewController.this.errorView != null) {
                            IndicatorViewController.this.errorView.setText(((CharSequence)v0));
                        }
                    }
                }

                public void onAnimationStart(Animator arg2) {
                    if(this.val$captionViewToShow != null) {
                        this.val$captionViewToShow.setVisibility(0);
                    }
                }
            });
            v7.start();
        }
        else {
            this.setCaptionViewVisibilities(arg10, arg11);
        }

        this.textInputView.updateEditTextBackground();
        this.textInputView.updateLabelState(arg12);
        this.textInputView.updateTextInputBoxState();
    }
}

