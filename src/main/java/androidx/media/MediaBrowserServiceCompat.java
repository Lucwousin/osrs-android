package androidx.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder$DeathRecipient;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import androidx.core.app.BundleCompat;
import androidx.core.util.Pair;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public abstract class MediaBrowserServiceCompat extends Service {
    public final class BrowserRoot {
        public static final String EXTRA_OFFLINE = "android.service.media.extra.OFFLINE";
        public static final String EXTRA_RECENT = "android.service.media.extra.RECENT";
        public static final String EXTRA_SUGGESTED = "android.service.media.extra.SUGGESTED";
        @Deprecated public static final String EXTRA_SUGGESTION_KEYWORDS = "android.service.media.extra.SUGGESTION_KEYWORDS";
        private final Bundle mExtras;
        private final String mRootId;

        public BrowserRoot(@NonNull String arg1, @Nullable Bundle arg2) {
            super();
            if(arg1 != null) {
                this.mRootId = arg1;
                this.mExtras = arg2;
                return;
            }

            throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead.");
        }

        public Bundle getExtras() {
            return this.mExtras;
        }

        public String getRootId() {
            return this.mRootId;
        }
    }

    class ConnectionRecord implements IBinder$DeathRecipient {
        public final RemoteUserInfo browserInfo;
        public final ServiceCallbacks callbacks;
        public final int pid;
        public final String pkg;
        public BrowserRoot root;
        public final Bundle rootHints;
        public final HashMap subscriptions;
        public final int uid;

        ConnectionRecord(MediaBrowserServiceCompat arg1, String arg2, int arg3, int arg4, Bundle arg5, ServiceCallbacks arg6) {
            MediaBrowserServiceCompat.this = arg1;
            super();
            this.subscriptions = new HashMap();
            this.pkg = arg2;
            this.pid = arg3;
            this.uid = arg4;
            this.browserInfo = new RemoteUserInfo(arg2, arg3, arg4);
            this.rootHints = arg5;
            this.callbacks = arg6;
        }

        public void binderDied() {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable() {
                public void run() {
                    this.this$1.this$0.mConnections.remove(this.this$1.callbacks.asBinder());
                }
            });
        }
    }

    interface MediaBrowserServiceImpl {
        Bundle getBrowserRootHints();

        RemoteUserInfo getCurrentBrowserInfo();

        void notifyChildrenChanged(RemoteUserInfo arg1, String arg2, Bundle arg3);

        void notifyChildrenChanged(String arg1, Bundle arg2);

        IBinder onBind(Intent arg1);

        void onCreate();

        void setSessionToken(Token arg1);
    }

    @RequiresApi(value=21) class MediaBrowserServiceImplApi21 implements MediaBrowserServiceImpl, ServiceCompatProxy {
        Messenger mMessenger;
        final List mRootExtrasList;
        Object mServiceObj;

        MediaBrowserServiceImplApi21(MediaBrowserServiceCompat arg1) {
            MediaBrowserServiceCompat.this = arg1;
            super();
            this.mRootExtrasList = new ArrayList();
        }

        public Bundle getBrowserRootHints() {
            Bundle v1 = null;
            if(this.mMessenger == null) {
                return v1;
            }

            if(MediaBrowserServiceCompat.this.mCurConnection != null) {
                if(MediaBrowserServiceCompat.this.mCurConnection.rootHints == null) {
                }
                else {
                    v1 = new Bundle(MediaBrowserServiceCompat.this.mCurConnection.rootHints);
                }

                return v1;
            }

            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        public RemoteUserInfo getCurrentBrowserInfo() {
            if(MediaBrowserServiceCompat.this.mCurConnection != null) {
                return MediaBrowserServiceCompat.this.mCurConnection.browserInfo;
            }

            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        public void notifyChildrenChanged(RemoteUserInfo arg1, String arg2, Bundle arg3) {
            this.notifyChildrenChangedForCompat(arg1, arg2, arg3);
        }

        public void notifyChildrenChanged(String arg1, Bundle arg2) {
            this.notifyChildrenChangedForFramework(arg1, arg2);
            this.notifyChildrenChangedForCompat(arg1, arg2);
        }

        void notifyChildrenChangedForCompat(RemoteUserInfo arg3, String arg4, Bundle arg5) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable(arg3, arg4, arg5) {
                public void run() {
                    int v0;
                    for(v0 = 0; v0 < this.this$1.this$0.mConnections.size(); ++v0) {
                        Object v1 = this.this$1.this$0.mConnections.valueAt(v0);
                        if(((ConnectionRecord)v1).browserInfo.equals(this.val$remoteUserInfo)) {
                            this.this$1.notifyChildrenChangedForCompatOnHandler(((ConnectionRecord)v1), this.val$parentId, this.val$options);
                        }
                    }
                }
            });
        }

        void notifyChildrenChangedForCompat(String arg3, Bundle arg4) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable(arg3, arg4) {
                public void run() {
                    Iterator v0 = this.this$1.this$0.mConnections.keySet().iterator();
                    while(v0.hasNext()) {
                        this.this$1.notifyChildrenChangedForCompatOnHandler(this.this$1.this$0.mConnections.get(v0.next()), this.val$parentId, this.val$options);
                    }
                }
            });
        }

        void notifyChildrenChangedForCompatOnHandler(ConnectionRecord arg4, String arg5, Bundle arg6) {
            Object v0 = arg4.subscriptions.get(arg5);
            if(v0 != null) {
                Iterator v0_1 = ((List)v0).iterator();
                while(v0_1.hasNext()) {
                    Object v1 = v0_1.next();
                    if(!MediaBrowserCompatUtils.hasDuplicatedItems(arg6, ((Pair)v1).second)) {
                        continue;
                    }

                    MediaBrowserServiceCompat.this.performLoadChildren(arg5, arg4, ((Pair)v1).second, arg6);
                }
            }
        }

        void notifyChildrenChangedForFramework(String arg1, Bundle arg2) {
            MediaBrowserServiceCompatApi21.notifyChildrenChanged(this.mServiceObj, arg1);
        }

        public IBinder onBind(Intent arg2) {
            return MediaBrowserServiceCompatApi21.onBind(this.mServiceObj, arg2);
        }

        public void onCreate() {
            this.mServiceObj = MediaBrowserServiceCompatApi21.createService(MediaBrowserServiceCompat.this, ((ServiceCompatProxy)this));
            MediaBrowserServiceCompatApi21.onCreate(this.mServiceObj);
        }

        public androidx.media.MediaBrowserServiceCompatApi21$BrowserRoot onGetRoot(String arg12, int arg13, Bundle arg14) {
            Bundle v1;
            ConnectionRecord v0 = null;
            if(arg14 == null || arg14.getInt("extra_client_version", 0) == 0) {
                v1 = ((Bundle)v0);
            }
            else {
                arg14.remove("extra_client_version");
                this.mMessenger = new Messenger(MediaBrowserServiceCompat.this.mHandler);
                v1 = new Bundle();
                v1.putInt("extra_service_version", 2);
                BundleCompat.putBinder(v1, "extra_messenger", this.mMessenger.getBinder());
                if(MediaBrowserServiceCompat.this.mSession != null) {
                    IMediaSession v2 = MediaBrowserServiceCompat.this.mSession.getExtraBinder();
                    String v3 = "extra_session_binder";
                    IBinder v2_1 = v2 == null ? ((IBinder)v0) : v2.asBinder();
                    BundleCompat.putBinder(v1, v3, v2_1);
                }
                else {
                    this.mRootExtrasList.add(v1);
                }
            }

            MediaBrowserServiceCompat.this.mCurConnection = new ConnectionRecord(MediaBrowserServiceCompat.this, arg12, -1, arg13, arg14, null);
            BrowserRoot v12 = MediaBrowserServiceCompat.this.onGetRoot(arg12, arg13, arg14);
            MediaBrowserServiceCompat.this.mCurConnection = v0;
            if(v12 == null) {
                return ((androidx.media.MediaBrowserServiceCompatApi21$BrowserRoot)v0);
            }

            if(v1 == null) {
                v1 = v12.getExtras();
            }
            else if(v12.getExtras() != null) {
                v1.putAll(v12.getExtras());
            }

            return new androidx.media.MediaBrowserServiceCompatApi21$BrowserRoot(v12.getRootId(), v1);
        }

        public void onLoadChildren(String arg2, ResultWrapper arg3) {
            MediaBrowserServiceCompat.this.onLoadChildren(arg2, new Result(arg2, arg3) {
                public void detach() {
                    this.val$resultWrapper.detach();
                }

                void onResultSent(Object arg1) {
                    this.onResultSent(((List)arg1));
                }

                void onResultSent(List arg5) {
                    Object v0_1;
                    if(arg5 != null) {
                        ArrayList v0 = new ArrayList();
                        Iterator v5 = arg5.iterator();
                        while(v5.hasNext()) {
                            Object v1 = v5.next();
                            Parcel v2 = Parcel.obtain();
                            ((MediaItem)v1).writeToParcel(v2, 0);
                            ((List)v0).add(v2);
                        }
                    }
                    else {
                        v0_1 = null;
                    }

                    this.val$resultWrapper.sendResult(v0_1);
                }
            });
        }

        public void setSessionToken(Token arg3) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable(arg3) {
                public void run() {
                    if(!this.this$1.mRootExtrasList.isEmpty()) {
                        IMediaSession v0 = this.val$token.getExtraBinder();
                        if(v0 != null) {
                            Iterator v1 = this.this$1.mRootExtrasList.iterator();
                            while(v1.hasNext()) {
                                BundleCompat.putBinder(v1.next(), "extra_session_binder", v0.asBinder());
                            }
                        }

                        this.this$1.mRootExtrasList.clear();
                    }

                    MediaBrowserServiceCompatApi21.setSessionToken(this.this$1.mServiceObj, this.val$token.getToken());
                }
            });
        }
    }

    @RequiresApi(value=23) class MediaBrowserServiceImplApi23 extends MediaBrowserServiceImplApi21 implements androidx.media.MediaBrowserServiceCompatApi23$ServiceCompatProxy {
        MediaBrowserServiceImplApi23(MediaBrowserServiceCompat arg1) {
            MediaBrowserServiceCompat.this = arg1;
            super(arg1);
        }

        public void onCreate() {
            this.mServiceObj = MediaBrowserServiceCompatApi23.createService(MediaBrowserServiceCompat.this, ((androidx.media.MediaBrowserServiceCompatApi23$ServiceCompatProxy)this));
            MediaBrowserServiceCompatApi21.onCreate(this.mServiceObj);
        }

        public void onLoadItem(String arg2, ResultWrapper arg3) {
            MediaBrowserServiceCompat.this.onLoadItem(arg2, new Result(arg2, arg3) {
                public void detach() {
                    this.val$resultWrapper.detach();
                }

                void onResultSent(MediaItem arg3) {
                    if(arg3 == null) {
                        this.val$resultWrapper.sendResult(null);
                    }
                    else {
                        Parcel v0 = Parcel.obtain();
                        arg3.writeToParcel(v0, 0);
                        this.val$resultWrapper.sendResult(v0);
                    }
                }

                void onResultSent(Object arg1) {
                    this.onResultSent(((MediaItem)arg1));
                }
            });
        }
    }

    @RequiresApi(value=26) class MediaBrowserServiceImplApi26 extends MediaBrowserServiceImplApi23 implements androidx.media.MediaBrowserServiceCompatApi26$ServiceCompatProxy {
        MediaBrowserServiceImplApi26(MediaBrowserServiceCompat arg1) {
            MediaBrowserServiceCompat.this = arg1;
            super(arg1);
        }

        public Bundle getBrowserRootHints() {
            if(MediaBrowserServiceCompat.this.mCurConnection != null) {
                Bundle v0 = MediaBrowserServiceCompat.this.mCurConnection.rootHints == null ? null : new Bundle(MediaBrowserServiceCompat.this.mCurConnection.rootHints);
                return v0;
            }

            return MediaBrowserServiceCompatApi26.getBrowserRootHints(this.mServiceObj);
        }

        void notifyChildrenChangedForFramework(String arg2, Bundle arg3) {
            if(arg3 != null) {
                MediaBrowserServiceCompatApi26.notifyChildrenChanged(this.mServiceObj, arg2, arg3);
            }
            else {
                super.notifyChildrenChangedForFramework(arg2, arg3);
            }
        }

        public void onCreate() {
            this.mServiceObj = MediaBrowserServiceCompatApi26.createService(MediaBrowserServiceCompat.this, ((androidx.media.MediaBrowserServiceCompatApi26$ServiceCompatProxy)this));
            MediaBrowserServiceCompatApi21.onCreate(this.mServiceObj);
        }

        public void onLoadChildren(String arg2, androidx.media.MediaBrowserServiceCompatApi26$ResultWrapper arg3, Bundle arg4) {
            MediaBrowserServiceCompat.this.onLoadChildren(arg2, new Result(arg2, arg3) {
                public void detach() {
                    this.val$resultWrapper.detach();
                }

                void onResultSent(Object arg1) {
                    this.onResultSent(((List)arg1));
                }

                void onResultSent(List arg5) {
                    List v0_1;
                    if(arg5 != null) {
                        ArrayList v0 = new ArrayList();
                        Iterator v5 = arg5.iterator();
                        while(v5.hasNext()) {
                            Object v1 = v5.next();
                            Parcel v2 = Parcel.obtain();
                            ((MediaItem)v1).writeToParcel(v2, 0);
                            ((List)v0).add(v2);
                        }
                    }
                    else {
                        v0_1 = null;
                    }

                    this.val$resultWrapper.sendResult(v0_1, this.getFlags());
                }
            }, arg4);
        }
    }

    @RequiresApi(value=28) class MediaBrowserServiceImplApi28 extends MediaBrowserServiceImplApi26 {
        MediaBrowserServiceImplApi28(MediaBrowserServiceCompat arg1) {
            MediaBrowserServiceCompat.this = arg1;
            super(arg1);
        }

        public RemoteUserInfo getCurrentBrowserInfo() {
            if(MediaBrowserServiceCompat.this.mCurConnection != null) {
                return MediaBrowserServiceCompat.this.mCurConnection.browserInfo;
            }

            return new RemoteUserInfo(this.mServiceObj.getCurrentBrowserInfo());
        }
    }

    class MediaBrowserServiceImplBase implements MediaBrowserServiceImpl {
        private Messenger mMessenger;

        MediaBrowserServiceImplBase(MediaBrowserServiceCompat arg1) {
            MediaBrowserServiceCompat.this = arg1;
            super();
        }

        public Bundle getBrowserRootHints() {
            if(MediaBrowserServiceCompat.this.mCurConnection != null) {
                Bundle v0 = MediaBrowserServiceCompat.this.mCurConnection.rootHints == null ? null : new Bundle(MediaBrowserServiceCompat.this.mCurConnection.rootHints);
                return v0;
            }

            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        public RemoteUserInfo getCurrentBrowserInfo() {
            if(MediaBrowserServiceCompat.this.mCurConnection != null) {
                return MediaBrowserServiceCompat.this.mCurConnection.browserInfo;
            }

            throw new IllegalStateException("This should be called inside of onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }

        public void notifyChildrenChanged(@NonNull RemoteUserInfo arg3, @NonNull String arg4, Bundle arg5) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable(arg3, arg4, arg5) {
                public void run() {
                    int v0 = 0;
                    while(v0 < this.this$1.this$0.mConnections.size()) {
                        Object v1 = this.this$1.this$0.mConnections.valueAt(v0);
                        if(((ConnectionRecord)v1).browserInfo.equals(this.val$remoteUserInfo)) {
                            this.this$1.notifyChildrenChangedOnHandler(((ConnectionRecord)v1), this.val$parentId, this.val$options);
                        }
                        else {
                            ++v0;
                            continue;
                        }

                        return;
                    }
                }
            });
        }

        public void notifyChildrenChanged(@NonNull String arg3, Bundle arg4) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable(arg3, arg4) {
                public void run() {
                    Iterator v0 = this.this$1.this$0.mConnections.keySet().iterator();
                    while(v0.hasNext()) {
                        this.this$1.notifyChildrenChangedOnHandler(this.this$1.this$0.mConnections.get(v0.next()), this.val$parentId, this.val$options);
                    }
                }
            });
        }

        void notifyChildrenChangedOnHandler(ConnectionRecord arg4, String arg5, Bundle arg6) {
            Object v0 = arg4.subscriptions.get(arg5);
            if(v0 != null) {
                Iterator v0_1 = ((List)v0).iterator();
                while(v0_1.hasNext()) {
                    Object v1 = v0_1.next();
                    if(!MediaBrowserCompatUtils.hasDuplicatedItems(arg6, ((Pair)v1).second)) {
                        continue;
                    }

                    MediaBrowserServiceCompat.this.performLoadChildren(arg5, arg4, ((Pair)v1).second, arg6);
                }
            }
        }

        public IBinder onBind(Intent arg2) {
            if("android.media.browse.MediaBrowserService".equals(arg2.getAction())) {
                return this.mMessenger.getBinder();
            }

            return null;
        }

        public void onCreate() {
            this.mMessenger = new Messenger(MediaBrowserServiceCompat.this.mHandler);
        }

        public void setSessionToken(Token arg3) {
            MediaBrowserServiceCompat.this.mHandler.post(new Runnable(arg3) {
                public void run() {
                    Iterator v0 = this.this$1.this$0.mConnections.values().iterator();
                    while(v0.hasNext()) {
                        Object v1 = v0.next();
                        try {
                            ((ConnectionRecord)v1).callbacks.onConnect(((ConnectionRecord)v1).root.getRootId(), this.val$token, ((ConnectionRecord)v1).root.getExtras());
                        }
                        catch(RemoteException ) {
                            Log.w("MBServiceCompat", "Connection for " + ((ConnectionRecord)v1).pkg + " is no longer valid.");
                            v0.remove();
                        }
                    }
                }
            });
        }
    }

    public class Result {
        private final Object mDebug;
        private boolean mDetachCalled;
        private int mFlags;
        private boolean mSendErrorCalled;
        private boolean mSendProgressUpdateCalled;
        private boolean mSendResultCalled;

        Result(Object arg1) {
            super();
            this.mDebug = arg1;
        }

        private void checkExtraFields(Bundle arg2) {
            if(arg2 == null) {
                return;
            }

            if(arg2.containsKey("android.media.browse.extra.DOWNLOAD_PROGRESS")) {
                float v2 = arg2.getFloat("android.media.browse.extra.DOWNLOAD_PROGRESS");
                if(v2 >= -0.00001f && v2 <= 1.00001f) {
                    return;
                }

                throw new IllegalArgumentException("The value of the EXTRA_DOWNLOAD_PROGRESS field must be a float number within [0.0, 1.0].");
            }
        }

        public void detach() {
            StringBuilder v1;
            if(!this.mDetachCalled) {
                if(!this.mSendResultCalled) {
                    if(!this.mSendErrorCalled) {
                        this.mDetachCalled = true;
                        return;
                    }

                    v1 = new StringBuilder();
                    v1.append("detach() called when sendError() had already been called for: ");
                    v1.append(this.mDebug);
                    throw new IllegalStateException(v1.toString());
                }

                v1 = new StringBuilder();
                v1.append("detach() called when sendResult() had already been called for: ");
                v1.append(this.mDebug);
                throw new IllegalStateException(v1.toString());
            }

            v1 = new StringBuilder();
            v1.append("detach() called when detach() had already been called for: ");
            v1.append(this.mDebug);
            throw new IllegalStateException(v1.toString());
        }

        int getFlags() {
            return this.mFlags;
        }

        boolean isDone() {
            boolean v0 = (this.mDetachCalled) || (this.mSendResultCalled) || (this.mSendErrorCalled) ? true : false;
            return v0;
        }

        void onErrorSent(Bundle arg3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("It is not supported to send an error for ");
            v0.append(this.mDebug);
            throw new UnsupportedOperationException(v0.toString());
        }

        void onProgressUpdateSent(Bundle arg3) {
            StringBuilder v0 = new StringBuilder();
            v0.append("It is not supported to send an interim update for ");
            v0.append(this.mDebug);
            throw new UnsupportedOperationException(v0.toString());
        }

        void onResultSent(Object arg1) {
        }

        public void sendError(Bundle arg3) {
            if(!this.mSendResultCalled && !this.mSendErrorCalled) {
                this.mSendErrorCalled = true;
                this.onErrorSent(arg3);
                return;
            }

            StringBuilder v0 = new StringBuilder();
            v0.append("sendError() called when either sendResult() or sendError() had already been called for: ");
            v0.append(this.mDebug);
            throw new IllegalStateException(v0.toString());
        }

        public void sendProgressUpdate(Bundle arg3) {
            if(!this.mSendResultCalled && !this.mSendErrorCalled) {
                this.checkExtraFields(arg3);
                this.mSendProgressUpdateCalled = true;
                this.onProgressUpdateSent(arg3);
                return;
            }

            StringBuilder v0 = new StringBuilder();
            v0.append("sendProgressUpdate() called when either sendResult() or sendError() had already been called for: ");
            v0.append(this.mDebug);
            throw new IllegalStateException(v0.toString());
        }

        public void sendResult(Object arg3) {
            if(!this.mSendResultCalled && !this.mSendErrorCalled) {
                this.mSendResultCalled = true;
                this.onResultSent(arg3);
                return;
            }

            StringBuilder v0 = new StringBuilder();
            v0.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
            v0.append(this.mDebug);
            throw new IllegalStateException(v0.toString());
        }

        void setFlags(int arg1) {
            this.mFlags = arg1;
        }
    }

    class ServiceBinderImpl {
        ServiceBinderImpl(MediaBrowserServiceCompat arg1) {
            MediaBrowserServiceCompat.this = arg1;
            super();
        }

        public void addSubscription(String arg9, IBinder arg10, Bundle arg11, ServiceCallbacks arg12) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable(arg12, arg9, arg10, arg11) {
                public void run() {
                    Object v0 = this.this$1.this$0.mConnections.get(this.val$callbacks.asBinder());
                    if(v0 == null) {
                        Log.w("MBServiceCompat", "addSubscription for callback that isn\'t registered id=" + this.val$id);
                        return;
                    }

                    this.this$1.this$0.addSubscription(this.val$id, ((ConnectionRecord)v0), this.val$token, this.val$options);
                }
            });
        }

        public void connect(String arg10, int arg11, int arg12, Bundle arg13, ServiceCallbacks arg14) {
            if(MediaBrowserServiceCompat.this.isValidPackage(arg10, arg12)) {
                MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable(arg14, arg10, arg11, arg12, arg13) {
                    public void run() {
                        IBinder v0 = this.val$callbacks.asBinder();
                        this.this$1.this$0.mConnections.remove(v0);
                        ConnectionRecord v1 = new ConnectionRecord(this.this$1.this$0, this.val$pkg, this.val$pid, this.val$uid, this.val$rootHints, this.val$callbacks);
                        this.this$1.this$0.mCurConnection = v1;
                        v1.root = this.this$1.this$0.onGetRoot(this.val$pkg, this.val$uid, this.val$rootHints);
                        this.this$1.this$0.mCurConnection = null;
                        if(v1.root == null) {
                            Log.i("MBServiceCompat", "No root for client " + this.val$pkg + " from service " + this.getClass().getName());
                            try {
                                this.val$callbacks.onConnectFailed();
                            }
                            catch(RemoteException ) {
                                Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.val$pkg);
                            }

                            return;
                        }

                        try {
                            this.this$1.this$0.mConnections.put(v0, v1);
                            v0.linkToDeath(((IBinder$DeathRecipient)v1), 0);
                            if(this.this$1.this$0.mSession == null) {
                                return;
                            }

                            this.val$callbacks.onConnect(v1.root.getRootId(), this.this$1.this$0.mSession, v1.root.getExtras());
                        }
                        catch(RemoteException ) {
                            Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.val$pkg);
                            this.this$1.this$0.mConnections.remove(v0);
                        }
                    }
                });
                return;
            }

            StringBuilder v13 = new StringBuilder();
            v13.append("Package/uid mismatch: uid=");
            v13.append(arg12);
            v13.append(" package=");
            v13.append(arg10);
            throw new IllegalArgumentException(v13.toString());
        }

        public void disconnect(ServiceCallbacks arg3) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable(arg3) {
                public void run() {
                    Object v0 = this.this$1.this$0.mConnections.remove(this.val$callbacks.asBinder());
                    if(v0 != null) {
                        ((ConnectionRecord)v0).callbacks.asBinder().unlinkToDeath(((IBinder$DeathRecipient)v0), 0);
                    }
                }
            });
        }

        public void getMediaItem(String arg3, ResultReceiver arg4, ServiceCallbacks arg5) {
            if(!TextUtils.isEmpty(((CharSequence)arg3))) {
                if(arg4 == null) {
                }
                else {
                    MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable(arg5, arg3, arg4) {
                        public void run() {
                            Object v0 = this.this$1.this$0.mConnections.get(this.val$callbacks.asBinder());
                            if(v0 == null) {
                                Log.w("MBServiceCompat", "getMediaItem for callback that isn\'t registered id=" + this.val$mediaId);
                                return;
                            }

                            this.this$1.this$0.performLoadItem(this.val$mediaId, ((ConnectionRecord)v0), this.val$receiver);
                        }
                    });
                    return;
                }
            }
        }

        public void registerCallbacks(ServiceCallbacks arg10, String arg11, int arg12, int arg13, Bundle arg14) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable(arg10, arg11, arg12, arg13, arg14) {
                public void run() {
                    IBinder v0 = this.val$callbacks.asBinder();
                    this.this$1.this$0.mConnections.remove(v0);
                    ConnectionRecord v1 = new ConnectionRecord(this.this$1.this$0, this.val$pkg, this.val$pid, this.val$uid, this.val$rootHints, this.val$callbacks);
                    this.this$1.this$0.mConnections.put(v0, v1);
                    try {
                        v0.linkToDeath(((IBinder$DeathRecipient)v1), 0);
                    }
                    catch(RemoteException ) {
                        Log.w("MBServiceCompat", "IBinder is already dead.");
                    }
                }
            });
        }

        public void removeSubscription(String arg3, IBinder arg4, ServiceCallbacks arg5) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable(arg5, arg3, arg4) {
                public void run() {
                    Object v0 = this.this$1.this$0.mConnections.get(this.val$callbacks.asBinder());
                    if(v0 == null) {
                        Log.w("MBServiceCompat", "removeSubscription for callback that isn\'t registered id=" + this.val$id);
                        return;
                    }

                    if(!this.this$1.this$0.removeSubscription(this.val$id, ((ConnectionRecord)v0), this.val$token)) {
                        Log.w("MBServiceCompat", "removeSubscription called for " + this.val$id + " which is not subscribed");
                    }
                }
            });
        }

        public void search(String arg9, Bundle arg10, ResultReceiver arg11, ServiceCallbacks arg12) {
            if(!TextUtils.isEmpty(((CharSequence)arg9))) {
                if(arg11 == null) {
                }
                else {
                    MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable(arg12, arg9, arg10, arg11) {
                        public void run() {
                            Object v0 = this.this$1.this$0.mConnections.get(this.val$callbacks.asBinder());
                            if(v0 == null) {
                                Log.w("MBServiceCompat", "search for callback that isn\'t registered query=" + this.val$query);
                                return;
                            }

                            this.this$1.this$0.performSearch(this.val$query, this.val$extras, ((ConnectionRecord)v0), this.val$receiver);
                        }
                    });
                    return;
                }
            }
        }

        public void sendCustomAction(String arg9, Bundle arg10, ResultReceiver arg11, ServiceCallbacks arg12) {
            if(!TextUtils.isEmpty(((CharSequence)arg9))) {
                if(arg11 == null) {
                }
                else {
                    MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable(arg12, arg9, arg10, arg11) {
                        public void run() {
                            Object v0 = this.this$1.this$0.mConnections.get(this.val$callbacks.asBinder());
                            if(v0 == null) {
                                Log.w("MBServiceCompat", "sendCustomAction for callback that isn\'t registered action=" + this.val$action + ", extras=" + this.val$extras);
                                return;
                            }

                            this.this$1.this$0.performCustomAction(this.val$action, this.val$extras, ((ConnectionRecord)v0), this.val$receiver);
                        }
                    });
                    return;
                }
            }
        }

        public void unregisterCallbacks(ServiceCallbacks arg3) {
            MediaBrowserServiceCompat.this.mHandler.postOrRun(new Runnable(arg3) {
                public void run() {
                    IBinder v0 = this.val$callbacks.asBinder();
                    Object v1 = this.this$1.this$0.mConnections.remove(v0);
                    if(v1 != null) {
                        v0.unlinkToDeath(((IBinder$DeathRecipient)v1), 0);
                    }
                }
            });
        }
    }

    interface ServiceCallbacks {
        IBinder asBinder();

        void onConnect(String arg1, Token arg2, Bundle arg3) throws RemoteException;

        void onConnectFailed() throws RemoteException;

        void onLoadChildren(String arg1, List arg2, Bundle arg3, Bundle arg4) throws RemoteException;
    }

    class ServiceCallbacksCompat implements ServiceCallbacks {
        final Messenger mCallbacks;

        ServiceCallbacksCompat(Messenger arg1) {
            super();
            this.mCallbacks = arg1;
        }

        public IBinder asBinder() {
            return this.mCallbacks.getBinder();
        }

        public void onConnect(String arg3, Token arg4, Bundle arg5) throws RemoteException {
            if(arg5 == null) {
                arg5 = new Bundle();
            }

            arg5.putInt("extra_service_version", 2);
            Bundle v0 = new Bundle();
            v0.putString("data_media_item_id", arg3);
            v0.putParcelable("data_media_session_token", ((Parcelable)arg4));
            v0.putBundle("data_root_hints", arg5);
            this.sendRequest(1, v0);
        }

        public void onConnectFailed() throws RemoteException {
            this.sendRequest(2, null);
        }

        public void onLoadChildren(String arg3, List arg4, Bundle arg5, Bundle arg6) throws RemoteException {
            ArrayList v4;
            Bundle v0 = new Bundle();
            v0.putString("data_media_item_id", arg3);
            v0.putBundle("data_options", arg5);
            v0.putBundle("data_notify_children_changed_options", arg6);
            if(arg4 != null) {
                arg3 = "data_media_item_list";
                if((arg4 instanceof ArrayList)) {
                }
                else {
                    v4 = new ArrayList(((Collection)arg4));
                }

                v0.putParcelableArrayList(arg3, v4);
            }

            this.sendRequest(3, v0);
        }

        private void sendRequest(int arg2, Bundle arg3) throws RemoteException {
            Message v0 = Message.obtain();
            v0.what = arg2;
            v0.arg1 = 2;
            v0.setData(arg3);
            this.mCallbacks.send(v0);
        }
    }

    final class ServiceHandler extends Handler {
        private final ServiceBinderImpl mServiceBinderImpl;

        ServiceHandler(MediaBrowserServiceCompat arg2) {
            MediaBrowserServiceCompat.this = arg2;
            super();
            this.mServiceBinderImpl = new ServiceBinderImpl(MediaBrowserServiceCompat.this);
        }

        public void handleMessage(Message arg9) {
            Bundle v1_1;
            Bundle v0 = arg9.getData();
            switch(arg9.what) {
                case 1: {
                    Bundle v6 = v0.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(v6);
                    this.mServiceBinderImpl.connect(v0.getString("data_package_name"), v0.getInt("data_calling_pid"), v0.getInt("data_calling_uid"), v6, new ServiceCallbacksCompat(arg9.replyTo));
                    break;
                }
                case 2: {
                    this.mServiceBinderImpl.disconnect(new ServiceCallbacksCompat(arg9.replyTo));
                    break;
                }
                case 3: {
                    v1_1 = v0.getBundle("data_options");
                    MediaSessionCompat.ensureClassLoader(v1_1);
                    this.mServiceBinderImpl.addSubscription(v0.getString("data_media_item_id"), BundleCompat.getBinder(v0, "data_callback_token"), v1_1, new ServiceCallbacksCompat(arg9.replyTo));
                    break;
                }
                case 4: {
                    this.mServiceBinderImpl.removeSubscription(v0.getString("data_media_item_id"), BundleCompat.getBinder(v0, "data_callback_token"), new ServiceCallbacksCompat(arg9.replyTo));
                    break;
                }
                case 5: {
                    this.mServiceBinderImpl.getMediaItem(v0.getString("data_media_item_id"), v0.getParcelable("data_result_receiver"), new ServiceCallbacksCompat(arg9.replyTo));
                    break;
                }
                case 6: {
                    Bundle v7 = v0.getBundle("data_root_hints");
                    MediaSessionCompat.ensureClassLoader(v7);
                    this.mServiceBinderImpl.registerCallbacks(new ServiceCallbacksCompat(arg9.replyTo), v0.getString("data_package_name"), v0.getInt("data_calling_pid"), v0.getInt("data_calling_uid"), v7);
                    break;
                }
                case 7: {
                    this.mServiceBinderImpl.unregisterCallbacks(new ServiceCallbacksCompat(arg9.replyTo));
                    break;
                }
                case 8: {
                    v1_1 = v0.getBundle("data_search_extras");
                    MediaSessionCompat.ensureClassLoader(v1_1);
                    this.mServiceBinderImpl.search(v0.getString("data_search_query"), v1_1, v0.getParcelable("data_result_receiver"), new ServiceCallbacksCompat(arg9.replyTo));
                    break;
                }
                case 9: {
                    v1_1 = v0.getBundle("data_custom_action_extras");
                    MediaSessionCompat.ensureClassLoader(v1_1);
                    this.mServiceBinderImpl.sendCustomAction(v0.getString("data_custom_action"), v1_1, v0.getParcelable("data_result_receiver"), new ServiceCallbacksCompat(arg9.replyTo));
                    break;
                }
                default: {
                    Log.w("MBServiceCompat", "Unhandled message: " + arg9 + "\n  Service version: " + 2 + "\n  Client version: " + arg9.arg1);
                    break;
                }
            }
        }

        public void postOrRun(Runnable arg3) {
            if(Thread.currentThread() == this.getLooper().getThread()) {
                arg3.run();
            }
            else {
                this.post(arg3);
            }
        }

        public boolean sendMessageAtTime(Message arg4, long arg5) {
            Bundle v0 = arg4.getData();
            v0.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            v0.putInt("data_calling_uid", Binder.getCallingUid());
            v0.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(arg4, arg5);
        }
    }

    static final boolean DEBUG = false;
    private static final float EPSILON = 0.00001f;
    @RestrictTo(value={Scope.LIBRARY}) public static final String KEY_MEDIA_ITEM = "media_item";
    @RestrictTo(value={Scope.LIBRARY}) public static final String KEY_SEARCH_RESULTS = "search_results";
    @RestrictTo(value={Scope.LIBRARY}) public static final int RESULT_ERROR = -1;
    static final int RESULT_FLAG_ON_LOAD_ITEM_NOT_IMPLEMENTED = 2;
    static final int RESULT_FLAG_ON_SEARCH_NOT_IMPLEMENTED = 4;
    static final int RESULT_FLAG_OPTION_NOT_HANDLED = 1;
    @RestrictTo(value={Scope.LIBRARY}) public static final int RESULT_OK = 0;
    @RestrictTo(value={Scope.LIBRARY}) public static final int RESULT_PROGRESS_UPDATE = 1;
    public static final String SERVICE_INTERFACE = "android.media.browse.MediaBrowserService";
    static final String TAG = "MBServiceCompat";
    final ArrayMap mConnections;
    ConnectionRecord mCurConnection;
    final ServiceHandler mHandler;
    private MediaBrowserServiceImpl mImpl;
    Token mSession;

    static {
        MediaBrowserServiceCompat.DEBUG = Log.isLoggable("MBServiceCompat", 3);
    }

    public MediaBrowserServiceCompat() {
        super();
        this.mConnections = new ArrayMap();
        this.mHandler = new ServiceHandler(this);
    }

    void addSubscription(String arg5, ConnectionRecord arg6, IBinder arg7, Bundle arg8) {
        Object v0 = arg6.subscriptions.get(arg5);
        if(v0 == null) {
            ArrayList v0_1 = new ArrayList();
        }

        Iterator v1 = ((List)v0).iterator();
        do {
        label_6:
            if(!v1.hasNext()) {
                goto label_15;
            }

            Object v2 = v1.next();
            if(arg7 != ((Pair)v2).first) {
                goto label_6;
            }
        }
        while(!MediaBrowserCompatUtils.areSameOptions(arg8, ((Pair)v2).second));

        return;
    label_15:
        ((List)v0).add(new Pair(arg7, arg8));
        arg6.subscriptions.put(arg5, v0);
        this.performLoadChildren(arg5, arg6, arg8, null);
        this.mCurConnection = arg6;
        this.onSubscribe(arg5, arg8);
        this.mCurConnection = null;
    }

    List applyOptions(List arg4, Bundle arg5) {
        if(arg4 == null) {
            return null;
        }

        int v1 = -1;
        int v0 = arg5.getInt("android.media.browse.extra.PAGE", v1);
        int v5 = arg5.getInt("android.media.browse.extra.PAGE_SIZE", v1);
        if(v0 == v1 && v5 == v1) {
            return arg4;
        }

        v1 = v5 * v0;
        int v2 = v1 + v5;
        if(v0 >= 0 && v5 >= 1) {
            if(v1 >= arg4.size()) {
            }
            else {
                if(v2 > arg4.size()) {
                    v2 = arg4.size();
                }

                return arg4.subList(v1, v2);
            }
        }

        return Collections.emptyList();
    }

    @RestrictTo(value={Scope.LIBRARY}) public void attachToBaseContext(Context arg1) {
        this.attachBaseContext(arg1);
    }

    public void dump(FileDescriptor arg1, PrintWriter arg2, String[] arg3) {
    }

    public final Bundle getBrowserRootHints() {
        return this.mImpl.getBrowserRootHints();
    }

    @NonNull public final RemoteUserInfo getCurrentBrowserInfo() {
        return this.mImpl.getCurrentBrowserInfo();
    }

    @Nullable public Token getSessionToken() {
        return this.mSession;
    }

    boolean isValidPackage(String arg5, int arg6) {
        if(arg5 == null) {
            return 0;
        }

        String[] v6 = this.getPackageManager().getPackagesForUid(arg6);
        int v1 = v6.length;
        int v2;
        for(v2 = 0; v2 < v1; ++v2) {
            if(v6[v2].equals(arg5)) {
                return 1;
            }
        }

        return 0;
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void notifyChildrenChanged(@NonNull RemoteUserInfo arg2, @NonNull String arg3, @NonNull Bundle arg4) {
        if(arg2 != null) {
            if(arg3 != null) {
                if(arg4 != null) {
                    this.mImpl.notifyChildrenChanged(arg2, arg3, arg4);
                    return;
                }

                throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
            }

            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }

        throw new IllegalArgumentException("remoteUserInfo cannot be null in notifyChildrenChanged");
    }

    public void notifyChildrenChanged(@NonNull String arg3) {
        if(arg3 != null) {
            this.mImpl.notifyChildrenChanged(arg3, null);
            return;
        }

        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public void notifyChildrenChanged(@NonNull String arg2, @NonNull Bundle arg3) {
        if(arg2 != null) {
            if(arg3 != null) {
                this.mImpl.notifyChildrenChanged(arg2, arg3);
                return;
            }

            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }

        throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
    }

    public IBinder onBind(Intent arg2) {
        return this.mImpl.onBind(arg2);
    }

    public void onCreate() {
        super.onCreate();
        if(Build$VERSION.SDK_INT >= 28) {
            this.mImpl = new MediaBrowserServiceImplApi28(this);
        }
        else if(Build$VERSION.SDK_INT >= 26) {
            this.mImpl = new MediaBrowserServiceImplApi26(this);
        }
        else if(Build$VERSION.SDK_INT >= 23) {
            this.mImpl = new MediaBrowserServiceImplApi23(this);
        }
        else if(Build$VERSION.SDK_INT >= 21) {
            this.mImpl = new MediaBrowserServiceImplApi21(this);
        }
        else {
            this.mImpl = new MediaBrowserServiceImplBase(this);
        }

        this.mImpl.onCreate();
    }

    public void onCustomAction(@NonNull String arg1, Bundle arg2, @NonNull Result arg3) {
        arg3.sendError(null);
    }

    @Nullable public abstract BrowserRoot onGetRoot(@NonNull String arg1, int arg2, @Nullable Bundle arg3);

    public abstract void onLoadChildren(@NonNull String arg1, @NonNull Result arg2);

    public void onLoadChildren(@NonNull String arg1, @NonNull Result arg2, @NonNull Bundle arg3) {
        arg2.setFlags(1);
        this.onLoadChildren(arg1, arg2);
    }

    public void onLoadItem(String arg1, @NonNull Result arg2) {
        arg2.setFlags(2);
        arg2.sendResult(null);
    }

    public void onSearch(@NonNull String arg1, Bundle arg2, @NonNull Result arg3) {
        arg3.setFlags(4);
        arg3.sendResult(null);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void onSubscribe(String arg1, Bundle arg2) {
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public void onUnsubscribe(String arg1) {
    }

    void performCustomAction(String arg2, Bundle arg3, ConnectionRecord arg4, ResultReceiver arg5) {
        androidx.media.MediaBrowserServiceCompat$4 v0 = new Result(arg2, arg5) {
            void onErrorSent(Bundle arg3) {
                this.val$receiver.send(-1, arg3);
            }

            void onProgressUpdateSent(Bundle arg3) {
                this.val$receiver.send(1, arg3);
            }

            void onResultSent(Bundle arg3) {
                this.val$receiver.send(0, arg3);
            }

            void onResultSent(Object arg1) {
                this.onResultSent(((Bundle)arg1));
            }
        };
        this.mCurConnection = arg4;
        this.onCustomAction(arg2, arg3, ((Result)v0));
        this.mCurConnection = null;
        if(((Result)v0).isDone()) {
            return;
        }

        StringBuilder v5 = new StringBuilder();
        v5.append("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
        v5.append(arg2);
        v5.append(" extras=");
        v5.append(arg3);
        throw new IllegalStateException(v5.toString());
    }

    void performLoadChildren(String arg9, ConnectionRecord arg10, Bundle arg11, Bundle arg12) {
        androidx.media.MediaBrowserServiceCompat$1 v7 = new Result(arg9, arg10, arg9, arg11, arg12) {
            void onResultSent(Object arg1) {
                this.onResultSent(((List)arg1));
            }

            void onResultSent(List arg5) {
                if(MediaBrowserServiceCompat.this.mConnections.get(this.val$connection.callbacks.asBinder()) != this.val$connection) {
                    if(MediaBrowserServiceCompat.DEBUG) {
                        Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.val$connection.pkg + " id=" + this.val$parentId);
                    }

                    return;
                }

                if((this.getFlags() & 1) != 0) {
                    arg5 = MediaBrowserServiceCompat.this.applyOptions(arg5, this.val$subscribeOptions);
                }

                try {
                    this.val$connection.callbacks.onLoadChildren(this.val$parentId, arg5, this.val$subscribeOptions, this.val$notifyChildrenChangedOptions);
                }
                catch(RemoteException ) {
                    Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.val$parentId + " package=" + this.val$connection.pkg);
                }
            }
        };
        this.mCurConnection = arg10;
        if(arg11 == null) {
            this.onLoadChildren(arg9, ((Result)v7));
        }
        else {
            this.onLoadChildren(arg9, ((Result)v7), arg11);
        }

        this.mCurConnection = null;
        if(((Result)v7).isDone()) {
            return;
        }

        StringBuilder v12 = new StringBuilder();
        v12.append("onLoadChildren must call detach() or sendResult() before returning for package=");
        v12.append(arg10.pkg);
        v12.append(" id=");
        v12.append(arg9);
        throw new IllegalStateException(v12.toString());
    }

    void performLoadItem(String arg2, ConnectionRecord arg3, ResultReceiver arg4) {
        androidx.media.MediaBrowserServiceCompat$2 v0 = new Result(arg2, arg4) {
            void onResultSent(MediaItem arg3) {
                if((this.getFlags() & 2) != 0) {
                    this.val$receiver.send(-1, null);
                    return;
                }

                Bundle v0 = new Bundle();
                v0.putParcelable("media_item", ((Parcelable)arg3));
                this.val$receiver.send(0, v0);
            }

            void onResultSent(Object arg1) {
                this.onResultSent(((MediaItem)arg1));
            }
        };
        this.mCurConnection = arg3;
        this.onLoadItem(arg2, ((Result)v0));
        this.mCurConnection = null;
        if(((Result)v0).isDone()) {
            return;
        }

        StringBuilder v4 = new StringBuilder();
        v4.append("onLoadItem must call detach() or sendResult() before returning for id=");
        v4.append(arg2);
        throw new IllegalStateException(v4.toString());
    }

    void performSearch(String arg2, Bundle arg3, ConnectionRecord arg4, ResultReceiver arg5) {
        androidx.media.MediaBrowserServiceCompat$3 v0 = new Result(arg2, arg5) {
            void onResultSent(Object arg1) {
                this.onResultSent(((List)arg1));
            }

            void onResultSent(List arg5) {
                if((this.getFlags() & 4) == 0) {
                    if(arg5 == null) {
                    }
                    else {
                        Bundle v0 = new Bundle();
                        v0.putParcelableArray("search_results", arg5.toArray(new MediaItem[0]));
                        this.val$receiver.send(0, v0);
                        return;
                    }
                }

                this.val$receiver.send(-1, null);
            }
        };
        this.mCurConnection = arg4;
        this.onSearch(arg2, arg3, ((Result)v0));
        this.mCurConnection = null;
        if(((Result)v0).isDone()) {
            return;
        }

        StringBuilder v4 = new StringBuilder();
        v4.append("onSearch must call detach() or sendResult() before returning for query=");
        v4.append(arg2);
        throw new IllegalStateException(v4.toString());
    }

    boolean removeSubscription(String arg7, ConnectionRecord arg8, IBinder arg9) {
        boolean v0 = true;
        boolean v1 = false;
        ConnectionRecord v2 = null;
        if(arg9 != null) {
            goto label_15;
        }

        try {
            if(arg8.subscriptions.remove(arg7) != null) {
            }
            else {
                goto label_8;
            }
        }
        catch(Throwable v9) {
            goto label_35;
        }

        goto label_9;
    label_8:
        v0 = false;
    label_9:
        this.mCurConnection = arg8;
        this.onUnsubscribe(arg7);
        this.mCurConnection = v2;
        return v0;
        try {
        label_15:
            Object v3 = arg8.subscriptions.get(arg7);
            if(v3 != null) {
                Iterator v4 = ((List)v3).iterator();
                while(v4.hasNext()) {
                    if(arg9 != v4.next().first) {
                        continue;
                    }

                    v4.remove();
                    v1 = true;
                }

                if(((List)v3).size() == 0) {
                    arg8.subscriptions.remove(arg7);
                }
            }
        }
        catch(Throwable v9) {
        label_35:
            this.mCurConnection = arg8;
            this.onUnsubscribe(arg7);
            this.mCurConnection = v2;
            throw v9;
        }

        this.mCurConnection = arg8;
        this.onUnsubscribe(arg7);
        this.mCurConnection = v2;
        return v1;
    }

    public void setSessionToken(Token arg2) {
        if(arg2 != null) {
            if(this.mSession == null) {
                this.mSession = arg2;
                this.mImpl.setSessionToken(arg2);
                return;
            }

            throw new IllegalStateException("The session token has already been set.");
        }

        throw new IllegalArgumentException("Session token may not be null.");
    }
}

