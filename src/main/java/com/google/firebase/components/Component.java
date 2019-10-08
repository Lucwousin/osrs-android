package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@KeepForSdk public final class Component {
    class com.google.firebase.components.Component$1 {
    }

    @KeepForSdk public class Builder {
        private final Set dependencies;
        private ComponentFactory factory;
        private int instantiation;
        private final Set providedInterfaces;
        private Set publishedEvents;
        private int type;

        Builder(Class arg1, Class[] arg2, com.google.firebase.components.Component$1 arg3) {
            this(arg1, arg2);
        }

        @SafeVarargs private Builder(Class arg4, Class[] arg5) {
            super();
            this.providedInterfaces = new HashSet();
            this.dependencies = new HashSet();
            int v0 = 0;
            this.instantiation = 0;
            this.type = 0;
            this.publishedEvents = new HashSet();
            Preconditions.checkNotNull(arg4, "Null interface");
            this.providedInterfaces.add(arg4);
            int v4 = arg5.length;
            while(v0 < v4) {
                Preconditions.checkNotNull(arg5[v0], "Null interface");
                ++v0;
            }

            Collections.addAll(this.providedInterfaces, ((Object[])arg5));
        }

        static Builder access$100(Builder arg0) {
            return arg0.intoSet();
        }

        @KeepForSdk public Builder add(Dependency arg2) {
            Preconditions.checkNotNull(arg2, "Null dependency");
            this.validateInterface(arg2.getInterface());
            this.dependencies.add(arg2);
            return this;
        }

        @KeepForSdk public Builder alwaysEager() {
            return this.setInstantiation(1);
        }

        @KeepForSdk public Component build() {
            boolean v0 = this.factory != null ? true : false;
            Preconditions.checkState(v0, "Missing required property: factory.");
            return new Component(new HashSet(this.providedInterfaces), new HashSet(this.dependencies), this.instantiation, this.type, this.factory, this.publishedEvents, null);
        }

        @KeepForSdk public Builder eagerInDefaultApp() {
            return this.setInstantiation(2);
        }

        @KeepForSdk public Builder factory(ComponentFactory arg2) {
            this.factory = Preconditions.checkNotNull(arg2, "Null factory");
            return this;
        }

        private Builder intoSet() {
            this.type = 1;
            return this;
        }

        @KeepForSdk public Builder publishes(Class arg2) {
            this.publishedEvents.add(arg2);
            return this;
        }

        private Builder setInstantiation(int arg3) {
            boolean v0 = this.instantiation == 0 ? true : false;
            Preconditions.checkState(v0, "Instantiation type has already been set.");
            this.instantiation = arg3;
            return this;
        }

        private void validateInterface(Class arg2) {
            Preconditions.checkArgument(this.providedInterfaces.contains(arg2) ^ 1, "Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    private final Set dependencies;
    private final ComponentFactory factory;
    private final int instantiation;
    private final Set providedInterfaces;
    private final Set publishedEvents;
    private final int type;

    private Component(Set arg1, Set arg2, int arg3, int arg4, ComponentFactory arg5, Set arg6) {
        super();
        this.providedInterfaces = Collections.unmodifiableSet(arg1);
        this.dependencies = Collections.unmodifiableSet(arg2);
        this.instantiation = arg3;
        this.type = arg4;
        this.factory = arg5;
        this.publishedEvents = Collections.unmodifiableSet(arg6);
    }

    Component(Set arg1, Set arg2, int arg3, int arg4, ComponentFactory arg5, Set arg6, com.google.firebase.components.Component$1 arg7) {
        this(arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @KeepForSdk public static Builder builder(Class arg3) {
        return new Builder(arg3, new Class[0], null);
    }

    @KeepForSdk @SafeVarargs public static Builder builder(Class arg2, Class[] arg3) {
        return new Builder(arg2, arg3, null);
    }

    public Set getDependencies() {
        return this.dependencies;
    }

    public ComponentFactory getFactory() {
        return this.factory;
    }

    public Set getProvidedInterfaces() {
        return this.providedInterfaces;
    }

    public Set getPublishedEvents() {
        return this.publishedEvents;
    }

    @KeepForSdk public static Component intoSet(Object arg0, Class arg1) {
        return Component.intoSetBuilder(arg1).factory(Component$$Lambda$3.lambdaFactory$(arg0)).build();
    }

    @KeepForSdk public static Builder intoSetBuilder(Class arg0) {
        return Builder.access$100(Component.builder(arg0));
    }

    public boolean isAlwaysEager() {
        boolean v1 = true;
        if(this.instantiation == 1) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    public boolean isEagerInDefaultApp() {
        boolean v0 = this.instantiation == 2 ? true : false;
        return v0;
    }

    public boolean isLazy() {
        boolean v0 = this.instantiation == 0 ? true : false;
        return v0;
    }

    public boolean isValue() {
        boolean v0 = this.type == 0 ? true : false;
        return v0;
    }

    static Object lambda$intoSet$2(Object arg0, ComponentContainer arg1) {
        return arg0;
    }

    static Object lambda$of$0(Object arg0, ComponentContainer arg1) {
        return arg0;
    }

    static Object lambda$of$1(Object arg0, ComponentContainer arg1) {
        return arg0;
    }

    @KeepForSdk @SafeVarargs public static Component of(Object arg0, Class arg1, Class[] arg2) {
        return Component.builder(arg1, arg2).factory(Component$$Lambda$2.lambdaFactory$(arg0)).build();
    }

    @KeepForSdk @Deprecated public static Component of(Class arg0, Object arg1) {
        return Component.builder(arg0).factory(Component$$Lambda$1.lambdaFactory$(arg1)).build();
    }

    public String toString() {
        StringBuilder v0 = new StringBuilder("Component<");
        v0.append(Arrays.toString(this.providedInterfaces.toArray()));
        v0.append(">{");
        v0.append(this.instantiation);
        v0.append(", type=");
        v0.append(this.type);
        v0.append(", deps=");
        v0.append(Arrays.toString(this.dependencies.toArray()));
        v0.append("}");
        return v0.toString();
    }
}

