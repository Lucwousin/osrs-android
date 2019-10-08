package com.google.firebase.components;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class ComponentDiscovery {
    class com.google.firebase.components.ComponentDiscovery$1 {
    }

    class MetadataRegistrarNameRetriever implements RegistrarNameRetriever {
        MetadataRegistrarNameRetriever(com.google.firebase.components.ComponentDiscovery$1 arg1) {
            this();
        }

        private MetadataRegistrarNameRetriever() {
            super();
        }

        private static Bundle getMetadata(Context arg4) {
            Bundle v0 = null;
            try {
                PackageManager v1 = arg4.getPackageManager();
                if(v1 == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return v0;
                }

                ServiceInfo v4 = v1.getServiceInfo(new ComponentName(arg4, ComponentDiscoveryService.class), 0x80);
                if(v4 == null) {
                    Log.w("ComponentDiscovery", "ComponentDiscoveryService has no service info.");
                    return v0;
                }

                return v4.metaData;
            }
            catch(PackageManager$NameNotFoundException ) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return v0;
            }
        }

        public List retrieve(Context arg6) {
            Bundle v6 = MetadataRegistrarNameRetriever.getMetadata(arg6);
            if(v6 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }

            ArrayList v0 = new ArrayList();
            Iterator v1 = v6.keySet().iterator();
            while(v1.hasNext()) {
                Object v2 = v1.next();
                if(!"com.google.firebase.components.ComponentRegistrar".equals(v6.get(((String)v2)))) {
                    continue;
                }

                if(!((String)v2).startsWith("com.google.firebase.components:")) {
                    continue;
                }

                ((List)v0).add(((String)v2).substring("com.google.firebase.components:".length()));
            }

            return ((List)v0);
        }

        public List retrieve(Object arg1) {
            return this.retrieve(((Context)arg1));
        }
    }

    @VisibleForTesting interface RegistrarNameRetriever {
        List retrieve(Object arg1);
    }

    private static final String COMPONENT_KEY_PREFIX = "com.google.firebase.components:";
    private static final String COMPONENT_SENTINEL_VALUE = "com.google.firebase.components.ComponentRegistrar";
    private static final String TAG = "ComponentDiscovery";
    private final Object context;
    private final RegistrarNameRetriever retriever;

    @VisibleForTesting ComponentDiscovery(Object arg1, RegistrarNameRetriever arg2) {
        super();
        this.context = arg1;
        this.retriever = arg2;
    }

    public List discover() {
        return ComponentDiscovery.instantiate(this.retriever.retrieve(this.context));
    }

    public static ComponentDiscovery forContext(Context arg3) {
        return new ComponentDiscovery(arg3, new MetadataRegistrarNameRetriever(null));
    }

    private static List instantiate(List arg8) {
        ArrayList v0 = new ArrayList();
        Iterator v8 = arg8.iterator();
        while(v8.hasNext()) {
            Object v1 = v8.next();
            try {
                Class v4_5 = Class.forName(((String)v1));
                if(!ComponentRegistrar.class.isAssignableFrom(v4_5)) {
                    Log.w("ComponentDiscovery", String.format("Class %s is not an instance of %s", v1, "com.google.firebase.components.ComponentRegistrar"));
                    continue;
                }

                ((List)v0).add(v4_5.getDeclaredConstructor().newInstance());
            }
            catch(InvocationTargetException v4) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s", v1), ((Throwable)v4));
            }
            catch(NoSuchMethodException v4_1) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s", v1), ((Throwable)v4_1));
            }
            catch(InstantiationException v4_2) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", v1), ((Throwable)v4_2));
            }
            catch(IllegalAccessException v4_3) {
                Log.w("ComponentDiscovery", String.format("Could not instantiate %s.", v1), ((Throwable)v4_3));
            }
            catch(ClassNotFoundException v4_4) {
                Log.w("ComponentDiscovery", String.format("Class %s is not an found.", v1), ((Throwable)v4_4));
            }
        }

        return ((List)v0);
    }
}

