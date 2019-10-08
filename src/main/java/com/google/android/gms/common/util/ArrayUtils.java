package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@KeepForSdk @VisibleForTesting public final class ArrayUtils {
    private ArrayUtils() {
        super();
    }

    @KeepForSdk public static Object[] appendToArray(Object[] arg2, Object arg3) {
        if(arg2 == null) {
            if(arg3 != null) {
            }
            else {
                throw new IllegalArgumentException("Cannot generate array of generic type w/o class info");
            }
        }

        if(arg2 == null) {
            Object v2 = Array.newInstance(arg3.getClass(), 1);
        }
        else {
            arg2 = Arrays.copyOf(arg2, arg2.length + 1);
        }

        arg2[arg2.length - 1] = arg3;
        return arg2;
    }

    @KeepForSdk public static Object[] concat(Object[][] arg6) {
        if(arg6.length == 0) {
            return Array.newInstance(arg6.getClass(), 0);
        }

        int v0 = 0;
        int v2 = 0;
        while(v0 < arg6.length) {
            v2 += arg6[v0].length;
            ++v0;
        }

        Object[] v0_1 = Arrays.copyOf(arg6[0], v2);
        v2 = arg6[0].length;
        int v3;
        for(v3 = 1; v3 < arg6.length; ++v3) {
            Object[] v4 = arg6[v3];
            System.arraycopy(v4, 0, v0_1, v2, v4.length);
            v2 += v4.length;
        }

        return v0_1;
    }

    @KeepForSdk public static byte[] concatByteArrays(byte[][] arg6) {
        if(arg6.length == 0) {
            return new byte[0];
        }

        int v0 = 0;
        int v2 = 0;
        while(v0 < arg6.length) {
            v2 += arg6[v0].length;
            ++v0;
        }

        byte[] v0_1 = Arrays.copyOf(arg6[0], v2);
        v2 = arg6[0].length;
        int v3;
        for(v3 = 1; v3 < arg6.length; ++v3) {
            byte[] v4 = arg6[v3];
            System.arraycopy(v4, 0, v0_1, v2, v4.length);
            v2 += v4.length;
        }

        return v0_1;
    }

    @KeepForSdk public static boolean contains(Object[] arg4, Object arg5) {
        int v1 = arg4 != null ? arg4.length : 0;
        int v2 = 0;
        while(true) {
            if(v2 >= v1) {
                break;
            }
            else if(Objects.equal(arg4[v2], arg5)) {
            }
            else {
                ++v2;
                continue;
            }

            goto label_14;
        }

        v2 = -1;
    label_14:
        if(v2 >= 0) {
            return 1;
        }

        return 0;
    }

    @KeepForSdk public static boolean contains(int[] arg4, int arg5) {
        if(arg4 == null) {
            return 0;
        }

        int v1 = arg4.length;
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            if(arg4[v2] == arg5) {
                return 1;
            }
        }

        return 0;
    }

    @KeepForSdk public static ArrayList newArrayList() {
        return new ArrayList();
    }

    @KeepForSdk public static Object[] removeAll(Object[] arg8, Object[] arg9) {
        Object[] v1_1;
        int v5;
        int v2;
        Object[] v0 = null;
        if(arg8 == null) {
            return v0;
        }

        if(arg9 != null) {
            if(arg9.length == 0) {
            }
            else {
                Object v1 = Array.newInstance(arg9.getClass().getComponentType(), arg8.length);
                int v3 = 0;
                if(arg9.length == 1) {
                    v2 = arg8.length;
                    int v4 = 0;
                    v5 = 0;
                    while(v4 < v2) {
                        Object v6 = arg8[v4];
                        if(!Objects.equal(arg9[0], v6)) {
                            v1[v5] = v6;
                            ++v5;
                        }

                        ++v4;
                    }
                }
                else {
                    v2 = arg8.length;
                    v5 = 0;
                    while(v3 < v2) {
                        Object v4_1 = arg8[v3];
                        if(!ArrayUtils.contains(arg9, v4_1)) {
                            v1[v5] = v4_1;
                            ++v5;
                        }

                        ++v3;
                    }
                }

                if(v1 == null) {
                    return v0;
                }

                if(v5 != v1.length) {
                    v1_1 = Arrays.copyOf(((Object[])v1), v5);
                }

                return v1_1;
            }
        }

        return Arrays.copyOf(arg8, arg8.length);
    }

    @KeepForSdk public static ArrayList toArrayList(Object[] arg4) {
        int v0 = arg4.length;
        ArrayList v1 = new ArrayList(v0);
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            v1.add(arg4[v2]);
        }

        return v1;
    }

    @KeepForSdk public static int[] toPrimitiveArray(Collection arg4) {
        int v0 = 0;
        if(arg4 != null) {
            if(arg4.size() == 0) {
            }
            else {
                int[] v1 = new int[arg4.size()];
                Iterator v4 = arg4.iterator();
                while(v4.hasNext()) {
                    v1[v0] = v4.next().intValue();
                    ++v0;
                }

                return v1;
            }
        }

        return new int[0];
    }

    @KeepForSdk public static Integer[] toWrapperArray(int[] arg4) {
        if(arg4 == null) {
            return null;
        }

        int v0 = arg4.length;
        Integer[] v1 = new Integer[v0];
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            v1[v2] = Integer.valueOf(arg4[v2]);
        }

        return v1;
    }

    @KeepForSdk public static void writeArray(StringBuilder arg4, double[] arg5) {
        int v0 = arg5.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(v1 != 0) {
                arg4.append(",");
            }

            arg4.append(Double.toString(arg5[v1]));
        }
    }

    @KeepForSdk public static void writeArray(StringBuilder arg3, float[] arg4) {
        int v0 = arg4.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(v1 != 0) {
                arg3.append(",");
            }

            arg3.append(Float.toString(arg4[v1]));
        }
    }

    @KeepForSdk public static void writeArray(StringBuilder arg3, int[] arg4) {
        int v0 = arg4.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(v1 != 0) {
                arg3.append(",");
            }

            arg3.append(Integer.toString(arg4[v1]));
        }
    }

    @KeepForSdk public static void writeArray(StringBuilder arg4, long[] arg5) {
        int v0 = arg5.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(v1 != 0) {
                arg4.append(",");
            }

            arg4.append(Long.toString(arg5[v1]));
        }
    }

    @KeepForSdk public static void writeArray(StringBuilder arg3, Object[] arg4) {
        int v0 = arg4.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(v1 != 0) {
                arg3.append(",");
            }

            arg3.append(arg4[v1].toString());
        }
    }

    @KeepForSdk public static void writeArray(StringBuilder arg3, boolean[] arg4) {
        int v0 = arg4.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(v1 != 0) {
                arg3.append(",");
            }

            arg3.append(Boolean.toString(arg4[v1]));
        }
    }

    @KeepForSdk public static void writeStringArray(StringBuilder arg3, String[] arg4) {
        int v0 = arg4.length;
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            if(v1 != 0) {
                arg3.append(",");
            }

            arg3.append("\"");
            arg3.append(arg4[v1]);
            arg3.append("\"");
        }
    }
}

