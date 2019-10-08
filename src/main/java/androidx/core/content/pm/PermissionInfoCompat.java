package androidx.core.content.pm;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build$VERSION;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public final class PermissionInfoCompat {
    @RestrictTo(value={Scope.LIBRARY}) @Retention(value=RetentionPolicy.SOURCE) @public interface Protection {
    }

    @SuppressLint(value={"UniqueConstants"}) @RestrictTo(value={Scope.LIBRARY}) @Retention(value=RetentionPolicy.SOURCE) @public interface ProtectionFlags {
    }

    private PermissionInfoCompat() {
        super();
    }

    @SuppressLint(value={"WrongConstant"}) public static int getProtection(@NonNull PermissionInfo arg2) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg2.getProtection();
        }

        return arg2.protectionLevel & 15;
    }

    @SuppressLint(value={"WrongConstant"}) public static int getProtectionFlags(@NonNull PermissionInfo arg2) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg2.getProtectionFlags();
        }

        return arg2.protectionLevel & -16;
    }
}

