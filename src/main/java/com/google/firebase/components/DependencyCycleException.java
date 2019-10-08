package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.List;

@KeepForSdk public class DependencyCycleException extends DependencyException {
    private final List componentsInCycle;

    @KeepForSdk public DependencyCycleException(List arg3) {
        super("Dependency cycle detected: " + Arrays.toString(arg3.toArray()));
        this.componentsInCycle = arg3;
    }

    @KeepForSdk public List getComponentsInCycle() {
        return this.componentsInCycle;
    }
}

