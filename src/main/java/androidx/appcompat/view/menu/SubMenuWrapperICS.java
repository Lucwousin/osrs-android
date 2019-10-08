package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportSubMenu;

@RestrictTo(value={Scope.LIBRARY_GROUP}) class SubMenuWrapperICS extends MenuWrapperICS implements SubMenu {
    SubMenuWrapperICS(Context arg1, SupportSubMenu arg2) {
        super(arg1, ((SupportMenu)arg2));
    }

    public void clearHeader() {
        this.getWrappedObject().clearHeader();
    }

    public MenuItem getItem() {
        return this.getMenuItemWrapper(this.getWrappedObject().getItem());
    }

    public SupportSubMenu getWrappedObject() {
        return this.mWrappedObject;
    }

    public Object getWrappedObject() {
        return this.getWrappedObject();
    }

    public SubMenu setHeaderIcon(int arg2) {
        this.getWrappedObject().setHeaderIcon(arg2);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable arg2) {
        this.getWrappedObject().setHeaderIcon(arg2);
        return this;
    }

    public SubMenu setHeaderTitle(int arg2) {
        this.getWrappedObject().setHeaderTitle(arg2);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence arg2) {
        this.getWrappedObject().setHeaderTitle(arg2);
        return this;
    }

    public SubMenu setHeaderView(View arg2) {
        this.getWrappedObject().setHeaderView(arg2);
        return this;
    }

    public SubMenu setIcon(int arg2) {
        this.getWrappedObject().setIcon(arg2);
        return this;
    }

    public SubMenu setIcon(Drawable arg2) {
        this.getWrappedObject().setIcon(arg2);
        return this;
    }
}

