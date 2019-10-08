package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.os.Build$VERSION;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

public final class MediaSessionManager {
    interface MediaSessionManagerImpl {
        Context getContext();

        boolean isTrustedForMediaControl(RemoteUserInfoImpl arg1);
    }

    public final class RemoteUserInfo {
        public static final String LEGACY_CONTROLLER = "android.media.session.MediaController";
        RemoteUserInfoImpl mImpl;

        public RemoteUserInfo(@NonNull String arg3, int arg4, int arg5) {
            super();
            this.mImpl = Build$VERSION.SDK_INT >= 28 ? new RemoteUserInfoImplApi28(arg3, arg4, arg5) : new RemoteUserInfoImplBase(arg3, arg4, arg5);
        }

        @RequiresApi(value=28) @RestrictTo(value={Scope.LIBRARY_GROUP}) public RemoteUserInfo(MediaSessionManager$RemoteUserInfo arg2) {
            super();
            this.mImpl = new RemoteUserInfoImplApi28(arg2);
        }

        public boolean equals(@Nullable Object arg2) {
            if(this == (((RemoteUserInfo)arg2))) {
                return 1;
            }

            if(!(arg2 instanceof RemoteUserInfo)) {
                return 0;
            }

            return this.mImpl.equals(((RemoteUserInfo)arg2).mImpl);
        }

        @NonNull public String getPackageName() {
            return this.mImpl.getPackageName();
        }

        public int getPid() {
            return this.mImpl.getPid();
        }

        public int getUid() {
            return this.mImpl.getUid();
        }

        public int hashCode() {
            return this.mImpl.hashCode();
        }
    }

    interface RemoteUserInfoImpl {
        String getPackageName();

        int getPid();

        int getUid();
    }

    static final boolean DEBUG = false;
    static final String TAG = "MediaSessionManager";
    MediaSessionManagerImpl mImpl;
    private static final Object sLock;
    private static volatile MediaSessionManager sSessionManager;

    static {
        MediaSessionManager.DEBUG = Log.isLoggable("MediaSessionManager", 3);
        MediaSessionManager.sLock = new Object();
    }

    private MediaSessionManager(Context arg3) {
        super();
        if(Build$VERSION.SDK_INT >= 28) {
            this.mImpl = new MediaSessionManagerImplApi28(arg3);
        }
        else if(Build$VERSION.SDK_INT >= 21) {
            this.mImpl = new MediaSessionManagerImplApi21(arg3);
        }
        else {
            this.mImpl = new MediaSessionManagerImplBase(arg3);
        }
    }

    Context getContext() {
        return this.mImpl.getContext();
    }

    @NonNull public static MediaSessionManager getSessionManager(@NonNull Context arg2) {
        MediaSessionManager v0 = MediaSessionManager.sSessionManager;
        if(v0 == null) {
            Object v1 = MediaSessionManager.sLock;
            __monitor_enter(v1);
            try {
                v0 = MediaSessionManager.sSessionManager;
                if(v0 == null) {
                    MediaSessionManager.sSessionManager = new MediaSessionManager(arg2.getApplicationContext());
                    v0 = MediaSessionManager.sSessionManager;
                }

                __monitor_exit(v1);
                return v0;
            label_15:
                __monitor_exit(v1);
            }
            catch(Throwable v2) {
                goto label_15;
            }

            throw v2;
        }

        return v0;
    }

    public boolean isTrustedForMediaControl(@NonNull RemoteUserInfo arg2) {
        if(arg2 != null) {
            return this.mImpl.isTrustedForMediaControl(arg2.mImpl);
        }

        throw new IllegalArgumentException("userInfo should not be null");
    }
}

