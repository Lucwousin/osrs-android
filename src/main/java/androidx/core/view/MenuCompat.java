package androidx.core.view;

import android.annotation.SuppressLint;
import android.os.Build$VERSION;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.internal.view.SupportMenu;

public final class MenuCompat {
    private MenuCompat() {
        super();
    }

    @SuppressLint(value={"NewApi"}) public static void setGroupDividerEnabled(Menu arg2, boolean arg3) {
        if((arg2 instanceof SupportMenu)) {
            ((SupportMenu)arg2).setGroupDividerEnabled(arg3);
        }
        else if(Build$VERSION.SDK_INT >= 28) {
            arg2.setGroupDividerEnabled(arg3);
        }
    }

    @Deprecated public static void setShowAsAction(MenuItem arg0, int arg1) {
        arg0.setShowAsAction(arg1);
    }
}

