package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;

public class SidePropagation extends VisibilityPropagation {
    private float mPropagationSpeed;
    private int mSide;

    public SidePropagation() {
        super();
        this.mPropagationSpeed = 3f;
        this.mSide = 80;
    }

    private int distance(View arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        int v7;
        int v1 = 5;
        int v2 = 3;
        int v3 = 0;
        int v4 = 1;
        if(this.mSide == 0x800003) {
            if(ViewCompat.getLayoutDirection(arg7) == 1) {
            }
            else {
                v4 = 0;
            }

            if(v4 == 0) {
                goto label_14;
            }

            goto label_12;
        }
        else {
            if(this.mSide == 0x800005) {
                if(ViewCompat.getLayoutDirection(arg7) == 1) {
                }
                else {
                    v4 = 0;
                }

                if(v4 != 0) {
                label_14:
                    v7 = 3;
                    goto label_26;
                }

            label_12:
                v7 = 5;
                goto label_26;
            }

            v7 = this.mSide;
        }

    label_26:
        if(v7 == v2) {
            v3 = arg14 - arg8 + Math.abs(arg11 - arg9);
        }
        else if(v7 == v1) {
            v3 = arg8 - arg12 + Math.abs(arg11 - arg9);
        }
        else if(v7 == 0x30) {
            v3 = arg15 - arg9 + Math.abs(arg10 - arg8);
        }
        else if(v7 != 80) {
        }
        else {
            v3 = arg9 - arg13 + Math.abs(arg10 - arg8);
        }

        return v3;
    }

    private int getMaxDistance(ViewGroup arg3) {
        int v0 = this.mSide;
        if(v0 != 3 && v0 != 5 && v0 != 0x800003 && v0 != 0x800005) {
            return arg3.getHeight();
        }

        return arg3.getWidth();
    }

    public long getStartDelay(ViewGroup arg18, Transition arg19, TransitionValues arg20, TransitionValues arg21) {
        int v16;
        int v15;
        int v13;
        SidePropagation v10 = this;
        TransitionValues v0 = arg20;
        long v11 = 0;
        if(v0 == null && arg21 == null) {
            return v11;
        }

        Rect v2 = arg19.getEpicenter();
        if(arg21 == null || v10.getViewVisibility(v0) == 0) {
            v13 = -1;
        }
        else {
            v0 = arg21;
            v13 = 1;
        }

        int v4 = v10.getViewX(v0);
        int v5 = v10.getViewY(v0);
        int v0_1 = 2;
        int[] v1 = new int[v0_1];
        arg18.getLocationOnScreen(v1);
        int v6 = v1[0] + Math.round(arg18.getTranslationX());
        int v7 = v1[1] + Math.round(arg18.getTranslationY());
        int v8 = v6 + arg18.getWidth();
        int v9 = v7 + arg18.getHeight();
        if(v2 != null) {
            v15 = v2.centerX();
            v16 = v2.centerY();
        }
        else {
            v15 = (v6 + v8) / v0_1;
            v16 = (v7 + v9) / v0_1;
        }

        float v0_2 = (((float)this.distance(arg18, v4, v5, v15, v16, v6, v7, v8, v9))) / (((float)this.getMaxDistance(arg18)));
        long v1_1 = arg19.getDuration();
        if(v1_1 < v11) {
            v1_1 = 300;
        }

        return ((long)Math.round((((float)(v1_1 * (((long)v13))))) / v10.mPropagationSpeed * v0_2));
    }

    public void setPropagationSpeed(float arg2) {
        if(arg2 != 0f) {
            this.mPropagationSpeed = arg2;
            return;
        }

        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }

    public void setSide(int arg1) {
        this.mSide = arg1;
    }
}

