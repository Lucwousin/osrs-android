package androidx.core.widget;

import android.os.Build$VERSION;
import android.view.View$OnTouchListener;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class PopupMenuCompat {
    private PopupMenuCompat() {
        super();
    }

    @Nullable public static View$OnTouchListener getDragToOpenListener(@NonNull Object arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return ((PopupMenu)arg2).getDragToOpenListener();
        }

        return null;
    }
}

