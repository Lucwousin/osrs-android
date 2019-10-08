package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Collections;

final class ComponentRuntime$$Lambda$5 implements Provider {
    private static final ComponentRuntime$$Lambda$5 instance;

    static {
        ComponentRuntime$$Lambda$5.instance = new ComponentRuntime$$Lambda$5();
    }

    private ComponentRuntime$$Lambda$5() {
        super();
    }

    public Object get() {
        return Collections.emptySet();
    }

    public static Provider lambdaFactory$() {
        return ComponentRuntime$$Lambda$5.instance;
    }
}

