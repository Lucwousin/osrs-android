package com.google.firebase.components;

final class Component$$Lambda$3 implements ComponentFactory {
    private final Object arg$1;

    private Component$$Lambda$3(Object arg1) {
        super();
        this.arg$1 = arg1;
    }

    public Object create(ComponentContainer arg2) {
        return Component.lambda$intoSet$2(this.arg$1, arg2);
    }

    public static ComponentFactory lambdaFactory$(Object arg1) {
        return new Component$$Lambda$3(arg1);
    }
}

