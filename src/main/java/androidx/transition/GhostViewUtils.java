package androidx.transition;

import android.graphics.Matrix;
import android.os.Build$VERSION;
import android.view.View;
import android.view.ViewGroup;

class GhostViewUtils {
    private GhostViewUtils() {
        super();
    }

    static GhostViewImpl addGhost(View arg2, ViewGroup arg3, Matrix arg4) {
        if(Build$VERSION.SDK_INT >= 21) {
            return GhostViewApi21.addGhost(arg2, arg3, arg4);
        }

        return GhostViewApi14.addGhost(arg2, arg3);
    }

    static void removeGhost(View arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            GhostViewApi21.removeGhost(arg2);
        }
        else {
            GhostViewApi14.removeGhost(arg2);
        }
    }
}

