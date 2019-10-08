package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(value=18) class ViewGroupOverlayApi18 implements ViewGroupOverlayImpl {
    private final ViewGroupOverlay mViewGroupOverlay;

    ViewGroupOverlayApi18(@NonNull ViewGroup arg1) {
        super();
        this.mViewGroupOverlay = arg1.getOverlay();
    }

    public void add(@NonNull Drawable arg2) {
        this.mViewGroupOverlay.add(arg2);
    }

    public void add(@NonNull View arg2) {
        this.mViewGroupOverlay.add(arg2);
    }

    public void clear() {
        this.mViewGroupOverlay.clear();
    }

    public void remove(@NonNull Drawable arg2) {
        this.mViewGroupOverlay.remove(arg2);
    }

    public void remove(@NonNull View arg2) {
        this.mViewGroupOverlay.remove(arg2);
    }
}

