package com.google.firebase.components;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map$Entry;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class ComponentRuntime extends AbstractComponentContainer {
    private static final Provider EMPTY_PROVIDER;
    private final Map components;
    private final EventBus eventBus;
    private final Map lazyInstanceMap;
    private final Map lazySetMap;

    static {
        ComponentRuntime.EMPTY_PROVIDER = ComponentRuntime$$Lambda$5.lambdaFactory$();
    }

    public ComponentRuntime(Executor arg6, Iterable arg7, Component[] arg8) {
        super();
        this.components = new HashMap();
        this.lazyInstanceMap = new HashMap();
        this.lazySetMap = new HashMap();
        this.eventBus = new EventBus(arg6);
        ArrayList v6 = new ArrayList();
        ((List)v6).add(Component.of(this.eventBus, EventBus.class, new Class[]{Subscriber.class, Publisher.class}));
        Iterator v7 = arg7.iterator();
        while(v7.hasNext()) {
            ((List)v6).addAll(v7.next().getComponents());
        }

        Collections.addAll(((Collection)v6), ((Object[])arg8));
        CycleDetector.detect(((List)v6));
        Iterator v6_1 = ((List)v6).iterator();
        while(v6_1.hasNext()) {
            Object v7_1 = v6_1.next();
            this.components.put(v7_1, new Lazy(ComponentRuntime$$Lambda$1.lambdaFactory$(this, ((Component)v7_1))));
        }

        this.processInstanceComponents();
        this.processSetComponents();
    }

    public Object get(Class arg1) {
        return super.get(arg1);
    }

    public Provider getProvider(Class arg2) {
        Preconditions.checkNotNull(arg2, "Null interface requested.");
        return this.lazyInstanceMap.get(arg2);
    }

    public void initializeEagerComponents(boolean arg5) {
        Iterator v0 = this.components.entrySet().iterator();
        while(v0.hasNext()) {
            Object v1 = v0.next();
            Object v2 = ((Map$Entry)v1).getKey();
            v1 = ((Map$Entry)v1).getValue();
            if(!((Component)v2).isAlwaysEager()) {
                if(!((Component)v2).isEagerInDefaultApp()) {
                    continue;
                }

                if(arg5) {
                    goto label_13;
                }

                continue;
            }

        label_13:
            ((Lazy)v1).get();
        }

        this.eventBus.enablePublishingAndFlushPending();
    }

    static Object lambda$new$0(ComponentRuntime arg2, Component arg3) {
        return arg3.getFactory().create(new RestrictedComponentContainer(arg3, ((ComponentContainer)arg2)));
    }

    static Set lambda$processSetComponents$1(Set arg2) {
        HashSet v0 = new HashSet();
        Iterator v2 = arg2.iterator();
        while(v2.hasNext()) {
            ((Set)v0).add(v2.next().get());
        }

        return Collections.unmodifiableSet(((Set)v0));
    }

    private void processInstanceComponents() {
        Object v2;
        Object v1;
        Iterator v0 = this.components.entrySet().iterator();
        while(true) {
        label_3:
            if(!v0.hasNext()) {
                goto label_19;
            }

            v1 = v0.next();
            v2 = ((Map$Entry)v1).getKey();
            if(((Component)v2).isValue()) {
                break;
            }
        }

        v1 = ((Map$Entry)v1).getValue();
        Iterator v2_1 = ((Component)v2).getProvidedInterfaces().iterator();
        goto label_13;
    label_19:
        this.validateDependencies();
        return;
        while(true) {
        label_13:
            if(!v2_1.hasNext()) {
                goto label_3;
            }

            this.lazyInstanceMap.put(v2_1.next(), v1);
        }
    }

    private void processSetComponents() {
        Object v3;
        Object v2;
        HashMap v0 = new HashMap();
        Iterator v1 = this.components.entrySet().iterator();
        while(true) {
        label_5:
            if(!v1.hasNext()) {
                goto label_26;
            }

            v2 = v1.next();
            v3 = ((Map$Entry)v2).getKey();
            if(!((Component)v3).isValue()) {
                break;
            }
        }

        v2 = ((Map$Entry)v2).getValue();
        Iterator v3_1 = ((Component)v3).getProvidedInterfaces().iterator();
        goto label_15;
    label_26:
        Iterator v0_1 = ((Map)v0).entrySet().iterator();
        goto label_28;
        while(true) {
        label_15:
            if(!v3_1.hasNext()) {
                goto label_5;
            }

            Object v4 = v3_1.next();
            if(!((Map)v0).containsKey(v4)) {
                ((Map)v0).put(v4, new HashSet());
            }

            ((Map)v0).get(v4).add(v2);
        }

    label_28:
        while(v0_1.hasNext()) {
            Object v1_1 = v0_1.next();
            this.lazySetMap.put(((Map$Entry)v1_1).getKey(), new Lazy(ComponentRuntime$$Lambda$4.lambdaFactory$(((Map$Entry)v1_1).getValue())));
        }
    }

    public Set setOf(Class arg1) {
        return super.setOf(arg1);
    }

    public Provider setOfProvider(Class arg2) {
        Object v2 = this.lazySetMap.get(arg2);
        if(v2 != null) {
            return ((Provider)v2);
        }

        return ComponentRuntime.EMPTY_PROVIDER;
    }

    private void validateDependencies() {
        Object v3;
        Iterator v0 = this.components.keySet().iterator();
    label_3:
        if(v0.hasNext()) {
            Object v1 = v0.next();
            Iterator v2 = ((Component)v1).getDependencies().iterator();
            while(true) {
                if(!v2.hasNext()) {
                    goto label_3;
                }

                v3 = v2.next();
                if(!((Dependency)v3).isRequired()) {
                    continue;
                }

                if(!this.lazyInstanceMap.containsKey(((Dependency)v3).getInterface())) {
                    break;
                }
            }

            throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", v1, ((Dependency)v3).getInterface()));
        }
    }
}

