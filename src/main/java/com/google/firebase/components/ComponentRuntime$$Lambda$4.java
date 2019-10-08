package com.google.firebase.components;

import com.google.firebase.inject.Provider;
import java.util.Set;

final class ComponentRuntime$$Lambda$4 implements Provider {
    private final Set arg$1;

    private ComponentRuntime$$Lambda$4(Set arg1) {
        super();
        this.arg$1 = arg1;
    }

    public Object get() {
        return ComponentRuntime.lambda$processSetComponents$1(this.arg$1);
    }

    public static Provider lambdaFactory$(Set arg1) {
        return new ComponentRuntime$$Lambda$4(arg1);
    }
}

