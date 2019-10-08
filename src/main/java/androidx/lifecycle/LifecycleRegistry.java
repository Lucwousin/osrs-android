package androidx.lifecycle;

import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.arch.core.internal.FastSafeIterableMap;
import androidx.arch.core.internal.SafeIterableMap$IteratorWithAdditions;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map$Entry;

public class LifecycleRegistry extends Lifecycle {
    class androidx.lifecycle.LifecycleRegistry$1 {
        static {
            androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State = new int[State.values().length];
            try {
                androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[State.INITIALIZED.ordinal()] = 1;
                goto label_9;
            }
            catch(NoSuchFieldError ) {
            label_9:
                int v1 = 2;
                try {
                    androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[State.CREATED.ordinal()] = v1;
                    goto label_14;
                }
                catch(NoSuchFieldError ) {
                label_14:
                    int v2 = 3;
                    try {
                        androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[State.STARTED.ordinal()] = v2;
                        goto label_19;
                    }
                    catch(NoSuchFieldError ) {
                    label_19:
                        int v3 = 4;
                        try {
                            androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[State.RESUMED.ordinal()] = v3;
                            goto label_24;
                        }
                        catch(NoSuchFieldError ) {
                        label_24:
                            int v4 = 5;
                            try {
                                androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[State.DESTROYED.ordinal()] = v4;
                                goto label_29;
                            }
                            catch(NoSuchFieldError ) {
                            label_29:
                                androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event = new int[Event.values().length];
                                try {
                                    androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_CREATE.ordinal()] = 1;
                                    goto label_37;
                                }
                                catch(NoSuchFieldError ) {
                                    try {
                                    label_37:
                                        androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_STOP.ordinal()] = v1;
                                        goto label_41;
                                    }
                                    catch(NoSuchFieldError ) {
                                        try {
                                        label_41:
                                            androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_START.ordinal()] = v2;
                                            goto label_45;
                                        }
                                        catch(NoSuchFieldError ) {
                                            try {
                                            label_45:
                                                androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_PAUSE.ordinal()] = v3;
                                                goto label_49;
                                            }
                                            catch(NoSuchFieldError ) {
                                                try {
                                                label_49:
                                                    androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_RESUME.ordinal()] = v4;
                                                    goto label_53;
                                                }
                                                catch(NoSuchFieldError ) {
                                                    try {
                                                    label_53:
                                                        androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_DESTROY.ordinal()] = 6;
                                                        goto label_58;
                                                    }
                                                    catch(NoSuchFieldError ) {
                                                        try {
                                                        label_58:
                                                            androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[Event.ON_ANY.ordinal()] = 7;
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
                    }
                }
            }
        }
    }

    class ObserverWithState {
        GenericLifecycleObserver mLifecycleObserver;
        State mState;

        ObserverWithState(LifecycleObserver arg1, State arg2) {
            super();
            this.mLifecycleObserver = Lifecycling.getCallback(arg1);
            this.mState = arg2;
        }

        void dispatchEvent(LifecycleOwner arg3, Event arg4) {
            State v0 = LifecycleRegistry.getStateAfter(arg4);
            this.mState = LifecycleRegistry.min(this.mState, v0);
            this.mLifecycleObserver.onStateChanged(arg3, arg4);
            this.mState = v0;
        }
    }

    private static final String LOG_TAG = "LifecycleRegistry";
    private int mAddingObserverCounter;
    private boolean mHandlingEvent;
    private final WeakReference mLifecycleOwner;
    private boolean mNewEventOccurred;
    private FastSafeIterableMap mObserverMap;
    private ArrayList mParentStates;
    private State mState;

    public LifecycleRegistry(@NonNull LifecycleOwner arg2) {
        super();
        this.mObserverMap = new FastSafeIterableMap();
        this.mAddingObserverCounter = 0;
        this.mHandlingEvent = false;
        this.mNewEventOccurred = false;
        this.mParentStates = new ArrayList();
        this.mLifecycleOwner = new WeakReference(arg2);
        this.mState = State.INITIALIZED;
    }

    public void addObserver(@NonNull LifecycleObserver arg7) {
        State v0 = this.mState == State.DESTROYED ? State.DESTROYED : State.INITIALIZED;
        ObserverWithState v1 = new ObserverWithState(arg7, v0);
        if(this.mObserverMap.putIfAbsent(arg7, v1) != null) {
            return;
        }

        Object v0_1 = this.mLifecycleOwner.get();
        if(v0_1 == null) {
            return;
        }

        int v2 = this.mAddingObserverCounter != 0 || (this.mHandlingEvent) ? 1 : 0;
        State v4 = this.calculateTargetState(arg7);
        ++this.mAddingObserverCounter;
        while(v1.mState.compareTo(((Enum)v4)) < 0) {
            if(!this.mObserverMap.contains(arg7)) {
                break;
            }

            this.pushParentState(v1.mState);
            v1.dispatchEvent(((LifecycleOwner)v0_1), LifecycleRegistry.upEvent(v1.mState));
            this.popParentState();
            v4 = this.calculateTargetState(arg7);
        }

        if(v2 == 0) {
            this.sync();
        }

        --this.mAddingObserverCounter;
    }

    private void backwardPass(LifecycleOwner arg6) {
        Object v2;
        Iterator v0 = this.mObserverMap.descendingIterator();
        do {
        label_2:
            if((v0.hasNext()) && !this.mNewEventOccurred) {
                Object v1 = v0.next();
                v2 = ((Map$Entry)v1).getValue();
                while(true) {
                label_8:
                    if(((ObserverWithState)v2).mState.compareTo(this.mState) <= 0) {
                        goto label_2;
                    }

                    if(this.mNewEventOccurred) {
                        goto label_2;
                    }

                    if(!this.mObserverMap.contains(((Map$Entry)v1).getKey())) {
                        goto label_2;
                    }

                    goto label_18;
                }
            }

            return;
        }
        while(true);

    label_18:
        Event v3 = LifecycleRegistry.downEvent(((ObserverWithState)v2).mState);
        this.pushParentState(LifecycleRegistry.getStateAfter(v3));
        ((ObserverWithState)v2).dispatchEvent(arg6, v3);
        this.popParentState();
        goto label_8;
    }

    private State calculateTargetState(LifecycleObserver arg3) {
        Object v0_1;
        Map$Entry v3 = this.mObserverMap.ceil(arg3);
        State v0 = null;
        State v3_1 = v3 != null ? v3.getValue().mState : v0;
        if(!this.mParentStates.isEmpty()) {
            v0_1 = this.mParentStates.get(this.mParentStates.size() - 1);
        }

        return LifecycleRegistry.min(LifecycleRegistry.min(this.mState, v3_1), ((State)v0_1));
    }

    private static Event downEvent(State arg3) {
        switch(androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[arg3.ordinal()]) {
            case 1: {
                goto label_22;
            }
            case 2: {
                goto label_20;
            }
            case 3: {
                goto label_18;
            }
            case 4: {
                goto label_16;
            }
            case 5: {
                goto label_13;
            }
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Unexpected state value ");
        v1.append(arg3);
        throw new IllegalArgumentException(v1.toString());
    label_18:
        return Event.ON_STOP;
    label_20:
        return Event.ON_DESTROY;
    label_22:
        throw new IllegalArgumentException();
    label_13:
        throw new IllegalArgumentException();
    label_16:
        return Event.ON_PAUSE;
    }

    private void forwardPass(LifecycleOwner arg6) {
        Object v2;
        IteratorWithAdditions v0 = this.mObserverMap.iteratorWithAdditions();
        do {
        label_2:
            if((((Iterator)v0).hasNext()) && !this.mNewEventOccurred) {
                Object v1 = ((Iterator)v0).next();
                v2 = ((Map$Entry)v1).getValue();
                while(true) {
                label_8:
                    if(((ObserverWithState)v2).mState.compareTo(this.mState) >= 0) {
                        goto label_2;
                    }

                    if(this.mNewEventOccurred) {
                        goto label_2;
                    }

                    if(!this.mObserverMap.contains(((Map$Entry)v1).getKey())) {
                        goto label_2;
                    }

                    goto label_18;
                }
            }

            return;
        }
        while(true);

    label_18:
        this.pushParentState(((ObserverWithState)v2).mState);
        ((ObserverWithState)v2).dispatchEvent(arg6, LifecycleRegistry.upEvent(((ObserverWithState)v2).mState));
        this.popParentState();
        goto label_8;
    }

    @NonNull public State getCurrentState() {
        return this.mState;
    }

    public int getObserverCount() {
        return this.mObserverMap.size();
    }

    static State getStateAfter(Event arg3) {
        switch(androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[arg3.ordinal()]) {
            case 1: 
            case 2: {
                goto label_19;
            }
            case 3: 
            case 4: {
                goto label_17;
            }
            case 5: {
                goto label_15;
            }
            case 6: {
                goto label_13;
            }
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Unexpected event value ");
        v1.append(arg3);
        throw new IllegalArgumentException(v1.toString());
    label_17:
        return State.STARTED;
    label_19:
        return State.CREATED;
    label_13:
        return State.DESTROYED;
    label_15:
        return State.RESUMED;
    }

    public void handleLifecycleEvent(@NonNull Event arg1) {
        this.moveToState(LifecycleRegistry.getStateAfter(arg1));
    }

    private boolean isSynced() {
        boolean v1 = true;
        if(this.mObserverMap.size() == 0) {
            return 1;
        }

        State v0 = this.mObserverMap.eldest().getValue().mState;
        State v2 = this.mObserverMap.newest().getValue().mState;
        if(v0 != v2 || this.mState != v2) {
            v1 = false;
        }
        else {
        }

        return v1;
    }

    @MainThread public void markState(@NonNull State arg1) {
        this.moveToState(arg1);
    }

    static State min(@NonNull State arg1, @Nullable State arg2) {
        if(arg2 != null && arg2.compareTo(((Enum)arg1)) < 0) {
            arg1 = arg2;
        }

        return arg1;
    }

    private void moveToState(State arg2) {
        if(this.mState == arg2) {
            return;
        }

        this.mState = arg2;
        if(!this.mHandlingEvent) {
            if(this.mAddingObserverCounter != 0) {
            }
            else {
                this.mHandlingEvent = true;
                this.sync();
                this.mHandlingEvent = false;
                return;
            }
        }

        this.mNewEventOccurred = true;
    }

    private void popParentState() {
        this.mParentStates.remove(this.mParentStates.size() - 1);
    }

    private void pushParentState(State arg2) {
        this.mParentStates.add(arg2);
    }

    public void removeObserver(@NonNull LifecycleObserver arg2) {
        this.mObserverMap.remove(arg2);
    }

    private void sync() {
        Object v0 = this.mLifecycleOwner.get();
        if(v0 == null) {
            Log.w("LifecycleRegistry", "LifecycleOwner is garbage collected, you shouldn\'t try dispatch new events from it.");
            return;
        }

        while(!this.isSynced()) {
            this.mNewEventOccurred = false;
            if(this.mState.compareTo(this.mObserverMap.eldest().getValue().mState) < 0) {
                this.backwardPass(((LifecycleOwner)v0));
            }

            Map$Entry v1 = this.mObserverMap.newest();
            if(this.mNewEventOccurred) {
                continue;
            }

            if(v1 == null) {
                continue;
            }

            if(this.mState.compareTo(v1.getValue().mState) <= 0) {
                continue;
            }

            this.forwardPass(((LifecycleOwner)v0));
        }

        this.mNewEventOccurred = false;
    }

    private static Event upEvent(State arg3) {
        switch(androidx.lifecycle.LifecycleRegistry$1.$SwitchMap$androidx$lifecycle$Lifecycle$State[arg3.ordinal()]) {
            case 2: {
                goto label_18;
            }
            case 3: {
                goto label_16;
            }
            case 4: {
                goto label_13;
            }
            case 1: 
            case 5: {
                goto label_20;
            }
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Unexpected state value ");
        v1.append(arg3);
        throw new IllegalArgumentException(v1.toString());
    label_18:
        return Event.ON_START;
    label_20:
        return Event.ON_CREATE;
    label_13:
        throw new IllegalArgumentException();
    label_16:
        return Event.ON_RESUME;
    }
}

