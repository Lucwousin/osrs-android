package androidx.media;

import android.content.Context;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import android.media.session.MediaSessionManager;
import androidx.annotation.RequiresApi;
import androidx.core.util.ObjectsCompat;

@RequiresApi(value=28) class MediaSessionManagerImplApi28 extends MediaSessionManagerImplApi21 {
    final class RemoteUserInfoImplApi28 implements RemoteUserInfoImpl {
        final MediaSessionManager$RemoteUserInfo mObject;

        RemoteUserInfoImplApi28(MediaSessionManager$RemoteUserInfo arg1) {
            super();
            this.mObject = arg1;
        }

        RemoteUserInfoImplApi28(String arg2, int arg3, int arg4) {
            super();
            this.mObject = new MediaSessionManager$RemoteUserInfo(arg2, arg3, arg4);
        }

        public boolean equals(Object arg2) {
            if(this == (((RemoteUserInfoImplApi28)arg2))) {
                return 1;
            }

            if(!(arg2 instanceof RemoteUserInfoImplApi28)) {
                return 0;
            }

            return this.mObject.equals(((RemoteUserInfoImplApi28)arg2).mObject);
        }

        public String getPackageName() {
            return this.mObject.getPackageName();
        }

        public int getPid() {
            return this.mObject.getPid();
        }

        public int getUid() {
            return this.mObject.getUid();
        }

        public int hashCode() {
            return ObjectsCompat.hash(new Object[]{this.mObject});
        }
    }

    MediaSessionManager mObject;

    MediaSessionManagerImplApi28(Context arg2) {
        super(arg2);
        this.mObject = arg2.getSystemService("media_session");
    }

    public boolean isTrustedForMediaControl(RemoteUserInfoImpl arg2) {
        if((arg2 instanceof RemoteUserInfoImplApi28)) {
            return this.mObject.isTrustedForMediaControl(((RemoteUserInfoImplApi28)arg2).mObject);
        }

        return 0;
    }
}

