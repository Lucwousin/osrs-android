package com.google.firebase.components;

import com.google.firebase.inject.Provider;

final class ComponentRuntime$$Lambda$1 implements Provider {
    private final ComponentRuntime arg$1;
    private final Component arg$2;

    private ComponentRuntime$$Lambda$1(ComponentRuntime arg1, Component arg2) {
        super();
        this.arg$1 = arg1;
        this.arg$2 = arg2;
    }

    public Object get() {
        return ComponentRuntime.lambda$new$0(this.arg$1, this.arg$2);
    }

    public static Provider lambdaFactory$(ComponentRuntime arg1, Component arg2) {
        return new ComponentRuntime$$Lambda$1(arg1, arg2);
    }
}

