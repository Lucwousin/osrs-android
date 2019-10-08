package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

abstract class AbstractComponentContainer implements ComponentContainer {
    AbstractComponentContainer() {
        super();
    }

    public Object get(Class arg1) {
        Provider v1 = this.getProvider(arg1);
        if(v1 == null) {
            return null;
        }

        return v1.get();
    }

    public Set setOf(Class arg1) {
        return this.setOfProvider(arg1).get();
    }
}

