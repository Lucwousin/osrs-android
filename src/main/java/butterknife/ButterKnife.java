package butterknife;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.util.Log;
import android.util.Property;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ButterKnife {
    public interface Action {
        @UiThread void apply(@NonNull View arg1, int arg2);
    }

    public interface Setter {
        @UiThread void set(@NonNull View arg1, Object arg2, int arg3);
    }

    @VisibleForTesting static final Map BINDINGS = null;
    private static final String TAG = "ButterKnife";
    private static boolean debug = false;

    static {
        ButterKnife.BINDINGS = new LinkedHashMap();
    }

    private ButterKnife() {
        super();
        throw new AssertionError("No instances.");
    }

    @TargetApi(value=14) @RequiresApi(value=14) @UiThread public static void apply(@NonNull View arg0, @NonNull Property arg1, Object arg2) {
        arg1.set(arg0, arg2);
    }

    @UiThread public static void apply(@NonNull View arg1, @NonNull Action arg2) {
        arg2.apply(arg1, 0);
    }

    @UiThread public static void apply(@NonNull View arg1, @NonNull Setter arg2, Object arg3) {
        arg2.set(arg1, arg3, 0);
    }

    @UiThread @SafeVarargs public static void apply(@NonNull View arg4, @NonNull Action[] arg5) {
        int v0 = arg5.length;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            arg5[v2].apply(arg4, 0);
        }
    }

    @TargetApi(value=14) @RequiresApi(value=14) @UiThread public static void apply(@NonNull List arg3, @NonNull Property arg4, Object arg5) {
        int v0 = arg3.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            arg4.set(arg3.get(v1), arg5);
        }
    }

    @UiThread public static void apply(@NonNull List arg3, @NonNull Action arg4) {
        int v0 = arg3.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            arg4.apply(arg3.get(v1), v1);
        }
    }

    @UiThread public static void apply(@NonNull List arg3, @NonNull Setter arg4, Object arg5) {
        int v0 = arg3.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            arg4.set(arg3.get(v1), arg5, v1);
        }
    }

    @UiThread @SafeVarargs public static void apply(@NonNull List arg7, @NonNull Action[] arg8) {
        int v0 = arg7.size();
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v3 = arg8.length;
            int v4;
            for(v4 = 0; v4 < v3; ++v4) {
                arg8[v4].apply(arg7.get(v2), v2);
            }
        }
    }

    @TargetApi(value=14) @RequiresApi(value=14) @UiThread public static void apply(@NonNull View[] arg3, @NonNull Property arg4, Object arg5) {
        int v0 = arg3.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            arg4.set(arg3[v1], arg5);
        }
    }

    @UiThread public static void apply(@NonNull View[] arg3, @NonNull Action arg4) {
        int v0 = arg3.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            arg4.apply(arg3[v1], v1);
        }
    }

    @UiThread public static void apply(@NonNull View[] arg3, @NonNull Setter arg4, Object arg5) {
        int v0 = arg3.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            arg4.set(arg3[v1], arg5, v1);
        }
    }

    @UiThread @SafeVarargs public static void apply(@NonNull View[] arg7, @NonNull Action[] arg8) {
        int v0 = arg7.length;
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            int v3 = arg8.length;
            int v4;
            for(v4 = 0; v4 < v3; ++v4) {
                arg8[v4].apply(arg7[v2], v2);
            }
        }
    }

    @NonNull @UiThread public static Unbinder bind(@NonNull Activity arg1) {
        return ButterKnife.createBinding(arg1, arg1.getWindow().getDecorView());
    }

    @NonNull @UiThread public static Unbinder bind(@NonNull Dialog arg1) {
        return ButterKnife.createBinding(arg1, arg1.getWindow().getDecorView());
    }

    @NonNull @UiThread public static Unbinder bind(@NonNull View arg0) {
        return ButterKnife.createBinding(arg0, arg0);
    }

    @NonNull @UiThread public static Unbinder bind(@NonNull Object arg0, @NonNull Activity arg1) {
        return ButterKnife.createBinding(arg0, arg1.getWindow().getDecorView());
    }

    @NonNull @UiThread public static Unbinder bind(@NonNull Object arg0, @NonNull Dialog arg1) {
        return ButterKnife.createBinding(arg0, arg1.getWindow().getDecorView());
    }

    @NonNull @UiThread public static Unbinder bind(@NonNull Object arg0, @NonNull View arg1) {
        return ButterKnife.createBinding(arg0, arg1);
    }

    private static Unbinder createBinding(@NonNull Object arg4, @NonNull View arg5) {
        StringBuilder v1_2;
        Class v0 = arg4.getClass();
        if(ButterKnife.debug) {
            Log.d("ButterKnife", "Looking up binding for " + v0.getName());
        }

        Constructor v0_1 = ButterKnife.findBindingConstructorForClass(v0);
        if(v0_1 == null) {
            return Unbinder.EMPTY;
        }

        int v1 = 2;
        try {
            return v0_1.newInstance(arg4, arg5);
        }
        catch(InvocationTargetException v4) {
            Throwable v4_3 = v4.getCause();
            if(!(v4_3 instanceof RuntimeException)) {
                if((v4_3 instanceof Error)) {
                    throw v4_3;
                }

                throw new RuntimeException("Unable to create binding instance.", v4_3);
            }

            throw v4_3;
        }
        catch(InstantiationException v4_1) {
            v1_2 = new StringBuilder();
            v1_2.append("Unable to invoke ");
            v1_2.append(v0_1);
            throw new RuntimeException(v1_2.toString(), ((Throwable)v4_1));
        }
        catch(IllegalAccessException v4_2) {
            v1_2 = new StringBuilder();
            v1_2.append("Unable to invoke ");
            v1_2.append(v0_1);
            throw new RuntimeException(v1_2.toString(), ((Throwable)v4_2));
        }
    }

    @CheckResult @Nullable @UiThread private static Constructor findBindingConstructorForClass(Class arg5) {
        Constructor v1_1;
        StringBuilder v2;
        Object v0 = ButterKnife.BINDINGS.get(arg5);
        if(v0 != null) {
            if(ButterKnife.debug) {
                Log.d("ButterKnife", "HIT: Cached in binding map.");
            }

            return ((Constructor)v0);
        }

        String v0_1 = arg5.getName();
        if(!v0_1.startsWith("android.")) {
            if(v0_1.startsWith("java.")) {
            }
            else {
                try {
                    ClassLoader v1 = arg5.getClassLoader();
                    v2 = new StringBuilder();
                    v2.append(v0_1);
                    v2.append("_ViewBinding");
                    v1_1 = v1.loadClass(v2.toString()).getConstructor(arg5, View.class);
                    if(ButterKnife.debug) {
                        Log.d("ButterKnife", "HIT: Loaded binding class and constructor.");
                    }
                    else {
                    }
                }
                catch(NoSuchMethodException v5) {
                    v2 = new StringBuilder();
                    v2.append("Unable to find binding constructor for ");
                    v2.append(v0_1);
                    throw new RuntimeException(v2.toString(), ((Throwable)v5));
                }
                catch(ClassNotFoundException ) {
                    if(ButterKnife.debug) {
                        Log.d("ButterKnife", "Not found. Trying superclass " + arg5.getSuperclass().getName());
                    }

                    v1_1 = ButterKnife.findBindingConstructorForClass(arg5.getSuperclass());
                }

                ButterKnife.BINDINGS.put(arg5, v1_1);
                return v1_1;
            }
        }

        if(ButterKnife.debug) {
            Log.d("ButterKnife", "MISS: Reached framework class. Abandoning search.");
        }

        return null;
    }

    @CheckResult @Deprecated public static View findById(@NonNull Activity arg0, @IdRes int arg1) {
        return arg0.findViewById(arg1);
    }

    @CheckResult @Deprecated public static View findById(@NonNull Dialog arg0, @IdRes int arg1) {
        return arg0.findViewById(arg1);
    }

    @CheckResult @Deprecated public static View findById(@NonNull View arg0, @IdRes int arg1) {
        return arg0.findViewById(arg1);
    }

    public static void setDebug(boolean arg0) {
        ButterKnife.debug = arg0;
    }
}

