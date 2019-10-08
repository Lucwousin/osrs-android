package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Build$VERSION;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public final class MenuWrapperFactory {
    private MenuWrapperFactory() {
        super();
    }

    public static Menu wrapSupportMenu(Context arg1, SupportMenu arg2) {
        return new MenuWrapperICS(arg1, arg2);
    }

    public static MenuItem wrapSupportMenuItem(Context arg2, SupportMenuItem arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            return new MenuItemWrapperJB(arg2, arg3);
        }

        return new MenuItemWrapperICS(arg2, arg3);
    }

    public static SubMenu wrapSupportSubMenu(Context arg1, SupportSubMenu arg2) {
        return new SubMenuWrapperICS(arg1, arg2);
    }
}

