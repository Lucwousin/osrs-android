package com.google.gson.internal;

public final class $Gson$Preconditions {
    private $Gson$Preconditions() {
        super();
        throw new UnsupportedOperationException();
    }

    public static void checkArgument(boolean arg0) {
        if(arg0) {
            return;
        }

        throw new IllegalArgumentException();
    }

    public static Object checkNotNull(Object arg0) {
        if(arg0 != null) {
            return arg0;
        }

        throw new NullPointerException();
    }
}

