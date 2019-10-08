package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.util.DebugUtils;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.loader.content.Loader$OnLoadCompleteListener;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class LoaderManagerImpl extends LoaderManager {
    public class LoaderInfo extends MutableLiveData implements OnLoadCompleteListener {
        @Nullable private final Bundle mArgs;
        private final int mId;
        private LifecycleOwner mLifecycleOwner;
        @NonNull private final Loader mLoader;
        private LoaderObserver mObserver;
        private Loader mPriorLoader;

        LoaderInfo(int arg1, @Nullable Bundle arg2, @NonNull Loader arg3, @Nullable Loader arg4) {
            super();
            this.mId = arg1;
            this.mArgs = arg2;
            this.mLoader = arg3;
            this.mPriorLoader = arg4;
            this.mLoader.registerListener(arg1, ((OnLoadCompleteListener)this));
        }

        @MainThread Loader destroy(boolean arg4) {
            if(LoaderManagerImpl.DEBUG) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }

            this.mLoader.cancelLoad();
            this.mLoader.abandon();
            LoaderObserver v0 = this.mObserver;
            if(v0 != null) {
                this.removeObserver(((Observer)v0));
                if(arg4) {
                    v0.reset();
                }
            }

            this.mLoader.unregisterListener(((OnLoadCompleteListener)this));
            if(v0 != null && !v0.hasDeliveredData() || (arg4)) {
                this.mLoader.reset();
                return this.mPriorLoader;
            }

            return this.mLoader;
        }

        public void dump(String arg4, FileDescriptor arg5, PrintWriter arg6, String[] arg7) {
            arg6.print(arg4);
            arg6.print("mId=");
            arg6.print(this.mId);
            arg6.print(" mArgs=");
            arg6.println(this.mArgs);
            arg6.print(arg4);
            arg6.print("mLoader=");
            arg6.println(this.mLoader);
            Loader v0 = this.mLoader;
            v0.dump(arg4 + "  ", arg5, arg6, arg7);
            if(this.mObserver != null) {
                arg6.print(arg4);
                arg6.print("mCallbacks=");
                arg6.println(this.mObserver);
                LoaderObserver v5 = this.mObserver;
                v5.dump(arg4 + "  ", arg6);
            }

            arg6.print(arg4);
            arg6.print("mData=");
            arg6.println(this.getLoader().dataToString(this.getValue()));
            arg6.print(arg4);
            arg6.print("mStarted=");
            arg6.println(this.hasActiveObservers());
        }

        @NonNull Loader getLoader() {
            return this.mLoader;
        }

        boolean isCallbackWaitingForData() {
            boolean v1 = false;
            if(!this.hasActiveObservers()) {
                return 0;
            }

            if(this.mObserver != null && !this.mObserver.hasDeliveredData()) {
                v1 = true;
            }

            return v1;
        }

        void markForRedelivery() {
            LifecycleOwner v0 = this.mLifecycleOwner;
            LoaderObserver v1 = this.mObserver;
            if(v0 != null && v1 != null) {
                super.removeObserver(((Observer)v1));
                this.observe(v0, ((Observer)v1));
            }
        }

        protected void onActive() {
            if(LoaderManagerImpl.DEBUG) {
                Log.v("LoaderManager", "  Starting: " + this);
            }

            this.mLoader.startLoading();
        }

        protected void onInactive() {
            if(LoaderManagerImpl.DEBUG) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }

            this.mLoader.stopLoading();
        }

        public void onLoadComplete(@NonNull Loader arg3, @Nullable Object arg4) {
            if(LoaderManagerImpl.DEBUG) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }

            if(Looper.myLooper() == Looper.getMainLooper()) {
                this.setValue(arg4);
            }
            else {
                if(LoaderManagerImpl.DEBUG) {
                    Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
                }

                this.postValue(arg4);
            }
        }

        public void removeObserver(@NonNull Observer arg1) {
            super.removeObserver(arg1);
            this.mLifecycleOwner = null;
            this.mObserver = null;
        }

        @MainThread @NonNull Loader setCallback(@NonNull LifecycleOwner arg3, @NonNull LoaderCallbacks arg4) {
            LoaderObserver v0 = new LoaderObserver(this.mLoader, arg4);
            this.observe(arg3, ((Observer)v0));
            if(this.mObserver != null) {
                this.removeObserver(this.mObserver);
            }

            this.mLifecycleOwner = arg3;
            this.mObserver = v0;
            return this.mLoader;
        }

        public void setValue(Object arg1) {
            super.setValue(arg1);
            if(this.mPriorLoader != null) {
                this.mPriorLoader.reset();
                this.mPriorLoader = null;
            }
        }

        public String toString() {
            StringBuilder v0 = new StringBuilder(0x40);
            v0.append("LoaderInfo{");
            v0.append(Integer.toHexString(System.identityHashCode(this)));
            v0.append(" #");
            v0.append(this.mId);
            v0.append(" : ");
            DebugUtils.buildShortClassTag(this.mLoader, v0);
            v0.append("}}");
            return v0.toString();
        }
    }

    class LoaderObserver implements Observer {
        @NonNull private final LoaderCallbacks mCallback;
        private boolean mDeliveredData;
        @NonNull private final Loader mLoader;

        LoaderObserver(@NonNull Loader arg2, @NonNull LoaderCallbacks arg3) {
            super();
            this.mDeliveredData = false;
            this.mLoader = arg2;
            this.mCallback = arg3;
        }

        public void dump(String arg1, PrintWriter arg2) {
            arg2.print(arg1);
            arg2.print("mDeliveredData=");
            arg2.println(this.mDeliveredData);
        }

        boolean hasDeliveredData() {
            return this.mDeliveredData;
        }

        public void onChanged(@Nullable Object arg4) {
            if(LoaderManagerImpl.DEBUG) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.mLoader + ": " + this.mLoader.dataToString(arg4));
            }

            this.mCallback.onLoadFinished(this.mLoader, arg4);
            this.mDeliveredData = true;
        }

        @MainThread void reset() {
            if(this.mDeliveredData) {
                if(LoaderManagerImpl.DEBUG) {
                    Log.v("LoaderManager", "  Resetting: " + this.mLoader);
                }

                this.mCallback.onLoaderReset(this.mLoader);
            }
        }

        public String toString() {
            return this.mCallback.toString();
        }
    }

    class LoaderViewModel extends ViewModel {
        final class androidx.loader.app.LoaderManagerImpl$LoaderViewModel$1 implements Factory {
            androidx.loader.app.LoaderManagerImpl$LoaderViewModel$1() {
                super();
            }

            @NonNull public ViewModel create(@NonNull Class arg1) {
                return new LoaderViewModel();
            }
        }

        private static final Factory FACTORY;
        private boolean mCreatingLoader;
        private SparseArrayCompat mLoaders;

        static {
            LoaderViewModel.FACTORY = new androidx.loader.app.LoaderManagerImpl$LoaderViewModel$1();
        }

        LoaderViewModel() {
            super();
            this.mLoaders = new SparseArrayCompat();
            this.mCreatingLoader = false;
        }

        public void dump(String arg5, FileDescriptor arg6, PrintWriter arg7, String[] arg8) {
            if(this.mLoaders.size() > 0) {
                arg7.print(arg5);
                arg7.println("Loaders:");
                String v0_1 = arg5 + "    ";
                int v1;
                for(v1 = 0; v1 < this.mLoaders.size(); ++v1) {
                    Object v2 = this.mLoaders.valueAt(v1);
                    arg7.print(arg5);
                    arg7.print("  #");
                    arg7.print(this.mLoaders.keyAt(v1));
                    arg7.print(": ");
                    arg7.println(((LoaderInfo)v2).toString());
                    ((LoaderInfo)v2).dump(v0_1, arg6, arg7, arg8);
                }
            }
        }

        void finishCreatingLoader() {
            this.mCreatingLoader = false;
        }

        @NonNull static LoaderViewModel getInstance(ViewModelStore arg2) {
            return new ViewModelProvider(arg2, LoaderViewModel.FACTORY).get(LoaderViewModel.class);
        }

        LoaderInfo getLoader(int arg2) {
            return this.mLoaders.get(arg2);
        }

        boolean hasRunningLoaders() {
            int v0 = this.mLoaders.size();
            int v2;
            for(v2 = 0; v2 < v0; ++v2) {
                if(this.mLoaders.valueAt(v2).isCallbackWaitingForData()) {
                    return 1;
                }
            }

            return 0;
        }

        boolean isCreatingLoader() {
            return this.mCreatingLoader;
        }

        void markForRedelivery() {
            int v0 = this.mLoaders.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                this.mLoaders.valueAt(v1).markForRedelivery();
            }
        }

        protected void onCleared() {
            super.onCleared();
            int v0 = this.mLoaders.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                this.mLoaders.valueAt(v1).destroy(true);
            }

            this.mLoaders.clear();
        }

        void putLoader(int arg2, @NonNull LoaderInfo arg3) {
            this.mLoaders.put(arg2, arg3);
        }

        void removeLoader(int arg2) {
            this.mLoaders.remove(arg2);
        }

        void startCreatingLoader() {
            this.mCreatingLoader = true;
        }
    }

    static boolean DEBUG = false;
    static final String TAG = "LoaderManager";
    @NonNull private final LifecycleOwner mLifecycleOwner;
    @NonNull private final LoaderViewModel mLoaderViewModel;

    static {
    }

    LoaderManagerImpl(@NonNull LifecycleOwner arg1, @NonNull ViewModelStore arg2) {
        super();
        this.mLifecycleOwner = arg1;
        this.mLoaderViewModel = LoaderViewModel.getInstance(arg2);
    }

    @MainThread @NonNull private Loader createAndInstallLoader(int arg3, @Nullable Bundle arg4, @NonNull LoaderCallbacks arg5, @Nullable Loader arg6) {
        LoaderInfo v1;
        try {
            this.mLoaderViewModel.startCreatingLoader();
            Loader v0 = arg5.onCreateLoader(arg3, arg4);
            if(v0 == null) {
                goto label_40;
            }

            if(v0.getClass().isMemberClass()) {
                if(Modifier.isStatic(v0.getClass().getModifiers())) {
                }
                else {
                    StringBuilder v4 = new StringBuilder();
                    v4.append("Object returned from onCreateLoader must not be a non-static inner member class: ");
                    v4.append(v0);
                    throw new IllegalArgumentException(v4.toString());
                }
            }

            v1 = new LoaderInfo(arg3, arg4, v0, arg6);
            if(LoaderManagerImpl.DEBUG) {
                Log.v("LoaderManager", "  Created new loader " + v1);
            }

            this.mLoaderViewModel.putLoader(arg3, v1);
        }
        catch(Throwable v3) {
            goto label_46;
        }

        this.mLoaderViewModel.finishCreatingLoader();
        return v1.setCallback(this.mLifecycleOwner, arg5);
        try {
        label_40:
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        }
        catch(Throwable v3) {
        label_46:
            this.mLoaderViewModel.finishCreatingLoader();
            throw v3;
        }
    }

    @MainThread public void destroyLoader(int arg4) {
        if(!this.mLoaderViewModel.isCreatingLoader()) {
            if(Looper.getMainLooper() == Looper.myLooper()) {
                if(LoaderManagerImpl.DEBUG) {
                    Log.v("LoaderManager", "destroyLoader in " + this + " of " + arg4);
                }

                LoaderInfo v0 = this.mLoaderViewModel.getLoader(arg4);
                if(v0 != null) {
                    v0.destroy(true);
                    this.mLoaderViewModel.removeLoader(arg4);
                }

                return;
            }

            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }

        throw new IllegalStateException("Called while creating a loader");
    }

    @Deprecated public void dump(String arg2, FileDescriptor arg3, PrintWriter arg4, String[] arg5) {
        this.mLoaderViewModel.dump(arg2, arg3, arg4, arg5);
    }

    @Nullable public Loader getLoader(int arg2) {
        if(!this.mLoaderViewModel.isCreatingLoader()) {
            LoaderInfo v2 = this.mLoaderViewModel.getLoader(arg2);
            Loader v2_1 = v2 != null ? v2.getLoader() : null;
            return v2_1;
        }

        throw new IllegalStateException("Called while creating a loader");
    }

    public boolean hasRunningLoaders() {
        return this.mLoaderViewModel.hasRunningLoaders();
    }

    @MainThread @NonNull public Loader initLoader(int arg5, @Nullable Bundle arg6, @NonNull LoaderCallbacks arg7) {
        if(!this.mLoaderViewModel.isCreatingLoader()) {
            if(Looper.getMainLooper() == Looper.myLooper()) {
                LoaderInfo v0 = this.mLoaderViewModel.getLoader(arg5);
                if(LoaderManagerImpl.DEBUG) {
                    Log.v("LoaderManager", "initLoader in " + this + ": args=" + arg6);
                }

                if(v0 == null) {
                    return this.createAndInstallLoader(arg5, arg6, arg7, null);
                }

                if(LoaderManagerImpl.DEBUG) {
                    Log.v("LoaderManager", "  Re-using existing loader " + v0);
                }

                return v0.setCallback(this.mLifecycleOwner, arg7);
            }

            throw new IllegalStateException("initLoader must be called on the main thread");
        }

        throw new IllegalStateException("Called while creating a loader");
    }

    public void markForRedelivery() {
        this.mLoaderViewModel.markForRedelivery();
    }

    @MainThread @NonNull public Loader restartLoader(int arg4, @Nullable Bundle arg5, @NonNull LoaderCallbacks arg6) {
        if(!this.mLoaderViewModel.isCreatingLoader()) {
            if(Looper.getMainLooper() == Looper.myLooper()) {
                if(LoaderManagerImpl.DEBUG) {
                    Log.v("LoaderManager", "restartLoader in " + this + ": args=" + arg5);
                }

                LoaderInfo v0 = this.mLoaderViewModel.getLoader(arg4);
                Loader v1_1 = null;
                if(v0 != null) {
                    v1_1 = v0.destroy(false);
                }

                return this.createAndInstallLoader(arg4, arg5, arg6, v1_1);
            }

            throw new IllegalStateException("restartLoader must be called on the main thread");
        }

        throw new IllegalStateException("Called while creating a loader");
    }

    public String toString() {
        StringBuilder v0 = new StringBuilder(0x80);
        v0.append("LoaderManager{");
        v0.append(Integer.toHexString(System.identityHashCode(this)));
        v0.append(" in ");
        DebugUtils.buildShortClassTag(this.mLifecycleOwner, v0);
        v0.append("}}");
        return v0.toString();
    }
}

