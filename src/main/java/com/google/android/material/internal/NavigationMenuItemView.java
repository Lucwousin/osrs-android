package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$attr;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView$ItemView;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R$dimen;
import com.google.android.material.R$drawable;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class NavigationMenuItemView extends ForegroundLinearLayout implements ItemView {
    class com.google.android.material.internal.NavigationMenuItemView$1 extends AccessibilityDelegateCompat {
        com.google.android.material.internal.NavigationMenuItemView$1(NavigationMenuItemView arg1) {
            NavigationMenuItemView.this = arg1;
            super();
        }

        public void onInitializeAccessibilityNodeInfo(View arg1, AccessibilityNodeInfoCompat arg2) {
            super.onInitializeAccessibilityNodeInfo(arg1, arg2);
            arg2.setCheckable(NavigationMenuItemView.this.checkable);
        }
    }

    private static final int[] CHECKED_STATE_SET;
    private final AccessibilityDelegateCompat accessibilityDelegate;
    private FrameLayout actionArea;
    boolean checkable;
    private Drawable emptyDrawable;
    private boolean hasIconTintList;
    private final int iconSize;
    private ColorStateList iconTintList;
    private MenuItemImpl itemData;
    private boolean needsEmptyIcon;
    private final CheckedTextView textView;

    static {
        NavigationMenuItemView.CHECKED_STATE_SET = new int[]{0x10100A0};
    }

    public NavigationMenuItemView(Context arg2) {
        this(arg2, null);
    }

    public NavigationMenuItemView(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, 0);
    }

    public NavigationMenuItemView(Context arg2, AttributeSet arg3, int arg4) {
        super(arg2, arg3, arg4);
        this.accessibilityDelegate = new com.google.android.material.internal.NavigationMenuItemView$1(this);
        this.setOrientation(0);
        LayoutInflater.from(arg2).inflate(R$layout.design_navigation_menu_item, ((ViewGroup)this), true);
        this.iconSize = arg2.getResources().getDimensionPixelSize(R$dimen.design_navigation_icon_size);
        this.textView = this.findViewById(R$id.design_menu_item_text);
        this.textView.setDuplicateParentStateEnabled(true);
        ViewCompat.setAccessibilityDelegate(this.textView, this.accessibilityDelegate);
    }

    private void adjustAppearance() {
        ViewGroup$LayoutParams v0;
        if(this.shouldExpandActionArea()) {
            this.textView.setVisibility(8);
            if(this.actionArea != null) {
                v0 = this.actionArea.getLayoutParams();
                ((LayoutParams)v0).width = -1;
                this.actionArea.setLayoutParams(v0);
            }
        }
        else {
            this.textView.setVisibility(0);
            if(this.actionArea != null) {
                v0 = this.actionArea.getLayoutParams();
                ((LayoutParams)v0).width = -2;
                this.actionArea.setLayoutParams(v0);
            }
        }
    }

    private StateListDrawable createDefaultBackground() {
        TypedValue v0 = new TypedValue();
        if(this.getContext().getTheme().resolveAttribute(R$attr.colorControlHighlight, v0, true)) {
            StateListDrawable v1 = new StateListDrawable();
            v1.addState(NavigationMenuItemView.CHECKED_STATE_SET, new ColorDrawable(v0.data));
            v1.addState(NavigationMenuItemView.EMPTY_STATE_SET, new ColorDrawable(0));
            return v1;
        }

        return null;
    }

    public MenuItemImpl getItemData() {
        return this.itemData;
    }

    public void initialize(MenuItemImpl arg1, int arg2) {
        this.itemData = arg1;
        arg2 = arg1.isVisible() ? 0 : 8;
        this.setVisibility(arg2);
        if(this.getBackground() == null) {
            ViewCompat.setBackground(((View)this), this.createDefaultBackground());
        }

        this.setCheckable(arg1.isCheckable());
        this.setChecked(arg1.isChecked());
        this.setEnabled(arg1.isEnabled());
        this.setTitle(arg1.getTitle());
        this.setIcon(arg1.getIcon());
        this.setActionView(arg1.getActionView());
        this.setContentDescription(arg1.getContentDescription());
        TooltipCompat.setTooltipText(((View)this), arg1.getTooltipText());
        this.adjustAppearance();
    }

    protected int[] onCreateDrawableState(int arg2) {
        int[] v2 = super.onCreateDrawableState(arg2 + 1);
        if(this.itemData != null && (this.itemData.isCheckable()) && (this.itemData.isChecked())) {
            NavigationMenuItemView.mergeDrawableStates(v2, NavigationMenuItemView.CHECKED_STATE_SET);
        }

        return v2;
    }

    public boolean prefersCondensedTitle() {
        return 0;
    }

    public void recycle() {
        if(this.actionArea != null) {
            this.actionArea.removeAllViews();
        }

        this.textView.setCompoundDrawables(null, null, null, null);
    }

    private void setActionView(View arg2) {
        if(arg2 != null) {
            if(this.actionArea == null) {
                this.actionArea = this.findViewById(R$id.design_menu_item_action_area_stub).inflate();
            }

            this.actionArea.removeAllViews();
            this.actionArea.addView(arg2);
        }
    }

    public void setCheckable(boolean arg3) {
        this.refreshDrawableState();
        if(this.checkable != arg3) {
            this.checkable = arg3;
            this.accessibilityDelegate.sendAccessibilityEvent(this.textView, 0x800);
        }
    }

    public void setChecked(boolean arg2) {
        this.refreshDrawableState();
        this.textView.setChecked(arg2);
    }

    public void setHorizontalPadding(int arg2) {
        this.setPadding(arg2, 0, arg2, 0);
    }

    public void setIcon(Drawable arg4) {
        if(arg4 != null) {
            if(this.hasIconTintList) {
                Drawable$ConstantState v1 = arg4.getConstantState();
                if(v1 == null) {
                }
                else {
                    arg4 = v1.newDrawable();
                }

                arg4 = DrawableCompat.wrap(arg4).mutate();
                DrawableCompat.setTintList(arg4, this.iconTintList);
            }

            arg4.setBounds(0, 0, this.iconSize, this.iconSize);
        }
        else {
            if(!this.needsEmptyIcon) {
                goto label_33;
            }

            if(this.emptyDrawable == null) {
                this.emptyDrawable = ResourcesCompat.getDrawable(this.getResources(), R$drawable.navigation_empty_icon, this.getContext().getTheme());
                if(this.emptyDrawable != null) {
                    this.emptyDrawable.setBounds(0, 0, this.iconSize, this.iconSize);
                }
            }

            arg4 = this.emptyDrawable;
        }

    label_33:
        TextViewCompat.setCompoundDrawablesRelative(this.textView, arg4, null, null, null);
    }

    public void setIconPadding(int arg2) {
        this.textView.setCompoundDrawablePadding(arg2);
    }

    void setIconTintList(ColorStateList arg1) {
        this.iconTintList = arg1;
        boolean v1 = this.iconTintList != null ? true : false;
        this.hasIconTintList = v1;
        if(this.itemData != null) {
            this.setIcon(this.itemData.getIcon());
        }
    }

    public void setNeedsEmptyIcon(boolean arg1) {
        this.needsEmptyIcon = arg1;
    }

    public void setShortcut(boolean arg1, char arg2) {
    }

    public void setTextAppearance(int arg2) {
        TextViewCompat.setTextAppearance(this.textView, arg2);
    }

    public void setTextColor(ColorStateList arg2) {
        this.textView.setTextColor(arg2);
    }

    public void setTitle(CharSequence arg2) {
        this.textView.setText(arg2);
    }

    private boolean shouldExpandActionArea() {
        boolean v0 = this.itemData.getTitle() != null || this.itemData.getIcon() != null || this.itemData.getActionView() == null ? false : true;
        return v0;
    }

    public boolean showsIcon() {
        return 1;
    }
}

