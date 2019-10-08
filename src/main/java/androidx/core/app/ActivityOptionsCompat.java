package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.util.Pair;

public class ActivityOptionsCompat {
    @RequiresApi(value=16) class ActivityOptionsCompatImpl extends ActivityOptionsCompat {
        private final ActivityOptions mActivityOptions;

        ActivityOptionsCompatImpl(ActivityOptions arg1) {
            super();
            this.mActivityOptions = arg1;
        }

        public Rect getLaunchBounds() {
            if(Build$VERSION.SDK_INT < 24) {
                return null;
            }

            return this.mActivityOptions.getLaunchBounds();
        }

        public void requestUsageTimeReport(PendingIntent arg3) {
            if(Build$VERSION.SDK_INT >= 23) {
                this.mActivityOptions.requestUsageTimeReport(arg3);
            }
        }

        public ActivityOptionsCompat setLaunchBounds(@Nullable Rect arg3) {
            if(Build$VERSION.SDK_INT < 24) {
                return this;
            }

            return new ActivityOptionsCompatImpl(this.mActivityOptions.setLaunchBounds(arg3));
        }

        public Bundle toBundle() {
            return this.mActivityOptions.toBundle();
        }

        public void update(ActivityOptionsCompat arg2) {
            if((arg2 instanceof ActivityOptionsCompatImpl)) {
                this.mActivityOptions.update(((ActivityOptionsCompatImpl)arg2).mActivityOptions);
            }
        }
    }

    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    protected ActivityOptionsCompat() {
        super();
    }

    @Nullable public Rect getLaunchBounds() {
        return null;
    }

    @NonNull public static ActivityOptionsCompat makeBasic() {
        if(Build$VERSION.SDK_INT >= 23) {
            return new ActivityOptionsCompatImpl(ActivityOptions.makeBasic());
        }

        return new ActivityOptionsCompat();
    }

    @NonNull public static ActivityOptionsCompat makeClipRevealAnimation(@NonNull View arg2, int arg3, int arg4, int arg5, int arg6) {
        if(Build$VERSION.SDK_INT >= 23) {
            return new ActivityOptionsCompatImpl(ActivityOptions.makeClipRevealAnimation(arg2, arg3, arg4, arg5, arg6));
        }

        return new ActivityOptionsCompat();
    }

    @NonNull public static ActivityOptionsCompat makeCustomAnimation(@NonNull Context arg2, int arg3, int arg4) {
        if(Build$VERSION.SDK_INT >= 16) {
            return new ActivityOptionsCompatImpl(ActivityOptions.makeCustomAnimation(arg2, arg3, arg4));
        }

        return new ActivityOptionsCompat();
    }

    @NonNull public static ActivityOptionsCompat makeScaleUpAnimation(@NonNull View arg2, int arg3, int arg4, int arg5, int arg6) {
        if(Build$VERSION.SDK_INT >= 16) {
            return new ActivityOptionsCompatImpl(ActivityOptions.makeScaleUpAnimation(arg2, arg3, arg4, arg5, arg6));
        }

        return new ActivityOptionsCompat();
    }

    @NonNull public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity arg2, @NonNull View arg3, @NonNull String arg4) {
        if(Build$VERSION.SDK_INT >= 21) {
            return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(arg2, arg3, arg4));
        }

        return new ActivityOptionsCompat();
    }

    @NonNull public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity arg4, Pair[] arg5) {
        if(Build$VERSION.SDK_INT >= 21) {
            android.util.Pair[] v0 = null;
            if(arg5 != null) {
                v0 = new android.util.Pair[arg5.length];
                int v1;
                for(v1 = 0; v1 < arg5.length; ++v1) {
                    v0[v1] = android.util.Pair.create(arg5[v1].first, arg5[v1].second);
                }
            }

            return new ActivityOptionsCompatImpl(ActivityOptions.makeSceneTransitionAnimation(arg4, v0));
        }

        return new ActivityOptionsCompat();
    }

    @NonNull public static ActivityOptionsCompat makeTaskLaunchBehind() {
        if(Build$VERSION.SDK_INT >= 21) {
            return new ActivityOptionsCompatImpl(ActivityOptions.makeTaskLaunchBehind());
        }

        return new ActivityOptionsCompat();
    }

    @NonNull public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(@NonNull View arg2, @NonNull Bitmap arg3, int arg4, int arg5) {
        if(Build$VERSION.SDK_INT >= 16) {
            return new ActivityOptionsCompatImpl(ActivityOptions.makeThumbnailScaleUpAnimation(arg2, arg3, arg4, arg5));
        }

        return new ActivityOptionsCompat();
    }

    public void requestUsageTimeReport(@NonNull PendingIntent arg1) {
    }

    @NonNull public ActivityOptionsCompat setLaunchBounds(@Nullable Rect arg1) {
        return this;
    }

    @Nullable public Bundle toBundle() {
        return null;
    }

    public void update(@NonNull ActivityOptionsCompat arg1) {
    }
}

