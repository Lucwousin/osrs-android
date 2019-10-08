package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public final class BottomNavigationMenu extends MenuBuilder {
    public static final int MAX_ITEM_COUNT = 5;

    public BottomNavigationMenu(Context arg1) {
        super(arg1);
    }

    protected MenuItem addInternal(int arg4, int arg5, int arg6, CharSequence arg7) {
        if(this.size() + 1 <= 5) {
            this.stopDispatchingItemsChanged();
            MenuItem v4 = super.addInternal(arg4, arg5, arg6, arg7);
            if((v4 instanceof MenuItemImpl)) {
                v4.setExclusiveCheckable(true);
            }

            this.startDispatchingItemsChanged();
            return v4;
        }

        throw new IllegalArgumentException("Maximum number of items supported by BottomNavigationView is 5. Limit can be checked with BottomNavigationView#getMaxItemCount()");
    }

    public SubMenu addSubMenu(int arg1, int arg2, int arg3, CharSequence arg4) {
        throw new UnsupportedOperationException("BottomNavigationView does not support submenus");
    }
}

