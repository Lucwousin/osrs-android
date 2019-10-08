package androidx.transition;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(value=18) class WindowIdApi18 implements WindowIdImpl {
    private final WindowId mWindowId;

    WindowIdApi18(@NonNull View arg1) {
        super();
        this.mWindowId = arg1.getWindowId();
    }

    public boolean equals(Object arg2) {
        boolean v2 = !(arg2 instanceof WindowIdApi18) || !((WindowIdApi18)arg2).mWindowId.equals(this.mWindowId) ? false : true;
        return v2;
    }

    public int hashCode() {
        return this.mWindowId.hashCode();
    }
}

