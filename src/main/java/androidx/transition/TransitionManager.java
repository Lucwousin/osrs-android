package androidx.transition;

import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver$OnPreDrawListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TransitionManager {
    class MultiListener implements View$OnAttachStateChangeListener, ViewTreeObserver$OnPreDrawListener {
        ViewGroup mSceneRoot;
        Transition mTransition;

        MultiListener(Transition arg1, ViewGroup arg2) {
            super();
            this.mTransition = arg1;
            this.mSceneRoot = arg2;
        }

        public boolean onPreDraw() {
            ArrayList v2_1;
            this.removeListeners();
            if(!TransitionManager.sPendingTransitions.remove(this.mSceneRoot)) {
                return 1;
            }

            ArrayMap v0 = TransitionManager.getRunningTransitions();
            Object v2 = v0.get(this.mSceneRoot);
            ArrayList v3 = null;
            if(v2 == null) {
                v2_1 = new ArrayList();
                v0.put(this.mSceneRoot, v2_1);
            }
            else if(((ArrayList)v2).size() > 0) {
                v3 = new ArrayList(((Collection)v2));
            }

            v2_1.add(this.mTransition);
            this.mTransition.addListener(new TransitionListenerAdapter(v0) {
                public void onTransitionEnd(@NonNull Transition arg3) {
                    this.val$runningTransitions.get(MultiListener.this.mSceneRoot).remove(arg3);
                }
            });
            this.mTransition.captureValues(this.mSceneRoot, false);
            if(v3 != null) {
                Iterator v0_1 = v3.iterator();
                while(v0_1.hasNext()) {
                    v0_1.next().resume(this.mSceneRoot);
                }
            }

            this.mTransition.playTransition(this.mSceneRoot);
            return 1;
        }

        public void onViewAttachedToWindow(View arg1) {
        }

        public void onViewDetachedFromWindow(View arg3) {
            this.removeListeners();
            TransitionManager.sPendingTransitions.remove(this.mSceneRoot);
            Object v3 = TransitionManager.getRunningTransitions().get(this.mSceneRoot);
            if(v3 != null && ((ArrayList)v3).size() > 0) {
                Iterator v3_1 = ((ArrayList)v3).iterator();
                while(v3_1.hasNext()) {
                    v3_1.next().resume(this.mSceneRoot);
                }
            }

            this.mTransition.clearValues(true);
        }

        private void removeListeners() {
            this.mSceneRoot.getViewTreeObserver().removeOnPreDrawListener(((ViewTreeObserver$OnPreDrawListener)this));
            this.mSceneRoot.removeOnAttachStateChangeListener(((View$OnAttachStateChangeListener)this));
        }
    }

    private static final String LOG_TAG = "TransitionManager";
    private ArrayMap mScenePairTransitions;
    private ArrayMap mSceneTransitions;
    private static Transition sDefaultTransition;
    static ArrayList sPendingTransitions;
    private static ThreadLocal sRunningTransitions;

    static {
        TransitionManager.sDefaultTransition = new AutoTransition();
        TransitionManager.sRunningTransitions = new ThreadLocal();
        TransitionManager.sPendingTransitions = new ArrayList();
    }

    public TransitionManager() {
        super();
        this.mSceneTransitions = new ArrayMap();
        this.mScenePairTransitions = new ArrayMap();
    }

    public static void beginDelayedTransition(@NonNull ViewGroup arg1) {
        TransitionManager.beginDelayedTransition(arg1, null);
    }

    public static void beginDelayedTransition(@NonNull ViewGroup arg1, @Nullable Transition arg2) {
        if(!TransitionManager.sPendingTransitions.contains(arg1) && (ViewCompat.isLaidOut(((View)arg1)))) {
            TransitionManager.sPendingTransitions.add(arg1);
            if(arg2 == null) {
                arg2 = TransitionManager.sDefaultTransition;
            }

            arg2 = arg2.clone();
            TransitionManager.sceneChangeSetup(arg1, arg2);
            Scene.setCurrentScene(((View)arg1), null);
            TransitionManager.sceneChangeRunTransition(arg1, arg2);
        }
    }

    private static void changeScene(Scene arg2, Transition arg3) {
        ViewGroup v0 = arg2.getSceneRoot();
        if(!TransitionManager.sPendingTransitions.contains(v0)) {
            if(arg3 == null) {
                arg2.enter();
            }
            else {
                TransitionManager.sPendingTransitions.add(v0);
                arg3 = arg3.clone();
                arg3.setSceneRoot(v0);
                Scene v1 = Scene.getCurrentScene(((View)v0));
                if(v1 != null && (v1.isCreatedFromLayoutResource())) {
                    arg3.setCanRemoveViews(true);
                }

                TransitionManager.sceneChangeSetup(v0, arg3);
                arg2.enter();
                TransitionManager.sceneChangeRunTransition(v0, arg3);
            }
        }
    }

    public static void endTransitions(ViewGroup arg3) {
        TransitionManager.sPendingTransitions.remove(arg3);
        Object v0 = TransitionManager.getRunningTransitions().get(arg3);
        if(v0 != null && !((ArrayList)v0).isEmpty()) {
            ArrayList v1 = new ArrayList(((Collection)v0));
            int v0_1;
            for(v0_1 = v1.size() - 1; v0_1 >= 0; --v0_1) {
                v1.get(v0_1).forceToEnd(arg3);
            }
        }
    }

    static ArrayMap getRunningTransitions() {
        Object v0 = TransitionManager.sRunningTransitions.get();
        if(v0 != null) {
            v0 = ((WeakReference)v0).get();
            if(v0 != null) {
                return ((ArrayMap)v0);
            }
        }

        ArrayMap v0_1 = new ArrayMap();
        TransitionManager.sRunningTransitions.set(new WeakReference(v0_1));
        return v0_1;
    }

    private Transition getTransition(Scene arg3) {
        Transition v3_1;
        ViewGroup v0 = arg3.getSceneRoot();
        if(v0 != null) {
            Scene v0_1 = Scene.getCurrentScene(((View)v0));
            if(v0_1 != null) {
                Object v1 = this.mScenePairTransitions.get(arg3);
                if(v1 != null) {
                    Object v0_2 = ((ArrayMap)v1).get(v0_1);
                    if(v0_2 != null) {
                        return ((Transition)v0_2);
                    }
                }
            }
        }

        Object v3 = this.mSceneTransitions.get(arg3);
        if(v3 != null) {
        }
        else {
            v3_1 = TransitionManager.sDefaultTransition;
        }

        return v3_1;
    }

    public static void go(@NonNull Scene arg1) {
        TransitionManager.changeScene(arg1, TransitionManager.sDefaultTransition);
    }

    public static void go(@NonNull Scene arg0, @Nullable Transition arg1) {
        TransitionManager.changeScene(arg0, arg1);
    }

    private static void sceneChangeRunTransition(ViewGroup arg1, Transition arg2) {
        if(arg2 != null && arg1 != null) {
            MultiListener v0 = new MultiListener(arg2, arg1);
            arg1.addOnAttachStateChangeListener(((View$OnAttachStateChangeListener)v0));
            arg1.getViewTreeObserver().addOnPreDrawListener(((ViewTreeObserver$OnPreDrawListener)v0));
        }
    }

    private static void sceneChangeSetup(ViewGroup arg2, Transition arg3) {
        Object v0 = TransitionManager.getRunningTransitions().get(arg2);
        if(v0 != null && ((ArrayList)v0).size() > 0) {
            Iterator v0_1 = ((ArrayList)v0).iterator();
            while(v0_1.hasNext()) {
                v0_1.next().pause(((View)arg2));
            }
        }

        if(arg3 != null) {
            arg3.captureValues(arg2, true);
        }

        Scene v2 = Scene.getCurrentScene(((View)arg2));
        if(v2 != null) {
            v2.exit();
        }
    }

    public void setTransition(@NonNull Scene arg2, @Nullable Transition arg3) {
        this.mSceneTransitions.put(arg2, arg3);
    }

    public void setTransition(@NonNull Scene arg3, @NonNull Scene arg4, @Nullable Transition arg5) {
        Object v0 = this.mScenePairTransitions.get(arg4);
        if(v0 == null) {
            ArrayMap v0_1 = new ArrayMap();
            this.mScenePairTransitions.put(arg4, v0_1);
        }

        ((ArrayMap)v0).put(arg3, arg5);
    }

    public void transitionTo(@NonNull Scene arg2) {
        TransitionManager.changeScene(arg2, this.getTransition(arg2));
    }
}

