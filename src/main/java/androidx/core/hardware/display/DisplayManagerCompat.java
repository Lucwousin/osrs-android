package androidx.core.hardware.display;

import android.content.Context;
import android.os.Build$VERSION;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.WeakHashMap;

public final class DisplayManagerCompat {
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private final Context mContext;
    private static final WeakHashMap sInstances;

    static {
        DisplayManagerCompat.sInstances = new WeakHashMap();
    }

    private DisplayManagerCompat(Context arg1) {
        super();
        this.mContext = arg1;
    }

    @Nullable public Display getDisplay(int arg3) {
        if(Build$VERSION.SDK_INT >= 17) {
            return this.mContext.getSystemService("display").getDisplay(arg3);
        }

        Display v0 = this.mContext.getSystemService("window").getDefaultDisplay();
        if(v0.getDisplayId() == arg3) {
            return v0;
        }

        return null;
    }

    @NonNull public Display[] getDisplays() {
        if(Build$VERSION.SDK_INT >= 17) {
            return this.mContext.getSystemService("display").getDisplays();
        }

        return new Display[]{this.mContext.getSystemService("window").getDefaultDisplay()};
    }

    @NonNull public Display[] getDisplays(@Nullable String arg3) {
        if(Build$VERSION.SDK_INT >= 17) {
            return this.mContext.getSystemService("display").getDisplays(arg3);
        }

        if(arg3 == null) {
            return new Display[0];
        }

        return new Display[]{this.mContext.getSystemService("window").getDefaultDisplay()};
    }

    @NonNull public static DisplayManagerCompat getInstance(@NonNull Context arg3) {
        DisplayManagerCompat v1_1;
        WeakHashMap v0 = DisplayManagerCompat.sInstances;
        __monitor_enter(v0);
        try {
            Object v1 = DisplayManagerCompat.sInstances.get(arg3);
            if(v1 == null) {
                v1_1 = new DisplayManagerCompat(arg3);
                DisplayManagerCompat.sInstances.put(arg3, v1_1);
            }

            __monitor_exit(v0);
            return v1_1;
        label_12:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_12;
        }

        throw v3;
    }
}

