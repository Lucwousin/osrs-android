package androidx.lifecycle;

import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class SingleGeneratedAdapterObserver implements GenericLifecycleObserver {
    private final GeneratedAdapter mGeneratedAdapter;

    SingleGeneratedAdapterObserver(GeneratedAdapter arg1) {
        super();
        this.mGeneratedAdapter = arg1;
    }

    public void onStateChanged(LifecycleOwner arg4, Event arg5) {
        this.mGeneratedAdapter.callMethods(arg4, arg5, false, null);
        this.mGeneratedAdapter.callMethods(arg4, arg5, true, null);
    }
}

