package androidx.fragment.app;

import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources$NotFoundException;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater$Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArraySet;
import androidx.core.util.DebugUtils;
import androidx.core.util.LogWriter;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class FragmentManagerImpl extends FragmentManager implements LayoutInflater$Factory2 {
    class androidx.fragment.app.FragmentManagerImpl$1 implements Runnable {
        androidx.fragment.app.FragmentManagerImpl$1(FragmentManagerImpl arg1) {
            FragmentManagerImpl.this = arg1;
            super();
        }

        public void run() {
            FragmentManagerImpl.this.execPendingActions();
        }
    }

    class AnimateOnHWLayerIfNeededListener extends AnimationListenerWrapper {
        View mView;

        AnimateOnHWLayerIfNeededListener(View arg1, Animation$AnimationListener arg2) {
            super(arg2);
            this.mView = arg1;
        }

        @CallSuper public void onAnimationEnd(Animation arg4) {
            if((ViewCompat.isAttachedToWindow(this.mView)) || Build$VERSION.SDK_INT >= 24) {
                this.mView.post(new Runnable() {
                    public void run() {
                        AnimateOnHWLayerIfNeededListener.this.mView.setLayerType(0, null);
                    }
                });
            }
            else {
                this.mView.setLayerType(0, null);
            }

            super.onAnimationEnd(arg4);
        }
    }

    class AnimationListenerWrapper implements Animation$AnimationListener {
        private final Animation$AnimationListener mWrapped;

        AnimationListenerWrapper(Animation$AnimationListener arg1) {
            super();
            this.mWrapped = arg1;
        }

        @CallSuper public void onAnimationEnd(Animation arg2) {
            if(this.mWrapped != null) {
                this.mWrapped.onAnimationEnd(arg2);
            }
        }

        @CallSuper public void onAnimationRepeat(Animation arg2) {
            if(this.mWrapped != null) {
                this.mWrapped.onAnimationRepeat(arg2);
            }
        }

        @CallSuper public void onAnimationStart(Animation arg2) {
            if(this.mWrapped != null) {
                this.mWrapped.onAnimationStart(arg2);
            }
        }
    }

    class AnimationOrAnimator {
        public final Animation animation;
        public final Animator animator;

        AnimationOrAnimator(Animation arg2) {
            super();
            this.animation = arg2;
            this.animator = null;
            if(arg2 != null) {
                return;
            }

            throw new IllegalStateException("Animation cannot be null");
        }

        AnimationOrAnimator(Animator arg2) {
            super();
            this.animation = null;
            this.animator = arg2;
            if(arg2 != null) {
                return;
            }

            throw new IllegalStateException("Animator cannot be null");
        }
    }

    class AnimatorOnHWLayerIfNeededListener extends AnimatorListenerAdapter {
        View mView;

        AnimatorOnHWLayerIfNeededListener(View arg1) {
            super();
            this.mView = arg1;
        }

        public void onAnimationEnd(Animator arg4) {
            this.mView.setLayerType(0, null);
            arg4.removeListener(((Animator$AnimatorListener)this));
        }

        public void onAnimationStart(Animator arg3) {
            this.mView.setLayerType(2, null);
        }
    }

    class EndViewTransitionAnimator extends AnimationSet implements Runnable {
        private boolean mAnimating;
        private final View mChild;
        private boolean mEnded;
        private final ViewGroup mParent;
        private boolean mTransitionEnded;

        EndViewTransitionAnimator(@NonNull Animation arg2, @NonNull ViewGroup arg3, @NonNull View arg4) {
            super(false);
            this.mAnimating = true;
            this.mParent = arg3;
            this.mChild = arg4;
            this.addAnimation(arg2);
            this.mParent.post(((Runnable)this));
        }

        public boolean getTransformation(long arg3, Transformation arg5) {
            this.mAnimating = true;
            if(this.mEnded) {
                return this.mTransitionEnded ^ 1;
            }

            if(!super.getTransformation(arg3, arg5)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, ((Runnable)this));
            }

            return 1;
        }

        public boolean getTransformation(long arg3, Transformation arg5, float arg6) {
            this.mAnimating = true;
            if(this.mEnded) {
                return this.mTransitionEnded ^ 1;
            }

            if(!super.getTransformation(arg3, arg5, arg6)) {
                this.mEnded = true;
                OneShotPreDrawListener.add(this.mParent, ((Runnable)this));
            }

            return 1;
        }

        public void run() {
            if((this.mEnded) || !this.mAnimating) {
                this.mParent.endViewTransition(this.mChild);
                this.mTransitionEnded = true;
            }
            else {
                this.mAnimating = false;
                this.mParent.post(((Runnable)this));
            }
        }
    }

    final class FragmentLifecycleCallbacksHolder {
        final FragmentLifecycleCallbacks mCallback;
        final boolean mRecursive;

        FragmentLifecycleCallbacksHolder(FragmentLifecycleCallbacks arg1, boolean arg2) {
            super();
            this.mCallback = arg1;
            this.mRecursive = arg2;
        }
    }

    class FragmentTag {
        public static final int[] Fragment = null;
        public static final int Fragment_id = 1;
        public static final int Fragment_name = 0;
        public static final int Fragment_tag = 2;

        static {
            FragmentTag.Fragment = new int[]{0x1010003, 0x10100D0, 0x10100D1};
        }

        private FragmentTag() {
            super();
        }
    }

    interface OpGenerator {
        boolean generateOps(ArrayList arg1, ArrayList arg2);
    }

    class PopBackStackState implements OpGenerator {
        final int mFlags;
        final int mId;
        final String mName;

        PopBackStackState(FragmentManagerImpl arg1, String arg2, int arg3, int arg4) {
            FragmentManagerImpl.this = arg1;
            super();
            this.mName = arg2;
            this.mId = arg3;
            this.mFlags = arg4;
        }

        public boolean generateOps(ArrayList arg7, ArrayList arg8) {
            if(FragmentManagerImpl.this.mPrimaryNav != null && this.mId < 0 && this.mName == null) {
                FragmentManager v0 = FragmentManagerImpl.this.mPrimaryNav.peekChildFragmentManager();
                if(v0 != null && (v0.popBackStackImmediate())) {
                    return 0;
                }
            }

            return FragmentManagerImpl.this.popBackStackState(arg7, arg8, this.mName, this.mId, this.mFlags);
        }
    }

    class StartEnterTransitionListener implements OnStartEnterTransitionListener {
        final boolean mIsBack;
        private int mNumPostponed;
        final BackStackRecord mRecord;

        StartEnterTransitionListener(BackStackRecord arg1, boolean arg2) {
            super();
            this.mIsBack = arg2;
            this.mRecord = arg1;
        }

        public void cancelTransaction() {
            this.mRecord.mManager.completeExecute(this.mRecord, this.mIsBack, false, false);
        }

        public void completeTransaction() {
            int v1 = 0;
            int v0 = this.mNumPostponed > 0 ? 1 : 0;
            FragmentManagerImpl v3 = this.mRecord.mManager;
            int v4 = v3.mAdded.size();
            while(v1 < v4) {
                Object v5 = v3.mAdded.get(v1);
                ((Fragment)v5).setOnStartEnterTransitionListener(null);
                if(v0 != 0 && (((Fragment)v5).isPostponed())) {
                    ((Fragment)v5).startPostponedEnterTransition();
                }

                ++v1;
            }

            this.mRecord.mManager.completeExecute(this.mRecord, this.mIsBack, v0 ^ 1, true);
        }

        public boolean isReady() {
            boolean v0 = this.mNumPostponed == 0 ? true : false;
            return v0;
        }

        public void onStartEnterTransition() {
            --this.mNumPostponed;
            if(this.mNumPostponed != 0) {
                return;
            }

            this.mRecord.mManager.scheduleCommit();
        }

        public void startListening() {
            ++this.mNumPostponed;
        }
    }

    static final Interpolator ACCELERATE_CUBIC = null;
    static final Interpolator ACCELERATE_QUINT = null;
    static final int ANIM_DUR = 220;
    public static final int ANIM_STYLE_CLOSE_ENTER = 3;
    public static final int ANIM_STYLE_CLOSE_EXIT = 4;
    public static final int ANIM_STYLE_FADE_ENTER = 5;
    public static final int ANIM_STYLE_FADE_EXIT = 6;
    public static final int ANIM_STYLE_OPEN_ENTER = 1;
    public static final int ANIM_STYLE_OPEN_EXIT = 2;
    static boolean DEBUG = false;
    static final Interpolator DECELERATE_CUBIC = null;
    static final Interpolator DECELERATE_QUINT = null;
    static final String TAG = "FragmentManager";
    static final String TARGET_REQUEST_CODE_STATE_TAG = "android:target_req_state";
    static final String TARGET_STATE_TAG = "android:target_state";
    static final String USER_VISIBLE_HINT_TAG = "android:user_visible_hint";
    static final String VIEW_STATE_TAG = "android:view_state";
    SparseArray mActive;
    final ArrayList mAdded;
    ArrayList mAvailBackStackIndices;
    ArrayList mBackStack;
    ArrayList mBackStackChangeListeners;
    ArrayList mBackStackIndices;
    FragmentContainer mContainer;
    ArrayList mCreatedMenus;
    int mCurState;
    boolean mDestroyed;
    Runnable mExecCommit;
    boolean mExecutingActions;
    boolean mHavePendingDeferredStart;
    FragmentHostCallback mHost;
    private final CopyOnWriteArrayList mLifecycleCallbacks;
    boolean mNeedMenuInvalidate;
    int mNextFragmentIndex;
    String mNoTransactionsBecause;
    Fragment mParent;
    ArrayList mPendingActions;
    ArrayList mPostponedTransactions;
    @Nullable Fragment mPrimaryNav;
    FragmentManagerNonConfig mSavedNonConfig;
    SparseArray mStateArray;
    Bundle mStateBundle;
    boolean mStateSaved;
    boolean mStopped;
    ArrayList mTmpAddedFragments;
    ArrayList mTmpIsPop;
    ArrayList mTmpRecords;
    static Field sAnimationListenerField;

    static {
        FragmentManagerImpl.DECELERATE_QUINT = new DecelerateInterpolator(2.5f);
        FragmentManagerImpl.DECELERATE_CUBIC = new DecelerateInterpolator(1.5f);
        FragmentManagerImpl.ACCELERATE_QUINT = new AccelerateInterpolator(2.5f);
        FragmentManagerImpl.ACCELERATE_CUBIC = new AccelerateInterpolator(1.5f);
    }

    FragmentManagerImpl() {
        super();
        this.mNextFragmentIndex = 0;
        this.mAdded = new ArrayList();
        this.mLifecycleCallbacks = new CopyOnWriteArrayList();
        this.mCurState = 0;
        this.mStateBundle = null;
        this.mStateArray = null;
        this.mExecCommit = new androidx.fragment.app.FragmentManagerImpl$1(this);
    }

    private void addAddedFragments(ArraySet arg11) {
        if(this.mCurState < 1) {
            return;
        }

        int v0 = Math.min(this.mCurState, 3);
        int v1 = this.mAdded.size();
        int v8;
        for(v8 = 0; v8 < v1; ++v8) {
            Object v9 = this.mAdded.get(v8);
            if(((Fragment)v9).mState < v0) {
                this.moveToState(v9, v0, ((Fragment)v9).getNextAnim(), ((Fragment)v9).getNextTransition(), false);
                if(((Fragment)v9).mView != null && !((Fragment)v9).mHidden && (((Fragment)v9).mIsNewlyAdded)) {
                    arg11.add(v9);
                }
            }
        }
    }

    void addBackStackState(BackStackRecord arg2) {
        if(this.mBackStack == null) {
            this.mBackStack = new ArrayList();
        }

        this.mBackStack.add(arg2);
    }

    public void addFragment(Fragment arg4, boolean arg5) {
        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "add: " + arg4);
        }

        this.makeActive(arg4);
        if(!arg4.mDetached) {
            if(!this.mAdded.contains(arg4)) {
                ArrayList v0 = this.mAdded;
                __monitor_enter(v0);
                try {
                    this.mAdded.add(arg4);
                    __monitor_exit(v0);
                }
                catch(Throwable v4) {
                    try {
                    label_37:
                        __monitor_exit(v0);
                    }
                    catch(Throwable v4) {
                        goto label_37;
                    }

                    throw v4;
                }

                arg4.mAdded = true;
                arg4.mRemoving = false;
                if(arg4.mView == null) {
                    arg4.mHiddenChanged = false;
                }

                if((arg4.mHasMenu) && (arg4.mMenuVisible)) {
                    this.mNeedMenuInvalidate = true;
                }

                if(!arg5) {
                    return;
                }

                this.moveToState(arg4);
            }
            else {
                StringBuilder v0_1 = new StringBuilder();
                v0_1.append("Fragment already added: ");
                v0_1.append(arg4);
                throw new IllegalStateException(v0_1.toString());
            }
        }
    }

    public void addOnBackStackChangedListener(OnBackStackChangedListener arg2) {
        if(this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new ArrayList();
        }

        this.mBackStackChangeListeners.add(arg2);
    }

    public int allocBackStackIndex(BackStackRecord arg5) {
        int v0;
        __monitor_enter(this);
        try {
            if(this.mAvailBackStackIndices != null) {
                if(this.mAvailBackStackIndices.size() <= 0) {
                }
                else {
                    v0 = this.mAvailBackStackIndices.remove(this.mAvailBackStackIndices.size() - 1).intValue();
                    if(FragmentManagerImpl.DEBUG) {
                        Log.v("FragmentManager", "Adding back stack index " + v0 + " with " + arg5);
                    }

                    this.mBackStackIndices.set(v0, arg5);
                    __monitor_exit(this);
                    return v0;
                }
            }

            if(this.mBackStackIndices == null) {
                this.mBackStackIndices = new ArrayList();
            }

            v0 = this.mBackStackIndices.size();
            if(FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "Setting back stack index " + v0 + " to " + arg5);
            }

            this.mBackStackIndices.add(arg5);
            __monitor_exit(this);
            return v0;
        label_55:
            __monitor_exit(this);
        }
        catch(Throwable v5) {
            goto label_55;
        }

        throw v5;
    }

    private void animateRemoveFragment(@NonNull Fragment arg5, @NonNull AnimationOrAnimator arg6, int arg7) {
        View v0 = arg5.mView;
        ViewGroup v1 = arg5.mContainer;
        v1.startViewTransition(v0);
        arg5.setStateAfterAnimating(arg7);
        if(arg6.animation != null) {
            EndViewTransitionAnimator v7 = new EndViewTransitionAnimator(arg6.animation, v1, v0);
            arg5.setAnimatingAway(arg5.mView);
            ((Animation)v7).setAnimationListener(new AnimationListenerWrapper(FragmentManagerImpl.getAnimationListener(((Animation)v7)), v1, arg5) {
                public void onAnimationEnd(Animation arg2) {
                    super.onAnimationEnd(arg2);
                    this.val$container.post(new Runnable() {
                        public void run() {
                            if(this.this$1.val$fragment.getAnimatingAway() != null) {
                                this.this$1.val$fragment.setAnimatingAway(null);
                                this.this$1.this$0.moveToState(this.this$1.val$fragment, this.this$1.val$fragment.getStateAfterAnimating(), 0, 0, false);
                            }
                        }
                    });
                }
            });
            FragmentManagerImpl.setHWLayerAnimListenerIfAlpha(v0, arg6);
            arg5.mView.startAnimation(((Animation)v7));
        }
        else {
            Animator v7_1 = arg6.animator;
            arg5.setAnimator(arg6.animator);
            v7_1.addListener(new AnimatorListenerAdapter(v1, v0, arg5) {
                public void onAnimationEnd(Animator arg7) {
                    this.val$container.endViewTransition(this.val$viewToAnimate);
                    arg7 = this.val$fragment.getAnimator();
                    this.val$fragment.setAnimator(null);
                    if(arg7 != null && this.val$container.indexOfChild(this.val$viewToAnimate) < 0) {
                        FragmentManagerImpl.this.moveToState(this.val$fragment, this.val$fragment.getStateAfterAnimating(), 0, 0, false);
                    }
                }
            });
            v7_1.setTarget(arg5.mView);
            FragmentManagerImpl.setHWLayerAnimListenerIfAlpha(arg5.mView, arg6);
            v7_1.start();
        }
    }

    public void attachController(FragmentHostCallback arg2, FragmentContainer arg3, Fragment arg4) {
        if(this.mHost == null) {
            this.mHost = arg2;
            this.mContainer = arg3;
            this.mParent = arg4;
            return;
        }

        throw new IllegalStateException("Already attached");
    }

    public void attachFragment(Fragment arg4) {
        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "attach: " + arg4);
        }

        if(arg4.mDetached) {
            arg4.mDetached = false;
            if(!arg4.mAdded) {
                if(!this.mAdded.contains(arg4)) {
                    if(FragmentManagerImpl.DEBUG) {
                        Log.v("FragmentManager", "add from attach: " + arg4);
                    }

                    ArrayList v0 = this.mAdded;
                    __monitor_enter(v0);
                    try {
                        this.mAdded.add(arg4);
                        __monitor_exit(v0);
                    }
                    catch(Throwable v4) {
                        try {
                        label_43:
                            __monitor_exit(v0);
                        }
                        catch(Throwable v4) {
                            goto label_43;
                        }

                        throw v4;
                    }

                    arg4.mAdded = true;
                    if(!arg4.mHasMenu) {
                        return;
                    }

                    if(!arg4.mMenuVisible) {
                        return;
                    }

                    this.mNeedMenuInvalidate = true;
                }
                else {
                    v1 = new StringBuilder();
                    v1.append("Fragment already added: ");
                    v1.append(arg4);
                    throw new IllegalStateException(v1.toString());
                }
            }
        }
    }

    public FragmentTransaction beginTransaction() {
        return new BackStackRecord(this);
    }

    private void burpActive() {
        if(this.mActive != null) {
            int v0;
            for(v0 = this.mActive.size() - 1; v0 >= 0; --v0) {
                if(this.mActive.valueAt(v0) == null) {
                    this.mActive.delete(this.mActive.keyAt(v0));
                }
            }
        }
    }

    private void checkStateLoss() {
        if(!this.isStateSaved()) {
            if(this.mNoTransactionsBecause == null) {
                return;
            }

            StringBuilder v1 = new StringBuilder();
            v1.append("Can not perform this action inside of ");
            v1.append(this.mNoTransactionsBecause);
            throw new IllegalStateException(v1.toString());
        }

        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    void completeExecute(BackStackRecord arg8, boolean arg9, boolean arg10, boolean arg11) {
        if(arg9) {
            arg8.executePopOps(arg11);
        }
        else {
            arg8.executeOps();
        }

        ArrayList v1 = new ArrayList(1);
        ArrayList v2 = new ArrayList(1);
        v1.add(arg8);
        v2.add(Boolean.valueOf(arg9));
        if(arg10) {
            FragmentTransition.startTransitions(this, v1, v2, 0, 1, true);
        }

        if(arg11) {
            this.moveToState(this.mCurState, true);
        }

        if(this.mActive != null) {
            int v9 = this.mActive.size();
            int v0;
            for(v0 = 0; v0 < v9; ++v0) {
                Object v1_1 = this.mActive.valueAt(v0);
                if(v1_1 != null && ((Fragment)v1_1).mView != null && (((Fragment)v1_1).mIsNewlyAdded) && (arg8.interactsWith(((Fragment)v1_1).mContainerId))) {
                    if(((Fragment)v1_1).mPostponedAlpha > 0f) {
                        ((Fragment)v1_1).mView.setAlpha(((Fragment)v1_1).mPostponedAlpha);
                    }

                    if(arg11) {
                        ((Fragment)v1_1).mPostponedAlpha = 0f;
                        goto label_50;
                    }

                    ((Fragment)v1_1).mPostponedAlpha = -1f;
                    ((Fragment)v1_1).mIsNewlyAdded = false;
                }

            label_50:
            }
        }
    }

    void completeShowHideFragment(Fragment arg8) {
        if(arg8.mView != null) {
            AnimationOrAnimator v0 = this.loadAnimation(arg8, arg8.getNextTransition(), arg8.mHidden ^ 1, arg8.getNextTransitionStyle());
            if(v0 != null && v0.animator != null) {
                v0.animator.setTarget(arg8.mView);
                if(!arg8.mHidden) {
                    arg8.mView.setVisibility(0);
                }
                else if(arg8.isHideReplaced()) {
                    arg8.setHideReplaced(false);
                }
                else {
                    ViewGroup v3 = arg8.mContainer;
                    View v4 = arg8.mView;
                    v3.startViewTransition(v4);
                    v0.animator.addListener(new AnimatorListenerAdapter(v3, v4, arg8) {
                        public void onAnimationEnd(Animator arg3) {
                            this.val$container.endViewTransition(this.val$animatingView);
                            arg3.removeListener(((Animator$AnimatorListener)this));
                            if(this.val$fragment.mView != null) {
                                this.val$fragment.mView.setVisibility(8);
                            }
                        }
                    });
                }

                FragmentManagerImpl.setHWLayerAnimListenerIfAlpha(arg8.mView, v0);
                v0.animator.start();
                goto label_56;
            }

            if(v0 != null) {
                FragmentManagerImpl.setHWLayerAnimListenerIfAlpha(arg8.mView, v0);
                arg8.mView.startAnimation(v0.animation);
                v0.animation.start();
            }

            int v0_1 = !arg8.mHidden || (arg8.isHideReplaced()) ? 0 : 8;
            arg8.mView.setVisibility(v0_1);
            if(!arg8.isHideReplaced()) {
                goto label_56;
            }

            arg8.setHideReplaced(false);
        }

    label_56:
        if((arg8.mAdded) && (arg8.mHasMenu) && (arg8.mMenuVisible)) {
            this.mNeedMenuInvalidate = true;
        }

        arg8.mHiddenChanged = false;
        arg8.onHiddenChanged(arg8.mHidden);
    }

    public void detachFragment(Fragment arg5) {
        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "detach: " + arg5);
        }

        if(!arg5.mDetached) {
            arg5.mDetached = true;
            if(arg5.mAdded) {
                if(FragmentManagerImpl.DEBUG) {
                    Log.v("FragmentManager", "remove from detach: " + arg5);
                }

                ArrayList v1_1 = this.mAdded;
                __monitor_enter(v1_1);
                try {
                    this.mAdded.remove(arg5);
                    __monitor_exit(v1_1);
                }
                catch(Throwable v5) {
                    try {
                    label_40:
                        __monitor_exit(v1_1);
                    }
                    catch(Throwable v5) {
                        goto label_40;
                    }

                    throw v5;
                }

                if((arg5.mHasMenu) && (arg5.mMenuVisible)) {
                    this.mNeedMenuInvalidate = true;
                }

                arg5.mAdded = false;
            }
        }
    }

    public void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.dispatchStateChange(2);
    }

    public void dispatchConfigurationChanged(Configuration arg3) {
        int v0;
        for(v0 = 0; v0 < this.mAdded.size(); ++v0) {
            Object v1 = this.mAdded.get(v0);
            if(v1 != null) {
                ((Fragment)v1).performConfigurationChanged(arg3);
            }
        }
    }

    public boolean dispatchContextItemSelected(MenuItem arg5) {
        if(this.mCurState < 1) {
            return 0;
        }

        int v0;
        for(v0 = 0; v0 < this.mAdded.size(); ++v0) {
            Object v3 = this.mAdded.get(v0);
            if(v3 != null && (((Fragment)v3).performContextItemSelected(arg5))) {
                return 1;
            }
        }

        return 0;
    }

    public void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.dispatchStateChange(1);
    }

    public boolean dispatchCreateOptionsMenu(Menu arg8, MenuInflater arg9) {
        int v1 = 0;
        if(this.mCurState < 1) {
            return 0;
        }

        ArrayList v3 = null;
        int v0 = 0;
        boolean v4 = false;
        while(v0 < this.mAdded.size()) {
            Object v5 = this.mAdded.get(v0);
            if(v5 != null && (((Fragment)v5).performCreateOptionsMenu(arg8, arg9))) {
                if(v3 == null) {
                    v3 = new ArrayList();
                }

                v3.add(v5);
                v4 = true;
            }

            ++v0;
        }

        if(this.mCreatedMenus != null) {
            while(v1 < this.mCreatedMenus.size()) {
                Object v8 = this.mCreatedMenus.get(v1);
                if(v3 == null || !v3.contains(v8)) {
                    ((Fragment)v8).onDestroyOptionsMenu();
                }

                ++v1;
            }
        }

        this.mCreatedMenus = v3;
        return v4;
    }

    public void dispatchDestroy() {
        this.mDestroyed = true;
        this.execPendingActions();
        this.dispatchStateChange(0);
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
    }

    public void dispatchDestroyView() {
        this.dispatchStateChange(1);
    }

    public void dispatchLowMemory() {
        int v0;
        for(v0 = 0; v0 < this.mAdded.size(); ++v0) {
            Object v1 = this.mAdded.get(v0);
            if(v1 != null) {
                ((Fragment)v1).performLowMemory();
            }
        }
    }

    public void dispatchMultiWindowModeChanged(boolean arg3) {
        int v0;
        for(v0 = this.mAdded.size() - 1; v0 >= 0; --v0) {
            Object v1 = this.mAdded.get(v0);
            if(v1 != null) {
                ((Fragment)v1).performMultiWindowModeChanged(arg3);
            }
        }
    }

    void dispatchOnFragmentActivityCreated(@NonNull Fragment arg4, @Nullable Bundle arg5, boolean arg6) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentActivityCreated(arg4, arg5, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg6) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentActivityCreated(((FragmentManager)this), arg4, arg5);
        }
    }

    void dispatchOnFragmentAttached(@NonNull Fragment arg4, @NonNull Context arg5, boolean arg6) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentAttached(arg4, arg5, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg6) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentAttached(((FragmentManager)this), arg4, arg5);
        }
    }

    void dispatchOnFragmentCreated(@NonNull Fragment arg4, @Nullable Bundle arg5, boolean arg6) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentCreated(arg4, arg5, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg6) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentCreated(((FragmentManager)this), arg4, arg5);
        }
    }

    void dispatchOnFragmentDestroyed(@NonNull Fragment arg4, boolean arg5) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentDestroyed(arg4, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg5) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentDestroyed(((FragmentManager)this), arg4);
        }
    }

    void dispatchOnFragmentDetached(@NonNull Fragment arg4, boolean arg5) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentDetached(arg4, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg5) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentDetached(((FragmentManager)this), arg4);
        }
    }

    void dispatchOnFragmentPaused(@NonNull Fragment arg4, boolean arg5) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentPaused(arg4, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg5) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentPaused(((FragmentManager)this), arg4);
        }
    }

    void dispatchOnFragmentPreAttached(@NonNull Fragment arg4, @NonNull Context arg5, boolean arg6) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentPreAttached(arg4, arg5, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg6) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentPreAttached(((FragmentManager)this), arg4, arg5);
        }
    }

    void dispatchOnFragmentPreCreated(@NonNull Fragment arg4, @Nullable Bundle arg5, boolean arg6) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentPreCreated(arg4, arg5, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg6) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentPreCreated(((FragmentManager)this), arg4, arg5);
        }
    }

    void dispatchOnFragmentResumed(@NonNull Fragment arg4, boolean arg5) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentResumed(arg4, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg5) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentResumed(((FragmentManager)this), arg4);
        }
    }

    void dispatchOnFragmentSaveInstanceState(@NonNull Fragment arg4, @NonNull Bundle arg5, boolean arg6) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentSaveInstanceState(arg4, arg5, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg6) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentSaveInstanceState(((FragmentManager)this), arg4, arg5);
        }
    }

    void dispatchOnFragmentStarted(@NonNull Fragment arg4, boolean arg5) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentStarted(arg4, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg5) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentStarted(((FragmentManager)this), arg4);
        }
    }

    void dispatchOnFragmentStopped(@NonNull Fragment arg4, boolean arg5) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentStopped(arg4, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg5) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentStopped(((FragmentManager)this), arg4);
        }
    }

    void dispatchOnFragmentViewCreated(@NonNull Fragment arg4, @NonNull View arg5, @Nullable Bundle arg6, boolean arg7) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentViewCreated(arg4, arg5, arg6, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg7) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentViewCreated(((FragmentManager)this), arg4, arg5, arg6);
        }
    }

    void dispatchOnFragmentViewDestroyed(@NonNull Fragment arg4, boolean arg5) {
        if(this.mParent != null) {
            FragmentManager v0 = this.mParent.getFragmentManager();
            if((v0 instanceof FragmentManagerImpl)) {
                ((FragmentManagerImpl)v0).dispatchOnFragmentViewDestroyed(arg4, true);
            }
        }

        Iterator v0_1 = this.mLifecycleCallbacks.iterator();
        while(v0_1.hasNext()) {
            Object v1 = v0_1.next();
            if((arg5) && !((FragmentLifecycleCallbacksHolder)v1).mRecursive) {
                continue;
            }

            ((FragmentLifecycleCallbacksHolder)v1).mCallback.onFragmentViewDestroyed(((FragmentManager)this), arg4);
        }
    }

    public boolean dispatchOptionsItemSelected(MenuItem arg5) {
        if(this.mCurState < 1) {
            return 0;
        }

        int v0;
        for(v0 = 0; v0 < this.mAdded.size(); ++v0) {
            Object v3 = this.mAdded.get(v0);
            if(v3 != null && (((Fragment)v3).performOptionsItemSelected(arg5))) {
                return 1;
            }
        }

        return 0;
    }

    public void dispatchOptionsMenuClosed(Menu arg3) {
        if(this.mCurState < 1) {
            return;
        }

        int v0;
        for(v0 = 0; v0 < this.mAdded.size(); ++v0) {
            Object v1 = this.mAdded.get(v0);
            if(v1 != null) {
                ((Fragment)v1).performOptionsMenuClosed(arg3);
            }
        }
    }

    public void dispatchPause() {
        this.dispatchStateChange(3);
    }

    public void dispatchPictureInPictureModeChanged(boolean arg3) {
        int v0;
        for(v0 = this.mAdded.size() - 1; v0 >= 0; --v0) {
            Object v1 = this.mAdded.get(v0);
            if(v1 != null) {
                ((Fragment)v1).performPictureInPictureModeChanged(arg3);
            }
        }
    }

    public boolean dispatchPrepareOptionsMenu(Menu arg5) {
        int v1 = 0;
        if(this.mCurState < 1) {
            return 0;
        }

        boolean v0 = false;
        while(v1 < this.mAdded.size()) {
            Object v3 = this.mAdded.get(v1);
            if(v3 != null && (((Fragment)v3).performPrepareOptionsMenu(arg5))) {
                v0 = true;
            }

            ++v1;
        }

        return v0;
    }

    public void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.dispatchStateChange(4);
    }

    public void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.dispatchStateChange(3);
    }

    private void dispatchStateChange(int arg3) {
        try {
            this.mExecutingActions = true;
            this.moveToState(arg3, false);
        }
        catch(Throwable v3) {
            this.mExecutingActions = false;
            throw v3;
        }

        this.mExecutingActions = false;
        this.execPendingActions();
    }

    public void dispatchStop() {
        this.mStopped = true;
        this.dispatchStateChange(2);
    }

    void doPendingDeferredStart() {
        if(this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            this.startPendingDeferredFragments();
        }
    }

    public void dump(String arg7, FileDescriptor arg8, PrintWriter arg9, String[] arg10) {
        int v8;
        Object v4;
        int v1;
        String v0_1 = arg7 + "    ";
        int v2 = 0;
        if(this.mActive != null) {
            v1 = this.mActive.size();
            if(v1 > 0) {
                arg9.print(arg7);
                arg9.print("Active Fragments in ");
                arg9.print(Integer.toHexString(System.identityHashCode(this)));
                arg9.println(":");
                int v3;
                for(v3 = 0; v3 < v1; ++v3) {
                    v4 = this.mActive.valueAt(v3);
                    arg9.print(arg7);
                    arg9.print("  #");
                    arg9.print(v3);
                    arg9.print(": ");
                    arg9.println(v4);
                    if(v4 != null) {
                        ((Fragment)v4).dump(v0_1, arg8, arg9, arg10);
                    }
                }
            }
        }

        v1 = this.mAdded.size();
        if(v1 > 0) {
            arg9.print(arg7);
            arg9.println("Added Fragments:");
            for(v3 = 0; v3 < v1; ++v3) {
                v4 = this.mAdded.get(v3);
                arg9.print(arg7);
                arg9.print("  #");
                arg9.print(v3);
                arg9.print(": ");
                arg9.println(((Fragment)v4).toString());
            }
        }

        if(this.mCreatedMenus != null) {
            v1 = this.mCreatedMenus.size();
            if(v1 > 0) {
                arg9.print(arg7);
                arg9.println("Fragments Created Menus:");
                for(v3 = 0; v3 < v1; ++v3) {
                    v4 = this.mCreatedMenus.get(v3);
                    arg9.print(arg7);
                    arg9.print("  #");
                    arg9.print(v3);
                    arg9.print(": ");
                    arg9.println(((Fragment)v4).toString());
                }
            }
        }

        if(this.mBackStack != null) {
            v1 = this.mBackStack.size();
            if(v1 > 0) {
                arg9.print(arg7);
                arg9.println("Back Stack:");
                for(v3 = 0; v3 < v1; ++v3) {
                    v4 = this.mBackStack.get(v3);
                    arg9.print(arg7);
                    arg9.print("  #");
                    arg9.print(v3);
                    arg9.print(": ");
                    arg9.println(((BackStackRecord)v4).toString());
                    ((BackStackRecord)v4).dump(v0_1, arg8, arg9, arg10);
                }
            }
        }

        __monitor_enter(this);
        try {
            if(this.mBackStackIndices != null) {
                v8 = this.mBackStackIndices.size();
                if(v8 > 0) {
                    arg9.print(arg7);
                    arg9.println("Back Stack Indices:");
                    int v10;
                    for(v10 = 0; v10 < v8; ++v10) {
                        Object v0_2 = this.mBackStackIndices.get(v10);
                        arg9.print(arg7);
                        arg9.print("  #");
                        arg9.print(v10);
                        arg9.print(": ");
                        arg9.println(v0_2);
                    }
                }
            }

            if(this.mAvailBackStackIndices != null && this.mAvailBackStackIndices.size() > 0) {
                arg9.print(arg7);
                arg9.print("mAvailBackStackIndices: ");
                arg9.println(Arrays.toString(this.mAvailBackStackIndices.toArray()));
            }

            __monitor_exit(this);
        }
        catch(Throwable v7) {
            try {
            label_208:
                __monitor_exit(this);
            }
            catch(Throwable v7) {
                goto label_208;
            }

            throw v7;
        }

        if(this.mPendingActions != null) {
            v8 = this.mPendingActions.size();
            if(v8 > 0) {
                arg9.print(arg7);
                arg9.println("Pending Actions:");
                while(v2 < v8) {
                    Object v10_1 = this.mPendingActions.get(v2);
                    arg9.print(arg7);
                    arg9.print("  #");
                    arg9.print(v2);
                    arg9.print(": ");
                    arg9.println(v10_1);
                    ++v2;
                }
            }
        }

        arg9.print(arg7);
        arg9.println("FragmentManager misc state:");
        arg9.print(arg7);
        arg9.print("  mHost=");
        arg9.println(this.mHost);
        arg9.print(arg7);
        arg9.print("  mContainer=");
        arg9.println(this.mContainer);
        if(this.mParent != null) {
            arg9.print(arg7);
            arg9.print("  mParent=");
            arg9.println(this.mParent);
        }

        arg9.print(arg7);
        arg9.print("  mCurState=");
        arg9.print(this.mCurState);
        arg9.print(" mStateSaved=");
        arg9.print(this.mStateSaved);
        arg9.print(" mStopped=");
        arg9.print(this.mStopped);
        arg9.print(" mDestroyed=");
        arg9.println(this.mDestroyed);
        if(this.mNeedMenuInvalidate) {
            arg9.print(arg7);
            arg9.print("  mNeedMenuInvalidate=");
            arg9.println(this.mNeedMenuInvalidate);
        }

        if(this.mNoTransactionsBecause != null) {
            arg9.print(arg7);
            arg9.print("  mNoTransactionsBecause=");
            arg9.println(this.mNoTransactionsBecause);
        }
    }

    private void endAnimatingAwayFragments() {
        int v1 = 0;
        int v0 = this.mActive == null ? 0 : this.mActive.size();
        while(v1 < v0) {
            Object v4 = this.mActive.valueAt(v1);
            if(v4 != null) {
                if(((Fragment)v4).getAnimatingAway() != null) {
                    int v5 = ((Fragment)v4).getStateAfterAnimating();
                    View v2 = ((Fragment)v4).getAnimatingAway();
                    Animation v3 = v2.getAnimation();
                    if(v3 != null) {
                        v3.cancel();
                        v2.clearAnimation();
                    }

                    ((Fragment)v4).setAnimatingAway(null);
                    this.moveToState(((Fragment)v4), v5, 0, 0, false);
                }
                else {
                    if(((Fragment)v4).getAnimator() == null) {
                        goto label_32;
                    }

                    ((Fragment)v4).getAnimator().end();
                }
            }

        label_32:
            ++v1;
        }
    }

    public void enqueueAction(OpGenerator arg2, boolean arg3) {
        if(!arg3) {
            this.checkStateLoss();
        }

        __monitor_enter(this);
        try {
            if(!this.mDestroyed) {
                if(this.mHost == null) {
                }
                else {
                    if(this.mPendingActions == null) {
                        this.mPendingActions = new ArrayList();
                    }

                    this.mPendingActions.add(arg2);
                    this.scheduleCommit();
                    __monitor_exit(this);
                    return;
                }
            }

            if(arg3) {
                __monitor_exit(this);
                return;
            }

            throw new IllegalStateException("Activity has been destroyed");
        label_26:
            __monitor_exit(this);
        }
        catch(Throwable v2) {
            goto label_26;
        }

        throw v2;
    }

    private void ensureExecReady(boolean arg3) {
        if(!this.mExecutingActions) {
            if(this.mHost != null) {
                if(Looper.myLooper() == this.mHost.getHandler().getLooper()) {
                    if(!arg3) {
                        this.checkStateLoss();
                    }

                    if(this.mTmpRecords == null) {
                        this.mTmpRecords = new ArrayList();
                        this.mTmpIsPop = new ArrayList();
                    }

                    this.mExecutingActions = true;
                    ArrayList v0 = null;
                    try {
                        this.executePostponedTransaction(v0, v0);
                    }
                    catch(Throwable v0_1) {
                        this.mExecutingActions = false;
                        throw v0_1;
                    }

                    this.mExecutingActions = false;
                    return;
                }

                throw new IllegalStateException("Must be called from main thread of fragment host");
            }

            throw new IllegalStateException("Fragment host has been destroyed");
        }

        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    void ensureInflatedFragmentView(Fragment arg4) {
        if((arg4.mFromLayout) && !arg4.mPerformedCreateView) {
            ViewGroup v2 = null;
            arg4.performCreateView(arg4.performGetLayoutInflater(arg4.mSavedFragmentState), v2, arg4.mSavedFragmentState);
            if(arg4.mView != null) {
                arg4.mInnerView = arg4.mView;
                arg4.mView.setSaveFromParentEnabled(false);
                if(arg4.mHidden) {
                    arg4.mView.setVisibility(8);
                }

                arg4.onViewCreated(arg4.mView, arg4.mSavedFragmentState);
                this.dispatchOnFragmentViewCreated(arg4, arg4.mView, arg4.mSavedFragmentState, false);
            }
            else {
                arg4.mInnerView = ((View)v2);
            }
        }
    }

    public boolean execPendingActions() {
        this.ensureExecReady(true);
        boolean v1;
        for(v1 = false; this.generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop); v1 = true) {
            this.mExecutingActions = true;
            try {
                this.removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            }
            catch(Throwable v0) {
                this.cleanupExec();
                throw v0;
            }

            this.cleanupExec();
        }

        this.doPendingDeferredStart();
        this.burpActive();
        return v1;
    }

    public void execSingleAction(OpGenerator arg2, boolean arg3) {
        if((arg3) && (this.mHost == null || (this.mDestroyed))) {
            return;
        }

        this.ensureExecReady(arg3);
        if(arg2.generateOps(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                this.removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            }
            catch(Throwable v2) {
                this.cleanupExec();
                throw v2;
            }

            this.cleanupExec();
        }

        this.doPendingDeferredStart();
        this.burpActive();
    }

    private static void executeOps(ArrayList arg3, ArrayList arg4, int arg5, int arg6) {
        while(arg5 < arg6) {
            Object v0 = arg3.get(arg5);
            boolean v2 = true;
            if(arg4.get(arg5).booleanValue()) {
                ((BackStackRecord)v0).bumpBackStackNesting(-1);
                if(arg5 == arg6 - 1) {
                }
                else {
                    v2 = false;
                }

                ((BackStackRecord)v0).executePopOps(v2);
            }
            else {
                ((BackStackRecord)v0).bumpBackStackNesting(1);
                ((BackStackRecord)v0).executeOps();
            }

            ++arg5;
        }
    }

    private void executeOpsTogether(ArrayList arg16, ArrayList arg17, int arg18, int arg19) {
        int v4;
        FragmentManagerImpl v6 = this;
        ArrayList v7 = arg16;
        ArrayList v8 = arg17;
        int v9 = arg18;
        int v10 = arg19;
        boolean v11 = v7.get(v9).mReorderingAllowed;
        if(v6.mTmpAddedFragments == null) {
            v6.mTmpAddedFragments = new ArrayList();
        }
        else {
            v6.mTmpAddedFragments.clear();
        }

        v6.mTmpAddedFragments.addAll(v6.mAdded);
        Fragment v2 = this.getPrimaryNavigationFragment();
        int v0 = v9;
        int v12 = 0;
        while(v0 < v10) {
            Object v3 = v7.get(v0);
            v2 = !v8.get(v0).booleanValue() ? ((BackStackRecord)v3).expandOps(v6.mTmpAddedFragments, v2) : ((BackStackRecord)v3).trackAddedFragmentsInPop(v6.mTmpAddedFragments, v2);
            v12 = v12 != 0 || (((BackStackRecord)v3).mAddToBackStack) ? 1 : 0;
            ++v0;
        }

        v6.mTmpAddedFragments.clear();
        if(!v11) {
            FragmentTransition.startTransitions(this, arg16, arg17, arg18, arg19, false);
        }

        FragmentManagerImpl.executeOps(arg16, arg17, arg18, arg19);
        if(v11) {
            ArraySet v14 = new ArraySet();
            this.addAddedFragments(v14);
            v0 = this.postponePostponableTransactions(arg16, arg17, arg18, arg19, v14);
            this.makeRemovedFragmentsInvisible(v14);
            v4 = v0;
        }
        else {
            v4 = v10;
        }

        if(v4 != v9 && (v11)) {
            FragmentTransition.startTransitions(this, arg16, arg17, arg18, v4, true);
            this.moveToState(v6.mCurState, true);
        }

        while(v9 < v10) {
            Object v0_1 = v7.get(v9);
            if((v8.get(v9).booleanValue()) && ((BackStackRecord)v0_1).mIndex >= 0) {
                this.freeBackStackIndex(((BackStackRecord)v0_1).mIndex);
                ((BackStackRecord)v0_1).mIndex = -1;
            }

            ((BackStackRecord)v0_1).runOnCommitRunnables();
            ++v9;
        }

        if(v12 != 0) {
            this.reportBackStackChanged();
        }
    }

    public boolean executePendingTransactions() {
        boolean v0 = this.execPendingActions();
        this.forcePostponedTransactions();
        return v0;
    }

    private void executePostponedTransaction(ArrayList arg8, ArrayList arg9) {
        int v5;
        int v0 = this.mPostponedTransactions == null ? 0 : this.mPostponedTransactions.size();
        int v2 = v0;
        for(v0 = 0; v0 < v2; ++v0) {
            Object v3 = this.mPostponedTransactions.get(v0);
            int v4 = -1;
            if(arg8 == null || (((StartEnterTransitionListener)v3).mIsBack)) {
            label_24:
                if(!((StartEnterTransitionListener)v3).isReady()) {
                    if(arg8 == null) {
                    }
                    else if(((StartEnterTransitionListener)v3).mRecord.interactsWith(arg8, 0, arg8.size())) {
                        goto label_31;
                    }

                    goto label_47;
                }

            label_31:
                this.mPostponedTransactions.remove(v0);
                --v0;
                --v2;
                if(arg8 != null && !((StartEnterTransitionListener)v3).mIsBack) {
                    v5 = arg8.indexOf(((StartEnterTransitionListener)v3).mRecord);
                    if(v5 != v4 && (arg9.get(v5).booleanValue())) {
                        ((StartEnterTransitionListener)v3).cancelTransaction();
                        goto label_47;
                    }
                }

                ((StartEnterTransitionListener)v3).completeTransaction();
            }
            else {
                v5 = arg8.indexOf(((StartEnterTransitionListener)v3).mRecord);
                if(v5 == v4) {
                    goto label_24;
                }
                else if(arg9.get(v5).booleanValue()) {
                    ((StartEnterTransitionListener)v3).cancelTransaction();
                }
                else {
                    goto label_24;
                }
            }

        label_47:
        }
    }

    @Nullable public Fragment findFragmentById(int arg4) {
        Object v1;
        int v0;
        for(v0 = this.mAdded.size() - 1; v0 >= 0; --v0) {
            v1 = this.mAdded.get(v0);
            if(v1 != null && ((Fragment)v1).mFragmentId == arg4) {
                return ((Fragment)v1);
            }
        }

        if(this.mActive != null) {
            for(v0 = this.mActive.size() - 1; v0 >= 0; --v0) {
                v1 = this.mActive.valueAt(v0);
                if(v1 != null && ((Fragment)v1).mFragmentId == arg4) {
                    return ((Fragment)v1);
                }
            }
        }

        return null;
    }

    @Nullable public Fragment findFragmentByTag(@Nullable String arg4) {
        Object v1;
        if(arg4 != null) {
            int v0;
            for(v0 = this.mAdded.size() - 1; v0 >= 0; --v0) {
                v1 = this.mAdded.get(v0);
                if(v1 != null && (arg4.equals(((Fragment)v1).mTag))) {
                    return ((Fragment)v1);
                }
            }
        }

        if(this.mActive != null && arg4 != null) {
            for(v0 = this.mActive.size() - 1; v0 >= 0; --v0) {
                v1 = this.mActive.valueAt(v0);
                if(v1 != null && (arg4.equals(((Fragment)v1).mTag))) {
                    return ((Fragment)v1);
                }
            }
        }

        return null;
    }

    public Fragment findFragmentByWho(String arg3) {
        if(this.mActive != null && arg3 != null) {
            int v0;
            for(v0 = this.mActive.size() - 1; v0 >= 0; --v0) {
                Object v1 = this.mActive.valueAt(v0);
                if(v1 != null) {
                    Fragment v1_1 = ((Fragment)v1).findFragmentByWho(arg3);
                    if(v1_1 != null) {
                        return v1_1;
                    }
                }
            }
        }

        return null;
    }

    private Fragment findFragmentUnder(Fragment arg5) {
        ViewGroup v0 = arg5.mContainer;
        View v1 = arg5.mView;
        Fragment v2 = null;
        if(v0 != null) {
            if(v1 == null) {
            }
            else {
                int v5;
                for(v5 = this.mAdded.indexOf(arg5) - 1; v5 >= 0; --v5) {
                    Object v1_1 = this.mAdded.get(v5);
                    if(((Fragment)v1_1).mContainer == v0 && ((Fragment)v1_1).mView != null) {
                        return ((Fragment)v1_1);
                    }
                }

                return v2;
            }
        }

        return v2;
    }

    private void forcePostponedTransactions() {
        if(this.mPostponedTransactions != null) {
            while(!this.mPostponedTransactions.isEmpty()) {
                this.mPostponedTransactions.remove(0).completeTransaction();
            }
        }
    }

    public void freeBackStackIndex(int arg4) {
        __monitor_enter(this);
        try {
            this.mBackStackIndices.set(arg4, null);
            if(this.mAvailBackStackIndices == null) {
                this.mAvailBackStackIndices = new ArrayList();
            }

            if(FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "Freeing back stack index " + arg4);
            }

            this.mAvailBackStackIndices.add(Integer.valueOf(arg4));
            __monitor_exit(this);
            return;
        label_25:
            __monitor_exit(this);
        }
        catch(Throwable v4) {
            goto label_25;
        }

        throw v4;
    }

    private boolean generateOpsForPendingActions(ArrayList arg5, ArrayList arg6) {
        __monitor_enter(this);
        try {
            int v1 = 0;
            if(this.mPendingActions != null) {
                if(this.mPendingActions.size() == 0) {
                }
                else {
                    int v0 = this.mPendingActions.size();
                    int v2 = 0;
                    while(v1 < v0) {
                        v2 |= this.mPendingActions.get(v1).generateOps(arg5, arg6);
                        ++v1;
                    }

                    this.mPendingActions.clear();
                    this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                    __monitor_exit(this);
                    return ((boolean)v2);
                }
            }

            __monitor_exit(this);
            return 0;
        label_29:
            __monitor_exit(this);
        }
        catch(Throwable v5) {
            goto label_29;
        }

        throw v5;
    }

    int getActiveFragmentCount() {
        if(this.mActive == null) {
            return 0;
        }

        return this.mActive.size();
    }

    List getActiveFragments() {
        if(this.mActive == null) {
            return null;
        }

        int v0 = this.mActive.size();
        ArrayList v1 = new ArrayList(v0);
        int v2;
        for(v2 = 0; v2 < v0; ++v2) {
            v1.add(this.mActive.valueAt(v2));
        }

        return ((List)v1);
    }

    private static Animation$AnimationListener getAnimationListener(Animation arg2) {
        Object v2_2;
        try {
            if(FragmentManagerImpl.sAnimationListenerField == null) {
                FragmentManagerImpl.sAnimationListenerField = Animation.class.getDeclaredField("mListener");
                FragmentManagerImpl.sAnimationListenerField.setAccessible(true);
            }

            v2_2 = FragmentManagerImpl.sAnimationListenerField.get(arg2);
            goto label_22;
        }
        catch(IllegalAccessException v2) {
            Log.e("FragmentManager", "Cannot access Animation\'s mListener field", ((Throwable)v2));
        }
        catch(NoSuchFieldException v2_1) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", ((Throwable)v2_1));
        }

        Animation$AnimationListener v2_3 = null;
    label_22:
        return ((Animation$AnimationListener)v2_2);
    }

    public BackStackEntry getBackStackEntryAt(int arg2) {
        return this.mBackStack.get(arg2);
    }

    public int getBackStackEntryCount() {
        int v0 = this.mBackStack != null ? this.mBackStack.size() : 0;
        return v0;
    }

    @Nullable public Fragment getFragment(Bundle arg5, String arg6) {
        int v5 = arg5.getInt(arg6, -1);
        if(v5 == -1) {
            return null;
        }

        Object v0 = this.mActive.get(v5);
        if(v0 == null) {
            StringBuilder v2 = new StringBuilder();
            v2.append("Fragment no longer exists for key ");
            v2.append(arg6);
            v2.append(": index ");
            v2.append(v5);
            this.throwException(new IllegalStateException(v2.toString()));
        }

        return ((Fragment)v0);
    }

    public List getFragments() {
        if(this.mAdded.isEmpty()) {
            return Collections.emptyList();
        }

        ArrayList v0 = this.mAdded;
        __monitor_enter(v0);
        try {
            __monitor_exit(v0);
            return this.mAdded.clone();
        label_12:
            __monitor_exit(v0);
        }
        catch(Throwable v1) {
            goto label_12;
        }

        throw v1;
    }

    LayoutInflater$Factory2 getLayoutInflaterFactory() {
        return this;
    }

    @Nullable public Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    public void hideFragment(Fragment arg4) {
        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "hide: " + arg4);
        }

        if(!arg4.mHidden) {
            arg4.mHidden = true;
            arg4.mHiddenChanged ^= 1;
        }
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    boolean isStateAtLeast(int arg2) {
        boolean v2 = this.mCurState >= arg2 ? true : false;
        return v2;
    }

    public boolean isStateSaved() {
        boolean v0 = (this.mStateSaved) || (this.mStopped) ? true : false;
        return v0;
    }

    AnimationOrAnimator loadAnimation(Fragment arg5, int arg6, boolean arg7, int arg8) {
        int v0 = arg5.getNextAnim();
        Animation v1 = arg5.onCreateAnimation(arg6, arg7, v0);
        if(v1 != null) {
            return new AnimationOrAnimator(v1);
        }

        Animator v5 = arg5.onCreateAnimator(arg6, arg7, v0);
        if(v5 != null) {
            return new AnimationOrAnimator(v5);
        }

        if(v0 != 0) {
            boolean v5_1 = "anim".equals(this.mHost.getContext().getResources().getResourceTypeName(v0));
            int v1_1 = 0;
            if(v5_1) {
                try {
                    Animation v2 = AnimationUtils.loadAnimation(this.mHost.getContext(), v0);
                    if(v2 != null) {
                        return new AnimationOrAnimator(v2);
                    }
                    else {
                        goto label_27;
                    }

                    goto label_31;
                }
                catch(RuntimeException ) {
                label_31:
                    if(v1_1 != 0) {
                        goto label_49;
                    }

                    try {
                        Animator v1_3 = AnimatorInflater.loadAnimator(this.mHost.getContext(), v0);
                        if(v1_3 == null) {
                            goto label_49;
                        }

                        return new AnimationOrAnimator(v1_3);
                    }
                    catch(RuntimeException v1_2) {
                        if(!v5_1) {
                            Animation v5_3 = AnimationUtils.loadAnimation(this.mHost.getContext(), v0);
                            if(v5_3 == null) {
                                goto label_49;
                            }

                            return new AnimationOrAnimator(v5_3);
                        }

                        throw v1_2;
                    }
                }
                catch(Resources$NotFoundException v5_2) {
                    throw v5_2;
                label_27:
                    v1_1 = 1;
                    goto label_31;
                }
            }

            goto label_31;
        }

    label_49:
        AnimationOrAnimator v5_4 = null;
        if(arg6 == 0) {
            return v5_4;
        }

        arg6 = FragmentManagerImpl.transitToStyleIndex(arg6, arg7);
        if(arg6 < 0) {
            return v5_4;
        }

        float v7 = 0.975f;
        float v1_4 = 1f;
        switch(arg6) {
            case 1: {
                goto label_87;
            }
            case 2: {
                goto label_83;
            }
            case 3: {
                goto label_79;
            }
            case 4: {
                goto label_74;
            }
            case 5: {
                goto label_70;
            }
            case 6: {
                goto label_66;
            }
        }

        if(arg8 == 0 && (this.mHost.onHasWindowAnimations())) {
            arg8 = this.mHost.onGetWindowAnimations();
        }

        if(arg8 == 0) {
            return v5_4;
        }

        return v5_4;
    label_66:
        return FragmentManagerImpl.makeFadeAnimation(this.mHost.getContext(), v1_4, 0f);
    label_83:
        return FragmentManagerImpl.makeOpenCloseAnimation(this.mHost.getContext(), v1_4, v7, v1_4, 0f);
    label_70:
        return FragmentManagerImpl.makeFadeAnimation(this.mHost.getContext(), 0f, v1_4);
    label_87:
        return FragmentManagerImpl.makeOpenCloseAnimation(this.mHost.getContext(), 1.125f, v1_4, 0f, v1_4);
    label_74:
        return FragmentManagerImpl.makeOpenCloseAnimation(this.mHost.getContext(), v1_4, 1.075f, v1_4, 0f);
    label_79:
        return FragmentManagerImpl.makeOpenCloseAnimation(this.mHost.getContext(), v7, v1_4, 0f, v1_4);
    }

    void makeActive(Fragment arg4) {
        if(arg4.mIndex >= 0) {
            return;
        }

        int v0 = this.mNextFragmentIndex;
        this.mNextFragmentIndex = v0 + 1;
        arg4.setIndex(v0, this.mParent);
        if(this.mActive == null) {
            this.mActive = new SparseArray();
        }

        this.mActive.put(arg4.mIndex, arg4);
        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "Allocated fragment index " + arg4);
        }
    }

    static AnimationOrAnimator makeFadeAnimation(Context arg0, float arg1, float arg2) {
        AlphaAnimation v0 = new AlphaAnimation(arg1, arg2);
        v0.setInterpolator(FragmentManagerImpl.DECELERATE_CUBIC);
        v0.setDuration(220);
        return new AnimationOrAnimator(((Animation)v0));
    }

    void makeInactive(Fragment arg4) {
        if(arg4.mIndex < 0) {
            return;
        }

        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "Freeing fragment index " + arg4);
        }

        this.mActive.put(arg4.mIndex, null);
        arg4.initState();
    }

    static AnimationOrAnimator makeOpenCloseAnimation(Context arg10, float arg11, float arg12, float arg13, float arg14) {
        AnimationSet v10 = new AnimationSet(false);
        ScaleAnimation v0 = new ScaleAnimation(arg11, arg12, arg11, arg12, 1, 0.5f, 1, 0.5f);
        v0.setInterpolator(FragmentManagerImpl.DECELERATE_QUINT);
        v0.setDuration(220);
        v10.addAnimation(((Animation)v0));
        AlphaAnimation v0_1 = new AlphaAnimation(arg13, arg14);
        v0_1.setInterpolator(FragmentManagerImpl.DECELERATE_CUBIC);
        v0_1.setDuration(220);
        v10.addAnimation(((Animation)v0_1));
        return new AnimationOrAnimator(((Animation)v10));
    }

    private void makeRemovedFragmentsInvisible(ArraySet arg6) {
        int v0 = arg6.size();
        int v1;
        for(v1 = 0; v1 < v0; ++v1) {
            Object v2 = arg6.valueAt(v1);
            if(!((Fragment)v2).mAdded) {
                View v3 = ((Fragment)v2).getView();
                ((Fragment)v2).mPostponedAlpha = v3.getAlpha();
                v3.setAlpha(0f);
            }
        }
    }

    static boolean modifiesAlpha(Animator arg5) {
        int v1;
        if(arg5 == null) {
            return 0;
        }

        if((arg5 instanceof ValueAnimator)) {
            PropertyValuesHolder[] v5 = ((ValueAnimator)arg5).getValues();
            v1 = 0;
            while(v1 < v5.length) {
                if("alpha".equals(v5[v1].getPropertyName())) {
                    return 1;
                }
                else {
                    ++v1;
                    continue;
                }

                return 0;
            }
        }
        else if((arg5 instanceof AnimatorSet)) {
            ArrayList v5_1 = ((AnimatorSet)arg5).getChildAnimations();
            v1 = 0;
            while(v1 < ((List)v5_1).size()) {
                if(FragmentManagerImpl.modifiesAlpha(((List)v5_1).get(v1))) {
                    return 1;
                }
                else {
                    ++v1;
                    continue;
                }

                return 0;
            }
        }

        return 0;
    }

    static boolean modifiesAlpha(AnimationOrAnimator arg4) {
        if((arg4.animation instanceof AlphaAnimation)) {
            return 1;
        }

        if((arg4.animation instanceof AnimationSet)) {
            List v4 = arg4.animation.getAnimations();
            int v2;
            for(v2 = 0; v2 < v4.size(); ++v2) {
                if((v4.get(v2) instanceof AlphaAnimation)) {
                    return 1;
                }
            }

            return 0;
        }

        return FragmentManagerImpl.modifiesAlpha(arg4.animator);
    }

    void moveFragmentToExpectedState(Fragment arg11) {
        if(arg11 == null) {
            return;
        }

        int v0 = this.mCurState;
        if(arg11.mRemoving) {
            v0 = arg11.isInBackStack() ? Math.min(v0, 1) : Math.min(v0, 0);
        }

        this.moveToState(arg11, v0, arg11.getNextTransition(), arg11.getNextTransitionStyle(), false);
        if(arg11.mView != null) {
            Fragment v0_1 = this.findFragmentUnder(arg11);
            if(v0_1 != null) {
                View v0_2 = v0_1.mView;
                ViewGroup v1 = arg11.mContainer;
                v0 = v1.indexOfChild(v0_2);
                int v4 = v1.indexOfChild(arg11.mView);
                if(v4 < v0) {
                    v1.removeViewAt(v4);
                    v1.addView(arg11.mView, v0);
                }
            }

            if(!arg11.mIsNewlyAdded) {
                goto label_61;
            }

            if(arg11.mContainer == null) {
                goto label_61;
            }

            if(arg11.mPostponedAlpha > 0f) {
                arg11.mView.setAlpha(arg11.mPostponedAlpha);
            }

            arg11.mPostponedAlpha = 0f;
            arg11.mIsNewlyAdded = false;
            AnimationOrAnimator v0_3 = this.loadAnimation(arg11, arg11.getNextTransition(), true, arg11.getNextTransitionStyle());
            if(v0_3 == null) {
                goto label_61;
            }

            FragmentManagerImpl.setHWLayerAnimListenerIfAlpha(arg11.mView, v0_3);
            if(v0_3.animation != null) {
                arg11.mView.startAnimation(v0_3.animation);
                goto label_61;
            }

            v0_3.animator.setTarget(arg11.mView);
            v0_3.animator.start();
        }

    label_61:
        if(arg11.mHiddenChanged) {
            this.completeShowHideFragment(arg11);
        }
    }

    void moveToState(Fragment arg15, int arg16, int arg17, int arg18, boolean arg19) {
        ViewGroup v0_3;
        String v1_1;
        View v0_2;
        int v0;
        FragmentManagerImpl v6 = this;
        Fragment v7 = arg15;
        boolean v8 = true;
        if(!v7.mAdded || (v7.mDetached)) {
            v0 = arg16;
            if(v0 > 1) {
                v0 = 1;
            }
        }
        else {
            v0 = arg16;
        }

        if((v7.mRemoving) && v0 > v7.mState) {
            if(v7.mState == 0 && (arg15.isInBackStack())) {
                v0 = 1;
                goto label_24;
            }

            v0 = v7.mState;
        }

    label_24:
        int v9 = 3;
        int v10 = 2;
        int v11 = !v7.mDeferStart || v7.mState >= v9 || v0 <= v10 ? v0 : 2;
        View v12 = null;
        if(v7.mState > v11) {
            goto label_330;
        }

        if((v7.mFromLayout) && !v7.mInLayout) {
            return;
        }

        if(arg15.getAnimatingAway() != null || arg15.getAnimator() != null) {
            arg15.setAnimatingAway(v12);
            arg15.setAnimator(((Animator)v12));
            this.moveToState(arg15, arg15.getStateAfterAnimating(), 0, 0, true);
        }

        switch(v7.mState) {
            case 0: {
                goto label_59;
            }
            case 1: {
                goto label_197;
            }
            case 2: {
                goto label_301;
            }
            case 3: {
                goto label_314;
            }
        }

        goto label_468;
    label_59:
        if(v11 > 0) {
            if(FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "moveto CREATED: " + arg15);
            }

            if(v7.mSavedFragmentState != null) {
                v7.mSavedFragmentState.setClassLoader(v6.mHost.getContext().getClassLoader());
                v7.mSavedViewState = v7.mSavedFragmentState.getSparseParcelableArray("android:view_state");
                v7.mTarget = this.getFragment(v7.mSavedFragmentState, "android:target_state");
                if(v7.mTarget != null) {
                    v7.mTargetRequestCode = v7.mSavedFragmentState.getInt("android:target_req_state", 0);
                }

                if(v7.mSavedUserVisibleHint != null) {
                    v7.mUserVisibleHint = v7.mSavedUserVisibleHint.booleanValue();
                    v7.mSavedUserVisibleHint = ((Boolean)v12);
                }
                else {
                    v7.mUserVisibleHint = v7.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
                }

                if(v7.mUserVisibleHint) {
                    goto label_107;
                }

                v7.mDeferStart = true;
                if(v11 <= v10) {
                    goto label_107;
                }

                v11 = 2;
            }

        label_107:
            v7.mHost = v6.mHost;
            v7.mParentFragment = v6.mParent;
            FragmentManagerImpl v0_1 = v6.mParent != null ? v6.mParent.mChildFragmentManager : v6.mHost.getFragmentManagerImpl();
            v7.mFragmentManager = v0_1;
            if(v7.mTarget != null) {
                if(v6.mActive.get(v7.mTarget.mIndex) != v7.mTarget) {
                    v1 = new StringBuilder();
                    v1.append("Fragment ");
                    v1.append(arg15);
                    v1.append(" declared target fragment ");
                    v1.append(v7.mTarget);
                    v1.append(" that does not belong to this FragmentManager!");
                    throw new IllegalStateException(v1.toString());
                }
                else if(v7.mTarget.mState < 1) {
                    this.moveToState(v7.mTarget, 1, 0, 0, true);
                }
            }

            this.dispatchOnFragmentPreAttached(arg15, v6.mHost.getContext(), false);
            v7.mCalled = false;
            arg15.onAttach(v6.mHost.getContext());
            if(v7.mCalled) {
                if(v7.mParentFragment == null) {
                    v6.mHost.onAttachFragment(arg15);
                }
                else {
                    v7.mParentFragment.onAttachFragment(arg15);
                }

                this.dispatchOnFragmentAttached(arg15, v6.mHost.getContext(), false);
                if(!v7.mIsCreated) {
                    this.dispatchOnFragmentPreCreated(arg15, v7.mSavedFragmentState, false);
                    arg15.performCreate(v7.mSavedFragmentState);
                    this.dispatchOnFragmentCreated(arg15, v7.mSavedFragmentState, false);
                }
                else {
                    arg15.restoreChildFragmentState(v7.mSavedFragmentState);
                    v7.mState = 1;
                }

                v7.mRetaining = false;
            }
            else {
                v1 = new StringBuilder();
                v1.append("Fragment ");
                v1.append(arg15);
                v1.append(" did not call through to super.onAttach()");
                throw new SuperNotCalledException(v1.toString());
            }
        }

    label_197:
        this.ensureInflatedFragmentView(arg15);
        if(v11 > 1) {
            if(FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "moveto ACTIVITY_CREATED: " + arg15);
            }

            if(!v7.mFromLayout) {
                if(v7.mContainerId != 0) {
                    if(v7.mContainerId == -1) {
                        v1 = new StringBuilder();
                        v1.append("Cannot create fragment ");
                        v1.append(arg15);
                        v1.append(" for a container view with no id");
                        this.throwException(new IllegalArgumentException(v1.toString()));
                    }

                    v0_2 = v6.mContainer.onFindViewById(v7.mContainerId);
                    if(v0_2 != null) {
                        goto label_257;
                    }

                    if(v7.mRestored) {
                        goto label_257;
                    }

                    try {
                        v1_1 = arg15.getResources().getResourceName(v7.mContainerId);
                    }
                    catch(Resources$NotFoundException ) {
                        v1_1 = "unknown";
                    }

                    StringBuilder v3 = new StringBuilder();
                    v3.append("No view found for id 0x");
                    v3.append(Integer.toHexString(v7.mContainerId));
                    v3.append(" (");
                    v3.append(v1_1);
                    v3.append(") for fragment ");
                    v3.append(arg15);
                    this.throwException(new IllegalArgumentException(v3.toString()));
                }
                else {
                    v0_3 = ((ViewGroup)v12);
                }

            label_257:
                v7.mContainer = v0_3;
                arg15.performCreateView(arg15.performGetLayoutInflater(v7.mSavedFragmentState), v0_3, v7.mSavedFragmentState);
                if(v7.mView != null) {
                    v7.mInnerView = v7.mView;
                    v7.mView.setSaveFromParentEnabled(false);
                    if((((View)v0_3)) != null) {
                        v0_3.addView(v7.mView);
                    }

                    if(v7.mHidden) {
                        v7.mView.setVisibility(8);
                    }

                    arg15.onViewCreated(v7.mView, v7.mSavedFragmentState);
                    this.dispatchOnFragmentViewCreated(arg15, v7.mView, v7.mSavedFragmentState, false);
                    if(v7.mView.getVisibility() != 0 || v7.mContainer == null) {
                        v8 = false;
                    }
                    else {
                    }

                    v7.mIsNewlyAdded = v8;
                }
                else {
                    v7.mInnerView = v12;
                }
            }

            arg15.performActivityCreated(v7.mSavedFragmentState);
            this.dispatchOnFragmentActivityCreated(arg15, v7.mSavedFragmentState, false);
            if(v7.mView != null) {
                arg15.restoreViewState(v7.mSavedFragmentState);
            }

            v7.mSavedFragmentState = ((Bundle)v12);
        }

    label_301:
        if(v11 > v10) {
            if(FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "moveto STARTED: " + arg15);
            }

            arg15.performStart();
            this.dispatchOnFragmentStarted(arg15, false);
        }

    label_314:
        if(v11 <= v9) {
            goto label_468;
        }

        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "moveto RESUMED: " + arg15);
        }

        arg15.performResume();
        this.dispatchOnFragmentResumed(arg15, false);
        v7.mSavedFragmentState = ((Bundle)v12);
        v7.mSavedViewState = ((SparseArray)v12);
        goto label_468;
    label_330:
        if(v7.mState <= v11) {
            goto label_468;
        }

        switch(v7.mState) {
            case 1: {
                goto label_420;
            }
            case 2: {
                goto label_362;
            }
            case 3: {
                goto label_349;
            }
            case 4: {
                goto label_335;
            }
        }

        goto label_468;
    label_335:
        if(v11 < 4) {
            if(FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "movefrom RESUMED: " + arg15);
            }

            arg15.performPause();
            this.dispatchOnFragmentPaused(arg15, false);
        }

    label_349:
        if(v11 < v9) {
            if(FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "movefrom STARTED: " + arg15);
            }

            arg15.performStop();
            this.dispatchOnFragmentStopped(arg15, false);
        }

    label_362:
        if(v11 < v10) {
            if(FragmentManagerImpl.DEBUG) {
                Log.v("FragmentManager", "movefrom ACTIVITY_CREATED: " + arg15);
            }

            if(v7.mView != null && (v6.mHost.onShouldSaveFragmentState(arg15)) && v7.mSavedViewState == null) {
                this.saveFragmentViewState(arg15);
            }

            arg15.performDestroyView();
            this.dispatchOnFragmentViewDestroyed(arg15, false);
            if(v7.mView != null && v7.mContainer != null) {
                v7.mContainer.endViewTransition(v7.mView);
                v7.mView.clearAnimation();
                AnimationOrAnimator v0_4 = v6.mCurState <= 0 || (v6.mDestroyed) || v7.mView.getVisibility() != 0 || v7.mPostponedAlpha < 0f ? ((AnimationOrAnimator)v12) : this.loadAnimation(arg15, arg17, false, arg18);
                v7.mPostponedAlpha = 0f;
                if(v0_4 != null) {
                    this.animateRemoveFragment(arg15, v0_4, v11);
                }

                v7.mContainer.removeView(v7.mView);
            }

            v7.mContainer = ((ViewGroup)v12);
            v7.mView = v12;
            v7.mViewLifecycleOwner = ((LifecycleOwner)v12);
            v7.mViewLifecycleOwnerLiveData.setValue(v12);
            v7.mInnerView = v12;
            v7.mInLayout = false;
        }

    label_420:
        if(v11 < 1) {
            if(v6.mDestroyed) {
                if(arg15.getAnimatingAway() != null) {
                    v0_2 = arg15.getAnimatingAway();
                    arg15.setAnimatingAway(v12);
                    v0_2.clearAnimation();
                }
                else if(arg15.getAnimator() != null) {
                    Animator v0_5 = arg15.getAnimator();
                    arg15.setAnimator(((Animator)v12));
                    v0_5.cancel();
                }
            }

            if(arg15.getAnimatingAway() == null) {
                if(arg15.getAnimator() != null) {
                }
                else {
                    if(FragmentManagerImpl.DEBUG) {
                        Log.v("FragmentManager", "movefrom CREATED: " + arg15);
                    }

                    if(!v7.mRetaining) {
                        arg15.performDestroy();
                        this.dispatchOnFragmentDestroyed(arg15, false);
                    }
                    else {
                        v7.mState = 0;
                    }

                    arg15.performDetach();
                    this.dispatchOnFragmentDetached(arg15, false);
                    if(arg19) {
                        goto label_468;
                    }

                    if(!v7.mRetaining) {
                        this.makeInactive(arg15);
                        goto label_468;
                    }

                    v7.mHost = ((FragmentHostCallback)v12);
                    v7.mParentFragment = ((Fragment)v12);
                    v7.mFragmentManager = ((FragmentManagerImpl)v12);
                    goto label_468;
                }
            }

            arg15.setStateAfterAnimating(v11);
        }
        else {
        label_468:
            int v8_1 = v11;
        }

        if(v7.mState != (((int)v8))) {
            Log.w("FragmentManager", "moveToState: Fragment state for " + arg15 + " not updated inline; " + "expected state " + (((int)v8)) + " found " + v7.mState);
            v7.mState = ((int)v8);
        }
    }

    void moveToState(int arg4, boolean arg5) {
        if(this.mHost == null) {
            if(arg4 == 0) {
            }
            else {
                throw new IllegalStateException("No activity");
            }
        }

        if(!arg5 && arg4 == this.mCurState) {
            return;
        }

        this.mCurState = arg4;
        if(this.mActive != null) {
            arg4 = this.mAdded.size();
            int v0;
            for(v0 = 0; v0 < arg4; ++v0) {
                this.moveFragmentToExpectedState(this.mAdded.get(v0));
            }

            arg4 = this.mActive.size();
            for(v0 = 0; v0 < arg4; ++v0) {
                Object v1 = this.mActive.valueAt(v0);
                if(v1 != null && ((((Fragment)v1).mRemoving) || (((Fragment)v1).mDetached)) && !((Fragment)v1).mIsNewlyAdded) {
                    this.moveFragmentToExpectedState(((Fragment)v1));
                }
            }

            this.startPendingDeferredFragments();
            if(!this.mNeedMenuInvalidate) {
                return;
            }

            if(this.mHost == null) {
                return;
            }

            if(this.mCurState != 4) {
                return;
            }

            this.mHost.onSupportInvalidateOptionsMenu();
            this.mNeedMenuInvalidate = false;
        }
    }

    void moveToState(Fragment arg7) {
        this.moveToState(arg7, this.mCurState, 0, 0, false);
    }

    public void noteStateNotSaved() {
        this.mSavedNonConfig = null;
        int v0 = 0;
        this.mStateSaved = false;
        this.mStopped = false;
        int v1 = this.mAdded.size();
        while(v0 < v1) {
            Object v2 = this.mAdded.get(v0);
            if(v2 != null) {
                ((Fragment)v2).noteStateNotSaved();
            }

            ++v0;
        }
    }

    public View onCreateView(View arg14, String arg15, Context arg16, AttributeSet arg17) {
        Fragment v11_1;
        StringBuilder v2_2;
        FragmentManagerImpl v6 = this;
        Context v0 = arg16;
        AttributeSet v1 = arg17;
        View v3 = null;
        if(!"fragment".equals(arg15)) {
            return v3;
        }

        String v2 = v1.getAttributeValue(((String)v3), "class");
        TypedArray v4 = v0.obtainStyledAttributes(v1, FragmentTag.Fragment);
        int v5 = 0;
        if(v2 == null) {
            v2 = v4.getString(0);
        }

        String v7 = v2;
        int v2_1 = -1;
        int v9 = v4.getResourceId(1, v2_1);
        String v10 = v4.getString(2);
        v4.recycle();
        if(!Fragment.isSupportFragmentClass(v6.mHost.getContext(), v7)) {
            return v3;
        }

        if(arg14 != null) {
            v5 = arg14.getId();
        }

        if(v5 == v2_1 && v9 == v2_1) {
            if(v10 != null) {
            }
            else {
                v2_2 = new StringBuilder();
                v2_2.append(arg17.getPositionDescription());
                v2_2.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                v2_2.append(v7);
                throw new IllegalArgumentException(v2_2.toString());
            }
        }

        Fragment v4_1 = v9 != v2_1 ? this.findFragmentById(v9) : ((Fragment)v3);
        if(v4_1 == null && v10 != null) {
            v4_1 = this.findFragmentByTag(v10);
        }

        if(v4_1 == null && v5 != v2_1) {
            v4_1 = this.findFragmentById(v5);
        }

        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(v9) + " fname=" + v7 + " existing=" + v4_1);
        }

        if(v4_1 == null) {
            Fragment v0_1 = v6.mContainer.instantiate(v0, v7, ((Bundle)v3));
            v0_1.mFromLayout = true;
            v2_1 = v9 != 0 ? v9 : v5;
            v0_1.mFragmentId = v2_1;
            v0_1.mContainerId = v5;
            v0_1.mTag = v10;
            v0_1.mInLayout = true;
            v0_1.mFragmentManager = v6;
            v0_1.mHost = v6.mHost;
            v0_1.onInflate(v6.mHost.getContext(), v1, v0_1.mSavedFragmentState);
            this.addFragment(v0_1, true);
            v11_1 = v0_1;
        }
        else {
            if(v4_1.mInLayout) {
                goto label_142;
            }

            v4_1.mInLayout = true;
            v4_1.mHost = v6.mHost;
            if(!v4_1.mRetaining) {
                v4_1.onInflate(v6.mHost.getContext(), v1, v4_1.mSavedFragmentState);
            }

            v11_1 = v4_1;
        }

        if(v6.mCurState >= 1 || !v11_1.mFromLayout) {
            this.moveToState(v11_1);
        }
        else {
            this.moveToState(v11_1, 1, 0, 0, false);
        }

        if(v11_1.mView != null) {
            if(v9 != 0) {
                v11_1.mView.setId(v9);
            }

            if(v11_1.mView.getTag() == null) {
                v11_1.mView.setTag(v10);
            }

            return v11_1.mView;
        }

        StringBuilder v1_1 = new StringBuilder();
        v1_1.append("Fragment ");
        v1_1.append(v7);
        v1_1.append(" did not create a view.");
        throw new IllegalStateException(v1_1.toString());
    label_142:
        v2_2 = new StringBuilder();
        v2_2.append(arg17.getPositionDescription());
        v2_2.append(": Duplicate id 0x");
        v2_2.append(Integer.toHexString(v9));
        v2_2.append(", tag ");
        v2_2.append(v10);
        v2_2.append(", or parent id 0x");
        v2_2.append(Integer.toHexString(v5));
        v2_2.append(" with another fragment for ");
        v2_2.append(v7);
        throw new IllegalArgumentException(v2_2.toString());
    }

    public View onCreateView(String arg2, Context arg3, AttributeSet arg4) {
        return this.onCreateView(null, arg2, arg3, arg4);
    }

    public void performPendingDeferredStart(Fragment arg8) {
        if(arg8.mDeferStart) {
            if(this.mExecutingActions) {
                this.mHavePendingDeferredStart = true;
                return;
            }
            else {
                arg8.mDeferStart = false;
                this.moveToState(arg8, this.mCurState, 0, 0, false);
            }
        }
    }

    public void popBackStack() {
        this.enqueueAction(new PopBackStackState(this, null, -1, 0), false);
    }

    public void popBackStack(int arg3, int arg4) {
        if(arg3 >= 0) {
            this.enqueueAction(new PopBackStackState(this, null, arg3, arg4), false);
            return;
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("Bad id: ");
        v0.append(arg3);
        throw new IllegalArgumentException(v0.toString());
    }

    public void popBackStack(@Nullable String arg3, int arg4) {
        this.enqueueAction(new PopBackStackState(this, arg3, -1, arg4), false);
    }

    private boolean popBackStackImmediate(String arg9, int arg10, int arg11) {
        this.execPendingActions();
        this.ensureExecReady(true);
        if(this.mPrimaryNav != null && arg10 < 0 && arg9 == null) {
            FragmentManager v1 = this.mPrimaryNav.peekChildFragmentManager();
            if(v1 != null && (v1.popBackStackImmediate())) {
                return 1;
            }
        }

        boolean v9 = this.popBackStackState(this.mTmpRecords, this.mTmpIsPop, arg9, arg10, arg11);
        if(v9) {
            this.mExecutingActions = true;
            try {
                this.removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            }
            catch(Throwable v9_1) {
                this.cleanupExec();
                throw v9_1;
            }

            this.cleanupExec();
        }

        this.doPendingDeferredStart();
        this.burpActive();
        return v9;
    }

    public boolean popBackStackImmediate() {
        this.checkStateLoss();
        return this.popBackStackImmediate(null, -1, 0);
    }

    public boolean popBackStackImmediate(int arg3, int arg4) {
        this.checkStateLoss();
        this.execPendingActions();
        if(arg3 >= 0) {
            return this.popBackStackImmediate(null, arg3, arg4);
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("Bad id: ");
        v0.append(arg3);
        throw new IllegalArgumentException(v0.toString());
    }

    public boolean popBackStackImmediate(@Nullable String arg2, int arg3) {
        this.checkStateLoss();
        return this.popBackStackImmediate(arg2, -1, arg3);
    }

    boolean popBackStackState(ArrayList arg6, ArrayList arg7, String arg8, int arg9, int arg10) {
        int v8;
        int v2;
        if(this.mBackStack == null) {
            return 0;
        }

        if(arg8 != null || arg9 >= 0 || (arg10 & 1) != 0) {
            if(arg8 != null || arg9 >= 0) {
                for(v2 = this.mBackStack.size() - 1; v2 >= 0; --v2) {
                    Object v3 = this.mBackStack.get(v2);
                    if(arg8 != null && (arg8.equals(((BackStackRecord)v3).getName()))) {
                        break;
                    }

                    if(arg9 >= 0 && arg9 == ((BackStackRecord)v3).mIndex) {
                        break;
                    }
                }

                if(v2 < 0) {
                    return 0;
                }

                if((arg10 & 1) == 0) {
                    goto label_60;
                }

                --v2;
                while(v2 >= 0) {
                    Object v10 = this.mBackStack.get(v2);
                    if(arg8 == null || !arg8.equals(((BackStackRecord)v10).getName())) {
                        if(arg9 < 0) {
                        }
                        else if(arg9 == ((BackStackRecord)v10).mIndex) {
                            goto label_58;
                        }

                        break;
                    }

                label_58:
                    --v2;
                }
            }
            else {
                v2 = -1;
            }

        label_60:
            if(v2 == this.mBackStack.size() - 1) {
                return 0;
            }

            for(v8 = this.mBackStack.size() - 1; v8 > v2; --v8) {
                arg6.add(this.mBackStack.remove(v8));
                arg7.add(Boolean.valueOf(true));
            }
        }
        else {
            v8 = this.mBackStack.size() - 1;
            if(v8 < 0) {
                return 0;
            }
            else {
                arg6.add(this.mBackStack.remove(v8));
                arg7.add(Boolean.valueOf(true));
            }
        }

        return 1;
    }

    private int postponePostponableTransactions(ArrayList arg8, ArrayList arg9, int arg10, int arg11, ArraySet arg12) {
        int v0 = arg11 - 1;
        int v1 = arg11;
        while(v0 >= arg10) {
            Object v2 = arg8.get(v0);
            boolean v3 = arg9.get(v0).booleanValue();
            int v4 = !((BackStackRecord)v2).isPostponed() || (((BackStackRecord)v2).interactsWith(arg8, v0 + 1, arg11)) ? 0 : 1;
            if(v4 != 0) {
                if(this.mPostponedTransactions == null) {
                    this.mPostponedTransactions = new ArrayList();
                }

                StartEnterTransitionListener v4_1 = new StartEnterTransitionListener(((BackStackRecord)v2), v3);
                this.mPostponedTransactions.add(v4_1);
                ((BackStackRecord)v2).setOnStartPostponedListener(((OnStartEnterTransitionListener)v4_1));
                if(v3) {
                    ((BackStackRecord)v2).executeOps();
                }
                else {
                    ((BackStackRecord)v2).executePopOps(false);
                }

                --v1;
                if(v0 != v1) {
                    arg8.remove(v0);
                    arg8.add(v1, v2);
                }

                this.addAddedFragments(arg12);
            }

            --v0;
        }

        return v1;
    }

    public void putFragment(Bundle arg4, String arg5, Fragment arg6) {
        if(arg6.mIndex < 0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("Fragment ");
            v1.append(arg6);
            v1.append(" is not currently in the FragmentManager");
            this.throwException(new IllegalStateException(v1.toString()));
        }

        arg4.putInt(arg5, arg6.mIndex);
    }

    public void registerFragmentLifecycleCallbacks(FragmentLifecycleCallbacks arg3, boolean arg4) {
        this.mLifecycleCallbacks.add(new FragmentLifecycleCallbacksHolder(arg3, arg4));
    }

    public void removeFragment(Fragment arg4) {
        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "remove: " + arg4 + " nesting=" + arg4.mBackStackNesting);
        }

        int v0 = arg4.isInBackStack() ^ 1;
        if(!arg4.mDetached || v0 != 0) {
            ArrayList v0_1 = this.mAdded;
            __monitor_enter(v0_1);
            try {
                this.mAdded.remove(arg4);
                __monitor_exit(v0_1);
            }
            catch(Throwable v4) {
                try {
                label_35:
                    __monitor_exit(v0_1);
                }
                catch(Throwable v4) {
                    goto label_35;
                }

                throw v4;
            }

            if((arg4.mHasMenu) && (arg4.mMenuVisible)) {
                this.mNeedMenuInvalidate = true;
            }

            arg4.mAdded = false;
            arg4.mRemoving = true;
        }
    }

    public void removeOnBackStackChangedListener(OnBackStackChangedListener arg2) {
        if(this.mBackStackChangeListeners != null) {
            this.mBackStackChangeListeners.remove(arg2);
        }
    }

    private void removeRedundantOperationsAndExecute(ArrayList arg5, ArrayList arg6) {
        if(arg5 != null) {
            if(arg5.isEmpty()) {
            }
            else {
                if(arg6 != null && arg5.size() == arg6.size()) {
                    this.executePostponedTransaction(arg5, arg6);
                    int v0 = arg5.size();
                    int v1 = 0;
                    int v2 = 0;
                    while(v1 < v0) {
                        if(!arg5.get(v1).mReorderingAllowed) {
                            if(v2 != v1) {
                                this.executeOpsTogether(arg5, arg6, v2, v1);
                            }

                            v2 = v1 + 1;
                            if(arg6.get(v1).booleanValue()) {
                                while(v2 < v0) {
                                    if(!arg6.get(v2).booleanValue()) {
                                        break;
                                    }

                                    if(arg5.get(v2).mReorderingAllowed) {
                                        break;
                                    }

                                    ++v2;
                                }
                            }

                            this.executeOpsTogether(arg5, arg6, v1, v2);
                            v1 = v2 - 1;
                        }

                        ++v1;
                    }

                    if(v2 != v0) {
                        this.executeOpsTogether(arg5, arg6, v2, v0);
                    }

                    return;
                }

                throw new IllegalStateException("Internal error with the back stack records");
            }
        }
    }

    void reportBackStackChanged() {
        if(this.mBackStackChangeListeners != null) {
            int v0;
            for(v0 = 0; v0 < this.mBackStackChangeListeners.size(); ++v0) {
                this.mBackStackChangeListeners.get(v0).onBackStackChanged();
            }
        }
    }

    void restoreAllState(Parcelable arg13, FragmentManagerNonConfig arg14) {
        ArrayList v3_2;
        int v14_1;
        ViewModelStore v11_1;
        FragmentManagerNonConfig v10_2;
        List v4;
        List v3;
        if(arg13 == null) {
            return;
        }

        if(((FragmentManagerState)arg13).mActive == null) {
            return;
        }

        SparseArray v0 = null;
        if(arg14 != null) {
            List v2 = arg14.getFragments();
            v3 = arg14.getChildNonConfigs();
            v4 = arg14.getViewModelStores();
            int v5 = v2 != null ? v2.size() : 0;
            int v6;
            for(v6 = 0; v6 < v5; ++v6) {
                Object v7 = v2.get(v6);
                if(FragmentManagerImpl.DEBUG) {
                    Log.v("FragmentManager", "restoreAllState: re-attaching retained " + v7);
                }

                int v8;
                for(v8 = 0; v8 < ((FragmentManagerState)arg13).mActive.length; ++v8) {
                    if(((FragmentManagerState)arg13).mActive[v8].mIndex == ((Fragment)v7).mIndex) {
                        break;
                    }
                }

                if(v8 == ((FragmentManagerState)arg13).mActive.length) {
                    StringBuilder v10 = new StringBuilder();
                    v10.append("Could not find active fragment with index ");
                    v10.append(((Fragment)v7).mIndex);
                    this.throwException(new IllegalStateException(v10.toString()));
                }

                FragmentState v8_1 = ((FragmentManagerState)arg13).mActive[v8];
                v8_1.mInstance = ((Fragment)v7);
                ((Fragment)v7).mSavedViewState = v0;
                ((Fragment)v7).mBackStackNesting = 0;
                ((Fragment)v7).mInLayout = false;
                ((Fragment)v7).mAdded = false;
                ((Fragment)v7).mTarget = ((Fragment)v0);
                if(v8_1.mSavedFragmentState != null) {
                    v8_1.mSavedFragmentState.setClassLoader(this.mHost.getContext().getClassLoader());
                    ((Fragment)v7).mSavedViewState = v8_1.mSavedFragmentState.getSparseParcelableArray("android:view_state");
                    ((Fragment)v7).mSavedFragmentState = v8_1.mSavedFragmentState;
                }
            }
        }
        else {
            v3 = ((List)v0);
            v4 = v3;
        }

        this.mActive = new SparseArray(((FragmentManagerState)arg13).mActive.length);
        int v2_1;
        for(v2_1 = 0; v2_1 < ((FragmentManagerState)arg13).mActive.length; ++v2_1) {
            FragmentState v5_1 = ((FragmentManagerState)arg13).mActive[v2_1];
            if(v5_1 != null) {
                if(v3 == null || v2_1 >= v3.size()) {
                    v10_2 = ((FragmentManagerNonConfig)v0);
                }
                else {
                    Object v10_1 = v3.get(v2_1);
                }

                if(v4 == null || v2_1 >= v4.size()) {
                    v11_1 = ((ViewModelStore)v0);
                }
                else {
                    Object v11 = v4.get(v2_1);
                }

                Fragment v6_1 = v5_1.instantiate(this.mHost, this.mContainer, this.mParent, v10_2, v11_1);
                if(FragmentManagerImpl.DEBUG) {
                    Log.v("FragmentManager", "restoreAllState: active #" + v2_1 + ": " + v6_1);
                }

                this.mActive.put(v6_1.mIndex, v6_1);
                v5_1.mInstance = ((Fragment)v0);
            }
        }

        if(arg14 != null) {
            List v14 = arg14.getFragments();
            v2_1 = v14 != null ? v14.size() : 0;
            int v3_1;
            for(v3_1 = 0; v3_1 < v2_1; ++v3_1) {
                Object v4_1 = v14.get(v3_1);
                if(((Fragment)v4_1).mTargetIndex >= 0) {
                    ((Fragment)v4_1).mTarget = this.mActive.get(((Fragment)v4_1).mTargetIndex);
                    if(((Fragment)v4_1).mTarget == null) {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + v4_1 + " target no longer exists: " + ((Fragment)v4_1).mTargetIndex);
                    }
                }
            }
        }

        this.mAdded.clear();
        if(((FragmentManagerState)arg13).mAdded != null) {
            v14_1 = 0;
            while(true) {
                if(v14_1 < ((FragmentManagerState)arg13).mAdded.length) {
                    Object v2_2 = this.mActive.get(((FragmentManagerState)arg13).mAdded[v14_1]);
                    if(v2_2 == null) {
                        StringBuilder v4_2 = new StringBuilder();
                        v4_2.append("No instantiated fragment for index #");
                        v4_2.append(((FragmentManagerState)arg13).mAdded[v14_1]);
                        this.throwException(new IllegalStateException(v4_2.toString()));
                    }

                    ((Fragment)v2_2).mAdded = true;
                    if(FragmentManagerImpl.DEBUG) {
                        Log.v("FragmentManager", "restoreAllState: added #" + v14_1 + ": " + v2_2);
                    }

                    if(this.mAdded.contains(v2_2)) {
                        break;
                    }

                    v3_2 = this.mAdded;
                    __monitor_enter(v3_2);
                    try {
                        this.mAdded.add(v2_2);
                        __monitor_exit(v3_2);
                        ++v14_1;
                        continue;
                    }
                    catch(Throwable v13) {
                        goto label_208;
                    }
                }

                goto label_214;
            }

            throw new IllegalStateException("Already added!");
            try {
            label_208:
                __monitor_exit(v3_2);
            }
            catch(Throwable v13) {
                goto label_208;
            }

            throw v13;
        }

    label_214:
        if(((FragmentManagerState)arg13).mBackStack != null) {
            this.mBackStack = new ArrayList(((FragmentManagerState)arg13).mBackStack.length);
            for(v14_1 = 0; v14_1 < ((FragmentManagerState)arg13).mBackStack.length; ++v14_1) {
                BackStackRecord v0_1 = ((FragmentManagerState)arg13).mBackStack[v14_1].instantiate(this);
                if(FragmentManagerImpl.DEBUG) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + v14_1 + " (index " + v0_1.mIndex + "): " + v0_1);
                    PrintWriter v3_4 = new PrintWriter(new LogWriter("FragmentManager"));
                    v0_1.dump("  ", v3_4, false);
                    v3_4.close();
                }

                this.mBackStack.add(v0_1);
                if(v0_1.mIndex >= 0) {
                    this.setBackStackIndex(v0_1.mIndex, v0_1);
                }
            }
        }
        else {
            this.mBackStack = ((ArrayList)v0);
        }

        if(((FragmentManagerState)arg13).mPrimaryNavActiveIndex >= 0) {
            this.mPrimaryNav = this.mActive.get(((FragmentManagerState)arg13).mPrimaryNavActiveIndex);
        }

        this.mNextFragmentIndex = ((FragmentManagerState)arg13).mNextFragmentIndex;
    }

    FragmentManagerNonConfig retainNonConfig() {
        FragmentManagerImpl.setRetaining(this.mSavedNonConfig);
        return this.mSavedNonConfig;
    }

    public static int reverseTransit(int arg3) {
        int v0 = 0x2002;
        int v1 = 0x1003;
        if(arg3 != 0x1001) {
            if(arg3 == v1) {
                v0 = 0x1003;
            }
            else if(arg3 != v0) {
                v0 = 0;
            }
            else {
                v0 = 0x1001;
            }
        }

        return v0;
    }

    Parcelable saveAllState() {
        BackStackState[] v1_1;
        int[] v2_1;
        this.forcePostponedTransactions();
        this.endAnimatingAwayFragments();
        this.execPendingActions();
        this.mStateSaved = true;
        FragmentManagerNonConfig v1 = null;
        this.mSavedNonConfig = v1;
        if(this.mActive != null) {
            if(this.mActive.size() <= 0) {
            }
            else {
                int v2 = this.mActive.size();
                FragmentState[] v3 = new FragmentState[v2];
                int v4 = 0;
                int v5 = 0;
                int v6 = 0;
                while(v5 < v2) {
                    Object v7 = this.mActive.valueAt(v5);
                    if(v7 != null) {
                        if(((Fragment)v7).mIndex < 0) {
                            StringBuilder v8 = new StringBuilder();
                            v8.append("Failure saving state: active ");
                            v8.append(v7);
                            v8.append(" has cleared index: ");
                            v8.append(((Fragment)v7).mIndex);
                            this.throwException(new IllegalStateException(v8.toString()));
                        }

                        FragmentState v6_1 = new FragmentState(((Fragment)v7));
                        v3[v5] = v6_1;
                        if(((Fragment)v7).mState <= 0 || v6_1.mSavedFragmentState != null) {
                            v6_1.mSavedFragmentState = ((Fragment)v7).mSavedFragmentState;
                        }
                        else {
                            v6_1.mSavedFragmentState = this.saveFragmentBasicState(((Fragment)v7));
                            if(((Fragment)v7).mTarget != null) {
                                if(((Fragment)v7).mTarget.mIndex < 0) {
                                    StringBuilder v9 = new StringBuilder();
                                    v9.append("Failure saving state: ");
                                    v9.append(v7);
                                    v9.append(" has target not in fragment manager: ");
                                    v9.append(((Fragment)v7).mTarget);
                                    this.throwException(new IllegalStateException(v9.toString()));
                                }

                                if(v6_1.mSavedFragmentState == null) {
                                    v6_1.mSavedFragmentState = new Bundle();
                                }

                                this.putFragment(v6_1.mSavedFragmentState, "android:target_state", ((Fragment)v7).mTarget);
                                if(((Fragment)v7).mTargetRequestCode == 0) {
                                    goto label_83;
                                }

                                v6_1.mSavedFragmentState.putInt("android:target_req_state", ((Fragment)v7).mTargetRequestCode);
                            }
                        }

                    label_83:
                        if(FragmentManagerImpl.DEBUG) {
                            Log.v("FragmentManager", "Saved state of " + v7 + ": " + v6_1.mSavedFragmentState);
                        }

                        v6 = 1;
                    }

                    ++v5;
                }

                if(v6 == 0) {
                    if(FragmentManagerImpl.DEBUG) {
                        Log.v("FragmentManager", "saveAllState: no fragments!");
                    }

                    return ((Parcelable)v1);
                }

                int v0 = this.mAdded.size();
                if(v0 > 0) {
                    v2_1 = new int[v0];
                    v5 = 0;
                    goto label_112;
                }
                else {
                    v2_1 = ((int[])v1);
                    goto label_152;
                label_112:
                    while(v5 < v0) {
                        v2_1[v5] = this.mAdded.get(v5).mIndex;
                        if(v2_1[v5] < 0) {
                            StringBuilder v7_1 = new StringBuilder();
                            v7_1.append("Failure saving state: active ");
                            v7_1.append(this.mAdded.get(v5));
                            v7_1.append(" has cleared index: ");
                            v7_1.append(v2_1[v5]);
                            this.throwException(new IllegalStateException(v7_1.toString()));
                        }

                        if(FragmentManagerImpl.DEBUG) {
                            Log.v("FragmentManager", "saveAllState: adding fragment #" + v5 + ": " + this.mAdded.get(v5));
                        }

                        ++v5;
                    }
                }

            label_152:
                if(this.mBackStack != null) {
                    v0 = this.mBackStack.size();
                    if(v0 > 0) {
                        v1_1 = new BackStackState[v0];
                        while(v4 < v0) {
                            v1_1[v4] = new BackStackState(this.mBackStack.get(v4));
                            if(FragmentManagerImpl.DEBUG) {
                                Log.v("FragmentManager", "saveAllState: adding back stack #" + v4 + ": " + this.mBackStack.get(v4));
                            }

                            ++v4;
                        }
                    }
                }

                FragmentManagerState v0_1 = new FragmentManagerState();
                v0_1.mActive = v3;
                v0_1.mAdded = v2_1;
                v0_1.mBackStack = v1_1;
                if(this.mPrimaryNav != null) {
                    v0_1.mPrimaryNavActiveIndex = this.mPrimaryNav.mIndex;
                }

                v0_1.mNextFragmentIndex = this.mNextFragmentIndex;
                this.saveNonConfig();
                return ((Parcelable)v0_1);
            }
        }

        return ((Parcelable)v1);
    }

    Bundle saveFragmentBasicState(Fragment arg4) {
        Bundle v0;
        if(this.mStateBundle == null) {
            this.mStateBundle = new Bundle();
        }

        arg4.performSaveInstanceState(this.mStateBundle);
        this.dispatchOnFragmentSaveInstanceState(arg4, this.mStateBundle, false);
        Bundle v1 = null;
        if(!this.mStateBundle.isEmpty()) {
            v0 = this.mStateBundle;
            this.mStateBundle = v1;
        }
        else {
            v0 = v1;
        }

        if(arg4.mView != null) {
            this.saveFragmentViewState(arg4);
        }

        if(arg4.mSavedViewState != null) {
            if(v0 == null) {
                v0 = new Bundle();
            }

            v0.putSparseParcelableArray("android:view_state", arg4.mSavedViewState);
        }

        if(!arg4.mUserVisibleHint) {
            if(v0 == null) {
                v0 = new Bundle();
            }

            v0.putBoolean("android:user_visible_hint", arg4.mUserVisibleHint);
        }

        return v0;
    }

    @Nullable public SavedState saveFragmentInstanceState(Fragment arg4) {
        if(arg4.mIndex < 0) {
            StringBuilder v1 = new StringBuilder();
            v1.append("Fragment ");
            v1.append(arg4);
            v1.append(" is not currently in the FragmentManager");
            this.throwException(new IllegalStateException(v1.toString()));
        }

        SavedState v1_1 = null;
        if(arg4.mState > 0) {
            Bundle v4 = this.saveFragmentBasicState(arg4);
            if(v4 != null) {
                v1_1 = new SavedState(v4);
            }

            return v1_1;
        }

        return v1_1;
    }

    void saveFragmentViewState(Fragment arg3) {
        if(arg3.mInnerView == null) {
            return;
        }

        if(this.mStateArray == null) {
            this.mStateArray = new SparseArray();
        }
        else {
            this.mStateArray.clear();
        }

        arg3.mInnerView.saveHierarchyState(this.mStateArray);
        if(this.mStateArray.size() > 0) {
            arg3.mSavedViewState = this.mStateArray;
            this.mStateArray = null;
        }
    }

    void saveNonConfig() {
        FragmentManagerNonConfig v7_1;
        ArrayList v5;
        ArrayList v4;
        ArrayList v3;
        Object v1 = null;
        if(this.mActive != null) {
            v3 = ((ArrayList)v1);
            v4 = v3;
            v5 = v4;
            int v2;
            for(v2 = 0; v2 < this.mActive.size(); ++v2) {
                Object v6 = this.mActive.valueAt(v2);
                if(v6 != null) {
                    if(((Fragment)v6).mRetainInstance) {
                        if(v3 == null) {
                            v3 = new ArrayList();
                        }

                        v3.add(v6);
                        int v7 = ((Fragment)v6).mTarget != null ? ((Fragment)v6).mTarget.mIndex : -1;
                        ((Fragment)v6).mTargetIndex = v7;
                        if(!FragmentManagerImpl.DEBUG) {
                            goto label_37;
                        }

                        Log.v("FragmentManager", "retainNonConfig: keeping retained " + v6);
                    }

                label_37:
                    if(((Fragment)v6).mChildFragmentManager != null) {
                        ((Fragment)v6).mChildFragmentManager.saveNonConfig();
                        v7_1 = ((Fragment)v6).mChildFragmentManager.mSavedNonConfig;
                    }
                    else {
                        v7_1 = ((Fragment)v6).mChildNonConfig;
                    }

                    if(v4 == null && v7_1 != null) {
                        v4 = new ArrayList(this.mActive.size());
                        int v8_1;
                        for(v8_1 = 0; v8_1 < v2; ++v8_1) {
                            v4.add(v1);
                        }
                    }

                    if(v4 != null) {
                        v4.add(v7_1);
                    }

                    if(v5 == null && ((Fragment)v6).mViewModelStore != null) {
                        v5 = new ArrayList(this.mActive.size());
                        for(v7 = 0; v7 < v2; ++v7) {
                            v5.add(v1);
                        }
                    }

                    if(v5 == null) {
                        goto label_73;
                    }

                    v5.add(((Fragment)v6).mViewModelStore);
                }

            label_73:
            }
        }
        else {
            v3 = ((ArrayList)v1);
            v4 = v3;
            v5 = v4;
        }

        this.mSavedNonConfig = v3 != null || v4 != null || v5 != null ? new FragmentManagerNonConfig(((List)v3), ((List)v4), ((List)v5)) : ((FragmentManagerNonConfig)v1);
    }

    void scheduleCommit() {
        __monitor_enter(this);
        try {
            int v1 = 0;
            int v0_1 = this.mPostponedTransactions == null || (this.mPostponedTransactions.isEmpty()) ? 0 : 1;
            if(this.mPendingActions != null && this.mPendingActions.size() == 1) {
                v1 = 1;
            }

            if(v0_1 != 0 || v1 != 0) {
                this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                this.mHost.getHandler().post(this.mExecCommit);
            }

            __monitor_exit(this);
            return;
        label_30:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_30;
        }

        throw v0;
    }

    public void setBackStackIndex(int arg5, BackStackRecord arg6) {
        __monitor_enter(this);
        try {
            if(this.mBackStackIndices == null) {
                this.mBackStackIndices = new ArrayList();
            }

            int v0 = this.mBackStackIndices.size();
            if(arg5 < v0) {
                if(FragmentManagerImpl.DEBUG) {
                    Log.v("FragmentManager", "Setting back stack index " + arg5 + " to " + arg6);
                }

                this.mBackStackIndices.set(arg5, arg6);
            }
            else {
                while(v0 < arg5) {
                    this.mBackStackIndices.add(null);
                    if(this.mAvailBackStackIndices == null) {
                        this.mAvailBackStackIndices = new ArrayList();
                    }

                    if(FragmentManagerImpl.DEBUG) {
                        Log.v("FragmentManager", "Adding available back stack index " + v0);
                    }

                    this.mAvailBackStackIndices.add(Integer.valueOf(v0));
                    ++v0;
                }

                if(FragmentManagerImpl.DEBUG) {
                    Log.v("FragmentManager", "Adding back stack index " + arg5 + " with " + arg6);
                }

                this.mBackStackIndices.add(arg6);
            }

            __monitor_exit(this);
            return;
        label_67:
            __monitor_exit(this);
        }
        catch(Throwable v5) {
            goto label_67;
        }

        throw v5;
    }

    private static void setHWLayerAnimListenerIfAlpha(View arg3, AnimationOrAnimator arg4) {
        if(arg3 != null) {
            if(arg4 == null) {
            }
            else {
                if(FragmentManagerImpl.shouldRunOnHWLayer(arg3, arg4)) {
                    if(arg4.animator != null) {
                        arg4.animator.addListener(new AnimatorOnHWLayerIfNeededListener(arg3));
                    }
                    else {
                        Animation$AnimationListener v0 = FragmentManagerImpl.getAnimationListener(arg4.animation);
                        arg3.setLayerType(2, null);
                        arg4.animation.setAnimationListener(new AnimateOnHWLayerIfNeededListener(arg3, v0));
                    }
                }

                return;
            }
        }
    }

    public void setPrimaryNavigationFragment(Fragment arg4) {
        if(arg4 != null) {
            if(this.mActive.get(arg4.mIndex) == arg4) {
                if(arg4.mHost == null) {
                    goto label_22;
                }
                else if(arg4.getFragmentManager() == this) {
                    goto label_22;
                }
            }

            StringBuilder v1 = new StringBuilder();
            v1.append("Fragment ");
            v1.append(arg4);
            v1.append(" is not an active fragment of FragmentManager ");
            v1.append(this);
            throw new IllegalArgumentException(v1.toString());
        }

    label_22:
        this.mPrimaryNav = arg4;
    }

    private static void setRetaining(FragmentManagerNonConfig arg3) {
        if(arg3 == null) {
            return;
        }

        List v0 = arg3.getFragments();
        if(v0 != null) {
            Iterator v0_1 = v0.iterator();
            while(v0_1.hasNext()) {
                v0_1.next().mRetaining = true;
            }
        }

        List v3 = arg3.getChildNonConfigs();
        if(v3 != null) {
            Iterator v3_1 = v3.iterator();
            while(v3_1.hasNext()) {
                FragmentManagerImpl.setRetaining(v3_1.next());
            }
        }
    }

    static boolean shouldRunOnHWLayer(View arg3, AnimationOrAnimator arg4) {
        boolean v0 = false;
        if(arg3 != null) {
            if(arg4 == null) {
            }
            else {
                if(Build$VERSION.SDK_INT >= 19 && arg3.getLayerType() == 0 && (ViewCompat.hasOverlappingRendering(arg3)) && (FragmentManagerImpl.modifiesAlpha(arg4))) {
                    v0 = true;
                }

                return v0;
            }
        }

        return 0;
    }

    public void showFragment(Fragment arg4) {
        if(FragmentManagerImpl.DEBUG) {
            Log.v("FragmentManager", "show: " + arg4);
        }

        if(arg4.mHidden) {
            arg4.mHidden = false;
            arg4.mHiddenChanged ^= 1;
        }
    }

    void startPendingDeferredFragments() {
        if(this.mActive == null) {
            return;
        }

        int v0;
        for(v0 = 0; v0 < this.mActive.size(); ++v0) {
            Object v1 = this.mActive.valueAt(v0);
            if(v1 != null) {
                this.performPendingDeferredStart(((Fragment)v1));
            }
        }
    }

    private void throwException(RuntimeException arg6) {
        Log.e("FragmentManager", arg6.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter v1 = new PrintWriter(new LogWriter("FragmentManager"));
        FileDescriptor v3 = null;
        if(this.mHost != null) {
            try {
                this.mHost.onDump("  ", v3, v1, new String[0]);
            }
            catch(Exception v0) {
                Log.e("FragmentManager", "Failed dumping state", ((Throwable)v0));
            }

            goto label_33;
        }

        try {
            this.dump("  ", v3, v1, new String[0]);
        }
        catch(Exception v0) {
            Log.e("FragmentManager", "Failed dumping state", ((Throwable)v0));
        }

    label_33:
        throw arg6;
    }

    public String toString() {
        StringBuilder v0 = new StringBuilder(0x80);
        v0.append("FragmentManager{");
        v0.append(Integer.toHexString(System.identityHashCode(this)));
        v0.append(" in ");
        if(this.mParent != null) {
            DebugUtils.buildShortClassTag(this.mParent, v0);
        }
        else {
            DebugUtils.buildShortClassTag(this.mHost, v0);
        }

        v0.append("}}");
        return v0.toString();
    }

    public static int transitToStyleIndex(int arg1, boolean arg2) {
        if(arg1 != 0x1001) {
            if(arg1 != 0x1003) {
                if(arg1 != 0x2002) {
                    arg1 = -1;
                }
                else if(arg2) {
                    arg1 = 3;
                }
                else {
                    arg1 = 4;
                }
            }
            else if(arg2) {
                arg1 = 5;
            }
            else {
                arg1 = 6;
            }
        }
        else if(arg2) {
            arg1 = 1;
        }
        else {
            arg1 = 2;
        }

        return arg1;
    }

    public void unregisterFragmentLifecycleCallbacks(FragmentLifecycleCallbacks arg5) {
        CopyOnWriteArrayList v0 = this.mLifecycleCallbacks;
        __monitor_enter(v0);
        int v1 = 0;
        try {
            int v2 = this.mLifecycleCallbacks.size();
            while(v1 < v2) {
                if(this.mLifecycleCallbacks.get(v1).mCallback == arg5) {
                    this.mLifecycleCallbacks.remove(v1);
                }
                else {
                    ++v1;
                    continue;
                }

                break;
            }

            __monitor_exit(v0);
            return;
        label_18:
            __monitor_exit(v0);
        }
        catch(Throwable v5) {
            goto label_18;
        }

        throw v5;
    }
}

