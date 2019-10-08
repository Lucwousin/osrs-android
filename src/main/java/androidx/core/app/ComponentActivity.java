package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window$Callback;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.KeyEventDispatcher$Component;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class ComponentActivity extends Activity implements Component, LifecycleOwner {
    @RestrictTo(value={Scope.LIBRARY_GROUP}) public class ExtraData {
        public ExtraData() {
            super();
        }
    }

    private SimpleArrayMap mExtraDataMap;
    private LifecycleRegistry mLifecycleRegistry;

    public ComponentActivity() {
        super();
        this.mExtraDataMap = new SimpleArrayMap();
        this.mLifecycleRegistry = new LifecycleRegistry(((LifecycleOwner)this));
    }

    public boolean dispatchKeyEvent(KeyEvent arg3) {
        View v0 = this.getWindow().getDecorView();
        if(v0 != null && (KeyEventDispatcher.dispatchBeforeHierarchy(v0, arg3))) {
            return 1;
        }

        return KeyEventDispatcher.dispatchKeyEvent(((Component)this), v0, ((Window$Callback)this), arg3);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent arg2) {
        View v0 = this.getWindow().getDecorView();
        if(v0 != null && (KeyEventDispatcher.dispatchBeforeHierarchy(v0, arg2))) {
            return 1;
        }

        return super.dispatchKeyShortcutEvent(arg2);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public ExtraData getExtraData(Class arg2) {
        return this.mExtraDataMap.get(arg2);
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    protected void onCreate(@Nullable Bundle arg1) {
        super.onCreate(arg1);
        ReportFragment.injectIfNeededIn(((Activity)this));
    }

    @CallSuper protected void onSaveInstanceState(Bundle arg3) {
        this.mLifecycleRegistry.markState(State.CREATED);
        super.onSaveInstanceState(arg3);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void putExtraData(ExtraData arg3) {
        this.mExtraDataMap.put(arg3.getClass(), arg3);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public boolean superDispatchKeyEvent(KeyEvent arg1) {
        return super.dispatchKeyEvent(arg1);
    }
}

