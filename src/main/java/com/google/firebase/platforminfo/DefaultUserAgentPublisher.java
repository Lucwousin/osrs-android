package com.google.firebase.platforminfo;

import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import java.util.Iterator;
import java.util.Set;

public class DefaultUserAgentPublisher implements UserAgentPublisher {
    private final GlobalLibraryVersionRegistrar gamesSDKRegistrar;
    private final String javaSDKVersionUserAgent;

    DefaultUserAgentPublisher(Set arg1, GlobalLibraryVersionRegistrar arg2) {
        super();
        this.javaSDKVersionUserAgent = DefaultUserAgentPublisher.toUserAgent(arg1);
        this.gamesSDKRegistrar = arg2;
    }

    public static Component component() {
        return Component.builder(UserAgentPublisher.class).add(Dependency.setOf(LibraryVersion.class)).factory(DefaultUserAgentPublisher$$Lambda$1.lambdaFactory$()).build();
    }

    public String getUserAgent() {
        if(this.gamesSDKRegistrar.getRegisteredVersions().isEmpty()) {
            return this.javaSDKVersionUserAgent;
        }

        return this.javaSDKVersionUserAgent + ' ' + DefaultUserAgentPublisher.toUserAgent(this.gamesSDKRegistrar.getRegisteredVersions());
    }

    static UserAgentPublisher lambda$component$0(ComponentContainer arg2) {
        return new DefaultUserAgentPublisher(arg2.setOf(LibraryVersion.class), GlobalLibraryVersionRegistrar.getInstance());
    }

    private static String toUserAgent(Set arg3) {
        StringBuilder v0 = new StringBuilder();
        Iterator v3 = arg3.iterator();
        while(v3.hasNext()) {
            Object v1 = v3.next();
            v0.append(((LibraryVersion)v1).getLibraryName());
            v0.append('/');
            v0.append(((LibraryVersion)v1).getVersion());
            if(!v3.hasNext()) {
                continue;
            }

            v0.append(' ');
        }

        return v0.toString();
    }
}

