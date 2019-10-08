package com.google.firebase.platforminfo;

import javax.annotation.Nonnull;

final class AutoValue_LibraryVersion extends LibraryVersion {
    private final String libraryName;
    private final String version;

    AutoValue_LibraryVersion(String arg1, String arg2) {
        super();
        if(arg1 != null) {
            this.libraryName = arg1;
            if(arg2 != null) {
                this.version = arg2;
                return;
            }

            throw new NullPointerException("Null version");
        }

        throw new NullPointerException("Null libraryName");
    }

    public boolean equals(Object arg5) {
        boolean v0 = true;
        if((((AutoValue_LibraryVersion)arg5)) == this) {
            return 1;
        }

        if((arg5 instanceof LibraryVersion)) {
            if(!this.libraryName.equals(((LibraryVersion)arg5).getLibraryName()) || !this.version.equals(((LibraryVersion)arg5).getVersion())) {
                v0 = false;
            }
            else {
            }

            return v0;
        }

        return 0;
    }

    @Nonnull public String getLibraryName() {
        return this.libraryName;
    }

    @Nonnull public String getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.libraryName.hashCode() ^ 1000003) * 1000003 ^ this.version.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.libraryName + ", version=" + this.version + "}";
    }
}

