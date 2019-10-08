package androidx.browser.browseractions;

import android.app.PendingIntent$CanceledException;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface$OnShowListener;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils$TruncateAt;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View$OnClickListener;
import android.view.View;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.R$id;
import androidx.browser.R$layout;
import androidx.core.widget.TextViewCompat;
import java.util.List;

class BrowserActionsFallbackMenuUi implements AdapterView$OnItemClickListener {
    @RestrictTo(value={Scope.LIBRARY_GROUP}) @VisibleForTesting interface BrowserActionsFallMenuUiListener {
        void onMenuShown(View arg1);
    }

    private static final String TAG = "BrowserActionskMenuUi";
    private BrowserActionsFallbackMenuDialog mBrowserActionsDialog;
    private final Context mContext;
    private final List mMenuItems;
    BrowserActionsFallMenuUiListener mMenuUiListener;
    private final Uri mUri;

    BrowserActionsFallbackMenuUi(Context arg1, Uri arg2, List arg3) {
        super();
        this.mContext = arg1;
        this.mUri = arg2;
        this.mMenuItems = arg3;
    }

    public void displayMenu() {
        View v0 = LayoutInflater.from(this.mContext).inflate(R$layout.browser_actions_context_menu_page, null);
        this.mBrowserActionsDialog = new BrowserActionsFallbackMenuDialog(this.mContext, this.initMenuView(v0));
        this.mBrowserActionsDialog.setContentView(v0);
        if(this.mMenuUiListener != null) {
            this.mBrowserActionsDialog.setOnShowListener(new DialogInterface$OnShowListener(v0) {
                public void onShow(DialogInterface arg2) {
                    BrowserActionsFallbackMenuUi.this.mMenuUiListener.onMenuShown(this.val$view);
                }
            });
        }

        this.mBrowserActionsDialog.show();
    }

    private BrowserActionsFallbackMenuView initMenuView(View arg5) {
        View v0 = arg5.findViewById(R$id.browser_actions_menu_view);
        View v1 = arg5.findViewById(R$id.browser_actions_header_text);
        ((TextView)v1).setText(this.mUri.toString());
        ((TextView)v1).setOnClickListener(new View$OnClickListener(((TextView)v1)) {
            public void onClick(View arg2) {
                int v0 = 0x7FFFFFFF;
                if(TextViewCompat.getMaxLines(this.val$urlTextView) == v0) {
                    this.val$urlTextView.setMaxLines(1);
                    this.val$urlTextView.setEllipsize(TextUtils$TruncateAt.END);
                }
                else {
                    this.val$urlTextView.setMaxLines(v0);
                    this.val$urlTextView.setEllipsize(null);
                }
            }
        });
        arg5 = arg5.findViewById(R$id.browser_actions_menu_items);
        ((ListView)arg5).setAdapter(new BrowserActionsFallbackMenuAdapter(this.mMenuItems, this.mContext));
        ((ListView)arg5).setOnItemClickListener(((AdapterView$OnItemClickListener)this));
        return ((BrowserActionsFallbackMenuView)v0);
    }

    public void onItemClick(AdapterView arg1, View arg2, int arg3, long arg4) {
        PendingIntent v1 = this.mMenuItems.get(arg3).getAction();
        try {
            v1.send();
            this.mBrowserActionsDialog.dismiss();
        }
        catch(PendingIntent$CanceledException v1_1) {
            Log.e("BrowserActionskMenuUi", "Failed to send custom item action", ((Throwable)v1_1));
        }
    }

    @RestrictTo(value={Scope.LIBRARY_GROUP}) @VisibleForTesting void setMenuUiListener(BrowserActionsFallMenuUiListener arg1) {
        this.mMenuUiListener = arg1;
    }
}

