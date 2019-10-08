package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GlobalLibraryVersionRegistrar {
    private static volatile GlobalLibraryVersionRegistrar INSTANCE;
    private final Set infos;

    GlobalLibraryVersionRegistrar() {
        super();
        this.infos = new HashSet();
    }

    public static GlobalLibraryVersionRegistrar getInstance() {
        GlobalLibraryVersionRegistrar v0 = GlobalLibraryVersionRegistrar.INSTANCE;
        if(v0 == null) {
            Class v1 = GlobalLibraryVersionRegistrar.class;
            __monitor_enter(v1);
            try {
                v0 = GlobalLibraryVersionRegistrar.INSTANCE;
                if(v0 == null) {
                    v0 = new GlobalLibraryVersionRegistrar();
                    GlobalLibraryVersionRegistrar.INSTANCE = v0;
                }

                __monitor_exit(v1);
                return v0;
            label_12:
                __monitor_exit(v1);
            }
            catch(Throwable v0_1) {
                goto label_12;
            }

            throw v0_1;
        }

        return v0;
    }

    Set getRegisteredVersions() {
        Set v0 = this.infos;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return Collections.unmodifiableSet(this.infos);
        label_7:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_7;
        }

        throw v1;
    }

    public void registerVersion(String arg3, String arg4) {
        Set v0 = this.infos;
        __monitor_enter(v0);
        try {
            this.infos.add(LibraryVersion.create(arg3, arg4));
            __monitor_exit(v0);
            return;
        label_8:
            __monitor_exit(v0);
        }
        catch(Throwable v3) {
            goto label_8;
        }

        throw v3;
    }
}

