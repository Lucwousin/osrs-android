package androidx.media;

import android.content.Context;
import android.media.browse.MediaBrowser$MediaItem;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService$Result;
import android.service.media.MediaBrowserService;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RequiresApi(value=26) class MediaBrowserServiceCompatApi26 {
    class MediaBrowserServiceAdaptor extends androidx.media.MediaBrowserServiceCompatApi23$MediaBrowserServiceAdaptor {
        MediaBrowserServiceAdaptor(Context arg1, ServiceCompatProxy arg2) {
            super(arg1, ((androidx.media.MediaBrowserServiceCompatApi23$ServiceCompatProxy)arg2));
        }

        public void onLoadChildren(String arg3, MediaBrowserService$Result arg4, Bundle arg5) {
            MediaSessionCompat.ensureClassLoader(arg5);
            this.mServiceProxy.onLoadChildren(arg3, new ResultWrapper(arg4), arg5);
        }
    }

    class ResultWrapper {
        MediaBrowserService$Result mResultObj;

        ResultWrapper(MediaBrowserService$Result arg1) {
            super();
            this.mResultObj = arg1;
        }

        public void detach() {
            this.mResultObj.detach();
        }

        List parcelListToItemList(List arg4) {
            if(arg4 == null) {
                return null;
            }

            ArrayList v0 = new ArrayList();
            Iterator v4 = arg4.iterator();
            while(v4.hasNext()) {
                Object v1 = v4.next();
                ((Parcel)v1).setDataPosition(0);
                ((List)v0).add(MediaBrowser$MediaItem.CREATOR.createFromParcel(((Parcel)v1)));
                ((Parcel)v1).recycle();
            }

            return ((List)v0);
        }

        public void sendResult(List arg3, int arg4) {
            try {
                MediaBrowserServiceCompatApi26.sResultFlags.setInt(this.mResultObj, arg4);
            }
            catch(IllegalAccessException v4) {
                Log.w("MBSCompatApi26", ((Throwable)v4));
            }

            this.mResultObj.sendResult(this.parcelListToItemList(arg3));
        }
    }

    public interface ServiceCompatProxy extends androidx.media.MediaBrowserServiceCompatApi23$ServiceCompatProxy {
        void onLoadChildren(String arg1, ResultWrapper arg2, Bundle arg3);
    }

    private static final String TAG = "MBSCompatApi26";
    static Field sResultFlags;

    static {
        try {
            MediaBrowserServiceCompatApi26.sResultFlags = MediaBrowserService$Result.class.getDeclaredField("mFlags");
            MediaBrowserServiceCompatApi26.sResultFlags.setAccessible(true);
        }
        catch(NoSuchFieldException v0) {
            Log.w("MBSCompatApi26", ((Throwable)v0));
        }
    }

    private MediaBrowserServiceCompatApi26() {
        super();
    }

    public static Object createService(Context arg1, ServiceCompatProxy arg2) {
        return new MediaBrowserServiceAdaptor(arg1, arg2);
    }

    public static Bundle getBrowserRootHints(Object arg0) {
        return ((MediaBrowserService)arg0).getBrowserRootHints();
    }

    public static void notifyChildrenChanged(Object arg0, String arg1, Bundle arg2) {
        ((MediaBrowserService)arg0).notifyChildrenChanged(arg1, arg2);
    }
}

