package android.support.v4.media.session;

import android.media.session.MediaController$TransportControls;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RequiresApi;

@RequiresApi(value=23) class MediaControllerCompatApi23 {
    public class TransportControls {
        private TransportControls() {
            super();
        }

        public static void playFromUri(Object arg0, Uri arg1, Bundle arg2) {
            ((MediaController$TransportControls)arg0).playFromUri(arg1, arg2);
        }
    }

    private MediaControllerCompatApi23() {
        super();
    }
}

