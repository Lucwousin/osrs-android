package androidx.core.widget;

import android.os.Build$VERSION;
import android.view.View$OnTouchListener;
import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class ListPopupWindowCompat {
    private ListPopupWindowCompat() {
        super();
    }

    @Nullable public static View$OnTouchListener createDragToOpenListener(@NonNull ListPopupWindow arg2, @NonNull View arg3) {
        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.createDragToOpenListener(arg3);
        }

        return null;
    }

    @Deprecated public static View$OnTouchListener createDragToOpenListener(Object arg0, View arg1) {
        return ListPopupWindowCompat.createDragToOpenListener(((ListPopupWindow)arg0), arg1);
    }
}

