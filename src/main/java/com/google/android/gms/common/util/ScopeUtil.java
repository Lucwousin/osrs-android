package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

@KeepForSdk public final class ScopeUtil {
    private ScopeUtil() {
        super();
    }

    @KeepForSdk public static String[] toScopeString(Set arg3) {
        Preconditions.checkNotNull(arg3, "scopes can\'t be null.");
        Object[] v3 = arg3.toArray(new Scope[arg3.size()]);
        Preconditions.checkNotNull(v3, "scopes can\'t be null.");
        String[] v0 = new String[v3.length];
        int v1;
        for(v1 = 0; v1 < v3.length; ++v1) {
            v0[v1] = v3[v1].getScopeUri();
        }

        return v0;
    }
}

