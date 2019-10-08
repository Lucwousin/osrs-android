package androidx.appcompat.graphics.drawable;

import android.content.Context;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo$Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R$styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.TypedArrayUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo(value={Scope.LIBRARY_GROUP}) class StateListDrawable extends DrawableContainer {
    class StateListState extends DrawableContainerState {
        int[][] mStateSets;

        StateListState(StateListState arg1, StateListDrawable arg2, Resources arg3) {
            super(((DrawableContainerState)arg1), ((DrawableContainer)arg2), arg3);
            this.mStateSets = arg1 != null ? arg1.mStateSets : new int[this.getCapacity()][];
        }

        int addStateSet(int[] arg2, Drawable arg3) {
            int v3 = this.addChild(arg3);
            this.mStateSets[v3] = arg2;
            return v3;
        }

        public void growArray(int arg3, int arg4) {
            super.growArray(arg3, arg4);
            int[][] v4 = new int[arg4][];
            System.arraycopy(this.mStateSets, 0, v4, 0, arg3);
            this.mStateSets = v4;
        }

        int indexOfStateSet(int[] arg5) {
            int[][] v0 = this.mStateSets;
            int v1 = this.getChildCount();
            int v2;
            for(v2 = 0; v2 < v1; ++v2) {
                if(StateSet.stateSetMatches(v0[v2], arg5)) {
                    return v2;
                }
            }

            return -1;
        }

        void mutate() {
            Object v2;
            int[][] v0 = new int[this.mStateSets.length][];
            int v1;
            for(v1 = this.mStateSets.length - 1; v1 >= 0; --v1) {
                if(this.mStateSets[v1] != null) {
                    v2 = this.mStateSets[v1].clone();
                }
                else {
                    int[] v2_1 = null;
                }

                v0[v1] = ((int[])v2);
            }

            this.mStateSets = v0;
        }

        @NonNull public Drawable newDrawable() {
            return new StateListDrawable(this, null);
        }

        @NonNull public Drawable newDrawable(Resources arg2) {
            return new StateListDrawable(this, arg2);
        }
    }

    private static final boolean DEBUG = false;
    private static final String TAG = "StateListDrawable";
    private boolean mMutated;
    private StateListState mStateListState;

    StateListDrawable() {
        this(null, null);
    }

    StateListDrawable(StateListState arg2, Resources arg3) {
        super();
        this.setConstantState(new StateListState(arg2, this, arg3));
        this.onStateChange(this.getState());
    }

    StateListDrawable(@Nullable StateListState arg1) {
        super();
        if(arg1 != null) {
            this.setConstantState(((DrawableContainerState)arg1));
        }
    }

    public void addState(int[] arg2, Drawable arg3) {
        if(arg3 != null) {
            this.mStateListState.addStateSet(arg2, arg3);
            this.onStateChange(this.getState());
        }
    }

    @RequiresApi(value=21) public void applyTheme(@NonNull Resources$Theme arg1) {
        super.applyTheme(arg1);
        this.onStateChange(this.getState());
    }

    void clearMutated() {
        super.clearMutated();
        this.mMutated = false;
    }

    DrawableContainerState cloneConstantState() {
        return this.cloneConstantState();
    }

    StateListState cloneConstantState() {
        return new StateListState(this.mStateListState, this, null);
    }

    int[] extractStateSet(AttributeSet arg9) {
        int v0 = arg9.getAttributeCount();
        int[] v1 = new int[v0];
        int v3 = 0;
        int v4 = 0;
        while(v3 < v0) {
            int v5 = arg9.getAttributeNameResource(v3);
            if(v5 != 0 && v5 != 0x10100D0 && v5 != 0x1010199) {
                int v6 = v4 + 1;
                if(arg9.getAttributeBooleanValue(v3, false)) {
                }
                else {
                    v5 = -v5;
                }

                v1[v4] = v5;
                v4 = v6;
            }

            ++v3;
        }

        return StateSet.trimStateSet(v1, v4);
    }

    int getStateCount() {
        return this.mStateListState.getChildCount();
    }

    Drawable getStateDrawable(int arg2) {
        return this.mStateListState.getChild(arg2);
    }

    int getStateDrawableIndex(int[] arg2) {
        return this.mStateListState.indexOfStateSet(arg2);
    }

    StateListState getStateListState() {
        return this.mStateListState;
    }

    int[] getStateSet(int arg2) {
        return this.mStateListState.mStateSets[arg2];
    }

    public void inflate(@NonNull Context arg4, @NonNull Resources arg5, @NonNull XmlPullParser arg6, @NonNull AttributeSet arg7, @Nullable Resources$Theme arg8) throws XmlPullParserException, IOException {
        TypedArray v0 = TypedArrayUtils.obtainAttributes(arg5, arg8, arg7, R$styleable.StateListDrawable);
        this.setVisible(v0.getBoolean(R$styleable.StateListDrawable_android_visible, true), true);
        this.updateStateFromTypedArray(v0);
        this.updateDensity(arg5);
        v0.recycle();
        this.inflateChildElements(arg4, arg5, arg6, arg7, arg8);
        this.onStateChange(this.getState());
    }

    private void inflateChildElements(Context arg9, Resources arg10, XmlPullParser arg11, AttributeSet arg12, Resources$Theme arg13) throws XmlPullParserException, IOException {
        int v4;
        StateListState v0 = this.mStateListState;
        int v1 = arg11.getDepth() + 1;
        while(true) {
        label_4:
            int v3 = arg11.next();
            if(v3 != 1) {
                v4 = arg11.getDepth();
                if(v4 < v1 && v3 == 3) {
                    return;
                }

                int v5 = 2;
                if(v3 != v5) {
                    continue;
                }

                if(v4 > v1) {
                    continue;
                }

                if(arg11.getName().equals("item")) {
                    break;
                }

                continue;
            }

            return;
        }

        TypedArray v3_1 = TypedArrayUtils.obtainAttributes(arg10, arg13, arg12, R$styleable.StateListDrawableItem);
        Drawable v4_1 = null;
        int v6 = v3_1.getResourceId(R$styleable.StateListDrawableItem_android_drawable, -1);
        if(v6 > 0) {
            v4_1 = AppCompatResources.getDrawable(arg9, v6);
        }

        v3_1.recycle();
        int[] v3_2 = this.extractStateSet(arg12);
        if(v4_1 != null) {
            goto label_54;
        }

        goto label_30;
        return;
        while(true) {
        label_30:
            v4 = arg11.next();
            if(v4 != 4) {
                break;
            }
        }

        if(v4 != v5) {
            StringBuilder v10 = new StringBuilder();
            v10.append(arg11.getPositionDescription());
            v10.append(": <item> tag requires a \'drawable\' attribute or ");
            v10.append("child tag defining a drawable");
            throw new XmlPullParserException(v10.toString());
        }
        else if(Build$VERSION.SDK_INT >= 21) {
            v4_1 = Drawable.createFromXmlInner(arg10, arg11, arg12, arg13);
        }
        else {
            v4_1 = Drawable.createFromXmlInner(arg10, arg11, arg12);
        }

    label_54:
        v0.addStateSet(v3_2, v4_1);
        goto label_4;
    }

    public boolean isStateful() {
        return 1;
    }

    @NonNull public Drawable mutate() {
        if(!this.mMutated && super.mutate() == this) {
            this.mStateListState.mutate();
            this.mMutated = true;
        }

        return this;
    }

    protected boolean onStateChange(int[] arg3) {
        boolean v0 = super.onStateChange(arg3);
        int v3 = this.mStateListState.indexOfStateSet(arg3);
        if(v3 < 0) {
            v3 = this.mStateListState.indexOfStateSet(StateSet.WILD_CARD);
        }

        boolean v3_1 = (this.selectDrawable(v3)) || (v0) ? true : false;
        return v3_1;
    }

    protected void setConstantState(@NonNull DrawableContainerState arg2) {
        super.setConstantState(arg2);
        if((arg2 instanceof StateListState)) {
            this.mStateListState = ((StateListState)arg2);
        }
    }

    private void updateStateFromTypedArray(TypedArray arg4) {
        StateListState v0 = this.mStateListState;
        if(Build$VERSION.SDK_INT >= 21) {
            v0.mChangingConfigurations |= arg4.getChangingConfigurations();
        }

        v0.mVariablePadding = arg4.getBoolean(R$styleable.StateListDrawable_android_variablePadding, v0.mVariablePadding);
        v0.mConstantSize = arg4.getBoolean(R$styleable.StateListDrawable_android_constantSize, v0.mConstantSize);
        v0.mEnterFadeDuration = arg4.getInt(R$styleable.StateListDrawable_android_enterFadeDuration, v0.mEnterFadeDuration);
        v0.mExitFadeDuration = arg4.getInt(R$styleable.StateListDrawable_android_exitFadeDuration, v0.mExitFadeDuration);
        v0.mDither = arg4.getBoolean(R$styleable.StateListDrawable_android_dither, v0.mDither);
    }
}

