package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder$Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$color;
import com.google.android.material.R$dimen;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ThemeEnforcement;

public class BottomNavigationView extends FrameLayout {
    public interface OnNavigationItemReselectedListener {
        void onNavigationItemReselected(@NonNull MenuItem arg1);
    }

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem arg1);
    }

    class SavedState extends AbsSavedState {
        final class com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$1 implements Parcelable$ClassLoaderCreator {
            com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$1() {
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
        Bundle menuPresenterState;

        static {
            SavedState.CREATOR = new com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$1();
        }

        public SavedState(Parcelable arg1) {
            super(arg1);
        }

        public SavedState(Parcel arg1, ClassLoader arg2) {
            super(arg1, arg2);
            this.readFromParcel(arg1, arg2);
        }

        private void readFromParcel(Parcel arg1, ClassLoader arg2) {
            this.menuPresenterState = arg1.readBundle(arg2);
        }

        public void writeToParcel(@NonNull Parcel arg1, int arg2) {
            super.writeToParcel(arg1, arg2);
            arg1.writeBundle(this.menuPresenterState);
        }
    }

    private static final int MENU_PRESENTER_ID = 1;
    private final MenuBuilder menu;
    private MenuInflater menuInflater;
    private final BottomNavigationMenuView menuView;
    private final BottomNavigationPresenter presenter;
    private OnNavigationItemReselectedListener reselectedListener;
    private OnNavigationItemSelectedListener selectedListener;

    public BottomNavigationView(Context arg2) {
        this(arg2, null);
    }

    public BottomNavigationView(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.bottomNavigationStyle);
    }

    public BottomNavigationView(Context arg12, AttributeSet arg13, int arg14) {
        super(arg12, arg13, arg14);
        this.presenter = new BottomNavigationPresenter();
        this.menu = new BottomNavigationMenu(arg12);
        this.menuView = new BottomNavigationMenuView(arg12);
        FrameLayout$LayoutParams v0 = new FrameLayout$LayoutParams(-2, -2);
        v0.gravity = 17;
        this.menuView.setLayoutParams(((ViewGroup$LayoutParams)v0));
        this.presenter.setBottomNavigationMenuView(this.menuView);
        this.presenter.setId(1);
        this.menuView.setPresenter(this.presenter);
        this.menu.addMenuPresenter(this.presenter);
        this.presenter.initForMenu(this.getContext(), this.menu);
        TintTypedArray v13 = ThemeEnforcement.obtainTintedStyledAttributes(arg12, arg13, R$styleable.BottomNavigationView, arg14, R$style.Widget_Design_BottomNavigationView, new int[]{R$styleable.BottomNavigationView_itemTextAppearanceInactive, R$styleable.BottomNavigationView_itemTextAppearanceActive});
        if(v13.hasValue(R$styleable.BottomNavigationView_itemIconTint)) {
            this.menuView.setIconTintList(v13.getColorStateList(R$styleable.BottomNavigationView_itemIconTint));
        }
        else {
            this.menuView.setIconTintList(this.menuView.createDefaultColorStateList(0x1010038));
        }

        this.setItemIconSize(v13.getDimensionPixelSize(R$styleable.BottomNavigationView_itemIconSize, this.getResources().getDimensionPixelSize(R$dimen.design_bottom_navigation_icon_size)));
        if(v13.hasValue(R$styleable.BottomNavigationView_itemTextAppearanceInactive)) {
            this.setItemTextAppearanceInactive(v13.getResourceId(R$styleable.BottomNavigationView_itemTextAppearanceInactive, 0));
        }

        if(v13.hasValue(R$styleable.BottomNavigationView_itemTextAppearanceActive)) {
            this.setItemTextAppearanceActive(v13.getResourceId(R$styleable.BottomNavigationView_itemTextAppearanceActive, 0));
        }

        if(v13.hasValue(R$styleable.BottomNavigationView_itemTextColor)) {
            this.setItemTextColor(v13.getColorStateList(R$styleable.BottomNavigationView_itemTextColor));
        }

        if(v13.hasValue(R$styleable.BottomNavigationView_elevation)) {
            ViewCompat.setElevation(((View)this), ((float)v13.getDimensionPixelSize(R$styleable.BottomNavigationView_elevation, 0)));
        }

        this.setLabelVisibilityMode(v13.getInteger(R$styleable.BottomNavigationView_labelVisibilityMode, -1));
        this.setItemHorizontalTranslationEnabled(v13.getBoolean(R$styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        this.menuView.setItemBackgroundRes(v13.getResourceId(R$styleable.BottomNavigationView_itemBackground, 0));
        if(v13.hasValue(R$styleable.BottomNavigationView_menu)) {
            this.inflateMenu(v13.getResourceId(R$styleable.BottomNavigationView_menu, 0));
        }

        v13.recycle();
        this.addView(this.menuView, ((ViewGroup$LayoutParams)v0));
        if(Build$VERSION.SDK_INT < 21) {
            this.addCompatibilityTopDivider(arg12);
        }

        this.menu.setCallback(new Callback() {
            public boolean onMenuItemSelected(MenuBuilder arg3, MenuItem arg4) {
                boolean v0 = true;
                if(BottomNavigationView.access$000(BottomNavigationView.this) != null && arg4.getItemId() == BottomNavigationView.this.getSelectedItemId()) {
                    BottomNavigationView.access$000(BottomNavigationView.this).onNavigationItemReselected(arg4);
                    return 1;
                }

                if(BottomNavigationView.access$100(BottomNavigationView.this) == null || (BottomNavigationView.access$100(BottomNavigationView.this).onNavigationItemSelected(arg4))) {
                    v0 = false;
                }
                else {
                }

                return v0;
            }

            public void onMenuModeChange(MenuBuilder arg1) {
            }
        });
    }

    static OnNavigationItemReselectedListener access$000(BottomNavigationView arg0) {
        return arg0.reselectedListener;
    }

    static OnNavigationItemSelectedListener access$100(BottomNavigationView arg0) {
        return arg0.selectedListener;
    }

    private void addCompatibilityTopDivider(Context arg4) {
        View v0 = new View(arg4);
        v0.setBackgroundColor(ContextCompat.getColor(arg4, R$color.design_bottom_navigation_shadow_color));
        v0.setLayoutParams(new FrameLayout$LayoutParams(-1, this.getResources().getDimensionPixelSize(R$dimen.design_bottom_navigation_shadow_height)));
        this.addView(v0);
    }

    @Nullable public Drawable getItemBackground() {
        return this.menuView.getItemBackground();
    }

    @DrawableRes @Deprecated public int getItemBackgroundResource() {
        return this.menuView.getItemBackgroundRes();
    }

    @Dimension public int getItemIconSize() {
        return this.menuView.getItemIconSize();
    }

    @Nullable public ColorStateList getItemIconTintList() {
        return this.menuView.getIconTintList();
    }

    @StyleRes public int getItemTextAppearanceActive() {
        return this.menuView.getItemTextAppearanceActive();
    }

    @StyleRes public int getItemTextAppearanceInactive() {
        return this.menuView.getItemTextAppearanceInactive();
    }

    @Nullable public ColorStateList getItemTextColor() {
        return this.menuView.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.menuView.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    @NonNull public Menu getMenu() {
        return this.menu;
    }

    private MenuInflater getMenuInflater() {
        if(this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(this.getContext());
        }

        return this.menuInflater;
    }

    @IdRes public int getSelectedItemId() {
        return this.menuView.getSelectedItemId();
    }

    public void inflateMenu(int arg4) {
        this.presenter.setUpdateSuspended(true);
        this.getMenuInflater().inflate(arg4, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(true);
    }

    public boolean isItemHorizontalTranslationEnabled() {
        return this.menuView.isItemHorizontalTranslationEnabled();
    }

    protected void onRestoreInstanceState(Parcelable arg2) {
        if(!(arg2 instanceof SavedState)) {
            super.onRestoreInstanceState(arg2);
            return;
        }

        super.onRestoreInstanceState(((SavedState)arg2).getSuperState());
        this.menu.restorePresenterStates(((SavedState)arg2).menuPresenterState);
    }

    protected Parcelable onSaveInstanceState() {
        SavedState v1 = new SavedState(super.onSaveInstanceState());
        v1.menuPresenterState = new Bundle();
        this.menu.savePresenterStates(v1.menuPresenterState);
        return ((Parcelable)v1);
    }

    public void setItemBackground(@Nullable Drawable arg2) {
        this.menuView.setItemBackground(arg2);
    }

    public void setItemBackgroundResource(@DrawableRes int arg2) {
        this.menuView.setItemBackgroundRes(arg2);
    }

    public void setItemHorizontalTranslationEnabled(boolean arg2) {
        if(this.menuView.isItemHorizontalTranslationEnabled() != arg2) {
            this.menuView.setItemHorizontalTranslationEnabled(arg2);
            this.presenter.updateMenuView(false);
        }
    }

    public void setItemIconSize(@Dimension int arg2) {
        this.menuView.setItemIconSize(arg2);
    }

    public void setItemIconSizeRes(@DimenRes int arg2) {
        this.setItemIconSize(this.getResources().getDimensionPixelSize(arg2));
    }

    public void setItemIconTintList(@Nullable ColorStateList arg2) {
        this.menuView.setIconTintList(arg2);
    }

    public void setItemTextAppearanceActive(@StyleRes int arg2) {
        this.menuView.setItemTextAppearanceActive(arg2);
    }

    public void setItemTextAppearanceInactive(@StyleRes int arg2) {
        this.menuView.setItemTextAppearanceInactive(arg2);
    }

    public void setItemTextColor(@Nullable ColorStateList arg2) {
        this.menuView.setItemTextColor(arg2);
    }

    public void setLabelVisibilityMode(int arg2) {
        if(this.menuView.getLabelVisibilityMode() != arg2) {
            this.menuView.setLabelVisibilityMode(arg2);
            this.presenter.updateMenuView(false);
        }
    }

    public void setOnNavigationItemReselectedListener(@Nullable OnNavigationItemReselectedListener arg1) {
        this.reselectedListener = arg1;
    }

    public void setOnNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener arg1) {
        this.selectedListener = arg1;
    }

    public void setSelectedItemId(@IdRes int arg4) {
        MenuItem v4 = this.menu.findItem(arg4);
        if(v4 != null && !this.menu.performItemAction(v4, this.presenter, 0)) {
            v4.setChecked(true);
        }
    }
}

