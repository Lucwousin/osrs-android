package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

public class zaae extends zal {
    private GoogleApiManager zabm;
    private final ArraySet zafo;

    private zaae(LifecycleFragment arg2) {
        super(arg2);
        this.zafo = new ArraySet();
        this.mLifecycleFragment.addCallback("ConnectionlessLifecycleHelper", ((LifecycleCallback)this));
    }

    public void onResume() {
        super.onResume();
        this.zaak();
    }

    public void onStart() {
        super.onStart();
        this.zaak();
    }

    public void onStop() {
        super.onStop();
        this.zabm.zab(this);
    }

    public static void zaa(Activity arg2, GoogleApiManager arg3, zai arg4) {
        LifecycleFragment v2 = zaae.getFragment(arg2);
        LifecycleCallback v0 = v2.getCallbackOrNull("ConnectionlessLifecycleHelper", zaae.class);
        if(v0 == null) {
            zaae v0_1 = new zaae(v2);
        }

        ((zaae)v0).zabm = arg3;
        Preconditions.checkNotNull(arg4, "ApiKey cannot be null");
        ((zaae)v0).zafo.add(arg4);
        arg3.zaa(((zaae)v0));
    }

    protected final void zaa(ConnectionResult arg2, int arg3) {
        this.zabm.zaa(arg2, arg3);
    }

    final ArraySet zaaj() {
        return this.zafo;
    }

    private final void zaak() {
        if(!this.zafo.isEmpty()) {
            this.zabm.zaa(this);
        }
    }

    protected final void zao() {
        this.zabm.zao();
    }
}

