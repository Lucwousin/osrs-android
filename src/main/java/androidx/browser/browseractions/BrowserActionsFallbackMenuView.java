package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.browser.R$dimen;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class BrowserActionsFallbackMenuView extends LinearLayout {
    private final int mBrowserActionsMenuMaxWidthPx;
    private final int mBrowserActionsMenuMinPaddingPx;

    public BrowserActionsFallbackMenuView(Context arg1, AttributeSet arg2) {
        super(arg1, arg2);
        this.mBrowserActionsMenuMinPaddingPx = this.getResources().getDimensionPixelOffset(R$dimen.browser_actions_context_menu_min_padding);
        this.mBrowserActionsMenuMaxWidthPx = this.getResources().getDimensionPixelOffset(R$dimen.browser_actions_context_menu_max_width);
    }

    protected void onMeasure(int arg2, int arg3) {
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(Math.min(this.getResources().getDisplayMetrics().widthPixels - this.mBrowserActionsMenuMinPaddingPx * 2, this.mBrowserActionsMenuMaxWidthPx), 0x40000000), arg3);
    }
}

