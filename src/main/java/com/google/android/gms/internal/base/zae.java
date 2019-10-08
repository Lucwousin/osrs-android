package com.google.android.gms.internal.base;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

public final class zae extends Drawable implements Drawable$Callback {
    private int mAlpha;
    private int mFrom;
    private boolean zamy;
    private int zang;
    private long zanh;
    private int zani;
    private int zanj;
    private int zank;
    private boolean zanl;
    private zai zanm;
    private Drawable zann;
    private Drawable zano;
    private boolean zanp;
    private boolean zanq;
    private boolean zanr;
    private int zans;

    public zae(Drawable arg3, Drawable arg4) {
        zag v4;
        zag v3;
        this(null);
        if(arg3 == null) {
            v3 = zag.zacg();
        }

        this.zann = ((Drawable)v3);
        ((Drawable)v3).setCallback(((Drawable$Callback)this));
        this.zanm.zanv |= ((Drawable)v3).getChangingConfigurations();
        if(arg4 == null) {
            v4 = zag.zacg();
        }

        this.zano = ((Drawable)v4);
        ((Drawable)v4).setCallback(((Drawable$Callback)this));
        this.zanm.zanv |= ((Drawable)v4).getChangingConfigurations();
    }

    zae(zai arg3) {
        super();
        this.zang = 0;
        this.zanj = 0xFF;
        this.mAlpha = 0;
        this.zamy = true;
        this.zanm = new zai(arg3);
    }

    private final boolean canConstantState() {
        if(!this.zanp) {
            boolean v0 = this.zann.getConstantState() == null || this.zano.getConstantState() == null ? false : true;
            this.zanq = v0;
            this.zanp = true;
        }

        return this.zanq;
    }

    public final void draw(Canvas arg8) {
        int v1 = 1;
        switch(this.zang) {
            case 1: {
                this.zanh = SystemClock.uptimeMillis();
                this.zang = 2;
                v1 = 0;
                break;
            }
            case 2: {
                if(this.zanh < 0) {
                    goto label_35;
                }

                float v0 = (((float)(SystemClock.uptimeMillis() - this.zanh))) / (((float)this.zank));
                float v3 = 1f;
                if(v0 >= v3) {
                }
                else {
                    v1 = 0;
                }

                if(v1 != 0) {
                    this.zang = 0;
                }

                this.mAlpha = ((int)((((float)this.zani)) * Math.min(v0, v3) + 0f));
                break;
            }
            default: {
                break;
            }
        }

    label_35:
        int v0_1 = this.mAlpha;
        boolean v2 = this.zamy;
        Drawable v3_1 = this.zann;
        Drawable v4 = this.zano;
        if(v1 != 0) {
            if(!v2 || v0_1 == 0) {
                v3_1.draw(arg8);
            }

            if(v0_1 == this.zanj) {
                v4.setAlpha(this.zanj);
                v4.draw(arg8);
            }

            return;
        }

        if(v2) {
            v3_1.setAlpha(this.zanj - v0_1);
        }

        v3_1.draw(arg8);
        if(v2) {
            v3_1.setAlpha(this.zanj);
        }

        if(v0_1 > 0) {
            v4.setAlpha(v0_1);
            v4.draw(arg8);
            v4.setAlpha(this.zanj);
        }

        this.invalidateSelf();
    }

    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.zanm.mChangingConfigurations | this.zanm.zanv;
    }

    public final Drawable$ConstantState getConstantState() {
        if(this.canConstantState()) {
            this.zanm.mChangingConfigurations = this.getChangingConfigurations();
            return this.zanm;
        }

        return null;
    }

    public final int getIntrinsicHeight() {
        return Math.max(this.zann.getIntrinsicHeight(), this.zano.getIntrinsicHeight());
    }

    public final int getIntrinsicWidth() {
        return Math.max(this.zann.getIntrinsicWidth(), this.zano.getIntrinsicWidth());
    }

    public final int getOpacity() {
        if(!this.zanr) {
            this.zans = Drawable.resolveOpacity(this.zann.getOpacity(), this.zano.getOpacity());
            this.zanr = true;
        }

        return this.zans;
    }

    public final void invalidateDrawable(Drawable arg1) {
        Drawable$Callback v1 = this.getCallback();
        if(v1 != null) {
            v1.invalidateDrawable(((Drawable)this));
        }
    }

    public final Drawable mutate() {
        if(!this.zanl && super.mutate() == this) {
            if(this.canConstantState()) {
                this.zann.mutate();
                this.zano.mutate();
                this.zanl = true;
            }
            else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }

        return this;
    }

    protected final void onBoundsChange(Rect arg2) {
        this.zann.setBounds(arg2);
        this.zano.setBounds(arg2);
    }

    public final void scheduleDrawable(Drawable arg1, Runnable arg2, long arg3) {
        Drawable$Callback v1 = this.getCallback();
        if(v1 != null) {
            v1.scheduleDrawable(((Drawable)this), arg2, arg3);
        }
    }

    public final void setAlpha(int arg3) {
        if(this.mAlpha == this.zanj) {
            this.mAlpha = arg3;
        }

        this.zanj = arg3;
        this.invalidateSelf();
    }

    public final void setColorFilter(ColorFilter arg2) {
        this.zann.setColorFilter(arg2);
        this.zano.setColorFilter(arg2);
    }

    public final void startTransition(int arg2) {
        this.mFrom = 0;
        this.zani = this.zanj;
        this.mAlpha = 0;
        this.zank = 0xFA;
        this.zang = 1;
        this.invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable arg1, Runnable arg2) {
        Drawable$Callback v1 = this.getCallback();
        if(v1 != null) {
            v1.unscheduleDrawable(((Drawable)this), arg2);
        }
    }

    public final Drawable zacf() {
        return this.zano;
    }
}

