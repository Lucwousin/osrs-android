package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.os.Build$VERSION;
import androidx.annotation.NonNull;

public final class PackageInfoCompat {
    private PackageInfoCompat() {
        super();
    }

    public static long getLongVersionCode(@NonNull PackageInfo arg2) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg2.getLongVersionCode();
        }

        return ((long)arg2.versionCode);
    }
}

