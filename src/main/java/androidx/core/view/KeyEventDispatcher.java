package androidx.core.view;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface;
import android.os.Build$VERSION;
import android.view.KeyEvent$Callback;
import android.view.KeyEvent$DispatcherState;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window$Callback;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class KeyEventDispatcher {
    public interface Component {
        boolean superDispatchKeyEvent(KeyEvent arg1);
    }

    private static boolean sActionBarFieldsFetched = false;
    private static Method sActionBarOnMenuKeyMethod = null;
    private static boolean sDialogFieldsFetched = false;
    private static Field sDialogKeyListenerField;

    static {
    }

    private KeyEventDispatcher() {
        super();
    }

    private static boolean actionBarOnMenuKeyEventPre28(ActionBar arg6, KeyEvent arg7) {
        if(!KeyEventDispatcher.sActionBarFieldsFetched) {
            try {
                KeyEventDispatcher.sActionBarOnMenuKeyMethod = arg6.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                goto label_11;
            }
            catch(NoSuchMethodException ) {
            label_11:
                KeyEventDispatcher.sActionBarFieldsFetched = true;
            }
        }

        if(KeyEventDispatcher.sActionBarOnMenuKeyMethod == null) {
            return 0;
        }

        try {
            return KeyEventDispatcher.sActionBarOnMenuKeyMethod.invoke(arg6, arg7).booleanValue();
        }
        catch(InvocationTargetException ) {
            return 0;
        }
    }

    private static boolean activitySuperDispatchKeyEventPre28(Activity arg5, KeyEvent arg6) {
        arg5.onUserInteraction();
        Window v0 = arg5.getWindow();
        if(v0.hasFeature(8)) {
            ActionBar v1 = arg5.getActionBar();
            if(arg6.getKeyCode() == 82 && v1 != null && (KeyEventDispatcher.actionBarOnMenuKeyEventPre28(v1, arg6))) {
                return 1;
            }
        }

        if(v0.superDispatchKeyEvent(arg6)) {
            return 1;
        }

        View v0_1 = v0.getDecorView();
        if(ViewCompat.dispatchUnhandledKeyEventBeforeCallback(v0_1, arg6)) {
            return 1;
        }

        KeyEvent$DispatcherState v0_2 = v0_1 != null ? v0_1.getKeyDispatcherState() : null;
        return arg6.dispatch(((KeyEvent$Callback)arg5), v0_2, arg5);
    }

    private static boolean dialogSuperDispatchKeyEventPre28(Dialog arg3, KeyEvent arg4) {
        DialogInterface$OnKeyListener v0 = KeyEventDispatcher.getDialogKeyListenerPre28(arg3);
        if(v0 != null && (v0.onKey(((DialogInterface)arg3), arg4.getKeyCode(), arg4))) {
            return 1;
        }

        Window v0_1 = arg3.getWindow();
        if(v0_1.superDispatchKeyEvent(arg4)) {
            return 1;
        }

        View v0_2 = v0_1.getDecorView();
        if(ViewCompat.dispatchUnhandledKeyEventBeforeCallback(v0_2, arg4)) {
            return 1;
        }

        KeyEvent$DispatcherState v0_3 = v0_2 != null ? v0_2.getKeyDispatcherState() : null;
        return arg4.dispatch(((KeyEvent$Callback)arg3), v0_3, arg3);
    }

    public static boolean dispatchBeforeHierarchy(@NonNull View arg0, @NonNull KeyEvent arg1) {
        return ViewCompat.dispatchUnhandledKeyEventBeforeHierarchy(arg0, arg1);
    }

    public static boolean dispatchKeyEvent(@NonNull Component arg3, @Nullable View arg4, @Nullable Window$Callback arg5, @NonNull KeyEvent arg6) {
        boolean v0 = false;
        if(arg3 == null) {
            return 0;
        }

        if(Build$VERSION.SDK_INT >= 28) {
            return arg3.superDispatchKeyEvent(arg6);
        }

        if((arg5 instanceof Activity)) {
            return KeyEventDispatcher.activitySuperDispatchKeyEventPre28(((Activity)arg5), arg6);
        }

        if((arg5 instanceof Dialog)) {
            return KeyEventDispatcher.dialogSuperDispatchKeyEventPre28(((Dialog)arg5), arg6);
        }

        if(arg4 != null && (ViewCompat.dispatchUnhandledKeyEventBeforeCallback(arg4, arg6)) || (arg3.superDispatchKeyEvent(arg6))) {
            v0 = true;
        }

        return v0;
    }

    private static DialogInterface$OnKeyListener getDialogKeyListenerPre28(Dialog arg3) {
        if(!KeyEventDispatcher.sDialogFieldsFetched) {
            try {
                KeyEventDispatcher.sDialogKeyListenerField = Dialog.class.getDeclaredField("mOnKeyListener");
                KeyEventDispatcher.sDialogKeyListenerField.setAccessible(true);
                goto label_9;
            }
            catch(NoSuchFieldException ) {
            label_9:
                KeyEventDispatcher.sDialogFieldsFetched = true;
            }
        }

        if(KeyEventDispatcher.sDialogKeyListenerField == null) {
            return null;
        }

        try {
            return KeyEventDispatcher.sDialogKeyListenerField.get(arg3);
        }
        catch(IllegalAccessException ) {
            return null;
        }
    }
}

