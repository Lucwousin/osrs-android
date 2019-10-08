package androidx.core.util;

import android.os.Build$VERSION;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

public class ObjectsCompat {
    private ObjectsCompat() {
        super();
    }

    public static boolean equals(@Nullable Object arg2, @Nullable Object arg3) {
        boolean v2;
        if(Build$VERSION.SDK_INT >= 19) {
            return Objects.equals(arg2, arg3);
        }

        if(arg2 != arg3) {
            if(arg2 != null && (arg2.equals(arg3))) {
                goto label_12;
            }

            v2 = false;
        }
        else {
        label_12:
            v2 = true;
        }

        return v2;
    }

    public static int hash(@Nullable Object[] arg2) {
        if(Build$VERSION.SDK_INT >= 19) {
            return Objects.hash(arg2);
        }

        return Arrays.hashCode(arg2);
    }

    public static int hashCode(@Nullable Object arg0) {
        int v0 = arg0 != null ? arg0.hashCode() : 0;
        return v0;
    }
}

