package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R$attr;

public class AppCompatSeekBar extends SeekBar {
    private final AppCompatSeekBarHelper mAppCompatSeekBarHelper;

    public AppCompatSeekBar(Context arg2, AttributeSet arg3) {
        this(arg2, arg3, R$attr.seekBarStyle);
    }

    public AppCompatSeekBar(Context arg2) {
        this(arg2, null);
    }

    public AppCompatSeekBar(Context arg1, AttributeSet arg2, int arg3) {
        super(arg1, arg2, arg3);
        this.mAppCompatSeekBarHelper = new AppCompatSeekBarHelper(((SeekBar)this));
        this.mAppCompatSeekBarHelper.loadFromAttributes(arg2, arg3);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.mAppCompatSeekBarHelper.drawableStateChanged();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.mAppCompatSeekBarHelper.jumpDrawablesToCurrentState();
    }

    protected void onDraw(Canvas arg2) {
        __monitor_enter(this);
        try {
            super.onDraw(arg2);
            this.mAppCompatSeekBarHelper.drawTickMarks(arg2);
        }
        catch(Throwable v2) {
            __monitor_exit(this);
            throw v2;
        }

        __monitor_exit(this);
    }
}

