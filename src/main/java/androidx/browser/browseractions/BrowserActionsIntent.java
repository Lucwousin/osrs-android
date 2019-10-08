package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BrowserActionsIntent {
    @RestrictTo(value={Scope.LIBRARY_GROUP}) @VisibleForTesting interface BrowserActionsFallDialogListener {
        void onDialogShown();
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface BrowserActionsItemId {
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @Retention(value=RetentionPolicy.SOURCE) @public interface BrowserActionsUrlType {
    }

    public final class Builder {
        private Context mContext;
        private final Intent mIntent;
        private ArrayList mMenuItems;
        private PendingIntent mOnItemSelectedPendingIntent;
        private int mType;
        private Uri mUri;

        public Builder(Context arg3, Uri arg4) {
            super();
            this.mIntent = new Intent("androidx.browser.browseractions.browser_action_open");
            this.mMenuItems = null;
            this.mOnItemSelectedPendingIntent = null;
            this.mContext = arg3;
            this.mUri = arg4;
            this.mType = 0;
            this.mMenuItems = new ArrayList();
        }

        public BrowserActionsIntent build() {
            this.mIntent.setData(this.mUri);
            this.mIntent.putExtra("androidx.browser.browseractions.extra.TYPE", this.mType);
            this.mIntent.putParcelableArrayListExtra("androidx.browser.browseractions.extra.MENU_ITEMS", this.mMenuItems);
            this.mIntent.putExtra("androidx.browser.browseractions.APP_ID", PendingIntent.getActivity(this.mContext, 0, new Intent(), 0));
            if(this.mOnItemSelectedPendingIntent != null) {
                this.mIntent.putExtra("androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT", this.mOnItemSelectedPendingIntent);
            }

            return new BrowserActionsIntent(this.mIntent);
        }

        private Bundle getBundleFromItem(BrowserActionItem arg4) {
            Bundle v0 = new Bundle();
            v0.putString("androidx.browser.browseractions.TITLE", arg4.getTitle());
            v0.putParcelable("androidx.browser.browseractions.ACTION", arg4.getAction());
            if(arg4.getIconId() != 0) {
                v0.putInt("androidx.browser.browseractions.ICON_ID", arg4.getIconId());
            }

            return v0;
        }

        public Builder setCustomItems(ArrayList arg4) {
            if(arg4.size() > 5) {
                goto label_24;
            }

            int v0 = 0;
            while(true) {
                if(v0 >= arg4.size()) {
                    return this;
                }

                if(!TextUtils.isEmpty(arg4.get(v0).getTitle()) && arg4.get(v0).getAction() != null) {
                    this.mMenuItems.add(this.getBundleFromItem(arg4.get(v0)));
                    ++v0;
                    continue;
                }

                break;
            }

            throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
            return this;
        label_24:
            throw new IllegalStateException("Exceeded maximum toolbar item count of 5");
        }

        public Builder setCustomItems(BrowserActionItem[] arg2) {
            return this.setCustomItems(new ArrayList(Arrays.asList(((Object[])arg2))));
        }

        public Builder setOnItemSelectedAction(PendingIntent arg1) {
            this.mOnItemSelectedPendingIntent = arg1;
            return this;
        }

        public Builder setUrlType(int arg1) {
            this.mType = arg1;
            return this;
        }
    }

    public static final String ACTION_BROWSER_ACTIONS_OPEN = "androidx.browser.browseractions.browser_action_open";
    public static final String EXTRA_APP_ID = "androidx.browser.browseractions.APP_ID";
    public static final String EXTRA_MENU_ITEMS = "androidx.browser.browseractions.extra.MENU_ITEMS";
    public static final String EXTRA_SELECTED_ACTION_PENDING_INTENT = "androidx.browser.browseractions.extra.SELECTED_ACTION_PENDING_INTENT";
    public static final String EXTRA_TYPE = "androidx.browser.browseractions.extra.TYPE";
    public static final int ITEM_COPY = 3;
    public static final int ITEM_DOWNLOAD = 2;
    public static final int ITEM_INVALID_ITEM = -1;
    public static final int ITEM_OPEN_IN_INCOGNITO = 1;
    public static final int ITEM_OPEN_IN_NEW_TAB = 0;
    public static final int ITEM_SHARE = 4;
    public static final String KEY_ACTION = "androidx.browser.browseractions.ACTION";
    public static final String KEY_ICON_ID = "androidx.browser.browseractions.ICON_ID";
    public static final String KEY_TITLE = "androidx.browser.browseractions.TITLE";
    public static final int MAX_CUSTOM_ITEMS = 5;
    private static final String TAG = "BrowserActions";
    private static final String TEST_URL = "https://www.example.com";
    public static final int URL_TYPE_AUDIO = 3;
    public static final int URL_TYPE_FILE = 4;
    public static final int URL_TYPE_IMAGE = 1;
    public static final int URL_TYPE_NONE = 0;
    public static final int URL_TYPE_PLUGIN = 5;
    public static final int URL_TYPE_VIDEO = 2;
    @NonNull private final Intent mIntent;
    private static BrowserActionsFallDialogListener sDialogListenter;

    BrowserActionsIntent(@NonNull Intent arg1) {
        super();
        this.mIntent = arg1;
    }

    private static List getBrowserActionsIntentHandlers(Context arg3) {
        return arg3.getPackageManager().queryIntentActivities(new Intent("androidx.browser.browseractions.browser_action_open", Uri.parse("https://www.example.com")), 0x20000);
    }

    public static String getCreatorPackageName(Intent arg2) {
        Parcelable v2 = arg2.getParcelableExtra("androidx.browser.browseractions.APP_ID");
        if(v2 != null) {
            if(Build$VERSION.SDK_INT >= 17) {
                return ((PendingIntent)v2).getCreatorPackage();
            }

            return ((PendingIntent)v2).getTargetPackage();
        }

        return null;
    }

    @NonNull public Intent getIntent() {
        return this.mIntent;
    }

    public static void launchIntent(Context arg1, Intent arg2) {
        BrowserActionsIntent.launchIntent(arg1, arg2, BrowserActionsIntent.getBrowserActionsIntentHandlers(arg1));
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @VisibleForTesting static void launchIntent(Context arg4, Intent arg5, List arg6) {
        if(arg6 != null) {
            if(arg6.size() == 0) {
            }
            else {
                int v1 = 0;
                if(arg6.size() == 1) {
                    arg5.setPackage(arg6.get(0).activityInfo.packageName);
                }
                else {
                    ResolveInfo v0 = arg4.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com")), 0x10000);
                    if(v0 != null) {
                        String v0_1 = v0.activityInfo.packageName;
                        while(v1 < arg6.size()) {
                            if(v0_1.equals(arg6.get(v1).activityInfo.packageName)) {
                                arg5.setPackage(v0_1);
                            }
                            else {
                                ++v1;
                                continue;
                            }

                            break;
                        }
                    }
                }

                ContextCompat.startActivity(arg4, arg5, null);
                return;
            }
        }

        BrowserActionsIntent.openFallbackBrowserActionsMenu(arg4, arg5);
    }

    public static void openBrowserAction(Context arg1, Uri arg2) {
        BrowserActionsIntent.launchIntent(arg1, new Builder(arg1, arg2).build().getIntent());
    }

    public static void openBrowserAction(Context arg1, Uri arg2, int arg3, ArrayList arg4, PendingIntent arg5) {
        BrowserActionsIntent.launchIntent(arg1, new Builder(arg1, arg2).setUrlType(arg3).setCustomItems(arg4).setOnItemSelectedAction(arg5).build().getIntent());
    }

    private static void openFallbackBrowserActionsMenu(Context arg3, Intent arg4) {
        Uri v0 = arg4.getData();
        int v1 = arg4.getIntExtra("androidx.browser.browseractions.extra.TYPE", 0);
        ArrayList v4 = arg4.getParcelableArrayListExtra("androidx.browser.browseractions.extra.MENU_ITEMS");
        List v4_1 = v4 != null ? BrowserActionsIntent.parseBrowserActionItems(v4) : null;
        BrowserActionsIntent.openFallbackBrowserActionsMenu(arg3, v0, v1, v4_1);
    }

    private static void openFallbackBrowserActionsMenu(Context arg0, Uri arg1, int arg2, List arg3) {
        new BrowserActionsFallbackMenuUi(arg0, arg1, arg3).displayMenu();
        if(BrowserActionsIntent.sDialogListenter != null) {
            BrowserActionsIntent.sDialogListenter.onDialogShown();
        }
    }

    public static List parseBrowserActionItems(ArrayList arg6) {
        ArrayList v0 = new ArrayList();
        int v1 = 0;
        while(true) {
            if(v1 >= arg6.size()) {
                goto label_24;
            }

            Object v2 = arg6.get(v1);
            String v3 = ((Bundle)v2).getString("androidx.browser.browseractions.TITLE");
            Parcelable v4 = ((Bundle)v2).getParcelable("androidx.browser.browseractions.ACTION");
            int v2_1 = ((Bundle)v2).getInt("androidx.browser.browseractions.ICON_ID");
            if(!TextUtils.isEmpty(((CharSequence)v3)) && v4 != null) {
                ((List)v0).add(new BrowserActionItem(v3, ((PendingIntent)v4), v2_1));
                ++v1;
                continue;
            }

            break;
        }

        throw new IllegalArgumentException("Custom item should contain a non-empty title and non-null intent.");
    label_24:
        return ((List)v0);
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @VisibleForTesting static void setDialogShownListenter(BrowserActionsFallDialogListener arg0) {
        BrowserActionsIntent.sDialogListenter = arg0;
    }
}

