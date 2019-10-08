package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;
import android.os.Build$VERSION;
import android.util.Log;
import android.view.MenuItem$OnActionExpandListener;
import android.view.MenuItem;
import android.view.View;
import androidx.core.internal.view.SupportMenuItem;

public final class MenuItemCompat {
    @Deprecated public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(MenuItem arg1);

        boolean onMenuItemActionExpand(MenuItem arg1);
    }

    @Deprecated public static final int SHOW_AS_ACTION_ALWAYS = 2;
    @Deprecated public static final int SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW = 8;
    @Deprecated public static final int SHOW_AS_ACTION_IF_ROOM = 1;
    @Deprecated public static final int SHOW_AS_ACTION_NEVER = 0;
    @Deprecated public static final int SHOW_AS_ACTION_WITH_TEXT = 4;
    private static final String TAG = "MenuItemCompat";

    private MenuItemCompat() {
        super();
    }

    @Deprecated public static boolean collapseActionView(MenuItem arg0) {
        return arg0.collapseActionView();
    }

    @Deprecated public static boolean expandActionView(MenuItem arg0) {
        return arg0.expandActionView();
    }

    public static ActionProvider getActionProvider(MenuItem arg1) {
        if((arg1 instanceof SupportMenuItem)) {
            return ((SupportMenuItem)arg1).getSupportActionProvider();
        }

        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated public static View getActionView(MenuItem arg0) {
        return arg0.getActionView();
    }

    public static int getAlphabeticModifiers(MenuItem arg2) {
        if((arg2 instanceof SupportMenuItem)) {
            return ((SupportMenuItem)arg2).getAlphabeticModifiers();
        }

        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getAlphabeticModifiers();
        }

        return 0;
    }

    public static CharSequence getContentDescription(MenuItem arg2) {
        if((arg2 instanceof SupportMenuItem)) {
            return ((SupportMenuItem)arg2).getContentDescription();
        }

        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getContentDescription();
        }

        return null;
    }

    public static ColorStateList getIconTintList(MenuItem arg2) {
        if((arg2 instanceof SupportMenuItem)) {
            return ((SupportMenuItem)arg2).getIconTintList();
        }

        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getIconTintList();
        }

        return null;
    }

    public static PorterDuff$Mode getIconTintMode(MenuItem arg2) {
        if((arg2 instanceof SupportMenuItem)) {
            return ((SupportMenuItem)arg2).getIconTintMode();
        }

        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getIconTintMode();
        }

        return null;
    }

    public static int getNumericModifiers(MenuItem arg2) {
        if((arg2 instanceof SupportMenuItem)) {
            return ((SupportMenuItem)arg2).getNumericModifiers();
        }

        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getNumericModifiers();
        }

        return 0;
    }

    public static CharSequence getTooltipText(MenuItem arg2) {
        if((arg2 instanceof SupportMenuItem)) {
            return ((SupportMenuItem)arg2).getTooltipText();
        }

        if(Build$VERSION.SDK_INT >= 26) {
            return arg2.getTooltipText();
        }

        return null;
    }

    @Deprecated public static boolean isActionViewExpanded(MenuItem arg0) {
        return arg0.isActionViewExpanded();
    }

    public static MenuItem setActionProvider(MenuItem arg1, ActionProvider arg2) {
        if((arg1 instanceof SupportMenuItem)) {
            return ((SupportMenuItem)arg1).setSupportActionProvider(arg2);
        }

        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return arg1;
    }

    @Deprecated public static MenuItem setActionView(MenuItem arg0, int arg1) {
        return arg0.setActionView(arg1);
    }

    @Deprecated public static MenuItem setActionView(MenuItem arg0, View arg1) {
        return arg0.setActionView(arg1);
    }

    public static void setAlphabeticShortcut(MenuItem arg2, char arg3, int arg4) {
        if((arg2 instanceof SupportMenuItem)) {
            ((SupportMenuItem)arg2).setAlphabeticShortcut(arg3, arg4);
        }
        else if(Build$VERSION.SDK_INT >= 26) {
            arg2.setAlphabeticShortcut(arg3, arg4);
        }
    }

    public static void setContentDescription(MenuItem arg2, CharSequence arg3) {
        if((arg2 instanceof SupportMenuItem)) {
            ((SupportMenuItem)arg2).setContentDescription(arg3);
        }
        else if(Build$VERSION.SDK_INT >= 26) {
            arg2.setContentDescription(arg3);
        }
    }

    public static void setIconTintList(MenuItem arg2, ColorStateList arg3) {
        if((arg2 instanceof SupportMenuItem)) {
            ((SupportMenuItem)arg2).setIconTintList(arg3);
        }
        else if(Build$VERSION.SDK_INT >= 26) {
            arg2.setIconTintList(arg3);
        }
    }

    public static void setIconTintMode(MenuItem arg2, PorterDuff$Mode arg3) {
        if((arg2 instanceof SupportMenuItem)) {
            ((SupportMenuItem)arg2).setIconTintMode(arg3);
        }
        else if(Build$VERSION.SDK_INT >= 26) {
            arg2.setIconTintMode(arg3);
        }
    }

    public static void setNumericShortcut(MenuItem arg2, char arg3, int arg4) {
        if((arg2 instanceof SupportMenuItem)) {
            ((SupportMenuItem)arg2).setNumericShortcut(arg3, arg4);
        }
        else if(Build$VERSION.SDK_INT >= 26) {
            arg2.setNumericShortcut(arg3, arg4);
        }
    }

    @Deprecated public static MenuItem setOnActionExpandListener(MenuItem arg1, OnActionExpandListener arg2) {
        return arg1.setOnActionExpandListener(new MenuItem$OnActionExpandListener(arg2) {
            public boolean onMenuItemActionCollapse(MenuItem arg2) {
                return this.val$listener.onMenuItemActionCollapse(arg2);
            }

            public boolean onMenuItemActionExpand(MenuItem arg2) {
                return this.val$listener.onMenuItemActionExpand(arg2);
            }
        });
    }

    public static void setShortcut(MenuItem arg2, char arg3, char arg4, int arg5, int arg6) {
        if((arg2 instanceof SupportMenuItem)) {
            ((SupportMenuItem)arg2).setShortcut(arg3, arg4, arg5, arg6);
        }
        else if(Build$VERSION.SDK_INT >= 26) {
            arg2.setShortcut(arg3, arg4, arg5, arg6);
        }
    }

    @Deprecated public static void setShowAsAction(MenuItem arg0, int arg1) {
        arg0.setShowAsAction(arg1);
    }

    public static void setTooltipText(MenuItem arg2, CharSequence arg3) {
        if((arg2 instanceof SupportMenuItem)) {
            ((SupportMenuItem)arg2).setTooltipText(arg3);
        }
        else if(Build$VERSION.SDK_INT >= 26) {
            arg2.setTooltipText(arg3);
        }
    }
}

