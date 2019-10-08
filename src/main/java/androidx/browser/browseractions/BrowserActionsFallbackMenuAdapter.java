package androidx.browser.browseractions;

import android.content.Context;
import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.R$id;
import androidx.browser.R$layout;
import androidx.core.content.res.ResourcesCompat;
import java.util.List;

class BrowserActionsFallbackMenuAdapter extends BaseAdapter {
    class ViewHolderItem {
        ImageView mIcon;
        TextView mText;

        ViewHolderItem() {
            super();
        }
    }

    private final Context mContext;
    private final List mMenuItems;

    BrowserActionsFallbackMenuAdapter(List arg1, Context arg2) {
        super();
        this.mMenuItems = arg1;
        this.mContext = arg2;
    }

    public int getCount() {
        return this.mMenuItems.size();
    }

    public Object getItem(int arg2) {
        return this.mMenuItems.get(arg2);
    }

    public long getItemId(int arg3) {
        return ((long)arg3);
    }

    public View getView(int arg4, View arg5, ViewGroup arg6) {
        ViewHolderItem v0;
        Object v4 = this.mMenuItems.get(arg4);
        arg6 = null;
        if(arg5 == null) {
            arg5 = LayoutInflater.from(this.mContext).inflate(R$layout.browser_actions_context_menu_row, arg6);
            v0 = new ViewHolderItem();
            v0.mIcon = arg5.findViewById(R$id.browser_actions_menu_item_icon);
            v0.mText = arg5.findViewById(R$id.browser_actions_menu_item_text);
            arg5.setTag(v0);
        }
        else {
            Object v0_1 = arg5.getTag();
        }

        v0.mText.setText(((BrowserActionItem)v4).getTitle());
        if(((BrowserActionItem)v4).getIconId() != 0) {
            v0.mIcon.setImageDrawable(ResourcesCompat.getDrawable(this.mContext.getResources(), ((BrowserActionItem)v4).getIconId(), ((Resources$Theme)arg6)));
        }
        else {
            v0.mIcon.setImageDrawable(((Drawable)arg6));
        }

        return arg5;
    }
}

