package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

@KeepForSdk public final class Dependency {
    private final Class anInterface;
    private final int injection;
    private final int type;

    private Dependency(Class arg2, int arg3, int arg4) {
        super();
        this.anInterface = Preconditions.checkNotNull(arg2, "Null dependency anInterface.");
        this.type = arg3;
        this.injection = arg4;
    }

    public boolean equals(Object arg4) {
        boolean v1 = false;
        if((arg4 instanceof Dependency)) {
            if(this.anInterface == ((Dependency)arg4).anInterface && this.type == ((Dependency)arg4).type && this.injection == ((Dependency)arg4).injection) {
                v1 = true;
            }

            return v1;
        }

        return 0;
    }

    public Class getInterface() {
        return this.anInterface;
    }

    public int hashCode() {
        return ((this.anInterface.hashCode() ^ 1000003) * 1000003 ^ this.type) * 1000003 ^ this.injection;
    }

    public boolean isDirectInjection() {
        boolean v0 = this.injection == 0 ? true : false;
        return v0;
    }

    public boolean isRequired() {
        boolean v1 = true;
        if(this.type == 1) {
        }
        else {
            v1 = false;
        }

        return v1;
    }

    public boolean isSet() {
        boolean v0 = this.type == 2 ? true : false;
        return v0;
    }

    @KeepForSdk public static Dependency optional(Class arg2) {
        return new Dependency(arg2, 0, 0);
    }

    @KeepForSdk public static Dependency optionalProvider(Class arg3) {
        return new Dependency(arg3, 0, 1);
    }

    @KeepForSdk public static Dependency required(Class arg3) {
        return new Dependency(arg3, 1, 0);
    }

    @KeepForSdk public static Dependency requiredProvider(Class arg2) {
        return new Dependency(arg2, 1, 1);
    }

    @KeepForSdk public static Dependency setOf(Class arg3) {
        return new Dependency(arg3, 2, 0);
    }

    @KeepForSdk public static Dependency setOfProvider(Class arg3) {
        return new Dependency(arg3, 2, 1);
    }

    public String toString() {
        String v1;
        StringBuilder v0 = new StringBuilder("Dependency{anInterface=");
        v0.append(this.anInterface);
        v0.append(", type=");
        boolean v2 = true;
        if(this.type == 1) {
            v1 = "required";
        }
        else if(this.type == 0) {
            v1 = "optional";
        }
        else {
            v1 = "set";
        }

        v0.append(v1);
        v0.append(", direct=");
        if(this.injection == 0) {
        }
        else {
            v2 = false;
        }

        v0.append(v2);
        v0.append("}");
        return v0.toString();
    }
}

