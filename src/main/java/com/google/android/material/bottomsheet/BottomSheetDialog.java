package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface$OnCancelListener;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View$OnClickListener;
import android.view.View$OnTouchListener;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.AppCompatDialog;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R$attr;
import com.google.android.material.R$id;
import com.google.android.material.R$layout;
import com.google.android.material.R$style;

public class BottomSheetDialog extends AppCompatDialog {
    class com.google.android.material.bottomsheet.BottomSheetDialog$4 extends BottomSheetCallback {
        com.google.android.material.bottomsheet.BottomSheetDialog$4(BottomSheetDialog arg1) {
            BottomSheetDialog.this = arg1;
            super();
        }

        public void onSlide(@NonNull View arg1, float arg2) {
        }

        public void onStateChanged(@NonNull View arg1, int arg2) {
            if(arg2 == 5) {
                BottomSheetDialog.this.cancel();
            }
        }
    }

    private BottomSheetBehavior behavior;
    private BottomSheetCallback bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;

    public BottomSheetDialog(@NonNull Context arg2) {
        this(arg2, 0);
    }

    public BottomSheetDialog(@NonNull Context arg1, @StyleRes int arg2) {
        super(arg1, BottomSheetDialog.getThemeResId(arg1, arg2));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new com.google.android.material.bottomsheet.BottomSheetDialog$4(this);
        this.supportRequestWindowFeature(1);
    }

    protected BottomSheetDialog(@NonNull Context arg1, boolean arg2, DialogInterface$OnCancelListener arg3) {
        super(arg1, arg2, arg3);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new com.google.android.material.bottomsheet.BottomSheetDialog$4(this);
        this.supportRequestWindowFeature(1);
        this.cancelable = arg2;
    }

    private static int getThemeResId(Context arg2, int arg3) {
        if(arg3 == 0) {
            TypedValue v3 = new TypedValue();
            arg3 = arg2.getTheme().resolveAttribute(R$attr.bottomSheetDialogTheme, v3, true) ? v3.resourceId : R$style.Theme_Design_Light_BottomSheetDialog;
        }

        return arg3;
    }

    protected void onCreate(Bundle arg3) {
        super.onCreate(arg3);
        Window v3 = this.getWindow();
        if(v3 != null) {
            if(Build$VERSION.SDK_INT >= 21) {
                v3.clearFlags(0x4000000);
                v3.addFlags(0x80000000);
            }

            v3.setLayout(-1, -1);
        }
    }

    protected void onStart() {
        super.onStart();
        if(this.behavior != null && this.behavior.getState() == 5) {
            this.behavior.setState(4);
        }
    }

    public void setCancelable(boolean arg2) {
        super.setCancelable(arg2);
        if(this.cancelable != arg2) {
            this.cancelable = arg2;
            if(this.behavior != null) {
                this.behavior.setHideable(arg2);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean arg3) {
        super.setCanceledOnTouchOutside(arg3);
        if((arg3) && !this.cancelable) {
            this.cancelable = true;
        }

        this.canceledOnTouchOutside = arg3;
        this.canceledOnTouchOutsideSet = true;
    }

    public void setContentView(@LayoutRes int arg2) {
        super.setContentView(this.wrapInBottomSheet(arg2, null, null));
    }

    public void setContentView(View arg3) {
        super.setContentView(this.wrapInBottomSheet(0, arg3, null));
    }

    public void setContentView(View arg2, ViewGroup$LayoutParams arg3) {
        super.setContentView(this.wrapInBottomSheet(0, arg2, arg3));
    }

    boolean shouldWindowCloseOnTouchOutside() {
        if(!this.canceledOnTouchOutsideSet) {
            TypedArray v0 = this.getContext().obtainStyledAttributes(new int[]{0x101035B});
            this.canceledOnTouchOutside = v0.getBoolean(0, true);
            v0.recycle();
            this.canceledOnTouchOutsideSet = true;
        }

        return this.canceledOnTouchOutside;
    }

    private View wrapInBottomSheet(int arg5, View arg6, ViewGroup$LayoutParams arg7) {
        View v0 = View.inflate(this.getContext(), R$layout.design_bottom_sheet_dialog, null);
        View v1 = ((FrameLayout)v0).findViewById(R$id.coordinator);
        if(arg5 != 0 && arg6 == null) {
            arg6 = this.getLayoutInflater().inflate(arg5, ((ViewGroup)v1), false);
        }

        View v5 = ((CoordinatorLayout)v1).findViewById(R$id.design_bottom_sheet);
        this.behavior = BottomSheetBehavior.from(v5);
        this.behavior.setBottomSheetCallback(this.bottomSheetCallback);
        this.behavior.setHideable(this.cancelable);
        if(arg7 == null) {
            ((FrameLayout)v5).addView(arg6);
        }
        else {
            ((FrameLayout)v5).addView(arg6, arg7);
        }

        ((CoordinatorLayout)v1).findViewById(R$id.touch_outside).setOnClickListener(new View$OnClickListener() {
            public void onClick(View arg1) {
                if((BottomSheetDialog.this.cancelable) && (BottomSheetDialog.this.isShowing()) && (BottomSheetDialog.this.shouldWindowCloseOnTouchOutside())) {
                    BottomSheetDialog.this.cancel();
                }
            }
        });
        ViewCompat.setAccessibilityDelegate(v5, new AccessibilityDelegateCompat() {
            public void onInitializeAccessibilityNodeInfo(View arg1, AccessibilityNodeInfoCompat arg2) {
                super.onInitializeAccessibilityNodeInfo(arg1, arg2);
                if(BottomSheetDialog.this.cancelable) {
                    arg2.addAction(0x100000);
                    arg2.setDismissable(true);
                }
                else {
                    arg2.setDismissable(false);
                }
            }

            public boolean performAccessibilityAction(View arg2, int arg3, Bundle arg4) {
                if(arg3 == 0x100000 && (BottomSheetDialog.this.cancelable)) {
                    BottomSheetDialog.this.cancel();
                    return 1;
                }

                return super.performAccessibilityAction(arg2, arg3, arg4);
            }
        });
        ((FrameLayout)v5).setOnTouchListener(new View$OnTouchListener() {
            public boolean onTouch(View arg1, MotionEvent arg2) {
                return 1;
            }
        });
        return v0;
    }
}

