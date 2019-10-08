package androidx.core.graphics;

import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(value=28) @RestrictTo(value={Scope.LIBRARY_GROUP}) public class TypefaceCompatApi28Impl extends TypefaceCompatApi26Impl {
    private static final String CREATE_FROM_FAMILIES_WITH_DEFAULT_METHOD = "createFromFamiliesWithDefault";
    private static final String DEFAULT_FAMILY = "sans-serif";
    private static final int RESOLVE_BY_FONT_TABLE = -1;
    private static final String TAG = "TypefaceCompatApi28Impl";

    public TypefaceCompatApi28Impl() {
        super();
    }

    protected Typeface createFromFamiliesWithDefault(Object arg6) {
        try {
            Object v0 = Array.newInstance(this.mFontFamily, 1);
            Array.set(v0, 0, arg6);
            return this.mCreateFromFamiliesWithDefault.invoke(null, v0, "sans-serif", Integer.valueOf(-1), Integer.valueOf(-1));
        }
        catch(InvocationTargetException v6) {
            throw new RuntimeException(((Throwable)v6));
        }
    }

    protected Method obtainCreateFromFamiliesWithDefaultMethod(Class arg6) throws NoSuchMethodException {
        Method v6 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(arg6, 1).getClass(), String.class, Integer.TYPE, Integer.TYPE);
        v6.setAccessible(true);
        return v6;
    }
}

