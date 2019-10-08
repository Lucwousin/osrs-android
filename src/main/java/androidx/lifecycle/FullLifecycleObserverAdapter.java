package androidx.lifecycle;

class FullLifecycleObserverAdapter implements GenericLifecycleObserver {
    class androidx.lifecycle.FullLifecycleObserverAdapter$1 {
        static {
            androidx.lifecycle.FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event = new int[Event.values().length];
            try {
                androidx.lifecycle.FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_CREATE.ordinal()] = 1;
                goto label_9;
            }
            catch(NoSuchFieldError ) {
                try {
                label_9:
                    androidx.lifecycle.FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_START.ordinal()] = 2;
                    goto label_14;
                }
                catch(NoSuchFieldError ) {
                    try {
                    label_14:
                        androidx.lifecycle.FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_RESUME.ordinal()] = 3;
                        goto label_19;
                    }
                    catch(NoSuchFieldError ) {
                        try {
                        label_19:
                            androidx.lifecycle.FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_PAUSE.ordinal()] = 4;
                            goto label_24;
                        }
                        catch(NoSuchFieldError ) {
                            try {
                            label_24:
                                androidx.lifecycle.FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_STOP.ordinal()] = 5;
                                goto label_29;
                            }
                            catch(NoSuchFieldError ) {
                                try {
                                label_29:
                                    androidx.lifecycle.FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_DESTROY.ordinal()] = 6;
                                    goto label_34;
                                }
                                catch(NoSuchFieldError ) {
                                    try {
                                    label_34:
                                        androidx.lifecycle.FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_ANY.ordinal()] = 7;
                                        return;
                                    }
                                    catch(NoSuchFieldError ) {
                                        return;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private final FullLifecycleObserver mObserver;

    FullLifecycleObserverAdapter(FullLifecycleObserver arg1) {
        super();
        this.mObserver = arg1;
    }

    public void onStateChanged(LifecycleOwner arg2, Event arg3) {
        switch(androidx.lifecycle.FullLifecycleObserverAdapter$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[arg3.ordinal()]) {
            case 1: {
                goto label_24;
            }
            case 2: {
                goto label_21;
            }
            case 3: {
                goto label_18;
            }
            case 4: {
                goto label_15;
            }
            case 5: {
                goto label_12;
            }
            case 6: {
                goto label_9;
            }
            case 7: {
                goto label_5;
            }
        }

        return;
    label_18:
        this.mObserver.onResume(arg2);
        return;
    label_21:
        this.mObserver.onStart(arg2);
        return;
    label_5:
        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
    label_24:
        this.mObserver.onCreate(arg2);
        return;
    label_9:
        this.mObserver.onDestroy(arg2);
        return;
    label_12:
        this.mObserver.onStop(arg2);
        return;
    label_15:
        this.mObserver.onPause(arg2);
    }
}

