package androidx.media;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager$NameNotFoundException;
import android.provider.Settings$Secure;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.util.ObjectsCompat;

class MediaSessionManagerImplBase implements MediaSessionManagerImpl {
    class RemoteUserInfoImplBase implements RemoteUserInfoImpl {
        private String mPackageName;
        private int mPid;
        private int mUid;

        RemoteUserInfoImplBase(String arg1, int arg2, int arg3) {
            super();
            this.mPackageName = arg1;
            this.mPid = arg2;
            this.mUid = arg3;
        }

        public boolean equals(Object arg5) {
            boolean v0 = true;
            if(this == (((RemoteUserInfoImplBase)arg5))) {
                return 1;
            }

            if(!(arg5 instanceof RemoteUserInfoImplBase)) {
                return 0;
            }

            if(!TextUtils.equals(this.mPackageName, ((RemoteUserInfoImplBase)arg5).mPackageName) || this.mPid != ((RemoteUserInfoImplBase)arg5).mPid || this.mUid != ((RemoteUserInfoImplBase)arg5).mUid) {
                v0 = false;
            }
            else {
            }

            return v0;
        }

        public String getPackageName() {
            return this.mPackageName;
        }

        public int getPid() {
            return this.mPid;
        }

        public int getUid() {
            return this.mUid;
        }

        public int hashCode() {
            return ObjectsCompat.hash(new Object[]{this.mPackageName, Integer.valueOf(this.mPid), Integer.valueOf(this.mUid)});
        }
    }

    private static final boolean DEBUG = false;
    private static final String ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final String PERMISSION_MEDIA_CONTENT_CONTROL = "android.permission.MEDIA_CONTENT_CONTROL";
    private static final String PERMISSION_STATUS_BAR_SERVICE = "android.permission.STATUS_BAR_SERVICE";
    private static final String TAG = "MediaSessionManager";
    ContentResolver mContentResolver;
    Context mContext;

    static {
        MediaSessionManagerImplBase.DEBUG = MediaSessionManager.DEBUG;
    }

    MediaSessionManagerImplBase(Context arg1) {
        super();
        this.mContext = arg1;
        this.mContentResolver = this.mContext.getContentResolver();
    }

    public Context getContext() {
        return this.mContext;
    }

    boolean isEnabledNotificationListener(@NonNull RemoteUserInfoImpl arg6) {
        String v0 = Settings$Secure.getString(this.mContentResolver, "enabled_notification_listeners");
        if(v0 != null) {
            String[] v0_1 = v0.split(":");
            int v2;
            for(v2 = 0; v2 < v0_1.length; ++v2) {
                ComponentName v3 = ComponentName.unflattenFromString(v0_1[v2]);
                if(v3 != null && (v3.getPackageName().equals(arg6.getPackageName()))) {
                    return 1;
                }
            }
        }

        return 0;
    }

    private boolean isPermissionGranted(RemoteUserInfoImpl arg5, String arg6) {
        boolean v1 = false;
        if(arg5.getPid() < 0) {
            if(this.mContext.getPackageManager().checkPermission(arg6, arg5.getPackageName()) == 0) {
                v1 = true;
            }

            return v1;
        }

        if(this.mContext.checkPermission(arg6, arg5.getPid(), arg5.getUid()) == 0) {
            v1 = true;
        }

        return v1;
    }

    public boolean isTrustedForMediaControl(@NonNull RemoteUserInfoImpl arg5) {
        boolean v0 = false;
        try {
            ApplicationInfo v1 = this.mContext.getPackageManager().getApplicationInfo(arg5.getPackageName(), 0);
        }
        catch(PackageManager$NameNotFoundException ) {
            if(MediaSessionManagerImplBase.DEBUG) {
                Log.d("MediaSessionManager", "Package " + arg5.getPackageName() + " doesn\'t exist");
            }

            return 0;
        }

        if(v1.uid != arg5.getUid()) {
            if(MediaSessionManagerImplBase.DEBUG) {
                Log.d("MediaSessionManager", "Package name " + arg5.getPackageName() + " doesn\'t match with the uid " + arg5.getUid());
            }

            return 0;
        }

        if((this.isPermissionGranted(arg5, "android.permission.STATUS_BAR_SERVICE")) || (this.isPermissionGranted(arg5, "android.permission.MEDIA_CONTENT_CONTROL")) || arg5.getUid() == 1000 || (this.isEnabledNotificationListener(arg5))) {
            v0 = true;
        }

        return v0;
    }
}

