package androidx.lifecycle;

import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class CompositeGeneratedAdaptersObserver implements GenericLifecycleObserver {
    private final GeneratedAdapter[] mGeneratedAdapters;

    CompositeGeneratedAdaptersObserver(GeneratedAdapter[] arg1) {
        super();
        this.mGeneratedAdapters = arg1;
    }

    public void onStateChanged(LifecycleOwner arg7, Event arg8) {
        MethodCallsLogger v0 = new MethodCallsLogger();
        GeneratedAdapter[] v1 = this.mGeneratedAdapters;
        int v2 = v1.length;
        int v3 = 0;
        int v4;
        for(v4 = 0; v4 < v2; ++v4) {
            v1[v4].callMethods(arg7, arg8, false, v0);
        }

        v1 = this.mGeneratedAdapters;
        v2 = v1.length;
        while(v3 < v2) {
            v1[v3].callMethods(arg7, arg8, true, v0);
            ++v3;
        }
    }
}

