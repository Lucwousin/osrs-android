package androidx.media;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(value=21) class MediaSessionManagerImplApi21 extends MediaSessionManagerImplBase {
    MediaSessionManagerImplApi21(Context arg1) {
        super(arg1);
        this.mContext = arg1;
    }

    private boolean hasMediaControlPermission(@NonNull RemoteUserInfoImpl arg4) {
        boolean v4 = this.getContext().checkPermission("android.permission.MEDIA_CONTENT_CONTROL", arg4.getPid(), arg4.getUid()) == 0 ? true : false;
        return v4;
    }

    public boolean isTrustedForMediaControl(@NonNull RemoteUserInfoImpl arg2) {
        boolean v2 = (this.hasMediaControlPermission(arg2)) || (super.isTrustedForMediaControl(arg2)) ? true : false;
        return v2;
    }
}

