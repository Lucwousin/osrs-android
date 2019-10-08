package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView$ItemView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class BottomNavigationItemView extends FrameLayout implements ItemView {
    private static final int[] CHECKED_STATE_SET = null;
    public static final int INVALID_ITEM_POSITION = -1;
    private final int defaultMargin;
    private ImageView icon;
    private ColorStateList iconTint;
    private boolean isShifting;
    private MenuItemImpl itemData;
    private int itemPosition;
    private int labelVisibilityMode;
    private final TextView largeLabel;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final TextView smallLabel;

    static {
        BottomNavigationItemView.CHECKED_STATE_SET = new int[]{0x10100A0};
    }

    public BottomNavigationItemView(@NonNull Context arg2) {
        this(arg2, null);
    }

    public BottomNavigationItemView(@NonNull Context arg2, AttributeSet arg3) {
        this(arg2, arg3, 0);
    }

    public BottomNavigationItemView(Context arg2, AttributeSet arg3, int arg4) {
        super(arg2, arg3, arg4);
        this.itemPosition = -1;
        Resources v3 = this.getResources();
        LayoutInflater.from(arg2).inflate(R$layout.design_bottom_navigation_item, ((ViewGroup)this), true);
        this.setBackgroundResource(R$drawable.design_bottom_navigation_item_background);
        this.defaultMargin = v3.getDimensionPixelSize(R$dimen.design_bottom_navigation_margin);
        this.icon = this.findViewById(R$id.icon);
        this.smallLabel = this.findViewById(R$id.smallLabel);
        this.largeLabel = this.findViewById(R$id.largeLabel);
        ViewCompat.setImportantForAccessibility(this.smallLabel, 2);
        ViewCompat.setImportantForAccessibility(this.largeLabel, 2);
        this.setFocusable(true);
        this.calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    private void calculateTextScaleFactors(float arg3, float arg4) {
        this.shiftAmount = arg3 - arg4;
        this.scaleUpFactor = arg4 * 1f / arg3;
        this.scaleDownFactor = arg3 * 1f / arg4;
    }

    public MenuItemImpl getItemData() {
        return this.itemData;
    }

    public int getItemPosition() {
        return this.itemPosition;
    }

    public void initialize(MenuItemImpl arg1, int arg2) {
        this.itemData = arg1;
        this.setCheckable(arg1.isCheckable());
        this.setChecked(arg1.isChecked());
        this.setEnabled(arg1.isEnabled());
        this.setIcon(arg1.getIcon());
        this.setTitle(arg1.getTitle());
        this.setId(arg1.getItemId());
        if(!TextUtils.isEmpty(arg1.getContentDescription())) {
            this.setContentDescription(arg1.getContentDescription());
        }

        TooltipCompat.setTooltipText(((View)this), arg1.getTooltipText());
        int v1 = arg1.isVisible() ? 0 : 8;
        this.setVisibility(v1);
    }

    public int[] onCreateDrawableState(int arg2) {
        int[] v2 = super.onCreateDrawableState(arg2 + 1);
        if(this.itemData != null && (this.itemData.isCheckable()) && (this.itemData.isChecked())) {
            BottomNavigationItemView.mergeDrawableStates(v2, BottomNavigationItemView.CHECKED_STATE_SET);
        }

        return v2;
    }

    public boolean prefersCondensedTitle() {
        return 0;
    }

    public void setCheckable(boolean arg1) {
        this.refreshDrawableState();
    }

    public void setChecked(boolean arg8) {
        this.largeLabel.setPivotX(((float)(this.largeLabel.getWidth() / 2)));
        this.largeLabel.setPivotY(((float)this.largeLabel.getBaseline()));
        this.smallLabel.setPivotX(((float)(this.smallLabel.getWidth() / 2)));
        this.smallLabel.setPivotY(((float)this.smallLabel.getBaseline()));
        int v1 = 17;
        float v2 = 0.5f;
        int v4 = 49;
        int v5 = 4;
        float v6 = 1f;
        switch(this.labelVisibilityMode) {
            case -1: {
                if(this.isShifting) {
                    if(arg8) {
                        this.setViewLayoutParams(this.icon, this.defaultMargin, v4);
                        this.setViewValues(this.largeLabel, v6, v6, 0);
                    }
                    else {
                        this.setViewLayoutParams(this.icon, this.defaultMargin, v1);
                        this.setViewValues(this.largeLabel, v2, v2, v5);
                    }

                    this.smallLabel.setVisibility(v5);
                    goto label_121;
                }

                if(arg8) {
                    this.setViewLayoutParams(this.icon, ((int)((((float)this.defaultMargin)) + this.shiftAmount)), v4);
                    this.setViewValues(this.largeLabel, v6, v6, 0);
                    this.setViewValues(this.smallLabel, this.scaleUpFactor, this.scaleUpFactor, v5);
                    goto label_121;
                }

                this.setViewLayoutParams(this.icon, this.defaultMargin, v4);
                this.setViewValues(this.largeLabel, this.scaleDownFactor, this.scaleDownFactor, v5);
                this.setViewValues(this.smallLabel, v6, v6, 0);
                break;
            }
            case 0: {
                if(arg8) {
                    this.setViewLayoutParams(this.icon, this.defaultMargin, v4);
                    this.setViewValues(this.largeLabel, v6, v6, 0);
                }
                else {
                    this.setViewLayoutParams(this.icon, this.defaultMargin, v1);
                    this.setViewValues(this.largeLabel, v2, v2, v5);
                }

                this.smallLabel.setVisibility(v5);
                break;
            }
            case 1: {
                if(arg8) {
                    this.setViewLayoutParams(this.icon, ((int)((((float)this.defaultMargin)) + this.shiftAmount)), v4);
                    this.setViewValues(this.largeLabel, v6, v6, 0);
                    this.setViewValues(this.smallLabel, this.scaleUpFactor, this.scaleUpFactor, v5);
                    goto label_121;
                }

                this.setViewLayoutParams(this.icon, this.defaultMargin, v4);
                this.setViewValues(this.largeLabel, this.scaleDownFactor, this.scaleDownFactor, v5);
                this.setViewValues(this.smallLabel, v6, v6, 0);
                break;
            }
            case 2: {
                this.setViewLayoutParams(this.icon, this.defaultMargin, v1);
                this.largeLabel.setVisibility(8);
                this.smallLabel.setVisibility(8);
                break;
            }
            default: {
                break;
            }
        }

    label_121:
        this.refreshDrawableState();
        this.setSelected(arg8);
    }

    public void setEnabled(boolean arg2) {
        super.setEnabled(arg2);
        this.smallLabel.setEnabled(arg2);
        this.largeLabel.setEnabled(arg2);
        this.icon.setEnabled(arg2);
        if(arg2) {
            ViewCompat.setPointerIcon(((View)this), PointerIconCompat.getSystemIcon(this.getContext(), 1002));
        }
        else {
            ViewCompat.setPointerIcon(((View)this), null);
        }
    }

    public void setIcon(Drawable arg2) {
        if(arg2 != null) {
            Drawable$ConstantState v0 = arg2.getConstantState();
            if(v0 == null) {
            }
            else {
                arg2 = v0.newDrawable();
            }

            arg2 = DrawableCompat.wrap(arg2).mutate();
            DrawableCompat.setTintList(arg2, this.iconTint);
        }

        this.icon.setImageDrawable(arg2);
    }

    public void setIconSize(int arg2) {
        ViewGroup$LayoutParams v0 = this.icon.getLayoutParams();
        ((FrameLayout$LayoutParams)v0).width = arg2;
        ((FrameLayout$LayoutParams)v0).height = arg2;
        this.icon.setLayoutParams(v0);
    }

    public void setIconTintList(ColorStateList arg1) {
        this.iconTint = arg1;
        if(this.itemData != null) {
            this.setIcon(this.itemData.getIcon());
        }
    }

    public void setItemBackground(int arg2) {
        Drawable v2 = arg2 == 0 ? null : ContextCompat.getDrawable(this.getContext(), arg2);
        this.setItemBackground(v2);
    }

    public void setItemBackground(@Nullable Drawable arg1) {
        ViewCompat.setBackground(((View)this), arg1);
    }

    public void setItemPosition(int arg1) {
        this.itemPosition = arg1;
    }

    public void setLabelVisibilityMode(int arg2) {
        if(this.labelVisibilityMode != arg2) {
            this.labelVisibilityMode = arg2;
            arg2 = this.itemData != null ? 1 : 0;
            if(arg2 == 0) {
                return;
            }

            this.setChecked(this.itemData.isChecked());
        }
    }

    public void setShifting(boolean arg2) {
        if(this.isShifting != arg2) {
            this.isShifting = arg2;
            int v2 = this.itemData != null ? 1 : 0;
            if(v2 == 0) {
                return;
            }

            this.setChecked(this.itemData.isChecked());
        }
    }

    public void setShortcut(boolean arg1, char arg2) {
    }

    public void setTextAppearanceActive(@StyleRes int arg2) {
        TextViewCompat.setTextAppearance(this.largeLabel, arg2);
        this.calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextAppearanceInactive(@StyleRes int arg2) {
        TextViewCompat.setTextAppearance(this.smallLabel, arg2);
        this.calculateTextScaleFactors(this.smallLabel.getTextSize(), this.largeLabel.getTextSize());
    }

    public void setTextColor(@Nullable ColorStateList arg2) {
        if(arg2 != null) {
            this.smallLabel.setTextColor(arg2);
            this.largeLabel.setTextColor(arg2);
        }
    }

    public void setTitle(CharSequence arg2) {
        this.smallLabel.setText(arg2);
        this.largeLabel.setText(arg2);
        if(this.itemData == null || (TextUtils.isEmpty(this.itemData.getContentDescription()))) {
            this.setContentDescription(arg2);
        }
    }

    private void setViewLayoutParams(@NonNull View arg2, int arg3, int arg4) {
        ViewGroup$LayoutParams v0 = arg2.getLayoutParams();
        ((FrameLayout$LayoutParams)v0).topMargin = arg3;
        ((FrameLayout$LayoutParams)v0).gravity = arg4;
        arg2.setLayoutParams(v0);
    }

    private void setViewValues(@NonNull View arg1, float arg2, float arg3, int arg4) {
        arg1.setScaleX(arg2);
        arg1.setScaleY(arg3);
        arg1.setVisibility(arg4);
    }

    public boolean showsIcon() {
        return 1;
    }
}

