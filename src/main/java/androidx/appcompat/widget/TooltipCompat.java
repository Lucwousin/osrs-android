package androidx.appcompat.widget;

import android.os.Build$VERSION;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class TooltipCompat {
    private TooltipCompat() {
        super();
    }

    public static void setTooltipText(@NonNull View arg2, @Nullable CharSequence arg3) {
        if(Build$VERSION.SDK_INT >= 26) {
            arg2.setTooltipText(arg3);
        }
        else {
            TooltipCompatHandler.setTooltipText(arg2, arg3);
        }
    }
}

