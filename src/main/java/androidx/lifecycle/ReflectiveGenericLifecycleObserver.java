package androidx.lifecycle;

class ReflectiveGenericLifecycleObserver implements GenericLifecycleObserver {
    private final CallbackInfo mInfo;
    private final Object mWrapped;

    ReflectiveGenericLifecycleObserver(Object arg2) {
        super();
        this.mWrapped = arg2;
        this.mInfo = ClassesInfoCache.sInstance.getInfo(this.mWrapped.getClass());
    }

    public void onStateChanged(LifecycleOwner arg3, Event arg4) {
        this.mInfo.invokeCallbacks(arg3, arg4, this.mWrapped);
    }
}

