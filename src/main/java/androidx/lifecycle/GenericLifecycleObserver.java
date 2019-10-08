package androidx.lifecycle;

import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY}) public interface GenericLifecycleObserver extends LifecycleObserver {
    void onStateChanged(LifecycleOwner arg1, Event arg2);
}

