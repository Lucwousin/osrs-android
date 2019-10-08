package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback$OnSharedElementsReadyListener;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender$SendIntentException;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.core.view.DragAndDropPermissionsCompat;
import java.util.List;
import java.util.Map;

public class ActivityCompat extends ContextCompat {
    public interface OnRequestPermissionsResultCallback {
        void onRequestPermissionsResult(int arg1, @NonNull String[] arg2, @NonNull int[] arg3);
    }

    public interface PermissionCompatDelegate {
        boolean onActivityResult(@NonNull Activity arg1, @IntRange(from=0) int arg2, int arg3, @Nullable Intent arg4);

        boolean requestPermissions(@NonNull Activity arg1, @NonNull String[] arg2, @IntRange(from=0) int arg3);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public interface RequestPermissionsRequestCodeValidator {
        void validateRequestPermissionsRequestCode(int arg1);
    }

    @RequiresApi(value=21) class SharedElementCallback21Impl extends SharedElementCallback {
        private final androidx.core.app.SharedElementCallback mCallback;

        SharedElementCallback21Impl(androidx.core.app.SharedElementCallback arg1) {
            super();
            this.mCallback = arg1;
        }

        public Parcelable onCaptureSharedElementSnapshot(View arg2, Matrix arg3, RectF arg4) {
            return this.mCallback.onCaptureSharedElementSnapshot(arg2, arg3, arg4);
        }

        public View onCreateSnapshotView(Context arg2, Parcelable arg3) {
            return this.mCallback.onCreateSnapshotView(arg2, arg3);
        }

        public void onMapSharedElements(List arg2, Map arg3) {
            this.mCallback.onMapSharedElements(arg2, arg3);
        }

        public void onRejectSharedElements(List arg2) {
            this.mCallback.onRejectSharedElements(arg2);
        }

        public void onSharedElementEnd(List arg2, List arg3, List arg4) {
            this.mCallback.onSharedElementEnd(arg2, arg3, arg4);
        }

        public void onSharedElementStart(List arg2, List arg3, List arg4) {
            this.mCallback.onSharedElementStart(arg2, arg3, arg4);
        }

        @RequiresApi(value=23) public void onSharedElementsArrived(List arg3, List arg4, SharedElementCallback$OnSharedElementsReadyListener arg5) {
            this.mCallback.onSharedElementsArrived(arg3, arg4, new OnSharedElementsReadyListener(arg5) {
                public void onSharedElementsReady() {
                    this.val$listener.onSharedElementsReady();
                }
            });
        }
    }

    private static PermissionCompatDelegate sDelegate;

    protected ActivityCompat() {
        super();
    }

    public static void finishAffinity(@NonNull Activity arg2) {
        if(Build$VERSION.SDK_INT >= 16) {
            arg2.finishAffinity();
        }
        else {
            arg2.finish();
        }
    }

    public static void finishAfterTransition(@NonNull Activity arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.finishAfterTransition();
        }
        else {
            arg2.finish();
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) public static PermissionCompatDelegate getPermissionCompatDelegate() {
        return ActivityCompat.sDelegate;
    }

    @Nullable public static Uri getReferrer(@NonNull Activity arg2) {
        if(Build$VERSION.SDK_INT >= 22) {
            return arg2.getReferrer();
        }

        Intent v2 = arg2.getIntent();
        Parcelable v0 = v2.getParcelableExtra("android.intent.extra.REFERRER");
        if(v0 != null) {
            return ((Uri)v0);
        }

        String v2_1 = v2.getStringExtra("android.intent.extra.REFERRER_NAME");
        if(v2_1 != null) {
            return Uri.parse(v2_1);
        }

        return null;
    }

    @Deprecated public static boolean invalidateOptionsMenu(Activity arg0) {
        arg0.invalidateOptionsMenu();
        return 1;
    }

    public static void postponeEnterTransition(@NonNull Activity arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.postponeEnterTransition();
        }
    }

    @Nullable public static DragAndDropPermissionsCompat requestDragAndDropPermissions(Activity arg0, DragEvent arg1) {
        return DragAndDropPermissionsCompat.request(arg0, arg1);
    }

    public static void requestPermissions(@NonNull Activity arg2, @NonNull String[] arg3, @IntRange(from=0) int arg4) {
        if(ActivityCompat.sDelegate != null && (ActivityCompat.sDelegate.requestPermissions(arg2, arg3, arg4))) {
            return;
        }

        if(Build$VERSION.SDK_INT >= 23) {
            if((arg2 instanceof RequestPermissionsRequestCodeValidator)) {
                arg2.validateRequestPermissionsRequestCode(arg4);
            }

            arg2.requestPermissions(arg3, arg4);
        }
        else {
            if(!(arg2 instanceof OnRequestPermissionsResultCallback)) {
                return;
            }

            new Handler(Looper.getMainLooper()).post(new Runnable(arg3, arg2, arg4) {
                public void run() {
                    int[] v0 = new int[this.val$permissions.length];
                    PackageManager v1 = this.val$activity.getPackageManager();
                    String v2 = this.val$activity.getPackageName();
                    int v3 = this.val$permissions.length;
                    int v4;
                    for(v4 = 0; v4 < v3; ++v4) {
                        v0[v4] = v1.checkPermission(this.val$permissions[v4], v2);
                    }

                    this.val$activity.onRequestPermissionsResult(this.val$requestCode, this.val$permissions, v0);
                }
            });
        }
    }

    @NonNull public static View requireViewById(@NonNull Activity arg2, @IdRes int arg3) {
        if(Build$VERSION.SDK_INT >= 28) {
            return arg2.requireViewById(arg3);
        }

        View v2 = arg2.findViewById(arg3);
        if(v2 != null) {
            return v2;
        }

        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void setEnterSharedElementCallback(@NonNull Activity arg2, @Nullable androidx.core.app.SharedElementCallback arg3) {
        SharedElementCallback21Impl v0;
        if(Build$VERSION.SDK_INT >= 21) {
            if(arg3 != null) {
                v0 = new SharedElementCallback21Impl(arg3);
            }
            else {
                SharedElementCallback v0_1 = null;
            }

            arg2.setEnterSharedElementCallback(((SharedElementCallback)v0));
        }
    }

    public static void setExitSharedElementCallback(@NonNull Activity arg2, @Nullable androidx.core.app.SharedElementCallback arg3) {
        SharedElementCallback21Impl v0;
        if(Build$VERSION.SDK_INT >= 21) {
            if(arg3 != null) {
                v0 = new SharedElementCallback21Impl(arg3);
            }
            else {
                SharedElementCallback v0_1 = null;
            }

            arg2.setExitSharedElementCallback(((SharedElementCallback)v0));
        }
    }

    public static void setPermissionCompatDelegate(@Nullable PermissionCompatDelegate arg0) {
        ActivityCompat.sDelegate = arg0;
    }

    public static boolean shouldShowRequestPermissionRationale(@NonNull Activity arg2, @NonNull String arg3) {
        if(Build$VERSION.SDK_INT >= 23) {
            return arg2.shouldShowRequestPermissionRationale(arg3);
        }

        return 0;
    }

    public static void startActivityForResult(@NonNull Activity arg2, @NonNull Intent arg3, int arg4, @Nullable Bundle arg5) {
        if(Build$VERSION.SDK_INT >= 16) {
            arg2.startActivityForResult(arg3, arg4, arg5);
        }
        else {
            arg2.startActivityForResult(arg3, arg4);
        }
    }

    public static void startIntentSenderForResult(@NonNull Activity arg2, @NonNull IntentSender arg3, int arg4, @Nullable Intent arg5, int arg6, int arg7, int arg8, @Nullable Bundle arg9) throws IntentSender$SendIntentException {
        if(Build$VERSION.SDK_INT >= 16) {
            arg2.startIntentSenderForResult(arg3, arg4, arg5, arg6, arg7, arg8, arg9);
        }
        else {
            arg2.startIntentSenderForResult(arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    public static void startPostponedEnterTransition(@NonNull Activity arg2) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.startPostponedEnterTransition();
        }
    }
}

