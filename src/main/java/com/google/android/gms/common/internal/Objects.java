package com.google.android.gms.common.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@KeepForSdk public final class Objects {
    @KeepForSdk public final class ToStringHelper {
        private final List zzer;
        private final Object zzes;

        ToStringHelper(Object arg1, zzq arg2) {
            this(arg1);
        }

        private ToStringHelper(Object arg1) {
            super();
            this.zzes = Preconditions.checkNotNull(arg1);
            this.zzer = new ArrayList();
        }

        @KeepForSdk public final ToStringHelper add(String arg4, @Nullable Object arg5) {
            List v0 = this.zzer;
            Object v4 = Preconditions.checkNotNull(arg4);
            String v5 = String.valueOf(arg5);
            StringBuilder v2 = new StringBuilder(String.valueOf(v4).length() + 1 + String.valueOf(v5).length());
            v2.append(((String)v4));
            v2.append("=");
            v2.append(v5);
            v0.add(v2.toString());
            return this;
        }

        @KeepForSdk public final String toString() {
            StringBuilder v0 = new StringBuilder(100);
            v0.append(this.zzes.getClass().getSimpleName());
            v0.append('{');
            int v1 = this.zzer.size();
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                v0.append(this.zzer.get(v2));
                if(v2 < v1 - 1) {
                    v0.append(", ");
                }
            }

            v0.append('}');
            return v0.toString();
        }
    }

    private Objects() {
        super();
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk public static boolean equal(@Nullable Object arg0, @Nullable Object arg1) {
        if(arg0 != arg1 && (arg0 == null || !arg0.equals(arg1))) {
            return 0;
        }

        return 1;
    }

    @KeepForSdk public static int hashCode(Object[] arg0) {
        return Arrays.hashCode(arg0);
    }

    @KeepForSdk public static ToStringHelper toStringHelper(Object arg2) {
        return new ToStringHelper(arg2, null);
    }
}

