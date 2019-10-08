package com.google.android.gms.common.util;

import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@KeepForSdk public final class CollectionUtils {
    private CollectionUtils() {
        super();
    }

    @KeepForSdk public static boolean isEmpty(@Nullable Collection arg0) {
        if(arg0 == null) {
            return 1;
        }

        return arg0.isEmpty();
    }

    @KeepForSdk @Deprecated public static List listOf() {
        return Collections.emptyList();
    }

    @KeepForSdk @Deprecated public static List listOf(Object arg0) {
        return Collections.singletonList(arg0);
    }

    @KeepForSdk @Deprecated public static List listOf(Object[] arg1) {
        switch(arg1.length) {
            case 0: {
                goto label_9;
            }
            case 1: {
                goto label_5;
            }
        }

        return Collections.unmodifiableList(Arrays.asList(arg1));
    label_5:
        return CollectionUtils.listOf(arg1[0]);
    label_9:
        return CollectionUtils.listOf();
    }

    @KeepForSdk public static Map mapOf(Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7) {
        Map v0 = CollectionUtils.zzb(3, false);
        v0.put(arg2, arg3);
        v0.put(arg4, arg5);
        v0.put(arg6, arg7);
        return Collections.unmodifiableMap(v0);
    }

    @KeepForSdk public static Map mapOf(Object arg2, Object arg3, Object arg4, Object arg5, Object arg6, Object arg7, Object arg8, Object arg9, Object arg10, Object arg11, Object arg12, Object arg13) {
        Map v0 = CollectionUtils.zzb(6, false);
        v0.put(arg2, arg3);
        v0.put(arg4, arg5);
        v0.put(arg6, arg7);
        v0.put(arg8, arg9);
        v0.put(arg10, arg11);
        v0.put(arg12, arg13);
        return Collections.unmodifiableMap(v0);
    }

    @KeepForSdk public static Map mapOfKeyValueArrays(Object[] arg4, Object[] arg5) {
        if(arg4.length != arg5.length) {
            goto label_24;
        }

        int v1 = 0;
        switch(arg4.length) {
            case 0: {
                goto label_13;
            }
            case 1: {
                goto label_9;
            }
        }

        Map v0 = CollectionUtils.zzb(arg4.length, false);
        while(v1 < arg4.length) {
            v0.put(arg4[v1], arg5[v1]);
            ++v1;
        }

        return Collections.unmodifiableMap(v0);
    label_9:
        return Collections.singletonMap(arg4[0], arg5[0]);
    label_13:
        return Collections.emptyMap();
    label_24:
        int v4 = arg4.length;
        int v5 = arg5.length;
        StringBuilder v2 = new StringBuilder(66);
        v2.append("Key and values array lengths not equal: ");
        v2.append(v4);
        v2.append(" != ");
        v2.append(v5);
        throw new IllegalArgumentException(v2.toString());
    }

    @KeepForSdk public static Set mutableSetOfWithSize(int arg1) {
        if(arg1 == 0) {
            return new ArraySet();
        }

        return CollectionUtils.zza(arg1, true);
    }

    @KeepForSdk @Deprecated public static Set setOf(Object arg2, Object arg3, Object arg4) {
        Set v0 = CollectionUtils.zza(3, false);
        v0.add(arg2);
        v0.add(arg3);
        v0.add(arg4);
        return Collections.unmodifiableSet(v0);
    }

    @KeepForSdk @Deprecated public static Set setOf(Object[] arg5) {
        int v1 = 2;
        switch(arg5.length) {
            case 0: {
                goto label_38;
            }
            case 1: {
                goto label_35;
            }
            case 2: {
                goto label_28;
            }
            case 3: {
                goto label_23;
            }
            case 4: {
                goto label_10;
            }
        }

        Set v0 = CollectionUtils.zza(arg5.length, false);
        Collections.addAll(((Collection)v0), arg5);
        return Collections.unmodifiableSet(v0);
    label_35:
        return Collections.singleton(arg5[0]);
    label_38:
        return Collections.emptySet();
    label_23:
        return CollectionUtils.setOf(arg5[0], arg5[1], arg5[v1]);
    label_10:
        Object v0_1 = arg5[0];
        Object v2 = arg5[1];
        Object v1_1 = arg5[v1];
        Object v5 = arg5[3];
        Set v3 = CollectionUtils.zza(4, false);
        v3.add(v0_1);
        v3.add(v2);
        v3.add(v1_1);
        v3.add(v5);
        return Collections.unmodifiableSet(v3);
    label_28:
        v0_1 = arg5[0];
        v5 = arg5[1];
        Set v1_2 = CollectionUtils.zza(v1, false);
        v1_2.add(v0_1);
        v1_2.add(v5);
        return Collections.unmodifiableSet(v1_2);
    }

    private static Set zza(int arg1, boolean arg2) {
        float v0 = arg2 ? 0.75f : 1f;
        int v2 = arg2 ? 0x80 : 0x100;
        if(arg1 <= v2) {
            return new ArraySet(arg1);
        }

        return new HashSet(arg1, v0);
    }

    private static Map zzb(int arg1, boolean arg2) {
        if(arg1 <= 0x100) {
            return new ArrayMap(arg1);
        }

        return new HashMap(arg1, 1f);
    }
}

