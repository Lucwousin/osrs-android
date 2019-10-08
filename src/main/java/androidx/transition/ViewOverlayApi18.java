package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(value=18) class ViewOverlayApi18 implements ViewOverlayImpl {
    private final ViewOverlay mViewOverlay;

    ViewOverlayApi18(@NonNull View arg1) {
        super();
        this.mViewOverlay = arg1.getOverlay();
    }

    public void add(@NonNull Drawable arg2) {
        this.mViewOverlay.add(arg2);
    }

    public void clear() {
        this.mViewOverlay.clear();
    }

    public void remove(@NonNull Drawable arg2) {
        this.mViewOverlay.remove(arg2);
    }
}

