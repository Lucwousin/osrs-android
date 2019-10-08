package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class CycleDetector {
    class com.google.firebase.components.CycleDetector$1 {
    }

    class ComponentNode {
        private final Component component;
        private final Set dependencies;
        private final Set dependents;

        ComponentNode(Component arg2) {
            super();
            this.dependencies = new HashSet();
            this.dependents = new HashSet();
            this.component = arg2;
        }

        void addDependency(ComponentNode arg2) {
            this.dependencies.add(arg2);
        }

        void addDependent(ComponentNode arg2) {
            this.dependents.add(arg2);
        }

        Component getComponent() {
            return this.component;
        }

        Set getDependencies() {
            return this.dependencies;
        }

        boolean isLeaf() {
            return this.dependencies.isEmpty();
        }

        boolean isRoot() {
            return this.dependents.isEmpty();
        }

        void removeDependent(ComponentNode arg2) {
            this.dependents.remove(arg2);
        }
    }

    class Dep {
        private final Class anInterface;
        private final boolean set;

        Dep(Class arg1, boolean arg2, com.google.firebase.components.CycleDetector$1 arg3) {
            this(arg1, arg2);
        }

        private Dep(Class arg1, boolean arg2) {
            super();
            this.anInterface = arg1;
            this.set = arg2;
        }

        static boolean access$100(Dep arg0) {
            return arg0.set;
        }

        public boolean equals(Object arg4) {
            boolean v1 = false;
            if((arg4 instanceof Dep)) {
                if((((Dep)arg4).anInterface.equals(this.anInterface)) && ((Dep)arg4).set == this.set) {
                    v1 = true;
                }

                return v1;
            }

            return 0;
        }

        public int hashCode() {
            return (this.anInterface.hashCode() ^ 1000003) * 1000003 ^ Boolean.valueOf(this.set).hashCode();
        }
    }

    CycleDetector() {
        super();
    }

    static void detect(List arg7) {
        Set v0 = CycleDetector.toGraph(arg7);
        Set v1 = CycleDetector.getRoots(v0);
        int v2 = 0;
    label_3:
        if(!v1.isEmpty()) {
            Object v3 = v1.iterator().next();
            v1.remove(v3);
            ++v2;
            Iterator v4 = ((ComponentNode)v3).getDependencies().iterator();
            while(true) {
                if(!v4.hasNext()) {
                    goto label_3;
                }

                Object v5 = v4.next();
                ((ComponentNode)v5).removeDependent(((ComponentNode)v3));
                if(!((ComponentNode)v5).isRoot()) {
                    continue;
                }

                v1.add(v5);
            }
        }

        if(v2 == arg7.size()) {
            return;
        }

        ArrayList v7 = new ArrayList();
        Iterator v0_1 = v0.iterator();
        while(v0_1.hasNext()) {
            Object v1_1 = v0_1.next();
            if(((ComponentNode)v1_1).isRoot()) {
                continue;
            }

            if(((ComponentNode)v1_1).isLeaf()) {
                continue;
            }

            ((List)v7).add(((ComponentNode)v1_1).getComponent());
        }

        throw new DependencyCycleException(((List)v7));
    }

    private static Set getRoots(Set arg3) {
        HashSet v0 = new HashSet();
        Iterator v3 = arg3.iterator();
        while(v3.hasNext()) {
            Object v1 = v3.next();
            if(!((ComponentNode)v1).isRoot()) {
                continue;
            }

            ((Set)v0).add(v1);
        }

        return ((Set)v0);
    }

    private static Set toGraph(List arg10) {
        Iterator v1_1;
        Object v5;
        Iterator v4;
        HashMap v0 = new HashMap(arg10.size());
        Iterator v10 = arg10.iterator();
    label_4:
        com.google.firebase.components.CycleDetector$1 v2 = null;
        if(v10.hasNext()) {
            Object v1 = v10.next();
            ComponentNode v3 = new ComponentNode(((Component)v1));
            v4 = ((Component)v1).getProvidedInterfaces().iterator();
            while(true) {
                if(!v4.hasNext()) {
                    goto label_4;
                }

                v5 = v4.next();
                Dep v6 = new Dep(((Class)v5), ((Component)v1).isValue() ^ 1, v2);
                if(!((Map)v0).containsKey(v6)) {
                    ((Map)v0).put(v6, new HashSet());
                }

                Object v7 = ((Map)v0).get(v6);
                if(!((Set)v7).isEmpty()) {
                    if(Dep.access$100(v6)) {
                    }
                    else {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", v5));
                    }
                }

                ((Set)v7).add(v3);
            }
        }

        v10 = ((Map)v0).values().iterator();
        do {
            if(!v10.hasNext()) {
                goto label_73;
            }

            v1_1 = v10.next().iterator();
        label_47:
        }
        while(!v1_1.hasNext());

        Object v3_1 = v1_1.next();
        v4 = ((ComponentNode)v3_1).getComponent().getDependencies().iterator();
        while(true) {
        label_53:
            if(!v4.hasNext()) {
                goto label_47;
            }

            v5 = v4.next();
            if(!((Dependency)v5).isDirectInjection()) {
                continue;
            }

            v5 = ((Map)v0).get(new Dep(((Dependency)v5).getInterface(), ((Dependency)v5).isSet(), v2));
            if(v5 != null) {
                break;
            }
        }

        Iterator v5_1 = ((Set)v5).iterator();
        while(true) {
            if(!v5_1.hasNext()) {
                goto label_53;
            }

            Object v6_1 = v5_1.next();
            ((ComponentNode)v3_1).addDependency(((ComponentNode)v6_1));
            ((ComponentNode)v6_1).addDependent(((ComponentNode)v3_1));
        }

    label_73:
        HashSet v10_1 = new HashSet();
        Iterator v0_1 = ((Map)v0).values().iterator();
        while(v0_1.hasNext()) {
            v10_1.addAll(v0_1.next());
        }

        return ((Set)v10_1);
    }
}

