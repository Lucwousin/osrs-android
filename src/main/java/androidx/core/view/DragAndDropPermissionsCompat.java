package androidx.core.view;

import android.app.Activity;
import android.os.Build$VERSION;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

public final class DragAndDropPermissionsCompat {
    private Object mDragAndDropPermissions;

    private DragAndDropPermissionsCompat(Object arg1) {
        super();
        this.mDragAndDropPermissions = arg1;
    }

    public void release() {
        if(Build$VERSION.SDK_INT >= 24) {
            this.mDragAndDropPermissions.release();
        }
    }

    @Nullable @RestrictTo(value={Scope.LIBRARY_GROUP}) public static DragAndDropPermissionsCompat request(Activity arg2, DragEvent arg3) {
        if(Build$VERSION.SDK_INT >= 24) {
            DragAndDropPermissions v2 = arg2.requestDragAndDropPermissions(arg3);
            if(v2 != null) {
                return new DragAndDropPermissionsCompat(v2);
            }
        }

        return null;
    }
}

