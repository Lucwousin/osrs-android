package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

final class zaa implements Comparator {
    static final Comparator zaq;

    static {
        zaa.zaq = new zaa();
    }

    private zaa() {
        super();
    }

    public final int compare(Object arg1, Object arg2) {
        return GoogleSignInAccount.zaa(((Scope)arg1), ((Scope)arg2));
    }
}

