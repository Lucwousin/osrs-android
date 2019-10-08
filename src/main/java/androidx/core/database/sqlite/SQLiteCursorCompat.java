package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build$VERSION;
import androidx.annotation.NonNull;

public final class SQLiteCursorCompat {
    private SQLiteCursorCompat() {
        super();
    }

    public static void setFillWindowForwardOnly(@NonNull SQLiteCursor arg2, boolean arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            arg2.setFillWindowForwardOnly(arg3);
        }
    }
}

