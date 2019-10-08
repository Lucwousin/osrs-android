package androidx.core.content;

import android.content.Intent;
import android.os.Build$VERSION;
import androidx.annotation.NonNull;

public final class IntentCompat {
    public static final String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";

    private IntentCompat() {
        super();
    }

    @NonNull public static Intent makeMainSelectorActivity(@NonNull String arg2, @NonNull String arg3) {
        if(Build$VERSION.SDK_INT >= 15) {
            return Intent.makeMainSelectorActivity(arg2, arg3);
        }

        Intent v0 = new Intent(arg2);
        v0.addCategory(arg3);
        return v0;
    }
}

