package com.google.firebase.components;

import androidx.annotation.VisibleForTesting;
import com.google.firebase.inject.Provider;

class Lazy implements Provider {
    private static final Object UNINITIALIZED;
    private volatile Object instance;
    private volatile Provider provider;

    static {
        Lazy.UNINITIALIZED = new Object();
    }

    Lazy(Provider arg2) {
        super();
        this.instance = Lazy.UNINITIALIZED;
        this.provider = arg2;
    }

    Lazy(Object arg2) {
        super();
        this.instance = Lazy.UNINITIALIZED;
        this.instance = arg2;
    }

    public Object get() {
        Object v0 = this.instance;
        if(v0 == Lazy.UNINITIALIZED) {
            __monitor_enter(this);
            try {
                v0 = this.instance;
                if(v0 == Lazy.UNINITIALIZED) {
                    v0 = this.provider.get();
                    this.instance = v0;
                    this.provider = null;
                }

                __monitor_exit(this);
                return v0;
            label_15:
                __monitor_exit(this);
            }
            catch(Throwable v0_1) {
                goto label_15;
            }

            throw v0_1;
        }

        return v0;
    }

    @VisibleForTesting boolean isInitialized() {
        boolean v0 = this.instance != Lazy.UNINITIALIZED ? true : false;
        return v0;
    }
}

