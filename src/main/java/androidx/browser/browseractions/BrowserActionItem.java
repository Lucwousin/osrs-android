package androidx.browser.browseractions;

import android.app.PendingIntent;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;

public class BrowserActionItem {
    private final PendingIntent mAction;
    @DrawableRes private final int mIconId;
    private final String mTitle;

    public BrowserActionItem(@NonNull String arg2, @NonNull PendingIntent arg3) {
        this(arg2, arg3, 0);
    }

    public BrowserActionItem(@NonNull String arg1, @NonNull PendingIntent arg2, @DrawableRes int arg3) {
        super();
        this.mTitle = arg1;
        this.mAction = arg2;
        this.mIconId = arg3;
    }

    public PendingIntent getAction() {
        return this.mAction;
    }

    public int getIconId() {
        return this.mIconId;
    }

    public String getTitle() {
        return this.mTitle;
    }
}

