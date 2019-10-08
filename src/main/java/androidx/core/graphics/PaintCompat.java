package androidx.core.graphics;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build$VERSION;
import androidx.annotation.NonNull;
import androidx.core.util.Pair;

public final class PaintCompat {
    private static final String EM_STRING = "m";
    private static final String TOFU_STRING = "\uDB3F\uDFFD";
    private static final ThreadLocal sRectThreadLocal;

    static {
        PaintCompat.sRectThreadLocal = new ThreadLocal();
    }

    private PaintCompat() {
        super();
    }

    public static boolean hasGlyph(@NonNull Paint arg8, @NonNull String arg9) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg8.hasGlyph(arg9);
        }

        int v0 = arg9.length();
        if(v0 == 1 && (Character.isWhitespace(arg9.charAt(0)))) {
            return 1;
        }

        float v3 = arg8.measureText("\uDB3F\uDFFD");
        float v4 = arg8.measureText("m");
        float v5 = arg8.measureText(arg9);
        float v6 = 0f;
        if(v5 == 0f) {
            return 0;
        }

        if(arg9.codePointCount(0, arg9.length()) > 1) {
            if(v5 > v4 * 2f) {
                return 0;
            }
            else {
                int v4_1;
                for(v4_1 = 0; v4_1 < v0; v4_1 = v7) {
                    int v7 = Character.charCount(arg9.codePointAt(v4_1)) + v4_1;
                    v6 += arg8.measureText(arg9, v4_1, v7);
                }

                if(v5 >= v6) {
                    return 0;
                }
            }
        }

        if(v5 != v3) {
            return 1;
        }

        Pair v3_1 = PaintCompat.obtainEmptyRects();
        arg8.getTextBounds("\uDB3F\uDFFD", 0, "\uDB3F\uDFFD".length(), v3_1.first);
        arg8.getTextBounds(arg9, 0, v0, v3_1.second);
        return v3_1.first.equals(v3_1.second) ^ 1;
    }

    private static Pair obtainEmptyRects() {
        Pair v0_1;
        Object v0 = PaintCompat.sRectThreadLocal.get();
        if(v0 == null) {
            v0_1 = new Pair(new Rect(), new Rect());
            PaintCompat.sRectThreadLocal.set(v0_1);
        }
        else {
            ((Pair)v0).first.setEmpty();
            ((Pair)v0).second.setEmpty();
        }

        return v0_1;
    }
}

