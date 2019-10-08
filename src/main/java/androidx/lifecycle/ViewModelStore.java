package androidx.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

public class ViewModelStore {
    private final HashMap mMap;

    public ViewModelStore() {
        super();
        this.mMap = new HashMap();
    }

    public final void clear() {
        Iterator v0 = this.mMap.values().iterator();
        while(v0.hasNext()) {
            v0.next().onCleared();
        }

        this.mMap.clear();
    }

    final ViewModel get(String arg2) {
        return this.mMap.get(arg2);
    }

    final void put(String arg2, ViewModel arg3) {
        Object v2 = this.mMap.put(arg2, arg3);
        if(v2 != null) {
            ((ViewModel)v2).onCleared();
        }
    }
}

