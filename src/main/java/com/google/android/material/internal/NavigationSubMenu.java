package com.google.android.material.internal;

import android.content.Context;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class NavigationSubMenu extends SubMenuBuilder {
    public NavigationSubMenu(Context arg1, NavigationMenu arg2, MenuItemImpl arg3) {
        super(arg1, ((MenuBuilder)arg2), arg3);
    }

    public void onItemsChanged(boolean arg2) {
        super.onItemsChanged(arg2);
        this.getParentMenu().onItemsChanged(arg2);
    }
}

