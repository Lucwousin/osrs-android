package com.google.android.material.chip;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils$TruncateAt;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.widget.CompoundButton;
import android.widget.TextView$BufferType;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.res.ResourcesCompat$FontCallback;
import androidx.core.text.BidiFormatter;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R$attr;
import com.google.android.material.R$string;
import com.google.android.material.R$style;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

public class Chip extends AppCompatCheckBox implements Delegate {
    class com.google.android.material.chip.Chip$1 extends FontCallback {
        com.google.android.material.chip.Chip$1(Chip arg1) {
            Chip.this = arg1;
            super();
        }

        public void onFontRetrievalFailed(int arg1) {
        }

        public void onFontRetrieved(@NonNull Typeface arg2) {
            Chip.this.setText(Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class ChipTouchHelper extends ExploreByTouchHelper {
        ChipTouchHelper(Chip arg1, Chip arg2) {
            Chip.this = arg1;
            super(((View)arg2));
        }

        protected int getVirtualViewAt(float arg2, float arg3) {
            int v2 = !Chip.this.hasCloseIcon() || !Chip.this.getCloseIconTouchBounds().contains(arg2, arg3) ? -1 : 0;
            return v2;
        }

        protected void getVisibleVirtualViews(List arg2) {
            if(Chip.this.hasCloseIcon()) {
                arg2.add(Integer.valueOf(0));
            }
        }

        protected boolean onPerformActionForVirtualView(int arg1, int arg2, Bundle arg3) {
            if(arg2 == 16 && arg1 == 0) {
                return Chip.this.performCloseIconClick();
            }

            return 0;
        }

        protected void onPopulateNodeForHost(AccessibilityNodeInfoCompat arg4) {
            boolean v0 = Chip.this.chipDrawable == null || !Chip.this.chipDrawable.isCheckable() ? false : true;
            arg4.setCheckable(v0);
            arg4.setClassName(Chip.class.getName());
            CharSequence v0_1 = Chip.this.getText();
            if(Build$VERSION.SDK_INT >= 23) {
                arg4.setText(v0_1);
            }
            else {
                arg4.setContentDescription(v0_1);
            }
        }

        protected void onPopulateNodeForVirtualView(int arg6, AccessibilityNodeInfoCompat arg7) {
            String v6_1;
            if(Chip.this.hasCloseIcon()) {
                CharSequence v6 = Chip.this.getCloseIconContentDescription();
                if(v6 != null) {
                    arg7.setContentDescription(v6);
                }
                else {
                    v6 = Chip.this.getText();
                    Context v0 = Chip.this.getContext();
                    int v1 = R$string.mtrl_chip_close_icon_content_description;
                    Object[] v2 = new Object[1];
                    if(!TextUtils.isEmpty(v6)) {
                    }
                    else {
                        v6_1 = "";
                    }

                    v2[0] = ((CharSequence)v6_1);
                    arg7.setContentDescription(v0.getString(v1, v2).trim());
                }

                arg7.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
                arg7.addAction(AccessibilityActionCompat.ACTION_CLICK);
                arg7.setEnabled(Chip.this.isEnabled());
            }
            else {
                arg7.setContentDescription("");
                arg7.setBoundsInParent(Chip.EMPTY_BOUNDS);
            }
        }
    }

    private static final int CLOSE_ICON_VIRTUAL_ID = 0;
    private static final Rect EMPTY_BOUNDS = null;
    private static final String NAMESPACE_ANDROID = "http://schemas.android.com/apk/res/android";
    private static final int[] SELECTED_STATE = null;
    private static final String TAG = "Chip";
    @Nullable private ChipDrawable chipDrawable;
    private boolean closeIconFocused;
    private boolean closeIconHovered;
    private boolean closeIconPressed;
    private boolean deferredCheckedValue;
    private int focusedVirtualView;
    private final FontCallback fontCallback;
    @Nullable private CompoundButton$OnCheckedChangeListener onCheckedChangeListenerInternal;
    @Nullable private View$OnClickListener onCloseIconClickListener;
    private final Rect rect;
    private final RectF rectF;
    @Nullable private RippleDrawable ripple;
    private final ChipTouchHelper touchHelper;

    static {
        Chip.EMPTY_BOUNDS = new Rect();
        Chip.SELECTED_STATE = new int[]{0x10100A1};
    }

    public Chip(Context arg2) {
        this(arg2, null);
    }

    public Chip(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.chipStyle);
    }

    public Chip(Context arg2, AttributeSet arg3, int arg4) {
        super(arg2, arg3, arg4);
        this.focusedVirtualView = 0x80000000;
        this.rect = new Rect();
        this.rectF = new RectF();
        this.fontCallback = new com.google.android.material.chip.Chip$1(this);
        this.validateAttributes(arg3);
        ChipDrawable v2 = ChipDrawable.createFromAttributes(arg2, arg3, arg4, R$style.Widget_MaterialComponents_Chip_Action);
        this.setChipDrawable(v2);
        this.touchHelper = new ChipTouchHelper(this, this);
        ViewCompat.setAccessibilityDelegate(((View)this), this.touchHelper);
        this.initOutlineProvider();
        this.setChecked(this.deferredCheckedValue);
        v2.setShouldDrawText(false);
        this.setText(v2.getText());
        this.setEllipsize(v2.getEllipsize());
        this.setIncludeFontPadding(false);
        if(this.getTextAppearance() != null) {
            this.updateTextPaintDrawState(this.getTextAppearance());
        }

        this.setSingleLine();
        this.setGravity(0x800013);
        this.updatePaddingInternal();
    }

    static ChipDrawable access$000(Chip arg0) {
        return arg0.chipDrawable;
    }

    static boolean access$100(Chip arg0) {
        return arg0.hasCloseIcon();
    }

    static RectF access$200(Chip arg0) {
        return arg0.getCloseIconTouchBounds();
    }

    static Rect access$300(Chip arg0) {
        return arg0.getCloseIconTouchBoundsInt();
    }

    static Rect access$400() {
        return Chip.EMPTY_BOUNDS;
    }

    private void applyChipDrawable(@NonNull ChipDrawable arg1) {
        arg1.setDelegate(((Delegate)this));
    }

    private float calculateTextOffsetFromStart(@NonNull ChipDrawable arg2) {
        float v0 = this.getChipStartPadding() + arg2.calculateChipIconWidth() + this.getTextStartPadding();
        if(ViewCompat.getLayoutDirection(((View)this)) == 0) {
            return v0;
        }

        return -v0;
    }

    private int[] createCloseIconDrawableState() {
        int v1 = 0;
        int v0 = this.isEnabled() ? 1 : 0;
        if(this.closeIconFocused) {
            ++v0;
        }

        if(this.closeIconHovered) {
            ++v0;
        }

        if(this.closeIconPressed) {
            ++v0;
        }

        if(this.isChecked()) {
            ++v0;
        }

        int[] v0_1 = new int[v0];
        if(this.isEnabled()) {
            v0_1[0] = 0x101009E;
            v1 = 1;
        }

        if(this.closeIconFocused) {
            v0_1[v1] = 0x101009C;
            ++v1;
        }

        if(this.closeIconHovered) {
            v0_1[v1] = 0x1010367;
            ++v1;
        }

        if(this.closeIconPressed) {
            v0_1[v1] = 0x10100A7;
            ++v1;
        }

        if(this.isChecked()) {
            v0_1[v1] = 0x10100A1;
        }

        return v0_1;
    }

    protected boolean dispatchHoverEvent(MotionEvent arg2) {
        boolean v2 = (this.handleAccessibilityExit(arg2)) || (this.touchHelper.dispatchHoverEvent(arg2)) || (super.dispatchHoverEvent(arg2)) ? true : false;
        return v2;
    }

    public boolean dispatchKeyEvent(KeyEvent arg2) {
        boolean v2 = (this.touchHelper.dispatchKeyEvent(arg2)) || (super.dispatchKeyEvent(arg2)) ? true : false;
        return v2;
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        boolean v0 = this.chipDrawable == null || !this.chipDrawable.isCloseIconStateful() ? false : this.chipDrawable.setCloseIconState(this.createCloseIconDrawableState());
        if(v0) {
            this.invalidate();
        }
    }

    private void ensureFocus() {
        if(this.focusedVirtualView == 0x80000000) {
            this.setFocusedVirtualView(-1);
        }
    }

    @Nullable public Drawable getCheckedIcon() {
        Drawable v0 = this.chipDrawable != null ? this.chipDrawable.getCheckedIcon() : null;
        return v0;
    }

    @Nullable public ColorStateList getChipBackgroundColor() {
        ColorStateList v0 = this.chipDrawable != null ? this.chipDrawable.getChipBackgroundColor() : null;
        return v0;
    }

    public float getChipCornerRadius() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getChipCornerRadius() : 0f;
        return v0;
    }

    public Drawable getChipDrawable() {
        return this.chipDrawable;
    }

    public float getChipEndPadding() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getChipEndPadding() : 0f;
        return v0;
    }

    @Nullable public Drawable getChipIcon() {
        Drawable v0 = this.chipDrawable != null ? this.chipDrawable.getChipIcon() : null;
        return v0;
    }

    public float getChipIconSize() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getChipIconSize() : 0f;
        return v0;
    }

    @Nullable public ColorStateList getChipIconTint() {
        ColorStateList v0 = this.chipDrawable != null ? this.chipDrawable.getChipIconTint() : null;
        return v0;
    }

    public float getChipMinHeight() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getChipMinHeight() : 0f;
        return v0;
    }

    public float getChipStartPadding() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getChipStartPadding() : 0f;
        return v0;
    }

    @Nullable public ColorStateList getChipStrokeColor() {
        ColorStateList v0 = this.chipDrawable != null ? this.chipDrawable.getChipStrokeColor() : null;
        return v0;
    }

    public float getChipStrokeWidth() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getChipStrokeWidth() : 0f;
        return v0;
    }

    @Deprecated public CharSequence getChipText() {
        return this.getText();
    }

    @Nullable public Drawable getCloseIcon() {
        Drawable v0 = this.chipDrawable != null ? this.chipDrawable.getCloseIcon() : null;
        return v0;
    }

    @Nullable public CharSequence getCloseIconContentDescription() {
        CharSequence v0 = this.chipDrawable != null ? this.chipDrawable.getCloseIconContentDescription() : null;
        return v0;
    }

    public float getCloseIconEndPadding() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getCloseIconEndPadding() : 0f;
        return v0;
    }

    public float getCloseIconSize() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getCloseIconSize() : 0f;
        return v0;
    }

    public float getCloseIconStartPadding() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getCloseIconStartPadding() : 0f;
        return v0;
    }

    @Nullable public ColorStateList getCloseIconTint() {
        ColorStateList v0 = this.chipDrawable != null ? this.chipDrawable.getCloseIconTint() : null;
        return v0;
    }

    private RectF getCloseIconTouchBounds() {
        this.rectF.setEmpty();
        if(this.hasCloseIcon()) {
            this.chipDrawable.getCloseIconTouchBounds(this.rectF);
        }

        return this.rectF;
    }

    private Rect getCloseIconTouchBoundsInt() {
        RectF v0 = this.getCloseIconTouchBounds();
        this.rect.set(((int)v0.left), ((int)v0.top), ((int)v0.right), ((int)v0.bottom));
        return this.rect;
    }

    public TextUtils$TruncateAt getEllipsize() {
        TextUtils$TruncateAt v0 = this.chipDrawable != null ? this.chipDrawable.getEllipsize() : null;
        return v0;
    }

    public void getFocusedRect(Rect arg2) {
        if(this.focusedVirtualView == 0) {
            arg2.set(this.getCloseIconTouchBoundsInt());
        }
        else {
            super.getFocusedRect(arg2);
        }
    }

    @Nullable public MotionSpec getHideMotionSpec() {
        MotionSpec v0 = this.chipDrawable != null ? this.chipDrawable.getHideMotionSpec() : null;
        return v0;
    }

    public float getIconEndPadding() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getIconEndPadding() : 0f;
        return v0;
    }

    public float getIconStartPadding() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getIconStartPadding() : 0f;
        return v0;
    }

    @Nullable public ColorStateList getRippleColor() {
        ColorStateList v0 = this.chipDrawable != null ? this.chipDrawable.getRippleColor() : null;
        return v0;
    }

    @Nullable public MotionSpec getShowMotionSpec() {
        MotionSpec v0 = this.chipDrawable != null ? this.chipDrawable.getShowMotionSpec() : null;
        return v0;
    }

    public CharSequence getText() {
        CharSequence v0;
        if(this.chipDrawable != null) {
            v0 = this.chipDrawable.getText();
        }
        else {
            String v0_1 = "";
        }

        return v0;
    }

    @Nullable private TextAppearance getTextAppearance() {
        TextAppearance v0 = this.chipDrawable != null ? this.chipDrawable.getTextAppearance() : null;
        return v0;
    }

    public float getTextEndPadding() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getTextEndPadding() : 0f;
        return v0;
    }

    public float getTextStartPadding() {
        float v0 = this.chipDrawable != null ? this.chipDrawable.getTextStartPadding() : 0f;
        return v0;
    }

    @SuppressLint(value={"PrivateApi"}) private boolean handleAccessibilityExit(MotionEvent arg7) {
        if(arg7.getAction() == 10) {
            try {
                Field v7_4 = ExploreByTouchHelper.class.getDeclaredField("mHoveredVirtualViewId");
                v7_4.setAccessible(true);
                int v2 = 0x80000000;
                if(v7_4.get(this.touchHelper).intValue() == v2) {
                    return 0;
                }

                Method v7_5 = ExploreByTouchHelper.class.getDeclaredMethod("updateHoveredVirtualView", Integer.TYPE);
                v7_5.setAccessible(true);
                v7_5.invoke(this.touchHelper, Integer.valueOf(v2));
                return 1;
            }
            catch(NoSuchFieldException v7) {
                Log.e("Chip", "Unable to send Accessibility Exit event", ((Throwable)v7));
            }
            catch(InvocationTargetException v7_1) {
                Log.e("Chip", "Unable to send Accessibility Exit event", ((Throwable)v7_1));
            }
            catch(IllegalAccessException v7_2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", ((Throwable)v7_2));
            }
            catch(NoSuchMethodException v7_3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", ((Throwable)v7_3));
            }
        }

        return 0;
    }

    private boolean hasCloseIcon() {
        boolean v0 = this.chipDrawable == null || this.chipDrawable.getCloseIcon() == null ? false : true;
        return v0;
    }

    private void initOutlineProvider() {
        if(Build$VERSION.SDK_INT >= 21) {
            this.setOutlineProvider(new ViewOutlineProvider() {
                @TargetApi(value=21) public void getOutline(View arg1, Outline arg2) {
                    if(Chip.this.chipDrawable != null) {
                        Chip.this.chipDrawable.getOutline(arg2);
                    }
                    else {
                        arg2.setAlpha(0f);
                    }
                }
            });
        }
    }

    public boolean isCheckable() {
        boolean v0 = this.chipDrawable == null || !this.chipDrawable.isCheckable() ? false : true;
        return v0;
    }

    @Deprecated public boolean isCheckedIconEnabled() {
        return this.isCheckedIconVisible();
    }

    public boolean isCheckedIconVisible() {
        boolean v0 = this.chipDrawable == null || !this.chipDrawable.isCheckedIconVisible() ? false : true;
        return v0;
    }

    @Deprecated public boolean isChipIconEnabled() {
        return this.isChipIconVisible();
    }

    public boolean isChipIconVisible() {
        boolean v0 = this.chipDrawable == null || !this.chipDrawable.isChipIconVisible() ? false : true;
        return v0;
    }

    @Deprecated public boolean isCloseIconEnabled() {
        return this.isCloseIconVisible();
    }

    public boolean isCloseIconVisible() {
        boolean v0 = this.chipDrawable == null || !this.chipDrawable.isCloseIconVisible() ? false : true;
        return v0;
    }

    private boolean moveFocus(boolean arg4) {
        this.ensureFocus();
        boolean v0 = true;
        int v1 = -1;
        if(arg4) {
            if(this.focusedVirtualView == v1) {
                this.setFocusedVirtualView(0);
            }
            else {
                goto label_13;
            }
        }
        else if(this.focusedVirtualView == 0) {
            this.setFocusedVirtualView(v1);
        }
        else {
        label_13:
            v0 = false;
        }

        return v0;
    }

    public void onChipDrawableSizeChange() {
        this.updatePaddingInternal();
        this.requestLayout();
        if(Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }

    protected int[] onCreateDrawableState(int arg2) {
        int[] v2 = super.onCreateDrawableState(arg2 + 1);
        if(this.isChecked()) {
            Chip.mergeDrawableStates(v2, Chip.SELECTED_STATE);
        }

        return v2;
    }

    protected void onDraw(Canvas arg4) {
        if(!TextUtils.isEmpty(this.getText()) && this.chipDrawable != null) {
            if(this.chipDrawable.shouldDrawText()) {
            }
            else {
                int v0 = arg4.save();
                arg4.translate(this.calculateTextOffsetFromStart(this.chipDrawable), 0f);
                super.onDraw(arg4);
                arg4.restoreToCount(v0);
                return;
            }
        }

        super.onDraw(arg4);
    }

    protected void onFocusChanged(boolean arg2, int arg3, Rect arg4) {
        if(arg2) {
            this.setFocusedVirtualView(-1);
        }
        else {
            this.setFocusedVirtualView(0x80000000);
        }

        this.invalidate();
        super.onFocusChanged(arg2, arg3, arg4);
        this.touchHelper.onFocusChanged(arg2, arg3, arg4);
    }

    public boolean onHoverEvent(MotionEvent arg4) {
        int v0 = arg4.getActionMasked();
        if(v0 == 7) {
            this.setCloseIconHovered(this.getCloseIconTouchBounds().contains(arg4.getX(), arg4.getY()));
        }
        else if(v0 != 10) {
        }
        else {
            this.setCloseIconHovered(false);
        }

        return super.onHoverEvent(arg4);
    }

    public boolean onKeyDown(int arg7, KeyEvent arg8) {
        View v4_1;
        int v0 = arg8.getKeyCode();
        boolean v2 = false;
        if(v0 != 61) {
            if(v0 != 66) {
                switch(v0) {
                    case 21: {
                        goto label_15;
                    }
                    case 22: {
                        goto label_9;
                    }
                    case 23: {
                        goto label_20;
                    }
                }

                goto label_47;
            label_9:
                if(arg8.hasNoModifiers()) {
                    v2 = this.moveFocus(ViewUtils.isLayoutRtl(((View)this)) ^ 1);
                    goto label_47;
                label_15:
                    if(arg8.hasNoModifiers()) {
                        v2 = this.moveFocus(ViewUtils.isLayoutRtl(((View)this)));
                    }
                    else {
                    }
                }
                else {
                }

                goto label_47;
            }

        label_20:
            switch(this.focusedVirtualView) {
                case -1: {
                    goto label_25;
                }
                case 0: {
                    goto label_23;
                }
            }

            goto label_47;
        label_23:
            this.performCloseIconClick();
            return 1;
        label_25:
            this.performClick();
            return 1;
        }
        else {
            if(arg8.hasNoModifiers()) {
                v0 = 2;
            }
            else if(arg8.hasModifiers(1)) {
                v0 = 1;
            }
            else {
                v0 = 0;
            }

            if(v0 == 0) {
                goto label_47;
            }

            ViewParent v1 = this.getParent();
            Chip v4 = this;
            do {
                v4_1 = ((View)v4).focusSearch(v0);
                if(v4_1 == null) {
                    break;
                }

                if((((Chip)v4_1)) == this) {
                    break;
                }
            }
            while(v4_1.getParent() == v1);

            if(v4_1 == null) {
                goto label_47;
            }

            v4_1.requestFocus();
            return 1;
        }

    label_47:
        if(v2) {
            this.invalidate();
            return 1;
        }

        return super.onKeyDown(arg7, arg8);
    }

    @TargetApi(value=24) public PointerIcon onResolvePointerIcon(MotionEvent arg2, int arg3) {
        if((this.getCloseIconTouchBounds().contains(arg2.getX(), arg2.getY())) && (this.isEnabled())) {
            return PointerIcon.getSystemIcon(this.getContext(), 1002);
        }

        return null;
    }

    public boolean onTouchEvent(MotionEvent arg5) {
        int v0 = arg5.getActionMasked();
        boolean v1 = this.getCloseIconTouchBounds().contains(arg5.getX(), arg5.getY());
        boolean v2 = false;
        switch(v0) {
            case 0: {
                goto label_22;
            }
            case 1: {
                goto label_14;
            }
            case 2: {
                goto label_9;
            }
            case 3: {
                goto label_19;
            }
        }

        goto label_26;
    label_22:
        if(!v1) {
            goto label_26;
        }

        this.setCloseIconPressed(true);
        goto label_24;
    label_9:
        if(this.closeIconPressed) {
            if(!v1) {
                this.setCloseIconPressed(false);
            }

        label_24:
            v0 = 1;
            goto label_27;
        }

    label_26:
        v0 = 0;
        goto label_27;
    label_14:
        if(this.closeIconPressed) {
            this.performCloseIconClick();
            v0 = 1;
        }
        else {
        label_19:
            v0 = 0;
        }

        this.setCloseIconPressed(false);
    label_27:
        if(v0 != 0 || (super.onTouchEvent(arg5))) {
            v2 = true;
        }

        return v2;
    }

    @CallSuper public boolean performCloseIconClick() {
        boolean v1;
        this.playSoundEffect(0);
        if(this.onCloseIconClickListener != null) {
            this.onCloseIconClickListener.onClick(((View)this));
            v1 = true;
        }
        else {
            v1 = false;
        }

        this.touchHelper.sendEventForVirtualView(0, 1);
        return v1;
    }

    public void setBackground(Drawable arg2) {
        if(arg2 != this.chipDrawable) {
            if(arg2 == this.ripple) {
            }
            else {
                throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
            }
        }

        super.setBackground(arg2);
    }

    public void setBackgroundColor(int arg2) {
        throw new UnsupportedOperationException("Do not set the background color; Chip manages its own background drawable.");
    }

    public void setBackgroundDrawable(Drawable arg2) {
        if(arg2 != this.chipDrawable) {
            if(arg2 == this.ripple) {
            }
            else {
                throw new UnsupportedOperationException("Do not set the background drawable; Chip manages its own background drawable.");
            }
        }

        super.setBackgroundDrawable(arg2);
    }

    public void setBackgroundResource(int arg2) {
        throw new UnsupportedOperationException("Do not set the background resource; Chip manages its own background drawable.");
    }

    public void setBackgroundTintList(@Nullable ColorStateList arg2) {
        throw new UnsupportedOperationException("Do not set the background tint list; Chip manages its own background drawable.");
    }

    public void setBackgroundTintMode(@Nullable PorterDuff$Mode arg2) {
        throw new UnsupportedOperationException("Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCheckable(arg2);
        }
    }

    public void setCheckableResource(@BoolRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCheckableResource(arg2);
        }
    }

    public void setChecked(boolean arg2) {
        if(this.chipDrawable == null) {
            this.deferredCheckedValue = arg2;
        }
        else if(this.chipDrawable.isCheckable()) {
            boolean v0 = this.isChecked();
            super.setChecked(arg2);
            if(v0 != arg2 && this.onCheckedChangeListenerInternal != null) {
                this.onCheckedChangeListenerInternal.onCheckedChanged(((CompoundButton)this), arg2);
            }
        }
    }

    public void setCheckedIcon(@Nullable Drawable arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCheckedIcon(arg2);
        }
    }

    @Deprecated public void setCheckedIconEnabled(boolean arg1) {
        this.setCheckedIconVisible(arg1);
    }

    @Deprecated public void setCheckedIconEnabledResource(@BoolRes int arg1) {
        this.setCheckedIconVisible(arg1);
    }

    public void setCheckedIconResource(@DrawableRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCheckedIconResource(arg2);
        }
    }

    public void setCheckedIconVisible(boolean arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCheckedIconVisible(arg2);
        }
    }

    public void setCheckedIconVisible(@BoolRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCheckedIconVisible(arg2);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipBackgroundColor(arg2);
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipBackgroundColorResource(arg2);
        }
    }

    public void setChipCornerRadius(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipCornerRadius(arg2);
        }
    }

    public void setChipCornerRadiusResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipCornerRadiusResource(arg2);
        }
    }

    public void setChipDrawable(@NonNull ChipDrawable arg4) {
        if(this.chipDrawable != arg4) {
            this.unapplyChipDrawable(this.chipDrawable);
            this.chipDrawable = arg4;
            this.applyChipDrawable(this.chipDrawable);
            if(RippleUtils.USE_FRAMEWORK_RIPPLE) {
                this.ripple = new RippleDrawable(RippleUtils.convertToRippleDrawableColor(this.chipDrawable.getRippleColor()), this.chipDrawable, null);
                this.chipDrawable.setUseCompatRipple(false);
                ViewCompat.setBackground(((View)this), this.ripple);
            }
            else {
                this.chipDrawable.setUseCompatRipple(true);
                ViewCompat.setBackground(((View)this), this.chipDrawable);
            }
        }
    }

    public void setChipEndPadding(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipEndPadding(arg2);
        }
    }

    public void setChipEndPaddingResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipEndPaddingResource(arg2);
        }
    }

    public void setChipIcon(@Nullable Drawable arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipIcon(arg2);
        }
    }

    @Deprecated public void setChipIconEnabled(boolean arg1) {
        this.setChipIconVisible(arg1);
    }

    @Deprecated public void setChipIconEnabledResource(@BoolRes int arg1) {
        this.setChipIconVisible(arg1);
    }

    public void setChipIconResource(@DrawableRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipIconResource(arg2);
        }
    }

    public void setChipIconSize(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipIconSize(arg2);
        }
    }

    public void setChipIconSizeResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipIconSizeResource(arg2);
        }
    }

    public void setChipIconTint(@Nullable ColorStateList arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipIconTint(arg2);
        }
    }

    public void setChipIconTintResource(@ColorRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipIconTintResource(arg2);
        }
    }

    public void setChipIconVisible(boolean arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipIconVisible(arg2);
        }
    }

    public void setChipIconVisible(@BoolRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipIconVisible(arg2);
        }
    }

    public void setChipMinHeight(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipMinHeight(arg2);
        }
    }

    public void setChipMinHeightResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipMinHeightResource(arg2);
        }
    }

    public void setChipStartPadding(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipStartPadding(arg2);
        }
    }

    public void setChipStartPaddingResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipStartPaddingResource(arg2);
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipStrokeColor(arg2);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipStrokeColorResource(arg2);
        }
    }

    public void setChipStrokeWidth(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipStrokeWidth(arg2);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setChipStrokeWidthResource(arg2);
        }
    }

    @Deprecated public void setChipText(@Nullable CharSequence arg1) {
        this.setText(arg1);
    }

    @Deprecated public void setChipTextResource(@StringRes int arg2) {
        this.setText(this.getResources().getString(arg2));
    }

    public void setCloseIcon(@Nullable Drawable arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIcon(arg2);
        }
    }

    public void setCloseIconContentDescription(@Nullable CharSequence arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIconContentDescription(arg2);
        }
    }

    @Deprecated public void setCloseIconEnabled(boolean arg1) {
        this.setCloseIconVisible(arg1);
    }

    @Deprecated public void setCloseIconEnabledResource(@BoolRes int arg1) {
        this.setCloseIconVisible(arg1);
    }

    public void setCloseIconEndPadding(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIconEndPadding(arg2);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIconEndPaddingResource(arg2);
        }
    }

    private void setCloseIconFocused(boolean arg2) {
        if(this.closeIconFocused != arg2) {
            this.closeIconFocused = arg2;
            this.refreshDrawableState();
        }
    }

    private void setCloseIconHovered(boolean arg2) {
        if(this.closeIconHovered != arg2) {
            this.closeIconHovered = arg2;
            this.refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean arg2) {
        if(this.closeIconPressed != arg2) {
            this.closeIconPressed = arg2;
            this.refreshDrawableState();
        }
    }

    public void setCloseIconResource(@DrawableRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIconResource(arg2);
        }
    }

    public void setCloseIconSize(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIconSize(arg2);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIconSizeResource(arg2);
        }
    }

    public void setCloseIconStartPadding(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIconStartPadding(arg2);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIconStartPaddingResource(arg2);
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIconTint(arg2);
        }
    }

    public void setCloseIconTintResource(@ColorRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIconTintResource(arg2);
        }
    }

    public void setCloseIconVisible(boolean arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIconVisible(arg2);
        }
    }

    public void setCloseIconVisible(@BoolRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setCloseIconVisible(arg2);
        }
    }

    public void setCompoundDrawables(@Nullable Drawable arg1, @Nullable Drawable arg2, @Nullable Drawable arg3, @Nullable Drawable arg4) {
        if(arg1 == null) {
            if(arg3 == null) {
                super.setCompoundDrawables(arg1, arg2, arg3, arg4);
                return;
            }

            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }

        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    public void setCompoundDrawablesRelative(@Nullable Drawable arg1, @Nullable Drawable arg2, @Nullable Drawable arg3, @Nullable Drawable arg4) {
        if(arg1 == null) {
            if(arg3 == null) {
                super.setCompoundDrawablesRelative(arg1, arg2, arg3, arg4);
                return;
            }

            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }

        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int arg1, int arg2, int arg3, int arg4) {
        if(arg1 == 0) {
            if(arg3 == 0) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(arg1, arg2, arg3, arg4);
                return;
            }

            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }

        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@Nullable Drawable arg1, @Nullable Drawable arg2, @Nullable Drawable arg3, @Nullable Drawable arg4) {
        if(arg1 == null) {
            if(arg3 == null) {
                super.setCompoundDrawablesRelativeWithIntrinsicBounds(arg1, arg2, arg3, arg4);
                return;
            }

            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }

        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int arg1, int arg2, int arg3, int arg4) {
        if(arg1 == 0) {
            if(arg3 == 0) {
                super.setCompoundDrawablesWithIntrinsicBounds(arg1, arg2, arg3, arg4);
                return;
            }

            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }

        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    public void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable arg1, @Nullable Drawable arg2, @Nullable Drawable arg3, @Nullable Drawable arg4) {
        if(arg1 == null) {
            if(arg3 == null) {
                super.setCompoundDrawablesWithIntrinsicBounds(arg1, arg2, arg3, arg4);
                return;
            }

            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }

        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    public void setEllipsize(TextUtils$TruncateAt arg2) {
        if(this.chipDrawable == null) {
            return;
        }

        if(arg2 != TextUtils$TruncateAt.MARQUEE) {
            super.setEllipsize(arg2);
            if(this.chipDrawable != null) {
                this.chipDrawable.setEllipsize(arg2);
            }

            return;
        }

        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    private void setFocusedVirtualView(int arg2) {
        if(this.focusedVirtualView != arg2) {
            if(this.focusedVirtualView == 0) {
                this.setCloseIconFocused(false);
            }

            this.focusedVirtualView = arg2;
            if(arg2 != 0) {
                return;
            }

            this.setCloseIconFocused(true);
        }
    }

    public void setGravity(int arg2) {
        if(arg2 != 0x800013) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
        else {
            super.setGravity(arg2);
        }
    }

    public void setHideMotionSpec(@Nullable MotionSpec arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setHideMotionSpec(arg2);
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setHideMotionSpecResource(arg2);
        }
    }

    public void setIconEndPadding(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setIconEndPadding(arg2);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setIconEndPaddingResource(arg2);
        }
    }

    public void setIconStartPadding(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setIconStartPadding(arg2);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setIconStartPaddingResource(arg2);
        }
    }

    public void setLines(int arg2) {
        if(arg2 <= 1) {
            super.setLines(arg2);
            return;
        }

        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxLines(int arg2) {
        if(arg2 <= 1) {
            super.setMaxLines(arg2);
            return;
        }

        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setMaxWidth(@Px int arg2) {
        super.setMaxWidth(arg2);
        if(this.chipDrawable != null) {
            this.chipDrawable.setMaxWidth(arg2);
        }
    }

    public void setMinLines(int arg2) {
        if(arg2 <= 1) {
            super.setMinLines(arg2);
            return;
        }

        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    void setOnCheckedChangeListenerInternal(CompoundButton$OnCheckedChangeListener arg1) {
        this.onCheckedChangeListenerInternal = arg1;
    }

    public void setOnCloseIconClickListener(View$OnClickListener arg1) {
        this.onCloseIconClickListener = arg1;
    }

    public void setRippleColor(@Nullable ColorStateList arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setRippleColor(arg2);
        }
    }

    public void setRippleColorResource(@ColorRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setRippleColorResource(arg2);
        }
    }

    public void setShowMotionSpec(@Nullable MotionSpec arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setShowMotionSpec(arg2);
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setShowMotionSpecResource(arg2);
        }
    }

    public void setSingleLine(boolean arg2) {
        if(arg2) {
            super.setSingleLine(arg2);
            return;
        }

        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public void setText(CharSequence arg3, TextView$BufferType arg4) {
        String v3;
        if(this.chipDrawable == null) {
            return;
        }

        if(arg3 == null) {
            v3 = "";
        }

        CharSequence v0 = BidiFormatter.getInstance().unicodeWrap(((CharSequence)v3));
        if(this.chipDrawable.shouldDrawText()) {
            v0 = null;
        }

        super.setText(v0, arg4);
        if(this.chipDrawable != null) {
            this.chipDrawable.setText(((CharSequence)v3));
        }
    }

    public void setTextAppearance(int arg4) {
        super.setTextAppearance(arg4);
        if(this.chipDrawable != null) {
            this.chipDrawable.setTextAppearanceResource(arg4);
        }

        if(this.getTextAppearance() != null) {
            this.getTextAppearance().updateMeasureState(this.getContext(), this.getPaint(), this.fontCallback);
            this.updateTextPaintDrawState(this.getTextAppearance());
        }
    }

    public void setTextAppearance(Context arg3, int arg4) {
        super.setTextAppearance(arg3, arg4);
        if(this.chipDrawable != null) {
            this.chipDrawable.setTextAppearanceResource(arg4);
        }

        if(this.getTextAppearance() != null) {
            this.getTextAppearance().updateMeasureState(arg3, this.getPaint(), this.fontCallback);
            this.updateTextPaintDrawState(this.getTextAppearance());
        }
    }

    public void setTextAppearance(@Nullable TextAppearance arg5) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setTextAppearance(arg5);
        }

        if(this.getTextAppearance() != null) {
            this.getTextAppearance().updateMeasureState(this.getContext(), this.getPaint(), this.fontCallback);
            this.updateTextPaintDrawState(arg5);
        }
    }

    public void setTextAppearanceResource(@StyleRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setTextAppearanceResource(arg2);
        }

        this.setTextAppearance(this.getContext(), arg2);
    }

    public void setTextEndPadding(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setTextEndPadding(arg2);
        }
    }

    public void setTextEndPaddingResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setTextEndPaddingResource(arg2);
        }
    }

    public void setTextStartPadding(float arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setTextStartPadding(arg2);
        }
    }

    public void setTextStartPaddingResource(@DimenRes int arg2) {
        if(this.chipDrawable != null) {
            this.chipDrawable.setTextStartPaddingResource(arg2);
        }
    }

    private void unapplyChipDrawable(@Nullable ChipDrawable arg2) {
        if(arg2 != null) {
            arg2.setDelegate(null);
        }
    }

    private void updatePaddingInternal() {
        if(!TextUtils.isEmpty(this.getText())) {
            if(this.chipDrawable == null) {
            }
            else {
                float v0 = this.chipDrawable.getChipStartPadding() + this.chipDrawable.getChipEndPadding() + this.chipDrawable.getTextStartPadding() + this.chipDrawable.getTextEndPadding();
                if((this.chipDrawable.isChipIconVisible()) && this.chipDrawable.getChipIcon() != null || this.chipDrawable.getCheckedIcon() != null && (this.chipDrawable.isCheckedIconVisible()) && (this.isChecked())) {
                    v0 += this.chipDrawable.getIconStartPadding() + this.chipDrawable.getIconEndPadding() + this.chipDrawable.getChipIconSize();
                }

                if((this.chipDrawable.isCloseIconVisible()) && this.chipDrawable.getCloseIcon() != null) {
                    v0 += this.chipDrawable.getCloseIconStartPadding() + this.chipDrawable.getCloseIconEndPadding() + this.chipDrawable.getCloseIconSize();
                }

                if((((float)ViewCompat.getPaddingEnd(((View)this)))) != v0) {
                    ViewCompat.setPaddingRelative(((View)this), ViewCompat.getPaddingStart(((View)this)), this.getPaddingTop(), ((int)v0), this.getPaddingBottom());
                }

                return;
            }
        }
    }

    private void updateTextPaintDrawState(TextAppearance arg4) {
        TextPaint v0 = this.getPaint();
        v0.drawableState = this.chipDrawable.getState();
        arg4.updateDrawState(this.getContext(), v0, this.fontCallback);
    }

    private void validateAttributes(@Nullable AttributeSet arg4) {
        if(arg4 == null) {
            return;
        }

        if(arg4.getAttributeValue("http://schemas.android.com/apk/res/android", "background") == null) {
            if(arg4.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
                if(arg4.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                    if(arg4.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                        if(arg4.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                            if((arg4.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true)) && arg4.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && arg4.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && arg4.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                                if(arg4.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 0x800013) != 0x800013) {
                                    Log.w("Chip", "Chip text must be vertically center and start aligned");
                                }

                                return;
                            }

                            throw new UnsupportedOperationException("Chip does not support multi-line text");
                        }

                        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                    }

                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }

                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }

            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }

        throw new UnsupportedOperationException("Do not set the background; Chip manages its own background drawable.");
    }
}

