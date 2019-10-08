package androidx.loader.content;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContentResolverCompat;
import androidx.core.os.CancellationSignal;
import androidx.core.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class CursorLoader extends AsyncTaskLoader {
    CancellationSignal mCancellationSignal;
    Cursor mCursor;
    final ForceLoadContentObserver mObserver;
    String[] mProjection;
    String mSelection;
    String[] mSelectionArgs;
    String mSortOrder;
    Uri mUri;

    public CursorLoader(@NonNull Context arg1) {
        super(arg1);
        this.mObserver = new ForceLoadContentObserver(((Loader)this));
    }

    public CursorLoader(@NonNull Context arg1, @NonNull Uri arg2, @Nullable String[] arg3, @Nullable String arg4, @Nullable String[] arg5, @Nullable String arg6) {
        super(arg1);
        this.mObserver = new ForceLoadContentObserver(((Loader)this));
        this.mUri = arg2;
        this.mProjection = arg3;
        this.mSelection = arg4;
        this.mSelectionArgs = arg5;
        this.mSortOrder = arg6;
    }

    public void cancelLoadInBackground() {
        super.cancelLoadInBackground();
        __monitor_enter(this);
        try {
            if(this.mCancellationSignal != null) {
                this.mCancellationSignal.cancel();
            }

            __monitor_exit(this);
            return;
        label_9:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_9;
        }

        throw v0;
    }

    public void deliverResult(Cursor arg3) {
        if(this.isReset()) {
            if(arg3 != null) {
                arg3.close();
            }

            return;
        }

        Cursor v0 = this.mCursor;
        this.mCursor = arg3;
        if(this.isStarted()) {
            super.deliverResult(arg3);
        }

        if(v0 != null && v0 != arg3 && !v0.isClosed()) {
            v0.close();
        }
    }

    public void deliverResult(Object arg1) {
        this.deliverResult(((Cursor)arg1));
    }

    @Deprecated public void dump(String arg1, FileDescriptor arg2, PrintWriter arg3, String[] arg4) {
        super.dump(arg1, arg2, arg3, arg4);
        arg3.print(arg1);
        arg3.print("mUri=");
        arg3.println(this.mUri);
        arg3.print(arg1);
        arg3.print("mProjection=");
        arg3.println(Arrays.toString(this.mProjection));
        arg3.print(arg1);
        arg3.print("mSelection=");
        arg3.println(this.mSelection);
        arg3.print(arg1);
        arg3.print("mSelectionArgs=");
        arg3.println(Arrays.toString(this.mSelectionArgs));
        arg3.print(arg1);
        arg3.print("mSortOrder=");
        arg3.println(this.mSortOrder);
        arg3.print(arg1);
        arg3.print("mCursor=");
        arg3.println(this.mCursor);
        arg3.print(arg1);
        arg3.print("mContentChanged=");
        arg3.println(this.mContentChanged);
    }

    @Nullable public String[] getProjection() {
        return this.mProjection;
    }

    @Nullable public String getSelection() {
        return this.mSelection;
    }

    @Nullable public String[] getSelectionArgs() {
        return this.mSelectionArgs;
    }

    @Nullable public String getSortOrder() {
        return this.mSortOrder;
    }

    @NonNull public Uri getUri() {
        return this.mUri;
    }

    public Cursor loadInBackground() {
        Cursor v1_1;
        CancellationSignal v0_1;
        __monitor_enter(this);
        try {
            if(this.isLoadInBackgroundCanceled()) {
                goto label_40;
            }

            this.mCancellationSignal = new CancellationSignal();
            __monitor_exit(this);
            v0_1 = null;
        }
        catch(Throwable v0) {
            goto label_44;
        }

        try {
            v1_1 = ContentResolverCompat.query(this.getContext().getContentResolver(), this.mUri, this.mProjection, this.mSelection, this.mSelectionArgs, this.mSortOrder, this.mCancellationSignal);
            if(v1_1 != null) {
                try {
                    v1_1.getCount();
                    v1_1.registerContentObserver(this.mObserver);
                }
                catch(RuntimeException v2) {
                    try {
                        v1_1.close();
                        throw v2;
                    }
                    catch(Throwable v1) {
                    label_33:
                        __monitor_enter(this);
                        try {
                            this.mCancellationSignal = v0_1;
                            __monitor_exit(this);
                        }
                        catch(Throwable v0) {
                            try {
                            label_38:
                                __monitor_exit(this);
                            }
                            catch(Throwable v0) {
                                goto label_38;
                            }

                            throw v0;
                        }

                        throw v1;
                    }
                }
            }
        }
        catch(Throwable v1) {
            goto label_33;
        }

        __monitor_enter(this);
        try {
            this.mCancellationSignal = v0_1;
            __monitor_exit(this);
            return v1_1;
        label_30:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_30;
        }

        throw v0;
        try {
        label_40:
            throw new OperationCanceledException();
        label_44:
            __monitor_exit(this);
        }
        catch(Throwable v0) {
            goto label_44;
        }

        throw v0;
    }

    public Object loadInBackground() {
        return this.loadInBackground();
    }

    public void onCanceled(Cursor arg2) {
        if(arg2 != null && !arg2.isClosed()) {
            arg2.close();
        }
    }

    public void onCanceled(Object arg1) {
        this.onCanceled(((Cursor)arg1));
    }

    protected void onReset() {
        super.onReset();
        this.onStopLoading();
        if(this.mCursor != null && !this.mCursor.isClosed()) {
            this.mCursor.close();
        }

        this.mCursor = null;
    }

    protected void onStartLoading() {
        if(this.mCursor != null) {
            this.deliverResult(this.mCursor);
        }

        if((this.takeContentChanged()) || this.mCursor == null) {
            this.forceLoad();
        }
    }

    protected void onStopLoading() {
        this.cancelLoad();
    }

    public void setProjection(@Nullable String[] arg1) {
        this.mProjection = arg1;
    }

    public void setSelection(@Nullable String arg1) {
        this.mSelection = arg1;
    }

    public void setSelectionArgs(@Nullable String[] arg1) {
        this.mSelectionArgs = arg1;
    }

    public void setSortOrder(@Nullable String arg1) {
        this.mSortOrder = arg1;
    }

    public void setUri(@NonNull Uri arg1) {
        this.mUri = arg1;
    }
}

