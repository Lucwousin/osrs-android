package androidx.core.view;

import android.content.Context;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater$Factory2;
import android.view.LayoutInflater$Factory;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

public final class LayoutInflaterCompat {
    class Factory2Wrapper implements LayoutInflater$Factory2 {
        final LayoutInflaterFactory mDelegateFactory;

        Factory2Wrapper(LayoutInflaterFactory arg1) {
            super();
            this.mDelegateFactory = arg1;
        }

        public View onCreateView(View arg2, String arg3, Context arg4, AttributeSet arg5) {
            return this.mDelegateFactory.onCreateView(arg2, arg3, arg4, arg5);
        }

        public View onCreateView(String arg3, Context arg4, AttributeSet arg5) {
            return this.mDelegateFactory.onCreateView(null, arg3, arg4, arg5);
        }

        public String toString() {
            return this.getClass().getName() + "{" + this.mDelegateFactory + "}";
        }
    }

    private static final String TAG = "LayoutInflaterCompatHC";
    private static boolean sCheckedField;
    private static Field sLayoutInflaterFactory2Field;

    private LayoutInflaterCompat() {
        super();
    }

    private static void forceSetFactory2(LayoutInflater arg5, LayoutInflater$Factory2 arg6) {
        if(!LayoutInflaterCompat.sCheckedField) {
            try {
                LayoutInflaterCompat.sLayoutInflaterFactory2Field = LayoutInflater.class.getDeclaredField("mFactory2");
                LayoutInflaterCompat.sLayoutInflaterFactory2Field.setAccessible(true);
            }
            catch(NoSuchFieldException v1) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field \'mFactory2\' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", ((Throwable)v1));
            }

            LayoutInflaterCompat.sCheckedField = true;
        }

        if(LayoutInflaterCompat.sLayoutInflaterFactory2Field != null) {
            try {
                LayoutInflaterCompat.sLayoutInflaterFactory2Field.set(arg5, arg6);
            }
            catch(IllegalAccessException v6) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + arg5 + "; inflation may have unexpected results.", ((Throwable)v6));
            }
        }
    }

    @Deprecated public static LayoutInflaterFactory getFactory(LayoutInflater arg1) {
        LayoutInflater$Factory v1 = arg1.getFactory();
        if((v1 instanceof Factory2Wrapper)) {
            return ((Factory2Wrapper)v1).mDelegateFactory;
        }

        return null;
    }

    @Deprecated public static void setFactory(@NonNull LayoutInflater arg3, @NonNull LayoutInflaterFactory arg4) {
        Factory2Wrapper v1_1;
        LayoutInflater$Factory2 v1 = null;
        if(Build$VERSION.SDK_INT >= 21) {
            if(arg4 != null) {
                v1_1 = new Factory2Wrapper(arg4);
            }

            arg3.setFactory2(v1);
        }
        else {
            if(arg4 != null) {
                v1_1 = new Factory2Wrapper(arg4);
            }

            arg3.setFactory2(v1);
            LayoutInflater$Factory v4 = arg3.getFactory();
            if((v4 instanceof LayoutInflater$Factory2)) {
                LayoutInflaterCompat.forceSetFactory2(arg3, ((LayoutInflater$Factory2)v4));
                return;
            }

            LayoutInflaterCompat.forceSetFactory2(arg3, v1);
        }
    }

    public static void setFactory2(@NonNull LayoutInflater arg2, @NonNull LayoutInflater$Factory2 arg3) {
        arg2.setFactory2(arg3);
        if(Build$VERSION.SDK_INT < 21) {
            LayoutInflater$Factory v0 = arg2.getFactory();
            if((v0 instanceof LayoutInflater$Factory2)) {
                LayoutInflaterCompat.forceSetFactory2(arg2, ((LayoutInflater$Factory2)v0));
            }
            else {
                LayoutInflaterCompat.forceSetFactory2(arg2, arg3);
            }
        }
    }
}

