package com.google.firebase.platforminfo;

import com.google.auto.value.AutoValue;
import javax.annotation.Nonnull;

@AutoValue abstract class LibraryVersion {
    LibraryVersion() {
        super();
    }

    static LibraryVersion create(String arg1, String arg2) {
        return new AutoValue_LibraryVersion(arg1, arg2);
    }

    @Nonnull public abstract String getLibraryName();

    @Nonnull public abstract String getVersion();
}

