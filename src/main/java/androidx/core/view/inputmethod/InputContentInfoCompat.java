package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build$VERSION;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class InputContentInfoCompat {
    @RequiresApi(value=25) final class InputContentInfoCompatApi25Impl implements InputContentInfoCompatImpl {
        @NonNull final InputContentInfo mObject;

        InputContentInfoCompatApi25Impl(@NonNull Uri arg2, @NonNull ClipDescription arg3, @Nullable Uri arg4) {
            super();
            this.mObject = new InputContentInfo(arg2, arg3, arg4);
        }

        InputContentInfoCompatApi25Impl(@NonNull Object arg1) {
            super();
            this.mObject = ((InputContentInfo)arg1);
        }

        @NonNull public Uri getContentUri() {
            return this.mObject.getContentUri();
        }

        @NonNull public ClipDescription getDescription() {
            return this.mObject.getDescription();
        }

        @Nullable public Object getInputContentInfo() {
            return this.mObject;
        }

        @Nullable public Uri getLinkUri() {
            return this.mObject.getLinkUri();
        }

        public void releasePermission() {
            this.mObject.releasePermission();
        }

        public void requestPermission() {
            this.mObject.requestPermission();
        }
    }

    final class InputContentInfoCompatBaseImpl implements InputContentInfoCompatImpl {
        @NonNull private final Uri mContentUri;
        @NonNull private final ClipDescription mDescription;
        @Nullable private final Uri mLinkUri;

        InputContentInfoCompatBaseImpl(@NonNull Uri arg1, @NonNull ClipDescription arg2, @Nullable Uri arg3) {
            super();
            this.mContentUri = arg1;
            this.mDescription = arg2;
            this.mLinkUri = arg3;
        }

        @NonNull public Uri getContentUri() {
            return this.mContentUri;
        }

        @NonNull public ClipDescription getDescription() {
            return this.mDescription;
        }

        @Nullable public Object getInputContentInfo() {
            return null;
        }

        @Nullable public Uri getLinkUri() {
            return this.mLinkUri;
        }

        public void releasePermission() {
        }

        public void requestPermission() {
        }
    }

    interface InputContentInfoCompatImpl {
        @NonNull Uri getContentUri();

        @NonNull ClipDescription getDescription();

        @Nullable Object getInputContentInfo();

        @Nullable Uri getLinkUri();

        void releasePermission();

        void requestPermission();
    }

    private final InputContentInfoCompatImpl mImpl;

    public InputContentInfoCompat(@NonNull Uri arg3, @NonNull ClipDescription arg4, @Nullable Uri arg5) {
        super();
        this.mImpl = Build$VERSION.SDK_INT >= 25 ? new InputContentInfoCompatApi25Impl(arg3, arg4, arg5) : new InputContentInfoCompatBaseImpl(arg3, arg4, arg5);
    }

    private InputContentInfoCompat(@NonNull InputContentInfoCompatImpl arg1) {
        super();
        this.mImpl = arg1;
    }

    @NonNull public Uri getContentUri() {
        return this.mImpl.getContentUri();
    }

    @NonNull public ClipDescription getDescription() {
        return this.mImpl.getDescription();
    }

    @Nullable public Uri getLinkUri() {
        return this.mImpl.getLinkUri();
    }

    public void releasePermission() {
        this.mImpl.releasePermission();
    }

    public void requestPermission() {
        this.mImpl.requestPermission();
    }

    @Nullable public Object unwrap() {
        return this.mImpl.getInputContentInfo();
    }

    @Nullable public static InputContentInfoCompat wrap(@Nullable Object arg3) {
        InputContentInfoCompat v0 = null;
        if(arg3 == null) {
            return v0;
        }

        if(Build$VERSION.SDK_INT < 25) {
            return v0;
        }

        return new InputContentInfoCompat(new InputContentInfoCompatApi25Impl(arg3));
    }
}

