package androidx.appcompat.view.menu;

import android.widget.ListView;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public interface ShowableListMenu {
    void dismiss();

    ListView getListView();

    boolean isShowing();

    void show();
}

