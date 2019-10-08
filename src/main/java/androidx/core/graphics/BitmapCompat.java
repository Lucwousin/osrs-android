package androidx.core.graphics;

import android.graphics.Bitmap;
import android.os.Build$VERSION;
import androidx.annotation.NonNull;

public final class BitmapCompat {
    private BitmapCompat() {
        super();
    }

    public static int getAllocationByteCount(@NonNull Bitmap arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return arg2.getAllocationByteCount();
        }

        return arg2.getByteCount();
    }

    public static boolean hasMipMap(@NonNull Bitmap arg2) {
        if(Build$VERSION.SDK_INT >= 18) {
            return arg2.hasMipMap();
        }

        return 0;
    }

    public static void setHasMipMap(@NonNull Bitmap arg2, boolean arg3) {
        if(Build$VERSION.SDK_INT >= 18) {
            arg2.setHasMipMap(arg3);
        }
    }
}

