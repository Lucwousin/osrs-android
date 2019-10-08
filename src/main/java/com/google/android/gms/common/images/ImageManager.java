package com.google.android.gms.common.images;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.widget.ImageView;
import androidx.collection.LruCache;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class ImageManager {
    @KeepName final class ImageReceiver extends ResultReceiver {
        private final Uri mUri;
        private final ArrayList zamp;

        ImageReceiver(ImageManager arg2, Uri arg3) {
            this.zamq = arg2;
            super(new zal(Looper.getMainLooper()));
            this.mUri = arg3;
            this.zamp = new ArrayList();
        }

        public final void onReceiveResult(int arg4, Bundle arg5) {
            ImageManager.zaf(this.zamq).execute(new zab(this.zamq, this.mUri, arg5.getParcelable("com.google.android.gms.extra.fileDescriptor")));
        }

        static ArrayList zaa(ImageReceiver arg0) {
            return arg0.zamp;
        }

        public final void zab(zaa arg2) {
            Asserts.checkMainThread("ImageReceiver.addImageRequest() must be called in the main thread");
            this.zamp.add(arg2);
        }

        public final void zac(zaa arg2) {
            Asserts.checkMainThread("ImageReceiver.removeImageRequest() must be called in the main thread");
            this.zamp.remove(arg2);
        }

        public final void zace() {
            Intent v0 = new Intent("com.google.android.gms.common.images.LOAD_IMAGE");
            v0.putExtra("com.google.android.gms.extras.uri", this.mUri);
            v0.putExtra("com.google.android.gms.extras.resultReceiver", ((Parcelable)this));
            v0.putExtra("com.google.android.gms.extras.priority", 3);
            ImageManager.zab(this.zamq).sendBroadcast(v0);
        }
    }

    public interface OnImageLoadedListener {
        void onImageLoaded(Uri arg1, Drawable arg2, boolean arg3);
    }

    final class com.google.android.gms.common.images.ImageManager$zaa extends LruCache {
        protected final void entryRemoved(boolean arg1, Object arg2, Object arg3, Object arg4) {
            super.entryRemoved(arg1, arg2, arg3, arg4);
        }

        protected final int sizeOf(Object arg1, Object arg2) {
            return ((Bitmap)arg2).getHeight() * ((Bitmap)arg2).getRowBytes();
        }
    }

    final class zab implements Runnable {
        private final Uri mUri;
        private final ParcelFileDescriptor zamr;

        public zab(ImageManager arg1, Uri arg2, ParcelFileDescriptor arg3) {
            this.zamq = arg1;
            super();
            this.mUri = arg2;
            this.zamr = arg3;
        }

        public final void run() {
            Bitmap v9;
            boolean v10;
            Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can\'t be executed in the main thread");
            boolean v2 = false;
            Bitmap v3 = null;
            if(this.zamr != null) {
                try {
                    v3 = BitmapFactory.decodeFileDescriptor(this.zamr.getFileDescriptor());
                }
                catch(OutOfMemoryError v0) {
                    String v4 = String.valueOf(this.mUri);
                    StringBuilder v6 = new StringBuilder(String.valueOf(v4).length() + 34);
                    v6.append("OOM while loading bitmap for uri: ");
                    v6.append(v4);
                    Log.e("ImageManager", v6.toString(), ((Throwable)v0));
                    v2 = true;
                }

                try {
                    this.zamr.close();
                }
                catch(IOException v0_1) {
                    Log.e("ImageManager", "closed failed", ((Throwable)v0_1));
                }

                v10 = v2;
                v9 = v3;
            }
            else {
                v9 = v3;
                v10 = false;
            }

            CountDownLatch v0_2 = new CountDownLatch(1);
            ImageManager.zag(this.zamq).post(new zad(this.zamq, this.mUri, v9, v10, v0_2));
            try {
                v0_2.await();
                return;
            }
            catch(InterruptedException ) {
                String v1 = String.valueOf(this.mUri);
                StringBuilder v3_1 = new StringBuilder(String.valueOf(v1).length() + 0x20);
                v3_1.append("Latch interrupted while posting ");
                v3_1.append(v1);
                Log.w("ImageManager", v3_1.toString());
                return;
            }
        }
    }

    final class zac implements Runnable {
        private final zaa zams;

        public zac(ImageManager arg1, zaa arg2) {
            this.zamq = arg1;
            super();
            this.zams = arg2;
        }

        public final void run() {
            Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
            Object v0 = ImageManager.zaa(this.zamq).get(this.zams);
            if(v0 != null) {
                ImageManager.zaa(this.zamq).remove(this.zams);
                ((ImageReceiver)v0).zac(this.zams);
            }

            com.google.android.gms.common.images.zab v0_1 = this.zams.zamu;
            if(v0_1.uri == null) {
                this.zams.zaa(ImageManager.zab(this.zamq), ImageManager.zac(this.zamq), true);
                return;
            }

            Bitmap v1 = ImageManager.zaa(this.zamq, v0_1);
            if(v1 != null) {
                this.zams.zaa(ImageManager.zab(this.zamq), v1, true);
                return;
            }

            Object v1_1 = ImageManager.zad(this.zamq).get(v0_1.uri);
            if(v1_1 != null) {
                if(SystemClock.elapsedRealtime() - ((Long)v1_1).longValue() < 3600000) {
                    this.zams.zaa(ImageManager.zab(this.zamq), ImageManager.zac(this.zamq), true);
                    return;
                }
                else {
                    ImageManager.zad(this.zamq).remove(v0_1.uri);
                }
            }

            this.zams.zaa(ImageManager.zab(this.zamq), ImageManager.zac(this.zamq));
            v1_1 = ImageManager.zae(this.zamq).get(v0_1.uri);
            if(v1_1 == null) {
                ImageReceiver v1_2 = new ImageReceiver(this.zamq, v0_1.uri);
                ImageManager.zae(this.zamq).put(v0_1.uri, v1_2);
            }

            ((ImageReceiver)v1_1).zab(this.zams);
            if(!(this.zams instanceof com.google.android.gms.common.images.zad)) {
                ImageManager.zaa(this.zamq).put(this.zams, v1_1);
            }

            Object v2 = ImageManager.zacc();
            __monitor_enter(v2);
            try {
                if(!ImageManager.zacd().contains(v0_1.uri)) {
                    ImageManager.zacd().add(v0_1.uri);
                    ((ImageReceiver)v1_1).zace();
                }

                __monitor_exit(v2);
                return;
            label_95:
                __monitor_exit(v2);
            }
            catch(Throwable v0_2) {
                goto label_95;
            }

            throw v0_2;
        }
    }

    final class zad implements Runnable {
        private final Bitmap mBitmap;
        private final Uri mUri;
        private final CountDownLatch zadq;
        private boolean zamt;

        public zad(ImageManager arg1, Uri arg2, Bitmap arg3, boolean arg4, CountDownLatch arg5) {
            this.zamq = arg1;
            super();
            this.mUri = arg2;
            this.mBitmap = arg3;
            this.zamt = arg4;
            this.zadq = arg5;
        }

        public final void run() {
            Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
            int v0 = this.mBitmap != null ? 1 : 0;
            if(ImageManager.zah(this.zamq) != null) {
                if(this.zamt) {
                    ImageManager.zah(this.zamq).evictAll();
                    System.gc();
                    this.zamt = false;
                    ImageManager.zag(this.zamq).post(((Runnable)this));
                    return;
                }
                else if(v0 != 0) {
                    ImageManager.zah(this.zamq).put(new com.google.android.gms.common.images.zab(this.mUri), this.mBitmap);
                }
            }

            Object v2 = ImageManager.zae(this.zamq).remove(this.mUri);
            if(v2 != null) {
                ArrayList v2_1 = ImageReceiver.zaa(((ImageReceiver)v2));
                int v3 = v2_1.size();
                int v4;
                for(v4 = 0; v4 < v3; ++v4) {
                    Object v5 = v2_1.get(v4);
                    if(v0 != 0) {
                        ((zaa)v5).zaa(ImageManager.zab(this.zamq), this.mBitmap, false);
                    }
                    else {
                        ImageManager.zad(this.zamq).put(this.mUri, Long.valueOf(SystemClock.elapsedRealtime()));
                        ((zaa)v5).zaa(ImageManager.zab(this.zamq), ImageManager.zac(this.zamq), false);
                    }

                    if(!(v5 instanceof com.google.android.gms.common.images.zad)) {
                        ImageManager.zaa(this.zamq).remove(v5);
                    }
                }
            }

            this.zadq.countDown();
            Object v0_1 = ImageManager.zacc();
            __monitor_enter(v0_1);
            try {
                ImageManager.zacd().remove(this.mUri);
                __monitor_exit(v0_1);
                return;
            label_74:
                __monitor_exit(v0_1);
            }
            catch(Throwable v1) {
                goto label_74;
            }

            throw v1;
        }
    }

    private final Context mContext;
    private final Handler mHandler;
    private static final Object zamg;
    private static HashSet zamh;
    private static ImageManager zami;
    private final ExecutorService zamj;
    private final com.google.android.gms.common.images.ImageManager$zaa zamk;
    private final zak zaml;
    private final Map zamm;
    private final Map zamn;
    private final Map zamo;

    static {
        ImageManager.zamg = new Object();
        ImageManager.zamh = new HashSet();
    }

    private ImageManager(Context arg1, boolean arg2) {
        super();
        this.mContext = arg1.getApplicationContext();
        this.mHandler = new zal(Looper.getMainLooper());
        this.zamj = Executors.newFixedThreadPool(4);
        this.zamk = null;
        this.zaml = new zak();
        this.zamm = new HashMap();
        this.zamn = new HashMap();
        this.zamo = new HashMap();
    }

    public static ImageManager create(Context arg2) {
        if(ImageManager.zami == null) {
            ImageManager.zami = new ImageManager(arg2, false);
        }

        return ImageManager.zami;
    }

    public final void loadImage(ImageView arg2, int arg3) {
        this.zaa(new com.google.android.gms.common.images.zac(arg2, arg3));
    }

    public final void loadImage(ImageView arg2, Uri arg3) {
        this.zaa(new com.google.android.gms.common.images.zac(arg2, arg3));
    }

    public final void loadImage(ImageView arg2, Uri arg3, int arg4) {
        com.google.android.gms.common.images.zac v0 = new com.google.android.gms.common.images.zac(arg2, arg3);
        ((zaa)v0).zamw = arg4;
        this.zaa(((zaa)v0));
    }

    public final void loadImage(OnImageLoadedListener arg2, Uri arg3) {
        this.zaa(new com.google.android.gms.common.images.zad(arg2, arg3));
    }

    public final void loadImage(OnImageLoadedListener arg2, Uri arg3, int arg4) {
        com.google.android.gms.common.images.zad v0 = new com.google.android.gms.common.images.zad(arg2, arg3);
        ((zaa)v0).zamw = arg4;
        this.zaa(((zaa)v0));
    }

    static Bitmap zaa(ImageManager arg0, com.google.android.gms.common.images.zab arg1) {
        return arg0.zaa(arg1);
    }

    private final Bitmap zaa(com.google.android.gms.common.images.zab arg2) {
        if(this.zamk == null) {
            return null;
        }

        return this.zamk.get(arg2);
    }

    static Map zaa(ImageManager arg0) {
        return arg0.zamm;
    }

    private final void zaa(zaa arg2) {
        Asserts.checkMainThread("ImageManager.loadImage() must be called in the main thread");
        new zac(this, arg2).run();
    }

    static Context zab(ImageManager arg0) {
        return arg0.mContext;
    }

    static zak zac(ImageManager arg0) {
        return arg0.zaml;
    }

    static Object zacc() {
        return ImageManager.zamg;
    }

    static HashSet zacd() {
        return ImageManager.zamh;
    }

    static Map zad(ImageManager arg0) {
        return arg0.zamo;
    }

    static Map zae(ImageManager arg0) {
        return arg0.zamn;
    }

    static ExecutorService zaf(ImageManager arg0) {
        return arg0.zamj;
    }

    static Handler zag(ImageManager arg0) {
        return arg0.mHandler;
    }

    static com.google.android.gms.common.images.ImageManager$zaa zah(ImageManager arg0) {
        return arg0.zamk;
    }
}

