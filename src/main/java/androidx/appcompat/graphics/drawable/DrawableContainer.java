package androidx.appcompat.graphics.drawable;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;

@RestrictTo(value={Scope.LIBRARY_GROUP}) class DrawableContainer extends Drawable implements Drawable$Callback {
    class BlockInvalidateCallback implements Drawable$Callback {
        private Drawable$Callback mCallback;

        BlockInvalidateCallback() {
            super();
        }

        public void invalidateDrawable(@NonNull Drawable arg1) {
        }

        public void scheduleDrawable(@NonNull Drawable arg2, @NonNull Runnable arg3, long arg4) {
            if(this.mCallback != null) {
                this.mCallback.scheduleDrawable(arg2, arg3, arg4);
            }
        }

        public void unscheduleDrawable(@NonNull Drawable arg2, @NonNull Runnable arg3) {
            if(this.mCallback != null) {
                this.mCallback.unscheduleDrawable(arg2, arg3);
            }
        }

        public Drawable$Callback unwrap() {
            Drawable$Callback v0 = this.mCallback;
            this.mCallback = null;
            return v0;
        }

        public BlockInvalidateCallback wrap(Drawable$Callback arg1) {
            this.mCallback = arg1;
            return this;
        }
    }

    abstract class DrawableContainerState extends Drawable$ConstantState {
        boolean mAutoMirrored;
        boolean mCanConstantState;
        int mChangingConfigurations;
        boolean mCheckedConstantSize;
        boolean mCheckedConstantState;
        boolean mCheckedOpacity;
        boolean mCheckedPadding;
        boolean mCheckedStateful;
        int mChildrenChangingConfigurations;
        ColorFilter mColorFilter;
        int mConstantHeight;
        int mConstantMinimumHeight;
        int mConstantMinimumWidth;
        Rect mConstantPadding;
        boolean mConstantSize;
        int mConstantWidth;
        int mDensity;
        boolean mDither;
        SparseArray mDrawableFutures;
        Drawable[] mDrawables;
        int mEnterFadeDuration;
        int mExitFadeDuration;
        boolean mHasColorFilter;
        boolean mHasTintList;
        boolean mHasTintMode;
        int mLayoutDirection;
        boolean mMutated;
        int mNumChildren;
        int mOpacity;
        final DrawableContainer mOwner;
        Resources mSourceRes;
        boolean mStateful;
        ColorStateList mTintList;
        PorterDuff$Mode mTintMode;
        boolean mVariablePadding;

        DrawableContainerState(DrawableContainerState arg3, DrawableContainer arg4, Resources arg5) {
            Resources v4;
            super();
            this.mDensity = 0xA0;
            int v0 = 0;
            this.mVariablePadding = false;
            this.mConstantSize = false;
            this.mDither = true;
            this.mEnterFadeDuration = 0;
            this.mExitFadeDuration = 0;
            this.mOwner = arg4;
            if(arg5 != null) {
                v4 = arg5;
            }
            else if(arg3 != null) {
                v4 = arg3.mSourceRes;
            }
            else {
                v4 = null;
            }

            this.mSourceRes = v4;
            int v4_1 = arg3 != null ? arg3.mDensity : 0;
            this.mDensity = DrawableContainer.resolveDensity(arg5, v4_1);
            if(arg3 != null) {
                this.mChangingConfigurations = arg3.mChangingConfigurations;
                this.mChildrenChangingConfigurations = arg3.mChildrenChangingConfigurations;
                this.mCheckedConstantState = true;
                this.mCanConstantState = true;
                this.mVariablePadding = arg3.mVariablePadding;
                this.mConstantSize = arg3.mConstantSize;
                this.mDither = arg3.mDither;
                this.mMutated = arg3.mMutated;
                this.mLayoutDirection = arg3.mLayoutDirection;
                this.mEnterFadeDuration = arg3.mEnterFadeDuration;
                this.mExitFadeDuration = arg3.mExitFadeDuration;
                this.mAutoMirrored = arg3.mAutoMirrored;
                this.mColorFilter = arg3.mColorFilter;
                this.mHasColorFilter = arg3.mHasColorFilter;
                this.mTintList = arg3.mTintList;
                this.mTintMode = arg3.mTintMode;
                this.mHasTintList = arg3.mHasTintList;
                this.mHasTintMode = arg3.mHasTintMode;
                if(arg3.mDensity == this.mDensity) {
                    if(arg3.mCheckedPadding) {
                        this.mConstantPadding = new Rect(arg3.mConstantPadding);
                        this.mCheckedPadding = true;
                    }

                    if(!arg3.mCheckedConstantSize) {
                        goto label_81;
                    }

                    this.mConstantWidth = arg3.mConstantWidth;
                    this.mConstantHeight = arg3.mConstantHeight;
                    this.mConstantMinimumWidth = arg3.mConstantMinimumWidth;
                    this.mConstantMinimumHeight = arg3.mConstantMinimumHeight;
                    this.mCheckedConstantSize = true;
                }

            label_81:
                if(arg3.mCheckedOpacity) {
                    this.mOpacity = arg3.mOpacity;
                    this.mCheckedOpacity = true;
                }

                if(arg3.mCheckedStateful) {
                    this.mStateful = arg3.mStateful;
                    this.mCheckedStateful = true;
                }

                Drawable[] v4_2 = arg3.mDrawables;
                this.mDrawables = new Drawable[v4_2.length];
                this.mNumChildren = arg3.mNumChildren;
                SparseArray v3 = arg3.mDrawableFutures;
                this.mDrawableFutures = v3 != null ? v3.clone() : new SparseArray(this.mNumChildren);
                int v3_1 = this.mNumChildren;
                while(v0 < v3_1) {
                    if(v4_2[v0] != null) {
                        Drawable$ConstantState v5 = v4_2[v0].getConstantState();
                        if(v5 != null) {
                            this.mDrawableFutures.put(v0, v5);
                        }
                        else {
                            this.mDrawables[v0] = v4_2[v0];
                        }
                    }

                    ++v0;
                }
            }
            else {
                this.mDrawables = new Drawable[10];
                this.mNumChildren = 0;
            }
        }

        public final int addChild(Drawable arg5) {
            int v0 = this.mNumChildren;
            if(v0 >= this.mDrawables.length) {
                this.growArray(v0, v0 + 10);
            }

            arg5.mutate();
            arg5.setVisible(false, true);
            arg5.setCallback(this.mOwner);
            this.mDrawables[v0] = arg5;
            ++this.mNumChildren;
            this.mChildrenChangingConfigurations |= arg5.getChangingConfigurations();
            this.invalidateCache();
            this.mConstantPadding = null;
            this.mCheckedPadding = false;
            this.mCheckedConstantSize = false;
            this.mCheckedConstantState = false;
            return v0;
        }

        @RequiresApi(value=21) final void applyTheme(Resources$Theme arg6) {
            if(arg6 != null) {
                this.createAllFutures();
                int v0 = this.mNumChildren;
                Drawable[] v1 = this.mDrawables;
                int v2;
                for(v2 = 0; v2 < v0; ++v2) {
                    if(v1[v2] != null && (v1[v2].canApplyTheme())) {
                        v1[v2].applyTheme(arg6);
                        this.mChildrenChangingConfigurations |= v1[v2].getChangingConfigurations();
                    }
                }

                this.updateDensity(arg6.getResources());
            }
        }

        @RequiresApi(value=21) public boolean canApplyTheme() {
            int v0 = this.mNumChildren;
            Drawable[] v1 = this.mDrawables;
            int v3;
            for(v3 = 0; v3 < v0; ++v3) {
                Drawable v4 = v1[v3];
                if(v4 == null) {
                    Object v4_1 = this.mDrawableFutures.get(v3);
                    if(v4_1 != null && (((Drawable$ConstantState)v4_1).canApplyTheme())) {
                        return 1;
                    }
                }
                else if(v4.canApplyTheme()) {
                    return 1;
                }
            }

            return 0;
        }

        public boolean canConstantState() {
            int v4;
            boolean v0_1;
            __monitor_enter(this);
            try {
                if(!this.mCheckedConstantState) {
                    goto label_6;
                }

                v0_1 = this.mCanConstantState;
            }
            catch(Throwable v0) {
                goto label_26;
            }

            __monitor_exit(this);
            return v0_1;
            try {
            label_6:
                this.createAllFutures();
                this.mCheckedConstantState = true;
                int v1 = this.mNumChildren;
                Drawable[] v2 = this.mDrawables;
                v4 = 0;
                while(true) {
                label_13:
                    if(v4 >= v1) {
                        goto label_22;
                    }

                    if(v2[v4].getConstantState() != null) {
                        goto label_20;
                    }

                    this.mCanConstantState = false;
                    break;
                }
            }
            catch(Throwable v0) {
                goto label_26;
            }

            __monitor_exit(this);
            return 0;
        label_20:
            ++v4;
            goto label_13;
            try {
            label_22:
                this.mCanConstantState = true;
            }
            catch(Throwable v0) {
                goto label_26;
            }

            __monitor_exit(this);
            return 1;
        label_26:
            __monitor_exit(this);
            throw v0;
        }

        final void clearMutated() {
            this.mMutated = false;
        }

        protected void computeConstantSize() {
            this.mCheckedConstantSize = true;
            this.createAllFutures();
            int v0 = this.mNumChildren;
            Drawable[] v1 = this.mDrawables;
            this.mConstantHeight = -1;
            this.mConstantWidth = -1;
            int v2 = 0;
            this.mConstantMinimumHeight = 0;
            this.mConstantMinimumWidth = 0;
            while(v2 < v0) {
                Drawable v3 = v1[v2];
                int v4 = v3.getIntrinsicWidth();
                if(v4 > this.mConstantWidth) {
                    this.mConstantWidth = v4;
                }

                v4 = v3.getIntrinsicHeight();
                if(v4 > this.mConstantHeight) {
                    this.mConstantHeight = v4;
                }

                v4 = v3.getMinimumWidth();
                if(v4 > this.mConstantMinimumWidth) {
                    this.mConstantMinimumWidth = v4;
                }

                int v3_1 = v3.getMinimumHeight();
                if(v3_1 > this.mConstantMinimumHeight) {
                    this.mConstantMinimumHeight = v3_1;
                }

                ++v2;
            }
        }

        private void createAllFutures() {
            if(this.mDrawableFutures != null) {
                int v0 = this.mDrawableFutures.size();
                int v1;
                for(v1 = 0; v1 < v0; ++v1) {
                    this.mDrawables[this.mDrawableFutures.keyAt(v1)] = this.prepareDrawable(this.mDrawableFutures.valueAt(v1).newDrawable(this.mSourceRes));
                }

                this.mDrawableFutures = null;
            }
        }

        final int getCapacity() {
            return this.mDrawables.length;
        }

        public int getChangingConfigurations() {
            return this.mChangingConfigurations | this.mChildrenChangingConfigurations;
        }

        public final Drawable getChild(int arg5) {
            Drawable v0 = this.mDrawables[arg5];
            if(v0 != null) {
                return v0;
            }

            SparseArray v1 = null;
            if(this.mDrawableFutures != null) {
                int v0_1 = this.mDrawableFutures.indexOfKey(arg5);
                if(v0_1 >= 0) {
                    Drawable v2 = this.prepareDrawable(this.mDrawableFutures.valueAt(v0_1).newDrawable(this.mSourceRes));
                    this.mDrawables[arg5] = v2;
                    this.mDrawableFutures.removeAt(v0_1);
                    if(this.mDrawableFutures.size() == 0) {
                        this.mDrawableFutures = v1;
                    }

                    return v2;
                }
            }

            return ((Drawable)v1);
        }

        public final int getChildCount() {
            return this.mNumChildren;
        }

        public final int getConstantHeight() {
            if(!this.mCheckedConstantSize) {
                this.computeConstantSize();
            }

            return this.mConstantHeight;
        }

        public final int getConstantMinimumHeight() {
            if(!this.mCheckedConstantSize) {
                this.computeConstantSize();
            }

            return this.mConstantMinimumHeight;
        }

        public final int getConstantMinimumWidth() {
            if(!this.mCheckedConstantSize) {
                this.computeConstantSize();
            }

            return this.mConstantMinimumWidth;
        }

        public final Rect getConstantPadding() {
            Rect v1 = null;
            if(this.mVariablePadding) {
                return v1;
            }

            if(this.mConstantPadding == null) {
                if(this.mCheckedPadding) {
                }
                else {
                    this.createAllFutures();
                    Rect v0 = new Rect();
                    int v2 = this.mNumChildren;
                    Drawable[] v3 = this.mDrawables;
                    Rect v5 = v1;
                    int v1_1;
                    for(v1_1 = 0; v1_1 < v2; ++v1_1) {
                        if(v3[v1_1].getPadding(v0)) {
                            if(v5 == null) {
                                v5 = new Rect(0, 0, 0, 0);
                            }

                            if(v0.left > v5.left) {
                                v5.left = v0.left;
                            }

                            if(v0.top > v5.top) {
                                v5.top = v0.top;
                            }

                            if(v0.right > v5.right) {
                                v5.right = v0.right;
                            }

                            if(v0.bottom <= v5.bottom) {
                                goto label_44;
                            }

                            v5.bottom = v0.bottom;
                        }

                    label_44:
                    }

                    this.mCheckedPadding = true;
                    this.mConstantPadding = v5;
                    return v5;
                }
            }

            return this.mConstantPadding;
        }

        public final int getConstantWidth() {
            if(!this.mCheckedConstantSize) {
                this.computeConstantSize();
            }

            return this.mConstantWidth;
        }

        public final int getEnterFadeDuration() {
            return this.mEnterFadeDuration;
        }

        public final int getExitFadeDuration() {
            return this.mExitFadeDuration;
        }

        public final int getOpacity() {
            if(this.mCheckedOpacity) {
                return this.mOpacity;
            }

            this.createAllFutures();
            int v0 = this.mNumChildren;
            Drawable[] v1 = this.mDrawables;
            int v2 = v0 > 0 ? v1[0].getOpacity() : -2;
            int v4 = v2;
            for(v2 = 1; v2 < v0; ++v2) {
                v4 = Drawable.resolveOpacity(v4, v1[v2].getOpacity());
            }

            this.mOpacity = v4;
            this.mCheckedOpacity = true;
            return v4;
        }

        public void growArray(int arg3, int arg4) {
            Drawable[] v4 = new Drawable[arg4];
            System.arraycopy(this.mDrawables, 0, v4, 0, arg3);
            this.mDrawables = v4;
        }

        void invalidateCache() {
            this.mCheckedOpacity = false;
            this.mCheckedStateful = false;
        }

        public final boolean isConstantSize() {
            return this.mConstantSize;
        }

        public final boolean isStateful() {
            if(this.mCheckedStateful) {
                return this.mStateful;
            }

            this.createAllFutures();
            int v0 = this.mNumChildren;
            Drawable[] v1 = this.mDrawables;
            boolean v2 = false;
            int v3 = 0;
            while(v3 < v0) {
                if(v1[v3].isStateful()) {
                    v2 = true;
                }
                else {
                    ++v3;
                    continue;
                }

                break;
            }

            this.mStateful = v2;
            this.mCheckedStateful = true;
            return v2;
        }

        void mutate() {
            int v0 = this.mNumChildren;
            Drawable[] v1 = this.mDrawables;
            int v2;
            for(v2 = 0; v2 < v0; ++v2) {
                if(v1[v2] != null) {
                    v1[v2].mutate();
                }
            }

            this.mMutated = true;
        }

        private Drawable prepareDrawable(Drawable arg3) {
            if(Build$VERSION.SDK_INT >= 23) {
                arg3.setLayoutDirection(this.mLayoutDirection);
            }

            arg3 = arg3.mutate();
            arg3.setCallback(this.mOwner);
            return arg3;
        }

        public final void setConstantSize(boolean arg1) {
            this.mConstantSize = arg1;
        }

        public final void setEnterFadeDuration(int arg1) {
            this.mEnterFadeDuration = arg1;
        }

        public final void setExitFadeDuration(int arg1) {
            this.mExitFadeDuration = arg1;
        }

        final boolean setLayoutDirection(int arg8, int arg9) {
            int v0 = this.mNumChildren;
            Drawable[] v1 = this.mDrawables;
            int v3 = 0;
            boolean v4 = false;
            while(v3 < v0) {
                if(v1[v3] != null) {
                    boolean v5 = Build$VERSION.SDK_INT >= 23 ? v1[v3].setLayoutDirection(arg8) : false;
                    if(v3 != arg9) {
                        goto label_17;
                    }

                    v4 = v5;
                }

            label_17:
                ++v3;
            }

            this.mLayoutDirection = arg8;
            return v4;
        }

        public final void setVariablePadding(boolean arg1) {
            this.mVariablePadding = arg1;
        }

        final void updateDensity(Resources arg2) {
            if(arg2 != null) {
                this.mSourceRes = arg2;
                int v2 = DrawableContainer.resolveDensity(arg2, this.mDensity);
                int v0 = this.mDensity;
                this.mDensity = v2;
                if(v0 != v2) {
                    this.mCheckedConstantSize = false;
                    this.mCheckedPadding = false;
                }
            }
        }
    }

    private static final boolean DEBUG = false;
    private static final boolean DEFAULT_DITHER = true;
    private static final String TAG = "DrawableContainer";
    private int mAlpha;
    private Runnable mAnimationRunnable;
    private BlockInvalidateCallback mBlockInvalidateCallback;
    private int mCurIndex;
    private Drawable mCurrDrawable;
    private DrawableContainerState mDrawableContainerState;
    private long mEnterAnimationEnd;
    private long mExitAnimationEnd;
    private boolean mHasAlpha;
    private Rect mHotspotBounds;
    private Drawable mLastDrawable;
    private int mLastIndex;
    private boolean mMutated;

    DrawableContainer() {
        super();
        this.mAlpha = 0xFF;
        this.mCurIndex = -1;
        this.mLastIndex = -1;
    }

    void animate(boolean arg12) {
        int v3;
        int v0 = 1;
        this.mHasAlpha = true;
        long v1 = SystemClock.uptimeMillis();
        long v4 = 0xFF;
        long v7 = 0;
        if(this.mCurrDrawable == null) {
            this.mEnterAnimationEnd = v7;
        label_33:
            v3 = 0;
        }
        else if(this.mEnterAnimationEnd == v7) {
            goto label_33;
        }
        else if(this.mEnterAnimationEnd <= v1) {
            this.mCurrDrawable.setAlpha(this.mAlpha);
            this.mEnterAnimationEnd = v7;
            goto label_33;
        }
        else {
            this.mCurrDrawable.setAlpha((0xFF - (((int)((this.mEnterAnimationEnd - v1) * v4))) / this.mDrawableContainerState.mEnterFadeDuration) * this.mAlpha / 0xFF);
            v3 = 1;
        }

        if(this.mLastDrawable == null) {
            this.mExitAnimationEnd = v7;
        label_62:
            v0 = v3;
        }
        else if(this.mExitAnimationEnd == v7) {
            goto label_62;
        }
        else if(this.mExitAnimationEnd <= v1) {
            this.mLastDrawable.setVisible(false, false);
            this.mLastDrawable = null;
            this.mLastIndex = -1;
            this.mExitAnimationEnd = v7;
            goto label_62;
        }
        else {
            this.mLastDrawable.setAlpha((((int)((this.mExitAnimationEnd - v1) * v4))) / this.mDrawableContainerState.mExitFadeDuration * this.mAlpha / 0xFF);
        }

        if((arg12) && v0 != 0) {
            this.scheduleSelf(this.mAnimationRunnable, v1 + 16);
        }
    }

    @RequiresApi(value=21) public void applyTheme(@NonNull Resources$Theme arg2) {
        this.mDrawableContainerState.applyTheme(arg2);
    }

    @RequiresApi(value=21) public boolean canApplyTheme() {
        return this.mDrawableContainerState.canApplyTheme();
    }

    void clearMutated() {
        this.mDrawableContainerState.clearMutated();
        this.mMutated = false;
    }

    DrawableContainerState cloneConstantState() {
        return this.mDrawableContainerState;
    }

    public void draw(@NonNull Canvas arg2) {
        if(this.mCurrDrawable != null) {
            this.mCurrDrawable.draw(arg2);
        }

        if(this.mLastDrawable != null) {
            this.mLastDrawable.draw(arg2);
        }
    }

    public int getAlpha() {
        return this.mAlpha;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.mDrawableContainerState.getChangingConfigurations();
    }

    public Drawable$ConstantState getConstantState() {
        if(this.mDrawableContainerState.canConstantState()) {
            this.mDrawableContainerState.mChangingConfigurations = this.getChangingConfigurations();
            return this.mDrawableContainerState;
        }

        return null;
    }

    @NonNull public Drawable getCurrent() {
        return this.mCurrDrawable;
    }

    int getCurrentIndex() {
        return this.mCurIndex;
    }

    public void getHotspotBounds(@NonNull Rect arg2) {
        if(this.mHotspotBounds != null) {
            arg2.set(this.mHotspotBounds);
        }
        else {
            super.getHotspotBounds(arg2);
        }
    }

    public int getIntrinsicHeight() {
        if(this.mDrawableContainerState.isConstantSize()) {
            return this.mDrawableContainerState.getConstantHeight();
        }

        int v0 = this.mCurrDrawable != null ? this.mCurrDrawable.getIntrinsicHeight() : -1;
        return v0;
    }

    public int getIntrinsicWidth() {
        if(this.mDrawableContainerState.isConstantSize()) {
            return this.mDrawableContainerState.getConstantWidth();
        }

        int v0 = this.mCurrDrawable != null ? this.mCurrDrawable.getIntrinsicWidth() : -1;
        return v0;
    }

    public int getMinimumHeight() {
        if(this.mDrawableContainerState.isConstantSize()) {
            return this.mDrawableContainerState.getConstantMinimumHeight();
        }

        int v0 = this.mCurrDrawable != null ? this.mCurrDrawable.getMinimumHeight() : 0;
        return v0;
    }

    public int getMinimumWidth() {
        if(this.mDrawableContainerState.isConstantSize()) {
            return this.mDrawableContainerState.getConstantMinimumWidth();
        }

        int v0 = this.mCurrDrawable != null ? this.mCurrDrawable.getMinimumWidth() : 0;
        return v0;
    }

    public int getOpacity() {
        int v0 = this.mCurrDrawable == null || !this.mCurrDrawable.isVisible() ? -2 : this.mDrawableContainerState.getOpacity();
        return v0;
    }

    @RequiresApi(value=21) public void getOutline(@NonNull Outline arg2) {
        if(this.mCurrDrawable != null) {
            this.mCurrDrawable.getOutline(arg2);
        }
    }

    public boolean getPadding(@NonNull Rect arg4) {
        boolean v0_1;
        Rect v0 = this.mDrawableContainerState.getConstantPadding();
        if(v0 != null) {
            arg4.set(v0);
            v0_1 = (v0.right | (v0.left | v0.top | v0.bottom)) != 0 ? true : false;
        }
        else if(this.mCurrDrawable != null) {
            v0_1 = this.mCurrDrawable.getPadding(arg4);
        }
        else {
            v0_1 = super.getPadding(arg4);
        }

        if(this.needsMirroring()) {
            int v1 = arg4.left;
            arg4.left = arg4.right;
            arg4.right = v1;
        }

        return v0_1;
    }

    private void initializeDrawableForDisplay(Drawable arg5) {
        if(this.mBlockInvalidateCallback == null) {
            this.mBlockInvalidateCallback = new BlockInvalidateCallback();
        }

        arg5.setCallback(this.mBlockInvalidateCallback.wrap(arg5.getCallback()));
        try {
            if(this.mDrawableContainerState.mEnterFadeDuration <= 0 && (this.mHasAlpha)) {
                arg5.setAlpha(this.mAlpha);
            }

            if(this.mDrawableContainerState.mHasColorFilter) {
                arg5.setColorFilter(this.mDrawableContainerState.mColorFilter);
            }
            else {
                if(this.mDrawableContainerState.mHasTintList) {
                    DrawableCompat.setTintList(arg5, this.mDrawableContainerState.mTintList);
                }

                if(!this.mDrawableContainerState.mHasTintMode) {
                    goto label_35;
                }

                DrawableCompat.setTintMode(arg5, this.mDrawableContainerState.mTintMode);
            }

        label_35:
            arg5.setVisible(this.isVisible(), true);
            arg5.setDither(this.mDrawableContainerState.mDither);
            arg5.setState(this.getState());
            arg5.setLevel(this.getLevel());
            arg5.setBounds(this.getBounds());
            if(Build$VERSION.SDK_INT >= 23) {
                arg5.setLayoutDirection(this.getLayoutDirection());
            }

            if(Build$VERSION.SDK_INT >= 19) {
                arg5.setAutoMirrored(this.mDrawableContainerState.mAutoMirrored);
            }

            Rect v0_1 = this.mHotspotBounds;
            if(Build$VERSION.SDK_INT >= 21 && v0_1 != null) {
                arg5.setHotspotBounds(v0_1.left, v0_1.top, v0_1.right, v0_1.bottom);
            }
        }
        catch(Throwable v0) {
            arg5.setCallback(this.mBlockInvalidateCallback.unwrap());
            throw v0;
        }

        arg5.setCallback(this.mBlockInvalidateCallback.unwrap());
    }

    public void invalidateDrawable(@NonNull Drawable arg2) {
        if(this.mDrawableContainerState != null) {
            this.mDrawableContainerState.invalidateCache();
        }

        if(arg2 == this.mCurrDrawable && this.getCallback() != null) {
            this.getCallback().invalidateDrawable(((Drawable)this));
        }
    }

    public boolean isAutoMirrored() {
        return this.mDrawableContainerState.mAutoMirrored;
    }

    public boolean isStateful() {
        return this.mDrawableContainerState.isStateful();
    }

    public void jumpToCurrentState() {
        int v0;
        if(this.mLastDrawable != null) {
            this.mLastDrawable.jumpToCurrentState();
            this.mLastDrawable = null;
            this.mLastIndex = -1;
            v0 = 1;
        }
        else {
            v0 = 0;
        }

        if(this.mCurrDrawable != null) {
            this.mCurrDrawable.jumpToCurrentState();
            if(this.mHasAlpha) {
                this.mCurrDrawable.setAlpha(this.mAlpha);
            }
        }

        long v4 = 0;
        if(this.mExitAnimationEnd != v4) {
            this.mExitAnimationEnd = v4;
            v0 = 1;
        }

        if(this.mEnterAnimationEnd != v4) {
            this.mEnterAnimationEnd = v4;
            v0 = 1;
        }

        if(v0 != 0) {
            this.invalidateSelf();
        }
    }

    @NonNull public Drawable mutate() {
        if(!this.mMutated && super.mutate() == this) {
            DrawableContainerState v0 = this.cloneConstantState();
            v0.mutate();
            this.setConstantState(v0);
            this.mMutated = true;
        }

        return this;
    }

    @SuppressLint(value={"WrongConstant"}) @TargetApi(value=23) private boolean needsMirroring() {
        boolean v1 = true;
        if(!this.isAutoMirrored() || this.getLayoutDirection() != 1) {
            v1 = false;
        }
        else {
        }

        return v1;
    }

    protected void onBoundsChange(Rect arg2) {
        if(this.mLastDrawable != null) {
            this.mLastDrawable.setBounds(arg2);
        }

        if(this.mCurrDrawable != null) {
            this.mCurrDrawable.setBounds(arg2);
        }
    }

    public boolean onLayoutDirectionChanged(int arg3) {
        return this.mDrawableContainerState.setLayoutDirection(arg3, this.getCurrentIndex());
    }

    protected boolean onLevelChange(int arg2) {
        if(this.mLastDrawable != null) {
            return this.mLastDrawable.setLevel(arg2);
        }

        if(this.mCurrDrawable != null) {
            return this.mCurrDrawable.setLevel(arg2);
        }

        return 0;
    }

    protected boolean onStateChange(int[] arg2) {
        if(this.mLastDrawable != null) {
            return this.mLastDrawable.setState(arg2);
        }

        if(this.mCurrDrawable != null) {
            return this.mCurrDrawable.setState(arg2);
        }

        return 0;
    }

    static int resolveDensity(@Nullable Resources arg0, int arg1) {
        if(arg0 == null) {
        }
        else {
            arg1 = arg0.getDisplayMetrics().densityDpi;
        }

        if(arg1 == 0) {
            arg1 = 0xA0;
        }

        return arg1;
    }

    public void scheduleDrawable(@NonNull Drawable arg2, @NonNull Runnable arg3, long arg4) {
        if(arg2 == this.mCurrDrawable && this.getCallback() != null) {
            this.getCallback().scheduleDrawable(((Drawable)this), arg3, arg4);
        }
    }

    boolean selectDrawable(int arg9) {
        if(arg9 == this.mCurIndex) {
            return 0;
        }

        long v2 = SystemClock.uptimeMillis();
        int v4 = -1;
        Drawable v5 = null;
        long v6 = 0;
        if(this.mDrawableContainerState.mExitFadeDuration > 0) {
            if(this.mLastDrawable != null) {
                this.mLastDrawable.setVisible(false, false);
            }

            if(this.mCurrDrawable != null) {
                this.mLastDrawable = this.mCurrDrawable;
                this.mLastIndex = this.mCurIndex;
                this.mExitAnimationEnd = (((long)this.mDrawableContainerState.mExitFadeDuration)) + v2;
                goto label_35;
            }

            this.mLastDrawable = v5;
            this.mLastIndex = v4;
            this.mExitAnimationEnd = v6;
        }
        else {
            if(this.mCurrDrawable == null) {
                goto label_35;
            }

            this.mCurrDrawable.setVisible(false, false);
        }

    label_35:
        if(arg9 < 0 || arg9 >= this.mDrawableContainerState.mNumChildren) {
            this.mCurrDrawable = v5;
            this.mCurIndex = v4;
        }
        else {
            Drawable v0 = this.mDrawableContainerState.getChild(arg9);
            this.mCurrDrawable = v0;
            this.mCurIndex = arg9;
            if(v0 != null) {
                if(this.mDrawableContainerState.mEnterFadeDuration > 0) {
                    this.mEnterAnimationEnd = v2 + (((long)this.mDrawableContainerState.mEnterFadeDuration));
                }

                this.initializeDrawableForDisplay(v0);
            }
        }

        if(this.mEnterAnimationEnd != v6 || this.mExitAnimationEnd != v6) {
            if(this.mAnimationRunnable == null) {
                this.mAnimationRunnable = new Runnable() {
                    public void run() {
                        DrawableContainer.this.animate(true);
                        DrawableContainer.this.invalidateSelf();
                    }
                };
            }
            else {
                this.unscheduleSelf(this.mAnimationRunnable);
            }

            this.animate(true);
        }

        this.invalidateSelf();
        return 1;
    }

    public void setAlpha(int arg5) {
        if(!this.mHasAlpha || this.mAlpha != arg5) {
            this.mHasAlpha = true;
            this.mAlpha = arg5;
            if(this.mCurrDrawable != null) {
                if(this.mEnterAnimationEnd == 0) {
                    this.mCurrDrawable.setAlpha(arg5);
                }
                else {
                    this.animate(false);
                }
            }
        }
    }

    public void setAutoMirrored(boolean arg2) {
        if(this.mDrawableContainerState.mAutoMirrored != arg2) {
            this.mDrawableContainerState.mAutoMirrored = arg2;
            if(this.mCurrDrawable != null) {
                DrawableCompat.setAutoMirrored(this.mCurrDrawable, this.mDrawableContainerState.mAutoMirrored);
            }
        }
    }

    public void setColorFilter(ColorFilter arg3) {
        this.mDrawableContainerState.mHasColorFilter = true;
        if(this.mDrawableContainerState.mColorFilter != arg3) {
            this.mDrawableContainerState.mColorFilter = arg3;
            if(this.mCurrDrawable != null) {
                this.mCurrDrawable.setColorFilter(arg3);
            }
        }
    }

    protected void setConstantState(DrawableContainerState arg2) {
        this.mDrawableContainerState = arg2;
        if(this.mCurIndex >= 0) {
            this.mCurrDrawable = arg2.getChild(this.mCurIndex);
            if(this.mCurrDrawable != null) {
                this.initializeDrawableForDisplay(this.mCurrDrawable);
            }
        }

        this.mLastIndex = -1;
        this.mLastDrawable = null;
    }

    void setCurrentIndex(int arg1) {
        this.selectDrawable(arg1);
    }

    public void setDither(boolean arg2) {
        if(this.mDrawableContainerState.mDither != arg2) {
            this.mDrawableContainerState.mDither = arg2;
            if(this.mCurrDrawable != null) {
                this.mCurrDrawable.setDither(this.mDrawableContainerState.mDither);
            }
        }
    }

    public void setEnterFadeDuration(int arg2) {
        this.mDrawableContainerState.mEnterFadeDuration = arg2;
    }

    public void setExitFadeDuration(int arg2) {
        this.mDrawableContainerState.mExitFadeDuration = arg2;
    }

    public void setHotspot(float arg2, float arg3) {
        if(this.mCurrDrawable != null) {
            DrawableCompat.setHotspot(this.mCurrDrawable, arg2, arg3);
        }
    }

    public void setHotspotBounds(int arg2, int arg3, int arg4, int arg5) {
        if(this.mHotspotBounds == null) {
            this.mHotspotBounds = new Rect(arg2, arg3, arg4, arg5);
        }
        else {
            this.mHotspotBounds.set(arg2, arg3, arg4, arg5);
        }

        if(this.mCurrDrawable != null) {
            DrawableCompat.setHotspotBounds(this.mCurrDrawable, arg2, arg3, arg4, arg5);
        }
    }

    public void setTintList(ColorStateList arg3) {
        this.mDrawableContainerState.mHasTintList = true;
        if(this.mDrawableContainerState.mTintList != arg3) {
            this.mDrawableContainerState.mTintList = arg3;
            DrawableCompat.setTintList(this.mCurrDrawable, arg3);
        }
    }

    public void setTintMode(@NonNull PorterDuff$Mode arg3) {
        this.mDrawableContainerState.mHasTintMode = true;
        if(this.mDrawableContainerState.mTintMode != arg3) {
            this.mDrawableContainerState.mTintMode = arg3;
            DrawableCompat.setTintMode(this.mCurrDrawable, arg3);
        }
    }

    public boolean setVisible(boolean arg3, boolean arg4) {
        boolean v0 = super.setVisible(arg3, arg4);
        if(this.mLastDrawable != null) {
            this.mLastDrawable.setVisible(arg3, arg4);
        }

        if(this.mCurrDrawable != null) {
            this.mCurrDrawable.setVisible(arg3, arg4);
        }

        return v0;
    }

    public void unscheduleDrawable(@NonNull Drawable arg2, @NonNull Runnable arg3) {
        if(arg2 == this.mCurrDrawable && this.getCallback() != null) {
            this.getCallback().unscheduleDrawable(((Drawable)this), arg3);
        }
    }

    final void updateDensity(Resources arg2) {
        this.mDrawableContainerState.updateDensity(arg2);
    }
}

