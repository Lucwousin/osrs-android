package androidx.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

class ViewGroupOverlayApi14 extends ViewOverlayApi14 implements ViewGroupOverlayImpl {
    ViewGroupOverlayApi14(Context arg1, ViewGroup arg2, View arg3) {
        super(arg1, arg2, arg3);
    }

    public void add(@NonNull View arg2) {
        this.mOverlayViewGroup.add(arg2);
    }

    static ViewGroupOverlayApi14 createFrom(ViewGroup arg0) {
        return ViewOverlayApi14.createFrom(((View)arg0));
    }

    public void remove(@NonNull View arg2) {
        this.mOverlayViewGroup.remove(arg2);
    }
}

