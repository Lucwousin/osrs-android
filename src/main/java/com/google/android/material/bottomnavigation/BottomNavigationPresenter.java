package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter$Callback;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class BottomNavigationPresenter implements MenuPresenter {
    class SavedState implements Parcelable {
        final class com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$1 implements Parcelable$Creator {
            com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$1() {
                super();
            }

            public SavedState createFromParcel(Parcel arg2) {
                return new SavedState(arg2);
            }

            public Object createFromParcel(Parcel arg1) {
                return this.createFromParcel(arg1);
            }

            public SavedState[] newArray(int arg1) {
                return new SavedState[arg1];
            }

            public Object[] newArray(int arg1) {
                return this.newArray(arg1);
            }
        }

        public static final Parcelable$Creator CREATOR;
        int selectedItemId;

        static {
            SavedState.CREATOR = new com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$1();
        }

        SavedState() {
            super();
        }

        SavedState(Parcel arg1) {
            super();
            this.selectedItemId = arg1.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(@NonNull Parcel arg1, int arg2) {
            arg1.writeInt(this.selectedItemId);
        }
    }

    private int id;
    private MenuBuilder menu;
    private BottomNavigationMenuView menuView;
    private boolean updateSuspended;

    public BottomNavigationPresenter() {
        super();
        this.updateSuspended = false;
    }

    public boolean collapseItemActionView(MenuBuilder arg1, MenuItemImpl arg2) {
        return 0;
    }

    public boolean expandItemActionView(MenuBuilder arg1, MenuItemImpl arg2) {
        return 0;
    }

    public boolean flagActionItems() {
        return 0;
    }

    public int getId() {
        return this.id;
    }

    public MenuView getMenuView(ViewGroup arg1) {
        return this.menuView;
    }

    public void initForMenu(Context arg1, MenuBuilder arg2) {
        this.menu = arg2;
        this.menuView.initialize(this.menu);
    }

    public void onCloseMenu(MenuBuilder arg1, boolean arg2) {
    }

    public void onRestoreInstanceState(Parcelable arg2) {
        if((arg2 instanceof SavedState)) {
            this.menuView.tryRestoreSelectedItemId(((SavedState)arg2).selectedItemId);
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState v0 = new SavedState();
        v0.selectedItemId = this.menuView.getSelectedItemId();
        return ((Parcelable)v0);
    }

    public boolean onSubMenuSelected(SubMenuBuilder arg1) {
        return 0;
    }

    public void setBottomNavigationMenuView(BottomNavigationMenuView arg1) {
        this.menuView = arg1;
    }

    public void setCallback(Callback arg1) {
    }

    public void setId(int arg1) {
        this.id = arg1;
    }

    public void setUpdateSuspended(boolean arg1) {
        this.updateSuspended = arg1;
    }

    public void updateMenuView(boolean arg2) {
        if(this.updateSuspended) {
            return;
        }

        if(arg2) {
            this.menuView.buildMenuView();
        }
        else {
            this.menuView.updateMenuView();
        }
    }
}

