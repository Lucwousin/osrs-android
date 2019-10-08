package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View$MeasureSpec;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Dimension;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R$attr;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.util.Pools$Pool;
import androidx.core.util.Pools$SynchronizedPool;
import androidx.core.view.ViewCompat;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;
import androidx.transition.TransitionSet;
import com.google.android.material.R$dimen;
import com.google.android.material.internal.TextScale;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class BottomNavigationMenuView extends ViewGroup implements MenuView {
    private static final long ACTIVE_ANIMATION_DURATION_MS = 0x73;
    private static final int[] CHECKED_STATE_SET;
    private static final int[] DISABLED_STATE_SET;
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private BottomNavigationItemView[] buttons;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private Drawable itemBackground;
    private int itemBackgroundRes;
    private final int itemHeight;
    private boolean itemHorizontalTranslationEnabled;
    @Dimension private int itemIconSize;
    private ColorStateList itemIconTint;
    private final Pool itemPool;
    @StyleRes private int itemTextAppearanceActive;
    @StyleRes private int itemTextAppearanceInactive;
    private final ColorStateList itemTextColorDefault;
    private ColorStateList itemTextColorFromUser;
    private int labelVisibilityMode;
    private MenuBuilder menu;
    private final View$OnClickListener onClickListener;
    private BottomNavigationPresenter presenter;
    private int selectedItemId;
    private int selectedItemPosition;
    private final TransitionSet set;
    private int[] tempChildWidths;

    static {
        BottomNavigationMenuView.CHECKED_STATE_SET = new int[]{0x10100A0};
        BottomNavigationMenuView.DISABLED_STATE_SET = new int[]{0xFEFEFF62};
    }

    public BottomNavigationMenuView(Context arg2) {
        this(arg2, null);
    }

    public BottomNavigationMenuView(Context arg3, AttributeSet arg4) {
        super(arg3, arg4);
        this.itemPool = new SynchronizedPool(5);
        this.selectedItemId = 0;
        this.selectedItemPosition = 0;
        Resources v0 = this.getResources();
        this.inactiveItemMaxWidth = v0.getDimensionPixelSize(R$dimen.design_bottom_navigation_item_max_width);
        this.inactiveItemMinWidth = v0.getDimensionPixelSize(R$dimen.design_bottom_navigation_item_min_width);
        this.activeItemMaxWidth = v0.getDimensionPixelSize(R$dimen.design_bottom_navigation_active_item_max_width);
        this.activeItemMinWidth = v0.getDimensionPixelSize(R$dimen.design_bottom_navigation_active_item_min_width);
        this.itemHeight = v0.getDimensionPixelSize(R$dimen.design_bottom_navigation_height);
        this.itemTextColorDefault = this.createDefaultColorStateList(0x1010038);
        this.set = new AutoTransition();
        this.set.setOrdering(0);
        this.set.setDuration(0x73);
        this.set.setInterpolator(new FastOutSlowInInterpolator());
        this.set.addTransition(new TextScale());
        this.onClickListener = new View$OnClickListener() {
            public void onClick(View arg4) {
                MenuItemImpl v4 = ((BottomNavigationItemView)arg4).getItemData();
                if(!BottomNavigationMenuView.access$100(BottomNavigationMenuView.this).performItemAction(((MenuItem)v4), BottomNavigationMenuView.access$000(BottomNavigationMenuView.this), 0)) {
                    ((MenuItem)v4).setChecked(true);
                }
            }
        };
        this.tempChildWidths = new int[5];
    }

    static BottomNavigationPresenter access$000(BottomNavigationMenuView arg0) {
        return arg0.presenter;
    }

    static MenuBuilder access$100(BottomNavigationMenuView arg0) {
        return arg0.menu;
    }

    public void buildMenuView() {
        int v2;
        this.removeAllViews();
        if(this.buttons != null) {
            BottomNavigationItemView[] v0 = this.buttons;
            v2 = v0.length;
            int v3;
            for(v3 = 0; v3 < v2; ++v3) {
                BottomNavigationItemView v4 = v0[v3];
                if(v4 != null) {
                    this.itemPool.release(v4);
                }
            }
        }

        if(this.menu.size() == 0) {
            this.selectedItemId = 0;
            this.selectedItemPosition = 0;
            this.buttons = null;
            return;
        }

        this.buttons = new BottomNavigationItemView[this.menu.size()];
        boolean v0_1 = this.isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
        for(v2 = 0; v2 < this.menu.size(); ++v2) {
            this.presenter.setUpdateSuspended(true);
            this.menu.getItem(v2).setCheckable(true);
            this.presenter.setUpdateSuspended(false);
            BottomNavigationItemView v3_1 = this.getNewItem();
            this.buttons[v2] = v3_1;
            v3_1.setIconTintList(this.itemIconTint);
            v3_1.setIconSize(this.itemIconSize);
            v3_1.setTextColor(this.itemTextColorDefault);
            v3_1.setTextAppearanceInactive(this.itemTextAppearanceInactive);
            v3_1.setTextAppearanceActive(this.itemTextAppearanceActive);
            v3_1.setTextColor(this.itemTextColorFromUser);
            if(this.itemBackground != null) {
                v3_1.setItemBackground(this.itemBackground);
            }
            else {
                v3_1.setItemBackground(this.itemBackgroundRes);
            }

            v3_1.setShifting(v0_1);
            v3_1.setLabelVisibilityMode(this.labelVisibilityMode);
            v3_1.initialize(this.menu.getItem(v2), 0);
            v3_1.setItemPosition(v2);
            v3_1.setOnClickListener(this.onClickListener);
            this.addView(((View)v3_1));
        }

        this.selectedItemPosition = Math.min(this.menu.size() - 1, this.selectedItemPosition);
        this.menu.getItem(this.selectedItemPosition).setChecked(true);
    }

    public ColorStateList createDefaultColorStateList(int arg10) {
        TypedValue v0 = new TypedValue();
        ColorStateList v1 = null;
        if(!this.getContext().getTheme().resolveAttribute(arg10, v0, true)) {
            return v1;
        }

        ColorStateList v10 = AppCompatResources.getColorStateList(this.getContext(), v0.resourceId);
        if(!this.getContext().getTheme().resolveAttribute(R$attr.colorPrimary, v0, true)) {
            return v1;
        }

        int v0_1 = v0.data;
        int v1_1 = v10.getDefaultColor();
        return new ColorStateList(new int[][]{BottomNavigationMenuView.DISABLED_STATE_SET, BottomNavigationMenuView.CHECKED_STATE_SET, BottomNavigationMenuView.EMPTY_STATE_SET}, new int[]{v10.getColorForState(BottomNavigationMenuView.DISABLED_STATE_SET, v1_1), v0_1, v1_1});
    }

    @Nullable public ColorStateList getIconTintList() {
        return this.itemIconTint;
    }

    @Nullable public Drawable getItemBackground() {
        if(this.buttons != null && this.buttons.length > 0) {
            return this.buttons[0].getBackground();
        }

        return this.itemBackground;
    }

    @Deprecated public int getItemBackgroundRes() {
        return this.itemBackgroundRes;
    }

    @Dimension public int getItemIconSize() {
        return this.itemIconSize;
    }

    @StyleRes public int getItemTextAppearanceActive() {
        return this.itemTextAppearanceActive;
    }

    @StyleRes public int getItemTextAppearanceInactive() {
        return this.itemTextAppearanceInactive;
    }

    public ColorStateList getItemTextColor() {
        return this.itemTextColorFromUser;
    }

    public int getLabelVisibilityMode() {
        return this.labelVisibilityMode;
    }

    private BottomNavigationItemView getNewItem() {
        Object v0 = this.itemPool.acquire();
        if(v0 == null) {
            BottomNavigationItemView v0_1 = new BottomNavigationItemView(this.getContext());
        }

        return ((BottomNavigationItemView)v0);
    }

    public int getSelectedItemId() {
        return this.selectedItemId;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public void initialize(MenuBuilder arg1) {
        this.menu = arg1;
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.itemHorizontalTranslationEnabled;
    }

    private boolean isShifting(int arg4, int arg5) {
        boolean v0 = false;
        if(arg4 == -1) {
            if(arg5 <= 3) {
                return v0;
            }

            goto label_6;
        }
        else if(arg4 == 0) {
        label_6:
            v0 = true;
        }

        return v0;
    }

    protected void onLayout(boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        int v5 = this.getChildCount();
        arg8 -= arg6;
        arg9 -= arg7;
        arg7 = 0;
        int v0 = 0;
        while(arg7 < v5) {
            View v1 = this.getChildAt(arg7);
            if(v1.getVisibility() == 8) {
            }
            else {
                if(ViewCompat.getLayoutDirection(((View)this)) == 1) {
                    int v2 = arg8 - v0;
                    v1.layout(v2 - v1.getMeasuredWidth(), 0, v2, arg9);
                }
                else {
                    v1.layout(v0, 0, v1.getMeasuredWidth() + v0, arg9);
                }

                v0 += v1.getMeasuredWidth();
            }

            ++arg7;
        }
    }

    protected void onMeasure(int arg11, int arg12) {
        int v3_1;
        View v3;
        arg11 = View$MeasureSpec.getSize(arg11);
        arg12 = this.menu.getVisibleItems().size();
        int v0 = this.getChildCount();
        int v2 = 0x40000000;
        int v1 = View$MeasureSpec.makeMeasureSpec(this.itemHeight, v2);
        int v4 = 8;
        if(!this.isShifting(this.labelVisibilityMode, arg12) || !this.itemHorizontalTranslationEnabled) {
            v3_1 = arg12 == 0 ? 1 : arg12;
            v3_1 = Math.min(arg11 / v3_1, this.activeItemMaxWidth);
            arg12 = arg11 - arg12 * v3_1;
            for(arg11 = 0; arg11 < v0; ++arg11) {
                if(this.getChildAt(arg11).getVisibility() != v4) {
                    this.tempChildWidths[arg11] = v3_1;
                    if(arg12 > 0) {
                        ++this.tempChildWidths[arg11];
                        --arg12;
                    }
                }
                else {
                    this.tempChildWidths[arg11] = 0;
                }
            }
        }
        else {
            v3 = this.getChildAt(this.selectedItemPosition);
            int v7 = this.activeItemMinWidth;
            if(v3.getVisibility() != v4) {
                v3.measure(View$MeasureSpec.makeMeasureSpec(this.activeItemMaxWidth, 0x80000000), v1);
                v7 = Math.max(v7, v3.getMeasuredWidth());
            }

            v3_1 = v3.getVisibility() != v4 ? 1 : 0;
            arg12 -= v3_1;
            v3_1 = Math.min(arg11 - this.inactiveItemMinWidth * arg12, Math.min(v7, this.activeItemMaxWidth));
            arg11 -= v3_1;
            v7 = arg12 == 0 ? 1 : arg12;
            v7 = Math.min(arg11 / v7, this.inactiveItemMaxWidth);
            arg12 = arg11 - arg12 * v7;
            for(arg11 = 0; arg11 < v0; ++arg11) {
                if(this.getChildAt(arg11).getVisibility() != v4) {
                    int[] v8 = this.tempChildWidths;
                    int v9 = arg11 == this.selectedItemPosition ? v3_1 : v7;
                    v8[arg11] = v9;
                    if(arg12 <= 0) {
                        goto label_71;
                    }

                    ++this.tempChildWidths[arg11];
                    --arg12;
                }
                else {
                    this.tempChildWidths[arg11] = 0;
                }

            label_71:
            }
        }

        arg11 = 0;
        arg12 = 0;
        while(arg11 < v0) {
            v3 = this.getChildAt(arg11);
            if(v3.getVisibility() == v4) {
            }
            else {
                v3.measure(View$MeasureSpec.makeMeasureSpec(this.tempChildWidths[arg11], v2), v1);
                v3.getLayoutParams().width = v3.getMeasuredWidth();
                arg12 += v3.getMeasuredWidth();
            }

            ++arg11;
        }

        this.setMeasuredDimension(View.resolveSizeAndState(arg12, View$MeasureSpec.makeMeasureSpec(arg12, v2), 0), View.resolveSizeAndState(this.itemHeight, v1, 0));
    }

    public void setIconTintList(ColorStateList arg5) {
        this.itemIconTint = arg5;
        if(this.buttons != null) {
            BottomNavigationItemView[] v0 = this.buttons;
            int v1 = v0.length;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                v0[v2].setIconTintList(arg5);
            }
        }
    }

    public void setItemBackground(@Nullable Drawable arg5) {
        this.itemBackground = arg5;
        if(this.buttons != null) {
            BottomNavigationItemView[] v0 = this.buttons;
            int v1 = v0.length;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                v0[v2].setItemBackground(arg5);
            }
        }
    }

    public void setItemBackgroundRes(int arg5) {
        this.itemBackgroundRes = arg5;
        if(this.buttons != null) {
            BottomNavigationItemView[] v0 = this.buttons;
            int v1 = v0.length;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                v0[v2].setItemBackground(arg5);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean arg1) {
        this.itemHorizontalTranslationEnabled = arg1;
    }

    public void setItemIconSize(@Dimension int arg5) {
        this.itemIconSize = arg5;
        if(this.buttons != null) {
            BottomNavigationItemView[] v0 = this.buttons;
            int v1 = v0.length;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                v0[v2].setIconSize(arg5);
            }
        }
    }

    public void setItemTextAppearanceActive(@StyleRes int arg6) {
        this.itemTextAppearanceActive = arg6;
        if(this.buttons != null) {
            BottomNavigationItemView[] v0 = this.buttons;
            int v1 = v0.length;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                BottomNavigationItemView v3 = v0[v2];
                v3.setTextAppearanceActive(arg6);
                if(this.itemTextColorFromUser != null) {
                    v3.setTextColor(this.itemTextColorFromUser);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(@StyleRes int arg6) {
        this.itemTextAppearanceInactive = arg6;
        if(this.buttons != null) {
            BottomNavigationItemView[] v0 = this.buttons;
            int v1 = v0.length;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                BottomNavigationItemView v3 = v0[v2];
                v3.setTextAppearanceInactive(arg6);
                if(this.itemTextColorFromUser != null) {
                    v3.setTextColor(this.itemTextColorFromUser);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList arg5) {
        this.itemTextColorFromUser = arg5;
        if(this.buttons != null) {
            BottomNavigationItemView[] v0 = this.buttons;
            int v1 = v0.length;
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                v0[v2].setTextColor(arg5);
            }
        }
    }

    public void setLabelVisibilityMode(int arg1) {
        this.labelVisibilityMode = arg1;
    }

    public void setPresenter(BottomNavigationPresenter arg1) {
        this.presenter = arg1;
    }

    void tryRestoreSelectedItemId(int arg5) {
        int v0 = this.menu.size();
        int v1 = 0;
        while(v1 < v0) {
            MenuItem v2 = this.menu.getItem(v1);
            if(arg5 == v2.getItemId()) {
                this.selectedItemId = arg5;
                this.selectedItemPosition = v1;
                v2.setChecked(true);
            }
            else {
                ++v1;
                continue;
            }

            return;
        }
    }

    public void updateMenuView() {
        if(this.menu != null) {
            if(this.buttons == null) {
            }
            else {
                int v0 = this.menu.size();
                if(v0 != this.buttons.length) {
                    this.buildMenuView();
                    return;
                }
                else {
                    int v1 = this.selectedItemId;
                    int v3;
                    for(v3 = 0; v3 < v0; ++v3) {
                        MenuItem v4 = this.menu.getItem(v3);
                        if(v4.isChecked()) {
                            this.selectedItemId = v4.getItemId();
                            this.selectedItemPosition = v3;
                        }
                    }

                    if(v1 != this.selectedItemId) {
                        TransitionManager.beginDelayedTransition(((ViewGroup)this), this.set);
                    }

                    boolean v1_1 = this.isShifting(this.labelVisibilityMode, this.menu.getVisibleItems().size());
                    for(v3 = 0; v3 < v0; ++v3) {
                        this.presenter.setUpdateSuspended(true);
                        this.buttons[v3].setLabelVisibilityMode(this.labelVisibilityMode);
                        this.buttons[v3].setShifting(v1_1);
                        this.buttons[v3].initialize(this.menu.getItem(v3), 0);
                        this.presenter.setUpdateSuspended(false);
                    }

                    return;
                }
            }
        }
    }
}

