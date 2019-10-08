package androidx.loader.content;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.DebugUtils;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class Loader {
    public final class ForceLoadContentObserver extends ContentObserver {
        public ForceLoadContentObserver(Loader arg1) {
            Loader.this = arg1;
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return 1;
        }

        public void onChange(boolean arg1) {
            Loader.this.onContentChanged();
        }
    }

    public interface OnLoadCanceledListener {
        void onLoadCanceled(@NonNull Loader arg1);
    }

    public interface OnLoadCompleteListener {
        void onLoadComplete(@NonNull Loader arg1, @Nullable Object arg2);
    }

    boolean mAbandoned;
    boolean mContentChanged;
    Context mContext;
    int mId;
    OnLoadCompleteListener mListener;
    OnLoadCanceledListener mOnLoadCanceledListener;
    boolean mProcessingChange;
    boolean mReset;
    boolean mStarted;

    public Loader(@NonNull Context arg3) {
        super();
        this.mStarted = false;
        this.mAbandoned = false;
        this.mReset = true;
        this.mContentChanged = false;
        this.mProcessingChange = false;
        this.mContext = arg3.getApplicationContext();
    }

    @MainThread public void abandon() {
        this.mAbandoned = true;
        this.onAbandon();
    }

    @MainThread public boolean cancelLoad() {
        return this.onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    @NonNull public String dataToString(@Nullable Object arg3) {
        StringBuilder v0 = new StringBuilder(0x40);
        DebugUtils.buildShortClassTag(arg3, v0);
        v0.append("}");
        return v0.toString();
    }

    @MainThread public void deliverCancellation() {
        if(this.mOnLoadCanceledListener != null) {
            this.mOnLoadCanceledListener.onLoadCanceled(this);
        }
    }

    @MainThread public void deliverResult(@Nullable Object arg2) {
        if(this.mListener != null) {
            this.mListener.onLoadComplete(this, arg2);
        }
    }

    @Deprecated public void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4) {
        arg3.print(arg1);
        arg3.print("mId=");
        arg3.print(this.mId);
        arg3.print(" mListener=");
        arg3.println(this.mListener);
        if((this.mStarted) || (this.mContentChanged) || (this.mProcessingChange)) {
            arg3.print(arg1);
            arg3.print("mStarted=");
            arg3.print(this.mStarted);
            arg3.print(" mContentChanged=");
            arg3.print(this.mContentChanged);
            arg3.print(" mProcessingChange=");
            arg3.println(this.mProcessingChange);
        }

        if((this.mAbandoned) || (this.mReset)) {
            arg3.print(arg1);
            arg3.print("mAbandoned=");
            arg3.print(this.mAbandoned);
            arg3.print(" mReset=");
            arg3.println(this.mReset);
        }
    }

    @MainThread public void forceLoad() {
        this.onForceLoad();
    }

    @NonNull public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    @MainThread protected void onAbandon() {
    }

    @MainThread protected boolean onCancelLoad() {
        return 0;
    }

    @MainThread public void onContentChanged() {
        if(this.mStarted) {
            this.forceLoad();
        }
        else {
            this.mContentChanged = true;
        }
    }

    @MainThread protected void onForceLoad() {
    }

    @MainThread protected void onReset() {
    }

    @MainThread protected void onStartLoading() {
    }

    @MainThread protected void onStopLoading() {
    }

    @MainThread public void registerListener(int arg2, @NonNull OnLoadCompleteListener arg3) {
        if(this.mListener == null) {
            this.mListener = arg3;
            this.mId = arg2;
            return;
        }

        throw new IllegalStateException("There is already a listener registered");
    }

    @MainThread public void registerOnLoadCanceledListener(@NonNull OnLoadCanceledListener arg2) {
        if(this.mOnLoadCanceledListener == null) {
            this.mOnLoadCanceledListener = arg2;
            return;
        }

        throw new IllegalStateException("There is already a listener registered");
    }

    @MainThread public void reset() {
        this.onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if(this.mProcessingChange) {
            this.onContentChanged();
        }
    }

    @MainThread public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        this.onStartLoading();
    }

    @MainThread public void stopLoading() {
        this.mStarted = false;
        this.onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean v0 = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= ((int)v0);
        return v0;
    }

    public String toString() {
        StringBuilder v0 = new StringBuilder(0x40);
        DebugUtils.buildShortClassTag(this, v0);
        v0.append(" id=");
        v0.append(this.mId);
        v0.append("}");
        return v0.toString();
    }

    @MainThread public void unregisterListener(@NonNull OnLoadCompleteListener arg2) {
        if(this.mListener != null) {
            if(this.mListener == arg2) {
                this.mListener = null;
                return;
            }

            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }

        throw new IllegalStateException("No listener register");
    }

    @MainThread public void unregisterOnLoadCanceledListener(@NonNull OnLoadCanceledListener arg2) {
        if(this.mOnLoadCanceledListener != null) {
            if(this.mOnLoadCanceledListener == arg2) {
                this.mOnLoadCanceledListener = null;
                return;
            }

            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }

        throw new IllegalStateException("No listener register");
    }
}

