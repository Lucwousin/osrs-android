package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.Log;
import android.view.MenuItem;
import android.view.View$OnClickListener;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout$DrawerListener;
import androidx.drawerlayout.widget.DrawerLayout;

public class ActionBarDrawerToggle implements DrawerListener {
    public interface Delegate {
        Context getActionBarThemedContext();

        Drawable getThemeUpIndicator();

        boolean isNavigationVisible();

        void setActionBarDescription(@StringRes int arg1);

        void setActionBarUpIndicator(Drawable arg1, @StringRes int arg2);
    }

    public interface DelegateProvider {
        @Nullable Delegate getDrawerToggleDelegate();
    }

    class FrameworkActionBarDelegate implements Delegate {
        private final Activity mActivity;
        private SetIndicatorInfo mSetIndicatorInfo;

        FrameworkActionBarDelegate(Activity arg1) {
            super();
            this.mActivity = arg1;
        }

        public Context getActionBarThemedContext() {
            ActionBar v0 = this.mActivity.getActionBar();
            if(v0 != null) {
                return v0.getThemedContext();
            }

            return this.mActivity;
        }

        public Drawable getThemeUpIndicator() {
            if(Build$VERSION.SDK_INT >= 18) {
                TypedArray v0 = this.getActionBarThemedContext().obtainStyledAttributes(null, new int[]{0x101030B}, 0x10102CE, 0);
                Drawable v1 = v0.getDrawable(0);
                v0.recycle();
                return v1;
            }

            return ActionBarDrawerToggleHoneycomb.getThemeUpIndicator(this.mActivity);
        }

        public boolean isNavigationVisible() {
            ActionBar v0 = this.mActivity.getActionBar();
            boolean v0_1 = v0 == null || (v0.getDisplayOptions() & 4) == 0 ? false : true;
            return v0_1;
        }

        public void setActionBarDescription(int arg3) {
            if(Build$VERSION.SDK_INT >= 18) {
                ActionBar v0 = this.mActivity.getActionBar();
                if(v0 != null) {
                    v0.setHomeActionContentDescription(arg3);
                }
            }
            else {
                this.mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarDescription(this.mSetIndicatorInfo, this.mActivity, arg3);
            }
        }

        public void setActionBarUpIndicator(Drawable arg4, int arg5) {
            ActionBar v0 = this.mActivity.getActionBar();
            if(v0 != null) {
                if(Build$VERSION.SDK_INT >= 18) {
                    v0.setHomeAsUpIndicator(arg4);
                    v0.setHomeActionContentDescription(arg5);
                }
                else {
                    v0.setDisplayShowHomeEnabled(true);
                    this.mSetIndicatorInfo = ActionBarDrawerToggleHoneycomb.setActionBarUpIndicator(this.mSetIndicatorInfo, this.mActivity, arg4, arg5);
                    v0.setDisplayShowHomeEnabled(false);
                }
            }
        }
    }

    class ToolbarCompatDelegate implements Delegate {
        final CharSequence mDefaultContentDescription;
        final Drawable mDefaultUpIndicator;
        final Toolbar mToolbar;

        ToolbarCompatDelegate(Toolbar arg2) {
            super();
            this.mToolbar = arg2;
            this.mDefaultUpIndicator = arg2.getNavigationIcon();
            this.mDefaultContentDescription = arg2.getNavigationContentDescription();
        }

        public Context getActionBarThemedContext() {
            return this.mToolbar.getContext();
        }

        public Drawable getThemeUpIndicator() {
            return this.mDefaultUpIndicator;
        }

        public boolean isNavigationVisible() {
            return 1;
        }

        public void setActionBarDescription(@StringRes int arg2) {
            if(arg2 == 0) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultContentDescription);
            }
            else {
                this.mToolbar.setNavigationContentDescription(arg2);
            }
        }

        public void setActionBarUpIndicator(Drawable arg2, @StringRes int arg3) {
            this.mToolbar.setNavigationIcon(arg2);
            this.setActionBarDescription(arg3);
        }
    }

    private final Delegate mActivityImpl;
    private final int mCloseDrawerContentDescRes;
    boolean mDrawerIndicatorEnabled;
    private final DrawerLayout mDrawerLayout;
    private boolean mDrawerSlideAnimationEnabled;
    private boolean mHasCustomUpIndicator;
    private Drawable mHomeAsUpIndicator;
    private final int mOpenDrawerContentDescRes;
    private DrawerArrowDrawable mSlider;
    View$OnClickListener mToolbarNavigationClickListener;
    private boolean mWarnedForDisplayHomeAsUp;

    ActionBarDrawerToggle(Activity arg2, Toolbar arg3, DrawerLayout arg4, DrawerArrowDrawable arg5, @StringRes int arg6, @StringRes int arg7) {
        super();
        this.mDrawerSlideAnimationEnabled = true;
        this.mDrawerIndicatorEnabled = true;
        this.mWarnedForDisplayHomeAsUp = false;
        if(arg3 != null) {
            this.mActivityImpl = new ToolbarCompatDelegate(arg3);
            arg3.setNavigationOnClickListener(new View$OnClickListener() {
                public void onClick(View arg2) {
                    if(ActionBarDrawerToggle.this.mDrawerIndicatorEnabled) {
                        ActionBarDrawerToggle.this.toggle();
                    }
                    else if(ActionBarDrawerToggle.this.mToolbarNavigationClickListener != null) {
                        ActionBarDrawerToggle.this.mToolbarNavigationClickListener.onClick(arg2);
                    }
                }
            });
        }
        else if((arg2 instanceof DelegateProvider)) {
            this.mActivityImpl = ((DelegateProvider)arg2).getDrawerToggleDelegate();
        }
        else {
            this.mActivityImpl = new FrameworkActionBarDelegate(arg2);
        }

        this.mDrawerLayout = arg4;
        this.mOpenDrawerContentDescRes = arg6;
        this.mCloseDrawerContentDescRes = arg7;
        this.mSlider = arg5 == null ? new DrawerArrowDrawable(this.mActivityImpl.getActionBarThemedContext()) : arg5;
        this.mHomeAsUpIndicator = this.getThemeUpIndicator();
    }

    public ActionBarDrawerToggle(Activity arg8, DrawerLayout arg9, @StringRes int arg10, @StringRes int arg11) {
        this(arg8, null, arg9, null, arg10, arg11);
    }

    public ActionBarDrawerToggle(Activity arg8, DrawerLayout arg9, Toolbar arg10, @StringRes int arg11, @StringRes int arg12) {
        this(arg8, arg10, arg9, null, arg11, arg12);
    }

    @NonNull public DrawerArrowDrawable getDrawerArrowDrawable() {
        return this.mSlider;
    }

    Drawable getThemeUpIndicator() {
        return this.mActivityImpl.getThemeUpIndicator();
    }

    public View$OnClickListener getToolbarNavigationClickListener() {
        return this.mToolbarNavigationClickListener;
    }

    public boolean isDrawerIndicatorEnabled() {
        return this.mDrawerIndicatorEnabled;
    }

    public boolean isDrawerSlideAnimationEnabled() {
        return this.mDrawerSlideAnimationEnabled;
    }

    public void onConfigurationChanged(Configuration arg1) {
        if(!this.mHasCustomUpIndicator) {
            this.mHomeAsUpIndicator = this.getThemeUpIndicator();
        }

        this.syncState();
    }

    public void onDrawerClosed(View arg1) {
        this.setPosition(0f);
        if(this.mDrawerIndicatorEnabled) {
            this.setActionBarDescription(this.mOpenDrawerContentDescRes);
        }
    }

    public void onDrawerOpened(View arg1) {
        this.setPosition(1f);
        if(this.mDrawerIndicatorEnabled) {
            this.setActionBarDescription(this.mCloseDrawerContentDescRes);
        }
    }

    public void onDrawerSlide(View arg2, float arg3) {
        if(this.mDrawerSlideAnimationEnabled) {
            this.setPosition(Math.min(1f, Math.max(0f, arg3)));
        }
        else {
            this.setPosition(0f);
        }
    }

    public void onDrawerStateChanged(int arg1) {
    }

    public boolean onOptionsItemSelected(MenuItem arg2) {
        if(arg2 != null && arg2.getItemId() == 0x102002C && (this.mDrawerIndicatorEnabled)) {
            this.toggle();
            return 1;
        }

        return 0;
    }

    void setActionBarDescription(int arg2) {
        this.mActivityImpl.setActionBarDescription(arg2);
    }

    void setActionBarUpIndicator(Drawable arg3, int arg4) {
        if(!this.mWarnedForDisplayHomeAsUp && !this.mActivityImpl.isNavigationVisible()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.mWarnedForDisplayHomeAsUp = true;
        }

        this.mActivityImpl.setActionBarUpIndicator(arg3, arg4);
    }

    public void setDrawerArrowDrawable(@NonNull DrawerArrowDrawable arg1) {
        this.mSlider = arg1;
        this.syncState();
    }

    public void setDrawerIndicatorEnabled(boolean arg4) {
        if(arg4 != this.mDrawerIndicatorEnabled) {
            if(arg4) {
                DrawerArrowDrawable v0 = this.mSlider;
                int v1 = this.mDrawerLayout.isDrawerOpen(0x800003) ? this.mCloseDrawerContentDescRes : this.mOpenDrawerContentDescRes;
                this.setActionBarUpIndicator(((Drawable)v0), v1);
            }
            else {
                this.setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
            }

            this.mDrawerIndicatorEnabled = arg4;
        }
    }

    public void setDrawerSlideAnimationEnabled(boolean arg1) {
        this.mDrawerSlideAnimationEnabled = arg1;
        if(!arg1) {
            this.setPosition(0f);
        }
    }

    public void setHomeAsUpIndicator(int arg2) {
        Drawable v2 = arg2 != 0 ? this.mDrawerLayout.getResources().getDrawable(arg2) : null;
        this.setHomeAsUpIndicator(v2);
    }

    public void setHomeAsUpIndicator(Drawable arg2) {
        if(arg2 == null) {
            this.mHomeAsUpIndicator = this.getThemeUpIndicator();
            this.mHasCustomUpIndicator = false;
        }
        else {
            this.mHomeAsUpIndicator = arg2;
            this.mHasCustomUpIndicator = true;
        }

        if(!this.mDrawerIndicatorEnabled) {
            this.setActionBarUpIndicator(this.mHomeAsUpIndicator, 0);
        }
    }

    private void setPosition(float arg3) {
        if(arg3 == 1f) {
            this.mSlider.setVerticalMirror(true);
        }
        else if(arg3 == 0f) {
            this.mSlider.setVerticalMirror(false);
        }

        this.mSlider.setProgress(arg3);
    }

    public void setToolbarNavigationClickListener(View$OnClickListener arg1) {
        this.mToolbarNavigationClickListener = arg1;
    }

    public void syncState() {
        int v1 = 0x800003;
        if(this.mDrawerLayout.isDrawerOpen(v1)) {
            this.setPosition(1f);
        }
        else {
            this.setPosition(0f);
        }

        if(this.mDrawerIndicatorEnabled) {
            DrawerArrowDrawable v0 = this.mSlider;
            v1 = this.mDrawerLayout.isDrawerOpen(v1) ? this.mCloseDrawerContentDescRes : this.mOpenDrawerContentDescRes;
            this.setActionBarUpIndicator(((Drawable)v0), v1);
        }
    }

    void toggle() {
        int v1 = 0x800003;
        int v0 = this.mDrawerLayout.getDrawerLockMode(v1);
        if((this.mDrawerLayout.isDrawerVisible(v1)) && v0 != 2) {
            this.mDrawerLayout.closeDrawer(v1);
        }
        else if(v0 != 1) {
            this.mDrawerLayout.openDrawer(v1);
        }
    }
}

