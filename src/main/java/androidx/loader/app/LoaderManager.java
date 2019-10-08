package androidx.loader.app;

import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.loader.content.Loader;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class LoaderManager {
    public interface LoaderCallbacks {
        @MainThread @NonNull Loader onCreateLoader(int arg1, @Nullable Bundle arg2);

        @MainThread void onLoadFinished(@NonNull Loader arg1, Object arg2);

        @MainThread void onLoaderReset(@NonNull Loader arg1);
    }

    public LoaderManager() {
        super();
    }

    @MainThread public abstract void destroyLoader(int arg1);

    @Deprecated public abstract void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4);

    public static void enableDebugLogging(boolean arg0) {
        LoaderManagerImpl.DEBUG = arg0;
    }

    @NonNull public static LoaderManager getInstance(@NonNull LifecycleOwner arg2) {
        return new LoaderManagerImpl(arg2, arg2.getViewModelStore());
    }

    @Nullable public abstract Loader getLoader(int arg1);

    public boolean hasRunningLoaders() {
        return 0;
    }

    @MainThread @NonNull public abstract Loader initLoader(int arg1, @Nullable Bundle arg2, @NonNull LoaderCallbacks arg3);

    public abstract void markForRedelivery();

    @MainThread @NonNull public abstract Loader restartLoader(int arg1, @Nullable Bundle arg2, @NonNull LoaderCallbacks arg3);
}

