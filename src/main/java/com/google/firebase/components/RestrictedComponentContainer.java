package com.google.firebase.components;

import com.google.firebase.events.Event;
import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class RestrictedComponentContainer extends AbstractComponentContainer {
    class RestrictedPublisher implements Publisher {
        private final Set allowedPublishedEvents;
        private final Publisher delegate;

        public RestrictedPublisher(Set arg1, Publisher arg2) {
            super();
            this.allowedPublishedEvents = arg1;
            this.delegate = arg2;
        }

        public void publish(Event arg4) {
            if(this.allowedPublishedEvents.contains(arg4.getType())) {
                this.delegate.publish(arg4);
                return;
            }

            throw new IllegalArgumentException(String.format("Attempting to publish an undeclared event %s.", arg4));
        }
    }

    private final Set allowedDirectInterfaces;
    private final Set allowedProviderInterfaces;
    private final Set allowedPublishedEvents;
    private final Set allowedSetDirectInterfaces;
    private final Set allowedSetProviderInterfaces;
    private final ComponentContainer delegateContainer;

    RestrictedComponentContainer(Component arg8, ComponentContainer arg9) {
        super();
        HashSet v0 = new HashSet();
        HashSet v1 = new HashSet();
        HashSet v2 = new HashSet();
        HashSet v3 = new HashSet();
        Iterator v4 = arg8.getDependencies().iterator();
        while(v4.hasNext()) {
            Object v5 = v4.next();
            if(((Dependency)v5).isDirectInjection()) {
                if(((Dependency)v5).isSet()) {
                    ((Set)v2).add(((Dependency)v5).getInterface());
                    continue;
                }

                ((Set)v0).add(((Dependency)v5).getInterface());
                continue;
            }

            if(((Dependency)v5).isSet()) {
                ((Set)v3).add(((Dependency)v5).getInterface());
                continue;
            }

            ((Set)v1).add(((Dependency)v5).getInterface());
        }

        if(!arg8.getPublishedEvents().isEmpty()) {
            ((Set)v0).add(Publisher.class);
        }

        this.allowedDirectInterfaces = Collections.unmodifiableSet(((Set)v0));
        this.allowedProviderInterfaces = Collections.unmodifiableSet(((Set)v1));
        this.allowedSetDirectInterfaces = Collections.unmodifiableSet(((Set)v2));
        this.allowedSetProviderInterfaces = Collections.unmodifiableSet(((Set)v3));
        this.allowedPublishedEvents = arg8.getPublishedEvents();
        this.delegateContainer = arg9;
    }

    public Object get(Class arg4) {
        if(this.allowedDirectInterfaces.contains(arg4)) {
            Object v0 = this.delegateContainer.get(arg4);
            if(!arg4.equals(Publisher.class)) {
                return v0;
            }

            return new RestrictedPublisher(this.allowedPublishedEvents, ((Publisher)v0));
        }

        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", arg4));
    }

    public Provider getProvider(Class arg4) {
        if(this.allowedProviderInterfaces.contains(arg4)) {
            return this.delegateContainer.getProvider(arg4);
        }

        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", arg4));
    }

    public Set setOf(Class arg4) {
        if(this.allowedSetDirectInterfaces.contains(arg4)) {
            return this.delegateContainer.setOf(arg4);
        }

        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", arg4));
    }

    public Provider setOfProvider(Class arg4) {
        if(this.allowedSetProviderInterfaces.contains(arg4)) {
            return this.delegateContainer.setOfProvider(arg4);
        }

        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", arg4));
    }
}

