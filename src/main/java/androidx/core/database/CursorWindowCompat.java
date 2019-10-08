package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build$VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class CursorWindowCompat {
    private CursorWindowCompat() {
        super();
    }

    @NonNull public static CursorWindow create(@Nullable String arg2, long arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            return new CursorWindow(arg2, arg3);
        }

        if(Build$VERSION.SDK_INT >= 15) {
            return new CursorWindow(arg2);
        }

        return new CursorWindow(false);
    }
}

