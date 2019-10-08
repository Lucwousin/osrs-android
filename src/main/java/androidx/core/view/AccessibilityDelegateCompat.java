package androidx.core.view;

import android.os.Build$VERSION;
import android.os.Bundle;
import android.view.View$AccessibilityDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.RequiresApi;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;

public class AccessibilityDelegateCompat {
    final class AccessibilityDelegateAdapter extends View$AccessibilityDelegate {
        private final AccessibilityDelegateCompat mCompat;

        AccessibilityDelegateAdapter(AccessibilityDelegateCompat arg1) {
            super();
            this.mCompat = arg1;
        }

        public boolean dispatchPopulateAccessibilityEvent(View arg2, AccessibilityEvent arg3) {
            return this.mCompat.dispatchPopulateAccessibilityEvent(arg2, arg3);
        }

        @RequiresApi(value=16) public AccessibilityNodeProvider getAccessibilityNodeProvider(View arg2) {
            AccessibilityNodeProvider v2_2;
            AccessibilityNodeProviderCompat v2 = this.mCompat.getAccessibilityNodeProvider(arg2);
            if(v2 != null) {
                Object v2_1 = v2.getProvider();
            }
            else {
                v2_2 = null;
            }

            return v2_2;
        }

        public void onInitializeAccessibilityEvent(View arg2, AccessibilityEvent arg3) {
            this.mCompat.onInitializeAccessibilityEvent(arg2, arg3);
        }

        public void onInitializeAccessibilityNodeInfo(View arg2, AccessibilityNodeInfo arg3) {
            this.mCompat.onInitializeAccessibilityNodeInfo(arg2, AccessibilityNodeInfoCompat.wrap(arg3));
        }

        public void onPopulateAccessibilityEvent(View arg2, AccessibilityEvent arg3) {
            this.mCompat.onPopulateAccessibilityEvent(arg2, arg3);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup arg2, View arg3, AccessibilityEvent arg4) {
            return this.mCompat.onRequestSendAccessibilityEvent(arg2, arg3, arg4);
        }

        public boolean performAccessibilityAction(View arg2, int arg3, Bundle arg4) {
            return this.mCompat.performAccessibilityAction(arg2, arg3, arg4);
        }

        public void sendAccessibilityEvent(View arg2, int arg3) {
            this.mCompat.sendAccessibilityEvent(arg2, arg3);
        }

        public void sendAccessibilityEventUnchecked(View arg2, AccessibilityEvent arg3) {
            this.mCompat.sendAccessibilityEventUnchecked(arg2, arg3);
        }
    }

    private static final View$AccessibilityDelegate DEFAULT_DELEGATE;
    private final View$AccessibilityDelegate mBridge;

    static {
        AccessibilityDelegateCompat.DEFAULT_DELEGATE = new View$AccessibilityDelegate();
    }

    public AccessibilityDelegateCompat() {
        super();
        this.mBridge = new AccessibilityDelegateAdapter(this);
    }

    public boolean dispatchPopulateAccessibilityEvent(View arg2, AccessibilityEvent arg3) {
        return AccessibilityDelegateCompat.DEFAULT_DELEGATE.dispatchPopulateAccessibilityEvent(arg2, arg3);
    }

    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View arg3) {
        if(Build$VERSION.SDK_INT >= 16) {
            AccessibilityNodeProvider v3 = AccessibilityDelegateCompat.DEFAULT_DELEGATE.getAccessibilityNodeProvider(arg3);
            if(v3 != null) {
                return new AccessibilityNodeProviderCompat(v3);
            }
        }

        return null;
    }

    View$AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View arg2, AccessibilityEvent arg3) {
        AccessibilityDelegateCompat.DEFAULT_DELEGATE.onInitializeAccessibilityEvent(arg2, arg3);
    }

    public void onInitializeAccessibilityNodeInfo(View arg2, AccessibilityNodeInfoCompat arg3) {
        AccessibilityDelegateCompat.DEFAULT_DELEGATE.onInitializeAccessibilityNodeInfo(arg2, arg3.unwrap());
    }

    public void onPopulateAccessibilityEvent(View arg2, AccessibilityEvent arg3) {
        AccessibilityDelegateCompat.DEFAULT_DELEGATE.onPopulateAccessibilityEvent(arg2, arg3);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup arg2, View arg3, AccessibilityEvent arg4) {
        return AccessibilityDelegateCompat.DEFAULT_DELEGATE.onRequestSendAccessibilityEvent(arg2, arg3, arg4);
    }

    public boolean performAccessibilityAction(View arg3, int arg4, Bundle arg5) {
        if(Build$VERSION.SDK_INT >= 16) {
            return AccessibilityDelegateCompat.DEFAULT_DELEGATE.performAccessibilityAction(arg3, arg4, arg5);
        }

        return 0;
    }

    public void sendAccessibilityEvent(View arg2, int arg3) {
        AccessibilityDelegateCompat.DEFAULT_DELEGATE.sendAccessibilityEvent(arg2, arg3);
    }

    public void sendAccessibilityEventUnchecked(View arg2, AccessibilityEvent arg3) {
        AccessibilityDelegateCompat.DEFAULT_DELEGATE.sendAccessibilityEventUnchecked(arg2, arg3);
    }
}

