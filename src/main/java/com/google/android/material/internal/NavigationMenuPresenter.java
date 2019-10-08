package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View$OnClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter$Callback;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView$Adapter;
import com.google.android.material.R$dimen;
import com.google.android.material.R$layout;
import java.util.ArrayList;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class NavigationMenuPresenter implements MenuPresenter {
    class com.google.android.material.internal.NavigationMenuPresenter$1 implements View$OnClickListener {
        com.google.android.material.internal.NavigationMenuPresenter$1(NavigationMenuPresenter arg1) {
            NavigationMenuPresenter.this = arg1;
            super();
        }

        public void onClick(View arg4) {
            NavigationMenuPresenter.this.setUpdateSuspended(true);
            MenuItemImpl v4 = ((NavigationMenuItemView)arg4).getItemData();
            boolean v0 = NavigationMenuPresenter.this.menu.performItemAction(((MenuItem)v4), NavigationMenuPresenter.this, 0);
            if(v4 != null && (v4.isCheckable()) && (v0)) {
                NavigationMenuPresenter.this.adapter.setCheckedItem(v4);
            }

            NavigationMenuPresenter.this.setUpdateSuspended(false);
            NavigationMenuPresenter.this.updateMenuView(false);
        }
    }

    class HeaderViewHolder extends ViewHolder {
        public HeaderViewHolder(View arg1) {
            super(arg1);
        }
    }

    class NavigationMenuAdapter extends Adapter {
        private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
        private static final String STATE_CHECKED_ITEM = "android:menu:checked";
        private static final int VIEW_TYPE_HEADER = 3;
        private static final int VIEW_TYPE_NORMAL = 0;
        private static final int VIEW_TYPE_SEPARATOR = 2;
        private static final int VIEW_TYPE_SUBHEADER = 1;
        private MenuItemImpl checkedItem;
        private final ArrayList items;
        private boolean updateSuspended;

        NavigationMenuAdapter(NavigationMenuPresenter arg1) {
            NavigationMenuPresenter.this = arg1;
            super();
            this.items = new ArrayList();
            this.prepareMenuItems();
        }

        private void appendTransparentIconIfMissing(int arg3, int arg4) {
            while(arg3 < arg4) {
                this.items.get(arg3).needsEmptyIcon = true;
                ++arg3;
            }
        }

        public Bundle createInstanceState() {
            Bundle v0 = new Bundle();
            if(this.checkedItem != null) {
                v0.putInt("android:menu:checked", this.checkedItem.getItemId());
            }

            SparseArray v1 = new SparseArray();
            int v2 = 0;
            int v3 = this.items.size();
            while(v2 < v3) {
                Object v4 = this.items.get(v2);
                if((v4 instanceof NavigationMenuTextItem)) {
                    MenuItemImpl v4_1 = ((NavigationMenuTextItem)v4).getMenuItem();
                    View v5 = v4_1 != null ? v4_1.getActionView() : null;
                    if(v5 == null) {
                        goto label_29;
                    }

                    ParcelableSparseArray v6 = new ParcelableSparseArray();
                    v5.saveHierarchyState(((SparseArray)v6));
                    v1.put(v4_1.getItemId(), v6);
                }

            label_29:
                ++v2;
            }

            v0.putSparseParcelableArray("android:menu:action_views", v1);
            return v0;
        }

        public MenuItemImpl getCheckedItem() {
            return this.checkedItem;
        }

        public int getItemCount() {
            return this.items.size();
        }

        public long getItemId(int arg3) {
            return ((long)arg3);
        }

        public int getItemViewType(int arg2) {
            Object v2 = this.items.get(arg2);
            if((v2 instanceof NavigationMenuSeparatorItem)) {
                return 2;
            }

            if((v2 instanceof NavigationMenuHeaderItem)) {
                return 3;
            }

            if((v2 instanceof NavigationMenuTextItem)) {
                if(((NavigationMenuTextItem)v2).getMenuItem().hasSubMenu()) {
                    return 1;
                }

                return 0;
            }

            throw new RuntimeException("Unknown item type.");
        }

        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder arg1, int arg2) {
            this.onBindViewHolder(((ViewHolder)arg1), arg2);
        }

        public void onBindViewHolder(ViewHolder arg3, int arg4) {
            Object v4;
            switch(this.getItemViewType(arg4)) {
                case 0: {
                    View v3 = arg3.itemView;
                    ((NavigationMenuItemView)v3).setIconTintList(NavigationMenuPresenter.this.iconTintList);
                    if(NavigationMenuPresenter.this.textAppearanceSet) {
                        ((NavigationMenuItemView)v3).setTextAppearance(NavigationMenuPresenter.this.textAppearance);
                    }

                    if(NavigationMenuPresenter.this.textColor != null) {
                        ((NavigationMenuItemView)v3).setTextColor(NavigationMenuPresenter.this.textColor);
                    }

                    Drawable v0 = NavigationMenuPresenter.this.itemBackground != null ? NavigationMenuPresenter.this.itemBackground.getConstantState().newDrawable() : null;
                    ViewCompat.setBackground(v3, v0);
                    v4 = this.items.get(arg4);
                    ((NavigationMenuItemView)v3).setNeedsEmptyIcon(((NavigationMenuTextItem)v4).needsEmptyIcon);
                    ((NavigationMenuItemView)v3).setHorizontalPadding(NavigationMenuPresenter.this.itemHorizontalPadding);
                    ((NavigationMenuItemView)v3).setIconPadding(NavigationMenuPresenter.this.itemIconPadding);
                    ((NavigationMenuItemView)v3).initialize(((NavigationMenuTextItem)v4).getMenuItem(), 0);
                    break;
                }
                case 1: {
                    arg3.itemView.setText(this.items.get(arg4).getMenuItem().getTitle());
                    break;
                }
                case 2: {
                    v4 = this.items.get(arg4);
                    arg3.itemView.setPadding(0, ((NavigationMenuSeparatorItem)v4).getPaddingTop(), 0, ((NavigationMenuSeparatorItem)v4).getPaddingBottom());
                    break;
                }
                default: {
                    break;
                }
            }
        }

        public androidx.recyclerview.widget.RecyclerView$ViewHolder onCreateViewHolder(ViewGroup arg1, int arg2) {
            return this.onCreateViewHolder(arg1, arg2);
        }

        public ViewHolder onCreateViewHolder(ViewGroup arg3, int arg4) {
            switch(arg4) {
                case 0: {
                    goto label_18;
                }
                case 1: {
                    goto label_13;
                }
                case 2: {
                    goto label_8;
                }
                case 3: {
                    goto label_3;
                }
            }

            return null;
        label_18:
            return new NormalViewHolder(NavigationMenuPresenter.this.layoutInflater, arg3, NavigationMenuPresenter.this.onClickListener);
        label_3:
            return new HeaderViewHolder(NavigationMenuPresenter.this.headerLayout);
        label_8:
            return new SeparatorViewHolder(NavigationMenuPresenter.this.layoutInflater, arg3);
        label_13:
            return new SubheaderViewHolder(NavigationMenuPresenter.this.layoutInflater, arg3);
        }

        public void onViewRecycled(androidx.recyclerview.widget.RecyclerView$ViewHolder arg1) {
            this.onViewRecycled(((ViewHolder)arg1));
        }

        public void onViewRecycled(ViewHolder arg2) {
            if((arg2 instanceof NormalViewHolder)) {
                arg2.itemView.recycle();
            }
        }

        private void prepareMenuItems() {
            NavigationMenuAdapter v0 = this;
            if(v0.updateSuspended) {
                return;
            }

            v0.updateSuspended = true;
            v0.items.clear();
            v0.items.add(new NavigationMenuHeaderItem());
            int v3 = v0.this$0.menu.getVisibleItems().size();
            int v2 = 0;
            int v5 = -1;
            boolean v6 = false;
            int v7 = 0;
            while(v2 < v3) {
                Object v8 = v0.this$0.menu.getVisibleItems().get(v2);
                if(((MenuItemImpl)v8).isChecked()) {
                    v0.setCheckedItem(((MenuItemImpl)v8));
                }

                if(((MenuItemImpl)v8).isCheckable()) {
                    ((MenuItemImpl)v8).setExclusiveCheckable(false);
                }

                if(((MenuItemImpl)v8).hasSubMenu()) {
                    SubMenu v9 = ((MenuItemImpl)v8).getSubMenu();
                    if(v9.hasVisibleItems()) {
                        if(v2 != 0) {
                            v0.items.add(new NavigationMenuSeparatorItem(v0.this$0.paddingSeparator, 0));
                        }

                        v0.items.add(new NavigationMenuTextItem(((MenuItemImpl)v8)));
                        int v10 = v0.items.size();
                        int v11 = v9.size();
                        int v12 = 0;
                        int v13 = 0;
                        while(v12 < v11) {
                            MenuItem v14 = v9.getItem(v12);
                            if(((MenuItemImpl)v14).isVisible()) {
                                if(v13 == 0 && ((MenuItemImpl)v14).getIcon() != null) {
                                    v13 = 1;
                                }

                                if(((MenuItemImpl)v14).isCheckable()) {
                                    ((MenuItemImpl)v14).setExclusiveCheckable(false);
                                }

                                if(((MenuItemImpl)v8).isChecked()) {
                                    v0.setCheckedItem(((MenuItemImpl)v8));
                                }

                                v0.items.add(new NavigationMenuTextItem(((MenuItemImpl)v14)));
                            }

                            ++v12;
                        }

                        if(v13 == 0) {
                            goto label_114;
                        }

                        v0.appendTransparentIconIfMissing(v10, v0.items.size());
                    }
                }
                else {
                    int v1 = ((MenuItemImpl)v8).getGroupId();
                    if(v1 != v5) {
                        v7 = v0.items.size();
                        boolean v5_1 = ((MenuItemImpl)v8).getIcon() != null ? true : false;
                        if(v2 != 0) {
                            ++v7;
                            v0.items.add(new NavigationMenuSeparatorItem(v0.this$0.paddingSeparator, v0.this$0.paddingSeparator));
                        }

                        v6 = v5_1;
                    }
                    else {
                        if(v6) {
                            goto label_108;
                        }

                        if(((MenuItemImpl)v8).getIcon() == null) {
                            goto label_108;
                        }

                        v0.appendTransparentIconIfMissing(v7, v0.items.size());
                        v6 = true;
                    }

                label_108:
                    NavigationMenuTextItem v5_2 = new NavigationMenuTextItem(((MenuItemImpl)v8));
                    v5_2.needsEmptyIcon = v6;
                    v0.items.add(v5_2);
                    v5 = v1;
                }

            label_114:
                ++v2;
            }

            v0.updateSuspended = false;
        }

        public void restoreInstanceState(Bundle arg7) {
            int v1 = 0;
            int v0 = arg7.getInt("android:menu:checked", 0);
            if(v0 != 0) {
                this.updateSuspended = true;
                int v2 = this.items.size();
                int v3;
                for(v3 = 0; v3 < v2; ++v3) {
                    Object v4 = this.items.get(v3);
                    if((v4 instanceof NavigationMenuTextItem)) {
                        MenuItemImpl v4_1 = ((NavigationMenuTextItem)v4).getMenuItem();
                        if(v4_1 != null && v4_1.getItemId() == v0) {
                            this.setCheckedItem(v4_1);
                            break;
                        }
                    }
                }

                this.updateSuspended = false;
                this.prepareMenuItems();
            }

            SparseArray v7 = arg7.getSparseParcelableArray("android:menu:action_views");
            if(v7 != null) {
                v0 = this.items.size();
                while(v1 < v0) {
                    Object v2_1 = this.items.get(v1);
                    if(!(v2_1 instanceof NavigationMenuTextItem)) {
                    }
                    else {
                        MenuItemImpl v2_2 = ((NavigationMenuTextItem)v2_1).getMenuItem();
                        if(v2_2 == null) {
                        }
                        else {
                            View v3_1 = v2_2.getActionView();
                            if(v3_1 == null) {
                            }
                            else {
                                v2_1 = v7.get(v2_2.getItemId());
                                if(v2_1 == null) {
                                }
                                else {
                                    v3_1.restoreHierarchyState(((SparseArray)v2_1));
                                }
                            }
                        }
                    }

                    ++v1;
                }
            }
        }

        public void setCheckedItem(MenuItemImpl arg3) {
            if(this.checkedItem != arg3) {
                if(!arg3.isCheckable()) {
                }
                else {
                    if(this.checkedItem != null) {
                        this.checkedItem.setChecked(false);
                    }

                    this.checkedItem = arg3;
                    arg3.setChecked(true);
                    return;
                }
            }
        }

        public void setUpdateSuspended(boolean arg1) {
            this.updateSuspended = arg1;
        }

        public void update() {
            this.prepareMenuItems();
            this.notifyDataSetChanged();
        }
    }

    class NavigationMenuHeaderItem implements NavigationMenuItem {
        NavigationMenuHeaderItem() {
            super();
        }
    }

    interface NavigationMenuItem {
    }

    class NavigationMenuSeparatorItem implements NavigationMenuItem {
        private final int paddingBottom;
        private final int paddingTop;

        public NavigationMenuSeparatorItem(int arg1, int arg2) {
            super();
            this.paddingTop = arg1;
            this.paddingBottom = arg2;
        }

        public int getPaddingBottom() {
            return this.paddingBottom;
        }

        public int getPaddingTop() {
            return this.paddingTop;
        }
    }

    class NavigationMenuTextItem implements NavigationMenuItem {
        private final MenuItemImpl menuItem;
        boolean needsEmptyIcon;

        NavigationMenuTextItem(MenuItemImpl arg1) {
            super();
            this.menuItem = arg1;
        }

        public MenuItemImpl getMenuItem() {
            return this.menuItem;
        }
    }

    class NormalViewHolder extends ViewHolder {
        public NormalViewHolder(LayoutInflater arg3, ViewGroup arg4, View$OnClickListener arg5) {
            super(arg3.inflate(R$layout.design_navigation_item, arg4, false));
            this.itemView.setOnClickListener(arg5);
        }
    }

    class SeparatorViewHolder extends ViewHolder {
        public SeparatorViewHolder(LayoutInflater arg3, ViewGroup arg4) {
            super(arg3.inflate(R$layout.design_navigation_item_separator, arg4, false));
        }
    }

    class SubheaderViewHolder extends ViewHolder {
        public SubheaderViewHolder(LayoutInflater arg3, ViewGroup arg4) {
            super(arg3.inflate(R$layout.design_navigation_item_subheader, arg4, false));
        }
    }

    abstract class ViewHolder extends androidx.recyclerview.widget.RecyclerView$ViewHolder {
        public ViewHolder(View arg1) {
            super(arg1);
        }
    }

    private static final String STATE_ADAPTER = "android:menu:adapter";
    private static final String STATE_HEADER = "android:menu:header";
    private static final String STATE_HIERARCHY = "android:menu:list";
    NavigationMenuAdapter adapter;
    private Callback callback;
    LinearLayout headerLayout;
    ColorStateList iconTintList;
    private int id;
    Drawable itemBackground;
    int itemHorizontalPadding;
    int itemIconPadding;
    LayoutInflater layoutInflater;
    MenuBuilder menu;
    private NavigationMenuView menuView;
    final View$OnClickListener onClickListener;
    int paddingSeparator;
    private int paddingTopDefault;
    int textAppearance;
    boolean textAppearanceSet;
    ColorStateList textColor;

    public NavigationMenuPresenter() {
        super();
        this.onClickListener = new com.google.android.material.internal.NavigationMenuPresenter$1(this);
    }

    public void addHeaderView(@NonNull View arg3) {
        this.headerLayout.addView(arg3);
        this.menuView.setPadding(0, 0, 0, this.menuView.getPaddingBottom());
    }

    public boolean collapseItemActionView(MenuBuilder arg1, MenuItemImpl arg2) {
        return 0;
    }

    public void dispatchApplyWindowInsets(WindowInsetsCompat arg5) {
        int v0 = arg5.getSystemWindowInsetTop();
        if(this.paddingTopDefault != v0) {
            this.paddingTopDefault = v0;
            if(this.headerLayout.getChildCount() == 0) {
                this.menuView.setPadding(0, this.paddingTopDefault, 0, this.menuView.getPaddingBottom());
            }
        }

        ViewCompat.dispatchApplyWindowInsets(this.headerLayout, arg5);
    }

    public boolean expandItemActionView(MenuBuilder arg1, MenuItemImpl arg2) {
        return 0;
    }

    public boolean flagActionItems() {
        return 0;
    }

    @Nullable public MenuItemImpl getCheckedItem() {
        return this.adapter.getCheckedItem();
    }

    public int getHeaderCount() {
        return this.headerLayout.getChildCount();
    }

    public View getHeaderView(int arg2) {
        return this.headerLayout.getChildAt(arg2);
    }

    public int getId() {
        return this.id;
    }

    @Nullable public Drawable getItemBackground() {
        return this.itemBackground;
    }

    public int getItemHorizontalPadding() {
        return this.itemHorizontalPadding;
    }

    public int getItemIconPadding() {
        return this.itemIconPadding;
    }

    @Nullable public ColorStateList getItemTextColor() {
        return this.textColor;
    }

    @Nullable public ColorStateList getItemTintList() {
        return this.iconTintList;
    }

    public MenuView getMenuView(ViewGroup arg4) {
        if(this.menuView == null) {
            this.menuView = this.layoutInflater.inflate(R$layout.design_navigation_menu, arg4, false);
            if(this.adapter == null) {
                this.adapter = new NavigationMenuAdapter(this);
            }

            this.headerLayout = this.layoutInflater.inflate(R$layout.design_navigation_item_header, this.menuView, false);
            this.menuView.setAdapter(this.adapter);
        }

        return this.menuView;
    }

    public View inflateHeaderView(@LayoutRes int arg4) {
        View v4 = this.layoutInflater.inflate(arg4, this.headerLayout, false);
        this.addHeaderView(v4);
        return v4;
    }

    public void initForMenu(Context arg2, MenuBuilder arg3) {
        this.layoutInflater = LayoutInflater.from(arg2);
        this.menu = arg3;
        this.paddingSeparator = arg2.getResources().getDimensionPixelOffset(R$dimen.design_navigation_separator_vertical_padding);
    }

    public void onCloseMenu(MenuBuilder arg2, boolean arg3) {
        if(this.callback != null) {
            this.callback.onCloseMenu(arg2, arg3);
        }
    }

    public void onRestoreInstanceState(Parcelable arg3) {
        if((arg3 instanceof Bundle)) {
            SparseArray v0 = ((Bundle)arg3).getSparseParcelableArray("android:menu:list");
            if(v0 != null) {
                this.menuView.restoreHierarchyState(v0);
            }

            Bundle v0_1 = ((Bundle)arg3).getBundle("android:menu:adapter");
            if(v0_1 != null) {
                this.adapter.restoreInstanceState(v0_1);
            }

            SparseArray v3 = ((Bundle)arg3).getSparseParcelableArray("android:menu:header");
            if(v3 == null) {
                return;
            }

            this.headerLayout.restoreHierarchyState(v3);
        }
    }

    public Parcelable onSaveInstanceState() {
        SparseArray v1;
        Bundle v0 = new Bundle();
        if(this.menuView != null) {
            v1 = new SparseArray();
            this.menuView.saveHierarchyState(v1);
            v0.putSparseParcelableArray("android:menu:list", v1);
        }

        if(this.adapter != null) {
            v0.putBundle("android:menu:adapter", this.adapter.createInstanceState());
        }

        if(this.headerLayout != null) {
            v1 = new SparseArray();
            this.headerLayout.saveHierarchyState(v1);
            v0.putSparseParcelableArray("android:menu:header", v1);
        }

        return ((Parcelable)v0);
    }

    public boolean onSubMenuSelected(SubMenuBuilder arg1) {
        return 0;
    }

    public void removeHeaderView(@NonNull View arg4) {
        this.headerLayout.removeView(arg4);
        if(this.headerLayout.getChildCount() == 0) {
            this.menuView.setPadding(0, this.paddingTopDefault, 0, this.menuView.getPaddingBottom());
        }
    }

    public void setCallback(Callback arg1) {
        this.callback = arg1;
    }

    public void setCheckedItem(@NonNull MenuItemImpl arg2) {
        this.adapter.setCheckedItem(arg2);
    }

    public void setId(int arg1) {
        this.id = arg1;
    }

    public void setItemBackground(@Nullable Drawable arg1) {
        this.itemBackground = arg1;
        this.updateMenuView(false);
    }

    public void setItemHorizontalPadding(int arg1) {
        this.itemHorizontalPadding = arg1;
        this.updateMenuView(false);
    }

    public void setItemIconPadding(int arg1) {
        this.itemIconPadding = arg1;
        this.updateMenuView(false);
    }

    public void setItemIconTintList(@Nullable ColorStateList arg1) {
        this.iconTintList = arg1;
        this.updateMenuView(false);
    }

    public void setItemTextAppearance(@StyleRes int arg1) {
        this.textAppearance = arg1;
        this.textAppearanceSet = true;
        this.updateMenuView(false);
    }

    public void setItemTextColor(@Nullable ColorStateList arg1) {
        this.textColor = arg1;
        this.updateMenuView(false);
    }

    public void setUpdateSuspended(boolean arg2) {
        if(this.adapter != null) {
            this.adapter.setUpdateSuspended(arg2);
        }
    }

    public void updateMenuView(boolean arg1) {
        if(this.adapter != null) {
            this.adapter.update();
        }
    }
}

