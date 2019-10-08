package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import android.widget.EdgeEffect;
import androidx.annotation.NonNull;

public final class EdgeEffectCompat {
    private EdgeEffect mEdgeEffect;

    @Deprecated public EdgeEffectCompat(Context arg2) {
        super();
        this.mEdgeEffect = new EdgeEffect(arg2);
    }

    @Deprecated public boolean draw(Canvas arg2) {
        return this.mEdgeEffect.draw(arg2);
    }

    @Deprecated public void finish() {
        this.mEdgeEffect.finish();
    }

    @Deprecated public boolean isFinished() {
        return this.mEdgeEffect.isFinished();
    }

    @Deprecated public boolean onAbsorb(int arg2) {
        this.mEdgeEffect.onAbsorb(arg2);
        return 1;
    }

    public static void onPull(@NonNull EdgeEffect arg2, float arg3, float arg4) {
        if(Build$VERSION.SDK_INT >= 21) {
            arg2.onPull(arg3, arg4);
        }
        else {
            arg2.onPull(arg3);
        }
    }

    @Deprecated public boolean onPull(float arg2) {
        this.mEdgeEffect.onPull(arg2);
        return 1;
    }

    @Deprecated public boolean onPull(float arg2, float arg3) {
        EdgeEffectCompat.onPull(this.mEdgeEffect, arg2, arg3);
        return 1;
    }

    @Deprecated public boolean onRelease() {
        this.mEdgeEffect.onRelease();
        return this.mEdgeEffect.isFinished();
    }

    @Deprecated public void setSize(int arg2, int arg3) {
        this.mEdgeEffect.setSize(arg2, arg3);
    }
}

