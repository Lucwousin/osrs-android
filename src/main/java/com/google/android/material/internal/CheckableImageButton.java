package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.Checkable;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$attr;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

@RestrictTo(value={Scope.LIBRARY_GROUP}) public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] DRAWABLE_STATE_CHECKED;
    private boolean checked;

    static {
        CheckableImageButton.DRAWABLE_STATE_CHECKED = new int[]{0x10100A0};
    }

    public CheckableImageButton(Context arg2) {
        this(arg2, null);
    }

    public CheckableImageButton(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.imageButtonStyle);
    }

    public CheckableImageButton(Context arg1, AttributeSet arg2, int arg3) {
        super(arg1, arg2, arg3);
        ViewCompat.setAccessibilityDelegate(((View)this), new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityEvent(View arg1, AccessibilityEvent arg2) {
                super.onInitializeAccessibilityEvent(arg1, arg2);
                arg2.setChecked(CheckableImageButton.this.isChecked());
            }

            public void onInitializeAccessibilityNodeInfo(View arg1, AccessibilityNodeInfoCompat arg2) {
                super.onInitializeAccessibilityNodeInfo(arg1, arg2);
                arg2.setCheckable(true);
                arg2.setChecked(CheckableImageButton.this.isChecked());
            }
        });
    }

    public boolean isChecked() {
        return this.checked;
    }

    public int[] onCreateDrawableState(int arg2) {
        if(this.checked) {
            return CheckableImageButton.mergeDrawableStates(super.onCreateDrawableState(arg2 + CheckableImageButton.DRAWABLE_STATE_CHECKED.length), CheckableImageButton.DRAWABLE_STATE_CHECKED);
        }

        return super.onCreateDrawableState(arg2);
    }

    public void setChecked(boolean arg2) {
        if(this.checked != arg2) {
            this.checked = arg2;
            this.refreshDrawableState();
            this.sendAccessibilityEvent(0x800);
        }
    }

    public void toggle() {
        this.setChecked(this.checked ^ 1);
    }
}

