package androidx.core.view.accessibility;

import android.os.Build$VERSION;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

public class AccessibilityNodeProviderCompat {
    @RequiresApi(value=16) class AccessibilityNodeProviderApi16 extends AccessibilityNodeProvider {
        final AccessibilityNodeProviderCompat mCompat;

        AccessibilityNodeProviderApi16(AccessibilityNodeProviderCompat arg1) {
            super();
            this.mCompat = arg1;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int arg2) {
            AccessibilityNodeInfoCompat v2 = this.mCompat.createAccessibilityNodeInfo(arg2);
            if(v2 == null) {
                return null;
            }

            return v2.unwrap();
        }

        public List findAccessibilityNodeInfosByText(String arg4, int arg5) {
            List v4 = this.mCompat.findAccessibilityNodeInfosByText(arg4, arg5);
            if(v4 == null) {
                return null;
            }

            ArrayList v5 = new ArrayList();
            int v0 = v4.size();
            int v1;
            for(v1 = 0; v1 < v0; ++v1) {
                ((List)v5).add(v4.get(v1).unwrap());
            }

            return ((List)v5);
        }

        public boolean performAction(int arg2, int arg3, Bundle arg4) {
            return this.mCompat.performAction(arg2, arg3, arg4);
        }
    }

    @RequiresApi(value=19) class AccessibilityNodeProviderApi19 extends AccessibilityNodeProviderApi16 {
        AccessibilityNodeProviderApi19(AccessibilityNodeProviderCompat arg1) {
            super(arg1);
        }

        public AccessibilityNodeInfo findFocus(int arg2) {
            AccessibilityNodeInfoCompat v2 = this.mCompat.findFocus(arg2);
            if(v2 == null) {
                return null;
            }

            return v2.unwrap();
        }
    }

    public static final int HOST_VIEW_ID = -1;
    private final Object mProvider;

    public AccessibilityNodeProviderCompat(Object arg1) {
        super();
        this.mProvider = arg1;
    }

    public AccessibilityNodeProviderCompat() {
        super();
        if(Build$VERSION.SDK_INT >= 19) {
            this.mProvider = new AccessibilityNodeProviderApi19(this);
        }
        else if(Build$VERSION.SDK_INT >= 16) {
            this.mProvider = new AccessibilityNodeProviderApi16(this);
        }
        else {
            this.mProvider = null;
        }
    }

    @Nullable public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int arg1) {
        return null;
    }

    @Nullable public List findAccessibilityNodeInfosByText(String arg1, int arg2) {
        return null;
    }

    @Nullable public AccessibilityNodeInfoCompat findFocus(int arg1) {
        return null;
    }

    public Object getProvider() {
        return this.mProvider;
    }

    public boolean performAction(int arg1, int arg2, Bundle arg3) {
        return 0;
    }
}

