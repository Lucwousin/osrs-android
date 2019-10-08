package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class Preconditions {
    private Preconditions() {
        super();
    }

    public static void checkArgument(boolean arg0) {
        if(arg0) {
            return;
        }

        throw new IllegalArgumentException();
    }

    public static void checkArgument(boolean arg0, Object arg1) {
        if(arg0) {
            return;
        }

        throw new IllegalArgumentException(String.valueOf(arg1));
    }

    public static float checkArgumentFinite(float arg1, String arg2) {
        StringBuilder v0;
        if(!Float.isNaN(arg1)) {
            if(!Float.isInfinite(arg1)) {
                return arg1;
            }

            v0 = new StringBuilder();
            v0.append(arg2);
            v0.append(" must not be infinite");
            throw new IllegalArgumentException(v0.toString());
        }

        v0 = new StringBuilder();
        v0.append(arg2);
        v0.append(" must not be NaN");
        throw new IllegalArgumentException(v0.toString());
    }

    public static int checkArgumentInRange(int arg5, int arg6, int arg7, String arg8) {
        Object[] v3_1;
        Locale v4;
        int v0 = 2;
        int v3 = 3;
        if(arg5 >= arg6) {
            if(arg5 <= arg7) {
                return arg5;
            }

            v4 = Locale.US;
            v3_1 = new Object[v3];
            v3_1[0] = arg8;
            v3_1[1] = Integer.valueOf(arg6);
            v3_1[v0] = Integer.valueOf(arg7);
            throw new IllegalArgumentException(String.format(v4, "%s is out of range of [%d, %d] (too high)", v3_1));
        }

        v4 = Locale.US;
        v3_1 = new Object[v3];
        v3_1[0] = arg8;
        v3_1[1] = Integer.valueOf(arg6);
        v3_1[v0] = Integer.valueOf(arg7);
        throw new IllegalArgumentException(String.format(v4, "%s is out of range of [%d, %d] (too low)", v3_1));
    }

    public static float checkArgumentInRange(float arg5, float arg6, float arg7, String arg8) {
        Object[] v3_1;
        Locale v4;
        if(!Float.isNaN(arg5)) {
            int v0 = 2;
            int v3 = 3;
            if(arg5 >= arg6) {
                if(arg5 <= arg7) {
                    return arg5;
                }

                v4 = Locale.US;
                v3_1 = new Object[v3];
                v3_1[0] = arg8;
                v3_1[1] = Float.valueOf(arg6);
                v3_1[v0] = Float.valueOf(arg7);
                throw new IllegalArgumentException(String.format(v4, "%s is out of range of [%f, %f] (too high)", v3_1));
            }

            v4 = Locale.US;
            v3_1 = new Object[v3];
            v3_1[0] = arg8;
            v3_1[1] = Float.valueOf(arg6);
            v3_1[v0] = Float.valueOf(arg7);
            throw new IllegalArgumentException(String.format(v4, "%s is out of range of [%f, %f] (too low)", v3_1));
        }

        StringBuilder v6 = new StringBuilder();
        v6.append(arg8);
        v6.append(" must not be NaN");
        throw new IllegalArgumentException(v6.toString());
    }

    public static long checkArgumentInRange(long arg5, long arg7, long arg9, String arg11) {
        Object[] v3_1;
        Locale v6;
        int v0 = 2;
        int v3 = 3;
        if(arg5 >= arg7) {
            if(arg5 <= arg9) {
                return arg5;
            }

            v6 = Locale.US;
            v3_1 = new Object[v3];
            v3_1[0] = arg11;
            v3_1[1] = Long.valueOf(arg7);
            v3_1[v0] = Long.valueOf(arg9);
            throw new IllegalArgumentException(String.format(v6, "%s is out of range of [%d, %d] (too high)", v3_1));
        }

        v6 = Locale.US;
        v3_1 = new Object[v3];
        v3_1[0] = arg11;
        v3_1[1] = Long.valueOf(arg7);
        v3_1[v0] = Long.valueOf(arg9);
        throw new IllegalArgumentException(String.format(v6, "%s is out of range of [%d, %d] (too low)", v3_1));
    }

    @IntRange(from=0) public static int checkArgumentNonnegative(int arg0) {
        if(arg0 >= 0) {
            return arg0;
        }

        throw new IllegalArgumentException();
    }

    @IntRange(from=0) public static int checkArgumentNonnegative(int arg0, String arg1) {
        if(arg0 >= 0) {
            return arg0;
        }

        throw new IllegalArgumentException(arg1);
    }

    public static long checkArgumentNonnegative(long arg2) {
        if(arg2 >= 0) {
            return arg2;
        }

        throw new IllegalArgumentException();
    }

    public static long checkArgumentNonnegative(long arg2, String arg4) {
        if(arg2 >= 0) {
            return arg2;
        }

        throw new IllegalArgumentException(arg4);
    }

    public static int checkArgumentPositive(int arg0, String arg1) {
        if(arg0 > 0) {
            return arg0;
        }

        throw new IllegalArgumentException(arg1);
    }

    public static float[] checkArrayElementsInRange(float[] arg8, float arg9, float arg10, String arg11) {
        int v5;
        int v4;
        int v3;
        Preconditions.checkNotNull(arg8, arg11 + " must not be null");
        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= arg8.length) {
                return arg8;
            }

            float v2 = arg8[v1];
            if(Float.isNaN(v2)) {
                goto label_50;
            }

            v3 = 3;
            v4 = 2;
            v5 = 4;
            if(v2 < arg9) {
                goto label_36;
            }

            if(v2 > arg10) {
                break;
            }
        }

        Locale v2_1 = Locale.US;
        Object[] v5_1 = new Object[v5];
        v5_1[0] = arg11;
        v5_1[1] = Integer.valueOf(v1);
        v5_1[v4] = Float.valueOf(arg9);
        v5_1[v3] = Float.valueOf(arg10);
        throw new IllegalArgumentException(String.format(v2_1, "%s[%d] is out of range of [%f, %f] (too high)", v5_1));
    label_36:
        v2_1 = Locale.US;
        v5_1 = new Object[v5];
        v5_1[0] = arg11;
        v5_1[1] = Integer.valueOf(v1);
        v5_1[v4] = Float.valueOf(arg9);
        v5_1[v3] = Float.valueOf(arg10);
        throw new IllegalArgumentException(String.format(v2_1, "%s[%d] is out of range of [%f, %f] (too low)", v5_1));
    label_50:
        StringBuilder v9 = new StringBuilder();
        v9.append(arg11);
        v9.append("[");
        v9.append(v1);
        v9.append("] must not be NaN");
        throw new IllegalArgumentException(v9.toString());
        return arg8;
    }

    public static Object[] checkArrayElementsNotNull(Object[] arg4, String arg5) {
        if(arg4 == null) {
            goto label_22;
        }

        int v1;
        for(v1 = 0; true; ++v1) {
            if(v1 >= arg4.length) {
                return arg4;
            }

            if(arg4[v1] == null) {
                break;
            }
        }

        throw new NullPointerException(String.format(Locale.US, "%s[%d] must not be null", arg5, Integer.valueOf(v1)));
        return arg4;
    label_22:
        StringBuilder v0 = new StringBuilder();
        v0.append(arg5);
        v0.append(" must not be null");
        throw new NullPointerException(v0.toString());
    }

    @NonNull public static Collection checkCollectionElementsNotNull(Collection arg5, String arg6) {
        if(arg5 == null) {
            goto label_24;
        }

        long v0 = 0;
        Iterator v2 = arg5.iterator();
        while(true) {
            if(!v2.hasNext()) {
                return arg5;
            }

            if(v2.next() == null) {
                break;
            }

            ++v0;
        }

        throw new NullPointerException(String.format(Locale.US, "%s[%d] must not be null", arg6, Long.valueOf(v0)));
        return arg5;
    label_24:
        StringBuilder v0_1 = new StringBuilder();
        v0_1.append(arg6);
        v0_1.append(" must not be null");
        throw new NullPointerException(v0_1.toString());
    }

    public static Collection checkCollectionNotEmpty(Collection arg1, String arg2) {
        StringBuilder v0;
        if(arg1 != null) {
            if(!arg1.isEmpty()) {
                return arg1;
            }

            v0 = new StringBuilder();
            v0.append(arg2);
            v0.append(" is empty");
            throw new IllegalArgumentException(v0.toString());
        }

        v0 = new StringBuilder();
        v0.append(arg2);
        v0.append(" must not be null");
        throw new NullPointerException(v0.toString());
    }

    public static int checkFlagsArgument(int arg3, int arg4) {
        if((arg3 & arg4) == arg3) {
            return arg3;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Requested flags 0x");
        v1.append(Integer.toHexString(arg3));
        v1.append(", but only 0x");
        v1.append(Integer.toHexString(arg4));
        v1.append(" are allowed");
        throw new IllegalArgumentException(v1.toString());
    }

    @NonNull public static Object checkNotNull(Object arg0) {
        if(arg0 != null) {
            return arg0;
        }

        throw new NullPointerException();
    }

    @NonNull public static Object checkNotNull(Object arg0, Object arg1) {
        if(arg0 != null) {
            return arg0;
        }

        throw new NullPointerException(String.valueOf(arg1));
    }

    public static void checkState(boolean arg1) {
        Preconditions.checkState(arg1, null);
    }

    public static void checkState(boolean arg0, String arg1) {
        if(arg0) {
            return;
        }

        throw new IllegalStateException(arg1);
    }

    @NonNull public static CharSequence checkStringNotEmpty(CharSequence arg1) {
        if(!TextUtils.isEmpty(arg1)) {
            return arg1;
        }

        throw new IllegalArgumentException();
    }

    @NonNull public static CharSequence checkStringNotEmpty(CharSequence arg1, Object arg2) {
        if(!TextUtils.isEmpty(arg1)) {
            return arg1;
        }

        throw new IllegalArgumentException(String.valueOf(arg2));
    }
}

