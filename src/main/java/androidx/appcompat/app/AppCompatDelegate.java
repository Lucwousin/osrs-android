package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.Window;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.ActionMode$Callback;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class AppCompatDelegate {
    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface NightMode {
    }

    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    static final String TAG = "AppCompatDelegate";
    private static int sDefaultNightMode = -1;

    static {
    }

    AppCompatDelegate() {
        super();
    }

    public abstract void addContentView(View arg1, ViewGroup$LayoutParams arg2);

    public abstract boolean applyDayNight();

    public static AppCompatDelegate create(Activity arg2, AppCompatCallback arg3) {
        return new AppCompatDelegateImpl(((Context)arg2), arg2.getWindow(), arg3);
    }

    public static AppCompatDelegate create(Dialog arg2, AppCompatCallback arg3) {
        return new AppCompatDelegateImpl(arg2.getContext(), arg2.getWindow(), arg3);
    }

    public static AppCompatDelegate create(Context arg1, Window arg2, AppCompatCallback arg3) {
        return new AppCompatDelegateImpl(arg1, arg2, arg3);
    }

    public abstract View createView(@Nullable View arg1, String arg2, @NonNull Context arg3, @NonNull AttributeSet arg4);

    @Nullable public abstract View findViewById(@IdRes int arg1);

    public static int getDefaultNightMode() {
        return AppCompatDelegate.sDefaultNightMode;
    }

    @Nullable public abstract Delegate getDrawerToggleDelegate();

    public abstract MenuInflater getMenuInflater();

    @Nullable public abstract ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int arg1);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public static boolean isCompatVectorFromResourcesEnabled() {
        return VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(Configuration arg1);

    public abstract void onCreate(Bundle arg1);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle arg1);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle arg1);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int arg1);

    public static void setCompatVectorFromResourcesEnabled(boolean arg0) {
        VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(arg0);
    }

    public abstract void setContentView(@LayoutRes int arg1);

    public abstract void setContentView(View arg1);

    public abstract void setContentView(View arg1, ViewGroup$LayoutParams arg2);

    public static void setDefaultNightMode(int arg1) {
        switch(arg1) {
            case -1: 
            case 0: 
            case 1: 
            case 2: {
                AppCompatDelegate.sDefaultNightMode = arg1;
                break;
            }
            default: {
                Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
                break;
            }
        }
    }

    public abstract void setHandleNativeActionModesEnabled(boolean arg1);

    public abstract void setLocalNightMode(int arg1);

    public abstract void setSupportActionBar(@Nullable Toolbar arg1);

    public abstract void setTitle(@Nullable CharSequence arg1);

    @Nullable public abstract ActionMode startSupportActionMode(@NonNull Callback arg1);
}

