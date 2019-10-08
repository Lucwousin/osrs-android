package com.google.firebase.platforminfo;

import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

final class DefaultUserAgentPublisher$$Lambda$1 implements ComponentFactory {
    private static final DefaultUserAgentPublisher$$Lambda$1 instance;

    static {
        DefaultUserAgentPublisher$$Lambda$1.instance = new DefaultUserAgentPublisher$$Lambda$1();
    }

    private DefaultUserAgentPublisher$$Lambda$1() {
        super();
    }

    public Object create(ComponentContainer arg1) {
        return DefaultUserAgentPublisher.lambda$component$0(arg1);
    }

    public static ComponentFactory lambdaFactory$() {
        return DefaultUserAgentPublisher$$Lambda$1.instance;
    }
}

