package androidx.transition;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.TypedArrayUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;

public class TransitionSet extends Transition {
    class TransitionSetListener extends TransitionListenerAdapter {
        TransitionSet mTransitionSet;

        TransitionSetListener(TransitionSet arg1) {
            super();
            this.mTransitionSet = arg1;
        }

        public void onTransitionEnd(@NonNull Transition arg3) {
            --this.mTransitionSet.mCurrentListeners;
            if(this.mTransitionSet.mCurrentListeners == 0) {
                this.mTransitionSet.mStarted = false;
                this.mTransitionSet.end();
            }

            arg3.removeListener(((TransitionListener)this));
        }

        public void onTransitionStart(@NonNull Transition arg2) {
            if(!this.mTransitionSet.mStarted) {
                this.mTransitionSet.start();
                this.mTransitionSet.mStarted = true;
            }
        }
    }

    private static final int FLAG_CHANGE_EPICENTER = 8;
    private static final int FLAG_CHANGE_INTERPOLATOR = 1;
    private static final int FLAG_CHANGE_PATH_MOTION = 4;
    private static final int FLAG_CHANGE_PROPAGATION = 2;
    public static final int ORDERING_SEQUENTIAL = 1;
    public static final int ORDERING_TOGETHER;
    private int mChangeFlags;
    int mCurrentListeners;
    private boolean mPlayTogether;
    boolean mStarted;
    private ArrayList mTransitions;

    public TransitionSet(Context arg3, AttributeSet arg4) {
        super(arg3, arg4);
        this.mTransitions = new ArrayList();
        this.mPlayTogether = true;
        this.mStarted = false;
        this.mChangeFlags = 0;
        TypedArray v3 = arg3.obtainStyledAttributes(arg4, Styleable.TRANSITION_SET);
        this.setOrdering(TypedArrayUtils.getNamedInt(v3, ((XmlPullParser)arg4), "transitionOrdering", 0, 0));
        v3.recycle();
    }

    public TransitionSet() {
        super();
        this.mTransitions = new ArrayList();
        this.mPlayTogether = true;
        this.mStarted = false;
        this.mChangeFlags = 0;
    }

    @NonNull public Transition addListener(@NonNull TransitionListener arg1) {
        return this.addListener(arg1);
    }

    @NonNull public TransitionSet addListener(@NonNull TransitionListener arg1) {
        return super.addListener(arg1);
    }

    @NonNull public Transition addTarget(@IdRes int arg1) {
        return this.addTarget(arg1);
    }

    @NonNull public TransitionSet addTarget(@IdRes int arg3) {
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).addTarget(arg3);
        }

        return super.addTarget(arg3);
    }

    @NonNull public Transition addTarget(@NonNull View arg1) {
        return this.addTarget(arg1);
    }

    @NonNull public TransitionSet addTarget(@NonNull View arg3) {
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).addTarget(arg3);
        }

        return super.addTarget(arg3);
    }

    @NonNull public Transition addTarget(@NonNull Class arg1) {
        return this.addTarget(arg1);
    }

    @NonNull public TransitionSet addTarget(@NonNull Class arg3) {
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).addTarget(arg3);
        }

        return super.addTarget(arg3);
    }

    @NonNull public Transition addTarget(@NonNull String arg1) {
        return this.addTarget(arg1);
    }

    @NonNull public TransitionSet addTarget(@NonNull String arg3) {
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).addTarget(arg3);
        }

        return super.addTarget(arg3);
    }

    @NonNull public TransitionSet addTransition(@NonNull Transition arg5) {
        this.mTransitions.add(arg5);
        arg5.mParent = this;
        if(this.mDuration >= 0) {
            arg5.setDuration(this.mDuration);
        }

        if((this.mChangeFlags & 1) != 0) {
            arg5.setInterpolator(this.getInterpolator());
        }

        if((this.mChangeFlags & 2) != 0) {
            arg5.setPropagation(this.getPropagation());
        }

        if((this.mChangeFlags & 4) != 0) {
            arg5.setPathMotion(this.getPathMotion());
        }

        if((this.mChangeFlags & 8) != 0) {
            arg5.setEpicenterCallback(this.getEpicenterCallback());
        }

        return this;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) protected void cancel() {
        super.cancel();
        int v0 = this.mTransitions.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mTransitions.get(v1).cancel();
        }
    }

    public void captureEndValues(@NonNull TransitionValues arg4) {
        if(this.isValidTarget(arg4.view)) {
            Iterator v0 = this.mTransitions.iterator();
            while(v0.hasNext()) {
                Object v1 = v0.next();
                if(!((Transition)v1).isValidTarget(arg4.view)) {
                    continue;
                }

                ((Transition)v1).captureEndValues(arg4);
                arg4.mTargetedTransitions.add(v1);
            }
        }
    }

    void capturePropagationValues(TransitionValues arg4) {
        super.capturePropagationValues(arg4);
        int v0 = this.mTransitions.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mTransitions.get(v1).capturePropagationValues(arg4);
        }
    }

    public void captureStartValues(@NonNull TransitionValues arg4) {
        if(this.isValidTarget(arg4.view)) {
            Iterator v0 = this.mTransitions.iterator();
            while(v0.hasNext()) {
                Object v1 = v0.next();
                if(!((Transition)v1).isValidTarget(arg4.view)) {
                    continue;
                }

                ((Transition)v1).captureStartValues(arg4);
                arg4.mTargetedTransitions.add(v1);
            }
        }
    }

    public Transition clone() {
        Transition v0 = super.clone();
        ((TransitionSet)v0).mTransitions = new ArrayList();
        int v1 = this.mTransitions.size();
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            ((TransitionSet)v0).addTransition(this.mTransitions.get(v2).clone());
        }

        return v0;
    }

    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) protected void createAnimators(ViewGroup arg13, TransitionValuesMaps arg14, TransitionValuesMaps arg15, ArrayList arg16, ArrayList arg17) {
        TransitionSet v0 = this;
        long v1 = this.getStartDelay();
        int v3 = v0.mTransitions.size();
        int v4;
        for(v4 = 0; v4 < v3; ++v4) {
            Object v6 = v0.mTransitions.get(v4);
            long v7 = 0;
            if(v1 > v7 && ((v0.mPlayTogether) || v4 == 0)) {
                long v9 = ((Transition)v6).getStartDelay();
                if(v9 > v7) {
                    ((Transition)v6).setStartDelay(v9 + v1);
                    goto label_20;
                }

                ((Transition)v6).setStartDelay(v1);
            }

        label_20:
            ((Transition)v6).createAnimators(arg13, arg14, arg15, arg16, arg17);
        }
    }

    @NonNull public Transition excludeTarget(int arg3, boolean arg4) {
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).excludeTarget(arg3, arg4);
        }

        return super.excludeTarget(arg3, arg4);
    }

    @NonNull public Transition excludeTarget(@NonNull View arg3, boolean arg4) {
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).excludeTarget(arg3, arg4);
        }

        return super.excludeTarget(arg3, arg4);
    }

    @NonNull public Transition excludeTarget(@NonNull Class arg3, boolean arg4) {
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).excludeTarget(arg3, arg4);
        }

        return super.excludeTarget(arg3, arg4);
    }

    @NonNull public Transition excludeTarget(@NonNull String arg3, boolean arg4) {
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).excludeTarget(arg3, arg4);
        }

        return super.excludeTarget(arg3, arg4);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) void forceToEnd(ViewGroup arg4) {
        super.forceToEnd(arg4);
        int v0 = this.mTransitions.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mTransitions.get(v1).forceToEnd(arg4);
        }
    }

    public int getOrdering() {
        return this.mPlayTogether ^ 1;
    }

    public Transition getTransitionAt(int arg2) {
        if(arg2 >= 0) {
            if(arg2 >= this.mTransitions.size()) {
            }
            else {
                return this.mTransitions.get(arg2);
            }
        }

        return null;
    }

    public int getTransitionCount() {
        return this.mTransitions.size();
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void pause(View arg4) {
        super.pause(arg4);
        int v0 = this.mTransitions.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mTransitions.get(v1).pause(arg4);
        }
    }

    @NonNull public Transition removeListener(@NonNull TransitionListener arg1) {
        return this.removeListener(arg1);
    }

    @NonNull public TransitionSet removeListener(@NonNull TransitionListener arg1) {
        return super.removeListener(arg1);
    }

    @NonNull public Transition removeTarget(@IdRes int arg1) {
        return this.removeTarget(arg1);
    }

    @NonNull public TransitionSet removeTarget(@IdRes int arg3) {
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).removeTarget(arg3);
        }

        return super.removeTarget(arg3);
    }

    @NonNull public Transition removeTarget(@NonNull View arg1) {
        return this.removeTarget(arg1);
    }

    @NonNull public TransitionSet removeTarget(@NonNull View arg3) {
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).removeTarget(arg3);
        }

        return super.removeTarget(arg3);
    }

    @NonNull public Transition removeTarget(@NonNull Class arg1) {
        return this.removeTarget(arg1);
    }

    @NonNull public TransitionSet removeTarget(@NonNull Class arg3) {
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).removeTarget(arg3);
        }

        return super.removeTarget(arg3);
    }

    @NonNull public Transition removeTarget(@NonNull String arg1) {
        return this.removeTarget(arg1);
    }

    @NonNull public TransitionSet removeTarget(@NonNull String arg3) {
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).removeTarget(arg3);
        }

        return super.removeTarget(arg3);
    }

    @NonNull public TransitionSet removeTransition(@NonNull Transition arg2) {
        this.mTransitions.remove(arg2);
        arg2.mParent = null;
        return this;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void resume(View arg4) {
        super.resume(arg4);
        int v0 = this.mTransitions.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mTransitions.get(v1).resume(arg4);
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) protected void runAnimators() {
        if(this.mTransitions.isEmpty()) {
            this.start();
            this.end();
            return;
        }

        this.setupStartEndListeners();
        if(!this.mPlayTogether) {
            int v0;
            for(v0 = 1; v0 < this.mTransitions.size(); ++v0) {
                this.mTransitions.get(v0 - 1).addListener(new TransitionListenerAdapter(this.mTransitions.get(v0)) {
                    public void onTransitionEnd(@NonNull Transition arg2) {
                        this.val$nextTransition.runAnimators();
                        arg2.removeListener(((TransitionListener)this));
                    }
                });
            }

            Object v0_1 = this.mTransitions.get(0);
            if(v0_1 != null) {
                ((Transition)v0_1).runAnimators();
            }
        }
        else {
            Iterator v0_2 = this.mTransitions.iterator();
            while(v0_2.hasNext()) {
                v0_2.next().runAnimators();
            }
        }
    }

    void setCanRemoveViews(boolean arg4) {
        super.setCanRemoveViews(arg4);
        int v0 = this.mTransitions.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mTransitions.get(v1).setCanRemoveViews(arg4);
        }
    }

    @NonNull public Transition setDuration(long arg1) {
        return this.setDuration(arg1);
    }

    @NonNull public TransitionSet setDuration(long arg5) {
        super.setDuration(arg5);
        if(this.mDuration >= 0) {
            int v0 = this.mTransitions.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                this.mTransitions.get(v1).setDuration(arg5);
            }
        }

        return this;
    }

    public void setEpicenterCallback(EpicenterCallback arg4) {
        super.setEpicenterCallback(arg4);
        this.mChangeFlags |= 8;
        int v0 = this.mTransitions.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mTransitions.get(v1).setEpicenterCallback(arg4);
        }
    }

    @NonNull public Transition setInterpolator(@Nullable TimeInterpolator arg1) {
        return this.setInterpolator(arg1);
    }

    @NonNull public TransitionSet setInterpolator(@Nullable TimeInterpolator arg4) {
        this.mChangeFlags |= 1;
        if(this.mTransitions != null) {
            int v0 = this.mTransitions.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                this.mTransitions.get(v1).setInterpolator(arg4);
            }
        }

        return super.setInterpolator(arg4);
    }

    @NonNull public TransitionSet setOrdering(int arg4) {
        switch(arg4) {
            case 0: {
                goto label_13;
            }
            case 1: {
                goto label_10;
            }
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Invalid parameter for TransitionSet ordering: ");
        v1.append(arg4);
        throw new AndroidRuntimeException(v1.toString());
    label_10:
        this.mPlayTogether = false;
        return this;
    label_13:
        this.mPlayTogether = true;
        return this;
    }

    public void setPathMotion(PathMotion arg3) {
        super.setPathMotion(arg3);
        this.mChangeFlags |= 4;
        int v0;
        for(v0 = 0; v0 < this.mTransitions.size(); ++v0) {
            this.mTransitions.get(v0).setPathMotion(arg3);
        }
    }

    public void setPropagation(TransitionPropagation arg4) {
        super.setPropagation(arg4);
        this.mChangeFlags |= 2;
        int v0 = this.mTransitions.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mTransitions.get(v1).setPropagation(arg4);
        }
    }

    Transition setSceneRoot(ViewGroup arg1) {
        return this.setSceneRoot(arg1);
    }

    TransitionSet setSceneRoot(ViewGroup arg4) {
        super.setSceneRoot(arg4);
        int v0 = this.mTransitions.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            this.mTransitions.get(v1).setSceneRoot(arg4);
        }

        return this;
    }

    @NonNull public Transition setStartDelay(long arg1) {
        return this.setStartDelay(arg1);
    }

    @NonNull public TransitionSet setStartDelay(long arg1) {
        return super.setStartDelay(arg1);
    }

    private void setupStartEndListeners() {
        TransitionSetListener v0 = new TransitionSetListener(this);
        Iterator v1 = this.mTransitions.iterator();
        while(v1.hasNext()) {
            v1.next().addListener(((TransitionListener)v0));
        }

        this.mCurrentListeners = this.mTransitions.size();
    }

    String toString(String arg6) {
        String v0 = super.toString(arg6);
        int v1;
        for(v1 = 0; v1 < this.mTransitions.size(); ++v1) {
            StringBuilder v2 = new StringBuilder();
            v2.append(v0);
            v2.append("\n");
            Object v0_1 = this.mTransitions.get(v1);
            StringBuilder v3 = new StringBuilder();
            v3.append(arg6);
            v3.append("  ");
            v2.append(((Transition)v0_1).toString(v3.toString()));
            v0 = v2.toString();
        }

        return v0;
    }
}

