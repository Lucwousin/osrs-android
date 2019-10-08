package androidx.core.view.inputmethod;

import android.os.Build$VERSION;
import android.os.Bundle;
import android.view.inputmethod.EditorInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class EditorInfoCompat {
    private static final String CONTENT_MIME_TYPES_KEY = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES";
    private static final String[] EMPTY_STRING_ARRAY = null;
    public static final int IME_FLAG_FORCE_ASCII = 0x80000000;
    public static final int IME_FLAG_NO_PERSONALIZED_LEARNING = 0x1000000;

    static {
        EditorInfoCompat.EMPTY_STRING_ARRAY = new String[0];
    }

    @Deprecated public EditorInfoCompat() {
        super();
    }

    @NonNull public static String[] getContentMimeTypes(EditorInfo arg2) {
        String[] v2;
        if(Build$VERSION.SDK_INT >= 25) {
            v2 = arg2.contentMimeTypes;
            if(v2 != null) {
            }
            else {
                v2 = EditorInfoCompat.EMPTY_STRING_ARRAY;
            }

            return v2;
        }

        if(arg2.extras == null) {
            return EditorInfoCompat.EMPTY_STRING_ARRAY;
        }

        v2 = arg2.extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if(v2 != null) {
        }
        else {
            v2 = EditorInfoCompat.EMPTY_STRING_ARRAY;
        }

        return v2;
    }

    public static void setContentMimeTypes(@NonNull EditorInfo arg2, @Nullable String[] arg3) {
        if(Build$VERSION.SDK_INT >= 25) {
            arg2.contentMimeTypes = arg3;
        }
        else {
            if(arg2.extras == null) {
                arg2.extras = new Bundle();
            }

            arg2.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", arg3);
        }
    }
}

