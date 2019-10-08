package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View$MeasureSpec;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder$Callback;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import com.google.android.material.internal.ThemeEnforcement;

public class NavigationView extends ScrimInsetsFrameLayout {
    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(@NonNull MenuItem arg1);
    }

    public class SavedState extends AbsSavedState {
        final class com.google.android.material.navigation.NavigationView$SavedState$1 implements Parcelable$ClassLoaderCreator {
            com.google.android.material.navigation.NavigationView$SavedState$1() {
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
        public Bundle menuState;

        static {
            SavedState.CREATOR = new com.google.android.material.navigation.NavigationView$SavedState$1();
        }

        public SavedState(Parcelable arg1) {
            super(arg1);
        }

        public SavedState(Parcel arg1, ClassLoader arg2) {
            super(arg1, arg2);
            this.menuState = arg1.readBundle(arg2);
        }

        public void writeToParcel(@NonNull Parcel arg1, int arg2) {
            super.writeToParcel(arg1, arg2);
            arg1.writeBundle(this.menuState);
        }
    }

    private static final int[] CHECKED_STATE_SET = null;
    private static final int[] DISABLED_STATE_SET = null;
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final NavigationMenu menu;
    private MenuInflater menuInflater;
    private final NavigationMenuPresenter presenter;

    static {
        NavigationView.CHECKED_STATE_SET = new int[]{0x10100A0};
        NavigationView.DISABLED_STATE_SET = new int[]{0xFEFEFF62};
    }

    public NavigationView(Context arg2) {
        this(arg2, null);
    }

    public NavigationView(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.navigationViewStyle);
    }

    public NavigationView(Context arg10, AttributeSet arg11, int arg12) {
        int v1;
        int v3;
        super(arg10, arg11, arg12);
        this.presenter = new NavigationMenuPresenter();
        this.menu = new NavigationMenu(arg10);
        TintTypedArray v11 = ThemeEnforcement.obtainTintedStyledAttributes(arg10, arg11, R$styleable.NavigationView, arg12, R$style.Widget_Design_NavigationView, new int[0]);
        ViewCompat.setBackground(((View)this), v11.getDrawable(R$styleable.NavigationView_android_background));
        if(v11.hasValue(R$styleable.NavigationView_elevation)) {
            ViewCompat.setElevation(((View)this), ((float)v11.getDimensionPixelSize(R$styleable.NavigationView_elevation, 0)));
        }

        ViewCompat.setFitsSystemWindows(((View)this), v11.getBoolean(R$styleable.NavigationView_android_fitsSystemWindows, false));
        this.maxWidth = v11.getDimensionPixelSize(R$styleable.NavigationView_android_maxWidth, 0);
        ColorStateList v12 = v11.hasValue(R$styleable.NavigationView_itemIconTint) ? v11.getColorStateList(R$styleable.NavigationView_itemIconTint) : this.createDefaultColorStateList(0x1010038);
        if(v11.hasValue(R$styleable.NavigationView_itemTextAppearance)) {
            v3 = v11.getResourceId(R$styleable.NavigationView_itemTextAppearance, 0);
            v1 = 1;
        }
        else {
            v1 = 0;
            v3 = 0;
        }

        ColorStateList v4 = null;
        if(v11.hasValue(R$styleable.NavigationView_itemTextColor)) {
            v4 = v11.getColorStateList(R$styleable.NavigationView_itemTextColor);
        }

        if(v1 == 0 && v4 == null) {
            v4 = this.createDefaultColorStateList(0x1010036);
        }

        Drawable v5 = v11.getDrawable(R$styleable.NavigationView_itemBackground);
        if(v11.hasValue(R$styleable.NavigationView_itemHorizontalPadding)) {
            this.presenter.setItemHorizontalPadding(v11.getDimensionPixelSize(R$styleable.NavigationView_itemHorizontalPadding, 0));
        }

        int v6 = v11.getDimensionPixelSize(R$styleable.NavigationView_itemIconPadding, 0);
        this.menu.setCallback(new Callback() {
            public boolean onMenuItemSelected(MenuBuilder arg1, MenuItem arg2) {
                boolean v1 = NavigationView.this.listener == null || !NavigationView.this.listener.onNavigationItemSelected(arg2) ? false : true;
                return v1;
            }

            public void onMenuModeChange(MenuBuilder arg1) {
            }
        });
        this.presenter.setId(1);
        this.presenter.initForMenu(arg10, this.menu);
        this.presenter.setItemIconTintList(v12);
        if(v1 != 0) {
            this.presenter.setItemTextAppearance(v3);
        }

        this.presenter.setItemTextColor(v4);
        this.presenter.setItemBackground(v5);
        this.presenter.setItemIconPadding(v6);
        this.menu.addMenuPresenter(this.presenter);
        this.addView(this.presenter.getMenuView(((ViewGroup)this)));
        if(v11.hasValue(R$styleable.NavigationView_menu)) {
            this.inflateMenu(v11.getResourceId(R$styleable.NavigationView_menu, 0));
        }

        if(v11.hasValue(R$styleable.NavigationView_headerLayout)) {
            this.inflateHeaderView(v11.getResourceId(R$styleable.NavigationView_headerLayout, 0));
        }

        v11.recycle();
    }

    public void addHeaderView(@NonNull View arg2) {
        this.presenter.addHeaderView(arg2);
    }

    private ColorStateList createDefaultColorStateList(int arg10) {
        TypedValue v0 = new TypedValue();
        ColorStateList v1 = null;
        if(!this.getContext().getTheme().resolveAttribute(arg10, v0, true)) {
            return v1;
        }

        ColorStateList v10 = AppCompatResources.getColorStateList(this.getContext(), v0.resourceId);
        if(!this.getContext().getTheme().resolveAttribute(androidx.appcompat.R$attr.colorPrimary, v0, true)) {
            return v1;
        }

        int v0_1 = v0.data;
        int v1_1 = v10.getDefaultColor();
        return new ColorStateList(new int[][]{NavigationView.DISABLED_STATE_SET, NavigationView.CHECKED_STATE_SET, NavigationView.EMPTY_STATE_SET}, new int[]{v10.getColorForState(NavigationView.DISABLED_STATE_SET, v1_1), v0_1, v1_1});
    }

    @Nullable public MenuItem getCheckedItem() {
        return this.presenter.getCheckedItem();
    }

    public int getHeaderCount() {
        return this.presenter.getHeaderCount();
    }

    public View getHeaderView(int arg2) {
        return this.presenter.getHeaderView(arg2);
    }

    @Nullable public Drawable getItemBackground() {
        return this.presenter.getItemBackground();
    }

    @Dimension public int getItemHorizontalPadding() {
        return this.presenter.getItemHorizontalPadding();
    }

    @Dimension public int getItemIconPadding() {
        return this.presenter.getItemIconPadding();
    }

    @Nullable public ColorStateList getItemIconTintList() {
        return this.presenter.getItemTintList();
    }

    @Nullable public ColorStateList getItemTextColor() {
        return this.presenter.getItemTextColor();
    }

    public Menu getMenu() {
        return this.menu;
    }

    private MenuInflater getMenuInflater() {
        if(this.menuInflater == null) {
            this.menuInflater = new SupportMenuInflater(this.getContext());
        }

        return this.menuInflater;
    }

    public View inflateHeaderView(@LayoutRes int arg2) {
        return this.presenter.inflateHeaderView(arg2);
    }

    public void inflateMenu(int arg3) {
        this.presenter.setUpdateSuspended(true);
        this.getMenuInflater().inflate(arg3, this.menu);
        this.presenter.setUpdateSuspended(false);
        this.presenter.updateMenuView(false);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) protected void onInsetsChanged(WindowInsetsCompat arg2) {
        this.presenter.dispatchApplyWindowInsets(arg2);
    }

    protected void onMeasure(int arg4, int arg5) {
        int v0 = View$MeasureSpec.getMode(arg4);
        int v2 = 0x40000000;
        if(v0 == 0x80000000) {
            arg4 = View$MeasureSpec.makeMeasureSpec(Math.min(View$MeasureSpec.getSize(arg4), this.maxWidth), v2);
        }
        else if(v0 != 0) {
        }
        else {
            arg4 = View$MeasureSpec.makeMeasureSpec(this.maxWidth, v2);
        }

        super.onMeasure(arg4, arg5);
    }

    protected void onRestoreInstanceState(Parcelable arg2) {
        if(!(arg2 instanceof SavedState)) {
            super.onRestoreInstanceState(arg2);
            return;
        }

        super.onRestoreInstanceState(((SavedState)arg2).getSuperState());
        this.menu.restorePresenterStates(((SavedState)arg2).menuState);
    }

    protected Parcelable onSaveInstanceState() {
        SavedState v1 = new SavedState(super.onSaveInstanceState());
        v1.menuState = new Bundle();
        this.menu.savePresenterStates(v1.menuState);
        return ((Parcelable)v1);
    }

    public void removeHeaderView(@NonNull View arg2) {
        this.presenter.removeHeaderView(arg2);
    }

    public void setCheckedItem(@IdRes int arg2) {
        MenuItem v2 = this.menu.findItem(arg2);
        if(v2 != null) {
            this.presenter.setCheckedItem(((MenuItemImpl)v2));
        }
    }

    public void setCheckedItem(@NonNull MenuItem arg2) {
        arg2 = this.menu.findItem(arg2.getItemId());
        if(arg2 != null) {
            this.presenter.setCheckedItem(((MenuItemImpl)arg2));
            return;
        }

        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setItemBackground(@Nullable Drawable arg2) {
        this.presenter.setItemBackground(arg2);
    }

    public void setItemBackgroundResource(@DrawableRes int arg2) {
        this.setItemBackground(ContextCompat.getDrawable(this.getContext(), arg2));
    }

    public void setItemHorizontalPadding(@Dimension int arg2) {
        this.presenter.setItemHorizontalPadding(arg2);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int arg3) {
        this.presenter.setItemHorizontalPadding(this.getResources().getDimensionPixelSize(arg3));
    }

    public void setItemIconPadding(@Dimension int arg2) {
        this.presenter.setItemIconPadding(arg2);
    }

    public void setItemIconPaddingResource(int arg3) {
        this.presenter.setItemIconPadding(this.getResources().getDimensionPixelSize(arg3));
    }

    public void setItemIconTintList(@Nullable ColorStateList arg2) {
        this.presenter.setItemIconTintList(arg2);
    }

    public void setItemTextAppearance(@StyleRes int arg2) {
        this.presenter.setItemTextAppearance(arg2);
    }

    public void setItemTextColor(@Nullable ColorStateList arg2) {
        this.presenter.setItemTextColor(arg2);
    }

    public void setNavigationItemSelectedListener(@Nullable OnNavigationItemSelectedListener arg1) {
        this.listener = arg1;
    }
}

