package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.ContextMenu$ContextMenuInfo;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View$OnCreateContextMenuListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.CallSuper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.util.DebugUtils;
import androidx.core.view.LayoutInflaterCompat;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.loader.app.LoaderManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

public class Fragment implements ComponentCallbacks, View$OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner {
    class AnimationInfo {
        Boolean mAllowEnterTransitionOverlap;
        Boolean mAllowReturnTransitionOverlap;
        View mAnimatingAway;
        Animator mAnimator;
        Object mEnterTransition;
        SharedElementCallback mEnterTransitionCallback;
        boolean mEnterTransitionPostponed;
        Object mExitTransition;
        SharedElementCallback mExitTransitionCallback;
        boolean mIsHideReplaced;
        int mNextAnim;
        int mNextTransition;
        int mNextTransitionStyle;
        Object mReenterTransition;
        Object mReturnTransition;
        Object mSharedElementEnterTransition;
        Object mSharedElementReturnTransition;
        OnStartEnterTransitionListener mStartEnterTransitionListener;
        int mStateAfterAnimating;

        AnimationInfo() {
            super();
            this.mEnterTransition = null;
            this.mReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
            this.mExitTransition = null;
            this.mReenterTransition = Fragment.USE_DEFAULT_TRANSITION;
            this.mSharedElementEnterTransition = null;
            this.mSharedElementReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
            this.mEnterTransitionCallback = null;
            this.mExitTransitionCallback = null;
        }
    }

    public class InstantiationException extends RuntimeException {
        public InstantiationException(String arg1, Exception arg2) {
            super(arg1, ((Throwable)arg2));
        }
    }

    interface OnStartEnterTransitionListener {
        void onStartEnterTransition();

        void startListening();
    }

    public class SavedState implements Parcelable {
        final class androidx.fragment.app.Fragment$SavedState$1 implements Parcelable$ClassLoaderCreator {
            androidx.fragment.app.Fragment$SavedState$1() {
                super();
            }

            public SavedState createFromParcel(Parcel arg3) {
                return new SavedState(arg3, null);
            }

            public SavedState createFromParcel(Parcel arg2, ClassLoader arg3) {
                return new SavedState(arg2, arg3);
            }

            public Object createFromParcel(Parcel arg1) {
                return this.createFromParcel(arg1);
            }

            public Object createFromParcel(Parcel arg1, ClassLoader arg2) {
                return this.createFromParcel(arg1, arg2);
            }

            public SavedState[] newArray(int arg1) {
                return new SavedState[arg1];
            }

            public Object[] newArray(int arg1) {
                return this.newArray(arg1);
            }
        }

        public static final Parcelable$Creator CREATOR;
        final Bundle mState;

        static {
            SavedState.CREATOR = new androidx.fragment.app.Fragment$SavedState$1();
        }

        SavedState(Bundle arg1) {
            super();
            this.mState = arg1;
        }

        SavedState(Parcel arg1, ClassLoader arg2) {
            super();
            this.mState = arg1.readBundle();
            if(arg2 != null && this.mState != null) {
                this.mState.setClassLoader(arg2);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel arg1, int arg2) {
            arg1.writeBundle(this.mState);
        }
    }

    static final int ACTIVITY_CREATED = 2;
    static final int CREATED = 1;
    static final int INITIALIZING = 0;
    static final int RESUMED = 4;
    static final int STARTED = 3;
    static final Object USE_DEFAULT_TRANSITION;
    boolean mAdded;
    AnimationInfo mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mCalled;
    FragmentManagerImpl mChildFragmentManager;
    FragmentManagerNonConfig mChildNonConfig;
    ViewGroup mContainer;
    int mContainerId;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManagerImpl mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    FragmentHostCallback mHost;
    boolean mInLayout;
    int mIndex;
    View mInnerView;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    LayoutInflater mLayoutInflater;
    LifecycleRegistry mLifecycleRegistry;
    boolean mMenuVisible;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetaining;
    Bundle mSavedFragmentState;
    @Nullable Boolean mSavedUserVisibleHint;
    SparseArray mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetIndex;
    int mTargetRequestCode;
    boolean mUserVisibleHint;
    View mView;
    LifecycleOwner mViewLifecycleOwner;
    MutableLiveData mViewLifecycleOwnerLiveData;
    LifecycleRegistry mViewLifecycleRegistry;
    ViewModelStore mViewModelStore;
    String mWho;
    private static final SimpleArrayMap sClassMap;

    static {
        Fragment.sClassMap = new SimpleArrayMap();
        Fragment.USE_DEFAULT_TRANSITION = new Object();
    }

    public Fragment() {
        super();
        this.mState = 0;
        this.mIndex = -1;
        this.mTargetIndex = -1;
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mLifecycleRegistry = new LifecycleRegistry(((LifecycleOwner)this));
        this.mViewLifecycleOwnerLiveData = new MutableLiveData();
    }

    void callStartTransitionListener() {
        OnStartEnterTransitionListener v0;
        OnStartEnterTransitionListener v1 = null;
        if(this.mAnimationInfo == null) {
            v0 = v1;
        }
        else {
            this.mAnimationInfo.mEnterTransitionPostponed = false;
            v0 = this.mAnimationInfo.mStartEnterTransitionListener;
            this.mAnimationInfo.mStartEnterTransitionListener = v1;
        }

        if(v0 != null) {
            v0.onStartEnterTransition();
        }
    }

    public void dump(String arg3, FileDescriptor arg4, PrintWriter arg5, String[] arg6) {
        arg5.print(arg3);
        arg5.print("mFragmentId=#");
        arg5.print(Integer.toHexString(this.mFragmentId));
        arg5.print(" mContainerId=#");
        arg5.print(Integer.toHexString(this.mContainerId));
        arg5.print(" mTag=");
        arg5.println(this.mTag);
        arg5.print(arg3);
        arg5.print("mState=");
        arg5.print(this.mState);
        arg5.print(" mIndex=");
        arg5.print(this.mIndex);
        arg5.print(" mWho=");
        arg5.print(this.mWho);
        arg5.print(" mBackStackNesting=");
        arg5.println(this.mBackStackNesting);
        arg5.print(arg3);
        arg5.print("mAdded=");
        arg5.print(this.mAdded);
        arg5.print(" mRemoving=");
        arg5.print(this.mRemoving);
        arg5.print(" mFromLayout=");
        arg5.print(this.mFromLayout);
        arg5.print(" mInLayout=");
        arg5.println(this.mInLayout);
        arg5.print(arg3);
        arg5.print("mHidden=");
        arg5.print(this.mHidden);
        arg5.print(" mDetached=");
        arg5.print(this.mDetached);
        arg5.print(" mMenuVisible=");
        arg5.print(this.mMenuVisible);
        arg5.print(" mHasMenu=");
        arg5.println(this.mHasMenu);
        arg5.print(arg3);
        arg5.print("mRetainInstance=");
        arg5.print(this.mRetainInstance);
        arg5.print(" mRetaining=");
        arg5.print(this.mRetaining);
        arg5.print(" mUserVisibleHint=");
        arg5.println(this.mUserVisibleHint);
        if(this.mFragmentManager != null) {
            arg5.print(arg3);
            arg5.print("mFragmentManager=");
            arg5.println(this.mFragmentManager);
        }

        if(this.mHost != null) {
            arg5.print(arg3);
            arg5.print("mHost=");
            arg5.println(this.mHost);
        }

        if(this.mParentFragment != null) {
            arg5.print(arg3);
            arg5.print("mParentFragment=");
            arg5.println(this.mParentFragment);
        }

        if(this.mArguments != null) {
            arg5.print(arg3);
            arg5.print("mArguments=");
            arg5.println(this.mArguments);
        }

        if(this.mSavedFragmentState != null) {
            arg5.print(arg3);
            arg5.print("mSavedFragmentState=");
            arg5.println(this.mSavedFragmentState);
        }

        if(this.mSavedViewState != null) {
            arg5.print(arg3);
            arg5.print("mSavedViewState=");
            arg5.println(this.mSavedViewState);
        }

        if(this.mTarget != null) {
            arg5.print(arg3);
            arg5.print("mTarget=");
            arg5.print(this.mTarget);
            arg5.print(" mTargetRequestCode=");
            arg5.println(this.mTargetRequestCode);
        }

        if(this.getNextAnim() != 0) {
            arg5.print(arg3);
            arg5.print("mNextAnim=");
            arg5.println(this.getNextAnim());
        }

        if(this.mContainer != null) {
            arg5.print(arg3);
            arg5.print("mContainer=");
            arg5.println(this.mContainer);
        }

        if(this.mView != null) {
            arg5.print(arg3);
            arg5.print("mView=");
            arg5.println(this.mView);
        }

        if(this.mInnerView != null) {
            arg5.print(arg3);
            arg5.print("mInnerView=");
            arg5.println(this.mView);
        }

        if(this.getAnimatingAway() != null) {
            arg5.print(arg3);
            arg5.print("mAnimatingAway=");
            arg5.println(this.getAnimatingAway());
            arg5.print(arg3);
            arg5.print("mStateAfterAnimating=");
            arg5.println(this.getStateAfterAnimating());
        }

        if(this.getContext() != null) {
            LoaderManager.getInstance(((LifecycleOwner)this)).dump(arg3, arg4, arg5, arg6);
        }

        if(this.mChildFragmentManager != null) {
            arg5.print(arg3);
            arg5.println("Child " + this.mChildFragmentManager + ":");
            FragmentManagerImpl v0_1 = this.mChildFragmentManager;
            v0_1.dump(arg3 + "  ", arg4, arg5, arg6);
        }
    }

    private AnimationInfo ensureAnimationInfo() {
        if(this.mAnimationInfo == null) {
            this.mAnimationInfo = new AnimationInfo();
        }

        return this.mAnimationInfo;
    }

    public final boolean equals(Object arg1) {
        return super.equals(arg1);
    }

    Fragment findFragmentByWho(String arg2) {
        if(arg2.equals(this.mWho)) {
            return this;
        }

        if(this.mChildFragmentManager != null) {
            return this.mChildFragmentManager.findFragmentByWho(arg2);
        }

        return null;
    }

    @Nullable public final FragmentActivity getActivity() {
        FragmentActivity v0;
        if(this.mHost == null) {
            v0 = null;
        }
        else {
            Activity v0_1 = this.mHost.getActivity();
        }

        return v0;
    }

    public boolean getAllowEnterTransitionOverlap() {
        boolean v0 = this.mAnimationInfo == null || this.mAnimationInfo.mAllowEnterTransitionOverlap == null ? true : this.mAnimationInfo.mAllowEnterTransitionOverlap.booleanValue();
        return v0;
    }

    public boolean getAllowReturnTransitionOverlap() {
        boolean v0 = this.mAnimationInfo == null || this.mAnimationInfo.mAllowReturnTransitionOverlap == null ? true : this.mAnimationInfo.mAllowReturnTransitionOverlap.booleanValue();
        return v0;
    }

    View getAnimatingAway() {
        if(this.mAnimationInfo == null) {
            return null;
        }

        return this.mAnimationInfo.mAnimatingAway;
    }

    Animator getAnimator() {
        if(this.mAnimationInfo == null) {
            return null;
        }

        return this.mAnimationInfo.mAnimator;
    }

    @Nullable public final Bundle getArguments() {
        return this.mArguments;
    }

    @NonNull public final FragmentManager getChildFragmentManager() {
        if(this.mChildFragmentManager == null) {
            this.instantiateChildFragmentManager();
            if(this.mState >= 4) {
                this.mChildFragmentManager.dispatchResume();
            }
            else if(this.mState >= 3) {
                this.mChildFragmentManager.dispatchStart();
            }
            else if(this.mState >= 2) {
                this.mChildFragmentManager.dispatchActivityCreated();
            }
            else if(this.mState >= 1) {
                this.mChildFragmentManager.dispatchCreate();
            }
        }

        return this.mChildFragmentManager;
    }

    @Nullable public Context getContext() {
        Context v0 = this.mHost == null ? null : this.mHost.getContext();
        return v0;
    }

    @Nullable public Object getEnterTransition() {
        if(this.mAnimationInfo == null) {
            return null;
        }

        return this.mAnimationInfo.mEnterTransition;
    }

    SharedElementCallback getEnterTransitionCallback() {
        if(this.mAnimationInfo == null) {
            return null;
        }

        return this.mAnimationInfo.mEnterTransitionCallback;
    }

    @Nullable public Object getExitTransition() {
        if(this.mAnimationInfo == null) {
            return null;
        }

        return this.mAnimationInfo.mExitTransition;
    }

    SharedElementCallback getExitTransitionCallback() {
        if(this.mAnimationInfo == null) {
            return null;
        }

        return this.mAnimationInfo.mExitTransitionCallback;
    }

    @Nullable public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @Nullable public final Object getHost() {
        Object v0 = this.mHost == null ? null : this.mHost.onGetHost();
        return v0;
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        if(this.mLayoutInflater == null) {
            return this.performGetLayoutInflater(null);
        }

        return this.mLayoutInflater;
    }

    @NonNull @RestrictTo(value={Scope.LIBRARY_GROUP}) @Deprecated public LayoutInflater getLayoutInflater(@Nullable Bundle arg2) {
        if(this.mHost != null) {
            LayoutInflater v2 = this.mHost.onGetLayoutInflater();
            this.getChildFragmentManager();
            LayoutInflaterCompat.setFactory2(v2, this.mChildFragmentManager.getLayoutInflaterFactory());
            return v2;
        }

        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated public LoaderManager getLoaderManager() {
        return LoaderManager.getInstance(((LifecycleOwner)this));
    }

    int getNextAnim() {
        if(this.mAnimationInfo == null) {
            return 0;
        }

        return this.mAnimationInfo.mNextAnim;
    }

    int getNextTransition() {
        if(this.mAnimationInfo == null) {
            return 0;
        }

        return this.mAnimationInfo.mNextTransition;
    }

    int getNextTransitionStyle() {
        if(this.mAnimationInfo == null) {
            return 0;
        }

        return this.mAnimationInfo.mNextTransitionStyle;
    }

    @Nullable public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public Object getReenterTransition() {
        if(this.mAnimationInfo == null) {
            return null;
        }

        Object v0 = this.mAnimationInfo.mReenterTransition == Fragment.USE_DEFAULT_TRANSITION ? this.getExitTransition() : this.mAnimationInfo.mReenterTransition;
        return v0;
    }

    @NonNull public final Resources getResources() {
        return this.requireContext().getResources();
    }

    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    @Nullable public Object getReturnTransition() {
        if(this.mAnimationInfo == null) {
            return null;
        }

        Object v0 = this.mAnimationInfo.mReturnTransition == Fragment.USE_DEFAULT_TRANSITION ? this.getEnterTransition() : this.mAnimationInfo.mReturnTransition;
        return v0;
    }

    @Nullable public Object getSharedElementEnterTransition() {
        if(this.mAnimationInfo == null) {
            return null;
        }

        return this.mAnimationInfo.mSharedElementEnterTransition;
    }

    @Nullable public Object getSharedElementReturnTransition() {
        if(this.mAnimationInfo == null) {
            return null;
        }

        Object v0 = this.mAnimationInfo.mSharedElementReturnTransition == Fragment.USE_DEFAULT_TRANSITION ? this.getSharedElementEnterTransition() : this.mAnimationInfo.mSharedElementReturnTransition;
        return v0;
    }

    int getStateAfterAnimating() {
        if(this.mAnimationInfo == null) {
            return 0;
        }

        return this.mAnimationInfo.mStateAfterAnimating;
    }

    @NonNull public final String getString(@StringRes int arg2) {
        return this.getResources().getString(arg2);
    }

    @NonNull public final String getString(@StringRes int arg2, Object[] arg3) {
        return this.getResources().getString(arg2, arg3);
    }

    @Nullable public final String getTag() {
        return this.mTag;
    }

    @Nullable public final Fragment getTargetFragment() {
        return this.mTarget;
    }

    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    @NonNull public final CharSequence getText(@StringRes int arg2) {
        return this.getResources().getText(arg2);
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Nullable public View getView() {
        return this.mView;
    }

    @MainThread @NonNull public LifecycleOwner getViewLifecycleOwner() {
        if(this.mViewLifecycleOwner != null) {
            return this.mViewLifecycleOwner;
        }

        throw new IllegalStateException("Can\'t access the Fragment View\'s LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @NonNull public LiveData getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @NonNull public ViewModelStore getViewModelStore() {
        if(this.getContext() != null) {
            if(this.mViewModelStore == null) {
                this.mViewModelStore = new ViewModelStore();
            }

            return this.mViewModelStore;
        }

        throw new IllegalStateException("Can\'t access ViewModels from detached fragment");
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        this.mIndex = -1;
        this.mWho = null;
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = null;
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
        this.mRetaining = false;
    }

    public static Fragment instantiate(Context arg2, String arg3, @Nullable Bundle arg4) {
        StringBuilder v0_2;
        Object v2_5;
        try {
            Object v0 = Fragment.sClassMap.get(arg3);
            if(v0 == null) {
                Class v0_1 = arg2.getClassLoader().loadClass(arg3);
                Fragment.sClassMap.put(arg3, v0_1);
            }

            v2_5 = ((Class)v0).getConstructor().newInstance();
            if(arg4 != null) {
                arg4.setClassLoader(v2_5.getClass().getClassLoader());
                ((Fragment)v2_5).setArguments(arg4);
            }
        }
        catch(InvocationTargetException v2) {
            v0_2 = new StringBuilder();
            v0_2.append("Unable to instantiate fragment ");
            v0_2.append(arg3);
            v0_2.append(": calling Fragment constructor caused an exception");
            throw new InstantiationException(v0_2.toString(), ((Exception)v2));
        }
        catch(NoSuchMethodException v2_1) {
            v0_2 = new StringBuilder();
            v0_2.append("Unable to instantiate fragment ");
            v0_2.append(arg3);
            v0_2.append(": could not find Fragment constructor");
            throw new InstantiationException(v0_2.toString(), ((Exception)v2_1));
        }
        catch(IllegalAccessException v2_2) {
            v0_2 = new StringBuilder();
            v0_2.append("Unable to instantiate fragment ");
            v0_2.append(arg3);
            v0_2.append(": make sure class name exists, is public, and has an");
            v0_2.append(" empty constructor that is public");
            throw new InstantiationException(v0_2.toString(), ((Exception)v2_2));
        }
        catch(java.lang.InstantiationException v2_3) {
            v0_2 = new StringBuilder();
            v0_2.append("Unable to instantiate fragment ");
            v0_2.append(arg3);
            v0_2.append(": make sure class name exists, is public, and has an");
            v0_2.append(" empty constructor that is public");
            throw new InstantiationException(v0_2.toString(), ((Exception)v2_3));
        }
        catch(ClassNotFoundException v2_4) {
            v0_2 = new StringBuilder();
            v0_2.append("Unable to instantiate fragment ");
            v0_2.append(arg3);
            v0_2.append(": make sure class name exists, is public, and has an");
            v0_2.append(" empty constructor that is public");
            throw new InstantiationException(v0_2.toString(), ((Exception)v2_4));
        }

        return ((Fragment)v2_5);
    }

    public static Fragment instantiate(Context arg1, String arg2) {
        return Fragment.instantiate(arg1, arg2, null);
    }

    void instantiateChildFragmentManager() {
        if(this.mHost != null) {
            this.mChildFragmentManager = new FragmentManagerImpl();
            this.mChildFragmentManager.attachController(this.mHost, new FragmentContainer() {
                public Fragment instantiate(Context arg2, String arg3, Bundle arg4) {
                    return Fragment.this.mHost.instantiate(arg2, arg3, arg4);
                }

                @Nullable public View onFindViewById(int arg2) {
                    if(Fragment.this.mView != null) {
                        return Fragment.this.mView.findViewById(arg2);
                    }

                    throw new IllegalStateException("Fragment does not have a view");
                }

                public boolean onHasView() {
                    boolean v0 = Fragment.this.mView != null ? true : false;
                    return v0;
                }
            }, this);
            return;
        }

        throw new IllegalStateException("Fragment has not been attached yet.");
    }

    public final boolean isAdded() {
        boolean v0 = this.mHost == null || !this.mAdded ? false : true;
        return v0;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    boolean isHideReplaced() {
        if(this.mAnimationInfo == null) {
            return 0;
        }

        return this.mAnimationInfo.mIsHideReplaced;
    }

    final boolean isInBackStack() {
        boolean v0 = this.mBackStackNesting > 0 ? true : false;
        return v0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public final boolean isMenuVisible() {
        return this.mMenuVisible;
    }

    boolean isPostponed() {
        if(this.mAnimationInfo == null) {
            return 0;
        }

        return this.mAnimationInfo.mEnterTransitionPostponed;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        boolean v0 = this.mState >= 4 ? true : false;
        return v0;
    }

    public final boolean isStateSaved() {
        if(this.mFragmentManager == null) {
            return 0;
        }

        return this.mFragmentManager.isStateSaved();
    }

    static boolean isSupportFragmentClass(Context arg1, String arg2) {
        try {
            Object v0 = Fragment.sClassMap.get(arg2);
            if(v0 == null) {
                Class v0_1 = arg1.getClassLoader().loadClass(arg2);
                Fragment.sClassMap.put(arg2, v0_1);
            }

            return Fragment.class.isAssignableFrom(((Class)v0));
        }
        catch(ClassNotFoundException ) {
            return 0;
        }
    }

    public final boolean isVisible() {
        boolean v0 = !this.isAdded() || (this.isHidden()) || this.mView == null || this.mView.getWindowToken() == null || this.mView.getVisibility() != 0 ? false : true;
        return v0;
    }

    void noteStateNotSaved() {
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.noteStateNotSaved();
        }
    }

    @CallSuper public void onActivityCreated(@Nullable Bundle arg1) {
        this.mCalled = true;
    }

    public void onActivityResult(int arg1, int arg2, Intent arg3) {
    }

    @CallSuper @Deprecated public void onAttach(Activity arg1) {
        this.mCalled = true;
    }

    @CallSuper public void onAttach(Context arg2) {
        this.mCalled = true;
        Activity v2 = this.mHost == null ? null : this.mHost.getActivity();
        if(v2 != null) {
            this.mCalled = false;
            this.onAttach(v2);
        }
    }

    public void onAttachFragment(Fragment arg1) {
    }

    @CallSuper public void onConfigurationChanged(Configuration arg1) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem arg1) {
        return 0;
    }

    @CallSuper public void onCreate(@Nullable Bundle arg2) {
        this.mCalled = true;
        this.restoreChildFragmentState(arg2);
        if(this.mChildFragmentManager != null && !this.mChildFragmentManager.isStateAtLeast(1)) {
            this.mChildFragmentManager.dispatchCreate();
        }
    }

    public Animation onCreateAnimation(int arg1, boolean arg2, int arg3) {
        return null;
    }

    public Animator onCreateAnimator(int arg1, boolean arg2, int arg3) {
        return null;
    }

    public void onCreateContextMenu(ContextMenu arg2, View arg3, ContextMenu$ContextMenuInfo arg4) {
        this.getActivity().onCreateContextMenu(arg2, arg3, arg4);
    }

    public void onCreateOptionsMenu(Menu arg1, MenuInflater arg2) {
    }

    @Nullable public View onCreateView(@NonNull LayoutInflater arg1, @Nullable ViewGroup arg2, @Nullable Bundle arg3) {
        return null;
    }

    @CallSuper public void onDestroy() {
        int v0 = 1;
        this.mCalled = true;
        FragmentActivity v1 = this.getActivity();
        if(v1 == null || !v1.isChangingConfigurations()) {
            v0 = 0;
        }
        else {
        }

        if(this.mViewModelStore != null && v0 == 0) {
            this.mViewModelStore.clear();
        }
    }

    public void onDestroyOptionsMenu() {
    }

    @CallSuper public void onDestroyView() {
        this.mCalled = true;
        if(this.mView != null) {
            this.mViewLifecycleRegistry.handleLifecycleEvent(Event.ON_DESTROY);
        }
    }

    @CallSuper public void onDetach() {
        this.mCalled = true;
    }

    @NonNull public LayoutInflater onGetLayoutInflater(@Nullable Bundle arg1) {
        return this.getLayoutInflater(arg1);
    }

    public void onHiddenChanged(boolean arg1) {
    }

    @CallSuper @Deprecated public void onInflate(Activity arg1, AttributeSet arg2, Bundle arg3) {
        this.mCalled = true;
    }

    @CallSuper public void onInflate(Context arg2, AttributeSet arg3, Bundle arg4) {
        this.mCalled = true;
        Activity v2 = this.mHost == null ? null : this.mHost.getActivity();
        if(v2 != null) {
            this.mCalled = false;
            this.onInflate(v2, arg3, arg4);
        }
    }

    @CallSuper public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean arg1) {
    }

    public boolean onOptionsItemSelected(MenuItem arg1) {
        return 0;
    }

    public void onOptionsMenuClosed(Menu arg1) {
    }

    @CallSuper public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean arg1) {
    }

    public void onPrepareOptionsMenu(Menu arg1) {
    }

    public void onRequestPermissionsResult(int arg1, @NonNull String[] arg2, @NonNull int[] arg3) {
    }

    @CallSuper public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(@NonNull Bundle arg1) {
    }

    @CallSuper public void onStart() {
        this.mCalled = true;
    }

    @CallSuper public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(@NonNull View arg1, @Nullable Bundle arg2) {
    }

    @CallSuper public void onViewStateRestored(@Nullable Bundle arg2) {
        this.mCalled = true;
        if(this.mView != null) {
            this.mViewLifecycleRegistry.handleLifecycleEvent(Event.ON_CREATE);
        }
    }

    @Nullable FragmentManager peekChildFragmentManager() {
        return this.mChildFragmentManager;
    }

    void performActivityCreated(Bundle arg3) {
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.noteStateNotSaved();
        }

        this.mState = 2;
        this.mCalled = false;
        this.onActivityCreated(arg3);
        if(this.mCalled) {
            if(this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchActivityCreated();
            }

            return;
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("Fragment ");
        v0.append(this);
        v0.append(" did not call through to super.onActivityCreated()");
        throw new SuperNotCalledException(v0.toString());
    }

    void performConfigurationChanged(Configuration arg2) {
        this.onConfigurationChanged(arg2);
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.dispatchConfigurationChanged(arg2);
        }
    }

    boolean performContextItemSelected(MenuItem arg3) {
        if(!this.mHidden) {
            if(this.onContextItemSelected(arg3)) {
                return 1;
            }
            else if(this.mChildFragmentManager != null && (this.mChildFragmentManager.dispatchContextItemSelected(arg3))) {
                return 1;
            }
        }

        return 0;
    }

    void performCreate(Bundle arg3) {
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.noteStateNotSaved();
        }

        this.mState = 1;
        this.mCalled = false;
        this.onCreate(arg3);
        this.mIsCreated = true;
        if(this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Event.ON_CREATE);
            return;
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("Fragment ");
        v0.append(this);
        v0.append(" did not call through to super.onCreate()");
        throw new SuperNotCalledException(v0.toString());
    }

    boolean performCreateOptionsMenu(Menu arg3, MenuInflater arg4) {
        int v1 = 0;
        if(!this.mHidden) {
            if((this.mHasMenu) && (this.mMenuVisible)) {
                v1 = 1;
                this.onCreateOptionsMenu(arg3, arg4);
            }

            if(this.mChildFragmentManager == null) {
                goto label_14;
            }

            v1 |= this.mChildFragmentManager.dispatchCreateOptionsMenu(arg3, arg4);
        }

    label_14:
        return ((boolean)v1);
    }

    void performCreateView(@NonNull LayoutInflater arg2, @Nullable ViewGroup arg3, @Nullable Bundle arg4) {
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.noteStateNotSaved();
        }

        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new LifecycleOwner() {
            public Lifecycle getLifecycle() {
                if(Fragment.this.mViewLifecycleRegistry == null) {
                    Fragment.this.mViewLifecycleRegistry = new LifecycleRegistry(Fragment.this.mViewLifecycleOwner);
                }

                return Fragment.this.mViewLifecycleRegistry;
            }
        };
        LifecycleRegistry v0 = null;
        this.mViewLifecycleRegistry = v0;
        this.mView = this.onCreateView(arg2, arg3, arg4);
        if(this.mView != null) {
            this.mViewLifecycleOwner.getLifecycle();
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        }
        else if(this.mViewLifecycleRegistry == null) {
            this.mViewLifecycleOwner = ((LifecycleOwner)v0);
        }
        else {
            goto label_25;
        }

        return;
    label_25:
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    void performDestroy() {
        this.mLifecycleRegistry.handleLifecycleEvent(Event.ON_DESTROY);
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.dispatchDestroy();
        }

        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        this.onDestroy();
        if(this.mCalled) {
            this.mChildFragmentManager = null;
            return;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Fragment ");
        v1.append(this);
        v1.append(" did not call through to super.onDestroy()");
        throw new SuperNotCalledException(v1.toString());
    }

    void performDestroyView() {
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.dispatchDestroyView();
        }

        this.mState = 1;
        this.mCalled = false;
        this.onDestroyView();
        if(this.mCalled) {
            LoaderManager.getInstance(((LifecycleOwner)this)).markForRedelivery();
            this.mPerformedCreateView = false;
            return;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Fragment ");
        v1.append(this);
        v1.append(" did not call through to super.onDestroyView()");
        throw new SuperNotCalledException(v1.toString());
    }

    void performDetach() {
        StringBuilder v1;
        this.mCalled = false;
        this.onDetach();
        LayoutInflater v0 = null;
        this.mLayoutInflater = v0;
        if(this.mCalled) {
            if(this.mChildFragmentManager != null) {
                if(this.mRetaining) {
                    this.mChildFragmentManager.dispatchDestroy();
                    this.mChildFragmentManager = ((FragmentManagerImpl)v0);
                }
                else {
                    v1 = new StringBuilder();
                    v1.append("Child FragmentManager of ");
                    v1.append(this);
                    v1.append(" was not ");
                    v1.append(" destroyed and this fragment is not retaining instance");
                    throw new IllegalStateException(v1.toString());
                }
            }

            return;
        }

        v1 = new StringBuilder();
        v1.append("Fragment ");
        v1.append(this);
        v1.append(" did not call through to super.onDetach()");
        throw new SuperNotCalledException(v1.toString());
    }

    @NonNull LayoutInflater performGetLayoutInflater(@Nullable Bundle arg1) {
        this.mLayoutInflater = this.onGetLayoutInflater(arg1);
        return this.mLayoutInflater;
    }

    void performLowMemory() {
        this.onLowMemory();
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.dispatchLowMemory();
        }
    }

    void performMultiWindowModeChanged(boolean arg2) {
        this.onMultiWindowModeChanged(arg2);
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.dispatchMultiWindowModeChanged(arg2);
        }
    }

    boolean performOptionsItemSelected(MenuItem arg3) {
        if(!this.mHidden) {
            if((this.mHasMenu) && (this.mMenuVisible) && (this.onOptionsItemSelected(arg3))) {
                return 1;
            }

            if(this.mChildFragmentManager == null) {
                return 0;
            }

            if(!this.mChildFragmentManager.dispatchOptionsItemSelected(arg3)) {
                return 0;
            }

            return 1;
        }

        return 0;
    }

    void performOptionsMenuClosed(Menu arg2) {
        if(!this.mHidden) {
            if((this.mHasMenu) && (this.mMenuVisible)) {
                this.onOptionsMenuClosed(arg2);
            }

            if(this.mChildFragmentManager == null) {
                return;
            }

            this.mChildFragmentManager.dispatchOptionsMenuClosed(arg2);
        }
    }

    void performPause() {
        if(this.mView != null) {
            this.mViewLifecycleRegistry.handleLifecycleEvent(Event.ON_PAUSE);
        }

        this.mLifecycleRegistry.handleLifecycleEvent(Event.ON_PAUSE);
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.dispatchPause();
        }

        this.mState = 3;
        this.mCalled = false;
        this.onPause();
        if(this.mCalled) {
            return;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Fragment ");
        v1.append(this);
        v1.append(" did not call through to super.onPause()");
        throw new SuperNotCalledException(v1.toString());
    }

    void performPictureInPictureModeChanged(boolean arg2) {
        this.onPictureInPictureModeChanged(arg2);
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.dispatchPictureInPictureModeChanged(arg2);
        }
    }

    boolean performPrepareOptionsMenu(Menu arg3) {
        int v1 = 0;
        if(!this.mHidden) {
            if((this.mHasMenu) && (this.mMenuVisible)) {
                v1 = 1;
                this.onPrepareOptionsMenu(arg3);
            }

            if(this.mChildFragmentManager == null) {
                goto label_14;
            }

            v1 |= this.mChildFragmentManager.dispatchPrepareOptionsMenu(arg3);
        }

    label_14:
        return ((boolean)v1);
    }

    void performResume() {
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.noteStateNotSaved();
            this.mChildFragmentManager.execPendingActions();
        }

        this.mState = 4;
        this.mCalled = false;
        this.onResume();
        if(this.mCalled) {
            if(this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchResume();
                this.mChildFragmentManager.execPendingActions();
            }

            this.mLifecycleRegistry.handleLifecycleEvent(Event.ON_RESUME);
            if(this.mView != null) {
                this.mViewLifecycleRegistry.handleLifecycleEvent(Event.ON_RESUME);
            }

            return;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Fragment ");
        v1.append(this);
        v1.append(" did not call through to super.onResume()");
        throw new SuperNotCalledException(v1.toString());
    }

    void performSaveInstanceState(Bundle arg3) {
        this.onSaveInstanceState(arg3);
        if(this.mChildFragmentManager != null) {
            Parcelable v0 = this.mChildFragmentManager.saveAllState();
            if(v0 != null) {
                arg3.putParcelable("android:support:fragments", v0);
            }
        }
    }

    void performStart() {
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.noteStateNotSaved();
            this.mChildFragmentManager.execPendingActions();
        }

        this.mState = 3;
        this.mCalled = false;
        this.onStart();
        if(this.mCalled) {
            if(this.mChildFragmentManager != null) {
                this.mChildFragmentManager.dispatchStart();
            }

            this.mLifecycleRegistry.handleLifecycleEvent(Event.ON_START);
            if(this.mView != null) {
                this.mViewLifecycleRegistry.handleLifecycleEvent(Event.ON_START);
            }

            return;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Fragment ");
        v1.append(this);
        v1.append(" did not call through to super.onStart()");
        throw new SuperNotCalledException(v1.toString());
    }

    void performStop() {
        this.mLifecycleRegistry.handleLifecycleEvent(Event.ON_STOP);
        if(this.mChildFragmentManager != null) {
            this.mChildFragmentManager.dispatchStop();
        }

        this.mState = 2;
        this.mCalled = false;
        this.onStop();
        if(this.mCalled) {
            return;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Fragment ");
        v1.append(this);
        v1.append(" did not call through to super.onStop()");
        throw new SuperNotCalledException(v1.toString());
    }

    public void postponeEnterTransition() {
        this.ensureAnimationInfo().mEnterTransitionPostponed = true;
    }

    public void registerForContextMenu(View arg1) {
        arg1.setOnCreateContextMenuListener(((View$OnCreateContextMenuListener)this));
    }

    public final void requestPermissions(@NonNull String[] arg2, int arg3) {
        if(this.mHost != null) {
            this.mHost.onRequestPermissionsFromFragment(this, arg2, arg3);
            return;
        }

        StringBuilder v3 = new StringBuilder();
        v3.append("Fragment ");
        v3.append(this);
        v3.append(" not attached to Activity");
        throw new IllegalStateException(v3.toString());
    }

    @NonNull public final FragmentActivity requireActivity() {
        FragmentActivity v0 = this.getActivity();
        if(v0 != null) {
            return v0;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Fragment ");
        v1.append(this);
        v1.append(" not attached to an activity.");
        throw new IllegalStateException(v1.toString());
    }

    @NonNull public final Context requireContext() {
        Context v0 = this.getContext();
        if(v0 != null) {
            return v0;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Fragment ");
        v1.append(this);
        v1.append(" not attached to a context.");
        throw new IllegalStateException(v1.toString());
    }

    @NonNull public final FragmentManager requireFragmentManager() {
        FragmentManager v0 = this.getFragmentManager();
        if(v0 != null) {
            return v0;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Fragment ");
        v1.append(this);
        v1.append(" not associated with a fragment manager.");
        throw new IllegalStateException(v1.toString());
    }

    @NonNull public final Object requireHost() {
        Object v0 = this.getHost();
        if(v0 != null) {
            return v0;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Fragment ");
        v1.append(this);
        v1.append(" not attached to a host.");
        throw new IllegalStateException(v1.toString());
    }

    void restoreChildFragmentState(@Nullable Bundle arg3) {
        if(arg3 != null) {
            Parcelable v3 = arg3.getParcelable("android:support:fragments");
            if(v3 != null) {
                if(this.mChildFragmentManager == null) {
                    this.instantiateChildFragmentManager();
                }

                this.mChildFragmentManager.restoreAllState(v3, this.mChildNonConfig);
                this.mChildNonConfig = null;
                this.mChildFragmentManager.dispatchCreate();
            }
        }
    }

    final void restoreViewState(Bundle arg3) {
        if(this.mSavedViewState != null) {
            this.mInnerView.restoreHierarchyState(this.mSavedViewState);
            this.mSavedViewState = null;
        }

        this.mCalled = false;
        this.onViewStateRestored(arg3);
        if(this.mCalled) {
            return;
        }

        StringBuilder v0 = new StringBuilder();
        v0.append("Fragment ");
        v0.append(this);
        v0.append(" did not call through to super.onViewStateRestored()");
        throw new SuperNotCalledException(v0.toString());
    }

    public void setAllowEnterTransitionOverlap(boolean arg2) {
        this.ensureAnimationInfo().mAllowEnterTransitionOverlap = Boolean.valueOf(arg2);
    }

    public void setAllowReturnTransitionOverlap(boolean arg2) {
        this.ensureAnimationInfo().mAllowReturnTransitionOverlap = Boolean.valueOf(arg2);
    }

    void setAnimatingAway(View arg2) {
        this.ensureAnimationInfo().mAnimatingAway = arg2;
    }

    void setAnimator(Animator arg2) {
        this.ensureAnimationInfo().mAnimator = arg2;
    }

    public void setArguments(@Nullable Bundle arg2) {
        if(this.mIndex >= 0) {
            if(!this.isStateSaved()) {
            }
            else {
                throw new IllegalStateException("Fragment already active and state has been saved");
            }
        }

        this.mArguments = arg2;
    }

    public void setEnterSharedElementCallback(SharedElementCallback arg2) {
        this.ensureAnimationInfo().mEnterTransitionCallback = arg2;
    }

    public void setEnterTransition(@Nullable Object arg2) {
        this.ensureAnimationInfo().mEnterTransition = arg2;
    }

    public void setExitSharedElementCallback(SharedElementCallback arg2) {
        this.ensureAnimationInfo().mExitTransitionCallback = arg2;
    }

    public void setExitTransition(@Nullable Object arg2) {
        this.ensureAnimationInfo().mExitTransition = arg2;
    }

    public void setHasOptionsMenu(boolean arg2) {
        if(this.mHasMenu != arg2) {
            this.mHasMenu = arg2;
            if((this.isAdded()) && !this.isHidden()) {
                this.mHost.onSupportInvalidateOptionsMenu();
            }
        }
    }

    void setHideReplaced(boolean arg2) {
        this.ensureAnimationInfo().mIsHideReplaced = arg2;
    }

    final void setIndex(int arg1, Fragment arg2) {
        this.mIndex = arg1;
        this.mWho = arg2 != null ? arg2.mWho + ":" + this.mIndex : "android:fragment:" + this.mIndex;
    }

    public void setInitialSavedState(@Nullable SavedState arg2) {
        if(this.mIndex < 0) {
            Bundle v2 = arg2 == null || arg2.mState == null ? null : arg2.mState;
            this.mSavedFragmentState = v2;
            return;
        }

        throw new IllegalStateException("Fragment already active");
    }

    public void setMenuVisibility(boolean arg2) {
        if(this.mMenuVisible != arg2) {
            this.mMenuVisible = arg2;
            if((this.mHasMenu) && (this.isAdded()) && !this.isHidden()) {
                this.mHost.onSupportInvalidateOptionsMenu();
            }
        }
    }

    void setNextAnim(int arg2) {
        if(this.mAnimationInfo == null && arg2 == 0) {
            return;
        }

        this.ensureAnimationInfo().mNextAnim = arg2;
    }

    void setNextTransition(int arg2, int arg3) {
        if(this.mAnimationInfo == null && arg2 == 0 && arg3 == 0) {
            return;
        }

        this.ensureAnimationInfo();
        this.mAnimationInfo.mNextTransition = arg2;
        this.mAnimationInfo.mNextTransitionStyle = arg3;
    }

    void setOnStartEnterTransitionListener(OnStartEnterTransitionListener arg3) {
        this.ensureAnimationInfo();
        if(arg3 == this.mAnimationInfo.mStartEnterTransitionListener) {
            return;
        }

        if(arg3 != null) {
            if(this.mAnimationInfo.mStartEnterTransitionListener == null) {
            }
            else {
                StringBuilder v0 = new StringBuilder();
                v0.append("Trying to set a replacement startPostponedEnterTransition on ");
                v0.append(this);
                throw new IllegalStateException(v0.toString());
            }
        }

        if(this.mAnimationInfo.mEnterTransitionPostponed) {
            this.mAnimationInfo.mStartEnterTransitionListener = arg3;
        }

        if(arg3 != null) {
            arg3.startListening();
        }
    }

    public void setReenterTransition(@Nullable Object arg2) {
        this.ensureAnimationInfo().mReenterTransition = arg2;
    }

    public void setRetainInstance(boolean arg1) {
        this.mRetainInstance = arg1;
    }

    public void setReturnTransition(@Nullable Object arg2) {
        this.ensureAnimationInfo().mReturnTransition = arg2;
    }

    public void setSharedElementEnterTransition(@Nullable Object arg2) {
        this.ensureAnimationInfo().mSharedElementEnterTransition = arg2;
    }

    public void setSharedElementReturnTransition(@Nullable Object arg2) {
        this.ensureAnimationInfo().mSharedElementReturnTransition = arg2;
    }

    void setStateAfterAnimating(int arg2) {
        this.ensureAnimationInfo().mStateAfterAnimating = arg2;
    }

    public void setTargetFragment(@Nullable Fragment arg3, int arg4) {
        StringBuilder v0_1;
        FragmentManager v0 = this.getFragmentManager();
        FragmentManager v1 = arg3 != null ? arg3.getFragmentManager() : null;
        if(v0 != null && v1 != null) {
            if(v0 == v1) {
            }
            else {
                v0_1 = new StringBuilder();
                v0_1.append("Fragment ");
                v0_1.append(arg3);
                v0_1.append(" must share the same FragmentManager to be set as a target fragment");
                throw new IllegalArgumentException(v0_1.toString());
            }
        }

        Fragment v0_2;
        for(v0_2 = arg3; true; v0_2 = v0_2.getTargetFragment()) {
            if(v0_2 == null) {
                goto label_39;
            }

            if(v0_2 == this) {
                break;
            }
        }

        v0_1 = new StringBuilder();
        v0_1.append("Setting ");
        v0_1.append(arg3);
        v0_1.append(" as the target of ");
        v0_1.append(this);
        v0_1.append(" would create a target cycle");
        throw new IllegalArgumentException(v0_1.toString());
    label_39:
        this.mTarget = arg3;
        this.mTargetRequestCode = arg4;
    }

    public void setUserVisibleHint(boolean arg3) {
        int v1 = 3;
        if(!this.mUserVisibleHint && (arg3) && this.mState < v1 && this.mFragmentManager != null && (this.isAdded()) && (this.mIsCreated)) {
            this.mFragmentManager.performPendingDeferredStart(this);
        }

        this.mUserVisibleHint = arg3;
        boolean v0 = this.mState >= v1 || (arg3) ? false : true;
        this.mDeferStart = v0;
        if(this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(arg3);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@NonNull String arg2) {
        if(this.mHost != null) {
            return this.mHost.onShouldShowRequestPermissionRationale(arg2);
        }

        return 0;
    }

    public void startActivity(Intent arg2) {
        this.startActivity(arg2, null);
    }

    public void startActivity(Intent arg3, @Nullable Bundle arg4) {
        if(this.mHost != null) {
            this.mHost.onStartActivityFromFragment(this, arg3, -1, arg4);
            return;
        }

        StringBuilder v4 = new StringBuilder();
        v4.append("Fragment ");
        v4.append(this);
        v4.append(" not attached to Activity");
        throw new IllegalStateException(v4.toString());
    }

    public void startActivityForResult(Intent arg2, int arg3) {
        this.startActivityForResult(arg2, arg3, null);
    }

    public void startActivityForResult(Intent arg2, int arg3, @Nullable Bundle arg4) {
        if(this.mHost != null) {
            this.mHost.onStartActivityFromFragment(this, arg2, arg3, arg4);
            return;
        }

        StringBuilder v3 = new StringBuilder();
        v3.append("Fragment ");
        v3.append(this);
        v3.append(" not attached to Activity");
        throw new IllegalStateException(v3.toString());
    }

    public void startIntentSenderForResult(IntentSender arg11, int arg12, @Nullable Intent arg13, int arg14, int arg15, int arg16, Bundle arg17) throws IntentSender$SendIntentException {
        Fragment v9 = this;
        if(v9.mHost != null) {
            v9.mHost.onStartIntentSenderFromFragment(this, arg11, arg12, arg13, arg14, arg15, arg16, arg17);
            return;
        }

        StringBuilder v1 = new StringBuilder();
        v1.append("Fragment ");
        v1.append(this);
        v1.append(" not attached to Activity");
        throw new IllegalStateException(v1.toString());
    }

    public void startPostponedEnterTransition() {
        if(this.mFragmentManager == null || this.mFragmentManager.mHost == null) {
            this.ensureAnimationInfo().mEnterTransitionPostponed = false;
        }
        else if(Looper.myLooper() != this.mFragmentManager.mHost.getHandler().getLooper()) {
            this.mFragmentManager.mHost.getHandler().postAtFrontOfQueue(new Runnable() {
                public void run() {
                    Fragment.this.callStartTransitionListener();
                }
            });
        }
        else {
            this.callStartTransitionListener();
        }
    }

    public String toString() {
        StringBuilder v0 = new StringBuilder(0x80);
        DebugUtils.buildShortClassTag(this, v0);
        if(this.mIndex >= 0) {
            v0.append(" #");
            v0.append(this.mIndex);
        }

        if(this.mFragmentId != 0) {
            v0.append(" id=0x");
            v0.append(Integer.toHexString(this.mFragmentId));
        }

        if(this.mTag != null) {
            v0.append(" ");
            v0.append(this.mTag);
        }

        v0.append('}');
        return v0.toString();
    }

    public void unregisterForContextMenu(View arg2) {
        arg2.setOnCreateContextMenuListener(null);
    }
}

