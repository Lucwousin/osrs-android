package androidx.transition;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.InflateException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.xmlpull.v1.XmlPullParser;

public abstract class Transition implements Cloneable {
    final class androidx.transition.Transition$1 extends PathMotion {
        androidx.transition.Transition$1() {
            super();
        }

        public Path getPath(float arg2, float arg3, float arg4, float arg5) {
            Path v0 = new Path();
            v0.moveTo(arg2, arg3);
            v0.lineTo(arg4, arg5);
            return v0;
        }
    }

    class AnimationInfo {
        String mName;
        Transition mTransition;
        TransitionValues mValues;
        View mView;
        WindowIdImpl mWindowId;

        AnimationInfo(View arg1, String arg2, Transition arg3, WindowIdImpl arg4, TransitionValues arg5) {
            super();
            this.mView = arg1;
            this.mName = arg2;
            this.mValues = arg5;
            this.mWindowId = arg4;
            this.mTransition = arg3;
        }
    }

    class ArrayListManager {
        private ArrayListManager() {
            super();
        }

        static ArrayList add(ArrayList arg1, Object arg2) {
            if(arg1 == null) {
                arg1 = new ArrayList();
            }

            if(!arg1.contains(arg2)) {
                arg1.add(arg2);
            }

            return arg1;
        }

        static ArrayList remove(ArrayList arg0, Object arg1) {
            if(arg0 != null) {
                arg0.remove(arg1);
                if(arg0.isEmpty()) {
                    arg0 = null;
                }
            }

            return arg0;
        }
    }

    public abstract class EpicenterCallback {
        public EpicenterCallback() {
            super();
        }

        public abstract Rect onGetEpicenter(@NonNull Transition arg1);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface MatchOrder {
    }

    public interface TransitionListener {
        void onTransitionCancel(@NonNull Transition arg1);

        void onTransitionEnd(@NonNull Transition arg1);

        void onTransitionPause(@NonNull Transition arg1);

        void onTransitionResume(@NonNull Transition arg1);

        void onTransitionStart(@NonNull Transition arg1);
    }

    static final boolean DBG = false;
    private static final int[] DEFAULT_MATCH_ORDER = null;
    private static final String LOG_TAG = "Transition";
    private static final int MATCH_FIRST = 1;
    public static final int MATCH_ID = 3;
    private static final String MATCH_ID_STR = "id";
    public static final int MATCH_INSTANCE = 1;
    private static final String MATCH_INSTANCE_STR = "instance";
    public static final int MATCH_ITEM_ID = 4;
    private static final String MATCH_ITEM_ID_STR = "itemId";
    private static final int MATCH_LAST = 4;
    public static final int MATCH_NAME = 2;
    private static final String MATCH_NAME_STR = "name";
    private static final PathMotion STRAIGHT_PATH_MOTION;
    private ArrayList mAnimators;
    boolean mCanRemoveViews;
    ArrayList mCurrentAnimators;
    long mDuration;
    private TransitionValuesMaps mEndValues;
    private ArrayList mEndValuesList;
    private boolean mEnded;
    private EpicenterCallback mEpicenterCallback;
    private TimeInterpolator mInterpolator;
    private ArrayList mListeners;
    private int[] mMatchOrder;
    private String mName;
    private ArrayMap mNameOverrides;
    private int mNumInstances;
    TransitionSet mParent;
    private PathMotion mPathMotion;
    private boolean mPaused;
    TransitionPropagation mPropagation;
    private ViewGroup mSceneRoot;
    private long mStartDelay;
    private TransitionValuesMaps mStartValues;
    private ArrayList mStartValuesList;
    private ArrayList mTargetChildExcludes;
    private ArrayList mTargetExcludes;
    private ArrayList mTargetIdChildExcludes;
    private ArrayList mTargetIdExcludes;
    ArrayList mTargetIds;
    private ArrayList mTargetNameExcludes;
    private ArrayList mTargetNames;
    private ArrayList mTargetTypeChildExcludes;
    private ArrayList mTargetTypeExcludes;
    private ArrayList mTargetTypes;
    ArrayList mTargets;
    private static ThreadLocal sRunningAnimators;

    static {
        Transition.DEFAULT_MATCH_ORDER = new int[]{2, 1, 3, 4};
        Transition.STRAIGHT_PATH_MOTION = new androidx.transition.Transition$1();
        Transition.sRunningAnimators = new ThreadLocal();
    }

    public Transition() {
        super();
        this.mName = this.getClass().getName();
        this.mStartDelay = -1;
        this.mDuration = -1;
        this.mInterpolator = null;
        this.mTargetIds = new ArrayList();
        this.mTargets = new ArrayList();
        this.mTargetNames = null;
        this.mTargetTypes = null;
        this.mTargetIdExcludes = null;
        this.mTargetExcludes = null;
        this.mTargetTypeExcludes = null;
        this.mTargetNameExcludes = null;
        this.mTargetIdChildExcludes = null;
        this.mTargetChildExcludes = null;
        this.mTargetTypeChildExcludes = null;
        this.mStartValues = new TransitionValuesMaps();
        this.mEndValues = new TransitionValuesMaps();
        this.mParent = null;
        this.mMatchOrder = Transition.DEFAULT_MATCH_ORDER;
        this.mSceneRoot = null;
        this.mCanRemoveViews = false;
        this.mCurrentAnimators = new ArrayList();
        this.mNumInstances = 0;
        this.mPaused = false;
        this.mEnded = false;
        this.mListeners = null;
        this.mAnimators = new ArrayList();
        this.mPathMotion = Transition.STRAIGHT_PATH_MOTION;
    }

    public Transition(Context arg9, AttributeSet arg10) {
        super();
        this.mName = this.getClass().getName();
        this.mStartDelay = -1;
        this.mDuration = -1;
        this.mInterpolator = null;
        this.mTargetIds = new ArrayList();
        this.mTargets = new ArrayList();
        this.mTargetNames = null;
        this.mTargetTypes = null;
        this.mTargetIdExcludes = null;
        this.mTargetExcludes = null;
        this.mTargetTypeExcludes = null;
        this.mTargetNameExcludes = null;
        this.mTargetIdChildExcludes = null;
        this.mTargetChildExcludes = null;
        this.mTargetTypeChildExcludes = null;
        this.mStartValues = new TransitionValuesMaps();
        this.mEndValues = new TransitionValuesMaps();
        this.mParent = null;
        this.mMatchOrder = Transition.DEFAULT_MATCH_ORDER;
        this.mSceneRoot = null;
        this.mCanRemoveViews = false;
        this.mCurrentAnimators = new ArrayList();
        this.mNumInstances = 0;
        this.mPaused = false;
        this.mEnded = false;
        this.mListeners = null;
        this.mAnimators = new ArrayList();
        this.mPathMotion = Transition.STRAIGHT_PATH_MOTION;
        TypedArray v0 = arg9.obtainStyledAttributes(arg10, Styleable.TRANSITION);
        int v3 = -1;
        long v4 = ((long)TypedArrayUtils.getNamedInt(v0, ((XmlPullParser)arg10), "duration", 1, v3));
        long v6 = 0;
        if(v4 >= v6) {
            this.setDuration(v4);
        }

        long v2 = ((long)TypedArrayUtils.getNamedInt(v0, ((XmlPullParser)arg10), "startDelay", 2, v3));
        if(v2 > v6) {
            this.setStartDelay(v2);
        }

        int v1 = TypedArrayUtils.getNamedResourceId(v0, ((XmlPullParser)arg10), "interpolator", 0, 0);
        if(v1 > 0) {
            this.setInterpolator(AnimationUtils.loadInterpolator(arg9, v1));
        }

        String v9 = TypedArrayUtils.getNamedString(v0, ((XmlPullParser)arg10), "matchOrder", 3);
        if(v9 != null) {
            this.setMatchOrder(Transition.parseMatchOrder(v9));
        }

        v0.recycle();
    }

    @NonNull public Transition addListener(@NonNull TransitionListener arg2) {
        if(this.mListeners == null) {
            this.mListeners = new ArrayList();
        }

        this.mListeners.add(arg2);
        return this;
    }

    @NonNull public Transition addTarget(@IdRes int arg2) {
        if(arg2 != 0) {
            this.mTargetIds.add(Integer.valueOf(arg2));
        }

        return this;
    }

    @NonNull public Transition addTarget(@NonNull View arg2) {
        this.mTargets.add(arg2);
        return this;
    }

    @NonNull public Transition addTarget(@NonNull Class arg2) {
        if(this.mTargetTypes == null) {
            this.mTargetTypes = new ArrayList();
        }

        this.mTargetTypes.add(arg2);
        return this;
    }

    @NonNull public Transition addTarget(@NonNull String arg2) {
        if(this.mTargetNames == null) {
            this.mTargetNames = new ArrayList();
        }

        this.mTargetNames.add(arg2);
        return this;
    }

    private void addUnmatched(ArrayMap arg6, ArrayMap arg7) {
        Object v3;
        int v0 = 0;
        int v1 = 0;
        while(true) {
            v3 = null;
            if(v1 < arg6.size()) {
                Object v2 = arg6.valueAt(v1);
                if(this.isValidTarget(((TransitionValues)v2).view)) {
                    this.mStartValuesList.add(v2);
                    this.mEndValuesList.add(v3);
                }

                ++v1;
                continue;
            }

            break;
        }

        while(v0 < arg7.size()) {
            Object v6 = arg7.valueAt(v0);
            if(this.isValidTarget(((TransitionValues)v6).view)) {
                this.mEndValuesList.add(v6);
                this.mStartValuesList.add(v3);
            }

            ++v0;
        }
    }

    private static void addViewValues(TransitionValuesMaps arg3, View arg4, TransitionValues arg5) {
        arg3.mViewValues.put(arg4, arg5);
        int v5 = arg4.getId();
        Object v0 = null;
        if(v5 >= 0) {
            if(arg3.mIdValues.indexOfKey(v5) >= 0) {
                arg3.mIdValues.put(v5, v0);
            }
            else {
                arg3.mIdValues.put(v5, arg4);
            }
        }

        String v5_1 = ViewCompat.getTransitionName(arg4);
        if(v5_1 != null) {
            if(arg3.mNameValues.containsKey(v5_1)) {
                arg3.mNameValues.put(v5_1, v0);
            }
            else {
                arg3.mNameValues.put(v5_1, arg4);
            }
        }

        if((arg4.getParent() instanceof ListView)) {
            ViewParent v5_2 = arg4.getParent();
            if(((ListView)v5_2).getAdapter().hasStableIds()) {
                long v1 = ((ListView)v5_2).getItemIdAtPosition(((ListView)v5_2).getPositionForView(arg4));
                if(arg3.mItemIdValues.indexOfKey(v1) >= 0) {
                    Object v4 = arg3.mItemIdValues.get(v1);
                    if(v4 != null) {
                        ViewCompat.setHasTransientState(((View)v4), false);
                        arg3.mItemIdValues.put(v1, v0);
                    }
                }
                else {
                    ViewCompat.setHasTransientState(arg4, true);
                    arg3.mItemIdValues.put(v1, arg4);
                }
            }
        }
    }

    private static boolean alreadyContains(int[] arg4, int arg5) {
        int v0 = arg4[arg5];
        int v2;
        for(v2 = 0; v2 < arg5; ++v2) {
            if(arg4[v2] == v0) {
                return 1;
            }
        }

        return 0;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) protected void animate(Animator arg5) {
        if(arg5 == null) {
            this.end();
        }
        else {
            long v2 = 0;
            if(this.getDuration() >= v2) {
                arg5.setDuration(this.getDuration());
            }

            if(this.getStartDelay() >= v2) {
                arg5.setStartDelay(this.getStartDelay());
            }

            if(this.getInterpolator() != null) {
                arg5.setInterpolator(this.getInterpolator());
            }

            arg5.addListener(new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator arg2) {
                    Transition.this.end();
                    arg2.removeListener(((Animator$AnimatorListener)this));
                }
            });
            arg5.start();
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) protected void cancel() {
        int v0;
        for(v0 = this.mCurrentAnimators.size() - 1; v0 >= 0; --v0) {
            this.mCurrentAnimators.get(v0).cancel();
        }

        if(this.mListeners != null && this.mListeners.size() > 0) {
            Object v0_1 = this.mListeners.clone();
            int v1 = ((ArrayList)v0_1).size();
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                ((ArrayList)v0_1).get(v2).onTransitionCancel(this);
            }
        }
    }

    public abstract void captureEndValues(@NonNull TransitionValues arg1);

    private void captureHierarchy(View arg6, boolean arg7) {
        int v1;
        if(arg6 == null) {
            return;
        }

        int v0 = arg6.getId();
        if(this.mTargetIdExcludes != null && (this.mTargetIdExcludes.contains(Integer.valueOf(v0)))) {
            return;
        }

        if(this.mTargetExcludes != null && (this.mTargetExcludes.contains(arg6))) {
            return;
        }

        int v2 = 0;
        if(this.mTargetTypeExcludes != null) {
            v1 = this.mTargetTypeExcludes.size();
            int v3 = 0;
            while(v3 < v1) {
                if(this.mTargetTypeExcludes.get(v3).isInstance(arg6)) {
                    return;
                }
                else {
                    ++v3;
                    continue;
                }

                break;
            }
        }

        if((arg6.getParent() instanceof ViewGroup)) {
            TransitionValues v1_1 = new TransitionValues();
            v1_1.view = arg6;
            if(arg7) {
                this.captureStartValues(v1_1);
            }
            else {
                this.captureEndValues(v1_1);
            }

            v1_1.mTargetedTransitions.add(this);
            this.capturePropagationValues(v1_1);
            if(arg7) {
                Transition.addViewValues(this.mStartValues, arg6, v1_1);
                goto label_49;
            }

            Transition.addViewValues(this.mEndValues, arg6, v1_1);
        }

    label_49:
        if((arg6 instanceof ViewGroup)) {
            if(this.mTargetIdChildExcludes != null && (this.mTargetIdChildExcludes.contains(Integer.valueOf(v0)))) {
                return;
            }

            if(this.mTargetChildExcludes != null && (this.mTargetChildExcludes.contains(arg6))) {
                return;
            }

            if(this.mTargetTypeChildExcludes != null) {
                v0 = this.mTargetTypeChildExcludes.size();
                v1 = 0;
                while(v1 < v0) {
                    if(this.mTargetTypeChildExcludes.get(v1).isInstance(arg6)) {
                        return;
                    }
                    else {
                        ++v1;
                        continue;
                    }

                    break;
                }
            }

            while(v2 < ((ViewGroup)arg6).getChildCount()) {
                this.captureHierarchy(((ViewGroup)arg6).getChildAt(v2), arg7);
                ++v2;
            }
        }
    }

    void capturePropagationValues(TransitionValues arg6) {
        if(this.mPropagation != null && !arg6.values.isEmpty()) {
            String[] v0 = this.mPropagation.getPropagationProperties();
            if(v0 == null) {
                return;
            }
            else {
                int v1 = 0;
                int v2 = 0;
                while(true) {
                    if(v2 >= v0.length) {
                        break;
                    }
                    else if(!arg6.values.containsKey(v0[v2])) {
                    }
                    else {
                        ++v2;
                        continue;
                    }

                    goto label_21;
                }

                v1 = 1;
            label_21:
                if(v1 != 0) {
                    return;
                }

                this.mPropagation.captureValues(arg6);
            }
        }
    }

    public abstract void captureStartValues(@NonNull TransitionValues arg1);

    void captureValues(ViewGroup arg6, boolean arg7) {
        Object v0_1;
        this.clearValues(arg7);
        int v1 = 0;
        if(this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            if(this.mTargetNames != null && !this.mTargetNames.isEmpty()) {
                goto label_19;
            }

            if(this.mTargetTypes != null) {
                if(this.mTargetTypes.isEmpty()) {
                }
                else {
                label_19:
                    this.captureHierarchy(((View)arg6), arg7);
                    goto label_72;
                }
            }

            int v0;
            for(v0 = 0; v0 < this.mTargetIds.size(); ++v0) {
                View v2 = arg6.findViewById(this.mTargetIds.get(v0).intValue());
                if(v2 != null) {
                    TransitionValues v3 = new TransitionValues();
                    v3.view = v2;
                    if(arg7) {
                        this.captureStartValues(v3);
                    }
                    else {
                        this.captureEndValues(v3);
                    }

                    v3.mTargetedTransitions.add(this);
                    this.capturePropagationValues(v3);
                    if(arg7) {
                        Transition.addViewValues(this.mStartValues, v2, v3);
                        goto label_46;
                    }

                    Transition.addViewValues(this.mEndValues, v2, v3);
                }

            label_46:
            }

            int v6;
            for(v6 = 0; v6 < this.mTargets.size(); ++v6) {
                v0_1 = this.mTargets.get(v6);
                TransitionValues v2_1 = new TransitionValues();
                v2_1.view = ((View)v0_1);
                if(arg7) {
                    this.captureStartValues(v2_1);
                }
                else {
                    this.captureEndValues(v2_1);
                }

                v2_1.mTargetedTransitions.add(this);
                this.capturePropagationValues(v2_1);
                if(arg7) {
                    Transition.addViewValues(this.mStartValues, ((View)v0_1), v2_1);
                }
                else {
                    Transition.addViewValues(this.mEndValues, ((View)v0_1), v2_1);
                }
            }
        }
        else {
            goto label_19;
        }

    label_72:
        if(!arg7 && this.mNameOverrides != null) {
            v6 = this.mNameOverrides.size();
            ArrayList v7 = new ArrayList(v6);
            for(v0 = 0; v0 < v6; ++v0) {
                v7.add(this.mStartValues.mNameValues.remove(this.mNameOverrides.keyAt(v0)));
            }

            while(v1 < v6) {
                v0_1 = v7.get(v1);
                if(v0_1 != null) {
                    this.mStartValues.mNameValues.put(this.mNameOverrides.valueAt(v1), v0_1);
                }

                ++v1;
            }
        }
    }

    void clearValues(boolean arg1) {
        if(arg1) {
            this.mStartValues.mViewValues.clear();
            this.mStartValues.mIdValues.clear();
            this.mStartValues.mItemIdValues.clear();
        }
        else {
            this.mEndValues.mViewValues.clear();
            this.mEndValues.mIdValues.clear();
            this.mEndValues.mItemIdValues.clear();
        }
    }

    public Transition clone() {
        ArrayList v0 = null;
        try {
            Object v1 = super.clone();
            ((Transition)v1).mAnimators = new ArrayList();
            ((Transition)v1).mStartValues = new TransitionValuesMaps();
            ((Transition)v1).mEndValues = new TransitionValuesMaps();
            ((Transition)v1).mStartValuesList = v0;
            ((Transition)v1).mEndValuesList = v0;
            return ((Transition)v1);
        }
        catch(CloneNotSupportedException ) {
            return ((Transition)v0);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return this.clone();
    }

    @Nullable public Animator createAnimator(@NonNull ViewGroup arg1, @Nullable TransitionValues arg2, @Nullable TransitionValues arg3) {
        return null;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) protected void createAnimators(ViewGroup arg21, TransitionValuesMaps arg22, TransitionValuesMaps arg23, ArrayList arg24, ArrayList arg25) {
        TransitionValues v5_3;
        Animator v10_2;
        int v18;
        int v16;
        TransitionValues v11;
        View v15;
        Object v3;
        Transition v6 = this;
        ViewGroup v7 = arg21;
        ArrayMap v8 = Transition.getRunningAnimators();
        SparseIntArray v9 = new SparseIntArray();
        int v10 = arg24.size();
        long v0 = 0x7FFFFFFFFFFFFFFFL;
        int v12 = 0;
        while(v12 < v10) {
            Object v2 = arg24.get(v12);
            v3 = arg25.get(v12);
            if(v2 != null && !((TransitionValues)v2).mTargetedTransitions.contains(v6)) {
                v2 = null;
            }

            if(v3 != null && !((TransitionValues)v3).mTargetedTransitions.contains(v6)) {
                v3 = null;
            }

            if(v2 != null || v3 != null) {
                int v5 = v2 == null || v3 == null || (v6.isTransitionRequired(((TransitionValues)v2), ((TransitionValues)v3))) ? 1 : 0;
                if(v5 != 0) {
                    Animator v5_1 = v6.createAnimator(v7, ((TransitionValues)v2), ((TransitionValues)v3));
                    if(v5_1 == null) {
                        goto label_25;
                    }

                    if(v3 != null) {
                        v15 = ((TransitionValues)v3).view;
                        String[] v4 = this.getTransitionProperties();
                        if(v15 == null || v4 == null || v4.length <= 0) {
                            v16 = v10;
                            v18 = v12;
                            v5_1 = v5_1;
                            v11 = null;
                        }
                        else {
                            v11 = new TransitionValues();
                            v11.view = v15;
                            Animator v17 = v5_1;
                            v16 = v10;
                            Object v5_2 = arg23.mViewValues.get(v15);
                            if(v5_2 != null) {
                                v10 = 0;
                                while(v10 < v4.length) {
                                    v11.values.put(v4[v10], ((TransitionValues)v5_2).values.get(v4[v10]));
                                    ++v10;
                                    v12 = v12;
                                    v5_2 = v5_2;
                                }
                            }

                            v18 = v12;
                            int v4_1 = v8.size();
                            for(v5 = 0; v5 < v4_1; ++v5) {
                                Object v10_1 = v8.get(v8.keyAt(v5));
                                if(((AnimationInfo)v10_1).mValues != null && ((AnimationInfo)v10_1).mView == v15 && (((AnimationInfo)v10_1).mName.equals(this.getName())) && (((AnimationInfo)v10_1).mValues.equals(v11))) {
                                    v5_1 = null;
                                    goto label_99;
                                }
                            }

                            v5_1 = v17;
                        }

                    label_99:
                        v10_2 = v5_1;
                        v5_3 = v11;
                    }
                    else {
                        v16 = v10;
                        v18 = v12;
                        v15 = ((TransitionValues)v2).view;
                        v10_2 = v5_1;
                        v5_3 = null;
                    }

                    if(v10_2 == null) {
                        goto label_132;
                    }

                    if(v6.mPropagation != null) {
                        long v2_1 = v6.mPropagation.getStartDelay(v7, v6, ((TransitionValues)v2), ((TransitionValues)v3));
                        v9.put(v6.mAnimators.size(), ((int)v2_1));
                        v0 = Math.min(v2_1, v0);
                    }

                    v8.put(v10_2, new AnimationInfo(v15, this.getName(), this, ViewUtils.getWindowId(((View)arg21)), v5_3));
                    v6.mAnimators.add(v10_2);
                    v0 = v0;
                    goto label_132;
                }

            label_25:
                v16 = v10;
                v18 = v12;
            }
            else {
                goto label_25;
            }

        label_132:
            v12 = v18 + 1;
            v10 = v16;
        }

        if(v0 != 0) {
            int v2_2;
            for(v2_2 = 0; v2_2 < v9.size(); ++v2_2) {
                v3 = v6.mAnimators.get(v9.keyAt(v2_2));
                ((Animator)v3).setStartDelay((((long)v9.valueAt(v2_2))) - v0 + ((Animator)v3).getStartDelay());
            }
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) protected void end() {
        Object v3_1;
        --this.mNumInstances;
        if(this.mNumInstances == 0) {
            if(this.mListeners != null && this.mListeners.size() > 0) {
                Object v0 = this.mListeners.clone();
                int v3 = ((ArrayList)v0).size();
                int v4;
                for(v4 = 0; v4 < v3; ++v4) {
                    ((ArrayList)v0).get(v4).onTransitionEnd(this);
                }
            }

            int v0_1;
            for(v0_1 = 0; v0_1 < this.mStartValues.mItemIdValues.size(); ++v0_1) {
                v3_1 = this.mStartValues.mItemIdValues.valueAt(v0_1);
                if(v3_1 != null) {
                    ViewCompat.setHasTransientState(((View)v3_1), false);
                }
            }

            for(v0_1 = 0; v0_1 < this.mEndValues.mItemIdValues.size(); ++v0_1) {
                v3_1 = this.mEndValues.mItemIdValues.valueAt(v0_1);
                if(v3_1 != null) {
                    ViewCompat.setHasTransientState(((View)v3_1), false);
                }
            }

            this.mEnded = true;
        }
    }

    @NonNull public Transition excludeChildren(@IdRes int arg2, boolean arg3) {
        this.mTargetIdChildExcludes = this.excludeId(this.mTargetIdChildExcludes, arg2, arg3);
        return this;
    }

    @NonNull public Transition excludeChildren(@NonNull View arg2, boolean arg3) {
        this.mTargetChildExcludes = this.excludeView(this.mTargetChildExcludes, arg2, arg3);
        return this;
    }

    @NonNull public Transition excludeChildren(@NonNull Class arg2, boolean arg3) {
        this.mTargetTypeChildExcludes = this.excludeType(this.mTargetTypeChildExcludes, arg2, arg3);
        return this;
    }

    private ArrayList excludeId(ArrayList arg1, int arg2, boolean arg3) {
        if(arg2 > 0) {
            arg1 = arg3 ? ArrayListManager.add(arg1, Integer.valueOf(arg2)) : ArrayListManager.remove(arg1, Integer.valueOf(arg2));
        }

        return arg1;
    }

    private static ArrayList excludeObject(ArrayList arg0, Object arg1, boolean arg2) {
        if(arg1 != null) {
            arg0 = arg2 ? ArrayListManager.add(arg0, arg1) : ArrayListManager.remove(arg0, arg1);
        }

        return arg0;
    }

    @NonNull public Transition excludeTarget(@IdRes int arg2, boolean arg3) {
        this.mTargetIdExcludes = this.excludeId(this.mTargetIdExcludes, arg2, arg3);
        return this;
    }

    @NonNull public Transition excludeTarget(@NonNull View arg2, boolean arg3) {
        this.mTargetExcludes = this.excludeView(this.mTargetExcludes, arg2, arg3);
        return this;
    }

    @NonNull public Transition excludeTarget(@NonNull Class arg2, boolean arg3) {
        this.mTargetTypeExcludes = this.excludeType(this.mTargetTypeExcludes, arg2, arg3);
        return this;
    }

    @NonNull public Transition excludeTarget(@NonNull String arg2, boolean arg3) {
        this.mTargetNameExcludes = Transition.excludeObject(this.mTargetNameExcludes, arg2, arg3);
        return this;
    }

    private ArrayList excludeType(ArrayList arg1, Class arg2, boolean arg3) {
        if(arg2 != null) {
            arg1 = arg3 ? ArrayListManager.add(arg1, arg2) : ArrayListManager.remove(arg1, arg2);
        }

        return arg1;
    }

    private ArrayList excludeView(ArrayList arg1, View arg2, boolean arg3) {
        if(arg2 != null) {
            arg1 = arg3 ? ArrayListManager.add(arg1, arg2) : ArrayListManager.remove(arg1, arg2);
        }

        return arg1;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) void forceToEnd(ViewGroup arg5) {
        ArrayMap v0 = Transition.getRunningAnimators();
        int v1 = v0.size();
        if(arg5 != null) {
            WindowIdImpl v5 = ViewUtils.getWindowId(((View)arg5));
            --v1;
            while(v1 >= 0) {
                Object v2 = v0.valueAt(v1);
                if(((AnimationInfo)v2).mView != null && v5 != null && (v5.equals(((AnimationInfo)v2).mWindowId))) {
                    v0.keyAt(v1).end();
                }

                --v1;
            }
        }
    }

    public long getDuration() {
        return this.mDuration;
    }

    @Nullable public Rect getEpicenter() {
        if(this.mEpicenterCallback == null) {
            return null;
        }

        return this.mEpicenterCallback.onGetEpicenter(this);
    }

    @Nullable public EpicenterCallback getEpicenterCallback() {
        return this.mEpicenterCallback;
    }

    @Nullable public TimeInterpolator getInterpolator() {
        return this.mInterpolator;
    }

    TransitionValues getMatchedTransitionValues(View arg7, boolean arg8) {
        Object v1_1;
        if(this.mParent != null) {
            return this.mParent.getMatchedTransitionValues(arg7, arg8);
        }

        ArrayList v0 = arg8 ? this.mStartValuesList : this.mEndValuesList;
        TransitionValues v1 = null;
        if(v0 == null) {
            return v1;
        }

        int v2 = v0.size();
        int v3 = -1;
        int v4 = 0;
        while(v4 < v2) {
            Object v5 = v0.get(v4);
            if(v5 == null) {
                return v1;
            }
            else if(((TransitionValues)v5).view == arg7) {
                v3 = v4;
            }
            else {
                ++v4;
                continue;
            }

            break;
        }

        if(v3 >= 0) {
            ArrayList v7 = arg8 ? this.mEndValuesList : this.mStartValuesList;
            v1_1 = v7.get(v3);
        }

        return ((TransitionValues)v1_1);
    }

    @NonNull public String getName() {
        return this.mName;
    }

    @NonNull public PathMotion getPathMotion() {
        return this.mPathMotion;
    }

    @Nullable public TransitionPropagation getPropagation() {
        return this.mPropagation;
    }

    private static ArrayMap getRunningAnimators() {
        Object v0 = Transition.sRunningAnimators.get();
        if(v0 == null) {
            ArrayMap v0_1 = new ArrayMap();
            Transition.sRunningAnimators.set(v0_1);
        }

        return ((ArrayMap)v0);
    }

    public long getStartDelay() {
        return this.mStartDelay;
    }

    @NonNull public List getTargetIds() {
        return this.mTargetIds;
    }

    @Nullable public List getTargetNames() {
        return this.mTargetNames;
    }

    @Nullable public List getTargetTypes() {
        return this.mTargetTypes;
    }

    @NonNull public List getTargets() {
        return this.mTargets;
    }

    @Nullable public String[] getTransitionProperties() {
        return null;
    }

    @Nullable public TransitionValues getTransitionValues(@NonNull View arg2, boolean arg3) {
        if(this.mParent != null) {
            return this.mParent.getTransitionValues(arg2, arg3);
        }

        TransitionValuesMaps v3 = arg3 ? this.mStartValues : this.mEndValues;
        return v3.mViewValues.get(arg2);
    }

    public boolean isTransitionRequired(@Nullable TransitionValues arg7, @Nullable TransitionValues arg8) {
        boolean v0 = false;
        if(arg7 != null && arg8 != null) {
            String[] v2 = this.getTransitionProperties();
            if(v2 != null) {
                int v3 = v2.length;
                int v4 = 0;
                while(true) {
                    if(v4 >= v3) {
                        return v0;
                    }
                    else if(Transition.isValueChanged(arg7, arg8, v2[v4])) {
                    }
                    else {
                        ++v4;
                        continue;
                    }

                    break;
                }
            }
            else {
                Iterator v2_1 = arg7.values.keySet().iterator();
                do {
                    if(!v2_1.hasNext()) {
                        return v0;
                    }
                    else if(!Transition.isValueChanged(arg7, arg8, v2_1.next())) {
                        continue;
                    }

                    break;
                }
                while(true);
            }

            v0 = true;
        }

        return v0;
    }

    private static boolean isValidMatch(int arg2) {
        boolean v0 = true;
        if(arg2 < 1 || arg2 > 4) {
            v0 = false;
        }
        else {
        }

        return v0;
    }

    boolean isValidTarget(View arg6) {
        int v0 = arg6.getId();
        if(this.mTargetIdExcludes != null && (this.mTargetIdExcludes.contains(Integer.valueOf(v0)))) {
            return 0;
        }

        if(this.mTargetExcludes != null && (this.mTargetExcludes.contains(arg6))) {
            return 0;
        }

        if(this.mTargetTypeExcludes != null) {
            int v1 = this.mTargetTypeExcludes.size();
            int v3 = 0;
            while(v3 < v1) {
                if(this.mTargetTypeExcludes.get(v3).isInstance(arg6)) {
                    return 0;
                }
                else {
                    ++v3;
                    continue;
                }

                break;
            }
        }

        if(this.mTargetNameExcludes != null && ViewCompat.getTransitionName(arg6) != null && (this.mTargetNameExcludes.contains(ViewCompat.getTransitionName(arg6)))) {
            return 0;
        }

        if(this.mTargetIds.size() == 0 && this.mTargets.size() == 0 && (this.mTargetTypes == null || (this.mTargetTypes.isEmpty())) && (this.mTargetNames == null || (this.mTargetNames.isEmpty()))) {
            return 1;
        }

        if(!this.mTargetIds.contains(Integer.valueOf(v0))) {
            if(this.mTargets.contains(arg6)) {
            }
            else {
                if(this.mTargetNames != null && (this.mTargetNames.contains(ViewCompat.getTransitionName(arg6)))) {
                    return 1;
                }

                if(this.mTargetTypes != null) {
                    v0 = 0;
                    while(v0 < this.mTargetTypes.size()) {
                        if(this.mTargetTypes.get(v0).isInstance(arg6)) {
                            return 1;
                        }
                        else {
                            ++v0;
                            continue;
                        }

                        return 0;
                    }
                }

                return 0;
            }
        }

        return 1;
    }

    private static boolean isValueChanged(TransitionValues arg0, TransitionValues arg1, String arg2) {
        int v2_1;
        Object v0 = arg0.values.get(arg2);
        Object v1 = arg1.values.get(arg2);
        boolean v2 = true;
        if(v0 == null && v1 == null) {
            v2 = false;
        }
        else if(v0 != null) {
            if(v1 == null) {
            }
            else {
                v2_1 = 1 ^ v0.equals(v1);
            }
        }

        return ((boolean)v2_1);
    }

    private void matchIds(ArrayMap arg8, ArrayMap arg9, SparseArray arg10, SparseArray arg11) {
        int v0 = arg10.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            Object v2 = arg10.valueAt(v1);
            if(v2 != null && (this.isValidTarget(((View)v2)))) {
                Object v3 = arg11.get(arg10.keyAt(v1));
                if(v3 != null && (this.isValidTarget(((View)v3)))) {
                    Object v4 = arg8.get(v2);
                    Object v5 = arg9.get(v3);
                    if(v4 != null && v5 != null) {
                        this.mStartValuesList.add(v4);
                        this.mEndValuesList.add(v5);
                        arg8.remove(v2);
                        arg9.remove(v3);
                    }
                }
            }
        }
    }

    private void matchInstances(ArrayMap arg5, ArrayMap arg6) {
        int v0;
        for(v0 = arg5.size() - 1; v0 >= 0; --v0) {
            Object v1 = arg5.keyAt(v0);
            if(v1 != null && (this.isValidTarget(((View)v1)))) {
                v1 = arg6.remove(v1);
                if(v1 != null && ((TransitionValues)v1).view != null && (this.isValidTarget(((TransitionValues)v1).view))) {
                    this.mStartValuesList.add(arg5.removeAt(v0));
                    this.mEndValuesList.add(v1);
                }
            }
        }
    }

    private void matchItemIds(ArrayMap arg8, ArrayMap arg9, LongSparseArray arg10, LongSparseArray arg11) {
        int v0 = arg10.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            Object v2 = arg10.valueAt(v1);
            if(v2 != null && (this.isValidTarget(((View)v2)))) {
                Object v3 = arg11.get(arg10.keyAt(v1));
                if(v3 != null && (this.isValidTarget(((View)v3)))) {
                    Object v4 = arg8.get(v2);
                    Object v5 = arg9.get(v3);
                    if(v4 != null && v5 != null) {
                        this.mStartValuesList.add(v4);
                        this.mEndValuesList.add(v5);
                        arg8.remove(v2);
                        arg9.remove(v3);
                    }
                }
            }
        }
    }

    private void matchNames(ArrayMap arg8, ArrayMap arg9, ArrayMap arg10, ArrayMap arg11) {
        int v0 = arg10.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            Object v2 = arg10.valueAt(v1);
            if(v2 != null && (this.isValidTarget(((View)v2)))) {
                Object v3 = arg11.get(arg10.keyAt(v1));
                if(v3 != null && (this.isValidTarget(((View)v3)))) {
                    Object v4 = arg8.get(v2);
                    Object v5 = arg9.get(v3);
                    if(v4 != null && v5 != null) {
                        this.mStartValuesList.add(v4);
                        this.mEndValuesList.add(v5);
                        arg8.remove(v2);
                        arg9.remove(v3);
                    }
                }
            }
        }
    }

    private void matchStartAndEnd(TransitionValuesMaps arg6, TransitionValuesMaps arg7) {
        ArrayMap v0 = new ArrayMap(arg6.mViewValues);
        ArrayMap v1 = new ArrayMap(arg7.mViewValues);
        int v2;
        for(v2 = 0; v2 < this.mMatchOrder.length; ++v2) {
            switch(this.mMatchOrder[v2]) {
                case 1: {
                    this.matchInstances(v0, v1);
                    break;
                }
                case 2: {
                    this.matchNames(v0, v1, arg6.mNameValues, arg7.mNameValues);
                    break;
                }
                case 3: {
                    this.matchIds(v0, v1, arg6.mIdValues, arg7.mIdValues);
                    break;
                }
                case 4: {
                    this.matchItemIds(v0, v1, arg6.mItemIdValues, arg7.mItemIdValues);
                    break;
                }
                default: {
                    break;
                }
            }
        }

        this.addUnmatched(v0, v1);
    }

    private static int[] parseMatchOrder(String arg6) {
        String v3;
        StringTokenizer v0 = new StringTokenizer(arg6, ",");
        int[] v6 = new int[v0.countTokens()];
        int v2;
        for(v2 = 0; true; ++v2) {
            if(!v0.hasMoreTokens()) {
                return v6;
            }

            v3 = v0.nextToken().trim();
            if("id".equalsIgnoreCase(v3)) {
                v6[v2] = 3;
            }
            else if("instance".equalsIgnoreCase(v3)) {
                v6[v2] = 1;
            }
            else if("name".equalsIgnoreCase(v3)) {
                v6[v2] = 2;
            }
            else if("itemId".equalsIgnoreCase(v3)) {
                v6[v2] = 4;
            }
            else if(v3.isEmpty()) {
                int[] v3_1 = new int[v6.length - 1];
                System.arraycopy(v6, 0, v3_1, 0, v2);
                --v2;
                v6 = v3_1;
            }
            else {
                break;
            }
        }

        StringBuilder v0_1 = new StringBuilder();
        v0_1.append("Unknown match type in matchOrder: \'");
        v0_1.append(v3);
        v0_1.append("\'");
        throw new InflateException(v0_1.toString());
        return v6;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void pause(View arg6) {
        if(!this.mEnded) {
            ArrayMap v0 = Transition.getRunningAnimators();
            int v1 = v0.size();
            WindowIdImpl v6 = ViewUtils.getWindowId(arg6);
            --v1;
            while(v1 >= 0) {
                Object v3 = v0.valueAt(v1);
                if(((AnimationInfo)v3).mView != null && (v6.equals(((AnimationInfo)v3).mWindowId))) {
                    AnimatorUtils.pause(v0.keyAt(v1));
                }

                --v1;
            }

            if(this.mListeners != null && this.mListeners.size() > 0) {
                Object v6_1 = this.mListeners.clone();
                int v0_1 = ((ArrayList)v6_1).size();
                for(v1 = 0; v1 < v0_1; ++v1) {
                    ((ArrayList)v6_1).get(v1).onTransitionPause(this);
                }
            }

            this.mPaused = true;
        }
    }

    void playTransition(ViewGroup arg11) {
        int v5_1;
        this.mStartValuesList = new ArrayList();
        this.mEndValuesList = new ArrayList();
        this.matchStartAndEnd(this.mStartValues, this.mEndValues);
        ArrayMap v0 = Transition.getRunningAnimators();
        int v1 = v0.size();
        WindowIdImpl v2 = ViewUtils.getWindowId(((View)arg11));
        --v1;
        while(v1 >= 0) {
            Object v4 = v0.keyAt(v1);
            if(v4 != null) {
                Object v5 = v0.get(v4);
                if(v5 != null && ((AnimationInfo)v5).mView != null && (v2.equals(((AnimationInfo)v5).mWindowId))) {
                    TransitionValues v6 = ((AnimationInfo)v5).mValues;
                    View v7 = ((AnimationInfo)v5).mView;
                    TransitionValues v8 = this.getTransitionValues(v7, true);
                    TransitionValues v7_1 = this.getMatchedTransitionValues(v7, true);
                    if(v8 == null && v7_1 == null) {
                        goto label_35;
                    }
                    else if(((AnimationInfo)v5).mTransition.isTransitionRequired(v6, v7_1)) {
                        v5_1 = 1;
                    }
                    else {
                    label_35:
                        v5_1 = 0;
                    }

                    if(v5_1 == 0) {
                        goto label_45;
                    }

                    if(!((Animator)v4).isRunning()) {
                        if(((Animator)v4).isStarted()) {
                        }
                        else {
                            v0.remove(v4);
                            goto label_45;
                        }
                    }

                    ((Animator)v4).cancel();
                }
            }

        label_45:
            --v1;
        }

        this.createAnimators(arg11, this.mStartValues, this.mEndValues, this.mStartValuesList, this.mEndValuesList);
        this.runAnimators();
    }

    @NonNull public Transition removeListener(@NonNull TransitionListener arg2) {
        if(this.mListeners == null) {
            return this;
        }

        this.mListeners.remove(arg2);
        if(this.mListeners.size() == 0) {
            this.mListeners = null;
        }

        return this;
    }

    @NonNull public Transition removeTarget(@IdRes int arg2) {
        if(arg2 != 0) {
            this.mTargetIds.remove(Integer.valueOf(arg2));
        }

        return this;
    }

    @NonNull public Transition removeTarget(@NonNull View arg2) {
        this.mTargets.remove(arg2);
        return this;
    }

    @NonNull public Transition removeTarget(@NonNull Class arg2) {
        if(this.mTargetTypes != null) {
            this.mTargetTypes.remove(arg2);
        }

        return this;
    }

    @NonNull public Transition removeTarget(@NonNull String arg2) {
        if(this.mTargetNames != null) {
            this.mTargetNames.remove(arg2);
        }

        return this;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void resume(View arg6) {
        if(this.mPaused) {
            if(!this.mEnded) {
                ArrayMap v0 = Transition.getRunningAnimators();
                int v2 = v0.size();
                WindowIdImpl v6 = ViewUtils.getWindowId(arg6);
                --v2;
                while(v2 >= 0) {
                    Object v3 = v0.valueAt(v2);
                    if(((AnimationInfo)v3).mView != null && (v6.equals(((AnimationInfo)v3).mWindowId))) {
                        AnimatorUtils.resume(v0.keyAt(v2));
                    }

                    --v2;
                }

                if(this.mListeners == null) {
                    goto label_34;
                }

                if(this.mListeners.size() <= 0) {
                    goto label_34;
                }

                Object v6_1 = this.mListeners.clone();
                int v0_1 = ((ArrayList)v6_1).size();
                for(v2 = 0; v2 < v0_1; ++v2) {
                    ((ArrayList)v6_1).get(v2).onTransitionResume(this);
                }
            }

        label_34:
            this.mPaused = false;
        }
    }

    private void runAnimator(Animator arg2, ArrayMap arg3) {
        if(arg2 != null) {
            arg2.addListener(new AnimatorListenerAdapter(arg3) {
                public void onAnimationEnd(Animator arg2) {
                    this.val$runningAnimators.remove(arg2);
                    Transition.this.mCurrentAnimators.remove(arg2);
                }

                public void onAnimationStart(Animator arg2) {
                    Transition.this.mCurrentAnimators.add(arg2);
                }
            });
            this.animate(arg2);
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) protected void runAnimators() {
        this.start();
        ArrayMap v0 = Transition.getRunningAnimators();
        Iterator v1 = this.mAnimators.iterator();
        while(v1.hasNext()) {
            Object v2 = v1.next();
            if(!v0.containsKey(v2)) {
                continue;
            }

            this.start();
            this.runAnimator(((Animator)v2), v0);
        }

        this.mAnimators.clear();
        this.end();
    }

    void setCanRemoveViews(boolean arg1) {
        this.mCanRemoveViews = arg1;
    }

    @NonNull public Transition setDuration(long arg1) {
        this.mDuration = arg1;
        return this;
    }

    public void setEpicenterCallback(@Nullable EpicenterCallback arg1) {
        this.mEpicenterCallback = arg1;
    }

    @NonNull public Transition setInterpolator(@Nullable TimeInterpolator arg1) {
        this.mInterpolator = arg1;
        return this;
    }

    public void setMatchOrder(int[] arg3) {
        if(arg3 == null || arg3.length == 0) {
            this.mMatchOrder = Transition.DEFAULT_MATCH_ORDER;
        }
        else {
            int v0 = 0;
            while(true) {
                if(v0 >= arg3.length) {
                    goto label_22;
                }
                else if(!Transition.isValidMatch(arg3[v0])) {
                    goto label_18;
                }
                else if(!Transition.alreadyContains(arg3, v0)) {
                    ++v0;
                    continue;
                }
                else {
                    break;
                }
            }

            throw new IllegalArgumentException("matches contains a duplicate value");
        label_18:
            throw new IllegalArgumentException("matches contains invalid value");
        label_22:
            this.mMatchOrder = arg3.clone();
        }
    }

    public void setPathMotion(@Nullable PathMotion arg1) {
        this.mPathMotion = arg1 == null ? Transition.STRAIGHT_PATH_MOTION : arg1;
    }

    public void setPropagation(@Nullable TransitionPropagation arg1) {
        this.mPropagation = arg1;
    }

    Transition setSceneRoot(ViewGroup arg1) {
        this.mSceneRoot = arg1;
        return this;
    }

    @NonNull public Transition setStartDelay(long arg1) {
        this.mStartDelay = arg1;
        return this;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) protected void start() {
        if(this.mNumInstances == 0) {
            if(this.mListeners != null && this.mListeners.size() > 0) {
                Object v0 = this.mListeners.clone();
                int v2 = ((ArrayList)v0).size();
                int v3;
                for(v3 = 0; v3 < v2; ++v3) {
                    ((ArrayList)v0).get(v3).onTransitionStart(this);
                }
            }

            this.mEnded = false;
        }

        ++this.mNumInstances;
    }

    public String toString() {
        return this.toString("");
    }

    String toString(String arg7) {
        arg7 = arg7 + this.getClass().getSimpleName() + "@" + Integer.toHexString(this.hashCode()) + ": ";
        long v2 = -1;
        if(this.mDuration != v2) {
            arg7 = arg7 + "dur(" + this.mDuration + ") ";
        }

        if(this.mStartDelay != v2) {
            arg7 = arg7 + "dly(" + this.mStartDelay + ") ";
        }

        if(this.mInterpolator != null) {
            arg7 = arg7 + "interp(" + this.mInterpolator + ") ";
        }

        if(this.mTargetIds.size() > 0 || this.mTargets.size() > 0) {
            arg7 = arg7 + "tgts(";
            int v1 = 0;
            if(this.mTargetIds.size() > 0) {
                String v0_1 = arg7;
                int v7;
                for(v7 = 0; v7 < this.mTargetIds.size(); ++v7) {
                    if(v7 > 0) {
                        v0_1 = v0_1 + ", ";
                    }

                    v0_1 = v0_1 + this.mTargetIds.get(v7);
                }

                arg7 = v0_1;
            }

            if(this.mTargets.size() > 0) {
                while(v1 < this.mTargets.size()) {
                    if(v1 > 0) {
                        arg7 = arg7 + ", ";
                    }

                    arg7 = arg7 + this.mTargets.get(v1);
                    ++v1;
                }
            }

            arg7 = arg7 + ")";
        }

        return arg7;
    }
}

