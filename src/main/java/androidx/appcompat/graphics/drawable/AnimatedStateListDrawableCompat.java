package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff$Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.drawable.Drawable;
import android.os.Build$VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R$styleable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.collection.LongSparseArray;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class AnimatedStateListDrawableCompat extends StateListDrawable {
    class androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$1 {
    }

    class AnimatableTransition extends Transition {
        private final Animatable mA;

        AnimatableTransition(Animatable arg2) {
            super(null);
            this.mA = arg2;
        }

        public void start() {
            this.mA.start();
        }

        public void stop() {
            this.mA.stop();
        }
    }

    class AnimatedStateListState extends StateListState {
        private static final long REVERSED_BIT = 0x100000000L;
        private static final long REVERSIBLE_FLAG_BIT = 0x200000000L;
        SparseArrayCompat mStateIds;
        LongSparseArray mTransitions;

        AnimatedStateListState(@Nullable AnimatedStateListState arg1, @NonNull AnimatedStateListDrawableCompat arg2, @Nullable Resources arg3) {
            super(((StateListState)arg1), ((StateListDrawable)arg2), arg3);
            if(arg1 != null) {
                this.mTransitions = arg1.mTransitions;
                this.mStateIds = arg1.mStateIds;
            }
            else {
                this.mTransitions = new LongSparseArray();
                this.mStateIds = new SparseArrayCompat();
            }
        }

        int addStateSet(@NonNull int[] arg1, @NonNull Drawable arg2, int arg3) {
            int v1 = super.addStateSet(arg1, arg2);
            this.mStateIds.put(v1, Integer.valueOf(arg3));
            return v1;
        }

        int addTransition(int arg10, int arg11, @NonNull Drawable arg12, boolean arg13) {
            int v12 = super.addChild(arg12);
            long v0 = AnimatedStateListState.generateTransitionKey(arg10, arg11);
            long v2 = arg13 ? 0x200000000L : 0;
            long v5 = ((long)v12);
            this.mTransitions.append(v0, Long.valueOf(v5 | v2));
            if(arg13) {
                this.mTransitions.append(AnimatedStateListState.generateTransitionKey(arg11, arg10), Long.valueOf(0x100000000L | v5 | v2));
            }

            return v12;
        }

        private static long generateTransitionKey(int arg2, int arg3) {
            return (((long)arg3)) | (((long)arg2)) << 0x20;
        }

        int getKeyframeIdAt(int arg3) {
            int v0 = 0;
            if(arg3 < 0) {
            }
            else {
                v0 = this.mStateIds.get(arg3, Integer.valueOf(0)).intValue();
            }

            return v0;
        }

        int indexOfKeyframe(@NonNull int[] arg1) {
            int v1 = super.indexOfStateSet(arg1);
            if(v1 >= 0) {
                return v1;
            }

            return super.indexOfStateSet(StateSet.WILD_CARD);
        }

        int indexOfTransition(int arg4, int arg5) {
            return ((int)this.mTransitions.get(AnimatedStateListState.generateTransitionKey(arg4, arg5), Long.valueOf(-1)).longValue());
        }

        boolean isTransitionReversed(int arg4, int arg5) {
            boolean v4 = (this.mTransitions.get(AnimatedStateListState.generateTransitionKey(arg4, arg5), Long.valueOf(-1)).longValue() & 0x100000000L) != 0 ? true : false;
            return v4;
        }

        void mutate() {
            this.mTransitions = this.mTransitions.clone();
            this.mStateIds = this.mStateIds.clone();
        }

        @NonNull public Drawable newDrawable() {
            return new AnimatedStateListDrawableCompat(this, null);
        }

        @NonNull public Drawable newDrawable(Resources arg2) {
            return new AnimatedStateListDrawableCompat(this, arg2);
        }

        boolean transitionHasReversibleFlag(int arg4, int arg5) {
            boolean v4 = (this.mTransitions.get(AnimatedStateListState.generateTransitionKey(arg4, arg5), Long.valueOf(-1)).longValue() & 0x200000000L) != 0 ? true : false;
            return v4;
        }
    }

    class AnimatedVectorDrawableTransition extends Transition {
        private final AnimatedVectorDrawableCompat mAvd;

        AnimatedVectorDrawableTransition(AnimatedVectorDrawableCompat arg2) {
            super(null);
            this.mAvd = arg2;
        }

        public void start() {
            this.mAvd.start();
        }

        public void stop() {
            this.mAvd.stop();
        }
    }

    class AnimationDrawableTransition extends Transition {
        private final ObjectAnimator mAnim;
        private final boolean mHasReversibleFlag;

        AnimationDrawableTransition(AnimationDrawable arg7, boolean arg8, boolean arg9) {
            super(null);
            int v0 = arg7.getNumberOfFrames();
            int v2 = arg8 ? v0 - 1 : 0;
            if(arg8) {
                v0 = 0;
            }
            else {
                --v0;
            }

            FrameInterpolator v4 = new FrameInterpolator(arg7, arg8);
            ObjectAnimator v7 = ObjectAnimator.ofInt(arg7, "currentIndex", new int[]{v2, v0});
            if(Build$VERSION.SDK_INT >= 18) {
                v7.setAutoCancel(true);
            }

            v7.setDuration(((long)v4.getTotalDuration()));
            v7.setInterpolator(((TimeInterpolator)v4));
            this.mHasReversibleFlag = arg9;
            this.mAnim = v7;
        }

        public boolean canReverse() {
            return this.mHasReversibleFlag;
        }

        public void reverse() {
            this.mAnim.reverse();
        }

        public void start() {
            this.mAnim.start();
        }

        public void stop() {
            this.mAnim.cancel();
        }
    }

    class FrameInterpolator implements TimeInterpolator {
        private int[] mFrameTimes;
        private int mFrames;
        private int mTotalDuration;

        FrameInterpolator(AnimationDrawable arg1, boolean arg2) {
            super();
            this.updateFrames(arg1, arg2);
        }

        public float getInterpolation(float arg5) {
            int v5 = ((int)(arg5 * (((float)this.mTotalDuration)) + 0.5f));
            int v0 = this.mFrames;
            int[] v1 = this.mFrameTimes;
            int v2;
            for(v2 = 0; v2 < v0; ++v2) {
                if(v5 < v1[v2]) {
                    break;
                }

                v5 -= v1[v2];
            }

            arg5 = v2 < v0 ? (((float)v5)) / (((float)this.mTotalDuration)) : 0f;
            return (((float)v2)) / (((float)v0)) + arg5;
        }

        int getTotalDuration() {
            return this.mTotalDuration;
        }

        int updateFrames(AnimationDrawable arg6, boolean arg7) {
            int v0 = arg6.getNumberOfFrames();
            this.mFrames = v0;
            if(this.mFrameTimes == null || this.mFrameTimes.length < v0) {
                this.mFrameTimes = new int[v0];
            }

            int[] v1 = this.mFrameTimes;
            int v2 = 0;
            int v3 = 0;
            while(v2 < v0) {
                int v4 = arg7 ? v0 - v2 - 1 : v2;
                v4 = arg6.getDuration(v4);
                v1[v2] = v4;
                v3 += v4;
                ++v2;
            }

            this.mTotalDuration = v3;
            return v3;
        }
    }

    abstract class Transition {
        private Transition() {
            super();
        }

        Transition(androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat$1 arg1) {
            this();
        }

        public boolean canReverse() {
            return 0;
        }

        public void reverse() {
        }

        public abstract void start();

        public abstract void stop();
    }

    private static final String ELEMENT_ITEM = "item";
    private static final String ELEMENT_TRANSITION = "transition";
    private static final String ITEM_MISSING_DRAWABLE_ERROR = ": <item> tag requires a \'drawable\' attribute or child tag defining a drawable";
    private static final String LOGTAG = "AnimatedStateListDrawableCompat";
    private static final String TRANSITION_MISSING_DRAWABLE_ERROR = ": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable";
    private static final String TRANSITION_MISSING_FROM_TO_ID = ": <transition> tag requires \'fromId\' & \'toId\' attributes";
    private boolean mMutated;
    private AnimatedStateListState mState;
    private Transition mTransition;
    private int mTransitionFromIndex;
    private int mTransitionToIndex;

    static {
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    AnimatedStateListDrawableCompat(@Nullable AnimatedStateListState arg2, @Nullable Resources arg3) {
        super(null);
        this.mTransitionToIndex = -1;
        this.mTransitionFromIndex = -1;
        this.setConstantState(new AnimatedStateListState(arg2, this, arg3));
        this.onStateChange(this.getState());
        this.jumpToCurrentState();
    }

    public void addState(int[] arg1, Drawable arg2) {
        super.addState(arg1, arg2);
    }

    public void addState(@NonNull int[] arg2, @NonNull Drawable arg3, int arg4) {
        if(arg3 != null) {
            this.mState.addStateSet(arg2, arg3, arg4);
            this.onStateChange(this.getState());
            return;
        }

        throw new IllegalArgumentException("Drawable must not be null");
    }

    public void addTransition(int arg2, int arg3, @NonNull Drawable arg4, boolean arg5) {
        if(arg4 != null) {
            this.mState.addTransition(arg2, arg3, arg4, arg5);
            return;
        }

        throw new IllegalArgumentException("Transition drawable must not be null");
    }

    @RequiresApi(value=21) public void applyTheme(@NonNull Resources$Theme arg1) {
        super.applyTheme(arg1);
    }

    @RequiresApi(value=21) public boolean canApplyTheme() {
        return super.canApplyTheme();
    }

    void clearMutated() {
        super.clearMutated();
        this.mMutated = false;
    }

    AnimatedStateListState cloneConstantState() {
        return new AnimatedStateListState(this.mState, this, null);
    }

    DrawableContainerState cloneConstantState() {
        return this.cloneConstantState();
    }

    StateListState cloneConstantState() {
        return this.cloneConstantState();
    }

    @Nullable public static AnimatedStateListDrawableCompat create(@NonNull Context arg5, @DrawableRes int arg6, @Nullable Resources$Theme arg7) {
        try {
            Resources v0 = arg5.getResources();
            XmlResourceParser v6 = v0.getXml(arg6);
            AttributeSet v1 = Xml.asAttributeSet(((XmlPullParser)v6));
            while(true) {
                int v2 = ((XmlPullParser)v6).next();
                int v3 = 2;
                if(v2 != v3 && v2 != 1) {
                    continue;
                }

                break;
            }

            if(v2 == v3) {
                return AnimatedStateListDrawableCompat.createFromXmlInner(arg5, v0, ((XmlPullParser)v6), v1, arg7);
            }

            throw new XmlPullParserException("No start tag found");
        }
        catch(IOException v5) {
            Log.e(AnimatedStateListDrawableCompat.LOGTAG, "parser error", ((Throwable)v5));
        }
        catch(XmlPullParserException v5_1) {
            Log.e(AnimatedStateListDrawableCompat.LOGTAG, "parser error", ((Throwable)v5_1));
        }

        return null;
    }

    public static AnimatedStateListDrawableCompat createFromXmlInner(@NonNull Context arg8, @NonNull Resources arg9, @NonNull XmlPullParser arg10, @NonNull AttributeSet arg11, @Nullable Resources$Theme arg12) throws IOException, XmlPullParserException {
        String v0 = arg10.getName();
        if(v0.equals("animated-selector")) {
            AnimatedStateListDrawableCompat v0_1 = new AnimatedStateListDrawableCompat();
            v0_1.inflate(arg8, arg9, arg10, arg11, arg12);
            return v0_1;
        }

        StringBuilder v9 = new StringBuilder();
        v9.append(arg10.getPositionDescription());
        v9.append(": invalid animated-selector tag ");
        v9.append(v0);
        throw new XmlPullParserException(v9.toString());
    }

    public void draw(@NonNull Canvas arg1) {
        super.draw(arg1);
    }

    public int getAlpha() {
        return super.getAlpha();
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations();
    }

    public Drawable$ConstantState getConstantState() {
        return this.mState;
    }

    @NonNull public Drawable getCurrent() {
        return super.getCurrent();
    }

    public void getHotspotBounds(@NonNull Rect arg1) {
        super.getHotspotBounds(arg1);
    }

    public int getIntrinsicHeight() {
        return super.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return super.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        return super.getOpacity();
    }

    @RequiresApi(value=21) public void getOutline(@NonNull Outline arg1) {
        super.getOutline(arg1);
    }

    public boolean getPadding(@NonNull Rect arg1) {
        return super.getPadding(arg1);
    }

    public void inflate(@NonNull Context arg4, @NonNull Resources arg5, @NonNull XmlPullParser arg6, @NonNull AttributeSet arg7, @Nullable Resources$Theme arg8) throws XmlPullParserException, IOException {
        TypedArray v0 = TypedArrayUtils.obtainAttributes(arg5, arg8, arg7, R$styleable.AnimatedStateListDrawableCompat);
        this.setVisible(v0.getBoolean(R$styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        this.updateStateFromTypedArray(v0);
        this.updateDensity(arg5);
        v0.recycle();
        this.inflateChildElements(arg4, arg5, arg6, arg7, arg8);
        this.init();
    }

    private void inflateChildElements(@NonNull Context arg6, @NonNull Resources arg7, @NonNull XmlPullParser arg8, @NonNull AttributeSet arg9, @Nullable Resources$Theme arg10) throws XmlPullParserException, IOException {
        int v0 = arg8.getDepth() + 1;
        while(true) {
            int v2 = arg8.next();
            if(v2 != 1) {
                int v3 = arg8.getDepth();
                if(v3 < v0 && v2 == 3) {
                    return;
                }

                if(v2 != 2) {
                    continue;
                }

                if(v3 > v0) {
                    continue;
                }

                if(arg8.getName().equals("item")) {
                    this.parseItem(arg6, arg7, arg8, arg9, arg10);
                    continue;
                }

                if(!arg8.getName().equals("transition")) {
                    continue;
                }

                this.parseTransition(arg6, arg7, arg8, arg9, arg10);
                continue;
            }

            return;
        }
    }

    private void init() {
        this.onStateChange(this.getState());
    }

    public void invalidateDrawable(@NonNull Drawable arg1) {
        super.invalidateDrawable(arg1);
    }

    public boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return 1;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        if(this.mTransition != null) {
            this.mTransition.stop();
            this.mTransition = null;
            this.selectDrawable(this.mTransitionToIndex);
            this.mTransitionToIndex = -1;
            this.mTransitionFromIndex = -1;
        }
    }

    public Drawable mutate() {
        if(!this.mMutated && super.mutate() == this) {
            this.mState.mutate();
            this.mMutated = true;
        }

        return this;
    }

    public boolean onLayoutDirectionChanged(int arg1) {
        return super.onLayoutDirectionChanged(arg1);
    }

    protected boolean onStateChange(int[] arg3) {
        int v0 = this.mState.indexOfKeyframe(arg3);
        if(v0 != this.getCurrentIndex()) {
            if(!this.selectTransition(v0) && !this.selectDrawable(v0)) {
                goto label_10;
            }

            v0 = 1;
        }
        else {
        label_10:
            v0 = 0;
        }

        Drawable v1 = this.getCurrent();
        if(v1 != null) {
            v0 |= v1.setState(arg3);
        }

        return ((boolean)v0);
    }

    private int parseItem(@NonNull Context arg5, @NonNull Resources arg6, @NonNull XmlPullParser arg7, @NonNull AttributeSet arg8, @Nullable Resources$Theme arg9) throws XmlPullParserException, IOException {
        VectorDrawableCompat v5_2;
        StringBuilder v6;
        TypedArray v0 = TypedArrayUtils.obtainAttributes(arg6, arg9, arg8, R$styleable.AnimatedStateListDrawableItem);
        int v1 = v0.getResourceId(R$styleable.AnimatedStateListDrawableItem_android_id, 0);
        int v2 = v0.getResourceId(R$styleable.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable v5 = v2 > 0 ? AppCompatResources.getDrawable(arg5, v2) : null;
        v0.recycle();
        int[] v0_1 = this.extractStateSet(arg8);
        if(v5 == null) {
            while(true) {
                int v5_1 = arg7.next();
                if(v5_1 != 4) {
                    break;
                }
            }

            if(v5_1 != 2) {
                v6 = new StringBuilder();
                v6.append(arg7.getPositionDescription());
                v6.append(": <item> tag requires a \'drawable\' attribute or child tag defining a drawable");
                throw new XmlPullParserException(v6.toString());
            }
            else if(arg7.getName().equals("vector")) {
                v5_2 = VectorDrawableCompat.createFromXmlInner(arg6, arg7, arg8, arg9);
            }
            else if(Build$VERSION.SDK_INT >= 21) {
                v5 = Drawable.createFromXmlInner(arg6, arg7, arg8, arg9);
            }
            else {
                v5 = Drawable.createFromXmlInner(arg6, arg7, arg8);
            }
        }

        if((((Drawable)v5_2)) != null) {
            return this.mState.addStateSet(v0_1, ((Drawable)v5_2), v1);
        }

        v6 = new StringBuilder();
        v6.append(arg7.getPositionDescription());
        v6.append(": <item> tag requires a \'drawable\' attribute or child tag defining a drawable");
        throw new XmlPullParserException(v6.toString());
    }

    private int parseTransition(@NonNull Context arg8, @NonNull Resources arg9, @NonNull XmlPullParser arg10, @NonNull AttributeSet arg11, @Nullable Resources$Theme arg12) throws XmlPullParserException, IOException {
        AnimatedVectorDrawableCompat v4_2;
        StringBuilder v9;
        TypedArray v0 = TypedArrayUtils.obtainAttributes(arg9, arg12, arg11, R$styleable.AnimatedStateListDrawableTransition);
        int v2 = -1;
        int v1 = v0.getResourceId(R$styleable.AnimatedStateListDrawableTransition_android_fromId, v2);
        int v3 = v0.getResourceId(R$styleable.AnimatedStateListDrawableTransition_android_toId, v2);
        int v4 = v0.getResourceId(R$styleable.AnimatedStateListDrawableTransition_android_drawable, v2);
        Drawable v4_1 = v4 > 0 ? AppCompatResources.getDrawable(arg8, v4) : null;
        boolean v5 = v0.getBoolean(R$styleable.AnimatedStateListDrawableTransition_android_reversible, false);
        v0.recycle();
        if(v4_1 == null) {
            while(true) {
                int v0_1 = arg10.next();
                if(v0_1 != 4) {
                    break;
                }
            }

            if(v0_1 != 2) {
                v9 = new StringBuilder();
                v9.append(arg10.getPositionDescription());
                v9.append(": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable");
                throw new XmlPullParserException(v9.toString());
            }
            else if(arg10.getName().equals("animated-vector")) {
                v4_2 = AnimatedVectorDrawableCompat.createFromXmlInner(arg8, arg9, arg10, arg11, arg12);
            }
            else if(Build$VERSION.SDK_INT >= 21) {
                v4_1 = Drawable.createFromXmlInner(arg9, arg10, arg11, arg12);
            }
            else {
                v4_1 = Drawable.createFromXmlInner(arg9, arg10, arg11);
            }
        }

        if((((Drawable)v4_2)) != null) {
            if(v1 != v2 && v3 != v2) {
                return this.mState.addTransition(v1, v3, ((Drawable)v4_2), v5);
            }

            v9 = new StringBuilder();
            v9.append(arg10.getPositionDescription());
            v9.append(": <transition> tag requires \'fromId\' & \'toId\' attributes");
            throw new XmlPullParserException(v9.toString());
        }

        v9 = new StringBuilder();
        v9.append(arg10.getPositionDescription());
        v9.append(": <transition> tag requires a \'drawable\' attribute or child tag defining a drawable");
        throw new XmlPullParserException(v9.toString());
    }

    public void scheduleDrawable(@NonNull Drawable arg1, @NonNull Runnable arg2, long arg3) {
        super.scheduleDrawable(arg1, arg2, arg3);
    }

    private boolean selectTransition(int arg10) {
        AnimationDrawableTransition v3_1;
        int v2;
        Transition v0 = this.mTransition;
        if(v0 == null) {
            v2 = this.getCurrentIndex();
        }
        else if(arg10 == this.mTransitionToIndex) {
            return 1;
        }
        else {
            if(arg10 == this.mTransitionFromIndex && (v0.canReverse())) {
                v0.reverse();
                this.mTransitionToIndex = this.mTransitionFromIndex;
                this.mTransitionFromIndex = arg10;
                return 1;
            }

            v2 = this.mTransitionToIndex;
            v0.stop();
        }

        this.mTransition = null;
        this.mTransitionFromIndex = -1;
        this.mTransitionToIndex = -1;
        AnimatedStateListState v0_1 = this.mState;
        int v3 = v0_1.getKeyframeIdAt(v2);
        int v4 = v0_1.getKeyframeIdAt(arg10);
        if(v4 != 0) {
            if(v3 == 0) {
            }
            else {
                int v6 = v0_1.indexOfTransition(v3, v4);
                if(v6 < 0) {
                    return 0;
                }
                else {
                    boolean v7 = v0_1.transitionHasReversibleFlag(v3, v4);
                    this.selectDrawable(v6);
                    Drawable v6_1 = this.getCurrent();
                    if((v6_1 instanceof AnimationDrawable)) {
                        v3_1 = new AnimationDrawableTransition(((AnimationDrawable)v6_1), v0_1.isTransitionReversed(v3, v4), v7);
                    }
                    else if((v6_1 instanceof AnimatedVectorDrawableCompat)) {
                        AnimatedVectorDrawableTransition v3_2 = new AnimatedVectorDrawableTransition(((AnimatedVectorDrawableCompat)v6_1));
                    }
                    else if((v6_1 instanceof Animatable)) {
                        AnimatableTransition v3_3 = new AnimatableTransition(((Animatable)v6_1));
                    }
                    else {
                        return 0;
                    }

                    ((Transition)v3_1).start();
                    this.mTransition = ((Transition)v3_1);
                    this.mTransitionFromIndex = v2;
                    this.mTransitionToIndex = arg10;
                    return 1;
                }
            }
        }

        return 0;
    }

    public void setAlpha(int arg1) {
        super.setAlpha(arg1);
    }

    public void setAutoMirrored(boolean arg1) {
        super.setAutoMirrored(arg1);
    }

    public void setColorFilter(ColorFilter arg1) {
        super.setColorFilter(arg1);
    }

    protected void setConstantState(@NonNull DrawableContainerState arg2) {
        super.setConstantState(arg2);
        if((arg2 instanceof AnimatedStateListState)) {
            this.mState = ((AnimatedStateListState)arg2);
        }
    }

    public void setDither(boolean arg1) {
        super.setDither(arg1);
    }

    public void setEnterFadeDuration(int arg1) {
        super.setEnterFadeDuration(arg1);
    }

    public void setExitFadeDuration(int arg1) {
        super.setExitFadeDuration(arg1);
    }

    public void setHotspot(float arg1, float arg2) {
        super.setHotspot(arg1, arg2);
    }

    public void setHotspotBounds(int arg1, int arg2, int arg3, int arg4) {
        super.setHotspotBounds(arg1, arg2, arg3, arg4);
    }

    public void setTintList(ColorStateList arg1) {
        super.setTintList(arg1);
    }

    public void setTintMode(@NonNull PorterDuff$Mode arg1) {
        super.setTintMode(arg1);
    }

    public boolean setVisible(boolean arg3, boolean arg4) {
        boolean v0 = super.setVisible(arg3, arg4);
        if(this.mTransition != null && ((v0) || (arg4))) {
            if(arg3) {
                this.mTransition.start();
                return v0;
            }

            this.jumpToCurrentState();
        }

        return v0;
    }

    public void unscheduleDrawable(@NonNull Drawable arg1, @NonNull Runnable arg2) {
        super.unscheduleDrawable(arg1, arg2);
    }

    private void updateStateFromTypedArray(TypedArray arg4) {
        AnimatedStateListState v0 = this.mState;
        if(Build$VERSION.SDK_INT >= 21) {
            v0.mChangingConfigurations |= arg4.getChangingConfigurations();
        }

        v0.setVariablePadding(arg4.getBoolean(R$styleable.AnimatedStateListDrawableCompat_android_variablePadding, v0.mVariablePadding));
        v0.setConstantSize(arg4.getBoolean(R$styleable.AnimatedStateListDrawableCompat_android_constantSize, v0.mConstantSize));
        v0.setEnterFadeDuration(arg4.getInt(R$styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, v0.mEnterFadeDuration));
        v0.setExitFadeDuration(arg4.getInt(R$styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, v0.mExitFadeDuration));
        this.setDither(arg4.getBoolean(R$styleable.AnimatedStateListDrawableCompat_android_dither, v0.mDither));
    }
}

