package androidx.legacy.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View$MeasureSpec;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated public class Space extends View {
    @Deprecated public Space(@NonNull Context arg2) {
        this(arg2, null);
    }

    @Deprecated public Space(@NonNull Context arg2, @Nullable AttributeSet arg3) {
        this(arg2, arg3, 0);
    }

    @Deprecated public Space(@NonNull Context arg1, @Nullable AttributeSet arg2, int arg3) {
        super(arg1, arg2, arg3);
        if(this.getVisibility() == 0) {
            this.setVisibility(4);
        }
    }

    @SuppressLint(value={"MissingSuperCall"}) @Deprecated public void draw(Canvas arg1) {
    }

    private static int getDefaultSize2(int arg2, int arg3) {
        int v0 = View$MeasureSpec.getMode(arg3);
        arg3 = View$MeasureSpec.getSize(arg3);
        if(v0 == 0x80000000) {
            arg2 = Math.min(arg2, arg3);
        }
        else if(v0 != 0) {
            if(v0 != 0x40000000) {
            }
            else {
                arg2 = arg3;
            }
        }

        return arg2;
    }

    @Deprecated protected void onMeasure(int arg2, int arg3) {
        this.setMeasuredDimension(Space.getDefaultSize2(this.getSuggestedMinimumWidth(), arg2), Space.getDefaultSize2(this.getSuggestedMinimumHeight(), arg3));
    }
}

